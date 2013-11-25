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

import org.eclipse.uml2._1._0._0.uml.Implementation;
import org.eclipse.uml2._1._0._0.uml.Interface;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ImplementationImpl#getGroup9 <em>Group9</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ImplementationImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ImplementationImpl#getContract1 <em>Contract1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementationImpl extends RealizationImpl implements Implementation
{
	/**
	 * The cached value of the '{@link #getGroup9() <em>Group9</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup9()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group9;

	/**
	 * The default value of the '{@link #getContract1() <em>Contract1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract1()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRACT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContract1() <em>Contract1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract1()
	 * @generated
	 * @ordered
	 */
	protected String contract1 = CONTRACT1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationImpl()
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
		return UmlPackage.eINSTANCE.getImplementation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup9()
	{
		if (group9 == null)
		{
			group9 = new BasicFeatureMap(this, UmlPackage.IMPLEMENTATION__GROUP9);
		}
		return group9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getContract()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getImplementation_Contract());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContract1()
	{
		return contract1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContract1(String newContract1)
	{
		String oldContract1 = contract1;
		contract1 = newContract1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.IMPLEMENTATION__CONTRACT1, oldContract1, contract1));
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
			case UmlPackage.IMPLEMENTATION__GROUP9:
				return ((InternalEList<?>)getGroup9()).basicRemove(otherEnd, msgs);
			case UmlPackage.IMPLEMENTATION__CONTRACT:
				return ((InternalEList<?>)getContract()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.IMPLEMENTATION__GROUP9:
				if (coreType) return getGroup9();
				return ((FeatureMap.Internal)getGroup9()).getWrapper();
			case UmlPackage.IMPLEMENTATION__CONTRACT:
				return getContract();
			case UmlPackage.IMPLEMENTATION__CONTRACT1:
				return getContract1();
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
			case UmlPackage.IMPLEMENTATION__GROUP9:
				((FeatureMap.Internal)getGroup9()).set(newValue);
				return;
			case UmlPackage.IMPLEMENTATION__CONTRACT:
				getContract().clear();
				getContract().addAll((Collection<? extends Interface>)newValue);
				return;
			case UmlPackage.IMPLEMENTATION__CONTRACT1:
				setContract1((String)newValue);
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
			case UmlPackage.IMPLEMENTATION__GROUP9:
				getGroup9().clear();
				return;
			case UmlPackage.IMPLEMENTATION__CONTRACT:
				getContract().clear();
				return;
			case UmlPackage.IMPLEMENTATION__CONTRACT1:
				setContract1(CONTRACT1_EDEFAULT);
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
			case UmlPackage.IMPLEMENTATION__GROUP9:
				return group9 != null && !group9.isEmpty();
			case UmlPackage.IMPLEMENTATION__CONTRACT:
				return !getContract().isEmpty();
			case UmlPackage.IMPLEMENTATION__CONTRACT1:
				return CONTRACT1_EDEFAULT == null ? contract1 != null : !CONTRACT1_EDEFAULT.equals(contract1);
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
		result.append(" (group9: ");
		result.append(group9);
		result.append(", contract1: ");
		result.append(contract1);
		result.append(')');
		return result.toString();
	}

} //ImplementationImpl
