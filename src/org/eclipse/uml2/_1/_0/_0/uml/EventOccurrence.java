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
 * A representation of the model object '<em><b>Event Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         EventOccurrences represents moments in time to which Actions are associated. An EventOccurrence is the basic semantic unit of Interactions. The sequences of Eventoccurrences are the meanings of Interactions. Messages are sent through either asynchronous signal sending or operation calls. Likewise they are recieved by Receptions or actions of consumption. EventOccurrence is a specialization of InteractionFragment and of MessageEnd. EventOccurrences are ordered along a Lifeline. The namespace of an EventOccurrence is the Interaction in which it is contained.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.EventOccurrence#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.EventOccurrence#getReceiveMessage <em>Receive Message</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.EventOccurrence#getSendMessage <em>Send Message</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.EventOccurrence#getStartExec <em>Start Exec</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.EventOccurrence#getFinishExec <em>Finish Exec</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.EventOccurrence#getToAfter <em>To After</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.EventOccurrence#getToBefore <em>To Before</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.EventOccurrence#getFinishExec1 <em>Finish Exec1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.EventOccurrence#getReceiveMessage1 <em>Receive Message1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.EventOccurrence#getSendMessage1 <em>Send Message1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.EventOccurrence#getStartExec1 <em>Start Exec1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.EventOccurrence#getToAfter1 <em>To After1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.EventOccurrence#getToBefore1 <em>To Before1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getEventOccurrence()
 * @model extendedMetaData="name='EventOccurrence' kind='elementOnly'"
 * @generated
 */
public interface EventOccurrence extends InteractionFragment
{
	/**
	 * Returns the value of the '<em><b>Group6</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group6</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group6</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getEventOccurrence_Group6()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:23'"
	 * @generated
	 */
	FeatureMap getGroup6();

	/**
	 * Returns the value of the '<em><b>Receive Message</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 the Message that contains the information of a receiveEvent
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receive Message</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getEventOccurrence_ReceiveMessage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='receiveMessage' group='#group:23'"
	 * @generated
	 */
	EList<Message> getReceiveMessage();

	/**
	 * Returns the value of the '<em><b>Send Message</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 References the Message that contains the information of a sendEvent
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Send Message</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getEventOccurrence_SendMessage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sendMessage' group='#group:23'"
	 * @generated
	 */
	EList<Message> getSendMessage();

	/**
	 * Returns the value of the '<em><b>Start Exec</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ExecutionOccurrence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Exec</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Exec</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getEventOccurrence_StartExec()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='startExec' group='#group:23'"
	 * @generated
	 */
	EList<ExecutionOccurrence> getStartExec();

	/**
	 * Returns the value of the '<em><b>Finish Exec</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ExecutionOccurrence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish Exec</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish Exec</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getEventOccurrence_FinishExec()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='finishExec' group='#group:23'"
	 * @generated
	 */
	EList<ExecutionOccurrence> getFinishExec();

	/**
	 * Returns the value of the '<em><b>To After</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.GeneralOrdering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To After</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To After</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getEventOccurrence_ToAfter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='toAfter' group='#group:23'"
	 * @generated
	 */
	EList<GeneralOrdering> getToAfter();

	/**
	 * Returns the value of the '<em><b>To Before</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.GeneralOrdering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Before</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Before</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getEventOccurrence_ToBefore()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='toBefore' group='#group:23'"
	 * @generated
	 */
	EList<GeneralOrdering> getToBefore();

	/**
	 * Returns the value of the '<em><b>Finish Exec1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish Exec1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish Exec1</em>' attribute.
	 * @see #setFinishExec1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getEventOccurrence_FinishExec1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='finishExec'"
	 * @generated
	 */
	String getFinishExec1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.EventOccurrence#getFinishExec1 <em>Finish Exec1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish Exec1</em>' attribute.
	 * @see #getFinishExec1()
	 * @generated
	 */
	void setFinishExec1(String value);

	/**
	 * Returns the value of the '<em><b>Receive Message1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               the Message that contains the information of a receiveEvent
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receive Message1</em>' attribute.
	 * @see #setReceiveMessage1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getEventOccurrence_ReceiveMessage1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='receiveMessage'"
	 * @generated
	 */
	String getReceiveMessage1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.EventOccurrence#getReceiveMessage1 <em>Receive Message1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Message1</em>' attribute.
	 * @see #getReceiveMessage1()
	 * @generated
	 */
	void setReceiveMessage1(String value);

	/**
	 * Returns the value of the '<em><b>Send Message1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               References the Message that contains the information of a sendEvent
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Send Message1</em>' attribute.
	 * @see #setSendMessage1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getEventOccurrence_SendMessage1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='sendMessage'"
	 * @generated
	 */
	String getSendMessage1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.EventOccurrence#getSendMessage1 <em>Send Message1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Message1</em>' attribute.
	 * @see #getSendMessage1()
	 * @generated
	 */
	void setSendMessage1(String value);

	/**
	 * Returns the value of the '<em><b>Start Exec1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Exec1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Exec1</em>' attribute.
	 * @see #setStartExec1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getEventOccurrence_StartExec1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='startExec'"
	 * @generated
	 */
	String getStartExec1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.EventOccurrence#getStartExec1 <em>Start Exec1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Exec1</em>' attribute.
	 * @see #getStartExec1()
	 * @generated
	 */
	void setStartExec1(String value);

	/**
	 * Returns the value of the '<em><b>To After1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To After1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To After1</em>' attribute.
	 * @see #setToAfter1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getEventOccurrence_ToAfter1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='toAfter'"
	 * @generated
	 */
	String getToAfter1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.EventOccurrence#getToAfter1 <em>To After1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To After1</em>' attribute.
	 * @see #getToAfter1()
	 * @generated
	 */
	void setToAfter1(String value);

	/**
	 * Returns the value of the '<em><b>To Before1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Before1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Before1</em>' attribute.
	 * @see #setToBefore1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getEventOccurrence_ToBefore1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='toBefore'"
	 * @generated
	 */
	String getToBefore1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.EventOccurrence#getToBefore1 <em>To Before1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Before1</em>' attribute.
	 * @see #getToBefore1()
	 * @generated
	 */
	void setToBefore1(String value);

} // EventOccurrence
