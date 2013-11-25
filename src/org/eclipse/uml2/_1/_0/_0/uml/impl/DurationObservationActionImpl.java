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

import org.eclipse.uml2._1._0._0.uml.Duration;
import org.eclipse.uml2._1._0._0.uml.DurationObservationAction;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration Observation Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DurationObservationActionImpl#getGroup10 <em>Group10</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DurationObservationActionImpl#getDuration <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DurationObservationActionImpl extends WriteStructuralFeatureActionImpl implements DurationObservationAction
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurationObservationActionImpl()
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
		return UmlPackage.eINSTANCE.getDurationObservationAction();
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
			group10 = new BasicFeatureMap(this, UmlPackage.DURATION_OBSERVATION_ACTION__GROUP10);
		}
		return group10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Duration> getDuration()
	{
		return getGroup10().list(UmlPackage.eINSTANCE.getDurationObservationAction_Duration());
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
			case UmlPackage.DURATION_OBSERVATION_ACTION__GROUP10:
				return ((InternalEList<?>)getGroup10()).basicRemove(otherEnd, msgs);
			case UmlPackage.DURATION_OBSERVATION_ACTION__DURATION:
				return ((InternalEList<?>)getDuration()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.DURATION_OBSERVATION_ACTION__GROUP10:
				if (coreType) return getGroup10();
				return ((FeatureMap.Internal)getGroup10()).getWrapper();
			case UmlPackage.DURATION_OBSERVATION_ACTION__DURATION:
				return getDuration();
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
			case UmlPackage.DURATION_OBSERVATION_ACTION__GROUP10:
				((FeatureMap.Internal)getGroup10()).set(newValue);
				return;
			case UmlPackage.DURATION_OBSERVATION_ACTION__DURATION:
				getDuration().clear();
				getDuration().addAll((Collection<? extends Duration>)newValue);
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
			case UmlPackage.DURATION_OBSERVATION_ACTION__GROUP10:
				getGroup10().clear();
				return;
			case UmlPackage.DURATION_OBSERVATION_ACTION__DURATION:
				getDuration().clear();
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
			case UmlPackage.DURATION_OBSERVATION_ACTION__GROUP10:
				return group10 != null && !group10.isEmpty();
			case UmlPackage.DURATION_OBSERVATION_ACTION__DURATION:
				return !getDuration().isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //DurationObservationActionImpl
