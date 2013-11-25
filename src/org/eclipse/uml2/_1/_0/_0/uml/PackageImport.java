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
 * A representation of the model object '<em><b>Package Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A package import is defined as a directed relationship that identifies a package whose members are to be imported by a namespace.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.PackageImport#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.PackageImport#getImportedPackage <em>Imported Package</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.PackageImport#getImportedPackage1 <em>Imported Package1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.PackageImport#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackageImport()
 * @model extendedMetaData="name='PackageImport' kind='elementOnly'"
 * @generated
 */
public interface PackageImport extends DirectedRelationship
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackageImport_Group3()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:13'"
	 * @generated
	 */
	FeatureMap getGroup3();

	/**
	 * Returns the value of the '<em><b>Imported Package</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Specifies the Package whose members are imported into a Namespace. Subsets DirectedRelationship::target.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Package</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackageImport_ImportedPackage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='importedPackage' group='#group:13'"
	 * @generated
	 */
	EList<org.eclipse.uml2._1._0._0.uml.Package> getImportedPackage();

	/**
	 * Returns the value of the '<em><b>Imported Package1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Specifies the Package whose members are imported into a Namespace. Subsets DirectedRelationship::target.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Package1</em>' attribute.
	 * @see #setImportedPackage1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackageImport_ImportedPackage1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='importedPackage'"
	 * @generated
	 */
	String getImportedPackage1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.PackageImport#getImportedPackage1 <em>Imported Package1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Package1</em>' attribute.
	 * @see #getImportedPackage1()
	 * @generated
	 */
	void setImportedPackage1(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2._1._0._0.uml.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Specifies the visibility of the imported PackageableElements within the import-ing Namespace, i.e., whether imported elements will in turn be visible to other packages that use that importingPackage as an importedPackage. If the PackageImport is public, the imported elements will be visible outside the package, while if it is private they will not. By default, the value of visibility is public.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.VisibilityKind
	 * @see #isSetVisibility()
	 * @see #unsetVisibility()
	 * @see #setVisibility(VisibilityKind)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackageImport_Visibility()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='visibility'"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.PackageImport#getVisibility <em>Visibility</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.uml2._1._0._0.uml.PackageImport#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(VisibilityKind)
	 * @generated
	 */
	void unsetVisibility();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2._1._0._0.uml.PackageImport#getVisibility <em>Visibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visibility</em>' attribute is set.
	 * @see #unsetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(VisibilityKind)
	 * @generated
	 */
	boolean isSetVisibility();

} // PackageImport
