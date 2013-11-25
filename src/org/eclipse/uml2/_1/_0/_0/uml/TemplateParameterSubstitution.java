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
 * A representation of the model object '<em><b>Template Parameter Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         TemplateParameterSubstitution associates one or more actual parameters with a formal template parameter within the context of a TemplateBinding.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TemplateParameterSubstitution#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TemplateParameterSubstitution#getFormal <em>Formal</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TemplateParameterSubstitution#getActual <em>Actual</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TemplateParameterSubstitution#getOwnedActual <em>Owned Actual</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TemplateParameterSubstitution#getActual1 <em>Actual1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TemplateParameterSubstitution#getFormal1 <em>Formal1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTemplateParameterSubstitution()
 * @model extendedMetaData="name='TemplateParameterSubstitution' kind='elementOnly'"
 * @generated
 */
public interface TemplateParameterSubstitution extends Element
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTemplateParameterSubstitution_Group3()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:13'"
	 * @generated
	 */
	FeatureMap getGroup3();

	/**
	 * Returns the value of the '<em><b>Formal</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.TemplateParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The formal template parameter that is associated with this substitution.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formal</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTemplateParameterSubstitution_Formal()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='formal' group='#group:13'"
	 * @generated
	 */
	EList<TemplateParameter> getFormal();

	/**
	 * Returns the value of the '<em><b>Actual</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ParameterableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 elements that are the actual parameters for this substitution.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTemplateParameterSubstitution_Actual()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='actual' group='#group:13'"
	 * @generated
	 */
	EList<ParameterableElement> getActual();

	/**
	 * Returns the value of the '<em><b>Owned Actual</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ParameterableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The actual parameters that are owned by this substitution. Subsets Element:: ownedElement and actual.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Actual</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTemplateParameterSubstitution_OwnedActual()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ownedActual' group='#group:13'"
	 * @generated
	 */
	EList<ParameterableElement> getOwnedActual();

	/**
	 * Returns the value of the '<em><b>Actual1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               elements that are the actual parameters for this substitution.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual1</em>' attribute.
	 * @see #setActual1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTemplateParameterSubstitution_Actual1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='actual'"
	 * @generated
	 */
	String getActual1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.TemplateParameterSubstitution#getActual1 <em>Actual1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual1</em>' attribute.
	 * @see #getActual1()
	 * @generated
	 */
	void setActual1(String value);

	/**
	 * Returns the value of the '<em><b>Formal1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The formal template parameter that is associated with this substitution.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formal1</em>' attribute.
	 * @see #setFormal1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTemplateParameterSubstitution_Formal1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='formal'"
	 * @generated
	 */
	String getFormal1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.TemplateParameterSubstitution#getFormal1 <em>Formal1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal1</em>' attribute.
	 * @see #getFormal1()
	 * @generated
	 */
	void setFormal1(String value);

} // TemplateParameterSubstitution
