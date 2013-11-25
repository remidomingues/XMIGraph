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
 * A representation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Profile#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Profile#getMetaclassReference <em>Metaclass Reference</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Profile#getMetamodelReference <em>Metamodel Reference</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Profile#getMetaclassReference1 <em>Metaclass Reference1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Profile#getMetamodelReference1 <em>Metamodel Reference1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProfile()
 * @model extendedMetaData="name='Profile' kind='elementOnly'"
 * @generated
 */
public interface Profile extends org.eclipse.uml2._1._0._0.uml.Package
{
	/**
	 * Returns the value of the '<em><b>Group7</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group7</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group7</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProfile_Group7()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:29'"
	 * @generated
	 */
	FeatureMap getGroup7();

	/**
	 * Returns the value of the '<em><b>Metaclass Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ElementImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metaclass Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metaclass Reference</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProfile_MetaclassReference()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='metaclassReference' group='#group:29'"
	 * @generated
	 */
	EList<ElementImport> getMetaclassReference();

	/**
	 * Returns the value of the '<em><b>Metamodel Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.PackageImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel Reference</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProfile_MetamodelReference()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='metamodelReference' group='#group:29'"
	 * @generated
	 */
	EList<PackageImport> getMetamodelReference();

	/**
	 * Returns the value of the '<em><b>Metaclass Reference1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metaclass Reference1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metaclass Reference1</em>' attribute.
	 * @see #setMetaclassReference1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProfile_MetaclassReference1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='metaclassReference'"
	 * @generated
	 */
	String getMetaclassReference1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Profile#getMetaclassReference1 <em>Metaclass Reference1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metaclass Reference1</em>' attribute.
	 * @see #getMetaclassReference1()
	 * @generated
	 */
	void setMetaclassReference1(String value);

	/**
	 * Returns the value of the '<em><b>Metamodel Reference1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel Reference1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel Reference1</em>' attribute.
	 * @see #setMetamodelReference1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProfile_MetamodelReference1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='metamodelReference'"
	 * @generated
	 */
	String getMetamodelReference1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Profile#getMetamodelReference1 <em>Metamodel Reference1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel Reference1</em>' attribute.
	 * @see #getMetamodelReference1()
	 * @generated
	 */
	void setMetamodelReference1(String value);

} // Profile
