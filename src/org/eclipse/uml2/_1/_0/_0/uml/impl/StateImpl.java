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

import org.eclipse.uml2._1._0._0.uml.Activity;
import org.eclipse.uml2._1._0._0.uml.ConnectionPointReference;
import org.eclipse.uml2._1._0._0.uml.Constraint;
import org.eclipse.uml2._1._0._0.uml.Region;
import org.eclipse.uml2._1._0._0.uml.State;
import org.eclipse.uml2._1._0._0.uml.StateMachine;
import org.eclipse.uml2._1._0._0.uml.Transition;
import org.eclipse.uml2._1._0._0.uml.Trigger;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StateImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StateImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StateImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StateImpl#getSubmachine <em>Submachine</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StateImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StateImpl#getRedefinedState <em>Redefined State</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StateImpl#getDeferrableTrigger <em>Deferrable Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StateImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StateImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StateImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StateImpl#getDoActivity <em>Do Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StateImpl#getStateInvariant <em>State Invariant</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StateImpl#getDeferrableTrigger1 <em>Deferrable Trigger1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StateImpl#getIncoming1 <em>Incoming1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StateImpl#getIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StateImpl#getOutgoing1 <em>Outgoing1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StateImpl#getRedefinedState1 <em>Redefined State1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StateImpl#getSubmachine1 <em>Submachine1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends NamespaceImpl implements State
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
	 * The default value of the '{@link #getDeferrableTrigger1() <em>Deferrable Trigger1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferrableTrigger1()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFERRABLE_TRIGGER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeferrableTrigger1() <em>Deferrable Trigger1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferrableTrigger1()
	 * @generated
	 * @ordered
	 */
	protected String deferrableTrigger1 = DEFERRABLE_TRIGGER1_EDEFAULT;

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
	 * The default value of the '{@link #getRedefinedState1() <em>Redefined State1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedState1()
	 * @generated
	 * @ordered
	 */
	protected static final String REDEFINED_STATE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedefinedState1() <em>Redefined State1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedState1()
	 * @generated
	 * @ordered
	 */
	protected String redefinedState1 = REDEFINED_STATE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubmachine1() <em>Submachine1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmachine1()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBMACHINE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubmachine1() <em>Submachine1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmachine1()
	 * @generated
	 * @ordered
	 */
	protected String submachine1 = SUBMACHINE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl()
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
		return UmlPackage.eINSTANCE.getState();
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
			group6 = new BasicFeatureMap(this, UmlPackage.STATE__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoing()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getState_Outgoing());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncoming()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getState_Incoming());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine> getSubmachine()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getState_Submachine());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionPointReference> getConnection()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getState_Connection());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getRedefinedState()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getState_RedefinedState());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getDeferrableTrigger()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getState_DeferrableTrigger());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Region> getRegion()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getState_Region());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getEntry()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getState_Entry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getExit()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getState_Exit());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getDoActivity()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getState_DoActivity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getStateInvariant()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getState_StateInvariant());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeferrableTrigger1()
	{
		return deferrableTrigger1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeferrableTrigger1(String newDeferrableTrigger1)
	{
		String oldDeferrableTrigger1 = deferrableTrigger1;
		deferrableTrigger1 = newDeferrableTrigger1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.STATE__DEFERRABLE_TRIGGER1, oldDeferrableTrigger1, deferrableTrigger1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.STATE__INCOMING1, oldIncoming1, incoming1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.STATE__IS_LEAF, oldIsLeaf, isLeaf));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.STATE__OUTGOING1, oldOutgoing1, outgoing1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedefinedState1()
	{
		return redefinedState1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedState1(String newRedefinedState1)
	{
		String oldRedefinedState1 = redefinedState1;
		redefinedState1 = newRedefinedState1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.STATE__REDEFINED_STATE1, oldRedefinedState1, redefinedState1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubmachine1()
	{
		return submachine1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmachine1(String newSubmachine1)
	{
		String oldSubmachine1 = submachine1;
		submachine1 = newSubmachine1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.STATE__SUBMACHINE1, oldSubmachine1, submachine1));
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
			case UmlPackage.STATE__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.STATE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case UmlPackage.STATE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case UmlPackage.STATE__SUBMACHINE:
				return ((InternalEList<?>)getSubmachine()).basicRemove(otherEnd, msgs);
			case UmlPackage.STATE__CONNECTION:
				return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
			case UmlPackage.STATE__REDEFINED_STATE:
				return ((InternalEList<?>)getRedefinedState()).basicRemove(otherEnd, msgs);
			case UmlPackage.STATE__DEFERRABLE_TRIGGER:
				return ((InternalEList<?>)getDeferrableTrigger()).basicRemove(otherEnd, msgs);
			case UmlPackage.STATE__REGION:
				return ((InternalEList<?>)getRegion()).basicRemove(otherEnd, msgs);
			case UmlPackage.STATE__ENTRY:
				return ((InternalEList<?>)getEntry()).basicRemove(otherEnd, msgs);
			case UmlPackage.STATE__EXIT:
				return ((InternalEList<?>)getExit()).basicRemove(otherEnd, msgs);
			case UmlPackage.STATE__DO_ACTIVITY:
				return ((InternalEList<?>)getDoActivity()).basicRemove(otherEnd, msgs);
			case UmlPackage.STATE__STATE_INVARIANT:
				return ((InternalEList<?>)getStateInvariant()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.STATE__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.STATE__OUTGOING:
				return getOutgoing();
			case UmlPackage.STATE__INCOMING:
				return getIncoming();
			case UmlPackage.STATE__SUBMACHINE:
				return getSubmachine();
			case UmlPackage.STATE__CONNECTION:
				return getConnection();
			case UmlPackage.STATE__REDEFINED_STATE:
				return getRedefinedState();
			case UmlPackage.STATE__DEFERRABLE_TRIGGER:
				return getDeferrableTrigger();
			case UmlPackage.STATE__REGION:
				return getRegion();
			case UmlPackage.STATE__ENTRY:
				return getEntry();
			case UmlPackage.STATE__EXIT:
				return getExit();
			case UmlPackage.STATE__DO_ACTIVITY:
				return getDoActivity();
			case UmlPackage.STATE__STATE_INVARIANT:
				return getStateInvariant();
			case UmlPackage.STATE__DEFERRABLE_TRIGGER1:
				return getDeferrableTrigger1();
			case UmlPackage.STATE__INCOMING1:
				return getIncoming1();
			case UmlPackage.STATE__IS_LEAF:
				return getIsLeaf();
			case UmlPackage.STATE__OUTGOING1:
				return getOutgoing1();
			case UmlPackage.STATE__REDEFINED_STATE1:
				return getRedefinedState1();
			case UmlPackage.STATE__SUBMACHINE1:
				return getSubmachine1();
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
			case UmlPackage.STATE__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.STATE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Transition>)newValue);
				return;
			case UmlPackage.STATE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Transition>)newValue);
				return;
			case UmlPackage.STATE__SUBMACHINE:
				getSubmachine().clear();
				getSubmachine().addAll((Collection<? extends StateMachine>)newValue);
				return;
			case UmlPackage.STATE__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends ConnectionPointReference>)newValue);
				return;
			case UmlPackage.STATE__REDEFINED_STATE:
				getRedefinedState().clear();
				getRedefinedState().addAll((Collection<? extends State>)newValue);
				return;
			case UmlPackage.STATE__DEFERRABLE_TRIGGER:
				getDeferrableTrigger().clear();
				getDeferrableTrigger().addAll((Collection<? extends Trigger>)newValue);
				return;
			case UmlPackage.STATE__REGION:
				getRegion().clear();
				getRegion().addAll((Collection<? extends Region>)newValue);
				return;
			case UmlPackage.STATE__ENTRY:
				getEntry().clear();
				getEntry().addAll((Collection<? extends Activity>)newValue);
				return;
			case UmlPackage.STATE__EXIT:
				getExit().clear();
				getExit().addAll((Collection<? extends Activity>)newValue);
				return;
			case UmlPackage.STATE__DO_ACTIVITY:
				getDoActivity().clear();
				getDoActivity().addAll((Collection<? extends Activity>)newValue);
				return;
			case UmlPackage.STATE__STATE_INVARIANT:
				getStateInvariant().clear();
				getStateInvariant().addAll((Collection<? extends Constraint>)newValue);
				return;
			case UmlPackage.STATE__DEFERRABLE_TRIGGER1:
				setDeferrableTrigger1((String)newValue);
				return;
			case UmlPackage.STATE__INCOMING1:
				setIncoming1((String)newValue);
				return;
			case UmlPackage.STATE__IS_LEAF:
				setIsLeaf((String)newValue);
				return;
			case UmlPackage.STATE__OUTGOING1:
				setOutgoing1((String)newValue);
				return;
			case UmlPackage.STATE__REDEFINED_STATE1:
				setRedefinedState1((String)newValue);
				return;
			case UmlPackage.STATE__SUBMACHINE1:
				setSubmachine1((String)newValue);
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
			case UmlPackage.STATE__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.STATE__OUTGOING:
				getOutgoing().clear();
				return;
			case UmlPackage.STATE__INCOMING:
				getIncoming().clear();
				return;
			case UmlPackage.STATE__SUBMACHINE:
				getSubmachine().clear();
				return;
			case UmlPackage.STATE__CONNECTION:
				getConnection().clear();
				return;
			case UmlPackage.STATE__REDEFINED_STATE:
				getRedefinedState().clear();
				return;
			case UmlPackage.STATE__DEFERRABLE_TRIGGER:
				getDeferrableTrigger().clear();
				return;
			case UmlPackage.STATE__REGION:
				getRegion().clear();
				return;
			case UmlPackage.STATE__ENTRY:
				getEntry().clear();
				return;
			case UmlPackage.STATE__EXIT:
				getExit().clear();
				return;
			case UmlPackage.STATE__DO_ACTIVITY:
				getDoActivity().clear();
				return;
			case UmlPackage.STATE__STATE_INVARIANT:
				getStateInvariant().clear();
				return;
			case UmlPackage.STATE__DEFERRABLE_TRIGGER1:
				setDeferrableTrigger1(DEFERRABLE_TRIGGER1_EDEFAULT);
				return;
			case UmlPackage.STATE__INCOMING1:
				setIncoming1(INCOMING1_EDEFAULT);
				return;
			case UmlPackage.STATE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UmlPackage.STATE__OUTGOING1:
				setOutgoing1(OUTGOING1_EDEFAULT);
				return;
			case UmlPackage.STATE__REDEFINED_STATE1:
				setRedefinedState1(REDEFINED_STATE1_EDEFAULT);
				return;
			case UmlPackage.STATE__SUBMACHINE1:
				setSubmachine1(SUBMACHINE1_EDEFAULT);
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
			case UmlPackage.STATE__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.STATE__OUTGOING:
				return !getOutgoing().isEmpty();
			case UmlPackage.STATE__INCOMING:
				return !getIncoming().isEmpty();
			case UmlPackage.STATE__SUBMACHINE:
				return !getSubmachine().isEmpty();
			case UmlPackage.STATE__CONNECTION:
				return !getConnection().isEmpty();
			case UmlPackage.STATE__REDEFINED_STATE:
				return !getRedefinedState().isEmpty();
			case UmlPackage.STATE__DEFERRABLE_TRIGGER:
				return !getDeferrableTrigger().isEmpty();
			case UmlPackage.STATE__REGION:
				return !getRegion().isEmpty();
			case UmlPackage.STATE__ENTRY:
				return !getEntry().isEmpty();
			case UmlPackage.STATE__EXIT:
				return !getExit().isEmpty();
			case UmlPackage.STATE__DO_ACTIVITY:
				return !getDoActivity().isEmpty();
			case UmlPackage.STATE__STATE_INVARIANT:
				return !getStateInvariant().isEmpty();
			case UmlPackage.STATE__DEFERRABLE_TRIGGER1:
				return DEFERRABLE_TRIGGER1_EDEFAULT == null ? deferrableTrigger1 != null : !DEFERRABLE_TRIGGER1_EDEFAULT.equals(deferrableTrigger1);
			case UmlPackage.STATE__INCOMING1:
				return INCOMING1_EDEFAULT == null ? incoming1 != null : !INCOMING1_EDEFAULT.equals(incoming1);
			case UmlPackage.STATE__IS_LEAF:
				return IS_LEAF_EDEFAULT == null ? isLeaf != null : !IS_LEAF_EDEFAULT.equals(isLeaf);
			case UmlPackage.STATE__OUTGOING1:
				return OUTGOING1_EDEFAULT == null ? outgoing1 != null : !OUTGOING1_EDEFAULT.equals(outgoing1);
			case UmlPackage.STATE__REDEFINED_STATE1:
				return REDEFINED_STATE1_EDEFAULT == null ? redefinedState1 != null : !REDEFINED_STATE1_EDEFAULT.equals(redefinedState1);
			case UmlPackage.STATE__SUBMACHINE1:
				return SUBMACHINE1_EDEFAULT == null ? submachine1 != null : !SUBMACHINE1_EDEFAULT.equals(submachine1);
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
		result.append(", deferrableTrigger1: ");
		result.append(deferrableTrigger1);
		result.append(", incoming1: ");
		result.append(incoming1);
		result.append(", isLeaf: ");
		result.append(isLeaf);
		result.append(", outgoing1: ");
		result.append(outgoing1);
		result.append(", redefinedState1: ");
		result.append(redefinedState1);
		result.append(", submachine1: ");
		result.append(submachine1);
		result.append(')');
		return result.toString();
	}

} //StateImpl
