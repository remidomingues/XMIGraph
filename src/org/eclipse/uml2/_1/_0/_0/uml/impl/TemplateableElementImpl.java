/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.uml2._1._0._0.uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2._1._0._0.uml.TemplateBinding;
import org.eclipse.uml2._1._0._0.uml.TemplateSignature;
import org.eclipse.uml2._1._0._0.uml.TemplateableElement;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Templateable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TemplateableElementImpl#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TemplateableElementImpl#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TemplateableElementImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateableElementImpl extends ElementImpl implements TemplateableElement
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateableElementImpl()
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
		return UmlPackage.eINSTANCE.getTemplateableElement();
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
			group3 = new BasicFeatureMap(this, UmlPackage.TEMPLATEABLE_ELEMENT__GROUP3);
		}
		return group3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateBinding> getTemplateBinding()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getTemplateableElement_TemplateBinding());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateSignature> getOwnedTemplateSignature()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getTemplateableElement_OwnedTemplateSignature());
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
			case UmlPackage.TEMPLATEABLE_ELEMENT__GROUP3:
				return ((InternalEList<?>)getGroup3()).basicRemove(otherEnd, msgs);
			case UmlPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
				return ((InternalEList<?>)getTemplateBinding()).basicRemove(otherEnd, msgs);
			case UmlPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				return ((InternalEList<?>)getOwnedTemplateSignature()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.TEMPLATEABLE_ELEMENT__GROUP3:
				if (coreType) return getGroup3();
				return ((FeatureMap.Internal)getGroup3()).getWrapper();
			case UmlPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
				return getTemplateBinding();
			case UmlPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
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
			case UmlPackage.TEMPLATEABLE_ELEMENT__GROUP3:
				((FeatureMap.Internal)getGroup3()).set(newValue);
				return;
			case UmlPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
				getTemplateBinding().clear();
				getTemplateBinding().addAll((Collection<? extends TemplateBinding>)newValue);
				return;
			case UmlPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				getOwnedTemplateSignature().clear();
				getOwnedTemplateSignature().addAll((Collection<? extends TemplateSignature>)newValue);
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
			case UmlPackage.TEMPLATEABLE_ELEMENT__GROUP3:
				getGroup3().clear();
				return;
			case UmlPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
				getTemplateBinding().clear();
				return;
			case UmlPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				getOwnedTemplateSignature().clear();
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
			case UmlPackage.TEMPLATEABLE_ELEMENT__GROUP3:
				return group3 != null && !group3.isEmpty();
			case UmlPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
				return !getTemplateBinding().isEmpty();
			case UmlPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				return !getOwnedTemplateSignature().isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //TemplateableElementImpl
