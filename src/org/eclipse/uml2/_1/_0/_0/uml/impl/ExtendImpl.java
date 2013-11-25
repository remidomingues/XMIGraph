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

import org.eclipse.uml2._1._0._0.uml.Constraint;
import org.eclipse.uml2._1._0._0.uml.Extend;
import org.eclipse.uml2._1._0._0.uml.ExtensionPoint;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExtendImpl#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExtendImpl#getExtendedCase <em>Extended Case</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExtendImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExtendImpl#getExtensionLocation <em>Extension Location</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExtendImpl#getExtendedCase1 <em>Extended Case1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExtendImpl#getExtensionLocation1 <em>Extension Location1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendImpl extends NamedElementImpl implements Extend
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
	 * The default value of the '{@link #getExtendedCase1() <em>Extended Case1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedCase1()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDED_CASE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtendedCase1() <em>Extended Case1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedCase1()
	 * @generated
	 * @ordered
	 */
	protected String extendedCase1 = EXTENDED_CASE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtensionLocation1() <em>Extension Location1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionLocation1()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_LOCATION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtensionLocation1() <em>Extension Location1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionLocation1()
	 * @generated
	 * @ordered
	 */
	protected String extensionLocation1 = EXTENSION_LOCATION1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendImpl()
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
		return UmlPackage.eINSTANCE.getExtend();
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
			group5 = new BasicFeatureMap(this, UmlPackage.EXTEND__GROUP5);
		}
		return group5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getExtendedCase()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getExtend_ExtendedCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getCondition()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getExtend_Condition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionPoint> getExtensionLocation()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getExtend_ExtensionLocation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtendedCase1()
	{
		return extendedCase1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedCase1(String newExtendedCase1)
	{
		String oldExtendedCase1 = extendedCase1;
		extendedCase1 = newExtendedCase1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EXTEND__EXTENDED_CASE1, oldExtendedCase1, extendedCase1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtensionLocation1()
	{
		return extensionLocation1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionLocation1(String newExtensionLocation1)
	{
		String oldExtensionLocation1 = extensionLocation1;
		extensionLocation1 = newExtensionLocation1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EXTEND__EXTENSION_LOCATION1, oldExtensionLocation1, extensionLocation1));
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
			case UmlPackage.EXTEND__GROUP5:
				return ((InternalEList<?>)getGroup5()).basicRemove(otherEnd, msgs);
			case UmlPackage.EXTEND__EXTENDED_CASE:
				return ((InternalEList<?>)getExtendedCase()).basicRemove(otherEnd, msgs);
			case UmlPackage.EXTEND__CONDITION:
				return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
			case UmlPackage.EXTEND__EXTENSION_LOCATION:
				return ((InternalEList<?>)getExtensionLocation()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.EXTEND__GROUP5:
				if (coreType) return getGroup5();
				return ((FeatureMap.Internal)getGroup5()).getWrapper();
			case UmlPackage.EXTEND__EXTENDED_CASE:
				return getExtendedCase();
			case UmlPackage.EXTEND__CONDITION:
				return getCondition();
			case UmlPackage.EXTEND__EXTENSION_LOCATION:
				return getExtensionLocation();
			case UmlPackage.EXTEND__EXTENDED_CASE1:
				return getExtendedCase1();
			case UmlPackage.EXTEND__EXTENSION_LOCATION1:
				return getExtensionLocation1();
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
			case UmlPackage.EXTEND__GROUP5:
				((FeatureMap.Internal)getGroup5()).set(newValue);
				return;
			case UmlPackage.EXTEND__EXTENDED_CASE:
				getExtendedCase().clear();
				getExtendedCase().addAll((Collection<? extends UseCase>)newValue);
				return;
			case UmlPackage.EXTEND__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case UmlPackage.EXTEND__EXTENSION_LOCATION:
				getExtensionLocation().clear();
				getExtensionLocation().addAll((Collection<? extends ExtensionPoint>)newValue);
				return;
			case UmlPackage.EXTEND__EXTENDED_CASE1:
				setExtendedCase1((String)newValue);
				return;
			case UmlPackage.EXTEND__EXTENSION_LOCATION1:
				setExtensionLocation1((String)newValue);
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
			case UmlPackage.EXTEND__GROUP5:
				getGroup5().clear();
				return;
			case UmlPackage.EXTEND__EXTENDED_CASE:
				getExtendedCase().clear();
				return;
			case UmlPackage.EXTEND__CONDITION:
				getCondition().clear();
				return;
			case UmlPackage.EXTEND__EXTENSION_LOCATION:
				getExtensionLocation().clear();
				return;
			case UmlPackage.EXTEND__EXTENDED_CASE1:
				setExtendedCase1(EXTENDED_CASE1_EDEFAULT);
				return;
			case UmlPackage.EXTEND__EXTENSION_LOCATION1:
				setExtensionLocation1(EXTENSION_LOCATION1_EDEFAULT);
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
			case UmlPackage.EXTEND__GROUP5:
				return group5 != null && !group5.isEmpty();
			case UmlPackage.EXTEND__EXTENDED_CASE:
				return !getExtendedCase().isEmpty();
			case UmlPackage.EXTEND__CONDITION:
				return !getCondition().isEmpty();
			case UmlPackage.EXTEND__EXTENSION_LOCATION:
				return !getExtensionLocation().isEmpty();
			case UmlPackage.EXTEND__EXTENDED_CASE1:
				return EXTENDED_CASE1_EDEFAULT == null ? extendedCase1 != null : !EXTENDED_CASE1_EDEFAULT.equals(extendedCase1);
			case UmlPackage.EXTEND__EXTENSION_LOCATION1:
				return EXTENSION_LOCATION1_EDEFAULT == null ? extensionLocation1 != null : !EXTENSION_LOCATION1_EDEFAULT.equals(extensionLocation1);
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
		result.append(", extendedCase1: ");
		result.append(extendedCase1);
		result.append(", extensionLocation1: ");
		result.append(extensionLocation1);
		result.append(')');
		return result.toString();
	}

} //ExtendImpl
