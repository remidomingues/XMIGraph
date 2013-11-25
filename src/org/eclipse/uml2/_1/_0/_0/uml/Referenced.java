/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.uml2._1._0._0.uml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenced</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Referenced#getIdref <em>Idref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReferenced()
 * @model
 * @generated
 */
public interface Referenced extends EObject
{
	/**
	 * Returns the value of the '<em><b>Idref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idref</em>' attribute.
	 * @see #setIdref(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReferenced_Idref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getIdref();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Referenced#getIdref <em>Idref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idref</em>' attribute.
	 * @see #getIdref()
	 * @generated
	 */
	void setIdref(String value);

} // Referenced
