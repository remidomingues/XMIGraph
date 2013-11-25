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
 * A representation of the model object '<em><b>Manifestation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         In the metamodel, a Manifestation is a subtype of Abstraction. A Manifestation is owned by an Artifact.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Manifestation#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Manifestation#getUtilizedElement <em>Utilized Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Manifestation#getUtilizedElement1 <em>Utilized Element1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getManifestation()
 * @model extendedMetaData="name='Manifestation' kind='elementOnly'"
 * @generated
 */
public interface Manifestation extends Abstraction
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getManifestation_Group8()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:32'"
	 * @generated
	 */
	FeatureMap getGroup8();

	/**
	 * Returns the value of the '<em><b>Utilized Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The model element that is utilized in the manifestation in an Artifact. This association specializes the supplier association.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Utilized Element</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getManifestation_UtilizedElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='utilizedElement' group='#group:32'"
	 * @generated
	 */
	EList<PackageableElement> getUtilizedElement();

	/**
	 * Returns the value of the '<em><b>Utilized Element1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The model element that is utilized in the manifestation in an Artifact. This association specializes the supplier association.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Utilized Element1</em>' attribute.
	 * @see #setUtilizedElement1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getManifestation_UtilizedElement1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='utilizedElement'"
	 * @generated
	 */
	String getUtilizedElement1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Manifestation#getUtilizedElement1 <em>Utilized Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilized Element1</em>' attribute.
	 * @see #getUtilizedElement1()
	 * @generated
	 */
	void setUtilizedElement1(String value);

} // Manifestation
