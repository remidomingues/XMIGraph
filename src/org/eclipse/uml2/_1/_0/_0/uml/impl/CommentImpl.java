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

import org.eclipse.uml2._1._0._0.uml.Comment;
import org.eclipse.uml2._1._0._0.uml.Element;
import org.eclipse.uml2._1._0._0.uml.StringExpression;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CommentImpl#getGroup4 <em>Group4</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CommentImpl#getAnnotatedElement <em>Annotated Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CommentImpl#getBodyExpression <em>Body Expression</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CommentImpl#getAnnotatedElement1 <em>Annotated Element1</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.CommentImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommentImpl extends TemplateableElementImpl implements Comment
{
	/**
	 * The cached value of the '{@link #getGroup4() <em>Group4</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup4()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group4;

	/**
	 * The default value of the '{@link #getAnnotatedElement1() <em>Annotated Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedElement1()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNOTATED_ELEMENT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotatedElement1() <em>Annotated Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedElement1()
	 * @generated
	 * @ordered
	 */
	protected String annotatedElement1 = ANNOTATED_ELEMENT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl()
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
		return UmlPackage.eINSTANCE.getComment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup4()
	{
		if (group4 == null)
		{
			group4 = new BasicFeatureMap(this, UmlPackage.COMMENT__GROUP4);
		}
		return group4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getAnnotatedElement()
	{
		return getGroup4().list(UmlPackage.eINSTANCE.getComment_AnnotatedElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StringExpression> getBodyExpression()
	{
		return getGroup4().list(UmlPackage.eINSTANCE.getComment_BodyExpression());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnnotatedElement1()
	{
		return annotatedElement1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatedElement1(String newAnnotatedElement1)
	{
		String oldAnnotatedElement1 = annotatedElement1;
		annotatedElement1 = newAnnotatedElement1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.COMMENT__ANNOTATED_ELEMENT1, oldAnnotatedElement1, annotatedElement1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody()
	{
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody)
	{
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.COMMENT__BODY, oldBody, body));
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
			case UmlPackage.COMMENT__GROUP4:
				return ((InternalEList<?>)getGroup4()).basicRemove(otherEnd, msgs);
			case UmlPackage.COMMENT__ANNOTATED_ELEMENT:
				return ((InternalEList<?>)getAnnotatedElement()).basicRemove(otherEnd, msgs);
			case UmlPackage.COMMENT__BODY_EXPRESSION:
				return ((InternalEList<?>)getBodyExpression()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.COMMENT__GROUP4:
				if (coreType) return getGroup4();
				return ((FeatureMap.Internal)getGroup4()).getWrapper();
			case UmlPackage.COMMENT__ANNOTATED_ELEMENT:
				return getAnnotatedElement();
			case UmlPackage.COMMENT__BODY_EXPRESSION:
				return getBodyExpression();
			case UmlPackage.COMMENT__ANNOTATED_ELEMENT1:
				return getAnnotatedElement1();
			case UmlPackage.COMMENT__BODY:
				return getBody();
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
			case UmlPackage.COMMENT__GROUP4:
				((FeatureMap.Internal)getGroup4()).set(newValue);
				return;
			case UmlPackage.COMMENT__ANNOTATED_ELEMENT:
				getAnnotatedElement().clear();
				getAnnotatedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case UmlPackage.COMMENT__BODY_EXPRESSION:
				getBodyExpression().clear();
				getBodyExpression().addAll((Collection<? extends StringExpression>)newValue);
				return;
			case UmlPackage.COMMENT__ANNOTATED_ELEMENT1:
				setAnnotatedElement1((String)newValue);
				return;
			case UmlPackage.COMMENT__BODY:
				setBody((String)newValue);
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
			case UmlPackage.COMMENT__GROUP4:
				getGroup4().clear();
				return;
			case UmlPackage.COMMENT__ANNOTATED_ELEMENT:
				getAnnotatedElement().clear();
				return;
			case UmlPackage.COMMENT__BODY_EXPRESSION:
				getBodyExpression().clear();
				return;
			case UmlPackage.COMMENT__ANNOTATED_ELEMENT1:
				setAnnotatedElement1(ANNOTATED_ELEMENT1_EDEFAULT);
				return;
			case UmlPackage.COMMENT__BODY:
				setBody(BODY_EDEFAULT);
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
			case UmlPackage.COMMENT__GROUP4:
				return group4 != null && !group4.isEmpty();
			case UmlPackage.COMMENT__ANNOTATED_ELEMENT:
				return !getAnnotatedElement().isEmpty();
			case UmlPackage.COMMENT__BODY_EXPRESSION:
				return !getBodyExpression().isEmpty();
			case UmlPackage.COMMENT__ANNOTATED_ELEMENT1:
				return ANNOTATED_ELEMENT1_EDEFAULT == null ? annotatedElement1 != null : !ANNOTATED_ELEMENT1_EDEFAULT.equals(annotatedElement1);
			case UmlPackage.COMMENT__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
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
		result.append(" (group4: ");
		result.append(group4);
		result.append(", annotatedElement1: ");
		result.append(annotatedElement1);
		result.append(", body: ");
		result.append(body);
		result.append(')');
		return result.toString();
	}

} //CommentImpl
