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

import org.eclipse.uml2._1._0._0.uml.Behavior;
import org.eclipse.uml2._1._0._0.uml.BehavioralFeature;
import org.eclipse.uml2._1._0._0.uml.CallConcurrencyKind;
import org.eclipse.uml2._1._0._0.uml.Parameter;
import org.eclipse.uml2._1._0._0.uml.Type;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehavioralFeatureImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehavioralFeatureImpl#getFormalParameter <em>Formal Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehavioralFeatureImpl#getReturnResult <em>Return Result</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehavioralFeatureImpl#getRaisedException <em>Raised Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehavioralFeatureImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehavioralFeatureImpl#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehavioralFeatureImpl#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehavioralFeatureImpl#getIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehavioralFeatureImpl#getIsStatic <em>Is Static</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehavioralFeatureImpl#getMethod1 <em>Method1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehavioralFeatureImpl#getRaisedException1 <em>Raised Exception1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehavioralFeatureImpl extends NamespaceImpl implements BehavioralFeature
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
	 * The default value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected static final CallConcurrencyKind CONCURRENCY_EDEFAULT = CallConcurrencyKind.SEQUENTIAL;

	/**
	 * The cached value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected CallConcurrencyKind concurrency = CONCURRENCY_EDEFAULT;

	/**
	 * This is true if the Concurrency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean concurrencyESet;

	/**
	 * The default value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected String isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_LEAF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected String isLeaf = IS_LEAF_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_STATIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStatic()
	 * @generated
	 * @ordered
	 */
	protected String isStatic = IS_STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethod1() <em>Method1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod1()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod1() <em>Method1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod1()
	 * @generated
	 * @ordered
	 */
	protected String method1 = METHOD1_EDEFAULT;

	/**
	 * The default value of the '{@link #getRaisedException1() <em>Raised Exception1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaisedException1()
	 * @generated
	 * @ordered
	 */
	protected static final String RAISED_EXCEPTION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRaisedException1() <em>Raised Exception1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaisedException1()
	 * @generated
	 * @ordered
	 */
	protected String raisedException1 = RAISED_EXCEPTION1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehavioralFeatureImpl()
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
		return UmlPackage.eINSTANCE.getBehavioralFeature();
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
			group6 = new BasicFeatureMap(this, UmlPackage.BEHAVIORAL_FEATURE__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getFormalParameter()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getBehavioralFeature_FormalParameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getReturnResult()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getBehavioralFeature_ReturnResult());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getRaisedException()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getBehavioralFeature_RaisedException());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getMethod()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getBehavioralFeature_Method());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallConcurrencyKind getConcurrency()
	{
		return concurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurrency(CallConcurrencyKind newConcurrency)
	{
		CallConcurrencyKind oldConcurrency = concurrency;
		concurrency = newConcurrency == null ? CONCURRENCY_EDEFAULT : newConcurrency;
		boolean oldConcurrencyESet = concurrencyESet;
		concurrencyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.BEHAVIORAL_FEATURE__CONCURRENCY, oldConcurrency, concurrency, !oldConcurrencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConcurrency()
	{
		CallConcurrencyKind oldConcurrency = concurrency;
		boolean oldConcurrencyESet = concurrencyESet;
		concurrency = CONCURRENCY_EDEFAULT;
		concurrencyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.BEHAVIORAL_FEATURE__CONCURRENCY, oldConcurrency, CONCURRENCY_EDEFAULT, oldConcurrencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConcurrency()
	{
		return concurrencyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsAbstract()
	{
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(String newIsAbstract)
	{
		String oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsLeaf()
	{
		return isLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(String newIsLeaf)
	{
		String oldIsLeaf = isLeaf;
		isLeaf = newIsLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.BEHAVIORAL_FEATURE__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsStatic()
	{
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(String newIsStatic)
	{
		String oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.BEHAVIORAL_FEATURE__IS_STATIC, oldIsStatic, isStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethod1()
	{
		return method1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod1(String newMethod1)
	{
		String oldMethod1 = method1;
		method1 = newMethod1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.BEHAVIORAL_FEATURE__METHOD1, oldMethod1, method1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRaisedException1()
	{
		return raisedException1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRaisedException1(String newRaisedException1)
	{
		String oldRaisedException1 = raisedException1;
		raisedException1 = newRaisedException1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION1, oldRaisedException1, raisedException1));
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
			case UmlPackage.BEHAVIORAL_FEATURE__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.BEHAVIORAL_FEATURE__FORMAL_PARAMETER:
				return ((InternalEList<?>)getFormalParameter()).basicRemove(otherEnd, msgs);
			case UmlPackage.BEHAVIORAL_FEATURE__RETURN_RESULT:
				return ((InternalEList<?>)getReturnResult()).basicRemove(otherEnd, msgs);
			case UmlPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				return ((InternalEList<?>)getRaisedException()).basicRemove(otherEnd, msgs);
			case UmlPackage.BEHAVIORAL_FEATURE__METHOD:
				return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.BEHAVIORAL_FEATURE__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.BEHAVIORAL_FEATURE__FORMAL_PARAMETER:
				return getFormalParameter();
			case UmlPackage.BEHAVIORAL_FEATURE__RETURN_RESULT:
				return getReturnResult();
			case UmlPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				return getRaisedException();
			case UmlPackage.BEHAVIORAL_FEATURE__METHOD:
				return getMethod();
			case UmlPackage.BEHAVIORAL_FEATURE__CONCURRENCY:
				return getConcurrency();
			case UmlPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT:
				return getIsAbstract();
			case UmlPackage.BEHAVIORAL_FEATURE__IS_LEAF:
				return getIsLeaf();
			case UmlPackage.BEHAVIORAL_FEATURE__IS_STATIC:
				return getIsStatic();
			case UmlPackage.BEHAVIORAL_FEATURE__METHOD1:
				return getMethod1();
			case UmlPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION1:
				return getRaisedException1();
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
			case UmlPackage.BEHAVIORAL_FEATURE__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.BEHAVIORAL_FEATURE__FORMAL_PARAMETER:
				getFormalParameter().clear();
				getFormalParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case UmlPackage.BEHAVIORAL_FEATURE__RETURN_RESULT:
				getReturnResult().clear();
				getReturnResult().addAll((Collection<? extends Parameter>)newValue);
				return;
			case UmlPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				getRaisedException().clear();
				getRaisedException().addAll((Collection<? extends Type>)newValue);
				return;
			case UmlPackage.BEHAVIORAL_FEATURE__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends Behavior>)newValue);
				return;
			case UmlPackage.BEHAVIORAL_FEATURE__CONCURRENCY:
				setConcurrency((CallConcurrencyKind)newValue);
				return;
			case UmlPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT:
				setIsAbstract((String)newValue);
				return;
			case UmlPackage.BEHAVIORAL_FEATURE__IS_LEAF:
				setIsLeaf((String)newValue);
				return;
			case UmlPackage.BEHAVIORAL_FEATURE__IS_STATIC:
				setIsStatic((String)newValue);
				return;
			case UmlPackage.BEHAVIORAL_FEATURE__METHOD1:
				setMethod1((String)newValue);
				return;
			case UmlPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION1:
				setRaisedException1((String)newValue);
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
			case UmlPackage.BEHAVIORAL_FEATURE__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.BEHAVIORAL_FEATURE__FORMAL_PARAMETER:
				getFormalParameter().clear();
				return;
			case UmlPackage.BEHAVIORAL_FEATURE__RETURN_RESULT:
				getReturnResult().clear();
				return;
			case UmlPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				getRaisedException().clear();
				return;
			case UmlPackage.BEHAVIORAL_FEATURE__METHOD:
				getMethod().clear();
				return;
			case UmlPackage.BEHAVIORAL_FEATURE__CONCURRENCY:
				unsetConcurrency();
				return;
			case UmlPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UmlPackage.BEHAVIORAL_FEATURE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UmlPackage.BEHAVIORAL_FEATURE__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UmlPackage.BEHAVIORAL_FEATURE__METHOD1:
				setMethod1(METHOD1_EDEFAULT);
				return;
			case UmlPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION1:
				setRaisedException1(RAISED_EXCEPTION1_EDEFAULT);
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
			case UmlPackage.BEHAVIORAL_FEATURE__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.BEHAVIORAL_FEATURE__FORMAL_PARAMETER:
				return !getFormalParameter().isEmpty();
			case UmlPackage.BEHAVIORAL_FEATURE__RETURN_RESULT:
				return !getReturnResult().isEmpty();
			case UmlPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				return !getRaisedException().isEmpty();
			case UmlPackage.BEHAVIORAL_FEATURE__METHOD:
				return !getMethod().isEmpty();
			case UmlPackage.BEHAVIORAL_FEATURE__CONCURRENCY:
				return isSetConcurrency();
			case UmlPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT:
				return IS_ABSTRACT_EDEFAULT == null ? isAbstract != null : !IS_ABSTRACT_EDEFAULT.equals(isAbstract);
			case UmlPackage.BEHAVIORAL_FEATURE__IS_LEAF:
				return IS_LEAF_EDEFAULT == null ? isLeaf != null : !IS_LEAF_EDEFAULT.equals(isLeaf);
			case UmlPackage.BEHAVIORAL_FEATURE__IS_STATIC:
				return IS_STATIC_EDEFAULT == null ? isStatic != null : !IS_STATIC_EDEFAULT.equals(isStatic);
			case UmlPackage.BEHAVIORAL_FEATURE__METHOD1:
				return METHOD1_EDEFAULT == null ? method1 != null : !METHOD1_EDEFAULT.equals(method1);
			case UmlPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION1:
				return RAISED_EXCEPTION1_EDEFAULT == null ? raisedException1 != null : !RAISED_EXCEPTION1_EDEFAULT.equals(raisedException1);
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
		result.append(", concurrency: ");
		if (concurrencyESet) result.append(concurrency); else result.append("<unset>");
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", isLeaf: ");
		result.append(isLeaf);
		result.append(", isStatic: ");
		result.append(isStatic);
		result.append(", method1: ");
		result.append(method1);
		result.append(", raisedException1: ");
		result.append(raisedException1);
		result.append(')');
		return result.toString();
	}

} //BehavioralFeatureImpl
