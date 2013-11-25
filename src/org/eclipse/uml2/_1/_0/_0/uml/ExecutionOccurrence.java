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
 * A representation of the model object '<em><b>Execution Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         An ExecutionOccurrence is an instantiation of a unit of behavior within the Lifeline. Since the ExecutionOccurrence will have some duration, it is represented by two Eventoccurrences, the start EventOccurrence and the finish EventOccurrence. An ExecutionOccurrence is an InteractionFragment.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExecutionOccurrence#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExecutionOccurrence#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExecutionOccurrence#getFinish <em>Finish</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExecutionOccurrence#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExecutionOccurrence#getBehavior1 <em>Behavior1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExecutionOccurrence#getFinish1 <em>Finish1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExecutionOccurrence#getStart1 <em>Start1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExecutionOccurrence()
 * @model extendedMetaData="name='ExecutionOccurrence' kind='elementOnly'"
 * @generated
 */
public interface ExecutionOccurrence extends InteractionFragment
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExecutionOccurrence_Group6()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:23'"
	 * @generated
	 */
	FeatureMap getGroup6();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.EventOccurrence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 References the Eventoccurrence that designates the start of the Action
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExecutionOccurrence_Start()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='start' group='#group:23'"
	 * @generated
	 */
	EList<EventOccurrence> getStart();

	/**
	 * Returns the value of the '<em><b>Finish</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.EventOccurrence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 References the Eventoccurrence that designates the finish of the Action.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Finish</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExecutionOccurrence_Finish()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='finish' group='#group:23'"
	 * @generated
	 */
	EList<EventOccurrence> getFinish();

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the associated behavior
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExecutionOccurrence_Behavior()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='behavior' group='#group:23'"
	 * @generated
	 */
	EList<Behavior> getBehavior();

	/**
	 * Returns the value of the '<em><b>Behavior1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the associated behavior
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior1</em>' attribute.
	 * @see #setBehavior1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExecutionOccurrence_Behavior1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='behavior'"
	 * @generated
	 */
	String getBehavior1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ExecutionOccurrence#getBehavior1 <em>Behavior1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior1</em>' attribute.
	 * @see #getBehavior1()
	 * @generated
	 */
	void setBehavior1(String value);

	/**
	 * Returns the value of the '<em><b>Finish1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               References the Eventoccurrence that designates the finish of the Action.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Finish1</em>' attribute.
	 * @see #setFinish1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExecutionOccurrence_Finish1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='finish'"
	 * @generated
	 */
	String getFinish1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ExecutionOccurrence#getFinish1 <em>Finish1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish1</em>' attribute.
	 * @see #getFinish1()
	 * @generated
	 */
	void setFinish1(String value);

	/**
	 * Returns the value of the '<em><b>Start1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               References the Eventoccurrence that designates the start of the Action
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start1</em>' attribute.
	 * @see #setStart1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExecutionOccurrence_Start1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='start'"
	 * @generated
	 */
	String getStart1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ExecutionOccurrence#getStart1 <em>Start1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start1</em>' attribute.
	 * @see #getStart1()
	 * @generated
	 */
	void setStart1(String value);

} // ExecutionOccurrence
