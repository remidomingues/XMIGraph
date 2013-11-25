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
 * A representation of the model object '<em><b>Read Structural Feature Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         This action reads the values of a structural feature, in order if the structural feature is ordered.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ReadStructuralFeatureAction#getGroup9 <em>Group9</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ReadStructuralFeatureAction#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReadStructuralFeatureAction()
 * @model extendedMetaData="name='ReadStructuralFeatureAction' kind='elementOnly'"
 * @generated
 */
public interface ReadStructuralFeatureAction extends StructuralFeatureAction
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReadStructuralFeatureAction_Group9()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:44'"
	 * @generated
	 */
	FeatureMap getGroup9();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 (Specialized from Action:output) Gives the output pin on which the result is put.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReadStructuralFeatureAction_Result()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='result' group='#group:44'"
	 * @generated
	 */
	EList<OutputPin> getResult();

} // ReadStructuralFeatureAction
