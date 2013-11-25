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

import org.eclipse.uml2._1._0._0.uml.Gate;
import org.eclipse.uml2._1._0._0.uml.GeneralOrdering;
import org.eclipse.uml2._1._0._0.uml.Interaction;
import org.eclipse.uml2._1._0._0.uml.InteractionFragment;
import org.eclipse.uml2._1._0._0.uml.Lifeline;
import org.eclipse.uml2._1._0._0.uml.Message;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionImpl#getGroup10 <em>Group10</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionImpl#getCovered <em>Covered</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionImpl#getGeneralOrdering <em>General Ordering</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionImpl#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionImpl#getFragment <em>Fragment</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionImpl#getFormalGate <em>Formal Gate</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionImpl#getCovered1 <em>Covered1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionImpl extends BehaviorImpl implements Interaction
{
	/**
	 * The cached value of the '{@link #getGroup10() <em>Group10</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup10()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group10;

	/**
	 * The default value of the '{@link #getCovered1() <em>Covered1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovered1()
	 * @generated
	 * @ordered
	 */
	protected static final String COVERED1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCovered1() <em>Covered1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovered1()
	 * @generated
	 * @ordered
	 */
	protected String covered1 = COVERED1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionImpl()
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
		return UmlPackage.eINSTANCE.getInteraction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup10()
	{
		if (group10 == null)
		{
			group10 = new BasicFeatureMap(this, UmlPackage.INTERACTION__GROUP10);
		}
		return group10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lifeline> getCovered()
	{
		return getGroup10().list(UmlPackage.eINSTANCE.getInteraction_Covered());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralOrdering> getGeneralOrdering()
	{
		return getGroup10().list(UmlPackage.eINSTANCE.getInteraction_GeneralOrdering());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lifeline> getLifeline()
	{
		return getGroup10().list(UmlPackage.eINSTANCE.getInteraction_Lifeline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getMessage()
	{
		return getGroup10().list(UmlPackage.eINSTANCE.getInteraction_Message());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFragment> getFragment()
	{
		return getGroup10().list(UmlPackage.eINSTANCE.getInteraction_Fragment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getFormalGate()
	{
		return getGroup10().list(UmlPackage.eINSTANCE.getInteraction_FormalGate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCovered1()
	{
		return covered1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCovered1(String newCovered1)
	{
		String oldCovered1 = covered1;
		covered1 = newCovered1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INTERACTION__COVERED1, oldCovered1, covered1));
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
			case UmlPackage.INTERACTION__GROUP10:
				return ((InternalEList<?>)getGroup10()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERACTION__COVERED:
				return ((InternalEList<?>)getCovered()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERACTION__GENERAL_ORDERING:
				return ((InternalEList<?>)getGeneralOrdering()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERACTION__LIFELINE:
				return ((InternalEList<?>)getLifeline()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERACTION__MESSAGE:
				return ((InternalEList<?>)getMessage()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERACTION__FRAGMENT:
				return ((InternalEList<?>)getFragment()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERACTION__FORMAL_GATE:
				return ((InternalEList<?>)getFormalGate()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.INTERACTION__GROUP10:
				if (coreType) return getGroup10();
				return ((FeatureMap.Internal)getGroup10()).getWrapper();
			case UmlPackage.INTERACTION__COVERED:
				return getCovered();
			case UmlPackage.INTERACTION__GENERAL_ORDERING:
				return getGeneralOrdering();
			case UmlPackage.INTERACTION__LIFELINE:
				return getLifeline();
			case UmlPackage.INTERACTION__MESSAGE:
				return getMessage();
			case UmlPackage.INTERACTION__FRAGMENT:
				return getFragment();
			case UmlPackage.INTERACTION__FORMAL_GATE:
				return getFormalGate();
			case UmlPackage.INTERACTION__COVERED1:
				return getCovered1();
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
			case UmlPackage.INTERACTION__GROUP10:
				((FeatureMap.Internal)getGroup10()).set(newValue);
				return;
			case UmlPackage.INTERACTION__COVERED:
				getCovered().clear();
				getCovered().addAll((Collection<? extends Lifeline>)newValue);
				return;
			case UmlPackage.INTERACTION__GENERAL_ORDERING:
				getGeneralOrdering().clear();
				getGeneralOrdering().addAll((Collection<? extends GeneralOrdering>)newValue);
				return;
			case UmlPackage.INTERACTION__LIFELINE:
				getLifeline().clear();
				getLifeline().addAll((Collection<? extends Lifeline>)newValue);
				return;
			case UmlPackage.INTERACTION__MESSAGE:
				getMessage().clear();
				getMessage().addAll((Collection<? extends Message>)newValue);
				return;
			case UmlPackage.INTERACTION__FRAGMENT:
				getFragment().clear();
				getFragment().addAll((Collection<? extends InteractionFragment>)newValue);
				return;
			case UmlPackage.INTERACTION__FORMAL_GATE:
				getFormalGate().clear();
				getFormalGate().addAll((Collection<? extends Gate>)newValue);
				return;
			case UmlPackage.INTERACTION__COVERED1:
				setCovered1((String)newValue);
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
			case UmlPackage.INTERACTION__GROUP10:
				getGroup10().clear();
				return;
			case UmlPackage.INTERACTION__COVERED:
				getCovered().clear();
				return;
			case UmlPackage.INTERACTION__GENERAL_ORDERING:
				getGeneralOrdering().clear();
				return;
			case UmlPackage.INTERACTION__LIFELINE:
				getLifeline().clear();
				return;
			case UmlPackage.INTERACTION__MESSAGE:
				getMessage().clear();
				return;
			case UmlPackage.INTERACTION__FRAGMENT:
				getFragment().clear();
				return;
			case UmlPackage.INTERACTION__FORMAL_GATE:
				getFormalGate().clear();
				return;
			case UmlPackage.INTERACTION__COVERED1:
				setCovered1(COVERED1_EDEFAULT);
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
			case UmlPackage.INTERACTION__GROUP10:
				return group10 != null && !group10.isEmpty();
			case UmlPackage.INTERACTION__COVERED:
				return !getCovered().isEmpty();
			case UmlPackage.INTERACTION__GENERAL_ORDERING:
				return !getGeneralOrdering().isEmpty();
			case UmlPackage.INTERACTION__LIFELINE:
				return !getLifeline().isEmpty();
			case UmlPackage.INTERACTION__MESSAGE:
				return !getMessage().isEmpty();
			case UmlPackage.INTERACTION__FRAGMENT:
				return !getFragment().isEmpty();
			case UmlPackage.INTERACTION__FORMAL_GATE:
				return !getFormalGate().isEmpty();
			case UmlPackage.INTERACTION__COVERED1:
				return COVERED1_EDEFAULT == null ? covered1 != null : !COVERED1_EDEFAULT.equals(covered1);
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
		result.append(" (group10: ");
		result.append(group10);
		result.append(", covered1: ");
		result.append(covered1);
		result.append(')');
		return result.toString();
	}

} //InteractionImpl
