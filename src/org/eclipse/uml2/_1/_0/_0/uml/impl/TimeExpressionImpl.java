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

import org.eclipse.uml2._1._0._0.uml.NamedElement;
import org.eclipse.uml2._1._0._0.uml.TimeExpression;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TimeExpressionImpl#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TimeExpressionImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TimeExpressionImpl#getEvent1 <em>Event1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TimeExpressionImpl#getFirstTime <em>First Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeExpressionImpl extends ValueSpecificationImpl implements TimeExpression
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
	 * The default value of the '{@link #getEvent1() <em>Event1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent1()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvent1() <em>Event1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent1()
	 * @generated
	 * @ordered
	 */
	protected String event1 = EVENT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstTime() <em>First Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstTime()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstTime() <em>First Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstTime()
	 * @generated
	 * @ordered
	 */
	protected String firstTime = FIRST_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeExpressionImpl()
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
		return UmlPackage.eINSTANCE.getTimeExpression();
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
			group7 = new BasicFeatureMap(this, UmlPackage.TIME_EXPRESSION__GROUP7);
		}
		return group7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getEvent()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getTimeExpression_Event());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvent1()
	{
		return event1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent1(String newEvent1)
	{
		String oldEvent1 = event1;
		event1 = newEvent1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TIME_EXPRESSION__EVENT1, oldEvent1, event1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstTime()
	{
		return firstTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstTime(String newFirstTime)
	{
		String oldFirstTime = firstTime;
		firstTime = newFirstTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TIME_EXPRESSION__FIRST_TIME, oldFirstTime, firstTime));
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
			case UmlPackage.TIME_EXPRESSION__GROUP7:
				return ((InternalEList<?>)getGroup7()).basicRemove(otherEnd, msgs);
			case UmlPackage.TIME_EXPRESSION__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.TIME_EXPRESSION__GROUP7:
				if (coreType) return getGroup7();
				return ((FeatureMap.Internal)getGroup7()).getWrapper();
			case UmlPackage.TIME_EXPRESSION__EVENT:
				return getEvent();
			case UmlPackage.TIME_EXPRESSION__EVENT1:
				return getEvent1();
			case UmlPackage.TIME_EXPRESSION__FIRST_TIME:
				return getFirstTime();
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
			case UmlPackage.TIME_EXPRESSION__GROUP7:
				((FeatureMap.Internal)getGroup7()).set(newValue);
				return;
			case UmlPackage.TIME_EXPRESSION__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case UmlPackage.TIME_EXPRESSION__EVENT1:
				setEvent1((String)newValue);
				return;
			case UmlPackage.TIME_EXPRESSION__FIRST_TIME:
				setFirstTime((String)newValue);
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
			case UmlPackage.TIME_EXPRESSION__GROUP7:
				getGroup7().clear();
				return;
			case UmlPackage.TIME_EXPRESSION__EVENT:
				getEvent().clear();
				return;
			case UmlPackage.TIME_EXPRESSION__EVENT1:
				setEvent1(EVENT1_EDEFAULT);
				return;
			case UmlPackage.TIME_EXPRESSION__FIRST_TIME:
				setFirstTime(FIRST_TIME_EDEFAULT);
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
			case UmlPackage.TIME_EXPRESSION__GROUP7:
				return group7 != null && !group7.isEmpty();
			case UmlPackage.TIME_EXPRESSION__EVENT:
				return !getEvent().isEmpty();
			case UmlPackage.TIME_EXPRESSION__EVENT1:
				return EVENT1_EDEFAULT == null ? event1 != null : !EVENT1_EDEFAULT.equals(event1);
			case UmlPackage.TIME_EXPRESSION__FIRST_TIME:
				return FIRST_TIME_EDEFAULT == null ? firstTime != null : !FIRST_TIME_EDEFAULT.equals(firstTime);
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
		result.append(", event1: ");
		result.append(event1);
		result.append(", firstTime: ");
		result.append(firstTime);
		result.append(')');
		return result.toString();
	}

} //TimeExpressionImpl
