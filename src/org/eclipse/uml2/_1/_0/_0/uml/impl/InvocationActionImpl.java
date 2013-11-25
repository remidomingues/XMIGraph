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
import org.eclipse.uml2._1._0._0.uml.InvocationAction;
import org.eclipse.uml2._1._0._0.uml.Port;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invocation Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InvocationActionImpl#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InvocationActionImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InvocationActionImpl#getOnPort <em>On Port</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InvocationActionImpl#getOnPort1 <em>On Port1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvocationActionImpl extends ActionImpl implements InvocationAction
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
	 * The default value of the '{@link #getOnPort1() <em>On Port1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPort1()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_PORT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnPort1() <em>On Port1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPort1()
	 * @generated
	 * @ordered
	 */
	protected String onPort1 = ON_PORT1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvocationActionImpl()
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
		return UmlPackage.eINSTANCE.getInvocationAction();
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
			group8 = new BasicFeatureMap(this, UmlPackage.INVOCATION_ACTION__GROUP8);
		}
		return group8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getArgument()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getInvocationAction_Argument());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getOnPort()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getInvocationAction_OnPort());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnPort1()
	{
		return onPort1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnPort1(String newOnPort1)
	{
		String oldOnPort1 = onPort1;
		onPort1 = newOnPort1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INVOCATION_ACTION__ON_PORT1, oldOnPort1, onPort1));
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
			case UmlPackage.INVOCATION_ACTION__GROUP8:
				return ((InternalEList<?>)getGroup8()).basicRemove(otherEnd, msgs);
			case UmlPackage.INVOCATION_ACTION__ARGUMENT:
				return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
			case UmlPackage.INVOCATION_ACTION__ON_PORT:
				return ((InternalEList<?>)getOnPort()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.INVOCATION_ACTION__GROUP8:
				if (coreType) return getGroup8();
				return ((FeatureMap.Internal)getGroup8()).getWrapper();
			case UmlPackage.INVOCATION_ACTION__ARGUMENT:
				return getArgument();
			case UmlPackage.INVOCATION_ACTION__ON_PORT:
				return getOnPort();
			case UmlPackage.INVOCATION_ACTION__ON_PORT1:
				return getOnPort1();
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
			case UmlPackage.INVOCATION_ACTION__GROUP8:
				((FeatureMap.Internal)getGroup8()).set(newValue);
				return;
			case UmlPackage.INVOCATION_ACTION__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection<? extends InputPin>)newValue);
				return;
			case UmlPackage.INVOCATION_ACTION__ON_PORT:
				getOnPort().clear();
				getOnPort().addAll((Collection<? extends Port>)newValue);
				return;
			case UmlPackage.INVOCATION_ACTION__ON_PORT1:
				setOnPort1((String)newValue);
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
			case UmlPackage.INVOCATION_ACTION__GROUP8:
				getGroup8().clear();
				return;
			case UmlPackage.INVOCATION_ACTION__ARGUMENT:
				getArgument().clear();
				return;
			case UmlPackage.INVOCATION_ACTION__ON_PORT:
				getOnPort().clear();
				return;
			case UmlPackage.INVOCATION_ACTION__ON_PORT1:
				setOnPort1(ON_PORT1_EDEFAULT);
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
			case UmlPackage.INVOCATION_ACTION__GROUP8:
				return group8 != null && !group8.isEmpty();
			case UmlPackage.INVOCATION_ACTION__ARGUMENT:
				return !getArgument().isEmpty();
			case UmlPackage.INVOCATION_ACTION__ON_PORT:
				return !getOnPort().isEmpty();
			case UmlPackage.INVOCATION_ACTION__ON_PORT1:
				return ON_PORT1_EDEFAULT == null ? onPort1 != null : !ON_PORT1_EDEFAULT.equals(onPort1);
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
		result.append(", onPort1: ");
		result.append(onPort1);
		result.append(')');
		return result.toString();
	}

} //InvocationActionImpl
