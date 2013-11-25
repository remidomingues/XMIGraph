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
 * A representation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         An Interval defines the range between two value specifications.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Interval#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Interval#getMin <em>Min</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Interval#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Interval#getMax1 <em>Max1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Interval#getMin1 <em>Min1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInterval()
 * @model extendedMetaData="name='Interval' kind='elementOnly'"
 * @generated
 */
public interface Interval extends ValueSpecification
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInterval_Group7()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:28'"
	 * @generated
	 */
	FeatureMap getGroup7();

	/**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Refers to the ValueSpecification denoting the minimum value of the range.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInterval_Min()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='min' group='#group:28'"
	 * @generated
	 */
	EList<ValueSpecification> getMin();

	/**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Refers to the ValueSpecification denoting the maximum value of the range.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInterval_Max()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='max' group='#group:28'"
	 * @generated
	 */
	EList<ValueSpecification> getMax();

	/**
	 * Returns the value of the '<em><b>Max1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Refers to the ValueSpecification denoting the maximum value of the range.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max1</em>' attribute.
	 * @see #setMax1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInterval_Max1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='max'"
	 * @generated
	 */
	String getMax1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Interval#getMax1 <em>Max1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max1</em>' attribute.
	 * @see #getMax1()
	 * @generated
	 */
	void setMax1(String value);

	/**
	 * Returns the value of the '<em><b>Min1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Refers to the ValueSpecification denoting the minimum value of the range.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min1</em>' attribute.
	 * @see #setMin1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInterval_Min1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='min'"
	 * @generated
	 */
	String getMin1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Interval#getMin1 <em>Min1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min1</em>' attribute.
	 * @see #getMin1()
	 * @generated
	 */
	void setMin1(String value);

} // Interval
