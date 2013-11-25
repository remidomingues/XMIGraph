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
 * A representation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A lifeline represents an individual participant in the Interaction. While Parts and StructuralFeatures may have multiplicity greater than 1, Lifelines represent only one interacting entity. Lifeline is a specialization of NamedElement. If the referenced ConnectableElement is multivalued (i.e. has a multiplicity > 1), then the Lifeline may have an expression (the ‘selector’) that specifies which particular part is represented by this Lifeline. If the selector is omitted this means that an arbitrary representative of the multivalued ConnectableElement is chosen.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Lifeline#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Lifeline#getCoveredBy <em>Covered By</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Lifeline#getRepresents <em>Represents</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Lifeline#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Lifeline#getDecomposedAs <em>Decomposed As</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Lifeline#getCoveredBy1 <em>Covered By1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Lifeline#getDecomposedAs1 <em>Decomposed As1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Lifeline#getRepresents1 <em>Represents1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLifeline()
 * @model extendedMetaData="name='Lifeline' kind='elementOnly'"
 * @generated
 */
public interface Lifeline extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Group5</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group5</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group5</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLifeline_Group5()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:22'"
	 * @generated
	 */
	FeatureMap getGroup5();

	/**
	 * Returns the value of the '<em><b>Covered By</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.InteractionFragment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covered By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covered By</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLifeline_CoveredBy()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='coveredBy' group='#group:22'"
	 * @generated
	 */
	EList<InteractionFragment> getCoveredBy();

	/**
	 * Returns the value of the '<em><b>Represents</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.ConnectableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 the ConnectableElement within the classifier that contains the enclosing interaction.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Represents</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLifeline_Represents()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='represents' group='#group:22'"
	 * @generated
	 */
	EList<ConnectableElement> getRepresents();

	/**
	 * Returns the value of the '<em><b>Selector</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.OpaqueExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 If the referenced ConnectableElement is multivalued, then this specifies the specific individual part within that set.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selector</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLifeline_Selector()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='selector' group='#group:22'"
	 * @generated
	 */
	EList<OpaqueExpression> getSelector();

	/**
	 * Returns the value of the '<em><b>Decomposed As</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.PartDecomposition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposed As</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposed As</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLifeline_DecomposedAs()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='decomposedAs' group='#group:22'"
	 * @generated
	 */
	EList<PartDecomposition> getDecomposedAs();

	/**
	 * Returns the value of the '<em><b>Covered By1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covered By1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covered By1</em>' attribute.
	 * @see #setCoveredBy1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLifeline_CoveredBy1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='coveredBy'"
	 * @generated
	 */
	String getCoveredBy1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Lifeline#getCoveredBy1 <em>Covered By1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Covered By1</em>' attribute.
	 * @see #getCoveredBy1()
	 * @generated
	 */
	void setCoveredBy1(String value);

	/**
	 * Returns the value of the '<em><b>Decomposed As1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposed As1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposed As1</em>' attribute.
	 * @see #setDecomposedAs1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLifeline_DecomposedAs1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='decomposedAs'"
	 * @generated
	 */
	String getDecomposedAs1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Lifeline#getDecomposedAs1 <em>Decomposed As1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposed As1</em>' attribute.
	 * @see #getDecomposedAs1()
	 * @generated
	 */
	void setDecomposedAs1(String value);

	/**
	 * Returns the value of the '<em><b>Represents1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               the ConnectableElement within the classifier that contains the enclosing interaction.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Represents1</em>' attribute.
	 * @see #setRepresents1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getLifeline_Represents1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='represents'"
	 * @generated
	 */
	String getRepresents1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Lifeline#getRepresents1 <em>Represents1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents1</em>' attribute.
	 * @see #getRepresents1()
	 * @generated
	 */
	void setRepresents1(String value);

} // Lifeline
