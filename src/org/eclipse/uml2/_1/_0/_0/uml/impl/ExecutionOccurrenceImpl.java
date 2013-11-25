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

import org.eclipse.uml2._1._0._0.uml.Behavior;
import org.eclipse.uml2._1._0._0.uml.EventOccurrence;
import org.eclipse.uml2._1._0._0.uml.ExecutionOccurrence;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExecutionOccurrenceImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExecutionOccurrenceImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExecutionOccurrenceImpl#getFinish <em>Finish</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExecutionOccurrenceImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExecutionOccurrenceImpl#getBehavior1 <em>Behavior1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExecutionOccurrenceImpl#getFinish1 <em>Finish1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExecutionOccurrenceImpl#getStart1 <em>Start1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionOccurrenceImpl extends InteractionFragmentImpl implements ExecutionOccurrence
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
	 * The default value of the '{@link #getBehavior1() <em>Behavior1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior1()
	 * @generated
	 * @ordered
	 */
	protected static final String BEHAVIOR1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBehavior1() <em>Behavior1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior1()
	 * @generated
	 * @ordered
	 */
	protected String behavior1 = BEHAVIOR1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinish1() <em>Finish1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinish1()
	 * @generated
	 * @ordered
	 */
	protected static final String FINISH1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinish1() <em>Finish1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinish1()
	 * @generated
	 * @ordered
	 */
	protected String finish1 = FINISH1_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart1() <em>Start1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart1()
	 * @generated
	 * @ordered
	 */
	protected static final String START1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart1() <em>Start1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart1()
	 * @generated
	 * @ordered
	 */
	protected String start1 = START1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionOccurrenceImpl()
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
		return UmlPackage.eINSTANCE.getExecutionOccurrence();
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
			group6 = new BasicFeatureMap(this, UmlPackage.EXECUTION_OCCURRENCE__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventOccurrence> getStart()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getExecutionOccurrence_Start());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventOccurrence> getFinish()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getExecutionOccurrence_Finish());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getBehavior()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getExecutionOccurrence_Behavior());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBehavior1()
	{
		return behavior1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior1(String newBehavior1)
	{
		String oldBehavior1 = behavior1;
		behavior1 = newBehavior1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EXECUTION_OCCURRENCE__BEHAVIOR1, oldBehavior1, behavior1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFinish1()
	{
		return finish1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinish1(String newFinish1)
	{
		String oldFinish1 = finish1;
		finish1 = newFinish1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EXECUTION_OCCURRENCE__FINISH1, oldFinish1, finish1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStart1()
	{
		return start1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart1(String newStart1)
	{
		String oldStart1 = start1;
		start1 = newStart1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EXECUTION_OCCURRENCE__START1, oldStart1, start1));
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
			case UmlPackage.EXECUTION_OCCURRENCE__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.EXECUTION_OCCURRENCE__START:
				return ((InternalEList<?>)getStart()).basicRemove(otherEnd, msgs);
			case UmlPackage.EXECUTION_OCCURRENCE__FINISH:
				return ((InternalEList<?>)getFinish()).basicRemove(otherEnd, msgs);
			case UmlPackage.EXECUTION_OCCURRENCE__BEHAVIOR:
				return ((InternalEList<?>)getBehavior()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.EXECUTION_OCCURRENCE__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.EXECUTION_OCCURRENCE__START:
				return getStart();
			case UmlPackage.EXECUTION_OCCURRENCE__FINISH:
				return getFinish();
			case UmlPackage.EXECUTION_OCCURRENCE__BEHAVIOR:
				return getBehavior();
			case UmlPackage.EXECUTION_OCCURRENCE__BEHAVIOR1:
				return getBehavior1();
			case UmlPackage.EXECUTION_OCCURRENCE__FINISH1:
				return getFinish1();
			case UmlPackage.EXECUTION_OCCURRENCE__START1:
				return getStart1();
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
			case UmlPackage.EXECUTION_OCCURRENCE__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.EXECUTION_OCCURRENCE__START:
				getStart().clear();
				getStart().addAll((Collection<? extends EventOccurrence>)newValue);
				return;
			case UmlPackage.EXECUTION_OCCURRENCE__FINISH:
				getFinish().clear();
				getFinish().addAll((Collection<? extends EventOccurrence>)newValue);
				return;
			case UmlPackage.EXECUTION_OCCURRENCE__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case UmlPackage.EXECUTION_OCCURRENCE__BEHAVIOR1:
				setBehavior1((String)newValue);
				return;
			case UmlPackage.EXECUTION_OCCURRENCE__FINISH1:
				setFinish1((String)newValue);
				return;
			case UmlPackage.EXECUTION_OCCURRENCE__START1:
				setStart1((String)newValue);
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
			case UmlPackage.EXECUTION_OCCURRENCE__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.EXECUTION_OCCURRENCE__START:
				getStart().clear();
				return;
			case UmlPackage.EXECUTION_OCCURRENCE__FINISH:
				getFinish().clear();
				return;
			case UmlPackage.EXECUTION_OCCURRENCE__BEHAVIOR:
				getBehavior().clear();
				return;
			case UmlPackage.EXECUTION_OCCURRENCE__BEHAVIOR1:
				setBehavior1(BEHAVIOR1_EDEFAULT);
				return;
			case UmlPackage.EXECUTION_OCCURRENCE__FINISH1:
				setFinish1(FINISH1_EDEFAULT);
				return;
			case UmlPackage.EXECUTION_OCCURRENCE__START1:
				setStart1(START1_EDEFAULT);
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
			case UmlPackage.EXECUTION_OCCURRENCE__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.EXECUTION_OCCURRENCE__START:
				return !getStart().isEmpty();
			case UmlPackage.EXECUTION_OCCURRENCE__FINISH:
				return !getFinish().isEmpty();
			case UmlPackage.EXECUTION_OCCURRENCE__BEHAVIOR:
				return !getBehavior().isEmpty();
			case UmlPackage.EXECUTION_OCCURRENCE__BEHAVIOR1:
				return BEHAVIOR1_EDEFAULT == null ? behavior1 != null : !BEHAVIOR1_EDEFAULT.equals(behavior1);
			case UmlPackage.EXECUTION_OCCURRENCE__FINISH1:
				return FINISH1_EDEFAULT == null ? finish1 != null : !FINISH1_EDEFAULT.equals(finish1);
			case UmlPackage.EXECUTION_OCCURRENCE__START1:
				return START1_EDEFAULT == null ? start1 != null : !START1_EDEFAULT.equals(start1);
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
		result.append(", behavior1: ");
		result.append(behavior1);
		result.append(", finish1: ");
		result.append(finish1);
		result.append(", start1: ");
		result.append(start1);
		result.append(')');
		return result.toString();
	}

} //ExecutionOccurrenceImpl
