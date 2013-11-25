/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.uml2._1._0._0.uml.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2._1._0._0.uml.Abstraction;
import org.eclipse.uml2._1._0._0.uml.AcceptCallAction;
import org.eclipse.uml2._1._0._0.uml.AcceptEventAction;
import org.eclipse.uml2._1._0._0.uml.Action;
import org.eclipse.uml2._1._0._0.uml.Activity;
import org.eclipse.uml2._1._0._0.uml.ActivityEdge;
import org.eclipse.uml2._1._0._0.uml.ActivityFinalNode;
import org.eclipse.uml2._1._0._0.uml.ActivityGroup;
import org.eclipse.uml2._1._0._0.uml.ActivityNode;
import org.eclipse.uml2._1._0._0.uml.ActivityParameterNode;
import org.eclipse.uml2._1._0._0.uml.ActivityPartition;
import org.eclipse.uml2._1._0._0.uml.Actor;
import org.eclipse.uml2._1._0._0.uml.AddStructuralFeatureValueAction;
import org.eclipse.uml2._1._0._0.uml.AddVariableValueAction;
import org.eclipse.uml2._1._0._0.uml.AnyTrigger;
import org.eclipse.uml2._1._0._0.uml.ApplyFunctionAction;
import org.eclipse.uml2._1._0._0.uml.Artifact;
import org.eclipse.uml2._1._0._0.uml.Association;
import org.eclipse.uml2._1._0._0.uml.AssociationClass;
import org.eclipse.uml2._1._0._0.uml.Behavior;
import org.eclipse.uml2._1._0._0.uml.BehavioralFeature;
import org.eclipse.uml2._1._0._0.uml.BehavioredClassifier;
import org.eclipse.uml2._1._0._0.uml.BroadcastSignalAction;
import org.eclipse.uml2._1._0._0.uml.CallAction;
import org.eclipse.uml2._1._0._0.uml.CallBehaviorAction;
import org.eclipse.uml2._1._0._0.uml.CallOperationAction;
import org.eclipse.uml2._1._0._0.uml.CallTrigger;
import org.eclipse.uml2._1._0._0.uml.CentralBufferNode;
import org.eclipse.uml2._1._0._0.uml.ChangeTrigger;
import org.eclipse.uml2._1._0._0.uml.Classifier;
import org.eclipse.uml2._1._0._0.uml.ClassifierTemplateParameter;
import org.eclipse.uml2._1._0._0.uml.Clause;
import org.eclipse.uml2._1._0._0.uml.ClearAssociationAction;
import org.eclipse.uml2._1._0._0.uml.ClearStructuralFeatureAction;
import org.eclipse.uml2._1._0._0.uml.ClearVariableAction;
import org.eclipse.uml2._1._0._0.uml.Collaboration;
import org.eclipse.uml2._1._0._0.uml.CollaborationOccurrence;
import org.eclipse.uml2._1._0._0.uml.CombinedFragment;
import org.eclipse.uml2._1._0._0.uml.Comment;
import org.eclipse.uml2._1._0._0.uml.CommunicationPath;
import org.eclipse.uml2._1._0._0.uml.Component;
import org.eclipse.uml2._1._0._0.uml.ConditionalNode;
import org.eclipse.uml2._1._0._0.uml.ConnectableElement;
import org.eclipse.uml2._1._0._0.uml.ConnectableElementTemplateParameter;
import org.eclipse.uml2._1._0._0.uml.ConnectionPointReference;
import org.eclipse.uml2._1._0._0.uml.Connector;
import org.eclipse.uml2._1._0._0.uml.ConnectorEnd;
import org.eclipse.uml2._1._0._0.uml.Constraint;
import org.eclipse.uml2._1._0._0.uml.Continuation;
import org.eclipse.uml2._1._0._0.uml.ControlFlow;
import org.eclipse.uml2._1._0._0.uml.ControlNode;
import org.eclipse.uml2._1._0._0.uml.CreateLinkAction;
import org.eclipse.uml2._1._0._0.uml.CreateLinkObjectAction;
import org.eclipse.uml2._1._0._0.uml.CreateObjectAction;
import org.eclipse.uml2._1._0._0.uml.DataStoreNode;
import org.eclipse.uml2._1._0._0.uml.DataType;
import org.eclipse.uml2._1._0._0.uml.DecisionNode;
import org.eclipse.uml2._1._0._0.uml.Dependency;
import org.eclipse.uml2._1._0._0.uml.DeployedArtifact;
import org.eclipse.uml2._1._0._0.uml.Deployment;
import org.eclipse.uml2._1._0._0.uml.DeploymentSpecification;
import org.eclipse.uml2._1._0._0.uml.DeploymentTarget;
import org.eclipse.uml2._1._0._0.uml.DestroyLinkAction;
import org.eclipse.uml2._1._0._0.uml.DestroyObjectAction;
import org.eclipse.uml2._1._0._0.uml.Device;
import org.eclipse.uml2._1._0._0.uml.DirectedRelationship;
import org.eclipse.uml2._1._0._0.uml.DocumentRoot;
import org.eclipse.uml2._1._0._0.uml.Duration;
import org.eclipse.uml2._1._0._0.uml.DurationConstraint;
import org.eclipse.uml2._1._0._0.uml.DurationInterval;
import org.eclipse.uml2._1._0._0.uml.DurationObservationAction;
import org.eclipse.uml2._1._0._0.uml.Element;
import org.eclipse.uml2._1._0._0.uml.ElementImport;
import org.eclipse.uml2._1._0._0.uml.EncapsulatedClassifier;
import org.eclipse.uml2._1._0._0.uml.Enumeration;
import org.eclipse.uml2._1._0._0.uml.EnumerationLiteral;
import org.eclipse.uml2._1._0._0.uml.EventOccurrence;
import org.eclipse.uml2._1._0._0.uml.ExceptionHandler;
import org.eclipse.uml2._1._0._0.uml.ExecutableNode;
import org.eclipse.uml2._1._0._0.uml.ExecutionEnvironment;
import org.eclipse.uml2._1._0._0.uml.ExecutionOccurrence;
import org.eclipse.uml2._1._0._0.uml.ExpansionNode;
import org.eclipse.uml2._1._0._0.uml.ExpansionRegion;
import org.eclipse.uml2._1._0._0.uml.Expression;
import org.eclipse.uml2._1._0._0.uml.Extend;
import org.eclipse.uml2._1._0._0.uml.Extension;
import org.eclipse.uml2._1._0._0.uml.ExtensionEnd;
import org.eclipse.uml2._1._0._0.uml.ExtensionPoint;
import org.eclipse.uml2._1._0._0.uml.Feature;
import org.eclipse.uml2._1._0._0.uml.FinalNode;
import org.eclipse.uml2._1._0._0.uml.FinalState;
import org.eclipse.uml2._1._0._0.uml.FlowFinalNode;
import org.eclipse.uml2._1._0._0.uml.ForkNode;
import org.eclipse.uml2._1._0._0.uml.Gate;
import org.eclipse.uml2._1._0._0.uml.GeneralOrdering;
import org.eclipse.uml2._1._0._0.uml.Generalization;
import org.eclipse.uml2._1._0._0.uml.GeneralizationSet;
import org.eclipse.uml2._1._0._0.uml.Implementation;
import org.eclipse.uml2._1._0._0.uml.Include;
import org.eclipse.uml2._1._0._0.uml.InformationFlow;
import org.eclipse.uml2._1._0._0.uml.InformationItem;
import org.eclipse.uml2._1._0._0.uml.InitialNode;
import org.eclipse.uml2._1._0._0.uml.InputPin;
import org.eclipse.uml2._1._0._0.uml.InstanceSpecification;
import org.eclipse.uml2._1._0._0.uml.InstanceValue;
import org.eclipse.uml2._1._0._0.uml.Interaction;
import org.eclipse.uml2._1._0._0.uml.InteractionConstraint;
import org.eclipse.uml2._1._0._0.uml.InteractionFragment;
import org.eclipse.uml2._1._0._0.uml.InteractionOccurrence;
import org.eclipse.uml2._1._0._0.uml.InteractionOperand;
import org.eclipse.uml2._1._0._0.uml.Interface;
import org.eclipse.uml2._1._0._0.uml.InterruptibleActivityRegion;
import org.eclipse.uml2._1._0._0.uml.Interval;
import org.eclipse.uml2._1._0._0.uml.IntervalConstraint;
import org.eclipse.uml2._1._0._0.uml.InvocationAction;
import org.eclipse.uml2._1._0._0.uml.JoinNode;
import org.eclipse.uml2._1._0._0.uml.Lifeline;
import org.eclipse.uml2._1._0._0.uml.LinkAction;
import org.eclipse.uml2._1._0._0.uml.LinkEndCreationData;
import org.eclipse.uml2._1._0._0.uml.LinkEndData;
import org.eclipse.uml2._1._0._0.uml.LiteralBoolean;
import org.eclipse.uml2._1._0._0.uml.LiteralInteger;
import org.eclipse.uml2._1._0._0.uml.LiteralNull;
import org.eclipse.uml2._1._0._0.uml.LiteralSpecification;
import org.eclipse.uml2._1._0._0.uml.LiteralString;
import org.eclipse.uml2._1._0._0.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2._1._0._0.uml.LoopNode;
import org.eclipse.uml2._1._0._0.uml.Manifestation;
import org.eclipse.uml2._1._0._0.uml.MergeNode;
import org.eclipse.uml2._1._0._0.uml.Message;
import org.eclipse.uml2._1._0._0.uml.MessageEnd;
import org.eclipse.uml2._1._0._0.uml.MessageTrigger;
import org.eclipse.uml2._1._0._0.uml.Model;
import org.eclipse.uml2._1._0._0.uml.MultiplicityElement;
import org.eclipse.uml2._1._0._0.uml.NamedElement;
import org.eclipse.uml2._1._0._0.uml.Namespace;
import org.eclipse.uml2._1._0._0.uml.Node;
import org.eclipse.uml2._1._0._0.uml.ObjectFlow;
import org.eclipse.uml2._1._0._0.uml.ObjectNode;
import org.eclipse.uml2._1._0._0.uml.OpaqueExpression;
import org.eclipse.uml2._1._0._0.uml.Operation;
import org.eclipse.uml2._1._0._0.uml.OperationTemplateParameter;
import org.eclipse.uml2._1._0._0.uml.OutputPin;
import org.eclipse.uml2._1._0._0.uml.PackageImport;
import org.eclipse.uml2._1._0._0.uml.PackageMerge;
import org.eclipse.uml2._1._0._0.uml.PackageableElement;
import org.eclipse.uml2._1._0._0.uml.Parameter;
import org.eclipse.uml2._1._0._0.uml.ParameterSet;
import org.eclipse.uml2._1._0._0.uml.ParameterableClassifier;
import org.eclipse.uml2._1._0._0.uml.ParameterableElement;
import org.eclipse.uml2._1._0._0.uml.PartDecomposition;
import org.eclipse.uml2._1._0._0.uml.Permission;
import org.eclipse.uml2._1._0._0.uml.Pin;
import org.eclipse.uml2._1._0._0.uml.Port;
import org.eclipse.uml2._1._0._0.uml.PrimitiveFunction;
import org.eclipse.uml2._1._0._0.uml.PrimitiveType;
import org.eclipse.uml2._1._0._0.uml.Profile;
import org.eclipse.uml2._1._0._0.uml.ProfileApplication;
import org.eclipse.uml2._1._0._0.uml.Property;
import org.eclipse.uml2._1._0._0.uml.ProtocolConformance;
import org.eclipse.uml2._1._0._0.uml.ProtocolStateMachine;
import org.eclipse.uml2._1._0._0.uml.ProtocolTransition;
import org.eclipse.uml2._1._0._0.uml.Pseudostate;
import org.eclipse.uml2._1._0._0.uml.QualifierValue;
import org.eclipse.uml2._1._0._0.uml.RaiseExceptionAction;
import org.eclipse.uml2._1._0._0.uml.ReadExtentAction;
import org.eclipse.uml2._1._0._0.uml.ReadIsClassifiedObjectAction;
import org.eclipse.uml2._1._0._0.uml.ReadLinkAction;
import org.eclipse.uml2._1._0._0.uml.ReadLinkObjectEndAction;
import org.eclipse.uml2._1._0._0.uml.ReadLinkObjectEndQualifierAction;
import org.eclipse.uml2._1._0._0.uml.ReadSelfAction;
import org.eclipse.uml2._1._0._0.uml.ReadStructuralFeatureAction;
import org.eclipse.uml2._1._0._0.uml.ReadVariableAction;
import org.eclipse.uml2._1._0._0.uml.Realization;
import org.eclipse.uml2._1._0._0.uml.Reception;
import org.eclipse.uml2._1._0._0.uml.ReclassifyObjectAction;
import org.eclipse.uml2._1._0._0.uml.RedefinableElement;
import org.eclipse.uml2._1._0._0.uml.RedefinableTemplateSignature;
import org.eclipse.uml2._1._0._0.uml.Region;
import org.eclipse.uml2._1._0._0.uml.Relationship;
import org.eclipse.uml2._1._0._0.uml.RemoveStructuralFeatureValueAction;
import org.eclipse.uml2._1._0._0.uml.RemoveVariableValueAction;
import org.eclipse.uml2._1._0._0.uml.ReplyAction;
import org.eclipse.uml2._1._0._0.uml.SendObjectAction;
import org.eclipse.uml2._1._0._0.uml.SendSignalAction;
import org.eclipse.uml2._1._0._0.uml.Signal;
import org.eclipse.uml2._1._0._0.uml.SignalTrigger;
import org.eclipse.uml2._1._0._0.uml.Slot;
import org.eclipse.uml2._1._0._0.uml.StartOwnedBehaviorAction;
import org.eclipse.uml2._1._0._0.uml.State;
import org.eclipse.uml2._1._0._0.uml.StateInvariant;
import org.eclipse.uml2._1._0._0.uml.StateMachine;
import org.eclipse.uml2._1._0._0.uml.Stereotype;
import org.eclipse.uml2._1._0._0.uml.Stop;
import org.eclipse.uml2._1._0._0.uml.StringExpression;
import org.eclipse.uml2._1._0._0.uml.StructuralFeature;
import org.eclipse.uml2._1._0._0.uml.StructuralFeatureAction;
import org.eclipse.uml2._1._0._0.uml.StructuredActivityNode;
import org.eclipse.uml2._1._0._0.uml.StructuredClassifier;
import org.eclipse.uml2._1._0._0.uml.Substitution;
import org.eclipse.uml2._1._0._0.uml.TemplateBinding;
import org.eclipse.uml2._1._0._0.uml.TemplateParameter;
import org.eclipse.uml2._1._0._0.uml.TemplateParameterSubstitution;
import org.eclipse.uml2._1._0._0.uml.TemplateSignature;
import org.eclipse.uml2._1._0._0.uml.TemplateableClassifier;
import org.eclipse.uml2._1._0._0.uml.TemplateableElement;
import org.eclipse.uml2._1._0._0.uml.TestIdentityAction;
import org.eclipse.uml2._1._0._0.uml.TimeConstraint;
import org.eclipse.uml2._1._0._0.uml.TimeExpression;
import org.eclipse.uml2._1._0._0.uml.TimeInterval;
import org.eclipse.uml2._1._0._0.uml.TimeObservationAction;
import org.eclipse.uml2._1._0._0.uml.TimeTrigger;
import org.eclipse.uml2._1._0._0.uml.Transition;
import org.eclipse.uml2._1._0._0.uml.Trigger;
import org.eclipse.uml2._1._0._0.uml.Type;
import org.eclipse.uml2._1._0._0.uml.TypedElement;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.Usage;
import org.eclipse.uml2._1._0._0.uml.UseCase;
import org.eclipse.uml2._1._0._0.uml.ValuePin;
import org.eclipse.uml2._1._0._0.uml.ValueSpecification;
import org.eclipse.uml2._1._0._0.uml.Variable;
import org.eclipse.uml2._1._0._0.uml.VariableAction;
import org.eclipse.uml2._1._0._0.uml.Vertex;
import org.eclipse.uml2._1._0._0.uml.WriteLinkAction;
import org.eclipse.uml2._1._0._0.uml.WriteStructuralFeatureAction;
import org.eclipse.uml2._1._0._0.uml.WriteVariableAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getAcceptCallAction <em>Accept Call Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getAcceptEventAction <em>Accept Event Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getActivityEdge <em>Activity Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getActivityFinalNode <em>Activity Final Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getActivityGroup <em>Activity Group</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getActivityNode <em>Activity Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getActivityParameterNode <em>Activity Parameter Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getActivityPartition <em>Activity Partition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getAddStructuralFeatureValueAction <em>Add Structural Feature Value Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getAddVariableValueAction <em>Add Variable Value Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getAnyTrigger <em>Any Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getApplyFunctionAction <em>Apply Function Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getAssociationClass <em>Association Class</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getBehavioralFeature <em>Behavioral Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getBehavioredClassifier <em>Behaviored Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getBroadcastSignalAction <em>Broadcast Signal Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getCallAction <em>Call Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getCallBehaviorAction <em>Call Behavior Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getCallOperationAction <em>Call Operation Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getCallTrigger <em>Call Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getCentralBufferNode <em>Central Buffer Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getChangeTrigger <em>Change Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getClassifierTemplateParameter <em>Classifier Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getClause <em>Clause</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getClearAssociationAction <em>Clear Association Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getClearStructuralFeatureAction <em>Clear Structural Feature Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getClearVariableAction <em>Clear Variable Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getCollaboration <em>Collaboration</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getCollaborationOccurrence <em>Collaboration Occurrence</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getCombinedFragment <em>Combined Fragment</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getCommunicationPath <em>Communication Path</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getConditionalNode <em>Conditional Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getConnectableElement <em>Connectable Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getConnectableElementTemplateParameter <em>Connectable Element Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getConnectionPointReference <em>Connection Point Reference</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getConnectorEnd <em>Connector End</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getContinuation <em>Continuation</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getControlFlow <em>Control Flow</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getControlNode <em>Control Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getCreateLinkAction <em>Create Link Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getCreateLinkObjectAction <em>Create Link Object Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getCreateObjectAction <em>Create Object Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getDataStoreNode <em>Data Store Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getDecisionNode <em>Decision Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getDependency <em>Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getDeployedArtifact <em>Deployed Artifact</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getDeploymentSpecification <em>Deployment Specification</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getDeploymentTarget <em>Deployment Target</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getDestroyLinkAction <em>Destroy Link Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getDestroyObjectAction <em>Destroy Object Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getDirectedRelationship <em>Directed Relationship</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getDurationConstraint <em>Duration Constraint</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getDurationInterval <em>Duration Interval</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getDurationObservationAction <em>Duration Observation Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getEncapsulatedClassifier <em>Encapsulated Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getEnumerationLiteral <em>Enumeration Literal</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getEventOccurrence <em>Event Occurrence</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getExceptionHandler <em>Exception Handler</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getExecutableNode <em>Executable Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getExecutionEnvironment <em>Execution Environment</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getExecutionOccurrence <em>Execution Occurrence</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getExpansionNode <em>Expansion Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getExpansionRegion <em>Expansion Region</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getExtend <em>Extend</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getExtensionEnd <em>Extension End</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getExtensionPoint <em>Extension Point</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getFinalNode <em>Final Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getFinalState <em>Final State</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getFlowFinalNode <em>Flow Final Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getForkNode <em>Fork Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getGate <em>Gate</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getGeneralizationSet <em>Generalization Set</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getGeneralOrdering <em>General Ordering</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getInformationFlow <em>Information Flow</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getInformationItem <em>Information Item</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getInitialNode <em>Initial Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getInputPin <em>Input Pin</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getInstanceSpecification <em>Instance Specification</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getInstanceValue <em>Instance Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getInteractionConstraint <em>Interaction Constraint</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getInteractionFragment <em>Interaction Fragment</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getInteractionOccurrence <em>Interaction Occurrence</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getInteractionOperand <em>Interaction Operand</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getInterruptibleActivityRegion <em>Interruptible Activity Region</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getIntervalConstraint <em>Interval Constraint</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getInvocationAction <em>Invocation Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getJoinNode <em>Join Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getLinkAction <em>Link Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getLinkEndCreationData <em>Link End Creation Data</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getLinkEndData <em>Link End Data</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getLiteralBoolean <em>Literal Boolean</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getLiteralInteger <em>Literal Integer</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getLiteralNull <em>Literal Null</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getLiteralSpecification <em>Literal Specification</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getLiteralString <em>Literal String</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getLiteralUnlimitedNatural <em>Literal Unlimited Natural</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getLoopNode <em>Loop Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getManifestation <em>Manifestation</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getMergeNode <em>Merge Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getMessageEnd <em>Message End</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getMessageTrigger <em>Message Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getMultiplicityElement <em>Multiplicity Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getNamedElement <em>Named Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getObjectFlow <em>Object Flow</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getObjectNode <em>Object Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getOpaqueExpression <em>Opaque Expression</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getOperationTemplateParameter <em>Operation Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getOutputPin <em>Output Pin</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getPackageableElement <em>Packageable Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getPackageImport <em>Package Import</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getPackageMerge <em>Package Merge</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getParameterableClassifier <em>Parameterable Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getParameterableElement <em>Parameterable Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getParameterSet <em>Parameter Set</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getPartDecomposition <em>Part Decomposition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getPermission <em>Permission</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getPin <em>Pin</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getPrimitiveFunction <em>Primitive Function</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getPrimitiveType <em>Primitive Type</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getProfileApplication <em>Profile Application</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getProtocolConformance <em>Protocol Conformance</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getProtocolStateMachine <em>Protocol State Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getProtocolTransition <em>Protocol Transition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getPseudostate <em>Pseudostate</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getQualifierValue <em>Qualifier Value</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getRaiseExceptionAction <em>Raise Exception Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getReadExtentAction <em>Read Extent Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getReadIsClassifiedObjectAction <em>Read Is Classified Object Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getReadLinkAction <em>Read Link Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getReadLinkObjectEndAction <em>Read Link Object End Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getReadLinkObjectEndQualifierAction <em>Read Link Object End Qualifier Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getReadSelfAction <em>Read Self Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getReadStructuralFeatureAction <em>Read Structural Feature Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getReadVariableAction <em>Read Variable Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getRealization <em>Realization</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getReception <em>Reception</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getReclassifyObjectAction <em>Reclassify Object Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getRedefinableElement <em>Redefinable Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getRedefinableTemplateSignature <em>Redefinable Template Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getRemoveStructuralFeatureValueAction <em>Remove Structural Feature Value Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getRemoveVariableValueAction <em>Remove Variable Value Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getReplyAction <em>Reply Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getSendObjectAction <em>Send Object Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getSendSignalAction <em>Send Signal Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getSignalTrigger <em>Signal Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getSlot <em>Slot</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getStartOwnedBehaviorAction <em>Start Owned Behavior Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getStateInvariant <em>State Invariant</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getStringExpression <em>String Expression</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getStructuralFeature <em>Structural Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getStructuralFeatureAction <em>Structural Feature Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getStructuredActivityNode <em>Structured Activity Node</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getStructuredClassifier <em>Structured Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getTemplateableClassifier <em>Templateable Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getTemplateableElement <em>Templateable Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getTemplateParameterSubstitution <em>Template Parameter Substitution</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getTemplateSignature <em>Template Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getTestIdentityAction <em>Test Identity Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getTimeConstraint <em>Time Constraint</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getTimeExpression <em>Time Expression</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getTimeObservationAction <em>Time Observation Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getTimeTrigger <em>Time Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getTypedElement <em>Typed Element</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getUseCase <em>Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getValuePin <em>Value Pin</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getValueSpecification <em>Value Specification</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getVariableAction <em>Variable Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getVertex <em>Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getWriteLinkAction <em>Write Link Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getWriteStructuralFeatureAction <em>Write Structural Feature Action</em>}</li>
 *   <li>{@link org.eclipse.uml2._1._0._0.uml.impl.DocumentRootImpl#getWriteVariableAction <em>Write Variable Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot
{
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl()
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
		return UmlPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed()
	{
		if (mixed == null)
		{
			mixed = new BasicFeatureMap(this, UmlPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap()
	{
		if (xMLNSPrefixMap == null)
		{
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, UmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation()
	{
		if (xSISchemaLocation == null)
		{
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, UmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abstraction getAbstraction()
	{
		return (Abstraction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Abstraction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstraction(Abstraction newAbstraction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Abstraction(), newAbstraction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstraction(Abstraction newAbstraction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Abstraction(), newAbstraction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptCallAction getAcceptCallAction()
	{
		return (AcceptCallAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_AcceptCallAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcceptCallAction(AcceptCallAction newAcceptCallAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_AcceptCallAction(), newAcceptCallAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptCallAction(AcceptCallAction newAcceptCallAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_AcceptCallAction(), newAcceptCallAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventAction getAcceptEventAction()
	{
		return (AcceptEventAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_AcceptEventAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcceptEventAction(AcceptEventAction newAcceptEventAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_AcceptEventAction(), newAcceptEventAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptEventAction(AcceptEventAction newAcceptEventAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_AcceptEventAction(), newAcceptEventAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction()
	{
		return (Action)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Action(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Action newAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Action(), newAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Action(), newAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity()
	{
		return (Activity)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Activity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Activity(), newActivity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Activity(), newActivity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getActivityEdge()
	{
		return (ActivityEdge)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ActivityEdge(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityEdge(ActivityEdge newActivityEdge, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ActivityEdge(), newActivityEdge, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityEdge(ActivityEdge newActivityEdge)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ActivityEdge(), newActivityEdge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFinalNode getActivityFinalNode()
	{
		return (ActivityFinalNode)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ActivityFinalNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityFinalNode(ActivityFinalNode newActivityFinalNode, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ActivityFinalNode(), newActivityFinalNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityFinalNode(ActivityFinalNode newActivityFinalNode)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ActivityFinalNode(), newActivityFinalNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup getActivityGroup()
	{
		return (ActivityGroup)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ActivityGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityGroup(ActivityGroup newActivityGroup, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ActivityGroup(), newActivityGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityGroup(ActivityGroup newActivityGroup)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ActivityGroup(), newActivityGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getActivityNode()
	{
		return (ActivityNode)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ActivityNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityNode(ActivityNode newActivityNode, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ActivityNode(), newActivityNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityNode(ActivityNode newActivityNode)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ActivityNode(), newActivityNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityParameterNode getActivityParameterNode()
	{
		return (ActivityParameterNode)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ActivityParameterNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityParameterNode(ActivityParameterNode newActivityParameterNode, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ActivityParameterNode(), newActivityParameterNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityParameterNode(ActivityParameterNode newActivityParameterNode)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ActivityParameterNode(), newActivityParameterNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition getActivityPartition()
	{
		return (ActivityPartition)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ActivityPartition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityPartition(ActivityPartition newActivityPartition, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ActivityPartition(), newActivityPartition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityPartition(ActivityPartition newActivityPartition)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ActivityPartition(), newActivityPartition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getActor()
	{
		return (Actor)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Actor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActor(Actor newActor, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Actor(), newActor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(Actor newActor)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Actor(), newActor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddStructuralFeatureValueAction getAddStructuralFeatureValueAction()
	{
		return (AddStructuralFeatureValueAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_AddStructuralFeatureValueAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddStructuralFeatureValueAction(AddStructuralFeatureValueAction newAddStructuralFeatureValueAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_AddStructuralFeatureValueAction(), newAddStructuralFeatureValueAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddStructuralFeatureValueAction(AddStructuralFeatureValueAction newAddStructuralFeatureValueAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_AddStructuralFeatureValueAction(), newAddStructuralFeatureValueAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddVariableValueAction getAddVariableValueAction()
	{
		return (AddVariableValueAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_AddVariableValueAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddVariableValueAction(AddVariableValueAction newAddVariableValueAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_AddVariableValueAction(), newAddVariableValueAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddVariableValueAction(AddVariableValueAction newAddVariableValueAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_AddVariableValueAction(), newAddVariableValueAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyTrigger getAnyTrigger()
	{
		return (AnyTrigger)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_AnyTrigger(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnyTrigger(AnyTrigger newAnyTrigger, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_AnyTrigger(), newAnyTrigger, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnyTrigger(AnyTrigger newAnyTrigger)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_AnyTrigger(), newAnyTrigger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplyFunctionAction getApplyFunctionAction()
	{
		return (ApplyFunctionAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ApplyFunctionAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplyFunctionAction(ApplyFunctionAction newApplyFunctionAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ApplyFunctionAction(), newApplyFunctionAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyFunctionAction(ApplyFunctionAction newApplyFunctionAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ApplyFunctionAction(), newApplyFunctionAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact getArtifact()
	{
		return (Artifact)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Artifact(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifact(Artifact newArtifact, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Artifact(), newArtifact, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifact(Artifact newArtifact)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Artifact(), newArtifact);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getAssociation()
	{
		return (Association)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Association(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociation(Association newAssociation, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Association(), newAssociation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociation(Association newAssociation)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Association(), newAssociation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationClass getAssociationClass()
	{
		return (AssociationClass)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_AssociationClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociationClass(AssociationClass newAssociationClass, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_AssociationClass(), newAssociationClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationClass(AssociationClass newAssociationClass)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_AssociationClass(), newAssociationClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBehavior()
	{
		return (Behavior)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Behavior(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehavior(Behavior newBehavior, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Behavior(), newBehavior, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(Behavior newBehavior)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Behavior(), newBehavior);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeature getBehavioralFeature()
	{
		return (BehavioralFeature)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_BehavioralFeature(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehavioralFeature(BehavioralFeature newBehavioralFeature, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_BehavioralFeature(), newBehavioralFeature, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavioralFeature(BehavioralFeature newBehavioralFeature)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_BehavioralFeature(), newBehavioralFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier getBehavioredClassifier()
	{
		return (BehavioredClassifier)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_BehavioredClassifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehavioredClassifier(BehavioredClassifier newBehavioredClassifier, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_BehavioredClassifier(), newBehavioredClassifier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavioredClassifier(BehavioredClassifier newBehavioredClassifier)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_BehavioredClassifier(), newBehavioredClassifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BroadcastSignalAction getBroadcastSignalAction()
	{
		return (BroadcastSignalAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_BroadcastSignalAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBroadcastSignalAction(BroadcastSignalAction newBroadcastSignalAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_BroadcastSignalAction(), newBroadcastSignalAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBroadcastSignalAction(BroadcastSignalAction newBroadcastSignalAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_BroadcastSignalAction(), newBroadcastSignalAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallAction getCallAction()
	{
		return (CallAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_CallAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallAction(CallAction newCallAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_CallAction(), newCallAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallAction(CallAction newCallAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_CallAction(), newCallAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallBehaviorAction getCallBehaviorAction()
	{
		return (CallBehaviorAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_CallBehaviorAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallBehaviorAction(CallBehaviorAction newCallBehaviorAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_CallBehaviorAction(), newCallBehaviorAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallBehaviorAction(CallBehaviorAction newCallBehaviorAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_CallBehaviorAction(), newCallBehaviorAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOperationAction getCallOperationAction()
	{
		return (CallOperationAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_CallOperationAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallOperationAction(CallOperationAction newCallOperationAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_CallOperationAction(), newCallOperationAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallOperationAction(CallOperationAction newCallOperationAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_CallOperationAction(), newCallOperationAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallTrigger getCallTrigger()
	{
		return (CallTrigger)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_CallTrigger(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallTrigger(CallTrigger newCallTrigger, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_CallTrigger(), newCallTrigger, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallTrigger(CallTrigger newCallTrigger)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_CallTrigger(), newCallTrigger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentralBufferNode getCentralBufferNode()
	{
		return (CentralBufferNode)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_CentralBufferNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCentralBufferNode(CentralBufferNode newCentralBufferNode, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_CentralBufferNode(), newCentralBufferNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentralBufferNode(CentralBufferNode newCentralBufferNode)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_CentralBufferNode(), newCentralBufferNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeTrigger getChangeTrigger()
	{
		return (ChangeTrigger)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ChangeTrigger(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeTrigger(ChangeTrigger newChangeTrigger, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ChangeTrigger(), newChangeTrigger, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeTrigger(ChangeTrigger newChangeTrigger)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ChangeTrigger(), newChangeTrigger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2._1._0._0.uml.Class getClass_()
	{
		return (org.eclipse.uml2._1._0._0.uml.Class)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Class(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(org.eclipse.uml2._1._0._0.uml.Class newClass, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Class(), newClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(org.eclipse.uml2._1._0._0.uml.Class newClass)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Class(), newClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getClassifier()
	{
		return (Classifier)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Classifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifier(Classifier newClassifier, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Classifier(), newClassifier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier(Classifier newClassifier)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Classifier(), newClassifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierTemplateParameter getClassifierTemplateParameter()
	{
		return (ClassifierTemplateParameter)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ClassifierTemplateParameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifierTemplateParameter(ClassifierTemplateParameter newClassifierTemplateParameter, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ClassifierTemplateParameter(), newClassifierTemplateParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierTemplateParameter(ClassifierTemplateParameter newClassifierTemplateParameter)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ClassifierTemplateParameter(), newClassifierTemplateParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clause getClause()
	{
		return (Clause)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Clause(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClause(Clause newClause, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Clause(), newClause, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClause(Clause newClause)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Clause(), newClause);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearAssociationAction getClearAssociationAction()
	{
		return (ClearAssociationAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ClearAssociationAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClearAssociationAction(ClearAssociationAction newClearAssociationAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ClearAssociationAction(), newClearAssociationAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClearAssociationAction(ClearAssociationAction newClearAssociationAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ClearAssociationAction(), newClearAssociationAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearStructuralFeatureAction getClearStructuralFeatureAction()
	{
		return (ClearStructuralFeatureAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ClearStructuralFeatureAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClearStructuralFeatureAction(ClearStructuralFeatureAction newClearStructuralFeatureAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ClearStructuralFeatureAction(), newClearStructuralFeatureAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClearStructuralFeatureAction(ClearStructuralFeatureAction newClearStructuralFeatureAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ClearStructuralFeatureAction(), newClearStructuralFeatureAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearVariableAction getClearVariableAction()
	{
		return (ClearVariableAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ClearVariableAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClearVariableAction(ClearVariableAction newClearVariableAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ClearVariableAction(), newClearVariableAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClearVariableAction(ClearVariableAction newClearVariableAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ClearVariableAction(), newClearVariableAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration getCollaboration()
	{
		return (Collaboration)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Collaboration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollaboration(Collaboration newCollaboration, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Collaboration(), newCollaboration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollaboration(Collaboration newCollaboration)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Collaboration(), newCollaboration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationOccurrence getCollaborationOccurrence()
	{
		return (CollaborationOccurrence)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_CollaborationOccurrence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollaborationOccurrence(CollaborationOccurrence newCollaborationOccurrence, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_CollaborationOccurrence(), newCollaborationOccurrence, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollaborationOccurrence(CollaborationOccurrence newCollaborationOccurrence)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_CollaborationOccurrence(), newCollaborationOccurrence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedFragment getCombinedFragment()
	{
		return (CombinedFragment)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_CombinedFragment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCombinedFragment(CombinedFragment newCombinedFragment, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_CombinedFragment(), newCombinedFragment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombinedFragment(CombinedFragment newCombinedFragment)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_CombinedFragment(), newCombinedFragment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getComment()
	{
		return (Comment)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Comment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(Comment newComment, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Comment(), newComment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(Comment newComment)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Comment(), newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPath getCommunicationPath()
	{
		return (CommunicationPath)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_CommunicationPath(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunicationPath(CommunicationPath newCommunicationPath, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_CommunicationPath(), newCommunicationPath, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationPath(CommunicationPath newCommunicationPath)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_CommunicationPath(), newCommunicationPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent()
	{
		return (Component)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Component(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(Component newComponent, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Component(), newComponent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Component(), newComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalNode getConditionalNode()
	{
		return (ConditionalNode)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ConditionalNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalNode(ConditionalNode newConditionalNode, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ConditionalNode(), newConditionalNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalNode(ConditionalNode newConditionalNode)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ConditionalNode(), newConditionalNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement getConnectableElement()
	{
		return (ConnectableElement)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ConnectableElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectableElement(ConnectableElement newConnectableElement, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ConnectableElement(), newConnectableElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectableElement(ConnectableElement newConnectableElement)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ConnectableElement(), newConnectableElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElementTemplateParameter getConnectableElementTemplateParameter()
	{
		return (ConnectableElementTemplateParameter)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ConnectableElementTemplateParameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectableElementTemplateParameter(ConnectableElementTemplateParameter newConnectableElementTemplateParameter, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ConnectableElementTemplateParameter(), newConnectableElementTemplateParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectableElementTemplateParameter(ConnectableElementTemplateParameter newConnectableElementTemplateParameter)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ConnectableElementTemplateParameter(), newConnectableElementTemplateParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointReference getConnectionPointReference()
	{
		return (ConnectionPointReference)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ConnectionPointReference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionPointReference(ConnectionPointReference newConnectionPointReference, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ConnectionPointReference(), newConnectionPointReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionPointReference(ConnectionPointReference newConnectionPointReference)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ConnectionPointReference(), newConnectionPointReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getConnector()
	{
		return (Connector)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Connector(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnector(Connector newConnector, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Connector(), newConnector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(Connector newConnector)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Connector(), newConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEnd getConnectorEnd()
	{
		return (ConnectorEnd)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ConnectorEnd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectorEnd(ConnectorEnd newConnectorEnd, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ConnectorEnd(), newConnectorEnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorEnd(ConnectorEnd newConnectorEnd)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ConnectorEnd(), newConnectorEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getConstraint()
	{
		return (Constraint)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Constraint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraint(Constraint newConstraint, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Constraint(), newConstraint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(Constraint newConstraint)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Constraint(), newConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Continuation getContinuation()
	{
		return (Continuation)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Continuation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContinuation(Continuation newContinuation, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Continuation(), newContinuation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinuation(Continuation newContinuation)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Continuation(), newContinuation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow getControlFlow()
	{
		return (ControlFlow)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ControlFlow(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlFlow(ControlFlow newControlFlow, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ControlFlow(), newControlFlow, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlFlow(ControlFlow newControlFlow)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ControlFlow(), newControlFlow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlNode getControlNode()
	{
		return (ControlNode)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ControlNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlNode(ControlNode newControlNode, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ControlNode(), newControlNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlNode(ControlNode newControlNode)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ControlNode(), newControlNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateLinkAction getCreateLinkAction()
	{
		return (CreateLinkAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_CreateLinkAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateLinkAction(CreateLinkAction newCreateLinkAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_CreateLinkAction(), newCreateLinkAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateLinkAction(CreateLinkAction newCreateLinkAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_CreateLinkAction(), newCreateLinkAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateLinkObjectAction getCreateLinkObjectAction()
	{
		return (CreateLinkObjectAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_CreateLinkObjectAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateLinkObjectAction(CreateLinkObjectAction newCreateLinkObjectAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_CreateLinkObjectAction(), newCreateLinkObjectAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateLinkObjectAction(CreateLinkObjectAction newCreateLinkObjectAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_CreateLinkObjectAction(), newCreateLinkObjectAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateObjectAction getCreateObjectAction()
	{
		return (CreateObjectAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_CreateObjectAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateObjectAction(CreateObjectAction newCreateObjectAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_CreateObjectAction(), newCreateObjectAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateObjectAction(CreateObjectAction newCreateObjectAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_CreateObjectAction(), newCreateObjectAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStoreNode getDataStoreNode()
	{
		return (DataStoreNode)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_DataStoreNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataStoreNode(DataStoreNode newDataStoreNode, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_DataStoreNode(), newDataStoreNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataStoreNode(DataStoreNode newDataStoreNode)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_DataStoreNode(), newDataStoreNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDataType()
	{
		return (DataType)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_DataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataType(DataType newDataType, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_DataType(), newDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataType newDataType)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_DataType(), newDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNode getDecisionNode()
	{
		return (DecisionNode)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_DecisionNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecisionNode(DecisionNode newDecisionNode, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_DecisionNode(), newDecisionNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecisionNode(DecisionNode newDecisionNode)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_DecisionNode(), newDecisionNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency getDependency()
	{
		return (Dependency)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Dependency(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependency(Dependency newDependency, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Dependency(), newDependency, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependency(Dependency newDependency)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Dependency(), newDependency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedArtifact getDeployedArtifact()
	{
		return (DeployedArtifact)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_DeployedArtifact(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeployedArtifact(DeployedArtifact newDeployedArtifact, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_DeployedArtifact(), newDeployedArtifact, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployedArtifact(DeployedArtifact newDeployedArtifact)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_DeployedArtifact(), newDeployedArtifact);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeployment()
	{
		return (Deployment)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Deployment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeployment(Deployment newDeployment, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Deployment(), newDeployment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployment(Deployment newDeployment)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Deployment(), newDeployment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSpecification getDeploymentSpecification()
	{
		return (DeploymentSpecification)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_DeploymentSpecification(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeploymentSpecification(DeploymentSpecification newDeploymentSpecification, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_DeploymentSpecification(), newDeploymentSpecification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentSpecification(DeploymentSpecification newDeploymentSpecification)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_DeploymentSpecification(), newDeploymentSpecification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentTarget getDeploymentTarget()
	{
		return (DeploymentTarget)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_DeploymentTarget(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeploymentTarget(DeploymentTarget newDeploymentTarget, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_DeploymentTarget(), newDeploymentTarget, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentTarget(DeploymentTarget newDeploymentTarget)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_DeploymentTarget(), newDeploymentTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestroyLinkAction getDestroyLinkAction()
	{
		return (DestroyLinkAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_DestroyLinkAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestroyLinkAction(DestroyLinkAction newDestroyLinkAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_DestroyLinkAction(), newDestroyLinkAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestroyLinkAction(DestroyLinkAction newDestroyLinkAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_DestroyLinkAction(), newDestroyLinkAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestroyObjectAction getDestroyObjectAction()
	{
		return (DestroyObjectAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_DestroyObjectAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestroyObjectAction(DestroyObjectAction newDestroyObjectAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_DestroyObjectAction(), newDestroyObjectAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestroyObjectAction(DestroyObjectAction newDestroyObjectAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_DestroyObjectAction(), newDestroyObjectAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getDevice()
	{
		return (Device)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Device(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevice(Device newDevice, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Device(), newDevice, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(Device newDevice)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Device(), newDevice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedRelationship getDirectedRelationship()
	{
		return (DirectedRelationship)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_DirectedRelationship(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectedRelationship(DirectedRelationship newDirectedRelationship, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_DirectedRelationship(), newDirectedRelationship, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectedRelationship(DirectedRelationship newDirectedRelationship)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_DirectedRelationship(), newDirectedRelationship);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDuration()
	{
		return (Duration)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Duration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(Duration newDuration, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Duration(), newDuration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Duration newDuration)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Duration(), newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationConstraint getDurationConstraint()
	{
		return (DurationConstraint)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_DurationConstraint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDurationConstraint(DurationConstraint newDurationConstraint, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_DurationConstraint(), newDurationConstraint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationConstraint(DurationConstraint newDurationConstraint)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_DurationConstraint(), newDurationConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationInterval getDurationInterval()
	{
		return (DurationInterval)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_DurationInterval(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDurationInterval(DurationInterval newDurationInterval, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_DurationInterval(), newDurationInterval, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationInterval(DurationInterval newDurationInterval)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_DurationInterval(), newDurationInterval);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationObservationAction getDurationObservationAction()
	{
		return (DurationObservationAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_DurationObservationAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDurationObservationAction(DurationObservationAction newDurationObservationAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_DurationObservationAction(), newDurationObservationAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationObservationAction(DurationObservationAction newDurationObservationAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_DurationObservationAction(), newDurationObservationAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getElement()
	{
		return (Element)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Element(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(Element newElement, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Element(), newElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(Element newElement)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Element(), newElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImport getElementImport()
	{
		return (ElementImport)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ElementImport(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementImport(ElementImport newElementImport, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ElementImport(), newElementImport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementImport(ElementImport newElementImport)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ElementImport(), newElementImport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncapsulatedClassifier getEncapsulatedClassifier()
	{
		return (EncapsulatedClassifier)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_EncapsulatedClassifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncapsulatedClassifier(EncapsulatedClassifier newEncapsulatedClassifier, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_EncapsulatedClassifier(), newEncapsulatedClassifier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncapsulatedClassifier(EncapsulatedClassifier newEncapsulatedClassifier)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_EncapsulatedClassifier(), newEncapsulatedClassifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration getEnumeration()
	{
		return (Enumeration)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Enumeration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumeration(Enumeration newEnumeration, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Enumeration(), newEnumeration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumeration(Enumeration newEnumeration)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Enumeration(), newEnumeration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getEnumerationLiteral()
	{
		return (EnumerationLiteral)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_EnumerationLiteral(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumerationLiteral(EnumerationLiteral newEnumerationLiteral, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_EnumerationLiteral(), newEnumerationLiteral, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumerationLiteral(EnumerationLiteral newEnumerationLiteral)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_EnumerationLiteral(), newEnumerationLiteral);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventOccurrence getEventOccurrence()
	{
		return (EventOccurrence)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_EventOccurrence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventOccurrence(EventOccurrence newEventOccurrence, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_EventOccurrence(), newEventOccurrence, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventOccurrence(EventOccurrence newEventOccurrence)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_EventOccurrence(), newEventOccurrence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionHandler getExceptionHandler()
	{
		return (ExceptionHandler)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ExceptionHandler(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExceptionHandler(ExceptionHandler newExceptionHandler, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ExceptionHandler(), newExceptionHandler, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionHandler(ExceptionHandler newExceptionHandler)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ExceptionHandler(), newExceptionHandler);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode getExecutableNode()
	{
		return (ExecutableNode)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ExecutableNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutableNode(ExecutableNode newExecutableNode, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ExecutableNode(), newExecutableNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutableNode(ExecutableNode newExecutableNode)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ExecutableNode(), newExecutableNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnvironment getExecutionEnvironment()
	{
		return (ExecutionEnvironment)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ExecutionEnvironment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutionEnvironment(ExecutionEnvironment newExecutionEnvironment, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ExecutionEnvironment(), newExecutionEnvironment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionEnvironment(ExecutionEnvironment newExecutionEnvironment)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ExecutionEnvironment(), newExecutionEnvironment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionOccurrence getExecutionOccurrence()
	{
		return (ExecutionOccurrence)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ExecutionOccurrence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutionOccurrence(ExecutionOccurrence newExecutionOccurrence, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ExecutionOccurrence(), newExecutionOccurrence, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionOccurrence(ExecutionOccurrence newExecutionOccurrence)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ExecutionOccurrence(), newExecutionOccurrence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionNode getExpansionNode()
	{
		return (ExpansionNode)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ExpansionNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpansionNode(ExpansionNode newExpansionNode, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ExpansionNode(), newExpansionNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpansionNode(ExpansionNode newExpansionNode)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ExpansionNode(), newExpansionNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionRegion getExpansionRegion()
	{
		return (ExpansionRegion)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ExpansionRegion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpansionRegion(ExpansionRegion newExpansionRegion, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ExpansionRegion(), newExpansionRegion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpansionRegion(ExpansionRegion newExpansionRegion)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ExpansionRegion(), newExpansionRegion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression()
	{
		return (Expression)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Expression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Expression(), newExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Expression(), newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extend getExtend()
	{
		return (Extend)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Extend(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtend(Extend newExtend, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Extend(), newExtend, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtend(Extend newExtend)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Extend(), newExtend);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension getExtension()
	{
		return (Extension)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Extension(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtension(Extension newExtension, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Extension(), newExtension, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(Extension newExtension)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Extension(), newExtension);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionEnd getExtensionEnd()
	{
		return (ExtensionEnd)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ExtensionEnd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensionEnd(ExtensionEnd newExtensionEnd, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ExtensionEnd(), newExtensionEnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionEnd(ExtensionEnd newExtensionEnd)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ExtensionEnd(), newExtensionEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPoint getExtensionPoint()
	{
		return (ExtensionPoint)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ExtensionPoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensionPoint(ExtensionPoint newExtensionPoint, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ExtensionPoint(), newExtensionPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionPoint(ExtensionPoint newExtensionPoint)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ExtensionPoint(), newExtensionPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeature()
	{
		return (Feature)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Feature(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeature(Feature newFeature, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Feature(), newFeature, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(Feature newFeature)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Feature(), newFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalNode getFinalNode()
	{
		return (FinalNode)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_FinalNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalNode(FinalNode newFinalNode, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_FinalNode(), newFinalNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalNode(FinalNode newFinalNode)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_FinalNode(), newFinalNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState getFinalState()
	{
		return (FinalState)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_FinalState(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalState(FinalState newFinalState, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_FinalState(), newFinalState, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalState(FinalState newFinalState)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_FinalState(), newFinalState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowFinalNode getFlowFinalNode()
	{
		return (FlowFinalNode)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_FlowFinalNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowFinalNode(FlowFinalNode newFlowFinalNode, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_FlowFinalNode(), newFlowFinalNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowFinalNode(FlowFinalNode newFlowFinalNode)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_FlowFinalNode(), newFlowFinalNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNode getForkNode()
	{
		return (ForkNode)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ForkNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForkNode(ForkNode newForkNode, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ForkNode(), newForkNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForkNode(ForkNode newForkNode)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ForkNode(), newForkNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate getGate()
	{
		return (Gate)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Gate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGate(Gate newGate, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Gate(), newGate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGate(Gate newGate)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Gate(), newGate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization getGeneralization()
	{
		return (Generalization)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Generalization(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralization(Generalization newGeneralization, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Generalization(), newGeneralization, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralization(Generalization newGeneralization)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Generalization(), newGeneralization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSet getGeneralizationSet()
	{
		return (GeneralizationSet)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_GeneralizationSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralizationSet(GeneralizationSet newGeneralizationSet, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_GeneralizationSet(), newGeneralizationSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralizationSet(GeneralizationSet newGeneralizationSet)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_GeneralizationSet(), newGeneralizationSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralOrdering getGeneralOrdering()
	{
		return (GeneralOrdering)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_GeneralOrdering(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralOrdering(GeneralOrdering newGeneralOrdering, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_GeneralOrdering(), newGeneralOrdering, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralOrdering(GeneralOrdering newGeneralOrdering)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_GeneralOrdering(), newGeneralOrdering);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation getImplementation()
	{
		return (Implementation)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Implementation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementation(Implementation newImplementation, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Implementation(), newImplementation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementation(Implementation newImplementation)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Implementation(), newImplementation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include getInclude()
	{
		return (Include)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Include(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInclude(Include newInclude, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Include(), newInclude, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclude(Include newInclude)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Include(), newInclude);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationFlow getInformationFlow()
	{
		return (InformationFlow)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_InformationFlow(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformationFlow(InformationFlow newInformationFlow, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_InformationFlow(), newInformationFlow, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformationFlow(InformationFlow newInformationFlow)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_InformationFlow(), newInformationFlow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationItem getInformationItem()
	{
		return (InformationItem)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_InformationItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformationItem(InformationItem newInformationItem, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_InformationItem(), newInformationItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformationItem(InformationItem newInformationItem)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_InformationItem(), newInformationItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNode getInitialNode()
	{
		return (InitialNode)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_InitialNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialNode(InitialNode newInitialNode, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_InitialNode(), newInitialNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialNode(InitialNode newInitialNode)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_InitialNode(), newInitialNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getInputPin()
	{
		return (InputPin)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_InputPin(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputPin(InputPin newInputPin, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_InputPin(), newInputPin, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputPin(InputPin newInputPin)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_InputPin(), newInputPin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification getInstanceSpecification()
	{
		return (InstanceSpecification)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_InstanceSpecification(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstanceSpecification(InstanceSpecification newInstanceSpecification, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_InstanceSpecification(), newInstanceSpecification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceSpecification(InstanceSpecification newInstanceSpecification)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_InstanceSpecification(), newInstanceSpecification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceValue getInstanceValue()
	{
		return (InstanceValue)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_InstanceValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstanceValue(InstanceValue newInstanceValue, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_InstanceValue(), newInstanceValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceValue(InstanceValue newInstanceValue)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_InstanceValue(), newInstanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getInteraction()
	{
		return (Interaction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Interaction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteraction(Interaction newInteraction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Interaction(), newInteraction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteraction(Interaction newInteraction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Interaction(), newInteraction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionConstraint getInteractionConstraint()
	{
		return (InteractionConstraint)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_InteractionConstraint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteractionConstraint(InteractionConstraint newInteractionConstraint, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_InteractionConstraint(), newInteractionConstraint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionConstraint(InteractionConstraint newInteractionConstraint)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_InteractionConstraint(), newInteractionConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFragment getInteractionFragment()
	{
		return (InteractionFragment)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_InteractionFragment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteractionFragment(InteractionFragment newInteractionFragment, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_InteractionFragment(), newInteractionFragment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionFragment(InteractionFragment newInteractionFragment)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_InteractionFragment(), newInteractionFragment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOccurrence getInteractionOccurrence()
	{
		return (InteractionOccurrence)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_InteractionOccurrence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteractionOccurrence(InteractionOccurrence newInteractionOccurrence, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_InteractionOccurrence(), newInteractionOccurrence, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionOccurrence(InteractionOccurrence newInteractionOccurrence)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_InteractionOccurrence(), newInteractionOccurrence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand getInteractionOperand()
	{
		return (InteractionOperand)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_InteractionOperand(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteractionOperand(InteractionOperand newInteractionOperand, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_InteractionOperand(), newInteractionOperand, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionOperand(InteractionOperand newInteractionOperand)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_InteractionOperand(), newInteractionOperand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInterface()
	{
		return (Interface)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Interface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(Interface newInterface, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Interface(), newInterface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(Interface newInterface)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Interface(), newInterface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion getInterruptibleActivityRegion()
	{
		return (InterruptibleActivityRegion)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_InterruptibleActivityRegion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterruptibleActivityRegion(InterruptibleActivityRegion newInterruptibleActivityRegion, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_InterruptibleActivityRegion(), newInterruptibleActivityRegion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterruptibleActivityRegion(InterruptibleActivityRegion newInterruptibleActivityRegion)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_InterruptibleActivityRegion(), newInterruptibleActivityRegion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval getInterval()
	{
		return (Interval)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Interval(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterval(Interval newInterval, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Interval(), newInterval, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(Interval newInterval)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Interval(), newInterval);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalConstraint getIntervalConstraint()
	{
		return (IntervalConstraint)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_IntervalConstraint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntervalConstraint(IntervalConstraint newIntervalConstraint, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_IntervalConstraint(), newIntervalConstraint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalConstraint(IntervalConstraint newIntervalConstraint)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_IntervalConstraint(), newIntervalConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationAction getInvocationAction()
	{
		return (InvocationAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_InvocationAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvocationAction(InvocationAction newInvocationAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_InvocationAction(), newInvocationAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvocationAction(InvocationAction newInvocationAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_InvocationAction(), newInvocationAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNode getJoinNode()
	{
		return (JoinNode)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_JoinNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoinNode(JoinNode newJoinNode, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_JoinNode(), newJoinNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinNode(JoinNode newJoinNode)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_JoinNode(), newJoinNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline getLifeline()
	{
		return (Lifeline)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Lifeline(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLifeline(Lifeline newLifeline, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Lifeline(), newLifeline, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifeline(Lifeline newLifeline)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Lifeline(), newLifeline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkAction getLinkAction()
	{
		return (LinkAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_LinkAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkAction(LinkAction newLinkAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_LinkAction(), newLinkAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkAction(LinkAction newLinkAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_LinkAction(), newLinkAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndCreationData getLinkEndCreationData()
	{
		return (LinkEndCreationData)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_LinkEndCreationData(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkEndCreationData(LinkEndCreationData newLinkEndCreationData, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_LinkEndCreationData(), newLinkEndCreationData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkEndCreationData(LinkEndCreationData newLinkEndCreationData)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_LinkEndCreationData(), newLinkEndCreationData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndData getLinkEndData()
	{
		return (LinkEndData)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_LinkEndData(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkEndData(LinkEndData newLinkEndData, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_LinkEndData(), newLinkEndData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkEndData(LinkEndData newLinkEndData)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_LinkEndData(), newLinkEndData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralBoolean getLiteralBoolean()
	{
		return (LiteralBoolean)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_LiteralBoolean(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiteralBoolean(LiteralBoolean newLiteralBoolean, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_LiteralBoolean(), newLiteralBoolean, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteralBoolean(LiteralBoolean newLiteralBoolean)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_LiteralBoolean(), newLiteralBoolean);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralInteger getLiteralInteger()
	{
		return (LiteralInteger)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_LiteralInteger(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiteralInteger(LiteralInteger newLiteralInteger, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_LiteralInteger(), newLiteralInteger, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteralInteger(LiteralInteger newLiteralInteger)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_LiteralInteger(), newLiteralInteger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNull getLiteralNull()
	{
		return (LiteralNull)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_LiteralNull(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiteralNull(LiteralNull newLiteralNull, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_LiteralNull(), newLiteralNull, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteralNull(LiteralNull newLiteralNull)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_LiteralNull(), newLiteralNull);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralSpecification getLiteralSpecification()
	{
		return (LiteralSpecification)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_LiteralSpecification(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiteralSpecification(LiteralSpecification newLiteralSpecification, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_LiteralSpecification(), newLiteralSpecification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteralSpecification(LiteralSpecification newLiteralSpecification)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_LiteralSpecification(), newLiteralSpecification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralString getLiteralString()
	{
		return (LiteralString)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_LiteralString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiteralString(LiteralString newLiteralString, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_LiteralString(), newLiteralString, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteralString(LiteralString newLiteralString)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_LiteralString(), newLiteralString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralUnlimitedNatural getLiteralUnlimitedNatural()
	{
		return (LiteralUnlimitedNatural)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_LiteralUnlimitedNatural(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiteralUnlimitedNatural(LiteralUnlimitedNatural newLiteralUnlimitedNatural, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_LiteralUnlimitedNatural(), newLiteralUnlimitedNatural, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteralUnlimitedNatural(LiteralUnlimitedNatural newLiteralUnlimitedNatural)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_LiteralUnlimitedNatural(), newLiteralUnlimitedNatural);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopNode getLoopNode()
	{
		return (LoopNode)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_LoopNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopNode(LoopNode newLoopNode, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_LoopNode(), newLoopNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopNode(LoopNode newLoopNode)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_LoopNode(), newLoopNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manifestation getManifestation()
	{
		return (Manifestation)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Manifestation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManifestation(Manifestation newManifestation, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Manifestation(), newManifestation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManifestation(Manifestation newManifestation)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Manifestation(), newManifestation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNode getMergeNode()
	{
		return (MergeNode)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_MergeNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMergeNode(MergeNode newMergeNode, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_MergeNode(), newMergeNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMergeNode(MergeNode newMergeNode)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_MergeNode(), newMergeNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessage()
	{
		return (Message)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Message(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessage(Message newMessage, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Message(), newMessage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(Message newMessage)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Message(), newMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEnd getMessageEnd()
	{
		return (MessageEnd)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_MessageEnd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageEnd(MessageEnd newMessageEnd, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_MessageEnd(), newMessageEnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageEnd(MessageEnd newMessageEnd)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_MessageEnd(), newMessageEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTrigger getMessageTrigger()
	{
		return (MessageTrigger)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_MessageTrigger(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageTrigger(MessageTrigger newMessageTrigger, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_MessageTrigger(), newMessageTrigger, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageTrigger(MessageTrigger newMessageTrigger)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_MessageTrigger(), newMessageTrigger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel()
	{
		return (Model)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Model(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(Model newModel, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Model(), newModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Model(), newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityElement getMultiplicityElement()
	{
		return (MultiplicityElement)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_MultiplicityElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiplicityElement(MultiplicityElement newMultiplicityElement, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_MultiplicityElement(), newMultiplicityElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicityElement(MultiplicityElement newMultiplicityElement)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_MultiplicityElement(), newMultiplicityElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getNamedElement()
	{
		return (NamedElement)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_NamedElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamedElement(NamedElement newNamedElement, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_NamedElement(), newNamedElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamedElement(NamedElement newNamedElement)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_NamedElement(), newNamedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace()
	{
		return (Namespace)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Namespace(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespace(Namespace newNamespace, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Namespace(), newNamespace, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(Namespace newNamespace)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Namespace(), newNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNode()
	{
		return (Node)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Node(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode(Node newNode, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Node(), newNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(Node newNode)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Node(), newNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFlow getObjectFlow()
	{
		return (ObjectFlow)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ObjectFlow(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectFlow(ObjectFlow newObjectFlow, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ObjectFlow(), newObjectFlow, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectFlow(ObjectFlow newObjectFlow)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ObjectFlow(), newObjectFlow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNode getObjectNode()
	{
		return (ObjectNode)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ObjectNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectNode(ObjectNode newObjectNode, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ObjectNode(), newObjectNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectNode(ObjectNode newObjectNode)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ObjectNode(), newObjectNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueExpression getOpaqueExpression()
	{
		return (OpaqueExpression)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_OpaqueExpression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpaqueExpression(OpaqueExpression newOpaqueExpression, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_OpaqueExpression(), newOpaqueExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpaqueExpression(OpaqueExpression newOpaqueExpression)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_OpaqueExpression(), newOpaqueExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation()
	{
		return (Operation)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Operation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(Operation newOperation, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Operation(), newOperation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operation newOperation)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Operation(), newOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationTemplateParameter getOperationTemplateParameter()
	{
		return (OperationTemplateParameter)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_OperationTemplateParameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationTemplateParameter(OperationTemplateParameter newOperationTemplateParameter, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_OperationTemplateParameter(), newOperationTemplateParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationTemplateParameter(OperationTemplateParameter newOperationTemplateParameter)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_OperationTemplateParameter(), newOperationTemplateParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getOutputPin()
	{
		return (OutputPin)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_OutputPin(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputPin(OutputPin newOutputPin, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_OutputPin(), newOutputPin, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputPin(OutputPin newOutputPin)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_OutputPin(), newOutputPin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2._1._0._0.uml.Package getPackage()
	{
		return (org.eclipse.uml2._1._0._0.uml.Package)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Package(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(org.eclipse.uml2._1._0._0.uml.Package newPackage, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Package(), newPackage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(org.eclipse.uml2._1._0._0.uml.Package newPackage)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Package(), newPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getPackageableElement()
	{
		return (PackageableElement)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_PackageableElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackageableElement(PackageableElement newPackageableElement, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_PackageableElement(), newPackageableElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageableElement(PackageableElement newPackageableElement)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_PackageableElement(), newPackageableElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport getPackageImport()
	{
		return (PackageImport)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_PackageImport(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackageImport(PackageImport newPackageImport, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_PackageImport(), newPackageImport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageImport(PackageImport newPackageImport)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_PackageImport(), newPackageImport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageMerge getPackageMerge()
	{
		return (PackageMerge)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_PackageMerge(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackageMerge(PackageMerge newPackageMerge, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_PackageMerge(), newPackageMerge, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageMerge(PackageMerge newPackageMerge)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_PackageMerge(), newPackageMerge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter()
	{
		return (Parameter)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Parameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(Parameter newParameter, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Parameter(), newParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(Parameter newParameter)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Parameter(), newParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableClassifier getParameterableClassifier()
	{
		return (ParameterableClassifier)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ParameterableClassifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterableClassifier(ParameterableClassifier newParameterableClassifier, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ParameterableClassifier(), newParameterableClassifier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterableClassifier(ParameterableClassifier newParameterableClassifier)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ParameterableClassifier(), newParameterableClassifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement getParameterableElement()
	{
		return (ParameterableElement)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ParameterableElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterableElement(ParameterableElement newParameterableElement, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ParameterableElement(), newParameterableElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterableElement(ParameterableElement newParameterableElement)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ParameterableElement(), newParameterableElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSet getParameterSet()
	{
		return (ParameterSet)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ParameterSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterSet(ParameterSet newParameterSet, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ParameterSet(), newParameterSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterSet(ParameterSet newParameterSet)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ParameterSet(), newParameterSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartDecomposition getPartDecomposition()
	{
		return (PartDecomposition)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_PartDecomposition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartDecomposition(PartDecomposition newPartDecomposition, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_PartDecomposition(), newPartDecomposition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartDecomposition(PartDecomposition newPartDecomposition)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_PartDecomposition(), newPartDecomposition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permission getPermission()
	{
		return (Permission)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Permission(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPermission(Permission newPermission, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Permission(), newPermission, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermission(Permission newPermission)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Permission(), newPermission);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPin()
	{
		return (Pin)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Pin(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPin(Pin newPin, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Pin(), newPin, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPin(Pin newPin)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Pin(), newPin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPort()
	{
		return (Port)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Port(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort(Port newPort, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Port(), newPort, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Port newPort)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Port(), newPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveFunction getPrimitiveFunction()
	{
		return (PrimitiveFunction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_PrimitiveFunction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimitiveFunction(PrimitiveFunction newPrimitiveFunction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_PrimitiveFunction(), newPrimitiveFunction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveFunction(PrimitiveFunction newPrimitiveFunction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_PrimitiveFunction(), newPrimitiveFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType getPrimitiveType()
	{
		return (PrimitiveType)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_PrimitiveType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimitiveType(PrimitiveType newPrimitiveType, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_PrimitiveType(), newPrimitiveType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveType(PrimitiveType newPrimitiveType)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_PrimitiveType(), newPrimitiveType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile getProfile()
	{
		return (Profile)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Profile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfile(Profile newProfile, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Profile(), newProfile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfile(Profile newProfile)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Profile(), newProfile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileApplication getProfileApplication()
	{
		return (ProfileApplication)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ProfileApplication(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfileApplication(ProfileApplication newProfileApplication, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ProfileApplication(), newProfileApplication, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileApplication(ProfileApplication newProfileApplication)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ProfileApplication(), newProfileApplication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getProperty()
	{
		return (Property)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Property(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(Property newProperty, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Property(), newProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(Property newProperty)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Property(), newProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolConformance getProtocolConformance()
	{
		return (ProtocolConformance)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ProtocolConformance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocolConformance(ProtocolConformance newProtocolConformance, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ProtocolConformance(), newProtocolConformance, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolConformance(ProtocolConformance newProtocolConformance)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ProtocolConformance(), newProtocolConformance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine getProtocolStateMachine()
	{
		return (ProtocolStateMachine)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ProtocolStateMachine(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocolStateMachine(ProtocolStateMachine newProtocolStateMachine, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ProtocolStateMachine(), newProtocolStateMachine, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolStateMachine(ProtocolStateMachine newProtocolStateMachine)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ProtocolStateMachine(), newProtocolStateMachine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolTransition getProtocolTransition()
	{
		return (ProtocolTransition)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ProtocolTransition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocolTransition(ProtocolTransition newProtocolTransition, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ProtocolTransition(), newProtocolTransition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolTransition(ProtocolTransition newProtocolTransition)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ProtocolTransition(), newProtocolTransition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate getPseudostate()
	{
		return (Pseudostate)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Pseudostate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPseudostate(Pseudostate newPseudostate, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Pseudostate(), newPseudostate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPseudostate(Pseudostate newPseudostate)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Pseudostate(), newPseudostate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierValue getQualifierValue()
	{
		return (QualifierValue)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_QualifierValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualifierValue(QualifierValue newQualifierValue, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_QualifierValue(), newQualifierValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifierValue(QualifierValue newQualifierValue)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_QualifierValue(), newQualifierValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RaiseExceptionAction getRaiseExceptionAction()
	{
		return (RaiseExceptionAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_RaiseExceptionAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRaiseExceptionAction(RaiseExceptionAction newRaiseExceptionAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_RaiseExceptionAction(), newRaiseExceptionAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRaiseExceptionAction(RaiseExceptionAction newRaiseExceptionAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_RaiseExceptionAction(), newRaiseExceptionAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadExtentAction getReadExtentAction()
	{
		return (ReadExtentAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ReadExtentAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadExtentAction(ReadExtentAction newReadExtentAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ReadExtentAction(), newReadExtentAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadExtentAction(ReadExtentAction newReadExtentAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ReadExtentAction(), newReadExtentAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadIsClassifiedObjectAction getReadIsClassifiedObjectAction()
	{
		return (ReadIsClassifiedObjectAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ReadIsClassifiedObjectAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadIsClassifiedObjectAction(ReadIsClassifiedObjectAction newReadIsClassifiedObjectAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ReadIsClassifiedObjectAction(), newReadIsClassifiedObjectAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadIsClassifiedObjectAction(ReadIsClassifiedObjectAction newReadIsClassifiedObjectAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ReadIsClassifiedObjectAction(), newReadIsClassifiedObjectAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLinkAction getReadLinkAction()
	{
		return (ReadLinkAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ReadLinkAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadLinkAction(ReadLinkAction newReadLinkAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ReadLinkAction(), newReadLinkAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadLinkAction(ReadLinkAction newReadLinkAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ReadLinkAction(), newReadLinkAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLinkObjectEndAction getReadLinkObjectEndAction()
	{
		return (ReadLinkObjectEndAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ReadLinkObjectEndAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadLinkObjectEndAction(ReadLinkObjectEndAction newReadLinkObjectEndAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ReadLinkObjectEndAction(), newReadLinkObjectEndAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadLinkObjectEndAction(ReadLinkObjectEndAction newReadLinkObjectEndAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ReadLinkObjectEndAction(), newReadLinkObjectEndAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLinkObjectEndQualifierAction getReadLinkObjectEndQualifierAction()
	{
		return (ReadLinkObjectEndQualifierAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ReadLinkObjectEndQualifierAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadLinkObjectEndQualifierAction(ReadLinkObjectEndQualifierAction newReadLinkObjectEndQualifierAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ReadLinkObjectEndQualifierAction(), newReadLinkObjectEndQualifierAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadLinkObjectEndQualifierAction(ReadLinkObjectEndQualifierAction newReadLinkObjectEndQualifierAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ReadLinkObjectEndQualifierAction(), newReadLinkObjectEndQualifierAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadSelfAction getReadSelfAction()
	{
		return (ReadSelfAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ReadSelfAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadSelfAction(ReadSelfAction newReadSelfAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ReadSelfAction(), newReadSelfAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadSelfAction(ReadSelfAction newReadSelfAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ReadSelfAction(), newReadSelfAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadStructuralFeatureAction getReadStructuralFeatureAction()
	{
		return (ReadStructuralFeatureAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ReadStructuralFeatureAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadStructuralFeatureAction(ReadStructuralFeatureAction newReadStructuralFeatureAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ReadStructuralFeatureAction(), newReadStructuralFeatureAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadStructuralFeatureAction(ReadStructuralFeatureAction newReadStructuralFeatureAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ReadStructuralFeatureAction(), newReadStructuralFeatureAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadVariableAction getReadVariableAction()
	{
		return (ReadVariableAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ReadVariableAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadVariableAction(ReadVariableAction newReadVariableAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ReadVariableAction(), newReadVariableAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadVariableAction(ReadVariableAction newReadVariableAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ReadVariableAction(), newReadVariableAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realization getRealization()
	{
		return (Realization)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Realization(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealization(Realization newRealization, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Realization(), newRealization, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealization(Realization newRealization)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Realization(), newRealization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception getReception()
	{
		return (Reception)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Reception(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReception(Reception newReception, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Reception(), newReception, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReception(Reception newReception)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Reception(), newReception);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReclassifyObjectAction getReclassifyObjectAction()
	{
		return (ReclassifyObjectAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ReclassifyObjectAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReclassifyObjectAction(ReclassifyObjectAction newReclassifyObjectAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ReclassifyObjectAction(), newReclassifyObjectAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReclassifyObjectAction(ReclassifyObjectAction newReclassifyObjectAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ReclassifyObjectAction(), newReclassifyObjectAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableElement getRedefinableElement()
	{
		return (RedefinableElement)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_RedefinableElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRedefinableElement(RedefinableElement newRedefinableElement, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_RedefinableElement(), newRedefinableElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinableElement(RedefinableElement newRedefinableElement)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_RedefinableElement(), newRedefinableElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableTemplateSignature getRedefinableTemplateSignature()
	{
		return (RedefinableTemplateSignature)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_RedefinableTemplateSignature(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRedefinableTemplateSignature(RedefinableTemplateSignature newRedefinableTemplateSignature, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_RedefinableTemplateSignature(), newRedefinableTemplateSignature, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinableTemplateSignature(RedefinableTemplateSignature newRedefinableTemplateSignature)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_RedefinableTemplateSignature(), newRedefinableTemplateSignature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getRegion()
	{
		return (Region)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Region(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegion(Region newRegion, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Region(), newRegion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(Region newRegion)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Region(), newRegion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship getRelationship()
	{
		return (Relationship)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Relationship(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(Relationship newRelationship, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Relationship(), newRelationship, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship(Relationship newRelationship)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Relationship(), newRelationship);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveStructuralFeatureValueAction getRemoveStructuralFeatureValueAction()
	{
		return (RemoveStructuralFeatureValueAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_RemoveStructuralFeatureValueAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoveStructuralFeatureValueAction(RemoveStructuralFeatureValueAction newRemoveStructuralFeatureValueAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_RemoveStructuralFeatureValueAction(), newRemoveStructuralFeatureValueAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveStructuralFeatureValueAction(RemoveStructuralFeatureValueAction newRemoveStructuralFeatureValueAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_RemoveStructuralFeatureValueAction(), newRemoveStructuralFeatureValueAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveVariableValueAction getRemoveVariableValueAction()
	{
		return (RemoveVariableValueAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_RemoveVariableValueAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoveVariableValueAction(RemoveVariableValueAction newRemoveVariableValueAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_RemoveVariableValueAction(), newRemoveVariableValueAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveVariableValueAction(RemoveVariableValueAction newRemoveVariableValueAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_RemoveVariableValueAction(), newRemoveVariableValueAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplyAction getReplyAction()
	{
		return (ReplyAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ReplyAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplyAction(ReplyAction newReplyAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ReplyAction(), newReplyAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplyAction(ReplyAction newReplyAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ReplyAction(), newReplyAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendObjectAction getSendObjectAction()
	{
		return (SendObjectAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_SendObjectAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSendObjectAction(SendObjectAction newSendObjectAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_SendObjectAction(), newSendObjectAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendObjectAction(SendObjectAction newSendObjectAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_SendObjectAction(), newSendObjectAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendSignalAction getSendSignalAction()
	{
		return (SendSignalAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_SendSignalAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSendSignalAction(SendSignalAction newSendSignalAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_SendSignalAction(), newSendSignalAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendSignalAction(SendSignalAction newSendSignalAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_SendSignalAction(), newSendSignalAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getSignal()
	{
		return (Signal)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Signal(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignal(Signal newSignal, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Signal(), newSignal, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignal(Signal newSignal)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Signal(), newSignal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalTrigger getSignalTrigger()
	{
		return (SignalTrigger)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_SignalTrigger(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalTrigger(SignalTrigger newSignalTrigger, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_SignalTrigger(), newSignalTrigger, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalTrigger(SignalTrigger newSignalTrigger)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_SignalTrigger(), newSignalTrigger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot getSlot()
	{
		return (Slot)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Slot(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlot(Slot newSlot, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Slot(), newSlot, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlot(Slot newSlot)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Slot(), newSlot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartOwnedBehaviorAction getStartOwnedBehaviorAction()
	{
		return (StartOwnedBehaviorAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_StartOwnedBehaviorAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartOwnedBehaviorAction(StartOwnedBehaviorAction newStartOwnedBehaviorAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_StartOwnedBehaviorAction(), newStartOwnedBehaviorAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartOwnedBehaviorAction(StartOwnedBehaviorAction newStartOwnedBehaviorAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_StartOwnedBehaviorAction(), newStartOwnedBehaviorAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState()
	{
		return (State)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_State(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(State newState, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_State(), newState, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_State(), newState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateInvariant getStateInvariant()
	{
		return (StateInvariant)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_StateInvariant(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateInvariant(StateInvariant newStateInvariant, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_StateInvariant(), newStateInvariant, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateInvariant(StateInvariant newStateInvariant)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_StateInvariant(), newStateInvariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getStateMachine()
	{
		return (StateMachine)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_StateMachine(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateMachine(StateMachine newStateMachine, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_StateMachine(), newStateMachine, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine(StateMachine newStateMachine)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_StateMachine(), newStateMachine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype getStereotype()
	{
		return (Stereotype)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Stereotype(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStereotype(Stereotype newStereotype, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Stereotype(), newStereotype, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStereotype(Stereotype newStereotype)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Stereotype(), newStereotype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stop getStop()
	{
		return (Stop)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Stop(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStop(Stop newStop, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Stop(), newStop, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStop(Stop newStop)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Stop(), newStop);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression getStringExpression()
	{
		return (StringExpression)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_StringExpression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringExpression(StringExpression newStringExpression, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_StringExpression(), newStringExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringExpression(StringExpression newStringExpression)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_StringExpression(), newStringExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeature getStructuralFeature()
	{
		return (StructuralFeature)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_StructuralFeature(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuralFeature(StructuralFeature newStructuralFeature, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_StructuralFeature(), newStructuralFeature, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuralFeature(StructuralFeature newStructuralFeature)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_StructuralFeature(), newStructuralFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeatureAction getStructuralFeatureAction()
	{
		return (StructuralFeatureAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_StructuralFeatureAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuralFeatureAction(StructuralFeatureAction newStructuralFeatureAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_StructuralFeatureAction(), newStructuralFeatureAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuralFeatureAction(StructuralFeatureAction newStructuralFeatureAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_StructuralFeatureAction(), newStructuralFeatureAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode getStructuredActivityNode()
	{
		return (StructuredActivityNode)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_StructuredActivityNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuredActivityNode(StructuredActivityNode newStructuredActivityNode, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_StructuredActivityNode(), newStructuredActivityNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuredActivityNode(StructuredActivityNode newStructuredActivityNode)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_StructuredActivityNode(), newStructuredActivityNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredClassifier getStructuredClassifier()
	{
		return (StructuredClassifier)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_StructuredClassifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuredClassifier(StructuredClassifier newStructuredClassifier, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_StructuredClassifier(), newStructuredClassifier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuredClassifier(StructuredClassifier newStructuredClassifier)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_StructuredClassifier(), newStructuredClassifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substitution getSubstitution()
	{
		return (Substitution)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Substitution(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstitution(Substitution newSubstitution, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Substitution(), newSubstitution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstitution(Substitution newSubstitution)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Substitution(), newSubstitution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateableClassifier getTemplateableClassifier()
	{
		return (TemplateableClassifier)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_TemplateableClassifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateableClassifier(TemplateableClassifier newTemplateableClassifier, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_TemplateableClassifier(), newTemplateableClassifier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateableClassifier(TemplateableClassifier newTemplateableClassifier)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_TemplateableClassifier(), newTemplateableClassifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateableElement getTemplateableElement()
	{
		return (TemplateableElement)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_TemplateableElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateableElement(TemplateableElement newTemplateableElement, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_TemplateableElement(), newTemplateableElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateableElement(TemplateableElement newTemplateableElement)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_TemplateableElement(), newTemplateableElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding getTemplateBinding()
	{
		return (TemplateBinding)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_TemplateBinding(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateBinding(TemplateBinding newTemplateBinding, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_TemplateBinding(), newTemplateBinding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateBinding(TemplateBinding newTemplateBinding)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_TemplateBinding(), newTemplateBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getTemplateParameter()
	{
		return (TemplateParameter)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_TemplateParameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameter(TemplateParameter newTemplateParameter, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_TemplateParameter(), newTemplateParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameter(TemplateParameter newTemplateParameter)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_TemplateParameter(), newTemplateParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameterSubstitution getTemplateParameterSubstitution()
	{
		return (TemplateParameterSubstitution)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_TemplateParameterSubstitution(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameterSubstitution(TemplateParameterSubstitution newTemplateParameterSubstitution, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_TemplateParameterSubstitution(), newTemplateParameterSubstitution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameterSubstitution(TemplateParameterSubstitution newTemplateParameterSubstitution)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_TemplateParameterSubstitution(), newTemplateParameterSubstitution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getTemplateSignature()
	{
		return (TemplateSignature)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_TemplateSignature(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateSignature(TemplateSignature newTemplateSignature, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_TemplateSignature(), newTemplateSignature, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateSignature(TemplateSignature newTemplateSignature)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_TemplateSignature(), newTemplateSignature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestIdentityAction getTestIdentityAction()
	{
		return (TestIdentityAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_TestIdentityAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestIdentityAction(TestIdentityAction newTestIdentityAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_TestIdentityAction(), newTestIdentityAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestIdentityAction(TestIdentityAction newTestIdentityAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_TestIdentityAction(), newTestIdentityAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeConstraint getTimeConstraint()
	{
		return (TimeConstraint)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_TimeConstraint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeConstraint(TimeConstraint newTimeConstraint, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_TimeConstraint(), newTimeConstraint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeConstraint(TimeConstraint newTimeConstraint)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_TimeConstraint(), newTimeConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeExpression getTimeExpression()
	{
		return (TimeExpression)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_TimeExpression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeExpression(TimeExpression newTimeExpression, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_TimeExpression(), newTimeExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeExpression(TimeExpression newTimeExpression)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_TimeExpression(), newTimeExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval getTimeInterval()
	{
		return (TimeInterval)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_TimeInterval(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeInterval(TimeInterval newTimeInterval, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_TimeInterval(), newTimeInterval, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeInterval(TimeInterval newTimeInterval)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_TimeInterval(), newTimeInterval);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeObservationAction getTimeObservationAction()
	{
		return (TimeObservationAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_TimeObservationAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeObservationAction(TimeObservationAction newTimeObservationAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_TimeObservationAction(), newTimeObservationAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeObservationAction(TimeObservationAction newTimeObservationAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_TimeObservationAction(), newTimeObservationAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeTrigger getTimeTrigger()
	{
		return (TimeTrigger)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_TimeTrigger(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeTrigger(TimeTrigger newTimeTrigger, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_TimeTrigger(), newTimeTrigger, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeTrigger(TimeTrigger newTimeTrigger)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_TimeTrigger(), newTimeTrigger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTransition()
	{
		return (Transition)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Transition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransition(Transition newTransition, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Transition(), newTransition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition(Transition newTransition)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Transition(), newTransition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getTrigger()
	{
		return (Trigger)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Trigger(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrigger(Trigger newTrigger, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Trigger(), newTrigger, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(Trigger newTrigger)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Trigger(), newTrigger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType()
	{
		return (Type)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Type(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Type newType, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Type(), newType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Type(), newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedElement getTypedElement()
	{
		return (TypedElement)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_TypedElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypedElement(TypedElement newTypedElement, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_TypedElement(), newTypedElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedElement(TypedElement newTypedElement)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_TypedElement(), newTypedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usage getUsage()
	{
		return (Usage)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Usage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsage(Usage newUsage, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Usage(), newUsage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(Usage newUsage)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Usage(), newUsage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getUseCase()
	{
		return (UseCase)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_UseCase(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUseCase(UseCase newUseCase, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_UseCase(), newUseCase, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseCase(UseCase newUseCase)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_UseCase(), newUseCase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePin getValuePin()
	{
		return (ValuePin)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ValuePin(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuePin(ValuePin newValuePin, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ValuePin(), newValuePin, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuePin(ValuePin newValuePin)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ValuePin(), newValuePin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getValueSpecification()
	{
		return (ValueSpecification)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_ValueSpecification(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSpecification(ValueSpecification newValueSpecification, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_ValueSpecification(), newValueSpecification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSpecification(ValueSpecification newValueSpecification)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_ValueSpecification(), newValueSpecification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable()
	{
		return (Variable)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Variable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(Variable newVariable, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Variable(), newVariable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Variable(), newVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAction getVariableAction()
	{
		return (VariableAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_VariableAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableAction(VariableAction newVariableAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_VariableAction(), newVariableAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableAction(VariableAction newVariableAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_VariableAction(), newVariableAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getVertex()
	{
		return (Vertex)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_Vertex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVertex(Vertex newVertex, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_Vertex(), newVertex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVertex(Vertex newVertex)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_Vertex(), newVertex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteLinkAction getWriteLinkAction()
	{
		return (WriteLinkAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_WriteLinkAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWriteLinkAction(WriteLinkAction newWriteLinkAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_WriteLinkAction(), newWriteLinkAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteLinkAction(WriteLinkAction newWriteLinkAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_WriteLinkAction(), newWriteLinkAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteStructuralFeatureAction getWriteStructuralFeatureAction()
	{
		return (WriteStructuralFeatureAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_WriteStructuralFeatureAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWriteStructuralFeatureAction(WriteStructuralFeatureAction newWriteStructuralFeatureAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_WriteStructuralFeatureAction(), newWriteStructuralFeatureAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteStructuralFeatureAction(WriteStructuralFeatureAction newWriteStructuralFeatureAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_WriteStructuralFeatureAction(), newWriteStructuralFeatureAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteVariableAction getWriteVariableAction()
	{
		return (WriteVariableAction)getMixed().get(UmlPackage.eINSTANCE.getDocumentRoot_WriteVariableAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWriteVariableAction(WriteVariableAction newWriteVariableAction, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.eINSTANCE.getDocumentRoot_WriteVariableAction(), newWriteVariableAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteVariableAction(WriteVariableAction newWriteVariableAction)
	{
		((FeatureMap.Internal)getMixed()).set(UmlPackage.eINSTANCE.getDocumentRoot_WriteVariableAction(), newWriteVariableAction);
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
			case UmlPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case UmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case UmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case UmlPackage.DOCUMENT_ROOT__ABSTRACTION:
				return basicSetAbstraction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__ACCEPT_CALL_ACTION:
				return basicSetAcceptCallAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__ACCEPT_EVENT_ACTION:
				return basicSetAcceptEventAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__ACTION:
				return basicSetAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY:
				return basicSetActivity(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_EDGE:
				return basicSetActivityEdge(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_FINAL_NODE:
				return basicSetActivityFinalNode(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_GROUP:
				return basicSetActivityGroup(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_NODE:
				return basicSetActivityNode(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_PARAMETER_NODE:
				return basicSetActivityParameterNode(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_PARTITION:
				return basicSetActivityPartition(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__ACTOR:
				return basicSetActor(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__ADD_STRUCTURAL_FEATURE_VALUE_ACTION:
				return basicSetAddStructuralFeatureValueAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__ADD_VARIABLE_VALUE_ACTION:
				return basicSetAddVariableValueAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__ANY_TRIGGER:
				return basicSetAnyTrigger(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__APPLY_FUNCTION_ACTION:
				return basicSetApplyFunctionAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__ARTIFACT:
				return basicSetArtifact(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__ASSOCIATION:
				return basicSetAssociation(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__ASSOCIATION_CLASS:
				return basicSetAssociationClass(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__BEHAVIOR:
				return basicSetBehavior(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__BEHAVIORAL_FEATURE:
				return basicSetBehavioralFeature(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__BEHAVIORED_CLASSIFIER:
				return basicSetBehavioredClassifier(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__BROADCAST_SIGNAL_ACTION:
				return basicSetBroadcastSignalAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CALL_ACTION:
				return basicSetCallAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CALL_BEHAVIOR_ACTION:
				return basicSetCallBehaviorAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CALL_OPERATION_ACTION:
				return basicSetCallOperationAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CALL_TRIGGER:
				return basicSetCallTrigger(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CENTRAL_BUFFER_NODE:
				return basicSetCentralBufferNode(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CHANGE_TRIGGER:
				return basicSetChangeTrigger(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CLASS:
				return basicSetClass(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CLASSIFIER:
				return basicSetClassifier(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CLASSIFIER_TEMPLATE_PARAMETER:
				return basicSetClassifierTemplateParameter(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CLAUSE:
				return basicSetClause(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CLEAR_ASSOCIATION_ACTION:
				return basicSetClearAssociationAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CLEAR_STRUCTURAL_FEATURE_ACTION:
				return basicSetClearStructuralFeatureAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CLEAR_VARIABLE_ACTION:
				return basicSetClearVariableAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__COLLABORATION:
				return basicSetCollaboration(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__COLLABORATION_OCCURRENCE:
				return basicSetCollaborationOccurrence(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__COMBINED_FRAGMENT:
				return basicSetCombinedFragment(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__COMMENT:
				return basicSetComment(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__COMMUNICATION_PATH:
				return basicSetCommunicationPath(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__COMPONENT:
				return basicSetComponent(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CONDITIONAL_NODE:
				return basicSetConditionalNode(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CONNECTABLE_ELEMENT:
				return basicSetConnectableElement(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER:
				return basicSetConnectableElementTemplateParameter(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CONNECTION_POINT_REFERENCE:
				return basicSetConnectionPointReference(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CONNECTOR:
				return basicSetConnector(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CONNECTOR_END:
				return basicSetConnectorEnd(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CONSTRAINT:
				return basicSetConstraint(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CONTINUATION:
				return basicSetContinuation(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CONTROL_FLOW:
				return basicSetControlFlow(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CONTROL_NODE:
				return basicSetControlNode(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CREATE_LINK_ACTION:
				return basicSetCreateLinkAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CREATE_LINK_OBJECT_ACTION:
				return basicSetCreateLinkObjectAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CREATE_OBJECT_ACTION:
				return basicSetCreateObjectAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__DATA_STORE_NODE:
				return basicSetDataStoreNode(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__DATA_TYPE:
				return basicSetDataType(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__DECISION_NODE:
				return basicSetDecisionNode(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__DEPENDENCY:
				return basicSetDependency(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__DEPLOYED_ARTIFACT:
				return basicSetDeployedArtifact(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__DEPLOYMENT:
				return basicSetDeployment(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__DEPLOYMENT_SPECIFICATION:
				return basicSetDeploymentSpecification(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__DEPLOYMENT_TARGET:
				return basicSetDeploymentTarget(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__DESTROY_LINK_ACTION:
				return basicSetDestroyLinkAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__DESTROY_OBJECT_ACTION:
				return basicSetDestroyObjectAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__DEVICE:
				return basicSetDevice(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__DIRECTED_RELATIONSHIP:
				return basicSetDirectedRelationship(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__DURATION:
				return basicSetDuration(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__DURATION_CONSTRAINT:
				return basicSetDurationConstraint(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__DURATION_INTERVAL:
				return basicSetDurationInterval(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__DURATION_OBSERVATION_ACTION:
				return basicSetDurationObservationAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__ELEMENT:
				return basicSetElement(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__ELEMENT_IMPORT:
				return basicSetElementImport(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__ENCAPSULATED_CLASSIFIER:
				return basicSetEncapsulatedClassifier(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__ENUMERATION:
				return basicSetEnumeration(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__ENUMERATION_LITERAL:
				return basicSetEnumerationLiteral(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__EVENT_OCCURRENCE:
				return basicSetEventOccurrence(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__EXCEPTION_HANDLER:
				return basicSetExceptionHandler(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__EXECUTABLE_NODE:
				return basicSetExecutableNode(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__EXECUTION_ENVIRONMENT:
				return basicSetExecutionEnvironment(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__EXECUTION_OCCURRENCE:
				return basicSetExecutionOccurrence(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__EXPANSION_NODE:
				return basicSetExpansionNode(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__EXPANSION_REGION:
				return basicSetExpansionRegion(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__EXPRESSION:
				return basicSetExpression(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__EXTEND:
				return basicSetExtend(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__EXTENSION:
				return basicSetExtension(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__EXTENSION_END:
				return basicSetExtensionEnd(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__EXTENSION_POINT:
				return basicSetExtensionPoint(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__FEATURE:
				return basicSetFeature(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__FINAL_NODE:
				return basicSetFinalNode(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__FINAL_STATE:
				return basicSetFinalState(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__FLOW_FINAL_NODE:
				return basicSetFlowFinalNode(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__FORK_NODE:
				return basicSetForkNode(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__GATE:
				return basicSetGate(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__GENERALIZATION:
				return basicSetGeneralization(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__GENERALIZATION_SET:
				return basicSetGeneralizationSet(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__GENERAL_ORDERING:
				return basicSetGeneralOrdering(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__IMPLEMENTATION:
				return basicSetImplementation(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__INCLUDE:
				return basicSetInclude(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__INFORMATION_FLOW:
				return basicSetInformationFlow(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__INFORMATION_ITEM:
				return basicSetInformationItem(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__INITIAL_NODE:
				return basicSetInitialNode(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__INPUT_PIN:
				return basicSetInputPin(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__INSTANCE_SPECIFICATION:
				return basicSetInstanceSpecification(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__INSTANCE_VALUE:
				return basicSetInstanceValue(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__INTERACTION:
				return basicSetInteraction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__INTERACTION_CONSTRAINT:
				return basicSetInteractionConstraint(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__INTERACTION_FRAGMENT:
				return basicSetInteractionFragment(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__INTERACTION_OCCURRENCE:
				return basicSetInteractionOccurrence(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__INTERACTION_OPERAND:
				return basicSetInteractionOperand(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__INTERFACE:
				return basicSetInterface(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__INTERRUPTIBLE_ACTIVITY_REGION:
				return basicSetInterruptibleActivityRegion(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__INTERVAL:
				return basicSetInterval(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__INTERVAL_CONSTRAINT:
				return basicSetIntervalConstraint(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__INVOCATION_ACTION:
				return basicSetInvocationAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__JOIN_NODE:
				return basicSetJoinNode(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__LIFELINE:
				return basicSetLifeline(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__LINK_ACTION:
				return basicSetLinkAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__LINK_END_CREATION_DATA:
				return basicSetLinkEndCreationData(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__LINK_END_DATA:
				return basicSetLinkEndData(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__LITERAL_BOOLEAN:
				return basicSetLiteralBoolean(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__LITERAL_INTEGER:
				return basicSetLiteralInteger(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__LITERAL_NULL:
				return basicSetLiteralNull(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__LITERAL_SPECIFICATION:
				return basicSetLiteralSpecification(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__LITERAL_STRING:
				return basicSetLiteralString(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__LITERAL_UNLIMITED_NATURAL:
				return basicSetLiteralUnlimitedNatural(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__LOOP_NODE:
				return basicSetLoopNode(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__MANIFESTATION:
				return basicSetManifestation(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__MERGE_NODE:
				return basicSetMergeNode(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__MESSAGE:
				return basicSetMessage(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__MESSAGE_END:
				return basicSetMessageEnd(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__MESSAGE_TRIGGER:
				return basicSetMessageTrigger(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__MODEL:
				return basicSetModel(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__MULTIPLICITY_ELEMENT:
				return basicSetMultiplicityElement(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__NAMED_ELEMENT:
				return basicSetNamedElement(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__NAMESPACE:
				return basicSetNamespace(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__NODE:
				return basicSetNode(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__OBJECT_FLOW:
				return basicSetObjectFlow(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__OBJECT_NODE:
				return basicSetObjectNode(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__OPAQUE_EXPRESSION:
				return basicSetOpaqueExpression(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__OPERATION:
				return basicSetOperation(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__OPERATION_TEMPLATE_PARAMETER:
				return basicSetOperationTemplateParameter(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__OUTPUT_PIN:
				return basicSetOutputPin(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__PACKAGE:
				return basicSetPackage(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__PACKAGEABLE_ELEMENT:
				return basicSetPackageableElement(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__PACKAGE_IMPORT:
				return basicSetPackageImport(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__PACKAGE_MERGE:
				return basicSetPackageMerge(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__PARAMETER:
				return basicSetParameter(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__PARAMETERABLE_CLASSIFIER:
				return basicSetParameterableClassifier(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__PARAMETERABLE_ELEMENT:
				return basicSetParameterableElement(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__PARAMETER_SET:
				return basicSetParameterSet(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__PART_DECOMPOSITION:
				return basicSetPartDecomposition(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__PERMISSION:
				return basicSetPermission(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__PIN:
				return basicSetPin(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__PORT:
				return basicSetPort(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__PRIMITIVE_FUNCTION:
				return basicSetPrimitiveFunction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__PRIMITIVE_TYPE:
				return basicSetPrimitiveType(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__PROFILE:
				return basicSetProfile(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__PROFILE_APPLICATION:
				return basicSetProfileApplication(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__PROPERTY:
				return basicSetProperty(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__PROTOCOL_CONFORMANCE:
				return basicSetProtocolConformance(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__PROTOCOL_STATE_MACHINE:
				return basicSetProtocolStateMachine(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__PROTOCOL_TRANSITION:
				return basicSetProtocolTransition(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__PSEUDOSTATE:
				return basicSetPseudostate(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__QUALIFIER_VALUE:
				return basicSetQualifierValue(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__RAISE_EXCEPTION_ACTION:
				return basicSetRaiseExceptionAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__READ_EXTENT_ACTION:
				return basicSetReadExtentAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__READ_IS_CLASSIFIED_OBJECT_ACTION:
				return basicSetReadIsClassifiedObjectAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__READ_LINK_ACTION:
				return basicSetReadLinkAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__READ_LINK_OBJECT_END_ACTION:
				return basicSetReadLinkObjectEndAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__READ_LINK_OBJECT_END_QUALIFIER_ACTION:
				return basicSetReadLinkObjectEndQualifierAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__READ_SELF_ACTION:
				return basicSetReadSelfAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__READ_STRUCTURAL_FEATURE_ACTION:
				return basicSetReadStructuralFeatureAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__READ_VARIABLE_ACTION:
				return basicSetReadVariableAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__REALIZATION:
				return basicSetRealization(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__RECEPTION:
				return basicSetReception(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__RECLASSIFY_OBJECT_ACTION:
				return basicSetReclassifyObjectAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__REDEFINABLE_ELEMENT:
				return basicSetRedefinableElement(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__REDEFINABLE_TEMPLATE_SIGNATURE:
				return basicSetRedefinableTemplateSignature(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__REGION:
				return basicSetRegion(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION:
				return basicSetRemoveStructuralFeatureValueAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__REMOVE_VARIABLE_VALUE_ACTION:
				return basicSetRemoveVariableValueAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__REPLY_ACTION:
				return basicSetReplyAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__SEND_OBJECT_ACTION:
				return basicSetSendObjectAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__SEND_SIGNAL_ACTION:
				return basicSetSendSignalAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__SIGNAL:
				return basicSetSignal(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__SIGNAL_TRIGGER:
				return basicSetSignalTrigger(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__SLOT:
				return basicSetSlot(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__START_OWNED_BEHAVIOR_ACTION:
				return basicSetStartOwnedBehaviorAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__STATE:
				return basicSetState(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__STATE_INVARIANT:
				return basicSetStateInvariant(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__STATE_MACHINE:
				return basicSetStateMachine(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__STEREOTYPE:
				return basicSetStereotype(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__STOP:
				return basicSetStop(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__STRING_EXPRESSION:
				return basicSetStringExpression(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__STRUCTURAL_FEATURE:
				return basicSetStructuralFeature(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__STRUCTURAL_FEATURE_ACTION:
				return basicSetStructuralFeatureAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__STRUCTURED_ACTIVITY_NODE:
				return basicSetStructuredActivityNode(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__STRUCTURED_CLASSIFIER:
				return basicSetStructuredClassifier(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__SUBSTITUTION:
				return basicSetSubstitution(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__TEMPLATEABLE_CLASSIFIER:
				return basicSetTemplateableClassifier(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__TEMPLATEABLE_ELEMENT:
				return basicSetTemplateableElement(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__TEMPLATE_BINDING:
				return basicSetTemplateBinding(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__TEMPLATE_PARAMETER_SUBSTITUTION:
				return basicSetTemplateParameterSubstitution(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__TEMPLATE_SIGNATURE:
				return basicSetTemplateSignature(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__TEST_IDENTITY_ACTION:
				return basicSetTestIdentityAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__TIME_CONSTRAINT:
				return basicSetTimeConstraint(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__TIME_EXPRESSION:
				return basicSetTimeExpression(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__TIME_INTERVAL:
				return basicSetTimeInterval(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__TIME_OBSERVATION_ACTION:
				return basicSetTimeObservationAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__TIME_TRIGGER:
				return basicSetTimeTrigger(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__TRANSITION:
				return basicSetTransition(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__TRIGGER:
				return basicSetTrigger(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__TYPE:
				return basicSetType(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__TYPED_ELEMENT:
				return basicSetTypedElement(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__USAGE:
				return basicSetUsage(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__USE_CASE:
				return basicSetUseCase(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__VALUE_PIN:
				return basicSetValuePin(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__VALUE_SPECIFICATION:
				return basicSetValueSpecification(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__VARIABLE:
				return basicSetVariable(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__VARIABLE_ACTION:
				return basicSetVariableAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__VERTEX:
				return basicSetVertex(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__WRITE_LINK_ACTION:
				return basicSetWriteLinkAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__WRITE_STRUCTURAL_FEATURE_ACTION:
				return basicSetWriteStructuralFeatureAction(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__WRITE_VARIABLE_ACTION:
				return basicSetWriteVariableAction(null, msgs);
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
			case UmlPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case UmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case UmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case UmlPackage.DOCUMENT_ROOT__ABSTRACTION:
				return getAbstraction();
			case UmlPackage.DOCUMENT_ROOT__ACCEPT_CALL_ACTION:
				return getAcceptCallAction();
			case UmlPackage.DOCUMENT_ROOT__ACCEPT_EVENT_ACTION:
				return getAcceptEventAction();
			case UmlPackage.DOCUMENT_ROOT__ACTION:
				return getAction();
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY:
				return getActivity();
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_EDGE:
				return getActivityEdge();
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_FINAL_NODE:
				return getActivityFinalNode();
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_GROUP:
				return getActivityGroup();
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_NODE:
				return getActivityNode();
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_PARAMETER_NODE:
				return getActivityParameterNode();
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_PARTITION:
				return getActivityPartition();
			case UmlPackage.DOCUMENT_ROOT__ACTOR:
				return getActor();
			case UmlPackage.DOCUMENT_ROOT__ADD_STRUCTURAL_FEATURE_VALUE_ACTION:
				return getAddStructuralFeatureValueAction();
			case UmlPackage.DOCUMENT_ROOT__ADD_VARIABLE_VALUE_ACTION:
				return getAddVariableValueAction();
			case UmlPackage.DOCUMENT_ROOT__ANY_TRIGGER:
				return getAnyTrigger();
			case UmlPackage.DOCUMENT_ROOT__APPLY_FUNCTION_ACTION:
				return getApplyFunctionAction();
			case UmlPackage.DOCUMENT_ROOT__ARTIFACT:
				return getArtifact();
			case UmlPackage.DOCUMENT_ROOT__ASSOCIATION:
				return getAssociation();
			case UmlPackage.DOCUMENT_ROOT__ASSOCIATION_CLASS:
				return getAssociationClass();
			case UmlPackage.DOCUMENT_ROOT__BEHAVIOR:
				return getBehavior();
			case UmlPackage.DOCUMENT_ROOT__BEHAVIORAL_FEATURE:
				return getBehavioralFeature();
			case UmlPackage.DOCUMENT_ROOT__BEHAVIORED_CLASSIFIER:
				return getBehavioredClassifier();
			case UmlPackage.DOCUMENT_ROOT__BROADCAST_SIGNAL_ACTION:
				return getBroadcastSignalAction();
			case UmlPackage.DOCUMENT_ROOT__CALL_ACTION:
				return getCallAction();
			case UmlPackage.DOCUMENT_ROOT__CALL_BEHAVIOR_ACTION:
				return getCallBehaviorAction();
			case UmlPackage.DOCUMENT_ROOT__CALL_OPERATION_ACTION:
				return getCallOperationAction();
			case UmlPackage.DOCUMENT_ROOT__CALL_TRIGGER:
				return getCallTrigger();
			case UmlPackage.DOCUMENT_ROOT__CENTRAL_BUFFER_NODE:
				return getCentralBufferNode();
			case UmlPackage.DOCUMENT_ROOT__CHANGE_TRIGGER:
				return getChangeTrigger();
			case UmlPackage.DOCUMENT_ROOT__CLASS:
				return getClass_();
			case UmlPackage.DOCUMENT_ROOT__CLASSIFIER:
				return getClassifier();
			case UmlPackage.DOCUMENT_ROOT__CLASSIFIER_TEMPLATE_PARAMETER:
				return getClassifierTemplateParameter();
			case UmlPackage.DOCUMENT_ROOT__CLAUSE:
				return getClause();
			case UmlPackage.DOCUMENT_ROOT__CLEAR_ASSOCIATION_ACTION:
				return getClearAssociationAction();
			case UmlPackage.DOCUMENT_ROOT__CLEAR_STRUCTURAL_FEATURE_ACTION:
				return getClearStructuralFeatureAction();
			case UmlPackage.DOCUMENT_ROOT__CLEAR_VARIABLE_ACTION:
				return getClearVariableAction();
			case UmlPackage.DOCUMENT_ROOT__COLLABORATION:
				return getCollaboration();
			case UmlPackage.DOCUMENT_ROOT__COLLABORATION_OCCURRENCE:
				return getCollaborationOccurrence();
			case UmlPackage.DOCUMENT_ROOT__COMBINED_FRAGMENT:
				return getCombinedFragment();
			case UmlPackage.DOCUMENT_ROOT__COMMENT:
				return getComment();
			case UmlPackage.DOCUMENT_ROOT__COMMUNICATION_PATH:
				return getCommunicationPath();
			case UmlPackage.DOCUMENT_ROOT__COMPONENT:
				return getComponent();
			case UmlPackage.DOCUMENT_ROOT__CONDITIONAL_NODE:
				return getConditionalNode();
			case UmlPackage.DOCUMENT_ROOT__CONNECTABLE_ELEMENT:
				return getConnectableElement();
			case UmlPackage.DOCUMENT_ROOT__CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER:
				return getConnectableElementTemplateParameter();
			case UmlPackage.DOCUMENT_ROOT__CONNECTION_POINT_REFERENCE:
				return getConnectionPointReference();
			case UmlPackage.DOCUMENT_ROOT__CONNECTOR:
				return getConnector();
			case UmlPackage.DOCUMENT_ROOT__CONNECTOR_END:
				return getConnectorEnd();
			case UmlPackage.DOCUMENT_ROOT__CONSTRAINT:
				return getConstraint();
			case UmlPackage.DOCUMENT_ROOT__CONTINUATION:
				return getContinuation();
			case UmlPackage.DOCUMENT_ROOT__CONTROL_FLOW:
				return getControlFlow();
			case UmlPackage.DOCUMENT_ROOT__CONTROL_NODE:
				return getControlNode();
			case UmlPackage.DOCUMENT_ROOT__CREATE_LINK_ACTION:
				return getCreateLinkAction();
			case UmlPackage.DOCUMENT_ROOT__CREATE_LINK_OBJECT_ACTION:
				return getCreateLinkObjectAction();
			case UmlPackage.DOCUMENT_ROOT__CREATE_OBJECT_ACTION:
				return getCreateObjectAction();
			case UmlPackage.DOCUMENT_ROOT__DATA_STORE_NODE:
				return getDataStoreNode();
			case UmlPackage.DOCUMENT_ROOT__DATA_TYPE:
				return getDataType();
			case UmlPackage.DOCUMENT_ROOT__DECISION_NODE:
				return getDecisionNode();
			case UmlPackage.DOCUMENT_ROOT__DEPENDENCY:
				return getDependency();
			case UmlPackage.DOCUMENT_ROOT__DEPLOYED_ARTIFACT:
				return getDeployedArtifact();
			case UmlPackage.DOCUMENT_ROOT__DEPLOYMENT:
				return getDeployment();
			case UmlPackage.DOCUMENT_ROOT__DEPLOYMENT_SPECIFICATION:
				return getDeploymentSpecification();
			case UmlPackage.DOCUMENT_ROOT__DEPLOYMENT_TARGET:
				return getDeploymentTarget();
			case UmlPackage.DOCUMENT_ROOT__DESTROY_LINK_ACTION:
				return getDestroyLinkAction();
			case UmlPackage.DOCUMENT_ROOT__DESTROY_OBJECT_ACTION:
				return getDestroyObjectAction();
			case UmlPackage.DOCUMENT_ROOT__DEVICE:
				return getDevice();
			case UmlPackage.DOCUMENT_ROOT__DIRECTED_RELATIONSHIP:
				return getDirectedRelationship();
			case UmlPackage.DOCUMENT_ROOT__DURATION:
				return getDuration();
			case UmlPackage.DOCUMENT_ROOT__DURATION_CONSTRAINT:
				return getDurationConstraint();
			case UmlPackage.DOCUMENT_ROOT__DURATION_INTERVAL:
				return getDurationInterval();
			case UmlPackage.DOCUMENT_ROOT__DURATION_OBSERVATION_ACTION:
				return getDurationObservationAction();
			case UmlPackage.DOCUMENT_ROOT__ELEMENT:
				return getElement();
			case UmlPackage.DOCUMENT_ROOT__ELEMENT_IMPORT:
				return getElementImport();
			case UmlPackage.DOCUMENT_ROOT__ENCAPSULATED_CLASSIFIER:
				return getEncapsulatedClassifier();
			case UmlPackage.DOCUMENT_ROOT__ENUMERATION:
				return getEnumeration();
			case UmlPackage.DOCUMENT_ROOT__ENUMERATION_LITERAL:
				return getEnumerationLiteral();
			case UmlPackage.DOCUMENT_ROOT__EVENT_OCCURRENCE:
				return getEventOccurrence();
			case UmlPackage.DOCUMENT_ROOT__EXCEPTION_HANDLER:
				return getExceptionHandler();
			case UmlPackage.DOCUMENT_ROOT__EXECUTABLE_NODE:
				return getExecutableNode();
			case UmlPackage.DOCUMENT_ROOT__EXECUTION_ENVIRONMENT:
				return getExecutionEnvironment();
			case UmlPackage.DOCUMENT_ROOT__EXECUTION_OCCURRENCE:
				return getExecutionOccurrence();
			case UmlPackage.DOCUMENT_ROOT__EXPANSION_NODE:
				return getExpansionNode();
			case UmlPackage.DOCUMENT_ROOT__EXPANSION_REGION:
				return getExpansionRegion();
			case UmlPackage.DOCUMENT_ROOT__EXPRESSION:
				return getExpression();
			case UmlPackage.DOCUMENT_ROOT__EXTEND:
				return getExtend();
			case UmlPackage.DOCUMENT_ROOT__EXTENSION:
				return getExtension();
			case UmlPackage.DOCUMENT_ROOT__EXTENSION_END:
				return getExtensionEnd();
			case UmlPackage.DOCUMENT_ROOT__EXTENSION_POINT:
				return getExtensionPoint();
			case UmlPackage.DOCUMENT_ROOT__FEATURE:
				return getFeature();
			case UmlPackage.DOCUMENT_ROOT__FINAL_NODE:
				return getFinalNode();
			case UmlPackage.DOCUMENT_ROOT__FINAL_STATE:
				return getFinalState();
			case UmlPackage.DOCUMENT_ROOT__FLOW_FINAL_NODE:
				return getFlowFinalNode();
			case UmlPackage.DOCUMENT_ROOT__FORK_NODE:
				return getForkNode();
			case UmlPackage.DOCUMENT_ROOT__GATE:
				return getGate();
			case UmlPackage.DOCUMENT_ROOT__GENERALIZATION:
				return getGeneralization();
			case UmlPackage.DOCUMENT_ROOT__GENERALIZATION_SET:
				return getGeneralizationSet();
			case UmlPackage.DOCUMENT_ROOT__GENERAL_ORDERING:
				return getGeneralOrdering();
			case UmlPackage.DOCUMENT_ROOT__IMPLEMENTATION:
				return getImplementation();
			case UmlPackage.DOCUMENT_ROOT__INCLUDE:
				return getInclude();
			case UmlPackage.DOCUMENT_ROOT__INFORMATION_FLOW:
				return getInformationFlow();
			case UmlPackage.DOCUMENT_ROOT__INFORMATION_ITEM:
				return getInformationItem();
			case UmlPackage.DOCUMENT_ROOT__INITIAL_NODE:
				return getInitialNode();
			case UmlPackage.DOCUMENT_ROOT__INPUT_PIN:
				return getInputPin();
			case UmlPackage.DOCUMENT_ROOT__INSTANCE_SPECIFICATION:
				return getInstanceSpecification();
			case UmlPackage.DOCUMENT_ROOT__INSTANCE_VALUE:
				return getInstanceValue();
			case UmlPackage.DOCUMENT_ROOT__INTERACTION:
				return getInteraction();
			case UmlPackage.DOCUMENT_ROOT__INTERACTION_CONSTRAINT:
				return getInteractionConstraint();
			case UmlPackage.DOCUMENT_ROOT__INTERACTION_FRAGMENT:
				return getInteractionFragment();
			case UmlPackage.DOCUMENT_ROOT__INTERACTION_OCCURRENCE:
				return getInteractionOccurrence();
			case UmlPackage.DOCUMENT_ROOT__INTERACTION_OPERAND:
				return getInteractionOperand();
			case UmlPackage.DOCUMENT_ROOT__INTERFACE:
				return getInterface();
			case UmlPackage.DOCUMENT_ROOT__INTERRUPTIBLE_ACTIVITY_REGION:
				return getInterruptibleActivityRegion();
			case UmlPackage.DOCUMENT_ROOT__INTERVAL:
				return getInterval();
			case UmlPackage.DOCUMENT_ROOT__INTERVAL_CONSTRAINT:
				return getIntervalConstraint();
			case UmlPackage.DOCUMENT_ROOT__INVOCATION_ACTION:
				return getInvocationAction();
			case UmlPackage.DOCUMENT_ROOT__JOIN_NODE:
				return getJoinNode();
			case UmlPackage.DOCUMENT_ROOT__LIFELINE:
				return getLifeline();
			case UmlPackage.DOCUMENT_ROOT__LINK_ACTION:
				return getLinkAction();
			case UmlPackage.DOCUMENT_ROOT__LINK_END_CREATION_DATA:
				return getLinkEndCreationData();
			case UmlPackage.DOCUMENT_ROOT__LINK_END_DATA:
				return getLinkEndData();
			case UmlPackage.DOCUMENT_ROOT__LITERAL_BOOLEAN:
				return getLiteralBoolean();
			case UmlPackage.DOCUMENT_ROOT__LITERAL_INTEGER:
				return getLiteralInteger();
			case UmlPackage.DOCUMENT_ROOT__LITERAL_NULL:
				return getLiteralNull();
			case UmlPackage.DOCUMENT_ROOT__LITERAL_SPECIFICATION:
				return getLiteralSpecification();
			case UmlPackage.DOCUMENT_ROOT__LITERAL_STRING:
				return getLiteralString();
			case UmlPackage.DOCUMENT_ROOT__LITERAL_UNLIMITED_NATURAL:
				return getLiteralUnlimitedNatural();
			case UmlPackage.DOCUMENT_ROOT__LOOP_NODE:
				return getLoopNode();
			case UmlPackage.DOCUMENT_ROOT__MANIFESTATION:
				return getManifestation();
			case UmlPackage.DOCUMENT_ROOT__MERGE_NODE:
				return getMergeNode();
			case UmlPackage.DOCUMENT_ROOT__MESSAGE:
				return getMessage();
			case UmlPackage.DOCUMENT_ROOT__MESSAGE_END:
				return getMessageEnd();
			case UmlPackage.DOCUMENT_ROOT__MESSAGE_TRIGGER:
				return getMessageTrigger();
			case UmlPackage.DOCUMENT_ROOT__MODEL:
				return getModel();
			case UmlPackage.DOCUMENT_ROOT__MULTIPLICITY_ELEMENT:
				return getMultiplicityElement();
			case UmlPackage.DOCUMENT_ROOT__NAMED_ELEMENT:
				return getNamedElement();
			case UmlPackage.DOCUMENT_ROOT__NAMESPACE:
				return getNamespace();
			case UmlPackage.DOCUMENT_ROOT__NODE:
				return getNode();
			case UmlPackage.DOCUMENT_ROOT__OBJECT_FLOW:
				return getObjectFlow();
			case UmlPackage.DOCUMENT_ROOT__OBJECT_NODE:
				return getObjectNode();
			case UmlPackage.DOCUMENT_ROOT__OPAQUE_EXPRESSION:
				return getOpaqueExpression();
			case UmlPackage.DOCUMENT_ROOT__OPERATION:
				return getOperation();
			case UmlPackage.DOCUMENT_ROOT__OPERATION_TEMPLATE_PARAMETER:
				return getOperationTemplateParameter();
			case UmlPackage.DOCUMENT_ROOT__OUTPUT_PIN:
				return getOutputPin();
			case UmlPackage.DOCUMENT_ROOT__PACKAGE:
				return getPackage();
			case UmlPackage.DOCUMENT_ROOT__PACKAGEABLE_ELEMENT:
				return getPackageableElement();
			case UmlPackage.DOCUMENT_ROOT__PACKAGE_IMPORT:
				return getPackageImport();
			case UmlPackage.DOCUMENT_ROOT__PACKAGE_MERGE:
				return getPackageMerge();
			case UmlPackage.DOCUMENT_ROOT__PARAMETER:
				return getParameter();
			case UmlPackage.DOCUMENT_ROOT__PARAMETERABLE_CLASSIFIER:
				return getParameterableClassifier();
			case UmlPackage.DOCUMENT_ROOT__PARAMETERABLE_ELEMENT:
				return getParameterableElement();
			case UmlPackage.DOCUMENT_ROOT__PARAMETER_SET:
				return getParameterSet();
			case UmlPackage.DOCUMENT_ROOT__PART_DECOMPOSITION:
				return getPartDecomposition();
			case UmlPackage.DOCUMENT_ROOT__PERMISSION:
				return getPermission();
			case UmlPackage.DOCUMENT_ROOT__PIN:
				return getPin();
			case UmlPackage.DOCUMENT_ROOT__PORT:
				return getPort();
			case UmlPackage.DOCUMENT_ROOT__PRIMITIVE_FUNCTION:
				return getPrimitiveFunction();
			case UmlPackage.DOCUMENT_ROOT__PRIMITIVE_TYPE:
				return getPrimitiveType();
			case UmlPackage.DOCUMENT_ROOT__PROFILE:
				return getProfile();
			case UmlPackage.DOCUMENT_ROOT__PROFILE_APPLICATION:
				return getProfileApplication();
			case UmlPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty();
			case UmlPackage.DOCUMENT_ROOT__PROTOCOL_CONFORMANCE:
				return getProtocolConformance();
			case UmlPackage.DOCUMENT_ROOT__PROTOCOL_STATE_MACHINE:
				return getProtocolStateMachine();
			case UmlPackage.DOCUMENT_ROOT__PROTOCOL_TRANSITION:
				return getProtocolTransition();
			case UmlPackage.DOCUMENT_ROOT__PSEUDOSTATE:
				return getPseudostate();
			case UmlPackage.DOCUMENT_ROOT__QUALIFIER_VALUE:
				return getQualifierValue();
			case UmlPackage.DOCUMENT_ROOT__RAISE_EXCEPTION_ACTION:
				return getRaiseExceptionAction();
			case UmlPackage.DOCUMENT_ROOT__READ_EXTENT_ACTION:
				return getReadExtentAction();
			case UmlPackage.DOCUMENT_ROOT__READ_IS_CLASSIFIED_OBJECT_ACTION:
				return getReadIsClassifiedObjectAction();
			case UmlPackage.DOCUMENT_ROOT__READ_LINK_ACTION:
				return getReadLinkAction();
			case UmlPackage.DOCUMENT_ROOT__READ_LINK_OBJECT_END_ACTION:
				return getReadLinkObjectEndAction();
			case UmlPackage.DOCUMENT_ROOT__READ_LINK_OBJECT_END_QUALIFIER_ACTION:
				return getReadLinkObjectEndQualifierAction();
			case UmlPackage.DOCUMENT_ROOT__READ_SELF_ACTION:
				return getReadSelfAction();
			case UmlPackage.DOCUMENT_ROOT__READ_STRUCTURAL_FEATURE_ACTION:
				return getReadStructuralFeatureAction();
			case UmlPackage.DOCUMENT_ROOT__READ_VARIABLE_ACTION:
				return getReadVariableAction();
			case UmlPackage.DOCUMENT_ROOT__REALIZATION:
				return getRealization();
			case UmlPackage.DOCUMENT_ROOT__RECEPTION:
				return getReception();
			case UmlPackage.DOCUMENT_ROOT__RECLASSIFY_OBJECT_ACTION:
				return getReclassifyObjectAction();
			case UmlPackage.DOCUMENT_ROOT__REDEFINABLE_ELEMENT:
				return getRedefinableElement();
			case UmlPackage.DOCUMENT_ROOT__REDEFINABLE_TEMPLATE_SIGNATURE:
				return getRedefinableTemplateSignature();
			case UmlPackage.DOCUMENT_ROOT__REGION:
				return getRegion();
			case UmlPackage.DOCUMENT_ROOT__RELATIONSHIP:
				return getRelationship();
			case UmlPackage.DOCUMENT_ROOT__REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION:
				return getRemoveStructuralFeatureValueAction();
			case UmlPackage.DOCUMENT_ROOT__REMOVE_VARIABLE_VALUE_ACTION:
				return getRemoveVariableValueAction();
			case UmlPackage.DOCUMENT_ROOT__REPLY_ACTION:
				return getReplyAction();
			case UmlPackage.DOCUMENT_ROOT__SEND_OBJECT_ACTION:
				return getSendObjectAction();
			case UmlPackage.DOCUMENT_ROOT__SEND_SIGNAL_ACTION:
				return getSendSignalAction();
			case UmlPackage.DOCUMENT_ROOT__SIGNAL:
				return getSignal();
			case UmlPackage.DOCUMENT_ROOT__SIGNAL_TRIGGER:
				return getSignalTrigger();
			case UmlPackage.DOCUMENT_ROOT__SLOT:
				return getSlot();
			case UmlPackage.DOCUMENT_ROOT__START_OWNED_BEHAVIOR_ACTION:
				return getStartOwnedBehaviorAction();
			case UmlPackage.DOCUMENT_ROOT__STATE:
				return getState();
			case UmlPackage.DOCUMENT_ROOT__STATE_INVARIANT:
				return getStateInvariant();
			case UmlPackage.DOCUMENT_ROOT__STATE_MACHINE:
				return getStateMachine();
			case UmlPackage.DOCUMENT_ROOT__STEREOTYPE:
				return getStereotype();
			case UmlPackage.DOCUMENT_ROOT__STOP:
				return getStop();
			case UmlPackage.DOCUMENT_ROOT__STRING_EXPRESSION:
				return getStringExpression();
			case UmlPackage.DOCUMENT_ROOT__STRUCTURAL_FEATURE:
				return getStructuralFeature();
			case UmlPackage.DOCUMENT_ROOT__STRUCTURAL_FEATURE_ACTION:
				return getStructuralFeatureAction();
			case UmlPackage.DOCUMENT_ROOT__STRUCTURED_ACTIVITY_NODE:
				return getStructuredActivityNode();
			case UmlPackage.DOCUMENT_ROOT__STRUCTURED_CLASSIFIER:
				return getStructuredClassifier();
			case UmlPackage.DOCUMENT_ROOT__SUBSTITUTION:
				return getSubstitution();
			case UmlPackage.DOCUMENT_ROOT__TEMPLATEABLE_CLASSIFIER:
				return getTemplateableClassifier();
			case UmlPackage.DOCUMENT_ROOT__TEMPLATEABLE_ELEMENT:
				return getTemplateableElement();
			case UmlPackage.DOCUMENT_ROOT__TEMPLATE_BINDING:
				return getTemplateBinding();
			case UmlPackage.DOCUMENT_ROOT__TEMPLATE_PARAMETER:
				return getTemplateParameter();
			case UmlPackage.DOCUMENT_ROOT__TEMPLATE_PARAMETER_SUBSTITUTION:
				return getTemplateParameterSubstitution();
			case UmlPackage.DOCUMENT_ROOT__TEMPLATE_SIGNATURE:
				return getTemplateSignature();
			case UmlPackage.DOCUMENT_ROOT__TEST_IDENTITY_ACTION:
				return getTestIdentityAction();
			case UmlPackage.DOCUMENT_ROOT__TIME_CONSTRAINT:
				return getTimeConstraint();
			case UmlPackage.DOCUMENT_ROOT__TIME_EXPRESSION:
				return getTimeExpression();
			case UmlPackage.DOCUMENT_ROOT__TIME_INTERVAL:
				return getTimeInterval();
			case UmlPackage.DOCUMENT_ROOT__TIME_OBSERVATION_ACTION:
				return getTimeObservationAction();
			case UmlPackage.DOCUMENT_ROOT__TIME_TRIGGER:
				return getTimeTrigger();
			case UmlPackage.DOCUMENT_ROOT__TRANSITION:
				return getTransition();
			case UmlPackage.DOCUMENT_ROOT__TRIGGER:
				return getTrigger();
			case UmlPackage.DOCUMENT_ROOT__TYPE:
				return getType();
			case UmlPackage.DOCUMENT_ROOT__TYPED_ELEMENT:
				return getTypedElement();
			case UmlPackage.DOCUMENT_ROOT__USAGE:
				return getUsage();
			case UmlPackage.DOCUMENT_ROOT__USE_CASE:
				return getUseCase();
			case UmlPackage.DOCUMENT_ROOT__VALUE_PIN:
				return getValuePin();
			case UmlPackage.DOCUMENT_ROOT__VALUE_SPECIFICATION:
				return getValueSpecification();
			case UmlPackage.DOCUMENT_ROOT__VARIABLE:
				return getVariable();
			case UmlPackage.DOCUMENT_ROOT__VARIABLE_ACTION:
				return getVariableAction();
			case UmlPackage.DOCUMENT_ROOT__VERTEX:
				return getVertex();
			case UmlPackage.DOCUMENT_ROOT__WRITE_LINK_ACTION:
				return getWriteLinkAction();
			case UmlPackage.DOCUMENT_ROOT__WRITE_STRUCTURAL_FEATURE_ACTION:
				return getWriteStructuralFeatureAction();
			case UmlPackage.DOCUMENT_ROOT__WRITE_VARIABLE_ACTION:
				return getWriteVariableAction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case UmlPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ABSTRACTION:
				setAbstraction((Abstraction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ACCEPT_CALL_ACTION:
				setAcceptCallAction((AcceptCallAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ACCEPT_EVENT_ACTION:
				setAcceptEventAction((AcceptEventAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ACTION:
				setAction((Action)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_EDGE:
				setActivityEdge((ActivityEdge)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_FINAL_NODE:
				setActivityFinalNode((ActivityFinalNode)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_GROUP:
				setActivityGroup((ActivityGroup)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_NODE:
				setActivityNode((ActivityNode)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_PARAMETER_NODE:
				setActivityParameterNode((ActivityParameterNode)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_PARTITION:
				setActivityPartition((ActivityPartition)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ACTOR:
				setActor((Actor)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ADD_STRUCTURAL_FEATURE_VALUE_ACTION:
				setAddStructuralFeatureValueAction((AddStructuralFeatureValueAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ADD_VARIABLE_VALUE_ACTION:
				setAddVariableValueAction((AddVariableValueAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ANY_TRIGGER:
				setAnyTrigger((AnyTrigger)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__APPLY_FUNCTION_ACTION:
				setApplyFunctionAction((ApplyFunctionAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ARTIFACT:
				setArtifact((Artifact)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ASSOCIATION:
				setAssociation((Association)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ASSOCIATION_CLASS:
				setAssociationClass((AssociationClass)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__BEHAVIOR:
				setBehavior((Behavior)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__BEHAVIORAL_FEATURE:
				setBehavioralFeature((BehavioralFeature)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__BEHAVIORED_CLASSIFIER:
				setBehavioredClassifier((BehavioredClassifier)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__BROADCAST_SIGNAL_ACTION:
				setBroadcastSignalAction((BroadcastSignalAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CALL_ACTION:
				setCallAction((CallAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CALL_BEHAVIOR_ACTION:
				setCallBehaviorAction((CallBehaviorAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CALL_OPERATION_ACTION:
				setCallOperationAction((CallOperationAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CALL_TRIGGER:
				setCallTrigger((CallTrigger)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CENTRAL_BUFFER_NODE:
				setCentralBufferNode((CentralBufferNode)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CHANGE_TRIGGER:
				setChangeTrigger((ChangeTrigger)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CLASS:
				setClass((org.eclipse.uml2._1._0._0.uml.Class)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CLASSIFIER:
				setClassifier((Classifier)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CLASSIFIER_TEMPLATE_PARAMETER:
				setClassifierTemplateParameter((ClassifierTemplateParameter)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CLAUSE:
				setClause((Clause)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CLEAR_ASSOCIATION_ACTION:
				setClearAssociationAction((ClearAssociationAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CLEAR_STRUCTURAL_FEATURE_ACTION:
				setClearStructuralFeatureAction((ClearStructuralFeatureAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CLEAR_VARIABLE_ACTION:
				setClearVariableAction((ClearVariableAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__COLLABORATION:
				setCollaboration((Collaboration)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__COLLABORATION_OCCURRENCE:
				setCollaborationOccurrence((CollaborationOccurrence)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__COMBINED_FRAGMENT:
				setCombinedFragment((CombinedFragment)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__COMMENT:
				setComment((Comment)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__COMMUNICATION_PATH:
				setCommunicationPath((CommunicationPath)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__COMPONENT:
				setComponent((Component)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CONDITIONAL_NODE:
				setConditionalNode((ConditionalNode)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CONNECTABLE_ELEMENT:
				setConnectableElement((ConnectableElement)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER:
				setConnectableElementTemplateParameter((ConnectableElementTemplateParameter)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CONNECTION_POINT_REFERENCE:
				setConnectionPointReference((ConnectionPointReference)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CONNECTOR:
				setConnector((Connector)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CONNECTOR_END:
				setConnectorEnd((ConnectorEnd)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CONSTRAINT:
				setConstraint((Constraint)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CONTINUATION:
				setContinuation((Continuation)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CONTROL_FLOW:
				setControlFlow((ControlFlow)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CONTROL_NODE:
				setControlNode((ControlNode)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CREATE_LINK_ACTION:
				setCreateLinkAction((CreateLinkAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CREATE_LINK_OBJECT_ACTION:
				setCreateLinkObjectAction((CreateLinkObjectAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CREATE_OBJECT_ACTION:
				setCreateObjectAction((CreateObjectAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__DATA_STORE_NODE:
				setDataStoreNode((DataStoreNode)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__DECISION_NODE:
				setDecisionNode((DecisionNode)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__DEPENDENCY:
				setDependency((Dependency)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__DEPLOYED_ARTIFACT:
				setDeployedArtifact((DeployedArtifact)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__DEPLOYMENT:
				setDeployment((Deployment)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__DEPLOYMENT_SPECIFICATION:
				setDeploymentSpecification((DeploymentSpecification)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__DEPLOYMENT_TARGET:
				setDeploymentTarget((DeploymentTarget)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__DESTROY_LINK_ACTION:
				setDestroyLinkAction((DestroyLinkAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__DESTROY_OBJECT_ACTION:
				setDestroyObjectAction((DestroyObjectAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__DEVICE:
				setDevice((Device)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__DIRECTED_RELATIONSHIP:
				setDirectedRelationship((DirectedRelationship)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__DURATION:
				setDuration((Duration)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__DURATION_CONSTRAINT:
				setDurationConstraint((DurationConstraint)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__DURATION_INTERVAL:
				setDurationInterval((DurationInterval)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__DURATION_OBSERVATION_ACTION:
				setDurationObservationAction((DurationObservationAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ELEMENT:
				setElement((Element)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ELEMENT_IMPORT:
				setElementImport((ElementImport)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ENCAPSULATED_CLASSIFIER:
				setEncapsulatedClassifier((EncapsulatedClassifier)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ENUMERATION:
				setEnumeration((Enumeration)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ENUMERATION_LITERAL:
				setEnumerationLiteral((EnumerationLiteral)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__EVENT_OCCURRENCE:
				setEventOccurrence((EventOccurrence)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__EXCEPTION_HANDLER:
				setExceptionHandler((ExceptionHandler)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__EXECUTABLE_NODE:
				setExecutableNode((ExecutableNode)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__EXECUTION_ENVIRONMENT:
				setExecutionEnvironment((ExecutionEnvironment)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__EXECUTION_OCCURRENCE:
				setExecutionOccurrence((ExecutionOccurrence)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__EXPANSION_NODE:
				setExpansionNode((ExpansionNode)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__EXPANSION_REGION:
				setExpansionRegion((ExpansionRegion)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__EXTEND:
				setExtend((Extend)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__EXTENSION:
				setExtension((Extension)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__EXTENSION_END:
				setExtensionEnd((ExtensionEnd)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__EXTENSION_POINT:
				setExtensionPoint((ExtensionPoint)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__FEATURE:
				setFeature((Feature)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__FINAL_NODE:
				setFinalNode((FinalNode)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__FINAL_STATE:
				setFinalState((FinalState)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__FLOW_FINAL_NODE:
				setFlowFinalNode((FlowFinalNode)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__FORK_NODE:
				setForkNode((ForkNode)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__GATE:
				setGate((Gate)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__GENERALIZATION:
				setGeneralization((Generalization)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__GENERALIZATION_SET:
				setGeneralizationSet((GeneralizationSet)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__GENERAL_ORDERING:
				setGeneralOrdering((GeneralOrdering)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__IMPLEMENTATION:
				setImplementation((Implementation)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__INCLUDE:
				setInclude((Include)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__INFORMATION_FLOW:
				setInformationFlow((InformationFlow)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__INFORMATION_ITEM:
				setInformationItem((InformationItem)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__INITIAL_NODE:
				setInitialNode((InitialNode)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__INPUT_PIN:
				setInputPin((InputPin)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__INSTANCE_SPECIFICATION:
				setInstanceSpecification((InstanceSpecification)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__INSTANCE_VALUE:
				setInstanceValue((InstanceValue)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__INTERACTION:
				setInteraction((Interaction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__INTERACTION_CONSTRAINT:
				setInteractionConstraint((InteractionConstraint)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__INTERACTION_FRAGMENT:
				setInteractionFragment((InteractionFragment)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__INTERACTION_OCCURRENCE:
				setInteractionOccurrence((InteractionOccurrence)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__INTERACTION_OPERAND:
				setInteractionOperand((InteractionOperand)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__INTERFACE:
				setInterface((Interface)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__INTERRUPTIBLE_ACTIVITY_REGION:
				setInterruptibleActivityRegion((InterruptibleActivityRegion)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__INTERVAL:
				setInterval((Interval)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__INTERVAL_CONSTRAINT:
				setIntervalConstraint((IntervalConstraint)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__INVOCATION_ACTION:
				setInvocationAction((InvocationAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__JOIN_NODE:
				setJoinNode((JoinNode)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__LIFELINE:
				setLifeline((Lifeline)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__LINK_ACTION:
				setLinkAction((LinkAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__LINK_END_CREATION_DATA:
				setLinkEndCreationData((LinkEndCreationData)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__LINK_END_DATA:
				setLinkEndData((LinkEndData)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__LITERAL_BOOLEAN:
				setLiteralBoolean((LiteralBoolean)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__LITERAL_INTEGER:
				setLiteralInteger((LiteralInteger)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__LITERAL_NULL:
				setLiteralNull((LiteralNull)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__LITERAL_SPECIFICATION:
				setLiteralSpecification((LiteralSpecification)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__LITERAL_STRING:
				setLiteralString((LiteralString)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__LITERAL_UNLIMITED_NATURAL:
				setLiteralUnlimitedNatural((LiteralUnlimitedNatural)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__LOOP_NODE:
				setLoopNode((LoopNode)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__MANIFESTATION:
				setManifestation((Manifestation)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__MERGE_NODE:
				setMergeNode((MergeNode)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__MESSAGE:
				setMessage((Message)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__MESSAGE_END:
				setMessageEnd((MessageEnd)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__MESSAGE_TRIGGER:
				setMessageTrigger((MessageTrigger)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__MODEL:
				setModel((Model)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__MULTIPLICITY_ELEMENT:
				setMultiplicityElement((MultiplicityElement)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__NAMED_ELEMENT:
				setNamedElement((NamedElement)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__NAMESPACE:
				setNamespace((Namespace)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__NODE:
				setNode((Node)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__OBJECT_FLOW:
				setObjectFlow((ObjectFlow)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__OBJECT_NODE:
				setObjectNode((ObjectNode)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__OPAQUE_EXPRESSION:
				setOpaqueExpression((OpaqueExpression)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__OPERATION:
				setOperation((Operation)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__OPERATION_TEMPLATE_PARAMETER:
				setOperationTemplateParameter((OperationTemplateParameter)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__OUTPUT_PIN:
				setOutputPin((OutputPin)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__PACKAGE:
				setPackage((org.eclipse.uml2._1._0._0.uml.Package)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__PACKAGEABLE_ELEMENT:
				setPackageableElement((PackageableElement)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__PACKAGE_IMPORT:
				setPackageImport((PackageImport)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__PACKAGE_MERGE:
				setPackageMerge((PackageMerge)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__PARAMETER:
				setParameter((Parameter)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__PARAMETERABLE_CLASSIFIER:
				setParameterableClassifier((ParameterableClassifier)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__PARAMETERABLE_ELEMENT:
				setParameterableElement((ParameterableElement)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__PARAMETER_SET:
				setParameterSet((ParameterSet)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__PART_DECOMPOSITION:
				setPartDecomposition((PartDecomposition)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__PERMISSION:
				setPermission((Permission)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__PIN:
				setPin((Pin)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__PORT:
				setPort((Port)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__PRIMITIVE_FUNCTION:
				setPrimitiveFunction((PrimitiveFunction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__PRIMITIVE_TYPE:
				setPrimitiveType((PrimitiveType)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__PROFILE:
				setProfile((Profile)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__PROFILE_APPLICATION:
				setProfileApplication((ProfileApplication)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((Property)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__PROTOCOL_CONFORMANCE:
				setProtocolConformance((ProtocolConformance)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__PROTOCOL_STATE_MACHINE:
				setProtocolStateMachine((ProtocolStateMachine)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__PROTOCOL_TRANSITION:
				setProtocolTransition((ProtocolTransition)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__PSEUDOSTATE:
				setPseudostate((Pseudostate)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__QUALIFIER_VALUE:
				setQualifierValue((QualifierValue)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__RAISE_EXCEPTION_ACTION:
				setRaiseExceptionAction((RaiseExceptionAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__READ_EXTENT_ACTION:
				setReadExtentAction((ReadExtentAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__READ_IS_CLASSIFIED_OBJECT_ACTION:
				setReadIsClassifiedObjectAction((ReadIsClassifiedObjectAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__READ_LINK_ACTION:
				setReadLinkAction((ReadLinkAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__READ_LINK_OBJECT_END_ACTION:
				setReadLinkObjectEndAction((ReadLinkObjectEndAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__READ_LINK_OBJECT_END_QUALIFIER_ACTION:
				setReadLinkObjectEndQualifierAction((ReadLinkObjectEndQualifierAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__READ_SELF_ACTION:
				setReadSelfAction((ReadSelfAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__READ_STRUCTURAL_FEATURE_ACTION:
				setReadStructuralFeatureAction((ReadStructuralFeatureAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__READ_VARIABLE_ACTION:
				setReadVariableAction((ReadVariableAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__REALIZATION:
				setRealization((Realization)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__RECEPTION:
				setReception((Reception)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__RECLASSIFY_OBJECT_ACTION:
				setReclassifyObjectAction((ReclassifyObjectAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__REDEFINABLE_ELEMENT:
				setRedefinableElement((RedefinableElement)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__REDEFINABLE_TEMPLATE_SIGNATURE:
				setRedefinableTemplateSignature((RedefinableTemplateSignature)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__REGION:
				setRegion((Region)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__RELATIONSHIP:
				setRelationship((Relationship)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION:
				setRemoveStructuralFeatureValueAction((RemoveStructuralFeatureValueAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__REMOVE_VARIABLE_VALUE_ACTION:
				setRemoveVariableValueAction((RemoveVariableValueAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__REPLY_ACTION:
				setReplyAction((ReplyAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__SEND_OBJECT_ACTION:
				setSendObjectAction((SendObjectAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__SEND_SIGNAL_ACTION:
				setSendSignalAction((SendSignalAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__SIGNAL:
				setSignal((Signal)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__SIGNAL_TRIGGER:
				setSignalTrigger((SignalTrigger)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__SLOT:
				setSlot((Slot)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__START_OWNED_BEHAVIOR_ACTION:
				setStartOwnedBehaviorAction((StartOwnedBehaviorAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__STATE:
				setState((State)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__STATE_INVARIANT:
				setStateInvariant((StateInvariant)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__STATE_MACHINE:
				setStateMachine((StateMachine)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__STEREOTYPE:
				setStereotype((Stereotype)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__STOP:
				setStop((Stop)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__STRING_EXPRESSION:
				setStringExpression((StringExpression)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__STRUCTURAL_FEATURE:
				setStructuralFeature((StructuralFeature)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__STRUCTURAL_FEATURE_ACTION:
				setStructuralFeatureAction((StructuralFeatureAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__STRUCTURED_ACTIVITY_NODE:
				setStructuredActivityNode((StructuredActivityNode)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__STRUCTURED_CLASSIFIER:
				setStructuredClassifier((StructuredClassifier)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__SUBSTITUTION:
				setSubstitution((Substitution)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__TEMPLATEABLE_CLASSIFIER:
				setTemplateableClassifier((TemplateableClassifier)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__TEMPLATEABLE_ELEMENT:
				setTemplateableElement((TemplateableElement)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__TEMPLATE_BINDING:
				setTemplateBinding((TemplateBinding)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__TEMPLATE_PARAMETER_SUBSTITUTION:
				setTemplateParameterSubstitution((TemplateParameterSubstitution)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__TEMPLATE_SIGNATURE:
				setTemplateSignature((TemplateSignature)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__TEST_IDENTITY_ACTION:
				setTestIdentityAction((TestIdentityAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__TIME_CONSTRAINT:
				setTimeConstraint((TimeConstraint)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__TIME_EXPRESSION:
				setTimeExpression((TimeExpression)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__TIME_INTERVAL:
				setTimeInterval((TimeInterval)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__TIME_OBSERVATION_ACTION:
				setTimeObservationAction((TimeObservationAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__TIME_TRIGGER:
				setTimeTrigger((TimeTrigger)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__TRANSITION:
				setTransition((Transition)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__TRIGGER:
				setTrigger((Trigger)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__TYPE:
				setType((Type)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__TYPED_ELEMENT:
				setTypedElement((TypedElement)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__USAGE:
				setUsage((Usage)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__USE_CASE:
				setUseCase((UseCase)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__VALUE_PIN:
				setValuePin((ValuePin)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__VALUE_SPECIFICATION:
				setValueSpecification((ValueSpecification)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__VARIABLE_ACTION:
				setVariableAction((VariableAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__VERTEX:
				setVertex((Vertex)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__WRITE_LINK_ACTION:
				setWriteLinkAction((WriteLinkAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__WRITE_STRUCTURAL_FEATURE_ACTION:
				setWriteStructuralFeatureAction((WriteStructuralFeatureAction)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__WRITE_VARIABLE_ACTION:
				setWriteVariableAction((WriteVariableAction)newValue);
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
			case UmlPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case UmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case UmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case UmlPackage.DOCUMENT_ROOT__ABSTRACTION:
				setAbstraction((Abstraction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__ACCEPT_CALL_ACTION:
				setAcceptCallAction((AcceptCallAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__ACCEPT_EVENT_ACTION:
				setAcceptEventAction((AcceptEventAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__ACTION:
				setAction((Action)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_EDGE:
				setActivityEdge((ActivityEdge)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_FINAL_NODE:
				setActivityFinalNode((ActivityFinalNode)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_GROUP:
				setActivityGroup((ActivityGroup)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_NODE:
				setActivityNode((ActivityNode)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_PARAMETER_NODE:
				setActivityParameterNode((ActivityParameterNode)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_PARTITION:
				setActivityPartition((ActivityPartition)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__ACTOR:
				setActor((Actor)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__ADD_STRUCTURAL_FEATURE_VALUE_ACTION:
				setAddStructuralFeatureValueAction((AddStructuralFeatureValueAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__ADD_VARIABLE_VALUE_ACTION:
				setAddVariableValueAction((AddVariableValueAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__ANY_TRIGGER:
				setAnyTrigger((AnyTrigger)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__APPLY_FUNCTION_ACTION:
				setApplyFunctionAction((ApplyFunctionAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__ARTIFACT:
				setArtifact((Artifact)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__ASSOCIATION:
				setAssociation((Association)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__ASSOCIATION_CLASS:
				setAssociationClass((AssociationClass)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__BEHAVIOR:
				setBehavior((Behavior)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__BEHAVIORAL_FEATURE:
				setBehavioralFeature((BehavioralFeature)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__BEHAVIORED_CLASSIFIER:
				setBehavioredClassifier((BehavioredClassifier)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__BROADCAST_SIGNAL_ACTION:
				setBroadcastSignalAction((BroadcastSignalAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CALL_ACTION:
				setCallAction((CallAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CALL_BEHAVIOR_ACTION:
				setCallBehaviorAction((CallBehaviorAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CALL_OPERATION_ACTION:
				setCallOperationAction((CallOperationAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CALL_TRIGGER:
				setCallTrigger((CallTrigger)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CENTRAL_BUFFER_NODE:
				setCentralBufferNode((CentralBufferNode)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CHANGE_TRIGGER:
				setChangeTrigger((ChangeTrigger)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CLASS:
				setClass((org.eclipse.uml2._1._0._0.uml.Class)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CLASSIFIER:
				setClassifier((Classifier)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CLASSIFIER_TEMPLATE_PARAMETER:
				setClassifierTemplateParameter((ClassifierTemplateParameter)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CLAUSE:
				setClause((Clause)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CLEAR_ASSOCIATION_ACTION:
				setClearAssociationAction((ClearAssociationAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CLEAR_STRUCTURAL_FEATURE_ACTION:
				setClearStructuralFeatureAction((ClearStructuralFeatureAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CLEAR_VARIABLE_ACTION:
				setClearVariableAction((ClearVariableAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__COLLABORATION:
				setCollaboration((Collaboration)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__COLLABORATION_OCCURRENCE:
				setCollaborationOccurrence((CollaborationOccurrence)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__COMBINED_FRAGMENT:
				setCombinedFragment((CombinedFragment)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__COMMENT:
				setComment((Comment)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__COMMUNICATION_PATH:
				setCommunicationPath((CommunicationPath)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__COMPONENT:
				setComponent((Component)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CONDITIONAL_NODE:
				setConditionalNode((ConditionalNode)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CONNECTABLE_ELEMENT:
				setConnectableElement((ConnectableElement)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER:
				setConnectableElementTemplateParameter((ConnectableElementTemplateParameter)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CONNECTION_POINT_REFERENCE:
				setConnectionPointReference((ConnectionPointReference)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CONNECTOR:
				setConnector((Connector)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CONNECTOR_END:
				setConnectorEnd((ConnectorEnd)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CONSTRAINT:
				setConstraint((Constraint)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CONTINUATION:
				setContinuation((Continuation)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CONTROL_FLOW:
				setControlFlow((ControlFlow)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CONTROL_NODE:
				setControlNode((ControlNode)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CREATE_LINK_ACTION:
				setCreateLinkAction((CreateLinkAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CREATE_LINK_OBJECT_ACTION:
				setCreateLinkObjectAction((CreateLinkObjectAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CREATE_OBJECT_ACTION:
				setCreateObjectAction((CreateObjectAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__DATA_STORE_NODE:
				setDataStoreNode((DataStoreNode)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__DATA_TYPE:
				setDataType((DataType)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__DECISION_NODE:
				setDecisionNode((DecisionNode)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__DEPENDENCY:
				setDependency((Dependency)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__DEPLOYED_ARTIFACT:
				setDeployedArtifact((DeployedArtifact)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__DEPLOYMENT:
				setDeployment((Deployment)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__DEPLOYMENT_SPECIFICATION:
				setDeploymentSpecification((DeploymentSpecification)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__DEPLOYMENT_TARGET:
				setDeploymentTarget((DeploymentTarget)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__DESTROY_LINK_ACTION:
				setDestroyLinkAction((DestroyLinkAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__DESTROY_OBJECT_ACTION:
				setDestroyObjectAction((DestroyObjectAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__DEVICE:
				setDevice((Device)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__DIRECTED_RELATIONSHIP:
				setDirectedRelationship((DirectedRelationship)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__DURATION:
				setDuration((Duration)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__DURATION_CONSTRAINT:
				setDurationConstraint((DurationConstraint)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__DURATION_INTERVAL:
				setDurationInterval((DurationInterval)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__DURATION_OBSERVATION_ACTION:
				setDurationObservationAction((DurationObservationAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__ELEMENT:
				setElement((Element)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__ELEMENT_IMPORT:
				setElementImport((ElementImport)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__ENCAPSULATED_CLASSIFIER:
				setEncapsulatedClassifier((EncapsulatedClassifier)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__ENUMERATION:
				setEnumeration((Enumeration)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__ENUMERATION_LITERAL:
				setEnumerationLiteral((EnumerationLiteral)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__EVENT_OCCURRENCE:
				setEventOccurrence((EventOccurrence)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__EXCEPTION_HANDLER:
				setExceptionHandler((ExceptionHandler)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__EXECUTABLE_NODE:
				setExecutableNode((ExecutableNode)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__EXECUTION_ENVIRONMENT:
				setExecutionEnvironment((ExecutionEnvironment)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__EXECUTION_OCCURRENCE:
				setExecutionOccurrence((ExecutionOccurrence)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__EXPANSION_NODE:
				setExpansionNode((ExpansionNode)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__EXPANSION_REGION:
				setExpansionRegion((ExpansionRegion)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__EXPRESSION:
				setExpression((Expression)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__EXTEND:
				setExtend((Extend)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__EXTENSION:
				setExtension((Extension)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__EXTENSION_END:
				setExtensionEnd((ExtensionEnd)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__EXTENSION_POINT:
				setExtensionPoint((ExtensionPoint)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__FEATURE:
				setFeature((Feature)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__FINAL_NODE:
				setFinalNode((FinalNode)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__FINAL_STATE:
				setFinalState((FinalState)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__FLOW_FINAL_NODE:
				setFlowFinalNode((FlowFinalNode)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__FORK_NODE:
				setForkNode((ForkNode)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__GATE:
				setGate((Gate)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__GENERALIZATION:
				setGeneralization((Generalization)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__GENERALIZATION_SET:
				setGeneralizationSet((GeneralizationSet)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__GENERAL_ORDERING:
				setGeneralOrdering((GeneralOrdering)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__IMPLEMENTATION:
				setImplementation((Implementation)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__INCLUDE:
				setInclude((Include)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__INFORMATION_FLOW:
				setInformationFlow((InformationFlow)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__INFORMATION_ITEM:
				setInformationItem((InformationItem)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__INITIAL_NODE:
				setInitialNode((InitialNode)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__INPUT_PIN:
				setInputPin((InputPin)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__INSTANCE_SPECIFICATION:
				setInstanceSpecification((InstanceSpecification)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__INSTANCE_VALUE:
				setInstanceValue((InstanceValue)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__INTERACTION:
				setInteraction((Interaction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__INTERACTION_CONSTRAINT:
				setInteractionConstraint((InteractionConstraint)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__INTERACTION_FRAGMENT:
				setInteractionFragment((InteractionFragment)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__INTERACTION_OCCURRENCE:
				setInteractionOccurrence((InteractionOccurrence)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__INTERACTION_OPERAND:
				setInteractionOperand((InteractionOperand)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__INTERFACE:
				setInterface((Interface)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__INTERRUPTIBLE_ACTIVITY_REGION:
				setInterruptibleActivityRegion((InterruptibleActivityRegion)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__INTERVAL:
				setInterval((Interval)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__INTERVAL_CONSTRAINT:
				setIntervalConstraint((IntervalConstraint)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__INVOCATION_ACTION:
				setInvocationAction((InvocationAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__JOIN_NODE:
				setJoinNode((JoinNode)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__LIFELINE:
				setLifeline((Lifeline)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__LINK_ACTION:
				setLinkAction((LinkAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__LINK_END_CREATION_DATA:
				setLinkEndCreationData((LinkEndCreationData)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__LINK_END_DATA:
				setLinkEndData((LinkEndData)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__LITERAL_BOOLEAN:
				setLiteralBoolean((LiteralBoolean)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__LITERAL_INTEGER:
				setLiteralInteger((LiteralInteger)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__LITERAL_NULL:
				setLiteralNull((LiteralNull)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__LITERAL_SPECIFICATION:
				setLiteralSpecification((LiteralSpecification)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__LITERAL_STRING:
				setLiteralString((LiteralString)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__LITERAL_UNLIMITED_NATURAL:
				setLiteralUnlimitedNatural((LiteralUnlimitedNatural)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__LOOP_NODE:
				setLoopNode((LoopNode)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__MANIFESTATION:
				setManifestation((Manifestation)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__MERGE_NODE:
				setMergeNode((MergeNode)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__MESSAGE:
				setMessage((Message)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__MESSAGE_END:
				setMessageEnd((MessageEnd)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__MESSAGE_TRIGGER:
				setMessageTrigger((MessageTrigger)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__MODEL:
				setModel((Model)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__MULTIPLICITY_ELEMENT:
				setMultiplicityElement((MultiplicityElement)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__NAMED_ELEMENT:
				setNamedElement((NamedElement)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__NAMESPACE:
				setNamespace((Namespace)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__NODE:
				setNode((Node)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__OBJECT_FLOW:
				setObjectFlow((ObjectFlow)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__OBJECT_NODE:
				setObjectNode((ObjectNode)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__OPAQUE_EXPRESSION:
				setOpaqueExpression((OpaqueExpression)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__OPERATION:
				setOperation((Operation)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__OPERATION_TEMPLATE_PARAMETER:
				setOperationTemplateParameter((OperationTemplateParameter)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__OUTPUT_PIN:
				setOutputPin((OutputPin)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__PACKAGE:
				setPackage((org.eclipse.uml2._1._0._0.uml.Package)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__PACKAGEABLE_ELEMENT:
				setPackageableElement((PackageableElement)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__PACKAGE_IMPORT:
				setPackageImport((PackageImport)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__PACKAGE_MERGE:
				setPackageMerge((PackageMerge)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__PARAMETER:
				setParameter((Parameter)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__PARAMETERABLE_CLASSIFIER:
				setParameterableClassifier((ParameterableClassifier)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__PARAMETERABLE_ELEMENT:
				setParameterableElement((ParameterableElement)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__PARAMETER_SET:
				setParameterSet((ParameterSet)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__PART_DECOMPOSITION:
				setPartDecomposition((PartDecomposition)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__PERMISSION:
				setPermission((Permission)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__PIN:
				setPin((Pin)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__PORT:
				setPort((Port)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__PRIMITIVE_FUNCTION:
				setPrimitiveFunction((PrimitiveFunction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__PRIMITIVE_TYPE:
				setPrimitiveType((PrimitiveType)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__PROFILE:
				setProfile((Profile)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__PROFILE_APPLICATION:
				setProfileApplication((ProfileApplication)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((Property)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__PROTOCOL_CONFORMANCE:
				setProtocolConformance((ProtocolConformance)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__PROTOCOL_STATE_MACHINE:
				setProtocolStateMachine((ProtocolStateMachine)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__PROTOCOL_TRANSITION:
				setProtocolTransition((ProtocolTransition)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__PSEUDOSTATE:
				setPseudostate((Pseudostate)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__QUALIFIER_VALUE:
				setQualifierValue((QualifierValue)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__RAISE_EXCEPTION_ACTION:
				setRaiseExceptionAction((RaiseExceptionAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__READ_EXTENT_ACTION:
				setReadExtentAction((ReadExtentAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__READ_IS_CLASSIFIED_OBJECT_ACTION:
				setReadIsClassifiedObjectAction((ReadIsClassifiedObjectAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__READ_LINK_ACTION:
				setReadLinkAction((ReadLinkAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__READ_LINK_OBJECT_END_ACTION:
				setReadLinkObjectEndAction((ReadLinkObjectEndAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__READ_LINK_OBJECT_END_QUALIFIER_ACTION:
				setReadLinkObjectEndQualifierAction((ReadLinkObjectEndQualifierAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__READ_SELF_ACTION:
				setReadSelfAction((ReadSelfAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__READ_STRUCTURAL_FEATURE_ACTION:
				setReadStructuralFeatureAction((ReadStructuralFeatureAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__READ_VARIABLE_ACTION:
				setReadVariableAction((ReadVariableAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__REALIZATION:
				setRealization((Realization)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__RECEPTION:
				setReception((Reception)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__RECLASSIFY_OBJECT_ACTION:
				setReclassifyObjectAction((ReclassifyObjectAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__REDEFINABLE_ELEMENT:
				setRedefinableElement((RedefinableElement)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__REDEFINABLE_TEMPLATE_SIGNATURE:
				setRedefinableTemplateSignature((RedefinableTemplateSignature)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__REGION:
				setRegion((Region)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__RELATIONSHIP:
				setRelationship((Relationship)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION:
				setRemoveStructuralFeatureValueAction((RemoveStructuralFeatureValueAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__REMOVE_VARIABLE_VALUE_ACTION:
				setRemoveVariableValueAction((RemoveVariableValueAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__REPLY_ACTION:
				setReplyAction((ReplyAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__SEND_OBJECT_ACTION:
				setSendObjectAction((SendObjectAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__SEND_SIGNAL_ACTION:
				setSendSignalAction((SendSignalAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__SIGNAL:
				setSignal((Signal)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__SIGNAL_TRIGGER:
				setSignalTrigger((SignalTrigger)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__SLOT:
				setSlot((Slot)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__START_OWNED_BEHAVIOR_ACTION:
				setStartOwnedBehaviorAction((StartOwnedBehaviorAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__STATE:
				setState((State)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__STATE_INVARIANT:
				setStateInvariant((StateInvariant)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__STATE_MACHINE:
				setStateMachine((StateMachine)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__STEREOTYPE:
				setStereotype((Stereotype)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__STOP:
				setStop((Stop)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__STRING_EXPRESSION:
				setStringExpression((StringExpression)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__STRUCTURAL_FEATURE:
				setStructuralFeature((StructuralFeature)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__STRUCTURAL_FEATURE_ACTION:
				setStructuralFeatureAction((StructuralFeatureAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__STRUCTURED_ACTIVITY_NODE:
				setStructuredActivityNode((StructuredActivityNode)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__STRUCTURED_CLASSIFIER:
				setStructuredClassifier((StructuredClassifier)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__SUBSTITUTION:
				setSubstitution((Substitution)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__TEMPLATEABLE_CLASSIFIER:
				setTemplateableClassifier((TemplateableClassifier)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__TEMPLATEABLE_ELEMENT:
				setTemplateableElement((TemplateableElement)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__TEMPLATE_BINDING:
				setTemplateBinding((TemplateBinding)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__TEMPLATE_PARAMETER_SUBSTITUTION:
				setTemplateParameterSubstitution((TemplateParameterSubstitution)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__TEMPLATE_SIGNATURE:
				setTemplateSignature((TemplateSignature)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__TEST_IDENTITY_ACTION:
				setTestIdentityAction((TestIdentityAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__TIME_CONSTRAINT:
				setTimeConstraint((TimeConstraint)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__TIME_EXPRESSION:
				setTimeExpression((TimeExpression)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__TIME_INTERVAL:
				setTimeInterval((TimeInterval)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__TIME_OBSERVATION_ACTION:
				setTimeObservationAction((TimeObservationAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__TIME_TRIGGER:
				setTimeTrigger((TimeTrigger)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__TRANSITION:
				setTransition((Transition)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__TRIGGER:
				setTrigger((Trigger)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__TYPE:
				setType((Type)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__TYPED_ELEMENT:
				setTypedElement((TypedElement)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__USAGE:
				setUsage((Usage)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__USE_CASE:
				setUseCase((UseCase)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__VALUE_PIN:
				setValuePin((ValuePin)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__VALUE_SPECIFICATION:
				setValueSpecification((ValueSpecification)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__VARIABLE:
				setVariable((Variable)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__VARIABLE_ACTION:
				setVariableAction((VariableAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__VERTEX:
				setVertex((Vertex)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__WRITE_LINK_ACTION:
				setWriteLinkAction((WriteLinkAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__WRITE_STRUCTURAL_FEATURE_ACTION:
				setWriteStructuralFeatureAction((WriteStructuralFeatureAction)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__WRITE_VARIABLE_ACTION:
				setWriteVariableAction((WriteVariableAction)null);
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
			case UmlPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case UmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case UmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case UmlPackage.DOCUMENT_ROOT__ABSTRACTION:
				return getAbstraction() != null;
			case UmlPackage.DOCUMENT_ROOT__ACCEPT_CALL_ACTION:
				return getAcceptCallAction() != null;
			case UmlPackage.DOCUMENT_ROOT__ACCEPT_EVENT_ACTION:
				return getAcceptEventAction() != null;
			case UmlPackage.DOCUMENT_ROOT__ACTION:
				return getAction() != null;
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY:
				return getActivity() != null;
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_EDGE:
				return getActivityEdge() != null;
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_FINAL_NODE:
				return getActivityFinalNode() != null;
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_GROUP:
				return getActivityGroup() != null;
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_NODE:
				return getActivityNode() != null;
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_PARAMETER_NODE:
				return getActivityParameterNode() != null;
			case UmlPackage.DOCUMENT_ROOT__ACTIVITY_PARTITION:
				return getActivityPartition() != null;
			case UmlPackage.DOCUMENT_ROOT__ACTOR:
				return getActor() != null;
			case UmlPackage.DOCUMENT_ROOT__ADD_STRUCTURAL_FEATURE_VALUE_ACTION:
				return getAddStructuralFeatureValueAction() != null;
			case UmlPackage.DOCUMENT_ROOT__ADD_VARIABLE_VALUE_ACTION:
				return getAddVariableValueAction() != null;
			case UmlPackage.DOCUMENT_ROOT__ANY_TRIGGER:
				return getAnyTrigger() != null;
			case UmlPackage.DOCUMENT_ROOT__APPLY_FUNCTION_ACTION:
				return getApplyFunctionAction() != null;
			case UmlPackage.DOCUMENT_ROOT__ARTIFACT:
				return getArtifact() != null;
			case UmlPackage.DOCUMENT_ROOT__ASSOCIATION:
				return getAssociation() != null;
			case UmlPackage.DOCUMENT_ROOT__ASSOCIATION_CLASS:
				return getAssociationClass() != null;
			case UmlPackage.DOCUMENT_ROOT__BEHAVIOR:
				return getBehavior() != null;
			case UmlPackage.DOCUMENT_ROOT__BEHAVIORAL_FEATURE:
				return getBehavioralFeature() != null;
			case UmlPackage.DOCUMENT_ROOT__BEHAVIORED_CLASSIFIER:
				return getBehavioredClassifier() != null;
			case UmlPackage.DOCUMENT_ROOT__BROADCAST_SIGNAL_ACTION:
				return getBroadcastSignalAction() != null;
			case UmlPackage.DOCUMENT_ROOT__CALL_ACTION:
				return getCallAction() != null;
			case UmlPackage.DOCUMENT_ROOT__CALL_BEHAVIOR_ACTION:
				return getCallBehaviorAction() != null;
			case UmlPackage.DOCUMENT_ROOT__CALL_OPERATION_ACTION:
				return getCallOperationAction() != null;
			case UmlPackage.DOCUMENT_ROOT__CALL_TRIGGER:
				return getCallTrigger() != null;
			case UmlPackage.DOCUMENT_ROOT__CENTRAL_BUFFER_NODE:
				return getCentralBufferNode() != null;
			case UmlPackage.DOCUMENT_ROOT__CHANGE_TRIGGER:
				return getChangeTrigger() != null;
			case UmlPackage.DOCUMENT_ROOT__CLASS:
				return getClass_() != null;
			case UmlPackage.DOCUMENT_ROOT__CLASSIFIER:
				return getClassifier() != null;
			case UmlPackage.DOCUMENT_ROOT__CLASSIFIER_TEMPLATE_PARAMETER:
				return getClassifierTemplateParameter() != null;
			case UmlPackage.DOCUMENT_ROOT__CLAUSE:
				return getClause() != null;
			case UmlPackage.DOCUMENT_ROOT__CLEAR_ASSOCIATION_ACTION:
				return getClearAssociationAction() != null;
			case UmlPackage.DOCUMENT_ROOT__CLEAR_STRUCTURAL_FEATURE_ACTION:
				return getClearStructuralFeatureAction() != null;
			case UmlPackage.DOCUMENT_ROOT__CLEAR_VARIABLE_ACTION:
				return getClearVariableAction() != null;
			case UmlPackage.DOCUMENT_ROOT__COLLABORATION:
				return getCollaboration() != null;
			case UmlPackage.DOCUMENT_ROOT__COLLABORATION_OCCURRENCE:
				return getCollaborationOccurrence() != null;
			case UmlPackage.DOCUMENT_ROOT__COMBINED_FRAGMENT:
				return getCombinedFragment() != null;
			case UmlPackage.DOCUMENT_ROOT__COMMENT:
				return getComment() != null;
			case UmlPackage.DOCUMENT_ROOT__COMMUNICATION_PATH:
				return getCommunicationPath() != null;
			case UmlPackage.DOCUMENT_ROOT__COMPONENT:
				return getComponent() != null;
			case UmlPackage.DOCUMENT_ROOT__CONDITIONAL_NODE:
				return getConditionalNode() != null;
			case UmlPackage.DOCUMENT_ROOT__CONNECTABLE_ELEMENT:
				return getConnectableElement() != null;
			case UmlPackage.DOCUMENT_ROOT__CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER:
				return getConnectableElementTemplateParameter() != null;
			case UmlPackage.DOCUMENT_ROOT__CONNECTION_POINT_REFERENCE:
				return getConnectionPointReference() != null;
			case UmlPackage.DOCUMENT_ROOT__CONNECTOR:
				return getConnector() != null;
			case UmlPackage.DOCUMENT_ROOT__CONNECTOR_END:
				return getConnectorEnd() != null;
			case UmlPackage.DOCUMENT_ROOT__CONSTRAINT:
				return getConstraint() != null;
			case UmlPackage.DOCUMENT_ROOT__CONTINUATION:
				return getContinuation() != null;
			case UmlPackage.DOCUMENT_ROOT__CONTROL_FLOW:
				return getControlFlow() != null;
			case UmlPackage.DOCUMENT_ROOT__CONTROL_NODE:
				return getControlNode() != null;
			case UmlPackage.DOCUMENT_ROOT__CREATE_LINK_ACTION:
				return getCreateLinkAction() != null;
			case UmlPackage.DOCUMENT_ROOT__CREATE_LINK_OBJECT_ACTION:
				return getCreateLinkObjectAction() != null;
			case UmlPackage.DOCUMENT_ROOT__CREATE_OBJECT_ACTION:
				return getCreateObjectAction() != null;
			case UmlPackage.DOCUMENT_ROOT__DATA_STORE_NODE:
				return getDataStoreNode() != null;
			case UmlPackage.DOCUMENT_ROOT__DATA_TYPE:
				return getDataType() != null;
			case UmlPackage.DOCUMENT_ROOT__DECISION_NODE:
				return getDecisionNode() != null;
			case UmlPackage.DOCUMENT_ROOT__DEPENDENCY:
				return getDependency() != null;
			case UmlPackage.DOCUMENT_ROOT__DEPLOYED_ARTIFACT:
				return getDeployedArtifact() != null;
			case UmlPackage.DOCUMENT_ROOT__DEPLOYMENT:
				return getDeployment() != null;
			case UmlPackage.DOCUMENT_ROOT__DEPLOYMENT_SPECIFICATION:
				return getDeploymentSpecification() != null;
			case UmlPackage.DOCUMENT_ROOT__DEPLOYMENT_TARGET:
				return getDeploymentTarget() != null;
			case UmlPackage.DOCUMENT_ROOT__DESTROY_LINK_ACTION:
				return getDestroyLinkAction() != null;
			case UmlPackage.DOCUMENT_ROOT__DESTROY_OBJECT_ACTION:
				return getDestroyObjectAction() != null;
			case UmlPackage.DOCUMENT_ROOT__DEVICE:
				return getDevice() != null;
			case UmlPackage.DOCUMENT_ROOT__DIRECTED_RELATIONSHIP:
				return getDirectedRelationship() != null;
			case UmlPackage.DOCUMENT_ROOT__DURATION:
				return getDuration() != null;
			case UmlPackage.DOCUMENT_ROOT__DURATION_CONSTRAINT:
				return getDurationConstraint() != null;
			case UmlPackage.DOCUMENT_ROOT__DURATION_INTERVAL:
				return getDurationInterval() != null;
			case UmlPackage.DOCUMENT_ROOT__DURATION_OBSERVATION_ACTION:
				return getDurationObservationAction() != null;
			case UmlPackage.DOCUMENT_ROOT__ELEMENT:
				return getElement() != null;
			case UmlPackage.DOCUMENT_ROOT__ELEMENT_IMPORT:
				return getElementImport() != null;
			case UmlPackage.DOCUMENT_ROOT__ENCAPSULATED_CLASSIFIER:
				return getEncapsulatedClassifier() != null;
			case UmlPackage.DOCUMENT_ROOT__ENUMERATION:
				return getEnumeration() != null;
			case UmlPackage.DOCUMENT_ROOT__ENUMERATION_LITERAL:
				return getEnumerationLiteral() != null;
			case UmlPackage.DOCUMENT_ROOT__EVENT_OCCURRENCE:
				return getEventOccurrence() != null;
			case UmlPackage.DOCUMENT_ROOT__EXCEPTION_HANDLER:
				return getExceptionHandler() != null;
			case UmlPackage.DOCUMENT_ROOT__EXECUTABLE_NODE:
				return getExecutableNode() != null;
			case UmlPackage.DOCUMENT_ROOT__EXECUTION_ENVIRONMENT:
				return getExecutionEnvironment() != null;
			case UmlPackage.DOCUMENT_ROOT__EXECUTION_OCCURRENCE:
				return getExecutionOccurrence() != null;
			case UmlPackage.DOCUMENT_ROOT__EXPANSION_NODE:
				return getExpansionNode() != null;
			case UmlPackage.DOCUMENT_ROOT__EXPANSION_REGION:
				return getExpansionRegion() != null;
			case UmlPackage.DOCUMENT_ROOT__EXPRESSION:
				return getExpression() != null;
			case UmlPackage.DOCUMENT_ROOT__EXTEND:
				return getExtend() != null;
			case UmlPackage.DOCUMENT_ROOT__EXTENSION:
				return getExtension() != null;
			case UmlPackage.DOCUMENT_ROOT__EXTENSION_END:
				return getExtensionEnd() != null;
			case UmlPackage.DOCUMENT_ROOT__EXTENSION_POINT:
				return getExtensionPoint() != null;
			case UmlPackage.DOCUMENT_ROOT__FEATURE:
				return getFeature() != null;
			case UmlPackage.DOCUMENT_ROOT__FINAL_NODE:
				return getFinalNode() != null;
			case UmlPackage.DOCUMENT_ROOT__FINAL_STATE:
				return getFinalState() != null;
			case UmlPackage.DOCUMENT_ROOT__FLOW_FINAL_NODE:
				return getFlowFinalNode() != null;
			case UmlPackage.DOCUMENT_ROOT__FORK_NODE:
				return getForkNode() != null;
			case UmlPackage.DOCUMENT_ROOT__GATE:
				return getGate() != null;
			case UmlPackage.DOCUMENT_ROOT__GENERALIZATION:
				return getGeneralization() != null;
			case UmlPackage.DOCUMENT_ROOT__GENERALIZATION_SET:
				return getGeneralizationSet() != null;
			case UmlPackage.DOCUMENT_ROOT__GENERAL_ORDERING:
				return getGeneralOrdering() != null;
			case UmlPackage.DOCUMENT_ROOT__IMPLEMENTATION:
				return getImplementation() != null;
			case UmlPackage.DOCUMENT_ROOT__INCLUDE:
				return getInclude() != null;
			case UmlPackage.DOCUMENT_ROOT__INFORMATION_FLOW:
				return getInformationFlow() != null;
			case UmlPackage.DOCUMENT_ROOT__INFORMATION_ITEM:
				return getInformationItem() != null;
			case UmlPackage.DOCUMENT_ROOT__INITIAL_NODE:
				return getInitialNode() != null;
			case UmlPackage.DOCUMENT_ROOT__INPUT_PIN:
				return getInputPin() != null;
			case UmlPackage.DOCUMENT_ROOT__INSTANCE_SPECIFICATION:
				return getInstanceSpecification() != null;
			case UmlPackage.DOCUMENT_ROOT__INSTANCE_VALUE:
				return getInstanceValue() != null;
			case UmlPackage.DOCUMENT_ROOT__INTERACTION:
				return getInteraction() != null;
			case UmlPackage.DOCUMENT_ROOT__INTERACTION_CONSTRAINT:
				return getInteractionConstraint() != null;
			case UmlPackage.DOCUMENT_ROOT__INTERACTION_FRAGMENT:
				return getInteractionFragment() != null;
			case UmlPackage.DOCUMENT_ROOT__INTERACTION_OCCURRENCE:
				return getInteractionOccurrence() != null;
			case UmlPackage.DOCUMENT_ROOT__INTERACTION_OPERAND:
				return getInteractionOperand() != null;
			case UmlPackage.DOCUMENT_ROOT__INTERFACE:
				return getInterface() != null;
			case UmlPackage.DOCUMENT_ROOT__INTERRUPTIBLE_ACTIVITY_REGION:
				return getInterruptibleActivityRegion() != null;
			case UmlPackage.DOCUMENT_ROOT__INTERVAL:
				return getInterval() != null;
			case UmlPackage.DOCUMENT_ROOT__INTERVAL_CONSTRAINT:
				return getIntervalConstraint() != null;
			case UmlPackage.DOCUMENT_ROOT__INVOCATION_ACTION:
				return getInvocationAction() != null;
			case UmlPackage.DOCUMENT_ROOT__JOIN_NODE:
				return getJoinNode() != null;
			case UmlPackage.DOCUMENT_ROOT__LIFELINE:
				return getLifeline() != null;
			case UmlPackage.DOCUMENT_ROOT__LINK_ACTION:
				return getLinkAction() != null;
			case UmlPackage.DOCUMENT_ROOT__LINK_END_CREATION_DATA:
				return getLinkEndCreationData() != null;
			case UmlPackage.DOCUMENT_ROOT__LINK_END_DATA:
				return getLinkEndData() != null;
			case UmlPackage.DOCUMENT_ROOT__LITERAL_BOOLEAN:
				return getLiteralBoolean() != null;
			case UmlPackage.DOCUMENT_ROOT__LITERAL_INTEGER:
				return getLiteralInteger() != null;
			case UmlPackage.DOCUMENT_ROOT__LITERAL_NULL:
				return getLiteralNull() != null;
			case UmlPackage.DOCUMENT_ROOT__LITERAL_SPECIFICATION:
				return getLiteralSpecification() != null;
			case UmlPackage.DOCUMENT_ROOT__LITERAL_STRING:
				return getLiteralString() != null;
			case UmlPackage.DOCUMENT_ROOT__LITERAL_UNLIMITED_NATURAL:
				return getLiteralUnlimitedNatural() != null;
			case UmlPackage.DOCUMENT_ROOT__LOOP_NODE:
				return getLoopNode() != null;
			case UmlPackage.DOCUMENT_ROOT__MANIFESTATION:
				return getManifestation() != null;
			case UmlPackage.DOCUMENT_ROOT__MERGE_NODE:
				return getMergeNode() != null;
			case UmlPackage.DOCUMENT_ROOT__MESSAGE:
				return getMessage() != null;
			case UmlPackage.DOCUMENT_ROOT__MESSAGE_END:
				return getMessageEnd() != null;
			case UmlPackage.DOCUMENT_ROOT__MESSAGE_TRIGGER:
				return getMessageTrigger() != null;
			case UmlPackage.DOCUMENT_ROOT__MODEL:
				return getModel() != null;
			case UmlPackage.DOCUMENT_ROOT__MULTIPLICITY_ELEMENT:
				return getMultiplicityElement() != null;
			case UmlPackage.DOCUMENT_ROOT__NAMED_ELEMENT:
				return getNamedElement() != null;
			case UmlPackage.DOCUMENT_ROOT__NAMESPACE:
				return getNamespace() != null;
			case UmlPackage.DOCUMENT_ROOT__NODE:
				return getNode() != null;
			case UmlPackage.DOCUMENT_ROOT__OBJECT_FLOW:
				return getObjectFlow() != null;
			case UmlPackage.DOCUMENT_ROOT__OBJECT_NODE:
				return getObjectNode() != null;
			case UmlPackage.DOCUMENT_ROOT__OPAQUE_EXPRESSION:
				return getOpaqueExpression() != null;
			case UmlPackage.DOCUMENT_ROOT__OPERATION:
				return getOperation() != null;
			case UmlPackage.DOCUMENT_ROOT__OPERATION_TEMPLATE_PARAMETER:
				return getOperationTemplateParameter() != null;
			case UmlPackage.DOCUMENT_ROOT__OUTPUT_PIN:
				return getOutputPin() != null;
			case UmlPackage.DOCUMENT_ROOT__PACKAGE:
				return getPackage() != null;
			case UmlPackage.DOCUMENT_ROOT__PACKAGEABLE_ELEMENT:
				return getPackageableElement() != null;
			case UmlPackage.DOCUMENT_ROOT__PACKAGE_IMPORT:
				return getPackageImport() != null;
			case UmlPackage.DOCUMENT_ROOT__PACKAGE_MERGE:
				return getPackageMerge() != null;
			case UmlPackage.DOCUMENT_ROOT__PARAMETER:
				return getParameter() != null;
			case UmlPackage.DOCUMENT_ROOT__PARAMETERABLE_CLASSIFIER:
				return getParameterableClassifier() != null;
			case UmlPackage.DOCUMENT_ROOT__PARAMETERABLE_ELEMENT:
				return getParameterableElement() != null;
			case UmlPackage.DOCUMENT_ROOT__PARAMETER_SET:
				return getParameterSet() != null;
			case UmlPackage.DOCUMENT_ROOT__PART_DECOMPOSITION:
				return getPartDecomposition() != null;
			case UmlPackage.DOCUMENT_ROOT__PERMISSION:
				return getPermission() != null;
			case UmlPackage.DOCUMENT_ROOT__PIN:
				return getPin() != null;
			case UmlPackage.DOCUMENT_ROOT__PORT:
				return getPort() != null;
			case UmlPackage.DOCUMENT_ROOT__PRIMITIVE_FUNCTION:
				return getPrimitiveFunction() != null;
			case UmlPackage.DOCUMENT_ROOT__PRIMITIVE_TYPE:
				return getPrimitiveType() != null;
			case UmlPackage.DOCUMENT_ROOT__PROFILE:
				return getProfile() != null;
			case UmlPackage.DOCUMENT_ROOT__PROFILE_APPLICATION:
				return getProfileApplication() != null;
			case UmlPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty() != null;
			case UmlPackage.DOCUMENT_ROOT__PROTOCOL_CONFORMANCE:
				return getProtocolConformance() != null;
			case UmlPackage.DOCUMENT_ROOT__PROTOCOL_STATE_MACHINE:
				return getProtocolStateMachine() != null;
			case UmlPackage.DOCUMENT_ROOT__PROTOCOL_TRANSITION:
				return getProtocolTransition() != null;
			case UmlPackage.DOCUMENT_ROOT__PSEUDOSTATE:
				return getPseudostate() != null;
			case UmlPackage.DOCUMENT_ROOT__QUALIFIER_VALUE:
				return getQualifierValue() != null;
			case UmlPackage.DOCUMENT_ROOT__RAISE_EXCEPTION_ACTION:
				return getRaiseExceptionAction() != null;
			case UmlPackage.DOCUMENT_ROOT__READ_EXTENT_ACTION:
				return getReadExtentAction() != null;
			case UmlPackage.DOCUMENT_ROOT__READ_IS_CLASSIFIED_OBJECT_ACTION:
				return getReadIsClassifiedObjectAction() != null;
			case UmlPackage.DOCUMENT_ROOT__READ_LINK_ACTION:
				return getReadLinkAction() != null;
			case UmlPackage.DOCUMENT_ROOT__READ_LINK_OBJECT_END_ACTION:
				return getReadLinkObjectEndAction() != null;
			case UmlPackage.DOCUMENT_ROOT__READ_LINK_OBJECT_END_QUALIFIER_ACTION:
				return getReadLinkObjectEndQualifierAction() != null;
			case UmlPackage.DOCUMENT_ROOT__READ_SELF_ACTION:
				return getReadSelfAction() != null;
			case UmlPackage.DOCUMENT_ROOT__READ_STRUCTURAL_FEATURE_ACTION:
				return getReadStructuralFeatureAction() != null;
			case UmlPackage.DOCUMENT_ROOT__READ_VARIABLE_ACTION:
				return getReadVariableAction() != null;
			case UmlPackage.DOCUMENT_ROOT__REALIZATION:
				return getRealization() != null;
			case UmlPackage.DOCUMENT_ROOT__RECEPTION:
				return getReception() != null;
			case UmlPackage.DOCUMENT_ROOT__RECLASSIFY_OBJECT_ACTION:
				return getReclassifyObjectAction() != null;
			case UmlPackage.DOCUMENT_ROOT__REDEFINABLE_ELEMENT:
				return getRedefinableElement() != null;
			case UmlPackage.DOCUMENT_ROOT__REDEFINABLE_TEMPLATE_SIGNATURE:
				return getRedefinableTemplateSignature() != null;
			case UmlPackage.DOCUMENT_ROOT__REGION:
				return getRegion() != null;
			case UmlPackage.DOCUMENT_ROOT__RELATIONSHIP:
				return getRelationship() != null;
			case UmlPackage.DOCUMENT_ROOT__REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION:
				return getRemoveStructuralFeatureValueAction() != null;
			case UmlPackage.DOCUMENT_ROOT__REMOVE_VARIABLE_VALUE_ACTION:
				return getRemoveVariableValueAction() != null;
			case UmlPackage.DOCUMENT_ROOT__REPLY_ACTION:
				return getReplyAction() != null;
			case UmlPackage.DOCUMENT_ROOT__SEND_OBJECT_ACTION:
				return getSendObjectAction() != null;
			case UmlPackage.DOCUMENT_ROOT__SEND_SIGNAL_ACTION:
				return getSendSignalAction() != null;
			case UmlPackage.DOCUMENT_ROOT__SIGNAL:
				return getSignal() != null;
			case UmlPackage.DOCUMENT_ROOT__SIGNAL_TRIGGER:
				return getSignalTrigger() != null;
			case UmlPackage.DOCUMENT_ROOT__SLOT:
				return getSlot() != null;
			case UmlPackage.DOCUMENT_ROOT__START_OWNED_BEHAVIOR_ACTION:
				return getStartOwnedBehaviorAction() != null;
			case UmlPackage.DOCUMENT_ROOT__STATE:
				return getState() != null;
			case UmlPackage.DOCUMENT_ROOT__STATE_INVARIANT:
				return getStateInvariant() != null;
			case UmlPackage.DOCUMENT_ROOT__STATE_MACHINE:
				return getStateMachine() != null;
			case UmlPackage.DOCUMENT_ROOT__STEREOTYPE:
				return getStereotype() != null;
			case UmlPackage.DOCUMENT_ROOT__STOP:
				return getStop() != null;
			case UmlPackage.DOCUMENT_ROOT__STRING_EXPRESSION:
				return getStringExpression() != null;
			case UmlPackage.DOCUMENT_ROOT__STRUCTURAL_FEATURE:
				return getStructuralFeature() != null;
			case UmlPackage.DOCUMENT_ROOT__STRUCTURAL_FEATURE_ACTION:
				return getStructuralFeatureAction() != null;
			case UmlPackage.DOCUMENT_ROOT__STRUCTURED_ACTIVITY_NODE:
				return getStructuredActivityNode() != null;
			case UmlPackage.DOCUMENT_ROOT__STRUCTURED_CLASSIFIER:
				return getStructuredClassifier() != null;
			case UmlPackage.DOCUMENT_ROOT__SUBSTITUTION:
				return getSubstitution() != null;
			case UmlPackage.DOCUMENT_ROOT__TEMPLATEABLE_CLASSIFIER:
				return getTemplateableClassifier() != null;
			case UmlPackage.DOCUMENT_ROOT__TEMPLATEABLE_ELEMENT:
				return getTemplateableElement() != null;
			case UmlPackage.DOCUMENT_ROOT__TEMPLATE_BINDING:
				return getTemplateBinding() != null;
			case UmlPackage.DOCUMENT_ROOT__TEMPLATE_PARAMETER:
				return getTemplateParameter() != null;
			case UmlPackage.DOCUMENT_ROOT__TEMPLATE_PARAMETER_SUBSTITUTION:
				return getTemplateParameterSubstitution() != null;
			case UmlPackage.DOCUMENT_ROOT__TEMPLATE_SIGNATURE:
				return getTemplateSignature() != null;
			case UmlPackage.DOCUMENT_ROOT__TEST_IDENTITY_ACTION:
				return getTestIdentityAction() != null;
			case UmlPackage.DOCUMENT_ROOT__TIME_CONSTRAINT:
				return getTimeConstraint() != null;
			case UmlPackage.DOCUMENT_ROOT__TIME_EXPRESSION:
				return getTimeExpression() != null;
			case UmlPackage.DOCUMENT_ROOT__TIME_INTERVAL:
				return getTimeInterval() != null;
			case UmlPackage.DOCUMENT_ROOT__TIME_OBSERVATION_ACTION:
				return getTimeObservationAction() != null;
			case UmlPackage.DOCUMENT_ROOT__TIME_TRIGGER:
				return getTimeTrigger() != null;
			case UmlPackage.DOCUMENT_ROOT__TRANSITION:
				return getTransition() != null;
			case UmlPackage.DOCUMENT_ROOT__TRIGGER:
				return getTrigger() != null;
			case UmlPackage.DOCUMENT_ROOT__TYPE:
				return getType() != null;
			case UmlPackage.DOCUMENT_ROOT__TYPED_ELEMENT:
				return getTypedElement() != null;
			case UmlPackage.DOCUMENT_ROOT__USAGE:
				return getUsage() != null;
			case UmlPackage.DOCUMENT_ROOT__USE_CASE:
				return getUseCase() != null;
			case UmlPackage.DOCUMENT_ROOT__VALUE_PIN:
				return getValuePin() != null;
			case UmlPackage.DOCUMENT_ROOT__VALUE_SPECIFICATION:
				return getValueSpecification() != null;
			case UmlPackage.DOCUMENT_ROOT__VARIABLE:
				return getVariable() != null;
			case UmlPackage.DOCUMENT_ROOT__VARIABLE_ACTION:
				return getVariableAction() != null;
			case UmlPackage.DOCUMENT_ROOT__VERTEX:
				return getVertex() != null;
			case UmlPackage.DOCUMENT_ROOT__WRITE_LINK_ACTION:
				return getWriteLinkAction() != null;
			case UmlPackage.DOCUMENT_ROOT__WRITE_STRUCTURAL_FEATURE_ACTION:
				return getWriteStructuralFeatureAction() != null;
			case UmlPackage.DOCUMENT_ROOT__WRITE_VARIABLE_ACTION:
				return getWriteVariableAction() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
