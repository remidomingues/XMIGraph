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

import org.eclipse.uml2._1._0._0.uml.Port;
import org.eclipse.uml2._1._0._0.uml.ProtocolStateMachine;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PortImpl#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PortImpl#getRedefinedPort <em>Redefined Port</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PortImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PortImpl#getIsBehavior <em>Is Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PortImpl#getIsService <em>Is Service</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PortImpl#getProtocol1 <em>Protocol1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PortImpl#getRedefinedPort1 <em>Redefined Port1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl extends PropertyImpl implements Port
{
	/**
	 * The cached value of the '{@link #getGroup7() <em>Group7</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup7()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group7;

	/**
	 * The default value of the '{@link #getIsBehavior() <em>Is Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_BEHAVIOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsBehavior() <em>Is Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBehavior()
	 * @generated
	 * @ordered
	 */
	protected String isBehavior = IS_BEHAVIOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsService() <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsService()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsService() <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsService()
	 * @generated
	 * @ordered
	 */
	protected String isService = IS_SERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol1() <em>Protocol1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol1()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol1() <em>Protocol1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol1()
	 * @generated
	 * @ordered
	 */
	protected String protocol1 = PROTOCOL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedefinedPort1() <em>Redefined Port1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedPort1()
	 * @generated
	 * @ordered
	 */
	protected static final String REDEFINED_PORT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedefinedPort1() <em>Redefined Port1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedPort1()
	 * @generated
	 * @ordered
	 */
	protected String redefinedPort1 = REDEFINED_PORT1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl()
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
		return UmlPackage.eINSTANCE.getPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup7()
	{
		if (group7 == null)
		{
			group7 = new BasicFeatureMap(this, UmlPackage.PORT__GROUP7);
		}
		return group7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getRedefinedPort()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getPort_RedefinedPort());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtocolStateMachine> getProtocol()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getPort_Protocol());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsBehavior()
	{
		return isBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBehavior(String newIsBehavior)
	{
		String oldIsBehavior = isBehavior;
		isBehavior = newIsBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PORT__IS_BEHAVIOR, oldIsBehavior, isBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsService()
	{
		return isService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsService(String newIsService)
	{
		String oldIsService = isService;
		isService = newIsService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PORT__IS_SERVICE, oldIsService, isService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocol1()
	{
		return protocol1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol1(String newProtocol1)
	{
		String oldProtocol1 = protocol1;
		protocol1 = newProtocol1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PORT__PROTOCOL1, oldProtocol1, protocol1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedefinedPort1()
	{
		return redefinedPort1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedPort1(String newRedefinedPort1)
	{
		String oldRedefinedPort1 = redefinedPort1;
		redefinedPort1 = newRedefinedPort1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PORT__REDEFINED_PORT1, oldRedefinedPort1, redefinedPort1));
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
			case UmlPackage.PORT__GROUP7:
				return ((InternalEList<?>)getGroup7()).basicRemove(otherEnd, msgs);
			case UmlPackage.PORT__REDEFINED_PORT:
				return ((InternalEList<?>)getRedefinedPort()).basicRemove(otherEnd, msgs);
			case UmlPackage.PORT__PROTOCOL:
				return ((InternalEList<?>)getProtocol()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.PORT__GROUP7:
				if (coreType) return getGroup7();
				return ((FeatureMap.Internal)getGroup7()).getWrapper();
			case UmlPackage.PORT__REDEFINED_PORT:
				return getRedefinedPort();
			case UmlPackage.PORT__PROTOCOL:
				return getProtocol();
			case UmlPackage.PORT__IS_BEHAVIOR:
				return getIsBehavior();
			case UmlPackage.PORT__IS_SERVICE:
				return getIsService();
			case UmlPackage.PORT__PROTOCOL1:
				return getProtocol1();
			case UmlPackage.PORT__REDEFINED_PORT1:
				return getRedefinedPort1();
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
			case UmlPackage.PORT__GROUP7:
				((FeatureMap.Internal)getGroup7()).set(newValue);
				return;
			case UmlPackage.PORT__REDEFINED_PORT:
				getRedefinedPort().clear();
				getRedefinedPort().addAll((Collection<? extends Port>)newValue);
				return;
			case UmlPackage.PORT__PROTOCOL:
				getProtocol().clear();
				getProtocol().addAll((Collection<? extends ProtocolStateMachine>)newValue);
				return;
			case UmlPackage.PORT__IS_BEHAVIOR:
				setIsBehavior((String)newValue);
				return;
			case UmlPackage.PORT__IS_SERVICE:
				setIsService((String)newValue);
				return;
			case UmlPackage.PORT__PROTOCOL1:
				setProtocol1((String)newValue);
				return;
			case UmlPackage.PORT__REDEFINED_PORT1:
				setRedefinedPort1((String)newValue);
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
			case UmlPackage.PORT__GROUP7:
				getGroup7().clear();
				return;
			case UmlPackage.PORT__REDEFINED_PORT:
				getRedefinedPort().clear();
				return;
			case UmlPackage.PORT__PROTOCOL:
				getProtocol().clear();
				return;
			case UmlPackage.PORT__IS_BEHAVIOR:
				setIsBehavior(IS_BEHAVIOR_EDEFAULT);
				return;
			case UmlPackage.PORT__IS_SERVICE:
				setIsService(IS_SERVICE_EDEFAULT);
				return;
			case UmlPackage.PORT__PROTOCOL1:
				setProtocol1(PROTOCOL1_EDEFAULT);
				return;
			case UmlPackage.PORT__REDEFINED_PORT1:
				setRedefinedPort1(REDEFINED_PORT1_EDEFAULT);
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
			case UmlPackage.PORT__GROUP7:
				return group7 != null && !group7.isEmpty();
			case UmlPackage.PORT__REDEFINED_PORT:
				return !getRedefinedPort().isEmpty();
			case UmlPackage.PORT__PROTOCOL:
				return !getProtocol().isEmpty();
			case UmlPackage.PORT__IS_BEHAVIOR:
				return IS_BEHAVIOR_EDEFAULT == null ? isBehavior != null : !IS_BEHAVIOR_EDEFAULT.equals(isBehavior);
			case UmlPackage.PORT__IS_SERVICE:
				return IS_SERVICE_EDEFAULT == null ? isService != null : !IS_SERVICE_EDEFAULT.equals(isService);
			case UmlPackage.PORT__PROTOCOL1:
				return PROTOCOL1_EDEFAULT == null ? protocol1 != null : !PROTOCOL1_EDEFAULT.equals(protocol1);
			case UmlPackage.PORT__REDEFINED_PORT1:
				return REDEFINED_PORT1_EDEFAULT == null ? redefinedPort1 != null : !REDEFINED_PORT1_EDEFAULT.equals(redefinedPort1);
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
		result.append(" (group7: ");
		result.append(group7);
		result.append(", isBehavior: ");
		result.append(isBehavior);
		result.append(", isService: ");
		result.append(isService);
		result.append(", protocol1: ");
		result.append(protocol1);
		result.append(", redefinedPort1: ");
		result.append(redefinedPort1);
		result.append(')');
		return result.toString();
	}

} //PortImpl
