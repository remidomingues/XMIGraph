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

import org.eclipse.uml2._1._0._0.uml.ConnectableElement;
import org.eclipse.uml2._1._0._0.uml.ConnectorEnd;
import org.eclipse.uml2._1._0._0.uml.Property;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConnectorEndImpl#getGroup4 <em>Group4</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConnectorEndImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConnectorEndImpl#getPartWithPort <em>Part With Port</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConnectorEndImpl#getPartWithPort1 <em>Part With Port1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConnectorEndImpl#getRole1 <em>Role1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorEndImpl extends MultiplicityElementImpl implements ConnectorEnd
{
	/**
	 * The cached value of the '{@link #getGroup4() <em>Group4</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup4()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group4;

	/**
	 * The default value of the '{@link #getPartWithPort1() <em>Part With Port1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartWithPort1()
	 * @generated
	 * @ordered
	 */
	protected static final String PART_WITH_PORT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartWithPort1() <em>Part With Port1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartWithPort1()
	 * @generated
	 * @ordered
	 */
	protected String partWithPort1 = PART_WITH_PORT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole1() <em>Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole1()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole1() <em>Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole1()
	 * @generated
	 * @ordered
	 */
	protected String role1 = ROLE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorEndImpl()
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
		return UmlPackage.eINSTANCE.getConnectorEnd();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup4()
	{
		if (group4 == null)
		{
			group4 = new BasicFeatureMap(this, UmlPackage.CONNECTOR_END__GROUP4);
		}
		return group4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectableElement> getRole()
	{
		return getGroup4().list(UmlPackage.eINSTANCE.getConnectorEnd_Role());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getPartWithPort()
	{
		return getGroup4().list(UmlPackage.eINSTANCE.getConnectorEnd_PartWithPort());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartWithPort1()
	{
		return partWithPort1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartWithPort1(String newPartWithPort1)
	{
		String oldPartWithPort1 = partWithPort1;
		partWithPort1 = newPartWithPort1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CONNECTOR_END__PART_WITH_PORT1, oldPartWithPort1, partWithPort1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole1()
	{
		return role1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole1(String newRole1)
	{
		String oldRole1 = role1;
		role1 = newRole1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CONNECTOR_END__ROLE1, oldRole1, role1));
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
			case UmlPackage.CONNECTOR_END__GROUP4:
				return ((InternalEList<?>)getGroup4()).basicRemove(otherEnd, msgs);
			case UmlPackage.CONNECTOR_END__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
			case UmlPackage.CONNECTOR_END__PART_WITH_PORT:
				return ((InternalEList<?>)getPartWithPort()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.CONNECTOR_END__GROUP4:
				if (coreType) return getGroup4();
				return ((FeatureMap.Internal)getGroup4()).getWrapper();
			case UmlPackage.CONNECTOR_END__ROLE:
				return getRole();
			case UmlPackage.CONNECTOR_END__PART_WITH_PORT:
				return getPartWithPort();
			case UmlPackage.CONNECTOR_END__PART_WITH_PORT1:
				return getPartWithPort1();
			case UmlPackage.CONNECTOR_END__ROLE1:
				return getRole1();
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
			case UmlPackage.CONNECTOR_END__GROUP4:
				((FeatureMap.Internal)getGroup4()).set(newValue);
				return;
			case UmlPackage.CONNECTOR_END__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends ConnectableElement>)newValue);
				return;
			case UmlPackage.CONNECTOR_END__PART_WITH_PORT:
				getPartWithPort().clear();
				getPartWithPort().addAll((Collection<? extends Property>)newValue);
				return;
			case UmlPackage.CONNECTOR_END__PART_WITH_PORT1:
				setPartWithPort1((String)newValue);
				return;
			case UmlPackage.CONNECTOR_END__ROLE1:
				setRole1((String)newValue);
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
			case UmlPackage.CONNECTOR_END__GROUP4:
				getGroup4().clear();
				return;
			case UmlPackage.CONNECTOR_END__ROLE:
				getRole().clear();
				return;
			case UmlPackage.CONNECTOR_END__PART_WITH_PORT:
				getPartWithPort().clear();
				return;
			case UmlPackage.CONNECTOR_END__PART_WITH_PORT1:
				setPartWithPort1(PART_WITH_PORT1_EDEFAULT);
				return;
			case UmlPackage.CONNECTOR_END__ROLE1:
				setRole1(ROLE1_EDEFAULT);
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
			case UmlPackage.CONNECTOR_END__GROUP4:
				return group4 != null && !group4.isEmpty();
			case UmlPackage.CONNECTOR_END__ROLE:
				return !getRole().isEmpty();
			case UmlPackage.CONNECTOR_END__PART_WITH_PORT:
				return !getPartWithPort().isEmpty();
			case UmlPackage.CONNECTOR_END__PART_WITH_PORT1:
				return PART_WITH_PORT1_EDEFAULT == null ? partWithPort1 != null : !PART_WITH_PORT1_EDEFAULT.equals(partWithPort1);
			case UmlPackage.CONNECTOR_END__ROLE1:
				return ROLE1_EDEFAULT == null ? role1 != null : !ROLE1_EDEFAULT.equals(role1);
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
		result.append(" (group4: ");
		result.append(group4);
		result.append(", partWithPort1: ");
		result.append(partWithPort1);
		result.append(", role1: ");
		result.append(role1);
		result.append(')');
		return result.toString();
	}

} //ConnectorEndImpl
