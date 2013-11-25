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
 * A representation of the model object '<em><b>Accept Event Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.AcceptEventAction#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.AcceptEventAction#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.AcceptEventAction#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.AcceptEventAction#getResult1 <em>Result1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.AcceptEventAction#getTrigger1 <em>Trigger1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getAcceptEventAction()
 * @model extendedMetaData="name='AcceptEventAction' kind='elementOnly'"
 * @generated
 */
public interface AcceptEventAction extends Action
{
	/**
	 * Returns the value of the '<em><b>Group8</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group8</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group8</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getAcceptEventAction_Group8()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:40'"
	 * @generated
	 */
	FeatureMap getGroup8();

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The type of event accepted by the action, as specified by a trigger. If it is a signal trigger, a signal of any subtype of the specified signal type is accepted.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getAcceptEventAction_Trigger()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='trigger' group='#group:40'"
	 * @generated
	 */
	EList<Trigger> getTrigger();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Pin holding the event object that has been received. Event objects may be copied in transmission, so identity might not be preserved.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getAcceptEventAction_Result()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='result' group='#group:40'"
	 * @generated
	 */
	EList<OutputPin> getResult();

	/**
	 * Returns the value of the '<em><b>Result1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Pin holding the event object that has been received. Event objects may be copied in transmission, so identity might not be preserved.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result1</em>' attribute.
	 * @see #setResult1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getAcceptEventAction_Result1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='result'"
	 * @generated
	 */
	String getResult1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.AcceptEventAction#getResult1 <em>Result1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result1</em>' attribute.
	 * @see #getResult1()
	 * @generated
	 */
	void setResult1(String value);

	/**
	 * Returns the value of the '<em><b>Trigger1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The type of event accepted by the action, as specified by a trigger. If it is a signal trigger, a signal of any subtype of the specified signal type is accepted.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger1</em>' attribute.
	 * @see #setTrigger1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getAcceptEventAction_Trigger1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='trigger'"
	 * @generated
	 */
	String getTrigger1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.AcceptEventAction#getTrigger1 <em>Trigger1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger1</em>' attribute.
	 * @see #getTrigger1()
	 * @generated
	 */
	void setTrigger1(String value);

} // AcceptEventAction
