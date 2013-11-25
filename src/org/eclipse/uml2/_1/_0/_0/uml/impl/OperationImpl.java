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

import org.eclipse.uml2._1._0._0.uml.Constraint;
import org.eclipse.uml2._1._0._0.uml.Operation;
import org.eclipse.uml2._1._0._0.uml.Parameter;
import org.eclipse.uml2._1._0._0.uml.TemplateParameter;
import org.eclipse.uml2._1._0._0.uml.Type;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OperationImpl#getGroup7 <em>Group7</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OperationImpl#getType1 <em>Type1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OperationImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OperationImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OperationImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OperationImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OperationImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OperationImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OperationImpl#getRedefinedOperation <em>Redefined Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OperationImpl#getBodyCondition <em>Body Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OperationImpl#getBodyCondition1 <em>Body Condition1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OperationImpl#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OperationImpl#getIsQuery <em>Is Query</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OperationImpl#getIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OperationImpl#getPostcondition1 <em>Postcondition1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OperationImpl#getPrecondition1 <em>Precondition1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OperationImpl#getRedefinedOperation1 <em>Redefined Operation1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OperationImpl#getTemplateParameter1 <em>Template Parameter1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.OperationImpl#getType2 <em>Type2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends BehavioralFeatureImpl implements Operation
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
	 * The default value of the '{@link #getBodyCondition1() <em>Body Condition1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyCondition1()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_CONDITION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBodyCondition1() <em>Body Condition1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyCondition1()
	 * @generated
	 * @ordered
	 */
	protected String bodyCondition1 = BODY_CONDITION1_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_ORDERED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected String isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsQuery() <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsQuery() <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsQuery()
	 * @generated
	 * @ordered
	 */
	protected String isQuery = IS_QUERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_UNIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnique()
	 * @generated
	 * @ordered
	 */
	protected String isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostcondition1() <em>Postcondition1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition1()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTCONDITION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostcondition1() <em>Postcondition1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition1()
	 * @generated
	 * @ordered
	 */
	protected String postcondition1 = POSTCONDITION1_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecondition1() <em>Precondition1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition1()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECONDITION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecondition1() <em>Precondition1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition1()
	 * @generated
	 * @ordered
	 */
	protected String precondition1 = PRECONDITION1_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedefinedOperation1() <em>Redefined Operation1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedOperation1()
	 * @generated
	 * @ordered
	 */
	protected static final String REDEFINED_OPERATION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedefinedOperation1() <em>Redefined Operation1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedOperation1()
	 * @generated
	 * @ordered
	 */
	protected String redefinedOperation1 = REDEFINED_OPERATION1_EDEFAULT;

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
	 * The default value of the '{@link #getType2() <em>Type2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType2()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType2() <em>Type2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType2()
	 * @generated
	 * @ordered
	 */
	protected String type2 = TYPE2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl()
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
		return UmlPackage.eINSTANCE.getOperation();
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
			group7 = new BasicFeatureMap(this, UmlPackage.OPERATION__GROUP7);
		}
		return group7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getType1()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getOperation_Type1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getUpperValue()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getOperation_UpperValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getLowerValue()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getOperation_LowerValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateParameter> getTemplateParameter()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getOperation_TemplateParameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getOwnedParameter()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getOperation_OwnedParameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPrecondition()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getOperation_Precondition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPostcondition()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getOperation_Postcondition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getRedefinedOperation()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getOperation_RedefinedOperation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getBodyCondition()
	{
		return getGroup7().list(UmlPackage.eINSTANCE.getOperation_BodyCondition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBodyCondition1()
	{
		return bodyCondition1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyCondition1(String newBodyCondition1)
	{
		String oldBodyCondition1 = bodyCondition1;
		bodyCondition1 = newBodyCondition1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OPERATION__BODY_CONDITION1, oldBodyCondition1, bodyCondition1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsOrdered()
	{
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(String newIsOrdered)
	{
		String oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OPERATION__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsQuery()
	{
		return isQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsQuery(String newIsQuery)
	{
		String oldIsQuery = isQuery;
		isQuery = newIsQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OPERATION__IS_QUERY, oldIsQuery, isQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsUnique()
	{
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(String newIsUnique)
	{
		String oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OPERATION__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostcondition1()
	{
		return postcondition1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostcondition1(String newPostcondition1)
	{
		String oldPostcondition1 = postcondition1;
		postcondition1 = newPostcondition1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OPERATION__POSTCONDITION1, oldPostcondition1, postcondition1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrecondition1()
	{
		return precondition1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecondition1(String newPrecondition1)
	{
		String oldPrecondition1 = precondition1;
		precondition1 = newPrecondition1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OPERATION__PRECONDITION1, oldPrecondition1, precondition1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedefinedOperation1()
	{
		return redefinedOperation1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedOperation1(String newRedefinedOperation1)
	{
		String oldRedefinedOperation1 = redefinedOperation1;
		redefinedOperation1 = newRedefinedOperation1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OPERATION__REDEFINED_OPERATION1, oldRedefinedOperation1, redefinedOperation1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OPERATION__TEMPLATE_PARAMETER1, oldTemplateParameter1, templateParameter1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType2()
	{
		return type2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType2(String newType2)
	{
		String oldType2 = type2;
		type2 = newType2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OPERATION__TYPE2, oldType2, type2));
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
			case UmlPackage.OPERATION__GROUP7:
				return ((InternalEList<?>)getGroup7()).basicRemove(otherEnd, msgs);
			case UmlPackage.OPERATION__TYPE1:
				return ((InternalEList<?>)getType1()).basicRemove(otherEnd, msgs);
			case UmlPackage.OPERATION__UPPER_VALUE:
				return ((InternalEList<?>)getUpperValue()).basicRemove(otherEnd, msgs);
			case UmlPackage.OPERATION__LOWER_VALUE:
				return ((InternalEList<?>)getLowerValue()).basicRemove(otherEnd, msgs);
			case UmlPackage.OPERATION__TEMPLATE_PARAMETER:
				return ((InternalEList<?>)getTemplateParameter()).basicRemove(otherEnd, msgs);
			case UmlPackage.OPERATION__OWNED_PARAMETER:
				return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
			case UmlPackage.OPERATION__PRECONDITION:
				return ((InternalEList<?>)getPrecondition()).basicRemove(otherEnd, msgs);
			case UmlPackage.OPERATION__POSTCONDITION:
				return ((InternalEList<?>)getPostcondition()).basicRemove(otherEnd, msgs);
			case UmlPackage.OPERATION__REDEFINED_OPERATION:
				return ((InternalEList<?>)getRedefinedOperation()).basicRemove(otherEnd, msgs);
			case UmlPackage.OPERATION__BODY_CONDITION:
				return ((InternalEList<?>)getBodyCondition()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.OPERATION__GROUP7:
				if (coreType) return getGroup7();
				return ((FeatureMap.Internal)getGroup7()).getWrapper();
			case UmlPackage.OPERATION__TYPE1:
				return getType1();
			case UmlPackage.OPERATION__UPPER_VALUE:
				return getUpperValue();
			case UmlPackage.OPERATION__LOWER_VALUE:
				return getLowerValue();
			case UmlPackage.OPERATION__TEMPLATE_PARAMETER:
				return getTemplateParameter();
			case UmlPackage.OPERATION__OWNED_PARAMETER:
				return getOwnedParameter();
			case UmlPackage.OPERATION__PRECONDITION:
				return getPrecondition();
			case UmlPackage.OPERATION__POSTCONDITION:
				return getPostcondition();
			case UmlPackage.OPERATION__REDEFINED_OPERATION:
				return getRedefinedOperation();
			case UmlPackage.OPERATION__BODY_CONDITION:
				return getBodyCondition();
			case UmlPackage.OPERATION__BODY_CONDITION1:
				return getBodyCondition1();
			case UmlPackage.OPERATION__IS_ORDERED:
				return getIsOrdered();
			case UmlPackage.OPERATION__IS_QUERY:
				return getIsQuery();
			case UmlPackage.OPERATION__IS_UNIQUE:
				return getIsUnique();
			case UmlPackage.OPERATION__POSTCONDITION1:
				return getPostcondition1();
			case UmlPackage.OPERATION__PRECONDITION1:
				return getPrecondition1();
			case UmlPackage.OPERATION__REDEFINED_OPERATION1:
				return getRedefinedOperation1();
			case UmlPackage.OPERATION__TEMPLATE_PARAMETER1:
				return getTemplateParameter1();
			case UmlPackage.OPERATION__TYPE2:
				return getType2();
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
			case UmlPackage.OPERATION__GROUP7:
				((FeatureMap.Internal)getGroup7()).set(newValue);
				return;
			case UmlPackage.OPERATION__TYPE1:
				getType1().clear();
				getType1().addAll((Collection<? extends Type>)newValue);
				return;
			case UmlPackage.OPERATION__UPPER_VALUE:
				getUpperValue().clear();
				getUpperValue().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UmlPackage.OPERATION__LOWER_VALUE:
				getLowerValue().clear();
				getLowerValue().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UmlPackage.OPERATION__TEMPLATE_PARAMETER:
				getTemplateParameter().clear();
				getTemplateParameter().addAll((Collection<? extends TemplateParameter>)newValue);
				return;
			case UmlPackage.OPERATION__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case UmlPackage.OPERATION__PRECONDITION:
				getPrecondition().clear();
				getPrecondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case UmlPackage.OPERATION__POSTCONDITION:
				getPostcondition().clear();
				getPostcondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case UmlPackage.OPERATION__REDEFINED_OPERATION:
				getRedefinedOperation().clear();
				getRedefinedOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case UmlPackage.OPERATION__BODY_CONDITION:
				getBodyCondition().clear();
				getBodyCondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case UmlPackage.OPERATION__BODY_CONDITION1:
				setBodyCondition1((String)newValue);
				return;
			case UmlPackage.OPERATION__IS_ORDERED:
				setIsOrdered((String)newValue);
				return;
			case UmlPackage.OPERATION__IS_QUERY:
				setIsQuery((String)newValue);
				return;
			case UmlPackage.OPERATION__IS_UNIQUE:
				setIsUnique((String)newValue);
				return;
			case UmlPackage.OPERATION__POSTCONDITION1:
				setPostcondition1((String)newValue);
				return;
			case UmlPackage.OPERATION__PRECONDITION1:
				setPrecondition1((String)newValue);
				return;
			case UmlPackage.OPERATION__REDEFINED_OPERATION1:
				setRedefinedOperation1((String)newValue);
				return;
			case UmlPackage.OPERATION__TEMPLATE_PARAMETER1:
				setTemplateParameter1((String)newValue);
				return;
			case UmlPackage.OPERATION__TYPE2:
				setType2((String)newValue);
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
			case UmlPackage.OPERATION__GROUP7:
				getGroup7().clear();
				return;
			case UmlPackage.OPERATION__TYPE1:
				getType1().clear();
				return;
			case UmlPackage.OPERATION__UPPER_VALUE:
				getUpperValue().clear();
				return;
			case UmlPackage.OPERATION__LOWER_VALUE:
				getLowerValue().clear();
				return;
			case UmlPackage.OPERATION__TEMPLATE_PARAMETER:
				getTemplateParameter().clear();
				return;
			case UmlPackage.OPERATION__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case UmlPackage.OPERATION__PRECONDITION:
				getPrecondition().clear();
				return;
			case UmlPackage.OPERATION__POSTCONDITION:
				getPostcondition().clear();
				return;
			case UmlPackage.OPERATION__REDEFINED_OPERATION:
				getRedefinedOperation().clear();
				return;
			case UmlPackage.OPERATION__BODY_CONDITION:
				getBodyCondition().clear();
				return;
			case UmlPackage.OPERATION__BODY_CONDITION1:
				setBodyCondition1(BODY_CONDITION1_EDEFAULT);
				return;
			case UmlPackage.OPERATION__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UmlPackage.OPERATION__IS_QUERY:
				setIsQuery(IS_QUERY_EDEFAULT);
				return;
			case UmlPackage.OPERATION__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UmlPackage.OPERATION__POSTCONDITION1:
				setPostcondition1(POSTCONDITION1_EDEFAULT);
				return;
			case UmlPackage.OPERATION__PRECONDITION1:
				setPrecondition1(PRECONDITION1_EDEFAULT);
				return;
			case UmlPackage.OPERATION__REDEFINED_OPERATION1:
				setRedefinedOperation1(REDEFINED_OPERATION1_EDEFAULT);
				return;
			case UmlPackage.OPERATION__TEMPLATE_PARAMETER1:
				setTemplateParameter1(TEMPLATE_PARAMETER1_EDEFAULT);
				return;
			case UmlPackage.OPERATION__TYPE2:
				setType2(TYPE2_EDEFAULT);
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
			case UmlPackage.OPERATION__GROUP7:
				return group7 != null && !group7.isEmpty();
			case UmlPackage.OPERATION__TYPE1:
				return !getType1().isEmpty();
			case UmlPackage.OPERATION__UPPER_VALUE:
				return !getUpperValue().isEmpty();
			case UmlPackage.OPERATION__LOWER_VALUE:
				return !getLowerValue().isEmpty();
			case UmlPackage.OPERATION__TEMPLATE_PARAMETER:
				return !getTemplateParameter().isEmpty();
			case UmlPackage.OPERATION__OWNED_PARAMETER:
				return !getOwnedParameter().isEmpty();
			case UmlPackage.OPERATION__PRECONDITION:
				return !getPrecondition().isEmpty();
			case UmlPackage.OPERATION__POSTCONDITION:
				return !getPostcondition().isEmpty();
			case UmlPackage.OPERATION__REDEFINED_OPERATION:
				return !getRedefinedOperation().isEmpty();
			case UmlPackage.OPERATION__BODY_CONDITION:
				return !getBodyCondition().isEmpty();
			case UmlPackage.OPERATION__BODY_CONDITION1:
				return BODY_CONDITION1_EDEFAULT == null ? bodyCondition1 != null : !BODY_CONDITION1_EDEFAULT.equals(bodyCondition1);
			case UmlPackage.OPERATION__IS_ORDERED:
				return IS_ORDERED_EDEFAULT == null ? isOrdered != null : !IS_ORDERED_EDEFAULT.equals(isOrdered);
			case UmlPackage.OPERATION__IS_QUERY:
				return IS_QUERY_EDEFAULT == null ? isQuery != null : !IS_QUERY_EDEFAULT.equals(isQuery);
			case UmlPackage.OPERATION__IS_UNIQUE:
				return IS_UNIQUE_EDEFAULT == null ? isUnique != null : !IS_UNIQUE_EDEFAULT.equals(isUnique);
			case UmlPackage.OPERATION__POSTCONDITION1:
				return POSTCONDITION1_EDEFAULT == null ? postcondition1 != null : !POSTCONDITION1_EDEFAULT.equals(postcondition1);
			case UmlPackage.OPERATION__PRECONDITION1:
				return PRECONDITION1_EDEFAULT == null ? precondition1 != null : !PRECONDITION1_EDEFAULT.equals(precondition1);
			case UmlPackage.OPERATION__REDEFINED_OPERATION1:
				return REDEFINED_OPERATION1_EDEFAULT == null ? redefinedOperation1 != null : !REDEFINED_OPERATION1_EDEFAULT.equals(redefinedOperation1);
			case UmlPackage.OPERATION__TEMPLATE_PARAMETER1:
				return TEMPLATE_PARAMETER1_EDEFAULT == null ? templateParameter1 != null : !TEMPLATE_PARAMETER1_EDEFAULT.equals(templateParameter1);
			case UmlPackage.OPERATION__TYPE2:
				return TYPE2_EDEFAULT == null ? type2 != null : !TYPE2_EDEFAULT.equals(type2);
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
		result.append(", bodyCondition1: ");
		result.append(bodyCondition1);
		result.append(", isOrdered: ");
		result.append(isOrdered);
		result.append(", isQuery: ");
		result.append(isQuery);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", postcondition1: ");
		result.append(postcondition1);
		result.append(", precondition1: ");
		result.append(precondition1);
		result.append(", redefinedOperation1: ");
		result.append(redefinedOperation1);
		result.append(", templateParameter1: ");
		result.append(templateParameter1);
		result.append(", type2: ");
		result.append(type2);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
