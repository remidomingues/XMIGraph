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

import org.eclipse.uml2._1._0._0.uml.Dependency;
import org.eclipse.uml2._1._0._0.uml.NamedElement;
import org.eclipse.uml2._1._0._0.uml.StringExpression;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.NamedElementImpl#getGroup4 <em>Group4</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.NamedElementImpl#getClientDependency <em>Client Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.NamedElementImpl#getNameExpression <em>Name Expression</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.NamedElementImpl#getClientDependency1 <em>Client Dependency1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.NamedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.NamedElementImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedElementImpl extends TemplateableElementImpl implements NamedElement
{
	/**
	 * The cached value of the '{@link #getGroup4() <em>Group4</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup4()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group4;

	/**
	 * The default value of the '{@link #getClientDependency1() <em>Client Dependency1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientDependency1()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_DEPENDENCY1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientDependency1() <em>Client Dependency1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientDependency1()
	 * @generated
	 * @ordered
	 */
	protected String clientDependency1 = CLIENT_DEPENDENCY1_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * This is true if the Visibility attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibilityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementImpl()
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
		return UmlPackage.eINSTANCE.getNamedElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup4()
	{
		if (group4 == null)
		{
			group4 = new BasicFeatureMap(this, UmlPackage.NAMED_ELEMENT__GROUP4);
		}
		return group4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getClientDependency()
	{
		return getGroup4().list(UmlPackage.eINSTANCE.getNamedElement_ClientDependency());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StringExpression> getNameExpression()
	{
		return getGroup4().list(UmlPackage.eINSTANCE.getNamedElement_NameExpression());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClientDependency1()
	{
		return clientDependency1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientDependency1(String newClientDependency1)
	{
		String oldClientDependency1 = clientDependency1;
		clientDependency1 = newClientDependency1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY1, oldClientDependency1, clientDependency1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.NAMED_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility()
	{
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility)
	{
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		boolean oldVisibilityESet = visibilityESet;
		visibilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.NAMED_ELEMENT__VISIBILITY, oldVisibility, visibility, !oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibility()
	{
		VisibilityKind oldVisibility = visibility;
		boolean oldVisibilityESet = visibilityESet;
		visibility = VISIBILITY_EDEFAULT;
		visibilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.NAMED_ELEMENT__VISIBILITY, oldVisibility, VISIBILITY_EDEFAULT, oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibility()
	{
		return visibilityESet;
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
			case UmlPackage.NAMED_ELEMENT__GROUP4:
				return ((InternalEList<?>)getGroup4()).basicRemove(otherEnd, msgs);
			case UmlPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY:
				return ((InternalEList<?>)getClientDependency()).basicRemove(otherEnd, msgs);
			case UmlPackage.NAMED_ELEMENT__NAME_EXPRESSION:
				return ((InternalEList<?>)getNameExpression()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.NAMED_ELEMENT__GROUP4:
				if (coreType) return getGroup4();
				return ((FeatureMap.Internal)getGroup4()).getWrapper();
			case UmlPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY:
				return getClientDependency();
			case UmlPackage.NAMED_ELEMENT__NAME_EXPRESSION:
				return getNameExpression();
			case UmlPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY1:
				return getClientDependency1();
			case UmlPackage.NAMED_ELEMENT__NAME:
				return getName();
			case UmlPackage.NAMED_ELEMENT__VISIBILITY:
				return getVisibility();
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
			case UmlPackage.NAMED_ELEMENT__GROUP4:
				((FeatureMap.Internal)getGroup4()).set(newValue);
				return;
			case UmlPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY:
				getClientDependency().clear();
				getClientDependency().addAll((Collection<? extends Dependency>)newValue);
				return;
			case UmlPackage.NAMED_ELEMENT__NAME_EXPRESSION:
				getNameExpression().clear();
				getNameExpression().addAll((Collection<? extends StringExpression>)newValue);
				return;
			case UmlPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY1:
				setClientDependency1((String)newValue);
				return;
			case UmlPackage.NAMED_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case UmlPackage.NAMED_ELEMENT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
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
			case UmlPackage.NAMED_ELEMENT__GROUP4:
				getGroup4().clear();
				return;
			case UmlPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY:
				getClientDependency().clear();
				return;
			case UmlPackage.NAMED_ELEMENT__NAME_EXPRESSION:
				getNameExpression().clear();
				return;
			case UmlPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY1:
				setClientDependency1(CLIENT_DEPENDENCY1_EDEFAULT);
				return;
			case UmlPackage.NAMED_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UmlPackage.NAMED_ELEMENT__VISIBILITY:
				unsetVisibility();
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
			case UmlPackage.NAMED_ELEMENT__GROUP4:
				return group4 != null && !group4.isEmpty();
			case UmlPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY:
				return !getClientDependency().isEmpty();
			case UmlPackage.NAMED_ELEMENT__NAME_EXPRESSION:
				return !getNameExpression().isEmpty();
			case UmlPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY1:
				return CLIENT_DEPENDENCY1_EDEFAULT == null ? clientDependency1 != null : !CLIENT_DEPENDENCY1_EDEFAULT.equals(clientDependency1);
			case UmlPackage.NAMED_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UmlPackage.NAMED_ELEMENT__VISIBILITY:
				return isSetVisibility();
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
		result.append(" (group4: ");
		result.append(group4);
		result.append(", clientDependency1: ");
		result.append(clientDependency1);
		result.append(", name: ");
		result.append(name);
		result.append(", visibility: ");
		if (visibilityESet) result.append(visibility); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NamedElementImpl
