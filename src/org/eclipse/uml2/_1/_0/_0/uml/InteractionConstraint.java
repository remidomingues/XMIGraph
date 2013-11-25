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
 * A representation of the model object '<em><b>Interaction Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         An InteractionConstraint is a boolean expression that guards an operand in a CombinedFragment. InteractionConstraint is a specialization of Constraint. Furthermore the InteractionConstraint contains two expressions designating the minimum and maximum number of times a loop CombinedFragment should execute.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InteractionConstraint#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InteractionConstraint#getMinint <em>Minint</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InteractionConstraint#getMaxint <em>Maxint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInteractionConstraint()
 * @model extendedMetaData="name='InteractionConstraint' kind='elementOnly'"
 * @generated
 */
public interface InteractionConstraint extends Constraint
{
	/**
	 * Returns the value of the '<em><b>Group7</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group7</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group7</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInteractionConstraint_Group7()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:30'"
	 * @generated
	 */
	FeatureMap getGroup7();

	/**
	 * Returns the value of the '<em><b>Minint</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * minimum number of iterations of a loop
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minint</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInteractionConstraint_Minint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='minint' group='#group:30'"
	 * @generated
	 */
	EList<ValueSpecification> getMinint();

	/**
	 * Returns the value of the '<em><b>Maxint</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * maximum number of iterations of a loop
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maxint</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInteractionConstraint_Maxint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='maxint' group='#group:30'"
	 * @generated
	 */
	EList<ValueSpecification> getMaxint();

} // InteractionConstraint
