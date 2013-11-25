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
import org.eclipse.uml2._1._0._0.uml.Extend;
import org.eclipse.uml2._1._0._0.uml.ExtensionPoint;
import org.eclipse.uml2._1._0._0.uml.Include;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.UseCaseImpl#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.UseCaseImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.UseCaseImpl#getExtend <em>Extend</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.UseCaseImpl#getExtensionPoint <em>Extension Point</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.UseCaseImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.UseCaseImpl#getSubject1 <em>Subject1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UseCaseImpl extends BehavioredClassifierImpl implements UseCase
{
	/**
	 * The cached value of the '{@link #getGroup8() <em>Group8</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup8()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group8;

	/**
	 * The default value of the '{@link #getSubject1() <em>Subject1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject1()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubject1() <em>Subject1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject1()
	 * @generated
	 * @ordered
	 */
	protected String subject1 = SUBJECT1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseImpl()
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
		return UmlPackage.eINSTANCE.getUseCase();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup8()
	{
		if (group8 == null)
		{
			group8 = new BasicFeatureMap(this, UmlPackage.USE_CASE__GROUP8);
		}
		return group8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Include> getInclude()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getUseCase_Include());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extend> getExtend()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getUseCase_Extend());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionPoint> getExtensionPoint()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getUseCase_ExtensionPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getSubject()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getUseCase_Subject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubject1()
	{
		return subject1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject1(String newSubject1)
	{
		String oldSubject1 = subject1;
		subject1 = newSubject1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.USE_CASE__SUBJECT1, oldSubject1, subject1));
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
			case UmlPackage.USE_CASE__GROUP8:
				return ((InternalEList<?>)getGroup8()).basicRemove(otherEnd, msgs);
			case UmlPackage.USE_CASE__INCLUDE:
				return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
			case UmlPackage.USE_CASE__EXTEND:
				return ((InternalEList<?>)getExtend()).basicRemove(otherEnd, msgs);
			case UmlPackage.USE_CASE__EXTENSION_POINT:
				return ((InternalEList<?>)getExtensionPoint()).basicRemove(otherEnd, msgs);
			case UmlPackage.USE_CASE__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.USE_CASE__GROUP8:
				if (coreType) return getGroup8();
				return ((FeatureMap.Internal)getGroup8()).getWrapper();
			case UmlPackage.USE_CASE__INCLUDE:
				return getInclude();
			case UmlPackage.USE_CASE__EXTEND:
				return getExtend();
			case UmlPackage.USE_CASE__EXTENSION_POINT:
				return getExtensionPoint();
			case UmlPackage.USE_CASE__SUBJECT:
				return getSubject();
			case UmlPackage.USE_CASE__SUBJECT1:
				return getSubject1();
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
			case UmlPackage.USE_CASE__GROUP8:
				((FeatureMap.Internal)getGroup8()).set(newValue);
				return;
			case UmlPackage.USE_CASE__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends Include>)newValue);
				return;
			case UmlPackage.USE_CASE__EXTEND:
				getExtend().clear();
				getExtend().addAll((Collection<? extends Extend>)newValue);
				return;
			case UmlPackage.USE_CASE__EXTENSION_POINT:
				getExtensionPoint().clear();
				getExtensionPoint().addAll((Collection<? extends ExtensionPoint>)newValue);
				return;
			case UmlPackage.USE_CASE__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends Classifier>)newValue);
				return;
			case UmlPackage.USE_CASE__SUBJECT1:
				setSubject1((String)newValue);
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
			case UmlPackage.USE_CASE__GROUP8:
				getGroup8().clear();
				return;
			case UmlPackage.USE_CASE__INCLUDE:
				getInclude().clear();
				return;
			case UmlPackage.USE_CASE__EXTEND:
				getExtend().clear();
				return;
			case UmlPackage.USE_CASE__EXTENSION_POINT:
				getExtensionPoint().clear();
				return;
			case UmlPackage.USE_CASE__SUBJECT:
				getSubject().clear();
				return;
			case UmlPackage.USE_CASE__SUBJECT1:
				setSubject1(SUBJECT1_EDEFAULT);
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
			case UmlPackage.USE_CASE__GROUP8:
				return group8 != null && !group8.isEmpty();
			case UmlPackage.USE_CASE__INCLUDE:
				return !getInclude().isEmpty();
			case UmlPackage.USE_CASE__EXTEND:
				return !getExtend().isEmpty();
			case UmlPackage.USE_CASE__EXTENSION_POINT:
				return !getExtensionPoint().isEmpty();
			case UmlPackage.USE_CASE__SUBJECT:
				return !getSubject().isEmpty();
			case UmlPackage.USE_CASE__SUBJECT1:
				return SUBJECT1_EDEFAULT == null ? subject1 != null : !SUBJECT1_EDEFAULT.equals(subject1);
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
		result.append(" (group8: ");
		result.append(group8);
		result.append(", subject1: ");
		result.append(subject1);
		result.append(')');
		return result.toString();
	}

} //UseCaseImpl
