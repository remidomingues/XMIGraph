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
 * A representation of the model object '<em><b>Send Signal Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         SendSignalAction is an action that creates a signal instance from its inputs, and transmits it to the target object, where it may cause the firing of a state machine transition or the execution of an activity. The argument values are available to the execution of associated behaviors. The requestor continues execution immediately. Any reply message is ignored and is not transmitted to the requestor. If the input is already a signal instance, use SendObjectAction.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.SendSignalAction#getGroup9 <em>Group9</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.SendSignalAction#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.SendSignalAction#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.SendSignalAction#getSignal1 <em>Signal1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getSendSignalAction()
 * @model extendedMetaData="name='SendSignalAction' kind='elementOnly'"
 * @generated
 */
public interface SendSignalAction extends InvocationAction
{
	/**
	 * Returns the value of the '<em><b>Group9</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group9</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group9</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getSendSignalAction_Group9()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:44'"
	 * @generated
	 */
	FeatureMap getGroup9();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target object to which the signal is sent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getSendSignalAction_Target()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='target' group='#group:44'"
	 * @generated
	 */
	EList<InputPin> getTarget();

	/**
	 * Returns the value of the '<em><b>Signal</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The type of signal transmitted to the target object.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getSendSignalAction_Signal()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='signal' group='#group:44'"
	 * @generated
	 */
	EList<Signal> getSignal();

	/**
	 * Returns the value of the '<em><b>Signal1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The type of signal transmitted to the target object.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal1</em>' attribute.
	 * @see #setSignal1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getSendSignalAction_Signal1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='signal'"
	 * @generated
	 */
	String getSignal1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.SendSignalAction#getSignal1 <em>Signal1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal1</em>' attribute.
	 * @see #getSignal1()
	 * @generated
	 */
	void setSignal1(String value);

} // SendSignalAction
