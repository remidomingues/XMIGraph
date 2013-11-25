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

import org.eclipse.uml2._1._0._0.uml.CombinedFragment;
import org.eclipse.uml2._1._0._0.uml.Gate;
import org.eclipse.uml2._1._0._0.uml.InteractionOperand;
import org.eclipse.uml2._1._0._0.uml.InteractionOperator;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CombinedFragmentImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CombinedFragmentImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CombinedFragmentImpl#getCfragmentGate <em>Cfragment Gate</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CombinedFragmentImpl#getInteractionOperator <em>Interaction Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CombinedFragmentImpl extends InteractionFragmentImpl implements CombinedFragment
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
	 * The default value of the '{@link #getInteractionOperator() <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionOperator()
	 * @generated
	 * @ordered
	 */
	protected static final InteractionOperator INTERACTION_OPERATOR_EDEFAULT = InteractionOperator.SEQ;

	/**
	 * The cached value of the '{@link #getInteractionOperator() <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionOperator()
	 * @generated
	 * @ordered
	 */
	protected InteractionOperator interactionOperator = INTERACTION_OPERATOR_EDEFAULT;

	/**
	 * This is true if the Interaction Operator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean interactionOperatorESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinedFragmentImpl()
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
		return UmlPackage.eINSTANCE.getCombinedFragment();
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
			group6 = new BasicFeatureMap(this, UmlPackage.COMBINED_FRAGMENT__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionOperand> getOperand()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getCombinedFragment_Operand());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getCfragmentGate()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getCombinedFragment_CfragmentGate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperator getInteractionOperator()
	{
		return interactionOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionOperator(InteractionOperator newInteractionOperator)
	{
		InteractionOperator oldInteractionOperator = interactionOperator;
		interactionOperator = newInteractionOperator == null ? INTERACTION_OPERATOR_EDEFAULT : newInteractionOperator;
		boolean oldInteractionOperatorESet = interactionOperatorESet;
		interactionOperatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR, oldInteractionOperator, interactionOperator, !oldInteractionOperatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInteractionOperator()
	{
		InteractionOperator oldInteractionOperator = interactionOperator;
		boolean oldInteractionOperatorESet = interactionOperatorESet;
		interactionOperator = INTERACTION_OPERATOR_EDEFAULT;
		interactionOperatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR, oldInteractionOperator, INTERACTION_OPERATOR_EDEFAULT, oldInteractionOperatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInteractionOperator()
	{
		return interactionOperatorESet;
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
			case UmlPackage.COMBINED_FRAGMENT__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.COMBINED_FRAGMENT__OPERAND:
				return ((InternalEList<?>)getOperand()).basicRemove(otherEnd, msgs);
			case UmlPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
				return ((InternalEList<?>)getCfragmentGate()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.COMBINED_FRAGMENT__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.COMBINED_FRAGMENT__OPERAND:
				return getOperand();
			case UmlPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
				return getCfragmentGate();
			case UmlPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
				return getInteractionOperator();
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
			case UmlPackage.COMBINED_FRAGMENT__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.COMBINED_FRAGMENT__OPERAND:
				getOperand().clear();
				getOperand().addAll((Collection<? extends InteractionOperand>)newValue);
				return;
			case UmlPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
				getCfragmentGate().clear();
				getCfragmentGate().addAll((Collection<? extends Gate>)newValue);
				return;
			case UmlPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
				setInteractionOperator((InteractionOperator)newValue);
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
			case UmlPackage.COMBINED_FRAGMENT__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.COMBINED_FRAGMENT__OPERAND:
				getOperand().clear();
				return;
			case UmlPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
				getCfragmentGate().clear();
				return;
			case UmlPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
				unsetInteractionOperator();
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
			case UmlPackage.COMBINED_FRAGMENT__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.COMBINED_FRAGMENT__OPERAND:
				return !getOperand().isEmpty();
			case UmlPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
				return !getCfragmentGate().isEmpty();
			case UmlPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
				return isSetInteractionOperator();
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
		result.append(", interactionOperator: ");
		if (interactionOperatorESet) result.append(interactionOperator); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CombinedFragmentImpl
