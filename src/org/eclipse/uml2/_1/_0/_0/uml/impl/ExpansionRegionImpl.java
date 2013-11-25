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

import org.eclipse.uml2._1._0._0.uml.ExpansionKind;
import org.eclipse.uml2._1._0._0.uml.ExpansionNode;
import org.eclipse.uml2._1._0._0.uml.ExpansionRegion;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExpansionRegionImpl#getGroup9 <em>Group9</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExpansionRegionImpl#getOutputElement <em>Output Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExpansionRegionImpl#getInputElement <em>Input Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExpansionRegionImpl#getInputElement1 <em>Input Element1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExpansionRegionImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ExpansionRegionImpl#getOutputElement1 <em>Output Element1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpansionRegionImpl extends StructuredActivityNodeImpl implements ExpansionRegion
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
	 * The default value of the '{@link #getInputElement1() <em>Input Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputElement1()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_ELEMENT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputElement1() <em>Input Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputElement1()
	 * @generated
	 * @ordered
	 */
	protected String inputElement1 = INPUT_ELEMENT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final ExpansionKind MODE_EDEFAULT = ExpansionKind.PARALLEL;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected ExpansionKind mode = MODE_EDEFAULT;

	/**
	 * This is true if the Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeESet;

	/**
	 * The default value of the '{@link #getOutputElement1() <em>Output Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputElement1()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_ELEMENT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputElement1() <em>Output Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputElement1()
	 * @generated
	 * @ordered
	 */
	protected String outputElement1 = OUTPUT_ELEMENT1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpansionRegionImpl()
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
		return UmlPackage.eINSTANCE.getExpansionRegion();
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
			group9 = new BasicFeatureMap(this, UmlPackage.EXPANSION_REGION__GROUP9);
		}
		return group9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpansionNode> getOutputElement()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getExpansionRegion_OutputElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpansionNode> getInputElement()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getExpansionRegion_InputElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputElement1()
	{
		return inputElement1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputElement1(String newInputElement1)
	{
		String oldInputElement1 = inputElement1;
		inputElement1 = newInputElement1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EXPANSION_REGION__INPUT_ELEMENT1, oldInputElement1, inputElement1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionKind getMode()
	{
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(ExpansionKind newMode)
	{
		ExpansionKind oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		boolean oldModeESet = modeESet;
		modeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EXPANSION_REGION__MODE, oldMode, mode, !oldModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMode()
	{
		ExpansionKind oldMode = mode;
		boolean oldModeESet = modeESet;
		mode = MODE_EDEFAULT;
		modeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.EXPANSION_REGION__MODE, oldMode, MODE_EDEFAULT, oldModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMode()
	{
		return modeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputElement1()
	{
		return outputElement1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputElement1(String newOutputElement1)
	{
		String oldOutputElement1 = outputElement1;
		outputElement1 = newOutputElement1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EXPANSION_REGION__OUTPUT_ELEMENT1, oldOutputElement1, outputElement1));
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
			case UmlPackage.EXPANSION_REGION__GROUP9:
				return ((InternalEList<?>)getGroup9()).basicRemove(otherEnd, msgs);
			case UmlPackage.EXPANSION_REGION__OUTPUT_ELEMENT:
				return ((InternalEList<?>)getOutputElement()).basicRemove(otherEnd, msgs);
			case UmlPackage.EXPANSION_REGION__INPUT_ELEMENT:
				return ((InternalEList<?>)getInputElement()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.EXPANSION_REGION__GROUP9:
				if (coreType) return getGroup9();
				return ((FeatureMap.Internal)getGroup9()).getWrapper();
			case UmlPackage.EXPANSION_REGION__OUTPUT_ELEMENT:
				return getOutputElement();
			case UmlPackage.EXPANSION_REGION__INPUT_ELEMENT:
				return getInputElement();
			case UmlPackage.EXPANSION_REGION__INPUT_ELEMENT1:
				return getInputElement1();
			case UmlPackage.EXPANSION_REGION__MODE:
				return getMode();
			case UmlPackage.EXPANSION_REGION__OUTPUT_ELEMENT1:
				return getOutputElement1();
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
			case UmlPackage.EXPANSION_REGION__GROUP9:
				((FeatureMap.Internal)getGroup9()).set(newValue);
				return;
			case UmlPackage.EXPANSION_REGION__OUTPUT_ELEMENT:
				getOutputElement().clear();
				getOutputElement().addAll((Collection<? extends ExpansionNode>)newValue);
				return;
			case UmlPackage.EXPANSION_REGION__INPUT_ELEMENT:
				getInputElement().clear();
				getInputElement().addAll((Collection<? extends ExpansionNode>)newValue);
				return;
			case UmlPackage.EXPANSION_REGION__INPUT_ELEMENT1:
				setInputElement1((String)newValue);
				return;
			case UmlPackage.EXPANSION_REGION__MODE:
				setMode((ExpansionKind)newValue);
				return;
			case UmlPackage.EXPANSION_REGION__OUTPUT_ELEMENT1:
				setOutputElement1((String)newValue);
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
			case UmlPackage.EXPANSION_REGION__GROUP9:
				getGroup9().clear();
				return;
			case UmlPackage.EXPANSION_REGION__OUTPUT_ELEMENT:
				getOutputElement().clear();
				return;
			case UmlPackage.EXPANSION_REGION__INPUT_ELEMENT:
				getInputElement().clear();
				return;
			case UmlPackage.EXPANSION_REGION__INPUT_ELEMENT1:
				setInputElement1(INPUT_ELEMENT1_EDEFAULT);
				return;
			case UmlPackage.EXPANSION_REGION__MODE:
				unsetMode();
				return;
			case UmlPackage.EXPANSION_REGION__OUTPUT_ELEMENT1:
				setOutputElement1(OUTPUT_ELEMENT1_EDEFAULT);
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
			case UmlPackage.EXPANSION_REGION__GROUP9:
				return group9 != null && !group9.isEmpty();
			case UmlPackage.EXPANSION_REGION__OUTPUT_ELEMENT:
				return !getOutputElement().isEmpty();
			case UmlPackage.EXPANSION_REGION__INPUT_ELEMENT:
				return !getInputElement().isEmpty();
			case UmlPackage.EXPANSION_REGION__INPUT_ELEMENT1:
				return INPUT_ELEMENT1_EDEFAULT == null ? inputElement1 != null : !INPUT_ELEMENT1_EDEFAULT.equals(inputElement1);
			case UmlPackage.EXPANSION_REGION__MODE:
				return isSetMode();
			case UmlPackage.EXPANSION_REGION__OUTPUT_ELEMENT1:
				return OUTPUT_ELEMENT1_EDEFAULT == null ? outputElement1 != null : !OUTPUT_ELEMENT1_EDEFAULT.equals(outputElement1);
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
		result.append(", inputElement1: ");
		result.append(inputElement1);
		result.append(", mode: ");
		if (modeESet) result.append(mode); else result.append("<unset>");
		result.append(", outputElement1: ");
		result.append(outputElement1);
		result.append(')');
		return result.toString();
	}

} //ExpansionRegionImpl
