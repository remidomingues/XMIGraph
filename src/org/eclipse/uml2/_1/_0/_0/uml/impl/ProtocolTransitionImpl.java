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

import org.eclipse.uml2._1._0._0.uml.Constraint;
import org.eclipse.uml2._1._0._0.uml.ProtocolTransition;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ProtocolTransitionImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ProtocolTransitionImpl#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ProtocolTransitionImpl#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ProtocolTransitionImpl#getPreCondition1 <em>Pre Condition1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolTransitionImpl extends TransitionImpl implements ProtocolTransition
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
	 * The default value of the '{@link #getPreCondition1() <em>Pre Condition1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition1()
	 * @generated
	 * @ordered
	 */
	protected static final String PRE_CONDITION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreCondition1() <em>Pre Condition1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition1()
	 * @generated
	 * @ordered
	 */
	protected String preCondition1 = PRE_CONDITION1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolTransitionImpl()
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
		return UmlPackage.eINSTANCE.getProtocolTransition();
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
			group6 = new BasicFeatureMap(this, UmlPackage.PROTOCOL_TRANSITION__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPostCondition()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getProtocolTransition_PostCondition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPreCondition()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getProtocolTransition_PreCondition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreCondition1()
	{
		return preCondition1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreCondition1(String newPreCondition1)
	{
		String oldPreCondition1 = preCondition1;
		preCondition1 = newPreCondition1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROTOCOL_TRANSITION__PRE_CONDITION1, oldPreCondition1, preCondition1));
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
			case UmlPackage.PROTOCOL_TRANSITION__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.PROTOCOL_TRANSITION__POST_CONDITION:
				return ((InternalEList<?>)getPostCondition()).basicRemove(otherEnd, msgs);
			case UmlPackage.PROTOCOL_TRANSITION__PRE_CONDITION:
				return ((InternalEList<?>)getPreCondition()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.PROTOCOL_TRANSITION__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.PROTOCOL_TRANSITION__POST_CONDITION:
				return getPostCondition();
			case UmlPackage.PROTOCOL_TRANSITION__PRE_CONDITION:
				return getPreCondition();
			case UmlPackage.PROTOCOL_TRANSITION__PRE_CONDITION1:
				return getPreCondition1();
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
			case UmlPackage.PROTOCOL_TRANSITION__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.PROTOCOL_TRANSITION__POST_CONDITION:
				getPostCondition().clear();
				getPostCondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case UmlPackage.PROTOCOL_TRANSITION__PRE_CONDITION:
				getPreCondition().clear();
				getPreCondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case UmlPackage.PROTOCOL_TRANSITION__PRE_CONDITION1:
				setPreCondition1((String)newValue);
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
			case UmlPackage.PROTOCOL_TRANSITION__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.PROTOCOL_TRANSITION__POST_CONDITION:
				getPostCondition().clear();
				return;
			case UmlPackage.PROTOCOL_TRANSITION__PRE_CONDITION:
				getPreCondition().clear();
				return;
			case UmlPackage.PROTOCOL_TRANSITION__PRE_CONDITION1:
				setPreCondition1(PRE_CONDITION1_EDEFAULT);
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
			case UmlPackage.PROTOCOL_TRANSITION__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.PROTOCOL_TRANSITION__POST_CONDITION:
				return !getPostCondition().isEmpty();
			case UmlPackage.PROTOCOL_TRANSITION__PRE_CONDITION:
				return !getPreCondition().isEmpty();
			case UmlPackage.PROTOCOL_TRANSITION__PRE_CONDITION1:
				return PRE_CONDITION1_EDEFAULT == null ? preCondition1 != null : !PRE_CONDITION1_EDEFAULT.equals(preCondition1);
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
		result.append(", preCondition1: ");
		result.append(preCondition1);
		result.append(')');
		return result.toString();
	}

} //ProtocolTransitionImpl
