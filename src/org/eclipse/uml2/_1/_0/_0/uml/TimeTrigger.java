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
 * A representation of the model object '<em><b>Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A time trigger specifies a time event, which models the expiration of a specific deadline.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TimeTrigger#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TimeTrigger#getWhen <em>When</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.TimeTrigger#getIsRelative <em>Is Relative</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTimeTrigger()
 * @model extendedMetaData="name='TimeTrigger' kind='elementOnly'"
 * @generated
 */
public interface TimeTrigger extends Trigger
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTimeTrigger_Group6()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:25'"
	 * @generated
	 */
	FeatureMap getGroup6();

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the corresponding time deadline.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTimeTrigger_When()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='when' group='#group:25'"
	 * @generated
	 */
	EList<ValueSpecification> getWhen();

	/**
	 * Returns the value of the '<em><b>Is Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Specifies whether it is relative or absolute time.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Relative</em>' attribute.
	 * @see #setIsRelative(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getTimeTrigger_IsRelative()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isRelative'"
	 * @generated
	 */
	String getIsRelative();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.TimeTrigger#getIsRelative <em>Is Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Relative</em>' attribute.
	 * @see #getIsRelative()
	 * @generated
	 */
	void setIsRelative(String value);

} // TimeTrigger
