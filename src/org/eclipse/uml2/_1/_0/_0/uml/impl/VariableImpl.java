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

import org.eclipse.uml2._1._0._0.uml.Type;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.ValueSpecification;
import org.eclipse.uml2._1._0._0.uml.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.VariableImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.VariableImpl#getType1 <em>Type1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.VariableImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.VariableImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.VariableImpl#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.VariableImpl#getIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.VariableImpl#getType2 <em>Type2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends ConnectableElementImpl implements Variable
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
	 * The default value of the '{@link #getType2() <em>Type2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType2()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType2() <em>Type2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType2()
	 * @generated
	 * @ordered
	 */
	protected String type2 = TYPE2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl()
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
		return UmlPackage.eINSTANCE.getVariable();
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
			group6 = new BasicFeatureMap(this, UmlPackage.VARIABLE__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getType1()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getVariable_Type1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getUpperValue()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getVariable_UpperValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getLowerValue()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getVariable_LowerValue());
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.VARIABLE__IS_ORDERED, oldIsOrdered, isOrdered));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.VARIABLE__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType2()
	{
		return type2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType2(String newType2)
	{
		String oldType2 = type2;
		type2 = newType2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.VARIABLE__TYPE2, oldType2, type2));
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
			case UmlPackage.VARIABLE__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.VARIABLE__TYPE1:
				return ((InternalEList<?>)getType1()).basicRemove(otherEnd, msgs);
			case UmlPackage.VARIABLE__UPPER_VALUE:
				return ((InternalEList<?>)getUpperValue()).basicRemove(otherEnd, msgs);
			case UmlPackage.VARIABLE__LOWER_VALUE:
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
			case UmlPackage.VARIABLE__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.VARIABLE__TYPE1:
				return getType1();
			case UmlPackage.VARIABLE__UPPER_VALUE:
				return getUpperValue();
			case UmlPackage.VARIABLE__LOWER_VALUE:
				return getLowerValue();
			case UmlPackage.VARIABLE__IS_ORDERED:
				return getIsOrdered();
			case UmlPackage.VARIABLE__IS_UNIQUE:
				return getIsUnique();
			case UmlPackage.VARIABLE__TYPE2:
				return getType2();
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
			case UmlPackage.VARIABLE__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.VARIABLE__TYPE1:
				getType1().clear();
				getType1().addAll((Collection<? extends Type>)newValue);
				return;
			case UmlPackage.VARIABLE__UPPER_VALUE:
				getUpperValue().clear();
				getUpperValue().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UmlPackage.VARIABLE__LOWER_VALUE:
				getLowerValue().clear();
				getLowerValue().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UmlPackage.VARIABLE__IS_ORDERED:
				setIsOrdered((String)newValue);
				return;
			case UmlPackage.VARIABLE__IS_UNIQUE:
				setIsUnique((String)newValue);
				return;
			case UmlPackage.VARIABLE__TYPE2:
				setType2((String)newValue);
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
			case UmlPackage.VARIABLE__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.VARIABLE__TYPE1:
				getType1().clear();
				return;
			case UmlPackage.VARIABLE__UPPER_VALUE:
				getUpperValue().clear();
				return;
			case UmlPackage.VARIABLE__LOWER_VALUE:
				getLowerValue().clear();
				return;
			case UmlPackage.VARIABLE__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UmlPackage.VARIABLE__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UmlPackage.VARIABLE__TYPE2:
				setType2(TYPE2_EDEFAULT);
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
			case UmlPackage.VARIABLE__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.VARIABLE__TYPE1:
				return !getType1().isEmpty();
			case UmlPackage.VARIABLE__UPPER_VALUE:
				return !getUpperValue().isEmpty();
			case UmlPackage.VARIABLE__LOWER_VALUE:
				return !getLowerValue().isEmpty();
			case UmlPackage.VARIABLE__IS_ORDERED:
				return IS_ORDERED_EDEFAULT == null ? isOrdered != null : !IS_ORDERED_EDEFAULT.equals(isOrdered);
			case UmlPackage.VARIABLE__IS_UNIQUE:
				return IS_UNIQUE_EDEFAULT == null ? isUnique != null : !IS_UNIQUE_EDEFAULT.equals(isUnique);
			case UmlPackage.VARIABLE__TYPE2:
				return TYPE2_EDEFAULT == null ? type2 != null : !TYPE2_EDEFAULT.equals(type2);
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
		result.append(", isOrdered: ");
		result.append(isOrdered);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", type2: ");
		result.append(type2);
		result.append(')');
		return result.toString();
	}

} //VariableImpl
