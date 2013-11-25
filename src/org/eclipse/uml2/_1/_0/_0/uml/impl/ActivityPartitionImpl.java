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
import org.eclipse.uml2._1._0._0.uml.ActivityPartition;
import org.eclipse.uml2._1._0._0.uml.Element;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityPartitionImpl#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityPartitionImpl#getContainedEdge <em>Contained Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityPartitionImpl#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityPartitionImpl#getSubgroup <em>Subgroup</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityPartitionImpl#getRepresents <em>Represents</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityPartitionImpl#getContainedEdge1 <em>Contained Edge1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityPartitionImpl#getContainedNode1 <em>Contained Node1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityPartitionImpl#getIsDimension <em>Is Dimension</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityPartitionImpl#getIsExternal <em>Is External</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityPartitionImpl#getRepresents1 <em>Represents1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityPartitionImpl extends NamedElementImpl implements ActivityPartition
{
	/**
	 * The cached value of the '{@link #getGroup5() <em>Group5</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup5()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group5;

	/**
	 * The default value of the '{@link #getContainedEdge1() <em>Contained Edge1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedEdge1()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINED_EDGE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainedEdge1() <em>Contained Edge1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedEdge1()
	 * @generated
	 * @ordered
	 */
	protected String containedEdge1 = CONTAINED_EDGE1_EDEFAULT;

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
	 * The default value of the '{@link #getIsDimension() <em>Is Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDimension()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_DIMENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDimension() <em>Is Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDimension()
	 * @generated
	 * @ordered
	 */
	protected String isDimension = IS_DIMENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExternal()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_EXTERNAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExternal()
	 * @generated
	 * @ordered
	 */
	protected String isExternal = IS_EXTERNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepresents1() <em>Represents1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresents1()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRESENTS1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepresents1() <em>Represents1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresents1()
	 * @generated
	 * @ordered
	 */
	protected String represents1 = REPRESENTS1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityPartitionImpl()
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
		return UmlPackage.eINSTANCE.getActivityPartition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup5()
	{
		if (group5 == null)
		{
			group5 = new BasicFeatureMap(this, UmlPackage.ACTIVITY_PARTITION__GROUP5);
		}
		return group5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getContainedEdge()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getActivityPartition_ContainedEdge());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getContainedNode()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getActivityPartition_ContainedNode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityPartition> getSubgroup()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getActivityPartition_Subgroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getRepresents()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getActivityPartition_Represents());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainedEdge1()
	{
		return containedEdge1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedEdge1(String newContainedEdge1)
	{
		String oldContainedEdge1 = containedEdge1;
		containedEdge1 = newContainedEdge1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY_PARTITION__CONTAINED_EDGE1, oldContainedEdge1, containedEdge1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY_PARTITION__CONTAINED_NODE1, oldContainedNode1, containedNode1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsDimension()
	{
		return isDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDimension(String newIsDimension)
	{
		String oldIsDimension = isDimension;
		isDimension = newIsDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY_PARTITION__IS_DIMENSION, oldIsDimension, isDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsExternal()
	{
		return isExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExternal(String newIsExternal)
	{
		String oldIsExternal = isExternal;
		isExternal = newIsExternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY_PARTITION__IS_EXTERNAL, oldIsExternal, isExternal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepresents1()
	{
		return represents1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresents1(String newRepresents1)
	{
		String oldRepresents1 = represents1;
		represents1 = newRepresents1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY_PARTITION__REPRESENTS1, oldRepresents1, represents1));
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
			case UmlPackage.ACTIVITY_PARTITION__GROUP5:
				return ((InternalEList<?>)getGroup5()).basicRemove(otherEnd, msgs);
			case UmlPackage.ACTIVITY_PARTITION__CONTAINED_EDGE:
				return ((InternalEList<?>)getContainedEdge()).basicRemove(otherEnd, msgs);
			case UmlPackage.ACTIVITY_PARTITION__CONTAINED_NODE:
				return ((InternalEList<?>)getContainedNode()).basicRemove(otherEnd, msgs);
			case UmlPackage.ACTIVITY_PARTITION__SUBGROUP:
				return ((InternalEList<?>)getSubgroup()).basicRemove(otherEnd, msgs);
			case UmlPackage.ACTIVITY_PARTITION__REPRESENTS:
				return ((InternalEList<?>)getRepresents()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.ACTIVITY_PARTITION__GROUP5:
				if (coreType) return getGroup5();
				return ((FeatureMap.Internal)getGroup5()).getWrapper();
			case UmlPackage.ACTIVITY_PARTITION__CONTAINED_EDGE:
				return getContainedEdge();
			case UmlPackage.ACTIVITY_PARTITION__CONTAINED_NODE:
				return getContainedNode();
			case UmlPackage.ACTIVITY_PARTITION__SUBGROUP:
				return getSubgroup();
			case UmlPackage.ACTIVITY_PARTITION__REPRESENTS:
				return getRepresents();
			case UmlPackage.ACTIVITY_PARTITION__CONTAINED_EDGE1:
				return getContainedEdge1();
			case UmlPackage.ACTIVITY_PARTITION__CONTAINED_NODE1:
				return getContainedNode1();
			case UmlPackage.ACTIVITY_PARTITION__IS_DIMENSION:
				return getIsDimension();
			case UmlPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
				return getIsExternal();
			case UmlPackage.ACTIVITY_PARTITION__REPRESENTS1:
				return getRepresents1();
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
			case UmlPackage.ACTIVITY_PARTITION__GROUP5:
				((FeatureMap.Internal)getGroup5()).set(newValue);
				return;
			case UmlPackage.ACTIVITY_PARTITION__CONTAINED_EDGE:
				getContainedEdge().clear();
				getContainedEdge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case UmlPackage.ACTIVITY_PARTITION__CONTAINED_NODE:
				getContainedNode().clear();
				getContainedNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case UmlPackage.ACTIVITY_PARTITION__SUBGROUP:
				getSubgroup().clear();
				getSubgroup().addAll((Collection<? extends ActivityPartition>)newValue);
				return;
			case UmlPackage.ACTIVITY_PARTITION__REPRESENTS:
				getRepresents().clear();
				getRepresents().addAll((Collection<? extends Element>)newValue);
				return;
			case UmlPackage.ACTIVITY_PARTITION__CONTAINED_EDGE1:
				setContainedEdge1((String)newValue);
				return;
			case UmlPackage.ACTIVITY_PARTITION__CONTAINED_NODE1:
				setContainedNode1((String)newValue);
				return;
			case UmlPackage.ACTIVITY_PARTITION__IS_DIMENSION:
				setIsDimension((String)newValue);
				return;
			case UmlPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
				setIsExternal((String)newValue);
				return;
			case UmlPackage.ACTIVITY_PARTITION__REPRESENTS1:
				setRepresents1((String)newValue);
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
			case UmlPackage.ACTIVITY_PARTITION__GROUP5:
				getGroup5().clear();
				return;
			case UmlPackage.ACTIVITY_PARTITION__CONTAINED_EDGE:
				getContainedEdge().clear();
				return;
			case UmlPackage.ACTIVITY_PARTITION__CONTAINED_NODE:
				getContainedNode().clear();
				return;
			case UmlPackage.ACTIVITY_PARTITION__SUBGROUP:
				getSubgroup().clear();
				return;
			case UmlPackage.ACTIVITY_PARTITION__REPRESENTS:
				getRepresents().clear();
				return;
			case UmlPackage.ACTIVITY_PARTITION__CONTAINED_EDGE1:
				setContainedEdge1(CONTAINED_EDGE1_EDEFAULT);
				return;
			case UmlPackage.ACTIVITY_PARTITION__CONTAINED_NODE1:
				setContainedNode1(CONTAINED_NODE1_EDEFAULT);
				return;
			case UmlPackage.ACTIVITY_PARTITION__IS_DIMENSION:
				setIsDimension(IS_DIMENSION_EDEFAULT);
				return;
			case UmlPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
				setIsExternal(IS_EXTERNAL_EDEFAULT);
				return;
			case UmlPackage.ACTIVITY_PARTITION__REPRESENTS1:
				setRepresents1(REPRESENTS1_EDEFAULT);
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
			case UmlPackage.ACTIVITY_PARTITION__GROUP5:
				return group5 != null && !group5.isEmpty();
			case UmlPackage.ACTIVITY_PARTITION__CONTAINED_EDGE:
				return !getContainedEdge().isEmpty();
			case UmlPackage.ACTIVITY_PARTITION__CONTAINED_NODE:
				return !getContainedNode().isEmpty();
			case UmlPackage.ACTIVITY_PARTITION__SUBGROUP:
				return !getSubgroup().isEmpty();
			case UmlPackage.ACTIVITY_PARTITION__REPRESENTS:
				return !getRepresents().isEmpty();
			case UmlPackage.ACTIVITY_PARTITION__CONTAINED_EDGE1:
				return CONTAINED_EDGE1_EDEFAULT == null ? containedEdge1 != null : !CONTAINED_EDGE1_EDEFAULT.equals(containedEdge1);
			case UmlPackage.ACTIVITY_PARTITION__CONTAINED_NODE1:
				return CONTAINED_NODE1_EDEFAULT == null ? containedNode1 != null : !CONTAINED_NODE1_EDEFAULT.equals(containedNode1);
			case UmlPackage.ACTIVITY_PARTITION__IS_DIMENSION:
				return IS_DIMENSION_EDEFAULT == null ? isDimension != null : !IS_DIMENSION_EDEFAULT.equals(isDimension);
			case UmlPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
				return IS_EXTERNAL_EDEFAULT == null ? isExternal != null : !IS_EXTERNAL_EDEFAULT.equals(isExternal);
			case UmlPackage.ACTIVITY_PARTITION__REPRESENTS1:
				return REPRESENTS1_EDEFAULT == null ? represents1 != null : !REPRESENTS1_EDEFAULT.equals(represents1);
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
		result.append(" (group5: ");
		result.append(group5);
		result.append(", containedEdge1: ");
		result.append(containedEdge1);
		result.append(", containedNode1: ");
		result.append(containedNode1);
		result.append(", isDimension: ");
		result.append(isDimension);
		result.append(", isExternal: ");
		result.append(isExternal);
		result.append(", represents1: ");
		result.append(represents1);
		result.append(')');
		return result.toString();
	}

} //ActivityPartitionImpl
