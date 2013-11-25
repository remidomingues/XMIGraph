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
import org.eclipse.uml2._1._0._0.uml.CollaborationOccurrence;
import org.eclipse.uml2._1._0._0.uml.Dependency;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CollaborationOccurrenceImpl#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CollaborationOccurrenceImpl#getType1 <em>Type1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CollaborationOccurrenceImpl#getRoleBinding <em>Role Binding</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CollaborationOccurrenceImpl#getType2 <em>Type2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollaborationOccurrenceImpl extends NamedElementImpl implements CollaborationOccurrence
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
	protected CollaborationOccurrenceImpl()
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
		return UmlPackage.eINSTANCE.getCollaborationOccurrence();
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
			group5 = new BasicFeatureMap(this, UmlPackage.COLLABORATION_OCCURRENCE__GROUP5);
		}
		return group5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Collaboration> getType1()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getCollaborationOccurrence_Type1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getRoleBinding()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getCollaborationOccurrence_RoleBinding());
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.COLLABORATION_OCCURRENCE__TYPE2, oldType2, type2));
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
			case UmlPackage.COLLABORATION_OCCURRENCE__GROUP5:
				return ((InternalEList<?>)getGroup5()).basicRemove(otherEnd, msgs);
			case UmlPackage.COLLABORATION_OCCURRENCE__TYPE1:
				return ((InternalEList<?>)getType1()).basicRemove(otherEnd, msgs);
			case UmlPackage.COLLABORATION_OCCURRENCE__ROLE_BINDING:
				return ((InternalEList<?>)getRoleBinding()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.COLLABORATION_OCCURRENCE__GROUP5:
				if (coreType) return getGroup5();
				return ((FeatureMap.Internal)getGroup5()).getWrapper();
			case UmlPackage.COLLABORATION_OCCURRENCE__TYPE1:
				return getType1();
			case UmlPackage.COLLABORATION_OCCURRENCE__ROLE_BINDING:
				return getRoleBinding();
			case UmlPackage.COLLABORATION_OCCURRENCE__TYPE2:
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
			case UmlPackage.COLLABORATION_OCCURRENCE__GROUP5:
				((FeatureMap.Internal)getGroup5()).set(newValue);
				return;
			case UmlPackage.COLLABORATION_OCCURRENCE__TYPE1:
				getType1().clear();
				getType1().addAll((Collection<? extends Collaboration>)newValue);
				return;
			case UmlPackage.COLLABORATION_OCCURRENCE__ROLE_BINDING:
				getRoleBinding().clear();
				getRoleBinding().addAll((Collection<? extends Dependency>)newValue);
				return;
			case UmlPackage.COLLABORATION_OCCURRENCE__TYPE2:
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
			case UmlPackage.COLLABORATION_OCCURRENCE__GROUP5:
				getGroup5().clear();
				return;
			case UmlPackage.COLLABORATION_OCCURRENCE__TYPE1:
				getType1().clear();
				return;
			case UmlPackage.COLLABORATION_OCCURRENCE__ROLE_BINDING:
				getRoleBinding().clear();
				return;
			case UmlPackage.COLLABORATION_OCCURRENCE__TYPE2:
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
			case UmlPackage.COLLABORATION_OCCURRENCE__GROUP5:
				return group5 != null && !group5.isEmpty();
			case UmlPackage.COLLABORATION_OCCURRENCE__TYPE1:
				return !getType1().isEmpty();
			case UmlPackage.COLLABORATION_OCCURRENCE__ROLE_BINDING:
				return !getRoleBinding().isEmpty();
			case UmlPackage.COLLABORATION_OCCURRENCE__TYPE2:
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
		result.append(", type2: ");
		result.append(type2);
		result.append(')');
		return result.toString();
	}

} //CollaborationOccurrenceImpl
