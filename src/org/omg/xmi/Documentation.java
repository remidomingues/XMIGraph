/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.xmi;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.xmi.Documentation#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.xmi.Documentation#getContact <em>Contact</em>}</li>
 *   <li>{@link org.omg.xmi.Documentation#getExporter <em>Exporter</em>}</li>
 *   <li>{@link org.omg.xmi.Documentation#getExporterVersion <em>Exporter Version</em>}</li>
 *   <li>{@link org.omg.xmi.Documentation#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link org.omg.xmi.Documentation#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link org.omg.xmi.Documentation#getNotice <em>Notice</em>}</li>
 *   <li>{@link org.omg.xmi.Documentation#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.omg.xmi.Documentation#getContact1 <em>Contact1</em>}</li>
 *   <li>{@link org.omg.xmi.Documentation#getExporter1 <em>Exporter1</em>}</li>
 *   <li>{@link org.omg.xmi.Documentation#getExporterVersion1 <em>Exporter Version1</em>}</li>
 *   <li>{@link org.omg.xmi.Documentation#getHref <em>Href</em>}</li>
 *   <li>{@link org.omg.xmi.Documentation#getIdref <em>Idref</em>}</li>
 *   <li>{@link org.omg.xmi.Documentation#getLabel <em>Label</em>}</li>
 *   <li>{@link org.omg.xmi.Documentation#getLongDescription1 <em>Long Description1</em>}</li>
 *   <li>{@link org.omg.xmi.Documentation#getNotice1 <em>Notice1</em>}</li>
 *   <li>{@link org.omg.xmi.Documentation#getOwner1 <em>Owner1</em>}</li>
 *   <li>{@link org.omg.xmi.Documentation#getShortDescription1 <em>Short Description1</em>}</li>
 *   <li>{@link org.omg.xmi.Documentation#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.xmi.Documentation#getUuid <em>Uuid</em>}</li>
 *   <li>{@link org.omg.xmi.Documentation#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.xmi.XmiPackage#getDocumentation()
 * @model extendedMetaData="name='Documentation' kind='elementOnly'"
 * @generated
 */
public interface Documentation extends EObject
{
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.omg.xmi.XmiPackage#getDocumentation_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' attribute list.
	 * @see org.omg.xmi.XmiPackage#getDocumentation_Contact()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contact' group='#group:0'"
	 * @generated
	 */
	EList<String> getContact();

	/**
	 * Returns the value of the '<em><b>Exporter</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exporter</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exporter</em>' attribute list.
	 * @see org.omg.xmi.XmiPackage#getDocumentation_Exporter()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='exporter' group='#group:0'"
	 * @generated
	 */
	EList<String> getExporter();

	/**
	 * Returns the value of the '<em><b>Exporter Version</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exporter Version</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exporter Version</em>' attribute list.
	 * @see org.omg.xmi.XmiPackage#getDocumentation_ExporterVersion()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='exporterVersion' group='#group:0'"
	 * @generated
	 */
	EList<String> getExporterVersion();

	/**
	 * Returns the value of the '<em><b>Long Description</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Description</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Description</em>' attribute list.
	 * @see org.omg.xmi.XmiPackage#getDocumentation_LongDescription()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='longDescription' group='#group:0'"
	 * @generated
	 */
	EList<String> getLongDescription();

	/**
	 * Returns the value of the '<em><b>Short Description</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Description</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Description</em>' attribute list.
	 * @see org.omg.xmi.XmiPackage#getDocumentation_ShortDescription()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='shortDescription' group='#group:0'"
	 * @generated
	 */
	EList<String> getShortDescription();

	/**
	 * Returns the value of the '<em><b>Notice</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notice</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notice</em>' attribute list.
	 * @see org.omg.xmi.XmiPackage#getDocumentation_Notice()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='notice' group='#group:0'"
	 * @generated
	 */
	EList<String> getNotice();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' attribute list.
	 * @see org.omg.xmi.XmiPackage#getDocumentation_Owner()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='owner' group='#group:0'"
	 * @generated
	 */
	EList<String> getOwner();

	/**
	 * Returns the value of the '<em><b>Contact1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact1</em>' attribute.
	 * @see #setContact1(String)
	 * @see org.omg.xmi.XmiPackage#getDocumentation_Contact1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='contact'"
	 * @generated
	 */
	String getContact1();

	/**
	 * Sets the value of the '{@link org.omg.xmi.Documentation#getContact1 <em>Contact1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact1</em>' attribute.
	 * @see #getContact1()
	 * @generated
	 */
	void setContact1(String value);

	/**
	 * Returns the value of the '<em><b>Exporter1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exporter1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exporter1</em>' attribute.
	 * @see #setExporter1(String)
	 * @see org.omg.xmi.XmiPackage#getDocumentation_Exporter1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='exporter'"
	 * @generated
	 */
	String getExporter1();

	/**
	 * Sets the value of the '{@link org.omg.xmi.Documentation#getExporter1 <em>Exporter1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exporter1</em>' attribute.
	 * @see #getExporter1()
	 * @generated
	 */
	void setExporter1(String value);

	/**
	 * Returns the value of the '<em><b>Exporter Version1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exporter Version1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exporter Version1</em>' attribute.
	 * @see #setExporterVersion1(String)
	 * @see org.omg.xmi.XmiPackage#getDocumentation_ExporterVersion1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='exporterVersion'"
	 * @generated
	 */
	String getExporterVersion1();

	/**
	 * Sets the value of the '{@link org.omg.xmi.Documentation#getExporterVersion1 <em>Exporter Version1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exporter Version1</em>' attribute.
	 * @see #getExporterVersion1()
	 * @generated
	 */
	void setExporterVersion1(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Href</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.omg.xmi.XmiPackage#getDocumentation_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.omg.xmi.Documentation#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Idref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idref</em>' attribute.
	 * @see #setIdref(String)
	 * @see org.omg.xmi.XmiPackage#getDocumentation_Idref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='idref' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIdref();

	/**
	 * Sets the value of the '{@link org.omg.xmi.Documentation#getIdref <em>Idref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idref</em>' attribute.
	 * @see #getIdref()
	 * @generated
	 */
	void setIdref(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.omg.xmi.XmiPackage#getDocumentation_Label()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.omg.xmi.Documentation#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Long Description1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Description1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Description1</em>' attribute.
	 * @see #setLongDescription1(String)
	 * @see org.omg.xmi.XmiPackage#getDocumentation_LongDescription1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='longDescription'"
	 * @generated
	 */
	String getLongDescription1();

	/**
	 * Sets the value of the '{@link org.omg.xmi.Documentation#getLongDescription1 <em>Long Description1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Description1</em>' attribute.
	 * @see #getLongDescription1()
	 * @generated
	 */
	void setLongDescription1(String value);

	/**
	 * Returns the value of the '<em><b>Notice1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notice1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notice1</em>' attribute.
	 * @see #setNotice1(String)
	 * @see org.omg.xmi.XmiPackage#getDocumentation_Notice1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='notice'"
	 * @generated
	 */
	String getNotice1();

	/**
	 * Sets the value of the '{@link org.omg.xmi.Documentation#getNotice1 <em>Notice1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notice1</em>' attribute.
	 * @see #getNotice1()
	 * @generated
	 */
	void setNotice1(String value);

	/**
	 * Returns the value of the '<em><b>Owner1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner1</em>' attribute.
	 * @see #setOwner1(String)
	 * @see org.omg.xmi.XmiPackage#getDocumentation_Owner1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='owner'"
	 * @generated
	 */
	String getOwner1();

	/**
	 * Sets the value of the '{@link org.omg.xmi.Documentation#getOwner1 <em>Owner1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner1</em>' attribute.
	 * @see #getOwner1()
	 * @generated
	 */
	void setOwner1(String value);

	/**
	 * Returns the value of the '<em><b>Short Description1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Description1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Description1</em>' attribute.
	 * @see #setShortDescription1(String)
	 * @see org.omg.xmi.XmiPackage#getDocumentation_ShortDescription1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='shortDescription'"
	 * @generated
	 */
	String getShortDescription1();

	/**
	 * Sets the value of the '{@link org.omg.xmi.Documentation#getShortDescription1 <em>Short Description1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Description1</em>' attribute.
	 * @see #getShortDescription1()
	 * @generated
	 */
	void setShortDescription1(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(QName)
	 * @see org.omg.xmi.XmiPackage#getDocumentation_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getType();

	/**
	 * Sets the value of the '{@link org.omg.xmi.Documentation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(QName value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see org.omg.xmi.XmiPackage#getDocumentation_Uuid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='uuid' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link org.omg.xmi.Documentation#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"2.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(String)
	 * @see org.omg.xmi.XmiPackage#getDocumentation_Version()
	 * @model default="2.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.omg.xmi.Documentation#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Unsets the value of the '{@link org.omg.xmi.Documentation#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link org.omg.xmi.Documentation#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	boolean isSetVersion();

} // Documentation
