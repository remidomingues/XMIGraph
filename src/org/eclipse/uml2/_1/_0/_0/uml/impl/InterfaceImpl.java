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
import org.eclipse.uml2._1._0._0.uml.Interface;
import org.eclipse.uml2._1._0._0.uml.Operation;
import org.eclipse.uml2._1._0._0.uml.Property;
import org.eclipse.uml2._1._0._0.uml.ProtocolStateMachine;
import org.eclipse.uml2._1._0._0.uml.Reception;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InterfaceImpl#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InterfaceImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InterfaceImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InterfaceImpl#getRedefinedInterface <em>Redefined Interface</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InterfaceImpl#getNestedClassifier <em>Nested Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InterfaceImpl#getOwnedReception <em>Owned Reception</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InterfaceImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.InterfaceImpl#getRedefinedInterface1 <em>Redefined Interface1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceImpl extends ClassifierImpl implements Interface
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
	 * The default value of the '{@link #getRedefinedInterface1() <em>Redefined Interface1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedInterface1()
	 * @generated
	 * @ordered
	 */
	protected static final String REDEFINED_INTERFACE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedefinedInterface1() <em>Redefined Interface1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedInterface1()
	 * @generated
	 * @ordered
	 */
	protected String redefinedInterface1 = REDEFINED_INTERFACE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl()
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
		return UmlPackage.eINSTANCE.getInterface();
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
			group7 = new BasicFeatureMap(this, UmlPackage.INTERFACE__GROUP7);
		}
		return group7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getInterface_OwnedAttribute());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperation()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getInterface_OwnedOperation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getRedefinedInterface()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getInterface_RedefinedInterface());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getNestedClassifier()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getInterface_NestedClassifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reception> getOwnedReception()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getInterface_OwnedReception());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtocolStateMachine> getProtocol()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getInterface_Protocol());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedefinedInterface1()
	{
		return redefinedInterface1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedInterface1(String newRedefinedInterface1)
	{
		String oldRedefinedInterface1 = redefinedInterface1;
		redefinedInterface1 = newRedefinedInterface1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INTERFACE__REDEFINED_INTERFACE1, oldRedefinedInterface1, redefinedInterface1));
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
			case UmlPackage.INTERFACE__GROUP7:
				return ((InternalEList<?>)getGroup7()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERFACE__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERFACE__OWNED_OPERATION:
				return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERFACE__REDEFINED_INTERFACE:
				return ((InternalEList<?>)getRedefinedInterface()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERFACE__NESTED_CLASSIFIER:
				return ((InternalEList<?>)getNestedClassifier()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERFACE__OWNED_RECEPTION:
				return ((InternalEList<?>)getOwnedReception()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERFACE__PROTOCOL:
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
			case UmlPackage.INTERFACE__GROUP7:
				if (coreType) return getGroup7();
				return ((FeatureMap.Internal)getGroup7()).getWrapper();
			case UmlPackage.INTERFACE__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case UmlPackage.INTERFACE__OWNED_OPERATION:
				return getOwnedOperation();
			case UmlPackage.INTERFACE__REDEFINED_INTERFACE:
				return getRedefinedInterface();
			case UmlPackage.INTERFACE__NESTED_CLASSIFIER:
				return getNestedClassifier();
			case UmlPackage.INTERFACE__OWNED_RECEPTION:
				return getOwnedReception();
			case UmlPackage.INTERFACE__PROTOCOL:
				return getProtocol();
			case UmlPackage.INTERFACE__REDEFINED_INTERFACE1:
				return getRedefinedInterface1();
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
			case UmlPackage.INTERFACE__GROUP7:
				((FeatureMap.Internal)getGroup7()).set(newValue);
				return;
			case UmlPackage.INTERFACE__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case UmlPackage.INTERFACE__OWNED_OPERATION:
				getOwnedOperation().clear();
				getOwnedOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case UmlPackage.INTERFACE__REDEFINED_INTERFACE:
				getRedefinedInterface().clear();
				getRedefinedInterface().addAll((Collection<? extends Interface>)newValue);
				return;
			case UmlPackage.INTERFACE__NESTED_CLASSIFIER:
				getNestedClassifier().clear();
				getNestedClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case UmlPackage.INTERFACE__OWNED_RECEPTION:
				getOwnedReception().clear();
				getOwnedReception().addAll((Collection<? extends Reception>)newValue);
				return;
			case UmlPackage.INTERFACE__PROTOCOL:
				getProtocol().clear();
				getProtocol().addAll((Collection<? extends ProtocolStateMachine>)newValue);
				return;
			case UmlPackage.INTERFACE__REDEFINED_INTERFACE1:
				setRedefinedInterface1((String)newValue);
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
			case UmlPackage.INTERFACE__GROUP7:
				getGroup7().clear();
				return;
			case UmlPackage.INTERFACE__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
			case UmlPackage.INTERFACE__OWNED_OPERATION:
				getOwnedOperation().clear();
				return;
			case UmlPackage.INTERFACE__REDEFINED_INTERFACE:
				getRedefinedInterface().clear();
				return;
			case UmlPackage.INTERFACE__NESTED_CLASSIFIER:
				getNestedClassifier().clear();
				return;
			case UmlPackage.INTERFACE__OWNED_RECEPTION:
				getOwnedReception().clear();
				return;
			case UmlPackage.INTERFACE__PROTOCOL:
				getProtocol().clear();
				return;
			case UmlPackage.INTERFACE__REDEFINED_INTERFACE1:
				setRedefinedInterface1(REDEFINED_INTERFACE1_EDEFAULT);
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
			case UmlPackage.INTERFACE__GROUP7:
				return group7 != null && !group7.isEmpty();
			case UmlPackage.INTERFACE__OWNED_ATTRIBUTE:
				return !getOwnedAttribute().isEmpty();
			case UmlPackage.INTERFACE__OWNED_OPERATION:
				return !getOwnedOperation().isEmpty();
			case UmlPackage.INTERFACE__REDEFINED_INTERFACE:
				return !getRedefinedInterface().isEmpty();
			case UmlPackage.INTERFACE__NESTED_CLASSIFIER:
				return !getNestedClassifier().isEmpty();
			case UmlPackage.INTERFACE__OWNED_RECEPTION:
				return !getOwnedReception().isEmpty();
			case UmlPackage.INTERFACE__PROTOCOL:
				return !getProtocol().isEmpty();
			case UmlPackage.INTERFACE__REDEFINED_INTERFACE1:
				return REDEFINED_INTERFACE1_EDEFAULT == null ? redefinedInterface1 != null : !REDEFINED_INTERFACE1_EDEFAULT.equals(redefinedInterface1);
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
		result.append(", redefinedInterface1: ");
		result.append(redefinedInterface1);
		result.append(')');
		return result.toString();
	}

} //InterfaceImpl
