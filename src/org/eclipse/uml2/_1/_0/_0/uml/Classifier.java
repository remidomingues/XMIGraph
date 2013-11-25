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
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A classifier is a namespace whose members can include features. Classifier is an abstract metaclass. A classifier is a type and can own generalizations, thereby making it possible to define generalization relationships to other classifiers. A classifier can specify a generalization hierarchy by referencing its general classifiers. A classifier is a redefinable element, meaning that it is possible to redefine nested classifiers.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Classifier#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Classifier#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Classifier#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Classifier#getRedefinedClassifier <em>Redefined Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Classifier#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Classifier#getPowertypeExtent <em>Powertype Extent</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Classifier#getOwnedUseCase <em>Owned Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Classifier#getUseCase <em>Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Classifier#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Classifier#getOccurrence <em>Occurrence</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Classifier#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Classifier#getIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Classifier#getPackageableElementVisibility <em>Packageable Element Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Classifier#getPowertypeExtent1 <em>Powertype Extent1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Classifier#getRedefinedClassifier1 <em>Redefined Classifier1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Classifier#getRepresentation1 <em>Representation1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Classifier#getTemplateParameter1 <em>Template Parameter1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Classifier#getUseCase1 <em>Use Case1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClassifier()
 * @model extendedMetaData="name='Classifier' kind='elementOnly'"
 * @generated
 */
