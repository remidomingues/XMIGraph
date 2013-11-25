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
 * A representation of the model object '<em><b>Accept Call Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         (CompleteActions) AcceptCallAction is an accept event action representing the receipt of a synchronous call request. In addition to the normal operation parameters, the action produces a output token that is needed later to supply the information to the ReplyAction necessary to return control to the caller. This action is for synchronous calls.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.AcceptCallAction#getGroup9 <em>Group9</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.AcceptCallAction#getReturnInformation <em>Return Information</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.AcceptCallAction#getReturnInformation1 <em>Return Information1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getAcceptCallAction()
 * @model extendedMetaData="name='AcceptCallAction' kind='elementOnly'"
 * @generated
 */
public interface AcceptCallAction extends AcceptEventAction
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getAcceptCallAction_Group9()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:45'"
	 * @generated
	 */
	FeatureMap getGroup9();

	/**
	 * Returns the value of the '<em><b>Return Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Pin where a token is placed containing sufficient information to perform a subsequent reply and return control to the caller. The value in this token is opaque. It can be passed and copied but it cannot be manipulated by the model.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Information</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getAcceptCallAction_ReturnInformation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='returnInformation' group='#group:45'"
	 * @generated
	 */
	EList<OutputPin> getReturnInformation();

	/**
	 * Returns the value of the '<em><b>Return Information1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Pin where a token is placed containing sufficient information to perform a subsequent reply and return control to the caller. The value in this token is opaque. It can be passed and copied but it cannot be manipulated by the model.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Information1</em>' attribute.
	 * @see #setReturnInformation1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getAcceptCallAction_ReturnInformation1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='returnInformation'"
	 * @generated
	 */
	String getReturnInformation1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.AcceptCallAction#getReturnInformation1 <em>Return Information1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Information1</em>' attribute.
	 * @see #getReturnInformation1()
	 * @generated
	 */
	void setReturnInformation1(String value);

} // AcceptCallAction
