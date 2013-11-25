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

import org.eclipse.uml2._1._0._0.uml.Signal;
import org.eclipse.uml2._1._0._0.uml.SignalTrigger;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.SignalTriggerImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.SignalTriggerImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.SignalTriggerImpl#getSignal1 <em>Signal1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignalTriggerImpl extends MessageTriggerImpl implements SignalTrigger
{
	/**
	 * The cached value of the '{@link #getGroup6() <em>Group6</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup6()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group6;

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
	protected SignalTriggerImpl()
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
		return UmlPackage.eINSTANCE.getSignalTrigger();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup6()
	{
		if (group6 == null)
		{
			group6 = new BasicFeatureMap(this, UmlPackage.SIGNAL_TRIGGER__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getSignal()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getSignalTrigger_Signal());
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.SIGNAL_TRIGGER__SIGNAL1, oldSignal1, signal1));
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
			case UmlPackage.SIGNAL_TRIGGER__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.SIGNAL_TRIGGER__SIGNAL:
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
			case UmlPackage.SIGNAL_TRIGGER__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.SIGNAL_TRIGGER__SIGNAL:
				return getSignal();
			case UmlPackage.SIGNAL_TRIGGER__SIGNAL1:
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
			case UmlPackage.SIGNAL_TRIGGER__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.SIGNAL_TRIGGER__SIGNAL:
				getSignal().clear();
				getSignal().addAll((Collection<? extends Signal>)newValue);
				return;
			case UmlPackage.SIGNAL_TRIGGER__SIGNAL1:
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
			case UmlPackage.SIGNAL_TRIGGER__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.SIGNAL_TRIGGER__SIGNAL:
				getSignal().clear();
				return;
			case UmlPackage.SIGNAL_TRIGGER__SIGNAL1:
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
			case UmlPackage.SIGNAL_TRIGGER__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.SIGNAL_TRIGGER__SIGNAL:
				return !getSignal().isEmpty();
			case UmlPackage.SIGNAL_TRIGGER__SIGNAL1:
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
		result.append(" (group6: ");
		result.append(group6);
		result.append(", signal1: ");
		result.append(signal1);
		result.append(')');
		return result.toString();
	}

} //SignalTriggerImpl
