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
 * A representation of the model object '<em><b>General Ordering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A GeneralOrdering represents a binary relation between two Eventoccurrences, to describe that one Eventoccurrence must occur before the other in a valid trace. This mechanism provides the ability to define partial orders of EventOccurrences that may otherwise not have a specified order. A GeneralOrdering is a specialization of NamedElement. A GeneralOrdering may appear anywhere in an Interaction, but only between Eventoccurrences.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.GeneralOrdering#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.GeneralOrdering#getBefore <em>Before</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.GeneralOrdering#getAfter <em>After</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.GeneralOrdering#getAfter1 <em>After1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.GeneralOrdering#getBefore1 <em>Before1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getGeneralOrdering()
 * @model extendedMetaData="name='GeneralOrdering' kind='elementOnly'"
 * @generated
 */
public interface GeneralOrdering extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Group5</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group5</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group5</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getGeneralOrdering_Group5()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:22'"
	 * @generated
	 */
	FeatureMap getGroup5();

	/**
	 * Returns the value of the '<em><b>Before</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.EventOccurrence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The Eventoccurrence referred comes before the Eventoccurrence referred by after
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Before</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getGeneralOrdering_Before()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='before' group='#group:22'"
	 * @generated
	 */
	EList<EventOccurrence> getBefore();

	/**
	 * Returns the value of the '<em><b>After</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.EventOccurrence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The Eventoccurrence referred comes after the Eventoccurrence referred by before
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>After</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getGeneralOrdering_After()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='after' group='#group:22'"
	 * @generated
	 */
	EList<EventOccurrence> getAfter();

	/**
	 * Returns the value of the '<em><b>After1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The Eventoccurrence referred comes after the Eventoccurrence referred by before
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>After1</em>' attribute.
	 * @see #setAfter1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getGeneralOrdering_After1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='after'"
	 * @generated
	 */
	String getAfter1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.GeneralOrdering#getAfter1 <em>After1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After1</em>' attribute.
	 * @see #getAfter1()
	 * @generated
	 */
	void setAfter1(String value);

	/**
	 * Returns the value of the '<em><b>Before1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The Eventoccurrence referred comes before the Eventoccurrence referred by after
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Before1</em>' attribute.
	 * @see #setBefore1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getGeneralOrdering_Before1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='before'"
	 * @generated
	 */
	String getBefore1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.GeneralOrdering#getBefore1 <em>Before1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before1</em>' attribute.
	 * @see #getBefore1()
	 * @generated
	 */
	void setBefore1(String value);

} // GeneralOrdering
