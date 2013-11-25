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
 * A representation of the model object '<em><b>Instance Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         An instance value specifies the value modeled by an instance specification.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InstanceValue#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InstanceValue#getInstance <em>Instance</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InstanceValue#getInstance1 <em>Instance1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInstanceValue()
 * @model extendedMetaData="name='InstanceValue' kind='elementOnly'"
 * @generated
 */
public interface InstanceValue extends ValueSpecification
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInstanceValue_Group7()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:28'"
	 * @generated
	 */
	FeatureMap getGroup7();

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.InstanceSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The instance that is the specified value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInstanceValue_Instance()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='instance' group='#group:28'"
	 * @generated
	 */
	EList<InstanceSpecification> getInstance();

	/**
	 * Returns the value of the '<em><b>Instance1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The instance that is the specified value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance1</em>' attribute.
	 * @see #setInstance1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInstanceValue_Instance1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='instance'"
	 * @generated
	 */
	String getInstance1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.InstanceValue#getInstance1 <em>Instance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance1</em>' attribute.
	 * @see #getInstance1()
	 * @generated
	 */
	void setInstance1(String value);

} // InstanceValue
