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
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         The point is that the InteractionConstraint "received" from StructuralArchitecture will consist of a set of such units described by sequence diagrams (or collaboration diagrams).
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Interaction#getGroup10 <em>Group10</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Interaction#getCovered <em>Covered</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Interaction#getGeneralOrdering <em>General Ordering</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Interaction#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Interaction#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Interaction#getFragment <em>Fragment</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Interaction#getFormalGate <em>Formal Gate</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Interaction#getCovered1 <em>Covered1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInteraction()
 * @model extendedMetaData="name='Interaction' kind='elementOnly'"
 * @generated
 */
public interface Interaction extends Behavior
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInteraction_Group10()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:71'"
	 * @generated
	 */
	FeatureMap getGroup10();

	/**
	 * Returns the value of the '<em><b>Covered</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Lifeline}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covered</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covered</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInteraction_Covered()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='covered' group='#group:71'"
	 * @generated
	 */
	EList<Lifeline> getCovered();

	/**
	 * Returns the value of the '<em><b>General Ordering</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.GeneralOrdering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Ordering</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Ordering</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInteraction_GeneralOrdering()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='generalOrdering' group='#group:71'"
	 * @generated
	 */
	EList<GeneralOrdering> getGeneralOrdering();

	/**
	 * Returns the value of the '<em><b>Lifeline</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Lifeline}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifeline</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifeline</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInteraction_Lifeline()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lifeline' group='#group:71'"
	 * @generated
	 */
	EList<Lifeline> getLifeline();

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInteraction_Message()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='message' group='#group:71'"
	 * @generated
	 */
	EList<Message> getMessage();

	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.InteractionFragment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragment</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInteraction_Fragment()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fragment' group='#group:71'"
	 * @generated
	 */
	EList<InteractionFragment> getFragment();

	/**
	 * Returns the value of the '<em><b>Formal Gate</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Gate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Specifies the gates that form the message interface between this Interaction and any InteractionOccurrences which reference it.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formal Gate</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInteraction_FormalGate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='formalGate' group='#group:71'"
	 * @generated
	 */
	EList<Gate> getFormalGate();

	/**
	 * Returns the value of the '<em><b>Covered1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covered1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covered1</em>' attribute.
	 * @see #setCovered1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInteraction_Covered1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='covered'"
	 * @generated
	 */
	String getCovered1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Interaction#getCovered1 <em>Covered1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Covered1</em>' attribute.
	 * @see #getCovered1()
	 * @generated
	 */
	void setCovered1(String value);

} // Interaction
