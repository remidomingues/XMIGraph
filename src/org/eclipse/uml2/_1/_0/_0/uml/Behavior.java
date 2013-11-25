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
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Behavior is a specification of how its context classifier changes state over time. This specification may be either a definition of possible behavior execution or emergent behavior, or a selective illustration of an interesting subset of possible executions. The latter form is typically used for capturing examples, such as a trace of a particular execution. A classifier behavior is always a definition of behavior and not an illustration. It describes the sequence of state changes an instance of a classifier may undergo in the course of its lifetime. Its precise semantics depends on the kind of classifier. For example, the classifier behavior of a collaboration represents emergent behavior of all the parts, whereas the classifier behavior of a class is just the behavior of instances of the class separated from the behaviors of any of its parts. When a behavior is associated as the method of a behavioral feature, it defines the implementation of that feature; i.e., the computation that generates the effects of the behavioral feature. As a classifier, a behavior can be specialized. Instantiating a behavior is referred to as “invocating” the behavior, an instantiated behavior is also called a behavior “execution.” A behavior may be invoked directly or its invocation may be the result of invoking the behavioral feature that specifies this behavior. A behavior can also be instantiated as an object in virtue of it being a class. The specification of a behavior can take a number of forms, as described in the subclasses of Behavior. Behavior is an abstract metaclass factoring out the commonalities of these different specification mechanisms. When a behavior is invoked, its execution receives a set of input values that are used to affect the course of execution and as a result of its execution it produces a set of output values which are returned, as specified by its parameters. The observable effects of a behavior execution may include changes of values of various objects involved in the execution, the creation and destruction of objects, generation of communications between objects, as well as an explicit set of output values.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Behavior#getGroup9 <em>Group9</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Behavior#getRedefinedBehavior <em>Redefined Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Behavior#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Behavior#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Behavior#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Behavior#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Behavior#getOwnedParameterSet <em>Owned Parameter Set</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Behavior#getIsReentrant <em>Is Reentrant</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Behavior#getPostcondition1 <em>Postcondition1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Behavior#getPrecondition1 <em>Precondition1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Behavior#getRedefinedBehavior1 <em>Redefined Behavior1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Behavior#getSpecification1 <em>Specification1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavior()
 * @model extendedMetaData="name='Behavior' kind='elementOnly'"
 * @generated
 */
public interface Behavior extends org.eclipse.uml2._1._0._0.uml.Class
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavior_Group9()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:59'"
	 * @generated
	 */
	FeatureMap getGroup9();

	/**
	 * Returns the value of the '<em><b>Redefined Behavior</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Behavior</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Behavior</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavior_RedefinedBehavior()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='redefinedBehavior' group='#group:59'"
	 * @generated
	 */
	EList<Behavior> getRedefinedBehavior();

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Designates a behavioral feature that the behavior implements. The behavioral feature must be owned by the classifier that owns the behavior or be inherited by it. The parameters of the behavioral feature and the implementing behavior must match. If a behavior does not have a specification, it is directly associated with a classifier (i.e., it is the behavior of the classifier as a whole).
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavior_Specification()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='specification' group='#group:59'"
	 * @generated
	 */
	EList<BehavioralFeature> getSpecification();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 References a list of parameters to the behavior which describes the order and type of arguments that can be given when the behavior is invoked and of the values which will be returned when the behavior completes its execution. (Specializes Namespace.owned- Member.)
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavior_Parameter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='parameter' group='#group:59'"
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavior_Precondition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='precondition' group='#group:59'"
	 * @generated
	 */
	EList<Constraint> getPrecondition();

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcondition</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavior_Postcondition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='postcondition' group='#group:59'"
	 * @generated
	 */
	EList<Constraint> getPostcondition();

	/**
	 * Returns the value of the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ParameterSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter Set</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavior_OwnedParameterSet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ownedParameterSet' group='#group:59'"
	 * @generated
	 */
	EList<ParameterSet> getOwnedParameterSet();

	/**
	 * Returns the value of the '<em><b>Is Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Tells whether the behavior can be invoked while it is still executing from a previous invocation.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Reentrant</em>' attribute.
	 * @see #setIsReentrant(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavior_IsReentrant()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isReentrant'"
	 * @generated
	 */
	String getIsReentrant();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Behavior#getIsReentrant <em>Is Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reentrant</em>' attribute.
	 * @see #getIsReentrant()
	 * @generated
	 */
	void setIsReentrant(String value);

	/**
	 * Returns the value of the '<em><b>Postcondition1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcondition1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcondition1</em>' attribute.
	 * @see #setPostcondition1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavior_Postcondition1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='postcondition'"
	 * @generated
	 */
	String getPostcondition1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Behavior#getPostcondition1 <em>Postcondition1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postcondition1</em>' attribute.
	 * @see #getPostcondition1()
	 * @generated
	 */
	void setPostcondition1(String value);

	/**
	 * Returns the value of the '<em><b>Precondition1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition1</em>' attribute.
	 * @see #setPrecondition1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavior_Precondition1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='precondition'"
	 * @generated
	 */
	String getPrecondition1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Behavior#getPrecondition1 <em>Precondition1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition1</em>' attribute.
	 * @see #getPrecondition1()
	 * @generated
	 */
	void setPrecondition1(String value);

	/**
	 * Returns the value of the '<em><b>Redefined Behavior1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Behavior1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Behavior1</em>' attribute.
	 * @see #setRedefinedBehavior1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavior_RedefinedBehavior1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='redefinedBehavior'"
	 * @generated
	 */
	String getRedefinedBehavior1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Behavior#getRedefinedBehavior1 <em>Redefined Behavior1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined Behavior1</em>' attribute.
	 * @see #getRedefinedBehavior1()
	 * @generated
	 */
	void setRedefinedBehavior1(String value);

	/**
	 * Returns the value of the '<em><b>Specification1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Designates a behavioral feature that the behavior implements. The behavioral feature must be owned by the classifier that owns the behavior or be inherited by it. The parameters of the behavioral feature and the implementing behavior must match. If a behavior does not have a specification, it is directly associated with a classifier (i.e., it is the behavior of the classifier as a whole).
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specification1</em>' attribute.
	 * @see #setSpecification1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getBehavior_Specification1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='specification'"
	 * @generated
	 */
	String getSpecification1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Behavior#getSpecification1 <em>Specification1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification1</em>' attribute.
	 * @see #getSpecification1()
	 * @generated
	 */
	void setSpecification1(String value);

} // Behavior
