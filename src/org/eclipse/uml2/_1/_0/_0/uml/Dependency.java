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
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A dependency is a relationship that signifies that a single or a set of model elements requires other model elements for their specification or implementation. This means that the complete semantics of the depending elements is either semantically or structurally dependent on the definition of the supplier element(s).
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Dependency#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Dependency#getClient <em>Client</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Dependency#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Dependency#getClient1 <em>Client1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Dependency#getSupplier1 <em>Supplier1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getDependency()
 * @model extendedMetaData="name='Dependency' kind='elementOnly'"
 * @generated
 */
public interface Dependency extends PackageableElement
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getDependency_Group6()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:26'"
	 * @generated
	 */
	FeatureMap getGroup6();

	/**
	 * Returns the value of the '<em><b>Client</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The element that is affected by the supplier element. In some cases (such as a Trace Abstraction) the direction is unimportant and serves only to distinguish the two elements.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getDependency_Client()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='client' group='#group:26'"
	 * @generated
	 */
	EList<NamedElement> getClient();

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Designates the element that is unaffected by a change. In a two-way relationship (such as some Refinement Abstractions) this would be the more general element. In an undirected situation, such as a Trace Abstraction, the choice of client and supplier is not relevant.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplier</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getDependency_Supplier()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='supplier' group='#group:26'"
	 * @generated
	 */
	EList<NamedElement> getSupplier();

	/**
	 * Returns the value of the '<em><b>Client1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The element that is affected by the supplier element. In some cases (such as a Trace Abstraction) the direction is unimportant and serves only to distinguish the two elements.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client1</em>' attribute.
	 * @see #setClient1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getDependency_Client1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='client'"
	 * @generated
	 */
	String getClient1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Dependency#getClient1 <em>Client1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client1</em>' attribute.
	 * @see #getClient1()
	 * @generated
	 */
	void setClient1(String value);

	/**
	 * Returns the value of the '<em><b>Supplier1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Designates the element that is unaffected by a change. In a two-way relationship (such as some Refinement Abstractions) this would be the more general element. In an undirected situation, such as a Trace Abstraction, the choice of client and supplier is not relevant.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplier1</em>' attribute.
	 * @see #setSupplier1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getDependency_Supplier1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='supplier'"
	 * @generated
	 */
	String getSupplier1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Dependency#getSupplier1 <em>Supplier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier1</em>' attribute.
	 * @see #getSupplier1()
	 * @generated
	 */
	void setSupplier1(String value);

} // Dependency
