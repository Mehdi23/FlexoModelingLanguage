package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.FMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_URISTRING", "RULE_BOOL", "RULE_STRING", "RULE_URI", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Individual'", "'CreationScheme'", "'DeletionScheme'", "'ActionScheme'", "'CloningScheme'", "'OWLModelSlot'", "'DiagramModelSlot'", "'EMFModelSlot'", "'VirtualModelModelSlot'", "'XSDModelSlot'", "'DiagramSpecification'", "'VirtualModel'", "'ViewDefinition'", "'uri'", "'='", "'{'", "'}'", "'type'", "'ModelSlot'", "'conformTo'", "'required'", "'readOnly'", "';'", "'EditionPattern'", "'extends'", "'PatternRole'", "'as'", "'from'", "'('", "')'", "','", "':'", "'parameters'", "'.'", "'delete'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_BOOL=6;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_INT=9;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int RULE_URISTRING=5;
    public static final int RULE_URI=8;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;

    // delegates
    // delegators


        public InternalFMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFMLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g"; }


     
     	private FMLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(FMLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleViewDef"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:60:1: entryRuleViewDef : ruleViewDef EOF ;
    public final void entryRuleViewDef() throws RecognitionException {
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:61:1: ( ruleViewDef EOF )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:62:1: ruleViewDef EOF
            {
             before(grammarAccess.getViewDefRule()); 
            pushFollow(FOLLOW_ruleViewDef_in_entryRuleViewDef61);
            ruleViewDef();

            state._fsp--;

             after(grammarAccess.getViewDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewDef68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleViewDef"


    // $ANTLR start "ruleViewDef"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:69:1: ruleViewDef : ( ( rule__ViewDef__Group__0 ) ) ;
    public final void ruleViewDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:73:2: ( ( ( rule__ViewDef__Group__0 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:74:1: ( ( rule__ViewDef__Group__0 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:74:1: ( ( rule__ViewDef__Group__0 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:75:1: ( rule__ViewDef__Group__0 )
            {
             before(grammarAccess.getViewDefAccess().getGroup()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:76:1: ( rule__ViewDef__Group__0 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:76:2: rule__ViewDef__Group__0
            {
            pushFollow(FOLLOW_rule__ViewDef__Group__0_in_ruleViewDef94);
            rule__ViewDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getViewDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleViewDef"


    // $ANTLR start "entryRuleVirtualModel"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:88:1: entryRuleVirtualModel : ruleVirtualModel EOF ;
    public final void entryRuleVirtualModel() throws RecognitionException {
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:89:1: ( ruleVirtualModel EOF )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:90:1: ruleVirtualModel EOF
            {
             before(grammarAccess.getVirtualModelRule()); 
            pushFollow(FOLLOW_ruleVirtualModel_in_entryRuleVirtualModel121);
            ruleVirtualModel();

            state._fsp--;

             after(grammarAccess.getVirtualModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVirtualModel128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVirtualModel"


    // $ANTLR start "ruleVirtualModel"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:97:1: ruleVirtualModel : ( ( rule__VirtualModel__Group__0 ) ) ;
    public final void ruleVirtualModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:101:2: ( ( ( rule__VirtualModel__Group__0 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:102:1: ( ( rule__VirtualModel__Group__0 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:102:1: ( ( rule__VirtualModel__Group__0 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:103:1: ( rule__VirtualModel__Group__0 )
            {
             before(grammarAccess.getVirtualModelAccess().getGroup()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:104:1: ( rule__VirtualModel__Group__0 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:104:2: rule__VirtualModel__Group__0
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group__0_in_ruleVirtualModel154);
            rule__VirtualModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVirtualModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVirtualModel"


    // $ANTLR start "entryRuleModelSlot"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:116:1: entryRuleModelSlot : ruleModelSlot EOF ;
    public final void entryRuleModelSlot() throws RecognitionException {
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:117:1: ( ruleModelSlot EOF )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:118:1: ruleModelSlot EOF
            {
             before(grammarAccess.getModelSlotRule()); 
            pushFollow(FOLLOW_ruleModelSlot_in_entryRuleModelSlot181);
            ruleModelSlot();

            state._fsp--;

             after(grammarAccess.getModelSlotRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelSlot188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelSlot"


    // $ANTLR start "ruleModelSlot"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:125:1: ruleModelSlot : ( ( rule__ModelSlot__Group__0 ) ) ;
    public final void ruleModelSlot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:129:2: ( ( ( rule__ModelSlot__Group__0 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:130:1: ( ( rule__ModelSlot__Group__0 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:130:1: ( ( rule__ModelSlot__Group__0 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:131:1: ( rule__ModelSlot__Group__0 )
            {
             before(grammarAccess.getModelSlotAccess().getGroup()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:132:1: ( rule__ModelSlot__Group__0 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:132:2: rule__ModelSlot__Group__0
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__0_in_ruleModelSlot214);
            rule__ModelSlot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelSlotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelSlot"


    // $ANTLR start "entryRuleEditionPattern"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:144:1: entryRuleEditionPattern : ruleEditionPattern EOF ;
    public final void entryRuleEditionPattern() throws RecognitionException {
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:145:1: ( ruleEditionPattern EOF )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:146:1: ruleEditionPattern EOF
            {
             before(grammarAccess.getEditionPatternRule()); 
            pushFollow(FOLLOW_ruleEditionPattern_in_entryRuleEditionPattern241);
            ruleEditionPattern();

            state._fsp--;

             after(grammarAccess.getEditionPatternRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEditionPattern248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEditionPattern"


    // $ANTLR start "ruleEditionPattern"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:153:1: ruleEditionPattern : ( ( rule__EditionPattern__Group__0 ) ) ;
    public final void ruleEditionPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:157:2: ( ( ( rule__EditionPattern__Group__0 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:158:1: ( ( rule__EditionPattern__Group__0 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:158:1: ( ( rule__EditionPattern__Group__0 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:159:1: ( rule__EditionPattern__Group__0 )
            {
             before(grammarAccess.getEditionPatternAccess().getGroup()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:160:1: ( rule__EditionPattern__Group__0 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:160:2: rule__EditionPattern__Group__0
            {
            pushFollow(FOLLOW_rule__EditionPattern__Group__0_in_ruleEditionPattern274);
            rule__EditionPattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEditionPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEditionPattern"


    // $ANTLR start "entryRulePatternRole"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:172:1: entryRulePatternRole : rulePatternRole EOF ;
    public final void entryRulePatternRole() throws RecognitionException {
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:173:1: ( rulePatternRole EOF )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:174:1: rulePatternRole EOF
            {
             before(grammarAccess.getPatternRoleRule()); 
            pushFollow(FOLLOW_rulePatternRole_in_entryRulePatternRole301);
            rulePatternRole();

            state._fsp--;

             after(grammarAccess.getPatternRoleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatternRole308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePatternRole"


    // $ANTLR start "rulePatternRole"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:181:1: rulePatternRole : ( ( rule__PatternRole__Group__0 ) ) ;
    public final void rulePatternRole() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:185:2: ( ( ( rule__PatternRole__Group__0 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:186:1: ( ( rule__PatternRole__Group__0 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:186:1: ( ( rule__PatternRole__Group__0 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:187:1: ( rule__PatternRole__Group__0 )
            {
             before(grammarAccess.getPatternRoleAccess().getGroup()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:188:1: ( rule__PatternRole__Group__0 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:188:2: rule__PatternRole__Group__0
            {
            pushFollow(FOLLOW_rule__PatternRole__Group__0_in_rulePatternRole334);
            rule__PatternRole__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternRole"


    // $ANTLR start "entryRuleEditionScheme"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:200:1: entryRuleEditionScheme : ruleEditionScheme EOF ;
    public final void entryRuleEditionScheme() throws RecognitionException {
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:201:1: ( ruleEditionScheme EOF )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:202:1: ruleEditionScheme EOF
            {
             before(grammarAccess.getEditionSchemeRule()); 
            pushFollow(FOLLOW_ruleEditionScheme_in_entryRuleEditionScheme361);
            ruleEditionScheme();

            state._fsp--;

             after(grammarAccess.getEditionSchemeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEditionScheme368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEditionScheme"


    // $ANTLR start "ruleEditionScheme"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:209:1: ruleEditionScheme : ( ( rule__EditionScheme__Group__0 ) ) ;
    public final void ruleEditionScheme() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:213:2: ( ( ( rule__EditionScheme__Group__0 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:214:1: ( ( rule__EditionScheme__Group__0 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:214:1: ( ( rule__EditionScheme__Group__0 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:215:1: ( rule__EditionScheme__Group__0 )
            {
             before(grammarAccess.getEditionSchemeAccess().getGroup()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:216:1: ( rule__EditionScheme__Group__0 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:216:2: rule__EditionScheme__Group__0
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group__0_in_ruleEditionScheme394);
            rule__EditionScheme__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEditionSchemeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEditionScheme"


    // $ANTLR start "entryRuleParameter"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:228:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:229:1: ( ruleParameter EOF )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:230:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter421);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:237:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:241:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:242:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:242:1: ( ( rule__Parameter__Group__0 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:243:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:244:1: ( rule__Parameter__Group__0 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:244:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter454);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleEditionAction"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:256:1: entryRuleEditionAction : ruleEditionAction EOF ;
    public final void entryRuleEditionAction() throws RecognitionException {
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:257:1: ( ruleEditionAction EOF )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:258:1: ruleEditionAction EOF
            {
             before(grammarAccess.getEditionActionRule()); 
            pushFollow(FOLLOW_ruleEditionAction_in_entryRuleEditionAction481);
            ruleEditionAction();

            state._fsp--;

             after(grammarAccess.getEditionActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEditionAction488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEditionAction"


    // $ANTLR start "ruleEditionAction"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:265:1: ruleEditionAction : ( ruleBuiltInAction ) ;
    public final void ruleEditionAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:269:2: ( ( ruleBuiltInAction ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:270:1: ( ruleBuiltInAction )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:270:1: ( ruleBuiltInAction )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:271:1: ruleBuiltInAction
            {
             before(grammarAccess.getEditionActionAccess().getBuiltInActionParserRuleCall()); 
            pushFollow(FOLLOW_ruleBuiltInAction_in_ruleEditionAction514);
            ruleBuiltInAction();

            state._fsp--;

             after(grammarAccess.getEditionActionAccess().getBuiltInActionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEditionAction"


    // $ANTLR start "entryRuleBuiltInAction"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:284:1: entryRuleBuiltInAction : ruleBuiltInAction EOF ;
    public final void entryRuleBuiltInAction() throws RecognitionException {
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:285:1: ( ruleBuiltInAction EOF )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:286:1: ruleBuiltInAction EOF
            {
             before(grammarAccess.getBuiltInActionRule()); 
            pushFollow(FOLLOW_ruleBuiltInAction_in_entryRuleBuiltInAction540);
            ruleBuiltInAction();

            state._fsp--;

             after(grammarAccess.getBuiltInActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltInAction547); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBuiltInAction"


    // $ANTLR start "ruleBuiltInAction"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:293:1: ruleBuiltInAction : ( ( rule__BuiltInAction__Alternatives ) ) ;
    public final void ruleBuiltInAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:297:2: ( ( ( rule__BuiltInAction__Alternatives ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:298:1: ( ( rule__BuiltInAction__Alternatives ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:298:1: ( ( rule__BuiltInAction__Alternatives ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:299:1: ( rule__BuiltInAction__Alternatives )
            {
             before(grammarAccess.getBuiltInActionAccess().getAlternatives()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:300:1: ( rule__BuiltInAction__Alternatives )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:300:2: rule__BuiltInAction__Alternatives
            {
            pushFollow(FOLLOW_rule__BuiltInAction__Alternatives_in_ruleBuiltInAction573);
            rule__BuiltInAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBuiltInActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBuiltInAction"


    // $ANTLR start "entryRuleDeclarePatternRole"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:312:1: entryRuleDeclarePatternRole : ruleDeclarePatternRole EOF ;
    public final void entryRuleDeclarePatternRole() throws RecognitionException {
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:313:1: ( ruleDeclarePatternRole EOF )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:314:1: ruleDeclarePatternRole EOF
            {
             before(grammarAccess.getDeclarePatternRoleRule()); 
            pushFollow(FOLLOW_ruleDeclarePatternRole_in_entryRuleDeclarePatternRole600);
            ruleDeclarePatternRole();

            state._fsp--;

             after(grammarAccess.getDeclarePatternRoleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarePatternRole607); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclarePatternRole"


    // $ANTLR start "ruleDeclarePatternRole"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:321:1: ruleDeclarePatternRole : ( ( rule__DeclarePatternRole__Group__0 ) ) ;
    public final void ruleDeclarePatternRole() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:325:2: ( ( ( rule__DeclarePatternRole__Group__0 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:326:1: ( ( rule__DeclarePatternRole__Group__0 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:326:1: ( ( rule__DeclarePatternRole__Group__0 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:327:1: ( rule__DeclarePatternRole__Group__0 )
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getGroup()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:328:1: ( rule__DeclarePatternRole__Group__0 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:328:2: rule__DeclarePatternRole__Group__0
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__Group__0_in_ruleDeclarePatternRole633);
            rule__DeclarePatternRole__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarePatternRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclarePatternRole"


    // $ANTLR start "entryRuleDeleteAction"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:340:1: entryRuleDeleteAction : ruleDeleteAction EOF ;
    public final void entryRuleDeleteAction() throws RecognitionException {
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:341:1: ( ruleDeleteAction EOF )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:342:1: ruleDeleteAction EOF
            {
             before(grammarAccess.getDeleteActionRule()); 
            pushFollow(FOLLOW_ruleDeleteAction_in_entryRuleDeleteAction660);
            ruleDeleteAction();

            state._fsp--;

             after(grammarAccess.getDeleteActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteAction667); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeleteAction"


    // $ANTLR start "ruleDeleteAction"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:349:1: ruleDeleteAction : ( ( rule__DeleteAction__Group__0 ) ) ;
    public final void ruleDeleteAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:353:2: ( ( ( rule__DeleteAction__Group__0 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:354:1: ( ( rule__DeleteAction__Group__0 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:354:1: ( ( rule__DeleteAction__Group__0 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:355:1: ( rule__DeleteAction__Group__0 )
            {
             before(grammarAccess.getDeleteActionAccess().getGroup()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:356:1: ( rule__DeleteAction__Group__0 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:356:2: rule__DeleteAction__Group__0
            {
            pushFollow(FOLLOW_rule__DeleteAction__Group__0_in_ruleDeleteAction693);
            rule__DeleteAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeleteAction"


    // $ANTLR start "ruleEditionSchemeType"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:369:1: ruleEditionSchemeType : ( ( rule__EditionSchemeType__Alternatives ) ) ;
    public final void ruleEditionSchemeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:373:1: ( ( ( rule__EditionSchemeType__Alternatives ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:374:1: ( ( rule__EditionSchemeType__Alternatives ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:374:1: ( ( rule__EditionSchemeType__Alternatives ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:375:1: ( rule__EditionSchemeType__Alternatives )
            {
             before(grammarAccess.getEditionSchemeTypeAccess().getAlternatives()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:376:1: ( rule__EditionSchemeType__Alternatives )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:376:2: rule__EditionSchemeType__Alternatives
            {
            pushFollow(FOLLOW_rule__EditionSchemeType__Alternatives_in_ruleEditionSchemeType730);
            rule__EditionSchemeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEditionSchemeTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEditionSchemeType"


    // $ANTLR start "ruleMSTYPE"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:388:1: ruleMSTYPE : ( ( rule__MSTYPE__Alternatives ) ) ;
    public final void ruleMSTYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:392:1: ( ( ( rule__MSTYPE__Alternatives ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:393:1: ( ( rule__MSTYPE__Alternatives ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:393:1: ( ( rule__MSTYPE__Alternatives ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:394:1: ( rule__MSTYPE__Alternatives )
            {
             before(grammarAccess.getMSTYPEAccess().getAlternatives()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:395:1: ( rule__MSTYPE__Alternatives )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:395:2: rule__MSTYPE__Alternatives
            {
            pushFollow(FOLLOW_rule__MSTYPE__Alternatives_in_ruleMSTYPE766);
            rule__MSTYPE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMSTYPEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMSTYPE"


    // $ANTLR start "ruleVMTYPE"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:407:1: ruleVMTYPE : ( ( rule__VMTYPE__Alternatives ) ) ;
    public final void ruleVMTYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:411:1: ( ( ( rule__VMTYPE__Alternatives ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:412:1: ( ( rule__VMTYPE__Alternatives ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:412:1: ( ( rule__VMTYPE__Alternatives ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:413:1: ( rule__VMTYPE__Alternatives )
            {
             before(grammarAccess.getVMTYPEAccess().getAlternatives()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:414:1: ( rule__VMTYPE__Alternatives )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:414:2: rule__VMTYPE__Alternatives
            {
            pushFollow(FOLLOW_rule__VMTYPE__Alternatives_in_ruleVMTYPE802);
            rule__VMTYPE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVMTYPEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVMTYPE"


    // $ANTLR start "rulePRTYPE"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:426:1: rulePRTYPE : ( ( 'Individual' ) ) ;
    public final void rulePRTYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:430:1: ( ( ( 'Individual' ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:431:1: ( ( 'Individual' ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:431:1: ( ( 'Individual' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:432:1: ( 'Individual' )
            {
             before(grammarAccess.getPRTYPEAccess().getIndividualEnumLiteralDeclaration()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:433:1: ( 'Individual' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:433:3: 'Individual'
            {
            match(input,14,FOLLOW_14_in_rulePRTYPE839); 

            }

             after(grammarAccess.getPRTYPEAccess().getIndividualEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePRTYPE"


    // $ANTLR start "rule__BuiltInAction__Alternatives"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:445:1: rule__BuiltInAction__Alternatives : ( ( ruleDeclarePatternRole ) | ( ruleDeleteAction ) );
    public final void rule__BuiltInAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:449:1: ( ( ruleDeclarePatternRole ) | ( ruleDeleteAction ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==48) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:450:1: ( ruleDeclarePatternRole )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:450:1: ( ruleDeclarePatternRole )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:451:1: ruleDeclarePatternRole
                    {
                     before(grammarAccess.getBuiltInActionAccess().getDeclarePatternRoleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDeclarePatternRole_in_rule__BuiltInAction__Alternatives876);
                    ruleDeclarePatternRole();

                    state._fsp--;

                     after(grammarAccess.getBuiltInActionAccess().getDeclarePatternRoleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:456:6: ( ruleDeleteAction )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:456:6: ( ruleDeleteAction )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:457:1: ruleDeleteAction
                    {
                     before(grammarAccess.getBuiltInActionAccess().getDeleteActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDeleteAction_in_rule__BuiltInAction__Alternatives893);
                    ruleDeleteAction();

                    state._fsp--;

                     after(grammarAccess.getBuiltInActionAccess().getDeleteActionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInAction__Alternatives"


    // $ANTLR start "rule__EditionSchemeType__Alternatives"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:467:1: rule__EditionSchemeType__Alternatives : ( ( ( 'CreationScheme' ) ) | ( ( 'DeletionScheme' ) ) | ( ( 'ActionScheme' ) ) | ( ( 'CloningScheme' ) ) );
    public final void rule__EditionSchemeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:471:1: ( ( ( 'CreationScheme' ) ) | ( ( 'DeletionScheme' ) ) | ( ( 'ActionScheme' ) ) | ( ( 'CloningScheme' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:472:1: ( ( 'CreationScheme' ) )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:472:1: ( ( 'CreationScheme' ) )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:473:1: ( 'CreationScheme' )
                    {
                     before(grammarAccess.getEditionSchemeTypeAccess().getCreationSchemeEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:474:1: ( 'CreationScheme' )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:474:3: 'CreationScheme'
                    {
                    match(input,15,FOLLOW_15_in_rule__EditionSchemeType__Alternatives926); 

                    }

                     after(grammarAccess.getEditionSchemeTypeAccess().getCreationSchemeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:479:6: ( ( 'DeletionScheme' ) )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:479:6: ( ( 'DeletionScheme' ) )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:480:1: ( 'DeletionScheme' )
                    {
                     before(grammarAccess.getEditionSchemeTypeAccess().getDeletionSchemeEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:481:1: ( 'DeletionScheme' )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:481:3: 'DeletionScheme'
                    {
                    match(input,16,FOLLOW_16_in_rule__EditionSchemeType__Alternatives947); 

                    }

                     after(grammarAccess.getEditionSchemeTypeAccess().getDeletionSchemeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:486:6: ( ( 'ActionScheme' ) )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:486:6: ( ( 'ActionScheme' ) )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:487:1: ( 'ActionScheme' )
                    {
                     before(grammarAccess.getEditionSchemeTypeAccess().getActionSchemeEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:488:1: ( 'ActionScheme' )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:488:3: 'ActionScheme'
                    {
                    match(input,17,FOLLOW_17_in_rule__EditionSchemeType__Alternatives968); 

                    }

                     after(grammarAccess.getEditionSchemeTypeAccess().getActionSchemeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:493:6: ( ( 'CloningScheme' ) )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:493:6: ( ( 'CloningScheme' ) )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:494:1: ( 'CloningScheme' )
                    {
                     before(grammarAccess.getEditionSchemeTypeAccess().getCloningSchemeEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:495:1: ( 'CloningScheme' )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:495:3: 'CloningScheme'
                    {
                    match(input,18,FOLLOW_18_in_rule__EditionSchemeType__Alternatives989); 

                    }

                     after(grammarAccess.getEditionSchemeTypeAccess().getCloningSchemeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionSchemeType__Alternatives"


    // $ANTLR start "rule__MSTYPE__Alternatives"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:505:1: rule__MSTYPE__Alternatives : ( ( ( 'OWLModelSlot' ) ) | ( ( 'DiagramModelSlot' ) ) | ( ( 'EMFModelSlot' ) ) | ( ( 'VirtualModelModelSlot' ) ) | ( ( 'XSDModelSlot' ) ) );
    public final void rule__MSTYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:509:1: ( ( ( 'OWLModelSlot' ) ) | ( ( 'DiagramModelSlot' ) ) | ( ( 'EMFModelSlot' ) ) | ( ( 'VirtualModelModelSlot' ) ) | ( ( 'XSDModelSlot' ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            case 22:
                {
                alt3=4;
                }
                break;
            case 23:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:510:1: ( ( 'OWLModelSlot' ) )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:510:1: ( ( 'OWLModelSlot' ) )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:511:1: ( 'OWLModelSlot' )
                    {
                     before(grammarAccess.getMSTYPEAccess().getOwlEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:512:1: ( 'OWLModelSlot' )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:512:3: 'OWLModelSlot'
                    {
                    match(input,19,FOLLOW_19_in_rule__MSTYPE__Alternatives1025); 

                    }

                     after(grammarAccess.getMSTYPEAccess().getOwlEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:517:6: ( ( 'DiagramModelSlot' ) )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:517:6: ( ( 'DiagramModelSlot' ) )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:518:1: ( 'DiagramModelSlot' )
                    {
                     before(grammarAccess.getMSTYPEAccess().getDiagEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:519:1: ( 'DiagramModelSlot' )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:519:3: 'DiagramModelSlot'
                    {
                    match(input,20,FOLLOW_20_in_rule__MSTYPE__Alternatives1046); 

                    }

                     after(grammarAccess.getMSTYPEAccess().getDiagEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:524:6: ( ( 'EMFModelSlot' ) )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:524:6: ( ( 'EMFModelSlot' ) )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:525:1: ( 'EMFModelSlot' )
                    {
                     before(grammarAccess.getMSTYPEAccess().getEmfEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:526:1: ( 'EMFModelSlot' )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:526:3: 'EMFModelSlot'
                    {
                    match(input,21,FOLLOW_21_in_rule__MSTYPE__Alternatives1067); 

                    }

                     after(grammarAccess.getMSTYPEAccess().getEmfEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:531:6: ( ( 'VirtualModelModelSlot' ) )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:531:6: ( ( 'VirtualModelModelSlot' ) )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:532:1: ( 'VirtualModelModelSlot' )
                    {
                     before(grammarAccess.getMSTYPEAccess().getVirtualEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:533:1: ( 'VirtualModelModelSlot' )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:533:3: 'VirtualModelModelSlot'
                    {
                    match(input,22,FOLLOW_22_in_rule__MSTYPE__Alternatives1088); 

                    }

                     after(grammarAccess.getMSTYPEAccess().getVirtualEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:538:6: ( ( 'XSDModelSlot' ) )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:538:6: ( ( 'XSDModelSlot' ) )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:539:1: ( 'XSDModelSlot' )
                    {
                     before(grammarAccess.getMSTYPEAccess().getXsdEnumLiteralDeclaration_4()); 
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:540:1: ( 'XSDModelSlot' )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:540:3: 'XSDModelSlot'
                    {
                    match(input,23,FOLLOW_23_in_rule__MSTYPE__Alternatives1109); 

                    }

                     after(grammarAccess.getMSTYPEAccess().getXsdEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSTYPE__Alternatives"


    // $ANTLR start "rule__VMTYPE__Alternatives"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:550:1: rule__VMTYPE__Alternatives : ( ( ( 'DiagramSpecification' ) ) | ( ( 'VirtualModel' ) ) );
    public final void rule__VMTYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:554:1: ( ( ( 'DiagramSpecification' ) ) | ( ( 'VirtualModel' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            else if ( (LA4_0==25) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:555:1: ( ( 'DiagramSpecification' ) )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:555:1: ( ( 'DiagramSpecification' ) )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:556:1: ( 'DiagramSpecification' )
                    {
                     before(grammarAccess.getVMTYPEAccess().getDiagSpecEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:557:1: ( 'DiagramSpecification' )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:557:3: 'DiagramSpecification'
                    {
                    match(input,24,FOLLOW_24_in_rule__VMTYPE__Alternatives1145); 

                    }

                     after(grammarAccess.getVMTYPEAccess().getDiagSpecEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:562:6: ( ( 'VirtualModel' ) )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:562:6: ( ( 'VirtualModel' ) )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:563:1: ( 'VirtualModel' )
                    {
                     before(grammarAccess.getVMTYPEAccess().getVMEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:564:1: ( 'VirtualModel' )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:564:3: 'VirtualModel'
                    {
                    match(input,25,FOLLOW_25_in_rule__VMTYPE__Alternatives1166); 

                    }

                     after(grammarAccess.getVMTYPEAccess().getVMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMTYPE__Alternatives"


    // $ANTLR start "rule__ViewDef__Group__0"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:576:1: rule__ViewDef__Group__0 : rule__ViewDef__Group__0__Impl rule__ViewDef__Group__1 ;
    public final void rule__ViewDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:580:1: ( rule__ViewDef__Group__0__Impl rule__ViewDef__Group__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:581:2: rule__ViewDef__Group__0__Impl rule__ViewDef__Group__1
            {
            pushFollow(FOLLOW_rule__ViewDef__Group__0__Impl_in_rule__ViewDef__Group__01199);
            rule__ViewDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDef__Group__1_in_rule__ViewDef__Group__01202);
            rule__ViewDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDef__Group__0"


    // $ANTLR start "rule__ViewDef__Group__0__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:588:1: rule__ViewDef__Group__0__Impl : ( 'ViewDefinition' ) ;
    public final void rule__ViewDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:592:1: ( ( 'ViewDefinition' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:593:1: ( 'ViewDefinition' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:593:1: ( 'ViewDefinition' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:594:1: 'ViewDefinition'
            {
             before(grammarAccess.getViewDefAccess().getViewDefinitionKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__ViewDef__Group__0__Impl1230); 
             after(grammarAccess.getViewDefAccess().getViewDefinitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDef__Group__0__Impl"


    // $ANTLR start "rule__ViewDef__Group__1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:607:1: rule__ViewDef__Group__1 : rule__ViewDef__Group__1__Impl rule__ViewDef__Group__2 ;
    public final void rule__ViewDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:611:1: ( rule__ViewDef__Group__1__Impl rule__ViewDef__Group__2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:612:2: rule__ViewDef__Group__1__Impl rule__ViewDef__Group__2
            {
            pushFollow(FOLLOW_rule__ViewDef__Group__1__Impl_in_rule__ViewDef__Group__11261);
            rule__ViewDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDef__Group__2_in_rule__ViewDef__Group__11264);
            rule__ViewDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDef__Group__1"


    // $ANTLR start "rule__ViewDef__Group__1__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:619:1: rule__ViewDef__Group__1__Impl : ( ( rule__ViewDef__NameAssignment_1 ) ) ;
    public final void rule__ViewDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:623:1: ( ( ( rule__ViewDef__NameAssignment_1 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:624:1: ( ( rule__ViewDef__NameAssignment_1 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:624:1: ( ( rule__ViewDef__NameAssignment_1 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:625:1: ( rule__ViewDef__NameAssignment_1 )
            {
             before(grammarAccess.getViewDefAccess().getNameAssignment_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:626:1: ( rule__ViewDef__NameAssignment_1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:626:2: rule__ViewDef__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ViewDef__NameAssignment_1_in_rule__ViewDef__Group__1__Impl1291);
            rule__ViewDef__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getViewDefAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDef__Group__1__Impl"


    // $ANTLR start "rule__ViewDef__Group__2"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:636:1: rule__ViewDef__Group__2 : rule__ViewDef__Group__2__Impl rule__ViewDef__Group__3 ;
    public final void rule__ViewDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:640:1: ( rule__ViewDef__Group__2__Impl rule__ViewDef__Group__3 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:641:2: rule__ViewDef__Group__2__Impl rule__ViewDef__Group__3
            {
            pushFollow(FOLLOW_rule__ViewDef__Group__2__Impl_in_rule__ViewDef__Group__21321);
            rule__ViewDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDef__Group__3_in_rule__ViewDef__Group__21324);
            rule__ViewDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDef__Group__2"


    // $ANTLR start "rule__ViewDef__Group__2__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:648:1: rule__ViewDef__Group__2__Impl : ( ( ( 'uri' ) ) ( ( 'uri' )* ) ) ;
    public final void rule__ViewDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:652:1: ( ( ( ( 'uri' ) ) ( ( 'uri' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:653:1: ( ( ( 'uri' ) ) ( ( 'uri' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:653:1: ( ( ( 'uri' ) ) ( ( 'uri' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:654:1: ( ( 'uri' ) ) ( ( 'uri' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:654:1: ( ( 'uri' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:655:1: ( 'uri' )
            {
             before(grammarAccess.getViewDefAccess().getUriKeyword_2()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:656:1: ( 'uri' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:657:2: 'uri'
            {
            match(input,27,FOLLOW_27_in_rule__ViewDef__Group__2__Impl1355); 

            }

             after(grammarAccess.getViewDefAccess().getUriKeyword_2()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:661:1: ( ( 'uri' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:662:1: ( 'uri' )*
            {
             before(grammarAccess.getViewDefAccess().getUriKeyword_2()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:663:1: ( 'uri' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:664:2: 'uri'
            	    {
            	    match(input,27,FOLLOW_27_in_rule__ViewDef__Group__2__Impl1371); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getViewDefAccess().getUriKeyword_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDef__Group__2__Impl"


    // $ANTLR start "rule__ViewDef__Group__3"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:676:1: rule__ViewDef__Group__3 : rule__ViewDef__Group__3__Impl rule__ViewDef__Group__4 ;
    public final void rule__ViewDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:680:1: ( rule__ViewDef__Group__3__Impl rule__ViewDef__Group__4 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:681:2: rule__ViewDef__Group__3__Impl rule__ViewDef__Group__4
            {
            pushFollow(FOLLOW_rule__ViewDef__Group__3__Impl_in_rule__ViewDef__Group__31406);
            rule__ViewDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDef__Group__4_in_rule__ViewDef__Group__31409);
            rule__ViewDef__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDef__Group__3"


    // $ANTLR start "rule__ViewDef__Group__3__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:688:1: rule__ViewDef__Group__3__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__ViewDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:692:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:693:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:693:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:694:1: ( ( '=' ) ) ( ( '=' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:694:1: ( ( '=' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:695:1: ( '=' )
            {
             before(grammarAccess.getViewDefAccess().getEqualsSignKeyword_3()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:696:1: ( '=' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:697:2: '='
            {
            match(input,28,FOLLOW_28_in_rule__ViewDef__Group__3__Impl1440); 

            }

             after(grammarAccess.getViewDefAccess().getEqualsSignKeyword_3()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:701:1: ( ( '=' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:702:1: ( '=' )*
            {
             before(grammarAccess.getViewDefAccess().getEqualsSignKeyword_3()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:703:1: ( '=' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:704:2: '='
            	    {
            	    match(input,28,FOLLOW_28_in_rule__ViewDef__Group__3__Impl1456); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getViewDefAccess().getEqualsSignKeyword_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDef__Group__3__Impl"


    // $ANTLR start "rule__ViewDef__Group__4"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:716:1: rule__ViewDef__Group__4 : rule__ViewDef__Group__4__Impl rule__ViewDef__Group__5 ;
    public final void rule__ViewDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:720:1: ( rule__ViewDef__Group__4__Impl rule__ViewDef__Group__5 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:721:2: rule__ViewDef__Group__4__Impl rule__ViewDef__Group__5
            {
            pushFollow(FOLLOW_rule__ViewDef__Group__4__Impl_in_rule__ViewDef__Group__41491);
            rule__ViewDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDef__Group__5_in_rule__ViewDef__Group__41494);
            rule__ViewDef__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDef__Group__4"


    // $ANTLR start "rule__ViewDef__Group__4__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:728:1: rule__ViewDef__Group__4__Impl : ( ( rule__ViewDef__UriAssignment_4 ) ) ;
    public final void rule__ViewDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:732:1: ( ( ( rule__ViewDef__UriAssignment_4 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:733:1: ( ( rule__ViewDef__UriAssignment_4 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:733:1: ( ( rule__ViewDef__UriAssignment_4 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:734:1: ( rule__ViewDef__UriAssignment_4 )
            {
             before(grammarAccess.getViewDefAccess().getUriAssignment_4()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:735:1: ( rule__ViewDef__UriAssignment_4 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:735:2: rule__ViewDef__UriAssignment_4
            {
            pushFollow(FOLLOW_rule__ViewDef__UriAssignment_4_in_rule__ViewDef__Group__4__Impl1521);
            rule__ViewDef__UriAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getViewDefAccess().getUriAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDef__Group__4__Impl"


    // $ANTLR start "rule__ViewDef__Group__5"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:745:1: rule__ViewDef__Group__5 : rule__ViewDef__Group__5__Impl rule__ViewDef__Group__6 ;
    public final void rule__ViewDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:749:1: ( rule__ViewDef__Group__5__Impl rule__ViewDef__Group__6 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:750:2: rule__ViewDef__Group__5__Impl rule__ViewDef__Group__6
            {
            pushFollow(FOLLOW_rule__ViewDef__Group__5__Impl_in_rule__ViewDef__Group__51551);
            rule__ViewDef__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDef__Group__6_in_rule__ViewDef__Group__51554);
            rule__ViewDef__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDef__Group__5"


    // $ANTLR start "rule__ViewDef__Group__5__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:757:1: rule__ViewDef__Group__5__Impl : ( '{' ) ;
    public final void rule__ViewDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:761:1: ( ( '{' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:762:1: ( '{' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:762:1: ( '{' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:763:1: '{'
            {
             before(grammarAccess.getViewDefAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__ViewDef__Group__5__Impl1582); 
             after(grammarAccess.getViewDefAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDef__Group__5__Impl"


    // $ANTLR start "rule__ViewDef__Group__6"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:776:1: rule__ViewDef__Group__6 : rule__ViewDef__Group__6__Impl rule__ViewDef__Group__7 ;
    public final void rule__ViewDef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:780:1: ( rule__ViewDef__Group__6__Impl rule__ViewDef__Group__7 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:781:2: rule__ViewDef__Group__6__Impl rule__ViewDef__Group__7
            {
            pushFollow(FOLLOW_rule__ViewDef__Group__6__Impl_in_rule__ViewDef__Group__61613);
            rule__ViewDef__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDef__Group__7_in_rule__ViewDef__Group__61616);
            rule__ViewDef__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDef__Group__6"


    // $ANTLR start "rule__ViewDef__Group__6__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:788:1: rule__ViewDef__Group__6__Impl : ( ( rule__ViewDef__ElementsAssignment_6 )* ) ;
    public final void rule__ViewDef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:792:1: ( ( ( rule__ViewDef__ElementsAssignment_6 )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:793:1: ( ( rule__ViewDef__ElementsAssignment_6 )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:793:1: ( ( rule__ViewDef__ElementsAssignment_6 )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:794:1: ( rule__ViewDef__ElementsAssignment_6 )*
            {
             before(grammarAccess.getViewDefAccess().getElementsAssignment_6()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:795:1: ( rule__ViewDef__ElementsAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:795:2: rule__ViewDef__ElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__ViewDef__ElementsAssignment_6_in_rule__ViewDef__Group__6__Impl1643);
            	    rule__ViewDef__ElementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getViewDefAccess().getElementsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDef__Group__6__Impl"


    // $ANTLR start "rule__ViewDef__Group__7"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:805:1: rule__ViewDef__Group__7 : rule__ViewDef__Group__7__Impl ;
    public final void rule__ViewDef__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:809:1: ( rule__ViewDef__Group__7__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:810:2: rule__ViewDef__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ViewDef__Group__7__Impl_in_rule__ViewDef__Group__71674);
            rule__ViewDef__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDef__Group__7"


    // $ANTLR start "rule__ViewDef__Group__7__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:816:1: rule__ViewDef__Group__7__Impl : ( '}' ) ;
    public final void rule__ViewDef__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:820:1: ( ( '}' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:821:1: ( '}' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:821:1: ( '}' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:822:1: '}'
            {
             before(grammarAccess.getViewDefAccess().getRightCurlyBracketKeyword_7()); 
            match(input,30,FOLLOW_30_in_rule__ViewDef__Group__7__Impl1702); 
             after(grammarAccess.getViewDefAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDef__Group__7__Impl"


    // $ANTLR start "rule__VirtualModel__Group__0"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:851:1: rule__VirtualModel__Group__0 : rule__VirtualModel__Group__0__Impl rule__VirtualModel__Group__1 ;
    public final void rule__VirtualModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:855:1: ( rule__VirtualModel__Group__0__Impl rule__VirtualModel__Group__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:856:2: rule__VirtualModel__Group__0__Impl rule__VirtualModel__Group__1
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group__0__Impl_in_rule__VirtualModel__Group__01749);
            rule__VirtualModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VirtualModel__Group__1_in_rule__VirtualModel__Group__01752);
            rule__VirtualModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group__0"


    // $ANTLR start "rule__VirtualModel__Group__0__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:863:1: rule__VirtualModel__Group__0__Impl : ( 'VirtualModel' ) ;
    public final void rule__VirtualModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:867:1: ( ( 'VirtualModel' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:868:1: ( 'VirtualModel' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:868:1: ( 'VirtualModel' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:869:1: 'VirtualModel'
            {
             before(grammarAccess.getVirtualModelAccess().getVirtualModelKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__VirtualModel__Group__0__Impl1780); 
             after(grammarAccess.getVirtualModelAccess().getVirtualModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group__0__Impl"


    // $ANTLR start "rule__VirtualModel__Group__1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:882:1: rule__VirtualModel__Group__1 : rule__VirtualModel__Group__1__Impl rule__VirtualModel__Group__2 ;
    public final void rule__VirtualModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:886:1: ( rule__VirtualModel__Group__1__Impl rule__VirtualModel__Group__2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:887:2: rule__VirtualModel__Group__1__Impl rule__VirtualModel__Group__2
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group__1__Impl_in_rule__VirtualModel__Group__11811);
            rule__VirtualModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VirtualModel__Group__2_in_rule__VirtualModel__Group__11814);
            rule__VirtualModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group__1"


    // $ANTLR start "rule__VirtualModel__Group__1__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:894:1: rule__VirtualModel__Group__1__Impl : ( ( rule__VirtualModel__NameAssignment_1 ) ) ;
    public final void rule__VirtualModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:898:1: ( ( ( rule__VirtualModel__NameAssignment_1 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:899:1: ( ( rule__VirtualModel__NameAssignment_1 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:899:1: ( ( rule__VirtualModel__NameAssignment_1 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:900:1: ( rule__VirtualModel__NameAssignment_1 )
            {
             before(grammarAccess.getVirtualModelAccess().getNameAssignment_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:901:1: ( rule__VirtualModel__NameAssignment_1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:901:2: rule__VirtualModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VirtualModel__NameAssignment_1_in_rule__VirtualModel__Group__1__Impl1841);
            rule__VirtualModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVirtualModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group__1__Impl"


    // $ANTLR start "rule__VirtualModel__Group__2"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:911:1: rule__VirtualModel__Group__2 : rule__VirtualModel__Group__2__Impl rule__VirtualModel__Group__3 ;
    public final void rule__VirtualModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:915:1: ( rule__VirtualModel__Group__2__Impl rule__VirtualModel__Group__3 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:916:2: rule__VirtualModel__Group__2__Impl rule__VirtualModel__Group__3
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group__2__Impl_in_rule__VirtualModel__Group__21871);
            rule__VirtualModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VirtualModel__Group__3_in_rule__VirtualModel__Group__21874);
            rule__VirtualModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group__2"


    // $ANTLR start "rule__VirtualModel__Group__2__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:923:1: rule__VirtualModel__Group__2__Impl : ( ( rule__VirtualModel__Group_2__0 )? ) ;
    public final void rule__VirtualModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:927:1: ( ( ( rule__VirtualModel__Group_2__0 )? ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:928:1: ( ( rule__VirtualModel__Group_2__0 )? )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:928:1: ( ( rule__VirtualModel__Group_2__0 )? )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:929:1: ( rule__VirtualModel__Group_2__0 )?
            {
             before(grammarAccess.getVirtualModelAccess().getGroup_2()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:930:1: ( rule__VirtualModel__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:930:2: rule__VirtualModel__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__VirtualModel__Group_2__0_in_rule__VirtualModel__Group__2__Impl1901);
                    rule__VirtualModel__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVirtualModelAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group__2__Impl"


    // $ANTLR start "rule__VirtualModel__Group__3"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:940:1: rule__VirtualModel__Group__3 : rule__VirtualModel__Group__3__Impl rule__VirtualModel__Group__4 ;
    public final void rule__VirtualModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:944:1: ( rule__VirtualModel__Group__3__Impl rule__VirtualModel__Group__4 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:945:2: rule__VirtualModel__Group__3__Impl rule__VirtualModel__Group__4
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group__3__Impl_in_rule__VirtualModel__Group__31932);
            rule__VirtualModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VirtualModel__Group__4_in_rule__VirtualModel__Group__31935);
            rule__VirtualModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group__3"


    // $ANTLR start "rule__VirtualModel__Group__3__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:952:1: rule__VirtualModel__Group__3__Impl : ( ( ( 'uri' ) ) ( ( 'uri' )* ) ) ;
    public final void rule__VirtualModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:956:1: ( ( ( ( 'uri' ) ) ( ( 'uri' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:957:1: ( ( ( 'uri' ) ) ( ( 'uri' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:957:1: ( ( ( 'uri' ) ) ( ( 'uri' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:958:1: ( ( 'uri' ) ) ( ( 'uri' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:958:1: ( ( 'uri' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:959:1: ( 'uri' )
            {
             before(grammarAccess.getVirtualModelAccess().getUriKeyword_3()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:960:1: ( 'uri' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:961:2: 'uri'
            {
            match(input,27,FOLLOW_27_in_rule__VirtualModel__Group__3__Impl1966); 

            }

             after(grammarAccess.getVirtualModelAccess().getUriKeyword_3()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:965:1: ( ( 'uri' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:966:1: ( 'uri' )*
            {
             before(grammarAccess.getVirtualModelAccess().getUriKeyword_3()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:967:1: ( 'uri' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:968:2: 'uri'
            	    {
            	    match(input,27,FOLLOW_27_in_rule__VirtualModel__Group__3__Impl1982); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getVirtualModelAccess().getUriKeyword_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group__3__Impl"


    // $ANTLR start "rule__VirtualModel__Group__4"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:980:1: rule__VirtualModel__Group__4 : rule__VirtualModel__Group__4__Impl rule__VirtualModel__Group__5 ;
    public final void rule__VirtualModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:984:1: ( rule__VirtualModel__Group__4__Impl rule__VirtualModel__Group__5 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:985:2: rule__VirtualModel__Group__4__Impl rule__VirtualModel__Group__5
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group__4__Impl_in_rule__VirtualModel__Group__42017);
            rule__VirtualModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VirtualModel__Group__5_in_rule__VirtualModel__Group__42020);
            rule__VirtualModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group__4"


    // $ANTLR start "rule__VirtualModel__Group__4__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:992:1: rule__VirtualModel__Group__4__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__VirtualModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:996:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:997:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:997:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:998:1: ( ( '=' ) ) ( ( '=' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:998:1: ( ( '=' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:999:1: ( '=' )
            {
             before(grammarAccess.getVirtualModelAccess().getEqualsSignKeyword_4()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1000:1: ( '=' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1001:2: '='
            {
            match(input,28,FOLLOW_28_in_rule__VirtualModel__Group__4__Impl2051); 

            }

             after(grammarAccess.getVirtualModelAccess().getEqualsSignKeyword_4()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1005:1: ( ( '=' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1006:1: ( '=' )*
            {
             before(grammarAccess.getVirtualModelAccess().getEqualsSignKeyword_4()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1007:1: ( '=' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1008:2: '='
            	    {
            	    match(input,28,FOLLOW_28_in_rule__VirtualModel__Group__4__Impl2067); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getVirtualModelAccess().getEqualsSignKeyword_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group__4__Impl"


    // $ANTLR start "rule__VirtualModel__Group__5"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1020:1: rule__VirtualModel__Group__5 : rule__VirtualModel__Group__5__Impl rule__VirtualModel__Group__6 ;
    public final void rule__VirtualModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1024:1: ( rule__VirtualModel__Group__5__Impl rule__VirtualModel__Group__6 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1025:2: rule__VirtualModel__Group__5__Impl rule__VirtualModel__Group__6
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group__5__Impl_in_rule__VirtualModel__Group__52102);
            rule__VirtualModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VirtualModel__Group__6_in_rule__VirtualModel__Group__52105);
            rule__VirtualModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group__5"


    // $ANTLR start "rule__VirtualModel__Group__5__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1032:1: rule__VirtualModel__Group__5__Impl : ( ( rule__VirtualModel__UriAssignment_5 ) ) ;
    public final void rule__VirtualModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1036:1: ( ( ( rule__VirtualModel__UriAssignment_5 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1037:1: ( ( rule__VirtualModel__UriAssignment_5 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1037:1: ( ( rule__VirtualModel__UriAssignment_5 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1038:1: ( rule__VirtualModel__UriAssignment_5 )
            {
             before(grammarAccess.getVirtualModelAccess().getUriAssignment_5()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1039:1: ( rule__VirtualModel__UriAssignment_5 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1039:2: rule__VirtualModel__UriAssignment_5
            {
            pushFollow(FOLLOW_rule__VirtualModel__UriAssignment_5_in_rule__VirtualModel__Group__5__Impl2132);
            rule__VirtualModel__UriAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getVirtualModelAccess().getUriAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group__5__Impl"


    // $ANTLR start "rule__VirtualModel__Group__6"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1049:1: rule__VirtualModel__Group__6 : rule__VirtualModel__Group__6__Impl rule__VirtualModel__Group__7 ;
    public final void rule__VirtualModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1053:1: ( rule__VirtualModel__Group__6__Impl rule__VirtualModel__Group__7 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1054:2: rule__VirtualModel__Group__6__Impl rule__VirtualModel__Group__7
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group__6__Impl_in_rule__VirtualModel__Group__62162);
            rule__VirtualModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VirtualModel__Group__7_in_rule__VirtualModel__Group__62165);
            rule__VirtualModel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group__6"


    // $ANTLR start "rule__VirtualModel__Group__6__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1061:1: rule__VirtualModel__Group__6__Impl : ( '{' ) ;
    public final void rule__VirtualModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1065:1: ( ( '{' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1066:1: ( '{' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1066:1: ( '{' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1067:1: '{'
            {
             before(grammarAccess.getVirtualModelAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,29,FOLLOW_29_in_rule__VirtualModel__Group__6__Impl2193); 
             after(grammarAccess.getVirtualModelAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group__6__Impl"


    // $ANTLR start "rule__VirtualModel__Group__7"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1080:1: rule__VirtualModel__Group__7 : rule__VirtualModel__Group__7__Impl rule__VirtualModel__Group__8 ;
    public final void rule__VirtualModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1084:1: ( rule__VirtualModel__Group__7__Impl rule__VirtualModel__Group__8 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1085:2: rule__VirtualModel__Group__7__Impl rule__VirtualModel__Group__8
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group__7__Impl_in_rule__VirtualModel__Group__72224);
            rule__VirtualModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VirtualModel__Group__8_in_rule__VirtualModel__Group__72227);
            rule__VirtualModel__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group__7"


    // $ANTLR start "rule__VirtualModel__Group__7__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1092:1: rule__VirtualModel__Group__7__Impl : ( ( rule__VirtualModel__ModelSlotsAssignment_7 )* ) ;
    public final void rule__VirtualModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1096:1: ( ( ( rule__VirtualModel__ModelSlotsAssignment_7 )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1097:1: ( ( rule__VirtualModel__ModelSlotsAssignment_7 )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1097:1: ( ( rule__VirtualModel__ModelSlotsAssignment_7 )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1098:1: ( rule__VirtualModel__ModelSlotsAssignment_7 )*
            {
             before(grammarAccess.getVirtualModelAccess().getModelSlotsAssignment_7()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1099:1: ( rule__VirtualModel__ModelSlotsAssignment_7 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==32) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1099:2: rule__VirtualModel__ModelSlotsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__VirtualModel__ModelSlotsAssignment_7_in_rule__VirtualModel__Group__7__Impl2254);
            	    rule__VirtualModel__ModelSlotsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getVirtualModelAccess().getModelSlotsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group__7__Impl"


    // $ANTLR start "rule__VirtualModel__Group__8"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1109:1: rule__VirtualModel__Group__8 : rule__VirtualModel__Group__8__Impl rule__VirtualModel__Group__9 ;
    public final void rule__VirtualModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1113:1: ( rule__VirtualModel__Group__8__Impl rule__VirtualModel__Group__9 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1114:2: rule__VirtualModel__Group__8__Impl rule__VirtualModel__Group__9
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group__8__Impl_in_rule__VirtualModel__Group__82285);
            rule__VirtualModel__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VirtualModel__Group__9_in_rule__VirtualModel__Group__82288);
            rule__VirtualModel__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group__8"


    // $ANTLR start "rule__VirtualModel__Group__8__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1121:1: rule__VirtualModel__Group__8__Impl : ( ( rule__VirtualModel__EditionPatternsAssignment_8 )* ) ;
    public final void rule__VirtualModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1125:1: ( ( ( rule__VirtualModel__EditionPatternsAssignment_8 )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1126:1: ( ( rule__VirtualModel__EditionPatternsAssignment_8 )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1126:1: ( ( rule__VirtualModel__EditionPatternsAssignment_8 )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1127:1: ( rule__VirtualModel__EditionPatternsAssignment_8 )*
            {
             before(grammarAccess.getVirtualModelAccess().getEditionPatternsAssignment_8()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1128:1: ( rule__VirtualModel__EditionPatternsAssignment_8 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1128:2: rule__VirtualModel__EditionPatternsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__VirtualModel__EditionPatternsAssignment_8_in_rule__VirtualModel__Group__8__Impl2315);
            	    rule__VirtualModel__EditionPatternsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getVirtualModelAccess().getEditionPatternsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group__8__Impl"


    // $ANTLR start "rule__VirtualModel__Group__9"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1138:1: rule__VirtualModel__Group__9 : rule__VirtualModel__Group__9__Impl ;
    public final void rule__VirtualModel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1142:1: ( rule__VirtualModel__Group__9__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1143:2: rule__VirtualModel__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group__9__Impl_in_rule__VirtualModel__Group__92346);
            rule__VirtualModel__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group__9"


    // $ANTLR start "rule__VirtualModel__Group__9__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1149:1: rule__VirtualModel__Group__9__Impl : ( '}' ) ;
    public final void rule__VirtualModel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1153:1: ( ( '}' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1154:1: ( '}' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1154:1: ( '}' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1155:1: '}'
            {
             before(grammarAccess.getVirtualModelAccess().getRightCurlyBracketKeyword_9()); 
            match(input,30,FOLLOW_30_in_rule__VirtualModel__Group__9__Impl2374); 
             after(grammarAccess.getVirtualModelAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group__9__Impl"


    // $ANTLR start "rule__VirtualModel__Group_2__0"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1188:1: rule__VirtualModel__Group_2__0 : rule__VirtualModel__Group_2__0__Impl rule__VirtualModel__Group_2__1 ;
    public final void rule__VirtualModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1192:1: ( rule__VirtualModel__Group_2__0__Impl rule__VirtualModel__Group_2__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1193:2: rule__VirtualModel__Group_2__0__Impl rule__VirtualModel__Group_2__1
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group_2__0__Impl_in_rule__VirtualModel__Group_2__02425);
            rule__VirtualModel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VirtualModel__Group_2__1_in_rule__VirtualModel__Group_2__02428);
            rule__VirtualModel__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group_2__0"


    // $ANTLR start "rule__VirtualModel__Group_2__0__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1200:1: rule__VirtualModel__Group_2__0__Impl : ( ( ( 'type' ) ) ( ( 'type' )* ) ) ;
    public final void rule__VirtualModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1204:1: ( ( ( ( 'type' ) ) ( ( 'type' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1205:1: ( ( ( 'type' ) ) ( ( 'type' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1205:1: ( ( ( 'type' ) ) ( ( 'type' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1206:1: ( ( 'type' ) ) ( ( 'type' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1206:1: ( ( 'type' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1207:1: ( 'type' )
            {
             before(grammarAccess.getVirtualModelAccess().getTypeKeyword_2_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1208:1: ( 'type' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1209:2: 'type'
            {
            match(input,31,FOLLOW_31_in_rule__VirtualModel__Group_2__0__Impl2459); 

            }

             after(grammarAccess.getVirtualModelAccess().getTypeKeyword_2_0()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1213:1: ( ( 'type' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1214:1: ( 'type' )*
            {
             before(grammarAccess.getVirtualModelAccess().getTypeKeyword_2_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1215:1: ( 'type' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1216:2: 'type'
            	    {
            	    match(input,31,FOLLOW_31_in_rule__VirtualModel__Group_2__0__Impl2475); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getVirtualModelAccess().getTypeKeyword_2_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group_2__0__Impl"


    // $ANTLR start "rule__VirtualModel__Group_2__1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1228:1: rule__VirtualModel__Group_2__1 : rule__VirtualModel__Group_2__1__Impl rule__VirtualModel__Group_2__2 ;
    public final void rule__VirtualModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1232:1: ( rule__VirtualModel__Group_2__1__Impl rule__VirtualModel__Group_2__2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1233:2: rule__VirtualModel__Group_2__1__Impl rule__VirtualModel__Group_2__2
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group_2__1__Impl_in_rule__VirtualModel__Group_2__12510);
            rule__VirtualModel__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VirtualModel__Group_2__2_in_rule__VirtualModel__Group_2__12513);
            rule__VirtualModel__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group_2__1"


    // $ANTLR start "rule__VirtualModel__Group_2__1__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1240:1: rule__VirtualModel__Group_2__1__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__VirtualModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1244:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1245:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1245:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1246:1: ( ( '=' ) ) ( ( '=' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1246:1: ( ( '=' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1247:1: ( '=' )
            {
             before(grammarAccess.getVirtualModelAccess().getEqualsSignKeyword_2_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1248:1: ( '=' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1249:2: '='
            {
            match(input,28,FOLLOW_28_in_rule__VirtualModel__Group_2__1__Impl2544); 

            }

             after(grammarAccess.getVirtualModelAccess().getEqualsSignKeyword_2_1()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1253:1: ( ( '=' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1254:1: ( '=' )*
            {
             before(grammarAccess.getVirtualModelAccess().getEqualsSignKeyword_2_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1255:1: ( '=' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1256:2: '='
            	    {
            	    match(input,28,FOLLOW_28_in_rule__VirtualModel__Group_2__1__Impl2560); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getVirtualModelAccess().getEqualsSignKeyword_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group_2__1__Impl"


    // $ANTLR start "rule__VirtualModel__Group_2__2"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1268:1: rule__VirtualModel__Group_2__2 : rule__VirtualModel__Group_2__2__Impl ;
    public final void rule__VirtualModel__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1272:1: ( rule__VirtualModel__Group_2__2__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1273:2: rule__VirtualModel__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group_2__2__Impl_in_rule__VirtualModel__Group_2__22595);
            rule__VirtualModel__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group_2__2"


    // $ANTLR start "rule__VirtualModel__Group_2__2__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1279:1: rule__VirtualModel__Group_2__2__Impl : ( ( rule__VirtualModel__TypeAssignment_2_2 ) ) ;
    public final void rule__VirtualModel__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1283:1: ( ( ( rule__VirtualModel__TypeAssignment_2_2 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1284:1: ( ( rule__VirtualModel__TypeAssignment_2_2 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1284:1: ( ( rule__VirtualModel__TypeAssignment_2_2 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1285:1: ( rule__VirtualModel__TypeAssignment_2_2 )
            {
             before(grammarAccess.getVirtualModelAccess().getTypeAssignment_2_2()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1286:1: ( rule__VirtualModel__TypeAssignment_2_2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1286:2: rule__VirtualModel__TypeAssignment_2_2
            {
            pushFollow(FOLLOW_rule__VirtualModel__TypeAssignment_2_2_in_rule__VirtualModel__Group_2__2__Impl2622);
            rule__VirtualModel__TypeAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getVirtualModelAccess().getTypeAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__Group_2__2__Impl"


    // $ANTLR start "rule__ModelSlot__Group__0"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1302:1: rule__ModelSlot__Group__0 : rule__ModelSlot__Group__0__Impl rule__ModelSlot__Group__1 ;
    public final void rule__ModelSlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1306:1: ( rule__ModelSlot__Group__0__Impl rule__ModelSlot__Group__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1307:2: rule__ModelSlot__Group__0__Impl rule__ModelSlot__Group__1
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__0__Impl_in_rule__ModelSlot__Group__02658);
            rule__ModelSlot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__1_in_rule__ModelSlot__Group__02661);
            rule__ModelSlot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__0"


    // $ANTLR start "rule__ModelSlot__Group__0__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1314:1: rule__ModelSlot__Group__0__Impl : ( 'ModelSlot' ) ;
    public final void rule__ModelSlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1318:1: ( ( 'ModelSlot' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1319:1: ( 'ModelSlot' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1319:1: ( 'ModelSlot' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1320:1: 'ModelSlot'
            {
             before(grammarAccess.getModelSlotAccess().getModelSlotKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__ModelSlot__Group__0__Impl2689); 
             after(grammarAccess.getModelSlotAccess().getModelSlotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__0__Impl"


    // $ANTLR start "rule__ModelSlot__Group__1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1333:1: rule__ModelSlot__Group__1 : rule__ModelSlot__Group__1__Impl rule__ModelSlot__Group__2 ;
    public final void rule__ModelSlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1337:1: ( rule__ModelSlot__Group__1__Impl rule__ModelSlot__Group__2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1338:2: rule__ModelSlot__Group__1__Impl rule__ModelSlot__Group__2
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__1__Impl_in_rule__ModelSlot__Group__12720);
            rule__ModelSlot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__2_in_rule__ModelSlot__Group__12723);
            rule__ModelSlot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__1"


    // $ANTLR start "rule__ModelSlot__Group__1__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1345:1: rule__ModelSlot__Group__1__Impl : ( ( rule__ModelSlot__NameAssignment_1 ) ) ;
    public final void rule__ModelSlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1349:1: ( ( ( rule__ModelSlot__NameAssignment_1 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1350:1: ( ( rule__ModelSlot__NameAssignment_1 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1350:1: ( ( rule__ModelSlot__NameAssignment_1 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1351:1: ( rule__ModelSlot__NameAssignment_1 )
            {
             before(grammarAccess.getModelSlotAccess().getNameAssignment_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1352:1: ( rule__ModelSlot__NameAssignment_1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1352:2: rule__ModelSlot__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ModelSlot__NameAssignment_1_in_rule__ModelSlot__Group__1__Impl2750);
            rule__ModelSlot__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelSlotAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__1__Impl"


    // $ANTLR start "rule__ModelSlot__Group__2"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1362:1: rule__ModelSlot__Group__2 : rule__ModelSlot__Group__2__Impl rule__ModelSlot__Group__3 ;
    public final void rule__ModelSlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1366:1: ( rule__ModelSlot__Group__2__Impl rule__ModelSlot__Group__3 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1367:2: rule__ModelSlot__Group__2__Impl rule__ModelSlot__Group__3
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__2__Impl_in_rule__ModelSlot__Group__22780);
            rule__ModelSlot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__3_in_rule__ModelSlot__Group__22783);
            rule__ModelSlot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__2"


    // $ANTLR start "rule__ModelSlot__Group__2__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1374:1: rule__ModelSlot__Group__2__Impl : ( ( ( 'type' ) ) ( ( 'type' )* ) ) ;
    public final void rule__ModelSlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1378:1: ( ( ( ( 'type' ) ) ( ( 'type' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1379:1: ( ( ( 'type' ) ) ( ( 'type' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1379:1: ( ( ( 'type' ) ) ( ( 'type' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1380:1: ( ( 'type' ) ) ( ( 'type' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1380:1: ( ( 'type' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1381:1: ( 'type' )
            {
             before(grammarAccess.getModelSlotAccess().getTypeKeyword_2()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1382:1: ( 'type' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1383:2: 'type'
            {
            match(input,31,FOLLOW_31_in_rule__ModelSlot__Group__2__Impl2814); 

            }

             after(grammarAccess.getModelSlotAccess().getTypeKeyword_2()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1387:1: ( ( 'type' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1388:1: ( 'type' )*
            {
             before(grammarAccess.getModelSlotAccess().getTypeKeyword_2()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1389:1: ( 'type' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1390:2: 'type'
            	    {
            	    match(input,31,FOLLOW_31_in_rule__ModelSlot__Group__2__Impl2830); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getModelSlotAccess().getTypeKeyword_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__2__Impl"


    // $ANTLR start "rule__ModelSlot__Group__3"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1402:1: rule__ModelSlot__Group__3 : rule__ModelSlot__Group__3__Impl rule__ModelSlot__Group__4 ;
    public final void rule__ModelSlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1406:1: ( rule__ModelSlot__Group__3__Impl rule__ModelSlot__Group__4 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1407:2: rule__ModelSlot__Group__3__Impl rule__ModelSlot__Group__4
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__3__Impl_in_rule__ModelSlot__Group__32865);
            rule__ModelSlot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__4_in_rule__ModelSlot__Group__32868);
            rule__ModelSlot__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__3"


    // $ANTLR start "rule__ModelSlot__Group__3__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1414:1: rule__ModelSlot__Group__3__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__ModelSlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1418:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1419:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1419:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1420:1: ( ( '=' ) ) ( ( '=' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1420:1: ( ( '=' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1421:1: ( '=' )
            {
             before(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_3()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1422:1: ( '=' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1423:2: '='
            {
            match(input,28,FOLLOW_28_in_rule__ModelSlot__Group__3__Impl2899); 

            }

             after(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_3()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1427:1: ( ( '=' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1428:1: ( '=' )*
            {
             before(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_3()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1429:1: ( '=' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1430:2: '='
            	    {
            	    match(input,28,FOLLOW_28_in_rule__ModelSlot__Group__3__Impl2915); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__3__Impl"


    // $ANTLR start "rule__ModelSlot__Group__4"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1442:1: rule__ModelSlot__Group__4 : rule__ModelSlot__Group__4__Impl rule__ModelSlot__Group__5 ;
    public final void rule__ModelSlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1446:1: ( rule__ModelSlot__Group__4__Impl rule__ModelSlot__Group__5 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1447:2: rule__ModelSlot__Group__4__Impl rule__ModelSlot__Group__5
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__4__Impl_in_rule__ModelSlot__Group__42950);
            rule__ModelSlot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__5_in_rule__ModelSlot__Group__42953);
            rule__ModelSlot__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__4"


    // $ANTLR start "rule__ModelSlot__Group__4__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1454:1: rule__ModelSlot__Group__4__Impl : ( ( rule__ModelSlot__TypeAssignment_4 ) ) ;
    public final void rule__ModelSlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1458:1: ( ( ( rule__ModelSlot__TypeAssignment_4 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1459:1: ( ( rule__ModelSlot__TypeAssignment_4 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1459:1: ( ( rule__ModelSlot__TypeAssignment_4 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1460:1: ( rule__ModelSlot__TypeAssignment_4 )
            {
             before(grammarAccess.getModelSlotAccess().getTypeAssignment_4()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1461:1: ( rule__ModelSlot__TypeAssignment_4 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1461:2: rule__ModelSlot__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__ModelSlot__TypeAssignment_4_in_rule__ModelSlot__Group__4__Impl2980);
            rule__ModelSlot__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModelSlotAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__4__Impl"


    // $ANTLR start "rule__ModelSlot__Group__5"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1471:1: rule__ModelSlot__Group__5 : rule__ModelSlot__Group__5__Impl rule__ModelSlot__Group__6 ;
    public final void rule__ModelSlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1475:1: ( rule__ModelSlot__Group__5__Impl rule__ModelSlot__Group__6 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1476:2: rule__ModelSlot__Group__5__Impl rule__ModelSlot__Group__6
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__5__Impl_in_rule__ModelSlot__Group__53010);
            rule__ModelSlot__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__6_in_rule__ModelSlot__Group__53013);
            rule__ModelSlot__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__5"


    // $ANTLR start "rule__ModelSlot__Group__5__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1483:1: rule__ModelSlot__Group__5__Impl : ( ( ( 'conformTo' ) ) ( ( 'conformTo' )* ) ) ;
    public final void rule__ModelSlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1487:1: ( ( ( ( 'conformTo' ) ) ( ( 'conformTo' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1488:1: ( ( ( 'conformTo' ) ) ( ( 'conformTo' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1488:1: ( ( ( 'conformTo' ) ) ( ( 'conformTo' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1489:1: ( ( 'conformTo' ) ) ( ( 'conformTo' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1489:1: ( ( 'conformTo' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1490:1: ( 'conformTo' )
            {
             before(grammarAccess.getModelSlotAccess().getConformToKeyword_5()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1491:1: ( 'conformTo' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1492:2: 'conformTo'
            {
            match(input,33,FOLLOW_33_in_rule__ModelSlot__Group__5__Impl3044); 

            }

             after(grammarAccess.getModelSlotAccess().getConformToKeyword_5()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1496:1: ( ( 'conformTo' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1497:1: ( 'conformTo' )*
            {
             before(grammarAccess.getModelSlotAccess().getConformToKeyword_5()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1498:1: ( 'conformTo' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1499:2: 'conformTo'
            	    {
            	    match(input,33,FOLLOW_33_in_rule__ModelSlot__Group__5__Impl3060); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getModelSlotAccess().getConformToKeyword_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__5__Impl"


    // $ANTLR start "rule__ModelSlot__Group__6"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1511:1: rule__ModelSlot__Group__6 : rule__ModelSlot__Group__6__Impl rule__ModelSlot__Group__7 ;
    public final void rule__ModelSlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1515:1: ( rule__ModelSlot__Group__6__Impl rule__ModelSlot__Group__7 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1516:2: rule__ModelSlot__Group__6__Impl rule__ModelSlot__Group__7
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__6__Impl_in_rule__ModelSlot__Group__63095);
            rule__ModelSlot__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__7_in_rule__ModelSlot__Group__63098);
            rule__ModelSlot__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__6"


    // $ANTLR start "rule__ModelSlot__Group__6__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1523:1: rule__ModelSlot__Group__6__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__ModelSlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1527:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1528:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1528:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1529:1: ( ( '=' ) ) ( ( '=' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1529:1: ( ( '=' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1530:1: ( '=' )
            {
             before(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_6()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1531:1: ( '=' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1532:2: '='
            {
            match(input,28,FOLLOW_28_in_rule__ModelSlot__Group__6__Impl3129); 

            }

             after(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_6()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1536:1: ( ( '=' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1537:1: ( '=' )*
            {
             before(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_6()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1538:1: ( '=' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==28) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1539:2: '='
            	    {
            	    match(input,28,FOLLOW_28_in_rule__ModelSlot__Group__6__Impl3145); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__6__Impl"


    // $ANTLR start "rule__ModelSlot__Group__7"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1551:1: rule__ModelSlot__Group__7 : rule__ModelSlot__Group__7__Impl rule__ModelSlot__Group__8 ;
    public final void rule__ModelSlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1555:1: ( rule__ModelSlot__Group__7__Impl rule__ModelSlot__Group__8 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1556:2: rule__ModelSlot__Group__7__Impl rule__ModelSlot__Group__8
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__7__Impl_in_rule__ModelSlot__Group__73180);
            rule__ModelSlot__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__8_in_rule__ModelSlot__Group__73183);
            rule__ModelSlot__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__7"


    // $ANTLR start "rule__ModelSlot__Group__7__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1563:1: rule__ModelSlot__Group__7__Impl : ( ( rule__ModelSlot__UriAssignment_7 ) ) ;
    public final void rule__ModelSlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1567:1: ( ( ( rule__ModelSlot__UriAssignment_7 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1568:1: ( ( rule__ModelSlot__UriAssignment_7 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1568:1: ( ( rule__ModelSlot__UriAssignment_7 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1569:1: ( rule__ModelSlot__UriAssignment_7 )
            {
             before(grammarAccess.getModelSlotAccess().getUriAssignment_7()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1570:1: ( rule__ModelSlot__UriAssignment_7 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1570:2: rule__ModelSlot__UriAssignment_7
            {
            pushFollow(FOLLOW_rule__ModelSlot__UriAssignment_7_in_rule__ModelSlot__Group__7__Impl3210);
            rule__ModelSlot__UriAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getModelSlotAccess().getUriAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__7__Impl"


    // $ANTLR start "rule__ModelSlot__Group__8"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1580:1: rule__ModelSlot__Group__8 : rule__ModelSlot__Group__8__Impl rule__ModelSlot__Group__9 ;
    public final void rule__ModelSlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1584:1: ( rule__ModelSlot__Group__8__Impl rule__ModelSlot__Group__9 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1585:2: rule__ModelSlot__Group__8__Impl rule__ModelSlot__Group__9
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__8__Impl_in_rule__ModelSlot__Group__83240);
            rule__ModelSlot__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__9_in_rule__ModelSlot__Group__83243);
            rule__ModelSlot__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__8"


    // $ANTLR start "rule__ModelSlot__Group__8__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1592:1: rule__ModelSlot__Group__8__Impl : ( ( ( 'required' ) ) ( ( 'required' )* ) ) ;
    public final void rule__ModelSlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1596:1: ( ( ( ( 'required' ) ) ( ( 'required' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1597:1: ( ( ( 'required' ) ) ( ( 'required' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1597:1: ( ( ( 'required' ) ) ( ( 'required' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1598:1: ( ( 'required' ) ) ( ( 'required' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1598:1: ( ( 'required' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1599:1: ( 'required' )
            {
             before(grammarAccess.getModelSlotAccess().getRequiredKeyword_8()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1600:1: ( 'required' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1601:2: 'required'
            {
            match(input,34,FOLLOW_34_in_rule__ModelSlot__Group__8__Impl3274); 

            }

             after(grammarAccess.getModelSlotAccess().getRequiredKeyword_8()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1605:1: ( ( 'required' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1606:1: ( 'required' )*
            {
             before(grammarAccess.getModelSlotAccess().getRequiredKeyword_8()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1607:1: ( 'required' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1608:2: 'required'
            	    {
            	    match(input,34,FOLLOW_34_in_rule__ModelSlot__Group__8__Impl3290); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getModelSlotAccess().getRequiredKeyword_8()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__8__Impl"


    // $ANTLR start "rule__ModelSlot__Group__9"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1620:1: rule__ModelSlot__Group__9 : rule__ModelSlot__Group__9__Impl rule__ModelSlot__Group__10 ;
    public final void rule__ModelSlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1624:1: ( rule__ModelSlot__Group__9__Impl rule__ModelSlot__Group__10 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1625:2: rule__ModelSlot__Group__9__Impl rule__ModelSlot__Group__10
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__9__Impl_in_rule__ModelSlot__Group__93325);
            rule__ModelSlot__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__10_in_rule__ModelSlot__Group__93328);
            rule__ModelSlot__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__9"


    // $ANTLR start "rule__ModelSlot__Group__9__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1632:1: rule__ModelSlot__Group__9__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__ModelSlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1636:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1637:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1637:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1638:1: ( ( '=' ) ) ( ( '=' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1638:1: ( ( '=' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1639:1: ( '=' )
            {
             before(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_9()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1640:1: ( '=' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1641:2: '='
            {
            match(input,28,FOLLOW_28_in_rule__ModelSlot__Group__9__Impl3359); 

            }

             after(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_9()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1645:1: ( ( '=' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1646:1: ( '=' )*
            {
             before(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_9()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1647:1: ( '=' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==28) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1648:2: '='
            	    {
            	    match(input,28,FOLLOW_28_in_rule__ModelSlot__Group__9__Impl3375); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_9()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__9__Impl"


    // $ANTLR start "rule__ModelSlot__Group__10"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1660:1: rule__ModelSlot__Group__10 : rule__ModelSlot__Group__10__Impl rule__ModelSlot__Group__11 ;
    public final void rule__ModelSlot__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1664:1: ( rule__ModelSlot__Group__10__Impl rule__ModelSlot__Group__11 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1665:2: rule__ModelSlot__Group__10__Impl rule__ModelSlot__Group__11
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__10__Impl_in_rule__ModelSlot__Group__103410);
            rule__ModelSlot__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__11_in_rule__ModelSlot__Group__103413);
            rule__ModelSlot__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__10"


    // $ANTLR start "rule__ModelSlot__Group__10__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1672:1: rule__ModelSlot__Group__10__Impl : ( ( rule__ModelSlot__RequiredAssignment_10 ) ) ;
    public final void rule__ModelSlot__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1676:1: ( ( ( rule__ModelSlot__RequiredAssignment_10 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1677:1: ( ( rule__ModelSlot__RequiredAssignment_10 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1677:1: ( ( rule__ModelSlot__RequiredAssignment_10 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1678:1: ( rule__ModelSlot__RequiredAssignment_10 )
            {
             before(grammarAccess.getModelSlotAccess().getRequiredAssignment_10()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1679:1: ( rule__ModelSlot__RequiredAssignment_10 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1679:2: rule__ModelSlot__RequiredAssignment_10
            {
            pushFollow(FOLLOW_rule__ModelSlot__RequiredAssignment_10_in_rule__ModelSlot__Group__10__Impl3440);
            rule__ModelSlot__RequiredAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getModelSlotAccess().getRequiredAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__10__Impl"


    // $ANTLR start "rule__ModelSlot__Group__11"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1689:1: rule__ModelSlot__Group__11 : rule__ModelSlot__Group__11__Impl rule__ModelSlot__Group__12 ;
    public final void rule__ModelSlot__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1693:1: ( rule__ModelSlot__Group__11__Impl rule__ModelSlot__Group__12 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1694:2: rule__ModelSlot__Group__11__Impl rule__ModelSlot__Group__12
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__11__Impl_in_rule__ModelSlot__Group__113470);
            rule__ModelSlot__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__12_in_rule__ModelSlot__Group__113473);
            rule__ModelSlot__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__11"


    // $ANTLR start "rule__ModelSlot__Group__11__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1701:1: rule__ModelSlot__Group__11__Impl : ( ( ( 'readOnly' ) ) ( ( 'readOnly' )* ) ) ;
    public final void rule__ModelSlot__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1705:1: ( ( ( ( 'readOnly' ) ) ( ( 'readOnly' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1706:1: ( ( ( 'readOnly' ) ) ( ( 'readOnly' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1706:1: ( ( ( 'readOnly' ) ) ( ( 'readOnly' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1707:1: ( ( 'readOnly' ) ) ( ( 'readOnly' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1707:1: ( ( 'readOnly' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1708:1: ( 'readOnly' )
            {
             before(grammarAccess.getModelSlotAccess().getReadOnlyKeyword_11()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1709:1: ( 'readOnly' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1710:2: 'readOnly'
            {
            match(input,35,FOLLOW_35_in_rule__ModelSlot__Group__11__Impl3504); 

            }

             after(grammarAccess.getModelSlotAccess().getReadOnlyKeyword_11()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1714:1: ( ( 'readOnly' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1715:1: ( 'readOnly' )*
            {
             before(grammarAccess.getModelSlotAccess().getReadOnlyKeyword_11()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1716:1: ( 'readOnly' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==35) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1717:2: 'readOnly'
            	    {
            	    match(input,35,FOLLOW_35_in_rule__ModelSlot__Group__11__Impl3520); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getModelSlotAccess().getReadOnlyKeyword_11()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__11__Impl"


    // $ANTLR start "rule__ModelSlot__Group__12"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1729:1: rule__ModelSlot__Group__12 : rule__ModelSlot__Group__12__Impl rule__ModelSlot__Group__13 ;
    public final void rule__ModelSlot__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1733:1: ( rule__ModelSlot__Group__12__Impl rule__ModelSlot__Group__13 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1734:2: rule__ModelSlot__Group__12__Impl rule__ModelSlot__Group__13
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__12__Impl_in_rule__ModelSlot__Group__123555);
            rule__ModelSlot__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__13_in_rule__ModelSlot__Group__123558);
            rule__ModelSlot__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__12"


    // $ANTLR start "rule__ModelSlot__Group__12__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1741:1: rule__ModelSlot__Group__12__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__ModelSlot__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1745:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1746:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1746:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1747:1: ( ( '=' ) ) ( ( '=' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1747:1: ( ( '=' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1748:1: ( '=' )
            {
             before(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_12()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1749:1: ( '=' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1750:2: '='
            {
            match(input,28,FOLLOW_28_in_rule__ModelSlot__Group__12__Impl3589); 

            }

             after(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_12()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1754:1: ( ( '=' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1755:1: ( '=' )*
            {
             before(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_12()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1756:1: ( '=' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==28) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1757:2: '='
            	    {
            	    match(input,28,FOLLOW_28_in_rule__ModelSlot__Group__12__Impl3605); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_12()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__12__Impl"


    // $ANTLR start "rule__ModelSlot__Group__13"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1769:1: rule__ModelSlot__Group__13 : rule__ModelSlot__Group__13__Impl rule__ModelSlot__Group__14 ;
    public final void rule__ModelSlot__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1773:1: ( rule__ModelSlot__Group__13__Impl rule__ModelSlot__Group__14 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1774:2: rule__ModelSlot__Group__13__Impl rule__ModelSlot__Group__14
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__13__Impl_in_rule__ModelSlot__Group__133640);
            rule__ModelSlot__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__14_in_rule__ModelSlot__Group__133643);
            rule__ModelSlot__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__13"


    // $ANTLR start "rule__ModelSlot__Group__13__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1781:1: rule__ModelSlot__Group__13__Impl : ( ( rule__ModelSlot__ReadOnlyAssignment_13 ) ) ;
    public final void rule__ModelSlot__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1785:1: ( ( ( rule__ModelSlot__ReadOnlyAssignment_13 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1786:1: ( ( rule__ModelSlot__ReadOnlyAssignment_13 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1786:1: ( ( rule__ModelSlot__ReadOnlyAssignment_13 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1787:1: ( rule__ModelSlot__ReadOnlyAssignment_13 )
            {
             before(grammarAccess.getModelSlotAccess().getReadOnlyAssignment_13()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1788:1: ( rule__ModelSlot__ReadOnlyAssignment_13 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1788:2: rule__ModelSlot__ReadOnlyAssignment_13
            {
            pushFollow(FOLLOW_rule__ModelSlot__ReadOnlyAssignment_13_in_rule__ModelSlot__Group__13__Impl3670);
            rule__ModelSlot__ReadOnlyAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getModelSlotAccess().getReadOnlyAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__13__Impl"


    // $ANTLR start "rule__ModelSlot__Group__14"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1798:1: rule__ModelSlot__Group__14 : rule__ModelSlot__Group__14__Impl ;
    public final void rule__ModelSlot__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1802:1: ( rule__ModelSlot__Group__14__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1803:2: rule__ModelSlot__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__14__Impl_in_rule__ModelSlot__Group__143700);
            rule__ModelSlot__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__14"


    // $ANTLR start "rule__ModelSlot__Group__14__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1809:1: rule__ModelSlot__Group__14__Impl : ( ';' ) ;
    public final void rule__ModelSlot__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1813:1: ( ( ';' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1814:1: ( ';' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1814:1: ( ';' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1815:1: ';'
            {
             before(grammarAccess.getModelSlotAccess().getSemicolonKeyword_14()); 
            match(input,36,FOLLOW_36_in_rule__ModelSlot__Group__14__Impl3728); 
             after(grammarAccess.getModelSlotAccess().getSemicolonKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__Group__14__Impl"


    // $ANTLR start "rule__EditionPattern__Group__0"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1858:1: rule__EditionPattern__Group__0 : rule__EditionPattern__Group__0__Impl rule__EditionPattern__Group__1 ;
    public final void rule__EditionPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1862:1: ( rule__EditionPattern__Group__0__Impl rule__EditionPattern__Group__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1863:2: rule__EditionPattern__Group__0__Impl rule__EditionPattern__Group__1
            {
            pushFollow(FOLLOW_rule__EditionPattern__Group__0__Impl_in_rule__EditionPattern__Group__03789);
            rule__EditionPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionPattern__Group__1_in_rule__EditionPattern__Group__03792);
            rule__EditionPattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionPattern__Group__0"


    // $ANTLR start "rule__EditionPattern__Group__0__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1870:1: rule__EditionPattern__Group__0__Impl : ( 'EditionPattern' ) ;
    public final void rule__EditionPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1874:1: ( ( 'EditionPattern' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1875:1: ( 'EditionPattern' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1875:1: ( 'EditionPattern' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1876:1: 'EditionPattern'
            {
             before(grammarAccess.getEditionPatternAccess().getEditionPatternKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__EditionPattern__Group__0__Impl3820); 
             after(grammarAccess.getEditionPatternAccess().getEditionPatternKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionPattern__Group__0__Impl"


    // $ANTLR start "rule__EditionPattern__Group__1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1889:1: rule__EditionPattern__Group__1 : rule__EditionPattern__Group__1__Impl rule__EditionPattern__Group__2 ;
    public final void rule__EditionPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1893:1: ( rule__EditionPattern__Group__1__Impl rule__EditionPattern__Group__2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1894:2: rule__EditionPattern__Group__1__Impl rule__EditionPattern__Group__2
            {
            pushFollow(FOLLOW_rule__EditionPattern__Group__1__Impl_in_rule__EditionPattern__Group__13851);
            rule__EditionPattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionPattern__Group__2_in_rule__EditionPattern__Group__13854);
            rule__EditionPattern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionPattern__Group__1"


    // $ANTLR start "rule__EditionPattern__Group__1__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1901:1: rule__EditionPattern__Group__1__Impl : ( ( rule__EditionPattern__NameAssignment_1 ) ) ;
    public final void rule__EditionPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1905:1: ( ( ( rule__EditionPattern__NameAssignment_1 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1906:1: ( ( rule__EditionPattern__NameAssignment_1 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1906:1: ( ( rule__EditionPattern__NameAssignment_1 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1907:1: ( rule__EditionPattern__NameAssignment_1 )
            {
             before(grammarAccess.getEditionPatternAccess().getNameAssignment_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1908:1: ( rule__EditionPattern__NameAssignment_1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1908:2: rule__EditionPattern__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EditionPattern__NameAssignment_1_in_rule__EditionPattern__Group__1__Impl3881);
            rule__EditionPattern__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEditionPatternAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionPattern__Group__1__Impl"


    // $ANTLR start "rule__EditionPattern__Group__2"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1918:1: rule__EditionPattern__Group__2 : rule__EditionPattern__Group__2__Impl rule__EditionPattern__Group__3 ;
    public final void rule__EditionPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1922:1: ( rule__EditionPattern__Group__2__Impl rule__EditionPattern__Group__3 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1923:2: rule__EditionPattern__Group__2__Impl rule__EditionPattern__Group__3
            {
            pushFollow(FOLLOW_rule__EditionPattern__Group__2__Impl_in_rule__EditionPattern__Group__23911);
            rule__EditionPattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionPattern__Group__3_in_rule__EditionPattern__Group__23914);
            rule__EditionPattern__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionPattern__Group__2"


    // $ANTLR start "rule__EditionPattern__Group__2__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1930:1: rule__EditionPattern__Group__2__Impl : ( ( rule__EditionPattern__Group_2__0 )? ) ;
    public final void rule__EditionPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1934:1: ( ( ( rule__EditionPattern__Group_2__0 )? ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1935:1: ( ( rule__EditionPattern__Group_2__0 )? )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1935:1: ( ( rule__EditionPattern__Group_2__0 )? )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1936:1: ( rule__EditionPattern__Group_2__0 )?
            {
             before(grammarAccess.getEditionPatternAccess().getGroup_2()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1937:1: ( rule__EditionPattern__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1937:2: rule__EditionPattern__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EditionPattern__Group_2__0_in_rule__EditionPattern__Group__2__Impl3941);
                    rule__EditionPattern__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEditionPatternAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionPattern__Group__2__Impl"


    // $ANTLR start "rule__EditionPattern__Group__3"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1947:1: rule__EditionPattern__Group__3 : rule__EditionPattern__Group__3__Impl rule__EditionPattern__Group__4 ;
    public final void rule__EditionPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1951:1: ( rule__EditionPattern__Group__3__Impl rule__EditionPattern__Group__4 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1952:2: rule__EditionPattern__Group__3__Impl rule__EditionPattern__Group__4
            {
            pushFollow(FOLLOW_rule__EditionPattern__Group__3__Impl_in_rule__EditionPattern__Group__33972);
            rule__EditionPattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionPattern__Group__4_in_rule__EditionPattern__Group__33975);
            rule__EditionPattern__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionPattern__Group__3"


    // $ANTLR start "rule__EditionPattern__Group__3__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1959:1: rule__EditionPattern__Group__3__Impl : ( '{' ) ;
    public final void rule__EditionPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1963:1: ( ( '{' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1964:1: ( '{' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1964:1: ( '{' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1965:1: '{'
            {
             before(grammarAccess.getEditionPatternAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__EditionPattern__Group__3__Impl4003); 
             after(grammarAccess.getEditionPatternAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionPattern__Group__3__Impl"


    // $ANTLR start "rule__EditionPattern__Group__4"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1978:1: rule__EditionPattern__Group__4 : rule__EditionPattern__Group__4__Impl rule__EditionPattern__Group__5 ;
    public final void rule__EditionPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1982:1: ( rule__EditionPattern__Group__4__Impl rule__EditionPattern__Group__5 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1983:2: rule__EditionPattern__Group__4__Impl rule__EditionPattern__Group__5
            {
            pushFollow(FOLLOW_rule__EditionPattern__Group__4__Impl_in_rule__EditionPattern__Group__44034);
            rule__EditionPattern__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionPattern__Group__5_in_rule__EditionPattern__Group__44037);
            rule__EditionPattern__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionPattern__Group__4"


    // $ANTLR start "rule__EditionPattern__Group__4__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1990:1: rule__EditionPattern__Group__4__Impl : ( ( rule__EditionPattern__PatternRolesAssignment_4 )* ) ;
    public final void rule__EditionPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1994:1: ( ( ( rule__EditionPattern__PatternRolesAssignment_4 )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1995:1: ( ( rule__EditionPattern__PatternRolesAssignment_4 )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1995:1: ( ( rule__EditionPattern__PatternRolesAssignment_4 )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1996:1: ( rule__EditionPattern__PatternRolesAssignment_4 )*
            {
             before(grammarAccess.getEditionPatternAccess().getPatternRolesAssignment_4()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1997:1: ( rule__EditionPattern__PatternRolesAssignment_4 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==39) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1997:2: rule__EditionPattern__PatternRolesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__EditionPattern__PatternRolesAssignment_4_in_rule__EditionPattern__Group__4__Impl4064);
            	    rule__EditionPattern__PatternRolesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getEditionPatternAccess().getPatternRolesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionPattern__Group__4__Impl"


    // $ANTLR start "rule__EditionPattern__Group__5"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2007:1: rule__EditionPattern__Group__5 : rule__EditionPattern__Group__5__Impl rule__EditionPattern__Group__6 ;
    public final void rule__EditionPattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2011:1: ( rule__EditionPattern__Group__5__Impl rule__EditionPattern__Group__6 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2012:2: rule__EditionPattern__Group__5__Impl rule__EditionPattern__Group__6
            {
            pushFollow(FOLLOW_rule__EditionPattern__Group__5__Impl_in_rule__EditionPattern__Group__54095);
            rule__EditionPattern__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionPattern__Group__6_in_rule__EditionPattern__Group__54098);
            rule__EditionPattern__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionPattern__Group__5"


    // $ANTLR start "rule__EditionPattern__Group__5__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2019:1: rule__EditionPattern__Group__5__Impl : ( ( rule__EditionPattern__EditionSchemesAssignment_5 )* ) ;
    public final void rule__EditionPattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2023:1: ( ( ( rule__EditionPattern__EditionSchemesAssignment_5 )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2024:1: ( ( rule__EditionPattern__EditionSchemesAssignment_5 )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2024:1: ( ( rule__EditionPattern__EditionSchemesAssignment_5 )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2025:1: ( rule__EditionPattern__EditionSchemesAssignment_5 )*
            {
             before(grammarAccess.getEditionPatternAccess().getEditionSchemesAssignment_5()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2026:1: ( rule__EditionPattern__EditionSchemesAssignment_5 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=15 && LA25_0<=18)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2026:2: rule__EditionPattern__EditionSchemesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__EditionPattern__EditionSchemesAssignment_5_in_rule__EditionPattern__Group__5__Impl4125);
            	    rule__EditionPattern__EditionSchemesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getEditionPatternAccess().getEditionSchemesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionPattern__Group__5__Impl"


    // $ANTLR start "rule__EditionPattern__Group__6"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2036:1: rule__EditionPattern__Group__6 : rule__EditionPattern__Group__6__Impl ;
    public final void rule__EditionPattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2040:1: ( rule__EditionPattern__Group__6__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2041:2: rule__EditionPattern__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__EditionPattern__Group__6__Impl_in_rule__EditionPattern__Group__64156);
            rule__EditionPattern__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionPattern__Group__6"


    // $ANTLR start "rule__EditionPattern__Group__6__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2047:1: rule__EditionPattern__Group__6__Impl : ( '}' ) ;
    public final void rule__EditionPattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2051:1: ( ( '}' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2052:1: ( '}' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2052:1: ( '}' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2053:1: '}'
            {
             before(grammarAccess.getEditionPatternAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__EditionPattern__Group__6__Impl4184); 
             after(grammarAccess.getEditionPatternAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionPattern__Group__6__Impl"


    // $ANTLR start "rule__EditionPattern__Group_2__0"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2080:1: rule__EditionPattern__Group_2__0 : rule__EditionPattern__Group_2__0__Impl rule__EditionPattern__Group_2__1 ;
    public final void rule__EditionPattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2084:1: ( rule__EditionPattern__Group_2__0__Impl rule__EditionPattern__Group_2__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2085:2: rule__EditionPattern__Group_2__0__Impl rule__EditionPattern__Group_2__1
            {
            pushFollow(FOLLOW_rule__EditionPattern__Group_2__0__Impl_in_rule__EditionPattern__Group_2__04229);
            rule__EditionPattern__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionPattern__Group_2__1_in_rule__EditionPattern__Group_2__04232);
            rule__EditionPattern__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionPattern__Group_2__0"


    // $ANTLR start "rule__EditionPattern__Group_2__0__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2092:1: rule__EditionPattern__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__EditionPattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2096:1: ( ( 'extends' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2097:1: ( 'extends' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2097:1: ( 'extends' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2098:1: 'extends'
            {
             before(grammarAccess.getEditionPatternAccess().getExtendsKeyword_2_0()); 
            match(input,38,FOLLOW_38_in_rule__EditionPattern__Group_2__0__Impl4260); 
             after(grammarAccess.getEditionPatternAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionPattern__Group_2__0__Impl"


    // $ANTLR start "rule__EditionPattern__Group_2__1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2111:1: rule__EditionPattern__Group_2__1 : rule__EditionPattern__Group_2__1__Impl ;
    public final void rule__EditionPattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2115:1: ( rule__EditionPattern__Group_2__1__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2116:2: rule__EditionPattern__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EditionPattern__Group_2__1__Impl_in_rule__EditionPattern__Group_2__14291);
            rule__EditionPattern__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionPattern__Group_2__1"


    // $ANTLR start "rule__EditionPattern__Group_2__1__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2122:1: rule__EditionPattern__Group_2__1__Impl : ( ( rule__EditionPattern__SuperEditionPatternAssignment_2_1 ) ) ;
    public final void rule__EditionPattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2126:1: ( ( ( rule__EditionPattern__SuperEditionPatternAssignment_2_1 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2127:1: ( ( rule__EditionPattern__SuperEditionPatternAssignment_2_1 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2127:1: ( ( rule__EditionPattern__SuperEditionPatternAssignment_2_1 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2128:1: ( rule__EditionPattern__SuperEditionPatternAssignment_2_1 )
            {
             before(grammarAccess.getEditionPatternAccess().getSuperEditionPatternAssignment_2_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2129:1: ( rule__EditionPattern__SuperEditionPatternAssignment_2_1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2129:2: rule__EditionPattern__SuperEditionPatternAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EditionPattern__SuperEditionPatternAssignment_2_1_in_rule__EditionPattern__Group_2__1__Impl4318);
            rule__EditionPattern__SuperEditionPatternAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEditionPatternAccess().getSuperEditionPatternAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionPattern__Group_2__1__Impl"


    // $ANTLR start "rule__PatternRole__Group__0"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2143:1: rule__PatternRole__Group__0 : rule__PatternRole__Group__0__Impl rule__PatternRole__Group__1 ;
    public final void rule__PatternRole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2147:1: ( rule__PatternRole__Group__0__Impl rule__PatternRole__Group__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2148:2: rule__PatternRole__Group__0__Impl rule__PatternRole__Group__1
            {
            pushFollow(FOLLOW_rule__PatternRole__Group__0__Impl_in_rule__PatternRole__Group__04352);
            rule__PatternRole__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatternRole__Group__1_in_rule__PatternRole__Group__04355);
            rule__PatternRole__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternRole__Group__0"


    // $ANTLR start "rule__PatternRole__Group__0__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2155:1: rule__PatternRole__Group__0__Impl : ( 'PatternRole' ) ;
    public final void rule__PatternRole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2159:1: ( ( 'PatternRole' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2160:1: ( 'PatternRole' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2160:1: ( 'PatternRole' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2161:1: 'PatternRole'
            {
             before(grammarAccess.getPatternRoleAccess().getPatternRoleKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__PatternRole__Group__0__Impl4383); 
             after(grammarAccess.getPatternRoleAccess().getPatternRoleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternRole__Group__0__Impl"


    // $ANTLR start "rule__PatternRole__Group__1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2174:1: rule__PatternRole__Group__1 : rule__PatternRole__Group__1__Impl rule__PatternRole__Group__2 ;
    public final void rule__PatternRole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2178:1: ( rule__PatternRole__Group__1__Impl rule__PatternRole__Group__2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2179:2: rule__PatternRole__Group__1__Impl rule__PatternRole__Group__2
            {
            pushFollow(FOLLOW_rule__PatternRole__Group__1__Impl_in_rule__PatternRole__Group__14414);
            rule__PatternRole__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatternRole__Group__2_in_rule__PatternRole__Group__14417);
            rule__PatternRole__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternRole__Group__1"


    // $ANTLR start "rule__PatternRole__Group__1__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2186:1: rule__PatternRole__Group__1__Impl : ( ( rule__PatternRole__NameAssignment_1 ) ) ;
    public final void rule__PatternRole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2190:1: ( ( ( rule__PatternRole__NameAssignment_1 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2191:1: ( ( rule__PatternRole__NameAssignment_1 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2191:1: ( ( rule__PatternRole__NameAssignment_1 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2192:1: ( rule__PatternRole__NameAssignment_1 )
            {
             before(grammarAccess.getPatternRoleAccess().getNameAssignment_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2193:1: ( rule__PatternRole__NameAssignment_1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2193:2: rule__PatternRole__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PatternRole__NameAssignment_1_in_rule__PatternRole__Group__1__Impl4444);
            rule__PatternRole__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternRoleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternRole__Group__1__Impl"


    // $ANTLR start "rule__PatternRole__Group__2"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2203:1: rule__PatternRole__Group__2 : rule__PatternRole__Group__2__Impl rule__PatternRole__Group__3 ;
    public final void rule__PatternRole__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2207:1: ( rule__PatternRole__Group__2__Impl rule__PatternRole__Group__3 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2208:2: rule__PatternRole__Group__2__Impl rule__PatternRole__Group__3
            {
            pushFollow(FOLLOW_rule__PatternRole__Group__2__Impl_in_rule__PatternRole__Group__24474);
            rule__PatternRole__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatternRole__Group__3_in_rule__PatternRole__Group__24477);
            rule__PatternRole__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternRole__Group__2"


    // $ANTLR start "rule__PatternRole__Group__2__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2215:1: rule__PatternRole__Group__2__Impl : ( 'as' ) ;
    public final void rule__PatternRole__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2219:1: ( ( 'as' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2220:1: ( 'as' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2220:1: ( 'as' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2221:1: 'as'
            {
             before(grammarAccess.getPatternRoleAccess().getAsKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__PatternRole__Group__2__Impl4505); 
             after(grammarAccess.getPatternRoleAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternRole__Group__2__Impl"


    // $ANTLR start "rule__PatternRole__Group__3"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2234:1: rule__PatternRole__Group__3 : rule__PatternRole__Group__3__Impl rule__PatternRole__Group__4 ;
    public final void rule__PatternRole__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2238:1: ( rule__PatternRole__Group__3__Impl rule__PatternRole__Group__4 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2239:2: rule__PatternRole__Group__3__Impl rule__PatternRole__Group__4
            {
            pushFollow(FOLLOW_rule__PatternRole__Group__3__Impl_in_rule__PatternRole__Group__34536);
            rule__PatternRole__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatternRole__Group__4_in_rule__PatternRole__Group__34539);
            rule__PatternRole__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternRole__Group__3"


    // $ANTLR start "rule__PatternRole__Group__3__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2246:1: rule__PatternRole__Group__3__Impl : ( ( rule__PatternRole__TypeAssignment_3 ) ) ;
    public final void rule__PatternRole__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2250:1: ( ( ( rule__PatternRole__TypeAssignment_3 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2251:1: ( ( rule__PatternRole__TypeAssignment_3 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2251:1: ( ( rule__PatternRole__TypeAssignment_3 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2252:1: ( rule__PatternRole__TypeAssignment_3 )
            {
             before(grammarAccess.getPatternRoleAccess().getTypeAssignment_3()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2253:1: ( rule__PatternRole__TypeAssignment_3 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2253:2: rule__PatternRole__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__PatternRole__TypeAssignment_3_in_rule__PatternRole__Group__3__Impl4566);
            rule__PatternRole__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPatternRoleAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternRole__Group__3__Impl"


    // $ANTLR start "rule__PatternRole__Group__4"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2263:1: rule__PatternRole__Group__4 : rule__PatternRole__Group__4__Impl rule__PatternRole__Group__5 ;
    public final void rule__PatternRole__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2267:1: ( rule__PatternRole__Group__4__Impl rule__PatternRole__Group__5 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2268:2: rule__PatternRole__Group__4__Impl rule__PatternRole__Group__5
            {
            pushFollow(FOLLOW_rule__PatternRole__Group__4__Impl_in_rule__PatternRole__Group__44596);
            rule__PatternRole__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatternRole__Group__5_in_rule__PatternRole__Group__44599);
            rule__PatternRole__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternRole__Group__4"


    // $ANTLR start "rule__PatternRole__Group__4__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2275:1: rule__PatternRole__Group__4__Impl : ( 'conformTo' ) ;
    public final void rule__PatternRole__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2279:1: ( ( 'conformTo' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2280:1: ( 'conformTo' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2280:1: ( 'conformTo' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2281:1: 'conformTo'
            {
             before(grammarAccess.getPatternRoleAccess().getConformToKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__PatternRole__Group__4__Impl4627); 
             after(grammarAccess.getPatternRoleAccess().getConformToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternRole__Group__4__Impl"


    // $ANTLR start "rule__PatternRole__Group__5"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2294:1: rule__PatternRole__Group__5 : rule__PatternRole__Group__5__Impl rule__PatternRole__Group__6 ;
    public final void rule__PatternRole__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2298:1: ( rule__PatternRole__Group__5__Impl rule__PatternRole__Group__6 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2299:2: rule__PatternRole__Group__5__Impl rule__PatternRole__Group__6
            {
            pushFollow(FOLLOW_rule__PatternRole__Group__5__Impl_in_rule__PatternRole__Group__54658);
            rule__PatternRole__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatternRole__Group__6_in_rule__PatternRole__Group__54661);
            rule__PatternRole__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternRole__Group__5"


    // $ANTLR start "rule__PatternRole__Group__5__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2306:1: rule__PatternRole__Group__5__Impl : ( ( rule__PatternRole__ModelElementAssignment_5 ) ) ;
    public final void rule__PatternRole__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2310:1: ( ( ( rule__PatternRole__ModelElementAssignment_5 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2311:1: ( ( rule__PatternRole__ModelElementAssignment_5 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2311:1: ( ( rule__PatternRole__ModelElementAssignment_5 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2312:1: ( rule__PatternRole__ModelElementAssignment_5 )
            {
             before(grammarAccess.getPatternRoleAccess().getModelElementAssignment_5()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2313:1: ( rule__PatternRole__ModelElementAssignment_5 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2313:2: rule__PatternRole__ModelElementAssignment_5
            {
            pushFollow(FOLLOW_rule__PatternRole__ModelElementAssignment_5_in_rule__PatternRole__Group__5__Impl4688);
            rule__PatternRole__ModelElementAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPatternRoleAccess().getModelElementAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternRole__Group__5__Impl"


    // $ANTLR start "rule__PatternRole__Group__6"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2323:1: rule__PatternRole__Group__6 : rule__PatternRole__Group__6__Impl rule__PatternRole__Group__7 ;
    public final void rule__PatternRole__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2327:1: ( rule__PatternRole__Group__6__Impl rule__PatternRole__Group__7 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2328:2: rule__PatternRole__Group__6__Impl rule__PatternRole__Group__7
            {
            pushFollow(FOLLOW_rule__PatternRole__Group__6__Impl_in_rule__PatternRole__Group__64718);
            rule__PatternRole__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatternRole__Group__7_in_rule__PatternRole__Group__64721);
            rule__PatternRole__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternRole__Group__6"


    // $ANTLR start "rule__PatternRole__Group__6__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2335:1: rule__PatternRole__Group__6__Impl : ( 'from' ) ;
    public final void rule__PatternRole__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2339:1: ( ( 'from' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2340:1: ( 'from' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2340:1: ( 'from' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2341:1: 'from'
            {
             before(grammarAccess.getPatternRoleAccess().getFromKeyword_6()); 
            match(input,41,FOLLOW_41_in_rule__PatternRole__Group__6__Impl4749); 
             after(grammarAccess.getPatternRoleAccess().getFromKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternRole__Group__6__Impl"


    // $ANTLR start "rule__PatternRole__Group__7"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2354:1: rule__PatternRole__Group__7 : rule__PatternRole__Group__7__Impl rule__PatternRole__Group__8 ;
    public final void rule__PatternRole__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2358:1: ( rule__PatternRole__Group__7__Impl rule__PatternRole__Group__8 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2359:2: rule__PatternRole__Group__7__Impl rule__PatternRole__Group__8
            {
            pushFollow(FOLLOW_rule__PatternRole__Group__7__Impl_in_rule__PatternRole__Group__74780);
            rule__PatternRole__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatternRole__Group__8_in_rule__PatternRole__Group__74783);
            rule__PatternRole__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternRole__Group__7"


    // $ANTLR start "rule__PatternRole__Group__7__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2366:1: rule__PatternRole__Group__7__Impl : ( ( rule__PatternRole__ModelSlotAssignment_7 ) ) ;
    public final void rule__PatternRole__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2370:1: ( ( ( rule__PatternRole__ModelSlotAssignment_7 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2371:1: ( ( rule__PatternRole__ModelSlotAssignment_7 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2371:1: ( ( rule__PatternRole__ModelSlotAssignment_7 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2372:1: ( rule__PatternRole__ModelSlotAssignment_7 )
            {
             before(grammarAccess.getPatternRoleAccess().getModelSlotAssignment_7()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2373:1: ( rule__PatternRole__ModelSlotAssignment_7 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2373:2: rule__PatternRole__ModelSlotAssignment_7
            {
            pushFollow(FOLLOW_rule__PatternRole__ModelSlotAssignment_7_in_rule__PatternRole__Group__7__Impl4810);
            rule__PatternRole__ModelSlotAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPatternRoleAccess().getModelSlotAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternRole__Group__7__Impl"


    // $ANTLR start "rule__PatternRole__Group__8"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2383:1: rule__PatternRole__Group__8 : rule__PatternRole__Group__8__Impl ;
    public final void rule__PatternRole__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2387:1: ( rule__PatternRole__Group__8__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2388:2: rule__PatternRole__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__PatternRole__Group__8__Impl_in_rule__PatternRole__Group__84840);
            rule__PatternRole__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternRole__Group__8"


    // $ANTLR start "rule__PatternRole__Group__8__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2394:1: rule__PatternRole__Group__8__Impl : ( ';' ) ;
    public final void rule__PatternRole__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2398:1: ( ( ';' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2399:1: ( ';' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2399:1: ( ';' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2400:1: ';'
            {
             before(grammarAccess.getPatternRoleAccess().getSemicolonKeyword_8()); 
            match(input,36,FOLLOW_36_in_rule__PatternRole__Group__8__Impl4868); 
             after(grammarAccess.getPatternRoleAccess().getSemicolonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternRole__Group__8__Impl"


    // $ANTLR start "rule__EditionScheme__Group__0"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2431:1: rule__EditionScheme__Group__0 : rule__EditionScheme__Group__0__Impl rule__EditionScheme__Group__1 ;
    public final void rule__EditionScheme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2435:1: ( rule__EditionScheme__Group__0__Impl rule__EditionScheme__Group__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2436:2: rule__EditionScheme__Group__0__Impl rule__EditionScheme__Group__1
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group__0__Impl_in_rule__EditionScheme__Group__04917);
            rule__EditionScheme__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionScheme__Group__1_in_rule__EditionScheme__Group__04920);
            rule__EditionScheme__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__Group__0"


    // $ANTLR start "rule__EditionScheme__Group__0__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2443:1: rule__EditionScheme__Group__0__Impl : ( ( rule__EditionScheme__EditionSchemeTypeAssignment_0 ) ) ;
    public final void rule__EditionScheme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2447:1: ( ( ( rule__EditionScheme__EditionSchemeTypeAssignment_0 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2448:1: ( ( rule__EditionScheme__EditionSchemeTypeAssignment_0 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2448:1: ( ( rule__EditionScheme__EditionSchemeTypeAssignment_0 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2449:1: ( rule__EditionScheme__EditionSchemeTypeAssignment_0 )
            {
             before(grammarAccess.getEditionSchemeAccess().getEditionSchemeTypeAssignment_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2450:1: ( rule__EditionScheme__EditionSchemeTypeAssignment_0 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2450:2: rule__EditionScheme__EditionSchemeTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__EditionScheme__EditionSchemeTypeAssignment_0_in_rule__EditionScheme__Group__0__Impl4947);
            rule__EditionScheme__EditionSchemeTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEditionSchemeAccess().getEditionSchemeTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__Group__0__Impl"


    // $ANTLR start "rule__EditionScheme__Group__1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2460:1: rule__EditionScheme__Group__1 : rule__EditionScheme__Group__1__Impl rule__EditionScheme__Group__2 ;
    public final void rule__EditionScheme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2464:1: ( rule__EditionScheme__Group__1__Impl rule__EditionScheme__Group__2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2465:2: rule__EditionScheme__Group__1__Impl rule__EditionScheme__Group__2
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group__1__Impl_in_rule__EditionScheme__Group__14977);
            rule__EditionScheme__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionScheme__Group__2_in_rule__EditionScheme__Group__14980);
            rule__EditionScheme__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__Group__1"


    // $ANTLR start "rule__EditionScheme__Group__1__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2472:1: rule__EditionScheme__Group__1__Impl : ( ( rule__EditionScheme__NameAssignment_1 ) ) ;
    public final void rule__EditionScheme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2476:1: ( ( ( rule__EditionScheme__NameAssignment_1 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2477:1: ( ( rule__EditionScheme__NameAssignment_1 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2477:1: ( ( rule__EditionScheme__NameAssignment_1 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2478:1: ( rule__EditionScheme__NameAssignment_1 )
            {
             before(grammarAccess.getEditionSchemeAccess().getNameAssignment_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2479:1: ( rule__EditionScheme__NameAssignment_1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2479:2: rule__EditionScheme__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EditionScheme__NameAssignment_1_in_rule__EditionScheme__Group__1__Impl5007);
            rule__EditionScheme__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEditionSchemeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__Group__1__Impl"


    // $ANTLR start "rule__EditionScheme__Group__2"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2489:1: rule__EditionScheme__Group__2 : rule__EditionScheme__Group__2__Impl rule__EditionScheme__Group__3 ;
    public final void rule__EditionScheme__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2493:1: ( rule__EditionScheme__Group__2__Impl rule__EditionScheme__Group__3 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2494:2: rule__EditionScheme__Group__2__Impl rule__EditionScheme__Group__3
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group__2__Impl_in_rule__EditionScheme__Group__25037);
            rule__EditionScheme__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionScheme__Group__3_in_rule__EditionScheme__Group__25040);
            rule__EditionScheme__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__Group__2"


    // $ANTLR start "rule__EditionScheme__Group__2__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2501:1: rule__EditionScheme__Group__2__Impl : ( '(' ) ;
    public final void rule__EditionScheme__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2505:1: ( ( '(' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2506:1: ( '(' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2506:1: ( '(' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2507:1: '('
            {
             before(grammarAccess.getEditionSchemeAccess().getLeftParenthesisKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__EditionScheme__Group__2__Impl5068); 
             after(grammarAccess.getEditionSchemeAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__Group__2__Impl"


    // $ANTLR start "rule__EditionScheme__Group__3"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2520:1: rule__EditionScheme__Group__3 : rule__EditionScheme__Group__3__Impl rule__EditionScheme__Group__4 ;
    public final void rule__EditionScheme__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2524:1: ( rule__EditionScheme__Group__3__Impl rule__EditionScheme__Group__4 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2525:2: rule__EditionScheme__Group__3__Impl rule__EditionScheme__Group__4
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group__3__Impl_in_rule__EditionScheme__Group__35099);
            rule__EditionScheme__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionScheme__Group__4_in_rule__EditionScheme__Group__35102);
            rule__EditionScheme__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__Group__3"


    // $ANTLR start "rule__EditionScheme__Group__3__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2532:1: rule__EditionScheme__Group__3__Impl : ( ( rule__EditionScheme__Group_3__0 )? ) ;
    public final void rule__EditionScheme__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2536:1: ( ( ( rule__EditionScheme__Group_3__0 )? ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2537:1: ( ( rule__EditionScheme__Group_3__0 )? )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2537:1: ( ( rule__EditionScheme__Group_3__0 )? )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2538:1: ( rule__EditionScheme__Group_3__0 )?
            {
             before(grammarAccess.getEditionSchemeAccess().getGroup_3()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2539:1: ( rule__EditionScheme__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==14) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2539:2: rule__EditionScheme__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EditionScheme__Group_3__0_in_rule__EditionScheme__Group__3__Impl5129);
                    rule__EditionScheme__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEditionSchemeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__Group__3__Impl"


    // $ANTLR start "rule__EditionScheme__Group__4"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2549:1: rule__EditionScheme__Group__4 : rule__EditionScheme__Group__4__Impl rule__EditionScheme__Group__5 ;
    public final void rule__EditionScheme__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2553:1: ( rule__EditionScheme__Group__4__Impl rule__EditionScheme__Group__5 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2554:2: rule__EditionScheme__Group__4__Impl rule__EditionScheme__Group__5
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group__4__Impl_in_rule__EditionScheme__Group__45160);
            rule__EditionScheme__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionScheme__Group__5_in_rule__EditionScheme__Group__45163);
            rule__EditionScheme__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__Group__4"


    // $ANTLR start "rule__EditionScheme__Group__4__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2561:1: rule__EditionScheme__Group__4__Impl : ( ')' ) ;
    public final void rule__EditionScheme__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2565:1: ( ( ')' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2566:1: ( ')' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2566:1: ( ')' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2567:1: ')'
            {
             before(grammarAccess.getEditionSchemeAccess().getRightParenthesisKeyword_4()); 
            match(input,43,FOLLOW_43_in_rule__EditionScheme__Group__4__Impl5191); 
             after(grammarAccess.getEditionSchemeAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__Group__4__Impl"


    // $ANTLR start "rule__EditionScheme__Group__5"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2580:1: rule__EditionScheme__Group__5 : rule__EditionScheme__Group__5__Impl rule__EditionScheme__Group__6 ;
    public final void rule__EditionScheme__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2584:1: ( rule__EditionScheme__Group__5__Impl rule__EditionScheme__Group__6 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2585:2: rule__EditionScheme__Group__5__Impl rule__EditionScheme__Group__6
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group__5__Impl_in_rule__EditionScheme__Group__55222);
            rule__EditionScheme__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionScheme__Group__6_in_rule__EditionScheme__Group__55225);
            rule__EditionScheme__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__Group__5"


    // $ANTLR start "rule__EditionScheme__Group__5__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2592:1: rule__EditionScheme__Group__5__Impl : ( '{' ) ;
    public final void rule__EditionScheme__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2596:1: ( ( '{' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2597:1: ( '{' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2597:1: ( '{' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2598:1: '{'
            {
             before(grammarAccess.getEditionSchemeAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__EditionScheme__Group__5__Impl5253); 
             after(grammarAccess.getEditionSchemeAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__Group__5__Impl"


    // $ANTLR start "rule__EditionScheme__Group__6"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2611:1: rule__EditionScheme__Group__6 : rule__EditionScheme__Group__6__Impl rule__EditionScheme__Group__7 ;
    public final void rule__EditionScheme__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2615:1: ( rule__EditionScheme__Group__6__Impl rule__EditionScheme__Group__7 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2616:2: rule__EditionScheme__Group__6__Impl rule__EditionScheme__Group__7
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group__6__Impl_in_rule__EditionScheme__Group__65284);
            rule__EditionScheme__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionScheme__Group__7_in_rule__EditionScheme__Group__65287);
            rule__EditionScheme__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__Group__6"


    // $ANTLR start "rule__EditionScheme__Group__6__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2623:1: rule__EditionScheme__Group__6__Impl : ( ( rule__EditionScheme__EditionActionAssignment_6 )* ) ;
    public final void rule__EditionScheme__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2627:1: ( ( ( rule__EditionScheme__EditionActionAssignment_6 )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2628:1: ( ( rule__EditionScheme__EditionActionAssignment_6 )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2628:1: ( ( rule__EditionScheme__EditionActionAssignment_6 )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2629:1: ( rule__EditionScheme__EditionActionAssignment_6 )*
            {
             before(grammarAccess.getEditionSchemeAccess().getEditionActionAssignment_6()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2630:1: ( rule__EditionScheme__EditionActionAssignment_6 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||LA27_0==48) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2630:2: rule__EditionScheme__EditionActionAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__EditionScheme__EditionActionAssignment_6_in_rule__EditionScheme__Group__6__Impl5314);
            	    rule__EditionScheme__EditionActionAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getEditionSchemeAccess().getEditionActionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__Group__6__Impl"


    // $ANTLR start "rule__EditionScheme__Group__7"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2640:1: rule__EditionScheme__Group__7 : rule__EditionScheme__Group__7__Impl ;
    public final void rule__EditionScheme__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2644:1: ( rule__EditionScheme__Group__7__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2645:2: rule__EditionScheme__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group__7__Impl_in_rule__EditionScheme__Group__75345);
            rule__EditionScheme__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__Group__7"


    // $ANTLR start "rule__EditionScheme__Group__7__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2651:1: rule__EditionScheme__Group__7__Impl : ( '}' ) ;
    public final void rule__EditionScheme__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2655:1: ( ( '}' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2656:1: ( '}' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2656:1: ( '}' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2657:1: '}'
            {
             before(grammarAccess.getEditionSchemeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,30,FOLLOW_30_in_rule__EditionScheme__Group__7__Impl5373); 
             after(grammarAccess.getEditionSchemeAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__Group__7__Impl"


    // $ANTLR start "rule__EditionScheme__Group_3__0"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2686:1: rule__EditionScheme__Group_3__0 : rule__EditionScheme__Group_3__0__Impl rule__EditionScheme__Group_3__1 ;
    public final void rule__EditionScheme__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2690:1: ( rule__EditionScheme__Group_3__0__Impl rule__EditionScheme__Group_3__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2691:2: rule__EditionScheme__Group_3__0__Impl rule__EditionScheme__Group_3__1
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group_3__0__Impl_in_rule__EditionScheme__Group_3__05420);
            rule__EditionScheme__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionScheme__Group_3__1_in_rule__EditionScheme__Group_3__05423);
            rule__EditionScheme__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__Group_3__0"


    // $ANTLR start "rule__EditionScheme__Group_3__0__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2698:1: rule__EditionScheme__Group_3__0__Impl : ( ( ( rule__EditionScheme__ParameterAssignment_3_0 ) ) ( ( rule__EditionScheme__ParameterAssignment_3_0 )* ) ) ;
    public final void rule__EditionScheme__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2702:1: ( ( ( ( rule__EditionScheme__ParameterAssignment_3_0 ) ) ( ( rule__EditionScheme__ParameterAssignment_3_0 )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2703:1: ( ( ( rule__EditionScheme__ParameterAssignment_3_0 ) ) ( ( rule__EditionScheme__ParameterAssignment_3_0 )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2703:1: ( ( ( rule__EditionScheme__ParameterAssignment_3_0 ) ) ( ( rule__EditionScheme__ParameterAssignment_3_0 )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2704:1: ( ( rule__EditionScheme__ParameterAssignment_3_0 ) ) ( ( rule__EditionScheme__ParameterAssignment_3_0 )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2704:1: ( ( rule__EditionScheme__ParameterAssignment_3_0 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2705:1: ( rule__EditionScheme__ParameterAssignment_3_0 )
            {
             before(grammarAccess.getEditionSchemeAccess().getParameterAssignment_3_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2706:1: ( rule__EditionScheme__ParameterAssignment_3_0 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2706:2: rule__EditionScheme__ParameterAssignment_3_0
            {
            pushFollow(FOLLOW_rule__EditionScheme__ParameterAssignment_3_0_in_rule__EditionScheme__Group_3__0__Impl5452);
            rule__EditionScheme__ParameterAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getEditionSchemeAccess().getParameterAssignment_3_0()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2709:1: ( ( rule__EditionScheme__ParameterAssignment_3_0 )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2710:1: ( rule__EditionScheme__ParameterAssignment_3_0 )*
            {
             before(grammarAccess.getEditionSchemeAccess().getParameterAssignment_3_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2711:1: ( rule__EditionScheme__ParameterAssignment_3_0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==14) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2711:2: rule__EditionScheme__ParameterAssignment_3_0
            	    {
            	    pushFollow(FOLLOW_rule__EditionScheme__ParameterAssignment_3_0_in_rule__EditionScheme__Group_3__0__Impl5464);
            	    rule__EditionScheme__ParameterAssignment_3_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getEditionSchemeAccess().getParameterAssignment_3_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__Group_3__0__Impl"


    // $ANTLR start "rule__EditionScheme__Group_3__1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2722:1: rule__EditionScheme__Group_3__1 : rule__EditionScheme__Group_3__1__Impl ;
    public final void rule__EditionScheme__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2726:1: ( rule__EditionScheme__Group_3__1__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2727:2: rule__EditionScheme__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group_3__1__Impl_in_rule__EditionScheme__Group_3__15497);
            rule__EditionScheme__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__Group_3__1"


    // $ANTLR start "rule__EditionScheme__Group_3__1__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2733:1: rule__EditionScheme__Group_3__1__Impl : ( ( rule__EditionScheme__Group_3_1__0 )* ) ;
    public final void rule__EditionScheme__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2737:1: ( ( ( rule__EditionScheme__Group_3_1__0 )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2738:1: ( ( rule__EditionScheme__Group_3_1__0 )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2738:1: ( ( rule__EditionScheme__Group_3_1__0 )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2739:1: ( rule__EditionScheme__Group_3_1__0 )*
            {
             before(grammarAccess.getEditionSchemeAccess().getGroup_3_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2740:1: ( rule__EditionScheme__Group_3_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==44) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2740:2: rule__EditionScheme__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EditionScheme__Group_3_1__0_in_rule__EditionScheme__Group_3__1__Impl5524);
            	    rule__EditionScheme__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getEditionSchemeAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__Group_3__1__Impl"


    // $ANTLR start "rule__EditionScheme__Group_3_1__0"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2754:1: rule__EditionScheme__Group_3_1__0 : rule__EditionScheme__Group_3_1__0__Impl rule__EditionScheme__Group_3_1__1 ;
    public final void rule__EditionScheme__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2758:1: ( rule__EditionScheme__Group_3_1__0__Impl rule__EditionScheme__Group_3_1__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2759:2: rule__EditionScheme__Group_3_1__0__Impl rule__EditionScheme__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group_3_1__0__Impl_in_rule__EditionScheme__Group_3_1__05559);
            rule__EditionScheme__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionScheme__Group_3_1__1_in_rule__EditionScheme__Group_3_1__05562);
            rule__EditionScheme__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__Group_3_1__0"


    // $ANTLR start "rule__EditionScheme__Group_3_1__0__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2766:1: rule__EditionScheme__Group_3_1__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__EditionScheme__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2770:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2771:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2771:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2772:1: ( ( ',' ) ) ( ( ',' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2772:1: ( ( ',' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2773:1: ( ',' )
            {
             before(grammarAccess.getEditionSchemeAccess().getCommaKeyword_3_1_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2774:1: ( ',' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2775:2: ','
            {
            match(input,44,FOLLOW_44_in_rule__EditionScheme__Group_3_1__0__Impl5593); 

            }

             after(grammarAccess.getEditionSchemeAccess().getCommaKeyword_3_1_0()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2779:1: ( ( ',' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2780:1: ( ',' )*
            {
             before(grammarAccess.getEditionSchemeAccess().getCommaKeyword_3_1_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2781:1: ( ',' )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==44) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2782:2: ','
            	    {
            	    match(input,44,FOLLOW_44_in_rule__EditionScheme__Group_3_1__0__Impl5609); 

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getEditionSchemeAccess().getCommaKeyword_3_1_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__Group_3_1__0__Impl"


    // $ANTLR start "rule__EditionScheme__Group_3_1__1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2794:1: rule__EditionScheme__Group_3_1__1 : rule__EditionScheme__Group_3_1__1__Impl ;
    public final void rule__EditionScheme__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2798:1: ( rule__EditionScheme__Group_3_1__1__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2799:2: rule__EditionScheme__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group_3_1__1__Impl_in_rule__EditionScheme__Group_3_1__15644);
            rule__EditionScheme__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__Group_3_1__1"


    // $ANTLR start "rule__EditionScheme__Group_3_1__1__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2805:1: rule__EditionScheme__Group_3_1__1__Impl : ( ( rule__EditionScheme__ParameterAssignment_3_1_1 ) ) ;
    public final void rule__EditionScheme__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2809:1: ( ( ( rule__EditionScheme__ParameterAssignment_3_1_1 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2810:1: ( ( rule__EditionScheme__ParameterAssignment_3_1_1 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2810:1: ( ( rule__EditionScheme__ParameterAssignment_3_1_1 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2811:1: ( rule__EditionScheme__ParameterAssignment_3_1_1 )
            {
             before(grammarAccess.getEditionSchemeAccess().getParameterAssignment_3_1_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2812:1: ( rule__EditionScheme__ParameterAssignment_3_1_1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2812:2: rule__EditionScheme__ParameterAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__EditionScheme__ParameterAssignment_3_1_1_in_rule__EditionScheme__Group_3_1__1__Impl5671);
            rule__EditionScheme__ParameterAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEditionSchemeAccess().getParameterAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__Group_3_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2826:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2830:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2831:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__05705);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__05708);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2838:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__WidgetAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2842:1: ( ( ( rule__Parameter__WidgetAssignment_0 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2843:1: ( ( rule__Parameter__WidgetAssignment_0 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2843:1: ( ( rule__Parameter__WidgetAssignment_0 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2844:1: ( rule__Parameter__WidgetAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getWidgetAssignment_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2845:1: ( rule__Parameter__WidgetAssignment_0 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2845:2: rule__Parameter__WidgetAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__WidgetAssignment_0_in_rule__Parameter__Group__0__Impl5735);
            rule__Parameter__WidgetAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getWidgetAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2855:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2859:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2860:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__15765);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__15768);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2867:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2871:1: ( ( ':' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2872:1: ( ':' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2872:1: ( ':' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2873:1: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,45,FOLLOW_45_in_rule__Parameter__Group__1__Impl5796); 
             after(grammarAccess.getParameterAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2886:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2890:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2891:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__25827);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__25830);
            rule__Parameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2898:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__EditionPatternAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2902:1: ( ( ( rule__Parameter__EditionPatternAssignment_2 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2903:1: ( ( rule__Parameter__EditionPatternAssignment_2 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2903:1: ( ( rule__Parameter__EditionPatternAssignment_2 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2904:1: ( rule__Parameter__EditionPatternAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getEditionPatternAssignment_2()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2905:1: ( rule__Parameter__EditionPatternAssignment_2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2905:2: rule__Parameter__EditionPatternAssignment_2
            {
            pushFollow(FOLLOW_rule__Parameter__EditionPatternAssignment_2_in_rule__Parameter__Group__2__Impl5857);
            rule__Parameter__EditionPatternAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getEditionPatternAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2915:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2919:1: ( rule__Parameter__Group__3__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2920:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__35887);
            rule__Parameter__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2926:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__NameAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2930:1: ( ( ( rule__Parameter__NameAssignment_3 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2931:1: ( ( rule__Parameter__NameAssignment_3 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2931:1: ( ( rule__Parameter__NameAssignment_3 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2932:1: ( rule__Parameter__NameAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_3()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2933:1: ( rule__Parameter__NameAssignment_3 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2933:2: rule__Parameter__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_3_in_rule__Parameter__Group__3__Impl5914);
            rule__Parameter__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__DeclarePatternRole__Group__0"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2951:1: rule__DeclarePatternRole__Group__0 : rule__DeclarePatternRole__Group__0__Impl rule__DeclarePatternRole__Group__1 ;
    public final void rule__DeclarePatternRole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2955:1: ( rule__DeclarePatternRole__Group__0__Impl rule__DeclarePatternRole__Group__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2956:2: rule__DeclarePatternRole__Group__0__Impl rule__DeclarePatternRole__Group__1
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__Group__0__Impl_in_rule__DeclarePatternRole__Group__05952);
            rule__DeclarePatternRole__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclarePatternRole__Group__1_in_rule__DeclarePatternRole__Group__05955);
            rule__DeclarePatternRole__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarePatternRole__Group__0"


    // $ANTLR start "rule__DeclarePatternRole__Group__0__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2963:1: rule__DeclarePatternRole__Group__0__Impl : ( ( rule__DeclarePatternRole__PatternRoleAssignment_0 ) ) ;
    public final void rule__DeclarePatternRole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2967:1: ( ( ( rule__DeclarePatternRole__PatternRoleAssignment_0 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2968:1: ( ( rule__DeclarePatternRole__PatternRoleAssignment_0 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2968:1: ( ( rule__DeclarePatternRole__PatternRoleAssignment_0 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2969:1: ( rule__DeclarePatternRole__PatternRoleAssignment_0 )
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getPatternRoleAssignment_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2970:1: ( rule__DeclarePatternRole__PatternRoleAssignment_0 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2970:2: rule__DeclarePatternRole__PatternRoleAssignment_0
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__PatternRoleAssignment_0_in_rule__DeclarePatternRole__Group__0__Impl5982);
            rule__DeclarePatternRole__PatternRoleAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarePatternRoleAccess().getPatternRoleAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarePatternRole__Group__0__Impl"


    // $ANTLR start "rule__DeclarePatternRole__Group__1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2980:1: rule__DeclarePatternRole__Group__1 : rule__DeclarePatternRole__Group__1__Impl rule__DeclarePatternRole__Group__2 ;
    public final void rule__DeclarePatternRole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2984:1: ( rule__DeclarePatternRole__Group__1__Impl rule__DeclarePatternRole__Group__2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2985:2: rule__DeclarePatternRole__Group__1__Impl rule__DeclarePatternRole__Group__2
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__Group__1__Impl_in_rule__DeclarePatternRole__Group__16012);
            rule__DeclarePatternRole__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclarePatternRole__Group__2_in_rule__DeclarePatternRole__Group__16015);
            rule__DeclarePatternRole__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarePatternRole__Group__1"


    // $ANTLR start "rule__DeclarePatternRole__Group__1__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2992:1: rule__DeclarePatternRole__Group__1__Impl : ( '=' ) ;
    public final void rule__DeclarePatternRole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2996:1: ( ( '=' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2997:1: ( '=' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2997:1: ( '=' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2998:1: '='
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getEqualsSignKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__DeclarePatternRole__Group__1__Impl6043); 
             after(grammarAccess.getDeclarePatternRoleAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarePatternRole__Group__1__Impl"


    // $ANTLR start "rule__DeclarePatternRole__Group__2"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3011:1: rule__DeclarePatternRole__Group__2 : rule__DeclarePatternRole__Group__2__Impl rule__DeclarePatternRole__Group__3 ;
    public final void rule__DeclarePatternRole__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3015:1: ( rule__DeclarePatternRole__Group__2__Impl rule__DeclarePatternRole__Group__3 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3016:2: rule__DeclarePatternRole__Group__2__Impl rule__DeclarePatternRole__Group__3
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__Group__2__Impl_in_rule__DeclarePatternRole__Group__26074);
            rule__DeclarePatternRole__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclarePatternRole__Group__3_in_rule__DeclarePatternRole__Group__26077);
            rule__DeclarePatternRole__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarePatternRole__Group__2"


    // $ANTLR start "rule__DeclarePatternRole__Group__2__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3023:1: rule__DeclarePatternRole__Group__2__Impl : ( 'parameters' ) ;
    public final void rule__DeclarePatternRole__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3027:1: ( ( 'parameters' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3028:1: ( 'parameters' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3028:1: ( 'parameters' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3029:1: 'parameters'
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getParametersKeyword_2()); 
            match(input,46,FOLLOW_46_in_rule__DeclarePatternRole__Group__2__Impl6105); 
             after(grammarAccess.getDeclarePatternRoleAccess().getParametersKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarePatternRole__Group__2__Impl"


    // $ANTLR start "rule__DeclarePatternRole__Group__3"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3042:1: rule__DeclarePatternRole__Group__3 : rule__DeclarePatternRole__Group__3__Impl rule__DeclarePatternRole__Group__4 ;
    public final void rule__DeclarePatternRole__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3046:1: ( rule__DeclarePatternRole__Group__3__Impl rule__DeclarePatternRole__Group__4 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3047:2: rule__DeclarePatternRole__Group__3__Impl rule__DeclarePatternRole__Group__4
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__Group__3__Impl_in_rule__DeclarePatternRole__Group__36136);
            rule__DeclarePatternRole__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclarePatternRole__Group__4_in_rule__DeclarePatternRole__Group__36139);
            rule__DeclarePatternRole__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarePatternRole__Group__3"


    // $ANTLR start "rule__DeclarePatternRole__Group__3__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3054:1: rule__DeclarePatternRole__Group__3__Impl : ( '.' ) ;
    public final void rule__DeclarePatternRole__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3058:1: ( ( '.' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3059:1: ( '.' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3059:1: ( '.' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3060:1: '.'
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getFullStopKeyword_3()); 
            match(input,47,FOLLOW_47_in_rule__DeclarePatternRole__Group__3__Impl6167); 
             after(grammarAccess.getDeclarePatternRoleAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarePatternRole__Group__3__Impl"


    // $ANTLR start "rule__DeclarePatternRole__Group__4"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3073:1: rule__DeclarePatternRole__Group__4 : rule__DeclarePatternRole__Group__4__Impl rule__DeclarePatternRole__Group__5 ;
    public final void rule__DeclarePatternRole__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3077:1: ( rule__DeclarePatternRole__Group__4__Impl rule__DeclarePatternRole__Group__5 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3078:2: rule__DeclarePatternRole__Group__4__Impl rule__DeclarePatternRole__Group__5
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__Group__4__Impl_in_rule__DeclarePatternRole__Group__46198);
            rule__DeclarePatternRole__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclarePatternRole__Group__5_in_rule__DeclarePatternRole__Group__46201);
            rule__DeclarePatternRole__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarePatternRole__Group__4"


    // $ANTLR start "rule__DeclarePatternRole__Group__4__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3085:1: rule__DeclarePatternRole__Group__4__Impl : ( ( rule__DeclarePatternRole__ParameterAssignment_4 ) ) ;
    public final void rule__DeclarePatternRole__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3089:1: ( ( ( rule__DeclarePatternRole__ParameterAssignment_4 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3090:1: ( ( rule__DeclarePatternRole__ParameterAssignment_4 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3090:1: ( ( rule__DeclarePatternRole__ParameterAssignment_4 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3091:1: ( rule__DeclarePatternRole__ParameterAssignment_4 )
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getParameterAssignment_4()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3092:1: ( rule__DeclarePatternRole__ParameterAssignment_4 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3092:2: rule__DeclarePatternRole__ParameterAssignment_4
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__ParameterAssignment_4_in_rule__DeclarePatternRole__Group__4__Impl6228);
            rule__DeclarePatternRole__ParameterAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDeclarePatternRoleAccess().getParameterAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarePatternRole__Group__4__Impl"


    // $ANTLR start "rule__DeclarePatternRole__Group__5"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3102:1: rule__DeclarePatternRole__Group__5 : rule__DeclarePatternRole__Group__5__Impl ;
    public final void rule__DeclarePatternRole__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3106:1: ( rule__DeclarePatternRole__Group__5__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3107:2: rule__DeclarePatternRole__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__Group__5__Impl_in_rule__DeclarePatternRole__Group__56258);
            rule__DeclarePatternRole__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarePatternRole__Group__5"


    // $ANTLR start "rule__DeclarePatternRole__Group__5__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3113:1: rule__DeclarePatternRole__Group__5__Impl : ( ';' ) ;
    public final void rule__DeclarePatternRole__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3117:1: ( ( ';' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3118:1: ( ';' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3118:1: ( ';' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3119:1: ';'
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getSemicolonKeyword_5()); 
            match(input,36,FOLLOW_36_in_rule__DeclarePatternRole__Group__5__Impl6286); 
             after(grammarAccess.getDeclarePatternRoleAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarePatternRole__Group__5__Impl"


    // $ANTLR start "rule__DeleteAction__Group__0"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3144:1: rule__DeleteAction__Group__0 : rule__DeleteAction__Group__0__Impl rule__DeleteAction__Group__1 ;
    public final void rule__DeleteAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3148:1: ( rule__DeleteAction__Group__0__Impl rule__DeleteAction__Group__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3149:2: rule__DeleteAction__Group__0__Impl rule__DeleteAction__Group__1
            {
            pushFollow(FOLLOW_rule__DeleteAction__Group__0__Impl_in_rule__DeleteAction__Group__06329);
            rule__DeleteAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeleteAction__Group__1_in_rule__DeleteAction__Group__06332);
            rule__DeleteAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteAction__Group__0"


    // $ANTLR start "rule__DeleteAction__Group__0__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3156:1: rule__DeleteAction__Group__0__Impl : ( 'delete' ) ;
    public final void rule__DeleteAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3160:1: ( ( 'delete' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3161:1: ( 'delete' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3161:1: ( 'delete' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3162:1: 'delete'
            {
             before(grammarAccess.getDeleteActionAccess().getDeleteKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__DeleteAction__Group__0__Impl6360); 
             after(grammarAccess.getDeleteActionAccess().getDeleteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteAction__Group__0__Impl"


    // $ANTLR start "rule__DeleteAction__Group__1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3175:1: rule__DeleteAction__Group__1 : rule__DeleteAction__Group__1__Impl rule__DeleteAction__Group__2 ;
    public final void rule__DeleteAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3179:1: ( rule__DeleteAction__Group__1__Impl rule__DeleteAction__Group__2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3180:2: rule__DeleteAction__Group__1__Impl rule__DeleteAction__Group__2
            {
            pushFollow(FOLLOW_rule__DeleteAction__Group__1__Impl_in_rule__DeleteAction__Group__16391);
            rule__DeleteAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeleteAction__Group__2_in_rule__DeleteAction__Group__16394);
            rule__DeleteAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteAction__Group__1"


    // $ANTLR start "rule__DeleteAction__Group__1__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3187:1: rule__DeleteAction__Group__1__Impl : ( ( rule__DeleteAction__PatternRoleAssignment_1 ) ) ;
    public final void rule__DeleteAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3191:1: ( ( ( rule__DeleteAction__PatternRoleAssignment_1 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3192:1: ( ( rule__DeleteAction__PatternRoleAssignment_1 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3192:1: ( ( rule__DeleteAction__PatternRoleAssignment_1 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3193:1: ( rule__DeleteAction__PatternRoleAssignment_1 )
            {
             before(grammarAccess.getDeleteActionAccess().getPatternRoleAssignment_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3194:1: ( rule__DeleteAction__PatternRoleAssignment_1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3194:2: rule__DeleteAction__PatternRoleAssignment_1
            {
            pushFollow(FOLLOW_rule__DeleteAction__PatternRoleAssignment_1_in_rule__DeleteAction__Group__1__Impl6421);
            rule__DeleteAction__PatternRoleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeleteActionAccess().getPatternRoleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteAction__Group__1__Impl"


    // $ANTLR start "rule__DeleteAction__Group__2"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3204:1: rule__DeleteAction__Group__2 : rule__DeleteAction__Group__2__Impl ;
    public final void rule__DeleteAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3208:1: ( rule__DeleteAction__Group__2__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3209:2: rule__DeleteAction__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DeleteAction__Group__2__Impl_in_rule__DeleteAction__Group__26451);
            rule__DeleteAction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteAction__Group__2"


    // $ANTLR start "rule__DeleteAction__Group__2__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3215:1: rule__DeleteAction__Group__2__Impl : ( ';' ) ;
    public final void rule__DeleteAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3219:1: ( ( ';' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3220:1: ( ';' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3220:1: ( ';' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3221:1: ';'
            {
             before(grammarAccess.getDeleteActionAccess().getSemicolonKeyword_2()); 
            match(input,36,FOLLOW_36_in_rule__DeleteAction__Group__2__Impl6479); 
             after(grammarAccess.getDeleteActionAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteAction__Group__2__Impl"


    // $ANTLR start "rule__ViewDef__NameAssignment_1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3241:1: rule__ViewDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ViewDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3245:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3246:1: ( RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3246:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3247:1: RULE_ID
            {
             before(grammarAccess.getViewDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ViewDef__NameAssignment_16521); 
             after(grammarAccess.getViewDefAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDef__NameAssignment_1"


    // $ANTLR start "rule__ViewDef__UriAssignment_4"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3256:1: rule__ViewDef__UriAssignment_4 : ( RULE_URISTRING ) ;
    public final void rule__ViewDef__UriAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3260:1: ( ( RULE_URISTRING ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3261:1: ( RULE_URISTRING )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3261:1: ( RULE_URISTRING )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3262:1: RULE_URISTRING
            {
             before(grammarAccess.getViewDefAccess().getUriURISTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_URISTRING,FOLLOW_RULE_URISTRING_in_rule__ViewDef__UriAssignment_46552); 
             after(grammarAccess.getViewDefAccess().getUriURISTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDef__UriAssignment_4"


    // $ANTLR start "rule__ViewDef__ElementsAssignment_6"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3271:1: rule__ViewDef__ElementsAssignment_6 : ( ruleVirtualModel ) ;
    public final void rule__ViewDef__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3275:1: ( ( ruleVirtualModel ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3276:1: ( ruleVirtualModel )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3276:1: ( ruleVirtualModel )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3277:1: ruleVirtualModel
            {
             before(grammarAccess.getViewDefAccess().getElementsVirtualModelParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleVirtualModel_in_rule__ViewDef__ElementsAssignment_66583);
            ruleVirtualModel();

            state._fsp--;

             after(grammarAccess.getViewDefAccess().getElementsVirtualModelParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDef__ElementsAssignment_6"


    // $ANTLR start "rule__VirtualModel__NameAssignment_1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3286:1: rule__VirtualModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VirtualModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3290:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3291:1: ( RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3291:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3292:1: RULE_ID
            {
             before(grammarAccess.getVirtualModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VirtualModel__NameAssignment_16614); 
             after(grammarAccess.getVirtualModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__NameAssignment_1"


    // $ANTLR start "rule__VirtualModel__TypeAssignment_2_2"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3301:1: rule__VirtualModel__TypeAssignment_2_2 : ( ruleVMTYPE ) ;
    public final void rule__VirtualModel__TypeAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3305:1: ( ( ruleVMTYPE ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3306:1: ( ruleVMTYPE )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3306:1: ( ruleVMTYPE )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3307:1: ruleVMTYPE
            {
             before(grammarAccess.getVirtualModelAccess().getTypeVMTYPEEnumRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleVMTYPE_in_rule__VirtualModel__TypeAssignment_2_26645);
            ruleVMTYPE();

            state._fsp--;

             after(grammarAccess.getVirtualModelAccess().getTypeVMTYPEEnumRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__TypeAssignment_2_2"


    // $ANTLR start "rule__VirtualModel__UriAssignment_5"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3316:1: rule__VirtualModel__UriAssignment_5 : ( RULE_URISTRING ) ;
    public final void rule__VirtualModel__UriAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3320:1: ( ( RULE_URISTRING ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3321:1: ( RULE_URISTRING )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3321:1: ( RULE_URISTRING )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3322:1: RULE_URISTRING
            {
             before(grammarAccess.getVirtualModelAccess().getUriURISTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_URISTRING,FOLLOW_RULE_URISTRING_in_rule__VirtualModel__UriAssignment_56676); 
             after(grammarAccess.getVirtualModelAccess().getUriURISTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__UriAssignment_5"


    // $ANTLR start "rule__VirtualModel__ModelSlotsAssignment_7"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3331:1: rule__VirtualModel__ModelSlotsAssignment_7 : ( ruleModelSlot ) ;
    public final void rule__VirtualModel__ModelSlotsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3335:1: ( ( ruleModelSlot ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3336:1: ( ruleModelSlot )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3336:1: ( ruleModelSlot )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3337:1: ruleModelSlot
            {
             before(grammarAccess.getVirtualModelAccess().getModelSlotsModelSlotParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleModelSlot_in_rule__VirtualModel__ModelSlotsAssignment_76707);
            ruleModelSlot();

            state._fsp--;

             after(grammarAccess.getVirtualModelAccess().getModelSlotsModelSlotParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__ModelSlotsAssignment_7"


    // $ANTLR start "rule__VirtualModel__EditionPatternsAssignment_8"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3346:1: rule__VirtualModel__EditionPatternsAssignment_8 : ( ruleEditionPattern ) ;
    public final void rule__VirtualModel__EditionPatternsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3350:1: ( ( ruleEditionPattern ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3351:1: ( ruleEditionPattern )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3351:1: ( ruleEditionPattern )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3352:1: ruleEditionPattern
            {
             before(grammarAccess.getVirtualModelAccess().getEditionPatternsEditionPatternParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleEditionPattern_in_rule__VirtualModel__EditionPatternsAssignment_86738);
            ruleEditionPattern();

            state._fsp--;

             after(grammarAccess.getVirtualModelAccess().getEditionPatternsEditionPatternParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VirtualModel__EditionPatternsAssignment_8"


    // $ANTLR start "rule__ModelSlot__NameAssignment_1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3361:1: rule__ModelSlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ModelSlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3365:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3366:1: ( RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3366:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3367:1: RULE_ID
            {
             before(grammarAccess.getModelSlotAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModelSlot__NameAssignment_16769); 
             after(grammarAccess.getModelSlotAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__NameAssignment_1"


    // $ANTLR start "rule__ModelSlot__TypeAssignment_4"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3376:1: rule__ModelSlot__TypeAssignment_4 : ( ruleMSTYPE ) ;
    public final void rule__ModelSlot__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3380:1: ( ( ruleMSTYPE ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3381:1: ( ruleMSTYPE )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3381:1: ( ruleMSTYPE )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3382:1: ruleMSTYPE
            {
             before(grammarAccess.getModelSlotAccess().getTypeMSTYPEEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMSTYPE_in_rule__ModelSlot__TypeAssignment_46800);
            ruleMSTYPE();

            state._fsp--;

             after(grammarAccess.getModelSlotAccess().getTypeMSTYPEEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__TypeAssignment_4"


    // $ANTLR start "rule__ModelSlot__UriAssignment_7"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3391:1: rule__ModelSlot__UriAssignment_7 : ( RULE_URISTRING ) ;
    public final void rule__ModelSlot__UriAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3395:1: ( ( RULE_URISTRING ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3396:1: ( RULE_URISTRING )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3396:1: ( RULE_URISTRING )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3397:1: RULE_URISTRING
            {
             before(grammarAccess.getModelSlotAccess().getUriURISTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_URISTRING,FOLLOW_RULE_URISTRING_in_rule__ModelSlot__UriAssignment_76831); 
             after(grammarAccess.getModelSlotAccess().getUriURISTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__UriAssignment_7"


    // $ANTLR start "rule__ModelSlot__RequiredAssignment_10"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3406:1: rule__ModelSlot__RequiredAssignment_10 : ( RULE_BOOL ) ;
    public final void rule__ModelSlot__RequiredAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3410:1: ( ( RULE_BOOL ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3411:1: ( RULE_BOOL )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3411:1: ( RULE_BOOL )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3412:1: RULE_BOOL
            {
             before(grammarAccess.getModelSlotAccess().getRequiredBOOLTerminalRuleCall_10_0()); 
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__ModelSlot__RequiredAssignment_106862); 
             after(grammarAccess.getModelSlotAccess().getRequiredBOOLTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__RequiredAssignment_10"


    // $ANTLR start "rule__ModelSlot__ReadOnlyAssignment_13"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3421:1: rule__ModelSlot__ReadOnlyAssignment_13 : ( RULE_BOOL ) ;
    public final void rule__ModelSlot__ReadOnlyAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3425:1: ( ( RULE_BOOL ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3426:1: ( RULE_BOOL )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3426:1: ( RULE_BOOL )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3427:1: RULE_BOOL
            {
             before(grammarAccess.getModelSlotAccess().getReadOnlyBOOLTerminalRuleCall_13_0()); 
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__ModelSlot__ReadOnlyAssignment_136893); 
             after(grammarAccess.getModelSlotAccess().getReadOnlyBOOLTerminalRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSlot__ReadOnlyAssignment_13"


    // $ANTLR start "rule__EditionPattern__NameAssignment_1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3436:1: rule__EditionPattern__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EditionPattern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3440:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3441:1: ( RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3441:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3442:1: RULE_ID
            {
             before(grammarAccess.getEditionPatternAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EditionPattern__NameAssignment_16924); 
             after(grammarAccess.getEditionPatternAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionPattern__NameAssignment_1"


    // $ANTLR start "rule__EditionPattern__SuperEditionPatternAssignment_2_1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3451:1: rule__EditionPattern__SuperEditionPatternAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__EditionPattern__SuperEditionPatternAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3455:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3456:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3456:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3457:1: ( RULE_ID )
            {
             before(grammarAccess.getEditionPatternAccess().getSuperEditionPatternEditionPatternCrossReference_2_1_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3458:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3459:1: RULE_ID
            {
             before(grammarAccess.getEditionPatternAccess().getSuperEditionPatternEditionPatternIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EditionPattern__SuperEditionPatternAssignment_2_16959); 
             after(grammarAccess.getEditionPatternAccess().getSuperEditionPatternEditionPatternIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEditionPatternAccess().getSuperEditionPatternEditionPatternCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionPattern__SuperEditionPatternAssignment_2_1"


    // $ANTLR start "rule__EditionPattern__PatternRolesAssignment_4"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3470:1: rule__EditionPattern__PatternRolesAssignment_4 : ( rulePatternRole ) ;
    public final void rule__EditionPattern__PatternRolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3474:1: ( ( rulePatternRole ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3475:1: ( rulePatternRole )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3475:1: ( rulePatternRole )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3476:1: rulePatternRole
            {
             before(grammarAccess.getEditionPatternAccess().getPatternRolesPatternRoleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePatternRole_in_rule__EditionPattern__PatternRolesAssignment_46994);
            rulePatternRole();

            state._fsp--;

             after(grammarAccess.getEditionPatternAccess().getPatternRolesPatternRoleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionPattern__PatternRolesAssignment_4"


    // $ANTLR start "rule__EditionPattern__EditionSchemesAssignment_5"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3485:1: rule__EditionPattern__EditionSchemesAssignment_5 : ( ruleEditionScheme ) ;
    public final void rule__EditionPattern__EditionSchemesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3489:1: ( ( ruleEditionScheme ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3490:1: ( ruleEditionScheme )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3490:1: ( ruleEditionScheme )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3491:1: ruleEditionScheme
            {
             before(grammarAccess.getEditionPatternAccess().getEditionSchemesEditionSchemeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEditionScheme_in_rule__EditionPattern__EditionSchemesAssignment_57025);
            ruleEditionScheme();

            state._fsp--;

             after(grammarAccess.getEditionPatternAccess().getEditionSchemesEditionSchemeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionPattern__EditionSchemesAssignment_5"


    // $ANTLR start "rule__PatternRole__NameAssignment_1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3500:1: rule__PatternRole__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PatternRole__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3504:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3505:1: ( RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3505:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3506:1: RULE_ID
            {
             before(grammarAccess.getPatternRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PatternRole__NameAssignment_17056); 
             after(grammarAccess.getPatternRoleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternRole__NameAssignment_1"


    // $ANTLR start "rule__PatternRole__TypeAssignment_3"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3515:1: rule__PatternRole__TypeAssignment_3 : ( rulePRTYPE ) ;
    public final void rule__PatternRole__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3519:1: ( ( rulePRTYPE ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3520:1: ( rulePRTYPE )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3520:1: ( rulePRTYPE )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3521:1: rulePRTYPE
            {
             before(grammarAccess.getPatternRoleAccess().getTypePRTYPEEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePRTYPE_in_rule__PatternRole__TypeAssignment_37087);
            rulePRTYPE();

            state._fsp--;

             after(grammarAccess.getPatternRoleAccess().getTypePRTYPEEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternRole__TypeAssignment_3"


    // $ANTLR start "rule__PatternRole__ModelElementAssignment_5"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3530:1: rule__PatternRole__ModelElementAssignment_5 : ( RULE_STRING ) ;
    public final void rule__PatternRole__ModelElementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3534:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3535:1: ( RULE_STRING )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3535:1: ( RULE_STRING )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3536:1: RULE_STRING
            {
             before(grammarAccess.getPatternRoleAccess().getModelElementSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PatternRole__ModelElementAssignment_57118); 
             after(grammarAccess.getPatternRoleAccess().getModelElementSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternRole__ModelElementAssignment_5"


    // $ANTLR start "rule__PatternRole__ModelSlotAssignment_7"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3545:1: rule__PatternRole__ModelSlotAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__PatternRole__ModelSlotAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3549:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3550:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3550:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3551:1: ( RULE_ID )
            {
             before(grammarAccess.getPatternRoleAccess().getModelSlotModelSlotCrossReference_7_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3552:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3553:1: RULE_ID
            {
             before(grammarAccess.getPatternRoleAccess().getModelSlotModelSlotIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PatternRole__ModelSlotAssignment_77153); 
             after(grammarAccess.getPatternRoleAccess().getModelSlotModelSlotIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getPatternRoleAccess().getModelSlotModelSlotCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternRole__ModelSlotAssignment_7"


    // $ANTLR start "rule__EditionScheme__EditionSchemeTypeAssignment_0"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3564:1: rule__EditionScheme__EditionSchemeTypeAssignment_0 : ( ruleEditionSchemeType ) ;
    public final void rule__EditionScheme__EditionSchemeTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3568:1: ( ( ruleEditionSchemeType ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3569:1: ( ruleEditionSchemeType )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3569:1: ( ruleEditionSchemeType )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3570:1: ruleEditionSchemeType
            {
             before(grammarAccess.getEditionSchemeAccess().getEditionSchemeTypeEditionSchemeTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEditionSchemeType_in_rule__EditionScheme__EditionSchemeTypeAssignment_07188);
            ruleEditionSchemeType();

            state._fsp--;

             after(grammarAccess.getEditionSchemeAccess().getEditionSchemeTypeEditionSchemeTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__EditionSchemeTypeAssignment_0"


    // $ANTLR start "rule__EditionScheme__NameAssignment_1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3579:1: rule__EditionScheme__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EditionScheme__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3583:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3584:1: ( RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3584:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3585:1: RULE_ID
            {
             before(grammarAccess.getEditionSchemeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EditionScheme__NameAssignment_17219); 
             after(grammarAccess.getEditionSchemeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__NameAssignment_1"


    // $ANTLR start "rule__EditionScheme__ParameterAssignment_3_0"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3594:1: rule__EditionScheme__ParameterAssignment_3_0 : ( ruleParameter ) ;
    public final void rule__EditionScheme__ParameterAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3598:1: ( ( ruleParameter ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3599:1: ( ruleParameter )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3599:1: ( ruleParameter )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3600:1: ruleParameter
            {
             before(grammarAccess.getEditionSchemeAccess().getParameterParameterParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__EditionScheme__ParameterAssignment_3_07250);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getEditionSchemeAccess().getParameterParameterParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__ParameterAssignment_3_0"


    // $ANTLR start "rule__EditionScheme__ParameterAssignment_3_1_1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3609:1: rule__EditionScheme__ParameterAssignment_3_1_1 : ( ruleParameter ) ;
    public final void rule__EditionScheme__ParameterAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3613:1: ( ( ruleParameter ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3614:1: ( ruleParameter )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3614:1: ( ruleParameter )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3615:1: ruleParameter
            {
             before(grammarAccess.getEditionSchemeAccess().getParameterParameterParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__EditionScheme__ParameterAssignment_3_1_17281);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getEditionSchemeAccess().getParameterParameterParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__ParameterAssignment_3_1_1"


    // $ANTLR start "rule__EditionScheme__EditionActionAssignment_6"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3624:1: rule__EditionScheme__EditionActionAssignment_6 : ( ruleEditionAction ) ;
    public final void rule__EditionScheme__EditionActionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3628:1: ( ( ruleEditionAction ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3629:1: ( ruleEditionAction )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3629:1: ( ruleEditionAction )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3630:1: ruleEditionAction
            {
             before(grammarAccess.getEditionSchemeAccess().getEditionActionEditionActionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleEditionAction_in_rule__EditionScheme__EditionActionAssignment_67312);
            ruleEditionAction();

            state._fsp--;

             after(grammarAccess.getEditionSchemeAccess().getEditionActionEditionActionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionScheme__EditionActionAssignment_6"


    // $ANTLR start "rule__Parameter__WidgetAssignment_0"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3639:1: rule__Parameter__WidgetAssignment_0 : ( rulePRTYPE ) ;
    public final void rule__Parameter__WidgetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3643:1: ( ( rulePRTYPE ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3644:1: ( rulePRTYPE )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3644:1: ( rulePRTYPE )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3645:1: rulePRTYPE
            {
             before(grammarAccess.getParameterAccess().getWidgetPRTYPEEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePRTYPE_in_rule__Parameter__WidgetAssignment_07343);
            rulePRTYPE();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getWidgetPRTYPEEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__WidgetAssignment_0"


    // $ANTLR start "rule__Parameter__EditionPatternAssignment_2"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3654:1: rule__Parameter__EditionPatternAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__EditionPatternAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3658:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3659:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3659:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3660:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getEditionPatternEditionPatternCrossReference_2_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3661:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3662:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getEditionPatternEditionPatternIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__EditionPatternAssignment_27378); 
             after(grammarAccess.getParameterAccess().getEditionPatternEditionPatternIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getEditionPatternEditionPatternCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__EditionPatternAssignment_2"


    // $ANTLR start "rule__Parameter__NameAssignment_3"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3673:1: rule__Parameter__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3677:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3678:1: ( RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3678:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3679:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_37413); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_3"


    // $ANTLR start "rule__DeclarePatternRole__PatternRoleAssignment_0"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3688:1: rule__DeclarePatternRole__PatternRoleAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DeclarePatternRole__PatternRoleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3692:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3693:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3693:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3694:1: ( RULE_ID )
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getPatternRolePatternRoleCrossReference_0_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3695:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3696:1: RULE_ID
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getPatternRolePatternRoleIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeclarePatternRole__PatternRoleAssignment_07448); 
             after(grammarAccess.getDeclarePatternRoleAccess().getPatternRolePatternRoleIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDeclarePatternRoleAccess().getPatternRolePatternRoleCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarePatternRole__PatternRoleAssignment_0"


    // $ANTLR start "rule__DeclarePatternRole__ParameterAssignment_4"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3707:1: rule__DeclarePatternRole__ParameterAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__DeclarePatternRole__ParameterAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3711:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3712:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3712:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3713:1: ( RULE_ID )
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getParameterParameterCrossReference_4_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3714:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3715:1: RULE_ID
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getParameterParameterIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeclarePatternRole__ParameterAssignment_47487); 
             after(grammarAccess.getDeclarePatternRoleAccess().getParameterParameterIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDeclarePatternRoleAccess().getParameterParameterCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarePatternRole__ParameterAssignment_4"


    // $ANTLR start "rule__DeleteAction__PatternRoleAssignment_1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3726:1: rule__DeleteAction__PatternRoleAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DeleteAction__PatternRoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3730:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3731:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3731:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3732:1: ( RULE_ID )
            {
             before(grammarAccess.getDeleteActionAccess().getPatternRolePatternRoleCrossReference_1_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3733:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3734:1: RULE_ID
            {
             before(grammarAccess.getDeleteActionAccess().getPatternRolePatternRoleIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeleteAction__PatternRoleAssignment_17526); 
             after(grammarAccess.getDeleteActionAccess().getPatternRolePatternRoleIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDeleteActionAccess().getPatternRolePatternRoleCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteAction__PatternRoleAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleViewDef_in_entryRuleViewDef61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewDef68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__0_in_ruleViewDef94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVirtualModel_in_entryRuleVirtualModel121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVirtualModel128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__0_in_ruleVirtualModel154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelSlot_in_entryRuleModelSlot181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelSlot188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__0_in_ruleModelSlot214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditionPattern_in_entryRuleEditionPattern241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEditionPattern248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__0_in_ruleEditionPattern274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternRole_in_entryRulePatternRole301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatternRole308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__0_in_rulePatternRole334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditionScheme_in_entryRuleEditionScheme361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEditionScheme368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__0_in_ruleEditionScheme394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditionAction_in_entryRuleEditionAction481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEditionAction488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInAction_in_ruleEditionAction514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInAction_in_entryRuleBuiltInAction540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInAction547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInAction__Alternatives_in_ruleBuiltInAction573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarePatternRole_in_entryRuleDeclarePatternRole600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarePatternRole607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group__0_in_ruleDeclarePatternRole633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteAction_in_entryRuleDeleteAction660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteAction667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteAction__Group__0_in_ruleDeleteAction693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionSchemeType__Alternatives_in_ruleEditionSchemeType730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MSTYPE__Alternatives_in_ruleMSTYPE766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VMTYPE__Alternatives_in_ruleVMTYPE802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePRTYPE839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarePatternRole_in_rule__BuiltInAction__Alternatives876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteAction_in_rule__BuiltInAction__Alternatives893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EditionSchemeType__Alternatives926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EditionSchemeType__Alternatives947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EditionSchemeType__Alternatives968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EditionSchemeType__Alternatives989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MSTYPE__Alternatives1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MSTYPE__Alternatives1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MSTYPE__Alternatives1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MSTYPE__Alternatives1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MSTYPE__Alternatives1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__VMTYPE__Alternatives1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__VMTYPE__Alternatives1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__0__Impl_in_rule__ViewDef__Group__01199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__1_in_rule__ViewDef__Group__01202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ViewDef__Group__0__Impl1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__1__Impl_in_rule__ViewDef__Group__11261 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__2_in_rule__ViewDef__Group__11264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDef__NameAssignment_1_in_rule__ViewDef__Group__1__Impl1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__2__Impl_in_rule__ViewDef__Group__21321 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__3_in_rule__ViewDef__Group__21324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ViewDef__Group__2__Impl1355 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_rule__ViewDef__Group__2__Impl1371 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__3__Impl_in_rule__ViewDef__Group__31406 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__4_in_rule__ViewDef__Group__31409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ViewDef__Group__3__Impl1440 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_rule__ViewDef__Group__3__Impl1456 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__4__Impl_in_rule__ViewDef__Group__41491 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__5_in_rule__ViewDef__Group__41494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDef__UriAssignment_4_in_rule__ViewDef__Group__4__Impl1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__5__Impl_in_rule__ViewDef__Group__51551 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__6_in_rule__ViewDef__Group__51554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ViewDef__Group__5__Impl1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__6__Impl_in_rule__ViewDef__Group__61613 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__7_in_rule__ViewDef__Group__61616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDef__ElementsAssignment_6_in_rule__ViewDef__Group__6__Impl1643 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__7__Impl_in_rule__ViewDef__Group__71674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ViewDef__Group__7__Impl1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__0__Impl_in_rule__VirtualModel__Group__01749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__1_in_rule__VirtualModel__Group__01752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__VirtualModel__Group__0__Impl1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__1__Impl_in_rule__VirtualModel__Group__11811 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__2_in_rule__VirtualModel__Group__11814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__NameAssignment_1_in_rule__VirtualModel__Group__1__Impl1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__2__Impl_in_rule__VirtualModel__Group__21871 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__3_in_rule__VirtualModel__Group__21874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group_2__0_in_rule__VirtualModel__Group__2__Impl1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__3__Impl_in_rule__VirtualModel__Group__31932 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__4_in_rule__VirtualModel__Group__31935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__VirtualModel__Group__3__Impl1966 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_rule__VirtualModel__Group__3__Impl1982 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__4__Impl_in_rule__VirtualModel__Group__42017 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__5_in_rule__VirtualModel__Group__42020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__VirtualModel__Group__4__Impl2051 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_rule__VirtualModel__Group__4__Impl2067 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__5__Impl_in_rule__VirtualModel__Group__52102 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__6_in_rule__VirtualModel__Group__52105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__UriAssignment_5_in_rule__VirtualModel__Group__5__Impl2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__6__Impl_in_rule__VirtualModel__Group__62162 = new BitSet(new long[]{0x0000002140000000L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__7_in_rule__VirtualModel__Group__62165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__VirtualModel__Group__6__Impl2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__7__Impl_in_rule__VirtualModel__Group__72224 = new BitSet(new long[]{0x0000002140000000L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__8_in_rule__VirtualModel__Group__72227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__ModelSlotsAssignment_7_in_rule__VirtualModel__Group__7__Impl2254 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__8__Impl_in_rule__VirtualModel__Group__82285 = new BitSet(new long[]{0x0000002140000000L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__9_in_rule__VirtualModel__Group__82288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__EditionPatternsAssignment_8_in_rule__VirtualModel__Group__8__Impl2315 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__9__Impl_in_rule__VirtualModel__Group__92346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__VirtualModel__Group__9__Impl2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group_2__0__Impl_in_rule__VirtualModel__Group_2__02425 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group_2__1_in_rule__VirtualModel__Group_2__02428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__VirtualModel__Group_2__0__Impl2459 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_rule__VirtualModel__Group_2__0__Impl2475 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group_2__1__Impl_in_rule__VirtualModel__Group_2__12510 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group_2__2_in_rule__VirtualModel__Group_2__12513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__VirtualModel__Group_2__1__Impl2544 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_rule__VirtualModel__Group_2__1__Impl2560 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group_2__2__Impl_in_rule__VirtualModel__Group_2__22595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__TypeAssignment_2_2_in_rule__VirtualModel__Group_2__2__Impl2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__0__Impl_in_rule__ModelSlot__Group__02658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__1_in_rule__ModelSlot__Group__02661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ModelSlot__Group__0__Impl2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__1__Impl_in_rule__ModelSlot__Group__12720 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__2_in_rule__ModelSlot__Group__12723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__NameAssignment_1_in_rule__ModelSlot__Group__1__Impl2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__2__Impl_in_rule__ModelSlot__Group__22780 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__3_in_rule__ModelSlot__Group__22783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ModelSlot__Group__2__Impl2814 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_rule__ModelSlot__Group__2__Impl2830 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__3__Impl_in_rule__ModelSlot__Group__32865 = new BitSet(new long[]{0x0000000000F80000L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__4_in_rule__ModelSlot__Group__32868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ModelSlot__Group__3__Impl2899 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_rule__ModelSlot__Group__3__Impl2915 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__4__Impl_in_rule__ModelSlot__Group__42950 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__5_in_rule__ModelSlot__Group__42953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__TypeAssignment_4_in_rule__ModelSlot__Group__4__Impl2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__5__Impl_in_rule__ModelSlot__Group__53010 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__6_in_rule__ModelSlot__Group__53013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ModelSlot__Group__5__Impl3044 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_rule__ModelSlot__Group__5__Impl3060 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__6__Impl_in_rule__ModelSlot__Group__63095 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__7_in_rule__ModelSlot__Group__63098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ModelSlot__Group__6__Impl3129 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_rule__ModelSlot__Group__6__Impl3145 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__7__Impl_in_rule__ModelSlot__Group__73180 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__8_in_rule__ModelSlot__Group__73183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__UriAssignment_7_in_rule__ModelSlot__Group__7__Impl3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__8__Impl_in_rule__ModelSlot__Group__83240 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__9_in_rule__ModelSlot__Group__83243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ModelSlot__Group__8__Impl3274 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_rule__ModelSlot__Group__8__Impl3290 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__9__Impl_in_rule__ModelSlot__Group__93325 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__10_in_rule__ModelSlot__Group__93328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ModelSlot__Group__9__Impl3359 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_rule__ModelSlot__Group__9__Impl3375 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__10__Impl_in_rule__ModelSlot__Group__103410 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__11_in_rule__ModelSlot__Group__103413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__RequiredAssignment_10_in_rule__ModelSlot__Group__10__Impl3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__11__Impl_in_rule__ModelSlot__Group__113470 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__12_in_rule__ModelSlot__Group__113473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ModelSlot__Group__11__Impl3504 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_rule__ModelSlot__Group__11__Impl3520 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__12__Impl_in_rule__ModelSlot__Group__123555 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__13_in_rule__ModelSlot__Group__123558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ModelSlot__Group__12__Impl3589 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_rule__ModelSlot__Group__12__Impl3605 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__13__Impl_in_rule__ModelSlot__Group__133640 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__14_in_rule__ModelSlot__Group__133643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__ReadOnlyAssignment_13_in_rule__ModelSlot__Group__13__Impl3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__14__Impl_in_rule__ModelSlot__Group__143700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ModelSlot__Group__14__Impl3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__0__Impl_in_rule__EditionPattern__Group__03789 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__1_in_rule__EditionPattern__Group__03792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EditionPattern__Group__0__Impl3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__1__Impl_in_rule__EditionPattern__Group__13851 = new BitSet(new long[]{0x0000004020000000L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__2_in_rule__EditionPattern__Group__13854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__NameAssignment_1_in_rule__EditionPattern__Group__1__Impl3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__2__Impl_in_rule__EditionPattern__Group__23911 = new BitSet(new long[]{0x0000004020000000L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__3_in_rule__EditionPattern__Group__23914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group_2__0_in_rule__EditionPattern__Group__2__Impl3941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__3__Impl_in_rule__EditionPattern__Group__33972 = new BitSet(new long[]{0x0000008040078000L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__4_in_rule__EditionPattern__Group__33975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EditionPattern__Group__3__Impl4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__4__Impl_in_rule__EditionPattern__Group__44034 = new BitSet(new long[]{0x0000008040078000L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__5_in_rule__EditionPattern__Group__44037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__PatternRolesAssignment_4_in_rule__EditionPattern__Group__4__Impl4064 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__5__Impl_in_rule__EditionPattern__Group__54095 = new BitSet(new long[]{0x0000008040078000L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__6_in_rule__EditionPattern__Group__54098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__EditionSchemesAssignment_5_in_rule__EditionPattern__Group__5__Impl4125 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__6__Impl_in_rule__EditionPattern__Group__64156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EditionPattern__Group__6__Impl4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group_2__0__Impl_in_rule__EditionPattern__Group_2__04229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group_2__1_in_rule__EditionPattern__Group_2__04232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EditionPattern__Group_2__0__Impl4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group_2__1__Impl_in_rule__EditionPattern__Group_2__14291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__SuperEditionPatternAssignment_2_1_in_rule__EditionPattern__Group_2__1__Impl4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__0__Impl_in_rule__PatternRole__Group__04352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__1_in_rule__PatternRole__Group__04355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__PatternRole__Group__0__Impl4383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__1__Impl_in_rule__PatternRole__Group__14414 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__2_in_rule__PatternRole__Group__14417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__NameAssignment_1_in_rule__PatternRole__Group__1__Impl4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__2__Impl_in_rule__PatternRole__Group__24474 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__3_in_rule__PatternRole__Group__24477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__PatternRole__Group__2__Impl4505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__3__Impl_in_rule__PatternRole__Group__34536 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__4_in_rule__PatternRole__Group__34539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__TypeAssignment_3_in_rule__PatternRole__Group__3__Impl4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__4__Impl_in_rule__PatternRole__Group__44596 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__5_in_rule__PatternRole__Group__44599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PatternRole__Group__4__Impl4627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__5__Impl_in_rule__PatternRole__Group__54658 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__6_in_rule__PatternRole__Group__54661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__ModelElementAssignment_5_in_rule__PatternRole__Group__5__Impl4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__6__Impl_in_rule__PatternRole__Group__64718 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__7_in_rule__PatternRole__Group__64721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__PatternRole__Group__6__Impl4749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__7__Impl_in_rule__PatternRole__Group__74780 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__8_in_rule__PatternRole__Group__74783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__ModelSlotAssignment_7_in_rule__PatternRole__Group__7__Impl4810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__8__Impl_in_rule__PatternRole__Group__84840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__PatternRole__Group__8__Impl4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__0__Impl_in_rule__EditionScheme__Group__04917 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__1_in_rule__EditionScheme__Group__04920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__EditionSchemeTypeAssignment_0_in_rule__EditionScheme__Group__0__Impl4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__1__Impl_in_rule__EditionScheme__Group__14977 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__2_in_rule__EditionScheme__Group__14980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__NameAssignment_1_in_rule__EditionScheme__Group__1__Impl5007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__2__Impl_in_rule__EditionScheme__Group__25037 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__3_in_rule__EditionScheme__Group__25040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EditionScheme__Group__2__Impl5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__3__Impl_in_rule__EditionScheme__Group__35099 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__4_in_rule__EditionScheme__Group__35102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group_3__0_in_rule__EditionScheme__Group__3__Impl5129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__4__Impl_in_rule__EditionScheme__Group__45160 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__5_in_rule__EditionScheme__Group__45163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__EditionScheme__Group__4__Impl5191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__5__Impl_in_rule__EditionScheme__Group__55222 = new BitSet(new long[]{0x0001000040000010L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__6_in_rule__EditionScheme__Group__55225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EditionScheme__Group__5__Impl5253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__6__Impl_in_rule__EditionScheme__Group__65284 = new BitSet(new long[]{0x0001000040000010L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__7_in_rule__EditionScheme__Group__65287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__EditionActionAssignment_6_in_rule__EditionScheme__Group__6__Impl5314 = new BitSet(new long[]{0x0001000000000012L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__7__Impl_in_rule__EditionScheme__Group__75345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EditionScheme__Group__7__Impl5373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group_3__0__Impl_in_rule__EditionScheme__Group_3__05420 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group_3__1_in_rule__EditionScheme__Group_3__05423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__ParameterAssignment_3_0_in_rule__EditionScheme__Group_3__0__Impl5452 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__EditionScheme__ParameterAssignment_3_0_in_rule__EditionScheme__Group_3__0__Impl5464 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group_3__1__Impl_in_rule__EditionScheme__Group_3__15497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group_3_1__0_in_rule__EditionScheme__Group_3__1__Impl5524 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group_3_1__0__Impl_in_rule__EditionScheme__Group_3_1__05559 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group_3_1__1_in_rule__EditionScheme__Group_3_1__05562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__EditionScheme__Group_3_1__0__Impl5593 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_rule__EditionScheme__Group_3_1__0__Impl5609 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group_3_1__1__Impl_in_rule__EditionScheme__Group_3_1__15644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__ParameterAssignment_3_1_1_in_rule__EditionScheme__Group_3_1__1__Impl5671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__05705 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__05708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__WidgetAssignment_0_in_rule__Parameter__Group__0__Impl5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__15765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__15768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Parameter__Group__1__Impl5796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__25827 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__25830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__EditionPatternAssignment_2_in_rule__Parameter__Group__2__Impl5857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__35887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_3_in_rule__Parameter__Group__3__Impl5914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group__0__Impl_in_rule__DeclarePatternRole__Group__05952 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group__1_in_rule__DeclarePatternRole__Group__05955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__PatternRoleAssignment_0_in_rule__DeclarePatternRole__Group__0__Impl5982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group__1__Impl_in_rule__DeclarePatternRole__Group__16012 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group__2_in_rule__DeclarePatternRole__Group__16015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DeclarePatternRole__Group__1__Impl6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group__2__Impl_in_rule__DeclarePatternRole__Group__26074 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group__3_in_rule__DeclarePatternRole__Group__26077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__DeclarePatternRole__Group__2__Impl6105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group__3__Impl_in_rule__DeclarePatternRole__Group__36136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group__4_in_rule__DeclarePatternRole__Group__36139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__DeclarePatternRole__Group__3__Impl6167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group__4__Impl_in_rule__DeclarePatternRole__Group__46198 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group__5_in_rule__DeclarePatternRole__Group__46201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__ParameterAssignment_4_in_rule__DeclarePatternRole__Group__4__Impl6228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group__5__Impl_in_rule__DeclarePatternRole__Group__56258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__DeclarePatternRole__Group__5__Impl6286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteAction__Group__0__Impl_in_rule__DeleteAction__Group__06329 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DeleteAction__Group__1_in_rule__DeleteAction__Group__06332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__DeleteAction__Group__0__Impl6360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteAction__Group__1__Impl_in_rule__DeleteAction__Group__16391 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__DeleteAction__Group__2_in_rule__DeleteAction__Group__16394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteAction__PatternRoleAssignment_1_in_rule__DeleteAction__Group__1__Impl6421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteAction__Group__2__Impl_in_rule__DeleteAction__Group__26451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__DeleteAction__Group__2__Impl6479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ViewDef__NameAssignment_16521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URISTRING_in_rule__ViewDef__UriAssignment_46552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVirtualModel_in_rule__ViewDef__ElementsAssignment_66583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VirtualModel__NameAssignment_16614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVMTYPE_in_rule__VirtualModel__TypeAssignment_2_26645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URISTRING_in_rule__VirtualModel__UriAssignment_56676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelSlot_in_rule__VirtualModel__ModelSlotsAssignment_76707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditionPattern_in_rule__VirtualModel__EditionPatternsAssignment_86738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModelSlot__NameAssignment_16769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMSTYPE_in_rule__ModelSlot__TypeAssignment_46800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URISTRING_in_rule__ModelSlot__UriAssignment_76831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__ModelSlot__RequiredAssignment_106862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__ModelSlot__ReadOnlyAssignment_136893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EditionPattern__NameAssignment_16924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EditionPattern__SuperEditionPatternAssignment_2_16959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternRole_in_rule__EditionPattern__PatternRolesAssignment_46994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditionScheme_in_rule__EditionPattern__EditionSchemesAssignment_57025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PatternRole__NameAssignment_17056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePRTYPE_in_rule__PatternRole__TypeAssignment_37087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PatternRole__ModelElementAssignment_57118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PatternRole__ModelSlotAssignment_77153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditionSchemeType_in_rule__EditionScheme__EditionSchemeTypeAssignment_07188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EditionScheme__NameAssignment_17219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__EditionScheme__ParameterAssignment_3_07250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__EditionScheme__ParameterAssignment_3_1_17281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditionAction_in_rule__EditionScheme__EditionActionAssignment_67312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePRTYPE_in_rule__Parameter__WidgetAssignment_07343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__EditionPatternAssignment_27378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_37413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeclarePatternRole__PatternRoleAssignment_07448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeclarePatternRole__ParameterAssignment_47487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeleteAction__PatternRoleAssignment_17526 = new BitSet(new long[]{0x0000000000000002L});

}