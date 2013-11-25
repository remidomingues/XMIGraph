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

import org.eclipse.uml2._1._0._0.uml.Classifier;
import org.eclipse.uml2._1._0._0.uml.Deployment;
import org.eclipse.uml2._1._0._0.uml.InstanceSpecification;
import org.eclipse.uml2._1._0._0.uml.Slot;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InstanceSpecificationImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InstanceSpecificationImpl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InstanceSpecificationImpl#getSlot <em>Slot</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InstanceSpecificationImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InstanceSpecificationImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InstanceSpecificationImpl#getClassifier1 <em>Classifier1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceSpecificationImpl extends PackageableElementImpl implements InstanceSpecification
{
	/**
	 * The cached value of the '{@link #getGroup6() <em>Group6</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup6()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group6;

	/**
	 * The default value of the '{@link #getClassifier1() <em>Classifier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier1()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifier1() <em>Classifier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier1()
	 * @generated
	 * @ordered
	 */
	protected String classifier1 = CLASSIFIER1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceSpecificationImpl()
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
		return UmlPackage.eINSTANCE.getInstanceSpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup6()
	{
		if (group6 == null)
		{
			group6 = new BasicFeatureMap(this, UmlPackage.INSTANCE_SPECIFICATION__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Deployment> getDeployment()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getInstanceSpecification_Deployment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Slot> getSlot()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getInstanceSpecification_Slot());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getClassifier()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getInstanceSpecification_Classifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getSpecification()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getInstanceSpecification_Specification());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassifier1()
	{
		return classifier1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier1(String newClassifier1)
	{
		String oldClassifier1 = classifier1;
		classifier1 = newClassifier1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INSTANCE_SPECIFICATION__CLASSIFIER1, oldClassifier1, classifier1));
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
			case UmlPackage.INSTANCE_SPECIFICATION__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.INSTANCE_SPECIFICATION__DEPLOYMENT:
				return ((InternalEList<?>)getDeployment()).basicRemove(otherEnd, msgs);
			case UmlPackage.INSTANCE_SPECIFICATION__SLOT:
				return ((InternalEList<?>)getSlot()).basicRemove(otherEnd, msgs);
			case UmlPackage.INSTANCE_SPECIFICATION__CLASSIFIER:
				return ((InternalEList<?>)getClassifier()).basicRemove(otherEnd, msgs);
			case UmlPackage.INSTANCE_SPECIFICATION__SPECIFICATION:
				return ((InternalEList<?>)getSpecification()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.INSTANCE_SPECIFICATION__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.INSTANCE_SPECIFICATION__DEPLOYMENT:
				return getDeployment();
			case UmlPackage.INSTANCE_SPECIFICATION__SLOT:
				return getSlot();
			case UmlPackage.INSTANCE_SPECIFICATION__CLASSIFIER:
				return getClassifier();
			case UmlPackage.INSTANCE_SPECIFICATION__SPECIFICATION:
				return getSpecification();
			case UmlPackage.INSTANCE_SPECIFICATION__CLASSIFIER1:
				return getClassifier1();
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
			case UmlPackage.INSTANCE_SPECIFICATION__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.INSTANCE_SPECIFICATION__DEPLOYMENT:
				getDeployment().clear();
				getDeployment().addAll((Collection<? extends Deployment>)newValue);
				return;
			case UmlPackage.INSTANCE_SPECIFICATION__SLOT:
				getSlot().clear();
				getSlot().addAll((Collection<? extends Slot>)newValue);
				return;
			case UmlPackage.INSTANCE_SPECIFICATION__CLASSIFIER:
				getClassifier().clear();
				getClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case UmlPackage.INSTANCE_SPECIFICATION__SPECIFICATION:
				getSpecification().clear();
				getSpecification().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UmlPackage.INSTANCE_SPECIFICATION__CLASSIFIER1:
				setClassifier1((String)newValue);
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
			case UmlPackage.INSTANCE_SPECIFICATION__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.INSTANCE_SPECIFICATION__DEPLOYMENT:
				getDeployment().clear();
				return;
			case UmlPackage.INSTANCE_SPECIFICATION__SLOT:
				getSlot().clear();
				return;
			case UmlPackage.INSTANCE_SPECIFICATION__CLASSIFIER:
				getClassifier().clear();
				return;
			case UmlPackage.INSTANCE_SPECIFICATION__SPECIFICATION:
				getSpecification().clear();
				return;
			case UmlPackage.INSTANCE_SPECIFICATION__CLASSIFIER1:
				setClassifier1(CLASSIFIER1_EDEFAULT);
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
			case UmlPackage.INSTANCE_SPECIFICATION__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.INSTANCE_SPECIFICATION__DEPLOYMENT:
				return !getDeployment().isEmpty();
			case UmlPackage.INSTANCE_SPECIFICATION__SLOT:
				return !getSlot().isEmpty();
			case UmlPackage.INSTANCE_SPECIFICATION__CLASSIFIER:
				return !getClassifier().isEmpty();
			case UmlPackage.INSTANCE_SPECIFICATION__SPECIFICATION:
				return !getSpecification().isEmpty();
			case UmlPackage.INSTANCE_SPECIFICATION__CLASSIFIER1:
				return CLASSIFIER1_EDEFAULT == null ? classifier1 != null : !CLASSIFIER1_EDEFAULT.equals(classifier1);
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
		result.append(" (group6: ");
		result.append(group6);
		result.append(", classifier1: ");
		result.append(classifier1);
		result.append(')');
		return result.toString();
	}

} //InstanceSpecificationImpl
