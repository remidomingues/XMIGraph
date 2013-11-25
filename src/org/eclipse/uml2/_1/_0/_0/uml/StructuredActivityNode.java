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
 * A representation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.StructuredActivityNode#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.StructuredActivityNode#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.StructuredActivityNode#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.StructuredActivityNode#getPackageImport <em>Package Import</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.StructuredActivityNode#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.StructuredActivityNode#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.StructuredActivityNode#getContainedEdge <em>Contained Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.StructuredActivityNode#getMustIsolate <em>Must Isolate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getStructuredActivityNode()
 * @model extendedMetaData="name='StructuredActivityNode' kind='elementOnly'"
 * @generated
 */
public interface StructuredActivityNode extends Action
{
	/**
	 * Returns the value of the '<em><b>Group8</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group8</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group8</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getStructuredActivityNode_Group8()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:40'"
	 * @generated
	 */
	FeatureMap getGroup8();

	/**
	 * Returns the value of the '<em><b>Owned Rule</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Specifies a set of Constraints owned by this Namespace. Subsets Namespace::ownedMember.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Rule</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getStructuredActivityNode_OwnedRule()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ownedRule' group='#group:40'"
	 * @generated
	 */
	EList<Constraint> getOwnedRule();

	/**
	 * Returns the value of the '<em><b>Element Import</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ElementImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 References the ElementImports owned by the Namespace. Subsets Element::ownedElement.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Import</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getStructuredActivityNode_ElementImport()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='elementImport' group='#group:40'"
	 * @generated
	 */
	EList<ElementImport> getElementImport();

	/**
	 * Returns the value of the '<em><b>Package Import</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.PackageImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 References the PackageImports owned by the Namespace. Subsets Element::ownedElement.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Import</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getStructuredActivityNode_PackageImport()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='packageImport' group='#group:40'"
	 * @generated
	 */
	EList<PackageImport> getPackageImport();

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getStructuredActivityNode_Variable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='variable' group='#group:40'"
	 * @generated
	 */
	EList<Variable> getVariable();

	/**
	 * Returns the value of the '<em><b>Contained Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Node</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getStructuredActivityNode_ContainedNode()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='containedNode' group='#group:40'"
	 * @generated
	 */
	EList<ActivityNode> getContainedNode();

	/**
	 * Returns the value of the '<em><b>Contained Edge</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Edge</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Edge</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getStructuredActivityNode_ContainedEdge()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='containedEdge' group='#group:40'"
	 * @generated
	 */
	EList<ActivityEdge> getContainedEdge();

	/**
	 * Returns the value of the '<em><b>Must Isolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Must Isolate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Isolate</em>' attribute.
	 * @see #setMustIsolate(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getStructuredActivityNode_MustIsolate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mustIsolate'"
	 * @generated
	 */
	String getMustIsolate();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.StructuredActivityNode#getMustIsolate <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Isolate</em>' attribute.
	 * @see #getMustIsolate()
	 * @generated
	 */
	void setMustIsolate(String value);

} // StructuredActivityNode
