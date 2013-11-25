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

import org.eclipse.uml2._1._0._0.uml.Clause;
import org.eclipse.uml2._1._0._0.uml.ConditionalNode;
import org.eclipse.uml2._1._0._0.uml.OutputPin;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConditionalNodeImpl#getGroup9 <em>Group9</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConditionalNodeImpl#getClause <em>Clause</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConditionalNodeImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConditionalNodeImpl#getIsAssured <em>Is Assured</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConditionalNodeImpl#getIsDeterminate <em>Is Determinate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalNodeImpl extends StructuredActivityNodeImpl implements ConditionalNode
{
	/**
	 * The cached value of the '{@link #getGroup9() <em>Group9</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup9()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group9;

	/**
	 * The default value of the '{@link #getIsAssured() <em>Is Assured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAssured()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_ASSURED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsAssured() <em>Is Assured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAssured()
	 * @generated
	 * @ordered
	 */
	protected String isAssured = IS_ASSURED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsDeterminate() <em>Is Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDeterminate()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_DETERMINATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDeterminate() <em>Is Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDeterminate()
	 * @generated
	 * @ordered
	 */
	protected String isDeterminate = IS_DETERMINATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalNodeImpl()
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
		return UmlPackage.eINSTANCE.getConditionalNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup9()
	{
		if (group9 == null)
		{
			group9 = new BasicFeatureMap(this, UmlPackage.CONDITIONAL_NODE__GROUP9);
		}
		return group9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clause> getClause()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getConditionalNode_Clause());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getResult()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getConditionalNode_Result());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsAssured()
	{
		return isAssured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAssured(String newIsAssured)
	{
		String oldIsAssured = isAssured;
		isAssured = newIsAssured;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CONDITIONAL_NODE__IS_ASSURED, oldIsAssured, isAssured));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsDeterminate()
	{
		return isDeterminate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDeterminate(String newIsDeterminate)
	{
		String oldIsDeterminate = isDeterminate;
		isDeterminate = newIsDeterminate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CONDITIONAL_NODE__IS_DETERMINATE, oldIsDeterminate, isDeterminate));
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
			case UmlPackage.CONDITIONAL_NODE__GROUP9:
				return ((InternalEList<?>)getGroup9()).basicRemove(otherEnd, msgs);
			case UmlPackage.CONDITIONAL_NODE__CLAUSE:
				return ((InternalEList<?>)getClause()).basicRemove(otherEnd, msgs);
			case UmlPackage.CONDITIONAL_NODE__RESULT:
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
			case UmlPackage.CONDITIONAL_NODE__GROUP9:
				if (coreType) return getGroup9();
				return ((FeatureMap.Internal)getGroup9()).getWrapper();
			case UmlPackage.CONDITIONAL_NODE__CLAUSE:
				return getClause();
			case UmlPackage.CONDITIONAL_NODE__RESULT:
				return getResult();
			case UmlPackage.CONDITIONAL_NODE__IS_ASSURED:
				return getIsAssured();
			case UmlPackage.CONDITIONAL_NODE__IS_DETERMINATE:
				return getIsDeterminate();
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
			case UmlPackage.CONDITIONAL_NODE__GROUP9:
				((FeatureMap.Internal)getGroup9()).set(newValue);
				return;
			case UmlPackage.CONDITIONAL_NODE__CLAUSE:
				getClause().clear();
				getClause().addAll((Collection<? extends Clause>)newValue);
				return;
			case UmlPackage.CONDITIONAL_NODE__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case UmlPackage.CONDITIONAL_NODE__IS_ASSURED:
				setIsAssured((String)newValue);
				return;
			case UmlPackage.CONDITIONAL_NODE__IS_DETERMINATE:
				setIsDeterminate((String)newValue);
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
			case UmlPackage.CONDITIONAL_NODE__GROUP9:
				getGroup9().clear();
				return;
			case UmlPackage.CONDITIONAL_NODE__CLAUSE:
				getClause().clear();
				return;
			case UmlPackage.CONDITIONAL_NODE__RESULT:
				getResult().clear();
				return;
			case UmlPackage.CONDITIONAL_NODE__IS_ASSURED:
				setIsAssured(IS_ASSURED_EDEFAULT);
				return;
			case UmlPackage.CONDITIONAL_NODE__IS_DETERMINATE:
				setIsDeterminate(IS_DETERMINATE_EDEFAULT);
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
			case UmlPackage.CONDITIONAL_NODE__GROUP9:
				return group9 != null && !group9.isEmpty();
			case UmlPackage.CONDITIONAL_NODE__CLAUSE:
				return !getClause().isEmpty();
			case UmlPackage.CONDITIONAL_NODE__RESULT:
				return !getResult().isEmpty();
			case UmlPackage.CONDITIONAL_NODE__IS_ASSURED:
				return IS_ASSURED_EDEFAULT == null ? isAssured != null : !IS_ASSURED_EDEFAULT.equals(isAssured);
			case UmlPackage.CONDITIONAL_NODE__IS_DETERMINATE:
				return IS_DETERMINATE_EDEFAULT == null ? isDeterminate != null : !IS_DETERMINATE_EDEFAULT.equals(isDeterminate);
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
		result.append(" (group9: ");
		result.append(group9);
		result.append(", isAssured: ");
		result.append(isAssured);
		result.append(", isDeterminate: ");
		result.append(isDeterminate);
		result.append(')');
		return result.toString();
	}

} //ConditionalNodeImpl
