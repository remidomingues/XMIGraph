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
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A comment gives the ability to attach various remarks to elements. A comment carries no semantic force, but may contain information that is useful to a modeler. A comment can be owned by any element.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Comment#getGroup4 <em>Group4</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Comment#getAnnotatedElement <em>Annotated Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Comment#getBodyExpression <em>Body Expression</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Comment#getAnnotatedElement1 <em>Annotated Element1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Comment#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getComment()
 * @model extendedMetaData="name='Comment' kind='elementOnly'"
 * @generated
 */
public interface Comment extends TemplateableElement
{
	/**
	 * Returns the value of the '<em><b>Group4</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group4</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getComment_Group4()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup4();

	/**
	 * Returns the value of the '<em><b>Annotated Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Element(s) being commented.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotated Element</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getComment_AnnotatedElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='annotatedElement' group='#group:0'"
	 * @generated
	 */
	EList<Element> getAnnotatedElement();

	/**
	 * Returns the value of the '<em><b>Body Expression</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.StringExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Expression</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getComment_BodyExpression()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bodyExpression' group='#group:0'"
	 * @generated
	 */
	EList<StringExpression> getBodyExpression();

	/**
	 * Returns the value of the '<em><b>Annotated Element1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Element(s) being commented.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotated Element1</em>' attribute.
	 * @see #setAnnotatedElement1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getComment_AnnotatedElement1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='annotatedElement'"
	 * @generated
	 */
	String getAnnotatedElement1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Comment#getAnnotatedElement1 <em>Annotated Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated Element1</em>' attribute.
	 * @see #getAnnotatedElement1()
	 * @generated
	 */
	void setAnnotatedElement1(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a string that is the comment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getComment_Body()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='body'"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Comment#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

} // Comment
