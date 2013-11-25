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
import org.eclipse.uml2._1._0._0.uml.Clause;
import org.eclipse.uml2._1._0._0.uml.OutputPin;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClauseImpl#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClauseImpl#getTest <em>Test</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClauseImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClauseImpl#getPredecessorClause <em>Predecessor Clause</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClauseImpl#getSuccessorClause <em>Successor Clause</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClauseImpl#getDecider <em>Decider</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClauseImpl#getBodyOutput <em>Body Output</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClauseImpl#getBody1 <em>Body1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClauseImpl#getBodyOutput1 <em>Body Output1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClauseImpl#getDecider1 <em>Decider1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClauseImpl#getPredecessorClause1 <em>Predecessor Clause1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClauseImpl#getSuccessorClause1 <em>Successor Clause1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClauseImpl#getTest1 <em>Test1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClauseImpl extends ElementImpl implements Clause
{
	/**
	 * The cached value of the '{@link #getGroup3() <em>Group3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup3()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group3;

	/**
	 * The default value of the '{@link #getBody1() <em>Body1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody1()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody1() <em>Body1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody1()
	 * @generated
	 * @ordered
	 */
	protected String body1 = BODY1_EDEFAULT;

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
	 * The default value of the '{@link #getPredecessorClause1() <em>Predecessor Clause1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessorClause1()
	 * @generated
	 * @ordered
	 */
	protected static final String PREDECESSOR_CLAUSE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPredecessorClause1() <em>Predecessor Clause1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessorClause1()
	 * @generated
	 * @ordered
	 */
	protected String predecessorClause1 = PREDECESSOR_CLAUSE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuccessorClause1() <em>Successor Clause1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessorClause1()
	 * @generated
	 * @ordered
	 */
	protected static final String SUCCESSOR_CLAUSE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuccessorClause1() <em>Successor Clause1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessorClause1()
	 * @generated
	 * @ordered
	 */
	protected String successorClause1 = SUCCESSOR_CLAUSE1_EDEFAULT;

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
	protected ClauseImpl()
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
		return UmlPackage.eINSTANCE.getClause();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup3()
	{
		if (group3 == null)
		{
			group3 = new BasicFeatureMap(this, UmlPackage.CLAUSE__GROUP3);
		}
		return group3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getTest()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getClause_Test());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getBody()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getClause_Body());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clause> getPredecessorClause()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getClause_PredecessorClause());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clause> getSuccessorClause()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getClause_SuccessorClause());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getDecider()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getClause_Decider());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getBodyOutput()
	{
		return getGroup3().list(UmlPackage.eINSTANCE.getClause_BodyOutput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody1()
	{
		return body1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody1(String newBody1)
	{
		String oldBody1 = body1;
		body1 = newBody1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLAUSE__BODY1, oldBody1, body1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLAUSE__BODY_OUTPUT1, oldBodyOutput1, bodyOutput1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLAUSE__DECIDER1, oldDecider1, decider1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPredecessorClause1()
	{
		return predecessorClause1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredecessorClause1(String newPredecessorClause1)
	{
		String oldPredecessorClause1 = predecessorClause1;
		predecessorClause1 = newPredecessorClause1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLAUSE__PREDECESSOR_CLAUSE1, oldPredecessorClause1, predecessorClause1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuccessorClause1()
	{
		return successorClause1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessorClause1(String newSuccessorClause1)
	{
		String oldSuccessorClause1 = successorClause1;
		successorClause1 = newSuccessorClause1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLAUSE__SUCCESSOR_CLAUSE1, oldSuccessorClause1, successorClause1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLAUSE__TEST1, oldTest1, test1));
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
			case UmlPackage.CLAUSE__GROUP3:
				return ((InternalEList<?>)getGroup3()).basicRemove(otherEnd, msgs);
			case UmlPackage.CLAUSE__TEST:
				return ((InternalEList<?>)getTest()).basicRemove(otherEnd, msgs);
			case UmlPackage.CLAUSE__BODY:
				return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
			case UmlPackage.CLAUSE__PREDECESSOR_CLAUSE:
				return ((InternalEList<?>)getPredecessorClause()).basicRemove(otherEnd, msgs);
			case UmlPackage.CLAUSE__SUCCESSOR_CLAUSE:
				return ((InternalEList<?>)getSuccessorClause()).basicRemove(otherEnd, msgs);
			case UmlPackage.CLAUSE__DECIDER:
				return ((InternalEList<?>)getDecider()).basicRemove(otherEnd, msgs);
			case UmlPackage.CLAUSE__BODY_OUTPUT:
				return ((InternalEList<?>)getBodyOutput()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.CLAUSE__GROUP3:
				if (coreType) return getGroup3();
				return ((FeatureMap.Internal)getGroup3()).getWrapper();
			case UmlPackage.CLAUSE__TEST:
				return getTest();
			case UmlPackage.CLAUSE__BODY:
				return getBody();
			case UmlPackage.CLAUSE__PREDECESSOR_CLAUSE:
				return getPredecessorClause();
			case UmlPackage.CLAUSE__SUCCESSOR_CLAUSE:
				return getSuccessorClause();
			case UmlPackage.CLAUSE__DECIDER:
				return getDecider();
			case UmlPackage.CLAUSE__BODY_OUTPUT:
				return getBodyOutput();
			case UmlPackage.CLAUSE__BODY1:
				return getBody1();
			case UmlPackage.CLAUSE__BODY_OUTPUT1:
				return getBodyOutput1();
			case UmlPackage.CLAUSE__DECIDER1:
				return getDecider1();
			case UmlPackage.CLAUSE__PREDECESSOR_CLAUSE1:
				return getPredecessorClause1();
			case UmlPackage.CLAUSE__SUCCESSOR_CLAUSE1:
				return getSuccessorClause1();
			case UmlPackage.CLAUSE__TEST1:
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
			case UmlPackage.CLAUSE__GROUP3:
				((FeatureMap.Internal)getGroup3()).set(newValue);
				return;
			case UmlPackage.CLAUSE__TEST:
				getTest().clear();
				getTest().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case UmlPackage.CLAUSE__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case UmlPackage.CLAUSE__PREDECESSOR_CLAUSE:
				getPredecessorClause().clear();
				getPredecessorClause().addAll((Collection<? extends Clause>)newValue);
				return;
			case UmlPackage.CLAUSE__SUCCESSOR_CLAUSE:
				getSuccessorClause().clear();
				getSuccessorClause().addAll((Collection<? extends Clause>)newValue);
				return;
			case UmlPackage.CLAUSE__DECIDER:
				getDecider().clear();
				getDecider().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case UmlPackage.CLAUSE__BODY_OUTPUT:
				getBodyOutput().clear();
				getBodyOutput().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case UmlPackage.CLAUSE__BODY1:
				setBody1((String)newValue);
				return;
			case UmlPackage.CLAUSE__BODY_OUTPUT1:
				setBodyOutput1((String)newValue);
				return;
			case UmlPackage.CLAUSE__DECIDER1:
				setDecider1((String)newValue);
				return;
			case UmlPackage.CLAUSE__PREDECESSOR_CLAUSE1:
				setPredecessorClause1((String)newValue);
				return;
			case UmlPackage.CLAUSE__SUCCESSOR_CLAUSE1:
				setSuccessorClause1((String)newValue);
				return;
			case UmlPackage.CLAUSE__TEST1:
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
			case UmlPackage.CLAUSE__GROUP3:
				getGroup3().clear();
				return;
			case UmlPackage.CLAUSE__TEST:
				getTest().clear();
				return;
			case UmlPackage.CLAUSE__BODY:
				getBody().clear();
				return;
			case UmlPackage.CLAUSE__PREDECESSOR_CLAUSE:
				getPredecessorClause().clear();
				return;
			case UmlPackage.CLAUSE__SUCCESSOR_CLAUSE:
				getSuccessorClause().clear();
				return;
			case UmlPackage.CLAUSE__DECIDER:
				getDecider().clear();
				return;
			case UmlPackage.CLAUSE__BODY_OUTPUT:
				getBodyOutput().clear();
				return;
			case UmlPackage.CLAUSE__BODY1:
				setBody1(BODY1_EDEFAULT);
				return;
			case UmlPackage.CLAUSE__BODY_OUTPUT1:
				setBodyOutput1(BODY_OUTPUT1_EDEFAULT);
				return;
			case UmlPackage.CLAUSE__DECIDER1:
				setDecider1(DECIDER1_EDEFAULT);
				return;
			case UmlPackage.CLAUSE__PREDECESSOR_CLAUSE1:
				setPredecessorClause1(PREDECESSOR_CLAUSE1_EDEFAULT);
				return;
			case UmlPackage.CLAUSE__SUCCESSOR_CLAUSE1:
				setSuccessorClause1(SUCCESSOR_CLAUSE1_EDEFAULT);
				return;
			case UmlPackage.CLAUSE__TEST1:
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
			case UmlPackage.CLAUSE__GROUP3:
				return group3 != null && !group3.isEmpty();
			case UmlPackage.CLAUSE__TEST:
				return !getTest().isEmpty();
			case UmlPackage.CLAUSE__BODY:
				return !getBody().isEmpty();
			case UmlPackage.CLAUSE__PREDECESSOR_CLAUSE:
				return !getPredecessorClause().isEmpty();
			case UmlPackage.CLAUSE__SUCCESSOR_CLAUSE:
				return !getSuccessorClause().isEmpty();
			case UmlPackage.CLAUSE__DECIDER:
				return !getDecider().isEmpty();
			case UmlPackage.CLAUSE__BODY_OUTPUT:
				return !getBodyOutput().isEmpty();
			case UmlPackage.CLAUSE__BODY1:
				return BODY1_EDEFAULT == null ? body1 != null : !BODY1_EDEFAULT.equals(body1);
			case UmlPackage.CLAUSE__BODY_OUTPUT1:
				return BODY_OUTPUT1_EDEFAULT == null ? bodyOutput1 != null : !BODY_OUTPUT1_EDEFAULT.equals(bodyOutput1);
			case UmlPackage.CLAUSE__DECIDER1:
				return DECIDER1_EDEFAULT == null ? decider1 != null : !DECIDER1_EDEFAULT.equals(decider1);
			case UmlPackage.CLAUSE__PREDECESSOR_CLAUSE1:
				return PREDECESSOR_CLAUSE1_EDEFAULT == null ? predecessorClause1 != null : !PREDECESSOR_CLAUSE1_EDEFAULT.equals(predecessorClause1);
			case UmlPackage.CLAUSE__SUCCESSOR_CLAUSE1:
				return SUCCESSOR_CLAUSE1_EDEFAULT == null ? successorClause1 != null : !SUCCESSOR_CLAUSE1_EDEFAULT.equals(successorClause1);
			case UmlPackage.CLAUSE__TEST1:
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
		result.append(" (group3: ");
		result.append(group3);
		result.append(", body1: ");
		result.append(body1);
		result.append(", bodyOutput1: ");
		result.append(bodyOutput1);
		result.append(", decider1: ");
		result.append(decider1);
		result.append(", predecessorClause1: ");
		result.append(predecessorClause1);
		result.append(", successorClause1: ");
		result.append(successorClause1);
		result.append(", test1: ");
		result.append(test1);
		result.append(')');
		return result.toString();
	}

} //ClauseImpl
