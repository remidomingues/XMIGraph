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
 * A representation of the model object '<em><b>Call Operation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         CallOperationAction is an action that transmits an operation call request to the target object, where it may cause the invocation of associated behavior. The argument values of the action are available to the execution of the invoked behavior. If the action is marked synchronous, the execution of the call operation action waits until the execution of the invoked behavior completes and a reply transmission is returned to the caller; otherwise execution of the action is complete when the invocation of the operation is established and the execution of the invoked operation proceeds concurrently with the execution of the calling activity. Any values returned as part of the reply transmission are put on the result output pins of the call operation action.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.CallOperationAction#getGroup10 <em>Group10</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.CallOperationAction#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.CallOperationAction#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.CallOperationAction#getOperation1 <em>Operation1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getCallOperationAction()
 * @model extendedMetaData="name='CallOperationAction' kind='elementOnly'"
 * @generated
 */
public interface CallOperationAction extends CallAction
{
	/**
	 * Returns the value of the '<em><b>Group10</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group10</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group10</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getCallOperationAction_Group10()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:47'"
	 * @generated
	 */
	FeatureMap getGroup10();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The operation to be invoked by the action execution
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getCallOperationAction_Operation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='operation' group='#group:47'"
	 * @generated
	 */
	EList<Operation> getOperation();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The target object to which the request is sent. The classifier of the target object is used to dynamically determine a behavior to invoke. This object constitutes the context of the execution of the operation.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getCallOperationAction_Target()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='target' group='#group:47'"
	 * @generated
	 */
	EList<InputPin> getTarget();

	/**
	 * Returns the value of the '<em><b>Operation1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The operation to be invoked by the action execution
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation1</em>' attribute.
	 * @see #setOperation1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getCallOperationAction_Operation1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='operation'"
	 * @generated
	 */
	String getOperation1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.CallOperationAction#getOperation1 <em>Operation1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation1</em>' attribute.
	 * @see #getOperation1()
	 * @generated
	 */
	void setOperation1(String value);

} // CallOperationAction
