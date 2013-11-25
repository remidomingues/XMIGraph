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
 * A representation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A behavioral feature specifies that an instance of a classifier will respond to a designated request by invoking a behavior. BehavioralFeature is an abstract metaclass specializing Feature and Namespace. Kinds of behavioral aspects are modeled by subclasses of BehavioralFeature.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.BehavioralFeature#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.BehavioralFeature#getFormalParameter <em>Formal Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.BehavioralFeature#getReturnResult <em>Return Result</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.BehavioralFeature#getRaisedException <em>Raised Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.BehavioralFeature#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.BehavioralFeature#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.BehavioralFeature#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.BehavioralFeature#getIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.BehavioralFeature#getIsStatic <em>Is Static</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.BehavioralFeature#getMethod1 <em>Method1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.BehavioralFeature#getRaisedException1 <em>Raised Exception1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavioralFeature()
 * @model extendedMetaData="name='BehavioralFeature' kind='elementOnly'"
 * @generated
 */
public interface BehavioralFeature extends Namespace
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavioralFeature_Group6()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:26'"
	 * @generated
	 */
	FeatureMap getGroup6();

	/**
	 * Returns the value of the '<em><b>Formal Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Specifies the ordered set of formal parameters of this BehavioralFeature. Subsets BehavioralFeature::parameter and Namespace::ownedMember.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formal Parameter</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavioralFeature_FormalParameter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='formalParameter' group='#group:26'"
	 * @generated
	 */
	EList<Parameter> getFormalParameter();

	/**
	 * Returns the value of the '<em><b>Return Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Specifies the ordered set of return results of this BehavioralFeature. Subsets Behavioral- Feature::parameter and Namespace::ownedMember.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Result</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavioralFeature_ReturnResult()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='returnResult' group='#group:26'"
	 * @generated
	 */
	EList<Parameter> getReturnResult();

	/**
	 * Returns the value of the '<em><b>Raised Exception</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 References the Types representing exceptions that may be raised during an invocation of this operation.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Raised Exception</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavioralFeature_RaisedException()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='raisedException' group='#group:26'"
	 * @generated
	 */
	EList<Type> getRaisedException();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A behavioral description that implements the behavioral feature. There may be at most one behavior for a particular pairing of a classifier (as owner of the behavior) and a behavioral feature (as specification of the behavior).
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavioralFeature_Method()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='method' group='#group:26'"
	 * @generated
	 */
	EList<Behavior> getMethod();

	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2._1._0._0.uml.CallConcurrencyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concurrency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.CallConcurrencyKind
	 * @see #isSetConcurrency()
	 * @see #unsetConcurrency()
	 * @see #setConcurrency(CallConcurrencyKind)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavioralFeature_Concurrency()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='concurrency'"
	 * @generated
	 */
	CallConcurrencyKind getConcurrency();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.BehavioralFeature#getConcurrency <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.CallConcurrencyKind
	 * @see #isSetConcurrency()
	 * @see #unsetConcurrency()
	 * @see #getConcurrency()
	 * @generated
	 */
	void setConcurrency(CallConcurrencyKind value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2._1._0._0.uml.BehavioralFeature#getConcurrency <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConcurrency()
	 * @see #getConcurrency()
	 * @see #setConcurrency(CallConcurrencyKind)
	 * @generated
	 */
	void unsetConcurrency();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2._1._0._0.uml.BehavioralFeature#getConcurrency <em>Concurrency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Concurrency</em>' attribute is set.
	 * @see #unsetConcurrency()
	 * @see #getConcurrency()
	 * @see #setConcurrency(CallConcurrencyKind)
	 * @generated
	 */
	boolean isSetConcurrency();

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               If true, then the behavioral feature does not have an implementation, and one must be supplied by a more specific element. If false, the behavioral feature must have an implementation in the classifier or one must be inherited from a more general element. Communications
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavioralFeature_IsAbstract()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isAbstract'"
	 * @generated
	 */
	String getIsAbstract();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.BehavioralFeature#getIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #getIsAbstract()
	 * @generated
	 */
	void setIsAbstract(String value);

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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavioralFeature_IsLeaf()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isLeaf'"
	 * @generated
	 */
	String getIsLeaf();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.BehavioralFeature#getIsLeaf <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Leaf</em>' attribute.
	 * @see #getIsLeaf()
	 * @generated
	 */
	void setIsLeaf(String value);

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Specifies whether the feature is applied at the classifier-level (true) or the instance-level (false). Default value is false.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavioralFeature_IsStatic()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isStatic'"
	 * @generated
	 */
	String getIsStatic();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.BehavioralFeature#getIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #getIsStatic()
	 * @generated
	 */
	void setIsStatic(String value);

	/**
	 * Returns the value of the '<em><b>Method1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               A behavioral description that implements the behavioral feature. There may be at most one behavior for a particular pairing of a classifier (as owner of the behavior) and a behavioral feature (as specification of the behavior).
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method1</em>' attribute.
	 * @see #setMethod1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavioralFeature_Method1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='method'"
	 * @generated
	 */
	String getMethod1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.BehavioralFeature#getMethod1 <em>Method1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method1</em>' attribute.
	 * @see #getMethod1()
	 * @generated
	 */
	void setMethod1(String value);

	/**
	 * Returns the value of the '<em><b>Raised Exception1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               References the Types representing exceptions that may be raised during an invocation of this operation.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Raised Exception1</em>' attribute.
	 * @see #setRaisedException1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavioralFeature_RaisedException1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='raisedException'"
	 * @generated
	 */
	String getRaisedException1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.BehavioralFeature#getRaisedException1 <em>Raised Exception1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raised Exception1</em>' attribute.
	 * @see #getRaisedException1()
	 * @generated
	 */
	void setRaisedException1(String value);

} // BehavioralFeature
