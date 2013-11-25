/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.uml2._1._0._0.uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2._1._0._0.uml.DeployedArtifact;
import org.eclipse.uml2._1._0._0.uml.Deployment;
import org.eclipse.uml2._1._0._0.uml.DeploymentSpecification;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DeploymentImpl#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DeploymentImpl#getDeployedArtifact <em>Deployed Artifact</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DeploymentImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DeploymentImpl#getDeployedArtifact1 <em>Deployed Artifact1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentImpl extends DependencyImpl implements Deployment
{
	/**
	 * The cached value of the '{@link #getGroup7() <em>Group7</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup7()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group7;

	/**
	 * The default value of the '{@link #getDeployedArtifact1() <em>Deployed Artifact1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedArtifact1()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYED_ARTIFACT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeployedArtifact1() <em>Deployed Artifact1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedArtifact1()
	 * @generated
	 * @ordered
	 */
	protected String deployedArtifact1 = DEPLOYED_ARTIFACT1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return UmlPackage.eINSTANCE.getDeployment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup7()
	{
		if (group7 == null)
		{
			group7 = new BasicFeatureMap(this, UmlPackage.DEPLOYMENT__GROUP7);
		}
		return group7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployedArtifact> getDeployedArtifact()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getDeployment_DeployedArtifact());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeploymentSpecification> getConfiguration()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getDeployment_Configuration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeployedArtifact1()
	{
		return deployedArtifact1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployedArtifact1(String newDeployedArtifact1)
	{
		String oldDeployedArtifact1 = deployedArtifact1;
		deployedArtifact1 = newDeployedArtifact1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.DEPLOYMENT__DEPLOYED_ARTIFACT1, oldDeployedArtifact1, deployedArtifact1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case UmlPackage.DEPLOYMENT__GROUP7:
				return ((InternalEList<?>)getGroup7()).basicRemove(otherEnd, msgs);
			case UmlPackage.DEPLOYMENT__DEPLOYED_ARTIFACT:
				return ((InternalEList<?>)getDeployedArtifact()).basicRemove(otherEnd, msgs);
			case UmlPackage.DEPLOYMENT__CONFIGURATION:
				return ((InternalEList<?>)getConfiguration()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case UmlPackage.DEPLOYMENT__GROUP7:
				if (coreType) return getGroup7();
				return ((FeatureMap.Internal)getGroup7()).getWrapper();
			case UmlPackage.DEPLOYMENT__DEPLOYED_ARTIFACT:
				return getDeployedArtifact();
			case UmlPackage.DEPLOYMENT__CONFIGURATION:
				return getConfiguration();
			case UmlPackage.DEPLOYMENT__DEPLOYED_ARTIFACT1:
				return getDeployedArtifact1();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case UmlPackage.DEPLOYMENT__GROUP7:
				((FeatureMap.Internal)getGroup7()).set(newValue);
				return;
			case UmlPackage.DEPLOYMENT__DEPLOYED_ARTIFACT:
				getDeployedArtifact().clear();
				getDeployedArtifact().addAll((Collection<? extends DeployedArtifact>)newValue);
				return;
			case UmlPackage.DEPLOYMENT__CONFIGURATION:
				getConfiguration().clear();
				getConfiguration().addAll((Collection<? extends DeploymentSpecification>)newValue);
				return;
			case UmlPackage.DEPLOYMENT__DEPLOYED_ARTIFACT1:
				setDeployedArtifact1((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case UmlPackage.DEPLOYMENT__GROUP7:
				getGroup7().clear();
				return;
			case UmlPackage.DEPLOYMENT__DEPLOYED_ARTIFACT:
				getDeployedArtifact().clear();
				return;
			case UmlPackage.DEPLOYMENT__CONFIGURATION:
				getConfiguration().clear();
				return;
			case UmlPackage.DEPLOYMENT__DEPLOYED_ARTIFACT1:
				setDeployedArtifact1(DEPLOYED_ARTIFACT1_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case UmlPackage.DEPLOYMENT__GROUP7:
				return group7 != null && !group7.isEmpty();
			case UmlPackage.DEPLOYMENT__DEPLOYED_ARTIFACT:
				return !getDeployedArtifact().isEmpty();
			case UmlPackage.DEPLOYMENT__CONFIGURATION:
				return !getConfiguration().isEmpty();
			case UmlPackage.DEPLOYMENT__DEPLOYED_ARTIFACT1:
				return DEPLOYED_ARTIFACT1_EDEFAULT == null ? deployedArtifact1 != null : !DEPLOYED_ARTIFACT1_EDEFAULT.equals(deployedArtifact1);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group7: ");
		result.append(group7);
		result.append(", deployedArtifact1: ");
		result.append(deployedArtifact1);
		result.append(')');
		return result.toString();
	}

} //DeploymentImpl
