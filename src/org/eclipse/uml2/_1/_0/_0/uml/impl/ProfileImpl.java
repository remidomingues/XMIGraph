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

import org.eclipse.uml2._1._0._0.uml.ElementImport;
import org.eclipse.uml2._1._0._0.uml.PackageImport;
import org.eclipse.uml2._1._0._0.uml.Profile;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ProfileImpl#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ProfileImpl#getMetaclassReference <em>Metaclass Reference</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ProfileImpl#getMetamodelReference <em>Metamodel Reference</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ProfileImpl#getMetaclassReference1 <em>Metaclass Reference1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ProfileImpl#getMetamodelReference1 <em>Metamodel Reference1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileImpl extends PackageImpl implements Profile
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
	 * The default value of the '{@link #getMetaclassReference1() <em>Metaclass Reference1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaclassReference1()
	 * @generated
	 * @ordered
	 */
	protected static final String METACLASS_REFERENCE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaclassReference1() <em>Metaclass Reference1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaclassReference1()
	 * @generated
	 * @ordered
	 */
	protected String metaclassReference1 = METACLASS_REFERENCE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetamodelReference1() <em>Metamodel Reference1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelReference1()
	 * @generated
	 * @ordered
	 */
	protected static final String METAMODEL_REFERENCE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetamodelReference1() <em>Metamodel Reference1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelReference1()
	 * @generated
	 * @ordered
	 */
	protected String metamodelReference1 = METAMODEL_REFERENCE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileImpl()
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
		return UmlPackage.eINSTANCE.getProfile();
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
			group7 = new BasicFeatureMap(this, UmlPackage.PROFILE__GROUP7);
		}
		return group7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementImport> getMetaclassReference()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getProfile_MetaclassReference());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageImport> getMetamodelReference()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getProfile_MetamodelReference());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaclassReference1()
	{
		return metaclassReference1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaclassReference1(String newMetaclassReference1)
	{
		String oldMetaclassReference1 = metaclassReference1;
		metaclassReference1 = newMetaclassReference1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROFILE__METACLASS_REFERENCE1, oldMetaclassReference1, metaclassReference1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetamodelReference1()
	{
		return metamodelReference1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodelReference1(String newMetamodelReference1)
	{
		String oldMetamodelReference1 = metamodelReference1;
		metamodelReference1 = newMetamodelReference1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROFILE__METAMODEL_REFERENCE1, oldMetamodelReference1, metamodelReference1));
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
			case UmlPackage.PROFILE__GROUP7:
				return ((InternalEList<?>)getGroup7()).basicRemove(otherEnd, msgs);
			case UmlPackage.PROFILE__METACLASS_REFERENCE:
				return ((InternalEList<?>)getMetaclassReference()).basicRemove(otherEnd, msgs);
			case UmlPackage.PROFILE__METAMODEL_REFERENCE:
				return ((InternalEList<?>)getMetamodelReference()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.PROFILE__GROUP7:
				if (coreType) return getGroup7();
				return ((FeatureMap.Internal)getGroup7()).getWrapper();
			case UmlPackage.PROFILE__METACLASS_REFERENCE:
				return getMetaclassReference();
			case UmlPackage.PROFILE__METAMODEL_REFERENCE:
				return getMetamodelReference();
			case UmlPackage.PROFILE__METACLASS_REFERENCE1:
				return getMetaclassReference1();
			case UmlPackage.PROFILE__METAMODEL_REFERENCE1:
				return getMetamodelReference1();
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
			case UmlPackage.PROFILE__GROUP7:
				((FeatureMap.Internal)getGroup7()).set(newValue);
				return;
			case UmlPackage.PROFILE__METACLASS_REFERENCE:
				getMetaclassReference().clear();
				getMetaclassReference().addAll((Collection<? extends ElementImport>)newValue);
				return;
			case UmlPackage.PROFILE__METAMODEL_REFERENCE:
				getMetamodelReference().clear();
				getMetamodelReference().addAll((Collection<? extends PackageImport>)newValue);
				return;
			case UmlPackage.PROFILE__METACLASS_REFERENCE1:
				setMetaclassReference1((String)newValue);
				return;
			case UmlPackage.PROFILE__METAMODEL_REFERENCE1:
				setMetamodelReference1((String)newValue);
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
			case UmlPackage.PROFILE__GROUP7:
				getGroup7().clear();
				return;
			case UmlPackage.PROFILE__METACLASS_REFERENCE:
				getMetaclassReference().clear();
				return;
			case UmlPackage.PROFILE__METAMODEL_REFERENCE:
				getMetamodelReference().clear();
				return;
			case UmlPackage.PROFILE__METACLASS_REFERENCE1:
				setMetaclassReference1(METACLASS_REFERENCE1_EDEFAULT);
				return;
			case UmlPackage.PROFILE__METAMODEL_REFERENCE1:
				setMetamodelReference1(METAMODEL_REFERENCE1_EDEFAULT);
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
			case UmlPackage.PROFILE__GROUP7:
				return group7 != null && !group7.isEmpty();
			case UmlPackage.PROFILE__METACLASS_REFERENCE:
				return !getMetaclassReference().isEmpty();
			case UmlPackage.PROFILE__METAMODEL_REFERENCE:
				return !getMetamodelReference().isEmpty();
			case UmlPackage.PROFILE__METACLASS_REFERENCE1:
				return METACLASS_REFERENCE1_EDEFAULT == null ? metaclassReference1 != null : !METACLASS_REFERENCE1_EDEFAULT.equals(metaclassReference1);
			case UmlPackage.PROFILE__METAMODEL_REFERENCE1:
				return METAMODEL_REFERENCE1_EDEFAULT == null ? metamodelReference1 != null : !METAMODEL_REFERENCE1_EDEFAULT.equals(metamodelReference1);
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
		result.append(", metaclassReference1: ");
		result.append(metaclassReference1);
		result.append(", metamodelReference1: ");
		result.append(metamodelReference1);
		result.append(')');
		return result.toString();
	}

} //ProfileImpl
