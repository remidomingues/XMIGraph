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
 * A representation of the model object '<em><b>Redefinable Template Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         RedefinableTemplateSignature specializes both TemplateSignature and RedefinableElement in order to allow the addition of new formal template parameters in the context of a specializing template Classifier.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.RedefinableTemplateSignature#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.RedefinableTemplateSignature#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.RedefinableTemplateSignature#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.RedefinableTemplateSignature#getNestedSignature <em>Nested Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.RedefinableTemplateSignature#getNestingSignature <em>Nesting Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.RedefinableTemplateSignature#getNestedSignature1 <em>Nested Signature1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.RedefinableTemplateSignature#getNestingSignature1 <em>Nesting Signature1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.RedefinableTemplateSignature#getParameter1 <em>Parameter1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getRedefinableTemplateSignature()
 * @model extendedMetaData="name='RedefinableTemplateSignature' kind='elementOnly'"
 * @generated
 */
public interface RedefinableTemplateSignature extends RedefinableElement
{
	/**
	 * Returns the value of the '<em><b>Group5</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group5</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group5</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getRedefinableTemplateSignature_Group5()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:23'"
	 * @generated
	 */
	FeatureMap getGroup5();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.TemplateParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The complete set of formal template parameters for this template signature.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getRedefinableTemplateSignature_Parameter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='parameter' group='#group:23'"
	 * @generated
	 */
	EList<TemplateParameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.TemplateParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The formal template parameters that are owned by this template signature. Subsets parameter and Element::ownedElement.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getRedefinableTemplateSignature_OwnedParameter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ownedParameter' group='#group:23'"
	 * @generated
	 */
	EList<TemplateParameter> getOwnedParameter();

	/**
	 * Returns the value of the '<em><b>Nested Signature</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.TemplateSignature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Signature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Signature</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getRedefinableTemplateSignature_NestedSignature()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nestedSignature' group='#group:23'"
	 * @generated
	 */
	EList<TemplateSignature> getNestedSignature();

	/**
	 * Returns the value of the '<em><b>Nesting Signature</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.TemplateSignature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nesting Signature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nesting Signature</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getRedefinableTemplateSignature_NestingSignature()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nestingSignature' group='#group:23'"
	 * @generated
	 */
	EList<TemplateSignature> getNestingSignature();

	/**
	 * Returns the value of the '<em><b>Nested Signature1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Signature1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Signature1</em>' attribute.
	 * @see #setNestedSignature1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getRedefinableTemplateSignature_NestedSignature1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='nestedSignature'"
	 * @generated
	 */
	String getNestedSignature1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.RedefinableTemplateSignature#getNestedSignature1 <em>Nested Signature1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nested Signature1</em>' attribute.
	 * @see #getNestedSignature1()
	 * @generated
	 */
	void setNestedSignature1(String value);

	/**
	 * Returns the value of the '<em><b>Nesting Signature1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nesting Signature1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nesting Signature1</em>' attribute.
	 * @see #setNestingSignature1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getRedefinableTemplateSignature_NestingSignature1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='nestingSignature'"
	 * @generated
	 */
	String getNestingSignature1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.RedefinableTemplateSignature#getNestingSignature1 <em>Nesting Signature1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nesting Signature1</em>' attribute.
	 * @see #getNestingSignature1()
	 * @generated
	 */
	void setNestingSignature1(String value);

	/**
	 * Returns the value of the '<em><b>Parameter1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The complete set of formal template parameters for this template signature.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter1</em>' attribute.
	 * @see #setParameter1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getRedefinableTemplateSignature_Parameter1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='parameter'"
	 * @generated
	 */
	String getParameter1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.RedefinableTemplateSignature#getParameter1 <em>Parameter1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter1</em>' attribute.
	 * @see #getParameter1()
	 * @generated
	 */
	void setParameter1(String value);

} // RedefinableTemplateSignature
