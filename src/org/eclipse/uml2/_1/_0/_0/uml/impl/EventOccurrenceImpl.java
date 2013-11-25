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

import org.eclipse.uml2._1._0._0.uml.EventOccurrence;
import org.eclipse.uml2._1._0._0.uml.ExecutionOccurrence;
import org.eclipse.uml2._1._0._0.uml.GeneralOrdering;
import org.eclipse.uml2._1._0._0.uml.Message;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.EventOccurrenceImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.EventOccurrenceImpl#getReceiveMessage <em>Receive Message</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.EventOccurrenceImpl#getSendMessage <em>Send Message</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.EventOccurrenceImpl#getStartExec <em>Start Exec</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.EventOccurrenceImpl#getFinishExec <em>Finish Exec</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.EventOccurrenceImpl#getToAfter <em>To After</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.EventOccurrenceImpl#getToBefore <em>To Before</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.EventOccurrenceImpl#getFinishExec1 <em>Finish Exec1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.EventOccurrenceImpl#getReceiveMessage1 <em>Receive Message1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.EventOccurrenceImpl#getSendMessage1 <em>Send Message1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.EventOccurrenceImpl#getStartExec1 <em>Start Exec1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.EventOccurrenceImpl#getToAfter1 <em>To After1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.EventOccurrenceImpl#getToBefore1 <em>To Before1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventOccurrenceImpl extends InteractionFragmentImpl implements EventOccurrence
{
	/**
	 * The cached value of the '{@link #getGroup6() <em>Group6</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup6()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group6;

	/**
	 * The default value of the '{@link #getFinishExec1() <em>Finish Exec1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishExec1()
	 * @generated
	 * @ordered
	 */
	protected static final String FINISH_EXEC1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinishExec1() <em>Finish Exec1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishExec1()
	 * @generated
	 * @ordered
	 */
	protected String finishExec1 = FINISH_EXEC1_EDEFAULT;

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
	 * The default value of the '{@link #getStartExec1() <em>Start Exec1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartExec1()
	 * @generated
	 * @ordered
	 */
	protected static final String START_EXEC1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartExec1() <em>Start Exec1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartExec1()
	 * @generated
	 * @ordered
	 */
	protected String startExec1 = START_EXEC1_EDEFAULT;

	/**
	 * The default value of the '{@link #getToAfter1() <em>To After1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAfter1()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_AFTER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToAfter1() <em>To After1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAfter1()
	 * @generated
	 * @ordered
	 */
	protected String toAfter1 = TO_AFTER1_EDEFAULT;

	/**
	 * The default value of the '{@link #getToBefore1() <em>To Before1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBefore1()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_BEFORE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToBefore1() <em>To Before1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBefore1()
	 * @generated
	 * @ordered
	 */
	protected String toBefore1 = TO_BEFORE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventOccurrenceImpl()
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
		return UmlPackage.eINSTANCE.getEventOccurrence();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup6()
	{
		if (group6 == null)
		{
			group6 = new BasicFeatureMap(this, UmlPackage.EVENT_OCCURRENCE__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getReceiveMessage()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getEventOccurrence_ReceiveMessage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getSendMessage()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getEventOccurrence_SendMessage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionOccurrence> getStartExec()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getEventOccurrence_StartExec());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionOccurrence> getFinishExec()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getEventOccurrence_FinishExec());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralOrdering> getToAfter()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getEventOccurrence_ToAfter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralOrdering> getToBefore()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getEventOccurrence_ToBefore());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFinishExec1()
	{
		return finishExec1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinishExec1(String newFinishExec1)
	{
		String oldFinishExec1 = finishExec1;
		finishExec1 = newFinishExec1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EVENT_OCCURRENCE__FINISH_EXEC1, oldFinishExec1, finishExec1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EVENT_OCCURRENCE__RECEIVE_MESSAGE1, oldReceiveMessage1, receiveMessage1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EVENT_OCCURRENCE__SEND_MESSAGE1, oldSendMessage1, sendMessage1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartExec1()
	{
		return startExec1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartExec1(String newStartExec1)
	{
		String oldStartExec1 = startExec1;
		startExec1 = newStartExec1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EVENT_OCCURRENCE__START_EXEC1, oldStartExec1, startExec1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToAfter1()
	{
		return toAfter1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToAfter1(String newToAfter1)
	{
		String oldToAfter1 = toAfter1;
		toAfter1 = newToAfter1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EVENT_OCCURRENCE__TO_AFTER1, oldToAfter1, toAfter1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToBefore1()
	{
		return toBefore1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToBefore1(String newToBefore1)
	{
		String oldToBefore1 = toBefore1;
		toBefore1 = newToBefore1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EVENT_OCCURRENCE__TO_BEFORE1, oldToBefore1, toBefore1));
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
			case UmlPackage.EVENT_OCCURRENCE__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.EVENT_OCCURRENCE__RECEIVE_MESSAGE:
				return ((InternalEList<?>)getReceiveMessage()).basicRemove(otherEnd, msgs);
			case UmlPackage.EVENT_OCCURRENCE__SEND_MESSAGE:
				return ((InternalEList<?>)getSendMessage()).basicRemove(otherEnd, msgs);
			case UmlPackage.EVENT_OCCURRENCE__START_EXEC:
				return ((InternalEList<?>)getStartExec()).basicRemove(otherEnd, msgs);
			case UmlPackage.EVENT_OCCURRENCE__FINISH_EXEC:
				return ((InternalEList<?>)getFinishExec()).basicRemove(otherEnd, msgs);
			case UmlPackage.EVENT_OCCURRENCE__TO_AFTER:
				return ((InternalEList<?>)getToAfter()).basicRemove(otherEnd, msgs);
			case UmlPackage.EVENT_OCCURRENCE__TO_BEFORE:
				return ((InternalEList<?>)getToBefore()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.EVENT_OCCURRENCE__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.EVENT_OCCURRENCE__RECEIVE_MESSAGE:
				return getReceiveMessage();
			case UmlPackage.EVENT_OCCURRENCE__SEND_MESSAGE:
				return getSendMessage();
			case UmlPackage.EVENT_OCCURRENCE__START_EXEC:
				return getStartExec();
			case UmlPackage.EVENT_OCCURRENCE__FINISH_EXEC:
				return getFinishExec();
			case UmlPackage.EVENT_OCCURRENCE__TO_AFTER:
				return getToAfter();
			case UmlPackage.EVENT_OCCURRENCE__TO_BEFORE:
				return getToBefore();
			case UmlPackage.EVENT_OCCURRENCE__FINISH_EXEC1:
				return getFinishExec1();
			case UmlPackage.EVENT_OCCURRENCE__RECEIVE_MESSAGE1:
				return getReceiveMessage1();
			case UmlPackage.EVENT_OCCURRENCE__SEND_MESSAGE1:
				return getSendMessage1();
			case UmlPackage.EVENT_OCCURRENCE__START_EXEC1:
				return getStartExec1();
			case UmlPackage.EVENT_OCCURRENCE__TO_AFTER1:
				return getToAfter1();
			case UmlPackage.EVENT_OCCURRENCE__TO_BEFORE1:
				return getToBefore1();
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
			case UmlPackage.EVENT_OCCURRENCE__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.EVENT_OCCURRENCE__RECEIVE_MESSAGE:
				getReceiveMessage().clear();
				getReceiveMessage().addAll((Collection<? extends Message>)newValue);
				return;
			case UmlPackage.EVENT_OCCURRENCE__SEND_MESSAGE:
				getSendMessage().clear();
				getSendMessage().addAll((Collection<? extends Message>)newValue);
				return;
			case UmlPackage.EVENT_OCCURRENCE__START_EXEC:
				getStartExec().clear();
				getStartExec().addAll((Collection<? extends ExecutionOccurrence>)newValue);
				return;
			case UmlPackage.EVENT_OCCURRENCE__FINISH_EXEC:
				getFinishExec().clear();
				getFinishExec().addAll((Collection<? extends ExecutionOccurrence>)newValue);
				return;
			case UmlPackage.EVENT_OCCURRENCE__TO_AFTER:
				getToAfter().clear();
				getToAfter().addAll((Collection<? extends GeneralOrdering>)newValue);
				return;
			case UmlPackage.EVENT_OCCURRENCE__TO_BEFORE:
				getToBefore().clear();
				getToBefore().addAll((Collection<? extends GeneralOrdering>)newValue);
				return;
			case UmlPackage.EVENT_OCCURRENCE__FINISH_EXEC1:
				setFinishExec1((String)newValue);
				return;
			case UmlPackage.EVENT_OCCURRENCE__RECEIVE_MESSAGE1:
				setReceiveMessage1((String)newValue);
				return;
			case UmlPackage.EVENT_OCCURRENCE__SEND_MESSAGE1:
				setSendMessage1((String)newValue);
				return;
			case UmlPackage.EVENT_OCCURRENCE__START_EXEC1:
				setStartExec1((String)newValue);
				return;
			case UmlPackage.EVENT_OCCURRENCE__TO_AFTER1:
				setToAfter1((String)newValue);
				return;
			case UmlPackage.EVENT_OCCURRENCE__TO_BEFORE1:
				setToBefore1((String)newValue);
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
			case UmlPackage.EVENT_OCCURRENCE__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.EVENT_OCCURRENCE__RECEIVE_MESSAGE:
				getReceiveMessage().clear();
				return;
			case UmlPackage.EVENT_OCCURRENCE__SEND_MESSAGE:
				getSendMessage().clear();
				return;
			case UmlPackage.EVENT_OCCURRENCE__START_EXEC:
				getStartExec().clear();
				return;
			case UmlPackage.EVENT_OCCURRENCE__FINISH_EXEC:
				getFinishExec().clear();
				return;
			case UmlPackage.EVENT_OCCURRENCE__TO_AFTER:
				getToAfter().clear();
				return;
			case UmlPackage.EVENT_OCCURRENCE__TO_BEFORE:
				getToBefore().clear();
				return;
			case UmlPackage.EVENT_OCCURRENCE__FINISH_EXEC1:
				setFinishExec1(FINISH_EXEC1_EDEFAULT);
				return;
			case UmlPackage.EVENT_OCCURRENCE__RECEIVE_MESSAGE1:
				setReceiveMessage1(RECEIVE_MESSAGE1_EDEFAULT);
				return;
			case UmlPackage.EVENT_OCCURRENCE__SEND_MESSAGE1:
				setSendMessage1(SEND_MESSAGE1_EDEFAULT);
				return;
			case UmlPackage.EVENT_OCCURRENCE__START_EXEC1:
				setStartExec1(START_EXEC1_EDEFAULT);
				return;
			case UmlPackage.EVENT_OCCURRENCE__TO_AFTER1:
				setToAfter1(TO_AFTER1_EDEFAULT);
				return;
			case UmlPackage.EVENT_OCCURRENCE__TO_BEFORE1:
				setToBefore1(TO_BEFORE1_EDEFAULT);
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
			case UmlPackage.EVENT_OCCURRENCE__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.EVENT_OCCURRENCE__RECEIVE_MESSAGE:
				return !getReceiveMessage().isEmpty();
			case UmlPackage.EVENT_OCCURRENCE__SEND_MESSAGE:
				return !getSendMessage().isEmpty();
			case UmlPackage.EVENT_OCCURRENCE__START_EXEC:
				return !getStartExec().isEmpty();
			case UmlPackage.EVENT_OCCURRENCE__FINISH_EXEC:
				return !getFinishExec().isEmpty();
			case UmlPackage.EVENT_OCCURRENCE__TO_AFTER:
				return !getToAfter().isEmpty();
			case UmlPackage.EVENT_OCCURRENCE__TO_BEFORE:
				return !getToBefore().isEmpty();
			case UmlPackage.EVENT_OCCURRENCE__FINISH_EXEC1:
				return FINISH_EXEC1_EDEFAULT == null ? finishExec1 != null : !FINISH_EXEC1_EDEFAULT.equals(finishExec1);
			case UmlPackage.EVENT_OCCURRENCE__RECEIVE_MESSAGE1:
				return RECEIVE_MESSAGE1_EDEFAULT == null ? receiveMessage1 != null : !RECEIVE_MESSAGE1_EDEFAULT.equals(receiveMessage1);
			case UmlPackage.EVENT_OCCURRENCE__SEND_MESSAGE1:
				return SEND_MESSAGE1_EDEFAULT == null ? sendMessage1 != null : !SEND_MESSAGE1_EDEFAULT.equals(sendMessage1);
			case UmlPackage.EVENT_OCCURRENCE__START_EXEC1:
				return START_EXEC1_EDEFAULT == null ? startExec1 != null : !START_EXEC1_EDEFAULT.equals(startExec1);
			case UmlPackage.EVENT_OCCURRENCE__TO_AFTER1:
				return TO_AFTER1_EDEFAULT == null ? toAfter1 != null : !TO_AFTER1_EDEFAULT.equals(toAfter1);
			case UmlPackage.EVENT_OCCURRENCE__TO_BEFORE1:
				return TO_BEFORE1_EDEFAULT == null ? toBefore1 != null : !TO_BEFORE1_EDEFAULT.equals(toBefore1);
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
		result.append(" (group6: ");
		result.append(group6);
		result.append(", finishExec1: ");
		result.append(finishExec1);
		result.append(", receiveMessage1: ");
		result.append(receiveMessage1);
		result.append(", sendMessage1: ");
		result.append(sendMessage1);
		result.append(", startExec1: ");
		result.append(startExec1);
		result.append(", toAfter1: ");
		result.append(toAfter1);
		result.append(", toBefore1: ");
		result.append(toBefore1);
		result.append(')');
		return result.toString();
	}

} //EventOccurrenceImpl
