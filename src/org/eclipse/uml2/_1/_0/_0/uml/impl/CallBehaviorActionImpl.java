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

import org.eclipse.uml2._1._0._0.uml.Behavior;
import org.eclipse.uml2._1._0._0.uml.CallBehaviorAction;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Behavior Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CallBehaviorActionImpl#getGroup10 <em>Group10</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CallBehaviorActionImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CallBehaviorActionImpl#getBehavior1 <em>Behavior1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallBehaviorActionImpl extends CallActionImpl implements CallBehaviorAction
{
	/**
	 * The cached value of the '{@link #getGroup10() <em>Group10</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup10()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group10;

	/**
	 * The default value of the '{@link #getBehavior1() <em>Behavior1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior1()
	 * @generated
	 * @ordered
	 */
	protected static final String BEHAVIOR1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBehavior1() <em>Behavior1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior1()
	 * @generated
	 * @ordered
	 */
	protected String behavior1 = BEHAVIOR1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallBehaviorActionImpl()
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
		return UmlPackage.eINSTANCE.getCallBehaviorAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup10()
	{
		if (group10 == null)
		{
			group10 = new BasicFeatureMap(this, UmlPackage.CALL_BEHAVIOR_ACTION__GROUP10);
		}
		return group10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getBehavior()
	{
		return getGroup10().list(UmlPackage.eINSTANCE.getCallBehaviorAction_Behavior());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBehavior1()
	{
		return behavior1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior1(String newBehavior1)
	{
		String oldBehavior1 = behavior1;
		behavior1 = newBehavior1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR1, oldBehavior1, behavior1));
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
			case UmlPackage.CALL_BEHAVIOR_ACTION__GROUP10:
				return ((InternalEList<?>)getGroup10()).basicRemove(otherEnd, msgs);
			case UmlPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR:
				return ((InternalEList<?>)getBehavior()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.CALL_BEHAVIOR_ACTION__GROUP10:
				if (coreType) return getGroup10();
				return ((FeatureMap.Internal)getGroup10()).getWrapper();
			case UmlPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR:
				return getBehavior();
			case UmlPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR1:
				return getBehavior1();
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
			case UmlPackage.CALL_BEHAVIOR_ACTION__GROUP10:
				((FeatureMap.Internal)getGroup10()).set(newValue);
				return;
			case UmlPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case UmlPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR1:
				setBehavior1((String)newValue);
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
			case UmlPackage.CALL_BEHAVIOR_ACTION__GROUP10:
				getGroup10().clear();
				return;
			case UmlPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR:
				getBehavior().clear();
				return;
			case UmlPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR1:
				setBehavior1(BEHAVIOR1_EDEFAULT);
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
			case UmlPackage.CALL_BEHAVIOR_ACTION__GROUP10:
				return group10 != null && !group10.isEmpty();
			case UmlPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR:
				return !getBehavior().isEmpty();
			case UmlPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR1:
				return BEHAVIOR1_EDEFAULT == null ? behavior1 != null : !BEHAVIOR1_EDEFAULT.equals(behavior1);
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
		result.append(" (group10: ");
		result.append(group10);
		result.append(", behavior1: ");
		result.append(behavior1);
		result.append(')');
		return result.toString();
	}

} //CallBehaviorActionImpl
