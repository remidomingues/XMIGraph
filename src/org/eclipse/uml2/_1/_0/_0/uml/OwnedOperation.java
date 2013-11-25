/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.uml2._1._0._0.uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Owned Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.OwnedOperation#getRaisedException <em>Raised Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.OwnedOperation#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.OwnedOperation#getOwnedParameter <em>Owned Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getOwnedOperation()
 * @model
 * @generated
 */
public interface OwnedOperation extends IsAbstractIsStatic
{
	/**
	 * Returns the value of the '<em><b>Raised Exception</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Referenced}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raised Exception</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raised Exception</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getOwnedOperation_RaisedException()
	 * @model containment="true"
	 * @generated
	 */
	EList<Referenced> getRaisedException();

	/**
	 * Returns the value of the '<em><b>Owned Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Rule</em>' containment reference.
	 * @see #setOwnedRule(OwnedRule)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getOwnedOperation_OwnedRule()
	 * @model containment="true"
	 * @generated
	 */
	OwnedRule getOwnedRule();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.OwnedOperation#getOwnedRule <em>Owned Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Rule</em>' containment reference.
	 * @see #getOwnedRule()
	 * @generated
	 */
	void setOwnedRule(OwnedRule value);

	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.OwnedParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getOwnedOperation_OwnedParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<OwnedParameter> getOwnedParameter();

} // OwnedOperation
