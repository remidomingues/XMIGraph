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
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A parameter is a specification of an argument used to pass information into or out of an invocation of a behavioral feature. It has a type, and may have a multiplicity and an optional default value.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Parameter#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Parameter#getType1 <em>Type1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Parameter#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Parameter#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Parameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Parameter#getParameterSet <em>Parameter Set</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Parameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Parameter#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Parameter#getIsException <em>Is Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Parameter#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Parameter#getIsStream <em>Is Stream</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Parameter#getIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Parameter#getParameterSet1 <em>Parameter Set1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Parameter#getType2 <em>Type2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getParameter()
 * @model extendedMetaData="name='Parameter' kind='elementOnly'"
 * @generated
 */
public interface Parameter extends ConnectableElement
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getParameter_Group6()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:27'"
	 * @generated
	 */
	FeatureMap getGroup6();

	/**
	 * Returns the value of the '<em><b>Type1</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the TypedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type1</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getParameter_Type1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='type' group='#group:27'"
	 * @generated
	 */
	EList<Type> getType1();

	/**
	 * Returns the value of the '<em><b>Upper Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The specification of the upper bound for this multiplicity. Subsets Element::ownedElement.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Value</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getParameter_UpperValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='upperValue' group='#group:27'"
	 * @generated
	 */
	EList<ValueSpecification> getUpperValue();

	/**
	 * Returns the value of the '<em><b>Lower Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The specification of the lower bound for this multiplicity. Subsets Element::ownedElement.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Value</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getParameter_LowerValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lowerValue' group='#group:27'"
	 * @generated
	 */
	EList<ValueSpecification> getLowerValue();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Specifies a ValueSpecification that represents a value to be used when no argument is supplied for the Parameter. Subsets Element::ownedElement.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getParameter_DefaultValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='defaultValue' group='#group:27'"
	 * @generated
	 */
	EList<ValueSpecification> getDefaultValue();

	/**
	 * Returns the value of the '<em><b>Parameter Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ParameterSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Set</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getParameter_ParameterSet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='parameterSet' group='#group:27'"
	 * @generated
	 */
	EList<ParameterSet> getParameterSet();

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2._1._0._0.uml.ParameterDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Indicates whether a parameter is being sent into or out of a behavioral element. The default value is in.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.ParameterDirectionKind
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(ParameterDirectionKind)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getParameter_Direction()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='direction'"
	 * @generated
	 */
	ParameterDirectionKind getDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Parameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.ParameterDirectionKind
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(ParameterDirectionKind value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Parameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(ParameterDirectionKind)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2._1._0._0.uml.Parameter#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(ParameterDirectionKind)
	 * @generated
	 */
	boolean isSetDirection();

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2._1._0._0.uml.ParameterEffectKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.ParameterEffectKind
	 * @see #isSetEffect()
	 * @see #unsetEffect()
	 * @see #setEffect(ParameterEffectKind)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getParameter_Effect()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='effect'"
	 * @generated
	 */
	ParameterEffectKind getEffect();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Parameter#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.ParameterEffectKind
	 * @see #isSetEffect()
	 * @see #unsetEffect()
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(ParameterEffectKind value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Parameter#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffect()
	 * @see #getEffect()
	 * @see #setEffect(ParameterEffectKind)
	 * @generated
	 */
	void unsetEffect();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2._1._0._0.uml.Parameter#getEffect <em>Effect</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effect</em>' attribute is set.
	 * @see #unsetEffect()
	 * @see #getEffect()
	 * @see #setEffect(ParameterEffectKind)
	 * @generated
	 */
	boolean isSetEffect();

	/**
	 * Returns the value of the '<em><b>Is Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Exception</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Exception</em>' attribute.
	 * @see #setIsException(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getParameter_IsException()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isException'"
	 * @generated
	 */
	String getIsException();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Parameter#getIsException <em>Is Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Exception</em>' attribute.
	 * @see #getIsException()
	 * @generated
	 */
	void setIsException(String value);

	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               For a multivalued multiplicity, this attribute specifies whether the values in an instantiation of this element are sequentially ordered. Default is false.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getParameter_IsOrdered()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isOrdered'"
	 * @generated
	 */
	String getIsOrdered();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Parameter#getIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #getIsOrdered()
	 * @generated
	 */
	void setIsOrdered(String value);

	/**
	 * Returns the value of the '<em><b>Is Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Stream</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Stream</em>' attribute.
	 * @see #setIsStream(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getParameter_IsStream()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isStream'"
	 * @generated
	 */
	String getIsStream();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Parameter#getIsStream <em>Is Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Stream</em>' attribute.
	 * @see #getIsStream()
	 * @generated
	 */
	void setIsStream(String value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               For a multivalued multiplicity, this attributes specifies whether the values in an instantiation of this element are unique. Default is true.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getParameter_IsUnique()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isUnique'"
	 * @generated
	 */
	String getIsUnique();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Parameter#getIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #getIsUnique()
	 * @generated
	 */
	void setIsUnique(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Set1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Set1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Set1</em>' attribute.
	 * @see #setParameterSet1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getParameter_ParameterSet1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='parameterSet'"
	 * @generated
	 */
	String getParameterSet1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Parameter#getParameterSet1 <em>Parameter Set1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Set1</em>' attribute.
	 * @see #getParameterSet1()
	 * @generated
	 */
	void setParameterSet1(String value);

	/**
	 * Returns the value of the '<em><b>Type2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the TypedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type2</em>' attribute.
	 * @see #setType2(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getParameter_Type2()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType2();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Parameter#getType2 <em>Type2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type2</em>' attribute.
	 * @see #getType2()
	 * @generated
	 */
	void setType2(String value);

} // Parameter
