/**
 */
package fullfsmeval;

import basicFsmEnv.BasicFsmEnvPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fullfsmeval.FullfsmevalFactory
 * @model kind="package"
 * @generated
 */
public interface FullfsmevalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fullfsmeval";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fullfsmeval";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fullfsmeval";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FullfsmevalPackage eINSTANCE = fullfsmeval.impl.FullfsmevalPackageImpl.init();

	/**
	 * The meta object id for the '{@link fullfsmeval.impl.ActionBindImpl <em>Action Bind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fullfsmeval.impl.ActionBindImpl
	 * @see fullfsmeval.impl.FullfsmevalPackageImpl#getActionBind()
	 * @generated
	 */
	int ACTION_BIND = 0;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BIND__DELEGATE = BasicFsmEnvPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Bind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BIND_FEATURE_COUNT = BasicFsmEnvPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action Bind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BIND_OPERATION_COUNT = BasicFsmEnvPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fullfsmeval.impl.GuardBindImpl <em>Guard Bind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fullfsmeval.impl.GuardBindImpl
	 * @see fullfsmeval.impl.FullfsmevalPackageImpl#getGuardBind()
	 * @generated
	 */
	int GUARD_BIND = 1;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_BIND__DELEGATE = BasicFsmEnvPackage.GUARD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Guard Bind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_BIND_FEATURE_COUNT = BasicFsmEnvPackage.GUARD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Guard Bind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_BIND_OPERATION_COUNT = BasicFsmEnvPackage.GUARD_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fullfsmeval.ActionBind <em>Action Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Bind</em>'.
	 * @see fullfsmeval.ActionBind
	 * @generated
	 */
	EClass getActionBind();

	/**
	 * Returns the meta object for the reference '{@link fullfsmeval.ActionBind#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see fullfsmeval.ActionBind#getDelegate()
	 * @see #getActionBind()
	 * @generated
	 */
	EReference getActionBind_Delegate();

	/**
	 * Returns the meta object for class '{@link fullfsmeval.GuardBind <em>Guard Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard Bind</em>'.
	 * @see fullfsmeval.GuardBind
	 * @generated
	 */
	EClass getGuardBind();

	/**
	 * Returns the meta object for the reference '{@link fullfsmeval.GuardBind#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see fullfsmeval.GuardBind#getDelegate()
	 * @see #getGuardBind()
	 * @generated
	 */
	EReference getGuardBind_Delegate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FullfsmevalFactory getFullfsmevalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fullfsmeval.impl.ActionBindImpl <em>Action Bind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fullfsmeval.impl.ActionBindImpl
		 * @see fullfsmeval.impl.FullfsmevalPackageImpl#getActionBind()
		 * @generated
		 */
		EClass ACTION_BIND = eINSTANCE.getActionBind();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_BIND__DELEGATE = eINSTANCE.getActionBind_Delegate();

		/**
		 * The meta object literal for the '{@link fullfsmeval.impl.GuardBindImpl <em>Guard Bind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fullfsmeval.impl.GuardBindImpl
		 * @see fullfsmeval.impl.FullfsmevalPackageImpl#getGuardBind()
		 * @generated
		 */
		EClass GUARD_BIND = eINSTANCE.getGuardBind();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARD_BIND__DELEGATE = eINSTANCE.getGuardBind_Delegate();

	}

} //FullfsmevalPackage
