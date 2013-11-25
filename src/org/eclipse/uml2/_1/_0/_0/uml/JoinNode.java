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
 * A representation of the model object '<em><b>Join Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.JoinNode#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.JoinNode#getJoinSpec <em>Join Spec</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.JoinNode#getIsCombineDuplicate <em>Is Combine Duplicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getJoinNode()
 * @model extendedMetaData="name='JoinNode' kind='elementOnly'"
 * @generated
 */
public interface JoinNode extends ControlNode
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getJoinNode_Group6()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:34'"
	 * @generated
	 */
	FeatureMap getGroup6();

	/**
	 * Returns the value of the '<em><b>Join Spec</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A specification giving the conditions under which the join will emit a token. Default is “and”.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Join Spec</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getJoinNode_JoinSpec()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='joinSpec' group='#group:34'"
	 * @generated
	 */
	EList<ValueSpecification> getJoinSpec();

	/**
	 * Returns the value of the '<em><b>Is Combine Duplicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Tells whether tokens having objects with the same identity are combined into one by the join. Default value is true.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Combine Duplicate</em>' attribute.
	 * @see #setIsCombineDuplicate(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getJoinNode_IsCombineDuplicate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isCombineDuplicate'"
	 * @generated
	 */
	String getIsCombineDuplicate();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.JoinNode#getIsCombineDuplicate <em>Is Combine Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Combine Duplicate</em>' attribute.
	 * @see #getIsCombineDuplicate()
	 * @generated
	 */
	void setIsCombineDuplicate(String value);

} // JoinNode
