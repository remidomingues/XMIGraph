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

import org.eclipse.uml2._1._0._0.uml.DataType;
import org.eclipse.uml2._1._0._0.uml.Operation;
import org.eclipse.uml2._1._0._0.uml.Property;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DataTypeImpl#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DataTypeImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DataTypeImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeImpl extends ClassifierImpl implements DataType
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
	protected DataTypeImpl()
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
		return UmlPackage.eINSTANCE.getDataType();
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
			group7 = new BasicFeatureMap(this, UmlPackage.DATA_TYPE__GROUP7);
		}
		return group7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getDataType_OwnedAttribute());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperation()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getDataType_OwnedOperation());
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
			case UmlPackage.DATA_TYPE__GROUP7:
				return ((InternalEList<?>)getGroup7()).basicRemove(otherEnd, msgs);
			case UmlPackage.DATA_TYPE__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
			case UmlPackage.DATA_TYPE__OWNED_OPERATION:
				return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.DATA_TYPE__GROUP7:
				if (coreType) return getGroup7();
				return ((FeatureMap.Internal)getGroup7()).getWrapper();
			case UmlPackage.DATA_TYPE__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case UmlPackage.DATA_TYPE__OWNED_OPERATION:
				return getOwnedOperation();
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
			case UmlPackage.DATA_TYPE__GROUP7:
				((FeatureMap.Internal)getGroup7()).set(newValue);
				return;
			case UmlPackage.DATA_TYPE__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case UmlPackage.DATA_TYPE__OWNED_OPERATION:
				getOwnedOperation().clear();
				getOwnedOperation().addAll((Collection<? extends Operation>)newValue);
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
			case UmlPackage.DATA_TYPE__GROUP7:
				getGroup7().clear();
				return;
			case UmlPackage.DATA_TYPE__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
			case UmlPackage.DATA_TYPE__OWNED_OPERATION:
				getOwnedOperation().clear();
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
			case UmlPackage.DATA_TYPE__GROUP7:
				return group7 != null && !group7.isEmpty();
			case UmlPackage.DATA_TYPE__OWNED_ATTRIBUTE:
				return !getOwnedAttribute().isEmpty();
			case UmlPackage.DATA_TYPE__OWNED_OPERATION:
				return !getOwnedOperation().isEmpty();
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

} //DataTypeImpl
