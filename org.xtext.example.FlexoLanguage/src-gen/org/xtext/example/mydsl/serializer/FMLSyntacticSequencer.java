package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.FMLGrammarAccess;

@SuppressWarnings("all")
public class FMLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected FMLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DeclarePatternRole_EqualsSignKeyword_0_1_q;
	protected AbstractElementAlias match_DeclarePatternRole_LeftParenthesisKeyword_1_1_0_p;
	protected AbstractElementAlias match_EditionScheme_CommaKeyword_3_1_0_p;
	protected AbstractElementAlias match_ModelSlot_ConformToKeyword_5_p;
	protected AbstractElementAlias match_ModelSlot_EqualsSignKeyword_12_p;
	protected AbstractElementAlias match_ModelSlot_EqualsSignKeyword_3_p;
	protected AbstractElementAlias match_ModelSlot_EqualsSignKeyword_6_p;
	protected AbstractElementAlias match_ModelSlot_EqualsSignKeyword_9_p;
	protected AbstractElementAlias match_ModelSlot_ReadOnlyKeyword_11_p;
	protected AbstractElementAlias match_ModelSlot_RequiredKeyword_8_p;
	protected AbstractElementAlias match_ModelSlot_TypeKeyword_2_p;
	protected AbstractElementAlias match_ViewDef_EqualsSignKeyword_3_p;
	protected AbstractElementAlias match_ViewDef_UriKeyword_2_p;
	protected AbstractElementAlias match_VirtualModel_EqualsSignKeyword_2_1_p;
	protected AbstractElementAlias match_VirtualModel_EqualsSignKeyword_4_p;
	protected AbstractElementAlias match_VirtualModel_TypeKeyword_2_0_p;
	protected AbstractElementAlias match_VirtualModel_UriKeyword_3_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (FMLGrammarAccess) access;
		match_DeclarePatternRole_EqualsSignKeyword_0_1_q = new TokenAlias(false, true, grammarAccess.getDeclarePatternRoleAccess().getEqualsSignKeyword_0_1());
		match_DeclarePatternRole_LeftParenthesisKeyword_1_1_0_p = new TokenAlias(true, false, grammarAccess.getDeclarePatternRoleAccess().getLeftParenthesisKeyword_1_1_0());
		match_EditionScheme_CommaKeyword_3_1_0_p = new TokenAlias(true, false, grammarAccess.getEditionSchemeAccess().getCommaKeyword_3_1_0());
		match_ModelSlot_ConformToKeyword_5_p = new TokenAlias(true, false, grammarAccess.getModelSlotAccess().getConformToKeyword_5());
		match_ModelSlot_EqualsSignKeyword_12_p = new TokenAlias(true, false, grammarAccess.getModelSlotAccess().getEqualsSignKeyword_12());
		match_ModelSlot_EqualsSignKeyword_3_p = new TokenAlias(true, false, grammarAccess.getModelSlotAccess().getEqualsSignKeyword_3());
		match_ModelSlot_EqualsSignKeyword_6_p = new TokenAlias(true, false, grammarAccess.getModelSlotAccess().getEqualsSignKeyword_6());
		match_ModelSlot_EqualsSignKeyword_9_p = new TokenAlias(true, false, grammarAccess.getModelSlotAccess().getEqualsSignKeyword_9());
		match_ModelSlot_ReadOnlyKeyword_11_p = new TokenAlias(true, false, grammarAccess.getModelSlotAccess().getReadOnlyKeyword_11());
		match_ModelSlot_RequiredKeyword_8_p = new TokenAlias(true, false, grammarAccess.getModelSlotAccess().getRequiredKeyword_8());
		match_ModelSlot_TypeKeyword_2_p = new TokenAlias(true, false, grammarAccess.getModelSlotAccess().getTypeKeyword_2());
		match_ViewDef_EqualsSignKeyword_3_p = new TokenAlias(true, false, grammarAccess.getViewDefAccess().getEqualsSignKeyword_3());
		match_ViewDef_UriKeyword_2_p = new TokenAlias(true, false, grammarAccess.getViewDefAccess().getUriKeyword_2());
		match_VirtualModel_EqualsSignKeyword_2_1_p = new TokenAlias(true, false, grammarAccess.getVirtualModelAccess().getEqualsSignKeyword_2_1());
		match_VirtualModel_EqualsSignKeyword_4_p = new TokenAlias(true, false, grammarAccess.getVirtualModelAccess().getEqualsSignKeyword_4());
		match_VirtualModel_TypeKeyword_2_0_p = new TokenAlias(true, false, grammarAccess.getVirtualModelAccess().getTypeKeyword_2_0());
		match_VirtualModel_UriKeyword_3_p = new TokenAlias(true, false, grammarAccess.getVirtualModelAccess().getUriKeyword_3());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_DeclarePatternRole_EqualsSignKeyword_0_1_q.equals(syntax))
				emit_DeclarePatternRole_EqualsSignKeyword_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DeclarePatternRole_LeftParenthesisKeyword_1_1_0_p.equals(syntax))
				emit_DeclarePatternRole_LeftParenthesisKeyword_1_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EditionScheme_CommaKeyword_3_1_0_p.equals(syntax))
				emit_EditionScheme_CommaKeyword_3_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ModelSlot_ConformToKeyword_5_p.equals(syntax))
				emit_ModelSlot_ConformToKeyword_5_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ModelSlot_EqualsSignKeyword_12_p.equals(syntax))
				emit_ModelSlot_EqualsSignKeyword_12_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ModelSlot_EqualsSignKeyword_3_p.equals(syntax))
				emit_ModelSlot_EqualsSignKeyword_3_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ModelSlot_EqualsSignKeyword_6_p.equals(syntax))
				emit_ModelSlot_EqualsSignKeyword_6_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ModelSlot_EqualsSignKeyword_9_p.equals(syntax))
				emit_ModelSlot_EqualsSignKeyword_9_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ModelSlot_ReadOnlyKeyword_11_p.equals(syntax))
				emit_ModelSlot_ReadOnlyKeyword_11_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ModelSlot_RequiredKeyword_8_p.equals(syntax))
				emit_ModelSlot_RequiredKeyword_8_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ModelSlot_TypeKeyword_2_p.equals(syntax))
				emit_ModelSlot_TypeKeyword_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ViewDef_EqualsSignKeyword_3_p.equals(syntax))
				emit_ViewDef_EqualsSignKeyword_3_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ViewDef_UriKeyword_2_p.equals(syntax))
				emit_ViewDef_UriKeyword_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VirtualModel_EqualsSignKeyword_2_1_p.equals(syntax))
				emit_VirtualModel_EqualsSignKeyword_2_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VirtualModel_EqualsSignKeyword_4_p.equals(syntax))
				emit_VirtualModel_EqualsSignKeyword_4_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VirtualModel_TypeKeyword_2_0_p.equals(syntax))
				emit_VirtualModel_TypeKeyword_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VirtualModel_UriKeyword_3_p.equals(syntax))
				emit_VirtualModel_UriKeyword_3_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '='?
	 */
	protected void emit_DeclarePatternRole_EqualsSignKeyword_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_DeclarePatternRole_LeftParenthesisKeyword_1_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','+
	 */
	protected void emit_EditionScheme_CommaKeyword_3_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'conformTo'+
	 */
	protected void emit_ModelSlot_ConformToKeyword_5_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '='+
	 */
	protected void emit_ModelSlot_EqualsSignKeyword_12_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '='+
	 */
	protected void emit_ModelSlot_EqualsSignKeyword_3_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '='+
	 */
	protected void emit_ModelSlot_EqualsSignKeyword_6_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '='+
	 */
	protected void emit_ModelSlot_EqualsSignKeyword_9_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'readOnly'+
	 */
	protected void emit_ModelSlot_ReadOnlyKeyword_11_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'required'+
	 */
	protected void emit_ModelSlot_RequiredKeyword_8_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'type'+
	 */
	protected void emit_ModelSlot_TypeKeyword_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '='+
	 */
	protected void emit_ViewDef_EqualsSignKeyword_3_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'uri'+
	 */
	protected void emit_ViewDef_UriKeyword_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '='+
	 */
	protected void emit_VirtualModel_EqualsSignKeyword_2_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '='+
	 */
	protected void emit_VirtualModel_EqualsSignKeyword_4_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'type'+
	 */
	protected void emit_VirtualModel_TypeKeyword_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'uri'+
	 */
	protected void emit_VirtualModel_UriKeyword_3_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
