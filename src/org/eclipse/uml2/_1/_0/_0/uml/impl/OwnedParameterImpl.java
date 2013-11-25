/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.uml2._1._0._0.uml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2._1._0._0.uml.JType;
import org.eclipse.uml2._1._0._0.uml.OwnedParameter;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Owned Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OwnedParameterImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OwnedParameterImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OwnedParameterImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OwnedParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OwnedParameterImpl#getJType <em>JType</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwnedParameterImpl extends IsAbstractIsStaticImpl implements OwnedParameter
{
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected String direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected Value lowerValue;

	/**
	 * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperValue()
	 * @generated
	 * @ordered
	 */
	protected Value upperValue;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected Value defaultValue;

	/**
	 * The cached value of the '{@link #getJType() <em>JType</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJType()
	 * @generated
	 * @ordered
	 */
	protected JType jType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnedParameterImpl()
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
		return UmlPackage.eINSTANCE.getOwnedParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDirection()
	{
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(String newDirection)
	{
		String oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_PARAMETER__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getLowerValue()
	{
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerValue(Value newLowerValue, NotificationChain msgs)
	{
		Value oldLowerValue = lowerValue;
		lowerValue = newLowerValue;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_PARAMETER__LOWER_VALUE, oldLowerValue, newLowerValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerValue(Value newLowerValue)
	{
		if (newLowerValue != lowerValue)
		{
			NotificationChain msgs = null;
			if (lowerValue != null)
				msgs = ((InternalEObject)lowerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_PARAMETER__LOWER_VALUE, null, msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject)newLowerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_PARAMETER__LOWER_VALUE, null, msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_PARAMETER__LOWER_VALUE, newLowerValue, newLowerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getUpperValue()
	{
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperValue(Value newUpperValue, NotificationChain msgs)
	{
		Value oldUpperValue = upperValue;
		upperValue = newUpperValue;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_PARAMETER__UPPER_VALUE, oldUpperValue, newUpperValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperValue(Value newUpperValue)
	{
		if (newUpperValue != upperValue)
		{
			NotificationChain msgs = null;
			if (upperValue != null)
				msgs = ((InternalEObject)upperValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_PARAMETER__UPPER_VALUE, null, msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject)newUpperValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_PARAMETER__UPPER_VALUE, null, msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_PARAMETER__UPPER_VALUE, newUpperValue, newUpperValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getDefaultValue()
	{
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(Value newDefaultValue, NotificationChain msgs)
	{
		Value oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_PARAMETER__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(Value newDefaultValue)
	{
		if (newDefaultValue != defaultValue)
		{
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_PARAMETER__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_PARAMETER__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_PARAMETER__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JType getJType()
	{
		return jType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJType(JType newJType, NotificationChain msgs)
	{
		JType oldJType = jType;
		jType = newJType;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_PARAMETER__JTYPE, oldJType, newJType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJType(JType newJType)
	{
		if (newJType != jType)
		{
			NotificationChain msgs = null;
			if (jType != null)
				msgs = ((InternalEObject)jType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_PARAMETER__JTYPE, null, msgs);
			if (newJType != null)
				msgs = ((InternalEObject)newJType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_PARAMETER__JTYPE, null, msgs);
			msgs = basicSetJType(newJType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_PARAMETER__JTYPE, newJType, newJType));
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
			case UmlPackage.OWNED_PARAMETER__LOWER_VALUE:
				return basicSetLowerValue(null, msgs);
			case UmlPackage.OWNED_PARAMETER__UPPER_VALUE:
				return basicSetUpperValue(null, msgs);
			case UmlPackage.OWNED_PARAMETER__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
			case UmlPackage.OWNED_PARAMETER__JTYPE:
				return basicSetJType(null, msgs);
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
			case UmlPackage.OWNED_PARAMETER__DIRECTION:
				return getDirection();
			case UmlPackage.OWNED_PARAMETER__LOWER_VALUE:
				return getLowerValue();
			case UmlPackage.OWNED_PARAMETER__UPPER_VALUE:
				return getUpperValue();
			case UmlPackage.OWNED_PARAMETER__DEFAULT_VALUE:
				return getDefaultValue();
			case UmlPackage.OWNED_PARAMETER__JTYPE:
				return getJType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case UmlPackage.OWNED_PARAMETER__DIRECTION:
				setDirection((String)newValue);
				return;
			case UmlPackage.OWNED_PARAMETER__LOWER_VALUE:
				setLowerValue((Value)newValue);
				return;
			case UmlPackage.OWNED_PARAMETER__UPPER_VALUE:
				setUpperValue((Value)newValue);
				return;
			case UmlPackage.OWNED_PARAMETER__DEFAULT_VALUE:
				setDefaultValue((Value)newValue);
				return;
			case UmlPackage.OWNED_PARAMETER__JTYPE:
				setJType((JType)newValue);
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
			case UmlPackage.OWNED_PARAMETER__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case UmlPackage.OWNED_PARAMETER__LOWER_VALUE:
				setLowerValue((Value)null);
				return;
			case UmlPackage.OWNED_PARAMETER__UPPER_VALUE:
				setUpperValue((Value)null);
				return;
			case UmlPackage.OWNED_PARAMETER__DEFAULT_VALUE:
				setDefaultValue((Value)null);
				return;
			case UmlPackage.OWNED_PARAMETER__JTYPE:
				setJType((JType)null);
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
			case UmlPackage.OWNED_PARAMETER__DIRECTION:
				return DIRECTION_EDEFAULT == null ? direction != null : !DIRECTION_EDEFAULT.equals(direction);
			case UmlPackage.OWNED_PARAMETER__LOWER_VALUE:
				return lowerValue != null;
			case UmlPackage.OWNED_PARAMETER__UPPER_VALUE:
				return upperValue != null;
			case UmlPackage.OWNED_PARAMETER__DEFAULT_VALUE:
				return defaultValue != null;
			case UmlPackage.OWNED_PARAMETER__JTYPE:
				return jType != null;
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
		result.append(" (direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //OwnedParameterImpl
