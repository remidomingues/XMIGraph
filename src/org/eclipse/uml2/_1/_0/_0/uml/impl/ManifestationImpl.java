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

import org.eclipse.uml2._1._0._0.uml.Manifestation;
import org.eclipse.uml2._1._0._0.uml.PackageableElement;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manifestation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ManifestationImpl#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ManifestationImpl#getUtilizedElement <em>Utilized Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ManifestationImpl#getUtilizedElement1 <em>Utilized Element1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManifestationImpl extends AbstractionImpl implements Manifestation
{
	/**
	 * The cached value of the '{@link #getGroup8() <em>Group8</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup8()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group8;

	/**
	 * The default value of the '{@link #getUtilizedElement1() <em>Utilized Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilizedElement1()
	 * @generated
	 * @ordered
	 */
	protected static final String UTILIZED_ELEMENT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUtilizedElement1() <em>Utilized Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilizedElement1()
	 * @generated
	 * @ordered
	 */
	protected String utilizedElement1 = UTILIZED_ELEMENT1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManifestationImpl()
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
		return UmlPackage.eINSTANCE.getManifestation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup8()
	{
		if (group8 == null)
		{
			group8 = new BasicFeatureMap(this, UmlPackage.MANIFESTATION__GROUP8);
		}
		return group8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getUtilizedElement()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getManifestation_UtilizedElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUtilizedElement1()
	{
		return utilizedElement1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilizedElement1(String newUtilizedElement1)
	{
		String oldUtilizedElement1 = utilizedElement1;
		utilizedElement1 = newUtilizedElement1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.MANIFESTATION__UTILIZED_ELEMENT1, oldUtilizedElement1, utilizedElement1));
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
			case UmlPackage.MANIFESTATION__GROUP8:
				return ((InternalEList<?>)getGroup8()).basicRemove(otherEnd, msgs);
			case UmlPackage.MANIFESTATION__UTILIZED_ELEMENT:
				return ((InternalEList<?>)getUtilizedElement()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.MANIFESTATION__GROUP8:
				if (coreType) return getGroup8();
				return ((FeatureMap.Internal)getGroup8()).getWrapper();
			case UmlPackage.MANIFESTATION__UTILIZED_ELEMENT:
				return getUtilizedElement();
			case UmlPackage.MANIFESTATION__UTILIZED_ELEMENT1:
				return getUtilizedElement1();
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
			case UmlPackage.MANIFESTATION__GROUP8:
				((FeatureMap.Internal)getGroup8()).set(newValue);
				return;
			case UmlPackage.MANIFESTATION__UTILIZED_ELEMENT:
				getUtilizedElement().clear();
				getUtilizedElement().addAll((Collection<? extends PackageableElement>)newValue);
				return;
			case UmlPackage.MANIFESTATION__UTILIZED_ELEMENT1:
				setUtilizedElement1((String)newValue);
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
			case UmlPackage.MANIFESTATION__GROUP8:
				getGroup8().clear();
				return;
			case UmlPackage.MANIFESTATION__UTILIZED_ELEMENT:
				getUtilizedElement().clear();
				return;
			case UmlPackage.MANIFESTATION__UTILIZED_ELEMENT1:
				setUtilizedElement1(UTILIZED_ELEMENT1_EDEFAULT);
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
			case UmlPackage.MANIFESTATION__GROUP8:
				return group8 != null && !group8.isEmpty();
			case UmlPackage.MANIFESTATION__UTILIZED_ELEMENT:
				return !getUtilizedElement().isEmpty();
			case UmlPackage.MANIFESTATION__UTILIZED_ELEMENT1:
				return UTILIZED_ELEMENT1_EDEFAULT == null ? utilizedElement1 != null : !UTILIZED_ELEMENT1_EDEFAULT.equals(utilizedElement1);
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
		result.append(" (group8: ");
		result.append(group8);
		result.append(", utilizedElement1: ");
		result.append(utilizedElement1);
		result.append(')');
		return result.toString();
	}

} //ManifestationImpl
