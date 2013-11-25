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
 * A representation of the model object '<em><b>State Invariant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A StateInvariant is a runtime constraint on the participants of the interaction. It may be used to specify a variety of different kinds of constraints, such as values of attributes or variables, internal or external states, and so on. A StateInvariant is an InteractionFragment and it is placed on a Lifeline.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.StateInvariant#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.StateInvariant#getInvariant <em>Invariant</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getStateInvariant()
 * @model extendedMetaData="name='StateInvariant' kind='elementOnly'"
 * @generated
 */
public interface StateInvariant extends InteractionFragment
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getStateInvariant_Group6()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:26'"
	 * @generated
	 */
	FeatureMap getGroup6();

	/**
	 * Returns the value of the '<em><b>Invariant</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A Constraint that should hold at runtime for this StateInvariant
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invariant</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getStateInvariant_Invariant()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='invariant' group='#group:26'"
	 * @generated
	 */
	EList<Constraint> getInvariant();

} // StateInvariant
