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

import org.eclipse.uml2._1._0._0.uml.Profile;
import org.eclipse.uml2._1._0._0.uml.ProfileApplication;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ProfileApplicationImpl#getGroup4 <em>Group4</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ProfileApplicationImpl#getImportedProfile <em>Imported Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ProfileApplicationImpl#getImportedProfile1 <em>Imported Profile1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileApplicationImpl extends PackageImportImpl implements ProfileApplication
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
	 * The default value of the '{@link #getImportedProfile1() <em>Imported Profile1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedProfile1()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTED_PROFILE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportedProfile1() <em>Imported Profile1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedProfile1()
	 * @generated
	 * @ordered
	 */
	protected String importedProfile1 = IMPORTED_PROFILE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileApplicationImpl()
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
		return UmlPackage.eINSTANCE.getProfileApplication();
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
			group4 = new BasicFeatureMap(this, UmlPackage.PROFILE_APPLICATION__GROUP4);
		}
		return group4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Profile> getImportedProfile()
	{
		return getGroup4().list(UmlPackage.eINSTANCE.getProfileApplication_ImportedProfile());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportedProfile1()
	{
		return importedProfile1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedProfile1(String newImportedProfile1)
	{
		String oldImportedProfile1 = importedProfile1;
		importedProfile1 = newImportedProfile1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROFILE_APPLICATION__IMPORTED_PROFILE1, oldImportedProfile1, importedProfile1));
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
			case UmlPackage.PROFILE_APPLICATION__GROUP4:
				return ((InternalEList<?>)getGroup4()).basicRemove(otherEnd, msgs);
			case UmlPackage.PROFILE_APPLICATION__IMPORTED_PROFILE:
				return ((InternalEList<?>)getImportedProfile()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.PROFILE_APPLICATION__GROUP4:
				if (coreType) return getGroup4();
				return ((FeatureMap.Internal)getGroup4()).getWrapper();
			case UmlPackage.PROFILE_APPLICATION__IMPORTED_PROFILE:
				return getImportedProfile();
			case UmlPackage.PROFILE_APPLICATION__IMPORTED_PROFILE1:
				return getImportedProfile1();
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
			case UmlPackage.PROFILE_APPLICATION__GROUP4:
				((FeatureMap.Internal)getGroup4()).set(newValue);
				return;
			case UmlPackage.PROFILE_APPLICATION__IMPORTED_PROFILE:
				getImportedProfile().clear();
				getImportedProfile().addAll((Collection<? extends Profile>)newValue);
				return;
			case UmlPackage.PROFILE_APPLICATION__IMPORTED_PROFILE1:
				setImportedProfile1((String)newValue);
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
			case UmlPackage.PROFILE_APPLICATION__GROUP4:
				getGroup4().clear();
				return;
			case UmlPackage.PROFILE_APPLICATION__IMPORTED_PROFILE:
				getImportedProfile().clear();
				return;
			case UmlPackage.PROFILE_APPLICATION__IMPORTED_PROFILE1:
				setImportedProfile1(IMPORTED_PROFILE1_EDEFAULT);
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
			case UmlPackage.PROFILE_APPLICATION__GROUP4:
				return group4 != null && !group4.isEmpty();
			case UmlPackage.PROFILE_APPLICATION__IMPORTED_PROFILE:
				return !getImportedProfile().isEmpty();
			case UmlPackage.PROFILE_APPLICATION__IMPORTED_PROFILE1:
				return IMPORTED_PROFILE1_EDEFAULT == null ? importedProfile1 != null : !IMPORTED_PROFILE1_EDEFAULT.equals(importedProfile1);
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
		result.append(", importedProfile1: ");
		result.append(importedProfile1);
		result.append(')');
		return result.toString();
	}

} //ProfileApplicationImpl
