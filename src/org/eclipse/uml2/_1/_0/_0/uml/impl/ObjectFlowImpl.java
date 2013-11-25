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

import org.eclipse.uml2._1._0._0.uml.Behavior;
import org.eclipse.uml2._1._0._0.uml.ObjectFlow;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ObjectFlowImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ObjectFlowImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ObjectFlowImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ObjectFlowImpl#getIsMulticast <em>Is Multicast</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ObjectFlowImpl#getIsMultireceive <em>Is Multireceive</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ObjectFlowImpl#getSelection1 <em>Selection1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ObjectFlowImpl#getTransformation1 <em>Transformation1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectFlowImpl extends ActivityEdgeImpl implements ObjectFlow
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
	 * The default value of the '{@link #getIsMulticast() <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMulticast()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_MULTICAST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsMulticast() <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMulticast()
	 * @generated
	 * @ordered
	 */
	protected String isMulticast = IS_MULTICAST_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsMultireceive() <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMultireceive()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_MULTIRECEIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsMultireceive() <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMultireceive()
	 * @generated
	 * @ordered
	 */
	protected String isMultireceive = IS_MULTIRECEIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelection1() <em>Selection1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection1()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelection1() <em>Selection1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection1()
	 * @generated
	 * @ordered
	 */
	protected String selection1 = SELECTION1_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransformation1() <em>Transformation1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation1()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORMATION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransformation1() <em>Transformation1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation1()
	 * @generated
	 * @ordered
	 */
	protected String transformation1 = TRANSFORMATION1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectFlowImpl()
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
		return UmlPackage.eINSTANCE.getObjectFlow();
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
			group6 = new BasicFeatureMap(this, UmlPackage.OBJECT_FLOW__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getTransformation()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getObjectFlow_Transformation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getSelection()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getObjectFlow_Selection());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsMulticast()
	{
		return isMulticast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMulticast(String newIsMulticast)
	{
		String oldIsMulticast = isMulticast;
		isMulticast = newIsMulticast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OBJECT_FLOW__IS_MULTICAST, oldIsMulticast, isMulticast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsMultireceive()
	{
		return isMultireceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMultireceive(String newIsMultireceive)
	{
		String oldIsMultireceive = isMultireceive;
		isMultireceive = newIsMultireceive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OBJECT_FLOW__IS_MULTIRECEIVE, oldIsMultireceive, isMultireceive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelection1()
	{
		return selection1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection1(String newSelection1)
	{
		String oldSelection1 = selection1;
		selection1 = newSelection1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OBJECT_FLOW__SELECTION1, oldSelection1, selection1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransformation1()
	{
		return transformation1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation1(String newTransformation1)
	{
		String oldTransformation1 = transformation1;
		transformation1 = newTransformation1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OBJECT_FLOW__TRANSFORMATION1, oldTransformation1, transformation1));
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
			case UmlPackage.OBJECT_FLOW__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.OBJECT_FLOW__TRANSFORMATION:
				return ((InternalEList<?>)getTransformation()).basicRemove(otherEnd, msgs);
			case UmlPackage.OBJECT_FLOW__SELECTION:
				return ((InternalEList<?>)getSelection()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.OBJECT_FLOW__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.OBJECT_FLOW__TRANSFORMATION:
				return getTransformation();
			case UmlPackage.OBJECT_FLOW__SELECTION:
				return getSelection();
			case UmlPackage.OBJECT_FLOW__IS_MULTICAST:
				return getIsMulticast();
			case UmlPackage.OBJECT_FLOW__IS_MULTIRECEIVE:
				return getIsMultireceive();
			case UmlPackage.OBJECT_FLOW__SELECTION1:
				return getSelection1();
			case UmlPackage.OBJECT_FLOW__TRANSFORMATION1:
				return getTransformation1();
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
			case UmlPackage.OBJECT_FLOW__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.OBJECT_FLOW__TRANSFORMATION:
				getTransformation().clear();
				getTransformation().addAll((Collection<? extends Behavior>)newValue);
				return;
			case UmlPackage.OBJECT_FLOW__SELECTION:
				getSelection().clear();
				getSelection().addAll((Collection<? extends Behavior>)newValue);
				return;
			case UmlPackage.OBJECT_FLOW__IS_MULTICAST:
				setIsMulticast((String)newValue);
				return;
			case UmlPackage.OBJECT_FLOW__IS_MULTIRECEIVE:
				setIsMultireceive((String)newValue);
				return;
			case UmlPackage.OBJECT_FLOW__SELECTION1:
				setSelection1((String)newValue);
				return;
			case UmlPackage.OBJECT_FLOW__TRANSFORMATION1:
				setTransformation1((String)newValue);
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
			case UmlPackage.OBJECT_FLOW__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.OBJECT_FLOW__TRANSFORMATION:
				getTransformation().clear();
				return;
			case UmlPackage.OBJECT_FLOW__SELECTION:
				getSelection().clear();
				return;
			case UmlPackage.OBJECT_FLOW__IS_MULTICAST:
				setIsMulticast(IS_MULTICAST_EDEFAULT);
				return;
			case UmlPackage.OBJECT_FLOW__IS_MULTIRECEIVE:
				setIsMultireceive(IS_MULTIRECEIVE_EDEFAULT);
				return;
			case UmlPackage.OBJECT_FLOW__SELECTION1:
				setSelection1(SELECTION1_EDEFAULT);
				return;
			case UmlPackage.OBJECT_FLOW__TRANSFORMATION1:
				setTransformation1(TRANSFORMATION1_EDEFAULT);
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
			case UmlPackage.OBJECT_FLOW__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.OBJECT_FLOW__TRANSFORMATION:
				return !getTransformation().isEmpty();
			case UmlPackage.OBJECT_FLOW__SELECTION:
				return !getSelection().isEmpty();
			case UmlPackage.OBJECT_FLOW__IS_MULTICAST:
				return IS_MULTICAST_EDEFAULT == null ? isMulticast != null : !IS_MULTICAST_EDEFAULT.equals(isMulticast);
			case UmlPackage.OBJECT_FLOW__IS_MULTIRECEIVE:
				return IS_MULTIRECEIVE_EDEFAULT == null ? isMultireceive != null : !IS_MULTIRECEIVE_EDEFAULT.equals(isMultireceive);
			case UmlPackage.OBJECT_FLOW__SELECTION1:
				return SELECTION1_EDEFAULT == null ? selection1 != null : !SELECTION1_EDEFAULT.equals(selection1);
			case UmlPackage.OBJECT_FLOW__TRANSFORMATION1:
				return TRANSFORMATION1_EDEFAULT == null ? transformation1 != null : !TRANSFORMATION1_EDEFAULT.equals(transformation1);
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
		result.append(", isMulticast: ");
		result.append(isMulticast);
		result.append(", isMultireceive: ");
		result.append(isMultireceive);
		result.append(", selection1: ");
		result.append(selection1);
		result.append(", transformation1: ");
		result.append(transformation1);
		result.append(')');
		return result.toString();
	}

} //ObjectFlowImpl
