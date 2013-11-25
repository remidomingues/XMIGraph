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

import org.eclipse.uml2._1._0._0.uml.Component;
import org.eclipse.uml2._1._0._0.uml.PackageableElement;
import org.eclipse.uml2._1._0._0.uml.Realization;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ComponentImpl#getGroup9 <em>Group9</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ComponentImpl#getRealization <em>Realization</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ComponentImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ComponentImpl#getIsIndirectlyInstantiated <em>Is Indirectly Instantiated</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends ClassImpl implements Component
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
	 * The default value of the '{@link #getIsIndirectlyInstantiated() <em>Is Indirectly Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsIndirectlyInstantiated()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_INDIRECTLY_INSTANTIATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsIndirectlyInstantiated() <em>Is Indirectly Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsIndirectlyInstantiated()
	 * @generated
	 * @ordered
	 */
	protected String isIndirectlyInstantiated = IS_INDIRECTLY_INSTANTIATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl()
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
		return UmlPackage.eINSTANCE.getComponent();
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
			group9 = new BasicFeatureMap(this, UmlPackage.COMPONENT__GROUP9);
		}
		return group9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Realization> getRealization()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getComponent_Realization());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getOwnedMember()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getComponent_OwnedMember());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsIndirectlyInstantiated()
	{
		return isIndirectlyInstantiated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIndirectlyInstantiated(String newIsIndirectlyInstantiated)
	{
		String oldIsIndirectlyInstantiated = isIndirectlyInstantiated;
		isIndirectlyInstantiated = newIsIndirectlyInstantiated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED, oldIsIndirectlyInstantiated, isIndirectlyInstantiated));
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
			case UmlPackage.COMPONENT__GROUP9:
				return ((InternalEList<?>)getGroup9()).basicRemove(otherEnd, msgs);
			case UmlPackage.COMPONENT__REALIZATION:
				return ((InternalEList<?>)getRealization()).basicRemove(otherEnd, msgs);
			case UmlPackage.COMPONENT__OWNED_MEMBER:
				return ((InternalEList<?>)getOwnedMember()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.COMPONENT__GROUP9:
				if (coreType) return getGroup9();
				return ((FeatureMap.Internal)getGroup9()).getWrapper();
			case UmlPackage.COMPONENT__REALIZATION:
				return getRealization();
			case UmlPackage.COMPONENT__OWNED_MEMBER:
				return getOwnedMember();
			case UmlPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED:
				return getIsIndirectlyInstantiated();
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
			case UmlPackage.COMPONENT__GROUP9:
				((FeatureMap.Internal)getGroup9()).set(newValue);
				return;
			case UmlPackage.COMPONENT__REALIZATION:
				getRealization().clear();
				getRealization().addAll((Collection<? extends Realization>)newValue);
				return;
			case UmlPackage.COMPONENT__OWNED_MEMBER:
				getOwnedMember().clear();
				getOwnedMember().addAll((Collection<? extends PackageableElement>)newValue);
				return;
			case UmlPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED:
				setIsIndirectlyInstantiated((String)newValue);
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
			case UmlPackage.COMPONENT__GROUP9:
				getGroup9().clear();
				return;
			case UmlPackage.COMPONENT__REALIZATION:
				getRealization().clear();
				return;
			case UmlPackage.COMPONENT__OWNED_MEMBER:
				getOwnedMember().clear();
				return;
			case UmlPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED:
				setIsIndirectlyInstantiated(IS_INDIRECTLY_INSTANTIATED_EDEFAULT);
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
			case UmlPackage.COMPONENT__GROUP9:
				return group9 != null && !group9.isEmpty();
			case UmlPackage.COMPONENT__REALIZATION:
				return !getRealization().isEmpty();
			case UmlPackage.COMPONENT__OWNED_MEMBER:
				return !getOwnedMember().isEmpty();
			case UmlPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED:
				return IS_INDIRECTLY_INSTANTIATED_EDEFAULT == null ? isIndirectlyInstantiated != null : !IS_INDIRECTLY_INSTANTIATED_EDEFAULT.equals(isIndirectlyInstantiated);
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
		result.append(", isIndirectlyInstantiated: ");
		result.append(isIndirectlyInstantiated);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
