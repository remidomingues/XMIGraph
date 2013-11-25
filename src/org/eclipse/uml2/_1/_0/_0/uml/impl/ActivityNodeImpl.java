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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityNodeImpl#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityNodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityNodeImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityNodeImpl#getInPartition <em>In Partition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityNodeImpl#getInInterruptibleRegion <em>In Interruptible Region</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityNodeImpl#getIncoming1 <em>Incoming1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityNodeImpl#getInInterruptibleRegion1 <em>In Interruptible Region1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityNodeImpl#getInPartition1 <em>In Partition1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityNodeImpl#getOutgoing1 <em>Outgoing1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityNodeImpl#getRedefinedElement1 <em>Redefined Element1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityNodeImpl extends RedefinableElementImpl implements ActivityNode
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
	 * The default value of the '{@link #getIncoming1() <em>Incoming1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming1()
	 * @generated
	 * @ordered
	 */
	protected static final String INCOMING1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncoming1() <em>Incoming1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming1()
	 * @generated
	 * @ordered
	 */
	protected String incoming1 = INCOMING1_EDEFAULT;

	/**
	 * The default value of the '{@link #getInInterruptibleRegion1() <em>In Interruptible Region1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInInterruptibleRegion1()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_INTERRUPTIBLE_REGION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInInterruptibleRegion1() <em>In Interruptible Region1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInInterruptibleRegion1()
	 * @generated
	 * @ordered
	 */
	protected String inInterruptibleRegion1 = IN_INTERRUPTIBLE_REGION1_EDEFAULT;

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
	 * The default value of the '{@link #getOutgoing1() <em>Outgoing1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing1()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTGOING1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutgoing1() <em>Outgoing1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing1()
	 * @generated
	 * @ordered
	 */
	protected String outgoing1 = OUTGOING1_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityNodeImpl()
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
		return UmlPackage.eINSTANCE.getActivityNode();
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
			group5 = new BasicFeatureMap(this, UmlPackage.ACTIVITY_NODE__GROUP5);
		}
		return group5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getOutgoing()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getActivityNode_Outgoing());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getIncoming()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getActivityNode_Incoming());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getRedefinedElement()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getActivityNode_RedefinedElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityPartition> getInPartition()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getActivityNode_InPartition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterruptibleActivityRegion> getInInterruptibleRegion()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getActivityNode_InInterruptibleRegion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncoming1()
	{
		return incoming1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncoming1(String newIncoming1)
	{
		String oldIncoming1 = incoming1;
		incoming1 = newIncoming1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY_NODE__INCOMING1, oldIncoming1, incoming1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInInterruptibleRegion1()
	{
		return inInterruptibleRegion1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInInterruptibleRegion1(String newInInterruptibleRegion1)
	{
		String oldInInterruptibleRegion1 = inInterruptibleRegion1;
		inInterruptibleRegion1 = newInInterruptibleRegion1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION1, oldInInterruptibleRegion1, inInterruptibleRegion1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY_NODE__IN_PARTITION1, oldInPartition1, inPartition1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutgoing1()
	{
		return outgoing1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoing1(String newOutgoing1)
	{
		String oldOutgoing1 = outgoing1;
		outgoing1 = newOutgoing1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY_NODE__OUTGOING1, oldOutgoing1, outgoing1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY_NODE__REDEFINED_ELEMENT1, oldRedefinedElement1, redefinedElement1));
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
			case UmlPackage.ACTIVITY_NODE__GROUP5:
				return ((InternalEList<?>)getGroup5()).basicRemove(otherEnd, msgs);
			case UmlPackage.ACTIVITY_NODE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case UmlPackage.ACTIVITY_NODE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case UmlPackage.ACTIVITY_NODE__REDEFINED_ELEMENT:
				return ((InternalEList<?>)getRedefinedElement()).basicRemove(otherEnd, msgs);
			case UmlPackage.ACTIVITY_NODE__IN_PARTITION:
				return ((InternalEList<?>)getInPartition()).basicRemove(otherEnd, msgs);
			case UmlPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				return ((InternalEList<?>)getInInterruptibleRegion()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.ACTIVITY_NODE__GROUP5:
				if (coreType) return getGroup5();
				return ((FeatureMap.Internal)getGroup5()).getWrapper();
			case UmlPackage.ACTIVITY_NODE__OUTGOING:
				return getOutgoing();
			case UmlPackage.ACTIVITY_NODE__INCOMING:
				return getIncoming();
			case UmlPackage.ACTIVITY_NODE__REDEFINED_ELEMENT:
				return getRedefinedElement();
			case UmlPackage.ACTIVITY_NODE__IN_PARTITION:
				return getInPartition();
			case UmlPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegion();
			case UmlPackage.ACTIVITY_NODE__INCOMING1:
				return getIncoming1();
			case UmlPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION1:
				return getInInterruptibleRegion1();
			case UmlPackage.ACTIVITY_NODE__IN_PARTITION1:
				return getInPartition1();
			case UmlPackage.ACTIVITY_NODE__OUTGOING1:
				return getOutgoing1();
			case UmlPackage.ACTIVITY_NODE__REDEFINED_ELEMENT1:
				return getRedefinedElement1();
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
			case UmlPackage.ACTIVITY_NODE__GROUP5:
				((FeatureMap.Internal)getGroup5()).set(newValue);
				return;
			case UmlPackage.ACTIVITY_NODE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case UmlPackage.ACTIVITY_NODE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case UmlPackage.ACTIVITY_NODE__REDEFINED_ELEMENT:
				getRedefinedElement().clear();
				getRedefinedElement().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case UmlPackage.ACTIVITY_NODE__IN_PARTITION:
				getInPartition().clear();
				getInPartition().addAll((Collection<? extends ActivityPartition>)newValue);
				return;
			case UmlPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegion().clear();
				getInInterruptibleRegion().addAll((Collection<? extends InterruptibleActivityRegion>)newValue);
				return;
			case UmlPackage.ACTIVITY_NODE__INCOMING1:
				setIncoming1((String)newValue);
				return;
			case UmlPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION1:
				setInInterruptibleRegion1((String)newValue);
				return;
			case UmlPackage.ACTIVITY_NODE__IN_PARTITION1:
				setInPartition1((String)newValue);
				return;
			case UmlPackage.ACTIVITY_NODE__OUTGOING1:
				setOutgoing1((String)newValue);
				return;
			case UmlPackage.ACTIVITY_NODE__REDEFINED_ELEMENT1:
				setRedefinedElement1((String)newValue);
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
			case UmlPackage.ACTIVITY_NODE__GROUP5:
				getGroup5().clear();
				return;
			case UmlPackage.ACTIVITY_NODE__OUTGOING:
				getOutgoing().clear();
				return;
			case UmlPackage.ACTIVITY_NODE__INCOMING:
				getIncoming().clear();
				return;
			case UmlPackage.ACTIVITY_NODE__REDEFINED_ELEMENT:
				getRedefinedElement().clear();
				return;
			case UmlPackage.ACTIVITY_NODE__IN_PARTITION:
				getInPartition().clear();
				return;
			case UmlPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegion().clear();
				return;
			case UmlPackage.ACTIVITY_NODE__INCOMING1:
				setIncoming1(INCOMING1_EDEFAULT);
				return;
			case UmlPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION1:
				setInInterruptibleRegion1(IN_INTERRUPTIBLE_REGION1_EDEFAULT);
				return;
			case UmlPackage.ACTIVITY_NODE__IN_PARTITION1:
				setInPartition1(IN_PARTITION1_EDEFAULT);
				return;
			case UmlPackage.ACTIVITY_NODE__OUTGOING1:
				setOutgoing1(OUTGOING1_EDEFAULT);
				return;
			case UmlPackage.ACTIVITY_NODE__REDEFINED_ELEMENT1:
				setRedefinedElement1(REDEFINED_ELEMENT1_EDEFAULT);
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
			case UmlPackage.ACTIVITY_NODE__GROUP5:
				return group5 != null && !group5.isEmpty();
			case UmlPackage.ACTIVITY_NODE__OUTGOING:
				return !getOutgoing().isEmpty();
			case UmlPackage.ACTIVITY_NODE__INCOMING:
				return !getIncoming().isEmpty();
			case UmlPackage.ACTIVITY_NODE__REDEFINED_ELEMENT:
				return !getRedefinedElement().isEmpty();
			case UmlPackage.ACTIVITY_NODE__IN_PARTITION:
				return !getInPartition().isEmpty();
			case UmlPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				return !getInInterruptibleRegion().isEmpty();
			case UmlPackage.ACTIVITY_NODE__INCOMING1:
				return INCOMING1_EDEFAULT == null ? incoming1 != null : !INCOMING1_EDEFAULT.equals(incoming1);
			case UmlPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION1:
				return IN_INTERRUPTIBLE_REGION1_EDEFAULT == null ? inInterruptibleRegion1 != null : !IN_INTERRUPTIBLE_REGION1_EDEFAULT.equals(inInterruptibleRegion1);
			case UmlPackage.ACTIVITY_NODE__IN_PARTITION1:
				return IN_PARTITION1_EDEFAULT == null ? inPartition1 != null : !IN_PARTITION1_EDEFAULT.equals(inPartition1);
			case UmlPackage.ACTIVITY_NODE__OUTGOING1:
				return OUTGOING1_EDEFAULT == null ? outgoing1 != null : !OUTGOING1_EDEFAULT.equals(outgoing1);
			case UmlPackage.ACTIVITY_NODE__REDEFINED_ELEMENT1:
				return REDEFINED_ELEMENT1_EDEFAULT == null ? redefinedElement1 != null : !REDEFINED_ELEMENT1_EDEFAULT.equals(redefinedElement1);
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
		result.append(", incoming1: ");
		result.append(incoming1);
		result.append(", inInterruptibleRegion1: ");
		result.append(inInterruptibleRegion1);
		result.append(", inPartition1: ");
		result.append(inPartition1);
		result.append(", outgoing1: ");
		result.append(outgoing1);
		result.append(", redefinedElement1: ");
		result.append(redefinedElement1);
		result.append(')');
		return result.toString();
	}

} //ActivityNodeImpl
