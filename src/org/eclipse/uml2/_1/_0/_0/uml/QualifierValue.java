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
 * A representation of the model object '<em><b>Qualifier Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A link cannot be passed as a runtime value to or from an action. Instead, a link is identified by its end objects and qualifier values, as required. This requires more than one piece of data, namely, the end in the user model, the object on the end, and the qualifier values for that end. These pieces are brought together around LinkEndData. Each association end is identified separately with an instance of the LinkEndData class.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.QualifierValue#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.QualifierValue#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.QualifierValue#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.QualifierValue#getQualifier1 <em>Qualifier1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.QualifierValue#getValue1 <em>Value1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getQualifierValue()
 * @model extendedMetaData="name='QualifierValue' kind='elementOnly'"
 * @generated
 */
public interface QualifierValue extends Element
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getQualifierValue_Group3()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:13'"
	 * @generated
	 */
	FeatureMap getGroup3();

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getQualifierValue_Qualifier()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='qualifier' group='#group:13'"
	 * @generated
	 */
	EList<Property> getQualifier();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Input pin from which the specified value for the qualifier is taken.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getQualifierValue_Value()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='value' group='#group:13'"
	 * @generated
	 */
	EList<InputPin> getValue();

	/**
	 * Returns the value of the '<em><b>Qualifier1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier1</em>' attribute.
	 * @see #setQualifier1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getQualifierValue_Qualifier1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='qualifier'"
	 * @generated
	 */
	String getQualifier1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.QualifierValue#getQualifier1 <em>Qualifier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier1</em>' attribute.
	 * @see #getQualifier1()
	 * @generated
	 */
	void setQualifier1(String value);

	/**
	 * Returns the value of the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Input pin from which the specified value for the qualifier is taken.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value1</em>' attribute.
	 * @see #setValue1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getQualifierValue_Value1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	String getValue1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.QualifierValue#getValue1 <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value1</em>' attribute.
	 * @see #getValue1()
	 * @generated
	 */
	void setValue1(String value);

} // QualifierValue
