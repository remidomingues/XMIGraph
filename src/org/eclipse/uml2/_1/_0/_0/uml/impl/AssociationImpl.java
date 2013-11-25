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

import org.eclipse.uml2._1._0._0.uml.Association;
import org.eclipse.uml2._1._0._0.uml.Property;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.AssociationImpl#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.AssociationImpl#getOwnedEnd <em>Owned End</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.AssociationImpl#getMemberEnd <em>Member End</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.AssociationImpl#getIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.AssociationImpl#getMemberEnd1 <em>Member End1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends ClassifierImpl implements Association
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
	 * The default value of the '{@link #getIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_DERIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDerived()
	 * @generated
	 * @ordered
	 */
	protected String isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemberEnd1() <em>Member End1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberEnd1()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMBER_END1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemberEnd1() <em>Member End1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberEnd1()
	 * @generated
	 * @ordered
	 */
	protected String memberEnd1 = MEMBER_END1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl()
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
		return UmlPackage.eINSTANCE.getAssociation();
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
			group7 = new BasicFeatureMap(this, UmlPackage.ASSOCIATION__GROUP7);
		}
		return group7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedEnd()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getAssociation_OwnedEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getMemberEnd()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getAssociation_MemberEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsDerived()
	{
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(String newIsDerived)
	{
		String oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ASSOCIATION__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMemberEnd1()
	{
		return memberEnd1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberEnd1(String newMemberEnd1)
	{
		String oldMemberEnd1 = memberEnd1;
		memberEnd1 = newMemberEnd1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ASSOCIATION__MEMBER_END1, oldMemberEnd1, memberEnd1));
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
			case UmlPackage.ASSOCIATION__GROUP7:
				return ((InternalEList<?>)getGroup7()).basicRemove(otherEnd, msgs);
			case UmlPackage.ASSOCIATION__OWNED_END:
				return ((InternalEList<?>)getOwnedEnd()).basicRemove(otherEnd, msgs);
			case UmlPackage.ASSOCIATION__MEMBER_END:
				return ((InternalEList<?>)getMemberEnd()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.ASSOCIATION__GROUP7:
				if (coreType) return getGroup7();
				return ((FeatureMap.Internal)getGroup7()).getWrapper();
			case UmlPackage.ASSOCIATION__OWNED_END:
				return getOwnedEnd();
			case UmlPackage.ASSOCIATION__MEMBER_END:
				return getMemberEnd();
			case UmlPackage.ASSOCIATION__IS_DERIVED:
				return getIsDerived();
			case UmlPackage.ASSOCIATION__MEMBER_END1:
				return getMemberEnd1();
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
			case UmlPackage.ASSOCIATION__GROUP7:
				((FeatureMap.Internal)getGroup7()).set(newValue);
				return;
			case UmlPackage.ASSOCIATION__OWNED_END:
				getOwnedEnd().clear();
				getOwnedEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case UmlPackage.ASSOCIATION__MEMBER_END:
				getMemberEnd().clear();
				getMemberEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case UmlPackage.ASSOCIATION__IS_DERIVED:
				setIsDerived((String)newValue);
				return;
			case UmlPackage.ASSOCIATION__MEMBER_END1:
				setMemberEnd1((String)newValue);
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
			case UmlPackage.ASSOCIATION__GROUP7:
				getGroup7().clear();
				return;
			case UmlPackage.ASSOCIATION__OWNED_END:
				getOwnedEnd().clear();
				return;
			case UmlPackage.ASSOCIATION__MEMBER_END:
				getMemberEnd().clear();
				return;
			case UmlPackage.ASSOCIATION__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case UmlPackage.ASSOCIATION__MEMBER_END1:
				setMemberEnd1(MEMBER_END1_EDEFAULT);
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
			case UmlPackage.ASSOCIATION__GROUP7:
				return group7 != null && !group7.isEmpty();
			case UmlPackage.ASSOCIATION__OWNED_END:
				return !getOwnedEnd().isEmpty();
			case UmlPackage.ASSOCIATION__MEMBER_END:
				return !getMemberEnd().isEmpty();
			case UmlPackage.ASSOCIATION__IS_DERIVED:
				return IS_DERIVED_EDEFAULT == null ? isDerived != null : !IS_DERIVED_EDEFAULT.equals(isDerived);
			case UmlPackage.ASSOCIATION__MEMBER_END1:
				return MEMBER_END1_EDEFAULT == null ? memberEnd1 != null : !MEMBER_END1_EDEFAULT.equals(memberEnd1);
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
		result.append(", isDerived: ");
		result.append(isDerived);
		result.append(", memberEnd1: ");
		result.append(memberEnd1);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
