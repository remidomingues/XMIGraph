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
import org.eclipse.uml2._1._0._0.uml.InterruptibleActivityRegion;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityEdgeImpl#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityEdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityEdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityEdgeImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityEdgeImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityEdgeImpl#getInPartition <em>In Partition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityEdgeImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityEdgeImpl#getInterrupts <em>Interrupts</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityEdgeImpl#getInPartition1 <em>In Partition1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityEdgeImpl#getInterrupts1 <em>Interrupts1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityEdgeImpl#getRedefinedElement1 <em>Redefined Element1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityEdgeImpl#getSource1 <em>Source1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityEdgeImpl#getTarget1 <em>Target1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityEdgeImpl extends RedefinableElementImpl implements ActivityEdge
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
	 * The default value of the '{@link #getInPartition1() <em>In Partition1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPartition1()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_PARTITION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInPartition1() <em>In Partition1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPartition1()
	 * @generated
	 * @ordered
	 */
	protected String inPartition1 = IN_PARTITION1_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterrupts1() <em>Interrupts1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterrupts1()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERRUPTS1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterrupts1() <em>Interrupts1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterrupts1()
	 * @generated
	 * @ordered
	 */
	protected String interrupts1 = INTERRUPTS1_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedefinedElement1() <em>Redefined Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElement1()
	 * @generated
	 * @ordered
	 */
	protected static final String REDEFINED_ELEMENT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedefinedElement1() <em>Redefined Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElement1()
	 * @generated
	 * @ordered
	 */
	protected String redefinedElement1 = REDEFINED_ELEMENT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource1() <em>Source1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource1()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource1() <em>Source1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource1()
	 * @generated
	 * @ordered
	 */
	protected String source1 = SOURCE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget1() <em>Target1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget1()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget1() <em>Target1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget1()
	 * @generated
	 * @ordered
	 */
	protected String target1 = TARGET1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityEdgeImpl()
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
		return UmlPackage.eINSTANCE.getActivityEdge();
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
			group5 = new BasicFeatureMap(this, UmlPackage.ACTIVITY_EDGE__GROUP5);
		}
		return group5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getSource()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getActivityEdge_Source());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getTarget()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getActivityEdge_Target());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getGuard()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getActivityEdge_Guard());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getRedefinedElement()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getActivityEdge_RedefinedElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityPartition> getInPartition()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getActivityEdge_InPartition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getWeight()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getActivityEdge_Weight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterruptibleActivityRegion> getInterrupts()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getActivityEdge_Interrupts());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInPartition1()
	{
		return inPartition1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInPartition1(String newInPartition1)
	{
		String oldInPartition1 = inPartition1;
		inPartition1 = newInPartition1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY_EDGE__IN_PARTITION1, oldInPartition1, inPartition1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterrupts1()
	{
		return interrupts1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterrupts1(String newInterrupts1)
	{
		String oldInterrupts1 = interrupts1;
		interrupts1 = newInterrupts1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY_EDGE__INTERRUPTS1, oldInterrupts1, interrupts1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedefinedElement1()
	{
		return redefinedElement1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedElement1(String newRedefinedElement1)
	{
		String oldRedefinedElement1 = redefinedElement1;
		redefinedElement1 = newRedefinedElement1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY_EDGE__REDEFINED_ELEMENT1, oldRedefinedElement1, redefinedElement1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource1()
	{
		return source1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource1(String newSource1)
	{
		String oldSource1 = source1;
		source1 = newSource1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY_EDGE__SOURCE1, oldSource1, source1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget1()
	{
		return target1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget1(String newTarget1)
	{
		String oldTarget1 = target1;
		target1 = newTarget1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY_EDGE__TARGET1, oldTarget1, target1));
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
			case UmlPackage.ACTIVITY_EDGE__GROUP5:
				return ((InternalEList<?>)getGroup5()).basicRemove(otherEnd, msgs);
			case UmlPackage.ACTIVITY_EDGE__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case UmlPackage.ACTIVITY_EDGE__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case UmlPackage.ACTIVITY_EDGE__GUARD:
				return ((InternalEList<?>)getGuard()).basicRemove(otherEnd, msgs);
			case UmlPackage.ACTIVITY_EDGE__REDEFINED_ELEMENT:
				return ((InternalEList<?>)getRedefinedElement()).basicRemove(otherEnd, msgs);
			case UmlPackage.ACTIVITY_EDGE__IN_PARTITION:
				return ((InternalEList<?>)getInPartition()).basicRemove(otherEnd, msgs);
			case UmlPackage.ACTIVITY_EDGE__WEIGHT:
				return ((InternalEList<?>)getWeight()).basicRemove(otherEnd, msgs);
			case UmlPackage.ACTIVITY_EDGE__INTERRUPTS:
				return ((InternalEList<?>)getInterrupts()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.ACTIVITY_EDGE__GROUP5:
				if (coreType) return getGroup5();
				return ((FeatureMap.Internal)getGroup5()).getWrapper();
			case UmlPackage.ACTIVITY_EDGE__SOURCE:
				return getSource();
			case UmlPackage.ACTIVITY_EDGE__TARGET:
				return getTarget();
			case UmlPackage.ACTIVITY_EDGE__GUARD:
				return getGuard();
			case UmlPackage.ACTIVITY_EDGE__REDEFINED_ELEMENT:
				return getRedefinedElement();
			case UmlPackage.ACTIVITY_EDGE__IN_PARTITION:
				return getInPartition();
			case UmlPackage.ACTIVITY_EDGE__WEIGHT:
				return getWeight();
			case UmlPackage.ACTIVITY_EDGE__INTERRUPTS:
				return getInterrupts();
			case UmlPackage.ACTIVITY_EDGE__IN_PARTITION1:
				return getInPartition1();
			case UmlPackage.ACTIVITY_EDGE__INTERRUPTS1:
				return getInterrupts1();
			case UmlPackage.ACTIVITY_EDGE__REDEFINED_ELEMENT1:
				return getRedefinedElement1();
			case UmlPackage.ACTIVITY_EDGE__SOURCE1:
				return getSource1();
			case UmlPackage.ACTIVITY_EDGE__TARGET1:
				return getTarget1();
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
			case UmlPackage.ACTIVITY_EDGE__GROUP5:
				((FeatureMap.Internal)getGroup5()).set(newValue);
				return;
			case UmlPackage.ACTIVITY_EDGE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case UmlPackage.ACTIVITY_EDGE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case UmlPackage.ACTIVITY_EDGE__GUARD:
				getGuard().clear();
				getGuard().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UmlPackage.ACTIVITY_EDGE__REDEFINED_ELEMENT:
				getRedefinedElement().clear();
				getRedefinedElement().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case UmlPackage.ACTIVITY_EDGE__IN_PARTITION:
				getInPartition().clear();
				getInPartition().addAll((Collection<? extends ActivityPartition>)newValue);
				return;
			case UmlPackage.ACTIVITY_EDGE__WEIGHT:
				getWeight().clear();
				getWeight().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UmlPackage.ACTIVITY_EDGE__INTERRUPTS:
				getInterrupts().clear();
				getInterrupts().addAll((Collection<? extends InterruptibleActivityRegion>)newValue);
				return;
			case UmlPackage.ACTIVITY_EDGE__IN_PARTITION1:
				setInPartition1((String)newValue);
				return;
			case UmlPackage.ACTIVITY_EDGE__INTERRUPTS1:
				setInterrupts1((String)newValue);
				return;
			case UmlPackage.ACTIVITY_EDGE__REDEFINED_ELEMENT1:
				setRedefinedElement1((String)newValue);
				return;
			case UmlPackage.ACTIVITY_EDGE__SOURCE1:
				setSource1((String)newValue);
				return;
			case UmlPackage.ACTIVITY_EDGE__TARGET1:
				setTarget1((String)newValue);
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
			case UmlPackage.ACTIVITY_EDGE__GROUP5:
				getGroup5().clear();
				return;
			case UmlPackage.ACTIVITY_EDGE__SOURCE:
				getSource().clear();
				return;
			case UmlPackage.ACTIVITY_EDGE__TARGET:
				getTarget().clear();
				return;
			case UmlPackage.ACTIVITY_EDGE__GUARD:
				getGuard().clear();
				return;
			case UmlPackage.ACTIVITY_EDGE__REDEFINED_ELEMENT:
				getRedefinedElement().clear();
				return;
			case UmlPackage.ACTIVITY_EDGE__IN_PARTITION:
				getInPartition().clear();
				return;
			case UmlPackage.ACTIVITY_EDGE__WEIGHT:
				getWeight().clear();
				return;
			case UmlPackage.ACTIVITY_EDGE__INTERRUPTS:
				getInterrupts().clear();
				return;
			case UmlPackage.ACTIVITY_EDGE__IN_PARTITION1:
				setInPartition1(IN_PARTITION1_EDEFAULT);
				return;
			case UmlPackage.ACTIVITY_EDGE__INTERRUPTS1:
				setInterrupts1(INTERRUPTS1_EDEFAULT);
				return;
			case UmlPackage.ACTIVITY_EDGE__REDEFINED_ELEMENT1:
				setRedefinedElement1(REDEFINED_ELEMENT1_EDEFAULT);
				return;
			case UmlPackage.ACTIVITY_EDGE__SOURCE1:
				setSource1(SOURCE1_EDEFAULT);
				return;
			case UmlPackage.ACTIVITY_EDGE__TARGET1:
				setTarget1(TARGET1_EDEFAULT);
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
			case UmlPackage.ACTIVITY_EDGE__GROUP5:
				return group5 != null && !group5.isEmpty();
			case UmlPackage.ACTIVITY_EDGE__SOURCE:
				return !getSource().isEmpty();
			case UmlPackage.ACTIVITY_EDGE__TARGET:
				return !getTarget().isEmpty();
			case UmlPackage.ACTIVITY_EDGE__GUARD:
				return !getGuard().isEmpty();
			case UmlPackage.ACTIVITY_EDGE__REDEFINED_ELEMENT:
				return !getRedefinedElement().isEmpty();
			case UmlPackage.ACTIVITY_EDGE__IN_PARTITION:
				return !getInPartition().isEmpty();
			case UmlPackage.ACTIVITY_EDGE__WEIGHT:
				return !getWeight().isEmpty();
			case UmlPackage.ACTIVITY_EDGE__INTERRUPTS:
				return !getInterrupts().isEmpty();
			case UmlPackage.ACTIVITY_EDGE__IN_PARTITION1:
				return IN_PARTITION1_EDEFAULT == null ? inPartition1 != null : !IN_PARTITION1_EDEFAULT.equals(inPartition1);
			case UmlPackage.ACTIVITY_EDGE__INTERRUPTS1:
				return INTERRUPTS1_EDEFAULT == null ? interrupts1 != null : !INTERRUPTS1_EDEFAULT.equals(interrupts1);
			case UmlPackage.ACTIVITY_EDGE__REDEFINED_ELEMENT1:
				return REDEFINED_ELEMENT1_EDEFAULT == null ? redefinedElement1 != null : !REDEFINED_ELEMENT1_EDEFAULT.equals(redefinedElement1);
			case UmlPackage.ACTIVITY_EDGE__SOURCE1:
				return SOURCE1_EDEFAULT == null ? source1 != null : !SOURCE1_EDEFAULT.equals(source1);
			case UmlPackage.ACTIVITY_EDGE__TARGET1:
				return TARGET1_EDEFAULT == null ? target1 != null : !TARGET1_EDEFAULT.equals(target1);
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
		result.append(", inPartition1: ");
		result.append(inPartition1);
		result.append(", interrupts1: ");
		result.append(interrupts1);
		result.append(", redefinedElement1: ");
		result.append(redefinedElement1);
		result.append(", source1: ");
		result.append(source1);
		result.append(", target1: ");
		result.append(target1);
		result.append(')');
		return result.toString();
	}

} //ActivityEdgeImpl
