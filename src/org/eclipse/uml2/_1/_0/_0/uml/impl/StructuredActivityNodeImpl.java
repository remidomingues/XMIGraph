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

import org.eclipse.uml2._1._0._0.uml.ActivityEdge;
import org.eclipse.uml2._1._0._0.uml.ActivityNode;
import org.eclipse.uml2._1._0._0.uml.Constraint;
import org.eclipse.uml2._1._0._0.uml.ElementImport;
import org.eclipse.uml2._1._0._0.uml.PackageImport;
import org.eclipse.uml2._1._0._0.uml.StructuredActivityNode;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StructuredActivityNodeImpl#getGroup8 <em>Group8</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StructuredActivityNodeImpl#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StructuredActivityNodeImpl#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StructuredActivityNodeImpl#getPackageImport <em>Package Import</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StructuredActivityNodeImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StructuredActivityNodeImpl#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StructuredActivityNodeImpl#getContainedEdge <em>Contained Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.StructuredActivityNodeImpl#getMustIsolate <em>Must Isolate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredActivityNodeImpl extends ActionImpl implements StructuredActivityNode
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
	 * The default value of the '{@link #getMustIsolate() <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustIsolate()
	 * @generated
	 * @ordered
	 */
	protected static final String MUST_ISOLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMustIsolate() <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustIsolate()
	 * @generated
	 * @ordered
	 */
	protected String mustIsolate = MUST_ISOLATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredActivityNodeImpl()
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
		return UmlPackage.eINSTANCE.getStructuredActivityNode();
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
			group8 = new BasicFeatureMap(this, UmlPackage.STRUCTURED_ACTIVITY_NODE__GROUP8);
		}
		return group8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getOwnedRule()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getStructuredActivityNode_OwnedRule());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementImport> getElementImport()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getStructuredActivityNode_ElementImport());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageImport> getPackageImport()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getStructuredActivityNode_PackageImport());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getStructuredActivityNode_Variable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getContainedNode()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getStructuredActivityNode_ContainedNode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getContainedEdge()
	{
		return getGroup8().list(UmlPackage.eINSTANCE.getStructuredActivityNode_ContainedEdge());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMustIsolate()
	{
		return mustIsolate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustIsolate(String newMustIsolate)
	{
		String oldMustIsolate = mustIsolate;
		mustIsolate = newMustIsolate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE, oldMustIsolate, mustIsolate));
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
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__GROUP8:
				return ((InternalEList<?>)getGroup8()).basicRemove(otherEnd, msgs);
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRule()).basicRemove(otherEnd, msgs);
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				return ((InternalEList<?>)getElementImport()).basicRemove(otherEnd, msgs);
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				return ((InternalEList<?>)getPackageImport()).basicRemove(otherEnd, msgs);
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				return ((InternalEList<?>)getContainedNode()).basicRemove(otherEnd, msgs);
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				return ((InternalEList<?>)getContainedEdge()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__GROUP8:
				if (coreType) return getGroup8();
				return ((FeatureMap.Internal)getGroup8()).getWrapper();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				return getOwnedRule();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				return getElementImport();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				return getPackageImport();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return getVariable();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				return getContainedNode();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				return getContainedEdge();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				return getMustIsolate();
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
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__GROUP8:
				((FeatureMap.Internal)getGroup8()).set(newValue);
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				getOwnedRule().clear();
				getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				getElementImport().clear();
				getElementImport().addAll((Collection<? extends ElementImport>)newValue);
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				getPackageImport().clear();
				getPackageImport().addAll((Collection<? extends PackageImport>)newValue);
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends Variable>)newValue);
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				getContainedNode().clear();
				getContainedNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				getContainedEdge().clear();
				getContainedEdge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				setMustIsolate((String)newValue);
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
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__GROUP8:
				getGroup8().clear();
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				getOwnedRule().clear();
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				getElementImport().clear();
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				getPackageImport().clear();
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				getVariable().clear();
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				getContainedNode().clear();
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				getContainedEdge().clear();
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				setMustIsolate(MUST_ISOLATE_EDEFAULT);
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
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__GROUP8:
				return group8 != null && !group8.isEmpty();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				return !getOwnedRule().isEmpty();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				return !getElementImport().isEmpty();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				return !getPackageImport().isEmpty();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return !getVariable().isEmpty();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				return !getContainedNode().isEmpty();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				return !getContainedEdge().isEmpty();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				return MUST_ISOLATE_EDEFAULT == null ? mustIsolate != null : !MUST_ISOLATE_EDEFAULT.equals(mustIsolate);
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
		result.append(", mustIsolate: ");
		result.append(mustIsolate);
		result.append(')');
		return result.toString();
	}

} //StructuredActivityNodeImpl
