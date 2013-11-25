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

import org.eclipse.uml2._1._0._0.uml.TimeTrigger;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TimeTriggerImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TimeTriggerImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TimeTriggerImpl#getIsRelative <em>Is Relative</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeTriggerImpl extends TriggerImpl implements TimeTrigger
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
	 * The default value of the '{@link #getIsRelative() <em>Is Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRelative()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_RELATIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsRelative() <em>Is Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRelative()
	 * @generated
	 * @ordered
	 */
	protected String isRelative = IS_RELATIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeTriggerImpl()
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
		return UmlPackage.eINSTANCE.getTimeTrigger();
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
			group6 = new BasicFeatureMap(this, UmlPackage.TIME_TRIGGER__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getWhen()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getTimeTrigger_When());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsRelative()
	{
		return isRelative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRelative(String newIsRelative)
	{
		String oldIsRelative = isRelative;
		isRelative = newIsRelative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TIME_TRIGGER__IS_RELATIVE, oldIsRelative, isRelative));
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
			case UmlPackage.TIME_TRIGGER__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.TIME_TRIGGER__WHEN:
				return ((InternalEList<?>)getWhen()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.TIME_TRIGGER__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.TIME_TRIGGER__WHEN:
				return getWhen();
			case UmlPackage.TIME_TRIGGER__IS_RELATIVE:
				return getIsRelative();
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
			case UmlPackage.TIME_TRIGGER__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.TIME_TRIGGER__WHEN:
				getWhen().clear();
				getWhen().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UmlPackage.TIME_TRIGGER__IS_RELATIVE:
				setIsRelative((String)newValue);
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
			case UmlPackage.TIME_TRIGGER__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.TIME_TRIGGER__WHEN:
				getWhen().clear();
				return;
			case UmlPackage.TIME_TRIGGER__IS_RELATIVE:
				setIsRelative(IS_RELATIVE_EDEFAULT);
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
			case UmlPackage.TIME_TRIGGER__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.TIME_TRIGGER__WHEN:
				return !getWhen().isEmpty();
			case UmlPackage.TIME_TRIGGER__IS_RELATIVE:
				return IS_RELATIVE_EDEFAULT == null ? isRelative != null : !IS_RELATIVE_EDEFAULT.equals(isRelative);
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
		result.append(", isRelative: ");
		result.append(isRelative);
		result.append(')');
		return result.toString();
	}

} //TimeTriggerImpl
