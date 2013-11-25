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
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Region#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Region#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Region#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Region#getExtendedRegion <em>Extended Region</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Region#getExtendedRegion1 <em>Extended Region1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Region#getIsLeaf <em>Is Leaf</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getRegion()
 * @model extendedMetaData="name='Region' kind='elementOnly'"
 * @generated
 */
public interface Region extends Namespace
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getRegion_Group6()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:26'"
	 * @generated
	 */
	FeatureMap getGroup6();

	/**
	 * Returns the value of the '<em><b>Subvertex</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Vertex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subvertex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subvertex</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getRegion_Subvertex()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subvertex' group='#group:26'"
	 * @generated
	 */
	EList<Vertex> getSubvertex();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getRegion_Transition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transition' group='#group:26'"
	 * @generated
	 */
	EList<Transition> getTransition();

	/**
	 * Returns the value of the '<em><b>Extended Region</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Region}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Region</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Region</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getRegion_ExtendedRegion()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extendedRegion' group='#group:26'"
	 * @generated
	 */
	EList<Region> getExtendedRegion();

	/**
	 * Returns the value of the '<em><b>Extended Region1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Region1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Region1</em>' attribute.
	 * @see #setExtendedRegion1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getRegion_ExtendedRegion1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='extendedRegion'"
	 * @generated
	 */
	String getExtendedRegion1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Region#getExtendedRegion1 <em>Extended Region1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Region1</em>' attribute.
	 * @see #getExtendedRegion1()
	 * @generated
	 */
	void setExtendedRegion1(String value);

	/**
	 * Returns the value of the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Indicates whether it is possible to further specialize a RedefinableElement. If the value is true, then it is not possible to further specialize the RedefinableElement. Default value is false.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Leaf</em>' attribute.
	 * @see #setIsLeaf(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getRegion_IsLeaf()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isLeaf'"
	 * @generated
	 */
	String getIsLeaf();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Region#getIsLeaf <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Leaf</em>' attribute.
	 * @see #getIsLeaf()
	 * @generated
	 */
	void setIsLeaf(String value);

} // Region
