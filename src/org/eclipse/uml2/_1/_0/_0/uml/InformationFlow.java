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
 * A representation of the model object '<em><b>Information Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         An Information Flow specifies that one or more information items circulate from its sources to its targets. Information flows require some kind of “information channel” for transmitting information items from the source to the destination. An information channel is repersented in various ways depending on the nature of its sources and targets. It may be represented by connectors, links, associations, or even dependencies. For example, if the source and destination are parts in some composite structure such as a collaboration, then the information channel is likely to be represented by a connector between them. Or, if the source and target are objects (which are a kind of InstanceSpecification), they may be represented by a link that joins the two, and so on.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InformationFlow#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InformationFlow#getRealization <em>Realization</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InformationFlow#getConveyed <em>Conveyed</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InformationFlow#getConveyed1 <em>Conveyed1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InformationFlow#getRealization1 <em>Realization1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInformationFlow()
 * @model extendedMetaData="name='InformationFlow' kind='elementOnly'"
 * @generated
 */
public interface InformationFlow extends PackageableElement
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInformationFlow_Group6()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:26'"
	 * @generated
	 */
	FeatureMap getGroup6();

	/**
	 * Returns the value of the '<em><b>Realization</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 : Determines which Relationship will realize the specified flow
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realization</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInformationFlow_Realization()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='realization' group='#group:26'"
	 * @generated
	 */
	EList<Relationship> getRealization();

	/**
	 * Returns the value of the '<em><b>Conveyed</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 : Specifies the information items that may circulate on this information flow.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conveyed</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInformationFlow_Conveyed()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conveyed' group='#group:26'"
	 * @generated
	 */
	EList<Classifier> getConveyed();

	/**
	 * Returns the value of the '<em><b>Conveyed1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               : Specifies the information items that may circulate on this information flow.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conveyed1</em>' attribute.
	 * @see #setConveyed1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInformationFlow_Conveyed1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='conveyed'"
	 * @generated
	 */
	String getConveyed1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.InformationFlow#getConveyed1 <em>Conveyed1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conveyed1</em>' attribute.
	 * @see #getConveyed1()
	 * @generated
	 */
	void setConveyed1(String value);

	/**
	 * Returns the value of the '<em><b>Realization1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               : Determines which Relationship will realize the specified flow
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realization1</em>' attribute.
	 * @see #setRealization1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInformationFlow_Realization1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='realization'"
	 * @generated
	 */
	String getRealization1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.InformationFlow#getRealization1 <em>Realization1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realization1</em>' attribute.
	 * @see #getRealization1()
	 * @generated
	 */
	void setRealization1(String value);

} // InformationFlow
