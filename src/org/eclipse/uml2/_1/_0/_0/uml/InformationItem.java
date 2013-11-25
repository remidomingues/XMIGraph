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
 * A representation of the model object '<em><b>Information Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         An information Item is an abstraction of all kinds of information that can be exchanged between objects. It is a kind of classifier intended for representing information at a very abstract way, which is cannot be instanciated. One purpose of Information Items is to be able to define preliminary models, before having taken detailed modeling decisions on types or stuctures. One other purpose of information items and information flows is to abstract complex models by a less precise but more general representation of the information exchanged betwen entities of a system.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InformationItem#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InformationItem#getRepresented <em>Represented</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.InformationItem#getRepresented1 <em>Represented1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInformationItem()
 * @model extendedMetaData="name='InformationItem' kind='elementOnly'"
 * @generated
 */
public interface InformationItem extends Classifier
{
	/**
	 * Returns the value of the '<em><b>Group7</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group7</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group7</em>' attribute list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInformationItem_Group7()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:44'"
	 * @generated
	 */
	FeatureMap getGroup7();

	/**
	 * Returns the value of the '<em><b>Represented</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 : Determines the classifiers that will specify the structure and nature of the information. An information item represents all its represented classifiers. Customer Company Employee product wage <<flow>> <<flow>>
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Represented</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInformationItem_Represented()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='represented' group='#group:44'"
	 * @generated
	 */
	EList<Classifier> getRepresented();

	/**
	 * Returns the value of the '<em><b>Represented1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               : Determines the classifiers that will specify the structure and nature of the information. An information item represents all its represented classifiers. Customer Company Employee product wage <<flow>> <<flow>>
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Represented1</em>' attribute.
	 * @see #setRepresented1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getInformationItem_Represented1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='represented'"
	 * @generated
	 */
	String getRepresented1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.InformationItem#getRepresented1 <em>Represented1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represented1</em>' attribute.
	 * @see #getRepresented1()
	 * @generated
	 */
	void setRepresented1(String value);

} // InformationItem
