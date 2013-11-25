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
import org.eclipse.uml2._1._0._0.uml.OutputPin;
import org.eclipse.uml2._1._0._0.uml.Property;
import org.eclipse.uml2._1._0._0.uml.ReadLinkObjectEndAction;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read Link Object End Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReadLinkObjectEndActionImpl#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReadLinkObjectEndActionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReadLinkObjectEndActionImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReadLinkObjectEndActionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReadLinkObjectEndActionImpl#getEnd1 <em>End1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReadLinkObjectEndActionImpl extends ActionImpl implements ReadLinkObjectEndAction
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadLinkObjectEndActionImpl()
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
		return UmlPackage.eINSTANCE.getReadLinkObjectEndAction();
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
			group8 = new BasicFeatureMap(this, UmlPackage.READ_LINK_OBJECT_END_ACTION__GROUP8);
		}
		return group8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getObject()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getReadLinkObjectEndAction_Object());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getEnd()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getReadLinkObjectEndAction_End());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getResult()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getReadLinkObjectEndAction_Result());
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.READ_LINK_OBJECT_END_ACTION__END1, oldEnd1, end1));
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
			case UmlPackage.READ_LINK_OBJECT_END_ACTION__GROUP8:
				return ((InternalEList<?>)getGroup8()).basicRemove(otherEnd, msgs);
			case UmlPackage.READ_LINK_OBJECT_END_ACTION__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
			case UmlPackage.READ_LINK_OBJECT_END_ACTION__END:
				return ((InternalEList<?>)getEnd()).basicRemove(otherEnd, msgs);
			case UmlPackage.READ_LINK_OBJECT_END_ACTION__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.READ_LINK_OBJECT_END_ACTION__GROUP8:
				if (coreType) return getGroup8();
				return ((FeatureMap.Internal)getGroup8()).getWrapper();
			case UmlPackage.READ_LINK_OBJECT_END_ACTION__OBJECT:
				return getObject();
			case UmlPackage.READ_LINK_OBJECT_END_ACTION__END:
				return getEnd();
			case UmlPackage.READ_LINK_OBJECT_END_ACTION__RESULT:
				return getResult();
			case UmlPackage.READ_LINK_OBJECT_END_ACTION__END1:
				return getEnd1();
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
			case UmlPackage.READ_LINK_OBJECT_END_ACTION__GROUP8:
				((FeatureMap.Internal)getGroup8()).set(newValue);
				return;
			case UmlPackage.READ_LINK_OBJECT_END_ACTION__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends InputPin>)newValue);
				return;
			case UmlPackage.READ_LINK_OBJECT_END_ACTION__END:
				getEnd().clear();
				getEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case UmlPackage.READ_LINK_OBJECT_END_ACTION__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case UmlPackage.READ_LINK_OBJECT_END_ACTION__END1:
				setEnd1((String)newValue);
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
			case UmlPackage.READ_LINK_OBJECT_END_ACTION__GROUP8:
				getGroup8().clear();
				return;
			case UmlPackage.READ_LINK_OBJECT_END_ACTION__OBJECT:
				getObject().clear();
				return;
			case UmlPackage.READ_LINK_OBJECT_END_ACTION__END:
				getEnd().clear();
				return;
			case UmlPackage.READ_LINK_OBJECT_END_ACTION__RESULT:
				getResult().clear();
				return;
			case UmlPackage.READ_LINK_OBJECT_END_ACTION__END1:
				setEnd1(END1_EDEFAULT);
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
			case UmlPackage.READ_LINK_OBJECT_END_ACTION__GROUP8:
				return group8 != null && !group8.isEmpty();
			case UmlPackage.READ_LINK_OBJECT_END_ACTION__OBJECT:
				return !getObject().isEmpty();
			case UmlPackage.READ_LINK_OBJECT_END_ACTION__END:
				return !getEnd().isEmpty();
			case UmlPackage.READ_LINK_OBJECT_END_ACTION__RESULT:
				return !getResult().isEmpty();
			case UmlPackage.READ_LINK_OBJECT_END_ACTION__END1:
				return END1_EDEFAULT == null ? end1 != null : !END1_EDEFAULT.equals(end1);
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
		result.append(", end1: ");
		result.append(end1);
		result.append(')');
		return result.toString();
	}

} //ReadLinkObjectEndActionImpl
