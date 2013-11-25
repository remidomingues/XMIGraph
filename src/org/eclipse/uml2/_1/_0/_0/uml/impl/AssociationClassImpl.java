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

import org.eclipse.uml2._1._0._0.uml.AssociationClass;
import org.eclipse.uml2._1._0._0.uml.Property;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.AssociationClassImpl#getGroup9 <em>Group9</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.AssociationClassImpl#getOwnedEnd <em>Owned End</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.AssociationClassImpl#getMemberEnd <em>Member End</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.AssociationClassImpl#getIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.AssociationClassImpl#getMemberEnd1 <em>Member End1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationClassImpl extends ClassImpl implements AssociationClass
{
	/**
	 * The cached value of the '{@link #getGroup9() <em>Group9</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup9()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group9;

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
	protected AssociationClassImpl()
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
		return UmlPackage.eINSTANCE.getAssociationClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup9()
	{
		if (group9 == null)
		{
			group9 = new BasicFeatureMap(this, UmlPackage.ASSOCIATION_CLASS__GROUP9);
		}
		return group9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedEnd()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getAssociationClass_OwnedEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getMemberEnd()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getAssociationClass_MemberEnd());
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ASSOCIATION_CLASS__IS_DERIVED, oldIsDerived, isDerived));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ASSOCIATION_CLASS__MEMBER_END1, oldMemberEnd1, memberEnd1));
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
			case UmlPackage.ASSOCIATION_CLASS__GROUP9:
				return ((InternalEList<?>)getGroup9()).basicRemove(otherEnd, msgs);
			case UmlPackage.ASSOCIATION_CLASS__OWNED_END:
				return ((InternalEList<?>)getOwnedEnd()).basicRemove(otherEnd, msgs);
			case UmlPackage.ASSOCIATION_CLASS__MEMBER_END:
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
			case UmlPackage.ASSOCIATION_CLASS__GROUP9:
				if (coreType) return getGroup9();
				return ((FeatureMap.Internal)getGroup9()).getWrapper();
			case UmlPackage.ASSOCIATION_CLASS__OWNED_END:
				return getOwnedEnd();
			case UmlPackage.ASSOCIATION_CLASS__MEMBER_END:
				return getMemberEnd();
			case UmlPackage.ASSOCIATION_CLASS__IS_DERIVED:
				return getIsDerived();
			case UmlPackage.ASSOCIATION_CLASS__MEMBER_END1:
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
			case UmlPackage.ASSOCIATION_CLASS__GROUP9:
				((FeatureMap.Internal)getGroup9()).set(newValue);
				return;
			case UmlPackage.ASSOCIATION_CLASS__OWNED_END:
				getOwnedEnd().clear();
				getOwnedEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case UmlPackage.ASSOCIATION_CLASS__MEMBER_END:
				getMemberEnd().clear();
				getMemberEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case UmlPackage.ASSOCIATION_CLASS__IS_DERIVED:
				setIsDerived((String)newValue);
				return;
			case UmlPackage.ASSOCIATION_CLASS__MEMBER_END1:
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
			case UmlPackage.ASSOCIATION_CLASS__GROUP9:
				getGroup9().clear();
				return;
			case UmlPackage.ASSOCIATION_CLASS__OWNED_END:
				getOwnedEnd().clear();
				return;
			case UmlPackage.ASSOCIATION_CLASS__MEMBER_END:
				getMemberEnd().clear();
				return;
			case UmlPackage.ASSOCIATION_CLASS__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case UmlPackage.ASSOCIATION_CLASS__MEMBER_END1:
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
			case UmlPackage.ASSOCIATION_CLASS__GROUP9:
				return group9 != null && !group9.isEmpty();
			case UmlPackage.ASSOCIATION_CLASS__OWNED_END:
				return !getOwnedEnd().isEmpty();
			case UmlPackage.ASSOCIATION_CLASS__MEMBER_END:
				return !getMemberEnd().isEmpty();
			case UmlPackage.ASSOCIATION_CLASS__IS_DERIVED:
				return IS_DERIVED_EDEFAULT == null ? isDerived != null : !IS_DERIVED_EDEFAULT.equals(isDerived);
			case UmlPackage.ASSOCIATION_CLASS__MEMBER_END1:
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
		result.append(" (group9: ");
		result.append(group9);
		result.append(", isDerived: ");
		result.append(isDerived);
		result.append(", memberEnd1: ");
		result.append(memberEnd1);
		result.append(')');
		return result.toString();
	}

} //AssociationClassImpl
