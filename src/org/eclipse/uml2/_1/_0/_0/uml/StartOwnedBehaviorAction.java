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
 * A representation of the model object '<em><b>Start Owned Behavior Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         (CompleteActions) StartOwnedBehaviorAction is an action that starts the owned behavior of the input.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.StartOwnedBehaviorAction#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.StartOwnedBehaviorAction#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getStartOwnedBehaviorAction()
 * @model extendedMetaData="name='StartOwnedBehaviorAction' kind='elementOnly'"
 * @generated
 */
public interface StartOwnedBehaviorAction extends Action
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getStartOwnedBehaviorAction_Group8()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:40'"
	 * @generated
	 */
	FeatureMap getGroup8();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Holds the object on which to start the owned behavior. (Specializes Action.input.)
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getStartOwnedBehaviorAction_Object()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object' group='#group:40'"
	 * @generated
	 */
	EList<InputPin> getObject();

} // StartOwnedBehaviorAction
