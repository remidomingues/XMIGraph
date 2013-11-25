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
 * A representation of the model object '<em><b>Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A substitution is a relationship between two classifiers signifies that the substitutingClassifier complies with the contract specified by the contract classifier. This implies that instances of the substitutingClassifier are runtime substitutable where instances of the contract classifier are expected.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Substitution#getGroup9 <em>Group9</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Substitution#getContract <em>Contract</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Substitution#getContract1 <em>Contract1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getSubstitution()
 * @model extendedMetaData="name='Substitution' kind='elementOnly'"
 * @generated
 */
public interface Substitution extends Realization
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getSubstitution_Group9()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:35'"
	 * @generated
	 */
	FeatureMap getGroup9();

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (Specializes Dependency.target.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getSubstitution_Contract()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contract' group='#group:35'"
	 * @generated
	 */
	EList<Classifier> getContract();

	/**
	 * Returns the value of the '<em><b>Contract1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (Specializes Dependency.target.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract1</em>' attribute.
	 * @see #setContract1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getSubstitution_Contract1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='contract'"
	 * @generated
	 */
	String getContract1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Substitution#getContract1 <em>Contract1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract1</em>' attribute.
	 * @see #getContract1()
	 * @generated
	 */
	void setContract1(String value);

} // Substitution
