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
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Merge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackageMergeImpl#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackageMergeImpl#getMergedPackage <em>Merged Package</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackageMergeImpl#getMergedPackage1 <em>Merged Package1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageMergeImpl extends DirectedRelationshipImpl implements PackageMerge
{
	/**
	 * The cached value of the '{@link #getGroup3() <em>Group3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup3()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group3;

	/**
	 * The default value of the '{@link #getMergedPackage1() <em>Merged Package1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergedPackage1()
	 * @generated
	 * @ordered
	 */
	protected static final String MERGED_PACKAGE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMergedPackage1() <em>Merged Package1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergedPackage1()
	 * @generated
	 * @ordered
	 */
	protected String mergedPackage1 = MERGED_PACKAGE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageMergeImpl()
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
		return UmlPackage.eINSTANCE.getPackageMerge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup3()
	{
		if (group3 == null)
		{
			group3 = new BasicFeatureMap(this, UmlPackage.PACKAGE_MERGE__GROUP3);
		}
		return group3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.uml2._1._0._0.uml.Package> getMergedPackage()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getPackageMerge_MergedPackage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMergedPackage1()
	{
		return mergedPackage1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMergedPackage1(String newMergedPackage1)
	{
		String oldMergedPackage1 = mergedPackage1;
		mergedPackage1 = newMergedPackage1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGE_MERGE__MERGED_PACKAGE1, oldMergedPackage1, mergedPackage1));
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
			case UmlPackage.PACKAGE_MERGE__GROUP3:
				return ((InternalEList<?>)getGroup3()).basicRemove(otherEnd, msgs);
			case UmlPackage.PACKAGE_MERGE__MERGED_PACKAGE:
				return ((InternalEList<?>)getMergedPackage()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.PACKAGE_MERGE__GROUP3:
				if (coreType) return getGroup3();
				return ((FeatureMap.Internal)getGroup3()).getWrapper();
			case UmlPackage.PACKAGE_MERGE__MERGED_PACKAGE:
				return getMergedPackage();
			case UmlPackage.PACKAGE_MERGE__MERGED_PACKAGE1:
				return getMergedPackage1();
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
			case UmlPackage.PACKAGE_MERGE__GROUP3:
				((FeatureMap.Internal)getGroup3()).set(newValue);
				return;
			case UmlPackage.PACKAGE_MERGE__MERGED_PACKAGE:
				getMergedPackage().clear();
				getMergedPackage().addAll((Collection<? extends org.eclipse.uml2._1._0._0.uml.Package>)newValue);
				return;
			case UmlPackage.PACKAGE_MERGE__MERGED_PACKAGE1:
				setMergedPackage1((String)newValue);
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
			case UmlPackage.PACKAGE_MERGE__GROUP3:
				getGroup3().clear();
				return;
			case UmlPackage.PACKAGE_MERGE__MERGED_PACKAGE:
				getMergedPackage().clear();
				return;
			case UmlPackage.PACKAGE_MERGE__MERGED_PACKAGE1:
				setMergedPackage1(MERGED_PACKAGE1_EDEFAULT);
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
			case UmlPackage.PACKAGE_MERGE__GROUP3:
				return group3 != null && !group3.isEmpty();
			case UmlPackage.PACKAGE_MERGE__MERGED_PACKAGE:
				return !getMergedPackage().isEmpty();
			case UmlPackage.PACKAGE_MERGE__MERGED_PACKAGE1:
				return MERGED_PACKAGE1_EDEFAULT == null ? mergedPackage1 != null : !MERGED_PACKAGE1_EDEFAULT.equals(mergedPackage1);
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
		result.append(" (group3: ");
		result.append(group3);
		result.append(", mergedPackage1: ");
		result.append(mergedPackage1);
		result.append(')');
		return result.toString();
	}

} //PackageMergeImpl
