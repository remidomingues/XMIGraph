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
 * A representation of the model object '<em><b>Protocol Conformance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ProtocolConformance#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ProtocolConformance#getGeneralMachine <em>General Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ProtocolConformance#getGeneralMachine1 <em>General Machine1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProtocolConformance()
 * @model extendedMetaData="name='ProtocolConformance' kind='elementOnly'"
 * @generated
 */
public interface ProtocolConformance extends DirectedRelationship
{
	/**
	 * Returns the value of the '<em><b>Group3</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group3</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProtocolConformance_Group3()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:13'"
	 * @generated
	 */
	FeatureMap getGroup3();

	/**
	 * Returns the value of the '<em><b>General Machine</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ProtocolStateMachine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 : Specifies the protocol state machine to which the specific state machine conforms.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General Machine</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProtocolConformance_GeneralMachine()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='generalMachine' group='#group:13'"
	 * @generated
	 */
	EList<ProtocolStateMachine> getGeneralMachine();

	/**
	 * Returns the value of the '<em><b>General Machine1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               : Specifies the protocol state machine to which the specific state machine conforms.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General Machine1</em>' attribute.
	 * @see #setGeneralMachine1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProtocolConformance_GeneralMachine1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='generalMachine'"
	 * @generated
	 */
	String getGeneralMachine1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ProtocolConformance#getGeneralMachine1 <em>General Machine1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Machine1</em>' attribute.
	 * @see #getGeneralMachine1()
	 * @generated
	 */
	void setGeneralMachine1(String value);

} // ProtocolConformance
