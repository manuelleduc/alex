/**
 * generated by Xtext 2.14.0
 */
package ale.xtext.ale.impl;

import ale.xtext.ale.AleClass;
import ale.xtext.ale.AleImport;
import ale.xtext.ale.AlePackage;
import ale.xtext.ale.AleRoot;
import ale.xtext.ale.EcoreImport;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ale.xtext.ale.impl.AleRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link ale.xtext.ale.impl.AleRootImpl#getJavaImports <em>Java Imports</em>}</li>
 *   <li>{@link ale.xtext.ale.impl.AleRootImpl#getEcoreImport <em>Ecore Import</em>}</li>
 *   <li>{@link ale.xtext.ale.impl.AleRootImpl#getAleImports <em>Ale Imports</em>}</li>
 *   <li>{@link ale.xtext.ale.impl.AleRootImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AleRootImpl extends MinimalEObjectImpl.Container implements AleRoot
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getJavaImports() <em>Java Imports</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaImports()
   * @generated
   * @ordered
   */
  protected XImportSection javaImports;

  /**
   * The cached value of the '{@link #getEcoreImport() <em>Ecore Import</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEcoreImport()
   * @generated
   * @ordered
   */
  protected EcoreImport ecoreImport;

  /**
   * The cached value of the '{@link #getAleImports() <em>Ale Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAleImports()
   * @generated
   * @ordered
   */
  protected EList<AleImport> aleImports;

  /**
   * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClasses()
   * @generated
   * @ordered
   */
  protected EList<AleClass> classes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AleRootImpl()
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
    return AlePackage.Literals.ALE_ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlePackage.ALE_ROOT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XImportSection getJavaImports()
  {
    return javaImports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJavaImports(XImportSection newJavaImports, NotificationChain msgs)
  {
    XImportSection oldJavaImports = javaImports;
    javaImports = newJavaImports;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlePackage.ALE_ROOT__JAVA_IMPORTS, oldJavaImports, newJavaImports);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJavaImports(XImportSection newJavaImports)
  {
    if (newJavaImports != javaImports)
    {
      NotificationChain msgs = null;
      if (javaImports != null)
        msgs = ((InternalEObject)javaImports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlePackage.ALE_ROOT__JAVA_IMPORTS, null, msgs);
      if (newJavaImports != null)
        msgs = ((InternalEObject)newJavaImports).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlePackage.ALE_ROOT__JAVA_IMPORTS, null, msgs);
      msgs = basicSetJavaImports(newJavaImports, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlePackage.ALE_ROOT__JAVA_IMPORTS, newJavaImports, newJavaImports));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EcoreImport getEcoreImport()
  {
    return ecoreImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEcoreImport(EcoreImport newEcoreImport, NotificationChain msgs)
  {
    EcoreImport oldEcoreImport = ecoreImport;
    ecoreImport = newEcoreImport;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlePackage.ALE_ROOT__ECORE_IMPORT, oldEcoreImport, newEcoreImport);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEcoreImport(EcoreImport newEcoreImport)
  {
    if (newEcoreImport != ecoreImport)
    {
      NotificationChain msgs = null;
      if (ecoreImport != null)
        msgs = ((InternalEObject)ecoreImport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlePackage.ALE_ROOT__ECORE_IMPORT, null, msgs);
      if (newEcoreImport != null)
        msgs = ((InternalEObject)newEcoreImport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlePackage.ALE_ROOT__ECORE_IMPORT, null, msgs);
      msgs = basicSetEcoreImport(newEcoreImport, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlePackage.ALE_ROOT__ECORE_IMPORT, newEcoreImport, newEcoreImport));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AleImport> getAleImports()
  {
    if (aleImports == null)
    {
      aleImports = new EObjectContainmentEList<AleImport>(AleImport.class, this, AlePackage.ALE_ROOT__ALE_IMPORTS);
    }
    return aleImports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AleClass> getClasses()
  {
    if (classes == null)
    {
      classes = new EObjectContainmentEList<AleClass>(AleClass.class, this, AlePackage.ALE_ROOT__CLASSES);
    }
    return classes;
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
      case AlePackage.ALE_ROOT__JAVA_IMPORTS:
        return basicSetJavaImports(null, msgs);
      case AlePackage.ALE_ROOT__ECORE_IMPORT:
        return basicSetEcoreImport(null, msgs);
      case AlePackage.ALE_ROOT__ALE_IMPORTS:
        return ((InternalEList<?>)getAleImports()).basicRemove(otherEnd, msgs);
      case AlePackage.ALE_ROOT__CLASSES:
        return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
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
      case AlePackage.ALE_ROOT__NAME:
        return getName();
      case AlePackage.ALE_ROOT__JAVA_IMPORTS:
        return getJavaImports();
      case AlePackage.ALE_ROOT__ECORE_IMPORT:
        return getEcoreImport();
      case AlePackage.ALE_ROOT__ALE_IMPORTS:
        return getAleImports();
      case AlePackage.ALE_ROOT__CLASSES:
        return getClasses();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AlePackage.ALE_ROOT__NAME:
        setName((String)newValue);
        return;
      case AlePackage.ALE_ROOT__JAVA_IMPORTS:
        setJavaImports((XImportSection)newValue);
        return;
      case AlePackage.ALE_ROOT__ECORE_IMPORT:
        setEcoreImport((EcoreImport)newValue);
        return;
      case AlePackage.ALE_ROOT__ALE_IMPORTS:
        getAleImports().clear();
        getAleImports().addAll((Collection<? extends AleImport>)newValue);
        return;
      case AlePackage.ALE_ROOT__CLASSES:
        getClasses().clear();
        getClasses().addAll((Collection<? extends AleClass>)newValue);
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
      case AlePackage.ALE_ROOT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AlePackage.ALE_ROOT__JAVA_IMPORTS:
        setJavaImports((XImportSection)null);
        return;
      case AlePackage.ALE_ROOT__ECORE_IMPORT:
        setEcoreImport((EcoreImport)null);
        return;
      case AlePackage.ALE_ROOT__ALE_IMPORTS:
        getAleImports().clear();
        return;
      case AlePackage.ALE_ROOT__CLASSES:
        getClasses().clear();
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
      case AlePackage.ALE_ROOT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AlePackage.ALE_ROOT__JAVA_IMPORTS:
        return javaImports != null;
      case AlePackage.ALE_ROOT__ECORE_IMPORT:
        return ecoreImport != null;
      case AlePackage.ALE_ROOT__ALE_IMPORTS:
        return aleImports != null && !aleImports.isEmpty();
      case AlePackage.ALE_ROOT__CLASSES:
        return classes != null && !classes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //AleRootImpl
