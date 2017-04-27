/**
 * generated by Xtext 2.10.0
 */
package ale.xtext.tests;

import ale.xtext.ale.ImportAle;
import ale.xtext.ale.Root;
import ale.xtext.tests.AleInjectorProvider;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(AleInjectorProvider.class)
@SuppressWarnings("all")
public class AleParsingTest {
  @Inject
  @Extension
  private ParseHelper<Root> parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper validationTestHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final Root result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testImportsAndClassQualidiedNames() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("behavior execfsm;");
      _builder.newLine();
      _builder.newLine();
      final Root first = this.parseHelper.parse(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("behavior execfsm2 ;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("import ale execfsm ;");
      _builder_1.newLine();
      Resource _eResource = first.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      final Root second = this.parseHelper.parse(_builder_1, _resourceSet);
      this.validationTestHelper.assertNoErrors(first);
      this.validationTestHelper.assertNoErrors(second);
      EList<ImportAle> _importsAle = second.getImportsAle();
      ImportAle _head = IterableExtensions.<ImportAle>head(_importsAle);
      Root _ref = _head.getRef();
      Assert.assertSame(_ref, first);
      EList<ImportAle> _importsAle_1 = second.getImportsAle();
      ImportAle _head_1 = IterableExtensions.<ImportAle>head(_importsAle_1);
      Root _ref_1 = _head_1.getRef();
      String _name = _ref_1.getName();
      String _name_1 = first.getName();
      Assert.assertEquals(_name, _name_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}