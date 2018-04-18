/**
 * generated by Xtext 2.12.0
 */
package brew.xtext.brew.impl;

import brew.xtext.brew.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BrewFactoryImpl extends EFactoryImpl implements BrewFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BrewFactory init()
  {
    try
    {
      BrewFactory theBrewFactory = (BrewFactory)EPackage.Registry.INSTANCE.getEFactory(BrewPackage.eNS_URI);
      if (theBrewFactory != null)
      {
        return theBrewFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BrewFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BrewFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BrewPackage.BREW_ROOT: return createBrewRoot();
      case BrewPackage.ALE_IMPORT: return createAleImport();
      case BrewPackage.CLASS_BIND: return createClassBind();
      case BrewPackage.METHOD_BIND: return createMethodBind();
      case BrewPackage.PARAM_CONVERTER: return createParamConverter();
      case BrewPackage.BASIC_CONVERTER: return createBasicConverter();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BrewRoot createBrewRoot()
  {
    BrewRootImpl brewRoot = new BrewRootImpl();
    return brewRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AleImport createAleImport()
  {
    AleImportImpl aleImport = new AleImportImpl();
    return aleImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassBind createClassBind()
  {
    ClassBindImpl classBind = new ClassBindImpl();
    return classBind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodBind createMethodBind()
  {
    MethodBindImpl methodBind = new MethodBindImpl();
    return methodBind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamConverter createParamConverter()
  {
    ParamConverterImpl paramConverter = new ParamConverterImpl();
    return paramConverter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicConverter createBasicConverter()
  {
    BasicConverterImpl basicConverter = new BasicConverterImpl();
    return basicConverter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BrewPackage getBrewPackage()
  {
    return (BrewPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BrewPackage getPackage()
  {
    return BrewPackage.eINSTANCE;
  }

} //BrewFactoryImpl
