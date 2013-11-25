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

import org.eclipse.uml2._1._0._0.uml.ApplyFunctionAction;
import org.eclipse.uml2._1._0._0.uml.InputPin;
import org.eclipse.uml2._1._0._0.uml.OutputPin;
import org.eclipse.uml2._1._0._0.uml.PrimitiveFunction;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apply Function Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ApplyFunctionActionImpl#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ApplyFunctionActionImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ApplyFunctionActionImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ApplyFunctionActionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ApplyFunctionActionImpl#getFunction1 <em>Function1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplyFunctionActionImpl extends ActionImpl implements ApplyFunctionAction
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
	 * The default value of the '{@link #getFunction1() <em>Function1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction1()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunction1() <em>Function1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction1()
	 * @generated
	 * @ordered
	 */
	protected String function1 = FUNCTION1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplyFunctionActionImpl()
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
		return UmlPackage.eINSTANCE.getApplyFunctionAction();
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
			group8 = new BasicFeatureMap(this, UmlPackage.APPLY_FUNCTION_ACTION__GROUP8);
		}
		return group8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimitiveFunction> getFunction()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getApplyFunctionAction_Function());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getArgument()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getApplyFunctionAction_Argument());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getResult()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getApplyFunctionAction_Result());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunction1()
	{
		return function1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction1(String newFunction1)
	{
		String oldFunction1 = function1;
		function1 = newFunction1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.APPLY_FUNCTION_ACTION__FUNCTION1, oldFunction1, function1));
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
			case UmlPackage.APPLY_FUNCTION_ACTION__GROUP8:
				return ((InternalEList<?>)getGroup8()).basicRemove(otherEnd, msgs);
			case UmlPackage.APPLY_FUNCTION_ACTION__FUNCTION:
				return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
			case UmlPackage.APPLY_FUNCTION_ACTION__ARGUMENT:
				return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
			case UmlPackage.APPLY_FUNCTION_ACTION__RESULT:
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
			case UmlPackage.APPLY_FUNCTION_ACTION__GROUP8:
				if (coreType) return getGroup8();
				return ((FeatureMap.Internal)getGroup8()).getWrapper();
			case UmlPackage.APPLY_FUNCTION_ACTION__FUNCTION:
				return getFunction();
			case UmlPackage.APPLY_FUNCTION_ACTION__ARGUMENT:
				return getArgument();
			case UmlPackage.APPLY_FUNCTION_ACTION__RESULT:
				return getResult();
			case UmlPackage.APPLY_FUNCTION_ACTION__FUNCTION1:
				return getFunction1();
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
			case UmlPackage.APPLY_FUNCTION_ACTION__GROUP8:
				((FeatureMap.Internal)getGroup8()).set(newValue);
				return;
			case UmlPackage.APPLY_FUNCTION_ACTION__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends PrimitiveFunction>)newValue);
				return;
			case UmlPackage.APPLY_FUNCTION_ACTION__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection<? extends InputPin>)newValue);
				return;
			case UmlPackage.APPLY_FUNCTION_ACTION__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case UmlPackage.APPLY_FUNCTION_ACTION__FUNCTION1:
				setFunction1((String)newValue);
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
			case UmlPackage.APPLY_FUNCTION_ACTION__GROUP8:
				getGroup8().clear();
				return;
			case UmlPackage.APPLY_FUNCTION_ACTION__FUNCTION:
				getFunction().clear();
				return;
			case UmlPackage.APPLY_FUNCTION_ACTION__ARGUMENT:
				getArgument().clear();
				return;
			case UmlPackage.APPLY_FUNCTION_ACTION__RESULT:
				getResult().clear();
				return;
			case UmlPackage.APPLY_FUNCTION_ACTION__FUNCTION1:
				setFunction1(FUNCTION1_EDEFAULT);
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
			case UmlPackage.APPLY_FUNCTION_ACTION__GROUP8:
				return group8 != null && !group8.isEmpty();
			case UmlPackage.APPLY_FUNCTION_ACTION__FUNCTION:
				return !getFunction().isEmpty();
			case UmlPackage.APPLY_FUNCTION_ACTION__ARGUMENT:
				return !getArgument().isEmpty();
			case UmlPackage.APPLY_FUNCTION_ACTION__RESULT:
				return !getResult().isEmpty();
			case UmlPackage.APPLY_FUNCTION_ACTION__FUNCTION1:
				return FUNCTION1_EDEFAULT == null ? function1 != null : !FUNCTION1_EDEFAULT.equals(function1);
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
		result.append(", function1: ");
		result.append(function1);
		result.append(')');
		return result.toString();
	}

} //ApplyFunctionActionImpl
