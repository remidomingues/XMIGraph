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

import org.eclipse.uml2._1._0._0.uml.Classifier;
import org.eclipse.uml2._1._0._0.uml.ExceptionHandler;
import org.eclipse.uml2._1._0._0.uml.ExecutableNode;
import org.eclipse.uml2._1._0._0.uml.ObjectNode;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExceptionHandlerImpl#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExceptionHandlerImpl#getHandlerBody <em>Handler Body</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExceptionHandlerImpl#getExceptionInput <em>Exception Input</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExceptionHandlerImpl#getExceptionType <em>Exception Type</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExceptionHandlerImpl#getExceptionInput1 <em>Exception Input1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExceptionHandlerImpl#getExceptionType1 <em>Exception Type1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExceptionHandlerImpl#getHandlerBody1 <em>Handler Body1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExceptionHandlerImpl extends ElementImpl implements ExceptionHandler
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
	 * The default value of the '{@link #getExceptionInput1() <em>Exception Input1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionInput1()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCEPTION_INPUT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionInput1() <em>Exception Input1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionInput1()
	 * @generated
	 * @ordered
	 */
	protected String exceptionInput1 = EXCEPTION_INPUT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getExceptionType1() <em>Exception Type1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionType1()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCEPTION_TYPE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionType1() <em>Exception Type1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionType1()
	 * @generated
	 * @ordered
	 */
	protected String exceptionType1 = EXCEPTION_TYPE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandlerBody1() <em>Handler Body1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerBody1()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLER_BODY1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandlerBody1() <em>Handler Body1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerBody1()
	 * @generated
	 * @ordered
	 */
	protected String handlerBody1 = HANDLER_BODY1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionHandlerImpl()
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
		return UmlPackage.eINSTANCE.getExceptionHandler();
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
			group3 = new BasicFeatureMap(this, UmlPackage.EXCEPTION_HANDLER__GROUP3);
		}
		return group3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableNode> getHandlerBody()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getExceptionHandler_HandlerBody());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectNode> getExceptionInput()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getExceptionHandler_ExceptionInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getExceptionType()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getExceptionHandler_ExceptionType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExceptionInput1()
	{
		return exceptionInput1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionInput1(String newExceptionInput1)
	{
		String oldExceptionInput1 = exceptionInput1;
		exceptionInput1 = newExceptionInput1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT1, oldExceptionInput1, exceptionInput1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExceptionType1()
	{
		return exceptionType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionType1(String newExceptionType1)
	{
		String oldExceptionType1 = exceptionType1;
		exceptionType1 = newExceptionType1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE1, oldExceptionType1, exceptionType1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandlerBody1()
	{
		return handlerBody1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlerBody1(String newHandlerBody1)
	{
		String oldHandlerBody1 = handlerBody1;
		handlerBody1 = newHandlerBody1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EXCEPTION_HANDLER__HANDLER_BODY1, oldHandlerBody1, handlerBody1));
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
			case UmlPackage.EXCEPTION_HANDLER__GROUP3:
				return ((InternalEList<?>)getGroup3()).basicRemove(otherEnd, msgs);
			case UmlPackage.EXCEPTION_HANDLER__HANDLER_BODY:
				return ((InternalEList<?>)getHandlerBody()).basicRemove(otherEnd, msgs);
			case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT:
				return ((InternalEList<?>)getExceptionInput()).basicRemove(otherEnd, msgs);
			case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE:
				return ((InternalEList<?>)getExceptionType()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.EXCEPTION_HANDLER__GROUP3:
				if (coreType) return getGroup3();
				return ((FeatureMap.Internal)getGroup3()).getWrapper();
			case UmlPackage.EXCEPTION_HANDLER__HANDLER_BODY:
				return getHandlerBody();
			case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT:
				return getExceptionInput();
			case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE:
				return getExceptionType();
			case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT1:
				return getExceptionInput1();
			case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE1:
				return getExceptionType1();
			case UmlPackage.EXCEPTION_HANDLER__HANDLER_BODY1:
				return getHandlerBody1();
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
			case UmlPackage.EXCEPTION_HANDLER__GROUP3:
				((FeatureMap.Internal)getGroup3()).set(newValue);
				return;
			case UmlPackage.EXCEPTION_HANDLER__HANDLER_BODY:
				getHandlerBody().clear();
				getHandlerBody().addAll((Collection<? extends ExecutableNode>)newValue);
				return;
			case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT:
				getExceptionInput().clear();
				getExceptionInput().addAll((Collection<? extends ObjectNode>)newValue);
				return;
			case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE:
				getExceptionType().clear();
				getExceptionType().addAll((Collection<? extends Classifier>)newValue);
				return;
			case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT1:
				setExceptionInput1((String)newValue);
				return;
			case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE1:
				setExceptionType1((String)newValue);
				return;
			case UmlPackage.EXCEPTION_HANDLER__HANDLER_BODY1:
				setHandlerBody1((String)newValue);
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
			case UmlPackage.EXCEPTION_HANDLER__GROUP3:
				getGroup3().clear();
				return;
			case UmlPackage.EXCEPTION_HANDLER__HANDLER_BODY:
				getHandlerBody().clear();
				return;
			case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT:
				getExceptionInput().clear();
				return;
			case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE:
				getExceptionType().clear();
				return;
			case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT1:
				setExceptionInput1(EXCEPTION_INPUT1_EDEFAULT);
				return;
			case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE1:
				setExceptionType1(EXCEPTION_TYPE1_EDEFAULT);
				return;
			case UmlPackage.EXCEPTION_HANDLER__HANDLER_BODY1:
				setHandlerBody1(HANDLER_BODY1_EDEFAULT);
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
			case UmlPackage.EXCEPTION_HANDLER__GROUP3:
				return group3 != null && !group3.isEmpty();
			case UmlPackage.EXCEPTION_HANDLER__HANDLER_BODY:
				return !getHandlerBody().isEmpty();
			case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT:
				return !getExceptionInput().isEmpty();
			case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE:
				return !getExceptionType().isEmpty();
			case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT1:
				return EXCEPTION_INPUT1_EDEFAULT == null ? exceptionInput1 != null : !EXCEPTION_INPUT1_EDEFAULT.equals(exceptionInput1);
			case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE1:
				return EXCEPTION_TYPE1_EDEFAULT == null ? exceptionType1 != null : !EXCEPTION_TYPE1_EDEFAULT.equals(exceptionType1);
			case UmlPackage.EXCEPTION_HANDLER__HANDLER_BODY1:
				return HANDLER_BODY1_EDEFAULT == null ? handlerBody1 != null : !HANDLER_BODY1_EDEFAULT.equals(handlerBody1);
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
		result.append(", exceptionInput1: ");
		result.append(exceptionInput1);
		result.append(", exceptionType1: ");
		result.append(exceptionType1);
		result.append(", handlerBody1: ");
		result.append(handlerBody1);
		result.append(')');
		return result.toString();
	}

} //ExceptionHandlerImpl
