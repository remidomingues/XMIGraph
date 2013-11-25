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
import org.eclipse.uml2._1._0._0.uml.BehavioredClassifier;
import org.eclipse.uml2._1._0._0.uml.Implementation;
import org.eclipse.uml2._1._0._0.uml.StateMachine;
import org.eclipse.uml2._1._0._0.uml.Trigger;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behaviored Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehavioredClassifierImpl#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehavioredClassifierImpl#getOwnedBehavior <em>Owned Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehavioredClassifierImpl#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehavioredClassifierImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehavioredClassifierImpl#getOwnedTrigger <em>Owned Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehavioredClassifierImpl#getOwnedStateMachine <em>Owned State Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.BehavioredClassifierImpl#getClassifierBehavior1 <em>Classifier Behavior1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehavioredClassifierImpl extends ClassifierImpl implements BehavioredClassifier
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
	 * The default value of the '{@link #getClassifierBehavior1() <em>Classifier Behavior1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierBehavior1()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER_BEHAVIOR1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifierBehavior1() <em>Classifier Behavior1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierBehavior1()
	 * @generated
	 * @ordered
	 */
	protected String classifierBehavior1 = CLASSIFIER_BEHAVIOR1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehavioredClassifierImpl()
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
		return UmlPackage.eINSTANCE.getBehavioredClassifier();
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
			group7 = new BasicFeatureMap(this, UmlPackage.BEHAVIORED_CLASSIFIER__GROUP7);
		}
		return group7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getOwnedBehavior()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getBehavioredClassifier_OwnedBehavior());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getClassifierBehavior()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getBehavioredClassifier_ClassifierBehavior());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Implementation> getImplementation()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getBehavioredClassifier_Implementation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getOwnedTrigger()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getBehavioredClassifier_OwnedTrigger());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine> getOwnedStateMachine()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getBehavioredClassifier_OwnedStateMachine());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassifierBehavior1()
	{
		return classifierBehavior1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierBehavior1(String newClassifierBehavior1)
	{
		String oldClassifierBehavior1 = classifierBehavior1;
		classifierBehavior1 = newClassifierBehavior1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR1, oldClassifierBehavior1, classifierBehavior1));
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
			case UmlPackage.BEHAVIORED_CLASSIFIER__GROUP7:
				return ((InternalEList<?>)getGroup7()).basicRemove(otherEnd, msgs);
			case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
				return ((InternalEList<?>)getOwnedBehavior()).basicRemove(otherEnd, msgs);
			case UmlPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR:
				return ((InternalEList<?>)getClassifierBehavior()).basicRemove(otherEnd, msgs);
			case UmlPackage.BEHAVIORED_CLASSIFIER__IMPLEMENTATION:
				return ((InternalEList<?>)getImplementation()).basicRemove(otherEnd, msgs);
			case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
				return ((InternalEList<?>)getOwnedTrigger()).basicRemove(otherEnd, msgs);
			case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE:
				return ((InternalEList<?>)getOwnedStateMachine()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.BEHAVIORED_CLASSIFIER__GROUP7:
				if (coreType) return getGroup7();
				return ((FeatureMap.Internal)getGroup7()).getWrapper();
			case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
				return getOwnedBehavior();
			case UmlPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR:
				return getClassifierBehavior();
			case UmlPackage.BEHAVIORED_CLASSIFIER__IMPLEMENTATION:
				return getImplementation();
			case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
				return getOwnedTrigger();
			case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE:
				return getOwnedStateMachine();
			case UmlPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR1:
				return getClassifierBehavior1();
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
			case UmlPackage.BEHAVIORED_CLASSIFIER__GROUP7:
				((FeatureMap.Internal)getGroup7()).set(newValue);
				return;
			case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
				getOwnedBehavior().clear();
				getOwnedBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case UmlPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR:
				getClassifierBehavior().clear();
				getClassifierBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case UmlPackage.BEHAVIORED_CLASSIFIER__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends Implementation>)newValue);
				return;
			case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
				getOwnedTrigger().clear();
				getOwnedTrigger().addAll((Collection<? extends Trigger>)newValue);
				return;
			case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE:
				getOwnedStateMachine().clear();
				getOwnedStateMachine().addAll((Collection<? extends StateMachine>)newValue);
				return;
			case UmlPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR1:
				setClassifierBehavior1((String)newValue);
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
			case UmlPackage.BEHAVIORED_CLASSIFIER__GROUP7:
				getGroup7().clear();
				return;
			case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
				getOwnedBehavior().clear();
				return;
			case UmlPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR:
				getClassifierBehavior().clear();
				return;
			case UmlPackage.BEHAVIORED_CLASSIFIER__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
				getOwnedTrigger().clear();
				return;
			case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE:
				getOwnedStateMachine().clear();
				return;
			case UmlPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR1:
				setClassifierBehavior1(CLASSIFIER_BEHAVIOR1_EDEFAULT);
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
			case UmlPackage.BEHAVIORED_CLASSIFIER__GROUP7:
				return group7 != null && !group7.isEmpty();
			case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
				return !getOwnedBehavior().isEmpty();
			case UmlPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR:
				return !getClassifierBehavior().isEmpty();
			case UmlPackage.BEHAVIORED_CLASSIFIER__IMPLEMENTATION:
				return !getImplementation().isEmpty();
			case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
				return !getOwnedTrigger().isEmpty();
			case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE:
				return !getOwnedStateMachine().isEmpty();
			case UmlPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR1:
				return CLASSIFIER_BEHAVIOR1_EDEFAULT == null ? classifierBehavior1 != null : !CLASSIFIER_BEHAVIOR1_EDEFAULT.equals(classifierBehavior1);
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
		result.append(", classifierBehavior1: ");
		result.append(classifierBehavior1);
		result.append(')');
		return result.toString();
	}

} //BehavioredClassifierImpl
