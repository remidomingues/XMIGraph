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
import org.eclipse.uml2._1._0._0.uml.ObjectNode;
import org.eclipse.uml2._1._0._0.uml.ObjectNodeOrderingKind;
import org.eclipse.uml2._1._0._0.uml.State;
import org.eclipse.uml2._1._0._0.uml.Type;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ObjectNodeImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ObjectNodeImpl#getType1 <em>Type1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ObjectNodeImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ObjectNodeImpl#getInState <em>In State</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ObjectNodeImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ObjectNodeImpl#getInState1 <em>In State1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ObjectNodeImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ObjectNodeImpl#getSelection1 <em>Selection1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ObjectNodeImpl#getType2 <em>Type2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectNodeImpl extends ActivityNodeImpl implements ObjectNode
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
	 * The default value of the '{@link #getInState1() <em>In State1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInState1()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_STATE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInState1() <em>In State1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInState1()
	 * @generated
	 * @ordered
	 */
	protected String inState1 = IN_STATE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final ObjectNodeOrderingKind ORDERING_EDEFAULT = ObjectNodeOrderingKind.UNORDERED;

	/**
	 * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected ObjectNodeOrderingKind ordering = ORDERING_EDEFAULT;

	/**
	 * This is true if the Ordering attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orderingESet;

	/**
	 * The default value of the '{@link #getSelection1() <em>Selection1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection1()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelection1() <em>Selection1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection1()
	 * @generated
	 * @ordered
	 */
	protected String selection1 = SELECTION1_EDEFAULT;

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
	protected ObjectNodeImpl()
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
		return UmlPackage.eINSTANCE.getObjectNode();
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
			group6 = new BasicFeatureMap(this, UmlPackage.OBJECT_NODE__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getType1()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getObjectNode_Type1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getUpperBound()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getObjectNode_UpperBound());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getInState()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getObjectNode_InState());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getSelection()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getObjectNode_Selection());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInState1()
	{
		return inState1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInState1(String newInState1)
	{
		String oldInState1 = inState1;
		inState1 = newInState1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OBJECT_NODE__IN_STATE1, oldInState1, inState1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNodeOrderingKind getOrdering()
	{
		return ordering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdering(ObjectNodeOrderingKind newOrdering)
	{
		ObjectNodeOrderingKind oldOrdering = ordering;
		ordering = newOrdering == null ? ORDERING_EDEFAULT : newOrdering;
		boolean oldOrderingESet = orderingESet;
		orderingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OBJECT_NODE__ORDERING, oldOrdering, ordering, !oldOrderingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOrdering()
	{
		ObjectNodeOrderingKind oldOrdering = ordering;
		boolean oldOrderingESet = orderingESet;
		ordering = ORDERING_EDEFAULT;
		orderingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.OBJECT_NODE__ORDERING, oldOrdering, ORDERING_EDEFAULT, oldOrderingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOrdering()
	{
		return orderingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelection1()
	{
		return selection1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection1(String newSelection1)
	{
		String oldSelection1 = selection1;
		selection1 = newSelection1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OBJECT_NODE__SELECTION1, oldSelection1, selection1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OBJECT_NODE__TYPE2, oldType2, type2));
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
			case UmlPackage.OBJECT_NODE__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.OBJECT_NODE__TYPE1:
				return ((InternalEList<?>)getType1()).basicRemove(otherEnd, msgs);
			case UmlPackage.OBJECT_NODE__UPPER_BOUND:
				return ((InternalEList<?>)getUpperBound()).basicRemove(otherEnd, msgs);
			case UmlPackage.OBJECT_NODE__IN_STATE:
				return ((InternalEList<?>)getInState()).basicRemove(otherEnd, msgs);
			case UmlPackage.OBJECT_NODE__SELECTION:
				return ((InternalEList<?>)getSelection()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.OBJECT_NODE__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.OBJECT_NODE__TYPE1:
				return getType1();
			case UmlPackage.OBJECT_NODE__UPPER_BOUND:
				return getUpperBound();
			case UmlPackage.OBJECT_NODE__IN_STATE:
				return getInState();
			case UmlPackage.OBJECT_NODE__SELECTION:
				return getSelection();
			case UmlPackage.OBJECT_NODE__IN_STATE1:
				return getInState1();
			case UmlPackage.OBJECT_NODE__ORDERING:
				return getOrdering();
			case UmlPackage.OBJECT_NODE__SELECTION1:
				return getSelection1();
			case UmlPackage.OBJECT_NODE__TYPE2:
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
			case UmlPackage.OBJECT_NODE__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.OBJECT_NODE__TYPE1:
				getType1().clear();
				getType1().addAll((Collection<? extends Type>)newValue);
				return;
			case UmlPackage.OBJECT_NODE__UPPER_BOUND:
				getUpperBound().clear();
				getUpperBound().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UmlPackage.OBJECT_NODE__IN_STATE:
				getInState().clear();
				getInState().addAll((Collection<? extends State>)newValue);
				return;
			case UmlPackage.OBJECT_NODE__SELECTION:
				getSelection().clear();
				getSelection().addAll((Collection<? extends Behavior>)newValue);
				return;
			case UmlPackage.OBJECT_NODE__IN_STATE1:
				setInState1((String)newValue);
				return;
			case UmlPackage.OBJECT_NODE__ORDERING:
				setOrdering((ObjectNodeOrderingKind)newValue);
				return;
			case UmlPackage.OBJECT_NODE__SELECTION1:
				setSelection1((String)newValue);
				return;
			case UmlPackage.OBJECT_NODE__TYPE2:
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
			case UmlPackage.OBJECT_NODE__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.OBJECT_NODE__TYPE1:
				getType1().clear();
				return;
			case UmlPackage.OBJECT_NODE__UPPER_BOUND:
				getUpperBound().clear();
				return;
			case UmlPackage.OBJECT_NODE__IN_STATE:
				getInState().clear();
				return;
			case UmlPackage.OBJECT_NODE__SELECTION:
				getSelection().clear();
				return;
			case UmlPackage.OBJECT_NODE__IN_STATE1:
				setInState1(IN_STATE1_EDEFAULT);
				return;
			case UmlPackage.OBJECT_NODE__ORDERING:
				unsetOrdering();
				return;
			case UmlPackage.OBJECT_NODE__SELECTION1:
				setSelection1(SELECTION1_EDEFAULT);
				return;
			case UmlPackage.OBJECT_NODE__TYPE2:
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
			case UmlPackage.OBJECT_NODE__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.OBJECT_NODE__TYPE1:
				return !getType1().isEmpty();
			case UmlPackage.OBJECT_NODE__UPPER_BOUND:
				return !getUpperBound().isEmpty();
			case UmlPackage.OBJECT_NODE__IN_STATE:
				return !getInState().isEmpty();
			case UmlPackage.OBJECT_NODE__SELECTION:
				return !getSelection().isEmpty();
			case UmlPackage.OBJECT_NODE__IN_STATE1:
				return IN_STATE1_EDEFAULT == null ? inState1 != null : !IN_STATE1_EDEFAULT.equals(inState1);
			case UmlPackage.OBJECT_NODE__ORDERING:
				return isSetOrdering();
			case UmlPackage.OBJECT_NODE__SELECTION1:
				return SELECTION1_EDEFAULT == null ? selection1 != null : !SELECTION1_EDEFAULT.equals(selection1);
			case UmlPackage.OBJECT_NODE__TYPE2:
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
		result.append(" (group6: ");
		result.append(group6);
		result.append(", inState1: ");
		result.append(inState1);
		result.append(", ordering: ");
		if (orderingESet) result.append(ordering); else result.append("<unset>");
		result.append(", selection1: ");
		result.append(selection1);
		result.append(", type2: ");
		result.append(type2);
		result.append(')');
		return result.toString();
	}

} //ObjectNodeImpl
