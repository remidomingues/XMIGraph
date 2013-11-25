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
 * A representation of the model object '<em><b>Object Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ObjectFlow#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ObjectFlow#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ObjectFlow#getSelection <em>Selection</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ObjectFlow#getIsMulticast <em>Is Multicast</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ObjectFlow#getIsMultireceive <em>Is Multireceive</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ObjectFlow#getSelection1 <em>Selection1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ObjectFlow#getTransformation1 <em>Transformation1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getObjectFlow()
 * @model extendedMetaData="name='ObjectFlow' kind='elementOnly'"
 * @generated
 */
public interface ObjectFlow extends ActivityEdge
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getObjectFlow_Group6()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:36'"
	 * @generated
	 */
	FeatureMap getGroup6();

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Changes or replaces data tokens flowing along edge.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getObjectFlow_Transformation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformation' group='#group:36'"
	 * @generated
	 */
	EList<Behavior> getTransformation();

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Selects tokens from a source object node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selection</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getObjectFlow_Selection()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='selection' group='#group:36'"
	 * @generated
	 */
	EList<Behavior> getSelection();

	/**
	 * Returns the value of the '<em><b>Is Multicast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Multicast</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Multicast</em>' attribute.
	 * @see #setIsMulticast(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getObjectFlow_IsMulticast()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isMulticast'"
	 * @generated
	 */
	String getIsMulticast();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ObjectFlow#getIsMulticast <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multicast</em>' attribute.
	 * @see #getIsMulticast()
	 * @generated
	 */
	void setIsMulticast(String value);

	/**
	 * Returns the value of the '<em><b>Is Multireceive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Multireceive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Multireceive</em>' attribute.
	 * @see #setIsMultireceive(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getObjectFlow_IsMultireceive()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isMultireceive'"
	 * @generated
	 */
	String getIsMultireceive();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ObjectFlow#getIsMultireceive <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multireceive</em>' attribute.
	 * @see #getIsMultireceive()
	 * @generated
	 */
	void setIsMultireceive(String value);

	/**
	 * Returns the value of the '<em><b>Selection1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Selects tokens from a source object node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selection1</em>' attribute.
	 * @see #setSelection1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getObjectFlow_Selection1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='selection'"
	 * @generated
	 */
	String getSelection1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ObjectFlow#getSelection1 <em>Selection1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection1</em>' attribute.
	 * @see #getSelection1()
	 * @generated
	 */
	void setSelection1(String value);

	/**
	 * Returns the value of the '<em><b>Transformation1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Changes or replaces data tokens flowing along edge.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transformation1</em>' attribute.
	 * @see #setTransformation1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getObjectFlow_Transformation1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='transformation'"
	 * @generated
	 */
	String getTransformation1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ObjectFlow#getTransformation1 <em>Transformation1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation1</em>' attribute.
	 * @see #getTransformation1()
	 * @generated
	 */
	void setTransformation1(String value);

} // ObjectFlow
