/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.uml2._1._0._0.uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2._1._0._0.uml.InputPin;
import org.eclipse.uml2._1._0._0.uml.OutputPin;
import org.eclipse.uml2._1._0._0.uml.TestIdentityAction;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Identity Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TestIdentityActionImpl#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TestIdentityActionImpl#getFirst <em>First</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TestIdentityActionImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TestIdentityActionImpl#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestIdentityActionImpl extends ActionImpl implements TestIdentityAction
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestIdentityActionImpl()
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
		return UmlPackage.eINSTANCE.getTestIdentityAction();
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
			group8 = new BasicFeatureMap(this, UmlPackage.TEST_IDENTITY_ACTION__GROUP8);
		}
		return group8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getFirst()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getTestIdentityAction_First());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getSecond()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getTestIdentityAction_Second());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getResult()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getTestIdentityAction_Result());
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
			case UmlPackage.TEST_IDENTITY_ACTION__GROUP8:
				return ((InternalEList<?>)getGroup8()).basicRemove(otherEnd, msgs);
			case UmlPackage.TEST_IDENTITY_ACTION__FIRST:
				return ((InternalEList<?>)getFirst()).basicRemove(otherEnd, msgs);
			case UmlPackage.TEST_IDENTITY_ACTION__SECOND:
				return ((InternalEList<?>)getSecond()).basicRemove(otherEnd, msgs);
			case UmlPackage.TEST_IDENTITY_ACTION__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.TEST_IDENTITY_ACTION__GROUP8:
				if (coreType) return getGroup8();
				return ((FeatureMap.Internal)getGroup8()).getWrapper();
			case UmlPackage.TEST_IDENTITY_ACTION__FIRST:
				return getFirst();
			case UmlPackage.TEST_IDENTITY_ACTION__SECOND:
				return getSecond();
			case UmlPackage.TEST_IDENTITY_ACTION__RESULT:
				return getResult();
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
			case UmlPackage.TEST_IDENTITY_ACTION__GROUP8:
				((FeatureMap.Internal)getGroup8()).set(newValue);
				return;
			case UmlPackage.TEST_IDENTITY_ACTION__FIRST:
				getFirst().clear();
				getFirst().addAll((Collection<? extends InputPin>)newValue);
				return;
			case UmlPackage.TEST_IDENTITY_ACTION__SECOND:
				getSecond().clear();
				getSecond().addAll((Collection<? extends InputPin>)newValue);
				return;
			case UmlPackage.TEST_IDENTITY_ACTION__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends OutputPin>)newValue);
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
			case UmlPackage.TEST_IDENTITY_ACTION__GROUP8:
				getGroup8().clear();
				return;
			case UmlPackage.TEST_IDENTITY_ACTION__FIRST:
				getFirst().clear();
				return;
			case UmlPackage.TEST_IDENTITY_ACTION__SECOND:
				getSecond().clear();
				return;
			case UmlPackage.TEST_IDENTITY_ACTION__RESULT:
				getResult().clear();
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
			case UmlPackage.TEST_IDENTITY_ACTION__GROUP8:
				return group8 != null && !group8.isEmpty();
			case UmlPackage.TEST_IDENTITY_ACTION__FIRST:
				return !getFirst().isEmpty();
			case UmlPackage.TEST_IDENTITY_ACTION__SECOND:
				return !getSecond().isEmpty();
			case UmlPackage.TEST_IDENTITY_ACTION__RESULT:
				return !getResult().isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //TestIdentityActionImpl
