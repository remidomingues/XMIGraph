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

import org.eclipse.uml2._1._0._0.uml.InputPin;
import org.eclipse.uml2._1._0._0.uml.Property;
import org.eclipse.uml2._1._0._0.uml.QualifierValue;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualifier Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.QualifierValueImpl#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.QualifierValueImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.QualifierValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.QualifierValueImpl#getQualifier1 <em>Qualifier1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.QualifierValueImpl#getValue1 <em>Value1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualifierValueImpl extends ElementImpl implements QualifierValue
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
	 * The default value of the '{@link #getQualifier1() <em>Qualifier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier1()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifier1() <em>Qualifier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier1()
	 * @generated
	 * @ordered
	 */
	protected String qualifier1 = QUALIFIER1_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue1() <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue1() <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1()
	 * @generated
	 * @ordered
	 */
	protected String value1 = VALUE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualifierValueImpl()
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
		return UmlPackage.eINSTANCE.getQualifierValue();
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
			group3 = new BasicFeatureMap(this, UmlPackage.QUALIFIER_VALUE__GROUP3);
		}
		return group3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getQualifier()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getQualifierValue_Qualifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getValue()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getQualifierValue_Value());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifier1()
	{
		return qualifier1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier1(String newQualifier1)
	{
		String oldQualifier1 = qualifier1;
		qualifier1 = newQualifier1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.QUALIFIER_VALUE__QUALIFIER1, oldQualifier1, qualifier1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue1()
	{
		return value1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue1(String newValue1)
	{
		String oldValue1 = value1;
		value1 = newValue1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.QUALIFIER_VALUE__VALUE1, oldValue1, value1));
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
			case UmlPackage.QUALIFIER_VALUE__GROUP3:
				return ((InternalEList<?>)getGroup3()).basicRemove(otherEnd, msgs);
			case UmlPackage.QUALIFIER_VALUE__QUALIFIER:
				return ((InternalEList<?>)getQualifier()).basicRemove(otherEnd, msgs);
			case UmlPackage.QUALIFIER_VALUE__VALUE:
				return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.QUALIFIER_VALUE__GROUP3:
				if (coreType) return getGroup3();
				return ((FeatureMap.Internal)getGroup3()).getWrapper();
			case UmlPackage.QUALIFIER_VALUE__QUALIFIER:
				return getQualifier();
			case UmlPackage.QUALIFIER_VALUE__VALUE:
				return getValue();
			case UmlPackage.QUALIFIER_VALUE__QUALIFIER1:
				return getQualifier1();
			case UmlPackage.QUALIFIER_VALUE__VALUE1:
				return getValue1();
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
			case UmlPackage.QUALIFIER_VALUE__GROUP3:
				((FeatureMap.Internal)getGroup3()).set(newValue);
				return;
			case UmlPackage.QUALIFIER_VALUE__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends Property>)newValue);
				return;
			case UmlPackage.QUALIFIER_VALUE__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends InputPin>)newValue);
				return;
			case UmlPackage.QUALIFIER_VALUE__QUALIFIER1:
				setQualifier1((String)newValue);
				return;
			case UmlPackage.QUALIFIER_VALUE__VALUE1:
				setValue1((String)newValue);
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
			case UmlPackage.QUALIFIER_VALUE__GROUP3:
				getGroup3().clear();
				return;
			case UmlPackage.QUALIFIER_VALUE__QUALIFIER:
				getQualifier().clear();
				return;
			case UmlPackage.QUALIFIER_VALUE__VALUE:
				getValue().clear();
				return;
			case UmlPackage.QUALIFIER_VALUE__QUALIFIER1:
				setQualifier1(QUALIFIER1_EDEFAULT);
				return;
			case UmlPackage.QUALIFIER_VALUE__VALUE1:
				setValue1(VALUE1_EDEFAULT);
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
			case UmlPackage.QUALIFIER_VALUE__GROUP3:
				return group3 != null && !group3.isEmpty();
			case UmlPackage.QUALIFIER_VALUE__QUALIFIER:
				return !getQualifier().isEmpty();
			case UmlPackage.QUALIFIER_VALUE__VALUE:
				return !getValue().isEmpty();
			case UmlPackage.QUALIFIER_VALUE__QUALIFIER1:
				return QUALIFIER1_EDEFAULT == null ? qualifier1 != null : !QUALIFIER1_EDEFAULT.equals(qualifier1);
			case UmlPackage.QUALIFIER_VALUE__VALUE1:
				return VALUE1_EDEFAULT == null ? value1 != null : !VALUE1_EDEFAULT.equals(value1);
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
		result.append(", qualifier1: ");
		result.append(qualifier1);
		result.append(", value1: ");
		result.append(value1);
		result.append(')');
		return result.toString();
	}

} //QualifierValueImpl
