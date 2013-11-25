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
 * A representation of the model object '<em><b>Invocation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InvocationAction#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InvocationAction#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InvocationAction#getOnPort <em>On Port</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InvocationAction#getOnPort1 <em>On Port1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInvocationAction()
 * @model extendedMetaData="name='InvocationAction' kind='elementOnly'"
 * @generated
 */
public interface InvocationAction extends Action
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInvocationAction_Group8()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:40'"
	 * @generated
	 */
	FeatureMap getGroup8();

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Specification of an argument value that appears during execution.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInvocationAction_Argument()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='argument' group='#group:40'"
	 * @generated
	 */
	EList<InputPin> getArgument();

	/**
	 * Returns the value of the '<em><b>On Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Port</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInvocationAction_OnPort()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='onPort' group='#group:40'"
	 * @generated
	 */
	EList<Port> getOnPort();

	/**
	 * Returns the value of the '<em><b>On Port1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Port1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Port1</em>' attribute.
	 * @see #setOnPort1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInvocationAction_OnPort1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='onPort'"
	 * @generated
	 */
	String getOnPort1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.InvocationAction#getOnPort1 <em>On Port1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Port1</em>' attribute.
	 * @see #getOnPort1()
	 * @generated
	 */
	void setOnPort1(String value);

} // InvocationAction
