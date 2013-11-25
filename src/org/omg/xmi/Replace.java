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
 * A representation of the model object '<em><b>Replace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.xmi.Replace#getPosition <em>Position</em>}</li>
 *   <li>{@link org.omg.xmi.Replace#getReplacement <em>Replacement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.xmi.XmiPackage#getReplace()
 * @model extendedMetaData="name='Replace' kind='elementOnly'"
 * @generated
 */
public interface Replace extends Difference
{
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
	 * @see org.omg.xmi.XmiPackage#getReplace_Position()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='position'"
	 * @generated
	 */
	String getPosition();

	/**
	 * Sets the value of the '{@link org.omg.xmi.Replace#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(String value);

	/**
	 * Returns the value of the '<em><b>Replacement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replacement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacement</em>' attribute.
	 * @see #setReplacement(List)
	 * @see org.omg.xmi.XmiPackage#getReplace_Replacement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='replacement'"
	 * @generated
	 */
	List<String> getReplacement();

	/**
	 * Sets the value of the '{@link org.omg.xmi.Replace#getReplacement <em>Replacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacement</em>' attribute.
	 * @see #getReplacement()
	 * @generated
	 */
	void setReplacement(List<String> value);

} // Replace
