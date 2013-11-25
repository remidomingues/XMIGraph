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
 * A representation of the model object '<em><b>Clear Association Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         This action destroys all links of an association that have a particular object at one end.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ClearAssociationAction#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ClearAssociationAction#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ClearAssociationAction#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ClearAssociationAction#getAssociation1 <em>Association1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClearAssociationAction()
 * @model extendedMetaData="name='ClearAssociationAction' kind='elementOnly'"
 * @generated
 */
public interface ClearAssociationAction extends Action
{
	/**
	 * Returns the value of the '<em><b>Group8</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group8</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group8</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClearAssociationAction_Group8()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:40'"
	 * @generated
	 */
	FeatureMap getGroup8();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 (Specialized from Action:input) Gives the input pin from which is obtained the object whose participation in the association is to be cleared.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClearAssociationAction_Object()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object' group='#group:40'"
	 * @generated
	 */
	EList<InputPin> getObject();

	/**
	 * Returns the value of the '<em><b>Association</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Association}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Association to be cleared.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClearAssociationAction_Association()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='association' group='#group:40'"
	 * @generated
	 */
	EList<Association> getAssociation();

	/**
	 * Returns the value of the '<em><b>Association1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Association to be cleared.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association1</em>' attribute.
	 * @see #setAssociation1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClearAssociationAction_Association1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='association'"
	 * @generated
	 */
	String getAssociation1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ClearAssociationAction#getAssociation1 <em>Association1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association1</em>' attribute.
	 * @see #getAssociation1()
	 * @generated
	 */
	void setAssociation1(String value);

} // ClearAssociationAction
