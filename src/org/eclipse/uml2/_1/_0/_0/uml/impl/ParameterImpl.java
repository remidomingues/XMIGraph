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

import org.eclipse.uml2._1._0._0.uml.Parameter;
import org.eclipse.uml2._1._0._0.uml.ParameterDirectionKind;
import org.eclipse.uml2._1._0._0.uml.ParameterEffectKind;
import org.eclipse.uml2._1._0._0.uml.ParameterSet;
import org.eclipse.uml2._1._0._0.uml.Type;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ParameterImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ParameterImpl#getType1 <em>Type1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ParameterImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ParameterImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ParameterImpl#getParameterSet <em>Parameter Set</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ParameterImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ParameterImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ParameterImpl#getIsException <em>Is Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ParameterImpl#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ParameterImpl#getIsStream <em>Is Stream</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ParameterImpl#getIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ParameterImpl#getParameterSet1 <em>Parameter Set1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ParameterImpl#getType2 <em>Type2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends ConnectableElementImpl implements Parameter
{
	/**
	 * The cached value of the '{@link #getGroup6() <em>Group6</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup6()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group6;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterDirectionKind DIRECTION_EDEFAULT = ParameterDirectionKind.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected ParameterDirectionKind direction = DIRECTION_EDEFAULT;

	/**
	 * This is true if the Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean directionESet;

	/**
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterEffectKind EFFECT_EDEFAULT = ParameterEffectKind.CREATE;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected ParameterEffectKind effect = EFFECT_EDEFAULT;

	/**
	 * This is true if the Effect attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effectESet;

	/**
	 * The default value of the '{@link #getIsException() <em>Is Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsException()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_EXCEPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsException() <em>Is Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsException()
	 * @generated
	 * @ordered
	 */
	protected String isException = IS_EXCEPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_ORDERED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected String isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsStream() <em>Is Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStream()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_STREAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsStream() <em>Is Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStream()
	 * @generated
	 * @ordered
	 */
	protected String isStream = IS_STREAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_UNIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnique()
	 * @generated
	 * @ordered
	 */
	protected String isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameterSet1() <em>Parameter Set1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterSet1()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_SET1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterSet1() <em>Parameter Set1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterSet1()
	 * @generated
	 * @ordered
	 */
	protected String parameterSet1 = PARAMETER_SET1_EDEFAULT;

	/**
	 * The default value of the '{@link #getType2() <em>Type2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType2()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType2() <em>Type2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType2()
	 * @generated
	 * @ordered
	 */
	protected String type2 = TYPE2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl()
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
		return UmlPackage.eINSTANCE.getParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup6()
	{
		if (group6 == null)
		{
			group6 = new BasicFeatureMap(this, UmlPackage.PARAMETER__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getType1()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getParameter_Type1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getUpperValue()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getParameter_UpperValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getLowerValue()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getParameter_LowerValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getDefaultValue()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getParameter_DefaultValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterSet> getParameterSet()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getParameter_ParameterSet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirectionKind getDirection()
	{
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(ParameterDirectionKind newDirection)
	{
		ParameterDirectionKind oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		boolean oldDirectionESet = directionESet;
		directionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETER__DIRECTION, oldDirection, direction, !oldDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDirection()
	{
		ParameterDirectionKind oldDirection = direction;
		boolean oldDirectionESet = directionESet;
		direction = DIRECTION_EDEFAULT;
		directionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.PARAMETER__DIRECTION, oldDirection, DIRECTION_EDEFAULT, oldDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirection()
	{
		return directionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterEffectKind getEffect()
	{
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(ParameterEffectKind newEffect)
	{
		ParameterEffectKind oldEffect = effect;
		effect = newEffect == null ? EFFECT_EDEFAULT : newEffect;
		boolean oldEffectESet = effectESet;
		effectESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETER__EFFECT, oldEffect, effect, !oldEffectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffect()
	{
		ParameterEffectKind oldEffect = effect;
		boolean oldEffectESet = effectESet;
		effect = EFFECT_EDEFAULT;
		effectESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.PARAMETER__EFFECT, oldEffect, EFFECT_EDEFAULT, oldEffectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffect()
	{
		return effectESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsException()
	{
		return isException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsException(String newIsException)
	{
		String oldIsException = isException;
		isException = newIsException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETER__IS_EXCEPTION, oldIsException, isException));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsOrdered()
	{
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(String newIsOrdered)
	{
		String oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETER__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsStream()
	{
		return isStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStream(String newIsStream)
	{
		String oldIsStream = isStream;
		isStream = newIsStream;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETER__IS_STREAM, oldIsStream, isStream));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsUnique()
	{
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(String newIsUnique)
	{
		String oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETER__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameterSet1()
	{
		return parameterSet1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterSet1(String newParameterSet1)
	{
		String oldParameterSet1 = parameterSet1;
		parameterSet1 = newParameterSet1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETER__PARAMETER_SET1, oldParameterSet1, parameterSet1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType2()
	{
		return type2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType2(String newType2)
	{
		String oldType2 = type2;
		type2 = newType2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETER__TYPE2, oldType2, type2));
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
			case UmlPackage.PARAMETER__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.PARAMETER__TYPE1:
				return ((InternalEList<?>)getType1()).basicRemove(otherEnd, msgs);
			case UmlPackage.PARAMETER__UPPER_VALUE:
				return ((InternalEList<?>)getUpperValue()).basicRemove(otherEnd, msgs);
			case UmlPackage.PARAMETER__LOWER_VALUE:
				return ((InternalEList<?>)getLowerValue()).basicRemove(otherEnd, msgs);
			case UmlPackage.PARAMETER__DEFAULT_VALUE:
				return ((InternalEList<?>)getDefaultValue()).basicRemove(otherEnd, msgs);
			case UmlPackage.PARAMETER__PARAMETER_SET:
				return ((InternalEList<?>)getParameterSet()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.PARAMETER__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.PARAMETER__TYPE1:
				return getType1();
			case UmlPackage.PARAMETER__UPPER_VALUE:
				return getUpperValue();
			case UmlPackage.PARAMETER__LOWER_VALUE:
				return getLowerValue();
			case UmlPackage.PARAMETER__DEFAULT_VALUE:
				return getDefaultValue();
			case UmlPackage.PARAMETER__PARAMETER_SET:
				return getParameterSet();
			case UmlPackage.PARAMETER__DIRECTION:
				return getDirection();
			case UmlPackage.PARAMETER__EFFECT:
				return getEffect();
			case UmlPackage.PARAMETER__IS_EXCEPTION:
				return getIsException();
			case UmlPackage.PARAMETER__IS_ORDERED:
				return getIsOrdered();
			case UmlPackage.PARAMETER__IS_STREAM:
				return getIsStream();
			case UmlPackage.PARAMETER__IS_UNIQUE:
				return getIsUnique();
			case UmlPackage.PARAMETER__PARAMETER_SET1:
				return getParameterSet1();
			case UmlPackage.PARAMETER__TYPE2:
				return getType2();
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
			case UmlPackage.PARAMETER__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.PARAMETER__TYPE1:
				getType1().clear();
				getType1().addAll((Collection<? extends Type>)newValue);
				return;
			case UmlPackage.PARAMETER__UPPER_VALUE:
				getUpperValue().clear();
				getUpperValue().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UmlPackage.PARAMETER__LOWER_VALUE:
				getLowerValue().clear();
				getLowerValue().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UmlPackage.PARAMETER__DEFAULT_VALUE:
				getDefaultValue().clear();
				getDefaultValue().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UmlPackage.PARAMETER__PARAMETER_SET:
				getParameterSet().clear();
				getParameterSet().addAll((Collection<? extends ParameterSet>)newValue);
				return;
			case UmlPackage.PARAMETER__DIRECTION:
				setDirection((ParameterDirectionKind)newValue);
				return;
			case UmlPackage.PARAMETER__EFFECT:
				setEffect((ParameterEffectKind)newValue);
				return;
			case UmlPackage.PARAMETER__IS_EXCEPTION:
				setIsException((String)newValue);
				return;
			case UmlPackage.PARAMETER__IS_ORDERED:
				setIsOrdered((String)newValue);
				return;
			case UmlPackage.PARAMETER__IS_STREAM:
				setIsStream((String)newValue);
				return;
			case UmlPackage.PARAMETER__IS_UNIQUE:
				setIsUnique((String)newValue);
				return;
			case UmlPackage.PARAMETER__PARAMETER_SET1:
				setParameterSet1((String)newValue);
				return;
			case UmlPackage.PARAMETER__TYPE2:
				setType2((String)newValue);
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
			case UmlPackage.PARAMETER__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.PARAMETER__TYPE1:
				getType1().clear();
				return;
			case UmlPackage.PARAMETER__UPPER_VALUE:
				getUpperValue().clear();
				return;
			case UmlPackage.PARAMETER__LOWER_VALUE:
				getLowerValue().clear();
				return;
			case UmlPackage.PARAMETER__DEFAULT_VALUE:
				getDefaultValue().clear();
				return;
			case UmlPackage.PARAMETER__PARAMETER_SET:
				getParameterSet().clear();
				return;
			case UmlPackage.PARAMETER__DIRECTION:
				unsetDirection();
				return;
			case UmlPackage.PARAMETER__EFFECT:
				unsetEffect();
				return;
			case UmlPackage.PARAMETER__IS_EXCEPTION:
				setIsException(IS_EXCEPTION_EDEFAULT);
				return;
			case UmlPackage.PARAMETER__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UmlPackage.PARAMETER__IS_STREAM:
				setIsStream(IS_STREAM_EDEFAULT);
				return;
			case UmlPackage.PARAMETER__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UmlPackage.PARAMETER__PARAMETER_SET1:
				setParameterSet1(PARAMETER_SET1_EDEFAULT);
				return;
			case UmlPackage.PARAMETER__TYPE2:
				setType2(TYPE2_EDEFAULT);
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
			case UmlPackage.PARAMETER__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.PARAMETER__TYPE1:
				return !getType1().isEmpty();
			case UmlPackage.PARAMETER__UPPER_VALUE:
				return !getUpperValue().isEmpty();
			case UmlPackage.PARAMETER__LOWER_VALUE:
				return !getLowerValue().isEmpty();
			case UmlPackage.PARAMETER__DEFAULT_VALUE:
				return !getDefaultValue().isEmpty();
			case UmlPackage.PARAMETER__PARAMETER_SET:
				return !getParameterSet().isEmpty();
			case UmlPackage.PARAMETER__DIRECTION:
				return isSetDirection();
			case UmlPackage.PARAMETER__EFFECT:
				return isSetEffect();
			case UmlPackage.PARAMETER__IS_EXCEPTION:
				return IS_EXCEPTION_EDEFAULT == null ? isException != null : !IS_EXCEPTION_EDEFAULT.equals(isException);
			case UmlPackage.PARAMETER__IS_ORDERED:
				return IS_ORDERED_EDEFAULT == null ? isOrdered != null : !IS_ORDERED_EDEFAULT.equals(isOrdered);
			case UmlPackage.PARAMETER__IS_STREAM:
				return IS_STREAM_EDEFAULT == null ? isStream != null : !IS_STREAM_EDEFAULT.equals(isStream);
			case UmlPackage.PARAMETER__IS_UNIQUE:
				return IS_UNIQUE_EDEFAULT == null ? isUnique != null : !IS_UNIQUE_EDEFAULT.equals(isUnique);
			case UmlPackage.PARAMETER__PARAMETER_SET1:
				return PARAMETER_SET1_EDEFAULT == null ? parameterSet1 != null : !PARAMETER_SET1_EDEFAULT.equals(parameterSet1);
			case UmlPackage.PARAMETER__TYPE2:
				return TYPE2_EDEFAULT == null ? type2 != null : !TYPE2_EDEFAULT.equals(type2);
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
		result.append(" (group6: ");
		result.append(group6);
		result.append(", direction: ");
		if (directionESet) result.append(direction); else result.append("<unset>");
		result.append(", effect: ");
		if (effectESet) result.append(effect); else result.append("<unset>");
		result.append(", isException: ");
		result.append(isException);
		result.append(", isOrdered: ");
		result.append(isOrdered);
		result.append(", isStream: ");
		result.append(isStream);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", parameterSet1: ");
		result.append(parameterSet1);
		result.append(", type2: ");
		result.append(type2);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
