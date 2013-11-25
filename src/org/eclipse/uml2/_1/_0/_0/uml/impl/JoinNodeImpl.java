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

import org.eclipse.uml2._1._0._0.uml.JoinNode;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.JoinNodeImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.JoinNodeImpl#getJoinSpec <em>Join Spec</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.JoinNodeImpl#getIsCombineDuplicate <em>Is Combine Duplicate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinNodeImpl extends ControlNodeImpl implements JoinNode
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
	 * The default value of the '{@link #getIsCombineDuplicate() <em>Is Combine Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCombineDuplicate()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_COMBINE_DUPLICATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsCombineDuplicate() <em>Is Combine Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCombineDuplicate()
	 * @generated
	 * @ordered
	 */
	protected String isCombineDuplicate = IS_COMBINE_DUPLICATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinNodeImpl()
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
		return UmlPackage.eINSTANCE.getJoinNode();
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
			group6 = new BasicFeatureMap(this, UmlPackage.JOIN_NODE__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getJoinSpec()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getJoinNode_JoinSpec());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsCombineDuplicate()
	{
		return isCombineDuplicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCombineDuplicate(String newIsCombineDuplicate)
	{
		String oldIsCombineDuplicate = isCombineDuplicate;
		isCombineDuplicate = newIsCombineDuplicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.JOIN_NODE__IS_COMBINE_DUPLICATE, oldIsCombineDuplicate, isCombineDuplicate));
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
			case UmlPackage.JOIN_NODE__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.JOIN_NODE__JOIN_SPEC:
				return ((InternalEList<?>)getJoinSpec()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.JOIN_NODE__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.JOIN_NODE__JOIN_SPEC:
				return getJoinSpec();
			case UmlPackage.JOIN_NODE__IS_COMBINE_DUPLICATE:
				return getIsCombineDuplicate();
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
			case UmlPackage.JOIN_NODE__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.JOIN_NODE__JOIN_SPEC:
				getJoinSpec().clear();
				getJoinSpec().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UmlPackage.JOIN_NODE__IS_COMBINE_DUPLICATE:
				setIsCombineDuplicate((String)newValue);
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
			case UmlPackage.JOIN_NODE__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.JOIN_NODE__JOIN_SPEC:
				getJoinSpec().clear();
				return;
			case UmlPackage.JOIN_NODE__IS_COMBINE_DUPLICATE:
				setIsCombineDuplicate(IS_COMBINE_DUPLICATE_EDEFAULT);
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
			case UmlPackage.JOIN_NODE__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.JOIN_NODE__JOIN_SPEC:
				return !getJoinSpec().isEmpty();
			case UmlPackage.JOIN_NODE__IS_COMBINE_DUPLICATE:
				return IS_COMBINE_DUPLICATE_EDEFAULT == null ? isCombineDuplicate != null : !IS_COMBINE_DUPLICATE_EDEFAULT.equals(isCombineDuplicate);
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
		result.append(", isCombineDuplicate: ");
		result.append(isCombineDuplicate);
		result.append(')');
		return result.toString();
	}

} //JoinNodeImpl
