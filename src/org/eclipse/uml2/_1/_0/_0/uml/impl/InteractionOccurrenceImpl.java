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
import org.eclipse.uml2._1._0._0.uml.InputPin;
import org.eclipse.uml2._1._0._0.uml.Interaction;
import org.eclipse.uml2._1._0._0.uml.InteractionOccurrence;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionOccurrenceImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionOccurrenceImpl#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionOccurrenceImpl#getActualGate <em>Actual Gate</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionOccurrenceImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionOccurrenceImpl#getRefersTo1 <em>Refers To1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionOccurrenceImpl extends InteractionFragmentImpl implements InteractionOccurrence
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
	 * The default value of the '{@link #getRefersTo1() <em>Refers To1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersTo1()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERS_TO1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefersTo1() <em>Refers To1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersTo1()
	 * @generated
	 * @ordered
	 */
	protected String refersTo1 = REFERS_TO1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionOccurrenceImpl()
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
		return UmlPackage.eINSTANCE.getInteractionOccurrence();
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
			group6 = new BasicFeatureMap(this, UmlPackage.INTERACTION_OCCURRENCE__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interaction> getRefersTo()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getInteractionOccurrence_RefersTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getActualGate()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getInteractionOccurrence_ActualGate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getArgument()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getInteractionOccurrence_Argument());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefersTo1()
	{
		return refersTo1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefersTo1(String newRefersTo1)
	{
		String oldRefersTo1 = refersTo1;
		refersTo1 = newRefersTo1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INTERACTION_OCCURRENCE__REFERS_TO1, oldRefersTo1, refersTo1));
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
			case UmlPackage.INTERACTION_OCCURRENCE__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERACTION_OCCURRENCE__REFERS_TO:
				return ((InternalEList<?>)getRefersTo()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERACTION_OCCURRENCE__ACTUAL_GATE:
				return ((InternalEList<?>)getActualGate()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERACTION_OCCURRENCE__ARGUMENT:
				return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.INTERACTION_OCCURRENCE__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.INTERACTION_OCCURRENCE__REFERS_TO:
				return getRefersTo();
			case UmlPackage.INTERACTION_OCCURRENCE__ACTUAL_GATE:
				return getActualGate();
			case UmlPackage.INTERACTION_OCCURRENCE__ARGUMENT:
				return getArgument();
			case UmlPackage.INTERACTION_OCCURRENCE__REFERS_TO1:
				return getRefersTo1();
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
			case UmlPackage.INTERACTION_OCCURRENCE__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.INTERACTION_OCCURRENCE__REFERS_TO:
				getRefersTo().clear();
				getRefersTo().addAll((Collection<? extends Interaction>)newValue);
				return;
			case UmlPackage.INTERACTION_OCCURRENCE__ACTUAL_GATE:
				getActualGate().clear();
				getActualGate().addAll((Collection<? extends Gate>)newValue);
				return;
			case UmlPackage.INTERACTION_OCCURRENCE__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection<? extends InputPin>)newValue);
				return;
			case UmlPackage.INTERACTION_OCCURRENCE__REFERS_TO1:
				setRefersTo1((String)newValue);
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
			case UmlPackage.INTERACTION_OCCURRENCE__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.INTERACTION_OCCURRENCE__REFERS_TO:
				getRefersTo().clear();
				return;
			case UmlPackage.INTERACTION_OCCURRENCE__ACTUAL_GATE:
				getActualGate().clear();
				return;
			case UmlPackage.INTERACTION_OCCURRENCE__ARGUMENT:
				getArgument().clear();
				return;
			case UmlPackage.INTERACTION_OCCURRENCE__REFERS_TO1:
				setRefersTo1(REFERS_TO1_EDEFAULT);
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
			case UmlPackage.INTERACTION_OCCURRENCE__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.INTERACTION_OCCURRENCE__REFERS_TO:
				return !getRefersTo().isEmpty();
			case UmlPackage.INTERACTION_OCCURRENCE__ACTUAL_GATE:
				return !getActualGate().isEmpty();
			case UmlPackage.INTERACTION_OCCURRENCE__ARGUMENT:
				return !getArgument().isEmpty();
			case UmlPackage.INTERACTION_OCCURRENCE__REFERS_TO1:
				return REFERS_TO1_EDEFAULT == null ? refersTo1 != null : !REFERS_TO1_EDEFAULT.equals(refersTo1);
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
		result.append(", refersTo1: ");
		result.append(refersTo1);
		result.append(')');
		return result.toString();
	}

} //InteractionOccurrenceImpl
