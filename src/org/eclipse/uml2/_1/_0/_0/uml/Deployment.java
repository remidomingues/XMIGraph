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
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Deployment#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Deployment#getDeployedArtifact <em>Deployed Artifact</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Deployment#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.Deployment#getDeployedArtifact1 <em>Deployed Artifact1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getDeployment()
 * @model extendedMetaData="name='Deployment' kind='elementOnly'"
 * @generated
 */
public interface Deployment extends Dependency
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
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getDeployment_Group7()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:31'"
	 * @generated
	 */
	FeatureMap getGroup7();

	/**
	 * Returns the value of the '<em><b>Deployed Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.DeployedArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Artifact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Artifact</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getDeployment_DeployedArtifact()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='deployedArtifact' group='#group:31'"
	 * @generated
	 */
	EList<DeployedArtifact> getDeployedArtifact();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2._1._0._0.uml.DeploymentSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference list.
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getDeployment_Configuration()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='configuration' group='#group:31'"
	 * @generated
	 */
	EList<DeploymentSpecification> getConfiguration();

	/**
	 * Returns the value of the '<em><b>Deployed Artifact1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Artifact1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Artifact1</em>' attribute.
	 * @see #setDeployedArtifact1(String)
	 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getDeployment_DeployedArtifact1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='deployedArtifact'"
	 * @generated
	 */
	String getDeployedArtifact1();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2._1._0._0.uml.Deployment#getDeployedArtifact1 <em>Deployed Artifact1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployed Artifact1</em>' attribute.
	 * @see #getDeployedArtifact1()
	 * @generated
	 */
	void setDeployedArtifact1(String value);

} // Deployment
