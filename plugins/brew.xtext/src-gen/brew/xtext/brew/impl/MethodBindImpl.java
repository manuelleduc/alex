/**
 * generated by Xtext 2.12.0
 */
package brew.xtext.brew.impl;

import ale.xtext.ale.AleMethod;

import brew.xtext.brew.BrewPackage;
import brew.xtext.brew.MethodBind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Bind</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link brew.xtext.brew.impl.MethodBindImpl#getAbstractMethod <em>Abstract Method</em>}</li>
 *   <li>{@link brew.xtext.brew.impl.MethodBindImpl#getConcreteMethod <em>Concrete Method</em>}</li>
 *   <li>{@link brew.xtext.brew.impl.MethodBindImpl#getConverter <em>Converter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodBindImpl extends MinimalEObjectImpl.Container implements MethodBind
{
  /**
   * The cached value of the '{@link #getAbstractMethod() <em>Abstract Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstractMethod()
   * @generated
   * @ordered
   */
  protected AleMethod abstractMethod;

  /**
   * The cached value of the '{@link #getConcreteMethod() <em>Concrete Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcreteMethod()
   * @generated
   * @ordered
   */
  protected AleMethod concreteMethod;

  /**
   * The cached value of the '{@link #getConverter() <em>Converter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConverter()
   * @generated
   * @ordered
   */
  protected JvmTypeReference converter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodBindImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BrewPackage.Literals.METHOD_BIND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AleMethod getAbstractMethod()
  {
    if (abstractMethod != null && abstractMethod.eIsProxy())
    {
      InternalEObject oldAbstractMethod = (InternalEObject)abstractMethod;
      abstractMethod = (AleMethod)eResolveProxy(oldAbstractMethod);
      if (abstractMethod != oldAbstractMethod)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BrewPackage.METHOD_BIND__ABSTRACT_METHOD, oldAbstractMethod, abstractMethod));
      }
    }
    return abstractMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AleMethod basicGetAbstractMethod()
  {
    return abstractMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstractMethod(AleMethod newAbstractMethod)
  {
    AleMethod oldAbstractMethod = abstractMethod;
    abstractMethod = newAbstractMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrewPackage.METHOD_BIND__ABSTRACT_METHOD, oldAbstractMethod, abstractMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AleMethod getConcreteMethod()
  {
    if (concreteMethod != null && concreteMethod.eIsProxy())
    {
      InternalEObject oldConcreteMethod = (InternalEObject)concreteMethod;
      concreteMethod = (AleMethod)eResolveProxy(oldConcreteMethod);
      if (concreteMethod != oldConcreteMethod)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BrewPackage.METHOD_BIND__CONCRETE_METHOD, oldConcreteMethod, concreteMethod));
      }
    }
    return concreteMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AleMethod basicGetConcreteMethod()
  {
    return concreteMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConcreteMethod(AleMethod newConcreteMethod)
  {
    AleMethod oldConcreteMethod = concreteMethod;
    concreteMethod = newConcreteMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrewPackage.METHOD_BIND__CONCRETE_METHOD, oldConcreteMethod, concreteMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getConverter()
  {
    return converter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConverter(JvmTypeReference newConverter, NotificationChain msgs)
  {
    JvmTypeReference oldConverter = converter;
    converter = newConverter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrewPackage.METHOD_BIND__CONVERTER, oldConverter, newConverter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConverter(JvmTypeReference newConverter)
  {
    if (newConverter != converter)
    {
      NotificationChain msgs = null;
      if (converter != null)
        msgs = ((InternalEObject)converter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrewPackage.METHOD_BIND__CONVERTER, null, msgs);
      if (newConverter != null)
        msgs = ((InternalEObject)newConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrewPackage.METHOD_BIND__CONVERTER, null, msgs);
      msgs = basicSetConverter(newConverter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrewPackage.METHOD_BIND__CONVERTER, newConverter, newConverter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BrewPackage.METHOD_BIND__CONVERTER:
        return basicSetConverter(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BrewPackage.METHOD_BIND__ABSTRACT_METHOD:
        if (resolve) return getAbstractMethod();
        return basicGetAbstractMethod();
      case BrewPackage.METHOD_BIND__CONCRETE_METHOD:
        if (resolve) return getConcreteMethod();
        return basicGetConcreteMethod();
      case BrewPackage.METHOD_BIND__CONVERTER:
        return getConverter();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BrewPackage.METHOD_BIND__ABSTRACT_METHOD:
        setAbstractMethod((AleMethod)newValue);
        return;
      case BrewPackage.METHOD_BIND__CONCRETE_METHOD:
        setConcreteMethod((AleMethod)newValue);
        return;
      case BrewPackage.METHOD_BIND__CONVERTER:
        setConverter((JvmTypeReference)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BrewPackage.METHOD_BIND__ABSTRACT_METHOD:
        setAbstractMethod((AleMethod)null);
        return;
      case BrewPackage.METHOD_BIND__CONCRETE_METHOD:
        setConcreteMethod((AleMethod)null);
        return;
      case BrewPackage.METHOD_BIND__CONVERTER:
        setConverter((JvmTypeReference)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BrewPackage.METHOD_BIND__ABSTRACT_METHOD:
        return abstractMethod != null;
      case BrewPackage.METHOD_BIND__CONCRETE_METHOD:
        return concreteMethod != null;
      case BrewPackage.METHOD_BIND__CONVERTER:
        return converter != null;
    }
    return super.eIsSet(featureID);
  }

} //MethodBindImpl
