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
import org.eclipse.uml2._1._0._0.uml.TemplateParameterSubstitution;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Parameter Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TemplateParameterSubstitutionImpl#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TemplateParameterSubstitutionImpl#getFormal <em>Formal</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TemplateParameterSubstitutionImpl#getActual <em>Actual</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TemplateParameterSubstitutionImpl#getOwnedActual <em>Owned Actual</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TemplateParameterSubstitutionImpl#getActual1 <em>Actual1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.TemplateParameterSubstitutionImpl#getFormal1 <em>Formal1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateParameterSubstitutionImpl extends ElementImpl implements TemplateParameterSubstitution
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
	 * The default value of the '{@link #getActual1() <em>Actual1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActual1()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTUAL1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActual1() <em>Actual1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActual1()
	 * @generated
	 * @ordered
	 */
	protected String actual1 = ACTUAL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormal1() <em>Formal1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormal1()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAL1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormal1() <em>Formal1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormal1()
	 * @generated
	 * @ordered
	 */
	protected String formal1 = FORMAL1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateParameterSubstitutionImpl()
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
		return UmlPackage.eINSTANCE.getTemplateParameterSubstitution();
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
			group3 = new BasicFeatureMap(this, UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__GROUP3);
		}
		return group3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateParameter> getFormal()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getTemplateParameterSubstitution_Formal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterableElement> getActual()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getTemplateParameterSubstitution_Actual());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterableElement> getOwnedActual()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActual1()
	{
		return actual1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActual1(String newActual1)
	{
		String oldActual1 = actual1;
		actual1 = newActual1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL1, oldActual1, actual1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormal1()
	{
		return formal1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormal1(String newFormal1)
	{
		String oldFormal1 = formal1;
		formal1 = newFormal1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL1, oldFormal1, formal1));
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
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__GROUP3:
				return ((InternalEList<?>)getGroup3()).basicRemove(otherEnd, msgs);
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
				return ((InternalEList<?>)getFormal()).basicRemove(otherEnd, msgs);
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
				return ((InternalEList<?>)getActual()).basicRemove(otherEnd, msgs);
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
				return ((InternalEList<?>)getOwnedActual()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__GROUP3:
				if (coreType) return getGroup3();
				return ((FeatureMap.Internal)getGroup3()).getWrapper();
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
				return getFormal();
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
				return getActual();
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
				return getOwnedActual();
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL1:
				return getActual1();
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL1:
				return getFormal1();
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
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__GROUP3:
				((FeatureMap.Internal)getGroup3()).set(newValue);
				return;
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
				getFormal().clear();
				getFormal().addAll((Collection<? extends TemplateParameter>)newValue);
				return;
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
				getActual().clear();
				getActual().addAll((Collection<? extends ParameterableElement>)newValue);
				return;
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
				getOwnedActual().clear();
				getOwnedActual().addAll((Collection<? extends ParameterableElement>)newValue);
				return;
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL1:
				setActual1((String)newValue);
				return;
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL1:
				setFormal1((String)newValue);
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
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__GROUP3:
				getGroup3().clear();
				return;
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
				getFormal().clear();
				return;
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
				getActual().clear();
				return;
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
				getOwnedActual().clear();
				return;
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL1:
				setActual1(ACTUAL1_EDEFAULT);
				return;
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL1:
				setFormal1(FORMAL1_EDEFAULT);
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
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__GROUP3:
				return group3 != null && !group3.isEmpty();
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
				return !getFormal().isEmpty();
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
				return !getActual().isEmpty();
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
				return !getOwnedActual().isEmpty();
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL1:
				return ACTUAL1_EDEFAULT == null ? actual1 != null : !ACTUAL1_EDEFAULT.equals(actual1);
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL1:
				return FORMAL1_EDEFAULT == null ? formal1 != null : !FORMAL1_EDEFAULT.equals(formal1);
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
		result.append(", actual1: ");
		result.append(actual1);
		result.append(", formal1: ");
		result.append(formal1);
		result.append(')');
		return result.toString();
	}

} //TemplateParameterSubstitutionImpl
