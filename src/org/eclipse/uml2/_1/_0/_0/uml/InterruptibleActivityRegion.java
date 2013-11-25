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
 * A representation of the model object '<em><b>Interruptible Activity Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         An interruptible region contains activity nodes. When a token leaves an interruptible region via edges designated by the region as interrupting edges, all tokens and behaviors in the region are terminated.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InterruptibleActivityRegion#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InterruptibleActivityRegion#getInterruptingEdge <em>Interrupting Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InterruptibleActivityRegion#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InterruptibleActivityRegion#getContainedNode1 <em>Contained Node1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InterruptibleActivityRegion#getInterruptingEdge1 <em>Interrupting Edge1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInterruptibleActivityRegion()
 * @model extendedMetaData="name='InterruptibleActivityRegion' kind='elementOnly'"
 * @generated
 */
public interface InterruptibleActivityRegion extends ActivityGroup
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInterruptibleActivityRegion_Group3()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:13'"
	 * @generated
	 */
	FeatureMap getGroup3();

	/**
	 * Returns the value of the '<em><b>Interrupting Edge</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 .The edges leaving the region that will abort other tokens flowing in the region.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interrupting Edge</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInterruptibleActivityRegion_InterruptingEdge()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interruptingEdge' group='#group:13'"
	 * @generated
	 */
	EList<ActivityEdge> getInterruptingEdge();

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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInterruptibleActivityRegion_ContainedNode()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='containedNode' group='#group:13'"
	 * @generated
	 */
	EList<ActivityNode> getContainedNode();

	/**
	 * Returns the value of the '<em><b>Contained Node1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Node1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Node1</em>' attribute.
	 * @see #setContainedNode1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInterruptibleActivityRegion_ContainedNode1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='containedNode'"
	 * @generated
	 */
	String getContainedNode1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.InterruptibleActivityRegion#getContainedNode1 <em>Contained Node1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Node1</em>' attribute.
	 * @see #getContainedNode1()
	 * @generated
	 */
	void setContainedNode1(String value);

	/**
	 * Returns the value of the '<em><b>Interrupting Edge1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               .The edges leaving the region that will abort other tokens flowing in the region.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interrupting Edge1</em>' attribute.
	 * @see #setInterruptingEdge1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInterruptibleActivityRegion_InterruptingEdge1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='interruptingEdge'"
	 * @generated
	 */
	String getInterruptingEdge1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.InterruptibleActivityRegion#getInterruptingEdge1 <em>Interrupting Edge1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interrupting Edge1</em>' attribute.
	 * @see #getInterruptingEdge1()
	 * @generated
	 */
	void setInterruptingEdge1(String value);

} // InterruptibleActivityRegion
