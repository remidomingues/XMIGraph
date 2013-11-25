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

import org.eclipse.uml2._1._0._0.uml.InputPin;
import org.eclipse.uml2._1._0._0.uml.LinkEndCreationData;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link End Creation Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LinkEndCreationDataImpl#getGroup4 <em>Group4</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LinkEndCreationDataImpl#getInsertAt <em>Insert At</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LinkEndCreationDataImpl#getInsertAt1 <em>Insert At1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LinkEndCreationDataImpl#getIsReplaceAll <em>Is Replace All</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkEndCreationDataImpl extends LinkEndDataImpl implements LinkEndCreationData
{
	/**
	 * The cached value of the '{@link #getGroup4() <em>Group4</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup4()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group4;

	/**
	 * The default value of the '{@link #getInsertAt1() <em>Insert At1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertAt1()
	 * @generated
	 * @ordered
	 */
	protected static final String INSERT_AT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsertAt1() <em>Insert At1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertAt1()
	 * @generated
	 * @ordered
	 */
	protected String insertAt1 = INSERT_AT1_EDEFAULT;

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
	protected LinkEndCreationDataImpl()
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
		return UmlPackage.eINSTANCE.getLinkEndCreationData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup4()
	{
		if (group4 == null)
		{
			group4 = new BasicFeatureMap(this, UmlPackage.LINK_END_CREATION_DATA__GROUP4);
		}
		return group4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getInsertAt()
	{
		return getGroup4().list(UmlPackage.eINSTANCE.getLinkEndCreationData_InsertAt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInsertAt1()
	{
		return insertAt1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertAt1(String newInsertAt1)
	{
		String oldInsertAt1 = insertAt1;
		insertAt1 = newInsertAt1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.LINK_END_CREATION_DATA__INSERT_AT1, oldInsertAt1, insertAt1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL, oldIsReplaceAll, isReplaceAll));
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
			case UmlPackage.LINK_END_CREATION_DATA__GROUP4:
				return ((InternalEList<?>)getGroup4()).basicRemove(otherEnd, msgs);
			case UmlPackage.LINK_END_CREATION_DATA__INSERT_AT:
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
			case UmlPackage.LINK_END_CREATION_DATA__GROUP4:
				if (coreType) return getGroup4();
				return ((FeatureMap.Internal)getGroup4()).getWrapper();
			case UmlPackage.LINK_END_CREATION_DATA__INSERT_AT:
				return getInsertAt();
			case UmlPackage.LINK_END_CREATION_DATA__INSERT_AT1:
				return getInsertAt1();
			case UmlPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL:
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
			case UmlPackage.LINK_END_CREATION_DATA__GROUP4:
				((FeatureMap.Internal)getGroup4()).set(newValue);
				return;
			case UmlPackage.LINK_END_CREATION_DATA__INSERT_AT:
				getInsertAt().clear();
				getInsertAt().addAll((Collection<? extends InputPin>)newValue);
				return;
			case UmlPackage.LINK_END_CREATION_DATA__INSERT_AT1:
				setInsertAt1((String)newValue);
				return;
			case UmlPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL:
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
			case UmlPackage.LINK_END_CREATION_DATA__GROUP4:
				getGroup4().clear();
				return;
			case UmlPackage.LINK_END_CREATION_DATA__INSERT_AT:
				getInsertAt().clear();
				return;
			case UmlPackage.LINK_END_CREATION_DATA__INSERT_AT1:
				setInsertAt1(INSERT_AT1_EDEFAULT);
				return;
			case UmlPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL:
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
			case UmlPackage.LINK_END_CREATION_DATA__GROUP4:
				return group4 != null && !group4.isEmpty();
			case UmlPackage.LINK_END_CREATION_DATA__INSERT_AT:
				return !getInsertAt().isEmpty();
			case UmlPackage.LINK_END_CREATION_DATA__INSERT_AT1:
				return INSERT_AT1_EDEFAULT == null ? insertAt1 != null : !INSERT_AT1_EDEFAULT.equals(insertAt1);
			case UmlPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL:
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
		result.append(" (group4: ");
		result.append(group4);
		result.append(", insertAt1: ");
		result.append(insertAt1);
		result.append(", isReplaceAll: ");
		result.append(isReplaceAll);
		result.append(')');
		return result.toString();
	}

} //LinkEndCreationDataImpl
