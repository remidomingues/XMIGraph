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

import org.eclipse.uml2._1._0._0.uml.Connector;
import org.eclipse.uml2._1._0._0.uml.Message;
import org.eclipse.uml2._1._0._0.uml.MessageEnd;
import org.eclipse.uml2._1._0._0.uml.MessageSort;
import org.eclipse.uml2._1._0._0.uml.NamedElement;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.MessageImpl#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.MessageImpl#getReceiveEvent <em>Receive Event</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.MessageImpl#getSendEvent <em>Send Event</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.MessageImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.MessageImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.MessageImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.MessageImpl#getConnector1 <em>Connector1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.MessageImpl#getMessageSort <em>Message Sort</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.MessageImpl#getReceiveEvent1 <em>Receive Event1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.MessageImpl#getSendEvent1 <em>Send Event1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.MessageImpl#getSignature1 <em>Signature1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageImpl extends NamedElementImpl implements Message
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
	 * The default value of the '{@link #getConnector1() <em>Connector1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector1()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTOR1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnector1() <em>Connector1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector1()
	 * @generated
	 * @ordered
	 */
	protected String connector1 = CONNECTOR1_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageSort() <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSort()
	 * @generated
	 * @ordered
	 */
	protected static final MessageSort MESSAGE_SORT_EDEFAULT = MessageSort.SYNCH_CALL;

	/**
	 * The cached value of the '{@link #getMessageSort() <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSort()
	 * @generated
	 * @ordered
	 */
	protected MessageSort messageSort = MESSAGE_SORT_EDEFAULT;

	/**
	 * This is true if the Message Sort attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean messageSortESet;

	/**
	 * The default value of the '{@link #getReceiveEvent1() <em>Receive Event1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveEvent1()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIVE_EVENT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiveEvent1() <em>Receive Event1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveEvent1()
	 * @generated
	 * @ordered
	 */
	protected String receiveEvent1 = RECEIVE_EVENT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getSendEvent1() <em>Send Event1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendEvent1()
	 * @generated
	 * @ordered
	 */
	protected static final String SEND_EVENT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSendEvent1() <em>Send Event1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendEvent1()
	 * @generated
	 * @ordered
	 */
	protected String sendEvent1 = SEND_EVENT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignature1() <em>Signature1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature1()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignature1() <em>Signature1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature1()
	 * @generated
	 * @ordered
	 */
	protected String signature1 = SIGNATURE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl()
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
		return UmlPackage.eINSTANCE.getMessage();
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
			group5 = new BasicFeatureMap(this, UmlPackage.MESSAGE__GROUP5);
		}
		return group5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageEnd> getReceiveEvent()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getMessage_ReceiveEvent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageEnd> getSendEvent()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getMessage_SendEvent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnector()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getMessage_Connector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getSignature()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getMessage_Signature());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getArgument()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getMessage_Argument());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnector1()
	{
		return connector1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector1(String newConnector1)
	{
		String oldConnector1 = connector1;
		connector1 = newConnector1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.MESSAGE__CONNECTOR1, oldConnector1, connector1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSort getMessageSort()
	{
		return messageSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageSort(MessageSort newMessageSort)
	{
		MessageSort oldMessageSort = messageSort;
		messageSort = newMessageSort == null ? MESSAGE_SORT_EDEFAULT : newMessageSort;
		boolean oldMessageSortESet = messageSortESet;
		messageSortESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.MESSAGE__MESSAGE_SORT, oldMessageSort, messageSort, !oldMessageSortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMessageSort()
	{
		MessageSort oldMessageSort = messageSort;
		boolean oldMessageSortESet = messageSortESet;
		messageSort = MESSAGE_SORT_EDEFAULT;
		messageSortESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.MESSAGE__MESSAGE_SORT, oldMessageSort, MESSAGE_SORT_EDEFAULT, oldMessageSortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMessageSort()
	{
		return messageSortESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReceiveEvent1()
	{
		return receiveEvent1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveEvent1(String newReceiveEvent1)
	{
		String oldReceiveEvent1 = receiveEvent1;
		receiveEvent1 = newReceiveEvent1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.MESSAGE__RECEIVE_EVENT1, oldReceiveEvent1, receiveEvent1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSendEvent1()
	{
		return sendEvent1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendEvent1(String newSendEvent1)
	{
		String oldSendEvent1 = sendEvent1;
		sendEvent1 = newSendEvent1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.MESSAGE__SEND_EVENT1, oldSendEvent1, sendEvent1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignature1()
	{
		return signature1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature1(String newSignature1)
	{
		String oldSignature1 = signature1;
		signature1 = newSignature1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.MESSAGE__SIGNATURE1, oldSignature1, signature1));
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
			case UmlPackage.MESSAGE__GROUP5:
				return ((InternalEList<?>)getGroup5()).basicRemove(otherEnd, msgs);
			case UmlPackage.MESSAGE__RECEIVE_EVENT:
				return ((InternalEList<?>)getReceiveEvent()).basicRemove(otherEnd, msgs);
			case UmlPackage.MESSAGE__SEND_EVENT:
				return ((InternalEList<?>)getSendEvent()).basicRemove(otherEnd, msgs);
			case UmlPackage.MESSAGE__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case UmlPackage.MESSAGE__SIGNATURE:
				return ((InternalEList<?>)getSignature()).basicRemove(otherEnd, msgs);
			case UmlPackage.MESSAGE__ARGUMENT:
				return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.MESSAGE__GROUP5:
				if (coreType) return getGroup5();
				return ((FeatureMap.Internal)getGroup5()).getWrapper();
			case UmlPackage.MESSAGE__RECEIVE_EVENT:
				return getReceiveEvent();
			case UmlPackage.MESSAGE__SEND_EVENT:
				return getSendEvent();
			case UmlPackage.MESSAGE__CONNECTOR:
				return getConnector();
			case UmlPackage.MESSAGE__SIGNATURE:
				return getSignature();
			case UmlPackage.MESSAGE__ARGUMENT:
				return getArgument();
			case UmlPackage.MESSAGE__CONNECTOR1:
				return getConnector1();
			case UmlPackage.MESSAGE__MESSAGE_SORT:
				return getMessageSort();
			case UmlPackage.MESSAGE__RECEIVE_EVENT1:
				return getReceiveEvent1();
			case UmlPackage.MESSAGE__SEND_EVENT1:
				return getSendEvent1();
			case UmlPackage.MESSAGE__SIGNATURE1:
				return getSignature1();
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
			case UmlPackage.MESSAGE__GROUP5:
				((FeatureMap.Internal)getGroup5()).set(newValue);
				return;
			case UmlPackage.MESSAGE__RECEIVE_EVENT:
				getReceiveEvent().clear();
				getReceiveEvent().addAll((Collection<? extends MessageEnd>)newValue);
				return;
			case UmlPackage.MESSAGE__SEND_EVENT:
				getSendEvent().clear();
				getSendEvent().addAll((Collection<? extends MessageEnd>)newValue);
				return;
			case UmlPackage.MESSAGE__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends Connector>)newValue);
				return;
			case UmlPackage.MESSAGE__SIGNATURE:
				getSignature().clear();
				getSignature().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case UmlPackage.MESSAGE__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UmlPackage.MESSAGE__CONNECTOR1:
				setConnector1((String)newValue);
				return;
			case UmlPackage.MESSAGE__MESSAGE_SORT:
				setMessageSort((MessageSort)newValue);
				return;
			case UmlPackage.MESSAGE__RECEIVE_EVENT1:
				setReceiveEvent1((String)newValue);
				return;
			case UmlPackage.MESSAGE__SEND_EVENT1:
				setSendEvent1((String)newValue);
				return;
			case UmlPackage.MESSAGE__SIGNATURE1:
				setSignature1((String)newValue);
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
			case UmlPackage.MESSAGE__GROUP5:
				getGroup5().clear();
				return;
			case UmlPackage.MESSAGE__RECEIVE_EVENT:
				getReceiveEvent().clear();
				return;
			case UmlPackage.MESSAGE__SEND_EVENT:
				getSendEvent().clear();
				return;
			case UmlPackage.MESSAGE__CONNECTOR:
				getConnector().clear();
				return;
			case UmlPackage.MESSAGE__SIGNATURE:
				getSignature().clear();
				return;
			case UmlPackage.MESSAGE__ARGUMENT:
				getArgument().clear();
				return;
			case UmlPackage.MESSAGE__CONNECTOR1:
				setConnector1(CONNECTOR1_EDEFAULT);
				return;
			case UmlPackage.MESSAGE__MESSAGE_SORT:
				unsetMessageSort();
				return;
			case UmlPackage.MESSAGE__RECEIVE_EVENT1:
				setReceiveEvent1(RECEIVE_EVENT1_EDEFAULT);
				return;
			case UmlPackage.MESSAGE__SEND_EVENT1:
				setSendEvent1(SEND_EVENT1_EDEFAULT);
				return;
			case UmlPackage.MESSAGE__SIGNATURE1:
				setSignature1(SIGNATURE1_EDEFAULT);
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
			case UmlPackage.MESSAGE__GROUP5:
				return group5 != null && !group5.isEmpty();
			case UmlPackage.MESSAGE__RECEIVE_EVENT:
				return !getReceiveEvent().isEmpty();
			case UmlPackage.MESSAGE__SEND_EVENT:
				return !getSendEvent().isEmpty();
			case UmlPackage.MESSAGE__CONNECTOR:
				return !getConnector().isEmpty();
			case UmlPackage.MESSAGE__SIGNATURE:
				return !getSignature().isEmpty();
			case UmlPackage.MESSAGE__ARGUMENT:
				return !getArgument().isEmpty();
			case UmlPackage.MESSAGE__CONNECTOR1:
				return CONNECTOR1_EDEFAULT == null ? connector1 != null : !CONNECTOR1_EDEFAULT.equals(connector1);
			case UmlPackage.MESSAGE__MESSAGE_SORT:
				return isSetMessageSort();
			case UmlPackage.MESSAGE__RECEIVE_EVENT1:
				return RECEIVE_EVENT1_EDEFAULT == null ? receiveEvent1 != null : !RECEIVE_EVENT1_EDEFAULT.equals(receiveEvent1);
			case UmlPackage.MESSAGE__SEND_EVENT1:
				return SEND_EVENT1_EDEFAULT == null ? sendEvent1 != null : !SEND_EVENT1_EDEFAULT.equals(sendEvent1);
			case UmlPackage.MESSAGE__SIGNATURE1:
				return SIGNATURE1_EDEFAULT == null ? signature1 != null : !SIGNATURE1_EDEFAULT.equals(signature1);
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
		result.append(", connector1: ");
		result.append(connector1);
		result.append(", messageSort: ");
		if (messageSortESet) result.append(messageSort); else result.append("<unset>");
		result.append(", receiveEvent1: ");
		result.append(receiveEvent1);
		result.append(", sendEvent1: ");
		result.append(sendEvent1);
		result.append(", signature1: ");
		result.append(signature1);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
