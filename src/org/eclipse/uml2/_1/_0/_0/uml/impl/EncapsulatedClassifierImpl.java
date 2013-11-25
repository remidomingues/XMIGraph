/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.uml2._1._0._0.uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2._1._0._0.uml.EncapsulatedClassifier;
import org.eclipse.uml2._1._0._0.uml.Port;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encapsulated Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.EncapsulatedClassifierImpl#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.EncapsulatedClassifierImpl#getOwnedPort <em>Owned Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncapsulatedClassifierImpl extends StructuredClassifierImpl implements EncapsulatedClassifier
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncapsulatedClassifierImpl()
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
		return UmlPackage.eINSTANCE.getEncapsulatedClassifier();
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
			group8 = new BasicFeatureMap(this, UmlPackage.ENCAPSULATED_CLASSIFIER__GROUP8);
		}
		return group8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getOwnedPort()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getEncapsulatedClassifier_OwnedPort());
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
			case UmlPackage.ENCAPSULATED_CLASSIFIER__GROUP8:
				return ((InternalEList<?>)getGroup8()).basicRemove(otherEnd, msgs);
			case UmlPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT:
				return ((InternalEList<?>)getOwnedPort()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.ENCAPSULATED_CLASSIFIER__GROUP8:
				if (coreType) return getGroup8();
				return ((FeatureMap.Internal)getGroup8()).getWrapper();
			case UmlPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT:
				return getOwnedPort();
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
			case UmlPackage.ENCAPSULATED_CLASSIFIER__GROUP8:
				((FeatureMap.Internal)getGroup8()).set(newValue);
				return;
			case UmlPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT:
				getOwnedPort().clear();
				getOwnedPort().addAll((Collection<? extends Port>)newValue);
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
			case UmlPackage.ENCAPSULATED_CLASSIFIER__GROUP8:
				getGroup8().clear();
				return;
			case UmlPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT:
				getOwnedPort().clear();
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
			case UmlPackage.ENCAPSULATED_CLASSIFIER__GROUP8:
				return group8 != null && !group8.isEmpty();
			case UmlPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT:
				return !getOwnedPort().isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //EncapsulatedClassifierImpl
