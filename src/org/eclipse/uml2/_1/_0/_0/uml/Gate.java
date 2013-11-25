/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.uml2._1._0._0.uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A Gate is a connection point for relating a Message outside an InteractionFragment with a Message inside the InteractionFragment. Gate is a specialization of MessageEnd. Gates are connected through Messages. A Gate is actually a representative of an EventOccurrence that is not in the same scope as the Gate. Gates play different roles: we have formal gates on Interactions, actual gates on InteractionOccurrences, expression gates on CombinedFragments.
 *       
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage#getGate()
 * @model extendedMetaData="name='Gate' kind='elementOnly'"
 * @generated
 */
public interface Gate extends MessageEnd
{
} // Gate
