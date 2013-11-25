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

import org.eclipse.uml2._1._0._0.uml.AcceptEventAction;
import org.eclipse.uml2._1._0._0.uml.OutputPin;
import org.eclipse.uml2._1._0._0.uml.Trigger;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accept Event Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.AcceptEventActionImpl#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.AcceptEventActionImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.AcceptEventActionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.AcceptEventActionImpl#getResult1 <em>Result1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.AcceptEventActionImpl#getTrigger1 <em>Trigger1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AcceptEventActionImpl extends ActionImpl implements AcceptEventAction
{
	/**
	 * The cached value of the '{@link #getGroup8() <em>Group8</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup8()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group8;

	/**
	 * The default value of the '{@link #getResult1() <em>Result1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult1()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResult1() <em>Result1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult1()
	 * @generated
	 * @ordered
	 */
	protected String result1 = RESULT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrigger1() <em>Trigger1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger1()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrigger1() <em>Trigger1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger1()
	 * @generated
	 * @ordered
	 */
	protected String trigger1 = TRIGGER1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptEventActionImpl()
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
		return UmlPackage.eINSTANCE.getAcceptEventAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup8()
	{
		if (group8 == null)
		{
			group8 = new BasicFeatureMap(this, UmlPackage.ACCEPT_EVENT_ACTION__GROUP8);
		}
		return group8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getTrigger()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getAcceptEventAction_Trigger());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getResult()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getAcceptEventAction_Result());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResult1()
	{
		return result1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult1(String newResult1)
	{
		String oldResult1 = result1;
		result1 = newResult1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACCEPT_EVENT_ACTION__RESULT1, oldResult1, result1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrigger1()
	{
		return trigger1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger1(String newTrigger1)
	{
		String oldTrigger1 = trigger1;
		trigger1 = newTrigger1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACCEPT_EVENT_ACTION__TRIGGER1, oldTrigger1, trigger1));
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
			case UmlPackage.ACCEPT_EVENT_ACTION__GROUP8:
				return ((InternalEList<?>)getGroup8()).basicRemove(otherEnd, msgs);
			case UmlPackage.ACCEPT_EVENT_ACTION__TRIGGER:
				return ((InternalEList<?>)getTrigger()).basicRemove(otherEnd, msgs);
			case UmlPackage.ACCEPT_EVENT_ACTION__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.ACCEPT_EVENT_ACTION__GROUP8:
				if (coreType) return getGroup8();
				return ((FeatureMap.Internal)getGroup8()).getWrapper();
			case UmlPackage.ACCEPT_EVENT_ACTION__TRIGGER:
				return getTrigger();
			case UmlPackage.ACCEPT_EVENT_ACTION__RESULT:
				return getResult();
			case UmlPackage.ACCEPT_EVENT_ACTION__RESULT1:
				return getResult1();
			case UmlPackage.ACCEPT_EVENT_ACTION__TRIGGER1:
				return getTrigger1();
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
			case UmlPackage.ACCEPT_EVENT_ACTION__GROUP8:
				((FeatureMap.Internal)getGroup8()).set(newValue);
				return;
			case UmlPackage.ACCEPT_EVENT_ACTION__TRIGGER:
				getTrigger().clear();
				getTrigger().addAll((Collection<? extends Trigger>)newValue);
				return;
			case UmlPackage.ACCEPT_EVENT_ACTION__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case UmlPackage.ACCEPT_EVENT_ACTION__RESULT1:
				setResult1((String)newValue);
				return;
			case UmlPackage.ACCEPT_EVENT_ACTION__TRIGGER1:
				setTrigger1((String)newValue);
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
			case UmlPackage.ACCEPT_EVENT_ACTION__GROUP8:
				getGroup8().clear();
				return;
			case UmlPackage.ACCEPT_EVENT_ACTION__TRIGGER:
				getTrigger().clear();
				return;
			case UmlPackage.ACCEPT_EVENT_ACTION__RESULT:
				getResult().clear();
				return;
			case UmlPackage.ACCEPT_EVENT_ACTION__RESULT1:
				setResult1(RESULT1_EDEFAULT);
				return;
			case UmlPackage.ACCEPT_EVENT_ACTION__TRIGGER1:
				setTrigger1(TRIGGER1_EDEFAULT);
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
			case UmlPackage.ACCEPT_EVENT_ACTION__GROUP8:
				return group8 != null && !group8.isEmpty();
			case UmlPackage.ACCEPT_EVENT_ACTION__TRIGGER:
				return !getTrigger().isEmpty();
			case UmlPackage.ACCEPT_EVENT_ACTION__RESULT:
				return !getResult().isEmpty();
			case UmlPackage.ACCEPT_EVENT_ACTION__RESULT1:
				return RESULT1_EDEFAULT == null ? result1 != null : !RESULT1_EDEFAULT.equals(result1);
			case UmlPackage.ACCEPT_EVENT_ACTION__TRIGGER1:
				return TRIGGER1_EDEFAULT == null ? trigger1 != null : !TRIGGER1_EDEFAULT.equals(trigger1);
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
		result.append(" (group8: ");
		result.append(group8);
		result.append(", result1: ");
		result.append(result1);
		result.append(", trigger1: ");
		result.append(trigger1);
		result.append(')');
		return result.toString();
	}

} //AcceptEventActionImpl
