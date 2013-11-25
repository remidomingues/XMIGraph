/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.uml2._1._0._0.uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.AssociationElement#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.AssociationElement#getAggregation <em>Aggregation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getAssociationElement()
 * @model
 * @generated
 */
public interface AssociationElement extends IsAbstractIsStatic
{
	/**
	 * Returns the value of the '<em><b>Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' attribute.
	 * @see #setAssociation(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getAssociationElement_Association()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getAssociation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.AssociationElement#getAssociation <em>Association</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' attribute.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(String value);

	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation</em>' attribute.
	 * @see #setAggregation(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getAssociationElement_Aggregation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getAggregation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.AssociationElement#getAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation</em>' attribute.
	 * @see #getAggregation()
	 * @generated
	 */
	void setAggregation(String value);

} // AssociationElement
