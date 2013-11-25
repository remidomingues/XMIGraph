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
 * A representation of the model object '<em><b>Association Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         In the metamodel, an AssociationClass is a declaration of a semantic relationship between Classifiers, which has a set of features of its own. AssociationClass is both an Association and a Class.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.AssociationClass#getGroup9 <em>Group9</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.AssociationClass#getOwnedEnd <em>Owned End</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.AssociationClass#getMemberEnd <em>Member End</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.AssociationClass#getIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.AssociationClass#getMemberEnd1 <em>Member End1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getAssociationClass()
 * @model extendedMetaData="name='AssociationClass' kind='elementOnly'"
 * @generated
 */
public interface AssociationClass extends org.eclipse.uml2._1._0._0.uml.Class
{
	/**
	 * Returns the value of the '<em><b>Group9</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group9</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group9</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getAssociationClass_Group9()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:59'"
	 * @generated
	 */
	FeatureMap getGroup9();

	/**
	 * Returns the value of the '<em><b>Owned End</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The non-navigable ends that are owned by the association itself. This is an ordered association. Subsets Association::memberEnd, Classifier::feature, and Namespace::owned- Member.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned End</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getAssociationClass_OwnedEnd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ownedEnd' group='#group:59'"
	 * @generated
	 */
	EList<Property> getOwnedEnd();

	/**
	 * Returns the value of the '<em><b>Member End</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Each end represents participation of instances of the classifier connected to the end in links of the association. This is an ordered association. Subsets Namespace::member.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member End</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getAssociationClass_MemberEnd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='memberEnd' group='#group:59'"
	 * @generated
	 */
	EList<Property> getMemberEnd();

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Specifies whether the association is derived from other model elements such as other associations or constraints. The default value is false.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getAssociationClass_IsDerived()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isDerived'"
	 * @generated
	 */
	String getIsDerived();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.AssociationClass#getIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #getIsDerived()
	 * @generated
	 */
	void setIsDerived(String value);

	/**
	 * Returns the value of the '<em><b>Member End1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Each end represents participation of instances of the classifier connected to the end in links of the association. This is an ordered association. Subsets Namespace::member.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member End1</em>' attribute.
	 * @see #setMemberEnd1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getAssociationClass_MemberEnd1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='memberEnd'"
	 * @generated
	 */
	String getMemberEnd1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.AssociationClass#getMemberEnd1 <em>Member End1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member End1</em>' attribute.
	 * @see #getMemberEnd1()
	 * @generated
	 */
	void setMemberEnd1(String value);

} // AssociationClass
