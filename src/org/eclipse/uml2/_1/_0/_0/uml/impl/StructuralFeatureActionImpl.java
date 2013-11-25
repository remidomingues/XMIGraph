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

import org.eclipse.uml2._1._0._0.uml.InputPin;
import org.eclipse.uml2._1._0._0.uml.StructuralFeature;
import org.eclipse.uml2._1._0._0.uml.StructuralFeatureAction;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Feature Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StructuralFeatureActionImpl#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StructuralFeatureActionImpl#getStructuralFeature <em>Structural Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StructuralFeatureActionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StructuralFeatureActionImpl#getStructuralFeature1 <em>Structural Feature1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuralFeatureActionImpl extends ActionImpl implements StructuralFeatureAction
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
	 * The default value of the '{@link #getStructuralFeature1() <em>Structural Feature1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralFeature1()
	 * @generated
	 * @ordered
	 */
	protected static final String STRUCTURAL_FEATURE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStructuralFeature1() <em>Structural Feature1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralFeature1()
	 * @generated
	 * @ordered
	 */
	protected String structuralFeature1 = STRUCTURAL_FEATURE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralFeatureActionImpl()
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
		return UmlPackage.eINSTANCE.getStructuralFeatureAction();
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
			group8 = new BasicFeatureMap(this, UmlPackage.STRUCTURAL_FEATURE_ACTION__GROUP8);
		}
		return group8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuralFeature> getStructuralFeature()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getStructuralFeatureAction_StructuralFeature());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getObject()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getStructuralFeatureAction_Object());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStructuralFeature1()
	{
		return structuralFeature1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuralFeature1(String newStructuralFeature1)
	{
		String oldStructuralFeature1 = structuralFeature1;
		structuralFeature1 = newStructuralFeature1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE1, oldStructuralFeature1, structuralFeature1));
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
			case UmlPackage.STRUCTURAL_FEATURE_ACTION__GROUP8:
				return ((InternalEList<?>)getGroup8()).basicRemove(otherEnd, msgs);
			case UmlPackage.STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE:
				return ((InternalEList<?>)getStructuralFeature()).basicRemove(otherEnd, msgs);
			case UmlPackage.STRUCTURAL_FEATURE_ACTION__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.STRUCTURAL_FEATURE_ACTION__GROUP8:
				if (coreType) return getGroup8();
				return ((FeatureMap.Internal)getGroup8()).getWrapper();
			case UmlPackage.STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE:
				return getStructuralFeature();
			case UmlPackage.STRUCTURAL_FEATURE_ACTION__OBJECT:
				return getObject();
			case UmlPackage.STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE1:
				return getStructuralFeature1();
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
			case UmlPackage.STRUCTURAL_FEATURE_ACTION__GROUP8:
				((FeatureMap.Internal)getGroup8()).set(newValue);
				return;
			case UmlPackage.STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE:
				getStructuralFeature().clear();
				getStructuralFeature().addAll((Collection<? extends StructuralFeature>)newValue);
				return;
			case UmlPackage.STRUCTURAL_FEATURE_ACTION__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends InputPin>)newValue);
				return;
			case UmlPackage.STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE1:
				setStructuralFeature1((String)newValue);
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
			case UmlPackage.STRUCTURAL_FEATURE_ACTION__GROUP8:
				getGroup8().clear();
				return;
			case UmlPackage.STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE:
				getStructuralFeature().clear();
				return;
			case UmlPackage.STRUCTURAL_FEATURE_ACTION__OBJECT:
				getObject().clear();
				return;
			case UmlPackage.STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE1:
				setStructuralFeature1(STRUCTURAL_FEATURE1_EDEFAULT);
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
			case UmlPackage.STRUCTURAL_FEATURE_ACTION__GROUP8:
				return group8 != null && !group8.isEmpty();
			case UmlPackage.STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE:
				return !getStructuralFeature().isEmpty();
			case UmlPackage.STRUCTURAL_FEATURE_ACTION__OBJECT:
				return !getObject().isEmpty();
			case UmlPackage.STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE1:
				return STRUCTURAL_FEATURE1_EDEFAULT == null ? structuralFeature1 != null : !STRUCTURAL_FEATURE1_EDEFAULT.equals(structuralFeature1);
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
		result.append(", structuralFeature1: ");
		result.append(structuralFeature1);
		result.append(')');
		return result.toString();
	}

} //StructuralFeatureActionImpl
