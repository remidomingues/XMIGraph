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

import org.eclipse.uml2._1._0._0.uml.Interval;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.IntervalImpl#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.IntervalImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.IntervalImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.IntervalImpl#getMax1 <em>Max1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.IntervalImpl#getMin1 <em>Min1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntervalImpl extends ValueSpecificationImpl implements Interval
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
	 * The default value of the '{@link #getMax1() <em>Max1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax1()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMax1() <em>Max1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax1()
	 * @generated
	 * @ordered
	 */
	protected String max1 = MAX1_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin1() <em>Min1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin1()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMin1() <em>Min1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin1()
	 * @generated
	 * @ordered
	 */
	protected String min1 = MIN1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalImpl()
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
		return UmlPackage.eINSTANCE.getInterval();
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
			group7 = new BasicFeatureMap(this, UmlPackage.INTERVAL__GROUP7);
		}
		return group7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getMin()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getInterval_Min());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getMax()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getInterval_Max());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMax1()
	{
		return max1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax1(String newMax1)
	{
		String oldMax1 = max1;
		max1 = newMax1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INTERVAL__MAX1, oldMax1, max1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMin1()
	{
		return min1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin1(String newMin1)
	{
		String oldMin1 = min1;
		min1 = newMin1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INTERVAL__MIN1, oldMin1, min1));
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
			case UmlPackage.INTERVAL__GROUP7:
				return ((InternalEList<?>)getGroup7()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERVAL__MIN:
				return ((InternalEList<?>)getMin()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERVAL__MAX:
				return ((InternalEList<?>)getMax()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.INTERVAL__GROUP7:
				if (coreType) return getGroup7();
				return ((FeatureMap.Internal)getGroup7()).getWrapper();
			case UmlPackage.INTERVAL__MIN:
				return getMin();
			case UmlPackage.INTERVAL__MAX:
				return getMax();
			case UmlPackage.INTERVAL__MAX1:
				return getMax1();
			case UmlPackage.INTERVAL__MIN1:
				return getMin1();
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
			case UmlPackage.INTERVAL__GROUP7:
				((FeatureMap.Internal)getGroup7()).set(newValue);
				return;
			case UmlPackage.INTERVAL__MIN:
				getMin().clear();
				getMin().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UmlPackage.INTERVAL__MAX:
				getMax().clear();
				getMax().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UmlPackage.INTERVAL__MAX1:
				setMax1((String)newValue);
				return;
			case UmlPackage.INTERVAL__MIN1:
				setMin1((String)newValue);
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
			case UmlPackage.INTERVAL__GROUP7:
				getGroup7().clear();
				return;
			case UmlPackage.INTERVAL__MIN:
				getMin().clear();
				return;
			case UmlPackage.INTERVAL__MAX:
				getMax().clear();
				return;
			case UmlPackage.INTERVAL__MAX1:
				setMax1(MAX1_EDEFAULT);
				return;
			case UmlPackage.INTERVAL__MIN1:
				setMin1(MIN1_EDEFAULT);
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
			case UmlPackage.INTERVAL__GROUP7:
				return group7 != null && !group7.isEmpty();
			case UmlPackage.INTERVAL__MIN:
				return !getMin().isEmpty();
			case UmlPackage.INTERVAL__MAX:
				return !getMax().isEmpty();
			case UmlPackage.INTERVAL__MAX1:
				return MAX1_EDEFAULT == null ? max1 != null : !MAX1_EDEFAULT.equals(max1);
			case UmlPackage.INTERVAL__MIN1:
				return MIN1_EDEFAULT == null ? min1 != null : !MIN1_EDEFAULT.equals(min1);
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
		result.append(", max1: ");
		result.append(max1);
		result.append(", min1: ");
		result.append(min1);
		result.append(')');
		return result.toString();
	}

} //IntervalImpl
