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
 * A representation of the model object '<em><b>Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Each Generalization is a binary relationship that relates a specific Classifier to a more general Classifier (i.e., a subclass).
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.GeneralizationSet#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.GeneralizationSet#getPowertype <em>Powertype</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.GeneralizationSet#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.GeneralizationSet#getGeneralization1 <em>Generalization1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.GeneralizationSet#getIsCovering <em>Is Covering</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.GeneralizationSet#getIsDisjoint <em>Is Disjoint</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.GeneralizationSet#getPowertype1 <em>Powertype1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getGeneralizationSet()
 * @model extendedMetaData="name='GeneralizationSet' kind='elementOnly'"
 * @generated
 */
public interface GeneralizationSet extends PackageableElement
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getGeneralizationSet_Group6()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:26'"
	 * @generated
	 */
	FeatureMap getGroup6();

	/**
	 * Returns the value of the '<em><b>Powertype</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powertype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powertype</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getGeneralizationSet_Powertype()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='powertype' group='#group:26'"
	 * @generated
	 */
	EList<Classifier> getPowertype();

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Generalization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getGeneralizationSet_Generalization()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='generalization' group='#group:26'"
	 * @generated
	 */
	EList<Generalization> getGeneralization();

	/**
	 * Returns the value of the '<em><b>Generalization1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization1</em>' attribute.
	 * @see #setGeneralization1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getGeneralizationSet_Generalization1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='generalization'"
	 * @generated
	 */
	String getGeneralization1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.GeneralizationSet#getGeneralization1 <em>Generalization1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generalization1</em>' attribute.
	 * @see #getGeneralization1()
	 * @generated
	 */
	void setGeneralization1(String value);

	/**
	 * Returns the value of the '<em><b>Is Covering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Indicates (via the associated Generalizations) whether or not the set of specific Classifiers are covering for a particular general classifier. When isCovering is true, every instance of a particular general Classifier is also an instance of at least one of its specific Classifiers for the GeneralizationSet. When isCovering is false, there are one or more instances of the particular general Classifier that are not instances of at least one of its specific Classifiers defined for the GeneralizationSet. For example, Person could have two Generalization relationships each with a different specific Classifier: Male Person and Female Person. This GeneralizationSet would be covering because every instance of Person would be an instance of Male Person or Female Person. In contrast, Person could have a three Generalization relationships involving three specific Classifiers: North AmericanPerson, Asian Person, and European Person. This GeneralizationSet would not be covering because there are instances of Person for which these three specific Classifiers do not apply. The first example, then, could be read: any Person would be specialized as either being a Male Person or a Female Person—and nothing else; the second could be read: any Person would be specialized as being North American Person, Asian Person, European Person, or something else.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Covering</em>' attribute.
	 * @see #setIsCovering(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getGeneralizationSet_IsCovering()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isCovering'"
	 * @generated
	 */
	String getIsCovering();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.GeneralizationSet#getIsCovering <em>Is Covering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Covering</em>' attribute.
	 * @see #getIsCovering()
	 * @generated
	 */
	void setIsCovering(String value);

	/**
	 * Returns the value of the '<em><b>Is Disjoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Indicates whether or not the set of specific Classifiers in a Generalization relationship have instance in common. If isDisjoint is true, the specific Classifiers for a particular GeneralizationSet have no members in common; that is, their intersection is empty. If isDisjoint is false, the specific Classifiers in a particular GeneralizationSet have one or more members in common; that is, their intersection is not empty. For example, Person could have two Generalization relationships, each with the different specific Classifier: Manager or Staff. This would be disjoint because every instance of Person must either be a Manager or Staff. In contrast, Person could have two Generalization relationships involving two specific (and non-covering) Classifiers: Sales Person and Manager. This Generalization- Set would not be disjoint because there are instances of Person which can be a Sales Person and a Manager.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Disjoint</em>' attribute.
	 * @see #setIsDisjoint(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getGeneralizationSet_IsDisjoint()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isDisjoint'"
	 * @generated
	 */
	String getIsDisjoint();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.GeneralizationSet#getIsDisjoint <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Disjoint</em>' attribute.
	 * @see #getIsDisjoint()
	 * @generated
	 */
	void setIsDisjoint(String value);

	/**
	 * Returns the value of the '<em><b>Powertype1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powertype1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powertype1</em>' attribute.
	 * @see #setPowertype1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getGeneralizationSet_Powertype1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='powertype'"
	 * @generated
	 */
	String getPowertype1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.GeneralizationSet#getPowertype1 <em>Powertype1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powertype1</em>' attribute.
	 * @see #getPowertype1()
	 * @generated
	 */
	void setPowertype1(String value);

} // GeneralizationSet
