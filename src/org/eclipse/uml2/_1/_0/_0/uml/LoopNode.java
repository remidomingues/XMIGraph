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
 * A representation of the model object '<em><b>Loop Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LoopNode#getGroup9 <em>Group9</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LoopNode#getBodyPart <em>Body Part</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LoopNode#getSetupPart <em>Setup Part</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LoopNode#getDecider <em>Decider</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LoopNode#getTest <em>Test</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LoopNode#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LoopNode#getLoopVariable <em>Loop Variable</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LoopNode#getBodyOutput <em>Body Output</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LoopNode#getLoopVariableInput <em>Loop Variable Input</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LoopNode#getBodyOutput1 <em>Body Output1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LoopNode#getBodyPart1 <em>Body Part1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LoopNode#getDecider1 <em>Decider1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LoopNode#getIsTestedFirst <em>Is Tested First</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LoopNode#getSetupPart1 <em>Setup Part1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LoopNode#getTest1 <em>Test1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLoopNode()
 * @model extendedMetaData="name='LoopNode' kind='elementOnly'"
 * @generated
 */
public interface LoopNode extends StructuredActivityNode
{
	/**
	 * Returns the value of the '<em><b>Group9</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group9</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group9</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLoopNode_Group9()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:48'"
	 * @generated
	 */
	FeatureMap getGroup9();

	/**
	 * Returns the value of the '<em><b>Body Part</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Part</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLoopNode_BodyPart()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bodyPart' group='#group:48'"
	 * @generated
	 */
	EList<ActivityNode> getBodyPart();

	/**
	 * Returns the value of the '<em><b>Setup Part</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setup Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setup Part</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLoopNode_SetupPart()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setupPart' group='#group:48'"
	 * @generated
	 */
	EList<ActivityNode> getSetupPart();

	/**
	 * Returns the value of the '<em><b>Decider</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decider</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decider</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLoopNode_Decider()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='decider' group='#group:48'"
	 * @generated
	 */
	EList<OutputPin> getDecider();

	/**
	 * Returns the value of the '<em><b>Test</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLoopNode_Test()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='test' group='#group:48'"
	 * @generated
	 */
	EList<ActivityNode> getTest();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A list of output pins that constitute the data flow output of the entire loop.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLoopNode_Result()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='result' group='#group:48'"
	 * @generated
	 */
	EList<OutputPin> getResult();

	/**
	 * Returns the value of the '<em><b>Loop Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A list of output pins owned by the loop that hold the values of the loop variables during an execution of the loop. When the test fails, the values are copied to the result pins of the loop.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loop Variable</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLoopNode_LoopVariable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loopVariable' group='#group:48'"
	 * @generated
	 */
	EList<OutputPin> getLoopVariable();

	/**
	 * Returns the value of the '<em><b>Body Output</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A list of output pins within the body fragment the values of which are copied to the loop variable pins after completion of execution of the body, before the next iteration of the loop begins or before the loop exits.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Output</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLoopNode_BodyOutput()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bodyOutput' group='#group:48'"
	 * @generated
	 */
	EList<OutputPin> getBodyOutput();

	/**
	 * Returns the value of the '<em><b>Loop Variable Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A list of values that are copied into the loop variable pins before the first iteration of the loop.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loop Variable Input</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLoopNode_LoopVariableInput()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loopVariableInput' group='#group:48'"
	 * @generated
	 */
	EList<InputPin> getLoopVariableInput();

	/**
	 * Returns the value of the '<em><b>Body Output1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               A list of output pins within the body fragment the values of which are copied to the loop variable pins after completion of execution of the body, before the next iteration of the loop begins or before the loop exits.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Output1</em>' attribute.
	 * @see #setBodyOutput1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLoopNode_BodyOutput1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='bodyOutput'"
	 * @generated
	 */
	String getBodyOutput1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.LoopNode#getBodyOutput1 <em>Body Output1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Output1</em>' attribute.
	 * @see #getBodyOutput1()
	 * @generated
	 */
	void setBodyOutput1(String value);

	/**
	 * Returns the value of the '<em><b>Body Part1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Part1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Part1</em>' attribute.
	 * @see #setBodyPart1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLoopNode_BodyPart1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='bodyPart'"
	 * @generated
	 */
	String getBodyPart1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.LoopNode#getBodyPart1 <em>Body Part1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Part1</em>' attribute.
	 * @see #getBodyPart1()
	 * @generated
	 */
	void setBodyPart1(String value);

	/**
	 * Returns the value of the '<em><b>Decider1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decider1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decider1</em>' attribute.
	 * @see #setDecider1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLoopNode_Decider1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='decider'"
	 * @generated
	 */
	String getDecider1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.LoopNode#getDecider1 <em>Decider1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decider1</em>' attribute.
	 * @see #getDecider1()
	 * @generated
	 */
	void setDecider1(String value);

	/**
	 * Returns the value of the '<em><b>Is Tested First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Tested First</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Tested First</em>' attribute.
	 * @see #setIsTestedFirst(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLoopNode_IsTestedFirst()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isTestedFirst'"
	 * @generated
	 */
	String getIsTestedFirst();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.LoopNode#getIsTestedFirst <em>Is Tested First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Tested First</em>' attribute.
	 * @see #getIsTestedFirst()
	 * @generated
	 */
	void setIsTestedFirst(String value);

	/**
	 * Returns the value of the '<em><b>Setup Part1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setup Part1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setup Part1</em>' attribute.
	 * @see #setSetupPart1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLoopNode_SetupPart1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='setupPart'"
	 * @generated
	 */
	String getSetupPart1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.LoopNode#getSetupPart1 <em>Setup Part1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setup Part1</em>' attribute.
	 * @see #getSetupPart1()
	 * @generated
	 */
	void setSetupPart1(String value);

	/**
	 * Returns the value of the '<em><b>Test1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test1</em>' attribute.
	 * @see #setTest1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLoopNode_Test1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='test'"
	 * @generated
	 */
	String getTest1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.LoopNode#getTest1 <em>Test1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test1</em>' attribute.
	 * @see #getTest1()
	 * @generated
	 */
	void setTest1(String value);

} // LoopNode
