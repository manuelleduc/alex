/**
 * generated by Xtext 2.12.0
 */
package brew.xtext.brew;

import ale.xtext.ale.AleMethod;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Bind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link brew.xtext.brew.MethodBind#getAbstractMethod <em>Abstract Method</em>}</li>
 *   <li>{@link brew.xtext.brew.MethodBind#getConcreteMethod <em>Concrete Method</em>}</li>
 *   <li>{@link brew.xtext.brew.MethodBind#getConverter <em>Converter</em>}</li>
 * </ul>
 *
 * @see brew.xtext.brew.BrewPackage#getMethodBind()
 * @model
 * @generated
 */
public interface MethodBind extends EObject
{
  /**
   * Returns the value of the '<em><b>Abstract Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract Method</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract Method</em>' reference.
   * @see #setAbstractMethod(AleMethod)
   * @see brew.xtext.brew.BrewPackage#getMethodBind_AbstractMethod()
   * @model
   * @generated
   */
  AleMethod getAbstractMethod();

  /**
   * Sets the value of the '{@link brew.xtext.brew.MethodBind#getAbstractMethod <em>Abstract Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract Method</em>' reference.
   * @see #getAbstractMethod()
   * @generated
   */
  void setAbstractMethod(AleMethod value);

  /**
   * Returns the value of the '<em><b>Concrete Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concrete Method</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concrete Method</em>' reference.
   * @see #setConcreteMethod(AleMethod)
   * @see brew.xtext.brew.BrewPackage#getMethodBind_ConcreteMethod()
   * @model
   * @generated
   */
  AleMethod getConcreteMethod();

  /**
   * Sets the value of the '{@link brew.xtext.brew.MethodBind#getConcreteMethod <em>Concrete Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concrete Method</em>' reference.
   * @see #getConcreteMethod()
   * @generated
   */
  void setConcreteMethod(AleMethod value);

  /**
   * Returns the value of the '<em><b>Converter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Converter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Converter</em>' containment reference.
   * @see #setConverter(JvmTypeReference)
   * @see brew.xtext.brew.BrewPackage#getMethodBind_Converter()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getConverter();

  /**
   * Sets the value of the '{@link brew.xtext.brew.MethodBind#getConverter <em>Converter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Converter</em>' containment reference.
   * @see #getConverter()
   * @generated
   */
  void setConverter(JvmTypeReference value);

} // MethodBind
