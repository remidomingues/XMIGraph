/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.xmi.impl;

import java.util.Collection;
import java.util.List;

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

import org.omg.xmi.Difference;
import org.omg.xmi.TargetType;
import org.omg.xmi.XmiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Difference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.xmi.impl.DifferenceImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DifferenceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DifferenceImpl#getDifference <em>Difference</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DifferenceImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DifferenceImpl#getContainer1 <em>Container1</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DifferenceImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DifferenceImpl#getIdref <em>Idref</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DifferenceImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DifferenceImpl#getTarget1 <em>Target1</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DifferenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DifferenceImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DifferenceImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DifferenceImpl extends EObjectImpl implements Difference
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
	 * The default value of the '{@link #getContainer1() <em>Container1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer1()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> CONTAINER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainer1() <em>Container1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer1()
	 * @generated
	 * @ordered
	 */
	protected List<String> container1 = CONTAINER1_EDEFAULT;

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
	 * The default value of the '{@link #getTarget1() <em>Target1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget1()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> TARGET1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget1() <em>Target1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget1()
	 * @generated
	 * @ordered
	 */
	protected List<String> target1 = TARGET1_EDEFAULT;

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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "2.0";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DifferenceImpl()
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
		return XmiPackage.Literals.DIFFERENCE;
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
			group = new BasicFeatureMap(this, XmiPackage.DIFFERENCE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetType> getTarget()
	{
		return getGroup().list(XmiPackage.Literals.DIFFERENCE__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Difference> getDifference()
	{
		return getGroup().list(XmiPackage.Literals.DIFFERENCE__DIFFERENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Difference> getContainer()
	{
		return getGroup().list(XmiPackage.Literals.DIFFERENCE__CONTAINER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getContainer1()
	{
		return container1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer1(List<String> newContainer1)
	{
		List<String> oldContainer1 = container1;
		container1 = newContainer1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.DIFFERENCE__CONTAINER1, oldContainer1, container1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.DIFFERENCE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.DIFFERENCE__IDREF, oldIdref, idref));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.DIFFERENCE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getTarget1()
	{
		return target1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget1(List<String> newTarget1)
	{
		List<String> oldTarget1 = target1;
		target1 = newTarget1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.DIFFERENCE__TARGET1, oldTarget1, target1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.DIFFERENCE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.DIFFERENCE__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion()
	{
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion)
	{
		String oldVersion = version;
		version = newVersion;
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.DIFFERENCE__VERSION, oldVersion, version, !oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVersion()
	{
		String oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmiPackage.DIFFERENCE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVersion()
	{
		return versionESet;
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
			case XmiPackage.DIFFERENCE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XmiPackage.DIFFERENCE__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case XmiPackage.DIFFERENCE__DIFFERENCE:
				return ((InternalEList<?>)getDifference()).basicRemove(otherEnd, msgs);
			case XmiPackage.DIFFERENCE__CONTAINER:
				return ((InternalEList<?>)getContainer()).basicRemove(otherEnd, msgs);
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
			case XmiPackage.DIFFERENCE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XmiPackage.DIFFERENCE__TARGET:
				return getTarget();
			case XmiPackage.DIFFERENCE__DIFFERENCE:
				return getDifference();
			case XmiPackage.DIFFERENCE__CONTAINER:
				return getContainer();
			case XmiPackage.DIFFERENCE__CONTAINER1:
				return getContainer1();
			case XmiPackage.DIFFERENCE__HREF:
				return getHref();
			case XmiPackage.DIFFERENCE__IDREF:
				return getIdref();
			case XmiPackage.DIFFERENCE__LABEL:
				return getLabel();
			case XmiPackage.DIFFERENCE__TARGET1:
				return getTarget1();
			case XmiPackage.DIFFERENCE__TYPE:
				return getType();
			case XmiPackage.DIFFERENCE__UUID:
				return getUuid();
			case XmiPackage.DIFFERENCE__VERSION:
				return getVersion();
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
			case XmiPackage.DIFFERENCE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XmiPackage.DIFFERENCE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends TargetType>)newValue);
				return;
			case XmiPackage.DIFFERENCE__DIFFERENCE:
				getDifference().clear();
				getDifference().addAll((Collection<? extends Difference>)newValue);
				return;
			case XmiPackage.DIFFERENCE__CONTAINER:
				getContainer().clear();
				getContainer().addAll((Collection<? extends Difference>)newValue);
				return;
			case XmiPackage.DIFFERENCE__CONTAINER1:
				setContainer1((List<String>)newValue);
				return;
			case XmiPackage.DIFFERENCE__HREF:
				setHref((String)newValue);
				return;
			case XmiPackage.DIFFERENCE__IDREF:
				setIdref((String)newValue);
				return;
			case XmiPackage.DIFFERENCE__LABEL:
				setLabel((String)newValue);
				return;
			case XmiPackage.DIFFERENCE__TARGET1:
				setTarget1((List<String>)newValue);
				return;
			case XmiPackage.DIFFERENCE__TYPE:
				setType((QName)newValue);
				return;
			case XmiPackage.DIFFERENCE__UUID:
				setUuid((String)newValue);
				return;
			case XmiPackage.DIFFERENCE__VERSION:
				setVersion((String)newValue);
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
			case XmiPackage.DIFFERENCE__GROUP:
				getGroup().clear();
				return;
			case XmiPackage.DIFFERENCE__TARGET:
				getTarget().clear();
				return;
			case XmiPackage.DIFFERENCE__DIFFERENCE:
				getDifference().clear();
				return;
			case XmiPackage.DIFFERENCE__CONTAINER:
				getContainer().clear();
				return;
			case XmiPackage.DIFFERENCE__CONTAINER1:
				setContainer1(CONTAINER1_EDEFAULT);
				return;
			case XmiPackage.DIFFERENCE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case XmiPackage.DIFFERENCE__IDREF:
				setIdref(IDREF_EDEFAULT);
				return;
			case XmiPackage.DIFFERENCE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case XmiPackage.DIFFERENCE__TARGET1:
				setTarget1(TARGET1_EDEFAULT);
				return;
			case XmiPackage.DIFFERENCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XmiPackage.DIFFERENCE__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case XmiPackage.DIFFERENCE__VERSION:
				unsetVersion();
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
			case XmiPackage.DIFFERENCE__GROUP:
				return group != null && !group.isEmpty();
			case XmiPackage.DIFFERENCE__TARGET:
				return !getTarget().isEmpty();
			case XmiPackage.DIFFERENCE__DIFFERENCE:
				return !getDifference().isEmpty();
			case XmiPackage.DIFFERENCE__CONTAINER:
				return !getContainer().isEmpty();
			case XmiPackage.DIFFERENCE__CONTAINER1:
				return CONTAINER1_EDEFAULT == null ? container1 != null : !CONTAINER1_EDEFAULT.equals(container1);
			case XmiPackage.DIFFERENCE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case XmiPackage.DIFFERENCE__IDREF:
				return IDREF_EDEFAULT == null ? idref != null : !IDREF_EDEFAULT.equals(idref);
			case XmiPackage.DIFFERENCE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case XmiPackage.DIFFERENCE__TARGET1:
				return TARGET1_EDEFAULT == null ? target1 != null : !TARGET1_EDEFAULT.equals(target1);
			case XmiPackage.DIFFERENCE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XmiPackage.DIFFERENCE__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case XmiPackage.DIFFERENCE__VERSION:
				return isSetVersion();
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
		result.append(", container1: ");
		result.append(container1);
		result.append(", href: ");
		result.append(href);
		result.append(", idref: ");
		result.append(idref);
		result.append(", label: ");
		result.append(label);
		result.append(", target1: ");
		result.append(target1);
		result.append(", type: ");
		result.append(type);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DifferenceImpl
