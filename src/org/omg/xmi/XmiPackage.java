/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.xmi;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.omg.xmi.XmiFactory
 * @model kind="package"
 * @generated
 */
public interface XmiPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xmi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schema.omg.org/spec/XMI/2.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xmi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmiPackage eINSTANCE = org.omg.xmi.impl.XmiPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.omg.xmi.impl.DifferenceImpl <em>Difference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.xmi.impl.DifferenceImpl
	 * @see org.omg.xmi.impl.XmiPackageImpl#getDifference()
	 * @generated
	 */
	int DIFFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Difference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE__DIFFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE__CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Container1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE__CONTAINER1 = 4;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE__HREF = 5;

	/**
	 * The feature id for the '<em><b>Idref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE__IDREF = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE__LABEL = 7;

	/**
	 * The feature id for the '<em><b>Target1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE__TARGET1 = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE__UUID = 10;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE__VERSION = 11;

	/**
	 * The number of structural features of the '<em>Difference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.omg.xmi.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.xmi.impl.AddImpl
	 * @see org.omg.xmi.impl.XmiPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__GROUP = DIFFERENCE__GROUP;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__TARGET = DIFFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Difference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__DIFFERENCE = DIFFERENCE__DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__CONTAINER = DIFFERENCE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Container1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__CONTAINER1 = DIFFERENCE__CONTAINER1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__HREF = DIFFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Idref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__IDREF = DIFFERENCE__IDREF;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__LABEL = DIFFERENCE__LABEL;

	/**
	 * The feature id for the '<em><b>Target1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__TARGET1 = DIFFERENCE__TARGET1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__TYPE = DIFFERENCE__TYPE;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__UUID = DIFFERENCE__UUID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__VERSION = DIFFERENCE__VERSION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__ADDITION = DIFFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__POSITION = DIFFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = DIFFERENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.omg.xmi.impl.AnyImpl <em>Any</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.xmi.impl.AnyImpl
	 * @see org.omg.xmi.impl.XmiPackageImpl#getAny()
	 * @generated
	 */
	int ANY = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__ANY = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.omg.xmi.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.xmi.impl.DeleteImpl
	 * @see org.omg.xmi.impl.XmiPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__GROUP = DIFFERENCE__GROUP;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__TARGET = DIFFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Difference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__DIFFERENCE = DIFFERENCE__DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__CONTAINER = DIFFERENCE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Container1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__CONTAINER1 = DIFFERENCE__CONTAINER1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__HREF = DIFFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Idref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__IDREF = DIFFERENCE__IDREF;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__LABEL = DIFFERENCE__LABEL;

	/**
	 * The feature id for the '<em><b>Target1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__TARGET1 = DIFFERENCE__TARGET1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__TYPE = DIFFERENCE__TYPE;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__UUID = DIFFERENCE__UUID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__VERSION = DIFFERENCE__VERSION;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = DIFFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.xmi.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.xmi.impl.DocumentationImpl
	 * @see org.omg.xmi.impl.XmiPackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__CONTACT = 1;

	/**
	 * The feature id for the '<em><b>Exporter</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__EXPORTER = 2;

	/**
	 * The feature id for the '<em><b>Exporter Version</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__EXPORTER_VERSION = 3;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__LONG_DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__SHORT_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Notice</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__NOTICE = 6;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__OWNER = 7;

	/**
	 * The feature id for the '<em><b>Contact1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__CONTACT1 = 8;

	/**
	 * The feature id for the '<em><b>Exporter1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__EXPORTER1 = 9;

	/**
	 * The feature id for the '<em><b>Exporter Version1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__EXPORTER_VERSION1 = 10;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__HREF = 11;

	/**
	 * The feature id for the '<em><b>Idref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__IDREF = 12;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__LABEL = 13;

	/**
	 * The feature id for the '<em><b>Long Description1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__LONG_DESCRIPTION1 = 14;

	/**
	 * The feature id for the '<em><b>Notice1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__NOTICE1 = 15;

	/**
	 * The feature id for the '<em><b>Owner1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__OWNER1 = 16;

	/**
	 * The feature id for the '<em><b>Short Description1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__SHORT_DESCRIPTION1 = 17;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__TYPE = 18;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__UUID = 19;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__VERSION = 20;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = 21;

	/**
	 * The meta object id for the '{@link org.omg.xmi.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.xmi.impl.DocumentRootImpl
	 * @see org.omg.xmi.impl.XmiPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 5;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Add</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADD = 3;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DELETE = 4;

	/**
	 * The feature id for the '<em><b>Difference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIFFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENTATION = 6;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTENSION = 7;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMPORT = 8;

	/**
	 * The feature id for the '<em><b>Meta Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__META_MODEL = 9;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODEL = 10;

	/**
	 * The feature id for the '<em><b>Package Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PACKAGE_REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Replace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REPLACE = 12;

	/**
	 * The feature id for the '<em><b>XMI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMI = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ID = 14;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.omg.xmi.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.xmi.impl.ExtensionImpl
	 * @see org.omg.xmi.impl.XmiPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 6;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ANY = 1;

	/**
	 * The feature id for the '<em><b>Extender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__EXTENDER = 2;

	/**
	 * The feature id for the '<em><b>Extender ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__EXTENDER_ID = 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__HREF = 4;

	/**
	 * The feature id for the '<em><b>Idref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__IDREF = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__LABEL = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__TYPE = 7;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__UUID = 8;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VERSION = 9;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.omg.xmi.impl.PackageReferenceImpl <em>Package Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.xmi.impl.PackageReferenceImpl
	 * @see org.omg.xmi.impl.XmiPackageImpl#getPackageReference()
	 * @generated
	 */
	int PACKAGE_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_REFERENCE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_REFERENCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_REFERENCE__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_REFERENCE__HREF = 3;

	/**
	 * The feature id for the '<em><b>Idref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_REFERENCE__IDREF = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_REFERENCE__LABEL = 5;

	/**
	 * The feature id for the '<em><b>Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_REFERENCE__NAME1 = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_REFERENCE__TYPE = 7;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_REFERENCE__UUID = 8;

	/**
	 * The feature id for the '<em><b>Version1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_REFERENCE__VERSION1 = 9;

	/**
	 * The number of structural features of the '<em>Package Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_REFERENCE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.omg.xmi.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.xmi.impl.ImportImpl
	 * @see org.omg.xmi.impl.XmiPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 7;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__GROUP = PACKAGE_REFERENCE__GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__NAME = PACKAGE_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__VERSION = PACKAGE_REFERENCE__VERSION;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__HREF = PACKAGE_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Idref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IDREF = PACKAGE_REFERENCE__IDREF;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__LABEL = PACKAGE_REFERENCE__LABEL;

	/**
	 * The feature id for the '<em><b>Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__NAME1 = PACKAGE_REFERENCE__NAME1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__TYPE = PACKAGE_REFERENCE__TYPE;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__UUID = PACKAGE_REFERENCE__UUID;

	/**
	 * The feature id for the '<em><b>Version1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__VERSION1 = PACKAGE_REFERENCE__VERSION1;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = PACKAGE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.xmi.impl.MetaModelImpl <em>Meta Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.xmi.impl.MetaModelImpl
	 * @see org.omg.xmi.impl.XmiPackageImpl#getMetaModel()
	 * @generated
	 */
	int META_MODEL = 8;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__GROUP = PACKAGE_REFERENCE__GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__NAME = PACKAGE_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__VERSION = PACKAGE_REFERENCE__VERSION;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__HREF = PACKAGE_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Idref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__IDREF = PACKAGE_REFERENCE__IDREF;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__LABEL = PACKAGE_REFERENCE__LABEL;

	/**
	 * The feature id for the '<em><b>Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__NAME1 = PACKAGE_REFERENCE__NAME1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__TYPE = PACKAGE_REFERENCE__TYPE;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__UUID = PACKAGE_REFERENCE__UUID;

	/**
	 * The feature id for the '<em><b>Version1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__VERSION1 = PACKAGE_REFERENCE__VERSION1;

	/**
	 * The number of structural features of the '<em>Meta Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_FEATURE_COUNT = PACKAGE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.xmi.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.xmi.impl.ModelImpl
	 * @see org.omg.xmi.impl.XmiPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 9;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__GROUP = PACKAGE_REFERENCE__GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = PACKAGE_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__VERSION = PACKAGE_REFERENCE__VERSION;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__HREF = PACKAGE_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Idref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IDREF = PACKAGE_REFERENCE__IDREF;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LABEL = PACKAGE_REFERENCE__LABEL;

	/**
	 * The feature id for the '<em><b>Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME1 = PACKAGE_REFERENCE__NAME1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TYPE = PACKAGE_REFERENCE__TYPE;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__UUID = PACKAGE_REFERENCE__UUID;

	/**
	 * The feature id for the '<em><b>Version1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__VERSION1 = PACKAGE_REFERENCE__VERSION1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = PACKAGE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.xmi.impl.ReplaceImpl <em>Replace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.xmi.impl.ReplaceImpl
	 * @see org.omg.xmi.impl.XmiPackageImpl#getReplace()
	 * @generated
	 */
	int REPLACE = 11;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__GROUP = DIFFERENCE__GROUP;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__TARGET = DIFFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Difference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__DIFFERENCE = DIFFERENCE__DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__CONTAINER = DIFFERENCE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Container1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__CONTAINER1 = DIFFERENCE__CONTAINER1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__HREF = DIFFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Idref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__IDREF = DIFFERENCE__IDREF;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__LABEL = DIFFERENCE__LABEL;

	/**
	 * The feature id for the '<em><b>Target1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__TARGET1 = DIFFERENCE__TARGET1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__TYPE = DIFFERENCE__TYPE;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__UUID = DIFFERENCE__UUID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__VERSION = DIFFERENCE__VERSION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__POSITION = DIFFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Replacement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__REPLACEMENT = DIFFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Replace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_FEATURE_COUNT = DIFFERENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.omg.xmi.impl.TargetTypeImpl <em>Target Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.xmi.impl.TargetTypeImpl
	 * @see org.omg.xmi.impl.XmiPackageImpl#getTargetType()
	 * @generated
	 */
	int TARGET_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.omg.xmi.impl.XMIImpl <em>XMI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.xmi.impl.XMIImpl
	 * @see org.omg.xmi.impl.XmiPackageImpl#getXMI()
	 * @generated
	 */
	int XMI = 13;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMI__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMI__ANY = 1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMI__HREF = 2;

	/**
	 * The feature id for the '<em><b>Idref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMI__IDREF = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMI__LABEL = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMI__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMI__UUID = 6;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMI__VERSION = 7;

	/**
	 * The number of structural features of the '<em>XMI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMI_FEATURE_COUNT = 8;


	/**
	 * Returns the meta object for class '{@link org.omg.xmi.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see org.omg.xmi.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Add#getAddition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addition</em>'.
	 * @see org.omg.xmi.Add#getAddition()
	 * @see #getAdd()
	 * @generated
	 */
	EAttribute getAdd_Addition();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Add#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.omg.xmi.Add#getPosition()
	 * @see #getAdd()
	 * @generated
	 */
	EAttribute getAdd_Position();

	/**
	 * Returns the meta object for class '{@link org.omg.xmi.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any</em>'.
	 * @see org.omg.xmi.Any
	 * @generated
	 */
	EClass getAny();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.xmi.Any#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.omg.xmi.Any#getGroup()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.xmi.Any#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.omg.xmi.Any#getAny()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.xmi.Any#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.omg.xmi.Any#getAnyAttribute()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.omg.xmi.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see org.omg.xmi.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for class '{@link org.omg.xmi.Difference <em>Difference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Difference</em>'.
	 * @see org.omg.xmi.Difference
	 * @generated
	 */
	EClass getDifference();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.xmi.Difference#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.omg.xmi.Difference#getGroup()
	 * @see #getDifference()
	 * @generated
	 */
	EAttribute getDifference_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.xmi.Difference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see org.omg.xmi.Difference#getTarget()
	 * @see #getDifference()
	 * @generated
	 */
	EReference getDifference_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.xmi.Difference#getDifference <em>Difference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Difference</em>'.
	 * @see org.omg.xmi.Difference#getDifference()
	 * @see #getDifference()
	 * @generated
	 */
	EReference getDifference_Difference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.xmi.Difference#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container</em>'.
	 * @see org.omg.xmi.Difference#getContainer()
	 * @see #getDifference()
	 * @generated
	 */
	EReference getDifference_Container();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Difference#getContainer1 <em>Container1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container1</em>'.
	 * @see org.omg.xmi.Difference#getContainer1()
	 * @see #getDifference()
	 * @generated
	 */
	EAttribute getDifference_Container1();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Difference#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.omg.xmi.Difference#getHref()
	 * @see #getDifference()
	 * @generated
	 */
	EAttribute getDifference_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Difference#getIdref <em>Idref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idref</em>'.
	 * @see org.omg.xmi.Difference#getIdref()
	 * @see #getDifference()
	 * @generated
	 */
	EAttribute getDifference_Idref();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Difference#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.omg.xmi.Difference#getLabel()
	 * @see #getDifference()
	 * @generated
	 */
	EAttribute getDifference_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Difference#getTarget1 <em>Target1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target1</em>'.
	 * @see org.omg.xmi.Difference#getTarget1()
	 * @see #getDifference()
	 * @generated
	 */
	EAttribute getDifference_Target1();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Difference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.omg.xmi.Difference#getType()
	 * @see #getDifference()
	 * @generated
	 */
	EAttribute getDifference_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Difference#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see org.omg.xmi.Difference#getUuid()
	 * @see #getDifference()
	 * @generated
	 */
	EAttribute getDifference_Uuid();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Difference#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.omg.xmi.Difference#getVersion()
	 * @see #getDifference()
	 * @generated
	 */
	EAttribute getDifference_Version();

	/**
	 * Returns the meta object for class '{@link org.omg.xmi.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see org.omg.xmi.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.xmi.Documentation#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.omg.xmi.Documentation#getGroup()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.xmi.Documentation#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Contact</em>'.
	 * @see org.omg.xmi.Documentation#getContact()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Contact();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.xmi.Documentation#getExporter <em>Exporter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Exporter</em>'.
	 * @see org.omg.xmi.Documentation#getExporter()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Exporter();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.xmi.Documentation#getExporterVersion <em>Exporter Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Exporter Version</em>'.
	 * @see org.omg.xmi.Documentation#getExporterVersion()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_ExporterVersion();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.xmi.Documentation#getLongDescription <em>Long Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Long Description</em>'.
	 * @see org.omg.xmi.Documentation#getLongDescription()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_LongDescription();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.xmi.Documentation#getShortDescription <em>Short Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Short Description</em>'.
	 * @see org.omg.xmi.Documentation#getShortDescription()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_ShortDescription();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.xmi.Documentation#getNotice <em>Notice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Notice</em>'.
	 * @see org.omg.xmi.Documentation#getNotice()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Notice();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.xmi.Documentation#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Owner</em>'.
	 * @see org.omg.xmi.Documentation#getOwner()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Owner();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Documentation#getContact1 <em>Contact1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact1</em>'.
	 * @see org.omg.xmi.Documentation#getContact1()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Contact1();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Documentation#getExporter1 <em>Exporter1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exporter1</em>'.
	 * @see org.omg.xmi.Documentation#getExporter1()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Exporter1();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Documentation#getExporterVersion1 <em>Exporter Version1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exporter Version1</em>'.
	 * @see org.omg.xmi.Documentation#getExporterVersion1()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_ExporterVersion1();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Documentation#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.omg.xmi.Documentation#getHref()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Documentation#getIdref <em>Idref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idref</em>'.
	 * @see org.omg.xmi.Documentation#getIdref()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Idref();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Documentation#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.omg.xmi.Documentation#getLabel()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Documentation#getLongDescription1 <em>Long Description1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Description1</em>'.
	 * @see org.omg.xmi.Documentation#getLongDescription1()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_LongDescription1();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Documentation#getNotice1 <em>Notice1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notice1</em>'.
	 * @see org.omg.xmi.Documentation#getNotice1()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Notice1();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Documentation#getOwner1 <em>Owner1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner1</em>'.
	 * @see org.omg.xmi.Documentation#getOwner1()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Owner1();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Documentation#getShortDescription1 <em>Short Description1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Description1</em>'.
	 * @see org.omg.xmi.Documentation#getShortDescription1()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_ShortDescription1();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Documentation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.omg.xmi.Documentation#getType()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Documentation#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see org.omg.xmi.Documentation#getUuid()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Uuid();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Documentation#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.omg.xmi.Documentation#getVersion()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Version();

	/**
	 * Returns the meta object for class '{@link org.omg.xmi.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.omg.xmi.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.xmi.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.omg.xmi.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.omg.xmi.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.omg.xmi.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.omg.xmi.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.omg.xmi.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.xmi.DocumentRoot#getAdd <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add</em>'.
	 * @see org.omg.xmi.DocumentRoot#getAdd()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Add();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.xmi.DocumentRoot#getDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delete</em>'.
	 * @see org.omg.xmi.DocumentRoot#getDelete()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Delete();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.xmi.DocumentRoot#getDifference <em>Difference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Difference</em>'.
	 * @see org.omg.xmi.DocumentRoot#getDifference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Difference();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.xmi.DocumentRoot#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.omg.xmi.DocumentRoot#getDocumentation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.xmi.DocumentRoot#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension</em>'.
	 * @see org.omg.xmi.DocumentRoot#getExtension()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Extension();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.xmi.DocumentRoot#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Import</em>'.
	 * @see org.omg.xmi.DocumentRoot#getImport()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Import();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.xmi.DocumentRoot#getMetaModel <em>Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta Model</em>'.
	 * @see org.omg.xmi.DocumentRoot#getMetaModel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MetaModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.xmi.DocumentRoot#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see org.omg.xmi.DocumentRoot#getModel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Model();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.xmi.DocumentRoot#getPackageReference <em>Package Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package Reference</em>'.
	 * @see org.omg.xmi.DocumentRoot#getPackageReference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PackageReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.xmi.DocumentRoot#getReplace <em>Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Replace</em>'.
	 * @see org.omg.xmi.DocumentRoot#getReplace()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Replace();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.xmi.DocumentRoot#getXMI <em>XMI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XMI</em>'.
	 * @see org.omg.xmi.DocumentRoot#getXMI()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMI();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.DocumentRoot#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.omg.xmi.DocumentRoot#getId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Id();

	/**
	 * Returns the meta object for class '{@link org.omg.xmi.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see org.omg.xmi.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.xmi.Extension#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.omg.xmi.Extension#getGroup()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.xmi.Extension#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.omg.xmi.Extension#getAny()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Extension#getExtender <em>Extender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extender</em>'.
	 * @see org.omg.xmi.Extension#getExtender()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Extender();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Extension#getExtenderID <em>Extender ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extender ID</em>'.
	 * @see org.omg.xmi.Extension#getExtenderID()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_ExtenderID();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Extension#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.omg.xmi.Extension#getHref()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Extension#getIdref <em>Idref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idref</em>'.
	 * @see org.omg.xmi.Extension#getIdref()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Idref();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Extension#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.omg.xmi.Extension#getLabel()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Extension#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.omg.xmi.Extension#getType()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Extension#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see org.omg.xmi.Extension#getUuid()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Uuid();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Extension#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.omg.xmi.Extension#getVersion()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Version();

	/**
	 * Returns the meta object for class '{@link org.omg.xmi.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.omg.xmi.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for class '{@link org.omg.xmi.MetaModel <em>Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Model</em>'.
	 * @see org.omg.xmi.MetaModel
	 * @generated
	 */
	EClass getMetaModel();

	/**
	 * Returns the meta object for class '{@link org.omg.xmi.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.omg.xmi.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for class '{@link org.omg.xmi.PackageReference <em>Package Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Reference</em>'.
	 * @see org.omg.xmi.PackageReference
	 * @generated
	 */
	EClass getPackageReference();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.xmi.PackageReference#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.omg.xmi.PackageReference#getGroup()
	 * @see #getPackageReference()
	 * @generated
	 */
	EAttribute getPackageReference_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.xmi.PackageReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Name</em>'.
	 * @see org.omg.xmi.PackageReference#getName()
	 * @see #getPackageReference()
	 * @generated
	 */
	EAttribute getPackageReference_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.xmi.PackageReference#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Version</em>'.
	 * @see org.omg.xmi.PackageReference#getVersion()
	 * @see #getPackageReference()
	 * @generated
	 */
	EAttribute getPackageReference_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.PackageReference#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.omg.xmi.PackageReference#getHref()
	 * @see #getPackageReference()
	 * @generated
	 */
	EAttribute getPackageReference_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.PackageReference#getIdref <em>Idref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idref</em>'.
	 * @see org.omg.xmi.PackageReference#getIdref()
	 * @see #getPackageReference()
	 * @generated
	 */
	EAttribute getPackageReference_Idref();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.PackageReference#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.omg.xmi.PackageReference#getLabel()
	 * @see #getPackageReference()
	 * @generated
	 */
	EAttribute getPackageReference_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.PackageReference#getName1 <em>Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name1</em>'.
	 * @see org.omg.xmi.PackageReference#getName1()
	 * @see #getPackageReference()
	 * @generated
	 */
	EAttribute getPackageReference_Name1();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.PackageReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.omg.xmi.PackageReference#getType()
	 * @see #getPackageReference()
	 * @generated
	 */
	EAttribute getPackageReference_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.PackageReference#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see org.omg.xmi.PackageReference#getUuid()
	 * @see #getPackageReference()
	 * @generated
	 */
	EAttribute getPackageReference_Uuid();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.PackageReference#getVersion1 <em>Version1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version1</em>'.
	 * @see org.omg.xmi.PackageReference#getVersion1()
	 * @see #getPackageReference()
	 * @generated
	 */
	EAttribute getPackageReference_Version1();

	/**
	 * Returns the meta object for class '{@link org.omg.xmi.Replace <em>Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replace</em>'.
	 * @see org.omg.xmi.Replace
	 * @generated
	 */
	EClass getReplace();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Replace#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.omg.xmi.Replace#getPosition()
	 * @see #getReplace()
	 * @generated
	 */
	EAttribute getReplace_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.Replace#getReplacement <em>Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replacement</em>'.
	 * @see org.omg.xmi.Replace#getReplacement()
	 * @see #getReplace()
	 * @generated
	 */
	EAttribute getReplace_Replacement();

	/**
	 * Returns the meta object for class '{@link org.omg.xmi.TargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Type</em>'.
	 * @see org.omg.xmi.TargetType
	 * @generated
	 */
	EClass getTargetType();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.xmi.TargetType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.omg.xmi.TargetType#getGroup()
	 * @see #getTargetType()
	 * @generated
	 */
	EAttribute getTargetType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.xmi.TargetType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.omg.xmi.TargetType#getAny()
	 * @see #getTargetType()
	 * @generated
	 */
	EAttribute getTargetType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.xmi.TargetType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.omg.xmi.TargetType#getAnyAttribute()
	 * @see #getTargetType()
	 * @generated
	 */
	EAttribute getTargetType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.omg.xmi.XMI <em>XMI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XMI</em>'.
	 * @see org.omg.xmi.XMI
	 * @generated
	 */
	EClass getXMI();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.xmi.XMI#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.omg.xmi.XMI#getGroup()
	 * @see #getXMI()
	 * @generated
	 */
	EAttribute getXMI_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.xmi.XMI#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.omg.xmi.XMI#getAny()
	 * @see #getXMI()
	 * @generated
	 */
	EAttribute getXMI_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.XMI#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.omg.xmi.XMI#getHref()
	 * @see #getXMI()
	 * @generated
	 */
	EAttribute getXMI_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.XMI#getIdref <em>Idref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idref</em>'.
	 * @see org.omg.xmi.XMI#getIdref()
	 * @see #getXMI()
	 * @generated
	 */
	EAttribute getXMI_Idref();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.XMI#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.omg.xmi.XMI#getLabel()
	 * @see #getXMI()
	 * @generated
	 */
	EAttribute getXMI_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.XMI#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.omg.xmi.XMI#getType()
	 * @see #getXMI()
	 * @generated
	 */
	EAttribute getXMI_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.XMI#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see org.omg.xmi.XMI#getUuid()
	 * @see #getXMI()
	 * @generated
	 */
	EAttribute getXMI_Uuid();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.xmi.XMI#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.omg.xmi.XMI#getVersion()
	 * @see #getXMI()
	 * @generated
	 */
	EAttribute getXMI_Version();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XmiFactory getXmiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.omg.xmi.impl.AddImpl <em>Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.xmi.impl.AddImpl
		 * @see org.omg.xmi.impl.XmiPackageImpl#getAdd()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getAdd();

		/**
		 * The meta object literal for the '<em><b>Addition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD__ADDITION = eINSTANCE.getAdd_Addition();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD__POSITION = eINSTANCE.getAdd_Position();

		/**
		 * The meta object literal for the '{@link org.omg.xmi.impl.AnyImpl <em>Any</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.xmi.impl.AnyImpl
		 * @see org.omg.xmi.impl.XmiPackageImpl#getAny()
		 * @generated
		 */
		EClass ANY = eINSTANCE.getAny();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY__GROUP = eINSTANCE.getAny_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY__ANY = eINSTANCE.getAny_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY__ANY_ATTRIBUTE = eINSTANCE.getAny_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.omg.xmi.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.xmi.impl.DeleteImpl
		 * @see org.omg.xmi.impl.XmiPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '{@link org.omg.xmi.impl.DifferenceImpl <em>Difference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.xmi.impl.DifferenceImpl
		 * @see org.omg.xmi.impl.XmiPackageImpl#getDifference()
		 * @generated
		 */
		EClass DIFFERENCE = eINSTANCE.getDifference();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENCE__GROUP = eINSTANCE.getDifference_Group();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFFERENCE__TARGET = eINSTANCE.getDifference_Target();

		/**
		 * The meta object literal for the '<em><b>Difference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFFERENCE__DIFFERENCE = eINSTANCE.getDifference_Difference();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFFERENCE__CONTAINER = eINSTANCE.getDifference_Container();

		/**
		 * The meta object literal for the '<em><b>Container1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENCE__CONTAINER1 = eINSTANCE.getDifference_Container1();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENCE__HREF = eINSTANCE.getDifference_Href();

		/**
		 * The meta object literal for the '<em><b>Idref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENCE__IDREF = eINSTANCE.getDifference_Idref();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENCE__LABEL = eINSTANCE.getDifference_Label();

		/**
		 * The meta object literal for the '<em><b>Target1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENCE__TARGET1 = eINSTANCE.getDifference_Target1();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENCE__TYPE = eINSTANCE.getDifference_Type();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENCE__UUID = eINSTANCE.getDifference_Uuid();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENCE__VERSION = eINSTANCE.getDifference_Version();

		/**
		 * The meta object literal for the '{@link org.omg.xmi.impl.DocumentationImpl <em>Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.xmi.impl.DocumentationImpl
		 * @see org.omg.xmi.impl.XmiPackageImpl#getDocumentation()
		 * @generated
		 */
		EClass DOCUMENTATION = eINSTANCE.getDocumentation();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__GROUP = eINSTANCE.getDocumentation_Group();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__CONTACT = eINSTANCE.getDocumentation_Contact();

		/**
		 * The meta object literal for the '<em><b>Exporter</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__EXPORTER = eINSTANCE.getDocumentation_Exporter();

		/**
		 * The meta object literal for the '<em><b>Exporter Version</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__EXPORTER_VERSION = eINSTANCE.getDocumentation_ExporterVersion();

		/**
		 * The meta object literal for the '<em><b>Long Description</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__LONG_DESCRIPTION = eINSTANCE.getDocumentation_LongDescription();

		/**
		 * The meta object literal for the '<em><b>Short Description</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__SHORT_DESCRIPTION = eINSTANCE.getDocumentation_ShortDescription();

		/**
		 * The meta object literal for the '<em><b>Notice</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__NOTICE = eINSTANCE.getDocumentation_Notice();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__OWNER = eINSTANCE.getDocumentation_Owner();

		/**
		 * The meta object literal for the '<em><b>Contact1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__CONTACT1 = eINSTANCE.getDocumentation_Contact1();

		/**
		 * The meta object literal for the '<em><b>Exporter1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__EXPORTER1 = eINSTANCE.getDocumentation_Exporter1();

		/**
		 * The meta object literal for the '<em><b>Exporter Version1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__EXPORTER_VERSION1 = eINSTANCE.getDocumentation_ExporterVersion1();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__HREF = eINSTANCE.getDocumentation_Href();

		/**
		 * The meta object literal for the '<em><b>Idref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__IDREF = eINSTANCE.getDocumentation_Idref();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__LABEL = eINSTANCE.getDocumentation_Label();

		/**
		 * The meta object literal for the '<em><b>Long Description1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__LONG_DESCRIPTION1 = eINSTANCE.getDocumentation_LongDescription1();

		/**
		 * The meta object literal for the '<em><b>Notice1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__NOTICE1 = eINSTANCE.getDocumentation_Notice1();

		/**
		 * The meta object literal for the '<em><b>Owner1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__OWNER1 = eINSTANCE.getDocumentation_Owner1();

		/**
		 * The meta object literal for the '<em><b>Short Description1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__SHORT_DESCRIPTION1 = eINSTANCE.getDocumentation_ShortDescription1();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__TYPE = eINSTANCE.getDocumentation_Type();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__UUID = eINSTANCE.getDocumentation_Uuid();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__VERSION = eINSTANCE.getDocumentation_Version();

		/**
		 * The meta object literal for the '{@link org.omg.xmi.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.xmi.impl.DocumentRootImpl
		 * @see org.omg.xmi.impl.XmiPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Add</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ADD = eINSTANCE.getDocumentRoot_Add();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DELETE = eINSTANCE.getDocumentRoot_Delete();

		/**
		 * The meta object literal for the '<em><b>Difference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DIFFERENCE = eINSTANCE.getDocumentRoot_Difference();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOCUMENTATION = eINSTANCE.getDocumentRoot_Documentation();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTENSION = eINSTANCE.getDocumentRoot_Extension();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IMPORT = eINSTANCE.getDocumentRoot_Import();

		/**
		 * The meta object literal for the '<em><b>Meta Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__META_MODEL = eINSTANCE.getDocumentRoot_MetaModel();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MODEL = eINSTANCE.getDocumentRoot_Model();

		/**
		 * The meta object literal for the '<em><b>Package Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PACKAGE_REFERENCE = eINSTANCE.getDocumentRoot_PackageReference();

		/**
		 * The meta object literal for the '<em><b>Replace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REPLACE = eINSTANCE.getDocumentRoot_Replace();

		/**
		 * The meta object literal for the '<em><b>XMI</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMI = eINSTANCE.getDocumentRoot_XMI();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ID = eINSTANCE.getDocumentRoot_Id();

		/**
		 * The meta object literal for the '{@link org.omg.xmi.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.xmi.impl.ExtensionImpl
		 * @see org.omg.xmi.impl.XmiPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__GROUP = eINSTANCE.getExtension_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__ANY = eINSTANCE.getExtension_Any();

		/**
		 * The meta object literal for the '<em><b>Extender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__EXTENDER = eINSTANCE.getExtension_Extender();

		/**
		 * The meta object literal for the '<em><b>Extender ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__EXTENDER_ID = eINSTANCE.getExtension_ExtenderID();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__HREF = eINSTANCE.getExtension_Href();

		/**
		 * The meta object literal for the '<em><b>Idref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__IDREF = eINSTANCE.getExtension_Idref();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__LABEL = eINSTANCE.getExtension_Label();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__TYPE = eINSTANCE.getExtension_Type();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__UUID = eINSTANCE.getExtension_Uuid();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__VERSION = eINSTANCE.getExtension_Version();

		/**
		 * The meta object literal for the '{@link org.omg.xmi.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.xmi.impl.ImportImpl
		 * @see org.omg.xmi.impl.XmiPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '{@link org.omg.xmi.impl.MetaModelImpl <em>Meta Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.xmi.impl.MetaModelImpl
		 * @see org.omg.xmi.impl.XmiPackageImpl#getMetaModel()
		 * @generated
		 */
		EClass META_MODEL = eINSTANCE.getMetaModel();

		/**
		 * The meta object literal for the '{@link org.omg.xmi.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.xmi.impl.ModelImpl
		 * @see org.omg.xmi.impl.XmiPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '{@link org.omg.xmi.impl.PackageReferenceImpl <em>Package Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.xmi.impl.PackageReferenceImpl
		 * @see org.omg.xmi.impl.XmiPackageImpl#getPackageReference()
		 * @generated
		 */
		EClass PACKAGE_REFERENCE = eINSTANCE.getPackageReference();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_REFERENCE__GROUP = eINSTANCE.getPackageReference_Group();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_REFERENCE__NAME = eINSTANCE.getPackageReference_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_REFERENCE__VERSION = eINSTANCE.getPackageReference_Version();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_REFERENCE__HREF = eINSTANCE.getPackageReference_Href();

		/**
		 * The meta object literal for the '<em><b>Idref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_REFERENCE__IDREF = eINSTANCE.getPackageReference_Idref();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_REFERENCE__LABEL = eINSTANCE.getPackageReference_Label();

		/**
		 * The meta object literal for the '<em><b>Name1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_REFERENCE__NAME1 = eINSTANCE.getPackageReference_Name1();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_REFERENCE__TYPE = eINSTANCE.getPackageReference_Type();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_REFERENCE__UUID = eINSTANCE.getPackageReference_Uuid();

		/**
		 * The meta object literal for the '<em><b>Version1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_REFERENCE__VERSION1 = eINSTANCE.getPackageReference_Version1();

		/**
		 * The meta object literal for the '{@link org.omg.xmi.impl.ReplaceImpl <em>Replace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.xmi.impl.ReplaceImpl
		 * @see org.omg.xmi.impl.XmiPackageImpl#getReplace()
		 * @generated
		 */
		EClass REPLACE = eINSTANCE.getReplace();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACE__POSITION = eINSTANCE.getReplace_Position();

		/**
		 * The meta object literal for the '<em><b>Replacement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACE__REPLACEMENT = eINSTANCE.getReplace_Replacement();

		/**
		 * The meta object literal for the '{@link org.omg.xmi.impl.TargetTypeImpl <em>Target Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.xmi.impl.TargetTypeImpl
		 * @see org.omg.xmi.impl.XmiPackageImpl#getTargetType()
		 * @generated
		 */
		EClass TARGET_TYPE = eINSTANCE.getTargetType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_TYPE__GROUP = eINSTANCE.getTargetType_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_TYPE__ANY = eINSTANCE.getTargetType_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_TYPE__ANY_ATTRIBUTE = eINSTANCE.getTargetType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.omg.xmi.impl.XMIImpl <em>XMI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.xmi.impl.XMIImpl
		 * @see org.omg.xmi.impl.XmiPackageImpl#getXMI()
		 * @generated
		 */
		EClass XMI = eINSTANCE.getXMI();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMI__GROUP = eINSTANCE.getXMI_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMI__ANY = eINSTANCE.getXMI_Any();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMI__HREF = eINSTANCE.getXMI_Href();

		/**
		 * The meta object literal for the '<em><b>Idref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMI__IDREF = eINSTANCE.getXMI_Idref();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMI__LABEL = eINSTANCE.getXMI_Label();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMI__TYPE = eINSTANCE.getXMI_Type();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMI__UUID = eINSTANCE.getXMI_Uuid();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMI__VERSION = eINSTANCE.getXMI_Version();

	}

} //XmiPackage
