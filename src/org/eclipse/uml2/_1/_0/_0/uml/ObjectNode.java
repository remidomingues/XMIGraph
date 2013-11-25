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
 * A representation of the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ObjectNode#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ObjectNode#getType1 <em>Type1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ObjectNode#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ObjectNode#getInState <em>In State</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ObjectNode#getSelection <em>Selection</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ObjectNode#getInState1 <em>In State1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ObjectNode#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ObjectNode#getSelection1 <em>Selection1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ObjectNode#getType2 <em>Type2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getObjectNode()
 * @model extendedMetaData="name='ObjectNode' kind='elementOnly'"
 * @generated
 */
public interface ObjectNode extends ActivityNode
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getObjectNode_Group6()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:34'"
	 * @generated
	 */
	FeatureMap getGroup6();

	/**
	 * Returns the value of the '<em><b>Type1</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the TypedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type1</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getObjectNode_Type1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='type' group='#group:34'"
	 * @generated
	 */
	EList<Type> getType1();

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getObjectNode_UpperBound()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='upperBound' group='#group:34'"
	 * @generated
	 */
	EList<ValueSpecification> getUpperBound();

	/**
	 * Returns the value of the '<em><b>In State</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The required states of the object available at this point in the activity.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In State</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getObjectNode_InState()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inState' group='#group:34'"
	 * @generated
	 */
	EList<State> getInState();

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getObjectNode_Selection()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='selection' group='#group:34'"
	 * @generated
	 */
	EList<Behavior> getSelection();

	/**
	 * Returns the value of the '<em><b>In State1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The required states of the object available at this point in the activity.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In State1</em>' attribute.
	 * @see #setInState1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getObjectNode_InState1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='inState'"
	 * @generated
	 */
	String getInState1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ObjectNode#getInState1 <em>In State1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In State1</em>' attribute.
	 * @see #getInState1()
	 * @generated
	 */
	void setInState1(String value);

	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2._1._0._0.uml.ObjectNodeOrderingKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               = FIFO Tells whether and how the tokens in the object node are ordered for selection to traverse edges outgoing from the object node.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordering</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.ObjectNodeOrderingKind
	 * @see #isSetOrdering()
	 * @see #unsetOrdering()
	 * @see #setOrdering(ObjectNodeOrderingKind)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getObjectNode_Ordering()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='ordering'"
	 * @generated
	 */
	ObjectNodeOrderingKind getOrdering();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ObjectNode#getOrdering <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.ObjectNodeOrderingKind
	 * @see #isSetOrdering()
	 * @see #unsetOrdering()
	 * @see #getOrdering()
	 * @generated
	 */
	void setOrdering(ObjectNodeOrderingKind value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ObjectNode#getOrdering <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrdering()
	 * @see #getOrdering()
	 * @see #setOrdering(ObjectNodeOrderingKind)
	 * @generated
	 */
	void unsetOrdering();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2._1._0._0.uml.ObjectNode#getOrdering <em>Ordering</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ordering</em>' attribute is set.
	 * @see #unsetOrdering()
	 * @see #getOrdering()
	 * @see #setOrdering(ObjectNodeOrderingKind)
	 * @generated
	 */
	boolean isSetOrdering();

	/**
	 * Returns the value of the '<em><b>Selection1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection1</em>' attribute.
	 * @see #setSelection1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getObjectNode_Selection1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='selection'"
	 * @generated
	 */
	String getSelection1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ObjectNode#getSelection1 <em>Selection1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection1</em>' attribute.
	 * @see #getSelection1()
	 * @generated
	 */
	void setSelection1(String value);

	/**
	 * Returns the value of the '<em><b>Type2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the TypedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type2</em>' attribute.
	 * @see #setType2(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getObjectNode_Type2()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType2();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ObjectNode#getType2 <em>Type2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type2</em>' attribute.
	 * @see #getType2()
	 * @generated
	 */
	void setType2(String value);

} // ObjectNode
