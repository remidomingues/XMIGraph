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
import org.eclipse.uml2._1._0._0.uml.Constraint;
import org.eclipse.uml2._1._0._0.uml.Transition;
import org.eclipse.uml2._1._0._0.uml.TransitionKind;
import org.eclipse.uml2._1._0._0.uml.Trigger;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TransitionImpl#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TransitionImpl#getRedefinedTransition <em>Redefined Transition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TransitionImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TransitionImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TransitionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TransitionImpl#getRedefinedTransition1 <em>Redefined Transition1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TransitionImpl#getSource1 <em>Source1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TransitionImpl#getTarget1 <em>Target1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TransitionImpl#getTrigger1 <em>Trigger1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends RedefinableElementImpl implements Transition
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
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final TransitionKind KIND_EDEFAULT = TransitionKind.INTERNAL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected TransitionKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The default value of the '{@link #getRedefinedTransition1() <em>Redefined Transition1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedTransition1()
	 * @generated
	 * @ordered
	 */
	protected static final String REDEFINED_TRANSITION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedefinedTransition1() <em>Redefined Transition1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedTransition1()
	 * @generated
	 * @ordered
	 */
	protected String redefinedTransition1 = REDEFINED_TRANSITION1_EDEFAULT;

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
	 * The default value of the '{@link #getTrigger1() <em>Trigger1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger1()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrigger1() <em>Trigger1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger1()
	 * @generated
	 * @ordered
	 */
	protected String trigger1 = TRIGGER1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl()
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
		return UmlPackage.eINSTANCE.getTransition();
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
			group5 = new BasicFeatureMap(this, UmlPackage.TRANSITION__GROUP5);
		}
		return group5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vertex> getSource()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getTransition_Source());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vertex> getTarget()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getTransition_Target());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getRedefinedTransition()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getTransition_RedefinedTransition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getTrigger()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getTransition_Trigger());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getGuard()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getTransition_Guard());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getEffect()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getTransition_Effect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionKind getKind()
	{
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(TransitionKind newKind)
	{
		TransitionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		boolean oldKindESet = kindESet;
		kindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TRANSITION__KIND, oldKind, kind, !oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKind()
	{
		TransitionKind oldKind = kind;
		boolean oldKindESet = kindESet;
		kind = KIND_EDEFAULT;
		kindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.TRANSITION__KIND, oldKind, KIND_EDEFAULT, oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKind()
	{
		return kindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedefinedTransition1()
	{
		return redefinedTransition1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedTransition1(String newRedefinedTransition1)
	{
		String oldRedefinedTransition1 = redefinedTransition1;
		redefinedTransition1 = newRedefinedTransition1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TRANSITION__REDEFINED_TRANSITION1, oldRedefinedTransition1, redefinedTransition1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TRANSITION__SOURCE1, oldSource1, source1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TRANSITION__TARGET1, oldTarget1, target1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrigger1()
	{
		return trigger1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger1(String newTrigger1)
	{
		String oldTrigger1 = trigger1;
		trigger1 = newTrigger1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TRANSITION__TRIGGER1, oldTrigger1, trigger1));
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
			case UmlPackage.TRANSITION__GROUP5:
				return ((InternalEList<?>)getGroup5()).basicRemove(otherEnd, msgs);
			case UmlPackage.TRANSITION__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case UmlPackage.TRANSITION__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case UmlPackage.TRANSITION__REDEFINED_TRANSITION:
				return ((InternalEList<?>)getRedefinedTransition()).basicRemove(otherEnd, msgs);
			case UmlPackage.TRANSITION__TRIGGER:
				return ((InternalEList<?>)getTrigger()).basicRemove(otherEnd, msgs);
			case UmlPackage.TRANSITION__GUARD:
				return ((InternalEList<?>)getGuard()).basicRemove(otherEnd, msgs);
			case UmlPackage.TRANSITION__EFFECT:
				return ((InternalEList<?>)getEffect()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.TRANSITION__GROUP5:
				if (coreType) return getGroup5();
				return ((FeatureMap.Internal)getGroup5()).getWrapper();
			case UmlPackage.TRANSITION__SOURCE:
				return getSource();
			case UmlPackage.TRANSITION__TARGET:
				return getTarget();
			case UmlPackage.TRANSITION__REDEFINED_TRANSITION:
				return getRedefinedTransition();
			case UmlPackage.TRANSITION__TRIGGER:
				return getTrigger();
			case UmlPackage.TRANSITION__GUARD:
				return getGuard();
			case UmlPackage.TRANSITION__EFFECT:
				return getEffect();
			case UmlPackage.TRANSITION__KIND:
				return getKind();
			case UmlPackage.TRANSITION__REDEFINED_TRANSITION1:
				return getRedefinedTransition1();
			case UmlPackage.TRANSITION__SOURCE1:
				return getSource1();
			case UmlPackage.TRANSITION__TARGET1:
				return getTarget1();
			case UmlPackage.TRANSITION__TRIGGER1:
				return getTrigger1();
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
			case UmlPackage.TRANSITION__GROUP5:
				((FeatureMap.Internal)getGroup5()).set(newValue);
				return;
			case UmlPackage.TRANSITION__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Vertex>)newValue);
				return;
			case UmlPackage.TRANSITION__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Vertex>)newValue);
				return;
			case UmlPackage.TRANSITION__REDEFINED_TRANSITION:
				getRedefinedTransition().clear();
				getRedefinedTransition().addAll((Collection<? extends Transition>)newValue);
				return;
			case UmlPackage.TRANSITION__TRIGGER:
				getTrigger().clear();
				getTrigger().addAll((Collection<? extends Trigger>)newValue);
				return;
			case UmlPackage.TRANSITION__GUARD:
				getGuard().clear();
				getGuard().addAll((Collection<? extends Constraint>)newValue);
				return;
			case UmlPackage.TRANSITION__EFFECT:
				getEffect().clear();
				getEffect().addAll((Collection<? extends Activity>)newValue);
				return;
			case UmlPackage.TRANSITION__KIND:
				setKind((TransitionKind)newValue);
				return;
			case UmlPackage.TRANSITION__REDEFINED_TRANSITION1:
				setRedefinedTransition1((String)newValue);
				return;
			case UmlPackage.TRANSITION__SOURCE1:
				setSource1((String)newValue);
				return;
			case UmlPackage.TRANSITION__TARGET1:
				setTarget1((String)newValue);
				return;
			case UmlPackage.TRANSITION__TRIGGER1:
				setTrigger1((String)newValue);
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
			case UmlPackage.TRANSITION__GROUP5:
				getGroup5().clear();
				return;
			case UmlPackage.TRANSITION__SOURCE:
				getSource().clear();
				return;
			case UmlPackage.TRANSITION__TARGET:
				getTarget().clear();
				return;
			case UmlPackage.TRANSITION__REDEFINED_TRANSITION:
				getRedefinedTransition().clear();
				return;
			case UmlPackage.TRANSITION__TRIGGER:
				getTrigger().clear();
				return;
			case UmlPackage.TRANSITION__GUARD:
				getGuard().clear();
				return;
			case UmlPackage.TRANSITION__EFFECT:
				getEffect().clear();
				return;
			case UmlPackage.TRANSITION__KIND:
				unsetKind();
				return;
			case UmlPackage.TRANSITION__REDEFINED_TRANSITION1:
				setRedefinedTransition1(REDEFINED_TRANSITION1_EDEFAULT);
				return;
			case UmlPackage.TRANSITION__SOURCE1:
				setSource1(SOURCE1_EDEFAULT);
				return;
			case UmlPackage.TRANSITION__TARGET1:
				setTarget1(TARGET1_EDEFAULT);
				return;
			case UmlPackage.TRANSITION__TRIGGER1:
				setTrigger1(TRIGGER1_EDEFAULT);
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
			case UmlPackage.TRANSITION__GROUP5:
				return group5 != null && !group5.isEmpty();
			case UmlPackage.TRANSITION__SOURCE:
				return !getSource().isEmpty();
			case UmlPackage.TRANSITION__TARGET:
				return !getTarget().isEmpty();
			case UmlPackage.TRANSITION__REDEFINED_TRANSITION:
				return !getRedefinedTransition().isEmpty();
			case UmlPackage.TRANSITION__TRIGGER:
				return !getTrigger().isEmpty();
			case UmlPackage.TRANSITION__GUARD:
				return !getGuard().isEmpty();
			case UmlPackage.TRANSITION__EFFECT:
				return !getEffect().isEmpty();
			case UmlPackage.TRANSITION__KIND:
				return isSetKind();
			case UmlPackage.TRANSITION__REDEFINED_TRANSITION1:
				return REDEFINED_TRANSITION1_EDEFAULT == null ? redefinedTransition1 != null : !REDEFINED_TRANSITION1_EDEFAULT.equals(redefinedTransition1);
			case UmlPackage.TRANSITION__SOURCE1:
				return SOURCE1_EDEFAULT == null ? source1 != null : !SOURCE1_EDEFAULT.equals(source1);
			case UmlPackage.TRANSITION__TARGET1:
				return TARGET1_EDEFAULT == null ? target1 != null : !TARGET1_EDEFAULT.equals(target1);
			case UmlPackage.TRANSITION__TRIGGER1:
				return TRIGGER1_EDEFAULT == null ? trigger1 != null : !TRIGGER1_EDEFAULT.equals(trigger1);
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
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(", redefinedTransition1: ");
		result.append(redefinedTransition1);
		result.append(", source1: ");
		result.append(source1);
		result.append(", target1: ");
		result.append(target1);
		result.append(", trigger1: ");
		result.append(trigger1);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
