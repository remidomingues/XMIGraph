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
 * A representation of the model object '<em><b>Activity Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Partitions divide the nodes and edges to constrain and show a view of the contained nodes. Partitions can share contents. They often correspond to organizational units in a business model. They may be used to allocate characteristics or resources among the nodes of an activity.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityPartition#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityPartition#getContainedEdge <em>Contained Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityPartition#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityPartition#getSubgroup <em>Subgroup</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityPartition#getRepresents <em>Represents</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityPartition#getContainedEdge1 <em>Contained Edge1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityPartition#getContainedNode1 <em>Contained Node1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityPartition#getIsDimension <em>Is Dimension</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityPartition#getIsExternal <em>Is External</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityPartition#getRepresents1 <em>Represents1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityPartition()
 * @model extendedMetaData="name='ActivityPartition' kind='elementOnly'"
 * @generated
 */
public interface ActivityPartition extends NamedElement
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityPartition_Group5()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:22'"
	 * @generated
	 */
	FeatureMap getGroup5();

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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityPartition_ContainedEdge()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='containedEdge' group='#group:22'"
	 * @generated
	 */
	EList<ActivityEdge> getContainedEdge();

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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityPartition_ContainedNode()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='containedNode' group='#group:22'"
	 * @generated
	 */
	EList<ActivityNode> getContainedNode();

	/**
	 * Returns the value of the '<em><b>Subgroup</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ActivityPartition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subgroup</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subgroup</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityPartition_Subgroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subgroup' group='#group:22'"
	 * @generated
	 */
	EList<ActivityPartition> getSubgroup();

	/**
	 * Returns the value of the '<em><b>Represents</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 An element constraining behaviors invoked by nodes in the partition.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Represents</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityPartition_Represents()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='represents' group='#group:22'"
	 * @generated
	 */
	EList<Element> getRepresents();

	/**
	 * Returns the value of the '<em><b>Contained Edge1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Edge1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Edge1</em>' attribute.
	 * @see #setContainedEdge1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityPartition_ContainedEdge1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='containedEdge'"
	 * @generated
	 */
	String getContainedEdge1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ActivityPartition#getContainedEdge1 <em>Contained Edge1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Edge1</em>' attribute.
	 * @see #getContainedEdge1()
	 * @generated
	 */
	void setContainedEdge1(String value);

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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityPartition_ContainedNode1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='containedNode'"
	 * @generated
	 */
	String getContainedNode1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ActivityPartition#getContainedNode1 <em>Contained Node1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Node1</em>' attribute.
	 * @see #getContainedNode1()
	 * @generated
	 */
	void setContainedNode1(String value);

	/**
	 * Returns the value of the '<em><b>Is Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Tells whether the partition groups other partitions along a dimension.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Dimension</em>' attribute.
	 * @see #setIsDimension(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityPartition_IsDimension()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isDimension'"
	 * @generated
	 */
	String getIsDimension();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ActivityPartition#getIsDimension <em>Is Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Dimension</em>' attribute.
	 * @see #getIsDimension()
	 * @generated
	 */
	void setIsDimension(String value);

	/**
	 * Returns the value of the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Tells whether the partition represents an entity to which the partitioning structure does not apply.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is External</em>' attribute.
	 * @see #setIsExternal(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityPartition_IsExternal()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isExternal'"
	 * @generated
	 */
	String getIsExternal();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ActivityPartition#getIsExternal <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is External</em>' attribute.
	 * @see #getIsExternal()
	 * @generated
	 */
	void setIsExternal(String value);

	/**
	 * Returns the value of the '<em><b>Represents1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               An element constraining behaviors invoked by nodes in the partition.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Represents1</em>' attribute.
	 * @see #setRepresents1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityPartition_Represents1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='represents'"
	 * @generated
	 */
	String getRepresents1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ActivityPartition#getRepresents1 <em>Represents1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents1</em>' attribute.
	 * @see #getRepresents1()
	 * @generated
	 */
	void setRepresents1(String value);

} // ActivityPartition
