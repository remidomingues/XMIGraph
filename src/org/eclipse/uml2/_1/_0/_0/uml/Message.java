/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.uml2._1._0._0.uml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A Message defines a particular communication between Lifelines of an Interaction. A Message is a NamedElement that defines one specific kind of communication in an Interaction. A communication can be e.g. raising a signal, invoking an Operation, creating or destroying an Instance. The Message specifies not only the kind of communication given by the dispatching ExecutionOccurrence, but also the sender and the receiver. A Message associates normally two EventOccurrences - one sending EventOccurrence and one receiving EventOccurrence.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Message#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Message#getReceiveEvent <em>Receive Event</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Message#getSendEvent <em>Send Event</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Message#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Message#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Message#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Message#getConnector1 <em>Connector1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Message#getMessageSort <em>Message Sort</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Message#getReceiveEvent1 <em>Receive Event1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Message#getSendEvent1 <em>Send Event1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Message#getSignature1 <em>Signature1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getMessage()
 * @model extendedMetaData="name='Message' kind='elementOnly'"
 * @generated
 */
public interface Message extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Group5</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group5</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group5</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getMessage_Group5()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:22'"
	 * @generated
	 */
	FeatureMap getGroup5();

	/**
	 * Returns the value of the '<em><b>Receive Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.MessageEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the Receiving of the Message
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receive Event</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getMessage_ReceiveEvent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='receiveEvent' group='#group:22'"
	 * @generated
	 */
	EList<MessageEnd> getReceiveEvent();

	/**
	 * Returns the value of the '<em><b>Send Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.MessageEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Sending of the Message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Send Event</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getMessage_SendEvent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sendEvent' group='#group:22'"
	 * @generated
	 */
	EList<MessageEnd> getSendEvent();

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Connector on which this Message is sent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getMessage_Connector()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='connector' group='#group:22'"
	 * @generated
	 */
	EList<Connector> getConnector();

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The definition of the type or signature of the Message (depending on its kind)
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getMessage_Signature()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='signature' group='#group:22'"
	 * @generated
	 */
	EList<NamedElement> getSignature();

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * arguments of the Message
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getMessage_Argument()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='argument' group='#group:22'"
	 * @generated
	 */
	EList<ValueSpecification> getArgument();

	/**
	 * Returns the value of the '<em><b>Connector1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Connector on which this Message is sent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector1</em>' attribute.
	 * @see #setConnector1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getMessage_Connector1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='connector'"
	 * @generated
	 */
	String getConnector1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Message#getConnector1 <em>Connector1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector1</em>' attribute.
	 * @see #getConnector1()
	 * @generated
	 */
	void setConnector1(String value);

	/**
	 * Returns the value of the '<em><b>Message Sort</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2._1._0._0.uml.MessageSort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Sort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Sort</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.MessageSort
	 * @see #isSetMessageSort()
	 * @see #unsetMessageSort()
	 * @see #setMessageSort(MessageSort)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getMessage_MessageSort()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='messageSort'"
	 * @generated
	 */
	MessageSort getMessageSort();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Message#getMessageSort <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Sort</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.MessageSort
	 * @see #isSetMessageSort()
	 * @see #unsetMessageSort()
	 * @see #getMessageSort()
	 * @generated
	 */
	void setMessageSort(MessageSort value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Message#getMessageSort <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMessageSort()
	 * @see #getMessageSort()
	 * @see #setMessageSort(MessageSort)
	 * @generated
	 */
	void unsetMessageSort();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2._1._0._0.uml.Message#getMessageSort <em>Message Sort</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Message Sort</em>' attribute is set.
	 * @see #unsetMessageSort()
	 * @see #getMessageSort()
	 * @see #setMessageSort(MessageSort)
	 * @generated
	 */
	boolean isSetMessageSort();

	/**
	 * Returns the value of the '<em><b>Receive Event1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the Receiving of the Message
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receive Event1</em>' attribute.
	 * @see #setReceiveEvent1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getMessage_ReceiveEvent1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='receiveEvent'"
	 * @generated
	 */
	String getReceiveEvent1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Message#getReceiveEvent1 <em>Receive Event1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Event1</em>' attribute.
	 * @see #getReceiveEvent1()
	 * @generated
	 */
	void setReceiveEvent1(String value);

	/**
	 * Returns the value of the '<em><b>Send Event1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Sending of the Message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Send Event1</em>' attribute.
	 * @see #setSendEvent1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getMessage_SendEvent1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='sendEvent'"
	 * @generated
	 */
	String getSendEvent1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Message#getSendEvent1 <em>Send Event1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Event1</em>' attribute.
	 * @see #getSendEvent1()
	 * @generated
	 */
	void setSendEvent1(String value);

	/**
	 * Returns the value of the '<em><b>Signature1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The definition of the type or signature of the Message (depending on its kind)
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature1</em>' attribute.
	 * @see #setSignature1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getMessage_Signature1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='signature'"
	 * @generated
	 */
	String getSignature1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Message#getSignature1 <em>Signature1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature1</em>' attribute.
	 * @see #getSignature1()
	 * @generated
	 */
	void setSignature1(String value);

} // Message
