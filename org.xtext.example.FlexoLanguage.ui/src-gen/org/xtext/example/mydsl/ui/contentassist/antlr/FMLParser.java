/*
* generated by Xtext
*/
package org.xtext.example.mydsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.mydsl.services.FMLGrammarAccess;

public class FMLParser extends AbstractContentAssistParser {
	
	@Inject
	private FMLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalFMLParser createParser() {
		org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalFMLParser result = new org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalFMLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getBuiltInActionAccess().getAlternatives(), "rule__BuiltInAction__Alternatives");
					put(grammarAccess.getEditionSchemeTypeAccess().getAlternatives(), "rule__EditionSchemeType__Alternatives");
					put(grammarAccess.getMSTYPEAccess().getAlternatives(), "rule__MSTYPE__Alternatives");
					put(grammarAccess.getVMTYPEAccess().getAlternatives(), "rule__VMTYPE__Alternatives");
					put(grammarAccess.getViewDefAccess().getGroup(), "rule__ViewDef__Group__0");
					put(grammarAccess.getVirtualModelAccess().getGroup(), "rule__VirtualModel__Group__0");
					put(grammarAccess.getVirtualModelAccess().getGroup_2(), "rule__VirtualModel__Group_2__0");
					put(grammarAccess.getModelSlotAccess().getGroup(), "rule__ModelSlot__Group__0");
					put(grammarAccess.getEditionPatternAccess().getGroup(), "rule__EditionPattern__Group__0");
					put(grammarAccess.getEditionPatternAccess().getGroup_2(), "rule__EditionPattern__Group_2__0");
					put(grammarAccess.getPatternRoleAccess().getGroup(), "rule__PatternRole__Group__0");
					put(grammarAccess.getEditionSchemeAccess().getGroup(), "rule__EditionScheme__Group__0");
					put(grammarAccess.getEditionSchemeAccess().getGroup_3(), "rule__EditionScheme__Group_3__0");
					put(grammarAccess.getEditionSchemeAccess().getGroup_3_1(), "rule__EditionScheme__Group_3_1__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getDeclarePatternRoleAccess().getGroup(), "rule__DeclarePatternRole__Group__0");
					put(grammarAccess.getDeleteActionAccess().getGroup(), "rule__DeleteAction__Group__0");
					put(grammarAccess.getViewDefAccess().getNameAssignment_1(), "rule__ViewDef__NameAssignment_1");
					put(grammarAccess.getViewDefAccess().getUriAssignment_4(), "rule__ViewDef__UriAssignment_4");
					put(grammarAccess.getViewDefAccess().getElementsAssignment_6(), "rule__ViewDef__ElementsAssignment_6");
					put(grammarAccess.getVirtualModelAccess().getNameAssignment_1(), "rule__VirtualModel__NameAssignment_1");
					put(grammarAccess.getVirtualModelAccess().getTypeAssignment_2_2(), "rule__VirtualModel__TypeAssignment_2_2");
					put(grammarAccess.getVirtualModelAccess().getUriAssignment_5(), "rule__VirtualModel__UriAssignment_5");
					put(grammarAccess.getVirtualModelAccess().getModelSlotsAssignment_7(), "rule__VirtualModel__ModelSlotsAssignment_7");
					put(grammarAccess.getVirtualModelAccess().getEditionPatternsAssignment_8(), "rule__VirtualModel__EditionPatternsAssignment_8");
					put(grammarAccess.getModelSlotAccess().getNameAssignment_1(), "rule__ModelSlot__NameAssignment_1");
					put(grammarAccess.getModelSlotAccess().getTypeAssignment_4(), "rule__ModelSlot__TypeAssignment_4");
					put(grammarAccess.getModelSlotAccess().getUriAssignment_7(), "rule__ModelSlot__UriAssignment_7");
					put(grammarAccess.getModelSlotAccess().getRequiredAssignment_10(), "rule__ModelSlot__RequiredAssignment_10");
					put(grammarAccess.getModelSlotAccess().getReadOnlyAssignment_13(), "rule__ModelSlot__ReadOnlyAssignment_13");
					put(grammarAccess.getEditionPatternAccess().getNameAssignment_1(), "rule__EditionPattern__NameAssignment_1");
					put(grammarAccess.getEditionPatternAccess().getSuperEditionPatternAssignment_2_1(), "rule__EditionPattern__SuperEditionPatternAssignment_2_1");
					put(grammarAccess.getEditionPatternAccess().getPatternRolesAssignment_4(), "rule__EditionPattern__PatternRolesAssignment_4");
					put(grammarAccess.getEditionPatternAccess().getEditionSchemesAssignment_5(), "rule__EditionPattern__EditionSchemesAssignment_5");
					put(grammarAccess.getPatternRoleAccess().getNameAssignment_1(), "rule__PatternRole__NameAssignment_1");
					put(grammarAccess.getPatternRoleAccess().getTypeAssignment_3(), "rule__PatternRole__TypeAssignment_3");
					put(grammarAccess.getPatternRoleAccess().getModelElementAssignment_5(), "rule__PatternRole__ModelElementAssignment_5");
					put(grammarAccess.getPatternRoleAccess().getModelSlotAssignment_7(), "rule__PatternRole__ModelSlotAssignment_7");
					put(grammarAccess.getEditionSchemeAccess().getEditionSchemeTypeAssignment_0(), "rule__EditionScheme__EditionSchemeTypeAssignment_0");
					put(grammarAccess.getEditionSchemeAccess().getNameAssignment_1(), "rule__EditionScheme__NameAssignment_1");
					put(grammarAccess.getEditionSchemeAccess().getParameterAssignment_3_0(), "rule__EditionScheme__ParameterAssignment_3_0");
					put(grammarAccess.getEditionSchemeAccess().getParameterAssignment_3_1_1(), "rule__EditionScheme__ParameterAssignment_3_1_1");
					put(grammarAccess.getEditionSchemeAccess().getEditionActionAssignment_6(), "rule__EditionScheme__EditionActionAssignment_6");
					put(grammarAccess.getParameterAccess().getWidgetAssignment_0(), "rule__Parameter__WidgetAssignment_0");
					put(grammarAccess.getParameterAccess().getEditionPatternAssignment_2(), "rule__Parameter__EditionPatternAssignment_2");
					put(grammarAccess.getParameterAccess().getNameAssignment_3(), "rule__Parameter__NameAssignment_3");
					put(grammarAccess.getDeclarePatternRoleAccess().getPatternRoleAssignment_0(), "rule__DeclarePatternRole__PatternRoleAssignment_0");
					put(grammarAccess.getDeclarePatternRoleAccess().getParameterAssignment_4(), "rule__DeclarePatternRole__ParameterAssignment_4");
					put(grammarAccess.getDeleteActionAccess().getPatternRoleAssignment_1(), "rule__DeleteAction__PatternRoleAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalFMLParser typedParser = (org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalFMLParser) parser;
			typedParser.entryRuleViewDef();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public FMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}