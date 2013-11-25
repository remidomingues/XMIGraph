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
 * A representation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A connector end is an endpoint of a connector, which attaches the connector to a connectable element. Each connector end is part of one connector.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ConnectorEnd#getGroup4 <em>Group4</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ConnectorEnd#getRole <em>Role</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ConnectorEnd#getPartWithPort <em>Part With Port</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ConnectorEnd#getPartWithPort1 <em>Part With Port1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ConnectorEnd#getRole1 <em>Role1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnectorEnd()
 * @model extendedMetaData="name='ConnectorEnd' kind='elementOnly'"
 * @generated
 */
public interface ConnectorEnd extends MultiplicityElement
{
	/**
	 * Returns the value of the '<em><b>Group4</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group4</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnectorEnd_Group4()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:18'"
	 * @generated
	 */
	FeatureMap getGroup4();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ConnectableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The connectable element attached at this connector end. When an instance of the containing classifier is created, a link may (depending on the multiplicities) be created to an instance of the classifier that types this connectable element.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnectorEnd_Role()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='role' group='#group:18'"
	 * @generated
	 */
	EList<ConnectableElement> getRole();

	/**
	 * Returns the value of the '<em><b>Part With Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part With Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part With Port</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnectorEnd_PartWithPort()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='partWithPort' group='#group:18'"
	 * @generated
	 */
	EList<Property> getPartWithPort();

	/**
	 * Returns the value of the '<em><b>Part With Port1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part With Port1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part With Port1</em>' attribute.
	 * @see #setPartWithPort1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnectorEnd_PartWithPort1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='partWithPort'"
	 * @generated
	 */
	String getPartWithPort1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ConnectorEnd#getPartWithPort1 <em>Part With Port1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part With Port1</em>' attribute.
	 * @see #getPartWithPort1()
	 * @generated
	 */
	void setPartWithPort1(String value);

	/**
	 * Returns the value of the '<em><b>Role1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The connectable element attached at this connector end. When an instance of the containing classifier is created, a link may (depending on the multiplicities) be created to an instance of the classifier that types this connectable element.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role1</em>' attribute.
	 * @see #setRole1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnectorEnd_Role1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='role'"
	 * @generated
	 */
	String getRole1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ConnectorEnd#getRole1 <em>Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role1</em>' attribute.
	 * @see #getRole1()
	 * @generated
	 */
	void setRole1(String value);

} // ConnectorEnd
