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
 * A representation of the model object '<em><b>Read Is Classified Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         This action tests the classification of an object against a given class. It can be restricted to testing direct instances.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ReadIsClassifiedObjectAction#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ReadIsClassifiedObjectAction#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ReadIsClassifiedObjectAction#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ReadIsClassifiedObjectAction#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ReadIsClassifiedObjectAction#getClassifier1 <em>Classifier1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ReadIsClassifiedObjectAction#getIsDirect <em>Is Direct</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReadIsClassifiedObjectAction()
 * @model extendedMetaData="name='ReadIsClassifiedObjectAction' kind='elementOnly'"
 * @generated
 */
public interface ReadIsClassifiedObjectAction extends Action
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReadIsClassifiedObjectAction_Group8()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:40'"
	 * @generated
	 */
	FeatureMap getGroup8();

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The classifier against which the classification of the input object is tested.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReadIsClassifiedObjectAction_Classifier()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='classifier' group='#group:40'"
	 * @generated
	 */
	EList<Classifier> getClassifier();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 After termination of the action, will hold the result of the test. (Specializes Action.output.)
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReadIsClassifiedObjectAction_Result()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='result' group='#group:40'"
	 * @generated
	 */
	EList<OutputPin> getResult();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Holds the object whose classification is to be tested. (Specializes Action.input.)
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReadIsClassifiedObjectAction_Object()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object' group='#group:40'"
	 * @generated
	 */
	EList<InputPin> getObject();

	/**
	 * Returns the value of the '<em><b>Classifier1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The classifier against which the classification of the input object is tested.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier1</em>' attribute.
	 * @see #setClassifier1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReadIsClassifiedObjectAction_Classifier1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='classifier'"
	 * @generated
	 */
	String getClassifier1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ReadIsClassifiedObjectAction#getClassifier1 <em>Classifier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier1</em>' attribute.
	 * @see #getClassifier1()
	 * @generated
	 */
	void setClassifier1(String value);

	/**
	 * Returns the value of the '<em><b>Is Direct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Indicates whether the classifier must directly classify the input object. The default value is false.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Direct</em>' attribute.
	 * @see #setIsDirect(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReadIsClassifiedObjectAction_IsDirect()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isDirect'"
	 * @generated
	 */
	String getIsDirect();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ReadIsClassifiedObjectAction#getIsDirect <em>Is Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Direct</em>' attribute.
	 * @see #getIsDirect()
	 * @generated
	 */
	void setIsDirect(String value);

} // ReadIsClassifiedObjectAction
