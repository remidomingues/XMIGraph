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
 * A representation of the model object '<em><b>Package Merge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A package merge is a relationship between two packages, where the contents of the target package (the one pointed at) is merged with the contents of the source package through specialization and redefinition, where applicable. This is a mechanism that should be used when elements of the same name are intended to represent the same concept, regardless of the package in which they are defined. A merging package will take elements of the same kind with the same name from one or more packages and merge them together into a single element using generalization and redefinitions. It should be noted that a package merge can be viewed as a short-hand way of explicitly defining those generalizations and redefinitions. The merged packages are still available, and the elements in those packages can be separately qualified. From an XMI point of view, it is either possible to exchange a model with all PackageMerges retained or a model where all PackageMerges have been transformed away (in which case package imports, generalizations, and redefinitions are used instead).
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.PackageMerge#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.PackageMerge#getMergedPackage <em>Merged Package</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.PackageMerge#getMergedPackage1 <em>Merged Package1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackageMerge()
 * @model extendedMetaData="name='PackageMerge' kind='elementOnly'"
 * @generated
 */
public interface PackageMerge extends DirectedRelationship
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackageMerge_Group3()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:13'"
	 * @generated
	 */
	FeatureMap getGroup3();

	/**
	 * Returns the value of the '<em><b>Merged Package</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 References the Package that is to be merged with the source of the PackageMerge. Subsets DirectedRelationship;;target.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Merged Package</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackageMerge_MergedPackage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mergedPackage' group='#group:13'"
	 * @generated
	 */
	EList<org.eclipse.uml2._1._0._0.uml.Package> getMergedPackage();

	/**
	 * Returns the value of the '<em><b>Merged Package1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               References the Package that is to be merged with the source of the PackageMerge. Subsets DirectedRelationship;;target.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Merged Package1</em>' attribute.
	 * @see #setMergedPackage1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackageMerge_MergedPackage1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mergedPackage'"
	 * @generated
	 */
	String getMergedPackage1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.PackageMerge#getMergedPackage1 <em>Merged Package1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merged Package1</em>' attribute.
	 * @see #getMergedPackage1()
	 * @generated
	 */
	void setMergedPackage1(String value);

} // PackageMerge
