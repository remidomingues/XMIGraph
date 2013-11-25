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
 * A representation of the model object '<em><b>Protocol Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A protocol transition (transition as specialized in the ProtocolStateMachines package) specifies a legal transition for an operation. Transitions of protocol state machines have the following information: a pre condition (guard), on trigger, and a post condition. Every protocol transition is associated to zero or one operation (referred BehavioralFeature) that belongs to the context classifier of the protocol state machine. The protocol transition specifies that the associated (referred) operation can be called for an instance in the origin state under the initial condition (guard), and that at the end of the transition, the destination state will be reached under the final condition (post).
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ProtocolTransition#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ProtocolTransition#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ProtocolTransition#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ProtocolTransition#getPreCondition1 <em>Pre Condition1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProtocolTransition()
 * @model extendedMetaData="name='ProtocolTransition' kind='elementOnly'"
 * @generated
 */
public interface ProtocolTransition extends Transition
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProtocolTransition_Group6()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:35'"
	 * @generated
	 */
	FeatureMap getGroup6();

	/**
	 * Returns the value of the '<em><b>Post Condition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Specifies the post condition of the transition which is the condition that should be obtained once the transition is triggered. This post condition is part of the post condition of the operation connected to the transition.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Condition</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProtocolTransition_PostCondition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='postCondition' group='#group:35'"
	 * @generated
	 */
	EList<Constraint> getPostCondition();

	/**
	 * Returns the value of the '<em><b>Pre Condition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Specifies the precondition of the transition. It specifies the condition that should be verified before triggering the transition. This guard condition added to the source state will be evaluated as part of the precondition of the operation refered by the transition if any.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Condition</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProtocolTransition_PreCondition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='preCondition' group='#group:35'"
	 * @generated
	 */
	EList<Constraint> getPreCondition();

	/**
	 * Returns the value of the '<em><b>Pre Condition1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Specifies the precondition of the transition. It specifies the condition that should be verified before triggering the transition. This guard condition added to the source state will be evaluated as part of the precondition of the operation refered by the transition if any.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Condition1</em>' attribute.
	 * @see #setPreCondition1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProtocolTransition_PreCondition1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='preCondition'"
	 * @generated
	 */
	String getPreCondition1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ProtocolTransition#getPreCondition1 <em>Pre Condition1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Condition1</em>' attribute.
	 * @see #getPreCondition1()
	 * @generated
	 */
	void setPreCondition1(String value);

} // ProtocolTransition
