/**
 */
package activitydiagramruntime;

import activitydiagram.Activity;
import activitydiagram.InputValue;
import activitydiagram.JoinNode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramruntime.Context#getOutput <em>Output</em>}</li>
 *   <li>{@link activitydiagramruntime.Context#getActivity <em>Activity</em>}</li>
 *   <li>{@link activitydiagramruntime.Context#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramruntime.Context#getInputValues <em>Input Values</em>}</li>
 *   <li>{@link activitydiagramruntime.Context#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see activitydiagramruntime.ActivitydiagramruntimePackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Trace)
	 * @see activitydiagramruntime.ActivitydiagramruntimePackage#getContext_Output()
	 * @model
	 * @generated
	 */
	Trace getOutput();

	/**
	 * Sets the value of the '{@link activitydiagramruntime.Context#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Trace value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see activitydiagramruntime.ActivitydiagramruntimePackage#getContext_Activity()
	 * @model
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link activitydiagramruntime.Context#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Context)
	 * @see activitydiagramruntime.ActivitydiagramruntimePackage#getContext_Parent()
	 * @model
	 * @generated
	 */
	Context getParent();

	/**
	 * Sets the value of the '{@link activitydiagramruntime.Context#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Context value);

	/**
	 * Returns the value of the '<em><b>Input Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagram.InputValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Values</em>' reference list.
	 * @see activitydiagramruntime.ActivitydiagramruntimePackage#getContext_InputValues()
	 * @model
	 * @generated
	 */
	EList<InputValue> getInputValues();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(JoinNode)
	 * @see activitydiagramruntime.ActivitydiagramruntimePackage#getContext_Node()
	 * @model
	 * @generated
	 */
	JoinNode getNode();

	/**
	 * Sets the value of the '{@link activitydiagramruntime.Context#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(JoinNode value);

} // Context
