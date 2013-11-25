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
import org.eclipse.uml2._1._0._0.uml.InputPin;
import org.eclipse.uml2._1._0._0.uml.OutputPin;
import org.eclipse.uml2._1._0._0.uml.ReadIsClassifiedObjectAction;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read Is Classified Object Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReadIsClassifiedObjectActionImpl#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReadIsClassifiedObjectActionImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReadIsClassifiedObjectActionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReadIsClassifiedObjectActionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReadIsClassifiedObjectActionImpl#getClassifier1 <em>Classifier1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReadIsClassifiedObjectActionImpl#getIsDirect <em>Is Direct</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReadIsClassifiedObjectActionImpl extends ActionImpl implements ReadIsClassifiedObjectAction
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
	 * The default value of the '{@link #getClassifier1() <em>Classifier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier1()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifier1() <em>Classifier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier1()
	 * @generated
	 * @ordered
	 */
	protected String classifier1 = CLASSIFIER1_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsDirect() <em>Is Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDirect()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_DIRECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDirect() <em>Is Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDirect()
	 * @generated
	 * @ordered
	 */
	protected String isDirect = IS_DIRECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadIsClassifiedObjectActionImpl()
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
		return UmlPackage.eINSTANCE.getReadIsClassifiedObjectAction();
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
			group8 = new BasicFeatureMap(this, UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__GROUP8);
		}
		return group8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getClassifier()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getReadIsClassifiedObjectAction_Classifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getResult()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getReadIsClassifiedObjectAction_Result());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getObject()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getReadIsClassifiedObjectAction_Object());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassifier1()
	{
		return classifier1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier1(String newClassifier1)
	{
		String oldClassifier1 = classifier1;
		classifier1 = newClassifier1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER1, oldClassifier1, classifier1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsDirect()
	{
		return isDirect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDirect(String newIsDirect)
	{
		String oldIsDirect = isDirect;
		isDirect = newIsDirect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IS_DIRECT, oldIsDirect, isDirect));
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
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__GROUP8:
				return ((InternalEList<?>)getGroup8()).basicRemove(otherEnd, msgs);
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER:
				return ((InternalEList<?>)getClassifier()).basicRemove(otherEnd, msgs);
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__GROUP8:
				if (coreType) return getGroup8();
				return ((FeatureMap.Internal)getGroup8()).getWrapper();
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER:
				return getClassifier();
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT:
				return getResult();
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT:
				return getObject();
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER1:
				return getClassifier1();
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IS_DIRECT:
				return getIsDirect();
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
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__GROUP8:
				((FeatureMap.Internal)getGroup8()).set(newValue);
				return;
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER:
				getClassifier().clear();
				getClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends InputPin>)newValue);
				return;
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER1:
				setClassifier1((String)newValue);
				return;
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IS_DIRECT:
				setIsDirect((String)newValue);
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
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__GROUP8:
				getGroup8().clear();
				return;
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER:
				getClassifier().clear();
				return;
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT:
				getResult().clear();
				return;
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT:
				getObject().clear();
				return;
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER1:
				setClassifier1(CLASSIFIER1_EDEFAULT);
				return;
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IS_DIRECT:
				setIsDirect(IS_DIRECT_EDEFAULT);
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
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__GROUP8:
				return group8 != null && !group8.isEmpty();
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER:
				return !getClassifier().isEmpty();
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT:
				return !getResult().isEmpty();
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT:
				return !getObject().isEmpty();
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER1:
				return CLASSIFIER1_EDEFAULT == null ? classifier1 != null : !CLASSIFIER1_EDEFAULT.equals(classifier1);
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IS_DIRECT:
				return IS_DIRECT_EDEFAULT == null ? isDirect != null : !IS_DIRECT_EDEFAULT.equals(isDirect);
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
		result.append(", classifier1: ");
		result.append(classifier1);
		result.append(", isDirect: ");
		result.append(isDirect);
		result.append(')');
		return result.toString();
	}

} //ReadIsClassifiedObjectActionImpl
