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
 * A representation of the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A decision node has one incoming edge and multiple outgoing activity edges.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.DecisionNode#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.DecisionNode#getDecisionInput <em>Decision Input</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.DecisionNode#getDecisionInput1 <em>Decision Input1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getDecisionNode()
 * @model extendedMetaData="name='DecisionNode' kind='elementOnly'"
 * @generated
 */
public interface DecisionNode extends ControlNode
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getDecisionNode_Group6()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:34'"
	 * @generated
	 */
	FeatureMap getGroup6();

	/**
	 * Returns the value of the '<em><b>Decision Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Provides input to guard specifications on edges outgoing from the decision node.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decision Input</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getDecisionNode_DecisionInput()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='decisionInput' group='#group:34'"
	 * @generated
	 */
	EList<Behavior> getDecisionInput();

	/**
	 * Returns the value of the '<em><b>Decision Input1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Provides input to guard specifications on edges outgoing from the decision node.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decision Input1</em>' attribute.
	 * @see #setDecisionInput1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getDecisionNode_DecisionInput1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='decisionInput'"
	 * @generated
	 */
	String getDecisionInput1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.DecisionNode#getDecisionInput1 <em>Decision Input1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Input1</em>' attribute.
	 * @see #getDecisionInput1()
	 * @generated
	 */
	void setDecisionInput1(String value);

} // DecisionNode
