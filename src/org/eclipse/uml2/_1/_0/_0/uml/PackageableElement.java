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
 * A representation of the model object '<em><b>Packageable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A packageable element indicates a named element that may be owned directly by a package.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.PackageableElement#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.PackageableElement#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.PackageableElement#getPackageableElementVisibility <em>Packageable Element Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.PackageableElement#getTemplateParameter1 <em>Template Parameter1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackageableElement()
 * @model extendedMetaData="name='PackageableElement' kind='elementOnly'"
 * @generated
 */
public interface PackageableElement extends NamedElement
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackageableElement_Group5()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:22'"
	 * @generated
	 */
	FeatureMap getGroup5();

	/**
	 * Returns the value of the '<em><b>Template Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.TemplateParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Parameter</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackageableElement_TemplateParameter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='templateParameter' group='#group:22'"
	 * @generated
	 */
	EList<TemplateParameter> getTemplateParameter();

	/**
	 * Returns the value of the '<em><b>Packageable Element Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2._1._0._0.uml.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Indicates that packageable elements must always have a visibility, i.e., visibility is not optional. Redefines NamedElement::visibility.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packageable Element Visibility</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.VisibilityKind
	 * @see #isSetPackageableElementVisibility()
	 * @see #unsetPackageableElementVisibility()
	 * @see #setPackageableElementVisibility(VisibilityKind)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackageableElement_PackageableElementVisibility()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='packageableElement_visibility'"
	 * @generated
	 */
	VisibilityKind getPackageableElementVisibility();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.PackageableElement#getPackageableElementVisibility <em>Packageable Element Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packageable Element Visibility</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.VisibilityKind
	 * @see #isSetPackageableElementVisibility()
	 * @see #unsetPackageableElementVisibility()
	 * @see #getPackageableElementVisibility()
	 * @generated
	 */
	void setPackageableElementVisibility(VisibilityKind value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2._1._0._0.uml.PackageableElement#getPackageableElementVisibility <em>Packageable Element Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPackageableElementVisibility()
	 * @see #getPackageableElementVisibility()
	 * @see #setPackageableElementVisibility(VisibilityKind)
	 * @generated
	 */
	void unsetPackageableElementVisibility();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2._1._0._0.uml.PackageableElement#getPackageableElementVisibility <em>Packageable Element Visibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Packageable Element Visibility</em>' attribute is set.
	 * @see #unsetPackageableElementVisibility()
	 * @see #getPackageableElementVisibility()
	 * @see #setPackageableElementVisibility(VisibilityKind)
	 * @generated
	 */
	boolean isSetPackageableElementVisibility();

	/**
	 * Returns the value of the '<em><b>Template Parameter1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Parameter1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Parameter1</em>' attribute.
	 * @see #setTemplateParameter1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackageableElement_TemplateParameter1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='templateParameter'"
	 * @generated
	 */
	String getTemplateParameter1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.PackageableElement#getTemplateParameter1 <em>Template Parameter1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Parameter1</em>' attribute.
	 * @see #getTemplateParameter1()
	 * @generated
	 */
	void setTemplateParameter1(String value);

} // PackageableElement
