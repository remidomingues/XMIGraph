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

import org.eclipse.uml2._1._0._0.uml.ExpansionNode;
import org.eclipse.uml2._1._0._0.uml.ExpansionRegion;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExpansionNodeImpl#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExpansionNodeImpl#getRegionAsOutput <em>Region As Output</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExpansionNodeImpl#getRegionAsInput <em>Region As Input</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExpansionNodeImpl#getRegionAsInput1 <em>Region As Input1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExpansionNodeImpl#getRegionAsOutput1 <em>Region As Output1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpansionNodeImpl extends ObjectNodeImpl implements ExpansionNode
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
	 * The default value of the '{@link #getRegionAsInput1() <em>Region As Input1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionAsInput1()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_AS_INPUT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegionAsInput1() <em>Region As Input1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionAsInput1()
	 * @generated
	 * @ordered
	 */
	protected String regionAsInput1 = REGION_AS_INPUT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegionAsOutput1() <em>Region As Output1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionAsOutput1()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_AS_OUTPUT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegionAsOutput1() <em>Region As Output1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionAsOutput1()
	 * @generated
	 * @ordered
	 */
	protected String regionAsOutput1 = REGION_AS_OUTPUT1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpansionNodeImpl()
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
		return UmlPackage.eINSTANCE.getExpansionNode();
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
			group7 = new BasicFeatureMap(this, UmlPackage.EXPANSION_NODE__GROUP7);
		}
		return group7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpansionRegion> getRegionAsOutput()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getExpansionNode_RegionAsOutput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpansionRegion> getRegionAsInput()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getExpansionNode_RegionAsInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegionAsInput1()
	{
		return regionAsInput1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionAsInput1(String newRegionAsInput1)
	{
		String oldRegionAsInput1 = regionAsInput1;
		regionAsInput1 = newRegionAsInput1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EXPANSION_NODE__REGION_AS_INPUT1, oldRegionAsInput1, regionAsInput1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegionAsOutput1()
	{
		return regionAsOutput1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionAsOutput1(String newRegionAsOutput1)
	{
		String oldRegionAsOutput1 = regionAsOutput1;
		regionAsOutput1 = newRegionAsOutput1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT1, oldRegionAsOutput1, regionAsOutput1));
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
			case UmlPackage.EXPANSION_NODE__GROUP7:
				return ((InternalEList<?>)getGroup7()).basicRemove(otherEnd, msgs);
			case UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT:
				return ((InternalEList<?>)getRegionAsOutput()).basicRemove(otherEnd, msgs);
			case UmlPackage.EXPANSION_NODE__REGION_AS_INPUT:
				return ((InternalEList<?>)getRegionAsInput()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.EXPANSION_NODE__GROUP7:
				if (coreType) return getGroup7();
				return ((FeatureMap.Internal)getGroup7()).getWrapper();
			case UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT:
				return getRegionAsOutput();
			case UmlPackage.EXPANSION_NODE__REGION_AS_INPUT:
				return getRegionAsInput();
			case UmlPackage.EXPANSION_NODE__REGION_AS_INPUT1:
				return getRegionAsInput1();
			case UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT1:
				return getRegionAsOutput1();
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
			case UmlPackage.EXPANSION_NODE__GROUP7:
				((FeatureMap.Internal)getGroup7()).set(newValue);
				return;
			case UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT:
				getRegionAsOutput().clear();
				getRegionAsOutput().addAll((Collection<? extends ExpansionRegion>)newValue);
				return;
			case UmlPackage.EXPANSION_NODE__REGION_AS_INPUT:
				getRegionAsInput().clear();
				getRegionAsInput().addAll((Collection<? extends ExpansionRegion>)newValue);
				return;
			case UmlPackage.EXPANSION_NODE__REGION_AS_INPUT1:
				setRegionAsInput1((String)newValue);
				return;
			case UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT1:
				setRegionAsOutput1((String)newValue);
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
			case UmlPackage.EXPANSION_NODE__GROUP7:
				getGroup7().clear();
				return;
			case UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT:
				getRegionAsOutput().clear();
				return;
			case UmlPackage.EXPANSION_NODE__REGION_AS_INPUT:
				getRegionAsInput().clear();
				return;
			case UmlPackage.EXPANSION_NODE__REGION_AS_INPUT1:
				setRegionAsInput1(REGION_AS_INPUT1_EDEFAULT);
				return;
			case UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT1:
				setRegionAsOutput1(REGION_AS_OUTPUT1_EDEFAULT);
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
			case UmlPackage.EXPANSION_NODE__GROUP7:
				return group7 != null && !group7.isEmpty();
			case UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT:
				return !getRegionAsOutput().isEmpty();
			case UmlPackage.EXPANSION_NODE__REGION_AS_INPUT:
				return !getRegionAsInput().isEmpty();
			case UmlPackage.EXPANSION_NODE__REGION_AS_INPUT1:
				return REGION_AS_INPUT1_EDEFAULT == null ? regionAsInput1 != null : !REGION_AS_INPUT1_EDEFAULT.equals(regionAsInput1);
			case UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT1:
				return REGION_AS_OUTPUT1_EDEFAULT == null ? regionAsOutput1 != null : !REGION_AS_OUTPUT1_EDEFAULT.equals(regionAsOutput1);
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
		result.append(", regionAsInput1: ");
		result.append(regionAsInput1);
		result.append(", regionAsOutput1: ");
		result.append(regionAsOutput1);
		result.append(')');
		return result.toString();
	}

} //ExpansionNodeImpl
