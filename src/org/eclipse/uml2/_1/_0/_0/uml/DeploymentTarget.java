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
 * A representation of the model object '<em><b>Deployment Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A deployment target is the location for a deployed artifact. In the metamodel, DeploymentTarget is an abstract metaclass that is a specialization of NamedElement. A DeploymentTarget owns a set of Deployments.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.DeploymentTarget#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.DeploymentTarget#getDeployment <em>Deployment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getDeploymentTarget()
 * @model extendedMetaData="name='DeploymentTarget' kind='elementOnly'"
 * @generated
 */
public interface DeploymentTarget extends NamedElement
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getDeploymentTarget_Group5()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:22'"
	 * @generated
	 */
	FeatureMap getGroup5();

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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getDeploymentTarget_Deployment()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='deployment' group='#group:22'"
	 * @generated
	 */
	EList<Deployment> getDeployment();

} // DeploymentTarget
