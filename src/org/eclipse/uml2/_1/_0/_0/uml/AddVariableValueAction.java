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
 * A representation of the model object '<em><b>Add Variable Value Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Variables are potentially multi-valued and ordered, so the action supports specification of insertion points for new values. It also supports the removal of existing values of the variable before the new value is added.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.AddVariableValueAction#getGroup10 <em>Group10</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.AddVariableValueAction#getInsertAt <em>Insert At</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.AddVariableValueAction#getIsReplaceAll <em>Is Replace All</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getAddVariableValueAction()
 * @model extendedMetaData="name='AddVariableValueAction' kind='elementOnly'"
 * @generated
 */
public interface AddVariableValueAction extends WriteVariableAction
{
	/**
	 * Returns the value of the '<em><b>Group10</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group10</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group10</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getAddVariableValueAction_Group10()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:45'"
	 * @generated
	 */
	FeatureMap getGroup10();

	/**
	 * Returns the value of the '<em><b>Insert At</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 (Specialized from Action:input) Gives the position at which to insert a new value or move an existing value in ordered variables. The types is UnlimitedINatural, but the value cannot be zero. This pin is omitted for unordered variables.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insert At</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getAddVariableValueAction_InsertAt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='insertAt' group='#group:45'"
	 * @generated
	 */
	EList<InputPin> getInsertAt();

	/**
	 * Returns the value of the '<em><b>Is Replace All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Specifies whether existing values of the variable should be removed before adding the new value.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Replace All</em>' attribute.
	 * @see #setIsReplaceAll(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getAddVariableValueAction_IsReplaceAll()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isReplaceAll'"
	 * @generated
	 */
	String getIsReplaceAll();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.AddVariableValueAction#getIsReplaceAll <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Replace All</em>' attribute.
	 * @see #getIsReplaceAll()
	 * @generated
	 */
	void setIsReplaceAll(String value);

} // AddVariableValueAction
