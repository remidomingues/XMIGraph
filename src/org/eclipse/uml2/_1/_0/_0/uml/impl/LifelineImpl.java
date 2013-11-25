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

import org.eclipse.uml2._1._0._0.uml.ConnectableElement;
import org.eclipse.uml2._1._0._0.uml.InteractionFragment;
import org.eclipse.uml2._1._0._0.uml.Lifeline;
import org.eclipse.uml2._1._0._0.uml.OpaqueExpression;
import org.eclipse.uml2._1._0._0.uml.PartDecomposition;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LifelineImpl#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LifelineImpl#getCoveredBy <em>Covered By</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LifelineImpl#getRepresents <em>Represents</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LifelineImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LifelineImpl#getDecomposedAs <em>Decomposed As</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LifelineImpl#getCoveredBy1 <em>Covered By1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LifelineImpl#getDecomposedAs1 <em>Decomposed As1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LifelineImpl#getRepresents1 <em>Represents1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LifelineImpl extends NamedElementImpl implements Lifeline
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
	 * The default value of the '{@link #getCoveredBy1() <em>Covered By1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveredBy1()
	 * @generated
	 * @ordered
	 */
	protected static final String COVERED_BY1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoveredBy1() <em>Covered By1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveredBy1()
	 * @generated
	 * @ordered
	 */
	protected String coveredBy1 = COVERED_BY1_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecomposedAs1() <em>Decomposed As1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposedAs1()
	 * @generated
	 * @ordered
	 */
	protected static final String DECOMPOSED_AS1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecomposedAs1() <em>Decomposed As1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposedAs1()
	 * @generated
	 * @ordered
	 */
	protected String decomposedAs1 = DECOMPOSED_AS1_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepresents1() <em>Represents1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresents1()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRESENTS1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepresents1() <em>Represents1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresents1()
	 * @generated
	 * @ordered
	 */
	protected String represents1 = REPRESENTS1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifelineImpl()
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
		return UmlPackage.eINSTANCE.getLifeline();
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
			group5 = new BasicFeatureMap(this, UmlPackage.LIFELINE__GROUP5);
		}
		return group5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFragment> getCoveredBy()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getLifeline_CoveredBy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectableElement> getRepresents()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getLifeline_Represents());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpaqueExpression> getSelector()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getLifeline_Selector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartDecomposition> getDecomposedAs()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getLifeline_DecomposedAs());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoveredBy1()
	{
		return coveredBy1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoveredBy1(String newCoveredBy1)
	{
		String oldCoveredBy1 = coveredBy1;
		coveredBy1 = newCoveredBy1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.LIFELINE__COVERED_BY1, oldCoveredBy1, coveredBy1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDecomposedAs1()
	{
		return decomposedAs1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposedAs1(String newDecomposedAs1)
	{
		String oldDecomposedAs1 = decomposedAs1;
		decomposedAs1 = newDecomposedAs1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.LIFELINE__DECOMPOSED_AS1, oldDecomposedAs1, decomposedAs1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepresents1()
	{
		return represents1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresents1(String newRepresents1)
	{
		String oldRepresents1 = represents1;
		represents1 = newRepresents1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.LIFELINE__REPRESENTS1, oldRepresents1, represents1));
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
			case UmlPackage.LIFELINE__GROUP5:
				return ((InternalEList<?>)getGroup5()).basicRemove(otherEnd, msgs);
			case UmlPackage.LIFELINE__COVERED_BY:
				return ((InternalEList<?>)getCoveredBy()).basicRemove(otherEnd, msgs);
			case UmlPackage.LIFELINE__REPRESENTS:
				return ((InternalEList<?>)getRepresents()).basicRemove(otherEnd, msgs);
			case UmlPackage.LIFELINE__SELECTOR:
				return ((InternalEList<?>)getSelector()).basicRemove(otherEnd, msgs);
			case UmlPackage.LIFELINE__DECOMPOSED_AS:
				return ((InternalEList<?>)getDecomposedAs()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.LIFELINE__GROUP5:
				if (coreType) return getGroup5();
				return ((FeatureMap.Internal)getGroup5()).getWrapper();
			case UmlPackage.LIFELINE__COVERED_BY:
				return getCoveredBy();
			case UmlPackage.LIFELINE__REPRESENTS:
				return getRepresents();
			case UmlPackage.LIFELINE__SELECTOR:
				return getSelector();
			case UmlPackage.LIFELINE__DECOMPOSED_AS:
				return getDecomposedAs();
			case UmlPackage.LIFELINE__COVERED_BY1:
				return getCoveredBy1();
			case UmlPackage.LIFELINE__DECOMPOSED_AS1:
				return getDecomposedAs1();
			case UmlPackage.LIFELINE__REPRESENTS1:
				return getRepresents1();
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
			case UmlPackage.LIFELINE__GROUP5:
				((FeatureMap.Internal)getGroup5()).set(newValue);
				return;
			case UmlPackage.LIFELINE__COVERED_BY:
				getCoveredBy().clear();
				getCoveredBy().addAll((Collection<? extends InteractionFragment>)newValue);
				return;
			case UmlPackage.LIFELINE__REPRESENTS:
				getRepresents().clear();
				getRepresents().addAll((Collection<? extends ConnectableElement>)newValue);
				return;
			case UmlPackage.LIFELINE__SELECTOR:
				getSelector().clear();
				getSelector().addAll((Collection<? extends OpaqueExpression>)newValue);
				return;
			case UmlPackage.LIFELINE__DECOMPOSED_AS:
				getDecomposedAs().clear();
				getDecomposedAs().addAll((Collection<? extends PartDecomposition>)newValue);
				return;
			case UmlPackage.LIFELINE__COVERED_BY1:
				setCoveredBy1((String)newValue);
				return;
			case UmlPackage.LIFELINE__DECOMPOSED_AS1:
				setDecomposedAs1((String)newValue);
				return;
			case UmlPackage.LIFELINE__REPRESENTS1:
				setRepresents1((String)newValue);
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
			case UmlPackage.LIFELINE__GROUP5:
				getGroup5().clear();
				return;
			case UmlPackage.LIFELINE__COVERED_BY:
				getCoveredBy().clear();
				return;
			case UmlPackage.LIFELINE__REPRESENTS:
				getRepresents().clear();
				return;
			case UmlPackage.LIFELINE__SELECTOR:
				getSelector().clear();
				return;
			case UmlPackage.LIFELINE__DECOMPOSED_AS:
				getDecomposedAs().clear();
				return;
			case UmlPackage.LIFELINE__COVERED_BY1:
				setCoveredBy1(COVERED_BY1_EDEFAULT);
				return;
			case UmlPackage.LIFELINE__DECOMPOSED_AS1:
				setDecomposedAs1(DECOMPOSED_AS1_EDEFAULT);
				return;
			case UmlPackage.LIFELINE__REPRESENTS1:
				setRepresents1(REPRESENTS1_EDEFAULT);
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
			case UmlPackage.LIFELINE__GROUP5:
				return group5 != null && !group5.isEmpty();
			case UmlPackage.LIFELINE__COVERED_BY:
				return !getCoveredBy().isEmpty();
			case UmlPackage.LIFELINE__REPRESENTS:
				return !getRepresents().isEmpty();
			case UmlPackage.LIFELINE__SELECTOR:
				return !getSelector().isEmpty();
			case UmlPackage.LIFELINE__DECOMPOSED_AS:
				return !getDecomposedAs().isEmpty();
			case UmlPackage.LIFELINE__COVERED_BY1:
				return COVERED_BY1_EDEFAULT == null ? coveredBy1 != null : !COVERED_BY1_EDEFAULT.equals(coveredBy1);
			case UmlPackage.LIFELINE__DECOMPOSED_AS1:
				return DECOMPOSED_AS1_EDEFAULT == null ? decomposedAs1 != null : !DECOMPOSED_AS1_EDEFAULT.equals(decomposedAs1);
			case UmlPackage.LIFELINE__REPRESENTS1:
				return REPRESENTS1_EDEFAULT == null ? represents1 != null : !REPRESENTS1_EDEFAULT.equals(represents1);
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
		result.append(", coveredBy1: ");
		result.append(coveredBy1);
		result.append(", decomposedAs1: ");
		result.append(decomposedAs1);
		result.append(", represents1: ");
		result.append(represents1);
		result.append(')');
		return result.toString();
	}

} //LifelineImpl
