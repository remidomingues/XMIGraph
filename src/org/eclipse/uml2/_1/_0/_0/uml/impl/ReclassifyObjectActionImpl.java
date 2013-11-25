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
import org.eclipse.uml2._1._0._0.uml.ReclassifyObjectAction;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reclassify Object Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReclassifyObjectActionImpl#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReclassifyObjectActionImpl#getOldClassifier <em>Old Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReclassifyObjectActionImpl#getNewClassifier <em>New Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReclassifyObjectActionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReclassifyObjectActionImpl#getIsReplaceAll <em>Is Replace All</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReclassifyObjectActionImpl#getNewClassifier1 <em>New Classifier1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ReclassifyObjectActionImpl#getOldClassifier1 <em>Old Classifier1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReclassifyObjectActionImpl extends ActionImpl implements ReclassifyObjectAction
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
	 * The default value of the '{@link #getIsReplaceAll() <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReplaceAll()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_REPLACE_ALL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsReplaceAll() <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReplaceAll()
	 * @generated
	 * @ordered
	 */
	protected String isReplaceAll = IS_REPLACE_ALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewClassifier1() <em>New Classifier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewClassifier1()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_CLASSIFIER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewClassifier1() <em>New Classifier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewClassifier1()
	 * @generated
	 * @ordered
	 */
	protected String newClassifier1 = NEW_CLASSIFIER1_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldClassifier1() <em>Old Classifier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldClassifier1()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_CLASSIFIER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldClassifier1() <em>Old Classifier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldClassifier1()
	 * @generated
	 * @ordered
	 */
	protected String oldClassifier1 = OLD_CLASSIFIER1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReclassifyObjectActionImpl()
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
		return UmlPackage.eINSTANCE.getReclassifyObjectAction();
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
			group8 = new BasicFeatureMap(this, UmlPackage.RECLASSIFY_OBJECT_ACTION__GROUP8);
		}
		return group8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getOldClassifier()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getReclassifyObjectAction_OldClassifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getNewClassifier()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getReclassifyObjectAction_NewClassifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getObject()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getReclassifyObjectAction_Object());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsReplaceAll()
	{
		return isReplaceAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReplaceAll(String newIsReplaceAll)
	{
		String oldIsReplaceAll = isReplaceAll;
		isReplaceAll = newIsReplaceAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL, oldIsReplaceAll, isReplaceAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewClassifier1()
	{
		return newClassifier1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewClassifier1(String newNewClassifier1)
	{
		String oldNewClassifier1 = newClassifier1;
		newClassifier1 = newNewClassifier1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER1, oldNewClassifier1, newClassifier1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOldClassifier1()
	{
		return oldClassifier1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldClassifier1(String newOldClassifier1)
	{
		String oldOldClassifier1 = oldClassifier1;
		oldClassifier1 = newOldClassifier1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER1, oldOldClassifier1, oldClassifier1));
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
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__GROUP8:
				return ((InternalEList<?>)getGroup8()).basicRemove(otherEnd, msgs);
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER:
				return ((InternalEList<?>)getOldClassifier()).basicRemove(otherEnd, msgs);
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER:
				return ((InternalEList<?>)getNewClassifier()).basicRemove(otherEnd, msgs);
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__OBJECT:
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
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__GROUP8:
				if (coreType) return getGroup8();
				return ((FeatureMap.Internal)getGroup8()).getWrapper();
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER:
				return getOldClassifier();
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER:
				return getNewClassifier();
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__OBJECT:
				return getObject();
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL:
				return getIsReplaceAll();
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER1:
				return getNewClassifier1();
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER1:
				return getOldClassifier1();
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
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__GROUP8:
				((FeatureMap.Internal)getGroup8()).set(newValue);
				return;
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER:
				getOldClassifier().clear();
				getOldClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER:
				getNewClassifier().clear();
				getNewClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends InputPin>)newValue);
				return;
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL:
				setIsReplaceAll((String)newValue);
				return;
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER1:
				setNewClassifier1((String)newValue);
				return;
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER1:
				setOldClassifier1((String)newValue);
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
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__GROUP8:
				getGroup8().clear();
				return;
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER:
				getOldClassifier().clear();
				return;
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER:
				getNewClassifier().clear();
				return;
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__OBJECT:
				getObject().clear();
				return;
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL:
				setIsReplaceAll(IS_REPLACE_ALL_EDEFAULT);
				return;
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER1:
				setNewClassifier1(NEW_CLASSIFIER1_EDEFAULT);
				return;
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER1:
				setOldClassifier1(OLD_CLASSIFIER1_EDEFAULT);
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
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__GROUP8:
				return group8 != null && !group8.isEmpty();
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER:
				return !getOldClassifier().isEmpty();
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER:
				return !getNewClassifier().isEmpty();
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__OBJECT:
				return !getObject().isEmpty();
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL:
				return IS_REPLACE_ALL_EDEFAULT == null ? isReplaceAll != null : !IS_REPLACE_ALL_EDEFAULT.equals(isReplaceAll);
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER1:
				return NEW_CLASSIFIER1_EDEFAULT == null ? newClassifier1 != null : !NEW_CLASSIFIER1_EDEFAULT.equals(newClassifier1);
			case UmlPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER1:
				return OLD_CLASSIFIER1_EDEFAULT == null ? oldClassifier1 != null : !OLD_CLASSIFIER1_EDEFAULT.equals(oldClassifier1);
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
		result.append(", isReplaceAll: ");
		result.append(isReplaceAll);
		result.append(", newClassifier1: ");
		result.append(newClassifier1);
		result.append(", oldClassifier1: ");
		result.append(oldClassifier1);
		result.append(')');
		return result.toString();
	}

} //ReclassifyObjectActionImpl
