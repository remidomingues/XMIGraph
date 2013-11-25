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

import org.eclipse.uml2._1._0._0.uml.ConnectionPointReference;
import org.eclipse.uml2._1._0._0.uml.Pseudostate;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Point Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConnectionPointReferenceImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConnectionPointReferenceImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConnectionPointReferenceImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConnectionPointReferenceImpl#getEntry1 <em>Entry1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConnectionPointReferenceImpl#getExit1 <em>Exit1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionPointReferenceImpl extends VertexImpl implements ConnectionPointReference
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
	 * The default value of the '{@link #getEntry1() <em>Entry1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry1()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRY1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntry1() <em>Entry1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry1()
	 * @generated
	 * @ordered
	 */
	protected String entry1 = ENTRY1_EDEFAULT;

	/**
	 * The default value of the '{@link #getExit1() <em>Exit1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit1()
	 * @generated
	 * @ordered
	 */
	protected static final String EXIT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExit1() <em>Exit1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit1()
	 * @generated
	 * @ordered
	 */
	protected String exit1 = EXIT1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionPointReferenceImpl()
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
		return UmlPackage.eINSTANCE.getConnectionPointReference();
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
			group6 = new BasicFeatureMap(this, UmlPackage.CONNECTION_POINT_REFERENCE__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pseudostate> getEntry()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getConnectionPointReference_Entry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pseudostate> getExit()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getConnectionPointReference_Exit());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntry1()
	{
		return entry1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry1(String newEntry1)
	{
		String oldEntry1 = entry1;
		entry1 = newEntry1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CONNECTION_POINT_REFERENCE__ENTRY1, oldEntry1, entry1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExit1()
	{
		return exit1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExit1(String newExit1)
	{
		String oldExit1 = exit1;
		exit1 = newExit1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CONNECTION_POINT_REFERENCE__EXIT1, oldExit1, exit1));
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
			case UmlPackage.CONNECTION_POINT_REFERENCE__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.CONNECTION_POINT_REFERENCE__ENTRY:
				return ((InternalEList<?>)getEntry()).basicRemove(otherEnd, msgs);
			case UmlPackage.CONNECTION_POINT_REFERENCE__EXIT:
				return ((InternalEList<?>)getExit()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.CONNECTION_POINT_REFERENCE__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.CONNECTION_POINT_REFERENCE__ENTRY:
				return getEntry();
			case UmlPackage.CONNECTION_POINT_REFERENCE__EXIT:
				return getExit();
			case UmlPackage.CONNECTION_POINT_REFERENCE__ENTRY1:
				return getEntry1();
			case UmlPackage.CONNECTION_POINT_REFERENCE__EXIT1:
				return getExit1();
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
			case UmlPackage.CONNECTION_POINT_REFERENCE__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.CONNECTION_POINT_REFERENCE__ENTRY:
				getEntry().clear();
				getEntry().addAll((Collection<? extends Pseudostate>)newValue);
				return;
			case UmlPackage.CONNECTION_POINT_REFERENCE__EXIT:
				getExit().clear();
				getExit().addAll((Collection<? extends Pseudostate>)newValue);
				return;
			case UmlPackage.CONNECTION_POINT_REFERENCE__ENTRY1:
				setEntry1((String)newValue);
				return;
			case UmlPackage.CONNECTION_POINT_REFERENCE__EXIT1:
				setExit1((String)newValue);
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
			case UmlPackage.CONNECTION_POINT_REFERENCE__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.CONNECTION_POINT_REFERENCE__ENTRY:
				getEntry().clear();
				return;
			case UmlPackage.CONNECTION_POINT_REFERENCE__EXIT:
				getExit().clear();
				return;
			case UmlPackage.CONNECTION_POINT_REFERENCE__ENTRY1:
				setEntry1(ENTRY1_EDEFAULT);
				return;
			case UmlPackage.CONNECTION_POINT_REFERENCE__EXIT1:
				setExit1(EXIT1_EDEFAULT);
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
			case UmlPackage.CONNECTION_POINT_REFERENCE__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.CONNECTION_POINT_REFERENCE__ENTRY:
				return !getEntry().isEmpty();
			case UmlPackage.CONNECTION_POINT_REFERENCE__EXIT:
				return !getExit().isEmpty();
			case UmlPackage.CONNECTION_POINT_REFERENCE__ENTRY1:
				return ENTRY1_EDEFAULT == null ? entry1 != null : !ENTRY1_EDEFAULT.equals(entry1);
			case UmlPackage.CONNECTION_POINT_REFERENCE__EXIT1:
				return EXIT1_EDEFAULT == null ? exit1 != null : !EXIT1_EDEFAULT.equals(exit1);
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
		result.append(", entry1: ");
		result.append(entry1);
		result.append(", exit1: ");
		result.append(exit1);
		result.append(')');
		return result.toString();
	}

} //ConnectionPointReferenceImpl