public interface Classifier extends Namespace
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClassifier_Group6()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:26'"
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClassifier_TemplateParameter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='templateParameter' group='#group:26'"
	 * @generated
	 */
	EList<TemplateParameter> getTemplateParameter();

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Generalization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClassifier_Generalization()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='generalization' group='#group:26'"
	 * @generated
	 */
	EList<Generalization> getGeneralization();

	/**
	 * Returns the value of the '<em><b>Redefined Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Classifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Classifier</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClassifier_RedefinedClassifier()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='redefinedClassifier' group='#group:26'"
	 * @generated
	 */
	EList<Classifier> getRedefinedClassifier();

	/**
	 * Returns the value of the '<em><b>Substitution</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Substitution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitution</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClassifier_Substitution()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='substitution' group='#group:26'"
	 * @generated
	 */
	EList<Substitution> getSubstitution();

	/**
	 * Returns the value of the '<em><b>Powertype Extent</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.GeneralizationSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powertype Extent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powertype Extent</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClassifier_PowertypeExtent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='powertypeExtent' group='#group:26'"
	 * @generated
	 */
	EList<GeneralizationSet> getPowertypeExtent();

	/**
	 * Returns the value of the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.UseCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Use Case</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Use Case</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClassifier_OwnedUseCase()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ownedUseCase' group='#group:26'"
	 * @generated
	 */
	EList<UseCase> getOwnedUseCase();

	/**
	 * Returns the value of the '<em><b>Use Case</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.UseCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Case</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Case</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClassifier_UseCase()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='useCase' group='#group:26'"
	 * @generated
	 */
	EList<UseCase> getUseCase();

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.CollaborationOccurrence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 References a collaboration occurrence which indicates the collaboration that represents this classifier. (Subsets Classifier.occurrence.)
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Representation</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClassifier_Representation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='representation' group='#group:26'"
	 * @generated
	 */
	EList<CollaborationOccurrence> getRepresentation();

	/**
	 * Returns the value of the '<em><b>Occurrence</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.CollaborationOccurrence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 References the collaboration occurrences owned by the classifier. (Subsets Element. ownedElement.)
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occurrence</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClassifier_Occurrence()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='occurrence' group='#group:26'"
	 * @generated
	 */
	EList<CollaborationOccurrence> getOccurrence();

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               If true, the Classifier does not provide a complete declaration and can typically not be instantiated. An abstract classifier is intended to be used by other classifiers e.g. as the target of general metarelationships or generalization relationships. Default value is false.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClassifier_IsAbstract()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isAbstract'"
	 * @generated
	 */
	String getIsAbstract();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Classifier#getIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #getIsAbstract()
	 * @generated
	 */
	void setIsAbstract(String value);

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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClassifier_IsLeaf()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isLeaf'"
	 * @generated
	 */
	String getIsLeaf();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Classifier#getIsLeaf <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Leaf</em>' attribute.
	 * @see #getIsLeaf()
	 * @generated
	 */
	void setIsLeaf(String value);

	/**
	 * Returns the value of the '<em><b>Packageable Element Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2._1._0._0.uml.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Indicates that packageable elements must always have a visibility, i.e., visibility is not optional. Redefines NamedElement::visibility.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packageable Element Visibility</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.VisibilityKind
	 * @see #isSetPackageableElementVisibility()
	 * @see #unsetPackageableElementVisibility()
	 * @see #setPackageableElementVisibility(VisibilityKind)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClassifier_PackageableElementVisibility()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='packageableElement_visibility'"
	 * @generated
	 */
	VisibilityKind getPackageableElementVisibility();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Classifier#getPackageableElementVisibility <em>Packageable Element Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packageable Element Visibility</em>' attribute.
	 * @see org.eclipse.uml2._1._0._0.uml.VisibilityKind
	 * @see #isSetPackageableElementVisibility()
	 * @see #unsetPackageableElementVisibility()
	 * @see #getPackageableElementVisibility()
	 * @generated
	 */
	void setPackageableElementVisibility(VisibilityKind value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Classifier#getPackageableElementVisibility <em>Packageable Element Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPackageableElementVisibility()
	 * @see #getPackageableElementVisibility()
	 * @see #setPackageableElementVisibility(VisibilityKind)
	 * @generated
	 */
	void unsetPackageableElementVisibility();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2._1._0._0.uml.Classifier#getPackageableElementVisibility <em>Packageable Element Visibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Packageable Element Visibility</em>' attribute is set.
	 * @see #unsetPackageableElementVisibility()
	 * @see #getPackageableElementVisibility()
	 * @see #setPackageableElementVisibility(VisibilityKind)
	 * @generated
	 */
	boolean isSetPackageableElementVisibility();

	/**
	 * Returns the value of the '<em><b>Powertype Extent1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powertype Extent1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powertype Extent1</em>' attribute.
	 * @see #setPowertypeExtent1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClassifier_PowertypeExtent1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='powertypeExtent'"
	 * @generated
	 */
	String getPowertypeExtent1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Classifier#getPowertypeExtent1 <em>Powertype Extent1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powertype Extent1</em>' attribute.
	 * @see #getPowertypeExtent1()
	 * @generated
	 */
	void setPowertypeExtent1(String value);

	/**
	 * Returns the value of the '<em><b>Redefined Classifier1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Classifier1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Classifier1</em>' attribute.
	 * @see #setRedefinedClassifier1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClassifier_RedefinedClassifier1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='redefinedClassifier'"
	 * @generated
	 */
	String getRedefinedClassifier1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Classifier#getRedefinedClassifier1 <em>Redefined Classifier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined Classifier1</em>' attribute.
	 * @see #getRedefinedClassifier1()
	 * @generated
	 */
	void setRedefinedClassifier1(String value);

	/**
	 * Returns the value of the '<em><b>Representation1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               References a collaboration occurrence which indicates the collaboration that represents this classifier. (Subsets Classifier.occurrence.)
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Representation1</em>' attribute.
	 * @see #setRepresentation1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClassifier_Representation1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='representation'"
	 * @generated
	 */
	String getRepresentation1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Classifier#getRepresentation1 <em>Representation1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation1</em>' attribute.
	 * @see #getRepresentation1()
	 * @generated
	 */
	void setRepresentation1(String value);

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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClassifier_TemplateParameter1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='templateParameter'"
	 * @generated
	 */
	String getTemplateParameter1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Classifier#getTemplateParameter1 <em>Template Parameter1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Parameter1</em>' attribute.
	 * @see #getTemplateParameter1()
	 * @generated
	 */
	void setTemplateParameter1(String value);

	/**
	 * Returns the value of the '<em><b>Use Case1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Case1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Case1</em>' attribute.
	 * @see #setUseCase1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getClassifier_UseCase1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useCase'"
	 * @generated
	 */
	String getUseCase1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Classifier#getUseCase1 <em>Use Case1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Case1</em>' attribute.
	 * @see #getUseCase1()
	 * @generated
	 */
	void setUseCase1(String value);

} // Classifier
