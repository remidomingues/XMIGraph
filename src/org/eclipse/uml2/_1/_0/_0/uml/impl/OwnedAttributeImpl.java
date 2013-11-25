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
import org.eclipse.uml2._1._0._0.uml.OwnedAttribute;
import org.eclipse.uml2._1._0._0.uml.OwnedRule;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Owned Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OwnedAttributeImpl#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OwnedAttributeImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OwnedAttributeImpl#isIsDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OwnedAttributeImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OwnedAttributeImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OwnedAttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OwnedAttributeImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OwnedAttributeImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OwnedAttributeImpl#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OwnedAttributeImpl#getJType <em>JType</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwnedAttributeImpl extends AssociationElementImpl implements OwnedAttribute
{
	/**
	 * The default value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDerivedUnion() <em>Is Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerivedUnion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_UNION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerivedUnion() <em>Is Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerivedUnion()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerivedUnion = IS_DERIVED_UNION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

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
	 * The cached value of the '{@link #getOwnedRule() <em>Owned Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRule()
	 * @generated
	 * @ordered
	 */
	protected OwnedRule ownedRule;

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
	public OwnedAttributeImpl()
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
		return UmlPackage.eINSTANCE.getOwnedAttribute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReadOnly()
	{
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(boolean newIsReadOnly)
	{
		boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDerived()
	{
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived)
	{
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDerivedUnion()
	{
		return isDerivedUnion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerivedUnion(boolean newIsDerivedUnion)
	{
		boolean oldIsDerivedUnion = isDerivedUnion;
		isDerivedUnion = newIsDerivedUnion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE__IS_DERIVED_UNION, oldIsDerivedUnion, isDerivedUnion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrdered()
	{
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered)
	{
		boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnique()
	{
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique)
	{
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE__IS_UNIQUE, oldIsUnique, isUnique));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
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
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_ATTRIBUTE__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_ATTRIBUTE__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE__LOWER_VALUE, oldLowerValue, newLowerValue);
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
				msgs = ((InternalEObject)lowerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_ATTRIBUTE__LOWER_VALUE, null, msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject)newLowerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_ATTRIBUTE__LOWER_VALUE, null, msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE__LOWER_VALUE, newLowerValue, newLowerValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE__UPPER_VALUE, oldUpperValue, newUpperValue);
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
				msgs = ((InternalEObject)upperValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_ATTRIBUTE__UPPER_VALUE, null, msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject)newUpperValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_ATTRIBUTE__UPPER_VALUE, null, msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE__UPPER_VALUE, newUpperValue, newUpperValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE__OWNED_RULE, oldOwnedRule, newOwnedRule);
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
				msgs = ((InternalEObject)ownedRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_ATTRIBUTE__OWNED_RULE, null, msgs);
			if (newOwnedRule != null)
				msgs = ((InternalEObject)newOwnedRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_ATTRIBUTE__OWNED_RULE, null, msgs);
			msgs = basicSetOwnedRule(newOwnedRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE__OWNED_RULE, newOwnedRule, newOwnedRule));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE__JTYPE, oldJType, newJType);
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
				msgs = ((InternalEObject)jType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_ATTRIBUTE__JTYPE, null, msgs);
			if (newJType != null)
				msgs = ((InternalEObject)newJType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_ATTRIBUTE__JTYPE, null, msgs);
			msgs = basicSetJType(newJType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE__JTYPE, newJType, newJType));
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
			case UmlPackage.OWNED_ATTRIBUTE__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
			case UmlPackage.OWNED_ATTRIBUTE__LOWER_VALUE:
				return basicSetLowerValue(null, msgs);
			case UmlPackage.OWNED_ATTRIBUTE__UPPER_VALUE:
				return basicSetUpperValue(null, msgs);
			case UmlPackage.OWNED_ATTRIBUTE__OWNED_RULE:
				return basicSetOwnedRule(null, msgs);
			case UmlPackage.OWNED_ATTRIBUTE__JTYPE:
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
			case UmlPackage.OWNED_ATTRIBUTE__IS_READ_ONLY:
				return isIsReadOnly();
			case UmlPackage.OWNED_ATTRIBUTE__IS_DERIVED:
				return isIsDerived();
			case UmlPackage.OWNED_ATTRIBUTE__IS_DERIVED_UNION:
				return isIsDerivedUnion();
			case UmlPackage.OWNED_ATTRIBUTE__IS_ORDERED:
				return isIsOrdered();
			case UmlPackage.OWNED_ATTRIBUTE__IS_UNIQUE:
				return isIsUnique();
			case UmlPackage.OWNED_ATTRIBUTE__DEFAULT_VALUE:
				return getDefaultValue();
			case UmlPackage.OWNED_ATTRIBUTE__LOWER_VALUE:
				return getLowerValue();
			case UmlPackage.OWNED_ATTRIBUTE__UPPER_VALUE:
				return getUpperValue();
			case UmlPackage.OWNED_ATTRIBUTE__OWNED_RULE:
				return getOwnedRule();
			case UmlPackage.OWNED_ATTRIBUTE__JTYPE:
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
			case UmlPackage.OWNED_ATTRIBUTE__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
				return;
			case UmlPackage.OWNED_ATTRIBUTE__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case UmlPackage.OWNED_ATTRIBUTE__IS_DERIVED_UNION:
				setIsDerivedUnion((Boolean)newValue);
				return;
			case UmlPackage.OWNED_ATTRIBUTE__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case UmlPackage.OWNED_ATTRIBUTE__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case UmlPackage.OWNED_ATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue((Value)newValue);
				return;
			case UmlPackage.OWNED_ATTRIBUTE__LOWER_VALUE:
				setLowerValue((Value)newValue);
				return;
			case UmlPackage.OWNED_ATTRIBUTE__UPPER_VALUE:
				setUpperValue((Value)newValue);
				return;
			case UmlPackage.OWNED_ATTRIBUTE__OWNED_RULE:
				setOwnedRule((OwnedRule)newValue);
				return;
			case UmlPackage.OWNED_ATTRIBUTE__JTYPE:
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
			case UmlPackage.OWNED_ATTRIBUTE__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case UmlPackage.OWNED_ATTRIBUTE__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case UmlPackage.OWNED_ATTRIBUTE__IS_DERIVED_UNION:
				setIsDerivedUnion(IS_DERIVED_UNION_EDEFAULT);
				return;
			case UmlPackage.OWNED_ATTRIBUTE__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UmlPackage.OWNED_ATTRIBUTE__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UmlPackage.OWNED_ATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue((Value)null);
				return;
			case UmlPackage.OWNED_ATTRIBUTE__LOWER_VALUE:
				setLowerValue((Value)null);
				return;
			case UmlPackage.OWNED_ATTRIBUTE__UPPER_VALUE:
				setUpperValue((Value)null);
				return;
			case UmlPackage.OWNED_ATTRIBUTE__OWNED_RULE:
				setOwnedRule((OwnedRule)null);
				return;
			case UmlPackage.OWNED_ATTRIBUTE__JTYPE:
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
			case UmlPackage.OWNED_ATTRIBUTE__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
			case UmlPackage.OWNED_ATTRIBUTE__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case UmlPackage.OWNED_ATTRIBUTE__IS_DERIVED_UNION:
				return isDerivedUnion != IS_DERIVED_UNION_EDEFAULT;
			case UmlPackage.OWNED_ATTRIBUTE__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case UmlPackage.OWNED_ATTRIBUTE__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case UmlPackage.OWNED_ATTRIBUTE__DEFAULT_VALUE:
				return defaultValue != null;
			case UmlPackage.OWNED_ATTRIBUTE__LOWER_VALUE:
				return lowerValue != null;
			case UmlPackage.OWNED_ATTRIBUTE__UPPER_VALUE:
				return upperValue != null;
			case UmlPackage.OWNED_ATTRIBUTE__OWNED_RULE:
				return ownedRule != null;
			case UmlPackage.OWNED_ATTRIBUTE__JTYPE:
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
		result.append(" (isReadOnly: ");
		result.append(isReadOnly);
		result.append(", isDerived: ");
		result.append(isDerived);
		result.append(", isDerivedUnion: ");
		result.append(isDerivedUnion);
		result.append(", isOrdered: ");
		result.append(isOrdered);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(')');
		return result.toString();
	}

} //OwnedAttributeImpl
