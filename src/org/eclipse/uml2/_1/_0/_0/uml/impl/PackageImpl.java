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

import org.eclipse.uml2._1._0._0.uml.PackageMerge;
import org.eclipse.uml2._1._0._0.uml.PackageableElement;
import org.eclipse.uml2._1._0._0.uml.ProfileApplication;
import org.eclipse.uml2._1._0._0.uml.TemplateParameter;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackageImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackageImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackageImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackageImpl#getPackageMerge <em>Package Merge</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackageImpl#getAppliedProfile <em>Applied Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackageImpl#getPackageExtension <em>Package Extension</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackageImpl#getAppliedProfile1 <em>Applied Profile1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackageImpl#getPackageableElementVisibility <em>Packageable Element Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackageImpl#getTemplateParameter1 <em>Template Parameter1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends NamespaceImpl implements org.eclipse.uml2._1._0._0.uml.Package
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
	 * The default value of the '{@link #getAppliedProfile1() <em>Applied Profile1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedProfile1()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLIED_PROFILE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppliedProfile1() <em>Applied Profile1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedProfile1()
	 * @generated
	 * @ordered
	 */
	protected String appliedProfile1 = APPLIED_PROFILE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageableElementVisibility() <em>Packageable Element Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageableElementVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC;

	/**
	 * The cached value of the '{@link #getPackageableElementVisibility() <em>Packageable Element Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageableElementVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind packageableElementVisibility = PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;

	/**
	 * This is true if the Packageable Element Visibility attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean packageableElementVisibilityESet;

	/**
	 * The default value of the '{@link #getTemplateParameter1() <em>Template Parameter1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter1()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_PARAMETER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateParameter1() <em>Template Parameter1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter1()
	 * @generated
	 * @ordered
	 */
	protected String templateParameter1 = TEMPLATE_PARAMETER1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl()
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
		return UmlPackage.eINSTANCE.getPackage();
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
			group6 = new BasicFeatureMap(this, UmlPackage.PACKAGE__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateParameter> getTemplateParameter()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getPackage_TemplateParameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getOwnedMember()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getPackage_OwnedMember());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageMerge> getPackageMerge()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getPackage_PackageMerge());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProfileApplication> getAppliedProfile()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getPackage_AppliedProfile());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageMerge> getPackageExtension()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getPackage_PackageExtension());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppliedProfile1()
	{
		return appliedProfile1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedProfile1(String newAppliedProfile1)
	{
		String oldAppliedProfile1 = appliedProfile1;
		appliedProfile1 = newAppliedProfile1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGE__APPLIED_PROFILE1, oldAppliedProfile1, appliedProfile1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getPackageableElementVisibility()
	{
		return packageableElementVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageableElementVisibility(VisibilityKind newPackageableElementVisibility)
	{
		VisibilityKind oldPackageableElementVisibility = packageableElementVisibility;
		packageableElementVisibility = newPackageableElementVisibility == null ? PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT : newPackageableElementVisibility;
		boolean oldPackageableElementVisibilityESet = packageableElementVisibilityESet;
		packageableElementVisibilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGE__PACKAGEABLE_ELEMENT_VISIBILITY, oldPackageableElementVisibility, packageableElementVisibility, !oldPackageableElementVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPackageableElementVisibility()
	{
		VisibilityKind oldPackageableElementVisibility = packageableElementVisibility;
		boolean oldPackageableElementVisibilityESet = packageableElementVisibilityESet;
		packageableElementVisibility = PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
		packageableElementVisibilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.PACKAGE__PACKAGEABLE_ELEMENT_VISIBILITY, oldPackageableElementVisibility, PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT, oldPackageableElementVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPackageableElementVisibility()
	{
		return packageableElementVisibilityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplateParameter1()
	{
		return templateParameter1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameter1(String newTemplateParameter1)
	{
		String oldTemplateParameter1 = templateParameter1;
		templateParameter1 = newTemplateParameter1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGE__TEMPLATE_PARAMETER1, oldTemplateParameter1, templateParameter1));
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
			case UmlPackage.PACKAGE__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.PACKAGE__TEMPLATE_PARAMETER:
				return ((InternalEList<?>)getTemplateParameter()).basicRemove(otherEnd, msgs);
			case UmlPackage.PACKAGE__OWNED_MEMBER:
				return ((InternalEList<?>)getOwnedMember()).basicRemove(otherEnd, msgs);
			case UmlPackage.PACKAGE__PACKAGE_MERGE:
				return ((InternalEList<?>)getPackageMerge()).basicRemove(otherEnd, msgs);
			case UmlPackage.PACKAGE__APPLIED_PROFILE:
				return ((InternalEList<?>)getAppliedProfile()).basicRemove(otherEnd, msgs);
			case UmlPackage.PACKAGE__PACKAGE_EXTENSION:
				return ((InternalEList<?>)getPackageExtension()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.PACKAGE__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.PACKAGE__TEMPLATE_PARAMETER:
				return getTemplateParameter();
			case UmlPackage.PACKAGE__OWNED_MEMBER:
				return getOwnedMember();
			case UmlPackage.PACKAGE__PACKAGE_MERGE:
				return getPackageMerge();
			case UmlPackage.PACKAGE__APPLIED_PROFILE:
				return getAppliedProfile();
			case UmlPackage.PACKAGE__PACKAGE_EXTENSION:
				return getPackageExtension();
			case UmlPackage.PACKAGE__APPLIED_PROFILE1:
				return getAppliedProfile1();
			case UmlPackage.PACKAGE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElementVisibility();
			case UmlPackage.PACKAGE__TEMPLATE_PARAMETER1:
				return getTemplateParameter1();
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
			case UmlPackage.PACKAGE__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.PACKAGE__TEMPLATE_PARAMETER:
				getTemplateParameter().clear();
				getTemplateParameter().addAll((Collection<? extends TemplateParameter>)newValue);
				return;
			case UmlPackage.PACKAGE__OWNED_MEMBER:
				getOwnedMember().clear();
				getOwnedMember().addAll((Collection<? extends PackageableElement>)newValue);
				return;
			case UmlPackage.PACKAGE__PACKAGE_MERGE:
				getPackageMerge().clear();
				getPackageMerge().addAll((Collection<? extends PackageMerge>)newValue);
				return;
			case UmlPackage.PACKAGE__APPLIED_PROFILE:
				getAppliedProfile().clear();
				getAppliedProfile().addAll((Collection<? extends ProfileApplication>)newValue);
				return;
			case UmlPackage.PACKAGE__PACKAGE_EXTENSION:
				getPackageExtension().clear();
				getPackageExtension().addAll((Collection<? extends PackageMerge>)newValue);
				return;
			case UmlPackage.PACKAGE__APPLIED_PROFILE1:
				setAppliedProfile1((String)newValue);
				return;
			case UmlPackage.PACKAGE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElementVisibility((VisibilityKind)newValue);
				return;
			case UmlPackage.PACKAGE__TEMPLATE_PARAMETER1:
				setTemplateParameter1((String)newValue);
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
			case UmlPackage.PACKAGE__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.PACKAGE__TEMPLATE_PARAMETER:
				getTemplateParameter().clear();
				return;
			case UmlPackage.PACKAGE__OWNED_MEMBER:
				getOwnedMember().clear();
				return;
			case UmlPackage.PACKAGE__PACKAGE_MERGE:
				getPackageMerge().clear();
				return;
			case UmlPackage.PACKAGE__APPLIED_PROFILE:
				getAppliedProfile().clear();
				return;
			case UmlPackage.PACKAGE__PACKAGE_EXTENSION:
				getPackageExtension().clear();
				return;
			case UmlPackage.PACKAGE__APPLIED_PROFILE1:
				setAppliedProfile1(APPLIED_PROFILE1_EDEFAULT);
				return;
			case UmlPackage.PACKAGE__PACKAGEABLE_ELEMENT_VISIBILITY:
				unsetPackageableElementVisibility();
				return;
			case UmlPackage.PACKAGE__TEMPLATE_PARAMETER1:
				setTemplateParameter1(TEMPLATE_PARAMETER1_EDEFAULT);
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
			case UmlPackage.PACKAGE__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.PACKAGE__TEMPLATE_PARAMETER:
				return !getTemplateParameter().isEmpty();
			case UmlPackage.PACKAGE__OWNED_MEMBER:
				return !getOwnedMember().isEmpty();
			case UmlPackage.PACKAGE__PACKAGE_MERGE:
				return !getPackageMerge().isEmpty();
			case UmlPackage.PACKAGE__APPLIED_PROFILE:
				return !getAppliedProfile().isEmpty();
			case UmlPackage.PACKAGE__PACKAGE_EXTENSION:
				return !getPackageExtension().isEmpty();
			case UmlPackage.PACKAGE__APPLIED_PROFILE1:
				return APPLIED_PROFILE1_EDEFAULT == null ? appliedProfile1 != null : !APPLIED_PROFILE1_EDEFAULT.equals(appliedProfile1);
			case UmlPackage.PACKAGE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElementVisibility();
			case UmlPackage.PACKAGE__TEMPLATE_PARAMETER1:
				return TEMPLATE_PARAMETER1_EDEFAULT == null ? templateParameter1 != null : !TEMPLATE_PARAMETER1_EDEFAULT.equals(templateParameter1);
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
		result.append(", appliedProfile1: ");
		result.append(appliedProfile1);
		result.append(", packageableElementVisibility: ");
		if (packageableElementVisibilityESet) result.append(packageableElementVisibility); else result.append("<unset>");
		result.append(", templateParameter1: ");
		result.append(templateParameter1);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
