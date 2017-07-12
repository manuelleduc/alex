/*
 * generated by Xtext 2.12.0
 */
package ale.xtext.jvmmodel

import ale.utils.AleUtils
import ale.utils.EcoreUtils
import ale.utils.NamingUtils
import ale.xtext.ale.AbstractMethod
import ale.xtext.ale.AleClass
import ale.xtext.ale.AleFactory
import ale.xtext.ale.ConcreteMethod
import ale.xtext.ale.Root
import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class AleJvmModelInferrer extends AbstractModelInferrer {
	Root root
	EPackage pkg
	GenModel gm
	List<ResolvedClass> resolved = newArrayList
	@Inject extension JvmTypesBuilder
	@Inject extension EcoreUtils
	@Inject extension NamingUtils
	@Inject extension AleUtils
	
	@Data
	static class ResolvedClass {
		AleClass aleCls
		EClass eCls
		GenClass genCls
	}

	private def void preProcess() {
		pkg = root.importEcore.ref.loadEPackage
		gm = root.importEcore.ref.loadCorrespondingGenmodel
		
		// Create missing AleClasses
		pkg.allClasses.forEach[eCls |
			if (!root.classes.exists[name == eCls.name])
				root.classes += AleFactory::eINSTANCE.createAleClass => [
					name = eCls.name
				]
		]

		root.classes
			.sortWith[c1, c2 |
				if (c1.name < c2.name) -1
				else 1
			]
			.forEach[aleCls |
				val eCls = pkg.allClasses.findFirst[name == aleCls.name]
				val genCls = eCls.getGenClass(gm)
				resolved += new ResolvedClass(aleCls, eCls, genCls)
			]		
	} 

	def dispatch void infer(Root modelRoot, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		root = modelRoot

		preProcess()

		inferRevisitorImplementation(acceptor)
		
		resolved.forEach[
			inferOperationInterface(acceptor)
			inferOperationImplementation(acceptor)
		]
	}

	private def void inferRevisitorImplementation(IJvmDeclaredTypeAcceptor acceptor) {
		acceptor.accept(root.toClass(root.revisitorInterfaceFqn))[
			interface = true
			
			superTypes +=
				pkg.revisitorInterfaceFqn.typeRef(
					resolved.map[aleCls.operationInterfaceFqn.typeRef]
				)

			superTypes += root.importsAle.map[ref].map[revisitorInterfaceFqn.typeRef]

			resolved
				.filter[!eCls.abstract]
				.forEach[r |
					members += r.aleCls.toMethod(r.eCls.denotationName, r.aleCls.operationInterfaceFqn.typeRef)[
						annotations += Override.annotationRef
						parameters += r.aleCls.toParameter(r.eCls.varName, r.genCls.qualifiedInterfaceName.typeRef)
						body = '''
							return new «r.aleCls.operationImplFqn»(«r.eCls.varName», this);
						'''
					]
					
					r.eCls.EAllSuperTypes.forEach[cls |
						members += r.aleCls.toMethod(cls.getDenotationName(r.eCls), r.aleCls.operationInterfaceFqn.typeRef)[
							annotations += Override.annotationRef
							parameters += r.aleCls.toParameter(r.eCls.varName, r.genCls.qualifiedInterfaceName.typeRef)
							body = '''
								return new «r.aleCls.operationImplFqn»(«r.eCls.varName», this); 
							'''
						]
					]
				]
		]
	}

	private def void inferOperationInterface(ResolvedClass r, IJvmDeclaredTypeAcceptor acceptor) {
		acceptor.accept(r.aleCls.toClass(r.aleCls.operationInterfaceFqn))[
			interface = true

			superTypes += r.eCls.ESuperTypes.map[getMatchingAleClass(root).operationInterfaceFqn.typeRef]

			members += r.aleCls.methods.map[m |
				m.toMethod(m.name, m.type)[
					abstract = true
					parameters += m.params
				]
			]
		]
	}
	
	private def void inferOperationImplementation(ResolvedClass r, IJvmDeclaredTypeAcceptor acceptor) {
		acceptor.accept(r.aleCls.toClass(r.aleCls.operationImplFqn))[
			abstract = r.aleCls.abstract

			superTypes += r.aleCls.operationInterfaceFqn.typeRef

			members += r.aleCls.toField("obj", r.genCls.qualifiedInterfaceName.typeRef)
			members += r.aleCls.toField("alg", algSignature)

			members += r.aleCls.toConstructor()[
				parameters += r.aleCls.toParameter("obj", r.genCls.qualifiedInterfaceName.typeRef)
				parameters += r.aleCls.toParameter("alg", algSignature)

				body = '''
					this.obj = obj;
					this.alg = alg;
				'''
			]

			members +=
				r.aleCls.getAllMethods(true).map[m |
					m.toMethod(m.name, m.type)[
						abstract = m instanceof AbstractMethod
						annotations += Override.annotationRef
						parameters += m.params
						
						if (m instanceof ConcreteMethod)
							body = m.block
					]
				]
		]
	}

	private def JvmTypeReference getAlgSignature() {
		return typeRef(
			pkg.revisitorInterfaceFqn,
			resolved.map[aleCls.operationInterfaceFqn.typeRef]
		)
	}
}