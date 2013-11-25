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
 * A representation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A collaboration is represented as a kind of classifier and defines a set of cooperating entities to be played by instances (its roles), as well as a set of connectors that define communication paths between the participating instances. The cooperating entities are the properties of the collaboration. A collaboration specifies a view (or projection) of a set of cooperating classifiers. It describes the required links between instances that play the roles of the collaboration, as well as the features required of the classifiers that specify the participating instances. Several collaborations may describe different projections of the same set of classifiers.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Collaboration#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Collaboration#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Collaboration#getOwnedConnector <em>Owned Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Collaboration#getCollaborationRole <em>Collaboration Role</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Collaboration#getCollaborationRole1 <em>Collaboration Role1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getCollaboration()
 * @model extendedMetaData="name='Collaboration' kind='elementOnly'"
 * @generated
 */
public interface Collaboration extends BehavioredClassifier
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getCollaboration_Group8()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup8();

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 References the properties owned by the classifier. (Subsets StructuredClassifier.role, Classifier. attribute,and Namespace.ownedMember)
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getCollaboration_OwnedAttribute()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ownedAttribute' group='#group:0'"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Owned Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 References the connectors owned by the classifier. (Subsets Classifier.feature and Namespace.ownedMember)
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Connector</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getCollaboration_OwnedConnector()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ownedConnector' group='#group:0'"
	 * @generated
	 */
	EList<Connector> getOwnedConnector();

	/**
	 * Returns the value of the '<em><b>Collaboration Role</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ConnectableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collaboration Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaboration Role</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getCollaboration_CollaborationRole()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='collaborationRole' group='#group:0'"
	 * @generated
	 */
	EList<ConnectableElement> getCollaborationRole();

	/**
	 * Returns the value of the '<em><b>Collaboration Role1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collaboration Role1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaboration Role1</em>' attribute.
	 * @see #setCollaborationRole1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getCollaboration_CollaborationRole1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='collaborationRole'"
	 * @generated
	 */
	String getCollaborationRole1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Collaboration#getCollaborationRole1 <em>Collaboration Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collaboration Role1</em>' attribute.
	 * @see #getCollaborationRole1()
	 * @generated
	 */
	void setCollaborationRole1(String value);

} // Collaboration
