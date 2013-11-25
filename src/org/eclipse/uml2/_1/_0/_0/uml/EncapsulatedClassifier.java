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
 * A representation of the model object '<em><b>Encapsulated Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Extends a classifier with the ability to own ports as specific and type checked interaction points.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.EncapsulatedClassifier#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.EncapsulatedClassifier#getOwnedPort <em>Owned Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getEncapsulatedClassifier()
 * @model extendedMetaData="name='EncapsulatedClassifier' kind='elementOnly'"
 * @generated
 */
public interface EncapsulatedClassifier extends StructuredClassifier
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getEncapsulatedClassifier_Group8()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:47'"
	 * @generated
	 */
	FeatureMap getGroup8();

	/**
	 * Returns the value of the '<em><b>Owned Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 References a set of ports that an encapsulated classifier owns. (Subsets Classifier.feature and Namespace.ownedMember.)
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Port</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getEncapsulatedClassifier_OwnedPort()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ownedPort' group='#group:47'"
	 * @generated
	 */
	EList<Port> getOwnedPort();

} // EncapsulatedClassifier
