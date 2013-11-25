/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.uml2._1._0._0.uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Link Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         This action can be used to create links and link objects. There is no return value in either case. This is so that no change of the action is required if the association is changed to an association class or vice versa. CreateLinkAction uses a specialization of LinkEndData called LinkEndCreationData, to support ordered associations. The insertion point is specified at runtime by an additional input pin, which is required for ordered association ends and omitted for unordered ends. The insertion point is a positive integer giving the position to insert the link, or infinity, to insert at the end. Reinserting an existing end at a new position moves the end to that position. CreateLinkAction also uses LinkEndCreationData to support the destruction of existing links of the association that connect any of the objects of the new link. When the link is created, this option is available on an end-by-end basis, and causes all links of the association emanating from the specified ends to be destroyed before the new link is created.
 *       
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getCreateLinkAction()
 * @model extendedMetaData="name='CreateLinkAction' kind='elementOnly'"
 * @generated
 */
public interface CreateLinkAction extends WriteLinkAction
{
} // CreateLinkAction
