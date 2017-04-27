/*
 * generated by Xtext 2.10.0
 */
package ale.xtext.tests

import ale.xtext.ale.Root
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(AleInjectorProvider)
class AleParsingTest{

	@Inject extension ParseHelper<Root> parseHelper
	@Inject extension ValidationTestHelper validationTestHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}
	
	@Test
	def void testImportsAndClassQualidiedNames() {
		
		
		val first = '''
		behavior execfsm;
		
«««		import ecore "http://www.example.org/fsm";
		'''.parse 
		
		val second = '''
		behavior execfsm2 ;
		
		import ale execfsm ;
		'''.parse(first.eResource.resourceSet)
		
		
		first.assertNoErrors
		second.assertNoErrors

		Assert.assertSame(second.importsAle.head.ref, first)
		Assert.assertEquals(second.importsAle.head.ref.name, first.name)
		
	}

}