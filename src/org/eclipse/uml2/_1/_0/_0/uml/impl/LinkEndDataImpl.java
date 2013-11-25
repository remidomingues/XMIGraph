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
import org.eclipse.uml2._1._0._0.uml.LinkEndData;
import org.eclipse.uml2._1._0._0.uml.Property;
import org.eclipse.uml2._1._0._0.uml.QualifierValue;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link End Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LinkEndDataImpl#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LinkEndDataImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LinkEndDataImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LinkEndDataImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LinkEndDataImpl#getEnd1 <em>End1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LinkEndDataImpl#getValue1 <em>Value1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkEndDataImpl extends ElementImpl implements LinkEndData
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
	 * The default value of the '{@link #getEnd1() <em>End1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd1()
	 * @generated
	 * @ordered
	 */
	protected static final String END1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd1() <em>End1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd1()
	 * @generated
	 * @ordered
	 */
	protected String end1 = END1_EDEFAULT;

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
	protected LinkEndDataImpl()
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
		return UmlPackage.eINSTANCE.getLinkEndData();
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
			group3 = new BasicFeatureMap(this, UmlPackage.LINK_END_DATA__GROUP3);
		}
		return group3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getValue()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getLinkEndData_Value());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getEnd()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getLinkEndData_End());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QualifierValue> getQualifier()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getLinkEndData_Qualifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnd1()
	{
		return end1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd1(String newEnd1)
	{
		String oldEnd1 = end1;
		end1 = newEnd1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.LINK_END_DATA__END1, oldEnd1, end1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.LINK_END_DATA__VALUE1, oldValue1, value1));
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
			case UmlPackage.LINK_END_DATA__GROUP3:
				return ((InternalEList<?>)getGroup3()).basicRemove(otherEnd, msgs);
			case UmlPackage.LINK_END_DATA__VALUE:
				return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
			case UmlPackage.LINK_END_DATA__END:
				return ((InternalEList<?>)getEnd()).basicRemove(otherEnd, msgs);
			case UmlPackage.LINK_END_DATA__QUALIFIER:
				return ((InternalEList<?>)getQualifier()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.LINK_END_DATA__GROUP3:
				if (coreType) return getGroup3();
				return ((FeatureMap.Internal)getGroup3()).getWrapper();
			case UmlPackage.LINK_END_DATA__VALUE:
				return getValue();
			case UmlPackage.LINK_END_DATA__END:
				return getEnd();
			case UmlPackage.LINK_END_DATA__QUALIFIER:
				return getQualifier();
			case UmlPackage.LINK_END_DATA__END1:
				return getEnd1();
			case UmlPackage.LINK_END_DATA__VALUE1:
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
			case UmlPackage.LINK_END_DATA__GROUP3:
				((FeatureMap.Internal)getGroup3()).set(newValue);
				return;
			case UmlPackage.LINK_END_DATA__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends InputPin>)newValue);
				return;
			case UmlPackage.LINK_END_DATA__END:
				getEnd().clear();
				getEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case UmlPackage.LINK_END_DATA__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends QualifierValue>)newValue);
				return;
			case UmlPackage.LINK_END_DATA__END1:
				setEnd1((String)newValue);
				return;
			case UmlPackage.LINK_END_DATA__VALUE1:
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
			case UmlPackage.LINK_END_DATA__GROUP3:
				getGroup3().clear();
				return;
			case UmlPackage.LINK_END_DATA__VALUE:
				getValue().clear();
				return;
			case UmlPackage.LINK_END_DATA__END:
				getEnd().clear();
				return;
			case UmlPackage.LINK_END_DATA__QUALIFIER:
				getQualifier().clear();
				return;
			case UmlPackage.LINK_END_DATA__END1:
				setEnd1(END1_EDEFAULT);
				return;
			case UmlPackage.LINK_END_DATA__VALUE1:
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
			case UmlPackage.LINK_END_DATA__GROUP3:
				return group3 != null && !group3.isEmpty();
			case UmlPackage.LINK_END_DATA__VALUE:
				return !getValue().isEmpty();
			case UmlPackage.LINK_END_DATA__END:
				return !getEnd().isEmpty();
			case UmlPackage.LINK_END_DATA__QUALIFIER:
				return !getQualifier().isEmpty();
			case UmlPackage.LINK_END_DATA__END1:
				return END1_EDEFAULT == null ? end1 != null : !END1_EDEFAULT.equals(end1);
			case UmlPackage.LINK_END_DATA__VALUE1:
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
		result.append(", end1: ");
		result.append(end1);
		result.append(", value1: ");
		result.append(value1);
		result.append(')');
		return result.toString();
	}

} //LinkEndDataImpl
