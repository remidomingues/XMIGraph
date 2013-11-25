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
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A generalization relates a specific classifier to a more general classifier, and is owned by the specific classifier. Package PowerTypes (“PowerTypes” on page 109) A generalization can be designated as being a member of a particular generalization set.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Generalization#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Generalization#getGeneral <em>General</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Generalization#getGeneralizationSet <em>Generalization Set</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Generalization#getGeneral1 <em>General1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Generalization#getGeneralizationSet1 <em>Generalization Set1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Generalization#getIsSubstitutable <em>Is Substitutable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getGeneralization()
 * @model extendedMetaData="name='Generalization' kind='elementOnly'"
 * @generated
 */
public interface Generalization extends DirectedRelationship
{
	/**
	 * Returns the value of the '<em><b>Group3</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group3</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getGeneralization_Group3()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:13'"
	 * @generated
	 */
	FeatureMap getGroup3();

	/**
	 * Returns the value of the '<em><b>General</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 References the general classifier in the Generalization relationship. Subsets DirectedRelationship::target.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getGeneralization_General()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='general' group='#group:13'"
	 * @generated
	 */
	EList<Classifier> getGeneral();

	/**
	 * Returns the value of the '<em><b>Generalization Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.GeneralizationSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization Set</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getGeneralization_GeneralizationSet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='generalizationSet' group='#group:13'"
	 * @generated
	 */
	EList<GeneralizationSet> getGeneralizationSet();

	/**
	 * Returns the value of the '<em><b>General1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               References the general classifier in the Generalization relationship. Subsets DirectedRelationship::target.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General1</em>' attribute.
	 * @see #setGeneral1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getGeneralization_General1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='general'"
	 * @generated
	 */
	String getGeneral1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Generalization#getGeneral1 <em>General1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General1</em>' attribute.
	 * @see #getGeneral1()
	 * @generated
	 */
	void setGeneral1(String value);

	/**
	 * Returns the value of the '<em><b>Generalization Set1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization Set1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization Set1</em>' attribute.
	 * @see #setGeneralizationSet1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getGeneralization_GeneralizationSet1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='generalizationSet'"
	 * @generated
	 */
	String getGeneralizationSet1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Generalization#getGeneralizationSet1 <em>Generalization Set1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generalization Set1</em>' attribute.
	 * @see #getGeneralizationSet1()
	 * @generated
	 */
	void setGeneralizationSet1(String value);

	/**
	 * Returns the value of the '<em><b>Is Substitutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Indicates whether the specific classifier can be used whereever the general classifier can be used. If true, the execution traces of the specific classifier will be a superset of the execution traces of the general classifier.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Substitutable</em>' attribute.
	 * @see #setIsSubstitutable(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getGeneralization_IsSubstitutable()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isSubstitutable'"
	 * @generated
	 */
	String getIsSubstitutable();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Generalization#getIsSubstitutable <em>Is Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Substitutable</em>' attribute.
	 * @see #getIsSubstitutable()
	 * @generated
	 */
	void setIsSubstitutable(String value);

} // Generalization
