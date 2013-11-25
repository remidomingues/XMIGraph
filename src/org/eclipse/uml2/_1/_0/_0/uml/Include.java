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
 * A representation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Include is a DirectedRelationship between two use cases, implying that the behavior of the included use case is inserted into the behavior of the including use case. It is also a kind of NamedElement so that it can have a name in the context of its owning use case. The including use case may only depend on the result (value) of the included use case. This value is obtained as a result of the execution of the included use case. Note that the included use case is not optional, and is always required for the including use case to execute correctly.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Include#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Include#getAddition <em>Addition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Include#getAddition1 <em>Addition1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInclude()
 * @model extendedMetaData="name='Include' kind='elementOnly'"
 * @generated
 */
public interface Include extends NamedElement
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInclude_Group5()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:22'"
	 * @generated
	 */
	FeatureMap getGroup5();

	/**
	 * Returns the value of the '<em><b>Addition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.UseCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 References the use case that is to be included. (Specializes DirectedRelationship.target.)
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Addition</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInclude_Addition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addition' group='#group:22'"
	 * @generated
	 */
	EList<UseCase> getAddition();

	/**
	 * Returns the value of the '<em><b>Addition1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               References the use case that is to be included. (Specializes DirectedRelationship.target.)
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Addition1</em>' attribute.
	 * @see #setAddition1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInclude_Addition1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='addition'"
	 * @generated
	 */
	String getAddition1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Include#getAddition1 <em>Addition1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addition1</em>' attribute.
	 * @see #getAddition1()
	 * @generated
	 */
	void setAddition1(String value);

} // Include
