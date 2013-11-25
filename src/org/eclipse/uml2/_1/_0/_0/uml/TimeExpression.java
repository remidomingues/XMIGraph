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
 * A representation of the model object '<em><b>Time Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A TimeExpression defines a value specification that represent a time value.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TimeExpression#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TimeExpression#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TimeExpression#getEvent1 <em>Event1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TimeExpression#getFirstTime <em>First Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTimeExpression()
 * @model extendedMetaData="name='TimeExpression' kind='elementOnly'"
 * @generated
 */
public interface TimeExpression extends ValueSpecification
{
	/**
	 * Returns the value of the '<em><b>Group7</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group7</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group7</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTimeExpression_Group7()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:28'"
	 * @generated
	 */
	FeatureMap getGroup7();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Refers to the specification of the event occurrence that the TimeExpression describes
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTimeExpression_Event()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='event' group='#group:28'"
	 * @generated
	 */
	EList<NamedElement> getEvent();

	/**
	 * Returns the value of the '<em><b>Event1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Refers to the specification of the event occurrence that the TimeExpression describes
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event1</em>' attribute.
	 * @see #setEvent1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTimeExpression_Event1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='event'"
	 * @generated
	 */
	String getEvent1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.TimeExpression#getEvent1 <em>Event1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event1</em>' attribute.
	 * @see #getEvent1()
	 * @generated
	 */
	void setEvent1(String value);

	/**
	 * Returns the value of the '<em><b>First Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               True if the TimeExpression describes the first point in time of the NamedElement referenced by event, in cases where the NamedElement describes something which extends in time. False if the TimeExpression describes the last point in time for the referenced NamedElement.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Time</em>' attribute.
	 * @see #setFirstTime(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTimeExpression_FirstTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='firstTime'"
	 * @generated
	 */
	String getFirstTime();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.TimeExpression#getFirstTime <em>First Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Time</em>' attribute.
	 * @see #getFirstTime()
	 * @generated
	 */
	void setFirstTime(String value);

} // TimeExpression
