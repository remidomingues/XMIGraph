/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.uml2._1._0._0.uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Owned Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.OwnedRule#getConstrainedElement <em>Constrained Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.OwnedRule#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getOwnedRule()
 * @model
 * @generated
 */
public interface OwnedRule extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Constrained Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Element</em>' attribute.
	 * @see #setConstrainedElement(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getOwnedRule_ConstrainedElement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getConstrainedElement();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.OwnedRule#getConstrainedElement <em>Constrained Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained Element</em>' attribute.
	 * @see #getConstrainedElement()
	 * @generated
	 */
	void setConstrainedElement(String value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(Specification)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getOwnedRule_Specification()
	 * @model containment="true"
	 * @generated
	 */
	Specification getSpecification();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.OwnedRule#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(Specification value);

} // OwnedRule
