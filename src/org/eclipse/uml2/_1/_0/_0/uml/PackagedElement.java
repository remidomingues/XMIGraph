/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.uml2._1._0._0.uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packaged Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.PackagedElement#getClient <em>Client</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.PackagedElement#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.PackagedElement#getRealizingClassifier <em>Realizing Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.PackagedElement#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.PackagedElement#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.PackagedElement#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.PackagedElement#getMemberEnd <em>Member End</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.PackagedElement#getOwnedEnd <em>Owned End</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.PackagedElement#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.PackagedElement#getPackagedElement <em>Packaged Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackagedElement()
 * @model
 * @generated
 */
public interface PackagedElement extends IsAbstractIsStatic
{
	/**
	 * Returns the value of the '<em><b>Client</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' attribute.
	 * @see #setClient(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackagedElement_Client()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getClient();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.PackagedElement#getClient <em>Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' attribute.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(String value);

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' attribute.
	 * @see #setSupplier(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackagedElement_Supplier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getSupplier();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.PackagedElement#getSupplier <em>Supplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' attribute.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(String value);

	/**
	 * Returns the value of the '<em><b>Realizing Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Classifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Classifier</em>' attribute.
	 * @see #setRealizingClassifier(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackagedElement_RealizingClassifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRealizingClassifier();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.PackagedElement#getRealizingClassifier <em>Realizing Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizing Classifier</em>' attribute.
	 * @see #getRealizingClassifier()
	 * @generated
	 */
	void setRealizingClassifier(String value);

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.OwnedAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackagedElement_OwnedAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<OwnedAttribute> getOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.OwnedOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackagedElement_OwnedOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<OwnedOperation> getOwnedOperation();

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Generalization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackagedElement_Generalization()
	 * @model containment="true"
	 * @generated
	 */
	EList<Generalization> getGeneralization();

	/**
	 * Returns the value of the '<em><b>Member End</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Referenced}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member End</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member End</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackagedElement_MemberEnd()
	 * @model containment="true"
	 * @generated
	 */
	EList<Referenced> getMemberEnd();

	/**
	 * Returns the value of the '<em><b>Owned End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned End</em>' containment reference.
	 * @see #setOwnedEnd(OwnedEnd)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackagedElement_OwnedEnd()
	 * @model containment="true"
	 * @generated
	 */
	OwnedEnd getOwnedEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.PackagedElement#getOwnedEnd <em>Owned End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned End</em>' containment reference.
	 * @see #getOwnedEnd()
	 * @generated
	 */
	void setOwnedEnd(OwnedEnd value);

	/**
	 * Returns the value of the '<em><b>Owned Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Rule</em>' containment reference.
	 * @see #setOwnedRule(OwnedRule)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackagedElement_OwnedRule()
	 * @model containment="true"
	 * @generated
	 */
	OwnedRule getOwnedRule();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.PackagedElement#getOwnedRule <em>Owned Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Rule</em>' containment reference.
	 * @see #getOwnedRule()
	 * @generated
	 */
	void setOwnedRule(OwnedRule value);

	/**
	 * Returns the value of the '<em><b>Packaged Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.PackagedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packaged Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packaged Element</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPackagedElement_PackagedElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackagedElement> getPackagedElement();

} // PackagedElement
