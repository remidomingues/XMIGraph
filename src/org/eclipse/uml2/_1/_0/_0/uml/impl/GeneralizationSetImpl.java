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

import org.eclipse.uml2._1._0._0.uml.Classifier;
import org.eclipse.uml2._1._0._0.uml.Generalization;
import org.eclipse.uml2._1._0._0.uml.GeneralizationSet;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.GeneralizationSetImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.GeneralizationSetImpl#getPowertype <em>Powertype</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.GeneralizationSetImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.GeneralizationSetImpl#getGeneralization1 <em>Generalization1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.GeneralizationSetImpl#getIsCovering <em>Is Covering</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.GeneralizationSetImpl#getIsDisjoint <em>Is Disjoint</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.GeneralizationSetImpl#getPowertype1 <em>Powertype1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizationSetImpl extends PackageableElementImpl implements GeneralizationSet
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
	 * The default value of the '{@link #getGeneralization1() <em>Generalization1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralization1()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERALIZATION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeneralization1() <em>Generalization1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralization1()
	 * @generated
	 * @ordered
	 */
	protected String generalization1 = GENERALIZATION1_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsCovering() <em>Is Covering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCovering()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_COVERING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsCovering() <em>Is Covering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCovering()
	 * @generated
	 * @ordered
	 */
	protected String isCovering = IS_COVERING_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsDisjoint() <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDisjoint()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_DISJOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDisjoint() <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDisjoint()
	 * @generated
	 * @ordered
	 */
	protected String isDisjoint = IS_DISJOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowertype1() <em>Powertype1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowertype1()
	 * @generated
	 * @ordered
	 */
	protected static final String POWERTYPE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPowertype1() <em>Powertype1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowertype1()
	 * @generated
	 * @ordered
	 */
	protected String powertype1 = POWERTYPE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationSetImpl()
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
		return UmlPackage.eINSTANCE.getGeneralizationSet();
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
			group6 = new BasicFeatureMap(this, UmlPackage.GENERALIZATION_SET__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getPowertype()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getGeneralizationSet_Powertype());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralization()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getGeneralizationSet_Generalization());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeneralization1()
	{
		return generalization1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralization1(String newGeneralization1)
	{
		String oldGeneralization1 = generalization1;
		generalization1 = newGeneralization1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.GENERALIZATION_SET__GENERALIZATION1, oldGeneralization1, generalization1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsCovering()
	{
		return isCovering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCovering(String newIsCovering)
	{
		String oldIsCovering = isCovering;
		isCovering = newIsCovering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.GENERALIZATION_SET__IS_COVERING, oldIsCovering, isCovering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsDisjoint()
	{
		return isDisjoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDisjoint(String newIsDisjoint)
	{
		String oldIsDisjoint = isDisjoint;
		isDisjoint = newIsDisjoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.GENERALIZATION_SET__IS_DISJOINT, oldIsDisjoint, isDisjoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPowertype1()
	{
		return powertype1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowertype1(String newPowertype1)
	{
		String oldPowertype1 = powertype1;
		powertype1 = newPowertype1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.GENERALIZATION_SET__POWERTYPE1, oldPowertype1, powertype1));
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
			case UmlPackage.GENERALIZATION_SET__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.GENERALIZATION_SET__POWERTYPE:
				return ((InternalEList<?>)getPowertype()).basicRemove(otherEnd, msgs);
			case UmlPackage.GENERALIZATION_SET__GENERALIZATION:
				return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.GENERALIZATION_SET__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.GENERALIZATION_SET__POWERTYPE:
				return getPowertype();
			case UmlPackage.GENERALIZATION_SET__GENERALIZATION:
				return getGeneralization();
			case UmlPackage.GENERALIZATION_SET__GENERALIZATION1:
				return getGeneralization1();
			case UmlPackage.GENERALIZATION_SET__IS_COVERING:
				return getIsCovering();
			case UmlPackage.GENERALIZATION_SET__IS_DISJOINT:
				return getIsDisjoint();
			case UmlPackage.GENERALIZATION_SET__POWERTYPE1:
				return getPowertype1();
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
			case UmlPackage.GENERALIZATION_SET__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.GENERALIZATION_SET__POWERTYPE:
				getPowertype().clear();
				getPowertype().addAll((Collection<? extends Classifier>)newValue);
				return;
			case UmlPackage.GENERALIZATION_SET__GENERALIZATION:
				getGeneralization().clear();
				getGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case UmlPackage.GENERALIZATION_SET__GENERALIZATION1:
				setGeneralization1((String)newValue);
				return;
			case UmlPackage.GENERALIZATION_SET__IS_COVERING:
				setIsCovering((String)newValue);
				return;
			case UmlPackage.GENERALIZATION_SET__IS_DISJOINT:
				setIsDisjoint((String)newValue);
				return;
			case UmlPackage.GENERALIZATION_SET__POWERTYPE1:
				setPowertype1((String)newValue);
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
			case UmlPackage.GENERALIZATION_SET__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.GENERALIZATION_SET__POWERTYPE:
				getPowertype().clear();
				return;
			case UmlPackage.GENERALIZATION_SET__GENERALIZATION:
				getGeneralization().clear();
				return;
			case UmlPackage.GENERALIZATION_SET__GENERALIZATION1:
				setGeneralization1(GENERALIZATION1_EDEFAULT);
				return;
			case UmlPackage.GENERALIZATION_SET__IS_COVERING:
				setIsCovering(IS_COVERING_EDEFAULT);
				return;
			case UmlPackage.GENERALIZATION_SET__IS_DISJOINT:
				setIsDisjoint(IS_DISJOINT_EDEFAULT);
				return;
			case UmlPackage.GENERALIZATION_SET__POWERTYPE1:
				setPowertype1(POWERTYPE1_EDEFAULT);
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
			case UmlPackage.GENERALIZATION_SET__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.GENERALIZATION_SET__POWERTYPE:
				return !getPowertype().isEmpty();
			case UmlPackage.GENERALIZATION_SET__GENERALIZATION:
				return !getGeneralization().isEmpty();
			case UmlPackage.GENERALIZATION_SET__GENERALIZATION1:
				return GENERALIZATION1_EDEFAULT == null ? generalization1 != null : !GENERALIZATION1_EDEFAULT.equals(generalization1);
			case UmlPackage.GENERALIZATION_SET__IS_COVERING:
				return IS_COVERING_EDEFAULT == null ? isCovering != null : !IS_COVERING_EDEFAULT.equals(isCovering);
			case UmlPackage.GENERALIZATION_SET__IS_DISJOINT:
				return IS_DISJOINT_EDEFAULT == null ? isDisjoint != null : !IS_DISJOINT_EDEFAULT.equals(isDisjoint);
			case UmlPackage.GENERALIZATION_SET__POWERTYPE1:
				return POWERTYPE1_EDEFAULT == null ? powertype1 != null : !POWERTYPE1_EDEFAULT.equals(powertype1);
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
		result.append(", generalization1: ");
		result.append(generalization1);
		result.append(", isCovering: ");
		result.append(isCovering);
		result.append(", isDisjoint: ");
		result.append(isDisjoint);
		result.append(", powertype1: ");
		result.append(powertype1);
		result.append(')');
		return result.toString();
	}

} //GeneralizationSetImpl
