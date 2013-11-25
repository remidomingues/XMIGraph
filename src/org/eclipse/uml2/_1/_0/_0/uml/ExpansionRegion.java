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
 * A representation of the model object '<em><b>Expansion Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         An expansion region is a strictly nested region of an activity with explicit input and outputs (modeled as ExpansionNodes). Each input is a collection of values. If there are multiple input pins, each of them must hold the same kind of collection, although the types of the elements in the different collections may vary. The expansion region is executed once for each element (or position) in the input collection. If an expansion region has outputs, they must be collections of the same kind and must contain elements of the same type as the corresponding inputs. The number of output collections at runtime can differ from the number of input collections. On each execution of the region, an output value from the region is inserted into an output collection at the same position as the input elements. If the region execution ends with no output, then nothing is added to the output collection. If all the executions provide an output to the collection, then the output collections will have the same number of elements as the input collections. The inputs and outputs to an expansion region are modeled as ExpansionNodes. From “outside” of the region, the values on these nodes appear as collections. From “inside” the region the values appear as elements of the collections. Object flow edges connect pins outside the region to input and output expansion nodes as collections. Object flow edges connect pins inside the region to input and output expansion nodes as individual elements. From the inside of the region, these nodes are visible as individual values. If an expansion node has a name, it is the name of the individual element within the region. Any object flow edges that cross the boundary of the region, without passing through expansion nodes, provide values that are fixed within the different executions of the region.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExpansionRegion#getGroup9 <em>Group9</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExpansionRegion#getOutputElement <em>Output Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExpansionRegion#getInputElement <em>Input Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExpansionRegion#getInputElement1 <em>Input Element1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExpansionRegion#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExpansionRegion#getOutputElement1 <em>Output Element1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExpansionRegion()
 * @model extendedMetaData="name='ExpansionRegion' kind='elementOnly'"
 * @generated
 */
public interface ExpansionRegion extends StructuredActivityNode
{
	/**
	 * Returns the value of the '<em><b>Group9</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group9</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group9</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExpansionRegion_Group9()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:48'"
	 * @generated
	 */
	FeatureMap getGroup9();

	/**
	 * Returns the value of the '<em><b>Output Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ExpansionNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 An object node that accepts a separate element of the output collection during each of the multiple executions of the region. The values are formed into a collection that is available when the execution of the region is complete.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Element</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExpansionRegion_OutputElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='outputElement' group='#group:48'"
	 * @generated
	 */
	EList<ExpansionNode> getOutputElement();

	/**
	 * Returns the value of the '<em><b>Input Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ExpansionNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 An object node that holds a separate element of the input collection during each of the multiple executions of the region.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Element</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExpansionRegion_InputElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inputElement' group='#group:48'"
	 * @generated
	 */
	EList<ExpansionNode> getInputElement();

	/**
	 * Returns the value of the '<em><b>Input Element1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               An object node that holds a separate element of the input collection during each of the multiple executions of the region.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Element1</em>' attribute.
	 * @see #setInputElement1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExpansionRegion_InputElement1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='inputElement'"
	 * @generated
	 */
	String getInputElement1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ExpansionRegion#getInputElement1 <em>Input Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Element1</em>' attribute.
	 * @see #getInputElement1()
	 * @generated
	 */
	void setInputElement1(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2._1._0._0.uml.ExpansionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The way in which the executions interact: parallel — all interactions are independent iterative — the interactions occur in order of the elements stream — a stream of values flows into a single execution
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.ExpansionKind
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #setMode(ExpansionKind)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExpansionRegion_Mode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='mode'"
	 * @generated
	 */
	ExpansionKind getMode();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ExpansionRegion#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.ExpansionKind
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ExpansionKind value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ExpansionRegion#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMode()
	 * @see #getMode()
	 * @see #setMode(ExpansionKind)
	 * @generated
	 */
	void unsetMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2._1._0._0.uml.ExpansionRegion#getMode <em>Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode</em>' attribute is set.
	 * @see #unsetMode()
	 * @see #getMode()
	 * @see #setMode(ExpansionKind)
	 * @generated
	 */
	boolean isSetMode();

	/**
	 * Returns the value of the '<em><b>Output Element1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               An object node that accepts a separate element of the output collection during each of the multiple executions of the region. The values are formed into a collection that is available when the execution of the region is complete.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Element1</em>' attribute.
	 * @see #setOutputElement1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExpansionRegion_OutputElement1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='outputElement'"
	 * @generated
	 */
	String getOutputElement1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ExpansionRegion#getOutputElement1 <em>Output Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Element1</em>' attribute.
	 * @see #getOutputElement1()
	 * @generated
	 */
	void setOutputElement1(String value);

} // ExpansionRegion
