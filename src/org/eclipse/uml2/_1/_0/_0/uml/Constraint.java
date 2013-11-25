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
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Constraint contains a ValueSpecification that specifies additional semantics for one or more elements. Certain kinds of constraints (such as an association “xor” constraint) are predefined in UML, others may be user-defined. A user-defined Constraint is described using a specified language, whose syntax and interpretation is a tool responsibility. One predefined language for writing constraints is OCL. In some situations, a programming language such as Java may be appropriate for expressing a constraint. In other situations natural language may be used. Constraint is a condition (a Boolean expression) that restricts the extension of the associated element beyond what is imposed by the other language constructs applied to that element. Constraint contains an optional name, although they are commonly unnamed.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Constraint#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Constraint#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Constraint#getConstrainedElement <em>Constrained Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Constraint#getConstrainedElement1 <em>Constrained Element1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConstraint()
 * @model extendedMetaData="name='Constraint' kind='elementOnly'"
 * @generated
 */
public interface Constraint extends PackageableElement
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConstraint_Group6()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:26'"
	 * @generated
	 */
	FeatureMap getGroup6();

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A condition that must be true when evaluated in order for the constraint to be satisfied. Subsets Element::ownedElement.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConstraint_Specification()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='specification' group='#group:26'"
	 * @generated
	 */
	EList<ValueSpecification> getSpecification();

	/**
	 * Returns the value of the '<em><b>Constrained Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 ordered set of Elements referenced by this Constraint.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constrained Element</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConstraint_ConstrainedElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constrainedElement' group='#group:26'"
	 * @generated
	 */
	EList<Element> getConstrainedElement();

	/**
	 * Returns the value of the '<em><b>Constrained Element1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               ordered set of Elements referenced by this Constraint.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constrained Element1</em>' attribute.
	 * @see #setConstrainedElement1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getConstraint_ConstrainedElement1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='constrainedElement'"
	 * @generated
	 */
	String getConstrainedElement1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Constraint#getConstrainedElement1 <em>Constrained Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained Element1</em>' attribute.
	 * @see #getConstrainedElement1()
	 * @generated
	 */
	void setConstrainedElement1(String value);

} // Constraint
