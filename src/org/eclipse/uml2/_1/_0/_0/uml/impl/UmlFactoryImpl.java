/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.uml2._1._0._0.uml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import org.eclipse.uml2._1._0._0.uml.AggregationKind;
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
import org.eclipse.uml2._1._0._0.uml.CallConcurrencyKind;
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
import org.eclipse.uml2._1._0._0.uml.ConnectorKind;
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
import org.eclipse.uml2._1._0._0.uml.ExpansionKind;
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
import org.eclipse.uml2._1._0._0.uml.InteractionOperator;
import org.eclipse.uml2._1._0._0.uml.Interface;
import org.eclipse.uml2._1._0._0.uml.InterruptibleActivityRegion;
import org.eclipse.uml2._1._0._0.uml.Interval;
import org.eclipse.uml2._1._0._0.uml.IntervalConstraint;
import org.eclipse.uml2._1._0._0.uml.InvocationAction;
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
import org.eclipse.uml2._1._0._0.uml.MessageKind;
import org.eclipse.uml2._1._0._0.uml.MessageSort;
import org.eclipse.uml2._1._0._0.uml.MessageTrigger;
import org.eclipse.uml2._1._0._0.uml.Model;
import org.eclipse.uml2._1._0._0.uml.MultiplicityElement;
import org.eclipse.uml2._1._0._0.uml.NamedElement;
import org.eclipse.uml2._1._0._0.uml.Namespace;
import org.eclipse.uml2._1._0._0.uml.Node;
import org.eclipse.uml2._1._0._0.uml.ObjectFlow;
import org.eclipse.uml2._1._0._0.uml.ObjectNode;
import org.eclipse.uml2._1._0._0.uml.ObjectNodeOrderingKind;
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
import org.eclipse.uml2._1._0._0.uml.ParameterDirectionKind;
import org.eclipse.uml2._1._0._0.uml.ParameterEffectKind;
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
import org.eclipse.uml2._1._0._0.uml.PseudostateKind;
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
import org.eclipse.uml2._1._0._0.uml.TransitionKind;
import org.eclipse.uml2._1._0._0.uml.Trigger;
import org.eclipse.uml2._1._0._0.uml.Type;
import org.eclipse.uml2._1._0._0.uml.TypedElement;
import org.eclipse.uml2._1._0._0.uml.UmlFactory;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.eclipse.uml2._1._0._0.uml.Usage;
import org.eclipse.uml2._1._0._0.uml.UseCase;
import org.eclipse.uml2._1._0._0.uml.Value;
import org.eclipse.uml2._1._0._0.uml.ValuePin;
import org.eclipse.uml2._1._0._0.uml.ValueSpecification;
import org.eclipse.uml2._1._0._0.uml.Variable;
import org.eclipse.uml2._1._0._0.uml.VariableAction;
import org.eclipse.uml2._1._0._0.uml.Vertex;
import org.eclipse.uml2._1._0._0.uml.VisibilityKind;
import org.eclipse.uml2._1._0._0.uml.WriteLinkAction;
import org.eclipse.uml2._1._0._0.uml.WriteStructuralFeatureAction;
import org.eclipse.uml2._1._0._0.uml.WriteVariableAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlFactoryImpl extends EFactoryImpl implements UmlFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UmlFactory init()
	{
		try
		{
			UmlFactory theUmlFactory = (UmlFactory)EPackage.Registry.INSTANCE.getEFactory("http://schema.omg.org/spec/UML/2.1"); 
			if (theUmlFactory != null)
			{
				return theUmlFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case UmlPackage.ABSTRACTION: return createAbstraction();
			case UmlPackage.ACCEPT_CALL_ACTION: return createAcceptCallAction();
			case UmlPackage.ACCEPT_EVENT_ACTION: return createAcceptEventAction();
			case UmlPackage.ACTION: return createAction();
			case UmlPackage.ACTIVITY: return createActivity();
			case UmlPackage.ACTIVITY_EDGE: return createActivityEdge();
			case UmlPackage.ACTIVITY_FINAL_NODE: return createActivityFinalNode();
			case UmlPackage.ACTIVITY_GROUP: return createActivityGroup();
			case UmlPackage.ACTIVITY_NODE: return createActivityNode();
			case UmlPackage.ACTIVITY_PARAMETER_NODE: return createActivityParameterNode();
			case UmlPackage.ACTIVITY_PARTITION: return createActivityPartition();
			case UmlPackage.ACTOR: return createActor();
			case UmlPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION: return createAddStructuralFeatureValueAction();
			case UmlPackage.ADD_VARIABLE_VALUE_ACTION: return createAddVariableValueAction();
			case UmlPackage.ANY_TRIGGER: return createAnyTrigger();
			case UmlPackage.APPLY_FUNCTION_ACTION: return createApplyFunctionAction();
			case UmlPackage.ARTIFACT: return createArtifact();
			case UmlPackage.ASSOCIATION: return createAssociation();
			case UmlPackage.ASSOCIATION_CLASS: return createAssociationClass();
			case UmlPackage.BEHAVIOR: return createBehavior();
			case UmlPackage.BEHAVIORAL_FEATURE: return createBehavioralFeature();
			case UmlPackage.BEHAVIORED_CLASSIFIER: return createBehavioredClassifier();
			case UmlPackage.BROADCAST_SIGNAL_ACTION: return createBroadcastSignalAction();
			case UmlPackage.CALL_ACTION: return createCallAction();
			case UmlPackage.CALL_BEHAVIOR_ACTION: return createCallBehaviorAction();
			case UmlPackage.CALL_OPERATION_ACTION: return createCallOperationAction();
			case UmlPackage.CALL_TRIGGER: return createCallTrigger();
			case UmlPackage.CENTRAL_BUFFER_NODE: return createCentralBufferNode();
			case UmlPackage.CHANGE_TRIGGER: return createChangeTrigger();
			case UmlPackage.CLASS: return createClass();
			case UmlPackage.CLASSIFIER: return createClassifier();
			case UmlPackage.CLASSIFIER_TEMPLATE_PARAMETER: return createClassifierTemplateParameter();
			case UmlPackage.CLAUSE: return createClause();
			case UmlPackage.CLEAR_ASSOCIATION_ACTION: return createClearAssociationAction();
			case UmlPackage.CLEAR_STRUCTURAL_FEATURE_ACTION: return createClearStructuralFeatureAction();
			case UmlPackage.CLEAR_VARIABLE_ACTION: return createClearVariableAction();
			case UmlPackage.COLLABORATION: return createCollaboration();
			case UmlPackage.COLLABORATION_OCCURRENCE: return createCollaborationOccurrence();
			case UmlPackage.COMBINED_FRAGMENT: return createCombinedFragment();
			case UmlPackage.COMMENT: return createComment();
			case UmlPackage.COMMUNICATION_PATH: return createCommunicationPath();
			case UmlPackage.COMPONENT: return createComponent();
			case UmlPackage.CONDITIONAL_NODE: return createConditionalNode();
			case UmlPackage.CONNECTABLE_ELEMENT: return createConnectableElement();
			case UmlPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER: return createConnectableElementTemplateParameter();
			case UmlPackage.CONNECTION_POINT_REFERENCE: return createConnectionPointReference();
			case UmlPackage.CONNECTOR: return createConnector();
			case UmlPackage.CONNECTOR_END: return createConnectorEnd();
			case UmlPackage.CONSTRAINT: return createConstraint();
			case UmlPackage.CONTINUATION: return createContinuation();
			case UmlPackage.CONTROL_FLOW: return createControlFlow();
			case UmlPackage.CONTROL_NODE: return createControlNode();
			case UmlPackage.CREATE_LINK_ACTION: return createCreateLinkAction();
			case UmlPackage.CREATE_LINK_OBJECT_ACTION: return createCreateLinkObjectAction();
			case UmlPackage.CREATE_OBJECT_ACTION: return createCreateObjectAction();
			case UmlPackage.DATA_STORE_NODE: return createDataStoreNode();
			case UmlPackage.DATA_TYPE: return createDataType();
			case UmlPackage.DECISION_NODE: return createDecisionNode();
			case UmlPackage.DEPENDENCY: return createDependency();
			case UmlPackage.DEPLOYED_ARTIFACT: return createDeployedArtifact();
			case UmlPackage.DEPLOYMENT: return createDeployment();
			case UmlPackage.DEPLOYMENT_SPECIFICATION: return createDeploymentSpecification();
			case UmlPackage.DEPLOYMENT_TARGET: return createDeploymentTarget();
			case UmlPackage.DESTROY_LINK_ACTION: return createDestroyLinkAction();
			case UmlPackage.DESTROY_OBJECT_ACTION: return createDestroyObjectAction();
			case UmlPackage.DEVICE: return createDevice();
			case UmlPackage.DIRECTED_RELATIONSHIP: return createDirectedRelationship();
			case UmlPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case UmlPackage.DURATION: return createDuration();
			case UmlPackage.DURATION_CONSTRAINT: return createDurationConstraint();
			case UmlPackage.DURATION_INTERVAL: return createDurationInterval();
			case UmlPackage.DURATION_OBSERVATION_ACTION: return createDurationObservationAction();
			case UmlPackage.ELEMENT: return createElement();
			case UmlPackage.ELEMENT_IMPORT: return createElementImport();
			case UmlPackage.ENCAPSULATED_CLASSIFIER: return createEncapsulatedClassifier();
			case UmlPackage.ENUMERATION: return createEnumeration();
			case UmlPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
			case UmlPackage.EVENT_OCCURRENCE: return createEventOccurrence();
			case UmlPackage.EXCEPTION_HANDLER: return createExceptionHandler();
			case UmlPackage.EXECUTABLE_NODE: return createExecutableNode();
			case UmlPackage.EXECUTION_ENVIRONMENT: return createExecutionEnvironment();
			case UmlPackage.EXECUTION_OCCURRENCE: return createExecutionOccurrence();
			case UmlPackage.EXPANSION_NODE: return createExpansionNode();
			case UmlPackage.EXPANSION_REGION: return createExpansionRegion();
			case UmlPackage.EXPRESSION: return createExpression();
			case UmlPackage.EXTEND: return createExtend();
			case UmlPackage.EXTENSION: return createExtension();
			case UmlPackage.EXTENSION_END: return createExtensionEnd();
			case UmlPackage.EXTENSION_POINT: return createExtensionPoint();
			case UmlPackage.FEATURE: return createFeature();
			case UmlPackage.FINAL_NODE: return createFinalNode();
			case UmlPackage.FINAL_STATE: return createFinalState();
			case UmlPackage.FLOW_FINAL_NODE: return createFlowFinalNode();
			case UmlPackage.FORK_NODE: return createForkNode();
			case UmlPackage.GATE: return createGate();
			case UmlPackage.GENERALIZATION: return createGeneralization();
			case UmlPackage.GENERALIZATION_SET: return createGeneralizationSet();
			case UmlPackage.GENERAL_ORDERING: return createGeneralOrdering();
			case UmlPackage.IMPLEMENTATION: return createImplementation();
			case UmlPackage.INCLUDE: return createInclude();
			case UmlPackage.INFORMATION_FLOW: return createInformationFlow();
			case UmlPackage.INFORMATION_ITEM: return createInformationItem();
			case UmlPackage.INITIAL_NODE: return createInitialNode();
			case UmlPackage.INPUT_PIN: return createInputPin();
			case UmlPackage.INSTANCE_SPECIFICATION: return createInstanceSpecification();
			case UmlPackage.INSTANCE_VALUE: return createInstanceValue();
			case UmlPackage.INTERACTION: return createInteraction();
			case UmlPackage.INTERACTION_CONSTRAINT: return createInteractionConstraint();
			case UmlPackage.INTERACTION_FRAGMENT: return createInteractionFragment();
			case UmlPackage.INTERACTION_OCCURRENCE: return createInteractionOccurrence();
			case UmlPackage.INTERACTION_OPERAND: return createInteractionOperand();
			case UmlPackage.INTERFACE: return createInterface();
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION: return createInterruptibleActivityRegion();
			case UmlPackage.INTERVAL: return createInterval();
			case UmlPackage.INTERVAL_CONSTRAINT: return createIntervalConstraint();
			case UmlPackage.INVOCATION_ACTION: return createInvocationAction();
			case UmlPackage.JOIN_NODE: return createJoinNode();
			case UmlPackage.LIFELINE: return createLifeline();
			case UmlPackage.LINK_ACTION: return createLinkAction();
			case UmlPackage.LINK_END_CREATION_DATA: return createLinkEndCreationData();
			case UmlPackage.LINK_END_DATA: return createLinkEndData();
			case UmlPackage.LITERAL_BOOLEAN: return createLiteralBoolean();
			case UmlPackage.LITERAL_INTEGER: return createLiteralInteger();
			case UmlPackage.LITERAL_NULL: return createLiteralNull();
			case UmlPackage.LITERAL_SPECIFICATION: return createLiteralSpecification();
			case UmlPackage.LITERAL_STRING: return createLiteralString();
			case UmlPackage.LITERAL_UNLIMITED_NATURAL: return createLiteralUnlimitedNatural();
			case UmlPackage.LOOP_NODE: return createLoopNode();
			case UmlPackage.MANIFESTATION: return createManifestation();
			case UmlPackage.MERGE_NODE: return createMergeNode();
			case UmlPackage.MESSAGE: return createMessage();
			case UmlPackage.MESSAGE_END: return createMessageEnd();
			case UmlPackage.MESSAGE_TRIGGER: return createMessageTrigger();
			case UmlPackage.MODEL: return createModel();
			case UmlPackage.MULTIPLICITY_ELEMENT: return createMultiplicityElement();
			case UmlPackage.NAMED_ELEMENT: return createNamedElement();
			case UmlPackage.NAMESPACE: return createNamespace();
			case UmlPackage.NODE: return createNode();
			case UmlPackage.OBJECT_FLOW: return createObjectFlow();
			case UmlPackage.OBJECT_NODE: return createObjectNode();
			case UmlPackage.OPAQUE_EXPRESSION: return createOpaqueExpression();
			case UmlPackage.OPERATION: return createOperation();
			case UmlPackage.OPERATION_TEMPLATE_PARAMETER: return createOperationTemplateParameter();
			case UmlPackage.OUTPUT_PIN: return createOutputPin();
			case UmlPackage.PACKAGE: return createPackage();
			case UmlPackage.PACKAGEABLE_ELEMENT: return createPackageableElement();
			case UmlPackage.PACKAGE_IMPORT: return createPackageImport();
			case UmlPackage.PACKAGE_MERGE: return createPackageMerge();
			case UmlPackage.PARAMETER: return createParameter();
			case UmlPackage.PARAMETERABLE_CLASSIFIER: return createParameterableClassifier();
			case UmlPackage.PARAMETERABLE_ELEMENT: return createParameterableElement();
			case UmlPackage.PARAMETER_SET: return createParameterSet();
			case UmlPackage.PART_DECOMPOSITION: return createPartDecomposition();
			case UmlPackage.PERMISSION: return createPermission();
			case UmlPackage.PIN: return createPin();
			case UmlPackage.PORT: return createPort();
			case UmlPackage.PRIMITIVE_FUNCTION: return createPrimitiveFunction();
			case UmlPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case UmlPackage.PROFILE: return createProfile();
			case UmlPackage.PROFILE_APPLICATION: return createProfileApplication();
			case UmlPackage.PROPERTY: return createProperty();
			case UmlPackage.PROTOCOL_CONFORMANCE: return createProtocolConformance();
			case UmlPackage.PROTOCOL_STATE_MACHINE: return createProtocolStateMachine();
			case UmlPackage.PROTOCOL_TRANSITION: return createProtocolTransition();
			case UmlPackage.PSEUDOSTATE: return createPseudostate();
			case UmlPackage.QUALIFIER_VALUE: return createQualifierValue();
			case UmlPackage.RAISE_EXCEPTION_ACTION: return createRaiseExceptionAction();
			case UmlPackage.READ_EXTENT_ACTION: return createReadExtentAction();
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION: return createReadIsClassifiedObjectAction();
			case UmlPackage.READ_LINK_ACTION: return createReadLinkAction();
			case UmlPackage.READ_LINK_OBJECT_END_ACTION: return createReadLinkObjectEndAction();
			case UmlPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION: return createReadLinkObjectEndQualifierAction();
			case UmlPackage.READ_SELF_ACTION: return createReadSelfAction();
			case UmlPackage.READ_STRUCTURAL_FEATURE_ACTION: return createReadStructuralFeatureAction();
			case UmlPackage.READ_VARIABLE_ACTION: return createReadVariableAction();
			case UmlPackage.REALIZATION: return createRealization();
			case UmlPackage.RECEPTION: return createReception();
			case UmlPackage.RECLASSIFY_OBJECT_ACTION: return createReclassifyObjectAction();
			case UmlPackage.REDEFINABLE_ELEMENT: return createRedefinableElement();
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE: return createRedefinableTemplateSignature();
			case UmlPackage.REGION: return createRegion();
			case UmlPackage.RELATIONSHIP: return createRelationship();
			case UmlPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION: return createRemoveStructuralFeatureValueAction();
			case UmlPackage.REMOVE_VARIABLE_VALUE_ACTION: return createRemoveVariableValueAction();
			case UmlPackage.REPLY_ACTION: return createReplyAction();
			case UmlPackage.SEND_OBJECT_ACTION: return createSendObjectAction();
			case UmlPackage.SEND_SIGNAL_ACTION: return createSendSignalAction();
			case UmlPackage.SIGNAL: return createSignal();
			case UmlPackage.SIGNAL_TRIGGER: return createSignalTrigger();
			case UmlPackage.SLOT: return createSlot();
			case UmlPackage.START_OWNED_BEHAVIOR_ACTION: return createStartOwnedBehaviorAction();
			case UmlPackage.STATE: return createState();
			case UmlPackage.STATE_INVARIANT: return createStateInvariant();
			case UmlPackage.STATE_MACHINE: return createStateMachine();
			case UmlPackage.STEREOTYPE: return createStereotype();
			case UmlPackage.STOP: return createStop();
			case UmlPackage.STRING_EXPRESSION: return createStringExpression();
			case UmlPackage.STRUCTURAL_FEATURE: return createStructuralFeature();
			case UmlPackage.STRUCTURAL_FEATURE_ACTION: return createStructuralFeatureAction();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE: return createStructuredActivityNode();
			case UmlPackage.STRUCTURED_CLASSIFIER: return createStructuredClassifier();
			case UmlPackage.SUBSTITUTION: return createSubstitution();
			case UmlPackage.TEMPLATEABLE_CLASSIFIER: return createTemplateableClassifier();
			case UmlPackage.TEMPLATEABLE_ELEMENT: return createTemplateableElement();
			case UmlPackage.TEMPLATE_BINDING: return createTemplateBinding();
			case UmlPackage.TEMPLATE_PARAMETER: return createTemplateParameter();
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION: return createTemplateParameterSubstitution();
			case UmlPackage.TEMPLATE_SIGNATURE: return createTemplateSignature();
			case UmlPackage.TEST_IDENTITY_ACTION: return createTestIdentityAction();
			case UmlPackage.TIME_CONSTRAINT: return createTimeConstraint();
			case UmlPackage.TIME_EXPRESSION: return createTimeExpression();
			case UmlPackage.TIME_INTERVAL: return createTimeInterval();
			case UmlPackage.TIME_OBSERVATION_ACTION: return createTimeObservationAction();
			case UmlPackage.TIME_TRIGGER: return createTimeTrigger();
			case UmlPackage.TRANSITION: return createTransition();
			case UmlPackage.TRIGGER: return createTrigger();
			case UmlPackage.TYPE: return createType();
			case UmlPackage.TYPED_ELEMENT: return createTypedElement();
			case UmlPackage.USAGE: return createUsage();
			case UmlPackage.USE_CASE: return createUseCase();
			case UmlPackage.VALUE_PIN: return createValuePin();
			case UmlPackage.VALUE_SPECIFICATION: return createValueSpecification();
			case UmlPackage.VARIABLE: return createVariable();
			case UmlPackage.VARIABLE_ACTION: return createVariableAction();
			case UmlPackage.VERTEX: return createVertex();
			case UmlPackage.WRITE_LINK_ACTION: return createWriteLinkAction();
			case UmlPackage.WRITE_STRUCTURAL_FEATURE_ACTION: return createWriteStructuralFeatureAction();
			case UmlPackage.WRITE_VARIABLE_ACTION: return createWriteVariableAction();
			case UmlPackage.OWNED_ATTRIBUTE: return createOwnedAttribute();
			case UmlPackage.OWNED_OPERATION: return createOwnedOperation();
			case UmlPackage.OWNED_END: return createOwnedEnd();
			case UmlPackage.OWNED_PARAMETER: return createOwnedParameter();
			case UmlPackage.PACKAGED_ELEMENT: return createPackagedElement();
			case UmlPackage.REFERENCED: return createReferenced();
			case UmlPackage.SPECIFICATION: return createSpecification();
			case UmlPackage.OWNED_RULE: return createOwnedRule();
			case UmlPackage.VALUE: return createValue();
			case UmlPackage.ASSOCIATION_ELEMENT: return createAssociationElement();
			case UmlPackage.JTYPE: return createJType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case UmlPackage.AGGREGATION_KIND:
				return createAggregationKindFromString(eDataType, initialValue);
			case UmlPackage.CALL_CONCURRENCY_KIND:
				return createCallConcurrencyKindFromString(eDataType, initialValue);
			case UmlPackage.CONNECTOR_KIND:
				return createConnectorKindFromString(eDataType, initialValue);
			case UmlPackage.EXPANSION_KIND:
				return createExpansionKindFromString(eDataType, initialValue);
			case UmlPackage.INTERACTION_OPERATOR:
				return createInteractionOperatorFromString(eDataType, initialValue);
			case UmlPackage.MESSAGE_KIND:
				return createMessageKindFromString(eDataType, initialValue);
			case UmlPackage.MESSAGE_SORT:
				return createMessageSortFromString(eDataType, initialValue);
			case UmlPackage.OBJECT_NODE_ORDERING_KIND:
				return createObjectNodeOrderingKindFromString(eDataType, initialValue);
			case UmlPackage.PARAMETER_DIRECTION_KIND:
				return createParameterDirectionKindFromString(eDataType, initialValue);
			case UmlPackage.PARAMETER_EFFECT_KIND:
				return createParameterEffectKindFromString(eDataType, initialValue);
			case UmlPackage.PSEUDOSTATE_KIND:
				return createPseudostateKindFromString(eDataType, initialValue);
			case UmlPackage.TRANSITION_KIND:
				return createTransitionKindFromString(eDataType, initialValue);
			case UmlPackage.VISIBILITY_KIND:
				return createVisibilityKindFromString(eDataType, initialValue);
			case UmlPackage.AGGREGATION_KIND_OBJECT:
				return createAggregationKindObjectFromString(eDataType, initialValue);
			case UmlPackage.CALL_CONCURRENCY_KIND_OBJECT:
				return createCallConcurrencyKindObjectFromString(eDataType, initialValue);
			case UmlPackage.CONNECTOR_KIND_OBJECT:
				return createConnectorKindObjectFromString(eDataType, initialValue);
			case UmlPackage.EXPANSION_KIND_OBJECT:
				return createExpansionKindObjectFromString(eDataType, initialValue);
			case UmlPackage.INTERACTION_OPERATOR_OBJECT:
				return createInteractionOperatorObjectFromString(eDataType, initialValue);
			case UmlPackage.MESSAGE_KIND_OBJECT:
				return createMessageKindObjectFromString(eDataType, initialValue);
			case UmlPackage.MESSAGE_SORT_OBJECT:
				return createMessageSortObjectFromString(eDataType, initialValue);
			case UmlPackage.OBJECT_NODE_ORDERING_KIND_OBJECT:
				return createObjectNodeOrderingKindObjectFromString(eDataType, initialValue);
			case UmlPackage.PARAMETER_DIRECTION_KIND_OBJECT:
				return createParameterDirectionKindObjectFromString(eDataType, initialValue);
			case UmlPackage.PARAMETER_EFFECT_KIND_OBJECT:
				return createParameterEffectKindObjectFromString(eDataType, initialValue);
			case UmlPackage.PSEUDOSTATE_KIND_OBJECT:
				return createPseudostateKindObjectFromString(eDataType, initialValue);
			case UmlPackage.TRANSITION_KIND_OBJECT:
				return createTransitionKindObjectFromString(eDataType, initialValue);
			case UmlPackage.VISIBILITY_KIND_OBJECT:
				return createVisibilityKindObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case UmlPackage.AGGREGATION_KIND:
				return convertAggregationKindToString(eDataType, instanceValue);
			case UmlPackage.CALL_CONCURRENCY_KIND:
				return convertCallConcurrencyKindToString(eDataType, instanceValue);
			case UmlPackage.CONNECTOR_KIND:
				return convertConnectorKindToString(eDataType, instanceValue);
			case UmlPackage.EXPANSION_KIND:
				return convertExpansionKindToString(eDataType, instanceValue);
			case UmlPackage.INTERACTION_OPERATOR:
				return convertInteractionOperatorToString(eDataType, instanceValue);
			case UmlPackage.MESSAGE_KIND:
				return convertMessageKindToString(eDataType, instanceValue);
			case UmlPackage.MESSAGE_SORT:
				return convertMessageSortToString(eDataType, instanceValue);
			case UmlPackage.OBJECT_NODE_ORDERING_KIND:
				return convertObjectNodeOrderingKindToString(eDataType, instanceValue);
			case UmlPackage.PARAMETER_DIRECTION_KIND:
				return convertParameterDirectionKindToString(eDataType, instanceValue);
			case UmlPackage.PARAMETER_EFFECT_KIND:
				return convertParameterEffectKindToString(eDataType, instanceValue);
			case UmlPackage.PSEUDOSTATE_KIND:
				return convertPseudostateKindToString(eDataType, instanceValue);
			case UmlPackage.TRANSITION_KIND:
				return convertTransitionKindToString(eDataType, instanceValue);
			case UmlPackage.VISIBILITY_KIND:
				return convertVisibilityKindToString(eDataType, instanceValue);
			case UmlPackage.AGGREGATION_KIND_OBJECT:
				return convertAggregationKindObjectToString(eDataType, instanceValue);
			case UmlPackage.CALL_CONCURRENCY_KIND_OBJECT:
				return convertCallConcurrencyKindObjectToString(eDataType, instanceValue);
			case UmlPackage.CONNECTOR_KIND_OBJECT:
				return convertConnectorKindObjectToString(eDataType, instanceValue);
			case UmlPackage.EXPANSION_KIND_OBJECT:
				return convertExpansionKindObjectToString(eDataType, instanceValue);
			case UmlPackage.INTERACTION_OPERATOR_OBJECT:
				return convertInteractionOperatorObjectToString(eDataType, instanceValue);
			case UmlPackage.MESSAGE_KIND_OBJECT:
				return convertMessageKindObjectToString(eDataType, instanceValue);
			case UmlPackage.MESSAGE_SORT_OBJECT:
				return convertMessageSortObjectToString(eDataType, instanceValue);
			case UmlPackage.OBJECT_NODE_ORDERING_KIND_OBJECT:
				return convertObjectNodeOrderingKindObjectToString(eDataType, instanceValue);
			case UmlPackage.PARAMETER_DIRECTION_KIND_OBJECT:
				return convertParameterDirectionKindObjectToString(eDataType, instanceValue);
			case UmlPackage.PARAMETER_EFFECT_KIND_OBJECT:
				return convertParameterEffectKindObjectToString(eDataType, instanceValue);
			case UmlPackage.PSEUDOSTATE_KIND_OBJECT:
				return convertPseudostateKindObjectToString(eDataType, instanceValue);
			case UmlPackage.TRANSITION_KIND_OBJECT:
				return convertTransitionKindObjectToString(eDataType, instanceValue);
			case UmlPackage.VISIBILITY_KIND_OBJECT:
				return convertVisibilityKindObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abstraction createAbstraction()
	{
		AbstractionImpl abstraction = new AbstractionImpl();
		return abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptCallAction createAcceptCallAction()
	{
		AcceptCallActionImpl acceptCallAction = new AcceptCallActionImpl();
		return acceptCallAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventAction createAcceptEventAction()
	{
		AcceptEventActionImpl acceptEventAction = new AcceptEventActionImpl();
		return acceptEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction()
	{
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity()
	{
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge createActivityEdge()
	{
		ActivityEdgeImpl activityEdge = new ActivityEdgeImpl();
		return activityEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFinalNode createActivityFinalNode()
	{
		ActivityFinalNodeImpl activityFinalNode = new ActivityFinalNodeImpl();
		return activityFinalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup createActivityGroup()
	{
		ActivityGroupImpl activityGroup = new ActivityGroupImpl();
		return activityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode createActivityNode()
	{
		ActivityNodeImpl activityNode = new ActivityNodeImpl();
		return activityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityParameterNode createActivityParameterNode()
	{
		ActivityParameterNodeImpl activityParameterNode = new ActivityParameterNodeImpl();
		return activityParameterNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition createActivityPartition()
	{
		ActivityPartitionImpl activityPartition = new ActivityPartitionImpl();
		return activityPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor()
	{
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddStructuralFeatureValueAction createAddStructuralFeatureValueAction()
	{
		AddStructuralFeatureValueActionImpl addStructuralFeatureValueAction = new AddStructuralFeatureValueActionImpl();
		return addStructuralFeatureValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddVariableValueAction createAddVariableValueAction()
	{
		AddVariableValueActionImpl addVariableValueAction = new AddVariableValueActionImpl();
		return addVariableValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyTrigger createAnyTrigger()
	{
		AnyTriggerImpl anyTrigger = new AnyTriggerImpl();
		return anyTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplyFunctionAction createApplyFunctionAction()
	{
		ApplyFunctionActionImpl applyFunctionAction = new ApplyFunctionActionImpl();
		return applyFunctionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createArtifact()
	{
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation()
	{
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationClass createAssociationClass()
	{
		AssociationClassImpl associationClass = new AssociationClassImpl();
		return associationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createBehavior()
	{
		BehaviorImpl behavior = new BehaviorImpl();
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeature createBehavioralFeature()
	{
		BehavioralFeatureImpl behavioralFeature = new BehavioralFeatureImpl();
		return behavioralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier createBehavioredClassifier()
	{
		BehavioredClassifierImpl behavioredClassifier = new BehavioredClassifierImpl();
		return behavioredClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BroadcastSignalAction createBroadcastSignalAction()
	{
		BroadcastSignalActionImpl broadcastSignalAction = new BroadcastSignalActionImpl();
		return broadcastSignalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallAction createCallAction()
	{
		CallActionImpl callAction = new CallActionImpl();
		return callAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallBehaviorAction createCallBehaviorAction()
	{
		CallBehaviorActionImpl callBehaviorAction = new CallBehaviorActionImpl();
		return callBehaviorAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOperationAction createCallOperationAction()
	{
		CallOperationActionImpl callOperationAction = new CallOperationActionImpl();
		return callOperationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallTrigger createCallTrigger()
	{
		CallTriggerImpl callTrigger = new CallTriggerImpl();
		return callTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentralBufferNode createCentralBufferNode()
	{
		CentralBufferNodeImpl centralBufferNode = new CentralBufferNodeImpl();
		return centralBufferNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeTrigger createChangeTrigger()
	{
		ChangeTriggerImpl changeTrigger = new ChangeTriggerImpl();
		return changeTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2._1._0._0.uml.Class createClass()
	{
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier createClassifier()
	{
		ClassifierImpl classifier = new ClassifierImpl();
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierTemplateParameter createClassifierTemplateParameter()
	{
		ClassifierTemplateParameterImpl classifierTemplateParameter = new ClassifierTemplateParameterImpl();
		return classifierTemplateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clause createClause()
	{
		ClauseImpl clause = new ClauseImpl();
		return clause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearAssociationAction createClearAssociationAction()
	{
		ClearAssociationActionImpl clearAssociationAction = new ClearAssociationActionImpl();
		return clearAssociationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearStructuralFeatureAction createClearStructuralFeatureAction()
	{
		ClearStructuralFeatureActionImpl clearStructuralFeatureAction = new ClearStructuralFeatureActionImpl();
		return clearStructuralFeatureAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearVariableAction createClearVariableAction()
	{
		ClearVariableActionImpl clearVariableAction = new ClearVariableActionImpl();
		return clearVariableAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration createCollaboration()
	{
		CollaborationImpl collaboration = new CollaborationImpl();
		return collaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationOccurrence createCollaborationOccurrence()
	{
		CollaborationOccurrenceImpl collaborationOccurrence = new CollaborationOccurrenceImpl();
		return collaborationOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedFragment createCombinedFragment()
	{
		CombinedFragmentImpl combinedFragment = new CombinedFragmentImpl();
		return combinedFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment()
	{
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPath createCommunicationPath()
	{
		CommunicationPathImpl communicationPath = new CommunicationPathImpl();
		return communicationPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent()
	{
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalNode createConditionalNode()
	{
		ConditionalNodeImpl conditionalNode = new ConditionalNodeImpl();
		return conditionalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement createConnectableElement()
	{
		ConnectableElementImpl connectableElement = new ConnectableElementImpl();
		return connectableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElementTemplateParameter createConnectableElementTemplateParameter()
	{
		ConnectableElementTemplateParameterImpl connectableElementTemplateParameter = new ConnectableElementTemplateParameterImpl();
		return connectableElementTemplateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointReference createConnectionPointReference()
	{
		ConnectionPointReferenceImpl connectionPointReference = new ConnectionPointReferenceImpl();
		return connectionPointReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector()
	{
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEnd createConnectorEnd()
	{
		ConnectorEndImpl connectorEnd = new ConnectorEndImpl();
		return connectorEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint()
	{
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Continuation createContinuation()
	{
		ContinuationImpl continuation = new ContinuationImpl();
		return continuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow createControlFlow()
	{
		ControlFlowImpl controlFlow = new ControlFlowImpl();
		return controlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlNode createControlNode()
	{
		ControlNodeImpl controlNode = new ControlNodeImpl();
		return controlNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateLinkAction createCreateLinkAction()
	{
		CreateLinkActionImpl createLinkAction = new CreateLinkActionImpl();
		return createLinkAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateLinkObjectAction createCreateLinkObjectAction()
	{
		CreateLinkObjectActionImpl createLinkObjectAction = new CreateLinkObjectActionImpl();
		return createLinkObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateObjectAction createCreateObjectAction()
	{
		CreateObjectActionImpl createObjectAction = new CreateObjectActionImpl();
		return createObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStoreNode createDataStoreNode()
	{
		DataStoreNodeImpl dataStoreNode = new DataStoreNodeImpl();
		return dataStoreNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType()
	{
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNode createDecisionNode()
	{
		DecisionNodeImpl decisionNode = new DecisionNodeImpl();
		return decisionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency()
	{
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedArtifact createDeployedArtifact()
	{
		DeployedArtifactImpl deployedArtifact = new DeployedArtifactImpl();
		return deployedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment createDeployment()
	{
		DeploymentImpl deployment = new DeploymentImpl();
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSpecification createDeploymentSpecification()
	{
		DeploymentSpecificationImpl deploymentSpecification = new DeploymentSpecificationImpl();
		return deploymentSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentTarget createDeploymentTarget()
	{
		DeploymentTargetImpl deploymentTarget = new DeploymentTargetImpl();
		return deploymentTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestroyLinkAction createDestroyLinkAction()
	{
		DestroyLinkActionImpl destroyLinkAction = new DestroyLinkActionImpl();
		return destroyLinkAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestroyObjectAction createDestroyObjectAction()
	{
		DestroyObjectActionImpl destroyObjectAction = new DestroyObjectActionImpl();
		return destroyObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice()
	{
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedRelationship createDirectedRelationship()
	{
		DirectedRelationshipImpl directedRelationship = new DirectedRelationshipImpl();
		return directedRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot()
	{
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDuration()
	{
		DurationImpl duration = new DurationImpl();
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationConstraint createDurationConstraint()
	{
		DurationConstraintImpl durationConstraint = new DurationConstraintImpl();
		return durationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationInterval createDurationInterval()
	{
		DurationIntervalImpl durationInterval = new DurationIntervalImpl();
		return durationInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationObservationAction createDurationObservationAction()
	{
		DurationObservationActionImpl durationObservationAction = new DurationObservationActionImpl();
		return durationObservationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement()
	{
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImport createElementImport()
	{
		ElementImportImpl elementImport = new ElementImportImpl();
		return elementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncapsulatedClassifier createEncapsulatedClassifier()
	{
		EncapsulatedClassifierImpl encapsulatedClassifier = new EncapsulatedClassifierImpl();
		return encapsulatedClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration()
	{
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral createEnumerationLiteral()
	{
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventOccurrence createEventOccurrence()
	{
		EventOccurrenceImpl eventOccurrence = new EventOccurrenceImpl();
		return eventOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionHandler createExceptionHandler()
	{
		ExceptionHandlerImpl exceptionHandler = new ExceptionHandlerImpl();
		return exceptionHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode createExecutableNode()
	{
		ExecutableNodeImpl executableNode = new ExecutableNodeImpl();
		return executableNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnvironment createExecutionEnvironment()
	{
		ExecutionEnvironmentImpl executionEnvironment = new ExecutionEnvironmentImpl();
		return executionEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionOccurrence createExecutionOccurrence()
	{
		ExecutionOccurrenceImpl executionOccurrence = new ExecutionOccurrenceImpl();
		return executionOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionNode createExpansionNode()
	{
		ExpansionNodeImpl expansionNode = new ExpansionNodeImpl();
		return expansionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionRegion createExpansionRegion()
	{
		ExpansionRegionImpl expansionRegion = new ExpansionRegionImpl();
		return expansionRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression()
	{
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extend createExtend()
	{
		ExtendImpl extend = new ExtendImpl();
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension()
	{
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionEnd createExtensionEnd()
	{
		ExtensionEndImpl extensionEnd = new ExtensionEndImpl();
		return extensionEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPoint createExtensionPoint()
	{
		ExtensionPointImpl extensionPoint = new ExtensionPointImpl();
		return extensionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature()
	{
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalNode createFinalNode()
	{
		FinalNodeImpl finalNode = new FinalNodeImpl();
		return finalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState createFinalState()
	{
		FinalStateImpl finalState = new FinalStateImpl();
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowFinalNode createFlowFinalNode()
	{
		FlowFinalNodeImpl flowFinalNode = new FlowFinalNodeImpl();
		return flowFinalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNode createForkNode()
	{
		ForkNodeImpl forkNode = new ForkNodeImpl();
		return forkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate createGate()
	{
		GateImpl gate = new GateImpl();
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization()
	{
		GeneralizationImpl generalization = new GeneralizationImpl();
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSet createGeneralizationSet()
	{
		GeneralizationSetImpl generalizationSet = new GeneralizationSetImpl();
		return generalizationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralOrdering createGeneralOrdering()
	{
		GeneralOrderingImpl generalOrdering = new GeneralOrderingImpl();
		return generalOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation createImplementation()
	{
		ImplementationImpl implementation = new ImplementationImpl();
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include createInclude()
	{
		IncludeImpl include = new IncludeImpl();
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationFlow createInformationFlow()
	{
		InformationFlowImpl informationFlow = new InformationFlowImpl();
		return informationFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationItem createInformationItem()
	{
		InformationItemImpl informationItem = new InformationItemImpl();
		return informationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNode createInitialNode()
	{
		InitialNodeImpl initialNode = new InitialNodeImpl();
		return initialNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createInputPin()
	{
		InputPinImpl inputPin = new InputPinImpl();
		return inputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification createInstanceSpecification()
	{
		InstanceSpecificationImpl instanceSpecification = new InstanceSpecificationImpl();
		return instanceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceValue createInstanceValue()
	{
		InstanceValueImpl instanceValue = new InstanceValueImpl();
		return instanceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction createInteraction()
	{
		InteractionImpl interaction = new InteractionImpl();
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionConstraint createInteractionConstraint()
	{
		InteractionConstraintImpl interactionConstraint = new InteractionConstraintImpl();
		return interactionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFragment createInteractionFragment()
	{
		InteractionFragmentImpl interactionFragment = new InteractionFragmentImpl();
		return interactionFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOccurrence createInteractionOccurrence()
	{
		InteractionOccurrenceImpl interactionOccurrence = new InteractionOccurrenceImpl();
		return interactionOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand createInteractionOperand()
	{
		InteractionOperandImpl interactionOperand = new InteractionOperandImpl();
		return interactionOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface()
	{
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion createInterruptibleActivityRegion()
	{
		InterruptibleActivityRegionImpl interruptibleActivityRegion = new InterruptibleActivityRegionImpl();
		return interruptibleActivityRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval createInterval()
	{
		IntervalImpl interval = new IntervalImpl();
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalConstraint createIntervalConstraint()
	{
		IntervalConstraintImpl intervalConstraint = new IntervalConstraintImpl();
		return intervalConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationAction createInvocationAction()
	{
		InvocationActionImpl invocationAction = new InvocationActionImpl();
		return invocationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNode createJoinNode()
	{
		JoinNodeImpl joinNode = new JoinNodeImpl();
		return joinNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline createLifeline()
	{
		LifelineImpl lifeline = new LifelineImpl();
		return lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkAction createLinkAction()
	{
		LinkActionImpl linkAction = new LinkActionImpl();
		return linkAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndCreationData createLinkEndCreationData()
	{
		LinkEndCreationDataImpl linkEndCreationData = new LinkEndCreationDataImpl();
		return linkEndCreationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndData createLinkEndData()
	{
		LinkEndDataImpl linkEndData = new LinkEndDataImpl();
		return linkEndData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralBoolean createLiteralBoolean()
	{
		LiteralBooleanImpl literalBoolean = new LiteralBooleanImpl();
		return literalBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralInteger createLiteralInteger()
	{
		LiteralIntegerImpl literalInteger = new LiteralIntegerImpl();
		return literalInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNull createLiteralNull()
	{
		LiteralNullImpl literalNull = new LiteralNullImpl();
		return literalNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralSpecification createLiteralSpecification()
	{
		LiteralSpecificationImpl literalSpecification = new LiteralSpecificationImpl();
		return literalSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralString createLiteralString()
	{
		LiteralStringImpl literalString = new LiteralStringImpl();
		return literalString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralUnlimitedNatural createLiteralUnlimitedNatural()
	{
		LiteralUnlimitedNaturalImpl literalUnlimitedNatural = new LiteralUnlimitedNaturalImpl();
		return literalUnlimitedNatural;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopNode createLoopNode()
	{
		LoopNodeImpl loopNode = new LoopNodeImpl();
		return loopNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manifestation createManifestation()
	{
		ManifestationImpl manifestation = new ManifestationImpl();
		return manifestation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNode createMergeNode()
	{
		MergeNodeImpl mergeNode = new MergeNodeImpl();
		return mergeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage()
	{
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEnd createMessageEnd()
	{
		MessageEndImpl messageEnd = new MessageEndImpl();
		return messageEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTrigger createMessageTrigger()
	{
		MessageTriggerImpl messageTrigger = new MessageTriggerImpl();
		return messageTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel()
	{
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityElement createMultiplicityElement()
	{
		MultiplicityElementImpl multiplicityElement = new MultiplicityElementImpl();
		return multiplicityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement()
	{
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace createNamespace()
	{
		NamespaceImpl namespace = new NamespaceImpl();
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode()
	{
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFlow createObjectFlow()
	{
		ObjectFlowImpl objectFlow = new ObjectFlowImpl();
		return objectFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNode createObjectNode()
	{
		ObjectNodeImpl objectNode = new ObjectNodeImpl();
		return objectNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueExpression createOpaqueExpression()
	{
		OpaqueExpressionImpl opaqueExpression = new OpaqueExpressionImpl();
		return opaqueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation()
	{
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationTemplateParameter createOperationTemplateParameter()
	{
		OperationTemplateParameterImpl operationTemplateParameter = new OperationTemplateParameterImpl();
		return operationTemplateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin createOutputPin()
	{
		OutputPinImpl outputPin = new OutputPinImpl();
		return outputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2._1._0._0.uml.Package createPackage()
	{
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement createPackageableElement()
	{
		PackageableElementImpl packageableElement = new PackageableElementImpl();
		return packageableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport createPackageImport()
	{
		PackageImportImpl packageImport = new PackageImportImpl();
		return packageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageMerge createPackageMerge()
	{
		PackageMergeImpl packageMerge = new PackageMergeImpl();
		return packageMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter()
	{
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableClassifier createParameterableClassifier()
	{
		ParameterableClassifierImpl parameterableClassifier = new ParameterableClassifierImpl();
		return parameterableClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement createParameterableElement()
	{
		ParameterableElementImpl parameterableElement = new ParameterableElementImpl();
		return parameterableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSet createParameterSet()
	{
		ParameterSetImpl parameterSet = new ParameterSetImpl();
		return parameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartDecomposition createPartDecomposition()
	{
		PartDecompositionImpl partDecomposition = new PartDecompositionImpl();
		return partDecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permission createPermission()
	{
		PermissionImpl permission = new PermissionImpl();
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin createPin()
	{
		PinImpl pin = new PinImpl();
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort()
	{
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveFunction createPrimitiveFunction()
	{
		PrimitiveFunctionImpl primitiveFunction = new PrimitiveFunctionImpl();
		return primitiveFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType()
	{
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile createProfile()
	{
		ProfileImpl profile = new ProfileImpl();
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileApplication createProfileApplication()
	{
		ProfileApplicationImpl profileApplication = new ProfileApplicationImpl();
		return profileApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty()
	{
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolConformance createProtocolConformance()
	{
		ProtocolConformanceImpl protocolConformance = new ProtocolConformanceImpl();
		return protocolConformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine createProtocolStateMachine()
	{
		ProtocolStateMachineImpl protocolStateMachine = new ProtocolStateMachineImpl();
		return protocolStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolTransition createProtocolTransition()
	{
		ProtocolTransitionImpl protocolTransition = new ProtocolTransitionImpl();
		return protocolTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate createPseudostate()
	{
		PseudostateImpl pseudostate = new PseudostateImpl();
		return pseudostate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierValue createQualifierValue()
	{
		QualifierValueImpl qualifierValue = new QualifierValueImpl();
		return qualifierValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RaiseExceptionAction createRaiseExceptionAction()
	{
		RaiseExceptionActionImpl raiseExceptionAction = new RaiseExceptionActionImpl();
		return raiseExceptionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadExtentAction createReadExtentAction()
	{
		ReadExtentActionImpl readExtentAction = new ReadExtentActionImpl();
		return readExtentAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadIsClassifiedObjectAction createReadIsClassifiedObjectAction()
	{
		ReadIsClassifiedObjectActionImpl readIsClassifiedObjectAction = new ReadIsClassifiedObjectActionImpl();
		return readIsClassifiedObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLinkAction createReadLinkAction()
	{
		ReadLinkActionImpl readLinkAction = new ReadLinkActionImpl();
		return readLinkAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLinkObjectEndAction createReadLinkObjectEndAction()
	{
		ReadLinkObjectEndActionImpl readLinkObjectEndAction = new ReadLinkObjectEndActionImpl();
		return readLinkObjectEndAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLinkObjectEndQualifierAction createReadLinkObjectEndQualifierAction()
	{
		ReadLinkObjectEndQualifierActionImpl readLinkObjectEndQualifierAction = new ReadLinkObjectEndQualifierActionImpl();
		return readLinkObjectEndQualifierAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadSelfAction createReadSelfAction()
	{
		ReadSelfActionImpl readSelfAction = new ReadSelfActionImpl();
		return readSelfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadStructuralFeatureAction createReadStructuralFeatureAction()
	{
		ReadStructuralFeatureActionImpl readStructuralFeatureAction = new ReadStructuralFeatureActionImpl();
		return readStructuralFeatureAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadVariableAction createReadVariableAction()
	{
		ReadVariableActionImpl readVariableAction = new ReadVariableActionImpl();
		return readVariableAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realization createRealization()
	{
		RealizationImpl realization = new RealizationImpl();
		return realization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception createReception()
	{
		ReceptionImpl reception = new ReceptionImpl();
		return reception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReclassifyObjectAction createReclassifyObjectAction()
	{
		ReclassifyObjectActionImpl reclassifyObjectAction = new ReclassifyObjectActionImpl();
		return reclassifyObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableElement createRedefinableElement()
	{
		RedefinableElementImpl redefinableElement = new RedefinableElementImpl();
		return redefinableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableTemplateSignature createRedefinableTemplateSignature()
	{
		RedefinableTemplateSignatureImpl redefinableTemplateSignature = new RedefinableTemplateSignatureImpl();
		return redefinableTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion()
	{
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship()
	{
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveStructuralFeatureValueAction createRemoveStructuralFeatureValueAction()
	{
		RemoveStructuralFeatureValueActionImpl removeStructuralFeatureValueAction = new RemoveStructuralFeatureValueActionImpl();
		return removeStructuralFeatureValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveVariableValueAction createRemoveVariableValueAction()
	{
		RemoveVariableValueActionImpl removeVariableValueAction = new RemoveVariableValueActionImpl();
		return removeVariableValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplyAction createReplyAction()
	{
		ReplyActionImpl replyAction = new ReplyActionImpl();
		return replyAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendObjectAction createSendObjectAction()
	{
		SendObjectActionImpl sendObjectAction = new SendObjectActionImpl();
		return sendObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendSignalAction createSendSignalAction()
	{
		SendSignalActionImpl sendSignalAction = new SendSignalActionImpl();
		return sendSignalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal createSignal()
	{
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalTrigger createSignalTrigger()
	{
		SignalTriggerImpl signalTrigger = new SignalTriggerImpl();
		return signalTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot createSlot()
	{
		SlotImpl slot = new SlotImpl();
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartOwnedBehaviorAction createStartOwnedBehaviorAction()
	{
		StartOwnedBehaviorActionImpl startOwnedBehaviorAction = new StartOwnedBehaviorActionImpl();
		return startOwnedBehaviorAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState()
	{
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateInvariant createStateInvariant()
	{
		StateInvariantImpl stateInvariant = new StateInvariantImpl();
		return stateInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createStateMachine()
	{
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype createStereotype()
	{
		StereotypeImpl stereotype = new StereotypeImpl();
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stop createStop()
	{
		StopImpl stop = new StopImpl();
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression createStringExpression()
	{
		StringExpressionImpl stringExpression = new StringExpressionImpl();
		return stringExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeature createStructuralFeature()
	{
		StructuralFeatureImpl structuralFeature = new StructuralFeatureImpl();
		return structuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeatureAction createStructuralFeatureAction()
	{
		StructuralFeatureActionImpl structuralFeatureAction = new StructuralFeatureActionImpl();
		return structuralFeatureAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode createStructuredActivityNode()
	{
		StructuredActivityNodeImpl structuredActivityNode = new StructuredActivityNodeImpl();
		return structuredActivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredClassifier createStructuredClassifier()
	{
		StructuredClassifierImpl structuredClassifier = new StructuredClassifierImpl();
		return structuredClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substitution createSubstitution()
	{
		SubstitutionImpl substitution = new SubstitutionImpl();
		return substitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateableClassifier createTemplateableClassifier()
	{
		TemplateableClassifierImpl templateableClassifier = new TemplateableClassifierImpl();
		return templateableClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateableElement createTemplateableElement()
	{
		TemplateableElementImpl templateableElement = new TemplateableElementImpl();
		return templateableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding createTemplateBinding()
	{
		TemplateBindingImpl templateBinding = new TemplateBindingImpl();
		return templateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter createTemplateParameter()
	{
		TemplateParameterImpl templateParameter = new TemplateParameterImpl();
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameterSubstitution createTemplateParameterSubstitution()
	{
		TemplateParameterSubstitutionImpl templateParameterSubstitution = new TemplateParameterSubstitutionImpl();
		return templateParameterSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature createTemplateSignature()
	{
		TemplateSignatureImpl templateSignature = new TemplateSignatureImpl();
		return templateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestIdentityAction createTestIdentityAction()
	{
		TestIdentityActionImpl testIdentityAction = new TestIdentityActionImpl();
		return testIdentityAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeConstraint createTimeConstraint()
	{
		TimeConstraintImpl timeConstraint = new TimeConstraintImpl();
		return timeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeExpression createTimeExpression()
	{
		TimeExpressionImpl timeExpression = new TimeExpressionImpl();
		return timeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval createTimeInterval()
	{
		TimeIntervalImpl timeInterval = new TimeIntervalImpl();
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeObservationAction createTimeObservationAction()
	{
		TimeObservationActionImpl timeObservationAction = new TimeObservationActionImpl();
		return timeObservationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeTrigger createTimeTrigger()
	{
		TimeTriggerImpl timeTrigger = new TimeTriggerImpl();
		return timeTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition()
	{
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger()
	{
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType()
	{
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedElement createTypedElement()
	{
		TypedElementImpl typedElement = new TypedElementImpl();
		return typedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usage createUsage()
	{
		UsageImpl usage = new UsageImpl();
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase createUseCase()
	{
		UseCaseImpl useCase = new UseCaseImpl();
		return useCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePin createValuePin()
	{
		ValuePinImpl valuePin = new ValuePinImpl();
		return valuePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createValueSpecification()
	{
		ValueSpecificationImpl valueSpecification = new ValueSpecificationImpl();
		return valueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable()
	{
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAction createVariableAction()
	{
		VariableActionImpl variableAction = new VariableActionImpl();
		return variableAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex createVertex()
	{
		VertexImpl vertex = new VertexImpl();
		return vertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteLinkAction createWriteLinkAction()
	{
		WriteLinkActionImpl writeLinkAction = new WriteLinkActionImpl();
		return writeLinkAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteStructuralFeatureAction createWriteStructuralFeatureAction()
	{
		WriteStructuralFeatureActionImpl writeStructuralFeatureAction = new WriteStructuralFeatureActionImpl();
		return writeStructuralFeatureAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteVariableAction createWriteVariableAction()
	{
		WriteVariableActionImpl writeVariableAction = new WriteVariableActionImpl();
		return writeVariableAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnedAttribute createOwnedAttribute()
	{
		OwnedAttributeImpl ownedAttribute = new OwnedAttributeImpl();
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnedOperation createOwnedOperation()
	{
		OwnedOperationImpl ownedOperation = new OwnedOperationImpl();
		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnedEnd createOwnedEnd()
	{
		OwnedEndImpl ownedEnd = new OwnedEndImpl();
		return ownedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnedParameter createOwnedParameter()
	{
		OwnedParameterImpl ownedParameter = new OwnedParameterImpl();
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagedElement createPackagedElement()
	{
		PackagedElementImpl packagedElement = new PackagedElementImpl();
		return packagedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Referenced createReferenced()
	{
		ReferencedImpl referenced = new ReferencedImpl();
		return referenced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification createSpecification()
	{
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnedRule createOwnedRule()
	{
		OwnedRuleImpl ownedRule = new OwnedRuleImpl();
		return ownedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue()
	{
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationElement createAssociationElement()
	{
		AssociationElementImpl associationElement = new AssociationElementImpl();
		return associationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JType createJType()
	{
		JTypeImpl jType = new JTypeImpl();
		return jType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationKind createAggregationKindFromString(EDataType eDataType, String initialValue)
	{
		AggregationKind result = AggregationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallConcurrencyKind createCallConcurrencyKindFromString(EDataType eDataType, String initialValue)
	{
		CallConcurrencyKind result = CallConcurrencyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCallConcurrencyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorKind createConnectorKindFromString(EDataType eDataType, String initialValue)
	{
		ConnectorKind result = ConnectorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectorKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionKind createExpansionKindFromString(EDataType eDataType, String initialValue)
	{
		ExpansionKind result = ExpansionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpansionKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperator createInteractionOperatorFromString(EDataType eDataType, String initialValue)
	{
		InteractionOperator result = InteractionOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInteractionOperatorToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageKind createMessageKindFromString(EDataType eDataType, String initialValue)
	{
		MessageKind result = MessageKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSort createMessageSortFromString(EDataType eDataType, String initialValue)
	{
		MessageSort result = MessageSort.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSortToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNodeOrderingKind createObjectNodeOrderingKindFromString(EDataType eDataType, String initialValue)
	{
		ObjectNodeOrderingKind result = ObjectNodeOrderingKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectNodeOrderingKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirectionKind createParameterDirectionKindFromString(EDataType eDataType, String initialValue)
	{
		ParameterDirectionKind result = ParameterDirectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterDirectionKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterEffectKind createParameterEffectKindFromString(EDataType eDataType, String initialValue)
	{
		ParameterEffectKind result = ParameterEffectKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterEffectKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PseudostateKind createPseudostateKindFromString(EDataType eDataType, String initialValue)
	{
		PseudostateKind result = PseudostateKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPseudostateKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionKind createTransitionKindFromString(EDataType eDataType, String initialValue)
	{
		TransitionKind result = TransitionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransitionKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind createVisibilityKindFromString(EDataType eDataType, String initialValue)
	{
		VisibilityKind result = VisibilityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationKind createAggregationKindObjectFromString(EDataType eDataType, String initialValue)
	{
		return createAggregationKindFromString(UmlPackage.eINSTANCE.getAggregationKind(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationKindObjectToString(EDataType eDataType, Object instanceValue)
	{
		return convertAggregationKindToString(UmlPackage.eINSTANCE.getAggregationKind(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallConcurrencyKind createCallConcurrencyKindObjectFromString(EDataType eDataType, String initialValue)
	{
		return createCallConcurrencyKindFromString(UmlPackage.eINSTANCE.getCallConcurrencyKind(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCallConcurrencyKindObjectToString(EDataType eDataType, Object instanceValue)
	{
		return convertCallConcurrencyKindToString(UmlPackage.eINSTANCE.getCallConcurrencyKind(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorKind createConnectorKindObjectFromString(EDataType eDataType, String initialValue)
	{
		return createConnectorKindFromString(UmlPackage.eINSTANCE.getConnectorKind(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectorKindObjectToString(EDataType eDataType, Object instanceValue)
	{
		return convertConnectorKindToString(UmlPackage.eINSTANCE.getConnectorKind(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionKind createExpansionKindObjectFromString(EDataType eDataType, String initialValue)
	{
		return createExpansionKindFromString(UmlPackage.eINSTANCE.getExpansionKind(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpansionKindObjectToString(EDataType eDataType, Object instanceValue)
	{
		return convertExpansionKindToString(UmlPackage.eINSTANCE.getExpansionKind(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperator createInteractionOperatorObjectFromString(EDataType eDataType, String initialValue)
	{
		return createInteractionOperatorFromString(UmlPackage.eINSTANCE.getInteractionOperator(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInteractionOperatorObjectToString(EDataType eDataType, Object instanceValue)
	{
		return convertInteractionOperatorToString(UmlPackage.eINSTANCE.getInteractionOperator(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageKind createMessageKindObjectFromString(EDataType eDataType, String initialValue)
	{
		return createMessageKindFromString(UmlPackage.eINSTANCE.getMessageKind(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageKindObjectToString(EDataType eDataType, Object instanceValue)
	{
		return convertMessageKindToString(UmlPackage.eINSTANCE.getMessageKind(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSort createMessageSortObjectFromString(EDataType eDataType, String initialValue)
	{
		return createMessageSortFromString(UmlPackage.eINSTANCE.getMessageSort(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSortObjectToString(EDataType eDataType, Object instanceValue)
	{
		return convertMessageSortToString(UmlPackage.eINSTANCE.getMessageSort(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNodeOrderingKind createObjectNodeOrderingKindObjectFromString(EDataType eDataType, String initialValue)
	{
		return createObjectNodeOrderingKindFromString(UmlPackage.eINSTANCE.getObjectNodeOrderingKind(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectNodeOrderingKindObjectToString(EDataType eDataType, Object instanceValue)
	{
		return convertObjectNodeOrderingKindToString(UmlPackage.eINSTANCE.getObjectNodeOrderingKind(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirectionKind createParameterDirectionKindObjectFromString(EDataType eDataType, String initialValue)
	{
		return createParameterDirectionKindFromString(UmlPackage.eINSTANCE.getParameterDirectionKind(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterDirectionKindObjectToString(EDataType eDataType, Object instanceValue)
	{
		return convertParameterDirectionKindToString(UmlPackage.eINSTANCE.getParameterDirectionKind(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterEffectKind createParameterEffectKindObjectFromString(EDataType eDataType, String initialValue)
	{
		return createParameterEffectKindFromString(UmlPackage.eINSTANCE.getParameterEffectKind(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterEffectKindObjectToString(EDataType eDataType, Object instanceValue)
	{
		return convertParameterEffectKindToString(UmlPackage.eINSTANCE.getParameterEffectKind(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PseudostateKind createPseudostateKindObjectFromString(EDataType eDataType, String initialValue)
	{
		return createPseudostateKindFromString(UmlPackage.eINSTANCE.getPseudostateKind(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPseudostateKindObjectToString(EDataType eDataType, Object instanceValue)
	{
		return convertPseudostateKindToString(UmlPackage.eINSTANCE.getPseudostateKind(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionKind createTransitionKindObjectFromString(EDataType eDataType, String initialValue)
	{
		return createTransitionKindFromString(UmlPackage.eINSTANCE.getTransitionKind(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransitionKindObjectToString(EDataType eDataType, Object instanceValue)
	{
		return convertTransitionKindToString(UmlPackage.eINSTANCE.getTransitionKind(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind createVisibilityKindObjectFromString(EDataType eDataType, String initialValue)
	{
		return createVisibilityKindFromString(UmlPackage.eINSTANCE.getVisibilityKind(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityKindObjectToString(EDataType eDataType, Object instanceValue)
	{
		return convertVisibilityKindToString(UmlPackage.eINSTANCE.getVisibilityKind(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlPackage getUmlPackage()
	{
		return (UmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UmlPackage getPackage()
	{
		return UmlPackage.eINSTANCE;
	}

} //UmlFactoryImpl
