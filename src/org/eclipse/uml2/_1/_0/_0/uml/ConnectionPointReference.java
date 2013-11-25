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
 * A representation of the model object '<em><b>Connection Point Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Connection point references of a submachine state can be used as sources/targets of transitions. They represent entries into or exits out of the submachine state machine referenced by the submachine state.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ConnectionPointReference#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ConnectionPointReference#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ConnectionPointReference#getExit <em>Exit</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ConnectionPointReference#getEntry1 <em>Entry1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ConnectionPointReference#getExit1 <em>Exit1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnectionPointReference()
 * @model extendedMetaData="name='ConnectionPointReference' kind='elementOnly'"
 * @generated
 */
public interface ConnectionPointReference extends Vertex
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnectionPointReference_Group6()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:23'"
	 * @generated
	 */
	FeatureMap getGroup6();

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Pseudostate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The entryPoint kind pseudo states corresponding to this connection point.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnectionPointReference_Entry()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='entry' group='#group:23'"
	 * @generated
	 */
	EList<Pseudostate> getEntry();

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Pseudostate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The exitPoints kind pseudo states corresponding to this connection point.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exit</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnectionPointReference_Exit()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='exit' group='#group:23'"
	 * @generated
	 */
	EList<Pseudostate> getExit();

	/**
	 * Returns the value of the '<em><b>Entry1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The entryPoint kind pseudo states corresponding to this connection point.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry1</em>' attribute.
	 * @see #setEntry1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnectionPointReference_Entry1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='entry'"
	 * @generated
	 */
	String getEntry1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ConnectionPointReference#getEntry1 <em>Entry1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry1</em>' attribute.
	 * @see #getEntry1()
	 * @generated
	 */
	void setEntry1(String value);

	/**
	 * Returns the value of the '<em><b>Exit1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The exitPoints kind pseudo states corresponding to this connection point.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exit1</em>' attribute.
	 * @see #setExit1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnectionPointReference_Exit1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='exit'"
	 * @generated
	 */
	String getExit1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ConnectionPointReference#getExit1 <em>Exit1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit1</em>' attribute.
	 * @see #getExit1()
	 * @generated
	 */
	void setExit1(String value);

} // ConnectionPointReference
