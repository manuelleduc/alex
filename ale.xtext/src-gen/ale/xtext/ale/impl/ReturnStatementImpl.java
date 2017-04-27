/**
 * generated by Xtext 2.10.0
 */
package ale.xtext.ale.impl;

import ale.xtext.ale.AlePackage;
import ale.xtext.ale.Expression;
import ale.xtext.ale.ReturnStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ale.xtext.ale.impl.ReturnStatementImpl#getReturned <em>Returned</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnStatementImpl extends StatementImpl implements ReturnStatement
{
  /**
   * The cached value of the '{@link #getReturned() <em>Returned</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturned()
   * @generated
   * @ordered
   */
  protected Expression returned;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReturnStatementImpl()
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
    return AlePackage.Literals.RETURN_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getReturned()
  {
    return returned;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturned(Expression newReturned, NotificationChain msgs)
  {
    Expression oldReturned = returned;
    returned = newReturned;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlePackage.RETURN_STATEMENT__RETURNED, oldReturned, newReturned);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturned(Expression newReturned)
  {
    if (newReturned != returned)
    {
      NotificationChain msgs = null;
      if (returned != null)
        msgs = ((InternalEObject)returned).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlePackage.RETURN_STATEMENT__RETURNED, null, msgs);
      if (newReturned != null)
        msgs = ((InternalEObject)newReturned).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlePackage.RETURN_STATEMENT__RETURNED, null, msgs);
      msgs = basicSetReturned(newReturned, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlePackage.RETURN_STATEMENT__RETURNED, newReturned, newReturned));
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
      case AlePackage.RETURN_STATEMENT__RETURNED:
        return basicSetReturned(null, msgs);
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
      case AlePackage.RETURN_STATEMENT__RETURNED:
        return getReturned();
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
      case AlePackage.RETURN_STATEMENT__RETURNED:
        setReturned((Expression)newValue);
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
      case AlePackage.RETURN_STATEMENT__RETURNED:
        setReturned((Expression)null);
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
      case AlePackage.RETURN_STATEMENT__RETURNED:
        return returned != null;
    }
    return super.eIsSet(featureID);
  }

} //ReturnStatementImpl