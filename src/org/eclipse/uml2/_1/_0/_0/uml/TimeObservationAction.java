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
 * A representation of the model object '<em><b>Time Observation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A TimeObservationAction defines an action that observes the current point in time.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TimeObservationAction#getGroup10 <em>Group10</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TimeObservationAction#getNow <em>Now</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTimeObservationAction()
 * @model extendedMetaData="name='TimeObservationAction' kind='elementOnly'"
 * @generated
 */
public interface TimeObservationAction extends WriteStructuralFeatureAction
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTimeObservationAction_Group10()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:46'"
	 * @generated
	 */
	FeatureMap getGroup10();

	/**
	 * Returns the value of the '<em><b>Now</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.TimeExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the current point in time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Now</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTimeObservationAction_Now()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='now' group='#group:46'"
	 * @generated
	 */
	EList<TimeExpression> getNow();

} // TimeObservationAction
