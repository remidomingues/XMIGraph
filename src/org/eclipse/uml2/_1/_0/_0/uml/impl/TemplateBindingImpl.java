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

import org.eclipse.uml2._1._0._0.uml.TemplateBinding;
import org.eclipse.uml2._1._0._0.uml.TemplateParameterSubstitution;
import org.eclipse.uml2._1._0._0.uml.TemplateSignature;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TemplateBindingImpl#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TemplateBindingImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TemplateBindingImpl#getParameterSubstitution <em>Parameter Substitution</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TemplateBindingImpl#getSignature1 <em>Signature1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateBindingImpl extends DirectedRelationshipImpl implements TemplateBinding
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
	 * The default value of the '{@link #getSignature1() <em>Signature1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature1()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignature1() <em>Signature1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature1()
	 * @generated
	 * @ordered
	 */
	protected String signature1 = SIGNATURE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateBindingImpl()
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
		return UmlPackage.eINSTANCE.getTemplateBinding();
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
			group3 = new BasicFeatureMap(this, UmlPackage.TEMPLATE_BINDING__GROUP3);
		}
		return group3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateSignature> getSignature()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getTemplateBinding_Signature());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateParameterSubstitution> getParameterSubstitution()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getTemplateBinding_ParameterSubstitution());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignature1()
	{
		return signature1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature1(String newSignature1)
	{
		String oldSignature1 = signature1;
		signature1 = newSignature1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TEMPLATE_BINDING__SIGNATURE1, oldSignature1, signature1));
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
			case UmlPackage.TEMPLATE_BINDING__GROUP3:
				return ((InternalEList<?>)getGroup3()).basicRemove(otherEnd, msgs);
			case UmlPackage.TEMPLATE_BINDING__SIGNATURE:
				return ((InternalEList<?>)getSignature()).basicRemove(otherEnd, msgs);
			case UmlPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
				return ((InternalEList<?>)getParameterSubstitution()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.TEMPLATE_BINDING__GROUP3:
				if (coreType) return getGroup3();
				return ((FeatureMap.Internal)getGroup3()).getWrapper();
			case UmlPackage.TEMPLATE_BINDING__SIGNATURE:
				return getSignature();
			case UmlPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
				return getParameterSubstitution();
			case UmlPackage.TEMPLATE_BINDING__SIGNATURE1:
				return getSignature1();
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
			case UmlPackage.TEMPLATE_BINDING__GROUP3:
				((FeatureMap.Internal)getGroup3()).set(newValue);
				return;
			case UmlPackage.TEMPLATE_BINDING__SIGNATURE:
				getSignature().clear();
				getSignature().addAll((Collection<? extends TemplateSignature>)newValue);
				return;
			case UmlPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
				getParameterSubstitution().clear();
				getParameterSubstitution().addAll((Collection<? extends TemplateParameterSubstitution>)newValue);
				return;
			case UmlPackage.TEMPLATE_BINDING__SIGNATURE1:
				setSignature1((String)newValue);
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
			case UmlPackage.TEMPLATE_BINDING__GROUP3:
				getGroup3().clear();
				return;
			case UmlPackage.TEMPLATE_BINDING__SIGNATURE:
				getSignature().clear();
				return;
			case UmlPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
				getParameterSubstitution().clear();
				return;
			case UmlPackage.TEMPLATE_BINDING__SIGNATURE1:
				setSignature1(SIGNATURE1_EDEFAULT);
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
			case UmlPackage.TEMPLATE_BINDING__GROUP3:
				return group3 != null && !group3.isEmpty();
			case UmlPackage.TEMPLATE_BINDING__SIGNATURE:
				return !getSignature().isEmpty();
			case UmlPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
				return !getParameterSubstitution().isEmpty();
			case UmlPackage.TEMPLATE_BINDING__SIGNATURE1:
				return SIGNATURE1_EDEFAULT == null ? signature1 != null : !SIGNATURE1_EDEFAULT.equals(signature1);
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
		result.append(", signature1: ");
		result.append(signature1);
		result.append(')');
		return result.toString();
	}

} //TemplateBindingImpl
