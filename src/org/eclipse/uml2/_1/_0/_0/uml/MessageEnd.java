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
 * A representation of the model object '<em><b>Message End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A MessageEnd is an abstract NamedElement that represents what can occur at the end of a Message.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.MessageEnd#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.MessageEnd#getReceiveMessage <em>Receive Message</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.MessageEnd#getSendMessage <em>Send Message</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.MessageEnd#getReceiveMessage1 <em>Receive Message1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.MessageEnd#getSendMessage1 <em>Send Message1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getMessageEnd()
 * @model extendedMetaData="name='MessageEnd' kind='elementOnly'"
 * @generated
 */
public interface MessageEnd extends NamedElement
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getMessageEnd_Group5()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:22'"
	 * @generated
	 */
	FeatureMap getGroup5();

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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getMessageEnd_ReceiveMessage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='receiveMessage' group='#group:22'"
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getMessageEnd_SendMessage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sendMessage' group='#group:22'"
	 * @generated
	 */
	EList<Message> getSendMessage();

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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getMessageEnd_ReceiveMessage1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='receiveMessage'"
	 * @generated
	 */
	String getReceiveMessage1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.MessageEnd#getReceiveMessage1 <em>Receive Message1</em>}' attribute.
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getMessageEnd_SendMessage1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='sendMessage'"
	 * @generated
	 */
	String getSendMessage1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.MessageEnd#getSendMessage1 <em>Send Message1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Message1</em>' attribute.
	 * @see #getSendMessage1()
	 * @generated
	 */
	void setSendMessage1(String value);

} // MessageEnd
