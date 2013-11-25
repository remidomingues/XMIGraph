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

import org.eclipse.uml2._1._0._0.uml.Association;
import org.eclipse.uml2._1._0._0.uml.Behavior;
import org.eclipse.uml2._1._0._0.uml.Connector;
import org.eclipse.uml2._1._0._0.uml.ConnectorEnd;
import org.eclipse.uml2._1._0._0.uml.ConnectorKind;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConnectorImpl#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConnectorImpl#getType1 <em>Type1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConnectorImpl#getRedefinedConnector <em>Redefined Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConnectorImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConnectorImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConnectorImpl#getContract1 <em>Contract1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConnectorImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConnectorImpl#getRedefinedConnector1 <em>Redefined Connector1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConnectorImpl#getType2 <em>Type2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorImpl extends FeatureImpl implements Connector
{
	/**
	 * The cached value of the '{@link #getGroup5() <em>Group5</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup5()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group5;

	/**
	 * The default value of the '{@link #getContract1() <em>Contract1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract1()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRACT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContract1() <em>Contract1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract1()
	 * @generated
	 * @ordered
	 */
	protected String contract1 = CONTRACT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectorKind KIND_EDEFAULT = ConnectorKind.ASSEMBLY;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ConnectorKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The default value of the '{@link #getRedefinedConnector1() <em>Redefined Connector1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedConnector1()
	 * @generated
	 * @ordered
	 */
	protected static final String REDEFINED_CONNECTOR1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedefinedConnector1() <em>Redefined Connector1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedConnector1()
	 * @generated
	 * @ordered
	 */
	protected String redefinedConnector1 = REDEFINED_CONNECTOR1_EDEFAULT;

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
	protected ConnectorImpl()
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
		return UmlPackage.eINSTANCE.getConnector();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup5()
	{
		if (group5 == null)
		{
			group5 = new BasicFeatureMap(this, UmlPackage.CONNECTOR__GROUP5);
		}
		return group5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getType1()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getConnector_Type1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getRedefinedConnector()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getConnector_RedefinedConnector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorEnd> getEnd()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getConnector_End());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getContract()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getConnector_Contract());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContract1()
	{
		return contract1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContract1(String newContract1)
	{
		String oldContract1 = contract1;
		contract1 = newContract1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CONNECTOR__CONTRACT1, oldContract1, contract1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorKind getKind()
	{
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ConnectorKind newKind)
	{
		ConnectorKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		boolean oldKindESet = kindESet;
		kindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CONNECTOR__KIND, oldKind, kind, !oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKind()
	{
		ConnectorKind oldKind = kind;
		boolean oldKindESet = kindESet;
		kind = KIND_EDEFAULT;
		kindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.CONNECTOR__KIND, oldKind, KIND_EDEFAULT, oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKind()
	{
		return kindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedefinedConnector1()
	{
		return redefinedConnector1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedConnector1(String newRedefinedConnector1)
	{
		String oldRedefinedConnector1 = redefinedConnector1;
		redefinedConnector1 = newRedefinedConnector1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CONNECTOR__REDEFINED_CONNECTOR1, oldRedefinedConnector1, redefinedConnector1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CONNECTOR__TYPE2, oldType2, type2));
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
			case UmlPackage.CONNECTOR__GROUP5:
				return ((InternalEList<?>)getGroup5()).basicRemove(otherEnd, msgs);
			case UmlPackage.CONNECTOR__TYPE1:
				return ((InternalEList<?>)getType1()).basicRemove(otherEnd, msgs);
			case UmlPackage.CONNECTOR__REDEFINED_CONNECTOR:
				return ((InternalEList<?>)getRedefinedConnector()).basicRemove(otherEnd, msgs);
			case UmlPackage.CONNECTOR__END:
				return ((InternalEList<?>)getEnd()).basicRemove(otherEnd, msgs);
			case UmlPackage.CONNECTOR__CONTRACT:
				return ((InternalEList<?>)getContract()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.CONNECTOR__GROUP5:
				if (coreType) return getGroup5();
				return ((FeatureMap.Internal)getGroup5()).getWrapper();
			case UmlPackage.CONNECTOR__TYPE1:
				return getType1();
			case UmlPackage.CONNECTOR__REDEFINED_CONNECTOR:
				return getRedefinedConnector();
			case UmlPackage.CONNECTOR__END:
				return getEnd();
			case UmlPackage.CONNECTOR__CONTRACT:
				return getContract();
			case UmlPackage.CONNECTOR__CONTRACT1:
				return getContract1();
			case UmlPackage.CONNECTOR__KIND:
				return getKind();
			case UmlPackage.CONNECTOR__REDEFINED_CONNECTOR1:
				return getRedefinedConnector1();
			case UmlPackage.CONNECTOR__TYPE2:
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
			case UmlPackage.CONNECTOR__GROUP5:
				((FeatureMap.Internal)getGroup5()).set(newValue);
				return;
			case UmlPackage.CONNECTOR__TYPE1:
				getType1().clear();
				getType1().addAll((Collection<? extends Association>)newValue);
				return;
			case UmlPackage.CONNECTOR__REDEFINED_CONNECTOR:
				getRedefinedConnector().clear();
				getRedefinedConnector().addAll((Collection<? extends Connector>)newValue);
				return;
			case UmlPackage.CONNECTOR__END:
				getEnd().clear();
				getEnd().addAll((Collection<? extends ConnectorEnd>)newValue);
				return;
			case UmlPackage.CONNECTOR__CONTRACT:
				getContract().clear();
				getContract().addAll((Collection<? extends Behavior>)newValue);
				return;
			case UmlPackage.CONNECTOR__CONTRACT1:
				setContract1((String)newValue);
				return;
			case UmlPackage.CONNECTOR__KIND:
				setKind((ConnectorKind)newValue);
				return;
			case UmlPackage.CONNECTOR__REDEFINED_CONNECTOR1:
				setRedefinedConnector1((String)newValue);
				return;
			case UmlPackage.CONNECTOR__TYPE2:
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
			case UmlPackage.CONNECTOR__GROUP5:
				getGroup5().clear();
				return;
			case UmlPackage.CONNECTOR__TYPE1:
				getType1().clear();
				return;
			case UmlPackage.CONNECTOR__REDEFINED_CONNECTOR:
				getRedefinedConnector().clear();
				return;
			case UmlPackage.CONNECTOR__END:
				getEnd().clear();
				return;
			case UmlPackage.CONNECTOR__CONTRACT:
				getContract().clear();
				return;
			case UmlPackage.CONNECTOR__CONTRACT1:
				setContract1(CONTRACT1_EDEFAULT);
				return;
			case UmlPackage.CONNECTOR__KIND:
				unsetKind();
				return;
			case UmlPackage.CONNECTOR__REDEFINED_CONNECTOR1:
				setRedefinedConnector1(REDEFINED_CONNECTOR1_EDEFAULT);
				return;
			case UmlPackage.CONNECTOR__TYPE2:
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
			case UmlPackage.CONNECTOR__GROUP5:
				return group5 != null && !group5.isEmpty();
			case UmlPackage.CONNECTOR__TYPE1:
				return !getType1().isEmpty();
			case UmlPackage.CONNECTOR__REDEFINED_CONNECTOR:
				return !getRedefinedConnector().isEmpty();
			case UmlPackage.CONNECTOR__END:
				return !getEnd().isEmpty();
			case UmlPackage.CONNECTOR__CONTRACT:
				return !getContract().isEmpty();
			case UmlPackage.CONNECTOR__CONTRACT1:
				return CONTRACT1_EDEFAULT == null ? contract1 != null : !CONTRACT1_EDEFAULT.equals(contract1);
			case UmlPackage.CONNECTOR__KIND:
				return isSetKind();
			case UmlPackage.CONNECTOR__REDEFINED_CONNECTOR1:
				return REDEFINED_CONNECTOR1_EDEFAULT == null ? redefinedConnector1 != null : !REDEFINED_CONNECTOR1_EDEFAULT.equals(redefinedConnector1);
			case UmlPackage.CONNECTOR__TYPE2:
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
		result.append(" (group5: ");
		result.append(group5);
		result.append(", contract1: ");
		result.append(contract1);
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(", redefinedConnector1: ");
		result.append(redefinedConnector1);
		result.append(", type2: ");
		result.append(type2);
		result.append(')');
		return result.toString();
	}

} //ConnectorImpl
