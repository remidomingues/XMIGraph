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

import org.eclipse.uml2._1._0._0.uml.Classifier;
import org.eclipse.uml2._1._0._0.uml.CollaborationOccurrence;
import org.eclipse.uml2._1._0._0.uml.Generalization;
import org.eclipse.uml2._1._0._0.uml.GeneralizationSet;
import org.eclipse.uml2._1._0._0.uml.Substitution;
import org.eclipse.uml2._1._0._0.uml.TemplateParameter;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.UseCase;
import org.eclipse.uml2._1._0._0.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClassifierImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClassifierImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClassifierImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClassifierImpl#getRedefinedClassifier <em>Redefined Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClassifierImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClassifierImpl#getPowertypeExtent <em>Powertype Extent</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClassifierImpl#getOwnedUseCase <em>Owned Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClassifierImpl#getUseCase <em>Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClassifierImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClassifierImpl#getOccurrence <em>Occurrence</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClassifierImpl#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClassifierImpl#getIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClassifierImpl#getPackageableElementVisibility <em>Packageable Element Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClassifierImpl#getPowertypeExtent1 <em>Powertype Extent1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClassifierImpl#getRedefinedClassifier1 <em>Redefined Classifier1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClassifierImpl#getRepresentation1 <em>Representation1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClassifierImpl#getTemplateParameter1 <em>Template Parameter1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.ClassifierImpl#getUseCase1 <em>Use Case1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassifierImpl extends NamespaceImpl implements Classifier
{
	/**
	 * The cached value of the '{@link #getGroup6() <em>Group6</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup6()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group6;

	/**
	 * The default value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected String isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_LEAF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected String isLeaf = IS_LEAF_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageableElementVisibility() <em>Packageable Element Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageableElementVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC;

	/**
	 * The cached value of the '{@link #getPackageableElementVisibility() <em>Packageable Element Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageableElementVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind packageableElementVisibility = PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;

	/**
	 * This is true if the Packageable Element Visibility attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean packageableElementVisibilityESet;

	/**
	 * The default value of the '{@link #getPowertypeExtent1() <em>Powertype Extent1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowertypeExtent1()
	 * @generated
	 * @ordered
	 */
	protected static final String POWERTYPE_EXTENT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPowertypeExtent1() <em>Powertype Extent1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowertypeExtent1()
	 * @generated
	 * @ordered
	 */
	protected String powertypeExtent1 = POWERTYPE_EXTENT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedefinedClassifier1() <em>Redefined Classifier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedClassifier1()
	 * @generated
	 * @ordered
	 */
	protected static final String REDEFINED_CLASSIFIER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedefinedClassifier1() <em>Redefined Classifier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedClassifier1()
	 * @generated
	 * @ordered
	 */
	protected String redefinedClassifier1 = REDEFINED_CLASSIFIER1_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepresentation1() <em>Representation1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation1()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRESENTATION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepresentation1() <em>Representation1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation1()
	 * @generated
	 * @ordered
	 */
	protected String representation1 = REPRESENTATION1_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateParameter1() <em>Template Parameter1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter1()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_PARAMETER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateParameter1() <em>Template Parameter1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter1()
	 * @generated
	 * @ordered
	 */
	protected String templateParameter1 = TEMPLATE_PARAMETER1_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseCase1() <em>Use Case1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCase1()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_CASE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseCase1() <em>Use Case1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCase1()
	 * @generated
	 * @ordered
	 */
	protected String useCase1 = USE_CASE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierImpl()
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
		return UmlPackage.eINSTANCE.getClassifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup6()
	{
		if (group6 == null)
		{
			group6 = new BasicFeatureMap(this, UmlPackage.CLASSIFIER__GROUP6);
		}
		return group6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateParameter> getTemplateParameter()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getClassifier_TemplateParameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralization()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getClassifier_Generalization());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRedefinedClassifier()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getClassifier_RedefinedClassifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Substitution> getSubstitution()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getClassifier_Substitution());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralizationSet> getPowertypeExtent()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getClassifier_PowertypeExtent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getOwnedUseCase()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getClassifier_OwnedUseCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getUseCase()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getClassifier_UseCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollaborationOccurrence> getRepresentation()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getClassifier_Representation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollaborationOccurrence> getOccurrence()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getClassifier_Occurrence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsAbstract()
	{
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(String newIsAbstract)
	{
		String oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLASSIFIER__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsLeaf()
	{
		return isLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(String newIsLeaf)
	{
		String oldIsLeaf = isLeaf;
		isLeaf = newIsLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLASSIFIER__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getPackageableElementVisibility()
	{
		return packageableElementVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageableElementVisibility(VisibilityKind newPackageableElementVisibility)
	{
		VisibilityKind oldPackageableElementVisibility = packageableElementVisibility;
		packageableElementVisibility = newPackageableElementVisibility == null ? PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT : newPackageableElementVisibility;
		boolean oldPackageableElementVisibilityESet = packageableElementVisibilityESet;
		packageableElementVisibilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY, oldPackageableElementVisibility, packageableElementVisibility, !oldPackageableElementVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPackageableElementVisibility()
	{
		VisibilityKind oldPackageableElementVisibility = packageableElementVisibility;
		boolean oldPackageableElementVisibilityESet = packageableElementVisibilityESet;
		packageableElementVisibility = PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
		packageableElementVisibilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY, oldPackageableElementVisibility, PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT, oldPackageableElementVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPackageableElementVisibility()
	{
		return packageableElementVisibilityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPowertypeExtent1()
	{
		return powertypeExtent1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowertypeExtent1(String newPowertypeExtent1)
	{
		String oldPowertypeExtent1 = powertypeExtent1;
		powertypeExtent1 = newPowertypeExtent1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLASSIFIER__POWERTYPE_EXTENT1, oldPowertypeExtent1, powertypeExtent1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedefinedClassifier1()
	{
		return redefinedClassifier1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedClassifier1(String newRedefinedClassifier1)
	{
		String oldRedefinedClassifier1 = redefinedClassifier1;
		redefinedClassifier1 = newRedefinedClassifier1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLASSIFIER__REDEFINED_CLASSIFIER1, oldRedefinedClassifier1, redefinedClassifier1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepresentation1()
	{
		return representation1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation1(String newRepresentation1)
	{
		String oldRepresentation1 = representation1;
		representation1 = newRepresentation1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLASSIFIER__REPRESENTATION1, oldRepresentation1, representation1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplateParameter1()
	{
		return templateParameter1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameter1(String newTemplateParameter1)
	{
		String oldTemplateParameter1 = templateParameter1;
		templateParameter1 = newTemplateParameter1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLASSIFIER__TEMPLATE_PARAMETER1, oldTemplateParameter1, templateParameter1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUseCase1()
	{
		return useCase1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseCase1(String newUseCase1)
	{
		String oldUseCase1 = useCase1;
		useCase1 = newUseCase1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLASSIFIER__USE_CASE1, oldUseCase1, useCase1));
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
			case UmlPackage.CLASSIFIER__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.CLASSIFIER__TEMPLATE_PARAMETER:
				return ((InternalEList<?>)getTemplateParameter()).basicRemove(otherEnd, msgs);
			case UmlPackage.CLASSIFIER__GENERALIZATION:
				return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
			case UmlPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
				return ((InternalEList<?>)getRedefinedClassifier()).basicRemove(otherEnd, msgs);
			case UmlPackage.CLASSIFIER__SUBSTITUTION:
				return ((InternalEList<?>)getSubstitution()).basicRemove(otherEnd, msgs);
			case UmlPackage.CLASSIFIER__POWERTYPE_EXTENT:
				return ((InternalEList<?>)getPowertypeExtent()).basicRemove(otherEnd, msgs);
			case UmlPackage.CLASSIFIER__OWNED_USE_CASE:
				return ((InternalEList<?>)getOwnedUseCase()).basicRemove(otherEnd, msgs);
			case UmlPackage.CLASSIFIER__USE_CASE:
				return ((InternalEList<?>)getUseCase()).basicRemove(otherEnd, msgs);
			case UmlPackage.CLASSIFIER__REPRESENTATION:
				return ((InternalEList<?>)getRepresentation()).basicRemove(otherEnd, msgs);
			case UmlPackage.CLASSIFIER__OCCURRENCE:
				return ((InternalEList<?>)getOccurrence()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.CLASSIFIER__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.CLASSIFIER__TEMPLATE_PARAMETER:
				return getTemplateParameter();
			case UmlPackage.CLASSIFIER__GENERALIZATION:
				return getGeneralization();
			case UmlPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
				return getRedefinedClassifier();
			case UmlPackage.CLASSIFIER__SUBSTITUTION:
				return getSubstitution();
			case UmlPackage.CLASSIFIER__POWERTYPE_EXTENT:
				return getPowertypeExtent();
			case UmlPackage.CLASSIFIER__OWNED_USE_CASE:
				return getOwnedUseCase();
			case UmlPackage.CLASSIFIER__USE_CASE:
				return getUseCase();
			case UmlPackage.CLASSIFIER__REPRESENTATION:
				return getRepresentation();
			case UmlPackage.CLASSIFIER__OCCURRENCE:
				return getOccurrence();
			case UmlPackage.CLASSIFIER__IS_ABSTRACT:
				return getIsAbstract();
			case UmlPackage.CLASSIFIER__IS_LEAF:
				return getIsLeaf();
			case UmlPackage.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElementVisibility();
			case UmlPackage.CLASSIFIER__POWERTYPE_EXTENT1:
				return getPowertypeExtent1();
			case UmlPackage.CLASSIFIER__REDEFINED_CLASSIFIER1:
				return getRedefinedClassifier1();
			case UmlPackage.CLASSIFIER__REPRESENTATION1:
				return getRepresentation1();
			case UmlPackage.CLASSIFIER__TEMPLATE_PARAMETER1:
				return getTemplateParameter1();
			case UmlPackage.CLASSIFIER__USE_CASE1:
				return getUseCase1();
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
			case UmlPackage.CLASSIFIER__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.CLASSIFIER__TEMPLATE_PARAMETER:
				getTemplateParameter().clear();
				getTemplateParameter().addAll((Collection<? extends TemplateParameter>)newValue);
				return;
			case UmlPackage.CLASSIFIER__GENERALIZATION:
				getGeneralization().clear();
				getGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case UmlPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
				getRedefinedClassifier().clear();
				getRedefinedClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case UmlPackage.CLASSIFIER__SUBSTITUTION:
				getSubstitution().clear();
				getSubstitution().addAll((Collection<? extends Substitution>)newValue);
				return;
			case UmlPackage.CLASSIFIER__POWERTYPE_EXTENT:
				getPowertypeExtent().clear();
				getPowertypeExtent().addAll((Collection<? extends GeneralizationSet>)newValue);
				return;
			case UmlPackage.CLASSIFIER__OWNED_USE_CASE:
				getOwnedUseCase().clear();
				getOwnedUseCase().addAll((Collection<? extends UseCase>)newValue);
				return;
			case UmlPackage.CLASSIFIER__USE_CASE:
				getUseCase().clear();
				getUseCase().addAll((Collection<? extends UseCase>)newValue);
				return;
			case UmlPackage.CLASSIFIER__REPRESENTATION:
				getRepresentation().clear();
				getRepresentation().addAll((Collection<? extends CollaborationOccurrence>)newValue);
				return;
			case UmlPackage.CLASSIFIER__OCCURRENCE:
				getOccurrence().clear();
				getOccurrence().addAll((Collection<? extends CollaborationOccurrence>)newValue);
				return;
			case UmlPackage.CLASSIFIER__IS_ABSTRACT:
				setIsAbstract((String)newValue);
				return;
			case UmlPackage.CLASSIFIER__IS_LEAF:
				setIsLeaf((String)newValue);
				return;
			case UmlPackage.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElementVisibility((VisibilityKind)newValue);
				return;
			case UmlPackage.CLASSIFIER__POWERTYPE_EXTENT1:
				setPowertypeExtent1((String)newValue);
				return;
			case UmlPackage.CLASSIFIER__REDEFINED_CLASSIFIER1:
				setRedefinedClassifier1((String)newValue);
				return;
			case UmlPackage.CLASSIFIER__REPRESENTATION1:
				setRepresentation1((String)newValue);
				return;
			case UmlPackage.CLASSIFIER__TEMPLATE_PARAMETER1:
				setTemplateParameter1((String)newValue);
				return;
			case UmlPackage.CLASSIFIER__USE_CASE1:
				setUseCase1((String)newValue);
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
			case UmlPackage.CLASSIFIER__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.CLASSIFIER__TEMPLATE_PARAMETER:
				getTemplateParameter().clear();
				return;
			case UmlPackage.CLASSIFIER__GENERALIZATION:
				getGeneralization().clear();
				return;
			case UmlPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
				getRedefinedClassifier().clear();
				return;
			case UmlPackage.CLASSIFIER__SUBSTITUTION:
				getSubstitution().clear();
				return;
			case UmlPackage.CLASSIFIER__POWERTYPE_EXTENT:
				getPowertypeExtent().clear();
				return;
			case UmlPackage.CLASSIFIER__OWNED_USE_CASE:
				getOwnedUseCase().clear();
				return;
			case UmlPackage.CLASSIFIER__USE_CASE:
				getUseCase().clear();
				return;
			case UmlPackage.CLASSIFIER__REPRESENTATION:
				getRepresentation().clear();
				return;
			case UmlPackage.CLASSIFIER__OCCURRENCE:
				getOccurrence().clear();
				return;
			case UmlPackage.CLASSIFIER__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UmlPackage.CLASSIFIER__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UmlPackage.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				unsetPackageableElementVisibility();
				return;
			case UmlPackage.CLASSIFIER__POWERTYPE_EXTENT1:
				setPowertypeExtent1(POWERTYPE_EXTENT1_EDEFAULT);
				return;
			case UmlPackage.CLASSIFIER__REDEFINED_CLASSIFIER1:
				setRedefinedClassifier1(REDEFINED_CLASSIFIER1_EDEFAULT);
				return;
			case UmlPackage.CLASSIFIER__REPRESENTATION1:
				setRepresentation1(REPRESENTATION1_EDEFAULT);
				return;
			case UmlPackage.CLASSIFIER__TEMPLATE_PARAMETER1:
				setTemplateParameter1(TEMPLATE_PARAMETER1_EDEFAULT);
				return;
			case UmlPackage.CLASSIFIER__USE_CASE1:
				setUseCase1(USE_CASE1_EDEFAULT);
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
			case UmlPackage.CLASSIFIER__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.CLASSIFIER__TEMPLATE_PARAMETER:
				return !getTemplateParameter().isEmpty();
			case UmlPackage.CLASSIFIER__GENERALIZATION:
				return !getGeneralization().isEmpty();
			case UmlPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
				return !getRedefinedClassifier().isEmpty();
			case UmlPackage.CLASSIFIER__SUBSTITUTION:
				return !getSubstitution().isEmpty();
			case UmlPackage.CLASSIFIER__POWERTYPE_EXTENT:
				return !getPowertypeExtent().isEmpty();
			case UmlPackage.CLASSIFIER__OWNED_USE_CASE:
				return !getOwnedUseCase().isEmpty();
			case UmlPackage.CLASSIFIER__USE_CASE:
				return !getUseCase().isEmpty();
			case UmlPackage.CLASSIFIER__REPRESENTATION:
				return !getRepresentation().isEmpty();
			case UmlPackage.CLASSIFIER__OCCURRENCE:
				return !getOccurrence().isEmpty();
			case UmlPackage.CLASSIFIER__IS_ABSTRACT:
				return IS_ABSTRACT_EDEFAULT == null ? isAbstract != null : !IS_ABSTRACT_EDEFAULT.equals(isAbstract);
			case UmlPackage.CLASSIFIER__IS_LEAF:
				return IS_LEAF_EDEFAULT == null ? isLeaf != null : !IS_LEAF_EDEFAULT.equals(isLeaf);
			case UmlPackage.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElementVisibility();
			case UmlPackage.CLASSIFIER__POWERTYPE_EXTENT1:
				return POWERTYPE_EXTENT1_EDEFAULT == null ? powertypeExtent1 != null : !POWERTYPE_EXTENT1_EDEFAULT.equals(powertypeExtent1);
			case UmlPackage.CLASSIFIER__REDEFINED_CLASSIFIER1:
				return REDEFINED_CLASSIFIER1_EDEFAULT == null ? redefinedClassifier1 != null : !REDEFINED_CLASSIFIER1_EDEFAULT.equals(redefinedClassifier1);
			case UmlPackage.CLASSIFIER__REPRESENTATION1:
				return REPRESENTATION1_EDEFAULT == null ? representation1 != null : !REPRESENTATION1_EDEFAULT.equals(representation1);
			case UmlPackage.CLASSIFIER__TEMPLATE_PARAMETER1:
				return TEMPLATE_PARAMETER1_EDEFAULT == null ? templateParameter1 != null : !TEMPLATE_PARAMETER1_EDEFAULT.equals(templateParameter1);
			case UmlPackage.CLASSIFIER__USE_CASE1:
				return USE_CASE1_EDEFAULT == null ? useCase1 != null : !USE_CASE1_EDEFAULT.equals(useCase1);
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
		result.append(" (group6: ");
		result.append(group6);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", isLeaf: ");
		result.append(isLeaf);
		result.append(", packageableElementVisibility: ");
		if (packageableElementVisibilityESet) result.append(packageableElementVisibility); else result.append("<unset>");
		result.append(", powertypeExtent1: ");
		result.append(powertypeExtent1);
		result.append(", redefinedClassifier1: ");
		result.append(redefinedClassifier1);
		result.append(", representation1: ");
		result.append(representation1);
		result.append(", templateParameter1: ");
		result.append(templateParameter1);
		result.append(", useCase1: ");
		result.append(useCase1);
		result.append(')');
		return result.toString();
	}

} //ClassifierImpl
