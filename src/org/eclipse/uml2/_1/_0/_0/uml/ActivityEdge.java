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
 * A representation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityEdge#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityEdge#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityEdge#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityEdge#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityEdge#getInPartition <em>In Partition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityEdge#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityEdge#getInterrupts <em>Interrupts</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityEdge#getInPartition1 <em>In Partition1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityEdge#getInterrupts1 <em>Interrupts1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityEdge#getRedefinedElement1 <em>Redefined Element1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityEdge#getSource1 <em>Source1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ActivityEdge#getTarget1 <em>Target1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityEdge()
 * @model extendedMetaData="name='ActivityEdge' kind='elementOnly'"
 * @generated
 */
public interface ActivityEdge extends RedefinableElement
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityEdge_Group5()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:23'"
	 * @generated
	 */
	FeatureMap getGroup5();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityEdge_Source()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='source' group='#group:23'"
	 * @generated
	 */
	EList<ActivityNode> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityEdge_Target()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='target' group='#group:23'"
	 * @generated
	 */
	EList<ActivityNode> getTarget();

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityEdge_Guard()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='guard' group='#group:23'"
	 * @generated
	 */
	EList<ValueSpecification> getGuard();

	/**
	 * Returns the value of the '<em><b>Redefined Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Element</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityEdge_RedefinedElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='redefinedElement' group='#group:23'"
	 * @generated
	 */
	EList<ActivityEdge> getRedefinedElement();

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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityEdge_InPartition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inPartition' group='#group:23'"
	 * @generated
	 */
	EList<ActivityPartition> getInPartition();

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityEdge_Weight()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='weight' group='#group:23'"
	 * @generated
	 */
	EList<ValueSpecification> getWeight();

	/**
	 * Returns the value of the '<em><b>Interrupts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.InterruptibleActivityRegion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interrupts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interrupts</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityEdge_Interrupts()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interrupts' group='#group:23'"
	 * @generated
	 */
	EList<InterruptibleActivityRegion> getInterrupts();

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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityEdge_InPartition1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='inPartition'"
	 * @generated
	 */
	String getInPartition1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ActivityEdge#getInPartition1 <em>In Partition1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Partition1</em>' attribute.
	 * @see #getInPartition1()
	 * @generated
	 */
	void setInPartition1(String value);

	/**
	 * Returns the value of the '<em><b>Interrupts1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interrupts1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interrupts1</em>' attribute.
	 * @see #setInterrupts1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityEdge_Interrupts1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='interrupts'"
	 * @generated
	 */
	String getInterrupts1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ActivityEdge#getInterrupts1 <em>Interrupts1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interrupts1</em>' attribute.
	 * @see #getInterrupts1()
	 * @generated
	 */
	void setInterrupts1(String value);

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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityEdge_RedefinedElement1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='redefinedElement'"
	 * @generated
	 */
	String getRedefinedElement1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ActivityEdge#getRedefinedElement1 <em>Redefined Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined Element1</em>' attribute.
	 * @see #getRedefinedElement1()
	 * @generated
	 */
	void setRedefinedElement1(String value);

	/**
	 * Returns the value of the '<em><b>Source1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source1</em>' attribute.
	 * @see #setSource1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityEdge_Source1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='source'"
	 * @generated
	 */
	String getSource1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ActivityEdge#getSource1 <em>Source1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source1</em>' attribute.
	 * @see #getSource1()
	 * @generated
	 */
	void setSource1(String value);

	/**
	 * Returns the value of the '<em><b>Target1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target1</em>' attribute.
	 * @see #setTarget1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getActivityEdge_Target1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='target'"
	 * @generated
	 */
	String getTarget1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ActivityEdge#getTarget1 <em>Target1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target1</em>' attribute.
	 * @see #getTarget1()
	 * @generated
	 */
	void setTarget1(String value);

} // ActivityEdge
