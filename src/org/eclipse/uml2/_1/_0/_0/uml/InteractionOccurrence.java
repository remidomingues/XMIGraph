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
 * A representation of the model object '<em><b>Interaction Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         InteractionOccurrence is a specialization of InteractionFragment. An InteractionOccurrence has a set of actual gates that must match the formal gates of the referenced Interaction.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InteractionOccurrence#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InteractionOccurrence#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InteractionOccurrence#getActualGate <em>Actual Gate</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InteractionOccurrence#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InteractionOccurrence#getRefersTo1 <em>Refers To1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInteractionOccurrence()
 * @model extendedMetaData="name='InteractionOccurrence' kind='elementOnly'"
 * @generated
 */
public interface InteractionOccurrence extends InteractionFragment
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInteractionOccurrence_Group6()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:23'"
	 * @generated
	 */
	FeatureMap getGroup6();

	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Interaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Refers to the Interaction that defines its meaning
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refers To</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInteractionOccurrence_RefersTo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='refersTo' group='#group:23'"
	 * @generated
	 */
	EList<Interaction> getRefersTo();

	/**
	 * Returns the value of the '<em><b>Actual Gate</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Gate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual gates of the InteractionOccurrence
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Gate</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInteractionOccurrence_ActualGate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='actualGate' group='#group:23'"
	 * @generated
	 */
	EList<Gate> getActualGate();

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual arguments of the Interaction
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInteractionOccurrence_Argument()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='argument' group='#group:23'"
	 * @generated
	 */
	EList<InputPin> getArgument();

	/**
	 * Returns the value of the '<em><b>Refers To1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Refers to the Interaction that defines its meaning
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refers To1</em>' attribute.
	 * @see #setRefersTo1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInteractionOccurrence_RefersTo1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='refersTo'"
	 * @generated
	 */
	String getRefersTo1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.InteractionOccurrence#getRefersTo1 <em>Refers To1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To1</em>' attribute.
	 * @see #getRefersTo1()
	 * @generated
	 */
	void setRefersTo1(String value);

} // InteractionOccurrence
