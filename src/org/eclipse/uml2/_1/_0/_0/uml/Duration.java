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
 * A representation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A duration defines a value specification that specifies the temporal distance between two time expressions that specify time instants.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Duration#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Duration#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Duration#getEvent1 <em>Event1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Duration#getFirstTime <em>First Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getDuration()
 * @model extendedMetaData="name='Duration' kind='elementOnly'"
 * @generated
 */
public interface Duration extends ValueSpecification
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getDuration_Group7()
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
	 *                 Refers to the specification(s) that describes the starting TimeExpression and the ending TimeExpression of the Duration. If only one NamedElement is referenced, the duration is from the first point in time of that NamedElement until the last point in time of that NamedElement.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getDuration_Event()
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
	 *               Refers to the specification(s) that describes the starting TimeExpression and the ending TimeExpression of the Duration. If only one NamedElement is referenced, the duration is from the first point in time of that NamedElement until the last point in time of that NamedElement.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event1</em>' attribute.
	 * @see #setEvent1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getDuration_Event1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='event'"
	 * @generated
	 */
	String getEvent1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Duration#getEvent1 <em>Event1</em>}' attribute.
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
	 *               If the duration is between times of two NamedElements, there are two Boolean attributes, one for the start of the duration and one for the end of the duration. For each of these it holds that firstTime is true if the time information is associated with the first point in time of the NamedElement referenced by event, and false if it represents the last point in time of the NamedElement. If there is only one NamedElement referenced by event, then this attribute is irrelevant. The default value is true.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Time</em>' attribute.
	 * @see #setFirstTime(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getDuration_FirstTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='firstTime'"
	 * @generated
	 */
	String getFirstTime();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Duration#getFirstTime <em>First Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Time</em>' attribute.
	 * @see #getFirstTime()
	 * @generated
	 */
	void setFirstTime(String value);

} // Duration
