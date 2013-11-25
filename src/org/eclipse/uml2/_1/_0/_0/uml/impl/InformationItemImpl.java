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

import org.eclipse.uml2._1._0._0.uml.Classifier;
import org.eclipse.uml2._1._0._0.uml.InformationItem;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InformationItemImpl#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InformationItemImpl#getRepresented <em>Represented</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InformationItemImpl#getRepresented1 <em>Represented1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InformationItemImpl extends ClassifierImpl implements InformationItem
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
	 * The default value of the '{@link #getRepresented1() <em>Represented1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresented1()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRESENTED1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepresented1() <em>Represented1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresented1()
	 * @generated
	 * @ordered
	 */
	protected String represented1 = REPRESENTED1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationItemImpl()
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
		return UmlPackage.eINSTANCE.getInformationItem();
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
			group7 = new BasicFeatureMap(this, UmlPackage.INFORMATION_ITEM__GROUP7);
		}
		return group7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRepresented()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getInformationItem_Represented());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepresented1()
	{
		return represented1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresented1(String newRepresented1)
	{
		String oldRepresented1 = represented1;
		represented1 = newRepresented1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INFORMATION_ITEM__REPRESENTED1, oldRepresented1, represented1));
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
			case UmlPackage.INFORMATION_ITEM__GROUP7:
				return ((InternalEList<?>)getGroup7()).basicRemove(otherEnd, msgs);
			case UmlPackage.INFORMATION_ITEM__REPRESENTED:
				return ((InternalEList<?>)getRepresented()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.INFORMATION_ITEM__GROUP7:
				if (coreType) return getGroup7();
				return ((FeatureMap.Internal)getGroup7()).getWrapper();
			case UmlPackage.INFORMATION_ITEM__REPRESENTED:
				return getRepresented();
			case UmlPackage.INFORMATION_ITEM__REPRESENTED1:
				return getRepresented1();
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
			case UmlPackage.INFORMATION_ITEM__GROUP7:
				((FeatureMap.Internal)getGroup7()).set(newValue);
				return;
			case UmlPackage.INFORMATION_ITEM__REPRESENTED:
				getRepresented().clear();
				getRepresented().addAll((Collection<? extends Classifier>)newValue);
				return;
			case UmlPackage.INFORMATION_ITEM__REPRESENTED1:
				setRepresented1((String)newValue);
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
			case UmlPackage.INFORMATION_ITEM__GROUP7:
				getGroup7().clear();
				return;
			case UmlPackage.INFORMATION_ITEM__REPRESENTED:
				getRepresented().clear();
				return;
			case UmlPackage.INFORMATION_ITEM__REPRESENTED1:
				setRepresented1(REPRESENTED1_EDEFAULT);
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
			case UmlPackage.INFORMATION_ITEM__GROUP7:
				return group7 != null && !group7.isEmpty();
			case UmlPackage.INFORMATION_ITEM__REPRESENTED:
				return !getRepresented().isEmpty();
			case UmlPackage.INFORMATION_ITEM__REPRESENTED1:
				return REPRESENTED1_EDEFAULT == null ? represented1 != null : !REPRESENTED1_EDEFAULT.equals(represented1);
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
		result.append(", represented1: ");
		result.append(represented1);
		result.append(')');
		return result.toString();
	}

} //InformationItemImpl
