/*
 * generated by Xtext 2.12.0
 */
package brew.xtext.jvmmodel

import ale.xtext.ale.AbstractMethod
import ale.xtext.ale.AleClass
import ale.xtext.ale.AleFactory
import ale.xtext.ale.AleRoot
import ale.xtext.ale.ConcreteMethod
import ale.xtext.jvmmodel.AleJvmModelInferrer.ResolvedClass
import ale.xtext.utils.AleUtils
import ale.xtext.utils.EcoreUtils
import brew.xtext.brew.BrewRoot
import brew.xtext.util.NamingUtils
import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.impl.ResourceImpl
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

/**
 * <p>Infers a JVM model from the source model.</p> 
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class BrewJvmModelInferrer extends AbstractModelInferrer {

	/**
	 * convenience API to build and initialize JVM types and their members.
	 */
	@Inject extension JvmTypesBuilder
	@Inject extension NamingUtils
	@Inject extension EcoreUtils
	@Inject extension AleUtils

//	int count
	/**
	 * The dispatch method {@code infer} is called for each instance of the
	 * given element's type that is contained in a resource.
	 * 
	 * @param element
	 *            the model to create one or more
	 *            {@link JvmDeclaredType declared
	 *            types} from.
	 * @param acceptor
	 *            each created
	 *            {@link JvmDeclaredType type}
	 *            without a container should be passed to the acceptor in order
	 *            get attached to the current resource. The acceptor's
	 *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
	 *            accept(..)} method takes the constructed empty type for the
	 *            pre-indexing phase. This one is further initialized in the
	 *            indexing phase using the lambda you pass as the last argument.
	 * @param isPreIndexingPhase
	 *            whether the method is called in a pre-indexing phase, i.e.
	 *            when the global index is not yet fully updated. You must not
	 *            rely on linking using the index if isPreIndexingPhase is
	 *            <code>true</code>.
	 */
	def dispatch void infer(BrewRoot brewRoot, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		val projectName = brewRoot.eResource.URI.segment(1)
		val String ecorePath = '''/«projectName»/model/«brewRoot.name».ecore'''
		val EPackage pkg = ecorePath.loadEPackage
		val gm = ecorePath.loadCorrespondingGenmodel

		val virtualAleRoot = AleFactory.eINSTANCE.createAleRoot => [
			name = brewRoot.name
			ecoreImport = AleFactory.eINSTANCE.createEcoreImport => [
				uri = ecorePath
			]
			aleImports += brewRoot.importSemantics.map [ brewImport |
				AleFactory.eINSTANCE.createAleImport => [
					ref = brewImport.ale
				]
			]
		]

		val r = new ResourceImpl

		r.contents.add(virtualAleRoot)

		val List<EClass> allClasses = pkg.allClasses

		val resolved = allClasses.sortBy[name].map [ eCls |
			val allCls = brewRoot.importSemantics.map[it.ale.classes].flatten
			val existingAleClass = allCls.findFirst [
				it.name == eCls.name
			]

			val aleCls = if (existingAleClass !== null)
					existingAleClass
				else {
					eCls.createAleClassFromBrew(virtualAleRoot, brewRoot)
				}
			val genCls = if(eCls !== null) eCls.getGenClass(gm)
			new ResolvedClass(aleCls, eCls, genCls)
		].toList

		brewRoot.inferRevisitorImpl(pkg, acceptor, resolved)

		// only generating brew defined classes
		resolved.filter[aleCls.generated].filter[virtualAleRoot.classes.contains(aleCls)].forEach [
			inferOperationInterface(acceptor, virtualAleRoot)

			// Don't infer implementation for @Required classes
			if (!eCls.hasRequiredAnnotation)
				inferOperationImplementation(acceptor, pkg, resolved, brewRoot)
		]
	}

	def AleClass createAleClassFromBrew(EClass eCls, AleRoot virtualAleRoot, BrewRoot brewRoot) {
		// unicity control
		if (!virtualAleRoot.classes.exists[it.name == eCls.name]) {
			AleFactory.eINSTANCE.createAleClass => [
				// TODO: for new we create virtual ale class for the bound class
				name = eCls.name
				val relatedBind = brewRoot.bound.findFirst [
					it.requiredCls.name == eCls.name.substring(0, eCls.name.length - 4)
				]

				methods += relatedBind.requiredCls.methods.map [ clonedMethod |
					AleFactory.eINSTANCE.createOverrideMethod => [
						name = clonedMethod.name
						params += EcoreUtil2.copyAll(clonedMethod.params)
						type = EcoreUtil2.copy(clonedMethod.type)
					]
				]

				virtualAleRoot.classes += it
			]

		} else {
			virtualAleRoot.classes.findFirst[it.name == eCls.name]
		}
	}

	private def void inferOperationInterface(ResolvedClass r, IJvmDeclaredTypeAcceptor acceptor, AleRoot root) {
		acceptor.accept(r.aleCls.toClass(r.aleCls.operationInterfaceFqn)) [
			interface = true
			val eCls = r.eCls
			val allAleClasses = eCls.getAllAleClasses(root)
			superTypes += allAleClasses.filter[it != r.aleCls && generated].map [
				operationInterfaceFqn.typeRef
			]

			members += r.aleCls.methods.map [ m |
				m.toMethod(m.name, m.type) [
					abstract = true
					parameters += m.params.map[cloneWithProxies]
				]
			]
		]
	}

	def inferRevisitorImpl(BrewRoot brewRoot, EPackage pkg, IJvmDeclaredTypeAcceptor acceptor,
		List<ResolvedClass> resolved) {
		acceptor.accept(brewRoot.toClass(brewRoot.getRevisitorInterfaceFqn)) [
			interface = true
			val bond = resolved.map [
				aleCls.toOperationInterfaceType
			]
			superTypes += pkg.revisitorInterfaceFqn.typeRef(bond)

			resolved.filter[!eCls.abstract].forEach [ r |
				val returnType = r.aleCls.toOperationInterfaceType

				members += r.aleCls.toMethod(r.eCls.denotationName, returnType) [
					annotations += Override.annotationRef
					parameters += r.aleCls.toParameter(r.eCls.varName, r.genCls.qualifiedInterfaceName.typeRef)
					body = if (r.aleCls.generated || r.aleCls.findNearestGeneratedParent !== null)
						'''return new «r.aleCls.toOperationImplType.qualifiedName»(«r.eCls.varName», this);'''
					else
						'''return null;'''
				]

				r.eCls.ESuperTypes.drop(1).forEach [ cls |
					members += r.aleCls.toMethod(cls.getDenotationName(r.eCls), returnType) [
						annotations += Override.annotationRef
						parameters += r.aleCls.toParameter(r.eCls.varName, r.genCls.qualifiedInterfaceName.typeRef)
						body = if (r.aleCls.generated || r.aleCls.findNearestGeneratedParent !== null)
							'''return new «r.aleCls.toOperationImplType.qualifiedName»(«r.eCls.varName», this);'''
						else
							'''return null;'''
					]
				]
			]

		]
	}

	private def JvmTypeReference toOperationImplType(AleClass aleCls) {
		return if (aleCls.generated)
			aleCls.operationImplFqn.typeRef
		else if (aleCls.findNearestGeneratedParent !== null)
			aleCls.findNearestGeneratedParent.operationImplFqn.typeRef
		else
			Object.typeRef
	}

	private def JvmTypeReference toOperationInterfaceType(AleClass aleCls) {
		return if (aleCls.generated)
			aleCls.operationInterfaceFqn.typeRef
		else if (aleCls.findNearestGeneratedParent !== null)
			aleCls.findNearestGeneratedParent.operationInterfaceFqn.typeRef
		else
			Object.typeRef
	}

	private def void inferOperationImplementation(ResolvedClass r, IJvmDeclaredTypeAcceptor acceptor, EPackage pkg,
		List<ResolvedClass> resolved, BrewRoot brewRoot) {
		acceptor.accept(r.aleCls.toClass(r.aleCls.operationImplFqn)) [
			val superOp = r.aleCls.findNearestGeneratedParent

			abstract = r.aleCls.abstract

			superTypes += r.aleCls.operationInterfaceFqn.typeRef

			// In case of multiple-inheritance, we should
			// use some kind of delegate instead
			if (superOp !== null && !superOp.matchingEClass.hasRequiredAnnotation)
				superTypes += superOp.operationImplFqn.typeRef

			members += r.aleCls.toField("obj", r.genCls.qualifiedInterfaceName.typeRef)
			members += r.aleCls.toField("alg", getAlgSignature(pkg, resolved))

			members += r.aleCls.toConstructor() [
				parameters += r.aleCls.toParameter("obj", r.genCls.qualifiedInterfaceName.typeRef)
				parameters += r.aleCls.toParameter("alg", getAlgSignature(pkg, resolved))

				body = '''
					«IF superOp !== null && !superOp.matchingEClass.hasRequiredAnnotation»super(obj, alg);«ENDIF»
					this.obj = obj;
					this.alg = alg;
				'''
			]

			members += r.aleCls.methods.map [ m |
				m.toMethod(m.name, m.type) [
					abstract = m instanceof AbstractMethod
					annotations += Override.annotationRef
					parameters += m.params.map[cloneWithProxies]

					if (superOp.matchingEClass.hasRequiredAnnotation) {

						/**
						 * Lookup for the concrete method to which the call must be delegated
						 */
						 val classBind = brewRoot.bound.findFirst [
							it.requiredCls.name == r.aleCls.name.substring(0, r.aleCls.name.length - 4)
						]
						 val methodBind =  classBind.methodsBound.findFirst [
							it.abstractMethod.name == m.name
						]
						val cm = methodBind.concreteMethod

						val voidType = typeRef(Void.TYPE)
						val isNotVoidType = m.type.type != voidType.type
						if(!methodBind.conversion)
							body = '''
								«IF isNotVoidType»return «ENDIF»alg.$(obj.getDelegate()).«cm.name»(«FOR p : m.params SEPARATOR ', '»«p.name»«ENDFOR»);
							'''
						else body = '''
						«val clsName = '''converters.ConvertFrom«classBind.requiredCls.name»To«classBind.providedCls.name»Method«methodBind.abstractMethod.name»'''»
							«clsName» convert =  new «clsName»();
							«FOR param: methodBind.abstractMethod.params»
							convert.setInput«param.name»(«param.name»);
							«ENDFOR»
							
							«IF isNotVoidType»«m.type.type» res = «ENDIF»alg.$(obj.getDelegate()).«cm.name»(«FOR p : m.params SEPARATOR ', '»convert.conversion«p.name»()«ENDFOR»);
							
							«FOR param: methodBind.abstractMethod.params»
							convert.doInverse(«FOR p : m.params SEPARATOR ', '»convert.conversion«p.name»()«ENDFOR»);
							«ENDFOR»
							
							«IF isNotVoidType»return res;«ENDIF»
						'''
					} else if (m instanceof ConcreteMethod)
						if (r.aleCls.methods.contains(m))
							body = m.block
				]
			]
		]
	}

	private def JvmTypeReference getAlgSignature(EPackage pkg, List<ResolvedClass> resolved) {
		return typeRef(
			pkg.revisitorInterfaceFqn,
			resolved.sortBy[it.aleCls.name].map[aleCls.toOperationInterfaceType]
		)
	}

}
