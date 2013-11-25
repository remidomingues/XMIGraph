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
 * A representation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         This relationship specifies that the behavior of a use case may be extended by the behavior of another (usually supplementary) use case. The extension takes place at one or more specific extension points defined in the extended use case. Note, however, that the extended use case is defined independently of the extending use case and is meaningful independently of the extending use case. On the other hand, the extending use case typically defines behavior that may not necessarily be meaningful by itself. Instead, the extending use case defines a set of modular behavior increments that augment an execution of the extended use case under specific conditions. Note that the same extending use case can extend more than one use case. Furthermore, an extending use case may itself be extended. It is a kind of DirectedRelationship, such that the source is the extending use case and the destination is the extended use case. It is also a kind of NamedElement so that it can have a name in the context of its owning use case. The extend relationship itself is owned by the extending use case.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Extend#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Extend#getExtendedCase <em>Extended Case</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Extend#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Extend#getExtensionLocation <em>Extension Location</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Extend#getExtendedCase1 <em>Extended Case1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Extend#getExtensionLocation1 <em>Extension Location1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExtend()
 * @model extendedMetaData="name='Extend' kind='elementOnly'"
 * @generated
 */
public interface Extend extends NamedElement
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExtend_Group5()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:22'"
	 * @generated
	 */
	FeatureMap getGroup5();

	/**
	 * Returns the value of the '<em><b>Extended Case</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.UseCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 References the use case that is being extended. (Specializes DirectedRelationship.target.)
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Case</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExtend_ExtendedCase()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extendedCase' group='#group:22'"
	 * @generated
	 */
	EList<UseCase> getExtendedCase();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExtend_Condition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='condition' group='#group:22'"
	 * @generated
	 */
	EList<Constraint> getCondition();

	/**
	 * Returns the value of the '<em><b>Extension Location</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ExtensionPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Location</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Location</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExtend_ExtensionLocation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extensionLocation' group='#group:22'"
	 * @generated
	 */
	EList<ExtensionPoint> getExtensionLocation();

	/**
	 * Returns the value of the '<em><b>Extended Case1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               References the use case that is being extended. (Specializes DirectedRelationship.target.)
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Case1</em>' attribute.
	 * @see #setExtendedCase1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExtend_ExtendedCase1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='extendedCase'"
	 * @generated
	 */
	String getExtendedCase1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Extend#getExtendedCase1 <em>Extended Case1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Case1</em>' attribute.
	 * @see #getExtendedCase1()
	 * @generated
	 */
	void setExtendedCase1(String value);

	/**
	 * Returns the value of the '<em><b>Extension Location1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Location1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Location1</em>' attribute.
	 * @see #setExtensionLocation1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExtend_ExtensionLocation1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='extensionLocation'"
	 * @generated
	 */
	String getExtensionLocation1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Extend#getExtensionLocation1 <em>Extension Location1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Location1</em>' attribute.
	 * @see #getExtensionLocation1()
	 * @generated
	 */
	void setExtensionLocation1(String value);

} // Extend
