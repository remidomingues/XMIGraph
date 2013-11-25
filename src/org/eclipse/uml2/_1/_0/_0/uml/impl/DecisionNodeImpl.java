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
import org.eclipse.uml2._1._0._0.uml.DecisionNode;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DecisionNodeImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DecisionNodeImpl#getDecisionInput <em>Decision Input</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DecisionNodeImpl#getDecisionInput1 <em>Decision Input1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionNodeImpl extends ControlNodeImpl implements DecisionNode
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
	 * The default value of the '{@link #getDecisionInput1() <em>Decision Input1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionInput1()
	 * @generated
	 * @ordered
	 */
	protected static final String DECISION_INPUT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecisionInput1() <em>Decision Input1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionInput1()
	 * @generated
	 * @ordered
	 */
	protected String decisionInput1 = DECISION_INPUT1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionNodeImpl()
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
		return UmlPackage.eINSTANCE.getDecisionNode();
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
			group6 = new BasicFeatureMap(this, UmlPackage.DECISION_NODE__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getDecisionInput()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getDecisionNode_DecisionInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDecisionInput1()
	{
		return decisionInput1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecisionInput1(String newDecisionInput1)
	{
		String oldDecisionInput1 = decisionInput1;
		decisionInput1 = newDecisionInput1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.DECISION_NODE__DECISION_INPUT1, oldDecisionInput1, decisionInput1));
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
			case UmlPackage.DECISION_NODE__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.DECISION_NODE__DECISION_INPUT:
				return ((InternalEList<?>)getDecisionInput()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.DECISION_NODE__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.DECISION_NODE__DECISION_INPUT:
				return getDecisionInput();
			case UmlPackage.DECISION_NODE__DECISION_INPUT1:
				return getDecisionInput1();
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
			case UmlPackage.DECISION_NODE__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.DECISION_NODE__DECISION_INPUT:
				getDecisionInput().clear();
				getDecisionInput().addAll((Collection<? extends Behavior>)newValue);
				return;
			case UmlPackage.DECISION_NODE__DECISION_INPUT1:
				setDecisionInput1((String)newValue);
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
			case UmlPackage.DECISION_NODE__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.DECISION_NODE__DECISION_INPUT:
				getDecisionInput().clear();
				return;
			case UmlPackage.DECISION_NODE__DECISION_INPUT1:
				setDecisionInput1(DECISION_INPUT1_EDEFAULT);
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
			case UmlPackage.DECISION_NODE__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.DECISION_NODE__DECISION_INPUT:
				return !getDecisionInput().isEmpty();
			case UmlPackage.DECISION_NODE__DECISION_INPUT1:
				return DECISION_INPUT1_EDEFAULT == null ? decisionInput1 != null : !DECISION_INPUT1_EDEFAULT.equals(decisionInput1);
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
		result.append(", decisionInput1: ");
		result.append(decisionInput1);
		result.append(')');
		return result.toString();
	}

} //DecisionNodeImpl
