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
 * A representation of the model object '<em><b>Test Identity Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         This action returns true if the two input values are the same identity, false if they are not.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TestIdentityAction#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TestIdentityAction#getFirst <em>First</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TestIdentityAction#getSecond <em>Second</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TestIdentityAction#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTestIdentityAction()
 * @model extendedMetaData="name='TestIdentityAction' kind='elementOnly'"
 * @generated
 */
public interface TestIdentityAction extends Action
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTestIdentityAction_Group8()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:40'"
	 * @generated
	 */
	FeatureMap getGroup8();

	/**
	 * Returns the value of the '<em><b>First</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 . (Specialized from Action:input) Gives the pin on which an object is placed.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTestIdentityAction_First()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='first' group='#group:40'"
	 * @generated
	 */
	EList<InputPin> getFirst();

	/**
	 * Returns the value of the '<em><b>Second</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 (Specialized from Action:input) Gives the pin on which an object is placed.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Second</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTestIdentityAction_Second()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='second' group='#group:40'"
	 * @generated
	 */
	EList<InputPin> getSecond();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 (Specialized from Action:output) Tells whether the two input objects are identical.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTestIdentityAction_Result()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='result' group='#group:40'"
	 * @generated
	 */
	EList<OutputPin> getResult();

} // TestIdentityAction
