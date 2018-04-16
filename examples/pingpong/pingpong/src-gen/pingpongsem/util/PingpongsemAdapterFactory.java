/**
 */
package pingpongsem.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ping.Pong;

import pingpongsem.*;

import pong.PPing;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pingpongsem.PingpongsemPackage
 * @generated
 */
public class PingpongsemAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PingpongsemPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PingpongsemAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PingpongsemPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PingpongsemSwitch<Adapter> modelSwitch =
		new PingpongsemSwitch<Adapter>() {
			@Override
			public Adapter casePongBindPPong(PongBindPPong object) {
				return createPongBindPPongAdapter();
			}
			@Override
			public Adapter casePPingBindPing(PPingBindPing object) {
				return createPPingBindPingAdapter();
			}
			@Override
			public Adapter casePong(Pong object) {
				return createPongAdapter();
			}
			@Override
			public Adapter casePPing(PPing object) {
				return createPPingAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link pingpongsem.PongBindPPong <em>Pong Bind PPong</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pingpongsem.PongBindPPong
	 * @generated
	 */
	public Adapter createPongBindPPongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pingpongsem.PPingBindPing <em>PPing Bind Ping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pingpongsem.PPingBindPing
	 * @generated
	 */
	public Adapter createPPingBindPingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ping.Pong <em>Pong</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ping.Pong
	 * @generated
	 */
	public Adapter createPongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pong.PPing <em>PPing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pong.PPing
	 * @generated
	 */
	public Adapter createPPingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PingpongsemAdapterFactory
