/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.uml2._1._0._0.uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2._1._0._0.uml.ProtocolConformance;
import org.eclipse.uml2._1._0._0.uml.ProtocolStateMachine;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ProtocolStateMachineImpl#getGroup11 <em>Group11</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ProtocolStateMachineImpl#getConformance <em>Conformance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolStateMachineImpl extends StateMachineImpl implements ProtocolStateMachine
{
	/**
	 * The cached value of the '{@link #getGroup11() <em>Group11</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup11()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group11;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolStateMachineImpl()
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
		return UmlPackage.eINSTANCE.getProtocolStateMachine();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup11()
	{
		if (group11 == null)
		{
			group11 = new BasicFeatureMap(this, UmlPackage.PROTOCOL_STATE_MACHINE__GROUP11);
		}
		return group11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtocolConformance> getConformance()
	{
		return getGroup11().list(UmlPackage.eINSTANCE.getProtocolStateMachine_Conformance());
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
			case UmlPackage.PROTOCOL_STATE_MACHINE__GROUP11:
				return ((InternalEList<?>)getGroup11()).basicRemove(otherEnd, msgs);
			case UmlPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE:
				return ((InternalEList<?>)getConformance()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.PROTOCOL_STATE_MACHINE__GROUP11:
				if (coreType) return getGroup11();
				return ((FeatureMap.Internal)getGroup11()).getWrapper();
			case UmlPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE:
				return getConformance();
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
			case UmlPackage.PROTOCOL_STATE_MACHINE__GROUP11:
				((FeatureMap.Internal)getGroup11()).set(newValue);
				return;
			case UmlPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE:
				getConformance().clear();
				getConformance().addAll((Collection<? extends ProtocolConformance>)newValue);
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
			case UmlPackage.PROTOCOL_STATE_MACHINE__GROUP11:
				getGroup11().clear();
				return;
			case UmlPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE:
				getConformance().clear();
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
			case UmlPackage.PROTOCOL_STATE_MACHINE__GROUP11:
				return group11 != null && !group11.isEmpty();
			case UmlPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE:
				return !getConformance().isEmpty();
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
		result.append(" (group11: ");
		result.append(group11);
		result.append(')');
		return result.toString();
	}

} //ProtocolStateMachineImpl
