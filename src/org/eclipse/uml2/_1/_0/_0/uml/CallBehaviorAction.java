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
 * A representation of the model object '<em><b>Call Behavior Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         CallBehaviorAction is a call action that invokes a behavior directly rather than invoking a behavioral feature that, in turn, results in the invocation of that behavior. The argument values of the action are available to the execution of the invoked behavior. The execution of the call behavior action waits until the execution of the invoked behavior completes and a result is returned on its output pin. In particular, the invoked behavior may be an activity.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.CallBehaviorAction#getGroup10 <em>Group10</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.CallBehaviorAction#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.CallBehaviorAction#getBehavior1 <em>Behavior1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getCallBehaviorAction()
 * @model extendedMetaData="name='CallBehaviorAction' kind='elementOnly'"
 * @generated
 */
public interface CallBehaviorAction extends CallAction
{
	/**
	 * Returns the value of the '<em><b>Group10</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group10</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group10</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getCallBehaviorAction_Group10()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:47'"
	 * @generated
	 */
	FeatureMap getGroup10();

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The invoked behavior. It must be capable of accepting and returning control.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getCallBehaviorAction_Behavior()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='behavior' group='#group:47'"
	 * @generated
	 */
	EList<Behavior> getBehavior();

	/**
	 * Returns the value of the '<em><b>Behavior1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The invoked behavior. It must be capable of accepting and returning control.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior1</em>' attribute.
	 * @see #setBehavior1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getCallBehaviorAction_Behavior1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='behavior'"
	 * @generated
	 */
	String getBehavior1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.CallBehaviorAction#getBehavior1 <em>Behavior1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior1</em>' attribute.
	 * @see #getBehavior1()
	 * @generated
	 */
	void setBehavior1(String value);

} // CallBehaviorAction
