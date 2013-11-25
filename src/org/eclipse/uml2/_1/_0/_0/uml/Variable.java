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
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A variable is considered a connectable element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Variable#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Variable#getType1 <em>Type1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Variable#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Variable#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Variable#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Variable#getIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Variable#getType2 <em>Type2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getVariable()
 * @model extendedMetaData="name='Variable' kind='elementOnly'"
 * @generated
 */
public interface Variable extends ConnectableElement
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getVariable_Group6()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:27'"
	 * @generated
	 */
	FeatureMap getGroup6();

	/**
	 * Returns the value of the '<em><b>Type1</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the TypedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type1</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getVariable_Type1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='type' group='#group:27'"
	 * @generated
	 */
	EList<Type> getType1();

	/**
	 * Returns the value of the '<em><b>Upper Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The specification of the upper bound for this multiplicity. Subsets Element::ownedElement.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Value</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getVariable_UpperValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='upperValue' group='#group:27'"
	 * @generated
	 */
	EList<ValueSpecification> getUpperValue();

	/**
	 * Returns the value of the '<em><b>Lower Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The specification of the lower bound for this multiplicity. Subsets Element::ownedElement.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Value</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getVariable_LowerValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lowerValue' group='#group:27'"
	 * @generated
	 */
	EList<ValueSpecification> getLowerValue();

	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               For a multivalued multiplicity, this attribute specifies whether the values in an instantiation of this element are sequentially ordered. Default is false.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getVariable_IsOrdered()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isOrdered'"
	 * @generated
	 */
	String getIsOrdered();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Variable#getIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #getIsOrdered()
	 * @generated
	 */
	void setIsOrdered(String value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               For a multivalued multiplicity, this attributes specifies whether the values in an instantiation of this element are unique. Default is true.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getVariable_IsUnique()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isUnique'"
	 * @generated
	 */
	String getIsUnique();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Variable#getIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #getIsUnique()
	 * @generated
	 */
	void setIsUnique(String value);

	/**
	 * Returns the value of the '<em><b>Type2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the TypedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type2</em>' attribute.
	 * @see #setType2(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getVariable_Type2()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType2();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Variable#getType2 <em>Type2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type2</em>' attribute.
	 * @see #getType2()
	 * @generated
	 */
	void setType2(String value);

} // Variable
