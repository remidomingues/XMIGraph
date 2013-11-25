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
 * A representation of the model object '<em><b>Element Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         An element import is defined as a directed relationship between an importing namespace and a packageable element. The name of the packageable element or its alias is to be added to the namespace of the importing namespace. It is also possible to control whether the imported element can be further imported.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ElementImport#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ElementImport#getImportedElement <em>Imported Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ElementImport#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ElementImport#getImportedElement1 <em>Imported Element1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ElementImport#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getElementImport()
 * @model extendedMetaData="name='ElementImport' kind='elementOnly'"
 * @generated
 */
public interface ElementImport extends DirectedRelationship
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getElementImport_Group3()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:13'"
	 * @generated
	 */
	FeatureMap getGroup3();

	/**
	 * Returns the value of the '<em><b>Imported Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Specifies the PackageableElement whose name is to be added to a Namespace. Subsets DirectedRelationship::target.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Element</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getElementImport_ImportedElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='importedElement' group='#group:13'"
	 * @generated
	 */
	EList<PackageableElement> getImportedElement();

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Specifies the name that should be added to the namespace of the importing Pack-age in lieu of the name of the imported PackagableElement. The aliased name must not clash with any other member name in the importing Package. By default, no alias is used.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getElementImport_Alias()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='alias'"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ElementImport#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Imported Element1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Specifies the PackageableElement whose name is to be added to a Namespace. Subsets DirectedRelationship::target.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Element1</em>' attribute.
	 * @see #setImportedElement1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getElementImport_ImportedElement1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='importedElement'"
	 * @generated
	 */
	String getImportedElement1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ElementImport#getImportedElement1 <em>Imported Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Element1</em>' attribute.
	 * @see #getImportedElement1()
	 * @generated
	 */
	void setImportedElement1(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2._1._0._0.uml.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Specifies the visibility of the imported PackageableElement within the importing Package. The default visibility is the same as that of the imported element. If the imported element does not have a visibility, it is possible to add visibility to the element import.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.VisibilityKind
	 * @see #isSetVisibility()
	 * @see #unsetVisibility()
	 * @see #setVisibility(VisibilityKind)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getElementImport_Visibility()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='visibility'"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ElementImport#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.VisibilityKind
	 * @see #isSetVisibility()
	 * @see #unsetVisibility()
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ElementImport#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(VisibilityKind)
	 * @generated
	 */
	void unsetVisibility();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2._1._0._0.uml.ElementImport#getVisibility <em>Visibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visibility</em>' attribute is set.
	 * @see #unsetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(VisibilityKind)
	 * @generated
	 */
	boolean isSetVisibility();

} // ElementImport
