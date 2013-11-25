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

import org.eclipse.uml2._1._0._0.uml.Behavior;
import org.eclipse.uml2._1._0._0.uml.BehavioralFeature;
import org.eclipse.uml2._1._0._0.uml.Constraint;
import org.eclipse.uml2._1._0._0.uml.Parameter;
import org.eclipse.uml2._1._0._0.uml.ParameterSet;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehaviorImpl#getGroup9 <em>Group9</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehaviorImpl#getRedefinedBehavior <em>Redefined Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehaviorImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehaviorImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehaviorImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehaviorImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehaviorImpl#getOwnedParameterSet <em>Owned Parameter Set</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehaviorImpl#getIsReentrant <em>Is Reentrant</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehaviorImpl#getPostcondition1 <em>Postcondition1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehaviorImpl#getPrecondition1 <em>Precondition1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehaviorImpl#getRedefinedBehavior1 <em>Redefined Behavior1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehaviorImpl#getSpecification1 <em>Specification1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorImpl extends ClassImpl implements Behavior
{
	/**
	 * The cached value of the '{@link #getGroup9() <em>Group9</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup9()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group9;

	/**
	 * The default value of the '{@link #getIsReentrant() <em>Is Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReentrant()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_REENTRANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsReentrant() <em>Is Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReentrant()
	 * @generated
	 * @ordered
	 */
	protected String isReentrant = IS_REENTRANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostcondition1() <em>Postcondition1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition1()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTCONDITION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostcondition1() <em>Postcondition1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition1()
	 * @generated
	 * @ordered
	 */
	protected String postcondition1 = POSTCONDITION1_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecondition1() <em>Precondition1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition1()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECONDITION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecondition1() <em>Precondition1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition1()
	 * @generated
	 * @ordered
	 */
	protected String precondition1 = PRECONDITION1_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedefinedBehavior1() <em>Redefined Behavior1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedBehavior1()
	 * @generated
	 * @ordered
	 */
	protected static final String REDEFINED_BEHAVIOR1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedefinedBehavior1() <em>Redefined Behavior1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedBehavior1()
	 * @generated
	 * @ordered
	 */
	protected String redefinedBehavior1 = REDEFINED_BEHAVIOR1_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecification1() <em>Specification1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification1()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFICATION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecification1() <em>Specification1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification1()
	 * @generated
	 * @ordered
	 */
	protected String specification1 = SPECIFICATION1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorImpl()
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
		return UmlPackage.eINSTANCE.getBehavior();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup9()
	{
		if (group9 == null)
		{
			group9 = new BasicFeatureMap(this, UmlPackage.BEHAVIOR__GROUP9);
		}
		return group9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getRedefinedBehavior()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getBehavior_RedefinedBehavior());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehavioralFeature> getSpecification()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getBehavior_Specification());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameter()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getBehavior_Parameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPrecondition()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getBehavior_Precondition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPostcondition()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getBehavior_Postcondition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterSet> getOwnedParameterSet()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getBehavior_OwnedParameterSet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsReentrant()
	{
		return isReentrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReentrant(String newIsReentrant)
	{
		String oldIsReentrant = isReentrant;
		isReentrant = newIsReentrant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.BEHAVIOR__IS_REENTRANT, oldIsReentrant, isReentrant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostcondition1()
	{
		return postcondition1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostcondition1(String newPostcondition1)
	{
		String oldPostcondition1 = postcondition1;
		postcondition1 = newPostcondition1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.BEHAVIOR__POSTCONDITION1, oldPostcondition1, postcondition1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrecondition1()
	{
		return precondition1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecondition1(String newPrecondition1)
	{
		String oldPrecondition1 = precondition1;
		precondition1 = newPrecondition1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.BEHAVIOR__PRECONDITION1, oldPrecondition1, precondition1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedefinedBehavior1()
	{
		return redefinedBehavior1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedBehavior1(String newRedefinedBehavior1)
	{
		String oldRedefinedBehavior1 = redefinedBehavior1;
		redefinedBehavior1 = newRedefinedBehavior1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.BEHAVIOR__REDEFINED_BEHAVIOR1, oldRedefinedBehavior1, redefinedBehavior1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecification1()
	{
		return specification1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification1(String newSpecification1)
	{
		String oldSpecification1 = specification1;
		specification1 = newSpecification1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.BEHAVIOR__SPECIFICATION1, oldSpecification1, specification1));
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
			case UmlPackage.BEHAVIOR__GROUP9:
				return ((InternalEList<?>)getGroup9()).basicRemove(otherEnd, msgs);
			case UmlPackage.BEHAVIOR__REDEFINED_BEHAVIOR:
				return ((InternalEList<?>)getRedefinedBehavior()).basicRemove(otherEnd, msgs);
			case UmlPackage.BEHAVIOR__SPECIFICATION:
				return ((InternalEList<?>)getSpecification()).basicRemove(otherEnd, msgs);
			case UmlPackage.BEHAVIOR__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case UmlPackage.BEHAVIOR__PRECONDITION:
				return ((InternalEList<?>)getPrecondition()).basicRemove(otherEnd, msgs);
			case UmlPackage.BEHAVIOR__POSTCONDITION:
				return ((InternalEList<?>)getPostcondition()).basicRemove(otherEnd, msgs);
			case UmlPackage.BEHAVIOR__OWNED_PARAMETER_SET:
				return ((InternalEList<?>)getOwnedParameterSet()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.BEHAVIOR__GROUP9:
				if (coreType) return getGroup9();
				return ((FeatureMap.Internal)getGroup9()).getWrapper();
			case UmlPackage.BEHAVIOR__REDEFINED_BEHAVIOR:
				return getRedefinedBehavior();
			case UmlPackage.BEHAVIOR__SPECIFICATION:
				return getSpecification();
			case UmlPackage.BEHAVIOR__PARAMETER:
				return getParameter();
			case UmlPackage.BEHAVIOR__PRECONDITION:
				return getPrecondition();
			case UmlPackage.BEHAVIOR__POSTCONDITION:
				return getPostcondition();
			case UmlPackage.BEHAVIOR__OWNED_PARAMETER_SET:
				return getOwnedParameterSet();
			case UmlPackage.BEHAVIOR__IS_REENTRANT:
				return getIsReentrant();
			case UmlPackage.BEHAVIOR__POSTCONDITION1:
				return getPostcondition1();
			case UmlPackage.BEHAVIOR__PRECONDITION1:
				return getPrecondition1();
			case UmlPackage.BEHAVIOR__REDEFINED_BEHAVIOR1:
				return getRedefinedBehavior1();
			case UmlPackage.BEHAVIOR__SPECIFICATION1:
				return getSpecification1();
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
			case UmlPackage.BEHAVIOR__GROUP9:
				((FeatureMap.Internal)getGroup9()).set(newValue);
				return;
			case UmlPackage.BEHAVIOR__REDEFINED_BEHAVIOR:
				getRedefinedBehavior().clear();
				getRedefinedBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case UmlPackage.BEHAVIOR__SPECIFICATION:
				getSpecification().clear();
				getSpecification().addAll((Collection<? extends BehavioralFeature>)newValue);
				return;
			case UmlPackage.BEHAVIOR__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case UmlPackage.BEHAVIOR__PRECONDITION:
				getPrecondition().clear();
				getPrecondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case UmlPackage.BEHAVIOR__POSTCONDITION:
				getPostcondition().clear();
				getPostcondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case UmlPackage.BEHAVIOR__OWNED_PARAMETER_SET:
				getOwnedParameterSet().clear();
				getOwnedParameterSet().addAll((Collection<? extends ParameterSet>)newValue);
				return;
			case UmlPackage.BEHAVIOR__IS_REENTRANT:
				setIsReentrant((String)newValue);
				return;
			case UmlPackage.BEHAVIOR__POSTCONDITION1:
				setPostcondition1((String)newValue);
				return;
			case UmlPackage.BEHAVIOR__PRECONDITION1:
				setPrecondition1((String)newValue);
				return;
			case UmlPackage.BEHAVIOR__REDEFINED_BEHAVIOR1:
				setRedefinedBehavior1((String)newValue);
				return;
			case UmlPackage.BEHAVIOR__SPECIFICATION1:
				setSpecification1((String)newValue);
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
			case UmlPackage.BEHAVIOR__GROUP9:
				getGroup9().clear();
				return;
			case UmlPackage.BEHAVIOR__REDEFINED_BEHAVIOR:
				getRedefinedBehavior().clear();
				return;
			case UmlPackage.BEHAVIOR__SPECIFICATION:
				getSpecification().clear();
				return;
			case UmlPackage.BEHAVIOR__PARAMETER:
				getParameter().clear();
				return;
			case UmlPackage.BEHAVIOR__PRECONDITION:
				getPrecondition().clear();
				return;
			case UmlPackage.BEHAVIOR__POSTCONDITION:
				getPostcondition().clear();
				return;
			case UmlPackage.BEHAVIOR__OWNED_PARAMETER_SET:
				getOwnedParameterSet().clear();
				return;
			case UmlPackage.BEHAVIOR__IS_REENTRANT:
				setIsReentrant(IS_REENTRANT_EDEFAULT);
				return;
			case UmlPackage.BEHAVIOR__POSTCONDITION1:
				setPostcondition1(POSTCONDITION1_EDEFAULT);
				return;
			case UmlPackage.BEHAVIOR__PRECONDITION1:
				setPrecondition1(PRECONDITION1_EDEFAULT);
				return;
			case UmlPackage.BEHAVIOR__REDEFINED_BEHAVIOR1:
				setRedefinedBehavior1(REDEFINED_BEHAVIOR1_EDEFAULT);
				return;
			case UmlPackage.BEHAVIOR__SPECIFICATION1:
				setSpecification1(SPECIFICATION1_EDEFAULT);
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
			case UmlPackage.BEHAVIOR__GROUP9:
				return group9 != null && !group9.isEmpty();
			case UmlPackage.BEHAVIOR__REDEFINED_BEHAVIOR:
				return !getRedefinedBehavior().isEmpty();
			case UmlPackage.BEHAVIOR__SPECIFICATION:
				return !getSpecification().isEmpty();
			case UmlPackage.BEHAVIOR__PARAMETER:
				return !getParameter().isEmpty();
			case UmlPackage.BEHAVIOR__PRECONDITION:
				return !getPrecondition().isEmpty();
			case UmlPackage.BEHAVIOR__POSTCONDITION:
				return !getPostcondition().isEmpty();
			case UmlPackage.BEHAVIOR__OWNED_PARAMETER_SET:
				return !getOwnedParameterSet().isEmpty();
			case UmlPackage.BEHAVIOR__IS_REENTRANT:
				return IS_REENTRANT_EDEFAULT == null ? isReentrant != null : !IS_REENTRANT_EDEFAULT.equals(isReentrant);
			case UmlPackage.BEHAVIOR__POSTCONDITION1:
				return POSTCONDITION1_EDEFAULT == null ? postcondition1 != null : !POSTCONDITION1_EDEFAULT.equals(postcondition1);
			case UmlPackage.BEHAVIOR__PRECONDITION1:
				return PRECONDITION1_EDEFAULT == null ? precondition1 != null : !PRECONDITION1_EDEFAULT.equals(precondition1);
			case UmlPackage.BEHAVIOR__REDEFINED_BEHAVIOR1:
				return REDEFINED_BEHAVIOR1_EDEFAULT == null ? redefinedBehavior1 != null : !REDEFINED_BEHAVIOR1_EDEFAULT.equals(redefinedBehavior1);
			case UmlPackage.BEHAVIOR__SPECIFICATION1:
				return SPECIFICATION1_EDEFAULT == null ? specification1 != null : !SPECIFICATION1_EDEFAULT.equals(specification1);
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
		result.append(" (group9: ");
		result.append(group9);
		result.append(", isReentrant: ");
		result.append(isReentrant);
		result.append(", postcondition1: ");
		result.append(postcondition1);
		result.append(", precondition1: ");
		result.append(precondition1);
		result.append(", redefinedBehavior1: ");
		result.append(redefinedBehavior1);
		result.append(", specification1: ");
		result.append(specification1);
		result.append(')');
		return result.toString();
	}

} //BehaviorImpl
