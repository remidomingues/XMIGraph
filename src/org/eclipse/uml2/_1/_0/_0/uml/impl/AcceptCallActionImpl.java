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

import org.eclipse.uml2._1._0._0.uml.AcceptCallAction;
import org.eclipse.uml2._1._0._0.uml.OutputPin;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accept Call Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.AcceptCallActionImpl#getGroup9 <em>Group9</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.AcceptCallActionImpl#getReturnInformation <em>Return Information</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.AcceptCallActionImpl#getReturnInformation1 <em>Return Information1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AcceptCallActionImpl extends AcceptEventActionImpl implements AcceptCallAction
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
	 * The default value of the '{@link #getReturnInformation1() <em>Return Information1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnInformation1()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_INFORMATION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnInformation1() <em>Return Information1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnInformation1()
	 * @generated
	 * @ordered
	 */
	protected String returnInformation1 = RETURN_INFORMATION1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptCallActionImpl()
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
		return UmlPackage.eINSTANCE.getAcceptCallAction();
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
			group9 = new BasicFeatureMap(this, UmlPackage.ACCEPT_CALL_ACTION__GROUP9);
		}
		return group9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getReturnInformation()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getAcceptCallAction_ReturnInformation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturnInformation1()
	{
		return returnInformation1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnInformation1(String newReturnInformation1)
	{
		String oldReturnInformation1 = returnInformation1;
		returnInformation1 = newReturnInformation1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION1, oldReturnInformation1, returnInformation1));
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
			case UmlPackage.ACCEPT_CALL_ACTION__GROUP9:
				return ((InternalEList<?>)getGroup9()).basicRemove(otherEnd, msgs);
			case UmlPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION:
				return ((InternalEList<?>)getReturnInformation()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.ACCEPT_CALL_ACTION__GROUP9:
				if (coreType) return getGroup9();
				return ((FeatureMap.Internal)getGroup9()).getWrapper();
			case UmlPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION:
				return getReturnInformation();
			case UmlPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION1:
				return getReturnInformation1();
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
			case UmlPackage.ACCEPT_CALL_ACTION__GROUP9:
				((FeatureMap.Internal)getGroup9()).set(newValue);
				return;
			case UmlPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION:
				getReturnInformation().clear();
				getReturnInformation().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case UmlPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION1:
				setReturnInformation1((String)newValue);
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
			case UmlPackage.ACCEPT_CALL_ACTION__GROUP9:
				getGroup9().clear();
				return;
			case UmlPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION:
				getReturnInformation().clear();
				return;
			case UmlPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION1:
				setReturnInformation1(RETURN_INFORMATION1_EDEFAULT);
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
			case UmlPackage.ACCEPT_CALL_ACTION__GROUP9:
				return group9 != null && !group9.isEmpty();
			case UmlPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION:
				return !getReturnInformation().isEmpty();
			case UmlPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION1:
				return RETURN_INFORMATION1_EDEFAULT == null ? returnInformation1 != null : !RETURN_INFORMATION1_EDEFAULT.equals(returnInformation1);
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
		result.append(", returnInformation1: ");
		result.append(returnInformation1);
		result.append(')');
		return result.toString();
	}

} //AcceptCallActionImpl
