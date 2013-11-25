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

import org.eclipse.uml2._1._0._0.uml.AddVariableValueAction;
import org.eclipse.uml2._1._0._0.uml.InputPin;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Variable Value Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.AddVariableValueActionImpl#getGroup10 <em>Group10</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.AddVariableValueActionImpl#getInsertAt <em>Insert At</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.AddVariableValueActionImpl#getIsReplaceAll <em>Is Replace All</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddVariableValueActionImpl extends WriteVariableActionImpl implements AddVariableValueAction
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
	 * The default value of the '{@link #getIsReplaceAll() <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReplaceAll()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_REPLACE_ALL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsReplaceAll() <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReplaceAll()
	 * @generated
	 * @ordered
	 */
	protected String isReplaceAll = IS_REPLACE_ALL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddVariableValueActionImpl()
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
		return UmlPackage.eINSTANCE.getAddVariableValueAction();
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
			group10 = new BasicFeatureMap(this, UmlPackage.ADD_VARIABLE_VALUE_ACTION__GROUP10);
		}
		return group10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getInsertAt()
	{
		return getGroup10().list(UmlPackage.eINSTANCE.getAddVariableValueAction_InsertAt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsReplaceAll()
	{
		return isReplaceAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReplaceAll(String newIsReplaceAll)
	{
		String oldIsReplaceAll = isReplaceAll;
		isReplaceAll = newIsReplaceAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ADD_VARIABLE_VALUE_ACTION__IS_REPLACE_ALL, oldIsReplaceAll, isReplaceAll));
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
			case UmlPackage.ADD_VARIABLE_VALUE_ACTION__GROUP10:
				return ((InternalEList<?>)getGroup10()).basicRemove(otherEnd, msgs);
			case UmlPackage.ADD_VARIABLE_VALUE_ACTION__INSERT_AT:
				return ((InternalEList<?>)getInsertAt()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.ADD_VARIABLE_VALUE_ACTION__GROUP10:
				if (coreType) return getGroup10();
				return ((FeatureMap.Internal)getGroup10()).getWrapper();
			case UmlPackage.ADD_VARIABLE_VALUE_ACTION__INSERT_AT:
				return getInsertAt();
			case UmlPackage.ADD_VARIABLE_VALUE_ACTION__IS_REPLACE_ALL:
				return getIsReplaceAll();
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
			case UmlPackage.ADD_VARIABLE_VALUE_ACTION__GROUP10:
				((FeatureMap.Internal)getGroup10()).set(newValue);
				return;
			case UmlPackage.ADD_VARIABLE_VALUE_ACTION__INSERT_AT:
				getInsertAt().clear();
				getInsertAt().addAll((Collection<? extends InputPin>)newValue);
				return;
			case UmlPackage.ADD_VARIABLE_VALUE_ACTION__IS_REPLACE_ALL:
				setIsReplaceAll((String)newValue);
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
			case UmlPackage.ADD_VARIABLE_VALUE_ACTION__GROUP10:
				getGroup10().clear();
				return;
			case UmlPackage.ADD_VARIABLE_VALUE_ACTION__INSERT_AT:
				getInsertAt().clear();
				return;
			case UmlPackage.ADD_VARIABLE_VALUE_ACTION__IS_REPLACE_ALL:
				setIsReplaceAll(IS_REPLACE_ALL_EDEFAULT);
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
			case UmlPackage.ADD_VARIABLE_VALUE_ACTION__GROUP10:
				return group10 != null && !group10.isEmpty();
			case UmlPackage.ADD_VARIABLE_VALUE_ACTION__INSERT_AT:
				return !getInsertAt().isEmpty();
			case UmlPackage.ADD_VARIABLE_VALUE_ACTION__IS_REPLACE_ALL:
				return IS_REPLACE_ALL_EDEFAULT == null ? isReplaceAll != null : !IS_REPLACE_ALL_EDEFAULT.equals(isReplaceAll);
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
		result.append(", isReplaceAll: ");
		result.append(isReplaceAll);
		result.append(')');
		return result.toString();
	}

} //AddVariableValueActionImpl
