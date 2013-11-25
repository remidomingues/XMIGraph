/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.uml2._1._0._0.uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Owned Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.OwnedParameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.OwnedParameter#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.OwnedParameter#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.OwnedParameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.OwnedParameter#getJType <em>JType</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getOwnedParameter()
 * @model
 * @generated
 */
public interface OwnedParameter extends IsAbstractIsStatic
{
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #setDirection(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getOwnedParameter_Direction()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.OwnedParameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(String value);

	/**
	 * Returns the value of the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Value</em>' containment reference.
	 * @see #setLowerValue(Value)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getOwnedParameter_LowerValue()
	 * @model containment="true"
	 * @generated
	 */
	Value getLowerValue();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.OwnedParameter#getLowerValue <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Value</em>' containment reference.
	 * @see #getLowerValue()
	 * @generated
	 */
	void setLowerValue(Value value);

	/**
	 * Returns the value of the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Value</em>' containment reference.
	 * @see #setUpperValue(Value)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getOwnedParameter_UpperValue()
	 * @model containment="true"
	 * @generated
	 */
	Value getUpperValue();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.OwnedParameter#getUpperValue <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Value</em>' containment reference.
	 * @see #getUpperValue()
	 * @generated
	 */
	void setUpperValue(Value value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(Value)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getOwnedParameter_DefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	Value getDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.OwnedParameter#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(Value value);

	/**
	 * Returns the value of the '<em><b>JType</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>JType</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JType</em>' containment reference.
	 * @see #setJType(JType)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getOwnedParameter_JType()
	 * @model containment="true"
	 *        extendedMetaData="name='type' kind='element'"
	 * @generated
	 */
	JType getJType();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.OwnedParameter#getJType <em>JType</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JType</em>' containment reference.
	 * @see #getJType()
	 * @generated
	 */
	void setJType(JType value);

} // OwnedParameter
