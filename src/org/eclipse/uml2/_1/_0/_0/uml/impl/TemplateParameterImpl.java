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

import org.eclipse.uml2._1._0._0.uml.ParameterableElement;
import org.eclipse.uml2._1._0._0.uml.TemplateParameter;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TemplateParameterImpl#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TemplateParameterImpl#getParameteredElement <em>Parametered Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TemplateParameterImpl#getOwnedParameteredElement <em>Owned Parametered Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TemplateParameterImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TemplateParameterImpl#getOwnedDefault <em>Owned Default</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TemplateParameterImpl#getDefault1 <em>Default1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TemplateParameterImpl#getParameteredElement1 <em>Parametered Element1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateParameterImpl extends ElementImpl implements TemplateParameter
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
	 * The default value of the '{@link #getDefault1() <em>Default1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault1()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault1() <em>Default1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault1()
	 * @generated
	 * @ordered
	 */
	protected String default1 = DEFAULT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameteredElement1() <em>Parametered Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameteredElement1()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETERED_ELEMENT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameteredElement1() <em>Parametered Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameteredElement1()
	 * @generated
	 * @ordered
	 */
	protected String parameteredElement1 = PARAMETERED_ELEMENT1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateParameterImpl()
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
		return UmlPackage.eINSTANCE.getTemplateParameter();
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
			group3 = new BasicFeatureMap(this, UmlPackage.TEMPLATE_PARAMETER__GROUP3);
		}
		return group3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterableElement> getParameteredElement()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getTemplateParameter_ParameteredElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterableElement> getOwnedParameteredElement()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterableElement> getDefault()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getTemplateParameter_Default());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterableElement> getOwnedDefault()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault1()
	{
		return default1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault1(String newDefault1)
	{
		String oldDefault1 = default1;
		default1 = newDefault1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TEMPLATE_PARAMETER__DEFAULT1, oldDefault1, default1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameteredElement1()
	{
		return parameteredElement1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameteredElement1(String newParameteredElement1)
	{
		String oldParameteredElement1 = parameteredElement1;
		parameteredElement1 = newParameteredElement1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT1, oldParameteredElement1, parameteredElement1));
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
			case UmlPackage.TEMPLATE_PARAMETER__GROUP3:
				return ((InternalEList<?>)getGroup3()).basicRemove(otherEnd, msgs);
			case UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				return ((InternalEList<?>)getParameteredElement()).basicRemove(otherEnd, msgs);
			case UmlPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				return ((InternalEList<?>)getOwnedParameteredElement()).basicRemove(otherEnd, msgs);
			case UmlPackage.TEMPLATE_PARAMETER__DEFAULT:
				return ((InternalEList<?>)getDefault()).basicRemove(otherEnd, msgs);
			case UmlPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT:
				return ((InternalEList<?>)getOwnedDefault()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.TEMPLATE_PARAMETER__GROUP3:
				if (coreType) return getGroup3();
				return ((FeatureMap.Internal)getGroup3()).getWrapper();
			case UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				return getParameteredElement();
			case UmlPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				return getOwnedParameteredElement();
			case UmlPackage.TEMPLATE_PARAMETER__DEFAULT:
				return getDefault();
			case UmlPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT:
				return getOwnedDefault();
			case UmlPackage.TEMPLATE_PARAMETER__DEFAULT1:
				return getDefault1();
			case UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT1:
				return getParameteredElement1();
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
			case UmlPackage.TEMPLATE_PARAMETER__GROUP3:
				((FeatureMap.Internal)getGroup3()).set(newValue);
				return;
			case UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				getParameteredElement().clear();
				getParameteredElement().addAll((Collection<? extends ParameterableElement>)newValue);
				return;
			case UmlPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				getOwnedParameteredElement().clear();
				getOwnedParameteredElement().addAll((Collection<? extends ParameterableElement>)newValue);
				return;
			case UmlPackage.TEMPLATE_PARAMETER__DEFAULT:
				getDefault().clear();
				getDefault().addAll((Collection<? extends ParameterableElement>)newValue);
				return;
			case UmlPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT:
				getOwnedDefault().clear();
				getOwnedDefault().addAll((Collection<? extends ParameterableElement>)newValue);
				return;
			case UmlPackage.TEMPLATE_PARAMETER__DEFAULT1:
				setDefault1((String)newValue);
				return;
			case UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT1:
				setParameteredElement1((String)newValue);
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
			case UmlPackage.TEMPLATE_PARAMETER__GROUP3:
				getGroup3().clear();
				return;
			case UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				getParameteredElement().clear();
				return;
			case UmlPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				getOwnedParameteredElement().clear();
				return;
			case UmlPackage.TEMPLATE_PARAMETER__DEFAULT:
				getDefault().clear();
				return;
			case UmlPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT:
				getOwnedDefault().clear();
				return;
			case UmlPackage.TEMPLATE_PARAMETER__DEFAULT1:
				setDefault1(DEFAULT1_EDEFAULT);
				return;
			case UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT1:
				setParameteredElement1(PARAMETERED_ELEMENT1_EDEFAULT);
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
			case UmlPackage.TEMPLATE_PARAMETER__GROUP3:
				return group3 != null && !group3.isEmpty();
			case UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				return !getParameteredElement().isEmpty();
			case UmlPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				return !getOwnedParameteredElement().isEmpty();
			case UmlPackage.TEMPLATE_PARAMETER__DEFAULT:
				return !getDefault().isEmpty();
			case UmlPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT:
				return !getOwnedDefault().isEmpty();
			case UmlPackage.TEMPLATE_PARAMETER__DEFAULT1:
				return DEFAULT1_EDEFAULT == null ? default1 != null : !DEFAULT1_EDEFAULT.equals(default1);
			case UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT1:
				return PARAMETERED_ELEMENT1_EDEFAULT == null ? parameteredElement1 != null : !PARAMETERED_ELEMENT1_EDEFAULT.equals(parameteredElement1);
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
		result.append(", default1: ");
		result.append(default1);
		result.append(", parameteredElement1: ");
		result.append(parameteredElement1);
		result.append(')');
		return result.toString();
	}

} //TemplateParameterImpl
