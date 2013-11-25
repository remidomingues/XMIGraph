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
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityNode#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityNode#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityNode#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityNode#getInPartition <em>In Partition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityNode#getInInterruptibleRegion <em>In Interruptible Region</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityNode#getIncoming1 <em>Incoming1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityNode#getInInterruptibleRegion1 <em>In Interruptible Region1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityNode#getInPartition1 <em>In Partition1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityNode#getOutgoing1 <em>Outgoing1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityNode#getRedefinedElement1 <em>Redefined Element1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityNode()
 * @model extendedMetaData="name='ActivityNode' kind='elementOnly'"
 * @generated
 */
public interface ActivityNode extends RedefinableElement
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityNode_Group5()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:23'"
	 * @generated
	 */
	FeatureMap getGroup5();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityNode_Outgoing()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='outgoing' group='#group:23'"
	 * @generated
	 */
	EList<ActivityEdge> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityNode_Incoming()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='incoming' group='#group:23'"
	 * @generated
	 */
	EList<ActivityEdge> getIncoming();

	/**
	 * Returns the value of the '<em><b>Redefined Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Element</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityNode_RedefinedElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='redefinedElement' group='#group:23'"
	 * @generated
	 */
	EList<ActivityNode> getRedefinedElement();

	/**
	 * Returns the value of the '<em><b>In Partition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ActivityPartition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Partition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Partition</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityNode_InPartition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inPartition' group='#group:23'"
	 * @generated
	 */
	EList<ActivityPartition> getInPartition();

	/**
	 * Returns the value of the '<em><b>In Interruptible Region</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.InterruptibleActivityRegion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Interruptible Region</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Interruptible Region</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityNode_InInterruptibleRegion()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inInterruptibleRegion' group='#group:23'"
	 * @generated
	 */
	EList<InterruptibleActivityRegion> getInInterruptibleRegion();

	/**
	 * Returns the value of the '<em><b>Incoming1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming1</em>' attribute.
	 * @see #setIncoming1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityNode_Incoming1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='incoming'"
	 * @generated
	 */
	String getIncoming1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ActivityNode#getIncoming1 <em>Incoming1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming1</em>' attribute.
	 * @see #getIncoming1()
	 * @generated
	 */
	void setIncoming1(String value);

	/**
	 * Returns the value of the '<em><b>In Interruptible Region1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Interruptible Region1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Interruptible Region1</em>' attribute.
	 * @see #setInInterruptibleRegion1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityNode_InInterruptibleRegion1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='inInterruptibleRegion'"
	 * @generated
	 */
	String getInInterruptibleRegion1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ActivityNode#getInInterruptibleRegion1 <em>In Interruptible Region1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Interruptible Region1</em>' attribute.
	 * @see #getInInterruptibleRegion1()
	 * @generated
	 */
	void setInInterruptibleRegion1(String value);

	/**
	 * Returns the value of the '<em><b>In Partition1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Partition1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Partition1</em>' attribute.
	 * @see #setInPartition1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityNode_InPartition1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='inPartition'"
	 * @generated
	 */
	String getInPartition1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ActivityNode#getInPartition1 <em>In Partition1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Partition1</em>' attribute.
	 * @see #getInPartition1()
	 * @generated
	 */
	void setInPartition1(String value);

	/**
	 * Returns the value of the '<em><b>Outgoing1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing1</em>' attribute.
	 * @see #setOutgoing1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityNode_Outgoing1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='outgoing'"
	 * @generated
	 */
	String getOutgoing1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ActivityNode#getOutgoing1 <em>Outgoing1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing1</em>' attribute.
	 * @see #getOutgoing1()
	 * @generated
	 */
	void setOutgoing1(String value);

	/**
	 * Returns the value of the '<em><b>Redefined Element1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Element1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Element1</em>' attribute.
	 * @see #setRedefinedElement1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityNode_RedefinedElement1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='redefinedElement'"
	 * @generated
	 */
	String getRedefinedElement1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ActivityNode#getRedefinedElement1 <em>Redefined Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined Element1</em>' attribute.
	 * @see #getRedefinedElement1()
	 * @generated
	 */
	void setRedefinedElement1(String value);

} // ActivityNode
