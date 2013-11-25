/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.xmi;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.xmi.Add#getAddition <em>Addition</em>}</li>
 *   <li>{@link org.omg.xmi.Add#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.xmi.XmiPackage#getAdd()
 * @model extendedMetaData="name='Add' kind='elementOnly'"
 * @generated
 */
public interface Add extends Difference
{
	/**
	 * Returns the value of the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addition</em>' attribute.
	 * @see #setAddition(List)
	 * @see org.omg.xmi.XmiPackage#getAdd_Addition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='addition'"
	 * @generated
	 */
	List<String> getAddition();

	/**
	 * Sets the value of the '{@link org.omg.xmi.Add#getAddition <em>Addition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addition</em>' attribute.
	 * @see #getAddition()
	 * @generated
	 */
	void setAddition(List<String> value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(String)
	 * @see org.omg.xmi.XmiPackage#getAdd_Position()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='position'"
	 * @generated
	 */
	String getPosition();

	/**
	 * Sets the value of the '{@link org.omg.xmi.Add#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(String value);

} // Add
