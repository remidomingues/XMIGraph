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
 * A representation of the model object '<em><b>Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         TemplateParameter references a ParameterableElement which is exposed as a formal template parameter in the containing template.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TemplateParameter#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TemplateParameter#getParameteredElement <em>Parametered Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TemplateParameter#getOwnedParameteredElement <em>Owned Parametered Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TemplateParameter#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TemplateParameter#getOwnedDefault <em>Owned Default</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TemplateParameter#getDefault1 <em>Default1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TemplateParameter#getParameteredElement1 <em>Parametered Element1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTemplateParameter()
 * @model extendedMetaData="name='TemplateParameter' kind='elementOnly'"
 * @generated
 */
public interface TemplateParameter extends Element
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTemplateParameter_Group3()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:13'"
	 * @generated
	 */
	FeatureMap getGroup3();

	/**
	 * Returns the value of the '<em><b>Parametered Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ParameterableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametered Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametered Element</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTemplateParameter_ParameteredElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='parameteredElement' group='#group:13'"
	 * @generated
	 */
	EList<ParameterableElement> getParameteredElement();

	/**
	 * Returns the value of the '<em><b>Owned Parametered Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ParameterableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parametered Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parametered Element</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTemplateParameter_OwnedParameteredElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ownedParameteredElement' group='#group:13'"
	 * @generated
	 */
	EList<ParameterableElement> getOwnedParameteredElement();

	/**
	 * Returns the value of the '<em><b>Default</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ParameterableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 element that is the default for this formal template parameter.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTemplateParameter_Default()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='default' group='#group:13'"
	 * @generated
	 */
	EList<ParameterableElement> getDefault();

	/**
	 * Returns the value of the '<em><b>Owned Default</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ParameterableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Default</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Default</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTemplateParameter_OwnedDefault()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ownedDefault' group='#group:13'"
	 * @generated
	 */
	EList<ParameterableElement> getOwnedDefault();

	/**
	 * Returns the value of the '<em><b>Default1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               element that is the default for this formal template parameter.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default1</em>' attribute.
	 * @see #setDefault1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTemplateParameter_Default1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='default'"
	 * @generated
	 */
	String getDefault1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.TemplateParameter#getDefault1 <em>Default1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default1</em>' attribute.
	 * @see #getDefault1()
	 * @generated
	 */
	void setDefault1(String value);

	/**
	 * Returns the value of the '<em><b>Parametered Element1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametered Element1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametered Element1</em>' attribute.
	 * @see #setParameteredElement1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTemplateParameter_ParameteredElement1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='parameteredElement'"
	 * @generated
	 */
	String getParameteredElement1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.TemplateParameter#getParameteredElement1 <em>Parametered Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametered Element1</em>' attribute.
	 * @see #getParameteredElement1()
	 * @generated
	 */
	void setParameteredElement1(String value);

} // TemplateParameter
