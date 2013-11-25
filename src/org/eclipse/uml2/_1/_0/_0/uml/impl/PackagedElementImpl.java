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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2._1._0._0.uml.Generalization;
import org.eclipse.uml2._1._0._0.uml.OwnedAttribute;
import org.eclipse.uml2._1._0._0.uml.OwnedEnd;
import org.eclipse.uml2._1._0._0.uml.OwnedOperation;
import org.eclipse.uml2._1._0._0.uml.OwnedRule;
import org.eclipse.uml2._1._0._0.uml.PackagedElement;
import org.eclipse.uml2._1._0._0.uml.Referenced;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Packaged Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackagedElementImpl#getClient <em>Client</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackagedElementImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackagedElementImpl#getRealizingClassifier <em>Realizing Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackagedElementImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackagedElementImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackagedElementImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackagedElementImpl#getMemberEnd <em>Member End</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackagedElementImpl#getOwnedEnd <em>Owned End</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackagedElementImpl#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PackagedElementImpl#getPackagedElement <em>Packaged Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackagedElementImpl extends IsAbstractIsStaticImpl implements PackagedElement
{
	/**
	 * The default value of the '{@link #getClient() <em>Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected String client = CLIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupplier() <em>Supplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected String supplier = SUPPLIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRealizingClassifier() <em>Realizing Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingClassifier()
	 * @generated
	 * @ordered
	 */
	protected static final String REALIZING_CLASSIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRealizingClassifier() <em>Realizing Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingClassifier()
	 * @generated
	 * @ordered
	 */
	protected String realizingClassifier = REALIZING_CLASSIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<OwnedAttribute> ownedAttribute;

	/**
	 * The cached value of the '{@link #getOwnedOperation() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<OwnedOperation> ownedOperation;

	/**
	 * The cached value of the '{@link #getGeneralization() <em>Generalization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralization()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalization;

	/**
	 * The cached value of the '{@link #getMemberEnd() <em>Member End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Referenced> memberEnd;

	/**
	 * The cached value of the '{@link #getOwnedEnd() <em>Owned End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnd()
	 * @generated
	 * @ordered
	 */
	protected OwnedEnd ownedEnd;

	/**
	 * The cached value of the '{@link #getOwnedRule() <em>Owned Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRule()
	 * @generated
	 * @ordered
	 */
	protected OwnedRule ownedRule;

	/**
	 * The cached value of the '{@link #getPackagedElement() <em>Packaged Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<PackagedElement> packagedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackagedElementImpl()
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
		return UmlPackage.eINSTANCE.getPackagedElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClient()
	{
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(String newClient)
	{
		String oldClient = client;
		client = newClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGED_ELEMENT__CLIENT, oldClient, client));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupplier()
	{
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier(String newSupplier)
	{
		String oldSupplier = supplier;
		supplier = newSupplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGED_ELEMENT__SUPPLIER, oldSupplier, supplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRealizingClassifier()
	{
		return realizingClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizingClassifier(String newRealizingClassifier)
	{
		String oldRealizingClassifier = realizingClassifier;
		realizingClassifier = newRealizingClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGED_ELEMENT__REALIZING_CLASSIFIER, oldRealizingClassifier, realizingClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OwnedAttribute> getOwnedAttribute()
	{
		if (ownedAttribute == null)
		{
			ownedAttribute = new EObjectContainmentEList<OwnedAttribute>(OwnedAttribute.class, this, UmlPackage.PACKAGED_ELEMENT__OWNED_ATTRIBUTE);
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OwnedOperation> getOwnedOperation()
	{
		if (ownedOperation == null)
		{
			ownedOperation = new EObjectContainmentEList<OwnedOperation>(OwnedOperation.class, this, UmlPackage.PACKAGED_ELEMENT__OWNED_OPERATION);
		}
		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralization()
	{
		if (generalization == null)
		{
			generalization = new EObjectContainmentEList<Generalization>(Generalization.class, this, UmlPackage.PACKAGED_ELEMENT__GENERALIZATION);
		}
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Referenced> getMemberEnd()
	{
		if (memberEnd == null)
		{
			memberEnd = new EObjectContainmentEList<Referenced>(Referenced.class, this, UmlPackage.PACKAGED_ELEMENT__MEMBER_END);
		}
		return memberEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnedEnd getOwnedEnd()
	{
		return ownedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedEnd(OwnedEnd newOwnedEnd, NotificationChain msgs)
	{
		OwnedEnd oldOwnedEnd = ownedEnd;
		ownedEnd = newOwnedEnd;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGED_ELEMENT__OWNED_END, oldOwnedEnd, newOwnedEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedEnd(OwnedEnd newOwnedEnd)
	{
		if (newOwnedEnd != ownedEnd)
		{
			NotificationChain msgs = null;
			if (ownedEnd != null)
				msgs = ((InternalEObject)ownedEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.PACKAGED_ELEMENT__OWNED_END, null, msgs);
			if (newOwnedEnd != null)
				msgs = ((InternalEObject)newOwnedEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.PACKAGED_ELEMENT__OWNED_END, null, msgs);
			msgs = basicSetOwnedEnd(newOwnedEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGED_ELEMENT__OWNED_END, newOwnedEnd, newOwnedEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnedRule getOwnedRule()
	{
		return ownedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedRule(OwnedRule newOwnedRule, NotificationChain msgs)
	{
		OwnedRule oldOwnedRule = ownedRule;
		ownedRule = newOwnedRule;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGED_ELEMENT__OWNED_RULE, oldOwnedRule, newOwnedRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedRule(OwnedRule newOwnedRule)
	{
		if (newOwnedRule != ownedRule)
		{
			NotificationChain msgs = null;
			if (ownedRule != null)
				msgs = ((InternalEObject)ownedRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.PACKAGED_ELEMENT__OWNED_RULE, null, msgs);
			if (newOwnedRule != null)
				msgs = ((InternalEObject)newOwnedRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.PACKAGED_ELEMENT__OWNED_RULE, null, msgs);
			msgs = basicSetOwnedRule(newOwnedRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGED_ELEMENT__OWNED_RULE, newOwnedRule, newOwnedRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackagedElement> getPackagedElement()
	{
		if (packagedElement == null)
		{
			packagedElement = new EObjectContainmentEList<PackagedElement>(PackagedElement.class, this, UmlPackage.PACKAGED_ELEMENT__PACKAGED_ELEMENT);
		}
		return packagedElement;
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
			case UmlPackage.PACKAGED_ELEMENT__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
			case UmlPackage.PACKAGED_ELEMENT__OWNED_OPERATION:
				return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
			case UmlPackage.PACKAGED_ELEMENT__GENERALIZATION:
				return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
			case UmlPackage.PACKAGED_ELEMENT__MEMBER_END:
				return ((InternalEList<?>)getMemberEnd()).basicRemove(otherEnd, msgs);
			case UmlPackage.PACKAGED_ELEMENT__OWNED_END:
				return basicSetOwnedEnd(null, msgs);
			case UmlPackage.PACKAGED_ELEMENT__OWNED_RULE:
				return basicSetOwnedRule(null, msgs);
			case UmlPackage.PACKAGED_ELEMENT__PACKAGED_ELEMENT:
				return ((InternalEList<?>)getPackagedElement()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.PACKAGED_ELEMENT__CLIENT:
				return getClient();
			case UmlPackage.PACKAGED_ELEMENT__SUPPLIER:
				return getSupplier();
			case UmlPackage.PACKAGED_ELEMENT__REALIZING_CLASSIFIER:
				return getRealizingClassifier();
			case UmlPackage.PACKAGED_ELEMENT__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case UmlPackage.PACKAGED_ELEMENT__OWNED_OPERATION:
				return getOwnedOperation();
			case UmlPackage.PACKAGED_ELEMENT__GENERALIZATION:
				return getGeneralization();
			case UmlPackage.PACKAGED_ELEMENT__MEMBER_END:
				return getMemberEnd();
			case UmlPackage.PACKAGED_ELEMENT__OWNED_END:
				return getOwnedEnd();
			case UmlPackage.PACKAGED_ELEMENT__OWNED_RULE:
				return getOwnedRule();
			case UmlPackage.PACKAGED_ELEMENT__PACKAGED_ELEMENT:
				return getPackagedElement();
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
			case UmlPackage.PACKAGED_ELEMENT__CLIENT:
				setClient((String)newValue);
				return;
			case UmlPackage.PACKAGED_ELEMENT__SUPPLIER:
				setSupplier((String)newValue);
				return;
			case UmlPackage.PACKAGED_ELEMENT__REALIZING_CLASSIFIER:
				setRealizingClassifier((String)newValue);
				return;
			case UmlPackage.PACKAGED_ELEMENT__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends OwnedAttribute>)newValue);
				return;
			case UmlPackage.PACKAGED_ELEMENT__OWNED_OPERATION:
				getOwnedOperation().clear();
				getOwnedOperation().addAll((Collection<? extends OwnedOperation>)newValue);
				return;
			case UmlPackage.PACKAGED_ELEMENT__GENERALIZATION:
				getGeneralization().clear();
				getGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case UmlPackage.PACKAGED_ELEMENT__MEMBER_END:
				getMemberEnd().clear();
				getMemberEnd().addAll((Collection<? extends Referenced>)newValue);
				return;
			case UmlPackage.PACKAGED_ELEMENT__OWNED_END:
				setOwnedEnd((OwnedEnd)newValue);
				return;
			case UmlPackage.PACKAGED_ELEMENT__OWNED_RULE:
				setOwnedRule((OwnedRule)newValue);
				return;
			case UmlPackage.PACKAGED_ELEMENT__PACKAGED_ELEMENT:
				getPackagedElement().clear();
				getPackagedElement().addAll((Collection<? extends PackagedElement>)newValue);
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
			case UmlPackage.PACKAGED_ELEMENT__CLIENT:
				setClient(CLIENT_EDEFAULT);
				return;
			case UmlPackage.PACKAGED_ELEMENT__SUPPLIER:
				setSupplier(SUPPLIER_EDEFAULT);
				return;
			case UmlPackage.PACKAGED_ELEMENT__REALIZING_CLASSIFIER:
				setRealizingClassifier(REALIZING_CLASSIFIER_EDEFAULT);
				return;
			case UmlPackage.PACKAGED_ELEMENT__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
			case UmlPackage.PACKAGED_ELEMENT__OWNED_OPERATION:
				getOwnedOperation().clear();
				return;
			case UmlPackage.PACKAGED_ELEMENT__GENERALIZATION:
				getGeneralization().clear();
				return;
			case UmlPackage.PACKAGED_ELEMENT__MEMBER_END:
				getMemberEnd().clear();
				return;
			case UmlPackage.PACKAGED_ELEMENT__OWNED_END:
				setOwnedEnd((OwnedEnd)null);
				return;
			case UmlPackage.PACKAGED_ELEMENT__OWNED_RULE:
				setOwnedRule((OwnedRule)null);
				return;
			case UmlPackage.PACKAGED_ELEMENT__PACKAGED_ELEMENT:
				getPackagedElement().clear();
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
			case UmlPackage.PACKAGED_ELEMENT__CLIENT:
				return CLIENT_EDEFAULT == null ? client != null : !CLIENT_EDEFAULT.equals(client);
			case UmlPackage.PACKAGED_ELEMENT__SUPPLIER:
				return SUPPLIER_EDEFAULT == null ? supplier != null : !SUPPLIER_EDEFAULT.equals(supplier);
			case UmlPackage.PACKAGED_ELEMENT__REALIZING_CLASSIFIER:
				return REALIZING_CLASSIFIER_EDEFAULT == null ? realizingClassifier != null : !REALIZING_CLASSIFIER_EDEFAULT.equals(realizingClassifier);
			case UmlPackage.PACKAGED_ELEMENT__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UmlPackage.PACKAGED_ELEMENT__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UmlPackage.PACKAGED_ELEMENT__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case UmlPackage.PACKAGED_ELEMENT__MEMBER_END:
				return memberEnd != null && !memberEnd.isEmpty();
			case UmlPackage.PACKAGED_ELEMENT__OWNED_END:
				return ownedEnd != null;
			case UmlPackage.PACKAGED_ELEMENT__OWNED_RULE:
				return ownedRule != null;
			case UmlPackage.PACKAGED_ELEMENT__PACKAGED_ELEMENT:
				return packagedElement != null && !packagedElement.isEmpty();
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
		result.append(" (client: ");
		result.append(client);
		result.append(", supplier: ");
		result.append(supplier);
		result.append(", realizingClassifier: ");
		result.append(realizingClassifier);
		result.append(')');
		return result.toString();
	}

} //PackagedElementImpl
