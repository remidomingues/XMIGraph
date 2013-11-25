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
 * A representation of the model object '<em><b>Link End Creation Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LinkEndCreationData#getGroup4 <em>Group4</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LinkEndCreationData#getInsertAt <em>Insert At</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LinkEndCreationData#getInsertAt1 <em>Insert At1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.LinkEndCreationData#getIsReplaceAll <em>Is Replace All</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLinkEndCreationData()
 * @model extendedMetaData="name='LinkEndCreationData' kind='elementOnly'"
 * @generated
 */
public interface LinkEndCreationData extends LinkEndData
{
	/**
	 * Returns the value of the '<em><b>Group4</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group4</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLinkEndCreationData_Group4()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:19'"
	 * @generated
	 */
	FeatureMap getGroup4();

	/**
	 * Returns the value of the '<em><b>Insert At</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Specifies where the new link should be inserted for ordered association ends, or where an existing link should be moved to. The type of the input is UnlimitedNatural, but the input cannot be zero. This pin is omitted for association ends that are not ordered.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insert At</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLinkEndCreationData_InsertAt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='insertAt' group='#group:19'"
	 * @generated
	 */
	EList<InputPin> getInsertAt();

	/**
	 * Returns the value of the '<em><b>Insert At1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Specifies where the new link should be inserted for ordered association ends, or where an existing link should be moved to. The type of the input is UnlimitedNatural, but the input cannot be zero. This pin is omitted for association ends that are not ordered.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insert At1</em>' attribute.
	 * @see #setInsertAt1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLinkEndCreationData_InsertAt1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='insertAt'"
	 * @generated
	 */
	String getInsertAt1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.LinkEndCreationData#getInsertAt1 <em>Insert At1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert At1</em>' attribute.
	 * @see #getInsertAt1()
	 * @generated
	 */
	void setInsertAt1(String value);

	/**
	 * Returns the value of the '<em><b>Is Replace All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               = falseSpecifies whether the existing links emanating from the object on this end should be destroyed before creating a new link.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Replace All</em>' attribute.
	 * @see #setIsReplaceAll(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLinkEndCreationData_IsReplaceAll()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isReplaceAll'"
	 * @generated
	 */
	String getIsReplaceAll();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.LinkEndCreationData#getIsReplaceAll <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Replace All</em>' attribute.
	 * @see #getIsReplaceAll()
	 * @generated
	 */
	void setIsReplaceAll(String value);

} // LinkEndCreationData
