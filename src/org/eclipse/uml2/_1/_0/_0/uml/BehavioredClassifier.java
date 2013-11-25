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
 * A representation of the model object '<em><b>Behaviored Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A classifier can have behavior specifications defined in its namespace. One of these may specify the behavior of the classifier itself.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.BehavioredClassifier#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.BehavioredClassifier#getOwnedBehavior <em>Owned Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.BehavioredClassifier#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.BehavioredClassifier#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.BehavioredClassifier#getOwnedTrigger <em>Owned Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.BehavioredClassifier#getOwnedStateMachine <em>Owned State Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.BehavioredClassifier#getClassifierBehavior1 <em>Classifier Behavior1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavioredClassifier()
 * @model extendedMetaData="name='BehavioredClassifier' kind='elementOnly'"
 * @generated
 */
public interface BehavioredClassifier extends Classifier
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavioredClassifier_Group7()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:44'"
	 * @generated
	 */
	FeatureMap getGroup7();

	/**
	 * Returns the value of the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 References behavior specifications owned by a classifier. (Specializes Namespace.owned- Member.)
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Behavior</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavioredClassifier_OwnedBehavior()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ownedBehavior' group='#group:44'"
	 * @generated
	 */
	EList<Behavior> getOwnedBehavior();

	/**
	 * Returns the value of the '<em><b>Classifier Behavior</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A behavior specification that specifies the behavior of the classifier itself. (Specializes BehavioredClassifier.ownedBehavior.)
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier Behavior</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavioredClassifier_ClassifierBehavior()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='classifierBehavior' group='#group:44'"
	 * @generated
	 */
	EList<Behavior> getClassifierBehavior();

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Implementation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 (Specializes Element.ownedElement and Realization.clientDependency.)
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavioredClassifier_Implementation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='implementation' group='#group:44'"
	 * @generated
	 */
	EList<Implementation> getImplementation();

	/**
	 * Returns the value of the '<em><b>Owned Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Trigger</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Trigger</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavioredClassifier_OwnedTrigger()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ownedTrigger' group='#group:44'"
	 * @generated
	 */
	EList<Trigger> getOwnedTrigger();

	/**
	 * Returns the value of the '<em><b>Owned State Machine</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.StateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State Machine</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned State Machine</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavioredClassifier_OwnedStateMachine()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ownedStateMachine' group='#group:44'"
	 * @generated
	 */
	EList<StateMachine> getOwnedStateMachine();

	/**
	 * Returns the value of the '<em><b>Classifier Behavior1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               A behavior specification that specifies the behavior of the classifier itself. (Specializes BehavioredClassifier.ownedBehavior.)
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier Behavior1</em>' attribute.
	 * @see #setClassifierBehavior1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavioredClassifier_ClassifierBehavior1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='classifierBehavior'"
	 * @generated
	 */
	String getClassifierBehavior1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.BehavioredClassifier#getClassifierBehavior1 <em>Classifier Behavior1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Behavior1</em>' attribute.
	 * @see #getClassifierBehavior1()
	 * @generated
	 */
	void setClassifierBehavior1(String value);

} // BehavioredClassifier
