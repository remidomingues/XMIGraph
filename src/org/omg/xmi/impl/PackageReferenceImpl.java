/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.xmi.impl;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.xmi.PackageReference;
import org.omg.xmi.XmiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.xmi.impl.PackageReferenceImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.xmi.impl.PackageReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.xmi.impl.PackageReferenceImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.omg.xmi.impl.PackageReferenceImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.omg.xmi.impl.PackageReferenceImpl#getIdref <em>Idref</em>}</li>
 *   <li>{@link org.omg.xmi.impl.PackageReferenceImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.omg.xmi.impl.PackageReferenceImpl#getName1 <em>Name1</em>}</li>
 *   <li>{@link org.omg.xmi.impl.PackageReferenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.xmi.impl.PackageReferenceImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link org.omg.xmi.impl.PackageReferenceImpl#getVersion1 <em>Version1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageReferenceImpl extends EObjectImpl implements PackageReference
{
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdref() <em>Idref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdref()
	 * @generated
	 * @ordered
	 */
	protected static final String IDREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdref() <em>Idref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdref()
	 * @generated
	 * @ordered
	 */
	protected String idref = IDREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getName1() <em>Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName1()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName1() <em>Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName1()
	 * @generated
	 * @ordered
	 */
	protected String name1 = NAME1_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final QName TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected QName type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion1() <em>Version1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion1()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION1_EDEFAULT = "2.0";

	/**
	 * The cached value of the '{@link #getVersion1() <em>Version1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion1()
	 * @generated
	 * @ordered
	 */
	protected String version1 = VERSION1_EDEFAULT;

	/**
	 * This is true if the Version1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean version1ESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageReferenceImpl()
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
		return XmiPackage.Literals.PACKAGE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup()
	{
		if (group == null)
		{
			group = new BasicFeatureMap(this, XmiPackage.PACKAGE_REFERENCE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getName()
	{
		return getGroup().list(XmiPackage.Literals.PACKAGE_REFERENCE__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVersion()
	{
		return getGroup().list(XmiPackage.Literals.PACKAGE_REFERENCE__VERSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref()
	{
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref)
	{
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PACKAGE_REFERENCE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdref()
	{
		return idref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdref(String newIdref)
	{
		String oldIdref = idref;
		idref = newIdref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PACKAGE_REFERENCE__IDREF, oldIdref, idref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PACKAGE_REFERENCE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName1()
	{
		return name1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName1(String newName1)
	{
		String oldName1 = name1;
		name1 = newName1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PACKAGE_REFERENCE__NAME1, oldName1, name1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getType()
	{
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(QName newType)
	{
		QName oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PACKAGE_REFERENCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUuid()
	{
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUuid(String newUuid)
	{
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PACKAGE_REFERENCE__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion1()
	{
		return version1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion1(String newVersion1)
	{
		String oldVersion1 = version1;
		version1 = newVersion1;
		boolean oldVersion1ESet = version1ESet;
		version1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PACKAGE_REFERENCE__VERSION1, oldVersion1, version1, !oldVersion1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVersion1()
	{
		String oldVersion1 = version1;
		boolean oldVersion1ESet = version1ESet;
		version1 = VERSION1_EDEFAULT;
		version1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmiPackage.PACKAGE_REFERENCE__VERSION1, oldVersion1, VERSION1_EDEFAULT, oldVersion1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVersion1()
	{
		return version1ESet;
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
			case XmiPackage.PACKAGE_REFERENCE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
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
			case XmiPackage.PACKAGE_REFERENCE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XmiPackage.PACKAGE_REFERENCE__NAME:
				return getName();
			case XmiPackage.PACKAGE_REFERENCE__VERSION:
				return getVersion();
			case XmiPackage.PACKAGE_REFERENCE__HREF:
				return getHref();
			case XmiPackage.PACKAGE_REFERENCE__IDREF:
				return getIdref();
			case XmiPackage.PACKAGE_REFERENCE__LABEL:
				return getLabel();
			case XmiPackage.PACKAGE_REFERENCE__NAME1:
				return getName1();
			case XmiPackage.PACKAGE_REFERENCE__TYPE:
				return getType();
			case XmiPackage.PACKAGE_REFERENCE__UUID:
				return getUuid();
			case XmiPackage.PACKAGE_REFERENCE__VERSION1:
				return getVersion1();
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
			case XmiPackage.PACKAGE_REFERENCE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XmiPackage.PACKAGE_REFERENCE__NAME:
				getName().clear();
				getName().addAll((Collection<? extends String>)newValue);
				return;
			case XmiPackage.PACKAGE_REFERENCE__VERSION:
				getVersion().clear();
				getVersion().addAll((Collection<? extends String>)newValue);
				return;
			case XmiPackage.PACKAGE_REFERENCE__HREF:
				setHref((String)newValue);
				return;
			case XmiPackage.PACKAGE_REFERENCE__IDREF:
				setIdref((String)newValue);
				return;
			case XmiPackage.PACKAGE_REFERENCE__LABEL:
				setLabel((String)newValue);
				return;
			case XmiPackage.PACKAGE_REFERENCE__NAME1:
				setName1((String)newValue);
				return;
			case XmiPackage.PACKAGE_REFERENCE__TYPE:
				setType((QName)newValue);
				return;
			case XmiPackage.PACKAGE_REFERENCE__UUID:
				setUuid((String)newValue);
				return;
			case XmiPackage.PACKAGE_REFERENCE__VERSION1:
				setVersion1((String)newValue);
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
			case XmiPackage.PACKAGE_REFERENCE__GROUP:
				getGroup().clear();
				return;
			case XmiPackage.PACKAGE_REFERENCE__NAME:
				getName().clear();
				return;
			case XmiPackage.PACKAGE_REFERENCE__VERSION:
				getVersion().clear();
				return;
			case XmiPackage.PACKAGE_REFERENCE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case XmiPackage.PACKAGE_REFERENCE__IDREF:
				setIdref(IDREF_EDEFAULT);
				return;
			case XmiPackage.PACKAGE_REFERENCE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case XmiPackage.PACKAGE_REFERENCE__NAME1:
				setName1(NAME1_EDEFAULT);
				return;
			case XmiPackage.PACKAGE_REFERENCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XmiPackage.PACKAGE_REFERENCE__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case XmiPackage.PACKAGE_REFERENCE__VERSION1:
				unsetVersion1();
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
			case XmiPackage.PACKAGE_REFERENCE__GROUP:
				return group != null && !group.isEmpty();
			case XmiPackage.PACKAGE_REFERENCE__NAME:
				return !getName().isEmpty();
			case XmiPackage.PACKAGE_REFERENCE__VERSION:
				return !getVersion().isEmpty();
			case XmiPackage.PACKAGE_REFERENCE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case XmiPackage.PACKAGE_REFERENCE__IDREF:
				return IDREF_EDEFAULT == null ? idref != null : !IDREF_EDEFAULT.equals(idref);
			case XmiPackage.PACKAGE_REFERENCE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case XmiPackage.PACKAGE_REFERENCE__NAME1:
				return NAME1_EDEFAULT == null ? name1 != null : !NAME1_EDEFAULT.equals(name1);
			case XmiPackage.PACKAGE_REFERENCE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XmiPackage.PACKAGE_REFERENCE__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case XmiPackage.PACKAGE_REFERENCE__VERSION1:
				return isSetVersion1();
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
		result.append(" (group: ");
		result.append(group);
		result.append(", href: ");
		result.append(href);
		result.append(", idref: ");
		result.append(idref);
		result.append(", label: ");
		result.append(label);
		result.append(", name1: ");
		result.append(name1);
		result.append(", type: ");
		result.append(type);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(", version1: ");
		if (version1ESet) result.append(version1); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PackageReferenceImpl
