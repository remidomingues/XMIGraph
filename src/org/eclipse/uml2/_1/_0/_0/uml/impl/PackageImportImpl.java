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

import org.eclipse.uml2._1._0._0.uml.PackageImport;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackageImportImpl#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackageImportImpl#getImportedPackage <em>Imported Package</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackageImportImpl#getImportedPackage1 <em>Imported Package1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackageImportImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImportImpl extends DirectedRelationshipImpl implements PackageImport
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
	 * The default value of the '{@link #getImportedPackage1() <em>Imported Package1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedPackage1()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTED_PACKAGE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportedPackage1() <em>Imported Package1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedPackage1()
	 * @generated
	 * @ordered
	 */
	protected String importedPackage1 = IMPORTED_PACKAGE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * This is true if the Visibility attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibilityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImportImpl()
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
		return UmlPackage.eINSTANCE.getPackageImport();
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
			group3 = new BasicFeatureMap(this, UmlPackage.PACKAGE_IMPORT__GROUP3);
		}
		return group3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.uml2._1._0._0.uml.Package> getImportedPackage()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getPackageImport_ImportedPackage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportedPackage1()
	{
		return importedPackage1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedPackage1(String newImportedPackage1)
	{
		String oldImportedPackage1 = importedPackage1;
		importedPackage1 = newImportedPackage1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE1, oldImportedPackage1, importedPackage1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility()
	{
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility)
	{
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		boolean oldVisibilityESet = visibilityESet;
		visibilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGE_IMPORT__VISIBILITY, oldVisibility, visibility, !oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibility()
	{
		VisibilityKind oldVisibility = visibility;
		boolean oldVisibilityESet = visibilityESet;
		visibility = VISIBILITY_EDEFAULT;
		visibilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.PACKAGE_IMPORT__VISIBILITY, oldVisibility, VISIBILITY_EDEFAULT, oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibility()
	{
		return visibilityESet;
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
			case UmlPackage.PACKAGE_IMPORT__GROUP3:
				return ((InternalEList<?>)getGroup3()).basicRemove(otherEnd, msgs);
			case UmlPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE:
				return ((InternalEList<?>)getImportedPackage()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.PACKAGE_IMPORT__GROUP3:
				if (coreType) return getGroup3();
				return ((FeatureMap.Internal)getGroup3()).getWrapper();
			case UmlPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE:
				return getImportedPackage();
			case UmlPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE1:
				return getImportedPackage1();
			case UmlPackage.PACKAGE_IMPORT__VISIBILITY:
				return getVisibility();
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
			case UmlPackage.PACKAGE_IMPORT__GROUP3:
				((FeatureMap.Internal)getGroup3()).set(newValue);
				return;
			case UmlPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE:
				getImportedPackage().clear();
				getImportedPackage().addAll((Collection<? extends org.eclipse.uml2._1._0._0.uml.Package>)newValue);
				return;
			case UmlPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE1:
				setImportedPackage1((String)newValue);
				return;
			case UmlPackage.PACKAGE_IMPORT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
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
			case UmlPackage.PACKAGE_IMPORT__GROUP3:
				getGroup3().clear();
				return;
			case UmlPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE:
				getImportedPackage().clear();
				return;
			case UmlPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE1:
				setImportedPackage1(IMPORTED_PACKAGE1_EDEFAULT);
				return;
			case UmlPackage.PACKAGE_IMPORT__VISIBILITY:
				unsetVisibility();
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
			case UmlPackage.PACKAGE_IMPORT__GROUP3:
				return group3 != null && !group3.isEmpty();
			case UmlPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE:
				return !getImportedPackage().isEmpty();
			case UmlPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE1:
				return IMPORTED_PACKAGE1_EDEFAULT == null ? importedPackage1 != null : !IMPORTED_PACKAGE1_EDEFAULT.equals(importedPackage1);
			case UmlPackage.PACKAGE_IMPORT__VISIBILITY:
				return isSetVisibility();
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
		result.append(", importedPackage1: ");
		result.append(importedPackage1);
		result.append(", visibility: ");
		if (visibilityESet) result.append(visibility); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PackageImportImpl
