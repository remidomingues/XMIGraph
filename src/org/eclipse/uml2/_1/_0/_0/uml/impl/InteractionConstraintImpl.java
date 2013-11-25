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

import org.eclipse.uml2._1._0._0.uml.InteractionConstraint;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionConstraintImpl#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionConstraintImpl#getMinint <em>Minint</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionConstraintImpl#getMaxint <em>Maxint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionConstraintImpl extends ConstraintImpl implements InteractionConstraint
{
	/**
	 * The cached value of the '{@link #getGroup7() <em>Group7</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup7()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group7;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionConstraintImpl()
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
		return UmlPackage.eINSTANCE.getInteractionConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup7()
	{
		if (group7 == null)
		{
			group7 = new BasicFeatureMap(this, UmlPackage.INTERACTION_CONSTRAINT__GROUP7);
		}
		return group7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getMinint()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getInteractionConstraint_Minint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getMaxint()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getInteractionConstraint_Maxint());
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
			case UmlPackage.INTERACTION_CONSTRAINT__GROUP7:
				return ((InternalEList<?>)getGroup7()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERACTION_CONSTRAINT__MININT:
				return ((InternalEList<?>)getMinint()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERACTION_CONSTRAINT__MAXINT:
				return ((InternalEList<?>)getMaxint()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.INTERACTION_CONSTRAINT__GROUP7:
				if (coreType) return getGroup7();
				return ((FeatureMap.Internal)getGroup7()).getWrapper();
			case UmlPackage.INTERACTION_CONSTRAINT__MININT:
				return getMinint();
			case UmlPackage.INTERACTION_CONSTRAINT__MAXINT:
				return getMaxint();
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
			case UmlPackage.INTERACTION_CONSTRAINT__GROUP7:
				((FeatureMap.Internal)getGroup7()).set(newValue);
				return;
			case UmlPackage.INTERACTION_CONSTRAINT__MININT:
				getMinint().clear();
				getMinint().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UmlPackage.INTERACTION_CONSTRAINT__MAXINT:
				getMaxint().clear();
				getMaxint().addAll((Collection<? extends ValueSpecification>)newValue);
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
			case UmlPackage.INTERACTION_CONSTRAINT__GROUP7:
				getGroup7().clear();
				return;
			case UmlPackage.INTERACTION_CONSTRAINT__MININT:
				getMinint().clear();
				return;
			case UmlPackage.INTERACTION_CONSTRAINT__MAXINT:
				getMaxint().clear();
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
			case UmlPackage.INTERACTION_CONSTRAINT__GROUP7:
				return group7 != null && !group7.isEmpty();
			case UmlPackage.INTERACTION_CONSTRAINT__MININT:
				return !getMinint().isEmpty();
			case UmlPackage.INTERACTION_CONSTRAINT__MAXINT:
				return !getMaxint().isEmpty();
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
		result.append(" (group7: ");
		result.append(group7);
		result.append(')');
		return result.toString();
	}

} //InteractionConstraintImpl
