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
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A package is a namespace for its members, and may contain other packages. Only packageable elements can be owned members of a package. By virtue of being a namespace, a package can import either individual members of other packages, or all the members of other packages. In addition a package can be merged with other packages.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Package#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Package#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Package#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Package#getPackageMerge <em>Package Merge</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Package#getAppliedProfile <em>Applied Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Package#getPackageExtension <em>Package Extension</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Package#getAppliedProfile1 <em>Applied Profile1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Package#getPackageableElementVisibility <em>Packageable Element Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Package#getTemplateParameter1 <em>Template Parameter1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackage()
 * @model extendedMetaData="name='Package' kind='elementOnly'"
 * @generated
 */
public interface Package extends Namespace
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackage_Group6()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:25'"
	 * @generated
	 */
	FeatureMap getGroup6();

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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackage_TemplateParameter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='templateParameter' group='#group:25'"
	 * @generated
	 */
	EList<TemplateParameter> getTemplateParameter();

	/**
	 * Returns the value of the '<em><b>Owned Member</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Specifies the members that are owned by this Package. Redefines Namespace::ownedMember.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackage_OwnedMember()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ownedMember' group='#group:25'"
	 * @generated
	 */
	EList<PackageableElement> getOwnedMember();

	/**
	 * Returns the value of the '<em><b>Package Merge</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.PackageMerge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Merge</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Merge</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackage_PackageMerge()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='packageMerge' group='#group:25'"
	 * @generated
	 */
	EList<PackageMerge> getPackageMerge();

	/**
	 * Returns the value of the '<em><b>Applied Profile</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ProfileApplication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Profile</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Profile</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackage_AppliedProfile()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='appliedProfile' group='#group:25'"
	 * @generated
	 */
	EList<ProfileApplication> getAppliedProfile();

	/**
	 * Returns the value of the '<em><b>Package Extension</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.PackageMerge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Extension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Extension</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackage_PackageExtension()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='packageExtension' group='#group:25'"
	 * @generated
	 */
	EList<PackageMerge> getPackageExtension();

	/**
	 * Returns the value of the '<em><b>Applied Profile1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Profile1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Profile1</em>' attribute.
	 * @see #setAppliedProfile1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackage_AppliedProfile1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='appliedProfile'"
	 * @generated
	 */
	String getAppliedProfile1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Package#getAppliedProfile1 <em>Applied Profile1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Profile1</em>' attribute.
	 * @see #getAppliedProfile1()
	 * @generated
	 */
	void setAppliedProfile1(String value);

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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackage_PackageableElementVisibility()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='packageableElement_visibility'"
	 * @generated
	 */
	VisibilityKind getPackageableElementVisibility();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Package#getPackageableElementVisibility <em>Packageable Element Visibility</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Package#getPackageableElementVisibility <em>Packageable Element Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPackageableElementVisibility()
	 * @see #getPackageableElementVisibility()
	 * @see #setPackageableElementVisibility(VisibilityKind)
	 * @generated
	 */
	void unsetPackageableElementVisibility();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2._1._0._0.uml.Package#getPackageableElementVisibility <em>Packageable Element Visibility</em>}' attribute is set.
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackage_TemplateParameter1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='templateParameter'"
	 * @generated
	 */
	String getTemplateParameter1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Package#getTemplateParameter1 <em>Template Parameter1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Parameter1</em>' attribute.
	 * @see #getTemplateParameter1()
	 * @generated
	 */
	void setTemplateParameter1(String value);

} // Package
