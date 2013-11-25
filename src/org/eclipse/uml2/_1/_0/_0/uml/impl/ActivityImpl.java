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

import org.eclipse.uml2._1._0._0.uml.Action;
import org.eclipse.uml2._1._0._0.uml.Activity;
import org.eclipse.uml2._1._0._0.uml.ActivityEdge;
import org.eclipse.uml2._1._0._0.uml.ActivityGroup;
import org.eclipse.uml2._1._0._0.uml.ActivityNode;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityImpl#getGroup10 <em>Group10</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityImpl#getGroup11 <em>Group11</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityImpl#getAction1 <em>Action1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityImpl#getIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityImpl#getIsSingleExecution <em>Is Single Execution</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ActivityImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends BehaviorImpl implements Activity
{
	/**
	 * The cached value of the '{@link #getGroup10() <em>Group10</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup10()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group10;

	/**
	 * The default value of the '{@link #getAction1() <em>Action1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction1()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction1() <em>Action1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction1()
	 * @generated
	 * @ordered
	 */
	protected String action1 = ACTION1_EDEFAULT;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_READ_ONLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected String isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsSingleExecution() <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSingleExecution()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_SINGLE_EXECUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsSingleExecution() <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSingleExecution()
	 * @generated
	 * @ordered
	 */
	protected String isSingleExecution = IS_SINGLE_EXECUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl()
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
		return UmlPackage.eINSTANCE.getActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup10()
	{
		if (group10 == null)
		{
			group10 = new BasicFeatureMap(this, UmlPackage.ACTIVITY__GROUP10);
		}
		return group10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getEdge()
	{
		return getGroup10().list(UmlPackage.eINSTANCE.getActivity_Edge());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityGroup> getGroup11()
	{
		return getGroup10().list(UmlPackage.eINSTANCE.getActivity_Group11());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getNode()
	{
		return getGroup10().list(UmlPackage.eINSTANCE.getActivity_Node());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getAction()
	{
		return getGroup10().list(UmlPackage.eINSTANCE.getActivity_Action());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAction1()
	{
		return action1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction1(String newAction1)
	{
		String oldAction1 = action1;
		action1 = newAction1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY__ACTION1, oldAction1, action1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody()
	{
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody)
	{
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsReadOnly()
	{
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(String newIsReadOnly)
	{
		String oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsSingleExecution()
	{
		return isSingleExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSingleExecution(String newIsSingleExecution)
	{
		String oldIsSingleExecution = isSingleExecution;
		isSingleExecution = newIsSingleExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY__IS_SINGLE_EXECUTION, oldIsSingleExecution, isSingleExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage()
	{
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage)
	{
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY__LANGUAGE, oldLanguage, language));
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
			case UmlPackage.ACTIVITY__GROUP10:
				return ((InternalEList<?>)getGroup10()).basicRemove(otherEnd, msgs);
			case UmlPackage.ACTIVITY__EDGE:
				return ((InternalEList<?>)getEdge()).basicRemove(otherEnd, msgs);
			case UmlPackage.ACTIVITY__GROUP11:
				return ((InternalEList<?>)getGroup11()).basicRemove(otherEnd, msgs);
			case UmlPackage.ACTIVITY__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case UmlPackage.ACTIVITY__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.ACTIVITY__GROUP10:
				if (coreType) return getGroup10();
				return ((FeatureMap.Internal)getGroup10()).getWrapper();
			case UmlPackage.ACTIVITY__EDGE:
				return getEdge();
			case UmlPackage.ACTIVITY__GROUP11:
				return getGroup11();
			case UmlPackage.ACTIVITY__NODE:
				return getNode();
			case UmlPackage.ACTIVITY__ACTION:
				return getAction();
			case UmlPackage.ACTIVITY__ACTION1:
				return getAction1();
			case UmlPackage.ACTIVITY__BODY:
				return getBody();
			case UmlPackage.ACTIVITY__IS_READ_ONLY:
				return getIsReadOnly();
			case UmlPackage.ACTIVITY__IS_SINGLE_EXECUTION:
				return getIsSingleExecution();
			case UmlPackage.ACTIVITY__LANGUAGE:
				return getLanguage();
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
			case UmlPackage.ACTIVITY__GROUP10:
				((FeatureMap.Internal)getGroup10()).set(newValue);
				return;
			case UmlPackage.ACTIVITY__EDGE:
				getEdge().clear();
				getEdge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case UmlPackage.ACTIVITY__GROUP11:
				getGroup11().clear();
				getGroup11().addAll((Collection<? extends ActivityGroup>)newValue);
				return;
			case UmlPackage.ACTIVITY__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case UmlPackage.ACTIVITY__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends Action>)newValue);
				return;
			case UmlPackage.ACTIVITY__ACTION1:
				setAction1((String)newValue);
				return;
			case UmlPackage.ACTIVITY__BODY:
				setBody((String)newValue);
				return;
			case UmlPackage.ACTIVITY__IS_READ_ONLY:
				setIsReadOnly((String)newValue);
				return;
			case UmlPackage.ACTIVITY__IS_SINGLE_EXECUTION:
				setIsSingleExecution((String)newValue);
				return;
			case UmlPackage.ACTIVITY__LANGUAGE:
				setLanguage((String)newValue);
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
			case UmlPackage.ACTIVITY__GROUP10:
				getGroup10().clear();
				return;
			case UmlPackage.ACTIVITY__EDGE:
				getEdge().clear();
				return;
			case UmlPackage.ACTIVITY__GROUP11:
				getGroup11().clear();
				return;
			case UmlPackage.ACTIVITY__NODE:
				getNode().clear();
				return;
			case UmlPackage.ACTIVITY__ACTION:
				getAction().clear();
				return;
			case UmlPackage.ACTIVITY__ACTION1:
				setAction1(ACTION1_EDEFAULT);
				return;
			case UmlPackage.ACTIVITY__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case UmlPackage.ACTIVITY__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case UmlPackage.ACTIVITY__IS_SINGLE_EXECUTION:
				setIsSingleExecution(IS_SINGLE_EXECUTION_EDEFAULT);
				return;
			case UmlPackage.ACTIVITY__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
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
			case UmlPackage.ACTIVITY__GROUP10:
				return group10 != null && !group10.isEmpty();
			case UmlPackage.ACTIVITY__EDGE:
				return !getEdge().isEmpty();
			case UmlPackage.ACTIVITY__GROUP11:
				return !getGroup11().isEmpty();
			case UmlPackage.ACTIVITY__NODE:
				return !getNode().isEmpty();
			case UmlPackage.ACTIVITY__ACTION:
				return !getAction().isEmpty();
			case UmlPackage.ACTIVITY__ACTION1:
				return ACTION1_EDEFAULT == null ? action1 != null : !ACTION1_EDEFAULT.equals(action1);
			case UmlPackage.ACTIVITY__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case UmlPackage.ACTIVITY__IS_READ_ONLY:
				return IS_READ_ONLY_EDEFAULT == null ? isReadOnly != null : !IS_READ_ONLY_EDEFAULT.equals(isReadOnly);
			case UmlPackage.ACTIVITY__IS_SINGLE_EXECUTION:
				return IS_SINGLE_EXECUTION_EDEFAULT == null ? isSingleExecution != null : !IS_SINGLE_EXECUTION_EDEFAULT.equals(isSingleExecution);
			case UmlPackage.ACTIVITY__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
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
		result.append(" (group10: ");
		result.append(group10);
		result.append(", action1: ");
		result.append(action1);
		result.append(", body: ");
		result.append(body);
		result.append(", isReadOnly: ");
		result.append(isReadOnly);
		result.append(", isSingleExecution: ");
		result.append(isSingleExecution);
		result.append(", language: ");
		result.append(language);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
