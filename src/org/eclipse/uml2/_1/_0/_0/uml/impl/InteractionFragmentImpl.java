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

import org.eclipse.uml2._1._0._0.uml.GeneralOrdering;
import org.eclipse.uml2._1._0._0.uml.InteractionFragment;
import org.eclipse.uml2._1._0._0.uml.Lifeline;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionFragmentImpl#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionFragmentImpl#getCovered <em>Covered</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionFragmentImpl#getGeneralOrdering <em>General Ordering</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InteractionFragmentImpl#getCovered1 <em>Covered1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionFragmentImpl extends NamedElementImpl implements InteractionFragment
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
	protected InteractionFragmentImpl()
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
		return UmlPackage.eINSTANCE.getInteractionFragment();
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
			group5 = new BasicFeatureMap(this, UmlPackage.INTERACTION_FRAGMENT__GROUP5);
		}
		return group5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lifeline> getCovered()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getInteractionFragment_Covered());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralOrdering> getGeneralOrdering()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getInteractionFragment_GeneralOrdering());
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INTERACTION_FRAGMENT__COVERED1, oldCovered1, covered1));
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
			case UmlPackage.INTERACTION_FRAGMENT__GROUP5:
				return ((InternalEList<?>)getGroup5()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERACTION_FRAGMENT__COVERED:
				return ((InternalEList<?>)getCovered()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING:
				return ((InternalEList<?>)getGeneralOrdering()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.INTERACTION_FRAGMENT__GROUP5:
				if (coreType) return getGroup5();
				return ((FeatureMap.Internal)getGroup5()).getWrapper();
			case UmlPackage.INTERACTION_FRAGMENT__COVERED:
				return getCovered();
			case UmlPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING:
				return getGeneralOrdering();
			case UmlPackage.INTERACTION_FRAGMENT__COVERED1:
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
			case UmlPackage.INTERACTION_FRAGMENT__GROUP5:
				((FeatureMap.Internal)getGroup5()).set(newValue);
				return;
			case UmlPackage.INTERACTION_FRAGMENT__COVERED:
				getCovered().clear();
				getCovered().addAll((Collection<? extends Lifeline>)newValue);
				return;
			case UmlPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING:
				getGeneralOrdering().clear();
				getGeneralOrdering().addAll((Collection<? extends GeneralOrdering>)newValue);
				return;
			case UmlPackage.INTERACTION_FRAGMENT__COVERED1:
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
			case UmlPackage.INTERACTION_FRAGMENT__GROUP5:
				getGroup5().clear();
				return;
			case UmlPackage.INTERACTION_FRAGMENT__COVERED:
				getCovered().clear();
				return;
			case UmlPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING:
				getGeneralOrdering().clear();
				return;
			case UmlPackage.INTERACTION_FRAGMENT__COVERED1:
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
			case UmlPackage.INTERACTION_FRAGMENT__GROUP5:
				return group5 != null && !group5.isEmpty();
			case UmlPackage.INTERACTION_FRAGMENT__COVERED:
				return !getCovered().isEmpty();
			case UmlPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING:
				return !getGeneralOrdering().isEmpty();
			case UmlPackage.INTERACTION_FRAGMENT__COVERED1:
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
		result.append(" (group5: ");
		result.append(group5);
		result.append(", covered1: ");
		result.append(covered1);
		result.append(')');
		return result.toString();
	}

} //InteractionFragmentImpl
