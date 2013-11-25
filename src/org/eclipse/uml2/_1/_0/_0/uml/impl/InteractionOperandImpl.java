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

import org.eclipse.uml2._1._0._0.uml.GeneralOrdering;
import org.eclipse.uml2._1._0._0.uml.InteractionConstraint;
import org.eclipse.uml2._1._0._0.uml.InteractionFragment;
import org.eclipse.uml2._1._0._0.uml.InteractionOperand;
import org.eclipse.uml2._1._0._0.uml.Lifeline;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionOperandImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionOperandImpl#getCovered <em>Covered</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionOperandImpl#getGeneralOrdering <em>General Ordering</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionOperandImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionOperandImpl#getFragment <em>Fragment</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionOperandImpl#getCovered1 <em>Covered1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionOperandImpl extends NamespaceImpl implements InteractionOperand
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
	 * The default value of the '{@link #getCovered1() <em>Covered1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovered1()
	 * @generated
	 * @ordered
	 */
	protected static final String COVERED1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCovered1() <em>Covered1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovered1()
	 * @generated
	 * @ordered
	 */
	protected String covered1 = COVERED1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionOperandImpl()
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
		return UmlPackage.eINSTANCE.getInteractionOperand();
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
			group6 = new BasicFeatureMap(this, UmlPackage.INTERACTION_OPERAND__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lifeline> getCovered()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getInteractionOperand_Covered());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralOrdering> getGeneralOrdering()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getInteractionOperand_GeneralOrdering());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionConstraint> getGuard()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getInteractionOperand_Guard());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFragment> getFragment()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getInteractionOperand_Fragment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCovered1()
	{
		return covered1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCovered1(String newCovered1)
	{
		String oldCovered1 = covered1;
		covered1 = newCovered1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INTERACTION_OPERAND__COVERED1, oldCovered1, covered1));
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
			case UmlPackage.INTERACTION_OPERAND__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERACTION_OPERAND__COVERED:
				return ((InternalEList<?>)getCovered()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERACTION_OPERAND__GENERAL_ORDERING:
				return ((InternalEList<?>)getGeneralOrdering()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERACTION_OPERAND__GUARD:
				return ((InternalEList<?>)getGuard()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERACTION_OPERAND__FRAGMENT:
				return ((InternalEList<?>)getFragment()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.INTERACTION_OPERAND__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.INTERACTION_OPERAND__COVERED:
				return getCovered();
			case UmlPackage.INTERACTION_OPERAND__GENERAL_ORDERING:
				return getGeneralOrdering();
			case UmlPackage.INTERACTION_OPERAND__GUARD:
				return getGuard();
			case UmlPackage.INTERACTION_OPERAND__FRAGMENT:
				return getFragment();
			case UmlPackage.INTERACTION_OPERAND__COVERED1:
				return getCovered1();
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
			case UmlPackage.INTERACTION_OPERAND__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.INTERACTION_OPERAND__COVERED:
				getCovered().clear();
				getCovered().addAll((Collection<? extends Lifeline>)newValue);
				return;
			case UmlPackage.INTERACTION_OPERAND__GENERAL_ORDERING:
				getGeneralOrdering().clear();
				getGeneralOrdering().addAll((Collection<? extends GeneralOrdering>)newValue);
				return;
			case UmlPackage.INTERACTION_OPERAND__GUARD:
				getGuard().clear();
				getGuard().addAll((Collection<? extends InteractionConstraint>)newValue);
				return;
			case UmlPackage.INTERACTION_OPERAND__FRAGMENT:
				getFragment().clear();
				getFragment().addAll((Collection<? extends InteractionFragment>)newValue);
				return;
			case UmlPackage.INTERACTION_OPERAND__COVERED1:
				setCovered1((String)newValue);
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
			case UmlPackage.INTERACTION_OPERAND__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.INTERACTION_OPERAND__COVERED:
				getCovered().clear();
				return;
			case UmlPackage.INTERACTION_OPERAND__GENERAL_ORDERING:
				getGeneralOrdering().clear();
				return;
			case UmlPackage.INTERACTION_OPERAND__GUARD:
				getGuard().clear();
				return;
			case UmlPackage.INTERACTION_OPERAND__FRAGMENT:
				getFragment().clear();
				return;
			case UmlPackage.INTERACTION_OPERAND__COVERED1:
				setCovered1(COVERED1_EDEFAULT);
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
			case UmlPackage.INTERACTION_OPERAND__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.INTERACTION_OPERAND__COVERED:
				return !getCovered().isEmpty();
			case UmlPackage.INTERACTION_OPERAND__GENERAL_ORDERING:
				return !getGeneralOrdering().isEmpty();
			case UmlPackage.INTERACTION_OPERAND__GUARD:
				return !getGuard().isEmpty();
			case UmlPackage.INTERACTION_OPERAND__FRAGMENT:
				return !getFragment().isEmpty();
			case UmlPackage.INTERACTION_OPERAND__COVERED1:
				return COVERED1_EDEFAULT == null ? covered1 != null : !COVERED1_EDEFAULT.equals(covered1);
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
		result.append(", covered1: ");
		result.append(covered1);
		result.append(')');
		return result.toString();
	}

} //InteractionOperandImpl
