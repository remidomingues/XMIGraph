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

import org.eclipse.uml2._1._0._0.uml.Dependency;
import org.eclipse.uml2._1._0._0.uml.NamedElement;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DependencyImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DependencyImpl#getClient <em>Client</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DependencyImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DependencyImpl#getClient1 <em>Client1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DependencyImpl#getSupplier1 <em>Supplier1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyImpl extends PackageableElementImpl implements Dependency
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
	 * The default value of the '{@link #getClient1() <em>Client1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient1()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClient1() <em>Client1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient1()
	 * @generated
	 * @ordered
	 */
	protected String client1 = CLIENT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupplier1() <em>Supplier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier1()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplier1() <em>Supplier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier1()
	 * @generated
	 * @ordered
	 */
	protected String supplier1 = SUPPLIER1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyImpl()
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
		return UmlPackage.eINSTANCE.getDependency();
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
			group6 = new BasicFeatureMap(this, UmlPackage.DEPENDENCY__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getClient()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getDependency_Client());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getSupplier()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getDependency_Supplier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClient1()
	{
		return client1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient1(String newClient1)
	{
		String oldClient1 = client1;
		client1 = newClient1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.DEPENDENCY__CLIENT1, oldClient1, client1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupplier1()
	{
		return supplier1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier1(String newSupplier1)
	{
		String oldSupplier1 = supplier1;
		supplier1 = newSupplier1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.DEPENDENCY__SUPPLIER1, oldSupplier1, supplier1));
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
			case UmlPackage.DEPENDENCY__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.DEPENDENCY__CLIENT:
				return ((InternalEList<?>)getClient()).basicRemove(otherEnd, msgs);
			case UmlPackage.DEPENDENCY__SUPPLIER:
				return ((InternalEList<?>)getSupplier()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.DEPENDENCY__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.DEPENDENCY__CLIENT:
				return getClient();
			case UmlPackage.DEPENDENCY__SUPPLIER:
				return getSupplier();
			case UmlPackage.DEPENDENCY__CLIENT1:
				return getClient1();
			case UmlPackage.DEPENDENCY__SUPPLIER1:
				return getSupplier1();
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
			case UmlPackage.DEPENDENCY__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.DEPENDENCY__CLIENT:
				getClient().clear();
				getClient().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case UmlPackage.DEPENDENCY__SUPPLIER:
				getSupplier().clear();
				getSupplier().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case UmlPackage.DEPENDENCY__CLIENT1:
				setClient1((String)newValue);
				return;
			case UmlPackage.DEPENDENCY__SUPPLIER1:
				setSupplier1((String)newValue);
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
			case UmlPackage.DEPENDENCY__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.DEPENDENCY__CLIENT:
				getClient().clear();
				return;
			case UmlPackage.DEPENDENCY__SUPPLIER:
				getSupplier().clear();
				return;
			case UmlPackage.DEPENDENCY__CLIENT1:
				setClient1(CLIENT1_EDEFAULT);
				return;
			case UmlPackage.DEPENDENCY__SUPPLIER1:
				setSupplier1(SUPPLIER1_EDEFAULT);
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
			case UmlPackage.DEPENDENCY__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.DEPENDENCY__CLIENT:
				return !getClient().isEmpty();
			case UmlPackage.DEPENDENCY__SUPPLIER:
				return !getSupplier().isEmpty();
			case UmlPackage.DEPENDENCY__CLIENT1:
				return CLIENT1_EDEFAULT == null ? client1 != null : !CLIENT1_EDEFAULT.equals(client1);
			case UmlPackage.DEPENDENCY__SUPPLIER1:
				return SUPPLIER1_EDEFAULT == null ? supplier1 != null : !SUPPLIER1_EDEFAULT.equals(supplier1);
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
		result.append(", client1: ");
		result.append(client1);
		result.append(", supplier1: ");
		result.append(supplier1);
		result.append(')');
		return result.toString();
	}

} //DependencyImpl
