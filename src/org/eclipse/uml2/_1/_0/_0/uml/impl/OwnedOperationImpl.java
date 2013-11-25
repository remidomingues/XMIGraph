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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2._1._0._0.uml.OwnedOperation;
import org.eclipse.uml2._1._0._0.uml.OwnedParameter;
import org.eclipse.uml2._1._0._0.uml.OwnedRule;
import org.eclipse.uml2._1._0._0.uml.Referenced;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Owned Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OwnedOperationImpl#getRaisedException <em>Raised Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OwnedOperationImpl#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OwnedOperationImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwnedOperationImpl extends IsAbstractIsStaticImpl implements OwnedOperation
{
	/**
	 * The cached value of the '{@link #getRaisedException() <em>Raised Exception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaisedException()
	 * @generated
	 * @ordered
	 */
	protected EList<Referenced> raisedException;

	/**
	 * The cached value of the '{@link #getOwnedRule() <em>Owned Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRule()
	 * @generated
	 * @ordered
	 */
	protected OwnedRule ownedRule;

	/**
	 * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<OwnedParameter> ownedParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnedOperationImpl()
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
		return UmlPackage.eINSTANCE.getOwnedOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Referenced> getRaisedException()
	{
		if (raisedException == null)
		{
			raisedException = new EObjectContainmentEList<Referenced>(Referenced.class, this, UmlPackage.OWNED_OPERATION__RAISED_EXCEPTION);
		}
		return raisedException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnedRule getOwnedRule()
	{
		return ownedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedRule(OwnedRule newOwnedRule, NotificationChain msgs)
	{
		OwnedRule oldOwnedRule = ownedRule;
		ownedRule = newOwnedRule;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_OPERATION__OWNED_RULE, oldOwnedRule, newOwnedRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedRule(OwnedRule newOwnedRule)
	{
		if (newOwnedRule != ownedRule)
		{
			NotificationChain msgs = null;
			if (ownedRule != null)
				msgs = ((InternalEObject)ownedRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_OPERATION__OWNED_RULE, null, msgs);
			if (newOwnedRule != null)
				msgs = ((InternalEObject)newOwnedRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_OPERATION__OWNED_RULE, null, msgs);
			msgs = basicSetOwnedRule(newOwnedRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_OPERATION__OWNED_RULE, newOwnedRule, newOwnedRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OwnedParameter> getOwnedParameter()
	{
		if (ownedParameter == null)
		{
			ownedParameter = new EObjectContainmentEList<OwnedParameter>(OwnedParameter.class, this, UmlPackage.OWNED_OPERATION__OWNED_PARAMETER);
		}
		return ownedParameter;
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
			case UmlPackage.OWNED_OPERATION__RAISED_EXCEPTION:
				return ((InternalEList<?>)getRaisedException()).basicRemove(otherEnd, msgs);
			case UmlPackage.OWNED_OPERATION__OWNED_RULE:
				return basicSetOwnedRule(null, msgs);
			case UmlPackage.OWNED_OPERATION__OWNED_PARAMETER:
				return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.OWNED_OPERATION__RAISED_EXCEPTION:
				return getRaisedException();
			case UmlPackage.OWNED_OPERATION__OWNED_RULE:
				return getOwnedRule();
			case UmlPackage.OWNED_OPERATION__OWNED_PARAMETER:
				return getOwnedParameter();
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
			case UmlPackage.OWNED_OPERATION__RAISED_EXCEPTION:
				getRaisedException().clear();
				getRaisedException().addAll((Collection<? extends Referenced>)newValue);
				return;
			case UmlPackage.OWNED_OPERATION__OWNED_RULE:
				setOwnedRule((OwnedRule)newValue);
				return;
			case UmlPackage.OWNED_OPERATION__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends OwnedParameter>)newValue);
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
			case UmlPackage.OWNED_OPERATION__RAISED_EXCEPTION:
				getRaisedException().clear();
				return;
			case UmlPackage.OWNED_OPERATION__OWNED_RULE:
				setOwnedRule((OwnedRule)null);
				return;
			case UmlPackage.OWNED_OPERATION__OWNED_PARAMETER:
				getOwnedParameter().clear();
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
			case UmlPackage.OWNED_OPERATION__RAISED_EXCEPTION:
				return raisedException != null && !raisedException.isEmpty();
			case UmlPackage.OWNED_OPERATION__OWNED_RULE:
				return ownedRule != null;
			case UmlPackage.OWNED_OPERATION__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OwnedOperationImpl
