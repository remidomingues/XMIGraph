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

import org.eclipse.uml2._1._0._0.uml.ConnectableElement;
import org.eclipse.uml2._1._0._0.uml.ConnectorEnd;
import org.eclipse.uml2._1._0._0.uml.TemplateParameter;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConnectableElementImpl#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConnectableElementImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConnectableElementImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConnectableElementImpl#getEnd1 <em>End1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConnectableElementImpl#getTemplateParameter1 <em>Template Parameter1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectableElementImpl extends NamedElementImpl implements ConnectableElement
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
	 * The default value of the '{@link #getTemplateParameter1() <em>Template Parameter1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter1()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_PARAMETER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateParameter1() <em>Template Parameter1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter1()
	 * @generated
	 * @ordered
	 */
	protected String templateParameter1 = TEMPLATE_PARAMETER1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectableElementImpl()
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
		return UmlPackage.eINSTANCE.getConnectableElement();
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
			group5 = new BasicFeatureMap(this, UmlPackage.CONNECTABLE_ELEMENT__GROUP5);
		}
		return group5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateParameter> getTemplateParameter()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getConnectableElement_TemplateParameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorEnd> getEnd()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getConnectableElement_End());
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CONNECTABLE_ELEMENT__END1, oldEnd1, end1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplateParameter1()
	{
		return templateParameter1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameter1(String newTemplateParameter1)
	{
		String oldTemplateParameter1 = templateParameter1;
		templateParameter1 = newTemplateParameter1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER1, oldTemplateParameter1, templateParameter1));
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
			case UmlPackage.CONNECTABLE_ELEMENT__GROUP5:
				return ((InternalEList<?>)getGroup5()).basicRemove(otherEnd, msgs);
			case UmlPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER:
				return ((InternalEList<?>)getTemplateParameter()).basicRemove(otherEnd, msgs);
			case UmlPackage.CONNECTABLE_ELEMENT__END:
				return ((InternalEList<?>)getEnd()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.CONNECTABLE_ELEMENT__GROUP5:
				if (coreType) return getGroup5();
				return ((FeatureMap.Internal)getGroup5()).getWrapper();
			case UmlPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER:
				return getTemplateParameter();
			case UmlPackage.CONNECTABLE_ELEMENT__END:
				return getEnd();
			case UmlPackage.CONNECTABLE_ELEMENT__END1:
				return getEnd1();
			case UmlPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER1:
				return getTemplateParameter1();
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
			case UmlPackage.CONNECTABLE_ELEMENT__GROUP5:
				((FeatureMap.Internal)getGroup5()).set(newValue);
				return;
			case UmlPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER:
				getTemplateParameter().clear();
				getTemplateParameter().addAll((Collection<? extends TemplateParameter>)newValue);
				return;
			case UmlPackage.CONNECTABLE_ELEMENT__END:
				getEnd().clear();
				getEnd().addAll((Collection<? extends ConnectorEnd>)newValue);
				return;
			case UmlPackage.CONNECTABLE_ELEMENT__END1:
				setEnd1((String)newValue);
				return;
			case UmlPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER1:
				setTemplateParameter1((String)newValue);
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
			case UmlPackage.CONNECTABLE_ELEMENT__GROUP5:
				getGroup5().clear();
				return;
			case UmlPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER:
				getTemplateParameter().clear();
				return;
			case UmlPackage.CONNECTABLE_ELEMENT__END:
				getEnd().clear();
				return;
			case UmlPackage.CONNECTABLE_ELEMENT__END1:
				setEnd1(END1_EDEFAULT);
				return;
			case UmlPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER1:
				setTemplateParameter1(TEMPLATE_PARAMETER1_EDEFAULT);
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
			case UmlPackage.CONNECTABLE_ELEMENT__GROUP5:
				return group5 != null && !group5.isEmpty();
			case UmlPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER:
				return !getTemplateParameter().isEmpty();
			case UmlPackage.CONNECTABLE_ELEMENT__END:
				return !getEnd().isEmpty();
			case UmlPackage.CONNECTABLE_ELEMENT__END1:
				return END1_EDEFAULT == null ? end1 != null : !END1_EDEFAULT.equals(end1);
			case UmlPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER1:
				return TEMPLATE_PARAMETER1_EDEFAULT == null ? templateParameter1 != null : !TEMPLATE_PARAMETER1_EDEFAULT.equals(templateParameter1);
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
		result.append(", end1: ");
		result.append(end1);
		result.append(", templateParameter1: ");
		result.append(templateParameter1);
		result.append(')');
		return result.toString();
	}

} //ConnectableElementImpl
