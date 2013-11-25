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
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.State#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.State#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.State#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.State#getSubmachine <em>Submachine</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.State#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.State#getRedefinedState <em>Redefined State</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.State#getDeferrableTrigger <em>Deferrable Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.State#getRegion <em>Region</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.State#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.State#getExit <em>Exit</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.State#getDoActivity <em>Do Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.State#getStateInvariant <em>State Invariant</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.State#getDeferrableTrigger1 <em>Deferrable Trigger1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.State#getIncoming1 <em>Incoming1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.State#getIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.State#getOutgoing1 <em>Outgoing1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.State#getRedefinedState1 <em>Redefined State1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.State#getSubmachine1 <em>Submachine1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getState()
 * @model extendedMetaData="name='State' kind='elementOnly'"
 * @generated
 */
public interface State extends Namespace
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getState_Group6()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:26'"
	 * @generated
	 */
	FeatureMap getGroup6();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Specifies the transitions departing from this vertex.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getState_Outgoing()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='outgoing' group='#group:26'"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the transitions entering this vertex.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getState_Incoming()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='incoming' group='#group:26'"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Submachine</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.StateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submachine</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submachine</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getState_Submachine()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='submachine' group='#group:26'"
	 * @generated
	 */
	EList<StateMachine> getSubmachine();

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ConnectionPointReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getState_Connection()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='connection' group='#group:26'"
	 * @generated
	 */
	EList<ConnectionPointReference> getConnection();

	/**
	 * Returns the value of the '<em><b>Redefined State</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined State</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getState_RedefinedState()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='redefinedState' group='#group:26'"
	 * @generated
	 */
	EList<State> getRedefinedState();

	/**
	 * Returns the value of the '<em><b>Deferrable Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deferrable Trigger</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deferrable Trigger</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getState_DeferrableTrigger()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='deferrableTrigger' group='#group:26'"
	 * @generated
	 */
	EList<Trigger> getDeferrableTrigger();

	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Region}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getState_Region()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='region' group='#group:26'"
	 * @generated
	 */
	EList<Region> getRegion();

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getState_Entry()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='entry' group='#group:26'"
	 * @generated
	 */
	EList<Activity> getEntry();

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getState_Exit()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='exit' group='#group:26'"
	 * @generated
	 */
	EList<Activity> getExit();

	/**
	 * Returns the value of the '<em><b>Do Activity</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Activity</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getState_DoActivity()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doActivity' group='#group:26'"
	 * @generated
	 */
	EList<Activity> getDoActivity();

	/**
	 * Returns the value of the '<em><b>State Invariant</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Invariant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Invariant</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getState_StateInvariant()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stateInvariant' group='#group:26'"
	 * @generated
	 */
	EList<Constraint> getStateInvariant();

	/**
	 * Returns the value of the '<em><b>Deferrable Trigger1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deferrable Trigger1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deferrable Trigger1</em>' attribute.
	 * @see #setDeferrableTrigger1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getState_DeferrableTrigger1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='deferrableTrigger'"
	 * @generated
	 */
	String getDeferrableTrigger1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.State#getDeferrableTrigger1 <em>Deferrable Trigger1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deferrable Trigger1</em>' attribute.
	 * @see #getDeferrableTrigger1()
	 * @generated
	 */
	void setDeferrableTrigger1(String value);

	/**
	 * Returns the value of the '<em><b>Incoming1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the transitions entering this vertex.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming1</em>' attribute.
	 * @see #setIncoming1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getState_Incoming1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='incoming'"
	 * @generated
	 */
	String getIncoming1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.State#getIncoming1 <em>Incoming1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming1</em>' attribute.
	 * @see #getIncoming1()
	 * @generated
	 */
	void setIncoming1(String value);

	/**
	 * Returns the value of the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Indicates whether it is possible to further specialize a RedefinableElement. If the value is true, then it is not possible to further specialize the RedefinableElement. Default value is false.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Leaf</em>' attribute.
	 * @see #setIsLeaf(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getState_IsLeaf()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isLeaf'"
	 * @generated
	 */
	String getIsLeaf();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.State#getIsLeaf <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Leaf</em>' attribute.
	 * @see #getIsLeaf()
	 * @generated
	 */
	void setIsLeaf(String value);

	/**
	 * Returns the value of the '<em><b>Outgoing1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Specifies the transitions departing from this vertex.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing1</em>' attribute.
	 * @see #setOutgoing1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getState_Outgoing1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='outgoing'"
	 * @generated
	 */
	String getOutgoing1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.State#getOutgoing1 <em>Outgoing1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing1</em>' attribute.
	 * @see #getOutgoing1()
	 * @generated
	 */
	void setOutgoing1(String value);

	/**
	 * Returns the value of the '<em><b>Redefined State1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined State1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined State1</em>' attribute.
	 * @see #setRedefinedState1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getState_RedefinedState1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='redefinedState'"
	 * @generated
	 */
	String getRedefinedState1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.State#getRedefinedState1 <em>Redefined State1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined State1</em>' attribute.
	 * @see #getRedefinedState1()
	 * @generated
	 */
	void setRedefinedState1(String value);

	/**
	 * Returns the value of the '<em><b>Submachine1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submachine1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submachine1</em>' attribute.
	 * @see #setSubmachine1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getState_Submachine1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='submachine'"
	 * @generated
	 */
	String getSubmachine1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.State#getSubmachine1 <em>Submachine1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submachine1</em>' attribute.
	 * @see #getSubmachine1()
	 * @generated
	 */
	void setSubmachine1(String value);

} // State
