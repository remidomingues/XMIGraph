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

import org.eclipse.uml2._1._0._0.uml.RedefinableTemplateSignature;
import org.eclipse.uml2._1._0._0.uml.TemplateParameter;
import org.eclipse.uml2._1._0._0.uml.TemplateSignature;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redefinable Template Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.RedefinableTemplateSignatureImpl#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.RedefinableTemplateSignatureImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.RedefinableTemplateSignatureImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.RedefinableTemplateSignatureImpl#getNestedSignature <em>Nested Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.RedefinableTemplateSignatureImpl#getNestingSignature <em>Nesting Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.RedefinableTemplateSignatureImpl#getNestedSignature1 <em>Nested Signature1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.RedefinableTemplateSignatureImpl#getNestingSignature1 <em>Nesting Signature1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.RedefinableTemplateSignatureImpl#getParameter1 <em>Parameter1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RedefinableTemplateSignatureImpl extends RedefinableElementImpl implements RedefinableTemplateSignature
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
	 * The default value of the '{@link #getNestedSignature1() <em>Nested Signature1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedSignature1()
	 * @generated
	 * @ordered
	 */
	protected static final String NESTED_SIGNATURE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNestedSignature1() <em>Nested Signature1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedSignature1()
	 * @generated
	 * @ordered
	 */
	protected String nestedSignature1 = NESTED_SIGNATURE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getNestingSignature1() <em>Nesting Signature1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestingSignature1()
	 * @generated
	 * @ordered
	 */
	protected static final String NESTING_SIGNATURE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNestingSignature1() <em>Nesting Signature1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestingSignature1()
	 * @generated
	 * @ordered
	 */
	protected String nestingSignature1 = NESTING_SIGNATURE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameter1() <em>Parameter1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter1()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameter1() <em>Parameter1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter1()
	 * @generated
	 * @ordered
	 */
	protected String parameter1 = PARAMETER1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedefinableTemplateSignatureImpl()
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
		return UmlPackage.eINSTANCE.getRedefinableTemplateSignature();
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
			group5 = new BasicFeatureMap(this, UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__GROUP5);
		}
		return group5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateParameter> getParameter()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getRedefinableTemplateSignature_Parameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateParameter> getOwnedParameter()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getRedefinableTemplateSignature_OwnedParameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateSignature> getNestedSignature()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getRedefinableTemplateSignature_NestedSignature());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateSignature> getNestingSignature()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getRedefinableTemplateSignature_NestingSignature());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNestedSignature1()
	{
		return nestedSignature1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestedSignature1(String newNestedSignature1)
	{
		String oldNestedSignature1 = nestedSignature1;
		nestedSignature1 = newNestedSignature1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE1, oldNestedSignature1, nestedSignature1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNestingSignature1()
	{
		return nestingSignature1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestingSignature1(String newNestingSignature1)
	{
		String oldNestingSignature1 = nestingSignature1;
		nestingSignature1 = newNestingSignature1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE1, oldNestingSignature1, nestingSignature1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameter1()
	{
		return parameter1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter1(String newParameter1)
	{
		String oldParameter1 = parameter1;
		parameter1 = newParameter1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER1, oldParameter1, parameter1));
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
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__GROUP5:
				return ((InternalEList<?>)getGroup5()).basicRemove(otherEnd, msgs);
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE:
				return ((InternalEList<?>)getNestedSignature()).basicRemove(otherEnd, msgs);
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE:
				return ((InternalEList<?>)getNestingSignature()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__GROUP5:
				if (coreType) return getGroup5();
				return ((FeatureMap.Internal)getGroup5()).getWrapper();
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
				return getParameter();
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				return getOwnedParameter();
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE:
				return getNestedSignature();
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE:
				return getNestingSignature();
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE1:
				return getNestedSignature1();
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE1:
				return getNestingSignature1();
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER1:
				return getParameter1();
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
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__GROUP5:
				((FeatureMap.Internal)getGroup5()).set(newValue);
				return;
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends TemplateParameter>)newValue);
				return;
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends TemplateParameter>)newValue);
				return;
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE:
				getNestedSignature().clear();
				getNestedSignature().addAll((Collection<? extends TemplateSignature>)newValue);
				return;
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE:
				getNestingSignature().clear();
				getNestingSignature().addAll((Collection<? extends TemplateSignature>)newValue);
				return;
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE1:
				setNestedSignature1((String)newValue);
				return;
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE1:
				setNestingSignature1((String)newValue);
				return;
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER1:
				setParameter1((String)newValue);
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
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__GROUP5:
				getGroup5().clear();
				return;
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
				getParameter().clear();
				return;
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE:
				getNestedSignature().clear();
				return;
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE:
				getNestingSignature().clear();
				return;
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE1:
				setNestedSignature1(NESTED_SIGNATURE1_EDEFAULT);
				return;
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE1:
				setNestingSignature1(NESTING_SIGNATURE1_EDEFAULT);
				return;
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER1:
				setParameter1(PARAMETER1_EDEFAULT);
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
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__GROUP5:
				return group5 != null && !group5.isEmpty();
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
				return !getParameter().isEmpty();
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				return !getOwnedParameter().isEmpty();
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE:
				return !getNestedSignature().isEmpty();
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE:
				return !getNestingSignature().isEmpty();
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE1:
				return NESTED_SIGNATURE1_EDEFAULT == null ? nestedSignature1 != null : !NESTED_SIGNATURE1_EDEFAULT.equals(nestedSignature1);
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE1:
				return NESTING_SIGNATURE1_EDEFAULT == null ? nestingSignature1 != null : !NESTING_SIGNATURE1_EDEFAULT.equals(nestingSignature1);
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER1:
				return PARAMETER1_EDEFAULT == null ? parameter1 != null : !PARAMETER1_EDEFAULT.equals(parameter1);
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
		result.append(", nestedSignature1: ");
		result.append(nestedSignature1);
		result.append(", nestingSignature1: ");
		result.append(nestingSignature1);
		result.append(", parameter1: ");
		result.append(parameter1);
		result.append(')');
		return result.toString();
	}

} //RedefinableTemplateSignatureImpl
