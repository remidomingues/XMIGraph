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

import org.eclipse.uml2._1._0._0.uml.EventOccurrence;
import org.eclipse.uml2._1._0._0.uml.GeneralOrdering;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Ordering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.GeneralOrderingImpl#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.GeneralOrderingImpl#getBefore <em>Before</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.GeneralOrderingImpl#getAfter <em>After</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.GeneralOrderingImpl#getAfter1 <em>After1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.GeneralOrderingImpl#getBefore1 <em>Before1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralOrderingImpl extends NamedElementImpl implements GeneralOrdering
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
	 * The default value of the '{@link #getAfter1() <em>After1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfter1()
	 * @generated
	 * @ordered
	 */
	protected static final String AFTER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAfter1() <em>After1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfter1()
	 * @generated
	 * @ordered
	 */
	protected String after1 = AFTER1_EDEFAULT;

	/**
	 * The default value of the '{@link #getBefore1() <em>Before1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBefore1()
	 * @generated
	 * @ordered
	 */
	protected static final String BEFORE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBefore1() <em>Before1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBefore1()
	 * @generated
	 * @ordered
	 */
	protected String before1 = BEFORE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralOrderingImpl()
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
		return UmlPackage.eINSTANCE.getGeneralOrdering();
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
			group5 = new BasicFeatureMap(this, UmlPackage.GENERAL_ORDERING__GROUP5);
		}
		return group5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventOccurrence> getBefore()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getGeneralOrdering_Before());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventOccurrence> getAfter()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getGeneralOrdering_After());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAfter1()
	{
		return after1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfter1(String newAfter1)
	{
		String oldAfter1 = after1;
		after1 = newAfter1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.GENERAL_ORDERING__AFTER1, oldAfter1, after1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBefore1()
	{
		return before1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBefore1(String newBefore1)
	{
		String oldBefore1 = before1;
		before1 = newBefore1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.GENERAL_ORDERING__BEFORE1, oldBefore1, before1));
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
			case UmlPackage.GENERAL_ORDERING__GROUP5:
				return ((InternalEList<?>)getGroup5()).basicRemove(otherEnd, msgs);
			case UmlPackage.GENERAL_ORDERING__BEFORE:
				return ((InternalEList<?>)getBefore()).basicRemove(otherEnd, msgs);
			case UmlPackage.GENERAL_ORDERING__AFTER:
				return ((InternalEList<?>)getAfter()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.GENERAL_ORDERING__GROUP5:
				if (coreType) return getGroup5();
				return ((FeatureMap.Internal)getGroup5()).getWrapper();
			case UmlPackage.GENERAL_ORDERING__BEFORE:
				return getBefore();
			case UmlPackage.GENERAL_ORDERING__AFTER:
				return getAfter();
			case UmlPackage.GENERAL_ORDERING__AFTER1:
				return getAfter1();
			case UmlPackage.GENERAL_ORDERING__BEFORE1:
				return getBefore1();
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
			case UmlPackage.GENERAL_ORDERING__GROUP5:
				((FeatureMap.Internal)getGroup5()).set(newValue);
				return;
			case UmlPackage.GENERAL_ORDERING__BEFORE:
				getBefore().clear();
				getBefore().addAll((Collection<? extends EventOccurrence>)newValue);
				return;
			case UmlPackage.GENERAL_ORDERING__AFTER:
				getAfter().clear();
				getAfter().addAll((Collection<? extends EventOccurrence>)newValue);
				return;
			case UmlPackage.GENERAL_ORDERING__AFTER1:
				setAfter1((String)newValue);
				return;
			case UmlPackage.GENERAL_ORDERING__BEFORE1:
				setBefore1((String)newValue);
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
			case UmlPackage.GENERAL_ORDERING__GROUP5:
				getGroup5().clear();
				return;
			case UmlPackage.GENERAL_ORDERING__BEFORE:
				getBefore().clear();
				return;
			case UmlPackage.GENERAL_ORDERING__AFTER:
				getAfter().clear();
				return;
			case UmlPackage.GENERAL_ORDERING__AFTER1:
				setAfter1(AFTER1_EDEFAULT);
				return;
			case UmlPackage.GENERAL_ORDERING__BEFORE1:
				setBefore1(BEFORE1_EDEFAULT);
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
			case UmlPackage.GENERAL_ORDERING__GROUP5:
				return group5 != null && !group5.isEmpty();
			case UmlPackage.GENERAL_ORDERING__BEFORE:
				return !getBefore().isEmpty();
			case UmlPackage.GENERAL_ORDERING__AFTER:
				return !getAfter().isEmpty();
			case UmlPackage.GENERAL_ORDERING__AFTER1:
				return AFTER1_EDEFAULT == null ? after1 != null : !AFTER1_EDEFAULT.equals(after1);
			case UmlPackage.GENERAL_ORDERING__BEFORE1:
				return BEFORE1_EDEFAULT == null ? before1 != null : !BEFORE1_EDEFAULT.equals(before1);
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
		result.append(", after1: ");
		result.append(after1);
		result.append(", before1: ");
		result.append(before1);
		result.append(')');
		return result.toString();
	}

} //GeneralOrderingImpl
