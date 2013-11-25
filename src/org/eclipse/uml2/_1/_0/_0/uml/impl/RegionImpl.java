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

import org.eclipse.uml2._1._0._0.uml.Region;
import org.eclipse.uml2._1._0._0.uml.Transition;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.RegionImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.RegionImpl#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.RegionImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.RegionImpl#getExtendedRegion <em>Extended Region</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.RegionImpl#getExtendedRegion1 <em>Extended Region1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.RegionImpl#getIsLeaf <em>Is Leaf</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegionImpl extends NamespaceImpl implements Region
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
	 * The default value of the '{@link #getExtendedRegion1() <em>Extended Region1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedRegion1()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDED_REGION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtendedRegion1() <em>Extended Region1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedRegion1()
	 * @generated
	 * @ordered
	 */
	protected String extendedRegion1 = EXTENDED_REGION1_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_LEAF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected String isLeaf = IS_LEAF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl()
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
		return UmlPackage.eINSTANCE.getRegion();
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
			group6 = new BasicFeatureMap(this, UmlPackage.REGION__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vertex> getSubvertex()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getRegion_Subvertex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransition()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getRegion_Transition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Region> getExtendedRegion()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getRegion_ExtendedRegion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtendedRegion1()
	{
		return extendedRegion1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedRegion1(String newExtendedRegion1)
	{
		String oldExtendedRegion1 = extendedRegion1;
		extendedRegion1 = newExtendedRegion1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.REGION__EXTENDED_REGION1, oldExtendedRegion1, extendedRegion1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsLeaf()
	{
		return isLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(String newIsLeaf)
	{
		String oldIsLeaf = isLeaf;
		isLeaf = newIsLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.REGION__IS_LEAF, oldIsLeaf, isLeaf));
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
			case UmlPackage.REGION__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.REGION__SUBVERTEX:
				return ((InternalEList<?>)getSubvertex()).basicRemove(otherEnd, msgs);
			case UmlPackage.REGION__TRANSITION:
				return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
			case UmlPackage.REGION__EXTENDED_REGION:
				return ((InternalEList<?>)getExtendedRegion()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.REGION__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.REGION__SUBVERTEX:
				return getSubvertex();
			case UmlPackage.REGION__TRANSITION:
				return getTransition();
			case UmlPackage.REGION__EXTENDED_REGION:
				return getExtendedRegion();
			case UmlPackage.REGION__EXTENDED_REGION1:
				return getExtendedRegion1();
			case UmlPackage.REGION__IS_LEAF:
				return getIsLeaf();
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
			case UmlPackage.REGION__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.REGION__SUBVERTEX:
				getSubvertex().clear();
				getSubvertex().addAll((Collection<? extends Vertex>)newValue);
				return;
			case UmlPackage.REGION__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends Transition>)newValue);
				return;
			case UmlPackage.REGION__EXTENDED_REGION:
				getExtendedRegion().clear();
				getExtendedRegion().addAll((Collection<? extends Region>)newValue);
				return;
			case UmlPackage.REGION__EXTENDED_REGION1:
				setExtendedRegion1((String)newValue);
				return;
			case UmlPackage.REGION__IS_LEAF:
				setIsLeaf((String)newValue);
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
			case UmlPackage.REGION__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.REGION__SUBVERTEX:
				getSubvertex().clear();
				return;
			case UmlPackage.REGION__TRANSITION:
				getTransition().clear();
				return;
			case UmlPackage.REGION__EXTENDED_REGION:
				getExtendedRegion().clear();
				return;
			case UmlPackage.REGION__EXTENDED_REGION1:
				setExtendedRegion1(EXTENDED_REGION1_EDEFAULT);
				return;
			case UmlPackage.REGION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
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
			case UmlPackage.REGION__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.REGION__SUBVERTEX:
				return !getSubvertex().isEmpty();
			case UmlPackage.REGION__TRANSITION:
				return !getTransition().isEmpty();
			case UmlPackage.REGION__EXTENDED_REGION:
				return !getExtendedRegion().isEmpty();
			case UmlPackage.REGION__EXTENDED_REGION1:
				return EXTENDED_REGION1_EDEFAULT == null ? extendedRegion1 != null : !EXTENDED_REGION1_EDEFAULT.equals(extendedRegion1);
			case UmlPackage.REGION__IS_LEAF:
				return IS_LEAF_EDEFAULT == null ? isLeaf != null : !IS_LEAF_EDEFAULT.equals(isLeaf);
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
		result.append(", extendedRegion1: ");
		result.append(extendedRegion1);
		result.append(", isLeaf: ");
		result.append(isLeaf);
		result.append(')');
		return result.toString();
	}

} //RegionImpl
