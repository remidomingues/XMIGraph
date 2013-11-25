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
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Each connector may be attached to two or more connectable elements, each representing a set of instances. Each connector end
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Connector#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Connector#getType1 <em>Type1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Connector#getRedefinedConnector <em>Redefined Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Connector#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Connector#getContract <em>Contract</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Connector#getContract1 <em>Contract1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Connector#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Connector#getRedefinedConnector1 <em>Redefined Connector1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Connector#getType2 <em>Type2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnector()
 * @model extendedMetaData="name='Connector' kind='elementOnly'"
 * @generated
 */
public interface Connector extends Feature
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnector_Group5()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:24'"
	 * @generated
	 */
	FeatureMap getGroup5();

	/**
	 * Returns the value of the '<em><b>Type1</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Association}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 An optional association that specifies the link corresponding to this connector.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type1</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnector_Type1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='type' group='#group:24'"
	 * @generated
	 */
	EList<Association> getType1();

	/**
	 * Returns the value of the '<em><b>Redefined Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 connector may be redefined when its containing classifier is specialized. The redefining connector may have a type that specializes the type of the redefined connector. The types of the connector ends of the redefining connector may specialize the types of the connector ends of the redefined connector. The properties of the connector ends of the redefining connector may be replaced. (Subsets Element.redefinedElement.)
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Connector</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnector_RedefinedConnector()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='redefinedConnector' group='#group:24'"
	 * @generated
	 */
	EList<Connector> getRedefinedConnector();

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ConnectorEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A connector consists of at two connector ends, each of which represents the participation of instances of the classifiers typing the connectable elements attached to this end. The set of connector ends is ordered. (Subsets Element.ownedElement.)
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnector_End()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='end' group='#group:24'"
	 * @generated
	 */
	EList<ConnectorEnd> getEnd();

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contract</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnector_Contract()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contract' group='#group:24'"
	 * @generated
	 */
	EList<Behavior> getContract();

	/**
	 * Returns the value of the '<em><b>Contract1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contract1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract1</em>' attribute.
	 * @see #setContract1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnector_Contract1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='contract'"
	 * @generated
	 */
	String getContract1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Connector#getContract1 <em>Contract1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract1</em>' attribute.
	 * @see #getContract1()
	 * @generated
	 */
	void setContract1(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2._1._0._0.uml.ConnectorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.ConnectorKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(ConnectorKind)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnector_Kind()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='kind'"
	 * @generated
	 */
	ConnectorKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Connector#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.ConnectorKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ConnectorKind value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Connector#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(ConnectorKind)
	 * @generated
	 */
	void unsetKind();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2._1._0._0.uml.Connector#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(ConnectorKind)
	 * @generated
	 */
	boolean isSetKind();

	/**
	 * Returns the value of the '<em><b>Redefined Connector1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               connector may be redefined when its containing classifier is specialized. The redefining connector may have a type that specializes the type of the redefined connector. The types of the connector ends of the redefining connector may specialize the types of the connector ends of the redefined connector. The properties of the connector ends of the redefining connector may be replaced. (Subsets Element.redefinedElement.)
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Connector1</em>' attribute.
	 * @see #setRedefinedConnector1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnector_RedefinedConnector1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='redefinedConnector'"
	 * @generated
	 */
	String getRedefinedConnector1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Connector#getRedefinedConnector1 <em>Redefined Connector1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined Connector1</em>' attribute.
	 * @see #getRedefinedConnector1()
	 * @generated
	 */
	void setRedefinedConnector1(String value);

	/**
	 * Returns the value of the '<em><b>Type2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               An optional association that specifies the link corresponding to this connector.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type2</em>' attribute.
	 * @see #setType2(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnector_Type2()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType2();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Connector#getType2 <em>Type2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type2</em>' attribute.
	 * @see #getType2()
	 * @generated
	 */
	void setType2(String value);

} // Connector
