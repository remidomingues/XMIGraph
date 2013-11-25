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
 * A representation of the model object '<em><b>Reclassify Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         ReclassifyObjectAction adds given classifier to an object and removes given classifiers from that object. Multiple classifiers may be added and removed at a time.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ReclassifyObjectAction#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ReclassifyObjectAction#getOldClassifier <em>Old Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ReclassifyObjectAction#getNewClassifier <em>New Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ReclassifyObjectAction#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ReclassifyObjectAction#getIsReplaceAll <em>Is Replace All</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ReclassifyObjectAction#getNewClassifier1 <em>New Classifier1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.ReclassifyObjectAction#getOldClassifier1 <em>Old Classifier1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReclassifyObjectAction()
 * @model extendedMetaData="name='ReclassifyObjectAction' kind='elementOnly'"
 * @generated
 */
public interface ReclassifyObjectAction extends Action
{
	/**
	 * Returns the value of the '<em><b>Group8</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group8</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group8</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReclassifyObjectAction_Group8()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:40'"
	 * @generated
	 */
	FeatureMap getGroup8();

	/**
	 * Returns the value of the '<em><b>Old Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A set of classifiers to be removed from the classifiers of the object.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Old Classifier</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReclassifyObjectAction_OldClassifier()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='oldClassifier' group='#group:40'"
	 * @generated
	 */
	EList<Classifier> getOldClassifier();

	/**
	 * Returns the value of the '<em><b>New Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A set of classifiers to be added to the classifiers of the object.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>New Classifier</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReclassifyObjectAction_NewClassifier()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='newClassifier' group='#group:40'"
	 * @generated
	 */
	EList<Classifier> getNewClassifier();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Holds the object to be reclassified. (Specializes Action.input.)
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReclassifyObjectAction_Object()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object' group='#group:40'"
	 * @generated
	 */
	EList<InputPin> getObject();

	/**
	 * Returns the value of the '<em><b>Is Replace All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Specifies whether existing classifiers should be removed before adding the new classifiers. The default value is false.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Replace All</em>' attribute.
	 * @see #setIsReplaceAll(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReclassifyObjectAction_IsReplaceAll()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isReplaceAll'"
	 * @generated
	 */
	String getIsReplaceAll();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ReclassifyObjectAction#getIsReplaceAll <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Replace All</em>' attribute.
	 * @see #getIsReplaceAll()
	 * @generated
	 */
	void setIsReplaceAll(String value);

	/**
	 * Returns the value of the '<em><b>New Classifier1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               A set of classifiers to be added to the classifiers of the object.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>New Classifier1</em>' attribute.
	 * @see #setNewClassifier1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReclassifyObjectAction_NewClassifier1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='newClassifier'"
	 * @generated
	 */
	String getNewClassifier1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ReclassifyObjectAction#getNewClassifier1 <em>New Classifier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Classifier1</em>' attribute.
	 * @see #getNewClassifier1()
	 * @generated
	 */
	void setNewClassifier1(String value);

	/**
	 * Returns the value of the '<em><b>Old Classifier1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               A set of classifiers to be removed from the classifiers of the object.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Old Classifier1</em>' attribute.
	 * @see #setOldClassifier1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getReclassifyObjectAction_OldClassifier1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='oldClassifier'"
	 * @generated
	 */
	String getOldClassifier1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.ReclassifyObjectAction#getOldClassifier1 <em>Old Classifier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Classifier1</em>' attribute.
	 * @see #getOldClassifier1()
	 * @generated
	 */
	void setOldClassifier1(String value);

} // ReclassifyObjectAction
