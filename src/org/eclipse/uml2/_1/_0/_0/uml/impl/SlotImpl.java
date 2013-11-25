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

import org.eclipse.uml2._1._0._0.uml.Slot;
import org.eclipse.uml2._1._0._0.uml.StructuralFeature;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.SlotImpl#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.SlotImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.SlotImpl#getDefiningFeature <em>Defining Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.SlotImpl#getDefiningFeature1 <em>Defining Feature1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlotImpl extends ElementImpl implements Slot
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
	 * The default value of the '{@link #getDefiningFeature1() <em>Defining Feature1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefiningFeature1()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINING_FEATURE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefiningFeature1() <em>Defining Feature1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefiningFeature1()
	 * @generated
	 * @ordered
	 */
	protected String definingFeature1 = DEFINING_FEATURE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotImpl()
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
		return UmlPackage.eINSTANCE.getSlot();
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
			group3 = new BasicFeatureMap(this, UmlPackage.SLOT__GROUP3);
		}
		return group3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getValue()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getSlot_Value());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuralFeature> getDefiningFeature()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getSlot_DefiningFeature());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefiningFeature1()
	{
		return definingFeature1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefiningFeature1(String newDefiningFeature1)
	{
		String oldDefiningFeature1 = definingFeature1;
		definingFeature1 = newDefiningFeature1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.SLOT__DEFINING_FEATURE1, oldDefiningFeature1, definingFeature1));
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
			case UmlPackage.SLOT__GROUP3:
				return ((InternalEList<?>)getGroup3()).basicRemove(otherEnd, msgs);
			case UmlPackage.SLOT__VALUE:
				return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
			case UmlPackage.SLOT__DEFINING_FEATURE:
				return ((InternalEList<?>)getDefiningFeature()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.SLOT__GROUP3:
				if (coreType) return getGroup3();
				return ((FeatureMap.Internal)getGroup3()).getWrapper();
			case UmlPackage.SLOT__VALUE:
				return getValue();
			case UmlPackage.SLOT__DEFINING_FEATURE:
				return getDefiningFeature();
			case UmlPackage.SLOT__DEFINING_FEATURE1:
				return getDefiningFeature1();
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
			case UmlPackage.SLOT__GROUP3:
				((FeatureMap.Internal)getGroup3()).set(newValue);
				return;
			case UmlPackage.SLOT__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UmlPackage.SLOT__DEFINING_FEATURE:
				getDefiningFeature().clear();
				getDefiningFeature().addAll((Collection<? extends StructuralFeature>)newValue);
				return;
			case UmlPackage.SLOT__DEFINING_FEATURE1:
				setDefiningFeature1((String)newValue);
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
			case UmlPackage.SLOT__GROUP3:
				getGroup3().clear();
				return;
			case UmlPackage.SLOT__VALUE:
				getValue().clear();
				return;
			case UmlPackage.SLOT__DEFINING_FEATURE:
				getDefiningFeature().clear();
				return;
			case UmlPackage.SLOT__DEFINING_FEATURE1:
				setDefiningFeature1(DEFINING_FEATURE1_EDEFAULT);
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
			case UmlPackage.SLOT__GROUP3:
				return group3 != null && !group3.isEmpty();
			case UmlPackage.SLOT__VALUE:
				return !getValue().isEmpty();
			case UmlPackage.SLOT__DEFINING_FEATURE:
				return !getDefiningFeature().isEmpty();
			case UmlPackage.SLOT__DEFINING_FEATURE1:
				return DEFINING_FEATURE1_EDEFAULT == null ? definingFeature1 != null : !DEFINING_FEATURE1_EDEFAULT.equals(definingFeature1);
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
		result.append(", definingFeature1: ");
		result.append(definingFeature1);
		result.append(')');
		return result.toString();
	}

} //SlotImpl
