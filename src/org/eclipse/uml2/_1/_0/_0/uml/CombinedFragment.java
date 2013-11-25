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
 * A representation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A combined fragment defines an expression of interaction fragments. A combined fragment is defined by an interaction operator and corresponding interaction operands. Through the use of CombinedFragments the user will be able to describe a number of traces in a compact and concise manner. CombinedFragment is a specialization of InteractionFragment.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.CombinedFragment#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.CombinedFragment#getOperand <em>Operand</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.CombinedFragment#getCfragmentGate <em>Cfragment Gate</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getCombinedFragment()
 * @model extendedMetaData="name='CombinedFragment' kind='elementOnly'"
 * @generated
 */
public interface CombinedFragment extends InteractionFragment
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getCombinedFragment_Group6()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:26'"
	 * @generated
	 */
	FeatureMap getGroup6();

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.InteractionOperand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * set of operands of the combined fragment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getCombinedFragment_Operand()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='operand' group='#group:26'"
	 * @generated
	 */
	EList<InteractionOperand> getOperand();

	/**
	 * Returns the value of the '<em><b>Cfragment Gate</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Gate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Specifies the gates that form the interface between this CombinedFragment and its surroundings
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cfragment Gate</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getCombinedFragment_CfragmentGate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cfragmentGate' group='#group:26'"
	 * @generated
	 */
	EList<Gate> getCfragmentGate();

	/**
	 * Returns the value of the '<em><b>Interaction Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2._1._0._0.uml.InteractionOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Specifies the operation which defines the semantics of this combination of InteractionFragments.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction Operator</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.InteractionOperator
	 * @see #isSetInteractionOperator()
	 * @see #unsetInteractionOperator()
	 * @see #setInteractionOperator(InteractionOperator)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getCombinedFragment_InteractionOperator()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='interactionOperator'"
	 * @generated
	 */
	InteractionOperator getInteractionOperator();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Operator</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.InteractionOperator
	 * @see #isSetInteractionOperator()
	 * @see #unsetInteractionOperator()
	 * @see #getInteractionOperator()
	 * @generated
	 */
	void setInteractionOperator(InteractionOperator value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2._1._0._0.uml.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInteractionOperator()
	 * @see #getInteractionOperator()
	 * @see #setInteractionOperator(InteractionOperator)
	 * @generated
	 */
	void unsetInteractionOperator();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2._1._0._0.uml.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interaction Operator</em>' attribute is set.
	 * @see #unsetInteractionOperator()
	 * @see #getInteractionOperator()
	 * @see #setInteractionOperator(InteractionOperator)
	 * @generated
	 */
	boolean isSetInteractionOperator();

} // CombinedFragment
