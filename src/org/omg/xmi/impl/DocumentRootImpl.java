/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.xmi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.xmi.Add;
import org.omg.xmi.Delete;
import org.omg.xmi.Difference;
import org.omg.xmi.DocumentRoot;
import org.omg.xmi.Documentation;
import org.omg.xmi.Extension;
import org.omg.xmi.Import;
import org.omg.xmi.MetaModel;
import org.omg.xmi.Model;
import org.omg.xmi.PackageReference;
import org.omg.xmi.Replace;
import org.omg.xmi.XMI;
import org.omg.xmi.XmiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.xmi.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentRootImpl#getAdd <em>Add</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentRootImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentRootImpl#getDifference <em>Difference</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentRootImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentRootImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentRootImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentRootImpl#getMetaModel <em>Meta Model</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentRootImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentRootImpl#getPackageReference <em>Package Reference</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentRootImpl#getReplace <em>Replace</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentRootImpl#getXMI <em>XMI</em>}</li>
 *   <li>{@link org.omg.xmi.impl.DocumentRootImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot
{
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl()
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
		return XmiPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed()
	{
		if (mixed == null)
		{
			mixed = new BasicFeatureMap(this, XmiPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap()
	{
		if (xMLNSPrefixMap == null)
		{
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, XmiPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation()
	{
		if (xSISchemaLocation == null)
		{
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, XmiPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Add getAdd()
	{
		return (Add)getMixed().get(XmiPackage.Literals.DOCUMENT_ROOT__ADD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdd(Add newAdd, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmiPackage.Literals.DOCUMENT_ROOT__ADD, newAdd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdd(Add newAdd)
	{
		((FeatureMap.Internal)getMixed()).set(XmiPackage.Literals.DOCUMENT_ROOT__ADD, newAdd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete getDelete()
	{
		return (Delete)getMixed().get(XmiPackage.Literals.DOCUMENT_ROOT__DELETE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelete(Delete newDelete, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmiPackage.Literals.DOCUMENT_ROOT__DELETE, newDelete, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelete(Delete newDelete)
	{
		((FeatureMap.Internal)getMixed()).set(XmiPackage.Literals.DOCUMENT_ROOT__DELETE, newDelete);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Difference getDifference()
	{
		return (Difference)getMixed().get(XmiPackage.Literals.DOCUMENT_ROOT__DIFFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDifference(Difference newDifference, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmiPackage.Literals.DOCUMENT_ROOT__DIFFERENCE, newDifference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDifference(Difference newDifference)
	{
		((FeatureMap.Internal)getMixed()).set(XmiPackage.Literals.DOCUMENT_ROOT__DIFFERENCE, newDifference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation getDocumentation()
	{
		return (Documentation)getMixed().get(XmiPackage.Literals.DOCUMENT_ROOT__DOCUMENTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(Documentation newDocumentation, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmiPackage.Literals.DOCUMENT_ROOT__DOCUMENTATION, newDocumentation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(Documentation newDocumentation)
	{
		((FeatureMap.Internal)getMixed()).set(XmiPackage.Literals.DOCUMENT_ROOT__DOCUMENTATION, newDocumentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension getExtension()
	{
		return (Extension)getMixed().get(XmiPackage.Literals.DOCUMENT_ROOT__EXTENSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtension(Extension newExtension, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmiPackage.Literals.DOCUMENT_ROOT__EXTENSION, newExtension, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(Extension newExtension)
	{
		((FeatureMap.Internal)getMixed()).set(XmiPackage.Literals.DOCUMENT_ROOT__EXTENSION, newExtension);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import getImport()
	{
		return (Import)getMixed().get(XmiPackage.Literals.DOCUMENT_ROOT__IMPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImport(Import newImport, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmiPackage.Literals.DOCUMENT_ROOT__IMPORT, newImport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImport(Import newImport)
	{
		((FeatureMap.Internal)getMixed()).set(XmiPackage.Literals.DOCUMENT_ROOT__IMPORT, newImport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModel getMetaModel()
	{
		return (MetaModel)getMixed().get(XmiPackage.Literals.DOCUMENT_ROOT__META_MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaModel(MetaModel newMetaModel, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmiPackage.Literals.DOCUMENT_ROOT__META_MODEL, newMetaModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaModel(MetaModel newMetaModel)
	{
		((FeatureMap.Internal)getMixed()).set(XmiPackage.Literals.DOCUMENT_ROOT__META_MODEL, newMetaModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel()
	{
		return (Model)getMixed().get(XmiPackage.Literals.DOCUMENT_ROOT__MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(Model newModel, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmiPackage.Literals.DOCUMENT_ROOT__MODEL, newModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel)
	{
		((FeatureMap.Internal)getMixed()).set(XmiPackage.Literals.DOCUMENT_ROOT__MODEL, newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageReference getPackageReference()
	{
		return (PackageReference)getMixed().get(XmiPackage.Literals.DOCUMENT_ROOT__PACKAGE_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackageReference(PackageReference newPackageReference, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmiPackage.Literals.DOCUMENT_ROOT__PACKAGE_REFERENCE, newPackageReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageReference(PackageReference newPackageReference)
	{
		((FeatureMap.Internal)getMixed()).set(XmiPackage.Literals.DOCUMENT_ROOT__PACKAGE_REFERENCE, newPackageReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Replace getReplace()
	{
		return (Replace)getMixed().get(XmiPackage.Literals.DOCUMENT_ROOT__REPLACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplace(Replace newReplace, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmiPackage.Literals.DOCUMENT_ROOT__REPLACE, newReplace, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplace(Replace newReplace)
	{
		((FeatureMap.Internal)getMixed()).set(XmiPackage.Literals.DOCUMENT_ROOT__REPLACE, newReplace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMI getXMI()
	{
		return (XMI)getMixed().get(XmiPackage.Literals.DOCUMENT_ROOT__XMI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXMI(XMI newXMI, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmiPackage.Literals.DOCUMENT_ROOT__XMI, newXMI, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXMI(XMI newXMI)
	{
		((FeatureMap.Internal)getMixed()).set(XmiPackage.Literals.DOCUMENT_ROOT__XMI, newXMI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId)
	{
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.DOCUMENT_ROOT__ID, oldId, id));
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
			case XmiPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XmiPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case XmiPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case XmiPackage.DOCUMENT_ROOT__ADD:
				return basicSetAdd(null, msgs);
			case XmiPackage.DOCUMENT_ROOT__DELETE:
				return basicSetDelete(null, msgs);
			case XmiPackage.DOCUMENT_ROOT__DIFFERENCE:
				return basicSetDifference(null, msgs);
			case XmiPackage.DOCUMENT_ROOT__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case XmiPackage.DOCUMENT_ROOT__EXTENSION:
				return basicSetExtension(null, msgs);
			case XmiPackage.DOCUMENT_ROOT__IMPORT:
				return basicSetImport(null, msgs);
			case XmiPackage.DOCUMENT_ROOT__META_MODEL:
				return basicSetMetaModel(null, msgs);
			case XmiPackage.DOCUMENT_ROOT__MODEL:
				return basicSetModel(null, msgs);
			case XmiPackage.DOCUMENT_ROOT__PACKAGE_REFERENCE:
				return basicSetPackageReference(null, msgs);
			case XmiPackage.DOCUMENT_ROOT__REPLACE:
				return basicSetReplace(null, msgs);
			case XmiPackage.DOCUMENT_ROOT__XMI:
				return basicSetXMI(null, msgs);
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
			case XmiPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XmiPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case XmiPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case XmiPackage.DOCUMENT_ROOT__ADD:
				return getAdd();
			case XmiPackage.DOCUMENT_ROOT__DELETE:
				return getDelete();
			case XmiPackage.DOCUMENT_ROOT__DIFFERENCE:
				return getDifference();
			case XmiPackage.DOCUMENT_ROOT__DOCUMENTATION:
				return getDocumentation();
			case XmiPackage.DOCUMENT_ROOT__EXTENSION:
				return getExtension();
			case XmiPackage.DOCUMENT_ROOT__IMPORT:
				return getImport();
			case XmiPackage.DOCUMENT_ROOT__META_MODEL:
				return getMetaModel();
			case XmiPackage.DOCUMENT_ROOT__MODEL:
				return getModel();
			case XmiPackage.DOCUMENT_ROOT__PACKAGE_REFERENCE:
				return getPackageReference();
			case XmiPackage.DOCUMENT_ROOT__REPLACE:
				return getReplace();
			case XmiPackage.DOCUMENT_ROOT__XMI:
				return getXMI();
			case XmiPackage.DOCUMENT_ROOT__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case XmiPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XmiPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case XmiPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case XmiPackage.DOCUMENT_ROOT__ADD:
				setAdd((Add)newValue);
				return;
			case XmiPackage.DOCUMENT_ROOT__DELETE:
				setDelete((Delete)newValue);
				return;
			case XmiPackage.DOCUMENT_ROOT__DIFFERENCE:
				setDifference((Difference)newValue);
				return;
			case XmiPackage.DOCUMENT_ROOT__DOCUMENTATION:
				setDocumentation((Documentation)newValue);
				return;
			case XmiPackage.DOCUMENT_ROOT__EXTENSION:
				setExtension((Extension)newValue);
				return;
			case XmiPackage.DOCUMENT_ROOT__IMPORT:
				setImport((Import)newValue);
				return;
			case XmiPackage.DOCUMENT_ROOT__META_MODEL:
				setMetaModel((MetaModel)newValue);
				return;
			case XmiPackage.DOCUMENT_ROOT__MODEL:
				setModel((Model)newValue);
				return;
			case XmiPackage.DOCUMENT_ROOT__PACKAGE_REFERENCE:
				setPackageReference((PackageReference)newValue);
				return;
			case XmiPackage.DOCUMENT_ROOT__REPLACE:
				setReplace((Replace)newValue);
				return;
			case XmiPackage.DOCUMENT_ROOT__XMI:
				setXMI((XMI)newValue);
				return;
			case XmiPackage.DOCUMENT_ROOT__ID:
				setId((String)newValue);
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
			case XmiPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case XmiPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case XmiPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case XmiPackage.DOCUMENT_ROOT__ADD:
				setAdd((Add)null);
				return;
			case XmiPackage.DOCUMENT_ROOT__DELETE:
				setDelete((Delete)null);
				return;
			case XmiPackage.DOCUMENT_ROOT__DIFFERENCE:
				setDifference((Difference)null);
				return;
			case XmiPackage.DOCUMENT_ROOT__DOCUMENTATION:
				setDocumentation((Documentation)null);
				return;
			case XmiPackage.DOCUMENT_ROOT__EXTENSION:
				setExtension((Extension)null);
				return;
			case XmiPackage.DOCUMENT_ROOT__IMPORT:
				setImport((Import)null);
				return;
			case XmiPackage.DOCUMENT_ROOT__META_MODEL:
				setMetaModel((MetaModel)null);
				return;
			case XmiPackage.DOCUMENT_ROOT__MODEL:
				setModel((Model)null);
				return;
			case XmiPackage.DOCUMENT_ROOT__PACKAGE_REFERENCE:
				setPackageReference((PackageReference)null);
				return;
			case XmiPackage.DOCUMENT_ROOT__REPLACE:
				setReplace((Replace)null);
				return;
			case XmiPackage.DOCUMENT_ROOT__XMI:
				setXMI((XMI)null);
				return;
			case XmiPackage.DOCUMENT_ROOT__ID:
				setId(ID_EDEFAULT);
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
			case XmiPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XmiPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case XmiPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case XmiPackage.DOCUMENT_ROOT__ADD:
				return getAdd() != null;
			case XmiPackage.DOCUMENT_ROOT__DELETE:
				return getDelete() != null;
			case XmiPackage.DOCUMENT_ROOT__DIFFERENCE:
				return getDifference() != null;
			case XmiPackage.DOCUMENT_ROOT__DOCUMENTATION:
				return getDocumentation() != null;
			case XmiPackage.DOCUMENT_ROOT__EXTENSION:
				return getExtension() != null;
			case XmiPackage.DOCUMENT_ROOT__IMPORT:
				return getImport() != null;
			case XmiPackage.DOCUMENT_ROOT__META_MODEL:
				return getMetaModel() != null;
			case XmiPackage.DOCUMENT_ROOT__MODEL:
				return getModel() != null;
			case XmiPackage.DOCUMENT_ROOT__PACKAGE_REFERENCE:
				return getPackageReference() != null;
			case XmiPackage.DOCUMENT_ROOT__REPLACE:
				return getReplace() != null;
			case XmiPackage.DOCUMENT_ROOT__XMI:
				return getXMI() != null;
			case XmiPackage.DOCUMENT_ROOT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
