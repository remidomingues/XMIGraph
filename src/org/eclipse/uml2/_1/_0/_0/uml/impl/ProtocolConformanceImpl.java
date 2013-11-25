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

import org.eclipse.uml2._1._0._0.uml.ProtocolConformance;
import org.eclipse.uml2._1._0._0.uml.ProtocolStateMachine;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Conformance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ProtocolConformanceImpl#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ProtocolConformanceImpl#getGeneralMachine <em>General Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ProtocolConformanceImpl#getGeneralMachine1 <em>General Machine1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolConformanceImpl extends DirectedRelationshipImpl implements ProtocolConformance
{
	/**
	 * The cached value of the '{@link #getGroup3() <em>Group3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup3()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group3;

	/**
	 * The default value of the '{@link #getGeneralMachine1() <em>General Machine1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralMachine1()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERAL_MACHINE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeneralMachine1() <em>General Machine1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralMachine1()
	 * @generated
	 * @ordered
	 */
	protected String generalMachine1 = GENERAL_MACHINE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolConformanceImpl()
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
		return UmlPackage.eINSTANCE.getProtocolConformance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup3()
	{
		if (group3 == null)
		{
			group3 = new BasicFeatureMap(this, UmlPackage.PROTOCOL_CONFORMANCE__GROUP3);
		}
		return group3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtocolStateMachine> getGeneralMachine()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getProtocolConformance_GeneralMachine());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeneralMachine1()
	{
		return generalMachine1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralMachine1(String newGeneralMachine1)
	{
		String oldGeneralMachine1 = generalMachine1;
		generalMachine1 = newGeneralMachine1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE1, oldGeneralMachine1, generalMachine1));
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
			case UmlPackage.PROTOCOL_CONFORMANCE__GROUP3:
				return ((InternalEList<?>)getGroup3()).basicRemove(otherEnd, msgs);
			case UmlPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE:
				return ((InternalEList<?>)getGeneralMachine()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.PROTOCOL_CONFORMANCE__GROUP3:
				if (coreType) return getGroup3();
				return ((FeatureMap.Internal)getGroup3()).getWrapper();
			case UmlPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE:
				return getGeneralMachine();
			case UmlPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE1:
				return getGeneralMachine1();
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
			case UmlPackage.PROTOCOL_CONFORMANCE__GROUP3:
				((FeatureMap.Internal)getGroup3()).set(newValue);
				return;
			case UmlPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE:
				getGeneralMachine().clear();
				getGeneralMachine().addAll((Collection<? extends ProtocolStateMachine>)newValue);
				return;
			case UmlPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE1:
				setGeneralMachine1((String)newValue);
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
			case UmlPackage.PROTOCOL_CONFORMANCE__GROUP3:
				getGroup3().clear();
				return;
			case UmlPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE:
				getGeneralMachine().clear();
				return;
			case UmlPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE1:
				setGeneralMachine1(GENERAL_MACHINE1_EDEFAULT);
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
			case UmlPackage.PROTOCOL_CONFORMANCE__GROUP3:
				return group3 != null && !group3.isEmpty();
			case UmlPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE:
				return !getGeneralMachine().isEmpty();
			case UmlPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE1:
				return GENERAL_MACHINE1_EDEFAULT == null ? generalMachine1 != null : !GENERAL_MACHINE1_EDEFAULT.equals(generalMachine1);
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
		result.append(" (group3: ");
		result.append(group3);
		result.append(", generalMachine1: ");
		result.append(generalMachine1);
		result.append(')');
		return result.toString();
	}

} //ProtocolConformanceImpl
