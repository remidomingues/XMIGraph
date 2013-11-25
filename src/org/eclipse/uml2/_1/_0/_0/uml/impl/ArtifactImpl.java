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

import org.eclipse.uml2._1._0._0.uml.Artifact;
import org.eclipse.uml2._1._0._0.uml.Manifestation;
import org.eclipse.uml2._1._0._0.uml.Operation;
import org.eclipse.uml2._1._0._0.uml.Property;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ArtifactImpl#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ArtifactImpl#getNestedArtifact <em>Nested Artifact</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ArtifactImpl#getManifestation <em>Manifestation</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ArtifactImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ArtifactImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ArtifactImpl#getFileName <em>File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactImpl extends ClassifierImpl implements Artifact
{
	/**
	 * The cached value of the '{@link #getGroup7() <em>Group7</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup7()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group7;

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl()
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
		return UmlPackage.eINSTANCE.getArtifact();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup7()
	{
		if (group7 == null)
		{
			group7 = new BasicFeatureMap(this, UmlPackage.ARTIFACT__GROUP7);
		}
		return group7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artifact> getNestedArtifact()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getArtifact_NestedArtifact());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Manifestation> getManifestation()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getArtifact_Manifestation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperation()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getArtifact_OwnedOperation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getArtifact_OwnedAttribute());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName()
	{
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName)
	{
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ARTIFACT__FILE_NAME, oldFileName, fileName));
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
			case UmlPackage.ARTIFACT__GROUP7:
				return ((InternalEList<?>)getGroup7()).basicRemove(otherEnd, msgs);
			case UmlPackage.ARTIFACT__NESTED_ARTIFACT:
				return ((InternalEList<?>)getNestedArtifact()).basicRemove(otherEnd, msgs);
			case UmlPackage.ARTIFACT__MANIFESTATION:
				return ((InternalEList<?>)getManifestation()).basicRemove(otherEnd, msgs);
			case UmlPackage.ARTIFACT__OWNED_OPERATION:
				return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
			case UmlPackage.ARTIFACT__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.ARTIFACT__GROUP7:
				if (coreType) return getGroup7();
				return ((FeatureMap.Internal)getGroup7()).getWrapper();
			case UmlPackage.ARTIFACT__NESTED_ARTIFACT:
				return getNestedArtifact();
			case UmlPackage.ARTIFACT__MANIFESTATION:
				return getManifestation();
			case UmlPackage.ARTIFACT__OWNED_OPERATION:
				return getOwnedOperation();
			case UmlPackage.ARTIFACT__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case UmlPackage.ARTIFACT__FILE_NAME:
				return getFileName();
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
			case UmlPackage.ARTIFACT__GROUP7:
				((FeatureMap.Internal)getGroup7()).set(newValue);
				return;
			case UmlPackage.ARTIFACT__NESTED_ARTIFACT:
				getNestedArtifact().clear();
				getNestedArtifact().addAll((Collection<? extends Artifact>)newValue);
				return;
			case UmlPackage.ARTIFACT__MANIFESTATION:
				getManifestation().clear();
				getManifestation().addAll((Collection<? extends Manifestation>)newValue);
				return;
			case UmlPackage.ARTIFACT__OWNED_OPERATION:
				getOwnedOperation().clear();
				getOwnedOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case UmlPackage.ARTIFACT__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case UmlPackage.ARTIFACT__FILE_NAME:
				setFileName((String)newValue);
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
			case UmlPackage.ARTIFACT__GROUP7:
				getGroup7().clear();
				return;
			case UmlPackage.ARTIFACT__NESTED_ARTIFACT:
				getNestedArtifact().clear();
				return;
			case UmlPackage.ARTIFACT__MANIFESTATION:
				getManifestation().clear();
				return;
			case UmlPackage.ARTIFACT__OWNED_OPERATION:
				getOwnedOperation().clear();
				return;
			case UmlPackage.ARTIFACT__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
			case UmlPackage.ARTIFACT__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
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
			case UmlPackage.ARTIFACT__GROUP7:
				return group7 != null && !group7.isEmpty();
			case UmlPackage.ARTIFACT__NESTED_ARTIFACT:
				return !getNestedArtifact().isEmpty();
			case UmlPackage.ARTIFACT__MANIFESTATION:
				return !getManifestation().isEmpty();
			case UmlPackage.ARTIFACT__OWNED_OPERATION:
				return !getOwnedOperation().isEmpty();
			case UmlPackage.ARTIFACT__OWNED_ATTRIBUTE:
				return !getOwnedAttribute().isEmpty();
			case UmlPackage.ARTIFACT__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
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
		result.append(" (group7: ");
		result.append(group7);
		result.append(", fileName: ");
		result.append(fileName);
		result.append(')');
		return result.toString();
	}

} //ArtifactImpl
