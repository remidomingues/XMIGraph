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

import org.eclipse.uml2._1._0._0.uml.CallOperationAction;
import org.eclipse.uml2._1._0._0.uml.InputPin;
import org.eclipse.uml2._1._0._0.uml.Operation;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Operation Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CallOperationActionImpl#getGroup10 <em>Group10</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CallOperationActionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CallOperationActionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CallOperationActionImpl#getOperation1 <em>Operation1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallOperationActionImpl extends CallActionImpl implements CallOperationAction
{
	/**
	 * The cached value of the '{@link #getGroup10() <em>Group10</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup10()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group10;

	/**
	 * The default value of the '{@link #getOperation1() <em>Operation1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation1()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperation1() <em>Operation1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation1()
	 * @generated
	 * @ordered
	 */
	protected String operation1 = OPERATION1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallOperationActionImpl()
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
		return UmlPackage.eINSTANCE.getCallOperationAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup10()
	{
		if (group10 == null)
		{
			group10 = new BasicFeatureMap(this, UmlPackage.CALL_OPERATION_ACTION__GROUP10);
		}
		return group10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperation()
	{
		return getGroup10().list(UmlPackage.eINSTANCE.getCallOperationAction_Operation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getTarget()
	{
		return getGroup10().list(UmlPackage.eINSTANCE.getCallOperationAction_Target());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperation1()
	{
		return operation1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation1(String newOperation1)
	{
		String oldOperation1 = operation1;
		operation1 = newOperation1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CALL_OPERATION_ACTION__OPERATION1, oldOperation1, operation1));
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
			case UmlPackage.CALL_OPERATION_ACTION__GROUP10:
				return ((InternalEList<?>)getGroup10()).basicRemove(otherEnd, msgs);
			case UmlPackage.CALL_OPERATION_ACTION__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case UmlPackage.CALL_OPERATION_ACTION__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.CALL_OPERATION_ACTION__GROUP10:
				if (coreType) return getGroup10();
				return ((FeatureMap.Internal)getGroup10()).getWrapper();
			case UmlPackage.CALL_OPERATION_ACTION__OPERATION:
				return getOperation();
			case UmlPackage.CALL_OPERATION_ACTION__TARGET:
				return getTarget();
			case UmlPackage.CALL_OPERATION_ACTION__OPERATION1:
				return getOperation1();
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
			case UmlPackage.CALL_OPERATION_ACTION__GROUP10:
				((FeatureMap.Internal)getGroup10()).set(newValue);
				return;
			case UmlPackage.CALL_OPERATION_ACTION__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case UmlPackage.CALL_OPERATION_ACTION__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends InputPin>)newValue);
				return;
			case UmlPackage.CALL_OPERATION_ACTION__OPERATION1:
				setOperation1((String)newValue);
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
			case UmlPackage.CALL_OPERATION_ACTION__GROUP10:
				getGroup10().clear();
				return;
			case UmlPackage.CALL_OPERATION_ACTION__OPERATION:
				getOperation().clear();
				return;
			case UmlPackage.CALL_OPERATION_ACTION__TARGET:
				getTarget().clear();
				return;
			case UmlPackage.CALL_OPERATION_ACTION__OPERATION1:
				setOperation1(OPERATION1_EDEFAULT);
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
			case UmlPackage.CALL_OPERATION_ACTION__GROUP10:
				return group10 != null && !group10.isEmpty();
			case UmlPackage.CALL_OPERATION_ACTION__OPERATION:
				return !getOperation().isEmpty();
			case UmlPackage.CALL_OPERATION_ACTION__TARGET:
				return !getTarget().isEmpty();
			case UmlPackage.CALL_OPERATION_ACTION__OPERATION1:
				return OPERATION1_EDEFAULT == null ? operation1 != null : !OPERATION1_EDEFAULT.equals(operation1);
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
		result.append(" (group10: ");
		result.append(group10);
		result.append(", operation1: ");
		result.append(operation1);
		result.append(')');
		return result.toString();
	}

} //CallOperationActionImpl
