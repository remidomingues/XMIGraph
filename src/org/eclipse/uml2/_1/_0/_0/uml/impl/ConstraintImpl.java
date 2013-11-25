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

import org.eclipse.uml2._1._0._0.uml.Constraint;
import org.eclipse.uml2._1._0._0.uml.Element;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConstraintImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConstraintImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConstraintImpl#getConstrainedElement <em>Constrained Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ConstraintImpl#getConstrainedElement1 <em>Constrained Element1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintImpl extends PackageableElementImpl implements Constraint
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
	 * The default value of the '{@link #getConstrainedElement1() <em>Constrained Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedElement1()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINED_ELEMENT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstrainedElement1() <em>Constrained Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedElement1()
	 * @generated
	 * @ordered
	 */
	protected String constrainedElement1 = CONSTRAINED_ELEMENT1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl()
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
		return UmlPackage.eINSTANCE.getConstraint();
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
			group6 = new BasicFeatureMap(this, UmlPackage.CONSTRAINT__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getSpecification()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getConstraint_Specification());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getConstrainedElement()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getConstraint_ConstrainedElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstrainedElement1()
	{
		return constrainedElement1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainedElement1(String newConstrainedElement1)
	{
		String oldConstrainedElement1 = constrainedElement1;
		constrainedElement1 = newConstrainedElement1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CONSTRAINT__CONSTRAINED_ELEMENT1, oldConstrainedElement1, constrainedElement1));
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
			case UmlPackage.CONSTRAINT__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.CONSTRAINT__SPECIFICATION:
				return ((InternalEList<?>)getSpecification()).basicRemove(otherEnd, msgs);
			case UmlPackage.CONSTRAINT__CONSTRAINED_ELEMENT:
				return ((InternalEList<?>)getConstrainedElement()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.CONSTRAINT__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.CONSTRAINT__SPECIFICATION:
				return getSpecification();
			case UmlPackage.CONSTRAINT__CONSTRAINED_ELEMENT:
				return getConstrainedElement();
			case UmlPackage.CONSTRAINT__CONSTRAINED_ELEMENT1:
				return getConstrainedElement1();
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
			case UmlPackage.CONSTRAINT__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.CONSTRAINT__SPECIFICATION:
				getSpecification().clear();
				getSpecification().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UmlPackage.CONSTRAINT__CONSTRAINED_ELEMENT:
				getConstrainedElement().clear();
				getConstrainedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case UmlPackage.CONSTRAINT__CONSTRAINED_ELEMENT1:
				setConstrainedElement1((String)newValue);
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
			case UmlPackage.CONSTRAINT__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.CONSTRAINT__SPECIFICATION:
				getSpecification().clear();
				return;
			case UmlPackage.CONSTRAINT__CONSTRAINED_ELEMENT:
				getConstrainedElement().clear();
				return;
			case UmlPackage.CONSTRAINT__CONSTRAINED_ELEMENT1:
				setConstrainedElement1(CONSTRAINED_ELEMENT1_EDEFAULT);
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
			case UmlPackage.CONSTRAINT__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.CONSTRAINT__SPECIFICATION:
				return !getSpecification().isEmpty();
			case UmlPackage.CONSTRAINT__CONSTRAINED_ELEMENT:
				return !getConstrainedElement().isEmpty();
			case UmlPackage.CONSTRAINT__CONSTRAINED_ELEMENT1:
				return CONSTRAINED_ELEMENT1_EDEFAULT == null ? constrainedElement1 != null : !CONSTRAINED_ELEMENT1_EDEFAULT.equals(constrainedElement1);
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
		result.append(", constrainedElement1: ");
		result.append(constrainedElement1);
		result.append(')');
		return result.toString();
	}

} //ConstraintImpl
