/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.formatting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.inject.Inject;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.xtext.example.mydsl.services.FMLGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting on how and
 * when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an
 * example
 */
public class FMLFormatter extends AbstractDeclarativeFormatter {

	@Inject
	private FMLGrammarAccess grammarAccess;

	@Override
	protected void configureFormatting(FormattingConfig c) {

		// linewrap before keywords
		final Set<String> allKeywords = new HashSet<String>(Arrays.asList(
				"ViewDefinition", "VirtualModel", "ModelSlot",
				"EditionPattern", "PatternRole", "ActionScheme",
				"DeletionScheme"));
		final List<Keyword> keywords = grammarAccess.findKeywords(allKeywords
				.toArray(new String[allKeywords.size()]));
		for (final Keyword keyword : keywords) {
			c.setLinewrap().before(keyword);
		}

		for (org.eclipse.xtext.util.Pair<Keyword, Keyword> pair : grammarAccess
				.findKeywordPairs("{", "}")) { //$NON-NLS-1$ //$NON-NLS-2$
												// a space before the first '{'
			c.setSpace(" ").before(pair.getFirst()); //$NON-NLS-1$
			// indentation between
			c.setIndentation(pair.getFirst(), pair.getSecond());
			// and a linewrap before the last '{'
			c.setLinewrap(1).before(pair.getSecond());
		}

		// It's usually a good idea to activate the following three statements.
		// They will add and preserve newlines around comments
		c.setLinewrap(0, 1, 2).before(grammarAccess.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(grammarAccess.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(grammarAccess.getML_COMMENTRule());
	}
}
