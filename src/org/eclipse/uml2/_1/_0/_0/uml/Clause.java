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
 * A representation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Clause#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Clause#getTest <em>Test</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Clause#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Clause#getPredecessorClause <em>Predecessor Clause</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Clause#getSuccessorClause <em>Successor Clause</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Clause#getDecider <em>Decider</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Clause#getBodyOutput <em>Body Output</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Clause#getBody1 <em>Body1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Clause#getBodyOutput1 <em>Body Output1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Clause#getDecider1 <em>Decider1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Clause#getPredecessorClause1 <em>Predecessor Clause1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Clause#getSuccessorClause1 <em>Successor Clause1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Clause#getTest1 <em>Test1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClause()
 * @model extendedMetaData="name='Clause' kind='elementOnly'"
 * @generated
 */
public interface Clause extends Element
{
	/**
	 * Returns the value of the '<em><b>Group3</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group3</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClause_Group3()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:13'"
	 * @generated
	 */
	FeatureMap getGroup3();

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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClause_Test()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='test' group='#group:13'"
	 * @generated
	 */
	EList<ActivityNode> getTest();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClause_Body()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='body' group='#group:13'"
	 * @generated
	 */
	EList<ActivityNode> getBody();

	/**
	 * Returns the value of the '<em><b>Predecessor Clause</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Clause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor Clause</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor Clause</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClause_PredecessorClause()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='predecessorClause' group='#group:13'"
	 * @generated
	 */
	EList<Clause> getPredecessorClause();

	/**
	 * Returns the value of the '<em><b>Successor Clause</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Clause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successor Clause</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor Clause</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClause_SuccessorClause()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='successorClause' group='#group:13'"
	 * @generated
	 */
	EList<Clause> getSuccessorClause();

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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClause_Decider()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='decider' group='#group:13'"
	 * @generated
	 */
	EList<OutputPin> getDecider();

	/**
	 * Returns the value of the '<em><b>Body Output</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A list of output pins within the body fragment whose values are copied to the result pins of the containing conditional node or conditional node after execution of the clause body.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Output</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClause_BodyOutput()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bodyOutput' group='#group:13'"
	 * @generated
	 */
	EList<OutputPin> getBodyOutput();

	/**
	 * Returns the value of the '<em><b>Body1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body1</em>' attribute.
	 * @see #setBody1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClause_Body1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='body'"
	 * @generated
	 */
	String getBody1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Clause#getBody1 <em>Body1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body1</em>' attribute.
	 * @see #getBody1()
	 * @generated
	 */
	void setBody1(String value);

	/**
	 * Returns the value of the '<em><b>Body Output1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               A list of output pins within the body fragment whose values are copied to the result pins of the containing conditional node or conditional node after execution of the clause body.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Output1</em>' attribute.
	 * @see #setBodyOutput1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClause_BodyOutput1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='bodyOutput'"
	 * @generated
	 */
	String getBodyOutput1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Clause#getBodyOutput1 <em>Body Output1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Output1</em>' attribute.
	 * @see #getBodyOutput1()
	 * @generated
	 */
	void setBodyOutput1(String value);

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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClause_Decider1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='decider'"
	 * @generated
	 */
	String getDecider1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Clause#getDecider1 <em>Decider1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decider1</em>' attribute.
	 * @see #getDecider1()
	 * @generated
	 */
	void setDecider1(String value);

	/**
	 * Returns the value of the '<em><b>Predecessor Clause1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor Clause1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor Clause1</em>' attribute.
	 * @see #setPredecessorClause1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClause_PredecessorClause1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='predecessorClause'"
	 * @generated
	 */
	String getPredecessorClause1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Clause#getPredecessorClause1 <em>Predecessor Clause1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor Clause1</em>' attribute.
	 * @see #getPredecessorClause1()
	 * @generated
	 */
	void setPredecessorClause1(String value);

	/**
	 * Returns the value of the '<em><b>Successor Clause1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successor Clause1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor Clause1</em>' attribute.
	 * @see #setSuccessorClause1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClause_SuccessorClause1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='successorClause'"
	 * @generated
	 */
	String getSuccessorClause1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Clause#getSuccessorClause1 <em>Successor Clause1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successor Clause1</em>' attribute.
	 * @see #getSuccessorClause1()
	 * @generated
	 */
	void setSuccessorClause1(String value);

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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClause_Test1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='test'"
	 * @generated
	 */
	String getTest1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Clause#getTest1 <em>Test1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test1</em>' attribute.
	 * @see #getTest1()
	 * @generated
	 */
	void setTest1(String value);

} // Clause
