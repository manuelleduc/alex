/**
 * generated by Xtext 2.10.0
 */
package ale.xtext.ale;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ale.xtext.ale.SequenceType#getSubType <em>Sub Type</em>}</li>
 * </ul>
 *
 * @see ale.xtext.ale.AlePackage#getSequenceType()
 * @model
 * @generated
 */
public interface SequenceType extends Type
{
  /**
   * Returns the value of the '<em><b>Sub Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Type</em>' containment reference.
   * @see #setSubType(Type)
   * @see ale.xtext.ale.AlePackage#getSequenceType_SubType()
   * @model containment="true"
   * @generated
   */
  Type getSubType();

  /**
   * Sets the value of the '{@link ale.xtext.ale.SequenceType#getSubType <em>Sub Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Type</em>' containment reference.
   * @see #getSubType()
   * @generated
   */
  void setSubType(Type value);

} // SequenceType