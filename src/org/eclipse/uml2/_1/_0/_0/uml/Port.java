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
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Ports represent interaction points between a classifier and its environment. The interfaces associated with a port specify the nature of the interactions that may occur over a port. The required interfaces of a port characterize the requests which may be made from the classifier to its environment through this port. The provided interfaces of a port characterize requests to the classifier that its environment may make through this port. A port has the ability to specify that any requests arriving at this port are handled by the behavior of the instance of the owning classifier, rather than being forwarded to any contained instances, if any.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Port#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Port#getRedefinedPort <em>Redefined Port</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Port#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Port#getIsBehavior <em>Is Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Port#getIsService <em>Is Service</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Port#getProtocol1 <em>Protocol1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Port#getRedefinedPort1 <em>Redefined Port1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPort()
 * @model extendedMetaData="name='Port' kind='elementOnly'"
 * @generated
 */
public interface Port extends Property
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPort_Group7()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:49'"
	 * @generated
	 */
	FeatureMap getGroup7();

	/**
	 * Returns the value of the '<em><b>Redefined Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A port may be redefined when its containing classifier is specialized. The redefining port may have additional interfaces to those that are associated with the redefined port or it may replace an interface by one of its subtypes. (Subsets Element.redefinedElement.)
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Port</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPort_RedefinedPort()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='redefinedPort' group='#group:49'"
	 * @generated
	 */
	EList<Port> getRedefinedPort();

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ProtocolStateMachine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 References an optional protocol state machine which describes valid interactions at this interaction point.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPort_Protocol()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='protocol' group='#group:49'"
	 * @generated
	 */
	EList<ProtocolStateMachine> getProtocol();

	/**
	 * Returns the value of the '<em><b>Is Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Specifies whether requests arriving at this port are sent to the classifier behavior of this classifier (see “BehavioredClassifier (from BasicBehaviors)” on page 387). Such ports are referred to as behavior port. Any invocation of a behavioral feature targeted at a behavior port will be handled by the instance of the owning classifier itself, rather than by any instances that this classifier may contain. The default value is false.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Behavior</em>' attribute.
	 * @see #setIsBehavior(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPort_IsBehavior()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isBehavior'"
	 * @generated
	 */
	String getIsBehavior();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Port#getIsBehavior <em>Is Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Behavior</em>' attribute.
	 * @see #getIsBehavior()
	 * @generated
	 */
	void setIsBehavior(String value);

	/**
	 * Returns the value of the '<em><b>Is Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               If true indicates that this port is used to provide the published functionality of a classifier; if false, this port is used to implement the classifier but is not part of the essential externally- visible functionality of the classifier and can, therefore, be altered or deleted along with the internal implementation of the classifier and other properties that are considered part of its implementation. The default value for this attribute is true.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Service</em>' attribute.
	 * @see #setIsService(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPort_IsService()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isService'"
	 * @generated
	 */
	String getIsService();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Port#getIsService <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Service</em>' attribute.
	 * @see #getIsService()
	 * @generated
	 */
	void setIsService(String value);

	/**
	 * Returns the value of the '<em><b>Protocol1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               References an optional protocol state machine which describes valid interactions at this interaction point.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol1</em>' attribute.
	 * @see #setProtocol1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPort_Protocol1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='protocol'"
	 * @generated
	 */
	String getProtocol1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Port#getProtocol1 <em>Protocol1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol1</em>' attribute.
	 * @see #getProtocol1()
	 * @generated
	 */
	void setProtocol1(String value);

	/**
	 * Returns the value of the '<em><b>Redefined Port1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               A port may be redefined when its containing classifier is specialized. The redefining port may have additional interfaces to those that are associated with the redefined port or it may replace an interface by one of its subtypes. (Subsets Element.redefinedElement.)
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Port1</em>' attribute.
	 * @see #setRedefinedPort1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPort_RedefinedPort1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='redefinedPort'"
	 * @generated
	 */
	String getRedefinedPort1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Port#getRedefinedPort1 <em>Redefined Port1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined Port1</em>' attribute.
	 * @see #getRedefinedPort1()
	 * @generated
	 */
	void setRedefinedPort1(String value);

} // Port
