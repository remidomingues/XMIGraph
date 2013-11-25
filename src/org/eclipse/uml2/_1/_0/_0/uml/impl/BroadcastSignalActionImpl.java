/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.uml2._1._0._0.uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2._1._0._0.uml.BroadcastSignalAction;
import org.eclipse.uml2._1._0._0.uml.Signal;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Broadcast Signal Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BroadcastSignalActionImpl#getGroup9 <em>Group9</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BroadcastSignalActionImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BroadcastSignalActionImpl#getSignal1 <em>Signal1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BroadcastSignalActionImpl extends InvocationActionImpl implements BroadcastSignalAction
{
	/**
	 * The cached value of the '{@link #getGroup9() <em>Group9</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup9()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group9;

	/**
	 * The default value of the '{@link #getSignal1() <em>Signal1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignal1()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNAL1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignal1() <em>Signal1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignal1()
	 * @generated
	 * @ordered
	 */
	protected String signal1 = SIGNAL1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BroadcastSignalActionImpl()
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
		return UmlPackage.eINSTANCE.getBroadcastSignalAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup9()
	{
		if (group9 == null)
		{
			group9 = new BasicFeatureMap(this, UmlPackage.BROADCAST_SIGNAL_ACTION__GROUP9);
		}
		return group9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getSignal()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getBroadcastSignalAction_Signal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignal1()
	{
		return signal1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignal1(String newSignal1)
	{
		String oldSignal1 = signal1;
		signal1 = newSignal1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.BROADCAST_SIGNAL_ACTION__SIGNAL1, oldSignal1, signal1));
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
			case UmlPackage.BROADCAST_SIGNAL_ACTION__GROUP9:
				return ((InternalEList<?>)getGroup9()).basicRemove(otherEnd, msgs);
			case UmlPackage.BROADCAST_SIGNAL_ACTION__SIGNAL:
				return ((InternalEList<?>)getSignal()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.BROADCAST_SIGNAL_ACTION__GROUP9:
				if (coreType) return getGroup9();
				return ((FeatureMap.Internal)getGroup9()).getWrapper();
			case UmlPackage.BROADCAST_SIGNAL_ACTION__SIGNAL:
				return getSignal();
			case UmlPackage.BROADCAST_SIGNAL_ACTION__SIGNAL1:
				return getSignal1();
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
			case UmlPackage.BROADCAST_SIGNAL_ACTION__GROUP9:
				((FeatureMap.Internal)getGroup9()).set(newValue);
				return;
			case UmlPackage.BROADCAST_SIGNAL_ACTION__SIGNAL:
				getSignal().clear();
				getSignal().addAll((Collection<? extends Signal>)newValue);
				return;
			case UmlPackage.BROADCAST_SIGNAL_ACTION__SIGNAL1:
				setSignal1((String)newValue);
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
			case UmlPackage.BROADCAST_SIGNAL_ACTION__GROUP9:
				getGroup9().clear();
				return;
			case UmlPackage.BROADCAST_SIGNAL_ACTION__SIGNAL:
				getSignal().clear();
				return;
			case UmlPackage.BROADCAST_SIGNAL_ACTION__SIGNAL1:
				setSignal1(SIGNAL1_EDEFAULT);
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
			case UmlPackage.BROADCAST_SIGNAL_ACTION__GROUP9:
				return group9 != null && !group9.isEmpty();
			case UmlPackage.BROADCAST_SIGNAL_ACTION__SIGNAL:
				return !getSignal().isEmpty();
			case UmlPackage.BROADCAST_SIGNAL_ACTION__SIGNAL1:
				return SIGNAL1_EDEFAULT == null ? signal1 != null : !SIGNAL1_EDEFAULT.equals(signal1);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group9: ");
		result.append(group9);
		result.append(", signal1: ");
		result.append(signal1);
		result.append(')');
		return result.toString();
	}

} //BroadcastSignalActionImpl
