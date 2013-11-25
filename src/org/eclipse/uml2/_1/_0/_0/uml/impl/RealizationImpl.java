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
import org.eclipse.uml2._1._0._0.uml.Realization;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.RealizationImpl#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.RealizationImpl#getRealizingClassifier <em>Realizing Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.RealizationImpl#getRealizingClassifier1 <em>Realizing Classifier1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealizationImpl extends AbstractionImpl implements Realization
{
	/**
	 * The cached value of the '{@link #getGroup8() <em>Group8</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup8()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group8;

	/**
	 * The default value of the '{@link #getRealizingClassifier1() <em>Realizing Classifier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingClassifier1()
	 * @generated
	 * @ordered
	 */
	protected static final String REALIZING_CLASSIFIER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRealizingClassifier1() <em>Realizing Classifier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingClassifier1()
	 * @generated
	 * @ordered
	 */
	protected String realizingClassifier1 = REALIZING_CLASSIFIER1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealizationImpl()
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
		return UmlPackage.eINSTANCE.getRealization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup8()
	{
		if (group8 == null)
		{
			group8 = new BasicFeatureMap(this, UmlPackage.REALIZATION__GROUP8);
		}
		return group8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRealizingClassifier()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getRealization_RealizingClassifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRealizingClassifier1()
	{
		return realizingClassifier1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizingClassifier1(String newRealizingClassifier1)
	{
		String oldRealizingClassifier1 = realizingClassifier1;
		realizingClassifier1 = newRealizingClassifier1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.REALIZATION__REALIZING_CLASSIFIER1, oldRealizingClassifier1, realizingClassifier1));
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
			case UmlPackage.REALIZATION__GROUP8:
				return ((InternalEList<?>)getGroup8()).basicRemove(otherEnd, msgs);
			case UmlPackage.REALIZATION__REALIZING_CLASSIFIER:
				return ((InternalEList<?>)getRealizingClassifier()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.REALIZATION__GROUP8:
				if (coreType) return getGroup8();
				return ((FeatureMap.Internal)getGroup8()).getWrapper();
			case UmlPackage.REALIZATION__REALIZING_CLASSIFIER:
				return getRealizingClassifier();
			case UmlPackage.REALIZATION__REALIZING_CLASSIFIER1:
				return getRealizingClassifier1();
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
			case UmlPackage.REALIZATION__GROUP8:
				((FeatureMap.Internal)getGroup8()).set(newValue);
				return;
			case UmlPackage.REALIZATION__REALIZING_CLASSIFIER:
				getRealizingClassifier().clear();
				getRealizingClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case UmlPackage.REALIZATION__REALIZING_CLASSIFIER1:
				setRealizingClassifier1((String)newValue);
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
			case UmlPackage.REALIZATION__GROUP8:
				getGroup8().clear();
				return;
			case UmlPackage.REALIZATION__REALIZING_CLASSIFIER:
				getRealizingClassifier().clear();
				return;
			case UmlPackage.REALIZATION__REALIZING_CLASSIFIER1:
				setRealizingClassifier1(REALIZING_CLASSIFIER1_EDEFAULT);
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
			case UmlPackage.REALIZATION__GROUP8:
				return group8 != null && !group8.isEmpty();
			case UmlPackage.REALIZATION__REALIZING_CLASSIFIER:
				return !getRealizingClassifier().isEmpty();
			case UmlPackage.REALIZATION__REALIZING_CLASSIFIER1:
				return REALIZING_CLASSIFIER1_EDEFAULT == null ? realizingClassifier1 != null : !REALIZING_CLASSIFIER1_EDEFAULT.equals(realizingClassifier1);
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
		result.append(" (group8: ");
		result.append(group8);
		result.append(", realizingClassifier1: ");
		result.append(realizingClassifier1);
		result.append(')');
		return result.toString();
	}

} //RealizationImpl
