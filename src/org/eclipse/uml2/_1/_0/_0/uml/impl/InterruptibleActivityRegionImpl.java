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

import org.eclipse.uml2._1._0._0.uml.ActivityEdge;
import org.eclipse.uml2._1._0._0.uml.ActivityNode;
import org.eclipse.uml2._1._0._0.uml.InterruptibleActivityRegion;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interruptible Activity Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InterruptibleActivityRegionImpl#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InterruptibleActivityRegionImpl#getInterruptingEdge <em>Interrupting Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InterruptibleActivityRegionImpl#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InterruptibleActivityRegionImpl#getContainedNode1 <em>Contained Node1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InterruptibleActivityRegionImpl#getInterruptingEdge1 <em>Interrupting Edge1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterruptibleActivityRegionImpl extends ActivityGroupImpl implements InterruptibleActivityRegion
{
	/**
	 * The cached value of the '{@link #getGroup3() <em>Group3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup3()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group3;

	/**
	 * The default value of the '{@link #getContainedNode1() <em>Contained Node1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedNode1()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINED_NODE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainedNode1() <em>Contained Node1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedNode1()
	 * @generated
	 * @ordered
	 */
	protected String containedNode1 = CONTAINED_NODE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterruptingEdge1() <em>Interrupting Edge1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptingEdge1()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERRUPTING_EDGE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterruptingEdge1() <em>Interrupting Edge1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptingEdge1()
	 * @generated
	 * @ordered
	 */
	protected String interruptingEdge1 = INTERRUPTING_EDGE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterruptibleActivityRegionImpl()
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
		return UmlPackage.eINSTANCE.getInterruptibleActivityRegion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup3()
	{
		if (group3 == null)
		{
			group3 = new BasicFeatureMap(this, UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__GROUP3);
		}
		return group3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getInterruptingEdge()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getInterruptibleActivityRegion_InterruptingEdge());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getContainedNode()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getInterruptibleActivityRegion_ContainedNode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainedNode1()
	{
		return containedNode1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedNode1(String newContainedNode1)
	{
		String oldContainedNode1 = containedNode1;
		containedNode1 = newContainedNode1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE1, oldContainedNode1, containedNode1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterruptingEdge1()
	{
		return interruptingEdge1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterruptingEdge1(String newInterruptingEdge1)
	{
		String oldInterruptingEdge1 = interruptingEdge1;
		interruptingEdge1 = newInterruptingEdge1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE1, oldInterruptingEdge1, interruptingEdge1));
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
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__GROUP3:
				return ((InternalEList<?>)getGroup3()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return ((InternalEList<?>)getInterruptingEdge()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE:
				return ((InternalEList<?>)getContainedNode()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__GROUP3:
				if (coreType) return getGroup3();
				return ((FeatureMap.Internal)getGroup3()).getWrapper();
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return getInterruptingEdge();
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE:
				return getContainedNode();
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE1:
				return getContainedNode1();
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE1:
				return getInterruptingEdge1();
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
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__GROUP3:
				((FeatureMap.Internal)getGroup3()).set(newValue);
				return;
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				getInterruptingEdge().clear();
				getInterruptingEdge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE:
				getContainedNode().clear();
				getContainedNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE1:
				setContainedNode1((String)newValue);
				return;
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE1:
				setInterruptingEdge1((String)newValue);
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
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__GROUP3:
				getGroup3().clear();
				return;
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				getInterruptingEdge().clear();
				return;
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE:
				getContainedNode().clear();
				return;
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE1:
				setContainedNode1(CONTAINED_NODE1_EDEFAULT);
				return;
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE1:
				setInterruptingEdge1(INTERRUPTING_EDGE1_EDEFAULT);
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
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__GROUP3:
				return group3 != null && !group3.isEmpty();
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return !getInterruptingEdge().isEmpty();
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE:
				return !getContainedNode().isEmpty();
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE1:
				return CONTAINED_NODE1_EDEFAULT == null ? containedNode1 != null : !CONTAINED_NODE1_EDEFAULT.equals(containedNode1);
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE1:
				return INTERRUPTING_EDGE1_EDEFAULT == null ? interruptingEdge1 != null : !INTERRUPTING_EDGE1_EDEFAULT.equals(interruptingEdge1);
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
		result.append(" (group3: ");
		result.append(group3);
		result.append(", containedNode1: ");
		result.append(containedNode1);
		result.append(", interruptingEdge1: ");
		result.append(interruptingEdge1);
		result.append(')');
		return result.toString();
	}

} //InterruptibleActivityRegionImpl
