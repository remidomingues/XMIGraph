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
 * A representation of the model object '<em><b>Reply Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         (CompleteActions) ReplyAction is an action that accepts a set of return values and a token containing return information produced by a previous accept call action. The reply action returns the values to the caller of the previous call, completing execution of the call.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ReplyAction#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ReplyAction#getReplyToCall <em>Reply To Call</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ReplyAction#getReplyValue <em>Reply Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ReplyAction#getReturnInformation <em>Return Information</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ReplyAction#getReplyToCall1 <em>Reply To Call1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ReplyAction#getReplyValue1 <em>Reply Value1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ReplyAction#getReturnInformation1 <em>Return Information1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReplyAction()
 * @model extendedMetaData="name='ReplyAction' kind='elementOnly'"
 * @generated
 */
public interface ReplyAction extends Action
{
	/**
	 * Returns the value of the '<em><b>Group8</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group8</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group8</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReplyAction_Group8()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:40'"
	 * @generated
	 */
	FeatureMap getGroup8();

	/**
	 * Returns the value of the '<em><b>Reply To Call</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.CallTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation call trigger being replied to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reply To Call</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReplyAction_ReplyToCall()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='replyToCall' group='#group:40'"
	 * @generated
	 */
	EList<CallTrigger> getReplyToCall();

	/**
	 * Returns the value of the '<em><b>Reply Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A list of pins containing the reply values of the operation. These values are returned to the caller.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reply Value</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReplyAction_ReplyValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='replyValue' group='#group:40'"
	 * @generated
	 */
	EList<InputPin> getReplyValue();

	/**
	 * Returns the value of the '<em><b>Return Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A pin containing the return information token produced by an earlier AcceptCallAction.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Information</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReplyAction_ReturnInformation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='returnInformation' group='#group:40'"
	 * @generated
	 */
	EList<InputPin> getReturnInformation();

	/**
	 * Returns the value of the '<em><b>Reply To Call1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation call trigger being replied to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reply To Call1</em>' attribute.
	 * @see #setReplyToCall1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReplyAction_ReplyToCall1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='replyToCall'"
	 * @generated
	 */
	String getReplyToCall1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ReplyAction#getReplyToCall1 <em>Reply To Call1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply To Call1</em>' attribute.
	 * @see #getReplyToCall1()
	 * @generated
	 */
	void setReplyToCall1(String value);

	/**
	 * Returns the value of the '<em><b>Reply Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               A list of pins containing the reply values of the operation. These values are returned to the caller.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reply Value1</em>' attribute.
	 * @see #setReplyValue1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReplyAction_ReplyValue1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='replyValue'"
	 * @generated
	 */
	String getReplyValue1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ReplyAction#getReplyValue1 <em>Reply Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply Value1</em>' attribute.
	 * @see #getReplyValue1()
	 * @generated
	 */
	void setReplyValue1(String value);

	/**
	 * Returns the value of the '<em><b>Return Information1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               A pin containing the return information token produced by an earlier AcceptCallAction.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Information1</em>' attribute.
	 * @see #setReturnInformation1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReplyAction_ReturnInformation1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='returnInformation'"
	 * @generated
	 */
	String getReturnInformation1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ReplyAction#getReturnInformation1 <em>Return Information1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Information1</em>' attribute.
	 * @see #getReturnInformation1()
	 * @generated
	 */
	void setReturnInformation1(String value);

} // ReplyAction
