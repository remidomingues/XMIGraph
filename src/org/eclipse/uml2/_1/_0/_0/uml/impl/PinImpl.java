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

import org.eclipse.uml2._1._0._0.uml.Pin;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PinImpl#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PinImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PinImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PinImpl#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PinImpl#getIsUnique <em>Is Unique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PinImpl extends ObjectNodeImpl implements Pin
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
	 * The default value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_ORDERED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected String isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_UNIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnique()
	 * @generated
	 * @ordered
	 */
	protected String isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PinImpl()
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
		return UmlPackage.eINSTANCE.getPin();
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
			group7 = new BasicFeatureMap(this, UmlPackage.PIN__GROUP7);
		}
		return group7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getUpperValue()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getPin_UpperValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getLowerValue()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getPin_LowerValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsOrdered()
	{
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(String newIsOrdered)
	{
		String oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PIN__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsUnique()
	{
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(String newIsUnique)
	{
		String oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PIN__IS_UNIQUE, oldIsUnique, isUnique));
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
			case UmlPackage.PIN__GROUP7:
				return ((InternalEList<?>)getGroup7()).basicRemove(otherEnd, msgs);
			case UmlPackage.PIN__UPPER_VALUE:
				return ((InternalEList<?>)getUpperValue()).basicRemove(otherEnd, msgs);
			case UmlPackage.PIN__LOWER_VALUE:
				return ((InternalEList<?>)getLowerValue()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.PIN__GROUP7:
				if (coreType) return getGroup7();
				return ((FeatureMap.Internal)getGroup7()).getWrapper();
			case UmlPackage.PIN__UPPER_VALUE:
				return getUpperValue();
			case UmlPackage.PIN__LOWER_VALUE:
				return getLowerValue();
			case UmlPackage.PIN__IS_ORDERED:
				return getIsOrdered();
			case UmlPackage.PIN__IS_UNIQUE:
				return getIsUnique();
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
			case UmlPackage.PIN__GROUP7:
				((FeatureMap.Internal)getGroup7()).set(newValue);
				return;
			case UmlPackage.PIN__UPPER_VALUE:
				getUpperValue().clear();
				getUpperValue().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UmlPackage.PIN__LOWER_VALUE:
				getLowerValue().clear();
				getLowerValue().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UmlPackage.PIN__IS_ORDERED:
				setIsOrdered((String)newValue);
				return;
			case UmlPackage.PIN__IS_UNIQUE:
				setIsUnique((String)newValue);
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
			case UmlPackage.PIN__GROUP7:
				getGroup7().clear();
				return;
			case UmlPackage.PIN__UPPER_VALUE:
				getUpperValue().clear();
				return;
			case UmlPackage.PIN__LOWER_VALUE:
				getLowerValue().clear();
				return;
			case UmlPackage.PIN__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UmlPackage.PIN__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
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
			case UmlPackage.PIN__GROUP7:
				return group7 != null && !group7.isEmpty();
			case UmlPackage.PIN__UPPER_VALUE:
				return !getUpperValue().isEmpty();
			case UmlPackage.PIN__LOWER_VALUE:
				return !getLowerValue().isEmpty();
			case UmlPackage.PIN__IS_ORDERED:
				return IS_ORDERED_EDEFAULT == null ? isOrdered != null : !IS_ORDERED_EDEFAULT.equals(isOrdered);
			case UmlPackage.PIN__IS_UNIQUE:
				return IS_UNIQUE_EDEFAULT == null ? isUnique != null : !IS_UNIQUE_EDEFAULT.equals(isUnique);
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
		result.append(", isOrdered: ");
		result.append(isOrdered);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(')');
		return result.toString();
	}

} //PinImpl
