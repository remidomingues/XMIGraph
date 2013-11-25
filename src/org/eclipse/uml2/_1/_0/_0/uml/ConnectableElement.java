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
 * A representation of the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A ConnectableElement is an abstract metaclass representing a set of instances that are owned by a containing classifier instance. Connectable elements may be joined by attached connectors and specify configurations of linked instances to be created within an instance of the containing classifier.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ConnectableElement#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ConnectableElement#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ConnectableElement#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ConnectableElement#getEnd1 <em>End1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ConnectableElement#getTemplateParameter1 <em>Template Parameter1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnectableElement()
 * @model extendedMetaData="name='ConnectableElement' kind='elementOnly'"
 * @generated
 */
public interface ConnectableElement extends NamedElement
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnectableElement_Group5()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:22'"
	 * @generated
	 */
	FeatureMap getGroup5();

	/**
	 * Returns the value of the '<em><b>Template Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.TemplateParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Parameter</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnectableElement_TemplateParameter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='templateParameter' group='#group:22'"
	 * @generated
	 */
	EList<TemplateParameter> getTemplateParameter();

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ConnectorEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Denotes a connector that attaches to this connectable element.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnectableElement_End()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='end' group='#group:22'"
	 * @generated
	 */
	EList<ConnectorEnd> getEnd();

	/**
	 * Returns the value of the '<em><b>End1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Denotes a connector that attaches to this connectable element.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End1</em>' attribute.
	 * @see #setEnd1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnectableElement_End1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='end'"
	 * @generated
	 */
	String getEnd1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ConnectableElement#getEnd1 <em>End1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End1</em>' attribute.
	 * @see #getEnd1()
	 * @generated
	 */
	void setEnd1(String value);

	/**
	 * Returns the value of the '<em><b>Template Parameter1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Parameter1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Parameter1</em>' attribute.
	 * @see #setTemplateParameter1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConnectableElement_TemplateParameter1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='templateParameter'"
	 * @generated
	 */
	String getTemplateParameter1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ConnectableElement#getTemplateParameter1 <em>Template Parameter1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Parameter1</em>' attribute.
	 * @see #getTemplateParameter1()
	 * @generated
	 */
	void setTemplateParameter1(String value);

} // ConnectableElement
