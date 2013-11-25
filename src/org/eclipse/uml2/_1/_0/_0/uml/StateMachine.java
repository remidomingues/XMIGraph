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
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.StateMachine#getGroup10 <em>Group10</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.StateMachine#getRegion <em>Region</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.StateMachine#getConnectionPoint <em>Connection Point</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.StateMachine#getExtendedStateMachine <em>Extended State Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.StateMachine#getExtendedStateMachine1 <em>Extended State Machine1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getStateMachine()
 * @model extendedMetaData="name='StateMachine' kind='elementOnly'"
 * @generated
 */
public interface StateMachine extends Behavior
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getStateMachine_Group10()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup10();

	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Region}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getStateMachine_Region()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='region' group='#group:0'"
	 * @generated
	 */
	EList<Region> getRegion();

	/**
	 * Returns the value of the '<em><b>Connection Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Pseudostate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Point</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getStateMachine_ConnectionPoint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='connectionPoint' group='#group:0'"
	 * @generated
	 */
	EList<Pseudostate> getConnectionPoint();

	/**
	 * Returns the value of the '<em><b>Extended State Machine</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.StateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended State Machine</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended State Machine</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getStateMachine_ExtendedStateMachine()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extendedStateMachine' group='#group:0'"
	 * @generated
	 */
	EList<StateMachine> getExtendedStateMachine();

	/**
	 * Returns the value of the '<em><b>Extended State Machine1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended State Machine1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended State Machine1</em>' attribute.
	 * @see #setExtendedStateMachine1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getStateMachine_ExtendedStateMachine1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='extendedStateMachine'"
	 * @generated
	 */
	String getExtendedStateMachine1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.StateMachine#getExtendedStateMachine1 <em>Extended State Machine1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended State Machine1</em>' attribute.
	 * @see #getExtendedStateMachine1()
	 * @generated
	 */
	void setExtendedStateMachine1(String value);

} // StateMachine
