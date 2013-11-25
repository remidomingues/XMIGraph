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

import org.eclipse.uml2._1._0._0.uml.Pseudostate;
import org.eclipse.uml2._1._0._0.uml.Region;
import org.eclipse.uml2._1._0._0.uml.StateMachine;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StateMachineImpl#getGroup10 <em>Group10</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StateMachineImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StateMachineImpl#getConnectionPoint <em>Connection Point</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StateMachineImpl#getExtendedStateMachine <em>Extended State Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StateMachineImpl#getExtendedStateMachine1 <em>Extended State Machine1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateMachineImpl extends BehaviorImpl implements StateMachine
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
	 * The default value of the '{@link #getExtendedStateMachine1() <em>Extended State Machine1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedStateMachine1()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDED_STATE_MACHINE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtendedStateMachine1() <em>Extended State Machine1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedStateMachine1()
	 * @generated
	 * @ordered
	 */
	protected String extendedStateMachine1 = EXTENDED_STATE_MACHINE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineImpl()
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
		return UmlPackage.eINSTANCE.getStateMachine();
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
			group10 = new BasicFeatureMap(this, UmlPackage.STATE_MACHINE__GROUP10);
		}
		return group10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Region> getRegion()
	{
		return getGroup10().list(UmlPackage.eINSTANCE.getStateMachine_Region());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pseudostate> getConnectionPoint()
	{
		return getGroup10().list(UmlPackage.eINSTANCE.getStateMachine_ConnectionPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine> getExtendedStateMachine()
	{
		return getGroup10().list(UmlPackage.eINSTANCE.getStateMachine_ExtendedStateMachine());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtendedStateMachine1()
	{
		return extendedStateMachine1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedStateMachine1(String newExtendedStateMachine1)
	{
		String oldExtendedStateMachine1 = extendedStateMachine1;
		extendedStateMachine1 = newExtendedStateMachine1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE1, oldExtendedStateMachine1, extendedStateMachine1));
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
			case UmlPackage.STATE_MACHINE__GROUP10:
				return ((InternalEList<?>)getGroup10()).basicRemove(otherEnd, msgs);
			case UmlPackage.STATE_MACHINE__REGION:
				return ((InternalEList<?>)getRegion()).basicRemove(otherEnd, msgs);
			case UmlPackage.STATE_MACHINE__CONNECTION_POINT:
				return ((InternalEList<?>)getConnectionPoint()).basicRemove(otherEnd, msgs);
			case UmlPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				return ((InternalEList<?>)getExtendedStateMachine()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.STATE_MACHINE__GROUP10:
				if (coreType) return getGroup10();
				return ((FeatureMap.Internal)getGroup10()).getWrapper();
			case UmlPackage.STATE_MACHINE__REGION:
				return getRegion();
			case UmlPackage.STATE_MACHINE__CONNECTION_POINT:
				return getConnectionPoint();
			case UmlPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				return getExtendedStateMachine();
			case UmlPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE1:
				return getExtendedStateMachine1();
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
			case UmlPackage.STATE_MACHINE__GROUP10:
				((FeatureMap.Internal)getGroup10()).set(newValue);
				return;
			case UmlPackage.STATE_MACHINE__REGION:
				getRegion().clear();
				getRegion().addAll((Collection<? extends Region>)newValue);
				return;
			case UmlPackage.STATE_MACHINE__CONNECTION_POINT:
				getConnectionPoint().clear();
				getConnectionPoint().addAll((Collection<? extends Pseudostate>)newValue);
				return;
			case UmlPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				getExtendedStateMachine().clear();
				getExtendedStateMachine().addAll((Collection<? extends StateMachine>)newValue);
				return;
			case UmlPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE1:
				setExtendedStateMachine1((String)newValue);
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
			case UmlPackage.STATE_MACHINE__GROUP10:
				getGroup10().clear();
				return;
			case UmlPackage.STATE_MACHINE__REGION:
				getRegion().clear();
				return;
			case UmlPackage.STATE_MACHINE__CONNECTION_POINT:
				getConnectionPoint().clear();
				return;
			case UmlPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				getExtendedStateMachine().clear();
				return;
			case UmlPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE1:
				setExtendedStateMachine1(EXTENDED_STATE_MACHINE1_EDEFAULT);
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
			case UmlPackage.STATE_MACHINE__GROUP10:
				return group10 != null && !group10.isEmpty();
			case UmlPackage.STATE_MACHINE__REGION:
				return !getRegion().isEmpty();
			case UmlPackage.STATE_MACHINE__CONNECTION_POINT:
				return !getConnectionPoint().isEmpty();
			case UmlPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				return !getExtendedStateMachine().isEmpty();
			case UmlPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE1:
				return EXTENDED_STATE_MACHINE1_EDEFAULT == null ? extendedStateMachine1 != null : !EXTENDED_STATE_MACHINE1_EDEFAULT.equals(extendedStateMachine1);
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
		result.append(", extendedStateMachine1: ");
		result.append(extendedStateMachine1);
		result.append(')');
		return result.toString();
	}

} //StateMachineImpl
