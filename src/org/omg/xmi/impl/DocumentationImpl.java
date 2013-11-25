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

import org.omg.xmi.Documentation;
import org.omg.xmi.XmiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.xmi.impl.DocumentationImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentationImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentationImpl#getExporter <em>Exporter</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentationImpl#getExporterVersion <em>Exporter Version</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentationImpl#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentationImpl#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentationImpl#getNotice <em>Notice</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentationImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentationImpl#getContact1 <em>Contact1</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentationImpl#getExporter1 <em>Exporter1</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentationImpl#getExporterVersion1 <em>Exporter Version1</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentationImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentationImpl#getIdref <em>Idref</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentationImpl#getLongDescription1 <em>Long Description1</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentationImpl#getNotice1 <em>Notice1</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentationImpl#getOwner1 <em>Owner1</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentationImpl#getShortDescription1 <em>Short Description1</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentationImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentationImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentationImpl extends EObjectImpl implements Documentation
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
	 * The default value of the '{@link #getContact1() <em>Contact1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact1()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContact1() <em>Contact1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact1()
	 * @generated
	 * @ordered
	 */
	protected String contact1 = CONTACT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getExporter1() <em>Exporter1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporter1()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPORTER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExporter1() <em>Exporter1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporter1()
	 * @generated
	 * @ordered
	 */
	protected String exporter1 = EXPORTER1_EDEFAULT;

	/**
	 * The default value of the '{@link #getExporterVersion1() <em>Exporter Version1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporterVersion1()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPORTER_VERSION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExporterVersion1() <em>Exporter Version1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporterVersion1()
	 * @generated
	 * @ordered
	 */
	protected String exporterVersion1 = EXPORTER_VERSION1_EDEFAULT;

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
	 * The default value of the '{@link #getLongDescription1() <em>Long Description1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongDescription1()
	 * @generated
	 * @ordered
	 */
	protected static final String LONG_DESCRIPTION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongDescription1() <em>Long Description1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongDescription1()
	 * @generated
	 * @ordered
	 */
	protected String longDescription1 = LONG_DESCRIPTION1_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotice1() <em>Notice1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotice1()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTICE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotice1() <em>Notice1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotice1()
	 * @generated
	 * @ordered
	 */
	protected String notice1 = NOTICE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwner1() <em>Owner1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner1()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwner1() <em>Owner1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner1()
	 * @generated
	 * @ordered
	 */
	protected String owner1 = OWNER1_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortDescription1() <em>Short Description1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortDescription1()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_DESCRIPTION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortDescription1() <em>Short Description1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortDescription1()
	 * @generated
	 * @ordered
	 */
	protected String shortDescription1 = SHORT_DESCRIPTION1_EDEFAULT;

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
	protected DocumentationImpl()
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
		return XmiPackage.Literals.DOCUMENTATION;
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
			group = new BasicFeatureMap(this, XmiPackage.DOCUMENTATION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getContact()
	{
		return getGroup().list(XmiPackage.Literals.DOCUMENTATION__CONTACT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExporter()
	{
		return getGroup().list(XmiPackage.Literals.DOCUMENTATION__EXPORTER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExporterVersion()
	{
		return getGroup().list(XmiPackage.Literals.DOCUMENTATION__EXPORTER_VERSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLongDescription()
	{
		return getGroup().list(XmiPackage.Literals.DOCUMENTATION__LONG_DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getShortDescription()
	{
		return getGroup().list(XmiPackage.Literals.DOCUMENTATION__SHORT_DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNotice()
	{
		return getGroup().list(XmiPackage.Literals.DOCUMENTATION__NOTICE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOwner()
	{
		return getGroup().list(XmiPackage.Literals.DOCUMENTATION__OWNER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContact1()
	{
		return contact1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContact1(String newContact1)
	{
		String oldContact1 = contact1;
		contact1 = newContact1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.DOCUMENTATION__CONTACT1, oldContact1, contact1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExporter1()
	{
		return exporter1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExporter1(String newExporter1)
	{
		String oldExporter1 = exporter1;
		exporter1 = newExporter1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.DOCUMENTATION__EXPORTER1, oldExporter1, exporter1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExporterVersion1()
	{
		return exporterVersion1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExporterVersion1(String newExporterVersion1)
	{
		String oldExporterVersion1 = exporterVersion1;
		exporterVersion1 = newExporterVersion1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.DOCUMENTATION__EXPORTER_VERSION1, oldExporterVersion1, exporterVersion1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.DOCUMENTATION__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.DOCUMENTATION__IDREF, oldIdref, idref));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.DOCUMENTATION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLongDescription1()
	{
		return longDescription1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongDescription1(String newLongDescription1)
	{
		String oldLongDescription1 = longDescription1;
		longDescription1 = newLongDescription1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.DOCUMENTATION__LONG_DESCRIPTION1, oldLongDescription1, longDescription1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotice1()
	{
		return notice1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotice1(String newNotice1)
	{
		String oldNotice1 = notice1;
		notice1 = newNotice1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.DOCUMENTATION__NOTICE1, oldNotice1, notice1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwner1()
	{
		return owner1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner1(String newOwner1)
	{
		String oldOwner1 = owner1;
		owner1 = newOwner1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.DOCUMENTATION__OWNER1, oldOwner1, owner1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortDescription1()
	{
		return shortDescription1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortDescription1(String newShortDescription1)
	{
		String oldShortDescription1 = shortDescription1;
		shortDescription1 = newShortDescription1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.DOCUMENTATION__SHORT_DESCRIPTION1, oldShortDescription1, shortDescription1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.DOCUMENTATION__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.DOCUMENTATION__UUID, oldUuid, uuid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.DOCUMENTATION__VERSION, oldVersion, version, !oldVersionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmiPackage.DOCUMENTATION__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
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
			case XmiPackage.DOCUMENTATION__GROUP:
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
			case XmiPackage.DOCUMENTATION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XmiPackage.DOCUMENTATION__CONTACT:
				return getContact();
			case XmiPackage.DOCUMENTATION__EXPORTER:
				return getExporter();
			case XmiPackage.DOCUMENTATION__EXPORTER_VERSION:
				return getExporterVersion();
			case XmiPackage.DOCUMENTATION__LONG_DESCRIPTION:
				return getLongDescription();
			case XmiPackage.DOCUMENTATION__SHORT_DESCRIPTION:
				return getShortDescription();
			case XmiPackage.DOCUMENTATION__NOTICE:
				return getNotice();
			case XmiPackage.DOCUMENTATION__OWNER:
				return getOwner();
			case XmiPackage.DOCUMENTATION__CONTACT1:
				return getContact1();
			case XmiPackage.DOCUMENTATION__EXPORTER1:
				return getExporter1();
			case XmiPackage.DOCUMENTATION__EXPORTER_VERSION1:
				return getExporterVersion1();
			case XmiPackage.DOCUMENTATION__HREF:
				return getHref();
			case XmiPackage.DOCUMENTATION__IDREF:
				return getIdref();
			case XmiPackage.DOCUMENTATION__LABEL:
				return getLabel();
			case XmiPackage.DOCUMENTATION__LONG_DESCRIPTION1:
				return getLongDescription1();
			case XmiPackage.DOCUMENTATION__NOTICE1:
				return getNotice1();
			case XmiPackage.DOCUMENTATION__OWNER1:
				return getOwner1();
			case XmiPackage.DOCUMENTATION__SHORT_DESCRIPTION1:
				return getShortDescription1();
			case XmiPackage.DOCUMENTATION__TYPE:
				return getType();
			case XmiPackage.DOCUMENTATION__UUID:
				return getUuid();
			case XmiPackage.DOCUMENTATION__VERSION:
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
			case XmiPackage.DOCUMENTATION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XmiPackage.DOCUMENTATION__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends String>)newValue);
				return;
			case XmiPackage.DOCUMENTATION__EXPORTER:
				getExporter().clear();
				getExporter().addAll((Collection<? extends String>)newValue);
				return;
			case XmiPackage.DOCUMENTATION__EXPORTER_VERSION:
				getExporterVersion().clear();
				getExporterVersion().addAll((Collection<? extends String>)newValue);
				return;
			case XmiPackage.DOCUMENTATION__LONG_DESCRIPTION:
				getLongDescription().clear();
				getLongDescription().addAll((Collection<? extends String>)newValue);
				return;
			case XmiPackage.DOCUMENTATION__SHORT_DESCRIPTION:
				getShortDescription().clear();
				getShortDescription().addAll((Collection<? extends String>)newValue);
				return;
			case XmiPackage.DOCUMENTATION__NOTICE:
				getNotice().clear();
				getNotice().addAll((Collection<? extends String>)newValue);
				return;
			case XmiPackage.DOCUMENTATION__OWNER:
				getOwner().clear();
				getOwner().addAll((Collection<? extends String>)newValue);
				return;
			case XmiPackage.DOCUMENTATION__CONTACT1:
				setContact1((String)newValue);
				return;
			case XmiPackage.DOCUMENTATION__EXPORTER1:
				setExporter1((String)newValue);
				return;
			case XmiPackage.DOCUMENTATION__EXPORTER_VERSION1:
				setExporterVersion1((String)newValue);
				return;
			case XmiPackage.DOCUMENTATION__HREF:
				setHref((String)newValue);
				return;
			case XmiPackage.DOCUMENTATION__IDREF:
				setIdref((String)newValue);
				return;
			case XmiPackage.DOCUMENTATION__LABEL:
				setLabel((String)newValue);
				return;
			case XmiPackage.DOCUMENTATION__LONG_DESCRIPTION1:
				setLongDescription1((String)newValue);
				return;
			case XmiPackage.DOCUMENTATION__NOTICE1:
				setNotice1((String)newValue);
				return;
			case XmiPackage.DOCUMENTATION__OWNER1:
				setOwner1((String)newValue);
				return;
			case XmiPackage.DOCUMENTATION__SHORT_DESCRIPTION1:
				setShortDescription1((String)newValue);
				return;
			case XmiPackage.DOCUMENTATION__TYPE:
				setType((QName)newValue);
				return;
			case XmiPackage.DOCUMENTATION__UUID:
				setUuid((String)newValue);
				return;
			case XmiPackage.DOCUMENTATION__VERSION:
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
			case XmiPackage.DOCUMENTATION__GROUP:
				getGroup().clear();
				return;
			case XmiPackage.DOCUMENTATION__CONTACT:
				getContact().clear();
				return;
			case XmiPackage.DOCUMENTATION__EXPORTER:
				getExporter().clear();
				return;
			case XmiPackage.DOCUMENTATION__EXPORTER_VERSION:
				getExporterVersion().clear();
				return;
			case XmiPackage.DOCUMENTATION__LONG_DESCRIPTION:
				getLongDescription().clear();
				return;
			case XmiPackage.DOCUMENTATION__SHORT_DESCRIPTION:
				getShortDescription().clear();
				return;
			case XmiPackage.DOCUMENTATION__NOTICE:
				getNotice().clear();
				return;
			case XmiPackage.DOCUMENTATION__OWNER:
				getOwner().clear();
				return;
			case XmiPackage.DOCUMENTATION__CONTACT1:
				setContact1(CONTACT1_EDEFAULT);
				return;
			case XmiPackage.DOCUMENTATION__EXPORTER1:
				setExporter1(EXPORTER1_EDEFAULT);
				return;
			case XmiPackage.DOCUMENTATION__EXPORTER_VERSION1:
				setExporterVersion1(EXPORTER_VERSION1_EDEFAULT);
				return;
			case XmiPackage.DOCUMENTATION__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case XmiPackage.DOCUMENTATION__IDREF:
				setIdref(IDREF_EDEFAULT);
				return;
			case XmiPackage.DOCUMENTATION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case XmiPackage.DOCUMENTATION__LONG_DESCRIPTION1:
				setLongDescription1(LONG_DESCRIPTION1_EDEFAULT);
				return;
			case XmiPackage.DOCUMENTATION__NOTICE1:
				setNotice1(NOTICE1_EDEFAULT);
				return;
			case XmiPackage.DOCUMENTATION__OWNER1:
				setOwner1(OWNER1_EDEFAULT);
				return;
			case XmiPackage.DOCUMENTATION__SHORT_DESCRIPTION1:
				setShortDescription1(SHORT_DESCRIPTION1_EDEFAULT);
				return;
			case XmiPackage.DOCUMENTATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XmiPackage.DOCUMENTATION__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case XmiPackage.DOCUMENTATION__VERSION:
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
			case XmiPackage.DOCUMENTATION__GROUP:
				return group != null && !group.isEmpty();
			case XmiPackage.DOCUMENTATION__CONTACT:
				return !getContact().isEmpty();
			case XmiPackage.DOCUMENTATION__EXPORTER:
				return !getExporter().isEmpty();
			case XmiPackage.DOCUMENTATION__EXPORTER_VERSION:
				return !getExporterVersion().isEmpty();
			case XmiPackage.DOCUMENTATION__LONG_DESCRIPTION:
				return !getLongDescription().isEmpty();
			case XmiPackage.DOCUMENTATION__SHORT_DESCRIPTION:
				return !getShortDescription().isEmpty();
			case XmiPackage.DOCUMENTATION__NOTICE:
				return !getNotice().isEmpty();
			case XmiPackage.DOCUMENTATION__OWNER:
				return !getOwner().isEmpty();
			case XmiPackage.DOCUMENTATION__CONTACT1:
				return CONTACT1_EDEFAULT == null ? contact1 != null : !CONTACT1_EDEFAULT.equals(contact1);
			case XmiPackage.DOCUMENTATION__EXPORTER1:
				return EXPORTER1_EDEFAULT == null ? exporter1 != null : !EXPORTER1_EDEFAULT.equals(exporter1);
			case XmiPackage.DOCUMENTATION__EXPORTER_VERSION1:
				return EXPORTER_VERSION1_EDEFAULT == null ? exporterVersion1 != null : !EXPORTER_VERSION1_EDEFAULT.equals(exporterVersion1);
			case XmiPackage.DOCUMENTATION__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case XmiPackage.DOCUMENTATION__IDREF:
				return IDREF_EDEFAULT == null ? idref != null : !IDREF_EDEFAULT.equals(idref);
			case XmiPackage.DOCUMENTATION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case XmiPackage.DOCUMENTATION__LONG_DESCRIPTION1:
				return LONG_DESCRIPTION1_EDEFAULT == null ? longDescription1 != null : !LONG_DESCRIPTION1_EDEFAULT.equals(longDescription1);
			case XmiPackage.DOCUMENTATION__NOTICE1:
				return NOTICE1_EDEFAULT == null ? notice1 != null : !NOTICE1_EDEFAULT.equals(notice1);
			case XmiPackage.DOCUMENTATION__OWNER1:
				return OWNER1_EDEFAULT == null ? owner1 != null : !OWNER1_EDEFAULT.equals(owner1);
			case XmiPackage.DOCUMENTATION__SHORT_DESCRIPTION1:
				return SHORT_DESCRIPTION1_EDEFAULT == null ? shortDescription1 != null : !SHORT_DESCRIPTION1_EDEFAULT.equals(shortDescription1);
			case XmiPackage.DOCUMENTATION__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XmiPackage.DOCUMENTATION__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case XmiPackage.DOCUMENTATION__VERSION:
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
		result.append(", contact1: ");
		result.append(contact1);
		result.append(", exporter1: ");
		result.append(exporter1);
		result.append(", exporterVersion1: ");
		result.append(exporterVersion1);
		result.append(", href: ");
		result.append(href);
		result.append(", idref: ");
		result.append(idref);
		result.append(", label: ");
		result.append(label);
		result.append(", longDescription1: ");
		result.append(longDescription1);
		result.append(", notice1: ");
		result.append(notice1);
		result.append(", owner1: ");
		result.append(owner1);
		result.append(", shortDescription1: ");
		result.append(shortDescription1);
		result.append(", type: ");
		result.append(type);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DocumentationImpl
