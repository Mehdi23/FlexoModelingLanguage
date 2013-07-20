/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.scoping;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.xtext.example.mydsl.fML.DeleteAction;
import org.xtext.example.mydsl.fML.EditionPattern;
import org.xtext.example.mydsl.fML.EditionScheme;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping on how and when
 * to use it
 * 
 */
public class FMLScopeProvider extends
		org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider {

	@Override
	public IScope getScope(EObject context, EReference reference) {
		if (context instanceof DeleteAction) {
			DeleteAction deleteAction = (DeleteAction) context;
			EditionPattern editionPattern = (EditionPattern) ((EditionScheme) deleteAction
					.eContainer()).eContainer();
			return getFields(editionPattern, new LinkedList<EditionPattern>());
		}

		return super.getScope(context, reference);
	}

	private IScope getFields(EditionPattern editionPattern,
			Collection<EditionPattern> visited) {
		// deal with possible cycle in the hierarchy
		if (editionPattern == null || visited.contains(editionPattern))
			return IScope.NULLSCOPE;
		visited.add(editionPattern);
		IScope parentScope = getFields(editionPattern.getSuperEditionPattern(),
				visited);
		return Scopes.scopeFor(editionPattern.getPatternRoles(), parentScope);
	}

}