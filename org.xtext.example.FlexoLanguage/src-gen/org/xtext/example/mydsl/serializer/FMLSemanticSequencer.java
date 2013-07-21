package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.fML.AddEMFObjectIndividual;
import org.xtext.example.mydsl.fML.DeclarePatternRole;
import org.xtext.example.mydsl.fML.DeleteAction;
import org.xtext.example.mydsl.fML.EditionPattern;
import org.xtext.example.mydsl.fML.EditionScheme;
import org.xtext.example.mydsl.fML.FMLPackage;
import org.xtext.example.mydsl.fML.ModelSlot;
import org.xtext.example.mydsl.fML.Parameter;
import org.xtext.example.mydsl.fML.PatternRole;
import org.xtext.example.mydsl.fML.ViewDef;
import org.xtext.example.mydsl.fML.VirtualModel;
import org.xtext.example.mydsl.services.FMLGrammarAccess;

@SuppressWarnings("all")
public class FMLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FMLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == FMLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FMLPackage.ADD_EMF_OBJECT_INDIVIDUAL:
				if(context == grammarAccess.getAddEMFObjectIndividualRule() ||
				   context == grammarAccess.getBuiltInActionRule() ||
				   context == grammarAccess.getEditionActionRule()) {
					sequence_AddEMFObjectIndividual(context, (AddEMFObjectIndividual) semanticObject); 
					return; 
				}
				else break;
			case FMLPackage.DECLARE_PATTERN_ROLE:
				if(context == grammarAccess.getBuiltInActionRule() ||
				   context == grammarAccess.getDeclarePatternRoleRule() ||
				   context == grammarAccess.getEditionActionRule()) {
					sequence_DeclarePatternRole(context, (DeclarePatternRole) semanticObject); 
					return; 
				}
				else break;
			case FMLPackage.DELETE_ACTION:
				if(context == grammarAccess.getBuiltInActionRule() ||
				   context == grammarAccess.getDeleteActionRule() ||
				   context == grammarAccess.getEditionActionRule()) {
					sequence_DeleteAction(context, (DeleteAction) semanticObject); 
					return; 
				}
				else break;
			case FMLPackage.EDITION_PATTERN:
				if(context == grammarAccess.getEditionPatternRule()) {
					sequence_EditionPattern(context, (EditionPattern) semanticObject); 
					return; 
				}
				else break;
			case FMLPackage.EDITION_SCHEME:
				if(context == grammarAccess.getEditionSchemeRule()) {
					sequence_EditionScheme(context, (EditionScheme) semanticObject); 
					return; 
				}
				else break;
			case FMLPackage.MODEL_SLOT:
				if(context == grammarAccess.getModelSlotRule()) {
					sequence_ModelSlot(context, (ModelSlot) semanticObject); 
					return; 
				}
				else break;
			case FMLPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case FMLPackage.PATTERN_ROLE:
				if(context == grammarAccess.getPatternRoleRule()) {
					sequence_PatternRole(context, (PatternRole) semanticObject); 
					return; 
				}
				else break;
			case FMLPackage.VIEW_DEF:
				if(context == grammarAccess.getViewDefRule()) {
					sequence_ViewDef(context, (ViewDef) semanticObject); 
					return; 
				}
				else break;
			case FMLPackage.VIRTUAL_MODEL:
				if(context == grammarAccess.getVirtualModelRule()) {
					sequence_VirtualModel(context, (VirtualModel) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (editionPattern=[EditionPattern|ID] modelSlot=[ModelSlot|ID])
	 */
	protected void sequence_AddEMFObjectIndividual(EObject context, AddEMFObjectIndividual semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FMLPackage.Literals.ADD_EMF_OBJECT_INDIVIDUAL__EDITION_PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FMLPackage.Literals.ADD_EMF_OBJECT_INDIVIDUAL__EDITION_PATTERN));
			if(transientValues.isValueTransient(semanticObject, FMLPackage.Literals.ADD_EMF_OBJECT_INDIVIDUAL__MODEL_SLOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FMLPackage.Literals.ADD_EMF_OBJECT_INDIVIDUAL__MODEL_SLOT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAddEMFObjectIndividualAccess().getEditionPatternEditionPatternIDTerminalRuleCall_2_0_1(), semanticObject.getEditionPattern());
		feeder.accept(grammarAccess.getAddEMFObjectIndividualAccess().getModelSlotModelSlotIDTerminalRuleCall_4_0_1(), semanticObject.getModelSlot());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (patternRole+=[PatternRole|ID]+ (parameter=[Parameter|ID] | add+=AddEMFObjectIndividual+))
	 */
	protected void sequence_DeclarePatternRole(EObject context, DeclarePatternRole semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     patternRole=[PatternRole|ID]
	 */
	protected void sequence_DeleteAction(EObject context, DeleteAction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FMLPackage.Literals.DELETE_ACTION__PATTERN_ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FMLPackage.Literals.DELETE_ACTION__PATTERN_ROLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeleteActionAccess().getPatternRolePatternRoleIDTerminalRuleCall_1_0_1(), semanticObject.getPatternRole());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID superEditionPattern=[EditionPattern|ID]? patternRoles+=PatternRole* editionSchemes+=EditionScheme*)
	 */
	protected void sequence_EditionPattern(EObject context, EditionPattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (editionSchemeType=EditionSchemeType name=ID (parameter+=Parameter+ parameter+=Parameter*)? editionAction+=EditionAction*)
	 */
	protected void sequence_EditionScheme(EObject context, EditionScheme semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=MSTYPE uri=URISTRING required=BOOL readOnly=BOOL)
	 */
	protected void sequence_ModelSlot(EObject context, ModelSlot semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FMLPackage.Literals.MODEL_SLOT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FMLPackage.Literals.MODEL_SLOT__NAME));
			if(transientValues.isValueTransient(semanticObject, FMLPackage.Literals.MODEL_SLOT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FMLPackage.Literals.MODEL_SLOT__TYPE));
			if(transientValues.isValueTransient(semanticObject, FMLPackage.Literals.MODEL_SLOT__URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FMLPackage.Literals.MODEL_SLOT__URI));
			if(transientValues.isValueTransient(semanticObject, FMLPackage.Literals.MODEL_SLOT__REQUIRED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FMLPackage.Literals.MODEL_SLOT__REQUIRED));
			if(transientValues.isValueTransient(semanticObject, FMLPackage.Literals.MODEL_SLOT__READ_ONLY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FMLPackage.Literals.MODEL_SLOT__READ_ONLY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelSlotAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getModelSlotAccess().getTypeMSTYPEEnumRuleCall_4_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getModelSlotAccess().getUriURISTRINGTerminalRuleCall_7_0(), semanticObject.getUri());
		feeder.accept(grammarAccess.getModelSlotAccess().getRequiredBOOLTerminalRuleCall_10_0(), semanticObject.getRequired());
		feeder.accept(grammarAccess.getModelSlotAccess().getReadOnlyBOOLTerminalRuleCall_13_0(), semanticObject.getReadOnly());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (widget=PRTYPE editionPattern=[EditionPattern|ID] name=ID)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FMLPackage.Literals.PARAMETER__WIDGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FMLPackage.Literals.PARAMETER__WIDGET));
			if(transientValues.isValueTransient(semanticObject, FMLPackage.Literals.PARAMETER__EDITION_PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FMLPackage.Literals.PARAMETER__EDITION_PATTERN));
			if(transientValues.isValueTransient(semanticObject, FMLPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FMLPackage.Literals.PARAMETER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getWidgetPRTYPEEnumRuleCall_0_0(), semanticObject.getWidget());
		feeder.accept(grammarAccess.getParameterAccess().getEditionPatternEditionPatternIDTerminalRuleCall_2_0_1(), semanticObject.getEditionPattern());
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=PRTYPE modelElement=ID modelSlot=[ModelSlot|ID])
	 */
	protected void sequence_PatternRole(EObject context, PatternRole semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FMLPackage.Literals.PATTERN_ROLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FMLPackage.Literals.PATTERN_ROLE__NAME));
			if(transientValues.isValueTransient(semanticObject, FMLPackage.Literals.PATTERN_ROLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FMLPackage.Literals.PATTERN_ROLE__TYPE));
			if(transientValues.isValueTransient(semanticObject, FMLPackage.Literals.PATTERN_ROLE__MODEL_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FMLPackage.Literals.PATTERN_ROLE__MODEL_ELEMENT));
			if(transientValues.isValueTransient(semanticObject, FMLPackage.Literals.PATTERN_ROLE__MODEL_SLOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FMLPackage.Literals.PATTERN_ROLE__MODEL_SLOT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPatternRoleAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPatternRoleAccess().getTypePRTYPEEnumRuleCall_3_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getPatternRoleAccess().getModelElementIDTerminalRuleCall_5_0(), semanticObject.getModelElement());
		feeder.accept(grammarAccess.getPatternRoleAccess().getModelSlotModelSlotIDTerminalRuleCall_7_0_1(), semanticObject.getModelSlot());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID uri=URISTRING elements+=VirtualModel*)
	 */
	protected void sequence_ViewDef(EObject context, ViewDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=VMTYPE? uri=URISTRING ModelSlots+=ModelSlot* EditionPatterns+=EditionPattern*)
	 */
	protected void sequence_VirtualModel(EObject context, VirtualModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
