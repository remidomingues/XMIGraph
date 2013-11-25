/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.uml2._1._0._0.uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudostate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Pseudostate#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPseudostate()
 * @model extendedMetaData="name='Pseudostate' kind='elementOnly'"
 * @generated
 */
public interface Pseudostate extends Vertex
{
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2._1._0._0.uml.PseudostateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.PseudostateKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(PseudostateKind)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getPseudostate_Kind()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='kind'"
	 * @generated
	 */
	PseudostateKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Pseudostate#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.PseudostateKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PseudostateKind value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Pseudostate#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(PseudostateKind)
	 * @generated
	 */
	void unsetKind();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2._1._0._0.uml.Pseudostate#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(PseudostateKind)
	 * @generated
	 */
	boolean isSetKind();

} // Pseudostate
