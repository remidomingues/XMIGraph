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

import org.eclipse.uml2._1._0._0.uml.AggregationKind;
import org.eclipse.uml2._1._0._0.uml.Association;
import org.eclipse.uml2._1._0._0.uml.ConnectorEnd;
import org.eclipse.uml2._1._0._0.uml.Deployment;
import org.eclipse.uml2._1._0._0.uml.Property;
import org.eclipse.uml2._1._0._0.uml.TemplateParameter;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PropertyImpl#getGroup6 <em>Group6</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PropertyImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PropertyImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PropertyImpl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PropertyImpl#getRedefinedProperty <em>Redefined Property</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PropertyImpl#getSubsettedProperty <em>Subsetted Property</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PropertyImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PropertyImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PropertyImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PropertyImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PropertyImpl#getAssociation1 <em>Association1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PropertyImpl#getEnd1 <em>End1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PropertyImpl#getIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PropertyImpl#getIsDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PropertyImpl#getRedefinedProperty1 <em>Redefined Property1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PropertyImpl#getSubsettedProperty1 <em>Subsetted Property1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.PropertyImpl#getTemplateParameter1 <em>Template Parameter1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends StructuralFeatureImpl implements Property
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
	 * The default value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationKind AGGREGATION_EDEFAULT = AggregationKind.NONE;

	/**
	 * The cached value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected AggregationKind aggregation = AGGREGATION_EDEFAULT;

	/**
	 * This is true if the Aggregation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aggregationESet;

	/**
	 * The default value of the '{@link #getAssociation1() <em>Association1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation1()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociation1() <em>Association1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation1()
	 * @generated
	 * @ordered
	 */
	protected String association1 = ASSOCIATION1_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd1() <em>End1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd1()
	 * @generated
	 * @ordered
	 */
	protected static final String END1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd1() <em>End1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd1()
	 * @generated
	 * @ordered
	 */
	protected String end1 = END1_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_DERIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDerived()
	 * @generated
	 * @ordered
	 */
	protected String isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsDerivedUnion() <em>Is Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDerivedUnion()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_DERIVED_UNION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDerivedUnion() <em>Is Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDerivedUnion()
	 * @generated
	 * @ordered
	 */
	protected String isDerivedUnion = IS_DERIVED_UNION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedefinedProperty1() <em>Redefined Property1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedProperty1()
	 * @generated
	 * @ordered
	 */
	protected static final String REDEFINED_PROPERTY1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedefinedProperty1() <em>Redefined Property1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedProperty1()
	 * @generated
	 * @ordered
	 */
	protected String redefinedProperty1 = REDEFINED_PROPERTY1_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubsettedProperty1() <em>Subsetted Property1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsettedProperty1()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSETTED_PROPERTY1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubsettedProperty1() <em>Subsetted Property1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsettedProperty1()
	 * @generated
	 * @ordered
	 */
	protected String subsettedProperty1 = SUBSETTED_PROPERTY1_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl()
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
		return UmlPackage.eINSTANCE.getProperty();
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
			group6 = new BasicFeatureMap(this, UmlPackage.PROPERTY__GROUP6);
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
		return getGroup6().list(UmlPackage.eINSTANCE.getProperty_TemplateParameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorEnd> getEnd()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getProperty_End());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Deployment> getDeployment()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getProperty_Deployment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getRedefinedProperty()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getProperty_RedefinedProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getSubsettedProperty()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getProperty_SubsettedProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getAssociation()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getProperty_Association());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getDefaultValue()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getProperty_DefaultValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getQualifier()
	{
		return getGroup6().list(UmlPackage.eINSTANCE.getProperty_Qualifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationKind getAggregation()
	{
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregation(AggregationKind newAggregation)
	{
		AggregationKind oldAggregation = aggregation;
		aggregation = newAggregation == null ? AGGREGATION_EDEFAULT : newAggregation;
		boolean oldAggregationESet = aggregationESet;
		aggregationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROPERTY__AGGREGATION, oldAggregation, aggregation, !oldAggregationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAggregation()
	{
		AggregationKind oldAggregation = aggregation;
		boolean oldAggregationESet = aggregationESet;
		aggregation = AGGREGATION_EDEFAULT;
		aggregationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.PROPERTY__AGGREGATION, oldAggregation, AGGREGATION_EDEFAULT, oldAggregationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAggregation()
	{
		return aggregationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssociation1()
	{
		return association1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociation1(String newAssociation1)
	{
		String oldAssociation1 = association1;
		association1 = newAssociation1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROPERTY__ASSOCIATION1, oldAssociation1, association1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnd1()
	{
		return end1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd1(String newEnd1)
	{
		String oldEnd1 = end1;
		end1 = newEnd1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROPERTY__END1, oldEnd1, end1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsDerived()
	{
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(String newIsDerived)
	{
		String oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROPERTY__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsDerivedUnion()
	{
		return isDerivedUnion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerivedUnion(String newIsDerivedUnion)
	{
		String oldIsDerivedUnion = isDerivedUnion;
		isDerivedUnion = newIsDerivedUnion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROPERTY__IS_DERIVED_UNION, oldIsDerivedUnion, isDerivedUnion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedefinedProperty1()
	{
		return redefinedProperty1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedProperty1(String newRedefinedProperty1)
	{
		String oldRedefinedProperty1 = redefinedProperty1;
		redefinedProperty1 = newRedefinedProperty1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROPERTY__REDEFINED_PROPERTY1, oldRedefinedProperty1, redefinedProperty1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubsettedProperty1()
	{
		return subsettedProperty1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsettedProperty1(String newSubsettedProperty1)
	{
		String oldSubsettedProperty1 = subsettedProperty1;
		subsettedProperty1 = newSubsettedProperty1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROPERTY__SUBSETTED_PROPERTY1, oldSubsettedProperty1, subsettedProperty1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROPERTY__TEMPLATE_PARAMETER1, oldTemplateParameter1, templateParameter1));
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
			case UmlPackage.PROPERTY__GROUP6:
				return ((InternalEList<?>)getGroup6()).basicRemove(otherEnd, msgs);
			case UmlPackage.PROPERTY__TEMPLATE_PARAMETER:
				return ((InternalEList<?>)getTemplateParameter()).basicRemove(otherEnd, msgs);
			case UmlPackage.PROPERTY__END:
				return ((InternalEList<?>)getEnd()).basicRemove(otherEnd, msgs);
			case UmlPackage.PROPERTY__DEPLOYMENT:
				return ((InternalEList<?>)getDeployment()).basicRemove(otherEnd, msgs);
			case UmlPackage.PROPERTY__REDEFINED_PROPERTY:
				return ((InternalEList<?>)getRedefinedProperty()).basicRemove(otherEnd, msgs);
			case UmlPackage.PROPERTY__SUBSETTED_PROPERTY:
				return ((InternalEList<?>)getSubsettedProperty()).basicRemove(otherEnd, msgs);
			case UmlPackage.PROPERTY__ASSOCIATION:
				return ((InternalEList<?>)getAssociation()).basicRemove(otherEnd, msgs);
			case UmlPackage.PROPERTY__DEFAULT_VALUE:
				return ((InternalEList<?>)getDefaultValue()).basicRemove(otherEnd, msgs);
			case UmlPackage.PROPERTY__QUALIFIER:
				return ((InternalEList<?>)getQualifier()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.PROPERTY__GROUP6:
				if (coreType) return getGroup6();
				return ((FeatureMap.Internal)getGroup6()).getWrapper();
			case UmlPackage.PROPERTY__TEMPLATE_PARAMETER:
				return getTemplateParameter();
			case UmlPackage.PROPERTY__END:
				return getEnd();
			case UmlPackage.PROPERTY__DEPLOYMENT:
				return getDeployment();
			case UmlPackage.PROPERTY__REDEFINED_PROPERTY:
				return getRedefinedProperty();
			case UmlPackage.PROPERTY__SUBSETTED_PROPERTY:
				return getSubsettedProperty();
			case UmlPackage.PROPERTY__ASSOCIATION:
				return getAssociation();
			case UmlPackage.PROPERTY__DEFAULT_VALUE:
				return getDefaultValue();
			case UmlPackage.PROPERTY__QUALIFIER:
				return getQualifier();
			case UmlPackage.PROPERTY__AGGREGATION:
				return getAggregation();
			case UmlPackage.PROPERTY__ASSOCIATION1:
				return getAssociation1();
			case UmlPackage.PROPERTY__END1:
				return getEnd1();
			case UmlPackage.PROPERTY__IS_DERIVED:
				return getIsDerived();
			case UmlPackage.PROPERTY__IS_DERIVED_UNION:
				return getIsDerivedUnion();
			case UmlPackage.PROPERTY__REDEFINED_PROPERTY1:
				return getRedefinedProperty1();
			case UmlPackage.PROPERTY__SUBSETTED_PROPERTY1:
				return getSubsettedProperty1();
			case UmlPackage.PROPERTY__TEMPLATE_PARAMETER1:
				return getTemplateParameter1();
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
			case UmlPackage.PROPERTY__GROUP6:
				((FeatureMap.Internal)getGroup6()).set(newValue);
				return;
			case UmlPackage.PROPERTY__TEMPLATE_PARAMETER:
				getTemplateParameter().clear();
				getTemplateParameter().addAll((Collection<? extends TemplateParameter>)newValue);
				return;
			case UmlPackage.PROPERTY__END:
				getEnd().clear();
				getEnd().addAll((Collection<? extends ConnectorEnd>)newValue);
				return;
			case UmlPackage.PROPERTY__DEPLOYMENT:
				getDeployment().clear();
				getDeployment().addAll((Collection<? extends Deployment>)newValue);
				return;
			case UmlPackage.PROPERTY__REDEFINED_PROPERTY:
				getRedefinedProperty().clear();
				getRedefinedProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case UmlPackage.PROPERTY__SUBSETTED_PROPERTY:
				getSubsettedProperty().clear();
				getSubsettedProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case UmlPackage.PROPERTY__ASSOCIATION:
				getAssociation().clear();
				getAssociation().addAll((Collection<? extends Association>)newValue);
				return;
			case UmlPackage.PROPERTY__DEFAULT_VALUE:
				getDefaultValue().clear();
				getDefaultValue().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UmlPackage.PROPERTY__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends Property>)newValue);
				return;
			case UmlPackage.PROPERTY__AGGREGATION:
				setAggregation((AggregationKind)newValue);
				return;
			case UmlPackage.PROPERTY__ASSOCIATION1:
				setAssociation1((String)newValue);
				return;
			case UmlPackage.PROPERTY__END1:
				setEnd1((String)newValue);
				return;
			case UmlPackage.PROPERTY__IS_DERIVED:
				setIsDerived((String)newValue);
				return;
			case UmlPackage.PROPERTY__IS_DERIVED_UNION:
				setIsDerivedUnion((String)newValue);
				return;
			case UmlPackage.PROPERTY__REDEFINED_PROPERTY1:
				setRedefinedProperty1((String)newValue);
				return;
			case UmlPackage.PROPERTY__SUBSETTED_PROPERTY1:
				setSubsettedProperty1((String)newValue);
				return;
			case UmlPackage.PROPERTY__TEMPLATE_PARAMETER1:
				setTemplateParameter1((String)newValue);
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
			case UmlPackage.PROPERTY__GROUP6:
				getGroup6().clear();
				return;
			case UmlPackage.PROPERTY__TEMPLATE_PARAMETER:
				getTemplateParameter().clear();
				return;
			case UmlPackage.PROPERTY__END:
				getEnd().clear();
				return;
			case UmlPackage.PROPERTY__DEPLOYMENT:
				getDeployment().clear();
				return;
			case UmlPackage.PROPERTY__REDEFINED_PROPERTY:
				getRedefinedProperty().clear();
				return;
			case UmlPackage.PROPERTY__SUBSETTED_PROPERTY:
				getSubsettedProperty().clear();
				return;
			case UmlPackage.PROPERTY__ASSOCIATION:
				getAssociation().clear();
				return;
			case UmlPackage.PROPERTY__DEFAULT_VALUE:
				getDefaultValue().clear();
				return;
			case UmlPackage.PROPERTY__QUALIFIER:
				getQualifier().clear();
				return;
			case UmlPackage.PROPERTY__AGGREGATION:
				unsetAggregation();
				return;
			case UmlPackage.PROPERTY__ASSOCIATION1:
				setAssociation1(ASSOCIATION1_EDEFAULT);
				return;
			case UmlPackage.PROPERTY__END1:
				setEnd1(END1_EDEFAULT);
				return;
			case UmlPackage.PROPERTY__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case UmlPackage.PROPERTY__IS_DERIVED_UNION:
				setIsDerivedUnion(IS_DERIVED_UNION_EDEFAULT);
				return;
			case UmlPackage.PROPERTY__REDEFINED_PROPERTY1:
				setRedefinedProperty1(REDEFINED_PROPERTY1_EDEFAULT);
				return;
			case UmlPackage.PROPERTY__SUBSETTED_PROPERTY1:
				setSubsettedProperty1(SUBSETTED_PROPERTY1_EDEFAULT);
				return;
			case UmlPackage.PROPERTY__TEMPLATE_PARAMETER1:
				setTemplateParameter1(TEMPLATE_PARAMETER1_EDEFAULT);
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
			case UmlPackage.PROPERTY__GROUP6:
				return group6 != null && !group6.isEmpty();
			case UmlPackage.PROPERTY__TEMPLATE_PARAMETER:
				return !getTemplateParameter().isEmpty();
			case UmlPackage.PROPERTY__END:
				return !getEnd().isEmpty();
			case UmlPackage.PROPERTY__DEPLOYMENT:
				return !getDeployment().isEmpty();
			case UmlPackage.PROPERTY__REDEFINED_PROPERTY:
				return !getRedefinedProperty().isEmpty();
			case UmlPackage.PROPERTY__SUBSETTED_PROPERTY:
				return !getSubsettedProperty().isEmpty();
			case UmlPackage.PROPERTY__ASSOCIATION:
				return !getAssociation().isEmpty();
			case UmlPackage.PROPERTY__DEFAULT_VALUE:
				return !getDefaultValue().isEmpty();
			case UmlPackage.PROPERTY__QUALIFIER:
				return !getQualifier().isEmpty();
			case UmlPackage.PROPERTY__AGGREGATION:
				return isSetAggregation();
			case UmlPackage.PROPERTY__ASSOCIATION1:
				return ASSOCIATION1_EDEFAULT == null ? association1 != null : !ASSOCIATION1_EDEFAULT.equals(association1);
			case UmlPackage.PROPERTY__END1:
				return END1_EDEFAULT == null ? end1 != null : !END1_EDEFAULT.equals(end1);
			case UmlPackage.PROPERTY__IS_DERIVED:
				return IS_DERIVED_EDEFAULT == null ? isDerived != null : !IS_DERIVED_EDEFAULT.equals(isDerived);
			case UmlPackage.PROPERTY__IS_DERIVED_UNION:
				return IS_DERIVED_UNION_EDEFAULT == null ? isDerivedUnion != null : !IS_DERIVED_UNION_EDEFAULT.equals(isDerivedUnion);
			case UmlPackage.PROPERTY__REDEFINED_PROPERTY1:
				return REDEFINED_PROPERTY1_EDEFAULT == null ? redefinedProperty1 != null : !REDEFINED_PROPERTY1_EDEFAULT.equals(redefinedProperty1);
			case UmlPackage.PROPERTY__SUBSETTED_PROPERTY1:
				return SUBSETTED_PROPERTY1_EDEFAULT == null ? subsettedProperty1 != null : !SUBSETTED_PROPERTY1_EDEFAULT.equals(subsettedProperty1);
			case UmlPackage.PROPERTY__TEMPLATE_PARAMETER1:
				return TEMPLATE_PARAMETER1_EDEFAULT == null ? templateParameter1 != null : !TEMPLATE_PARAMETER1_EDEFAULT.equals(templateParameter1);
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
		result.append(", aggregation: ");
		if (aggregationESet) result.append(aggregation); else result.append("<unset>");
		result.append(", association1: ");
		result.append(association1);
		result.append(", end1: ");
		result.append(end1);
		result.append(", isDerived: ");
		result.append(isDerived);
		result.append(", isDerivedUnion: ");
		result.append(isDerivedUnion);
		result.append(", redefinedProperty1: ");
		result.append(redefinedProperty1);
		result.append(", subsettedProperty1: ");
		result.append(subsettedProperty1);
		result.append(", templateParameter1: ");
		result.append(templateParameter1);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
