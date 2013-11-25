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
 * A representation of the model object '<em><b>Exception Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         (ExtraStructuredActivities) An exception handler is an element that specifies a body to execute in case the specified exception occurs during the execution of the protected node.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExceptionHandler#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExceptionHandler#getHandlerBody <em>Handler Body</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExceptionHandler#getExceptionInput <em>Exception Input</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExceptionHandler#getExceptionType <em>Exception Type</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExceptionHandler#getExceptionInput1 <em>Exception Input1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExceptionHandler#getExceptionType1 <em>Exception Type1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ExceptionHandler#getHandlerBody1 <em>Handler Body1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExceptionHandler()
 * @model extendedMetaData="name='ExceptionHandler' kind='elementOnly'"
 * @generated
 */
public interface ExceptionHandler extends Element
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExceptionHandler_Group3()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:13'"
	 * @generated
	 */
	FeatureMap getGroup3();

	/**
	 * Returns the value of the '<em><b>Handler Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ExecutableNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A node that is executed if the handler satisfies an uncaught exception.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handler Body</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExceptionHandler_HandlerBody()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='handlerBody' group='#group:13'"
	 * @generated
	 */
	EList<ExecutableNode> getHandlerBody();

	/**
	 * Returns the value of the '<em><b>Exception Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ObjectNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Input</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExceptionHandler_ExceptionInput()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='exceptionInput' group='#group:13'"
	 * @generated
	 */
	EList<ObjectNode> getExceptionInput();

	/**
	 * Returns the value of the '<em><b>Exception Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Type</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExceptionHandler_ExceptionType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='exceptionType' group='#group:13'"
	 * @generated
	 */
	EList<Classifier> getExceptionType();

	/**
	 * Returns the value of the '<em><b>Exception Input1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Input1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Input1</em>' attribute.
	 * @see #setExceptionInput1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExceptionHandler_ExceptionInput1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='exceptionInput'"
	 * @generated
	 */
	String getExceptionInput1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ExceptionHandler#getExceptionInput1 <em>Exception Input1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Input1</em>' attribute.
	 * @see #getExceptionInput1()
	 * @generated
	 */
	void setExceptionInput1(String value);

	/**
	 * Returns the value of the '<em><b>Exception Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Type1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Type1</em>' attribute.
	 * @see #setExceptionType1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExceptionHandler_ExceptionType1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='exceptionType'"
	 * @generated
	 */
	String getExceptionType1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ExceptionHandler#getExceptionType1 <em>Exception Type1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Type1</em>' attribute.
	 * @see #getExceptionType1()
	 * @generated
	 */
	void setExceptionType1(String value);

	/**
	 * Returns the value of the '<em><b>Handler Body1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               A node that is executed if the handler satisfies an uncaught exception.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handler Body1</em>' attribute.
	 * @see #setHandlerBody1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getExceptionHandler_HandlerBody1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='handlerBody'"
	 * @generated
	 */
	String getHandlerBody1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ExceptionHandler#getHandlerBody1 <em>Handler Body1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler Body1</em>' attribute.
	 * @see #getHandlerBody1()
	 * @generated
	 */
	void setHandlerBody1(String value);

} // ExceptionHandler
