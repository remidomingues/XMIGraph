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
 * A representation of the model object '<em><b>Expansion Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         (ExtraStructuredActivities) An expansion node is an object node used to indicate a flow across the boundary of an expansion region. A flow into a region contains a collection that is broken into its individual elements inside the region, which is executed once per element. A flow out of a region combines individual elements into a collection for use outside the region.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExpansionNode#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExpansionNode#getRegionAsInput <em>Region As Input</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExpansionNode#getRegionAsInput1 <em>Region As Input1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExpansionNode#getRegionAsOutput1 <em>Region As Output1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExpansionNode()
 * @model extendedMetaData="name='ExpansionNode' kind='elementOnly'"
 * @generated
 */
public interface ExpansionNode extends ObjectNode
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExpansionNode_Group7()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:43'"
	 * @generated
	 */
	FeatureMap getGroup7();

	/**
	 * Returns the value of the '<em><b>Region As Output</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ExpansionRegion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * expansion region for which the node is an output.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region As Output</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExpansionNode_RegionAsOutput()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='regionAsOutput' group='#group:43'"
	 * @generated
	 */
	EList<ExpansionRegion> getRegionAsOutput();

	/**
	 * Returns the value of the '<em><b>Region As Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ExpansionRegion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * expansion region for which the node is an input.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region As Input</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExpansionNode_RegionAsInput()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='regionAsInput' group='#group:43'"
	 * @generated
	 */
	EList<ExpansionRegion> getRegionAsInput();

	/**
	 * Returns the value of the '<em><b>Region As Input1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * expansion region for which the node is an input.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region As Input1</em>' attribute.
	 * @see #setRegionAsInput1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExpansionNode_RegionAsInput1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='regionAsInput'"
	 * @generated
	 */
	String getRegionAsInput1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ExpansionNode#getRegionAsInput1 <em>Region As Input1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region As Input1</em>' attribute.
	 * @see #getRegionAsInput1()
	 * @generated
	 */
	void setRegionAsInput1(String value);

	/**
	 * Returns the value of the '<em><b>Region As Output1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * expansion region for which the node is an output.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region As Output1</em>' attribute.
	 * @see #setRegionAsOutput1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExpansionNode_RegionAsOutput1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='regionAsOutput'"
	 * @generated
	 */
	String getRegionAsOutput1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ExpansionNode#getRegionAsOutput1 <em>Region As Output1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region As Output1</em>' attribute.
	 * @see #getRegionAsOutput1()
	 * @generated
	 */
	void setRegionAsOutput1(String value);

} // ExpansionNode
