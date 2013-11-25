/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.xmi.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.uml2._1._0._0.uml.UmlPackage;

import org.eclipse.uml2._1._0._0.uml.impl.UmlPackageImpl;

import org.omg.xmi.Add;
import org.omg.xmi.Any;
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
import org.omg.xmi.TargetType;
import org.omg.xmi.XmiFactory;
import org.omg.xmi.XmiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmiPackageImpl extends EPackageImpl implements XmiPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass differenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmiEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.omg.xmi.XmiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XmiPackageImpl()
	{
		super(eNS_URI, XmiFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link XmiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XmiPackage init()
	{
		if (isInited) return (XmiPackage)EPackage.Registry.INSTANCE.getEPackage(XmiPackage.eNS_URI);

		// Obtain or create and register package
		XmiPackageImpl theXmiPackage = (XmiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XmiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XmiPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		UmlPackageImpl theUmlPackage = (UmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI) instanceof UmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI) : UmlPackage.eINSTANCE);

		// Load packages
		theUmlPackage.loadPackage();

		// Create package meta-data objects
		theXmiPackage.createPackageContents();

		// Initialize created meta-data
		theXmiPackage.initializePackageContents();

		// Fix loaded packages
		theUmlPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theXmiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XmiPackage.eNS_URI, theXmiPackage);
		return theXmiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdd()
	{
		return addEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdd_Addition()
	{
		return (EAttribute)addEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdd_Position()
	{
		return (EAttribute)addEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAny()
	{
		return anyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAny_Group()
	{
		return (EAttribute)anyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAny_Any()
	{
		return (EAttribute)anyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAny_AnyAttribute()
	{
		return (EAttribute)anyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelete()
	{
		return deleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDifference()
	{
		return differenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDifference_Group()
	{
		return (EAttribute)differenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDifference_Target()
	{
		return (EReference)differenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDifference_Difference()
	{
		return (EReference)differenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDifference_Container()
	{
		return (EReference)differenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDifference_Container1()
	{
		return (EAttribute)differenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDifference_Href()
	{
		return (EAttribute)differenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDifference_Idref()
	{
		return (EAttribute)differenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDifference_Label()
	{
		return (EAttribute)differenceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDifference_Target1()
	{
		return (EAttribute)differenceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDifference_Type()
	{
		return (EAttribute)differenceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDifference_Uuid()
	{
		return (EAttribute)differenceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDifference_Version()
	{
		return (EAttribute)differenceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentation()
	{
		return documentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_Group()
	{
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_Contact()
	{
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_Exporter()
	{
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_ExporterVersion()
	{
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_LongDescription()
	{
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_ShortDescription()
	{
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_Notice()
	{
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_Owner()
	{
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_Contact1()
	{
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_Exporter1()
	{
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_ExporterVersion1()
	{
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_Href()
	{
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_Idref()
	{
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_Label()
	{
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_LongDescription1()
	{
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_Notice1()
	{
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_Owner1()
	{
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_ShortDescription1()
	{
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_Type()
	{
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_Uuid()
	{
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_Version()
	{
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot()
	{
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed()
	{
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap()
	{
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation()
	{
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Add()
	{
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Delete()
	{
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Difference()
	{
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Documentation()
	{
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Extension()
	{
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Import()
	{
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MetaModel()
	{
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Model()
	{
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PackageReference()
	{
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Replace()
	{
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMI()
	{
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Id()
	{
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtension()
	{
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_Group()
	{
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_Any()
	{
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_Extender()
	{
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_ExtenderID()
	{
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_Href()
	{
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_Idref()
	{
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_Label()
	{
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_Type()
	{
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_Uuid()
	{
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_Version()
	{
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport()
	{
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaModel()
	{
		return metaModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel()
	{
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageReference()
	{
		return packageReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageReference_Group()
	{
		return (EAttribute)packageReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageReference_Name()
	{
		return (EAttribute)packageReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageReference_Version()
	{
		return (EAttribute)packageReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageReference_Href()
	{
		return (EAttribute)packageReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageReference_Idref()
	{
		return (EAttribute)packageReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageReference_Label()
	{
		return (EAttribute)packageReferenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageReference_Name1()
	{
		return (EAttribute)packageReferenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageReference_Type()
	{
		return (EAttribute)packageReferenceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageReference_Uuid()
	{
		return (EAttribute)packageReferenceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageReference_Version1()
	{
		return (EAttribute)packageReferenceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplace()
	{
		return replaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplace_Position()
	{
		return (EAttribute)replaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplace_Replacement()
	{
		return (EAttribute)replaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetType()
	{
		return targetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetType_Group()
	{
		return (EAttribute)targetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetType_Any()
	{
		return (EAttribute)targetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetType_AnyAttribute()
	{
		return (EAttribute)targetTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMI()
	{
		return xmiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMI_Group()
	{
		return (EAttribute)xmiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMI_Any()
	{
		return (EAttribute)xmiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMI_Href()
	{
		return (EAttribute)xmiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMI_Idref()
	{
		return (EAttribute)xmiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMI_Label()
	{
		return (EAttribute)xmiEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMI_Type()
	{
		return (EAttribute)xmiEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMI_Uuid()
	{
		return (EAttribute)xmiEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMI_Version()
	{
		return (EAttribute)xmiEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmiFactory getXmiFactory()
	{
		return (XmiFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		addEClass = createEClass(ADD);
		createEAttribute(addEClass, ADD__ADDITION);
		createEAttribute(addEClass, ADD__POSITION);

		anyEClass = createEClass(ANY);
		createEAttribute(anyEClass, ANY__GROUP);
		createEAttribute(anyEClass, ANY__ANY);
		createEAttribute(anyEClass, ANY__ANY_ATTRIBUTE);

		deleteEClass = createEClass(DELETE);

		differenceEClass = createEClass(DIFFERENCE);
		createEAttribute(differenceEClass, DIFFERENCE__GROUP);
		createEReference(differenceEClass, DIFFERENCE__TARGET);
		createEReference(differenceEClass, DIFFERENCE__DIFFERENCE);
		createEReference(differenceEClass, DIFFERENCE__CONTAINER);
		createEAttribute(differenceEClass, DIFFERENCE__CONTAINER1);
		createEAttribute(differenceEClass, DIFFERENCE__HREF);
		createEAttribute(differenceEClass, DIFFERENCE__IDREF);
		createEAttribute(differenceEClass, DIFFERENCE__LABEL);
		createEAttribute(differenceEClass, DIFFERENCE__TARGET1);
		createEAttribute(differenceEClass, DIFFERENCE__TYPE);
		createEAttribute(differenceEClass, DIFFERENCE__UUID);
		createEAttribute(differenceEClass, DIFFERENCE__VERSION);

		documentationEClass = createEClass(DOCUMENTATION);
		createEAttribute(documentationEClass, DOCUMENTATION__GROUP);
		createEAttribute(documentationEClass, DOCUMENTATION__CONTACT);
		createEAttribute(documentationEClass, DOCUMENTATION__EXPORTER);
		createEAttribute(documentationEClass, DOCUMENTATION__EXPORTER_VERSION);
		createEAttribute(documentationEClass, DOCUMENTATION__LONG_DESCRIPTION);
		createEAttribute(documentationEClass, DOCUMENTATION__SHORT_DESCRIPTION);
		createEAttribute(documentationEClass, DOCUMENTATION__NOTICE);
		createEAttribute(documentationEClass, DOCUMENTATION__OWNER);
		createEAttribute(documentationEClass, DOCUMENTATION__CONTACT1);
		createEAttribute(documentationEClass, DOCUMENTATION__EXPORTER1);
		createEAttribute(documentationEClass, DOCUMENTATION__EXPORTER_VERSION1);
		createEAttribute(documentationEClass, DOCUMENTATION__HREF);
		createEAttribute(documentationEClass, DOCUMENTATION__IDREF);
		createEAttribute(documentationEClass, DOCUMENTATION__LABEL);
		createEAttribute(documentationEClass, DOCUMENTATION__LONG_DESCRIPTION1);
		createEAttribute(documentationEClass, DOCUMENTATION__NOTICE1);
		createEAttribute(documentationEClass, DOCUMENTATION__OWNER1);
		createEAttribute(documentationEClass, DOCUMENTATION__SHORT_DESCRIPTION1);
		createEAttribute(documentationEClass, DOCUMENTATION__TYPE);
		createEAttribute(documentationEClass, DOCUMENTATION__UUID);
		createEAttribute(documentationEClass, DOCUMENTATION__VERSION);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DELETE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DIFFERENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOCUMENTATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTENSION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IMPORT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__META_MODEL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MODEL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PACKAGE_REFERENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REPLACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMI);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ID);

		extensionEClass = createEClass(EXTENSION);
		createEAttribute(extensionEClass, EXTENSION__GROUP);
		createEAttribute(extensionEClass, EXTENSION__ANY);
		createEAttribute(extensionEClass, EXTENSION__EXTENDER);
		createEAttribute(extensionEClass, EXTENSION__EXTENDER_ID);
		createEAttribute(extensionEClass, EXTENSION__HREF);
		createEAttribute(extensionEClass, EXTENSION__IDREF);
		createEAttribute(extensionEClass, EXTENSION__LABEL);
		createEAttribute(extensionEClass, EXTENSION__TYPE);
		createEAttribute(extensionEClass, EXTENSION__UUID);
		createEAttribute(extensionEClass, EXTENSION__VERSION);

		importEClass = createEClass(IMPORT);

		metaModelEClass = createEClass(META_MODEL);

		modelEClass = createEClass(MODEL);

		packageReferenceEClass = createEClass(PACKAGE_REFERENCE);
		createEAttribute(packageReferenceEClass, PACKAGE_REFERENCE__GROUP);
		createEAttribute(packageReferenceEClass, PACKAGE_REFERENCE__NAME);
		createEAttribute(packageReferenceEClass, PACKAGE_REFERENCE__VERSION);
		createEAttribute(packageReferenceEClass, PACKAGE_REFERENCE__HREF);
		createEAttribute(packageReferenceEClass, PACKAGE_REFERENCE__IDREF);
		createEAttribute(packageReferenceEClass, PACKAGE_REFERENCE__LABEL);
		createEAttribute(packageReferenceEClass, PACKAGE_REFERENCE__NAME1);
		createEAttribute(packageReferenceEClass, PACKAGE_REFERENCE__TYPE);
		createEAttribute(packageReferenceEClass, PACKAGE_REFERENCE__UUID);
		createEAttribute(packageReferenceEClass, PACKAGE_REFERENCE__VERSION1);

		replaceEClass = createEClass(REPLACE);
		createEAttribute(replaceEClass, REPLACE__POSITION);
		createEAttribute(replaceEClass, REPLACE__REPLACEMENT);

		targetTypeEClass = createEClass(TARGET_TYPE);
		createEAttribute(targetTypeEClass, TARGET_TYPE__GROUP);
		createEAttribute(targetTypeEClass, TARGET_TYPE__ANY);
		createEAttribute(targetTypeEClass, TARGET_TYPE__ANY_ATTRIBUTE);

		xmiEClass = createEClass(XMI);
		createEAttribute(xmiEClass, XMI__GROUP);
		createEAttribute(xmiEClass, XMI__ANY);
		createEAttribute(xmiEClass, XMI__HREF);
		createEAttribute(xmiEClass, XMI__IDREF);
		createEAttribute(xmiEClass, XMI__LABEL);
		createEAttribute(xmiEClass, XMI__TYPE);
		createEAttribute(xmiEClass, XMI__UUID);
		createEAttribute(xmiEClass, XMI__VERSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		addEClass.getESuperTypes().add(this.getDifference());
		deleteEClass.getESuperTypes().add(this.getDifference());
		importEClass.getESuperTypes().add(this.getPackageReference());
		metaModelEClass.getESuperTypes().add(this.getPackageReference());
		modelEClass.getESuperTypes().add(this.getPackageReference());
		replaceEClass.getESuperTypes().add(this.getDifference());

		// Initialize classes and features; add operations and parameters
		initEClass(addEClass, Add.class, "Add", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdd_Addition(), theXMLTypePackage.getIDREFS(), "addition", null, 0, 1, Add.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdd_Position(), theXMLTypePackage.getString(), "position", null, 0, 1, Add.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anyEClass, Any.class, "Any", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAny_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Any.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAny_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Any.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAny_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Any.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteEClass, Delete.class, "Delete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(differenceEClass, Difference.class, "Difference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDifference_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Difference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDifference_Target(), this.getTargetType(), null, "target", null, 0, -1, Difference.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDifference_Difference(), this.getDifference(), null, "difference", null, 0, -1, Difference.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDifference_Container(), this.getDifference(), null, "container", null, 0, -1, Difference.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifference_Container1(), theXMLTypePackage.getIDREFS(), "container1", null, 0, 1, Difference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifference_Href(), theXMLTypePackage.getString(), "href", null, 0, 1, Difference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifference_Idref(), theXMLTypePackage.getIDREF(), "idref", null, 0, 1, Difference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifference_Label(), theXMLTypePackage.getString(), "label", null, 0, 1, Difference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifference_Target1(), theXMLTypePackage.getIDREFS(), "target1", null, 0, 1, Difference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifference_Type(), theXMLTypePackage.getQName(), "type", null, 0, 1, Difference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifference_Uuid(), theXMLTypePackage.getString(), "uuid", null, 0, 1, Difference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifference_Version(), theXMLTypePackage.getString(), "version", "2.0", 0, 1, Difference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentationEClass, Documentation.class, "Documentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentation_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_Contact(), theXMLTypePackage.getString(), "contact", null, 0, -1, Documentation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_Exporter(), theXMLTypePackage.getString(), "exporter", null, 0, -1, Documentation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_ExporterVersion(), theXMLTypePackage.getString(), "exporterVersion", null, 0, -1, Documentation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_LongDescription(), theXMLTypePackage.getString(), "longDescription", null, 0, -1, Documentation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_ShortDescription(), theXMLTypePackage.getString(), "shortDescription", null, 0, -1, Documentation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_Notice(), theXMLTypePackage.getString(), "notice", null, 0, -1, Documentation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_Owner(), theXMLTypePackage.getString(), "owner", null, 0, -1, Documentation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_Contact1(), theXMLTypePackage.getString(), "contact1", null, 0, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_Exporter1(), theXMLTypePackage.getString(), "exporter1", null, 0, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_ExporterVersion1(), theXMLTypePackage.getString(), "exporterVersion1", null, 0, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_Href(), theXMLTypePackage.getString(), "href", null, 0, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_Idref(), theXMLTypePackage.getIDREF(), "idref", null, 0, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_Label(), theXMLTypePackage.getString(), "label", null, 0, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_LongDescription1(), theXMLTypePackage.getString(), "longDescription1", null, 0, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_Notice1(), theXMLTypePackage.getString(), "notice1", null, 0, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_Owner1(), theXMLTypePackage.getString(), "owner1", null, 0, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_ShortDescription1(), theXMLTypePackage.getString(), "shortDescription1", null, 0, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_Type(), theXMLTypePackage.getQName(), "type", null, 0, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_Uuid(), theXMLTypePackage.getString(), "uuid", null, 0, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_Version(), theXMLTypePackage.getString(), "version", "2.0", 0, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Add(), this.getAdd(), null, "add", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Delete(), this.getDelete(), null, "delete", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Difference(), this.getDifference(), null, "difference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Documentation(), this.getDocumentation(), null, "documentation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Extension(), this.getExtension(), null, "extension", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Import(), this.getImport(), null, "import", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MetaModel(), this.getMetaModel(), null, "metaModel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Model(), this.getModel(), null, "model", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PackageReference(), this.getPackageReference(), null, "packageReference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Replace(), this.getReplace(), null, "replace", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMI(), this.getXMI(), null, "xMI", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtension_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Extension.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_Extender(), theXMLTypePackage.getString(), "extender", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_ExtenderID(), theXMLTypePackage.getString(), "extenderID", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_Href(), theXMLTypePackage.getString(), "href", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_Idref(), theXMLTypePackage.getIDREF(), "idref", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_Label(), theXMLTypePackage.getString(), "label", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_Type(), theXMLTypePackage.getQName(), "type", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_Uuid(), theXMLTypePackage.getString(), "uuid", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_Version(), theXMLTypePackage.getString(), "version", "2.0", 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metaModelEClass, MetaModel.class, "MetaModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(packageReferenceEClass, PackageReference.class, "PackageReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageReference_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, PackageReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageReference_Name(), theXMLTypePackage.getString(), "name", null, 0, -1, PackageReference.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageReference_Version(), theXMLTypePackage.getString(), "version", null, 0, -1, PackageReference.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageReference_Href(), theXMLTypePackage.getString(), "href", null, 0, 1, PackageReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageReference_Idref(), theXMLTypePackage.getIDREF(), "idref", null, 0, 1, PackageReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageReference_Label(), theXMLTypePackage.getString(), "label", null, 0, 1, PackageReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageReference_Name1(), theXMLTypePackage.getString(), "name1", null, 0, 1, PackageReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageReference_Type(), theXMLTypePackage.getQName(), "type", null, 0, 1, PackageReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageReference_Uuid(), theXMLTypePackage.getString(), "uuid", null, 0, 1, PackageReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageReference_Version1(), theXMLTypePackage.getString(), "version1", "2.0", 0, 1, PackageReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(replaceEClass, Replace.class, "Replace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReplace_Position(), theXMLTypePackage.getString(), "position", null, 0, 1, Replace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReplace_Replacement(), theXMLTypePackage.getIDREFS(), "replacement", null, 0, 1, Replace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetTypeEClass, TargetType.class, "TargetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTargetType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, TargetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, TargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmiEClass, org.omg.xmi.XMI.class, "XMI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMI_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, org.omg.xmi.XMI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMI_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, org.omg.xmi.XMI.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMI_Href(), theXMLTypePackage.getString(), "href", null, 0, 1, org.omg.xmi.XMI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMI_Idref(), theXMLTypePackage.getIDREF(), "idref", null, 0, 1, org.omg.xmi.XMI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMI_Label(), theXMLTypePackage.getString(), "label", null, 0, 1, org.omg.xmi.XMI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMI_Type(), theXMLTypePackage.getQName(), "type", null, 0, 1, org.omg.xmi.XMI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMI_Uuid(), theXMLTypePackage.getString(), "uuid", null, 0, 1, org.omg.xmi.XMI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMI_Version(), theXMLTypePackage.getString(), "version", "2.0", 1, 1, org.omg.xmi.XMI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations()
	{
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (addEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "Add",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAdd_Addition(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "addition"
		   });		
		addAnnotation
		  (getAdd_Position(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "position"
		   });		
		addAnnotation
		  (anyEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "Any",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAny_Group(), 
		   source, 
		   new String[] 
		   {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getAny_Any(), 
		   source, 
		   new String[] 
		   {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "skip",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getAny_AnyAttribute(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":2",
			 "processing", "skip"
		   });		
		addAnnotation
		  (deleteEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "Delete",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (differenceEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "Difference",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDifference_Group(), 
		   source, 
		   new String[] 
		   {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getDifference_Target(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "target",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDifference_Difference(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "difference",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDifference_Container(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "container",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDifference_Container1(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "container"
		   });		
		addAnnotation
		  (getDifference_Href(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "href"
		   });		
		addAnnotation
		  (getDifference_Idref(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "idref",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDifference_Label(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "label",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDifference_Target1(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "target"
		   });		
		addAnnotation
		  (getDifference_Type(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDifference_Uuid(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "uuid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDifference_Version(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentationEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "Documentation",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDocumentation_Group(), 
		   source, 
		   new String[] 
		   {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getDocumentation_Contact(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "contact",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDocumentation_Exporter(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "exporter",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDocumentation_ExporterVersion(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "exporterVersion",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDocumentation_LongDescription(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "longDescription",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDocumentation_ShortDescription(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "shortDescription",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDocumentation_Notice(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "notice",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDocumentation_Owner(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "owner",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDocumentation_Contact1(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "contact"
		   });		
		addAnnotation
		  (getDocumentation_Exporter1(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "exporter"
		   });		
		addAnnotation
		  (getDocumentation_ExporterVersion1(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "exporterVersion"
		   });		
		addAnnotation
		  (getDocumentation_Href(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "href"
		   });		
		addAnnotation
		  (getDocumentation_Idref(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "idref",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentation_Label(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "label",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentation_LongDescription1(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "longDescription"
		   });		
		addAnnotation
		  (getDocumentation_Notice1(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "notice"
		   });		
		addAnnotation
		  (getDocumentation_Owner1(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "owner"
		   });		
		addAnnotation
		  (getDocumentation_ShortDescription1(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "shortDescription"
		   });		
		addAnnotation
		  (getDocumentation_Type(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentation_Uuid(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "uuid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentation_Version(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] 
		   {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Add(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "Add",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Delete(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "Delete",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Difference(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "Difference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Documentation(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Extension(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "Extension",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Import(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "Import",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MetaModel(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "MetaModel",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Model(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "Model",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PackageReference(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "PackageReference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Replace(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "Replace",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_XMI(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "XMI",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Id(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (extensionEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "Extension",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getExtension_Group(), 
		   source, 
		   new String[] 
		   {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getExtension_Any(), 
		   source, 
		   new String[] 
		   {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "lax",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getExtension_Extender(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "extender"
		   });		
		addAnnotation
		  (getExtension_ExtenderID(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "extenderID"
		   });		
		addAnnotation
		  (getExtension_Href(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "href"
		   });		
		addAnnotation
		  (getExtension_Idref(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "idref",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getExtension_Label(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "label",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getExtension_Type(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getExtension_Uuid(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "uuid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getExtension_Version(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (importEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "Import",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (metaModelEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "MetaModel",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (modelEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "Model",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (packageReferenceEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "PackageReference",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPackageReference_Group(), 
		   source, 
		   new String[] 
		   {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getPackageReference_Name(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "name",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPackageReference_Version(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "version",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPackageReference_Href(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "href"
		   });		
		addAnnotation
		  (getPackageReference_Idref(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "idref",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPackageReference_Label(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "label",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPackageReference_Name1(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getPackageReference_Type(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPackageReference_Uuid(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "uuid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPackageReference_Version1(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (replaceEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "Replace",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getReplace_Position(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "position"
		   });		
		addAnnotation
		  (getReplace_Replacement(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "replacement"
		   });		
		addAnnotation
		  (targetTypeEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "target_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTargetType_Group(), 
		   source, 
		   new String[] 
		   {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getTargetType_Any(), 
		   source, 
		   new String[] 
		   {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "skip",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getTargetType_AnyAttribute(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":2",
			 "processing", "skip"
		   });		
		addAnnotation
		  (xmiEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "XMI",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getXMI_Group(), 
		   source, 
		   new String[] 
		   {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getXMI_Any(), 
		   source, 
		   new String[] 
		   {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "strict",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getXMI_Href(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "href"
		   });		
		addAnnotation
		  (getXMI_Idref(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "idref",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getXMI_Label(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "label",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getXMI_Type(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getXMI_Uuid(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "uuid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getXMI_Version(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });
	}

} //XmiPackageImpl
