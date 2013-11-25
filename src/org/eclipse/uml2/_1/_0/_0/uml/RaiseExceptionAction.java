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
 * A representation of the model object '<em><b>Raise Exception Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         (CompleteActions) RaiseExceptionAction is an action that causes an exception to occur. The input value becomes the exception object.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.RaiseExceptionAction#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.RaiseExceptionAction#getException <em>Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.RaiseExceptionAction#getException1 <em>Exception1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getRaiseExceptionAction()
 * @model extendedMetaData="name='RaiseExceptionAction' kind='elementOnly'"
 * @generated
 */
public interface RaiseExceptionAction extends Action
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getRaiseExceptionAction_Group8()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:40'"
	 * @generated
	 */
	FeatureMap getGroup8();

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 An input pin whose value becomes an exception object.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getRaiseExceptionAction_Exception()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='exception' group='#group:40'"
	 * @generated
	 */
	EList<InputPin> getException();

	/**
	 * Returns the value of the '<em><b>Exception1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               An input pin whose value becomes an exception object.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception1</em>' attribute.
	 * @see #setException1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getRaiseExceptionAction_Exception1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='exception'"
	 * @generated
	 */
	String getException1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.RaiseExceptionAction#getException1 <em>Exception1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception1</em>' attribute.
	 * @see #getException1()
	 * @generated
	 */
	void setException1(String value);

} // RaiseExceptionAction
