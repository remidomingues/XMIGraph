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

import org.eclipse.uml2._1._0._0.uml.CallTrigger;
import org.eclipse.uml2._1._0._0.uml.InputPin;
import org.eclipse.uml2._1._0._0.uml.ReplyAction;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reply Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReplyActionImpl#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReplyActionImpl#getReplyToCall <em>Reply To Call</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReplyActionImpl#getReplyValue <em>Reply Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReplyActionImpl#getReturnInformation <em>Return Information</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReplyActionImpl#getReplyToCall1 <em>Reply To Call1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReplyActionImpl#getReplyValue1 <em>Reply Value1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReplyActionImpl#getReturnInformation1 <em>Return Information1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReplyActionImpl extends ActionImpl implements ReplyAction
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
	 * The default value of the '{@link #getReplyToCall1() <em>Reply To Call1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyToCall1()
	 * @generated
	 * @ordered
	 */
	protected static final String REPLY_TO_CALL1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplyToCall1() <em>Reply To Call1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyToCall1()
	 * @generated
	 * @ordered
	 */
	protected String replyToCall1 = REPLY_TO_CALL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplyValue1() <em>Reply Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyValue1()
	 * @generated
	 * @ordered
	 */
	protected static final String REPLY_VALUE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplyValue1() <em>Reply Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyValue1()
	 * @generated
	 * @ordered
	 */
	protected String replyValue1 = REPLY_VALUE1_EDEFAULT;

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
	protected ReplyActionImpl()
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
		return UmlPackage.eINSTANCE.getReplyAction();
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
			group8 = new BasicFeatureMap(this, UmlPackage.REPLY_ACTION__GROUP8);
		}
		return group8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallTrigger> getReplyToCall()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getReplyAction_ReplyToCall());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getReplyValue()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getReplyAction_ReplyValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getReturnInformation()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getReplyAction_ReturnInformation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReplyToCall1()
	{
		return replyToCall1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplyToCall1(String newReplyToCall1)
	{
		String oldReplyToCall1 = replyToCall1;
		replyToCall1 = newReplyToCall1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.REPLY_ACTION__REPLY_TO_CALL1, oldReplyToCall1, replyToCall1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReplyValue1()
	{
		return replyValue1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplyValue1(String newReplyValue1)
	{
		String oldReplyValue1 = replyValue1;
		replyValue1 = newReplyValue1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.REPLY_ACTION__REPLY_VALUE1, oldReplyValue1, replyValue1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.REPLY_ACTION__RETURN_INFORMATION1, oldReturnInformation1, returnInformation1));
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
			case UmlPackage.REPLY_ACTION__GROUP8:
				return ((InternalEList<?>)getGroup8()).basicRemove(otherEnd, msgs);
			case UmlPackage.REPLY_ACTION__REPLY_TO_CALL:
				return ((InternalEList<?>)getReplyToCall()).basicRemove(otherEnd, msgs);
			case UmlPackage.REPLY_ACTION__REPLY_VALUE:
				return ((InternalEList<?>)getReplyValue()).basicRemove(otherEnd, msgs);
			case UmlPackage.REPLY_ACTION__RETURN_INFORMATION:
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
			case UmlPackage.REPLY_ACTION__GROUP8:
				if (coreType) return getGroup8();
				return ((FeatureMap.Internal)getGroup8()).getWrapper();
			case UmlPackage.REPLY_ACTION__REPLY_TO_CALL:
				return getReplyToCall();
			case UmlPackage.REPLY_ACTION__REPLY_VALUE:
				return getReplyValue();
			case UmlPackage.REPLY_ACTION__RETURN_INFORMATION:
				return getReturnInformation();
			case UmlPackage.REPLY_ACTION__REPLY_TO_CALL1:
				return getReplyToCall1();
			case UmlPackage.REPLY_ACTION__REPLY_VALUE1:
				return getReplyValue1();
			case UmlPackage.REPLY_ACTION__RETURN_INFORMATION1:
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
			case UmlPackage.REPLY_ACTION__GROUP8:
				((FeatureMap.Internal)getGroup8()).set(newValue);
				return;
			case UmlPackage.REPLY_ACTION__REPLY_TO_CALL:
				getReplyToCall().clear();
				getReplyToCall().addAll((Collection<? extends CallTrigger>)newValue);
				return;
			case UmlPackage.REPLY_ACTION__REPLY_VALUE:
				getReplyValue().clear();
				getReplyValue().addAll((Collection<? extends InputPin>)newValue);
				return;
			case UmlPackage.REPLY_ACTION__RETURN_INFORMATION:
				getReturnInformation().clear();
				getReturnInformation().addAll((Collection<? extends InputPin>)newValue);
				return;
			case UmlPackage.REPLY_ACTION__REPLY_TO_CALL1:
				setReplyToCall1((String)newValue);
				return;
			case UmlPackage.REPLY_ACTION__REPLY_VALUE1:
				setReplyValue1((String)newValue);
				return;
			case UmlPackage.REPLY_ACTION__RETURN_INFORMATION1:
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
			case UmlPackage.REPLY_ACTION__GROUP8:
				getGroup8().clear();
				return;
			case UmlPackage.REPLY_ACTION__REPLY_TO_CALL:
				getReplyToCall().clear();
				return;
			case UmlPackage.REPLY_ACTION__REPLY_VALUE:
				getReplyValue().clear();
				return;
			case UmlPackage.REPLY_ACTION__RETURN_INFORMATION:
				getReturnInformation().clear();
				return;
			case UmlPackage.REPLY_ACTION__REPLY_TO_CALL1:
				setReplyToCall1(REPLY_TO_CALL1_EDEFAULT);
				return;
			case UmlPackage.REPLY_ACTION__REPLY_VALUE1:
				setReplyValue1(REPLY_VALUE1_EDEFAULT);
				return;
			case UmlPackage.REPLY_ACTION__RETURN_INFORMATION1:
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
			case UmlPackage.REPLY_ACTION__GROUP8:
				return group8 != null && !group8.isEmpty();
			case UmlPackage.REPLY_ACTION__REPLY_TO_CALL:
				return !getReplyToCall().isEmpty();
			case UmlPackage.REPLY_ACTION__REPLY_VALUE:
				return !getReplyValue().isEmpty();
			case UmlPackage.REPLY_ACTION__RETURN_INFORMATION:
				return !getReturnInformation().isEmpty();
			case UmlPackage.REPLY_ACTION__REPLY_TO_CALL1:
				return REPLY_TO_CALL1_EDEFAULT == null ? replyToCall1 != null : !REPLY_TO_CALL1_EDEFAULT.equals(replyToCall1);
			case UmlPackage.REPLY_ACTION__REPLY_VALUE1:
				return REPLY_VALUE1_EDEFAULT == null ? replyValue1 != null : !REPLY_VALUE1_EDEFAULT.equals(replyValue1);
			case UmlPackage.REPLY_ACTION__RETURN_INFORMATION1:
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
		result.append(" (group8: ");
		result.append(group8);
		result.append(", replyToCall1: ");
		result.append(replyToCall1);
		result.append(", replyValue1: ");
		result.append(replyValue1);
		result.append(", returnInformation1: ");
		result.append(returnInformation1);
		result.append(')');
		return result.toString();
	}

} //ReplyActionImpl
