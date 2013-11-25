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

import org.eclipse.uml2._1._0._0.uml.DestroyObjectAction;
import org.eclipse.uml2._1._0._0.uml.InputPin;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Destroy Object Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DestroyObjectActionImpl#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DestroyObjectActionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DestroyObjectActionImpl#getIsDestroyLinks <em>Is Destroy Links</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DestroyObjectActionImpl#getIsDestroyOwnedObjects <em>Is Destroy Owned Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DestroyObjectActionImpl extends ActionImpl implements DestroyObjectAction
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
	 * The default value of the '{@link #getIsDestroyLinks() <em>Is Destroy Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDestroyLinks()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_DESTROY_LINKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDestroyLinks() <em>Is Destroy Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDestroyLinks()
	 * @generated
	 * @ordered
	 */
	protected String isDestroyLinks = IS_DESTROY_LINKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsDestroyOwnedObjects() <em>Is Destroy Owned Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDestroyOwnedObjects()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_DESTROY_OWNED_OBJECTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDestroyOwnedObjects() <em>Is Destroy Owned Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDestroyOwnedObjects()
	 * @generated
	 * @ordered
	 */
	protected String isDestroyOwnedObjects = IS_DESTROY_OWNED_OBJECTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestroyObjectActionImpl()
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
		return UmlPackage.eINSTANCE.getDestroyObjectAction();
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
			group8 = new BasicFeatureMap(this, UmlPackage.DESTROY_OBJECT_ACTION__GROUP8);
		}
		return group8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getTarget()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getDestroyObjectAction_Target());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsDestroyLinks()
	{
		return isDestroyLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDestroyLinks(String newIsDestroyLinks)
	{
		String oldIsDestroyLinks = isDestroyLinks;
		isDestroyLinks = newIsDestroyLinks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_LINKS, oldIsDestroyLinks, isDestroyLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsDestroyOwnedObjects()
	{
		return isDestroyOwnedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDestroyOwnedObjects(String newIsDestroyOwnedObjects)
	{
		String oldIsDestroyOwnedObjects = isDestroyOwnedObjects;
		isDestroyOwnedObjects = newIsDestroyOwnedObjects;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_OWNED_OBJECTS, oldIsDestroyOwnedObjects, isDestroyOwnedObjects));
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
			case UmlPackage.DESTROY_OBJECT_ACTION__GROUP8:
				return ((InternalEList<?>)getGroup8()).basicRemove(otherEnd, msgs);
			case UmlPackage.DESTROY_OBJECT_ACTION__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.DESTROY_OBJECT_ACTION__GROUP8:
				if (coreType) return getGroup8();
				return ((FeatureMap.Internal)getGroup8()).getWrapper();
			case UmlPackage.DESTROY_OBJECT_ACTION__TARGET:
				return getTarget();
			case UmlPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_LINKS:
				return getIsDestroyLinks();
			case UmlPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_OWNED_OBJECTS:
				return getIsDestroyOwnedObjects();
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
			case UmlPackage.DESTROY_OBJECT_ACTION__GROUP8:
				((FeatureMap.Internal)getGroup8()).set(newValue);
				return;
			case UmlPackage.DESTROY_OBJECT_ACTION__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends InputPin>)newValue);
				return;
			case UmlPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_LINKS:
				setIsDestroyLinks((String)newValue);
				return;
			case UmlPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_OWNED_OBJECTS:
				setIsDestroyOwnedObjects((String)newValue);
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
			case UmlPackage.DESTROY_OBJECT_ACTION__GROUP8:
				getGroup8().clear();
				return;
			case UmlPackage.DESTROY_OBJECT_ACTION__TARGET:
				getTarget().clear();
				return;
			case UmlPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_LINKS:
				setIsDestroyLinks(IS_DESTROY_LINKS_EDEFAULT);
				return;
			case UmlPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_OWNED_OBJECTS:
				setIsDestroyOwnedObjects(IS_DESTROY_OWNED_OBJECTS_EDEFAULT);
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
			case UmlPackage.DESTROY_OBJECT_ACTION__GROUP8:
				return group8 != null && !group8.isEmpty();
			case UmlPackage.DESTROY_OBJECT_ACTION__TARGET:
				return !getTarget().isEmpty();
			case UmlPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_LINKS:
				return IS_DESTROY_LINKS_EDEFAULT == null ? isDestroyLinks != null : !IS_DESTROY_LINKS_EDEFAULT.equals(isDestroyLinks);
			case UmlPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_OWNED_OBJECTS:
				return IS_DESTROY_OWNED_OBJECTS_EDEFAULT == null ? isDestroyOwnedObjects != null : !IS_DESTROY_OWNED_OBJECTS_EDEFAULT.equals(isDestroyOwnedObjects);
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
		result.append(", isDestroyLinks: ");
		result.append(isDestroyLinks);
		result.append(", isDestroyOwnedObjects: ");
		result.append(isDestroyOwnedObjects);
		result.append(')');
		return result.toString();
	}

} //DestroyObjectActionImpl
