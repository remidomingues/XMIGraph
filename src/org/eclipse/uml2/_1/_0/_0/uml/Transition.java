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
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Transition#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Transition#getRedefinedTransition <em>Redefined Transition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Transition#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Transition#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Transition#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Transition#getRedefinedTransition1 <em>Redefined Transition1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Transition#getSource1 <em>Source1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Transition#getTarget1 <em>Target1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Transition#getTrigger1 <em>Trigger1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTransition()
 * @model extendedMetaData="name='Transition' kind='elementOnly'"
 * @generated
 */
public interface Transition extends RedefinableElement
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTransition_Group5()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:23'"
	 * @generated
	 */
	FeatureMap getGroup5();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Vertex}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Designates the originating vertex (state or pseudostate) of the transition.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTransition_Source()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='source' group='#group:23'"
	 * @generated
	 */
	EList<Vertex> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Vertex}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Designates the target vertex that is reached when the transition is taken.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTransition_Target()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='target' group='#group:23'"
	 * @generated
	 */
	EList<Vertex> getTarget();

	/**
	 * Returns the value of the '<em><b>Redefined Transition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Transition</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTransition_RedefinedTransition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='redefinedTransition' group='#group:23'"
	 * @generated
	 */
	EList<Transition> getRedefinedTransition();

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Specifies the triggers that may fire the transition.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTransition_Trigger()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='trigger' group='#group:23'"
	 * @generated
	 */
	EList<Trigger> getTrigger();

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A guard is a constraint that provides a fine-grained control over the firing of the transition. The guard is evaluated when an event is dispatched by the state machine. If the guard is true at that time, the transition may be enabled, otherwise, it is disabled. Guards should be pure expressions without side effects. Guard expressions with side effects are ill formed.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTransition_Guard()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='guard' group='#group:23'"
	 * @generated
	 */
	EList<Constraint> getGuard();

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Specifies an optional activity to be performed when the transition fires.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effect</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTransition_Effect()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='effect' group='#group:23'"
	 * @generated
	 */
	EList<Activity> getEffect();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2._1._0._0.uml.TransitionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See definition of TransitionKind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.TransitionKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(TransitionKind)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTransition_Kind()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='kind'"
	 * @generated
	 */
	TransitionKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Transition#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.TransitionKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TransitionKind value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Transition#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(TransitionKind)
	 * @generated
	 */
	void unsetKind();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2._1._0._0.uml.Transition#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(TransitionKind)
	 * @generated
	 */
	boolean isSetKind();

	/**
	 * Returns the value of the '<em><b>Redefined Transition1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Transition1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Transition1</em>' attribute.
	 * @see #setRedefinedTransition1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTransition_RedefinedTransition1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='redefinedTransition'"
	 * @generated
	 */
	String getRedefinedTransition1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Transition#getRedefinedTransition1 <em>Redefined Transition1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined Transition1</em>' attribute.
	 * @see #getRedefinedTransition1()
	 * @generated
	 */
	void setRedefinedTransition1(String value);

	/**
	 * Returns the value of the '<em><b>Source1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Designates the originating vertex (state or pseudostate) of the transition.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source1</em>' attribute.
	 * @see #setSource1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTransition_Source1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='source'"
	 * @generated
	 */
	String getSource1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Transition#getSource1 <em>Source1</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Designates the target vertex that is reached when the transition is taken.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target1</em>' attribute.
	 * @see #setTarget1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTransition_Target1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='target'"
	 * @generated
	 */
	String getTarget1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Transition#getTarget1 <em>Target1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target1</em>' attribute.
	 * @see #getTarget1()
	 * @generated
	 */
	void setTarget1(String value);

	/**
	 * Returns the value of the '<em><b>Trigger1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Specifies the triggers that may fire the transition.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger1</em>' attribute.
	 * @see #setTrigger1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTransition_Trigger1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='trigger'"
	 * @generated
	 */
	String getTrigger1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Transition#getTrigger1 <em>Trigger1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger1</em>' attribute.
	 * @see #getTrigger1()
	 * @generated
	 */
	void setTrigger1(String value);

} // Transition
