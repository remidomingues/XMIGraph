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

import org.eclipse.uml2._1._0._0.uml.Message;
import org.eclipse.uml2._1._0._0.uml.MessageEnd;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.MessageEndImpl#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.MessageEndImpl#getReceiveMessage <em>Receive Message</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.MessageEndImpl#getSendMessage <em>Send Message</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.MessageEndImpl#getReceiveMessage1 <em>Receive Message1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.MessageEndImpl#getSendMessage1 <em>Send Message1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageEndImpl extends NamedElementImpl implements MessageEnd
{
	/**
	 * The cached value of the '{@link #getGroup5() <em>Group5</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup5()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group5;

	/**
	 * The default value of the '{@link #getReceiveMessage1() <em>Receive Message1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveMessage1()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIVE_MESSAGE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiveMessage1() <em>Receive Message1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveMessage1()
	 * @generated
	 * @ordered
	 */
	protected String receiveMessage1 = RECEIVE_MESSAGE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getSendMessage1() <em>Send Message1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendMessage1()
	 * @generated
	 * @ordered
	 */
	protected static final String SEND_MESSAGE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSendMessage1() <em>Send Message1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendMessage1()
	 * @generated
	 * @ordered
	 */
	protected String sendMessage1 = SEND_MESSAGE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageEndImpl()
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
		return UmlPackage.eINSTANCE.getMessageEnd();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup5()
	{
		if (group5 == null)
		{
			group5 = new BasicFeatureMap(this, UmlPackage.MESSAGE_END__GROUP5);
		}
		return group5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getReceiveMessage()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getMessageEnd_ReceiveMessage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getSendMessage()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getMessageEnd_SendMessage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReceiveMessage1()
	{
		return receiveMessage1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveMessage1(String newReceiveMessage1)
	{
		String oldReceiveMessage1 = receiveMessage1;
		receiveMessage1 = newReceiveMessage1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.MESSAGE_END__RECEIVE_MESSAGE1, oldReceiveMessage1, receiveMessage1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSendMessage1()
	{
		return sendMessage1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendMessage1(String newSendMessage1)
	{
		String oldSendMessage1 = sendMessage1;
		sendMessage1 = newSendMessage1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.MESSAGE_END__SEND_MESSAGE1, oldSendMessage1, sendMessage1));
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
			case UmlPackage.MESSAGE_END__GROUP5:
				return ((InternalEList<?>)getGroup5()).basicRemove(otherEnd, msgs);
			case UmlPackage.MESSAGE_END__RECEIVE_MESSAGE:
				return ((InternalEList<?>)getReceiveMessage()).basicRemove(otherEnd, msgs);
			case UmlPackage.MESSAGE_END__SEND_MESSAGE:
				return ((InternalEList<?>)getSendMessage()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.MESSAGE_END__GROUP5:
				if (coreType) return getGroup5();
				return ((FeatureMap.Internal)getGroup5()).getWrapper();
			case UmlPackage.MESSAGE_END__RECEIVE_MESSAGE:
				return getReceiveMessage();
			case UmlPackage.MESSAGE_END__SEND_MESSAGE:
				return getSendMessage();
			case UmlPackage.MESSAGE_END__RECEIVE_MESSAGE1:
				return getReceiveMessage1();
			case UmlPackage.MESSAGE_END__SEND_MESSAGE1:
				return getSendMessage1();
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
			case UmlPackage.MESSAGE_END__GROUP5:
				((FeatureMap.Internal)getGroup5()).set(newValue);
				return;
			case UmlPackage.MESSAGE_END__RECEIVE_MESSAGE:
				getReceiveMessage().clear();
				getReceiveMessage().addAll((Collection<? extends Message>)newValue);
				return;
			case UmlPackage.MESSAGE_END__SEND_MESSAGE:
				getSendMessage().clear();
				getSendMessage().addAll((Collection<? extends Message>)newValue);
				return;
			case UmlPackage.MESSAGE_END__RECEIVE_MESSAGE1:
				setReceiveMessage1((String)newValue);
				return;
			case UmlPackage.MESSAGE_END__SEND_MESSAGE1:
				setSendMessage1((String)newValue);
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
			case UmlPackage.MESSAGE_END__GROUP5:
				getGroup5().clear();
				return;
			case UmlPackage.MESSAGE_END__RECEIVE_MESSAGE:
				getReceiveMessage().clear();
				return;
			case UmlPackage.MESSAGE_END__SEND_MESSAGE:
				getSendMessage().clear();
				return;
			case UmlPackage.MESSAGE_END__RECEIVE_MESSAGE1:
				setReceiveMessage1(RECEIVE_MESSAGE1_EDEFAULT);
				return;
			case UmlPackage.MESSAGE_END__SEND_MESSAGE1:
				setSendMessage1(SEND_MESSAGE1_EDEFAULT);
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
			case UmlPackage.MESSAGE_END__GROUP5:
				return group5 != null && !group5.isEmpty();
			case UmlPackage.MESSAGE_END__RECEIVE_MESSAGE:
				return !getReceiveMessage().isEmpty();
			case UmlPackage.MESSAGE_END__SEND_MESSAGE:
				return !getSendMessage().isEmpty();
			case UmlPackage.MESSAGE_END__RECEIVE_MESSAGE1:
				return RECEIVE_MESSAGE1_EDEFAULT == null ? receiveMessage1 != null : !RECEIVE_MESSAGE1_EDEFAULT.equals(receiveMessage1);
			case UmlPackage.MESSAGE_END__SEND_MESSAGE1:
				return SEND_MESSAGE1_EDEFAULT == null ? sendMessage1 != null : !SEND_MESSAGE1_EDEFAULT.equals(sendMessage1);
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
		result.append(" (group5: ");
		result.append(group5);
		result.append(", receiveMessage1: ");
		result.append(receiveMessage1);
		result.append(", sendMessage1: ");
		result.append(sendMessage1);
		result.append(')');
		return result.toString();
	}

} //MessageEndImpl
