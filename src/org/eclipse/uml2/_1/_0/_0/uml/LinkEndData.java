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
 * A representation of the model object '<em><b>Link End Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LinkEndData#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LinkEndData#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LinkEndData#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LinkEndData#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LinkEndData#getEnd1 <em>End1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LinkEndData#getValue1 <em>Value1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLinkEndData()
 * @model extendedMetaData="name='LinkEndData' kind='elementOnly'"
 * @generated
 */
public interface LinkEndData extends Element
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLinkEndData_Group3()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:13'"
	 * @generated
	 */
	FeatureMap getGroup3();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Input pin that provides the specified object for the given end. This pin is omitted if the link-end data specifies an “open” end for reading.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLinkEndData_Value()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='value' group='#group:13'"
	 * @generated
	 */
	EList<InputPin> getValue();

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Association end for which this link-end data specifies values.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLinkEndData_End()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='end' group='#group:13'"
	 * @generated
	 */
	EList<Property> getEnd();

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.QualifierValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Attribute representing the qualifier for which the value is to be specified.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLinkEndData_Qualifier()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='qualifier' group='#group:13'"
	 * @generated
	 */
	EList<QualifierValue> getQualifier();

	/**
	 * Returns the value of the '<em><b>End1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Association end for which this link-end data specifies values.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End1</em>' attribute.
	 * @see #setEnd1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLinkEndData_End1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='end'"
	 * @generated
	 */
	String getEnd1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.LinkEndData#getEnd1 <em>End1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End1</em>' attribute.
	 * @see #getEnd1()
	 * @generated
	 */
	void setEnd1(String value);

	/**
	 * Returns the value of the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Input pin that provides the specified object for the given end. This pin is omitted if the link-end data specifies an “open” end for reading.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value1</em>' attribute.
	 * @see #setValue1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLinkEndData_Value1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	String getValue1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.LinkEndData#getValue1 <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value1</em>' attribute.
	 * @see #getValue1()
	 * @generated
	 */
	void setValue1(String value);

} // LinkEndData
