/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.uml2._1._0._0.uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continuation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A Continuation is a syntactic way to define continuations of different branches of an Alternative CombinedFragment. Continuations is intuitively similar to labels representing intermediate points in a flow of control.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Continuation#getSetting <em>Setting</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getContinuation()
 * @model extendedMetaData="name='Continuation' kind='elementOnly'"
 * @generated
 */
public interface Continuation extends InteractionFragment
{
	/**
	 * Returns the value of the '<em><b>Setting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               True: when the Continuation is at the end of the enclosing InteractionFragment and False when it is in the beginning.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Setting</em>' attribute.
	 * @see #setSetting(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getContinuation_Setting()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='setting'"
	 * @generated
	 */
	String getSetting();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Continuation#getSetting <em>Setting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setting</em>' attribute.
	 * @see #getSetting()
	 * @generated
	 */
	void setSetting(String value);

} // Continuation
