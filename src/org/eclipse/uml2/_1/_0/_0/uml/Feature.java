/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.uml2._1._0._0.uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A feature declares a behavioral or structural characteristic of instances of classifiers. Feature is an abstract metaclass.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Feature#getIsStatic <em>Is Static</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getFeature()
 * @model extendedMetaData="name='Feature' kind='elementOnly'"
 * @generated
 */
public interface Feature extends RedefinableElement
{
	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Specifies whether the feature is applied at the classifier-level (true) or the instance-level (false). Default value is false.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getFeature_IsStatic()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isStatic'"
	 * @generated
	 */
	String getIsStatic();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Feature#getIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #getIsStatic()
	 * @generated
	 */
	void setIsStatic(String value);

} // Feature
