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

import org.eclipse.uml2._1._0._0.uml.Collaboration;
import org.eclipse.uml2._1._0._0.uml.ConnectableElement;
import org.eclipse.uml2._1._0._0.uml.Connector;
import org.eclipse.uml2._1._0._0.uml.Property;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CollaborationImpl#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CollaborationImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CollaborationImpl#getOwnedConnector <em>Owned Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CollaborationImpl#getCollaborationRole <em>Collaboration Role</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CollaborationImpl#getCollaborationRole1 <em>Collaboration Role1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollaborationImpl extends BehavioredClassifierImpl implements Collaboration
{
	/**
	 * The cached value of the '{@link #getGroup8() <em>Group8</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup8()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group8;

	/**
	 * The default value of the '{@link #getCollaborationRole1() <em>Collaboration Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborationRole1()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLABORATION_ROLE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollaborationRole1() <em>Collaboration Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborationRole1()
	 * @generated
	 * @ordered
	 */
	protected String collaborationRole1 = COLLABORATION_ROLE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborationImpl()
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
		return UmlPackage.eINSTANCE.getCollaboration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup8()
	{
		if (group8 == null)
		{
			group8 = new BasicFeatureMap(this, UmlPackage.COLLABORATION__GROUP8);
		}
		return group8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getCollaboration_OwnedAttribute());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getOwnedConnector()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getCollaboration_OwnedConnector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectableElement> getCollaborationRole()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getCollaboration_CollaborationRole());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCollaborationRole1()
	{
		return collaborationRole1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollaborationRole1(String newCollaborationRole1)
	{
		String oldCollaborationRole1 = collaborationRole1;
		collaborationRole1 = newCollaborationRole1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.COLLABORATION__COLLABORATION_ROLE1, oldCollaborationRole1, collaborationRole1));
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
			case UmlPackage.COLLABORATION__GROUP8:
				return ((InternalEList<?>)getGroup8()).basicRemove(otherEnd, msgs);
			case UmlPackage.COLLABORATION__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
			case UmlPackage.COLLABORATION__OWNED_CONNECTOR:
				return ((InternalEList<?>)getOwnedConnector()).basicRemove(otherEnd, msgs);
			case UmlPackage.COLLABORATION__COLLABORATION_ROLE:
				return ((InternalEList<?>)getCollaborationRole()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.COLLABORATION__GROUP8:
				if (coreType) return getGroup8();
				return ((FeatureMap.Internal)getGroup8()).getWrapper();
			case UmlPackage.COLLABORATION__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case UmlPackage.COLLABORATION__OWNED_CONNECTOR:
				return getOwnedConnector();
			case UmlPackage.COLLABORATION__COLLABORATION_ROLE:
				return getCollaborationRole();
			case UmlPackage.COLLABORATION__COLLABORATION_ROLE1:
				return getCollaborationRole1();
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
			case UmlPackage.COLLABORATION__GROUP8:
				((FeatureMap.Internal)getGroup8()).set(newValue);
				return;
			case UmlPackage.COLLABORATION__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case UmlPackage.COLLABORATION__OWNED_CONNECTOR:
				getOwnedConnector().clear();
				getOwnedConnector().addAll((Collection<? extends Connector>)newValue);
				return;
			case UmlPackage.COLLABORATION__COLLABORATION_ROLE:
				getCollaborationRole().clear();
				getCollaborationRole().addAll((Collection<? extends ConnectableElement>)newValue);
				return;
			case UmlPackage.COLLABORATION__COLLABORATION_ROLE1:
				setCollaborationRole1((String)newValue);
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
			case UmlPackage.COLLABORATION__GROUP8:
				getGroup8().clear();
				return;
			case UmlPackage.COLLABORATION__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
			case UmlPackage.COLLABORATION__OWNED_CONNECTOR:
				getOwnedConnector().clear();
				return;
			case UmlPackage.COLLABORATION__COLLABORATION_ROLE:
				getCollaborationRole().clear();
				return;
			case UmlPackage.COLLABORATION__COLLABORATION_ROLE1:
				setCollaborationRole1(COLLABORATION_ROLE1_EDEFAULT);
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
			case UmlPackage.COLLABORATION__GROUP8:
				return group8 != null && !group8.isEmpty();
			case UmlPackage.COLLABORATION__OWNED_ATTRIBUTE:
				return !getOwnedAttribute().isEmpty();
			case UmlPackage.COLLABORATION__OWNED_CONNECTOR:
				return !getOwnedConnector().isEmpty();
			case UmlPackage.COLLABORATION__COLLABORATION_ROLE:
				return !getCollaborationRole().isEmpty();
			case UmlPackage.COLLABORATION__COLLABORATION_ROLE1:
				return COLLABORATION_ROLE1_EDEFAULT == null ? collaborationRole1 != null : !COLLABORATION_ROLE1_EDEFAULT.equals(collaborationRole1);
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
		result.append(" (group8: ");
		result.append(group8);
		result.append(", collaborationRole1: ");
		result.append(collaborationRole1);
		result.append(')');
		return result.toString();
	}

} //CollaborationImpl
