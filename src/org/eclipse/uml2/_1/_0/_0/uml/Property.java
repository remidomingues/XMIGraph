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
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Property represents a declared state of one or more instances in terms of a named relationship to a value or values. When a property is an attribute of a classifier, the value or values are related to the instance of the classifier by being held in slots of the instance. When a property is an association end, the value or values are related to the instance or instances at the other end(s) of the association (see semantics of Association). Property is indirectly a subclass of Constructs::TypedElement. The range of valid values represented by the property can be controlled by setting the property’s type. Package AssociationClasses (“AssociationClasses” on page 107) A property may have other properties (attributes) that serve as qualifiers.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Property#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Property#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Property#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Property#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Property#getRedefinedProperty <em>Redefined Property</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Property#getSubsettedProperty <em>Subsetted Property</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Property#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Property#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Property#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Property#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Property#getAssociation1 <em>Association1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Property#getEnd1 <em>End1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Property#getIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Property#getIsDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Property#getRedefinedProperty1 <em>Redefined Property1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Property#getSubsettedProperty1 <em>Subsetted Property1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Property#getTemplateParameter1 <em>Template Parameter1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProperty()
 * @model extendedMetaData="name='Property' kind='elementOnly'"
 * @generated
 */
public interface Property extends StructuralFeature
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProperty_Group6()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:32'"
	 * @generated
	 */
	FeatureMap getGroup6();

	/**
	 * Returns the value of the '<em><b>Template Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.TemplateParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Parameter</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProperty_TemplateParameter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='templateParameter' group='#group:32'"
	 * @generated
	 */
	EList<TemplateParameter> getTemplateParameter();

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ConnectorEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Denotes a connector that attaches to this connectable element.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProperty_End()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='end' group='#group:32'"
	 * @generated
	 */
	EList<ConnectorEnd> getEnd();

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Deployment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProperty_Deployment()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='deployment' group='#group:32'"
	 * @generated
	 */
	EList<Deployment> getDeployment();

	/**
	 * Returns the value of the '<em><b>Redefined Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Property</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProperty_RedefinedProperty()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='redefinedProperty' group='#group:32'"
	 * @generated
	 */
	EList<Property> getRedefinedProperty();

	/**
	 * Returns the value of the '<em><b>Subsetted Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsetted Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsetted Property</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProperty_SubsettedProperty()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subsettedProperty' group='#group:32'"
	 * @generated
	 */
	EList<Property> getSubsettedProperty();

	/**
	 * Returns the value of the '<em><b>Association</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Association}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 References the association of which this property is a member, if any.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProperty_Association()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='association' group='#group:32'"
	 * @generated
	 */
	EList<Association> getAssociation();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A ValueSpecification that is evaluated to give a default value for the Property when an object of the owning Classifier is is instantiated. Subsets Element::ownedElement.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProperty_DefaultValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='defaultValue' group='#group:32'"
	 * @generated
	 */
	EList<ValueSpecification> getDefaultValue();

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProperty_Qualifier()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='qualifier' group='#group:32'"
	 * @generated
	 */
	EList<Property> getQualifier();

	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2._1._0._0.uml.AggregationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Specifies the kind of aggregation that applies to the Property. The default value is none.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.AggregationKind
	 * @see #isSetAggregation()
	 * @see #unsetAggregation()
	 * @see #setAggregation(AggregationKind)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProperty_Aggregation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='aggregation'"
	 * @generated
	 */
	AggregationKind getAggregation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Property#getAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.AggregationKind
	 * @see #isSetAggregation()
	 * @see #unsetAggregation()
	 * @see #getAggregation()
	 * @generated
	 */
	void setAggregation(AggregationKind value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Property#getAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAggregation()
	 * @see #getAggregation()
	 * @see #setAggregation(AggregationKind)
	 * @generated
	 */
	void unsetAggregation();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2._1._0._0.uml.Property#getAggregation <em>Aggregation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aggregation</em>' attribute is set.
	 * @see #unsetAggregation()
	 * @see #getAggregation()
	 * @see #setAggregation(AggregationKind)
	 * @generated
	 */
	boolean isSetAggregation();

	/**
	 * Returns the value of the '<em><b>Association1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               References the association of which this property is a member, if any.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association1</em>' attribute.
	 * @see #setAssociation1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProperty_Association1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='association'"
	 * @generated
	 */
	String getAssociation1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Property#getAssociation1 <em>Association1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association1</em>' attribute.
	 * @see #getAssociation1()
	 * @generated
	 */
	void setAssociation1(String value);

	/**
	 * Returns the value of the '<em><b>End1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Denotes a connector that attaches to this connectable element.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End1</em>' attribute.
	 * @see #setEnd1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProperty_End1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='end'"
	 * @generated
	 */
	String getEnd1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Property#getEnd1 <em>End1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End1</em>' attribute.
	 * @see #getEnd1()
	 * @generated
	 */
	void setEnd1(String value);

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Specifies whether the Property is derived, i.e., whether its value or values can be computed from other information. The default value is false.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProperty_IsDerived()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isDerived'"
	 * @generated
	 */
	String getIsDerived();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Property#getIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #getIsDerived()
	 * @generated
	 */
	void setIsDerived(String value);

	/**
	 * Returns the value of the '<em><b>Is Derived Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Specifies whether the property is derived as the union of all of the properties that are constrained to subset it. The default value is false.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Derived Union</em>' attribute.
	 * @see #setIsDerivedUnion(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProperty_IsDerivedUnion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isDerivedUnion'"
	 * @generated
	 */
	String getIsDerivedUnion();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Property#getIsDerivedUnion <em>Is Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived Union</em>' attribute.
	 * @see #getIsDerivedUnion()
	 * @generated
	 */
	void setIsDerivedUnion(String value);

	/**
	 * Returns the value of the '<em><b>Redefined Property1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Property1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Property1</em>' attribute.
	 * @see #setRedefinedProperty1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProperty_RedefinedProperty1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='redefinedProperty'"
	 * @generated
	 */
	String getRedefinedProperty1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Property#getRedefinedProperty1 <em>Redefined Property1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined Property1</em>' attribute.
	 * @see #getRedefinedProperty1()
	 * @generated
	 */
	void setRedefinedProperty1(String value);

	/**
	 * Returns the value of the '<em><b>Subsetted Property1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsetted Property1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsetted Property1</em>' attribute.
	 * @see #setSubsettedProperty1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProperty_SubsettedProperty1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='subsettedProperty'"
	 * @generated
	 */
	String getSubsettedProperty1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Property#getSubsettedProperty1 <em>Subsetted Property1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsetted Property1</em>' attribute.
	 * @see #getSubsettedProperty1()
	 * @generated
	 */
	void setSubsettedProperty1(String value);

	/**
	 * Returns the value of the '<em><b>Template Parameter1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Parameter1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Parameter1</em>' attribute.
	 * @see #setTemplateParameter1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getProperty_TemplateParameter1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='templateParameter'"
	 * @generated
	 */
	String getTemplateParameter1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Property#getTemplateParameter1 <em>Template Parameter1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Parameter1</em>' attribute.
	 * @see #getTemplateParameter1()
	 * @generated
	 */
	void setTemplateParameter1(String value);

} // Property
