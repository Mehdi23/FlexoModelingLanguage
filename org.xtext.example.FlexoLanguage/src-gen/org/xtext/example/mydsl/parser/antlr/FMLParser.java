/*
* generated by Xtext
*/
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.services.FMLGrammarAccess;

public class FMLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private FMLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.example.mydsl.parser.antlr.internal.InternalFMLParser createParser(XtextTokenStream stream) {
		return new org.xtext.example.mydsl.parser.antlr.internal.InternalFMLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "ViewDef";
	}
	
	public FMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}