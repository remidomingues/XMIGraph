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
 * A representation of the model object '<em><b>Broadcast Signal Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         BroadcastSignalAction is an action that transmits a signal instance to all the potential target objects in the system, which may cause the firing of a state machine transitions or the execution of associated activities of a target object. The argument values are available to the execution of associated behaviors. The requestor continues execution immediately after the signals are sent out. It does not wait for receipt. Any reply messages are ignored and are not transmitted to the requestor.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.BroadcastSignalAction#getGroup9 <em>Group9</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.BroadcastSignalAction#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.BroadcastSignalAction#getSignal1 <em>Signal1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBroadcastSignalAction()
 * @model extendedMetaData="name='BroadcastSignalAction' kind='elementOnly'"
 * @generated
 */
public interface BroadcastSignalAction extends InvocationAction
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBroadcastSignalAction_Group9()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:44'"
	 * @generated
	 */
	FeatureMap getGroup9();

	/**
	 * Returns the value of the '<em><b>Signal</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The specification of signal object transmitted to the target objects.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBroadcastSignalAction_Signal()
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
	 *               The specification of signal object transmitted to the target objects.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal1</em>' attribute.
	 * @see #setSignal1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBroadcastSignalAction_Signal1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='signal'"
	 * @generated
	 */
	String getSignal1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.BroadcastSignalAction#getSignal1 <em>Signal1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal1</em>' attribute.
	 * @see #getSignal1()
	 * @generated
	 */
	void setSignal1(String value);

} // BroadcastSignalAction
