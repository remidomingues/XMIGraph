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
import org.eclipse.uml2._1._0._0.uml.InformationFlow;
import org.eclipse.uml2._1._0._0.uml.Relationship;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InformationFlowImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InformationFlowImpl#getRealization <em>Realization</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InformationFlowImpl#getConveyed <em>Conveyed</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InformationFlowImpl#getConveyed1 <em>Conveyed1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InformationFlowImpl#getRealization1 <em>Realization1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InformationFlowImpl extends PackageableElementImpl implements InformationFlow
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
	 * The default value of the '{@link #getConveyed1() <em>Conveyed1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyed1()
	 * @generated
	 * @ordered
	 */
	protected static final String CONVEYED1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConveyed1() <em>Conveyed1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyed1()
	 * @generated
	 * @ordered
	 */
	protected String conveyed1 = CONVEYED1_EDEFAULT;

	/**
	 * The default value of the '{@link #getRealization1() <em>Realization1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealization1()
	 * @generated
	 * @ordered
	 */
	protected static final String REALIZATION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRealization1() <em>Realization1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealization1()
	 * @generated
	 * @ordered
	 */
	protected String realization1 = REALIZATION1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationFlowImpl()
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
		return UmlPackage.eINSTANCE.getInformationFlow();
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
			group6 = new BasicFeatureMap(this, UmlPackage.INFORMATION_FLOW__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRealization()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getInformationFlow_Realization());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getConveyed()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getInformationFlow_Conveyed());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConveyed1()
	{
		return conveyed1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConveyed1(String newConveyed1)
	{
		String oldConveyed1 = conveyed1;
		conveyed1 = newConveyed1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INFORMATION_FLOW__CONVEYED1, oldConveyed1, conveyed1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRealization1()
	{
		return realization1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealization1(String newRealization1)
	{
		String oldRealization1 = realization1;
		realization1 = newRealization1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INFORMATION_FLOW__REALIZATION1, oldRealization1, realization1));
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
			case UmlPackage.INFORMATION_FLOW__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.INFORMATION_FLOW__REALIZATION:
				return ((InternalEList<?>)getRealization()).basicRemove(otherEnd, msgs);
			case UmlPackage.INFORMATION_FLOW__CONVEYED:
				return ((InternalEList<?>)getConveyed()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.INFORMATION_FLOW__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.INFORMATION_FLOW__REALIZATION:
				return getRealization();
			case UmlPackage.INFORMATION_FLOW__CONVEYED:
				return getConveyed();
			case UmlPackage.INFORMATION_FLOW__CONVEYED1:
				return getConveyed1();
			case UmlPackage.INFORMATION_FLOW__REALIZATION1:
				return getRealization1();
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
			case UmlPackage.INFORMATION_FLOW__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.INFORMATION_FLOW__REALIZATION:
				getRealization().clear();
				getRealization().addAll((Collection<? extends Relationship>)newValue);
				return;
			case UmlPackage.INFORMATION_FLOW__CONVEYED:
				getConveyed().clear();
				getConveyed().addAll((Collection<? extends Classifier>)newValue);
				return;
			case UmlPackage.INFORMATION_FLOW__CONVEYED1:
				setConveyed1((String)newValue);
				return;
			case UmlPackage.INFORMATION_FLOW__REALIZATION1:
				setRealization1((String)newValue);
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
			case UmlPackage.INFORMATION_FLOW__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.INFORMATION_FLOW__REALIZATION:
				getRealization().clear();
				return;
			case UmlPackage.INFORMATION_FLOW__CONVEYED:
				getConveyed().clear();
				return;
			case UmlPackage.INFORMATION_FLOW__CONVEYED1:
				setConveyed1(CONVEYED1_EDEFAULT);
				return;
			case UmlPackage.INFORMATION_FLOW__REALIZATION1:
				setRealization1(REALIZATION1_EDEFAULT);
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
			case UmlPackage.INFORMATION_FLOW__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.INFORMATION_FLOW__REALIZATION:
				return !getRealization().isEmpty();
			case UmlPackage.INFORMATION_FLOW__CONVEYED:
				return !getConveyed().isEmpty();
			case UmlPackage.INFORMATION_FLOW__CONVEYED1:
				return CONVEYED1_EDEFAULT == null ? conveyed1 != null : !CONVEYED1_EDEFAULT.equals(conveyed1);
			case UmlPackage.INFORMATION_FLOW__REALIZATION1:
				return REALIZATION1_EDEFAULT == null ? realization1 != null : !REALIZATION1_EDEFAULT.equals(realization1);
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
		result.append(", conveyed1: ");
		result.append(conveyed1);
		result.append(", realization1: ");
		result.append(realization1);
		result.append(')');
		return result.toString();
	}

} //InformationFlowImpl
