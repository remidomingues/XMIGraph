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

import org.eclipse.uml2._1._0._0.uml.Transition;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.VertexImpl#getGroup5 <em>Group5</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.VertexImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.VertexImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.VertexImpl#getIncoming1 <em>Incoming1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.VertexImpl#getOutgoing1 <em>Outgoing1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VertexImpl extends NamedElementImpl implements Vertex
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
	 * The default value of the '{@link #getIncoming1() <em>Incoming1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming1()
	 * @generated
	 * @ordered
	 */
	protected static final String INCOMING1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncoming1() <em>Incoming1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming1()
	 * @generated
	 * @ordered
	 */
	protected String incoming1 = INCOMING1_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutgoing1() <em>Outgoing1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing1()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTGOING1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutgoing1() <em>Outgoing1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing1()
	 * @generated
	 * @ordered
	 */
	protected String outgoing1 = OUTGOING1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VertexImpl()
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
		return UmlPackage.eINSTANCE.getVertex();
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
			group5 = new BasicFeatureMap(this, UmlPackage.VERTEX__GROUP5);
		}
		return group5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoing()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getVertex_Outgoing());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncoming()
	{
		return getGroup5().list(UmlPackage.eINSTANCE.getVertex_Incoming());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncoming1()
	{
		return incoming1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncoming1(String newIncoming1)
	{
		String oldIncoming1 = incoming1;
		incoming1 = newIncoming1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.VERTEX__INCOMING1, oldIncoming1, incoming1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutgoing1()
	{
		return outgoing1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoing1(String newOutgoing1)
	{
		String oldOutgoing1 = outgoing1;
		outgoing1 = newOutgoing1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.VERTEX__OUTGOING1, oldOutgoing1, outgoing1));
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
			case UmlPackage.VERTEX__GROUP5:
				return ((InternalEList<?>)getGroup5()).basicRemove(otherEnd, msgs);
			case UmlPackage.VERTEX__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case UmlPackage.VERTEX__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.VERTEX__GROUP5:
				if (coreType) return getGroup5();
				return ((FeatureMap.Internal)getGroup5()).getWrapper();
			case UmlPackage.VERTEX__OUTGOING:
				return getOutgoing();
			case UmlPackage.VERTEX__INCOMING:
				return getIncoming();
			case UmlPackage.VERTEX__INCOMING1:
				return getIncoming1();
			case UmlPackage.VERTEX__OUTGOING1:
				return getOutgoing1();
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
			case UmlPackage.VERTEX__GROUP5:
				((FeatureMap.Internal)getGroup5()).set(newValue);
				return;
			case UmlPackage.VERTEX__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Transition>)newValue);
				return;
			case UmlPackage.VERTEX__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Transition>)newValue);
				return;
			case UmlPackage.VERTEX__INCOMING1:
				setIncoming1((String)newValue);
				return;
			case UmlPackage.VERTEX__OUTGOING1:
				setOutgoing1((String)newValue);
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
			case UmlPackage.VERTEX__GROUP5:
				getGroup5().clear();
				return;
			case UmlPackage.VERTEX__OUTGOING:
				getOutgoing().clear();
				return;
			case UmlPackage.VERTEX__INCOMING:
				getIncoming().clear();
				return;
			case UmlPackage.VERTEX__INCOMING1:
				setIncoming1(INCOMING1_EDEFAULT);
				return;
			case UmlPackage.VERTEX__OUTGOING1:
				setOutgoing1(OUTGOING1_EDEFAULT);
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
			case UmlPackage.VERTEX__GROUP5:
				return group5 != null && !group5.isEmpty();
			case UmlPackage.VERTEX__OUTGOING:
				return !getOutgoing().isEmpty();
			case UmlPackage.VERTEX__INCOMING:
				return !getIncoming().isEmpty();
			case UmlPackage.VERTEX__INCOMING1:
				return INCOMING1_EDEFAULT == null ? incoming1 != null : !INCOMING1_EDEFAULT.equals(incoming1);
			case UmlPackage.VERTEX__OUTGOING1:
				return OUTGOING1_EDEFAULT == null ? outgoing1 != null : !OUTGOING1_EDEFAULT.equals(outgoing1);
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
		result.append(", incoming1: ");
		result.append(incoming1);
		result.append(", outgoing1: ");
		result.append(outgoing1);
		result.append(')');
		return result.toString();
	}

} //VertexImpl
