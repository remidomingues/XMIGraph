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
 * A representation of the model object '<em><b>Profile Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ProfileApplication#getGroup4 <em>Group4</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ProfileApplication#getImportedProfile <em>Imported Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ProfileApplication#getImportedProfile1 <em>Imported Profile1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProfileApplication()
 * @model extendedMetaData="name='ProfileApplication' kind='elementOnly'"
 * @generated
 */
public interface ProfileApplication extends PackageImport
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProfileApplication_Group4()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:14'"
	 * @generated
	 */
	FeatureMap getGroup4();

	/**
	 * Returns the value of the '<em><b>Imported Profile</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Profile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Profile</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Profile</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProfileApplication_ImportedProfile()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='importedProfile' group='#group:14'"
	 * @generated
	 */
	EList<Profile> getImportedProfile();

	/**
	 * Returns the value of the '<em><b>Imported Profile1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Profile1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Profile1</em>' attribute.
	 * @see #setImportedProfile1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProfileApplication_ImportedProfile1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='importedProfile'"
	 * @generated
	 */
	String getImportedProfile1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ProfileApplication#getImportedProfile1 <em>Imported Profile1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Profile1</em>' attribute.
	 * @see #getImportedProfile1()
	 * @generated
	 */
	void setImportedProfile1(String value);

} // ProfileApplication
