/**
 */
package basicFsmEnv;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link basicFsmEnv.Machine#getName <em>Name</em>}</li>
 *   <li>{@link basicFsmEnv.Machine#getStates <em>States</em>}</li>
 *   <li>{@link basicFsmEnv.Machine#getTrans <em>Trans</em>}</li>
 * </ul>
 *
 * @see basicFsmEnv.BasicFsmEnvPackage#getMachine()
 * @model
 * @generated
 */
public interface Machine extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see basicFsmEnv.BasicFsmEnvPackage#getMachine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link basicFsmEnv.Machine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link basicFsmEnv.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see basicFsmEnv.BasicFsmEnvPackage#getMachine_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Trans</b></em>' containment reference list.
	 * The list contents are of type {@link basicFsmEnv.Trans}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trans</em>' containment reference list.
	 * @see basicFsmEnv.BasicFsmEnvPackage#getMachine_Trans()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trans> getTrans();

} // Machine
