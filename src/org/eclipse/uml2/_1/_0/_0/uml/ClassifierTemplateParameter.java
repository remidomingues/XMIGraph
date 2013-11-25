/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.uml2._1._0._0.uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         ClassifierTemplateParameter is a template parameter where the parametered element is a Classifier in its capacity of being a kind of ParameterableElement.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ClassifierTemplateParameter#getAllowSubstitutable <em>Allow Substitutable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClassifierTemplateParameter()
 * @model extendedMetaData="name='ClassifierTemplateParameter' kind='elementOnly'"
 * @generated
 */
public interface ClassifierTemplateParameter extends TemplateParameter
{
	/**
	 * Returns the value of the '<em><b>Allow Substitutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               the required relationship between an actual parameter and the parameteredElement for this formal parameter. Default is true.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Substitutable</em>' attribute.
	 * @see #setAllowSubstitutable(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClassifierTemplateParameter_AllowSubstitutable()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowSubstitutable'"
	 * @generated
	 */
	String getAllowSubstitutable();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ClassifierTemplateParameter#getAllowSubstitutable <em>Allow Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Substitutable</em>' attribute.
	 * @see #getAllowSubstitutable()
	 * @generated
	 */
	void setAllowSubstitutable(String value);

} // ClassifierTemplateParameter
