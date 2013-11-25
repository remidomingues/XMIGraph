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
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.GeneralizationImpl#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.GeneralizationImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.GeneralizationImpl#getGeneralizationSet <em>Generalization Set</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.GeneralizationImpl#getGeneral1 <em>General1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.GeneralizationImpl#getGeneralizationSet1 <em>Generalization Set1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.GeneralizationImpl#getIsSubstitutable <em>Is Substitutable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizationImpl extends DirectedRelationshipImpl implements Generalization
{
	/**
	 * The cached value of the '{@link #getGroup3() <em>Group3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup3()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group3;

	/**
	 * The default value of the '{@link #getGeneral1() <em>General1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral1()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERAL1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeneral1() <em>General1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral1()
	 * @generated
	 * @ordered
	 */
	protected String general1 = GENERAL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneralizationSet1() <em>Generalization Set1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizationSet1()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERALIZATION_SET1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeneralizationSet1() <em>Generalization Set1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizationSet1()
	 * @generated
	 * @ordered
	 */
	protected String generalizationSet1 = GENERALIZATION_SET1_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsSubstitutable() <em>Is Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSubstitutable()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_SUBSTITUTABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsSubstitutable() <em>Is Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSubstitutable()
	 * @generated
	 * @ordered
	 */
	protected String isSubstitutable = IS_SUBSTITUTABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationImpl()
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
		return UmlPackage.eINSTANCE.getGeneralization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup3()
	{
		if (group3 == null)
		{
			group3 = new BasicFeatureMap(this, UmlPackage.GENERALIZATION__GROUP3);
		}
		return group3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getGeneral()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getGeneralization_General());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralizationSet> getGeneralizationSet()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getGeneralization_GeneralizationSet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeneral1()
	{
		return general1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral1(String newGeneral1)
	{
		String oldGeneral1 = general1;
		general1 = newGeneral1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.GENERALIZATION__GENERAL1, oldGeneral1, general1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeneralizationSet1()
	{
		return generalizationSet1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralizationSet1(String newGeneralizationSet1)
	{
		String oldGeneralizationSet1 = generalizationSet1;
		generalizationSet1 = newGeneralizationSet1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.GENERALIZATION__GENERALIZATION_SET1, oldGeneralizationSet1, generalizationSet1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsSubstitutable()
	{
		return isSubstitutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSubstitutable(String newIsSubstitutable)
	{
		String oldIsSubstitutable = isSubstitutable;
		isSubstitutable = newIsSubstitutable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.GENERALIZATION__IS_SUBSTITUTABLE, oldIsSubstitutable, isSubstitutable));
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
			case UmlPackage.GENERALIZATION__GROUP3:
				return ((InternalEList<?>)getGroup3()).basicRemove(otherEnd, msgs);
			case UmlPackage.GENERALIZATION__GENERAL:
				return ((InternalEList<?>)getGeneral()).basicRemove(otherEnd, msgs);
			case UmlPackage.GENERALIZATION__GENERALIZATION_SET:
				return ((InternalEList<?>)getGeneralizationSet()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.GENERALIZATION__GROUP3:
				if (coreType) return getGroup3();
				return ((FeatureMap.Internal)getGroup3()).getWrapper();
			case UmlPackage.GENERALIZATION__GENERAL:
				return getGeneral();
			case UmlPackage.GENERALIZATION__GENERALIZATION_SET:
				return getGeneralizationSet();
			case UmlPackage.GENERALIZATION__GENERAL1:
				return getGeneral1();
			case UmlPackage.GENERALIZATION__GENERALIZATION_SET1:
				return getGeneralizationSet1();
			case UmlPackage.GENERALIZATION__IS_SUBSTITUTABLE:
				return getIsSubstitutable();
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
			case UmlPackage.GENERALIZATION__GROUP3:
				((FeatureMap.Internal)getGroup3()).set(newValue);
				return;
			case UmlPackage.GENERALIZATION__GENERAL:
				getGeneral().clear();
				getGeneral().addAll((Collection<? extends Classifier>)newValue);
				return;
			case UmlPackage.GENERALIZATION__GENERALIZATION_SET:
				getGeneralizationSet().clear();
				getGeneralizationSet().addAll((Collection<? extends GeneralizationSet>)newValue);
				return;
			case UmlPackage.GENERALIZATION__GENERAL1:
				setGeneral1((String)newValue);
				return;
			case UmlPackage.GENERALIZATION__GENERALIZATION_SET1:
				setGeneralizationSet1((String)newValue);
				return;
			case UmlPackage.GENERALIZATION__IS_SUBSTITUTABLE:
				setIsSubstitutable((String)newValue);
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
			case UmlPackage.GENERALIZATION__GROUP3:
				getGroup3().clear();
				return;
			case UmlPackage.GENERALIZATION__GENERAL:
				getGeneral().clear();
				return;
			case UmlPackage.GENERALIZATION__GENERALIZATION_SET:
				getGeneralizationSet().clear();
				return;
			case UmlPackage.GENERALIZATION__GENERAL1:
				setGeneral1(GENERAL1_EDEFAULT);
				return;
			case UmlPackage.GENERALIZATION__GENERALIZATION_SET1:
				setGeneralizationSet1(GENERALIZATION_SET1_EDEFAULT);
				return;
			case UmlPackage.GENERALIZATION__IS_SUBSTITUTABLE:
				setIsSubstitutable(IS_SUBSTITUTABLE_EDEFAULT);
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
			case UmlPackage.GENERALIZATION__GROUP3:
				return group3 != null && !group3.isEmpty();
			case UmlPackage.GENERALIZATION__GENERAL:
				return !getGeneral().isEmpty();
			case UmlPackage.GENERALIZATION__GENERALIZATION_SET:
				return !getGeneralizationSet().isEmpty();
			case UmlPackage.GENERALIZATION__GENERAL1:
				return GENERAL1_EDEFAULT == null ? general1 != null : !GENERAL1_EDEFAULT.equals(general1);
			case UmlPackage.GENERALIZATION__GENERALIZATION_SET1:
				return GENERALIZATION_SET1_EDEFAULT == null ? generalizationSet1 != null : !GENERALIZATION_SET1_EDEFAULT.equals(generalizationSet1);
			case UmlPackage.GENERALIZATION__IS_SUBSTITUTABLE:
				return IS_SUBSTITUTABLE_EDEFAULT == null ? isSubstitutable != null : !IS_SUBSTITUTABLE_EDEFAULT.equals(isSubstitutable);
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
		result.append(" (group3: ");
		result.append(group3);
		result.append(", general1: ");
		result.append(general1);
		result.append(", generalizationSet1: ");
		result.append(generalizationSet1);
		result.append(", isSubstitutable: ");
		result.append(isSubstitutable);
		result.append(')');
		return result.toString();
	}

} //GeneralizationImpl
