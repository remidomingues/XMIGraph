/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.uml2._1._0._0.uml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;

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
import org.eclipse.uml2._1._0._0.uml.AssociationElement;
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
import org.eclipse.uml2._1._0._0.uml.IsAbstractIsStatic;
import org.eclipse.uml2._1._0._0.uml.JType;
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
import org.eclipse.uml2._1._0._0.uml.OwnedAttribute;
import org.eclipse.uml2._1._0._0.uml.OwnedEnd;
import org.eclipse.uml2._1._0._0.uml.OwnedOperation;
import org.eclipse.uml2._1._0._0.uml.OwnedParameter;
import org.eclipse.uml2._1._0._0.uml.OwnedRule;
import org.eclipse.uml2._1._0._0.uml.PackageImport;
import org.eclipse.uml2._1._0._0.uml.PackageMerge;
import org.eclipse.uml2._1._0._0.uml.PackageableElement;
import org.eclipse.uml2._1._0._0.uml.PackagedElement;
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
import org.eclipse.uml2._1._0._0.uml.Referenced;
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
import org.eclipse.uml2._1._0._0.uml.Specification;
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
import org.eclipse.uml2._1._0._0.uml.Value;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2._1._0._0.uml.UmlPackage
 * @generated
 */
public class UmlAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = UmlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UmlSwitch<Adapter> modelSwitch =
		new UmlSwitch<Adapter>()
		{
			@Override
			public Adapter caseAbstraction(Abstraction object)
			{
				return createAbstractionAdapter();
			}
			@Override
			public Adapter caseAcceptCallAction(AcceptCallAction object)
			{
				return createAcceptCallActionAdapter();
			}
			@Override
			public Adapter caseAcceptEventAction(AcceptEventAction object)
			{
				return createAcceptEventActionAdapter();
			}
			@Override
			public Adapter caseAction(Action object)
			{
				return createActionAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object)
			{
				return createActivityAdapter();
			}
			@Override
			public Adapter caseActivityEdge(ActivityEdge object)
			{
				return createActivityEdgeAdapter();
			}
			@Override
			public Adapter caseActivityFinalNode(ActivityFinalNode object)
			{
				return createActivityFinalNodeAdapter();
			}
			@Override
			public Adapter caseActivityGroup(ActivityGroup object)
			{
				return createActivityGroupAdapter();
			}
			@Override
			public Adapter caseActivityNode(ActivityNode object)
			{
				return createActivityNodeAdapter();
			}
			@Override
			public Adapter caseActivityParameterNode(ActivityParameterNode object)
			{
				return createActivityParameterNodeAdapter();
			}
			@Override
			public Adapter caseActivityPartition(ActivityPartition object)
			{
				return createActivityPartitionAdapter();
			}
			@Override
			public Adapter caseActor(Actor object)
			{
				return createActorAdapter();
			}
			@Override
			public Adapter caseAddStructuralFeatureValueAction(AddStructuralFeatureValueAction object)
			{
				return createAddStructuralFeatureValueActionAdapter();
			}
			@Override
			public Adapter caseAddVariableValueAction(AddVariableValueAction object)
			{
				return createAddVariableValueActionAdapter();
			}
			@Override
			public Adapter caseAnyTrigger(AnyTrigger object)
			{
				return createAnyTriggerAdapter();
			}
			@Override
			public Adapter caseApplyFunctionAction(ApplyFunctionAction object)
			{
				return createApplyFunctionActionAdapter();
			}
			@Override
			public Adapter caseArtifact(Artifact object)
			{
				return createArtifactAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object)
			{
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseAssociationClass(AssociationClass object)
			{
				return createAssociationClassAdapter();
			}
			@Override
			public Adapter caseBehavior(Behavior object)
			{
				return createBehaviorAdapter();
			}
			@Override
			public Adapter caseBehavioralFeature(BehavioralFeature object)
			{
				return createBehavioralFeatureAdapter();
			}
			@Override
			public Adapter caseBehavioredClassifier(BehavioredClassifier object)
			{
				return createBehavioredClassifierAdapter();
			}
			@Override
			public Adapter caseBroadcastSignalAction(BroadcastSignalAction object)
			{
				return createBroadcastSignalActionAdapter();
			}
			@Override
			public Adapter caseCallAction(CallAction object)
			{
				return createCallActionAdapter();
			}
			@Override
			public Adapter caseCallBehaviorAction(CallBehaviorAction object)
			{
				return createCallBehaviorActionAdapter();
			}
			@Override
			public Adapter caseCallOperationAction(CallOperationAction object)
			{
				return createCallOperationActionAdapter();
			}
			@Override
			public Adapter caseCallTrigger(CallTrigger object)
			{
				return createCallTriggerAdapter();
			}
			@Override
			public Adapter caseCentralBufferNode(CentralBufferNode object)
			{
				return createCentralBufferNodeAdapter();
			}
			@Override
			public Adapter caseChangeTrigger(ChangeTrigger object)
			{
				return createChangeTriggerAdapter();
			}
			@Override
			public Adapter caseClass(org.eclipse.uml2._1._0._0.uml.Class object)
			{
				return createClassAdapter();
			}
			@Override
			public Adapter caseClassifier(Classifier object)
			{
				return createClassifierAdapter();
			}
			@Override
			public Adapter caseClassifierTemplateParameter(ClassifierTemplateParameter object)
			{
				return createClassifierTemplateParameterAdapter();
			}
			@Override
			public Adapter caseClause(Clause object)
			{
				return createClauseAdapter();
			}
			@Override
			public Adapter caseClearAssociationAction(ClearAssociationAction object)
			{
				return createClearAssociationActionAdapter();
			}
			@Override
			public Adapter caseClearStructuralFeatureAction(ClearStructuralFeatureAction object)
			{
				return createClearStructuralFeatureActionAdapter();
			}
			@Override
			public Adapter caseClearVariableAction(ClearVariableAction object)
			{
				return createClearVariableActionAdapter();
			}
			@Override
			public Adapter caseCollaboration(Collaboration object)
			{
				return createCollaborationAdapter();
			}
			@Override
			public Adapter caseCollaborationOccurrence(CollaborationOccurrence object)
			{
				return createCollaborationOccurrenceAdapter();
			}
			@Override
			public Adapter caseCombinedFragment(CombinedFragment object)
			{
				return createCombinedFragmentAdapter();
			}
			@Override
			public Adapter caseComment(Comment object)
			{
				return createCommentAdapter();
			}
			@Override
			public Adapter caseCommunicationPath(CommunicationPath object)
			{
				return createCommunicationPathAdapter();
			}
			@Override
			public Adapter caseComponent(Component object)
			{
				return createComponentAdapter();
			}
			@Override
			public Adapter caseConditionalNode(ConditionalNode object)
			{
				return createConditionalNodeAdapter();
			}
			@Override
			public Adapter caseConnectableElement(ConnectableElement object)
			{
				return createConnectableElementAdapter();
			}
			@Override
			public Adapter caseConnectableElementTemplateParameter(ConnectableElementTemplateParameter object)
			{
				return createConnectableElementTemplateParameterAdapter();
			}
			@Override
			public Adapter caseConnectionPointReference(ConnectionPointReference object)
			{
				return createConnectionPointReferenceAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object)
			{
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseConnectorEnd(ConnectorEnd object)
			{
				return createConnectorEndAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object)
			{
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseContinuation(Continuation object)
			{
				return createContinuationAdapter();
			}
			@Override
			public Adapter caseControlFlow(ControlFlow object)
			{
				return createControlFlowAdapter();
			}
			@Override
			public Adapter caseControlNode(ControlNode object)
			{
				return createControlNodeAdapter();
			}
			@Override
			public Adapter caseCreateLinkAction(CreateLinkAction object)
			{
				return createCreateLinkActionAdapter();
			}
			@Override
			public Adapter caseCreateLinkObjectAction(CreateLinkObjectAction object)
			{
				return createCreateLinkObjectActionAdapter();
			}
			@Override
			public Adapter caseCreateObjectAction(CreateObjectAction object)
			{
				return createCreateObjectActionAdapter();
			}
			@Override
			public Adapter caseDataStoreNode(DataStoreNode object)
			{
				return createDataStoreNodeAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object)
			{
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseDecisionNode(DecisionNode object)
			{
				return createDecisionNodeAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object)
			{
				return createDependencyAdapter();
			}
			@Override
			public Adapter caseDeployedArtifact(DeployedArtifact object)
			{
				return createDeployedArtifactAdapter();
			}
			@Override
			public Adapter caseDeployment(Deployment object)
			{
				return createDeploymentAdapter();
			}
			@Override
			public Adapter caseDeploymentSpecification(DeploymentSpecification object)
			{
				return createDeploymentSpecificationAdapter();
			}
			@Override
			public Adapter caseDeploymentTarget(DeploymentTarget object)
			{
				return createDeploymentTargetAdapter();
			}
			@Override
			public Adapter caseDestroyLinkAction(DestroyLinkAction object)
			{
				return createDestroyLinkActionAdapter();
			}
			@Override
			public Adapter caseDestroyObjectAction(DestroyObjectAction object)
			{
				return createDestroyObjectActionAdapter();
			}
			@Override
			public Adapter caseDevice(Device object)
			{
				return createDeviceAdapter();
			}
			@Override
			public Adapter caseDirectedRelationship(DirectedRelationship object)
			{
				return createDirectedRelationshipAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object)
			{
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDuration(Duration object)
			{
				return createDurationAdapter();
			}
			@Override
			public Adapter caseDurationConstraint(DurationConstraint object)
			{
				return createDurationConstraintAdapter();
			}
			@Override
			public Adapter caseDurationInterval(DurationInterval object)
			{
				return createDurationIntervalAdapter();
			}
			@Override
			public Adapter caseDurationObservationAction(DurationObservationAction object)
			{
				return createDurationObservationActionAdapter();
			}
			@Override
			public Adapter caseElement(Element object)
			{
				return createElementAdapter();
			}
			@Override
			public Adapter caseElementImport(ElementImport object)
			{
				return createElementImportAdapter();
			}
			@Override
			public Adapter caseEncapsulatedClassifier(EncapsulatedClassifier object)
			{
				return createEncapsulatedClassifierAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object)
			{
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseEnumerationLiteral(EnumerationLiteral object)
			{
				return createEnumerationLiteralAdapter();
			}
			@Override
			public Adapter caseEventOccurrence(EventOccurrence object)
			{
				return createEventOccurrenceAdapter();
			}
			@Override
			public Adapter caseExceptionHandler(ExceptionHandler object)
			{
				return createExceptionHandlerAdapter();
			}
			@Override
			public Adapter caseExecutableNode(ExecutableNode object)
			{
				return createExecutableNodeAdapter();
			}
			@Override
			public Adapter caseExecutionEnvironment(ExecutionEnvironment object)
			{
				return createExecutionEnvironmentAdapter();
			}
			@Override
			public Adapter caseExecutionOccurrence(ExecutionOccurrence object)
			{
				return createExecutionOccurrenceAdapter();
			}
			@Override
			public Adapter caseExpansionNode(ExpansionNode object)
			{
				return createExpansionNodeAdapter();
			}
			@Override
			public Adapter caseExpansionRegion(ExpansionRegion object)
			{
				return createExpansionRegionAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object)
			{
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseExtend(Extend object)
			{
				return createExtendAdapter();
			}
			@Override
			public Adapter caseExtension(Extension object)
			{
				return createExtensionAdapter();
			}
			@Override
			public Adapter caseExtensionEnd(ExtensionEnd object)
			{
				return createExtensionEndAdapter();
			}
			@Override
			public Adapter caseExtensionPoint(ExtensionPoint object)
			{
				return createExtensionPointAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object)
			{
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseFinalNode(FinalNode object)
			{
				return createFinalNodeAdapter();
			}
			@Override
			public Adapter caseFinalState(FinalState object)
			{
				return createFinalStateAdapter();
			}
			@Override
			public Adapter caseFlowFinalNode(FlowFinalNode object)
			{
				return createFlowFinalNodeAdapter();
			}
			@Override
			public Adapter caseForkNode(ForkNode object)
			{
				return createForkNodeAdapter();
			}
			@Override
			public Adapter caseGate(Gate object)
			{
				return createGateAdapter();
			}
			@Override
			public Adapter caseGeneralization(Generalization object)
			{
				return createGeneralizationAdapter();
			}
			@Override
			public Adapter caseGeneralizationSet(GeneralizationSet object)
			{
				return createGeneralizationSetAdapter();
			}
			@Override
			public Adapter caseGeneralOrdering(GeneralOrdering object)
			{
				return createGeneralOrderingAdapter();
			}
			@Override
			public Adapter caseImplementation(Implementation object)
			{
				return createImplementationAdapter();
			}
			@Override
			public Adapter caseInclude(Include object)
			{
				return createIncludeAdapter();
			}
			@Override
			public Adapter caseInformationFlow(InformationFlow object)
			{
				return createInformationFlowAdapter();
			}
			@Override
			public Adapter caseInformationItem(InformationItem object)
			{
				return createInformationItemAdapter();
			}
			@Override
			public Adapter caseInitialNode(InitialNode object)
			{
				return createInitialNodeAdapter();
			}
			@Override
			public Adapter caseInputPin(InputPin object)
			{
				return createInputPinAdapter();
			}
			@Override
			public Adapter caseInstanceSpecification(InstanceSpecification object)
			{
				return createInstanceSpecificationAdapter();
			}
			@Override
			public Adapter caseInstanceValue(InstanceValue object)
			{
				return createInstanceValueAdapter();
			}
			@Override
			public Adapter caseInteraction(Interaction object)
			{
				return createInteractionAdapter();
			}
			@Override
			public Adapter caseInteractionConstraint(InteractionConstraint object)
			{
				return createInteractionConstraintAdapter();
			}
			@Override
			public Adapter caseInteractionFragment(InteractionFragment object)
			{
				return createInteractionFragmentAdapter();
			}
			@Override
			public Adapter caseInteractionOccurrence(InteractionOccurrence object)
			{
				return createInteractionOccurrenceAdapter();
			}
			@Override
			public Adapter caseInteractionOperand(InteractionOperand object)
			{
				return createInteractionOperandAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object)
			{
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseInterruptibleActivityRegion(InterruptibleActivityRegion object)
			{
				return createInterruptibleActivityRegionAdapter();
			}
			@Override
			public Adapter caseInterval(Interval object)
			{
				return createIntervalAdapter();
			}
			@Override
			public Adapter caseIntervalConstraint(IntervalConstraint object)
			{
				return createIntervalConstraintAdapter();
			}
			@Override
			public Adapter caseInvocationAction(InvocationAction object)
			{
				return createInvocationActionAdapter();
			}
			@Override
			public Adapter caseJoinNode(JoinNode object)
			{
				return createJoinNodeAdapter();
			}
			@Override
			public Adapter caseLifeline(Lifeline object)
			{
				return createLifelineAdapter();
			}
			@Override
			public Adapter caseLinkAction(LinkAction object)
			{
				return createLinkActionAdapter();
			}
			@Override
			public Adapter caseLinkEndCreationData(LinkEndCreationData object)
			{
				return createLinkEndCreationDataAdapter();
			}
			@Override
			public Adapter caseLinkEndData(LinkEndData object)
			{
				return createLinkEndDataAdapter();
			}
			@Override
			public Adapter caseLiteralBoolean(LiteralBoolean object)
			{
				return createLiteralBooleanAdapter();
			}
			@Override
			public Adapter caseLiteralInteger(LiteralInteger object)
			{
				return createLiteralIntegerAdapter();
			}
			@Override
			public Adapter caseLiteralNull(LiteralNull object)
			{
				return createLiteralNullAdapter();
			}
			@Override
			public Adapter caseLiteralSpecification(LiteralSpecification object)
			{
				return createLiteralSpecificationAdapter();
			}
			@Override
			public Adapter caseLiteralString(LiteralString object)
			{
				return createLiteralStringAdapter();
			}
			@Override
			public Adapter caseLiteralUnlimitedNatural(LiteralUnlimitedNatural object)
			{
				return createLiteralUnlimitedNaturalAdapter();
			}
			@Override
			public Adapter caseLoopNode(LoopNode object)
			{
				return createLoopNodeAdapter();
			}
			@Override
			public Adapter caseManifestation(Manifestation object)
			{
				return createManifestationAdapter();
			}
			@Override
			public Adapter caseMergeNode(MergeNode object)
			{
				return createMergeNodeAdapter();
			}
			@Override
			public Adapter caseMessage(Message object)
			{
				return createMessageAdapter();
			}
			@Override
			public Adapter caseMessageEnd(MessageEnd object)
			{
				return createMessageEndAdapter();
			}
			@Override
			public Adapter caseMessageTrigger(MessageTrigger object)
			{
				return createMessageTriggerAdapter();
			}
			@Override
			public Adapter caseModel(Model object)
			{
				return createModelAdapter();
			}
			@Override
			public Adapter caseMultiplicityElement(MultiplicityElement object)
			{
				return createMultiplicityElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object)
			{
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object)
			{
				return createNamespaceAdapter();
			}
			@Override
			public Adapter caseNode(Node object)
			{
				return createNodeAdapter();
			}
			@Override
			public Adapter caseObjectFlow(ObjectFlow object)
			{
				return createObjectFlowAdapter();
			}
			@Override
			public Adapter caseObjectNode(ObjectNode object)
			{
				return createObjectNodeAdapter();
			}
			@Override
			public Adapter caseOpaqueExpression(OpaqueExpression object)
			{
				return createOpaqueExpressionAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object)
			{
				return createOperationAdapter();
			}
			@Override
			public Adapter caseOperationTemplateParameter(OperationTemplateParameter object)
			{
				return createOperationTemplateParameterAdapter();
			}
			@Override
			public Adapter caseOutputPin(OutputPin object)
			{
				return createOutputPinAdapter();
			}
			@Override
			public Adapter casePackage(org.eclipse.uml2._1._0._0.uml.Package object)
			{
				return createPackageAdapter();
			}
			@Override
			public Adapter casePackageableElement(PackageableElement object)
			{
				return createPackageableElementAdapter();
			}
			@Override
			public Adapter casePackageImport(PackageImport object)
			{
				return createPackageImportAdapter();
			}
			@Override
			public Adapter casePackageMerge(PackageMerge object)
			{
				return createPackageMergeAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object)
			{
				return createParameterAdapter();
			}
			@Override
			public Adapter caseParameterableClassifier(ParameterableClassifier object)
			{
				return createParameterableClassifierAdapter();
			}
			@Override
			public Adapter caseParameterableElement(ParameterableElement object)
			{
				return createParameterableElementAdapter();
			}
			@Override
			public Adapter caseParameterSet(ParameterSet object)
			{
				return createParameterSetAdapter();
			}
			@Override
			public Adapter casePartDecomposition(PartDecomposition object)
			{
				return createPartDecompositionAdapter();
			}
			@Override
			public Adapter casePermission(Permission object)
			{
				return createPermissionAdapter();
			}
			@Override
			public Adapter casePin(Pin object)
			{
				return createPinAdapter();
			}
			@Override
			public Adapter casePort(Port object)
			{
				return createPortAdapter();
			}
			@Override
			public Adapter casePrimitiveFunction(PrimitiveFunction object)
			{
				return createPrimitiveFunctionAdapter();
			}
			@Override
			public Adapter casePrimitiveType(PrimitiveType object)
			{
				return createPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseProfile(Profile object)
			{
				return createProfileAdapter();
			}
			@Override
			public Adapter caseProfileApplication(ProfileApplication object)
			{
				return createProfileApplicationAdapter();
			}
			@Override
			public Adapter caseProperty(Property object)
			{
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseProtocolConformance(ProtocolConformance object)
			{
				return createProtocolConformanceAdapter();
			}
			@Override
			public Adapter caseProtocolStateMachine(ProtocolStateMachine object)
			{
				return createProtocolStateMachineAdapter();
			}
			@Override
			public Adapter caseProtocolTransition(ProtocolTransition object)
			{
				return createProtocolTransitionAdapter();
			}
			@Override
			public Adapter casePseudostate(Pseudostate object)
			{
				return createPseudostateAdapter();
			}
			@Override
			public Adapter caseQualifierValue(QualifierValue object)
			{
				return createQualifierValueAdapter();
			}
			@Override
			public Adapter caseRaiseExceptionAction(RaiseExceptionAction object)
			{
				return createRaiseExceptionActionAdapter();
			}
			@Override
			public Adapter caseReadExtentAction(ReadExtentAction object)
			{
				return createReadExtentActionAdapter();
			}
			@Override
			public Adapter caseReadIsClassifiedObjectAction(ReadIsClassifiedObjectAction object)
			{
				return createReadIsClassifiedObjectActionAdapter();
			}
			@Override
			public Adapter caseReadLinkAction(ReadLinkAction object)
			{
				return createReadLinkActionAdapter();
			}
			@Override
			public Adapter caseReadLinkObjectEndAction(ReadLinkObjectEndAction object)
			{
				return createReadLinkObjectEndActionAdapter();
			}
			@Override
			public Adapter caseReadLinkObjectEndQualifierAction(ReadLinkObjectEndQualifierAction object)
			{
				return createReadLinkObjectEndQualifierActionAdapter();
			}
			@Override
			public Adapter caseReadSelfAction(ReadSelfAction object)
			{
				return createReadSelfActionAdapter();
			}
			@Override
			public Adapter caseReadStructuralFeatureAction(ReadStructuralFeatureAction object)
			{
				return createReadStructuralFeatureActionAdapter();
			}
			@Override
			public Adapter caseReadVariableAction(ReadVariableAction object)
			{
				return createReadVariableActionAdapter();
			}
			@Override
			public Adapter caseRealization(Realization object)
			{
				return createRealizationAdapter();
			}
			@Override
			public Adapter caseReception(Reception object)
			{
				return createReceptionAdapter();
			}
			@Override
			public Adapter caseReclassifyObjectAction(ReclassifyObjectAction object)
			{
				return createReclassifyObjectActionAdapter();
			}
			@Override
			public Adapter caseRedefinableElement(RedefinableElement object)
			{
				return createRedefinableElementAdapter();
			}
			@Override
			public Adapter caseRedefinableTemplateSignature(RedefinableTemplateSignature object)
			{
				return createRedefinableTemplateSignatureAdapter();
			}
			@Override
			public Adapter caseRegion(Region object)
			{
				return createRegionAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object)
			{
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseRemoveStructuralFeatureValueAction(RemoveStructuralFeatureValueAction object)
			{
				return createRemoveStructuralFeatureValueActionAdapter();
			}
			@Override
			public Adapter caseRemoveVariableValueAction(RemoveVariableValueAction object)
			{
				return createRemoveVariableValueActionAdapter();
			}
			@Override
			public Adapter caseReplyAction(ReplyAction object)
			{
				return createReplyActionAdapter();
			}
			@Override
			public Adapter caseSendObjectAction(SendObjectAction object)
			{
				return createSendObjectActionAdapter();
			}
			@Override
			public Adapter caseSendSignalAction(SendSignalAction object)
			{
				return createSendSignalActionAdapter();
			}
			@Override
			public Adapter caseSignal(Signal object)
			{
				return createSignalAdapter();
			}
			@Override
			public Adapter caseSignalTrigger(SignalTrigger object)
			{
				return createSignalTriggerAdapter();
			}
			@Override
			public Adapter caseSlot(Slot object)
			{
				return createSlotAdapter();
			}
			@Override
			public Adapter caseStartOwnedBehaviorAction(StartOwnedBehaviorAction object)
			{
				return createStartOwnedBehaviorActionAdapter();
			}
			@Override
			public Adapter caseState(State object)
			{
				return createStateAdapter();
			}
			@Override
			public Adapter caseStateInvariant(StateInvariant object)
			{
				return createStateInvariantAdapter();
			}
			@Override
			public Adapter caseStateMachine(StateMachine object)
			{
				return createStateMachineAdapter();
			}
			@Override
			public Adapter caseStereotype(Stereotype object)
			{
				return createStereotypeAdapter();
			}
			@Override
			public Adapter caseStop(Stop object)
			{
				return createStopAdapter();
			}
			@Override
			public Adapter caseStringExpression(StringExpression object)
			{
				return createStringExpressionAdapter();
			}
			@Override
			public Adapter caseStructuralFeature(StructuralFeature object)
			{
				return createStructuralFeatureAdapter();
			}
			@Override
			public Adapter caseStructuralFeatureAction(StructuralFeatureAction object)
			{
				return createStructuralFeatureActionAdapter();
			}
			@Override
			public Adapter caseStructuredActivityNode(StructuredActivityNode object)
			{
				return createStructuredActivityNodeAdapter();
			}
			@Override
			public Adapter caseStructuredClassifier(StructuredClassifier object)
			{
				return createStructuredClassifierAdapter();
			}
			@Override
			public Adapter caseSubstitution(Substitution object)
			{
				return createSubstitutionAdapter();
			}
			@Override
			public Adapter caseTemplateableClassifier(TemplateableClassifier object)
			{
				return createTemplateableClassifierAdapter();
			}
			@Override
			public Adapter caseTemplateableElement(TemplateableElement object)
			{
				return createTemplateableElementAdapter();
			}
			@Override
			public Adapter caseTemplateBinding(TemplateBinding object)
			{
				return createTemplateBindingAdapter();
			}
			@Override
			public Adapter caseTemplateParameter(TemplateParameter object)
			{
				return createTemplateParameterAdapter();
			}
			@Override
			public Adapter caseTemplateParameterSubstitution(TemplateParameterSubstitution object)
			{
				return createTemplateParameterSubstitutionAdapter();
			}
			@Override
			public Adapter caseTemplateSignature(TemplateSignature object)
			{
				return createTemplateSignatureAdapter();
			}
			@Override
			public Adapter caseTestIdentityAction(TestIdentityAction object)
			{
				return createTestIdentityActionAdapter();
			}
			@Override
			public Adapter caseTimeConstraint(TimeConstraint object)
			{
				return createTimeConstraintAdapter();
			}
			@Override
			public Adapter caseTimeExpression(TimeExpression object)
			{
				return createTimeExpressionAdapter();
			}
			@Override
			public Adapter caseTimeInterval(TimeInterval object)
			{
				return createTimeIntervalAdapter();
			}
			@Override
			public Adapter caseTimeObservationAction(TimeObservationAction object)
			{
				return createTimeObservationActionAdapter();
			}
			@Override
			public Adapter caseTimeTrigger(TimeTrigger object)
			{
				return createTimeTriggerAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object)
			{
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseTrigger(Trigger object)
			{
				return createTriggerAdapter();
			}
			@Override
			public Adapter caseType(Type object)
			{
				return createTypeAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object)
			{
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseUsage(Usage object)
			{
				return createUsageAdapter();
			}
			@Override
			public Adapter caseUseCase(UseCase object)
			{
				return createUseCaseAdapter();
			}
			@Override
			public Adapter caseValuePin(ValuePin object)
			{
				return createValuePinAdapter();
			}
			@Override
			public Adapter caseValueSpecification(ValueSpecification object)
			{
				return createValueSpecificationAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object)
			{
				return createVariableAdapter();
			}
			@Override
			public Adapter caseVariableAction(VariableAction object)
			{
				return createVariableActionAdapter();
			}
			@Override
			public Adapter caseVertex(Vertex object)
			{
				return createVertexAdapter();
			}
			@Override
			public Adapter caseWriteLinkAction(WriteLinkAction object)
			{
				return createWriteLinkActionAdapter();
			}
			@Override
			public Adapter caseWriteStructuralFeatureAction(WriteStructuralFeatureAction object)
			{
				return createWriteStructuralFeatureActionAdapter();
			}
			@Override
			public Adapter caseWriteVariableAction(WriteVariableAction object)
			{
				return createWriteVariableActionAdapter();
			}
			@Override
			public Adapter caseIsAbstractIsStatic(IsAbstractIsStatic object)
			{
				return createIsAbstractIsStaticAdapter();
			}
			@Override
			public Adapter caseOwnedAttribute(OwnedAttribute object)
			{
				return createOwnedAttributeAdapter();
			}
			@Override
			public Adapter caseOwnedOperation(OwnedOperation object)
			{
				return createOwnedOperationAdapter();
			}
			@Override
			public Adapter caseOwnedEnd(OwnedEnd object)
			{
				return createOwnedEndAdapter();
			}
			@Override
			public Adapter caseOwnedParameter(OwnedParameter object)
			{
				return createOwnedParameterAdapter();
			}
			@Override
			public Adapter casePackagedElement(PackagedElement object)
			{
				return createPackagedElementAdapter();
			}
			@Override
			public Adapter caseReferenced(Referenced object)
			{
				return createReferencedAdapter();
			}
			@Override
			public Adapter caseSpecification(Specification object)
			{
				return createSpecificationAdapter();
			}
			@Override
			public Adapter caseOwnedRule(OwnedRule object)
			{
				return createOwnedRuleAdapter();
			}
			@Override
			public Adapter caseValue(Value object)
			{
				return createValueAdapter();
			}
			@Override
			public Adapter caseAssociationElement(AssociationElement object)
			{
				return createAssociationElementAdapter();
			}
			@Override
			public Adapter caseJType(JType object)
			{
				return createJTypeAdapter();
			}
			@Override
			public Adapter caseEModelElement(EModelElement object)
			{
				return createEModelElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Abstraction <em>Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Abstraction
	 * @generated
	 */
	public Adapter createAbstractionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.AcceptCallAction <em>Accept Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.AcceptCallAction
	 * @generated
	 */
	public Adapter createAcceptCallActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.AcceptEventAction <em>Accept Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.AcceptEventAction
	 * @generated
	 */
	public Adapter createAcceptEventActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Action
	 * @generated
	 */
	public Adapter createActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ActivityEdge <em>Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ActivityEdge
	 * @generated
	 */
	public Adapter createActivityEdgeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ActivityFinalNode <em>Activity Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ActivityFinalNode
	 * @generated
	 */
	public Adapter createActivityFinalNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ActivityGroup <em>Activity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ActivityGroup
	 * @generated
	 */
	public Adapter createActivityGroupAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ActivityNode
	 * @generated
	 */
	public Adapter createActivityNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ActivityParameterNode <em>Activity Parameter Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ActivityParameterNode
	 * @generated
	 */
	public Adapter createActivityParameterNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ActivityPartition <em>Activity Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ActivityPartition
	 * @generated
	 */
	public Adapter createActivityPartitionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Actor
	 * @generated
	 */
	public Adapter createActorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.AddStructuralFeatureValueAction <em>Add Structural Feature Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.AddStructuralFeatureValueAction
	 * @generated
	 */
	public Adapter createAddStructuralFeatureValueActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.AddVariableValueAction <em>Add Variable Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.AddVariableValueAction
	 * @generated
	 */
	public Adapter createAddVariableValueActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.AnyTrigger <em>Any Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.AnyTrigger
	 * @generated
	 */
	public Adapter createAnyTriggerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ApplyFunctionAction <em>Apply Function Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ApplyFunctionAction
	 * @generated
	 */
	public Adapter createApplyFunctionActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.AssociationClass <em>Association Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.AssociationClass
	 * @generated
	 */
	public Adapter createAssociationClassAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Behavior
	 * @generated
	 */
	public Adapter createBehaviorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.BehavioralFeature <em>Behavioral Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.BehavioralFeature
	 * @generated
	 */
	public Adapter createBehavioralFeatureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.BehavioredClassifier <em>Behaviored Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.BehavioredClassifier
	 * @generated
	 */
	public Adapter createBehavioredClassifierAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.BroadcastSignalAction <em>Broadcast Signal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.BroadcastSignalAction
	 * @generated
	 */
	public Adapter createBroadcastSignalActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.CallAction <em>Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.CallAction
	 * @generated
	 */
	public Adapter createCallActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.CallBehaviorAction <em>Call Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.CallBehaviorAction
	 * @generated
	 */
	public Adapter createCallBehaviorActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.CallOperationAction <em>Call Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.CallOperationAction
	 * @generated
	 */
	public Adapter createCallOperationActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.CallTrigger <em>Call Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.CallTrigger
	 * @generated
	 */
	public Adapter createCallTriggerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.CentralBufferNode <em>Central Buffer Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.CentralBufferNode
	 * @generated
	 */
	public Adapter createCentralBufferNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ChangeTrigger <em>Change Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ChangeTrigger
	 * @generated
	 */
	public Adapter createChangeTriggerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Class
	 * @generated
	 */
	public Adapter createClassAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ClassifierTemplateParameter <em>Classifier Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ClassifierTemplateParameter
	 * @generated
	 */
	public Adapter createClassifierTemplateParameterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Clause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Clause
	 * @generated
	 */
	public Adapter createClauseAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ClearAssociationAction <em>Clear Association Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ClearAssociationAction
	 * @generated
	 */
	public Adapter createClearAssociationActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ClearStructuralFeatureAction <em>Clear Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ClearStructuralFeatureAction
	 * @generated
	 */
	public Adapter createClearStructuralFeatureActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ClearVariableAction <em>Clear Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ClearVariableAction
	 * @generated
	 */
	public Adapter createClearVariableActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Collaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Collaboration
	 * @generated
	 */
	public Adapter createCollaborationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.CollaborationOccurrence <em>Collaboration Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.CollaborationOccurrence
	 * @generated
	 */
	public Adapter createCollaborationOccurrenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.CombinedFragment <em>Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.CombinedFragment
	 * @generated
	 */
	public Adapter createCombinedFragmentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.CommunicationPath <em>Communication Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.CommunicationPath
	 * @generated
	 */
	public Adapter createCommunicationPathAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Component
	 * @generated
	 */
	public Adapter createComponentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ConditionalNode <em>Conditional Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ConditionalNode
	 * @generated
	 */
	public Adapter createConditionalNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ConnectableElement <em>Connectable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ConnectableElement
	 * @generated
	 */
	public Adapter createConnectableElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ConnectableElementTemplateParameter <em>Connectable Element Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ConnectableElementTemplateParameter
	 * @generated
	 */
	public Adapter createConnectableElementTemplateParameterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ConnectionPointReference <em>Connection Point Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ConnectionPointReference
	 * @generated
	 */
	public Adapter createConnectionPointReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ConnectorEnd <em>Connector End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ConnectorEnd
	 * @generated
	 */
	public Adapter createConnectorEndAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Continuation <em>Continuation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Continuation
	 * @generated
	 */
	public Adapter createContinuationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ControlFlow
	 * @generated
	 */
	public Adapter createControlFlowAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ControlNode
	 * @generated
	 */
	public Adapter createControlNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.CreateLinkAction <em>Create Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.CreateLinkAction
	 * @generated
	 */
	public Adapter createCreateLinkActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.CreateLinkObjectAction <em>Create Link Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.CreateLinkObjectAction
	 * @generated
	 */
	public Adapter createCreateLinkObjectActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.CreateObjectAction <em>Create Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.CreateObjectAction
	 * @generated
	 */
	public Adapter createCreateObjectActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.DataStoreNode <em>Data Store Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.DataStoreNode
	 * @generated
	 */
	public Adapter createDataStoreNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.DecisionNode <em>Decision Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.DecisionNode
	 * @generated
	 */
	public Adapter createDecisionNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.DeployedArtifact <em>Deployed Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.DeployedArtifact
	 * @generated
	 */
	public Adapter createDeployedArtifactAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Deployment
	 * @generated
	 */
	public Adapter createDeploymentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.DeploymentSpecification <em>Deployment Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.DeploymentSpecification
	 * @generated
	 */
	public Adapter createDeploymentSpecificationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.DeploymentTarget <em>Deployment Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.DeploymentTarget
	 * @generated
	 */
	public Adapter createDeploymentTargetAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.DestroyLinkAction <em>Destroy Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.DestroyLinkAction
	 * @generated
	 */
	public Adapter createDestroyLinkActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.DestroyObjectAction <em>Destroy Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.DestroyObjectAction
	 * @generated
	 */
	public Adapter createDestroyObjectActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.DirectedRelationship <em>Directed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.DirectedRelationship
	 * @generated
	 */
	public Adapter createDirectedRelationshipAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Duration
	 * @generated
	 */
	public Adapter createDurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.DurationConstraint <em>Duration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.DurationConstraint
	 * @generated
	 */
	public Adapter createDurationConstraintAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.DurationInterval <em>Duration Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.DurationInterval
	 * @generated
	 */
	public Adapter createDurationIntervalAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.DurationObservationAction <em>Duration Observation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.DurationObservationAction
	 * @generated
	 */
	public Adapter createDurationObservationActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Element
	 * @generated
	 */
	public Adapter createElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ElementImport <em>Element Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ElementImport
	 * @generated
	 */
	public Adapter createElementImportAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.EncapsulatedClassifier <em>Encapsulated Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.EncapsulatedClassifier
	 * @generated
	 */
	public Adapter createEncapsulatedClassifierAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.EnumerationLiteral
	 * @generated
	 */
	public Adapter createEnumerationLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.EventOccurrence <em>Event Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.EventOccurrence
	 * @generated
	 */
	public Adapter createEventOccurrenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ExceptionHandler
	 * @generated
	 */
	public Adapter createExceptionHandlerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ExecutableNode
	 * @generated
	 */
	public Adapter createExecutableNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ExecutionEnvironment <em>Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ExecutionEnvironment
	 * @generated
	 */
	public Adapter createExecutionEnvironmentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ExecutionOccurrence <em>Execution Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ExecutionOccurrence
	 * @generated
	 */
	public Adapter createExecutionOccurrenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ExpansionNode <em>Expansion Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ExpansionNode
	 * @generated
	 */
	public Adapter createExpansionNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ExpansionRegion <em>Expansion Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ExpansionRegion
	 * @generated
	 */
	public Adapter createExpansionRegionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Extend <em>Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Extend
	 * @generated
	 */
	public Adapter createExtendAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Extension
	 * @generated
	 */
	public Adapter createExtensionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ExtensionEnd <em>Extension End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ExtensionEnd
	 * @generated
	 */
	public Adapter createExtensionEndAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ExtensionPoint <em>Extension Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ExtensionPoint
	 * @generated
	 */
	public Adapter createExtensionPointAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.FinalNode <em>Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.FinalNode
	 * @generated
	 */
	public Adapter createFinalNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.FinalState
	 * @generated
	 */
	public Adapter createFinalStateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.FlowFinalNode <em>Flow Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.FlowFinalNode
	 * @generated
	 */
	public Adapter createFlowFinalNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ForkNode <em>Fork Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ForkNode
	 * @generated
	 */
	public Adapter createForkNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Gate
	 * @generated
	 */
	public Adapter createGateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Generalization
	 * @generated
	 */
	public Adapter createGeneralizationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.GeneralizationSet <em>Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.GeneralizationSet
	 * @generated
	 */
	public Adapter createGeneralizationSetAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.GeneralOrdering <em>General Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.GeneralOrdering
	 * @generated
	 */
	public Adapter createGeneralOrderingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Implementation
	 * @generated
	 */
	public Adapter createImplementationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Include
	 * @generated
	 */
	public Adapter createIncludeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.InformationFlow <em>Information Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.InformationFlow
	 * @generated
	 */
	public Adapter createInformationFlowAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.InformationItem <em>Information Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.InformationItem
	 * @generated
	 */
	public Adapter createInformationItemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.InitialNode <em>Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.InitialNode
	 * @generated
	 */
	public Adapter createInitialNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.InputPin <em>Input Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.InputPin
	 * @generated
	 */
	public Adapter createInputPinAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.InstanceSpecification <em>Instance Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.InstanceSpecification
	 * @generated
	 */
	public Adapter createInstanceSpecificationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.InstanceValue <em>Instance Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.InstanceValue
	 * @generated
	 */
	public Adapter createInstanceValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Interaction
	 * @generated
	 */
	public Adapter createInteractionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.InteractionConstraint <em>Interaction Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.InteractionConstraint
	 * @generated
	 */
	public Adapter createInteractionConstraintAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.InteractionFragment <em>Interaction Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.InteractionFragment
	 * @generated
	 */
	public Adapter createInteractionFragmentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.InteractionOccurrence <em>Interaction Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.InteractionOccurrence
	 * @generated
	 */
	public Adapter createInteractionOccurrenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.InteractionOperand <em>Interaction Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.InteractionOperand
	 * @generated
	 */
	public Adapter createInteractionOperandAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.InterruptibleActivityRegion <em>Interruptible Activity Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.InterruptibleActivityRegion
	 * @generated
	 */
	public Adapter createInterruptibleActivityRegionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Interval
	 * @generated
	 */
	public Adapter createIntervalAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.IntervalConstraint <em>Interval Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.IntervalConstraint
	 * @generated
	 */
	public Adapter createIntervalConstraintAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.InvocationAction <em>Invocation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.InvocationAction
	 * @generated
	 */
	public Adapter createInvocationActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.JoinNode <em>Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.JoinNode
	 * @generated
	 */
	public Adapter createJoinNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Lifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Lifeline
	 * @generated
	 */
	public Adapter createLifelineAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.LinkAction <em>Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.LinkAction
	 * @generated
	 */
	public Adapter createLinkActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.LinkEndCreationData <em>Link End Creation Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.LinkEndCreationData
	 * @generated
	 */
	public Adapter createLinkEndCreationDataAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.LinkEndData <em>Link End Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.LinkEndData
	 * @generated
	 */
	public Adapter createLinkEndDataAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.LiteralBoolean <em>Literal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.LiteralBoolean
	 * @generated
	 */
	public Adapter createLiteralBooleanAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.LiteralInteger <em>Literal Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.LiteralInteger
	 * @generated
	 */
	public Adapter createLiteralIntegerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.LiteralNull <em>Literal Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.LiteralNull
	 * @generated
	 */
	public Adapter createLiteralNullAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.LiteralSpecification <em>Literal Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.LiteralSpecification
	 * @generated
	 */
	public Adapter createLiteralSpecificationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.LiteralString <em>Literal String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.LiteralString
	 * @generated
	 */
	public Adapter createLiteralStringAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.LiteralUnlimitedNatural <em>Literal Unlimited Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.LiteralUnlimitedNatural
	 * @generated
	 */
	public Adapter createLiteralUnlimitedNaturalAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.LoopNode <em>Loop Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.LoopNode
	 * @generated
	 */
	public Adapter createLoopNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Manifestation <em>Manifestation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Manifestation
	 * @generated
	 */
	public Adapter createManifestationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.MergeNode <em>Merge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.MergeNode
	 * @generated
	 */
	public Adapter createMergeNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Message
	 * @generated
	 */
	public Adapter createMessageAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.MessageEnd <em>Message End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.MessageEnd
	 * @generated
	 */
	public Adapter createMessageEndAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.MessageTrigger <em>Message Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.MessageTrigger
	 * @generated
	 */
	public Adapter createMessageTriggerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Model
	 * @generated
	 */
	public Adapter createModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.MultiplicityElement
	 * @generated
	 */
	public Adapter createMultiplicityElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Node
	 * @generated
	 */
	public Adapter createNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ObjectFlow <em>Object Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ObjectFlow
	 * @generated
	 */
	public Adapter createObjectFlowAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ObjectNode <em>Object Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ObjectNode
	 * @generated
	 */
	public Adapter createObjectNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.OpaqueExpression <em>Opaque Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.OpaqueExpression
	 * @generated
	 */
	public Adapter createOpaqueExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.OperationTemplateParameter <em>Operation Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.OperationTemplateParameter
	 * @generated
	 */
	public Adapter createOperationTemplateParameterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.OutputPin <em>Output Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.OutputPin
	 * @generated
	 */
	public Adapter createOutputPinAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Package
	 * @generated
	 */
	public Adapter createPackageAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.PackageableElement <em>Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.PackageableElement
	 * @generated
	 */
	public Adapter createPackageableElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.PackageImport <em>Package Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.PackageImport
	 * @generated
	 */
	public Adapter createPackageImportAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.PackageMerge <em>Package Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.PackageMerge
	 * @generated
	 */
	public Adapter createPackageMergeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ParameterableClassifier <em>Parameterable Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ParameterableClassifier
	 * @generated
	 */
	public Adapter createParameterableClassifierAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ParameterableElement <em>Parameterable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ParameterableElement
	 * @generated
	 */
	public Adapter createParameterableElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ParameterSet <em>Parameter Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ParameterSet
	 * @generated
	 */
	public Adapter createParameterSetAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.PartDecomposition <em>Part Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.PartDecomposition
	 * @generated
	 */
	public Adapter createPartDecompositionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Permission
	 * @generated
	 */
	public Adapter createPermissionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Pin
	 * @generated
	 */
	public Adapter createPinAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Port
	 * @generated
	 */
	public Adapter createPortAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.PrimitiveFunction <em>Primitive Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.PrimitiveFunction
	 * @generated
	 */
	public Adapter createPrimitiveFunctionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Profile
	 * @generated
	 */
	public Adapter createProfileAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ProfileApplication <em>Profile Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ProfileApplication
	 * @generated
	 */
	public Adapter createProfileApplicationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ProtocolConformance <em>Protocol Conformance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ProtocolConformance
	 * @generated
	 */
	public Adapter createProtocolConformanceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ProtocolStateMachine <em>Protocol State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ProtocolStateMachine
	 * @generated
	 */
	public Adapter createProtocolStateMachineAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ProtocolTransition <em>Protocol Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ProtocolTransition
	 * @generated
	 */
	public Adapter createProtocolTransitionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Pseudostate <em>Pseudostate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Pseudostate
	 * @generated
	 */
	public Adapter createPseudostateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.QualifierValue <em>Qualifier Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.QualifierValue
	 * @generated
	 */
	public Adapter createQualifierValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.RaiseExceptionAction <em>Raise Exception Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.RaiseExceptionAction
	 * @generated
	 */
	public Adapter createRaiseExceptionActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ReadExtentAction <em>Read Extent Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ReadExtentAction
	 * @generated
	 */
	public Adapter createReadExtentActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ReadIsClassifiedObjectAction <em>Read Is Classified Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ReadIsClassifiedObjectAction
	 * @generated
	 */
	public Adapter createReadIsClassifiedObjectActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ReadLinkAction <em>Read Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ReadLinkAction
	 * @generated
	 */
	public Adapter createReadLinkActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ReadLinkObjectEndAction <em>Read Link Object End Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ReadLinkObjectEndAction
	 * @generated
	 */
	public Adapter createReadLinkObjectEndActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ReadLinkObjectEndQualifierAction <em>Read Link Object End Qualifier Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ReadLinkObjectEndQualifierAction
	 * @generated
	 */
	public Adapter createReadLinkObjectEndQualifierActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ReadSelfAction <em>Read Self Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ReadSelfAction
	 * @generated
	 */
	public Adapter createReadSelfActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ReadStructuralFeatureAction <em>Read Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ReadStructuralFeatureAction
	 * @generated
	 */
	public Adapter createReadStructuralFeatureActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ReadVariableAction <em>Read Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ReadVariableAction
	 * @generated
	 */
	public Adapter createReadVariableActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Realization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Realization
	 * @generated
	 */
	public Adapter createRealizationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Reception <em>Reception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Reception
	 * @generated
	 */
	public Adapter createReceptionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ReclassifyObjectAction <em>Reclassify Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ReclassifyObjectAction
	 * @generated
	 */
	public Adapter createReclassifyObjectActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.RedefinableElement <em>Redefinable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.RedefinableElement
	 * @generated
	 */
	public Adapter createRedefinableElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.RedefinableTemplateSignature <em>Redefinable Template Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.RedefinableTemplateSignature
	 * @generated
	 */
	public Adapter createRedefinableTemplateSignatureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Region
	 * @generated
	 */
	public Adapter createRegionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.RemoveStructuralFeatureValueAction <em>Remove Structural Feature Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.RemoveStructuralFeatureValueAction
	 * @generated
	 */
	public Adapter createRemoveStructuralFeatureValueActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.RemoveVariableValueAction <em>Remove Variable Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.RemoveVariableValueAction
	 * @generated
	 */
	public Adapter createRemoveVariableValueActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ReplyAction <em>Reply Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ReplyAction
	 * @generated
	 */
	public Adapter createReplyActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.SendObjectAction <em>Send Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.SendObjectAction
	 * @generated
	 */
	public Adapter createSendObjectActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.SendSignalAction <em>Send Signal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.SendSignalAction
	 * @generated
	 */
	public Adapter createSendSignalActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Signal
	 * @generated
	 */
	public Adapter createSignalAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.SignalTrigger <em>Signal Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.SignalTrigger
	 * @generated
	 */
	public Adapter createSignalTriggerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Slot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Slot
	 * @generated
	 */
	public Adapter createSlotAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.StartOwnedBehaviorAction <em>Start Owned Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.StartOwnedBehaviorAction
	 * @generated
	 */
	public Adapter createStartOwnedBehaviorActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.State
	 * @generated
	 */
	public Adapter createStateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.StateInvariant <em>State Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.StateInvariant
	 * @generated
	 */
	public Adapter createStateInvariantAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.StateMachine
	 * @generated
	 */
	public Adapter createStateMachineAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Stereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Stereotype
	 * @generated
	 */
	public Adapter createStereotypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Stop
	 * @generated
	 */
	public Adapter createStopAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.StringExpression <em>String Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.StringExpression
	 * @generated
	 */
	public Adapter createStringExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.StructuralFeature
	 * @generated
	 */
	public Adapter createStructuralFeatureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.StructuralFeatureAction <em>Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.StructuralFeatureAction
	 * @generated
	 */
	public Adapter createStructuralFeatureActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.StructuredActivityNode <em>Structured Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.StructuredActivityNode
	 * @generated
	 */
	public Adapter createStructuredActivityNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.StructuredClassifier <em>Structured Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.StructuredClassifier
	 * @generated
	 */
	public Adapter createStructuredClassifierAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Substitution <em>Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Substitution
	 * @generated
	 */
	public Adapter createSubstitutionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.TemplateableClassifier <em>Templateable Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.TemplateableClassifier
	 * @generated
	 */
	public Adapter createTemplateableClassifierAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.TemplateableElement <em>Templateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.TemplateableElement
	 * @generated
	 */
	public Adapter createTemplateableElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.TemplateBinding <em>Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.TemplateBinding
	 * @generated
	 */
	public Adapter createTemplateBindingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.TemplateParameter <em>Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.TemplateParameter
	 * @generated
	 */
	public Adapter createTemplateParameterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.TemplateParameterSubstitution <em>Template Parameter Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.TemplateParameterSubstitution
	 * @generated
	 */
	public Adapter createTemplateParameterSubstitutionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.TemplateSignature <em>Template Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.TemplateSignature
	 * @generated
	 */
	public Adapter createTemplateSignatureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.TestIdentityAction <em>Test Identity Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.TestIdentityAction
	 * @generated
	 */
	public Adapter createTestIdentityActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.TimeConstraint <em>Time Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.TimeConstraint
	 * @generated
	 */
	public Adapter createTimeConstraintAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.TimeExpression <em>Time Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.TimeExpression
	 * @generated
	 */
	public Adapter createTimeExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.TimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.TimeInterval
	 * @generated
	 */
	public Adapter createTimeIntervalAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.TimeObservationAction <em>Time Observation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.TimeObservationAction
	 * @generated
	 */
	public Adapter createTimeObservationActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.TimeTrigger <em>Time Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.TimeTrigger
	 * @generated
	 */
	public Adapter createTimeTriggerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Type
	 * @generated
	 */
	public Adapter createTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Usage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Usage
	 * @generated
	 */
	public Adapter createUsageAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.UseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.UseCase
	 * @generated
	 */
	public Adapter createUseCaseAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ValuePin <em>Value Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ValuePin
	 * @generated
	 */
	public Adapter createValuePinAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.ValueSpecification
	 * @generated
	 */
	public Adapter createValueSpecificationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.VariableAction <em>Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.VariableAction
	 * @generated
	 */
	public Adapter createVariableActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Vertex
	 * @generated
	 */
	public Adapter createVertexAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.WriteLinkAction <em>Write Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.WriteLinkAction
	 * @generated
	 */
	public Adapter createWriteLinkActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.WriteStructuralFeatureAction <em>Write Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.WriteStructuralFeatureAction
	 * @generated
	 */
	public Adapter createWriteStructuralFeatureActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.WriteVariableAction <em>Write Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.WriteVariableAction
	 * @generated
	 */
	public Adapter createWriteVariableActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.IsAbstractIsStatic <em>Is Abstract Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.IsAbstractIsStatic
	 * @generated
	 */
	public Adapter createIsAbstractIsStaticAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.OwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.OwnedAttribute
	 * @generated
	 */
	public Adapter createOwnedAttributeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.OwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.OwnedOperation
	 * @generated
	 */
	public Adapter createOwnedOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.OwnedEnd <em>Owned End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.OwnedEnd
	 * @generated
	 */
	public Adapter createOwnedEndAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.OwnedParameter <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.OwnedParameter
	 * @generated
	 */
	public Adapter createOwnedParameterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.PackagedElement <em>Packaged Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.PackagedElement
	 * @generated
	 */
	public Adapter createPackagedElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Referenced <em>Referenced</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Referenced
	 * @generated
	 */
	public Adapter createReferencedAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Specification
	 * @generated
	 */
	public Adapter createSpecificationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.OwnedRule <em>Owned Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.OwnedRule
	 * @generated
	 */
	public Adapter createOwnedRuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.Value
	 * @generated
	 */
	public Adapter createValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.AssociationElement <em>Association Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.AssociationElement
	 * @generated
	 */
	public Adapter createAssociationElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2._1._0._0.uml.JType <em>JType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2._1._0._0.uml.JType
	 * @generated
	 */
	public Adapter createJTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.EModelElement
	 * @generated
	 */
	public Adapter createEModelElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //UmlAdapterFactory
