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

import org.eclipse.uml2._1._0._0.uml.ActivityNode;
import org.eclipse.uml2._1._0._0.uml.InputPin;
import org.eclipse.uml2._1._0._0.uml.LoopNode;
import org.eclipse.uml2._1._0._0.uml.OutputPin;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LoopNodeImpl#getGroup9 <em>Group9</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LoopNodeImpl#getBodyPart <em>Body Part</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LoopNodeImpl#getSetupPart <em>Setup Part</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LoopNodeImpl#getDecider <em>Decider</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LoopNodeImpl#getTest <em>Test</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LoopNodeImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LoopNodeImpl#getLoopVariable <em>Loop Variable</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LoopNodeImpl#getBodyOutput <em>Body Output</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LoopNodeImpl#getLoopVariableInput <em>Loop Variable Input</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LoopNodeImpl#getBodyOutput1 <em>Body Output1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LoopNodeImpl#getBodyPart1 <em>Body Part1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LoopNodeImpl#getDecider1 <em>Decider1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LoopNodeImpl#getIsTestedFirst <em>Is Tested First</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LoopNodeImpl#getSetupPart1 <em>Setup Part1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.LoopNodeImpl#getTest1 <em>Test1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopNodeImpl extends StructuredActivityNodeImpl implements LoopNode
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
	 * The default value of the '{@link #getBodyOutput1() <em>Body Output1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyOutput1()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_OUTPUT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBodyOutput1() <em>Body Output1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyOutput1()
	 * @generated
	 * @ordered
	 */
	protected String bodyOutput1 = BODY_OUTPUT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getBodyPart1() <em>Body Part1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyPart1()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_PART1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBodyPart1() <em>Body Part1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyPart1()
	 * @generated
	 * @ordered
	 */
	protected String bodyPart1 = BODY_PART1_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecider1() <em>Decider1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecider1()
	 * @generated
	 * @ordered
	 */
	protected static final String DECIDER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecider1() <em>Decider1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecider1()
	 * @generated
	 * @ordered
	 */
	protected String decider1 = DECIDER1_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsTestedFirst() <em>Is Tested First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTestedFirst()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_TESTED_FIRST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsTestedFirst() <em>Is Tested First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTestedFirst()
	 * @generated
	 * @ordered
	 */
	protected String isTestedFirst = IS_TESTED_FIRST_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetupPart1() <em>Setup Part1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetupPart1()
	 * @generated
	 * @ordered
	 */
	protected static final String SETUP_PART1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSetupPart1() <em>Setup Part1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetupPart1()
	 * @generated
	 * @ordered
	 */
	protected String setupPart1 = SETUP_PART1_EDEFAULT;

	/**
	 * The default value of the '{@link #getTest1() <em>Test1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest1()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTest1() <em>Test1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest1()
	 * @generated
	 * @ordered
	 */
	protected String test1 = TEST1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopNodeImpl()
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
		return UmlPackage.eINSTANCE.getLoopNode();
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
			group9 = new BasicFeatureMap(this, UmlPackage.LOOP_NODE__GROUP9);
		}
		return group9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getBodyPart()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getLoopNode_BodyPart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getSetupPart()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getLoopNode_SetupPart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getDecider()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getLoopNode_Decider());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getTest()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getLoopNode_Test());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getResult()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getLoopNode_Result());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getLoopVariable()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getLoopNode_LoopVariable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getBodyOutput()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getLoopNode_BodyOutput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getLoopVariableInput()
	{
		return getGroup9().list(UmlPackage.eINSTANCE.getLoopNode_LoopVariableInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBodyOutput1()
	{
		return bodyOutput1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyOutput1(String newBodyOutput1)
	{
		String oldBodyOutput1 = bodyOutput1;
		bodyOutput1 = newBodyOutput1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.LOOP_NODE__BODY_OUTPUT1, oldBodyOutput1, bodyOutput1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBodyPart1()
	{
		return bodyPart1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyPart1(String newBodyPart1)
	{
		String oldBodyPart1 = bodyPart1;
		bodyPart1 = newBodyPart1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.LOOP_NODE__BODY_PART1, oldBodyPart1, bodyPart1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDecider1()
	{
		return decider1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecider1(String newDecider1)
	{
		String oldDecider1 = decider1;
		decider1 = newDecider1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.LOOP_NODE__DECIDER1, oldDecider1, decider1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsTestedFirst()
	{
		return isTestedFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTestedFirst(String newIsTestedFirst)
	{
		String oldIsTestedFirst = isTestedFirst;
		isTestedFirst = newIsTestedFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.LOOP_NODE__IS_TESTED_FIRST, oldIsTestedFirst, isTestedFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSetupPart1()
	{
		return setupPart1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetupPart1(String newSetupPart1)
	{
		String oldSetupPart1 = setupPart1;
		setupPart1 = newSetupPart1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.LOOP_NODE__SETUP_PART1, oldSetupPart1, setupPart1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTest1()
	{
		return test1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTest1(String newTest1)
	{
		String oldTest1 = test1;
		test1 = newTest1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.LOOP_NODE__TEST1, oldTest1, test1));
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
			case UmlPackage.LOOP_NODE__GROUP9:
				return ((InternalEList<?>)getGroup9()).basicRemove(otherEnd, msgs);
			case UmlPackage.LOOP_NODE__BODY_PART:
				return ((InternalEList<?>)getBodyPart()).basicRemove(otherEnd, msgs);
			case UmlPackage.LOOP_NODE__SETUP_PART:
				return ((InternalEList<?>)getSetupPart()).basicRemove(otherEnd, msgs);
			case UmlPackage.LOOP_NODE__DECIDER:
				return ((InternalEList<?>)getDecider()).basicRemove(otherEnd, msgs);
			case UmlPackage.LOOP_NODE__TEST:
				return ((InternalEList<?>)getTest()).basicRemove(otherEnd, msgs);
			case UmlPackage.LOOP_NODE__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
			case UmlPackage.LOOP_NODE__LOOP_VARIABLE:
				return ((InternalEList<?>)getLoopVariable()).basicRemove(otherEnd, msgs);
			case UmlPackage.LOOP_NODE__BODY_OUTPUT:
				return ((InternalEList<?>)getBodyOutput()).basicRemove(otherEnd, msgs);
			case UmlPackage.LOOP_NODE__LOOP_VARIABLE_INPUT:
				return ((InternalEList<?>)getLoopVariableInput()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.LOOP_NODE__GROUP9:
				if (coreType) return getGroup9();
				return ((FeatureMap.Internal)getGroup9()).getWrapper();
			case UmlPackage.LOOP_NODE__BODY_PART:
				return getBodyPart();
			case UmlPackage.LOOP_NODE__SETUP_PART:
				return getSetupPart();
			case UmlPackage.LOOP_NODE__DECIDER:
				return getDecider();
			case UmlPackage.LOOP_NODE__TEST:
				return getTest();
			case UmlPackage.LOOP_NODE__RESULT:
				return getResult();
			case UmlPackage.LOOP_NODE__LOOP_VARIABLE:
				return getLoopVariable();
			case UmlPackage.LOOP_NODE__BODY_OUTPUT:
				return getBodyOutput();
			case UmlPackage.LOOP_NODE__LOOP_VARIABLE_INPUT:
				return getLoopVariableInput();
			case UmlPackage.LOOP_NODE__BODY_OUTPUT1:
				return getBodyOutput1();
			case UmlPackage.LOOP_NODE__BODY_PART1:
				return getBodyPart1();
			case UmlPackage.LOOP_NODE__DECIDER1:
				return getDecider1();
			case UmlPackage.LOOP_NODE__IS_TESTED_FIRST:
				return getIsTestedFirst();
			case UmlPackage.LOOP_NODE__SETUP_PART1:
				return getSetupPart1();
			case UmlPackage.LOOP_NODE__TEST1:
				return getTest1();
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
			case UmlPackage.LOOP_NODE__GROUP9:
				((FeatureMap.Internal)getGroup9()).set(newValue);
				return;
			case UmlPackage.LOOP_NODE__BODY_PART:
				getBodyPart().clear();
				getBodyPart().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case UmlPackage.LOOP_NODE__SETUP_PART:
				getSetupPart().clear();
				getSetupPart().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case UmlPackage.LOOP_NODE__DECIDER:
				getDecider().clear();
				getDecider().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case UmlPackage.LOOP_NODE__TEST:
				getTest().clear();
				getTest().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case UmlPackage.LOOP_NODE__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case UmlPackage.LOOP_NODE__LOOP_VARIABLE:
				getLoopVariable().clear();
				getLoopVariable().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case UmlPackage.LOOP_NODE__BODY_OUTPUT:
				getBodyOutput().clear();
				getBodyOutput().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case UmlPackage.LOOP_NODE__LOOP_VARIABLE_INPUT:
				getLoopVariableInput().clear();
				getLoopVariableInput().addAll((Collection<? extends InputPin>)newValue);
				return;
			case UmlPackage.LOOP_NODE__BODY_OUTPUT1:
				setBodyOutput1((String)newValue);
				return;
			case UmlPackage.LOOP_NODE__BODY_PART1:
				setBodyPart1((String)newValue);
				return;
			case UmlPackage.LOOP_NODE__DECIDER1:
				setDecider1((String)newValue);
				return;
			case UmlPackage.LOOP_NODE__IS_TESTED_FIRST:
				setIsTestedFirst((String)newValue);
				return;
			case UmlPackage.LOOP_NODE__SETUP_PART1:
				setSetupPart1((String)newValue);
				return;
			case UmlPackage.LOOP_NODE__TEST1:
				setTest1((String)newValue);
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
			case UmlPackage.LOOP_NODE__GROUP9:
				getGroup9().clear();
				return;
			case UmlPackage.LOOP_NODE__BODY_PART:
				getBodyPart().clear();
				return;
			case UmlPackage.LOOP_NODE__SETUP_PART:
				getSetupPart().clear();
				return;
			case UmlPackage.LOOP_NODE__DECIDER:
				getDecider().clear();
				return;
			case UmlPackage.LOOP_NODE__TEST:
				getTest().clear();
				return;
			case UmlPackage.LOOP_NODE__RESULT:
				getResult().clear();
				return;
			case UmlPackage.LOOP_NODE__LOOP_VARIABLE:
				getLoopVariable().clear();
				return;
			case UmlPackage.LOOP_NODE__BODY_OUTPUT:
				getBodyOutput().clear();
				return;
			case UmlPackage.LOOP_NODE__LOOP_VARIABLE_INPUT:
				getLoopVariableInput().clear();
				return;
			case UmlPackage.LOOP_NODE__BODY_OUTPUT1:
				setBodyOutput1(BODY_OUTPUT1_EDEFAULT);
				return;
			case UmlPackage.LOOP_NODE__BODY_PART1:
				setBodyPart1(BODY_PART1_EDEFAULT);
				return;
			case UmlPackage.LOOP_NODE__DECIDER1:
				setDecider1(DECIDER1_EDEFAULT);
				return;
			case UmlPackage.LOOP_NODE__IS_TESTED_FIRST:
				setIsTestedFirst(IS_TESTED_FIRST_EDEFAULT);
				return;
			case UmlPackage.LOOP_NODE__SETUP_PART1:
				setSetupPart1(SETUP_PART1_EDEFAULT);
				return;
			case UmlPackage.LOOP_NODE__TEST1:
				setTest1(TEST1_EDEFAULT);
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
			case UmlPackage.LOOP_NODE__GROUP9:
				return group9 != null && !group9.isEmpty();
			case UmlPackage.LOOP_NODE__BODY_PART:
				return !getBodyPart().isEmpty();
			case UmlPackage.LOOP_NODE__SETUP_PART:
				return !getSetupPart().isEmpty();
			case UmlPackage.LOOP_NODE__DECIDER:
				return !getDecider().isEmpty();
			case UmlPackage.LOOP_NODE__TEST:
				return !getTest().isEmpty();
			case UmlPackage.LOOP_NODE__RESULT:
				return !getResult().isEmpty();
			case UmlPackage.LOOP_NODE__LOOP_VARIABLE:
				return !getLoopVariable().isEmpty();
			case UmlPackage.LOOP_NODE__BODY_OUTPUT:
				return !getBodyOutput().isEmpty();
			case UmlPackage.LOOP_NODE__LOOP_VARIABLE_INPUT:
				return !getLoopVariableInput().isEmpty();
			case UmlPackage.LOOP_NODE__BODY_OUTPUT1:
				return BODY_OUTPUT1_EDEFAULT == null ? bodyOutput1 != null : !BODY_OUTPUT1_EDEFAULT.equals(bodyOutput1);
			case UmlPackage.LOOP_NODE__BODY_PART1:
				return BODY_PART1_EDEFAULT == null ? bodyPart1 != null : !BODY_PART1_EDEFAULT.equals(bodyPart1);
			case UmlPackage.LOOP_NODE__DECIDER1:
				return DECIDER1_EDEFAULT == null ? decider1 != null : !DECIDER1_EDEFAULT.equals(decider1);
			case UmlPackage.LOOP_NODE__IS_TESTED_FIRST:
				return IS_TESTED_FIRST_EDEFAULT == null ? isTestedFirst != null : !IS_TESTED_FIRST_EDEFAULT.equals(isTestedFirst);
			case UmlPackage.LOOP_NODE__SETUP_PART1:
				return SETUP_PART1_EDEFAULT == null ? setupPart1 != null : !SETUP_PART1_EDEFAULT.equals(setupPart1);
			case UmlPackage.LOOP_NODE__TEST1:
				return TEST1_EDEFAULT == null ? test1 != null : !TEST1_EDEFAULT.equals(test1);
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
		result.append(", bodyOutput1: ");
		result.append(bodyOutput1);
		result.append(", bodyPart1: ");
		result.append(bodyPart1);
		result.append(", decider1: ");
		result.append(decider1);
		result.append(", isTestedFirst: ");
		result.append(isTestedFirst);
		result.append(", setupPart1: ");
		result.append(setupPart1);
		result.append(", test1: ");
		result.append(test1);
		result.append(')');
		return result.toString();
	}

} //LoopNodeImpl
