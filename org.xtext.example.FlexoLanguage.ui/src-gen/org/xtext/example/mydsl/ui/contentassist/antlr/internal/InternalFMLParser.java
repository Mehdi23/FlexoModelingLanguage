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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_URISTRING", "RULE_BOOL", "RULE_URI", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Individual'", "'CreationScheme'", "'DeletionScheme'", "'ActionScheme'", "'CloningScheme'", "'OWLModelSlot'", "'DiagramModelSlot'", "'EMFModelSlot'", "'VirtualModelModelSlot'", "'XSDModelSlot'", "'DiagramSpecification'", "'VirtualModel'", "'ViewDefinition'", "'uri'", "'='", "'{'", "'}'", "'type'", "'ModelSlot'", "'conformTo'", "'required'", "'readOnly'", "';'", "'EditionPattern'", "'extends'", "'PatternRole'", "'as'", "'from'", "'('", "')'", "','", "':'", "'parameters'", "'.'", "'delete'", "'AddEMFObjectIndividual'"
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
    public static final int RULE_INT=8;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_URISTRING=5;
    public static final int RULE_URI=7;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=9;
    public static final int T__32=32;
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


    // $ANTLR start "entryRuleAddEMFObjectIndividual"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:368:1: entryRuleAddEMFObjectIndividual : ruleAddEMFObjectIndividual EOF ;
    public final void entryRuleAddEMFObjectIndividual() throws RecognitionException {
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:369:1: ( ruleAddEMFObjectIndividual EOF )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:370:1: ruleAddEMFObjectIndividual EOF
            {
             before(grammarAccess.getAddEMFObjectIndividualRule()); 
            pushFollow(FOLLOW_ruleAddEMFObjectIndividual_in_entryRuleAddEMFObjectIndividual720);
            ruleAddEMFObjectIndividual();

            state._fsp--;

             after(grammarAccess.getAddEMFObjectIndividualRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddEMFObjectIndividual727); 

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
    // $ANTLR end "entryRuleAddEMFObjectIndividual"


    // $ANTLR start "ruleAddEMFObjectIndividual"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:377:1: ruleAddEMFObjectIndividual : ( ( rule__AddEMFObjectIndividual__Group__0 ) ) ;
    public final void ruleAddEMFObjectIndividual() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:381:2: ( ( ( rule__AddEMFObjectIndividual__Group__0 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:382:1: ( ( rule__AddEMFObjectIndividual__Group__0 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:382:1: ( ( rule__AddEMFObjectIndividual__Group__0 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:383:1: ( rule__AddEMFObjectIndividual__Group__0 )
            {
             before(grammarAccess.getAddEMFObjectIndividualAccess().getGroup()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:384:1: ( rule__AddEMFObjectIndividual__Group__0 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:384:2: rule__AddEMFObjectIndividual__Group__0
            {
            pushFollow(FOLLOW_rule__AddEMFObjectIndividual__Group__0_in_ruleAddEMFObjectIndividual753);
            rule__AddEMFObjectIndividual__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddEMFObjectIndividualAccess().getGroup()); 

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
    // $ANTLR end "ruleAddEMFObjectIndividual"


    // $ANTLR start "ruleEditionSchemeType"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:397:1: ruleEditionSchemeType : ( ( rule__EditionSchemeType__Alternatives ) ) ;
    public final void ruleEditionSchemeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:401:1: ( ( ( rule__EditionSchemeType__Alternatives ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:402:1: ( ( rule__EditionSchemeType__Alternatives ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:402:1: ( ( rule__EditionSchemeType__Alternatives ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:403:1: ( rule__EditionSchemeType__Alternatives )
            {
             before(grammarAccess.getEditionSchemeTypeAccess().getAlternatives()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:404:1: ( rule__EditionSchemeType__Alternatives )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:404:2: rule__EditionSchemeType__Alternatives
            {
            pushFollow(FOLLOW_rule__EditionSchemeType__Alternatives_in_ruleEditionSchemeType790);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:416:1: ruleMSTYPE : ( ( rule__MSTYPE__Alternatives ) ) ;
    public final void ruleMSTYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:420:1: ( ( ( rule__MSTYPE__Alternatives ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:421:1: ( ( rule__MSTYPE__Alternatives ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:421:1: ( ( rule__MSTYPE__Alternatives ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:422:1: ( rule__MSTYPE__Alternatives )
            {
             before(grammarAccess.getMSTYPEAccess().getAlternatives()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:423:1: ( rule__MSTYPE__Alternatives )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:423:2: rule__MSTYPE__Alternatives
            {
            pushFollow(FOLLOW_rule__MSTYPE__Alternatives_in_ruleMSTYPE826);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:435:1: ruleVMTYPE : ( ( rule__VMTYPE__Alternatives ) ) ;
    public final void ruleVMTYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:439:1: ( ( ( rule__VMTYPE__Alternatives ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:440:1: ( ( rule__VMTYPE__Alternatives ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:440:1: ( ( rule__VMTYPE__Alternatives ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:441:1: ( rule__VMTYPE__Alternatives )
            {
             before(grammarAccess.getVMTYPEAccess().getAlternatives()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:442:1: ( rule__VMTYPE__Alternatives )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:442:2: rule__VMTYPE__Alternatives
            {
            pushFollow(FOLLOW_rule__VMTYPE__Alternatives_in_ruleVMTYPE862);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:454:1: rulePRTYPE : ( ( 'Individual' ) ) ;
    public final void rulePRTYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:458:1: ( ( ( 'Individual' ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:459:1: ( ( 'Individual' ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:459:1: ( ( 'Individual' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:460:1: ( 'Individual' )
            {
             before(grammarAccess.getPRTYPEAccess().getIndividualEnumLiteralDeclaration()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:461:1: ( 'Individual' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:461:3: 'Individual'
            {
            match(input,14,FOLLOW_14_in_rulePRTYPE899); 

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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:473:1: rule__BuiltInAction__Alternatives : ( ( ruleDeclarePatternRole ) | ( ruleDeleteAction ) | ( ruleAddEMFObjectIndividual ) );
    public final void rule__BuiltInAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:477:1: ( ( ruleDeclarePatternRole ) | ( ruleDeleteAction ) | ( ruleAddEMFObjectIndividual ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt1=1;
                }
                break;
            case 48:
                {
                alt1=2;
                }
                break;
            case 49:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:478:1: ( ruleDeclarePatternRole )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:478:1: ( ruleDeclarePatternRole )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:479:1: ruleDeclarePatternRole
                    {
                     before(grammarAccess.getBuiltInActionAccess().getDeclarePatternRoleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDeclarePatternRole_in_rule__BuiltInAction__Alternatives936);
                    ruleDeclarePatternRole();

                    state._fsp--;

                     after(grammarAccess.getBuiltInActionAccess().getDeclarePatternRoleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:484:6: ( ruleDeleteAction )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:484:6: ( ruleDeleteAction )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:485:1: ruleDeleteAction
                    {
                     before(grammarAccess.getBuiltInActionAccess().getDeleteActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDeleteAction_in_rule__BuiltInAction__Alternatives953);
                    ruleDeleteAction();

                    state._fsp--;

                     after(grammarAccess.getBuiltInActionAccess().getDeleteActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:490:6: ( ruleAddEMFObjectIndividual )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:490:6: ( ruleAddEMFObjectIndividual )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:491:1: ruleAddEMFObjectIndividual
                    {
                     before(grammarAccess.getBuiltInActionAccess().getAddEMFObjectIndividualParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAddEMFObjectIndividual_in_rule__BuiltInAction__Alternatives970);
                    ruleAddEMFObjectIndividual();

                    state._fsp--;

                     after(grammarAccess.getBuiltInActionAccess().getAddEMFObjectIndividualParserRuleCall_2()); 

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


    // $ANTLR start "rule__DeclarePatternRole__Alternatives_1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:501:1: rule__DeclarePatternRole__Alternatives_1 : ( ( ( rule__DeclarePatternRole__Group_1_0__0 ) ) | ( ( rule__DeclarePatternRole__Group_1_1__0 ) ) );
    public final void rule__DeclarePatternRole__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:505:1: ( ( ( rule__DeclarePatternRole__Group_1_0__0 ) ) | ( ( rule__DeclarePatternRole__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==46) ) {
                alt2=1;
            }
            else if ( (LA2_0==42) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:506:1: ( ( rule__DeclarePatternRole__Group_1_0__0 ) )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:506:1: ( ( rule__DeclarePatternRole__Group_1_0__0 ) )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:507:1: ( rule__DeclarePatternRole__Group_1_0__0 )
                    {
                     before(grammarAccess.getDeclarePatternRoleAccess().getGroup_1_0()); 
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:508:1: ( rule__DeclarePatternRole__Group_1_0__0 )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:508:2: rule__DeclarePatternRole__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__DeclarePatternRole__Group_1_0__0_in_rule__DeclarePatternRole__Alternatives_11002);
                    rule__DeclarePatternRole__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarePatternRoleAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:512:6: ( ( rule__DeclarePatternRole__Group_1_1__0 ) )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:512:6: ( ( rule__DeclarePatternRole__Group_1_1__0 ) )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:513:1: ( rule__DeclarePatternRole__Group_1_1__0 )
                    {
                     before(grammarAccess.getDeclarePatternRoleAccess().getGroup_1_1()); 
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:514:1: ( rule__DeclarePatternRole__Group_1_1__0 )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:514:2: rule__DeclarePatternRole__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__DeclarePatternRole__Group_1_1__0_in_rule__DeclarePatternRole__Alternatives_11020);
                    rule__DeclarePatternRole__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarePatternRoleAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__DeclarePatternRole__Alternatives_1"


    // $ANTLR start "rule__EditionSchemeType__Alternatives"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:523:1: rule__EditionSchemeType__Alternatives : ( ( ( 'CreationScheme' ) ) | ( ( 'DeletionScheme' ) ) | ( ( 'ActionScheme' ) ) | ( ( 'CloningScheme' ) ) );
    public final void rule__EditionSchemeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:527:1: ( ( ( 'CreationScheme' ) ) | ( ( 'DeletionScheme' ) ) | ( ( 'ActionScheme' ) ) | ( ( 'CloningScheme' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:528:1: ( ( 'CreationScheme' ) )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:528:1: ( ( 'CreationScheme' ) )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:529:1: ( 'CreationScheme' )
                    {
                     before(grammarAccess.getEditionSchemeTypeAccess().getCreationSchemeEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:530:1: ( 'CreationScheme' )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:530:3: 'CreationScheme'
                    {
                    match(input,15,FOLLOW_15_in_rule__EditionSchemeType__Alternatives1054); 

                    }

                     after(grammarAccess.getEditionSchemeTypeAccess().getCreationSchemeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:535:6: ( ( 'DeletionScheme' ) )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:535:6: ( ( 'DeletionScheme' ) )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:536:1: ( 'DeletionScheme' )
                    {
                     before(grammarAccess.getEditionSchemeTypeAccess().getDeletionSchemeEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:537:1: ( 'DeletionScheme' )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:537:3: 'DeletionScheme'
                    {
                    match(input,16,FOLLOW_16_in_rule__EditionSchemeType__Alternatives1075); 

                    }

                     after(grammarAccess.getEditionSchemeTypeAccess().getDeletionSchemeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:542:6: ( ( 'ActionScheme' ) )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:542:6: ( ( 'ActionScheme' ) )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:543:1: ( 'ActionScheme' )
                    {
                     before(grammarAccess.getEditionSchemeTypeAccess().getActionSchemeEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:544:1: ( 'ActionScheme' )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:544:3: 'ActionScheme'
                    {
                    match(input,17,FOLLOW_17_in_rule__EditionSchemeType__Alternatives1096); 

                    }

                     after(grammarAccess.getEditionSchemeTypeAccess().getActionSchemeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:549:6: ( ( 'CloningScheme' ) )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:549:6: ( ( 'CloningScheme' ) )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:550:1: ( 'CloningScheme' )
                    {
                     before(grammarAccess.getEditionSchemeTypeAccess().getCloningSchemeEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:551:1: ( 'CloningScheme' )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:551:3: 'CloningScheme'
                    {
                    match(input,18,FOLLOW_18_in_rule__EditionSchemeType__Alternatives1117); 

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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:561:1: rule__MSTYPE__Alternatives : ( ( ( 'OWLModelSlot' ) ) | ( ( 'DiagramModelSlot' ) ) | ( ( 'EMFModelSlot' ) ) | ( ( 'VirtualModelModelSlot' ) ) | ( ( 'XSDModelSlot' ) ) );
    public final void rule__MSTYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:565:1: ( ( ( 'OWLModelSlot' ) ) | ( ( 'DiagramModelSlot' ) ) | ( ( 'EMFModelSlot' ) ) | ( ( 'VirtualModelModelSlot' ) ) | ( ( 'XSDModelSlot' ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            case 22:
                {
                alt4=4;
                }
                break;
            case 23:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:566:1: ( ( 'OWLModelSlot' ) )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:566:1: ( ( 'OWLModelSlot' ) )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:567:1: ( 'OWLModelSlot' )
                    {
                     before(grammarAccess.getMSTYPEAccess().getOwlEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:568:1: ( 'OWLModelSlot' )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:568:3: 'OWLModelSlot'
                    {
                    match(input,19,FOLLOW_19_in_rule__MSTYPE__Alternatives1153); 

                    }

                     after(grammarAccess.getMSTYPEAccess().getOwlEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:573:6: ( ( 'DiagramModelSlot' ) )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:573:6: ( ( 'DiagramModelSlot' ) )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:574:1: ( 'DiagramModelSlot' )
                    {
                     before(grammarAccess.getMSTYPEAccess().getDiagEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:575:1: ( 'DiagramModelSlot' )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:575:3: 'DiagramModelSlot'
                    {
                    match(input,20,FOLLOW_20_in_rule__MSTYPE__Alternatives1174); 

                    }

                     after(grammarAccess.getMSTYPEAccess().getDiagEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:580:6: ( ( 'EMFModelSlot' ) )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:580:6: ( ( 'EMFModelSlot' ) )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:581:1: ( 'EMFModelSlot' )
                    {
                     before(grammarAccess.getMSTYPEAccess().getEmfEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:582:1: ( 'EMFModelSlot' )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:582:3: 'EMFModelSlot'
                    {
                    match(input,21,FOLLOW_21_in_rule__MSTYPE__Alternatives1195); 

                    }

                     after(grammarAccess.getMSTYPEAccess().getEmfEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:587:6: ( ( 'VirtualModelModelSlot' ) )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:587:6: ( ( 'VirtualModelModelSlot' ) )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:588:1: ( 'VirtualModelModelSlot' )
                    {
                     before(grammarAccess.getMSTYPEAccess().getVirtualEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:589:1: ( 'VirtualModelModelSlot' )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:589:3: 'VirtualModelModelSlot'
                    {
                    match(input,22,FOLLOW_22_in_rule__MSTYPE__Alternatives1216); 

                    }

                     after(grammarAccess.getMSTYPEAccess().getVirtualEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:594:6: ( ( 'XSDModelSlot' ) )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:594:6: ( ( 'XSDModelSlot' ) )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:595:1: ( 'XSDModelSlot' )
                    {
                     before(grammarAccess.getMSTYPEAccess().getXsdEnumLiteralDeclaration_4()); 
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:596:1: ( 'XSDModelSlot' )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:596:3: 'XSDModelSlot'
                    {
                    match(input,23,FOLLOW_23_in_rule__MSTYPE__Alternatives1237); 

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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:606:1: rule__VMTYPE__Alternatives : ( ( ( 'DiagramSpecification' ) ) | ( ( 'VirtualModel' ) ) );
    public final void rule__VMTYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:610:1: ( ( ( 'DiagramSpecification' ) ) | ( ( 'VirtualModel' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:611:1: ( ( 'DiagramSpecification' ) )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:611:1: ( ( 'DiagramSpecification' ) )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:612:1: ( 'DiagramSpecification' )
                    {
                     before(grammarAccess.getVMTYPEAccess().getDiagSpecEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:613:1: ( 'DiagramSpecification' )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:613:3: 'DiagramSpecification'
                    {
                    match(input,24,FOLLOW_24_in_rule__VMTYPE__Alternatives1273); 

                    }

                     after(grammarAccess.getVMTYPEAccess().getDiagSpecEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:618:6: ( ( 'VirtualModel' ) )
                    {
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:618:6: ( ( 'VirtualModel' ) )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:619:1: ( 'VirtualModel' )
                    {
                     before(grammarAccess.getVMTYPEAccess().getVMEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:620:1: ( 'VirtualModel' )
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:620:3: 'VirtualModel'
                    {
                    match(input,25,FOLLOW_25_in_rule__VMTYPE__Alternatives1294); 

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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:632:1: rule__ViewDef__Group__0 : rule__ViewDef__Group__0__Impl rule__ViewDef__Group__1 ;
    public final void rule__ViewDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:636:1: ( rule__ViewDef__Group__0__Impl rule__ViewDef__Group__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:637:2: rule__ViewDef__Group__0__Impl rule__ViewDef__Group__1
            {
            pushFollow(FOLLOW_rule__ViewDef__Group__0__Impl_in_rule__ViewDef__Group__01327);
            rule__ViewDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDef__Group__1_in_rule__ViewDef__Group__01330);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:644:1: rule__ViewDef__Group__0__Impl : ( 'ViewDefinition' ) ;
    public final void rule__ViewDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:648:1: ( ( 'ViewDefinition' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:649:1: ( 'ViewDefinition' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:649:1: ( 'ViewDefinition' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:650:1: 'ViewDefinition'
            {
             before(grammarAccess.getViewDefAccess().getViewDefinitionKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__ViewDef__Group__0__Impl1358); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:663:1: rule__ViewDef__Group__1 : rule__ViewDef__Group__1__Impl rule__ViewDef__Group__2 ;
    public final void rule__ViewDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:667:1: ( rule__ViewDef__Group__1__Impl rule__ViewDef__Group__2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:668:2: rule__ViewDef__Group__1__Impl rule__ViewDef__Group__2
            {
            pushFollow(FOLLOW_rule__ViewDef__Group__1__Impl_in_rule__ViewDef__Group__11389);
            rule__ViewDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDef__Group__2_in_rule__ViewDef__Group__11392);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:675:1: rule__ViewDef__Group__1__Impl : ( ( rule__ViewDef__NameAssignment_1 ) ) ;
    public final void rule__ViewDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:679:1: ( ( ( rule__ViewDef__NameAssignment_1 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:680:1: ( ( rule__ViewDef__NameAssignment_1 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:680:1: ( ( rule__ViewDef__NameAssignment_1 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:681:1: ( rule__ViewDef__NameAssignment_1 )
            {
             before(grammarAccess.getViewDefAccess().getNameAssignment_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:682:1: ( rule__ViewDef__NameAssignment_1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:682:2: rule__ViewDef__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ViewDef__NameAssignment_1_in_rule__ViewDef__Group__1__Impl1419);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:692:1: rule__ViewDef__Group__2 : rule__ViewDef__Group__2__Impl rule__ViewDef__Group__3 ;
    public final void rule__ViewDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:696:1: ( rule__ViewDef__Group__2__Impl rule__ViewDef__Group__3 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:697:2: rule__ViewDef__Group__2__Impl rule__ViewDef__Group__3
            {
            pushFollow(FOLLOW_rule__ViewDef__Group__2__Impl_in_rule__ViewDef__Group__21449);
            rule__ViewDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDef__Group__3_in_rule__ViewDef__Group__21452);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:704:1: rule__ViewDef__Group__2__Impl : ( ( ( 'uri' ) ) ( ( 'uri' )* ) ) ;
    public final void rule__ViewDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:708:1: ( ( ( ( 'uri' ) ) ( ( 'uri' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:709:1: ( ( ( 'uri' ) ) ( ( 'uri' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:709:1: ( ( ( 'uri' ) ) ( ( 'uri' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:710:1: ( ( 'uri' ) ) ( ( 'uri' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:710:1: ( ( 'uri' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:711:1: ( 'uri' )
            {
             before(grammarAccess.getViewDefAccess().getUriKeyword_2()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:712:1: ( 'uri' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:713:2: 'uri'
            {
            match(input,27,FOLLOW_27_in_rule__ViewDef__Group__2__Impl1483); 

            }

             after(grammarAccess.getViewDefAccess().getUriKeyword_2()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:717:1: ( ( 'uri' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:718:1: ( 'uri' )*
            {
             before(grammarAccess.getViewDefAccess().getUriKeyword_2()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:719:1: ( 'uri' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:720:2: 'uri'
            	    {
            	    match(input,27,FOLLOW_27_in_rule__ViewDef__Group__2__Impl1499); 

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:732:1: rule__ViewDef__Group__3 : rule__ViewDef__Group__3__Impl rule__ViewDef__Group__4 ;
    public final void rule__ViewDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:736:1: ( rule__ViewDef__Group__3__Impl rule__ViewDef__Group__4 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:737:2: rule__ViewDef__Group__3__Impl rule__ViewDef__Group__4
            {
            pushFollow(FOLLOW_rule__ViewDef__Group__3__Impl_in_rule__ViewDef__Group__31534);
            rule__ViewDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDef__Group__4_in_rule__ViewDef__Group__31537);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:744:1: rule__ViewDef__Group__3__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__ViewDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:748:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:749:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:749:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:750:1: ( ( '=' ) ) ( ( '=' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:750:1: ( ( '=' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:751:1: ( '=' )
            {
             before(grammarAccess.getViewDefAccess().getEqualsSignKeyword_3()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:752:1: ( '=' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:753:2: '='
            {
            match(input,28,FOLLOW_28_in_rule__ViewDef__Group__3__Impl1568); 

            }

             after(grammarAccess.getViewDefAccess().getEqualsSignKeyword_3()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:757:1: ( ( '=' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:758:1: ( '=' )*
            {
             before(grammarAccess.getViewDefAccess().getEqualsSignKeyword_3()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:759:1: ( '=' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:760:2: '='
            	    {
            	    match(input,28,FOLLOW_28_in_rule__ViewDef__Group__3__Impl1584); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:772:1: rule__ViewDef__Group__4 : rule__ViewDef__Group__4__Impl rule__ViewDef__Group__5 ;
    public final void rule__ViewDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:776:1: ( rule__ViewDef__Group__4__Impl rule__ViewDef__Group__5 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:777:2: rule__ViewDef__Group__4__Impl rule__ViewDef__Group__5
            {
            pushFollow(FOLLOW_rule__ViewDef__Group__4__Impl_in_rule__ViewDef__Group__41619);
            rule__ViewDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDef__Group__5_in_rule__ViewDef__Group__41622);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:784:1: rule__ViewDef__Group__4__Impl : ( ( rule__ViewDef__UriAssignment_4 ) ) ;
    public final void rule__ViewDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:788:1: ( ( ( rule__ViewDef__UriAssignment_4 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:789:1: ( ( rule__ViewDef__UriAssignment_4 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:789:1: ( ( rule__ViewDef__UriAssignment_4 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:790:1: ( rule__ViewDef__UriAssignment_4 )
            {
             before(grammarAccess.getViewDefAccess().getUriAssignment_4()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:791:1: ( rule__ViewDef__UriAssignment_4 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:791:2: rule__ViewDef__UriAssignment_4
            {
            pushFollow(FOLLOW_rule__ViewDef__UriAssignment_4_in_rule__ViewDef__Group__4__Impl1649);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:801:1: rule__ViewDef__Group__5 : rule__ViewDef__Group__5__Impl rule__ViewDef__Group__6 ;
    public final void rule__ViewDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:805:1: ( rule__ViewDef__Group__5__Impl rule__ViewDef__Group__6 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:806:2: rule__ViewDef__Group__5__Impl rule__ViewDef__Group__6
            {
            pushFollow(FOLLOW_rule__ViewDef__Group__5__Impl_in_rule__ViewDef__Group__51679);
            rule__ViewDef__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDef__Group__6_in_rule__ViewDef__Group__51682);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:813:1: rule__ViewDef__Group__5__Impl : ( '{' ) ;
    public final void rule__ViewDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:817:1: ( ( '{' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:818:1: ( '{' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:818:1: ( '{' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:819:1: '{'
            {
             before(grammarAccess.getViewDefAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__ViewDef__Group__5__Impl1710); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:832:1: rule__ViewDef__Group__6 : rule__ViewDef__Group__6__Impl rule__ViewDef__Group__7 ;
    public final void rule__ViewDef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:836:1: ( rule__ViewDef__Group__6__Impl rule__ViewDef__Group__7 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:837:2: rule__ViewDef__Group__6__Impl rule__ViewDef__Group__7
            {
            pushFollow(FOLLOW_rule__ViewDef__Group__6__Impl_in_rule__ViewDef__Group__61741);
            rule__ViewDef__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDef__Group__7_in_rule__ViewDef__Group__61744);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:844:1: rule__ViewDef__Group__6__Impl : ( ( rule__ViewDef__ElementsAssignment_6 )* ) ;
    public final void rule__ViewDef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:848:1: ( ( ( rule__ViewDef__ElementsAssignment_6 )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:849:1: ( ( rule__ViewDef__ElementsAssignment_6 )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:849:1: ( ( rule__ViewDef__ElementsAssignment_6 )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:850:1: ( rule__ViewDef__ElementsAssignment_6 )*
            {
             before(grammarAccess.getViewDefAccess().getElementsAssignment_6()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:851:1: ( rule__ViewDef__ElementsAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:851:2: rule__ViewDef__ElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__ViewDef__ElementsAssignment_6_in_rule__ViewDef__Group__6__Impl1771);
            	    rule__ViewDef__ElementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:861:1: rule__ViewDef__Group__7 : rule__ViewDef__Group__7__Impl ;
    public final void rule__ViewDef__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:865:1: ( rule__ViewDef__Group__7__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:866:2: rule__ViewDef__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ViewDef__Group__7__Impl_in_rule__ViewDef__Group__71802);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:872:1: rule__ViewDef__Group__7__Impl : ( '}' ) ;
    public final void rule__ViewDef__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:876:1: ( ( '}' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:877:1: ( '}' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:877:1: ( '}' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:878:1: '}'
            {
             before(grammarAccess.getViewDefAccess().getRightCurlyBracketKeyword_7()); 
            match(input,30,FOLLOW_30_in_rule__ViewDef__Group__7__Impl1830); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:907:1: rule__VirtualModel__Group__0 : rule__VirtualModel__Group__0__Impl rule__VirtualModel__Group__1 ;
    public final void rule__VirtualModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:911:1: ( rule__VirtualModel__Group__0__Impl rule__VirtualModel__Group__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:912:2: rule__VirtualModel__Group__0__Impl rule__VirtualModel__Group__1
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group__0__Impl_in_rule__VirtualModel__Group__01877);
            rule__VirtualModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VirtualModel__Group__1_in_rule__VirtualModel__Group__01880);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:919:1: rule__VirtualModel__Group__0__Impl : ( 'VirtualModel' ) ;
    public final void rule__VirtualModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:923:1: ( ( 'VirtualModel' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:924:1: ( 'VirtualModel' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:924:1: ( 'VirtualModel' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:925:1: 'VirtualModel'
            {
             before(grammarAccess.getVirtualModelAccess().getVirtualModelKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__VirtualModel__Group__0__Impl1908); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:938:1: rule__VirtualModel__Group__1 : rule__VirtualModel__Group__1__Impl rule__VirtualModel__Group__2 ;
    public final void rule__VirtualModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:942:1: ( rule__VirtualModel__Group__1__Impl rule__VirtualModel__Group__2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:943:2: rule__VirtualModel__Group__1__Impl rule__VirtualModel__Group__2
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group__1__Impl_in_rule__VirtualModel__Group__11939);
            rule__VirtualModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VirtualModel__Group__2_in_rule__VirtualModel__Group__11942);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:950:1: rule__VirtualModel__Group__1__Impl : ( ( rule__VirtualModel__NameAssignment_1 ) ) ;
    public final void rule__VirtualModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:954:1: ( ( ( rule__VirtualModel__NameAssignment_1 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:955:1: ( ( rule__VirtualModel__NameAssignment_1 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:955:1: ( ( rule__VirtualModel__NameAssignment_1 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:956:1: ( rule__VirtualModel__NameAssignment_1 )
            {
             before(grammarAccess.getVirtualModelAccess().getNameAssignment_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:957:1: ( rule__VirtualModel__NameAssignment_1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:957:2: rule__VirtualModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VirtualModel__NameAssignment_1_in_rule__VirtualModel__Group__1__Impl1969);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:967:1: rule__VirtualModel__Group__2 : rule__VirtualModel__Group__2__Impl rule__VirtualModel__Group__3 ;
    public final void rule__VirtualModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:971:1: ( rule__VirtualModel__Group__2__Impl rule__VirtualModel__Group__3 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:972:2: rule__VirtualModel__Group__2__Impl rule__VirtualModel__Group__3
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group__2__Impl_in_rule__VirtualModel__Group__21999);
            rule__VirtualModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VirtualModel__Group__3_in_rule__VirtualModel__Group__22002);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:979:1: rule__VirtualModel__Group__2__Impl : ( ( rule__VirtualModel__Group_2__0 )? ) ;
    public final void rule__VirtualModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:983:1: ( ( ( rule__VirtualModel__Group_2__0 )? ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:984:1: ( ( rule__VirtualModel__Group_2__0 )? )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:984:1: ( ( rule__VirtualModel__Group_2__0 )? )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:985:1: ( rule__VirtualModel__Group_2__0 )?
            {
             before(grammarAccess.getVirtualModelAccess().getGroup_2()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:986:1: ( rule__VirtualModel__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:986:2: rule__VirtualModel__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__VirtualModel__Group_2__0_in_rule__VirtualModel__Group__2__Impl2029);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:996:1: rule__VirtualModel__Group__3 : rule__VirtualModel__Group__3__Impl rule__VirtualModel__Group__4 ;
    public final void rule__VirtualModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1000:1: ( rule__VirtualModel__Group__3__Impl rule__VirtualModel__Group__4 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1001:2: rule__VirtualModel__Group__3__Impl rule__VirtualModel__Group__4
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group__3__Impl_in_rule__VirtualModel__Group__32060);
            rule__VirtualModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VirtualModel__Group__4_in_rule__VirtualModel__Group__32063);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1008:1: rule__VirtualModel__Group__3__Impl : ( ( ( 'uri' ) ) ( ( 'uri' )* ) ) ;
    public final void rule__VirtualModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1012:1: ( ( ( ( 'uri' ) ) ( ( 'uri' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1013:1: ( ( ( 'uri' ) ) ( ( 'uri' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1013:1: ( ( ( 'uri' ) ) ( ( 'uri' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1014:1: ( ( 'uri' ) ) ( ( 'uri' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1014:1: ( ( 'uri' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1015:1: ( 'uri' )
            {
             before(grammarAccess.getVirtualModelAccess().getUriKeyword_3()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1016:1: ( 'uri' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1017:2: 'uri'
            {
            match(input,27,FOLLOW_27_in_rule__VirtualModel__Group__3__Impl2094); 

            }

             after(grammarAccess.getVirtualModelAccess().getUriKeyword_3()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1021:1: ( ( 'uri' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1022:1: ( 'uri' )*
            {
             before(grammarAccess.getVirtualModelAccess().getUriKeyword_3()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1023:1: ( 'uri' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1024:2: 'uri'
            	    {
            	    match(input,27,FOLLOW_27_in_rule__VirtualModel__Group__3__Impl2110); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1036:1: rule__VirtualModel__Group__4 : rule__VirtualModel__Group__4__Impl rule__VirtualModel__Group__5 ;
    public final void rule__VirtualModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1040:1: ( rule__VirtualModel__Group__4__Impl rule__VirtualModel__Group__5 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1041:2: rule__VirtualModel__Group__4__Impl rule__VirtualModel__Group__5
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group__4__Impl_in_rule__VirtualModel__Group__42145);
            rule__VirtualModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VirtualModel__Group__5_in_rule__VirtualModel__Group__42148);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1048:1: rule__VirtualModel__Group__4__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__VirtualModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1052:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1053:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1053:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1054:1: ( ( '=' ) ) ( ( '=' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1054:1: ( ( '=' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1055:1: ( '=' )
            {
             before(grammarAccess.getVirtualModelAccess().getEqualsSignKeyword_4()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1056:1: ( '=' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1057:2: '='
            {
            match(input,28,FOLLOW_28_in_rule__VirtualModel__Group__4__Impl2179); 

            }

             after(grammarAccess.getVirtualModelAccess().getEqualsSignKeyword_4()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1061:1: ( ( '=' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1062:1: ( '=' )*
            {
             before(grammarAccess.getVirtualModelAccess().getEqualsSignKeyword_4()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1063:1: ( '=' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1064:2: '='
            	    {
            	    match(input,28,FOLLOW_28_in_rule__VirtualModel__Group__4__Impl2195); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1076:1: rule__VirtualModel__Group__5 : rule__VirtualModel__Group__5__Impl rule__VirtualModel__Group__6 ;
    public final void rule__VirtualModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1080:1: ( rule__VirtualModel__Group__5__Impl rule__VirtualModel__Group__6 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1081:2: rule__VirtualModel__Group__5__Impl rule__VirtualModel__Group__6
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group__5__Impl_in_rule__VirtualModel__Group__52230);
            rule__VirtualModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VirtualModel__Group__6_in_rule__VirtualModel__Group__52233);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1088:1: rule__VirtualModel__Group__5__Impl : ( ( rule__VirtualModel__UriAssignment_5 ) ) ;
    public final void rule__VirtualModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1092:1: ( ( ( rule__VirtualModel__UriAssignment_5 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1093:1: ( ( rule__VirtualModel__UriAssignment_5 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1093:1: ( ( rule__VirtualModel__UriAssignment_5 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1094:1: ( rule__VirtualModel__UriAssignment_5 )
            {
             before(grammarAccess.getVirtualModelAccess().getUriAssignment_5()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1095:1: ( rule__VirtualModel__UriAssignment_5 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1095:2: rule__VirtualModel__UriAssignment_5
            {
            pushFollow(FOLLOW_rule__VirtualModel__UriAssignment_5_in_rule__VirtualModel__Group__5__Impl2260);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1105:1: rule__VirtualModel__Group__6 : rule__VirtualModel__Group__6__Impl rule__VirtualModel__Group__7 ;
    public final void rule__VirtualModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1109:1: ( rule__VirtualModel__Group__6__Impl rule__VirtualModel__Group__7 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1110:2: rule__VirtualModel__Group__6__Impl rule__VirtualModel__Group__7
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group__6__Impl_in_rule__VirtualModel__Group__62290);
            rule__VirtualModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VirtualModel__Group__7_in_rule__VirtualModel__Group__62293);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1117:1: rule__VirtualModel__Group__6__Impl : ( '{' ) ;
    public final void rule__VirtualModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1121:1: ( ( '{' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1122:1: ( '{' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1122:1: ( '{' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1123:1: '{'
            {
             before(grammarAccess.getVirtualModelAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,29,FOLLOW_29_in_rule__VirtualModel__Group__6__Impl2321); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1136:1: rule__VirtualModel__Group__7 : rule__VirtualModel__Group__7__Impl rule__VirtualModel__Group__8 ;
    public final void rule__VirtualModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1140:1: ( rule__VirtualModel__Group__7__Impl rule__VirtualModel__Group__8 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1141:2: rule__VirtualModel__Group__7__Impl rule__VirtualModel__Group__8
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group__7__Impl_in_rule__VirtualModel__Group__72352);
            rule__VirtualModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VirtualModel__Group__8_in_rule__VirtualModel__Group__72355);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1148:1: rule__VirtualModel__Group__7__Impl : ( ( rule__VirtualModel__ModelSlotsAssignment_7 )* ) ;
    public final void rule__VirtualModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1152:1: ( ( ( rule__VirtualModel__ModelSlotsAssignment_7 )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1153:1: ( ( rule__VirtualModel__ModelSlotsAssignment_7 )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1153:1: ( ( rule__VirtualModel__ModelSlotsAssignment_7 )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1154:1: ( rule__VirtualModel__ModelSlotsAssignment_7 )*
            {
             before(grammarAccess.getVirtualModelAccess().getModelSlotsAssignment_7()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1155:1: ( rule__VirtualModel__ModelSlotsAssignment_7 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1155:2: rule__VirtualModel__ModelSlotsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__VirtualModel__ModelSlotsAssignment_7_in_rule__VirtualModel__Group__7__Impl2382);
            	    rule__VirtualModel__ModelSlotsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1165:1: rule__VirtualModel__Group__8 : rule__VirtualModel__Group__8__Impl rule__VirtualModel__Group__9 ;
    public final void rule__VirtualModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1169:1: ( rule__VirtualModel__Group__8__Impl rule__VirtualModel__Group__9 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1170:2: rule__VirtualModel__Group__8__Impl rule__VirtualModel__Group__9
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group__8__Impl_in_rule__VirtualModel__Group__82413);
            rule__VirtualModel__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VirtualModel__Group__9_in_rule__VirtualModel__Group__82416);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1177:1: rule__VirtualModel__Group__8__Impl : ( ( rule__VirtualModel__EditionPatternsAssignment_8 )* ) ;
    public final void rule__VirtualModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1181:1: ( ( ( rule__VirtualModel__EditionPatternsAssignment_8 )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1182:1: ( ( rule__VirtualModel__EditionPatternsAssignment_8 )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1182:1: ( ( rule__VirtualModel__EditionPatternsAssignment_8 )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1183:1: ( rule__VirtualModel__EditionPatternsAssignment_8 )*
            {
             before(grammarAccess.getVirtualModelAccess().getEditionPatternsAssignment_8()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1184:1: ( rule__VirtualModel__EditionPatternsAssignment_8 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1184:2: rule__VirtualModel__EditionPatternsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__VirtualModel__EditionPatternsAssignment_8_in_rule__VirtualModel__Group__8__Impl2443);
            	    rule__VirtualModel__EditionPatternsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1194:1: rule__VirtualModel__Group__9 : rule__VirtualModel__Group__9__Impl ;
    public final void rule__VirtualModel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1198:1: ( rule__VirtualModel__Group__9__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1199:2: rule__VirtualModel__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group__9__Impl_in_rule__VirtualModel__Group__92474);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1205:1: rule__VirtualModel__Group__9__Impl : ( '}' ) ;
    public final void rule__VirtualModel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1209:1: ( ( '}' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1210:1: ( '}' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1210:1: ( '}' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1211:1: '}'
            {
             before(grammarAccess.getVirtualModelAccess().getRightCurlyBracketKeyword_9()); 
            match(input,30,FOLLOW_30_in_rule__VirtualModel__Group__9__Impl2502); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1244:1: rule__VirtualModel__Group_2__0 : rule__VirtualModel__Group_2__0__Impl rule__VirtualModel__Group_2__1 ;
    public final void rule__VirtualModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1248:1: ( rule__VirtualModel__Group_2__0__Impl rule__VirtualModel__Group_2__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1249:2: rule__VirtualModel__Group_2__0__Impl rule__VirtualModel__Group_2__1
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group_2__0__Impl_in_rule__VirtualModel__Group_2__02553);
            rule__VirtualModel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VirtualModel__Group_2__1_in_rule__VirtualModel__Group_2__02556);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1256:1: rule__VirtualModel__Group_2__0__Impl : ( ( ( 'type' ) ) ( ( 'type' )* ) ) ;
    public final void rule__VirtualModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1260:1: ( ( ( ( 'type' ) ) ( ( 'type' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1261:1: ( ( ( 'type' ) ) ( ( 'type' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1261:1: ( ( ( 'type' ) ) ( ( 'type' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1262:1: ( ( 'type' ) ) ( ( 'type' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1262:1: ( ( 'type' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1263:1: ( 'type' )
            {
             before(grammarAccess.getVirtualModelAccess().getTypeKeyword_2_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1264:1: ( 'type' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1265:2: 'type'
            {
            match(input,31,FOLLOW_31_in_rule__VirtualModel__Group_2__0__Impl2587); 

            }

             after(grammarAccess.getVirtualModelAccess().getTypeKeyword_2_0()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1269:1: ( ( 'type' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1270:1: ( 'type' )*
            {
             before(grammarAccess.getVirtualModelAccess().getTypeKeyword_2_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1271:1: ( 'type' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1272:2: 'type'
            	    {
            	    match(input,31,FOLLOW_31_in_rule__VirtualModel__Group_2__0__Impl2603); 

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1284:1: rule__VirtualModel__Group_2__1 : rule__VirtualModel__Group_2__1__Impl rule__VirtualModel__Group_2__2 ;
    public final void rule__VirtualModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1288:1: ( rule__VirtualModel__Group_2__1__Impl rule__VirtualModel__Group_2__2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1289:2: rule__VirtualModel__Group_2__1__Impl rule__VirtualModel__Group_2__2
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group_2__1__Impl_in_rule__VirtualModel__Group_2__12638);
            rule__VirtualModel__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VirtualModel__Group_2__2_in_rule__VirtualModel__Group_2__12641);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1296:1: rule__VirtualModel__Group_2__1__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__VirtualModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1300:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1301:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1301:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1302:1: ( ( '=' ) ) ( ( '=' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1302:1: ( ( '=' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1303:1: ( '=' )
            {
             before(grammarAccess.getVirtualModelAccess().getEqualsSignKeyword_2_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1304:1: ( '=' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1305:2: '='
            {
            match(input,28,FOLLOW_28_in_rule__VirtualModel__Group_2__1__Impl2672); 

            }

             after(grammarAccess.getVirtualModelAccess().getEqualsSignKeyword_2_1()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1309:1: ( ( '=' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1310:1: ( '=' )*
            {
             before(grammarAccess.getVirtualModelAccess().getEqualsSignKeyword_2_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1311:1: ( '=' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1312:2: '='
            	    {
            	    match(input,28,FOLLOW_28_in_rule__VirtualModel__Group_2__1__Impl2688); 

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1324:1: rule__VirtualModel__Group_2__2 : rule__VirtualModel__Group_2__2__Impl ;
    public final void rule__VirtualModel__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1328:1: ( rule__VirtualModel__Group_2__2__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1329:2: rule__VirtualModel__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__VirtualModel__Group_2__2__Impl_in_rule__VirtualModel__Group_2__22723);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1335:1: rule__VirtualModel__Group_2__2__Impl : ( ( rule__VirtualModel__TypeAssignment_2_2 ) ) ;
    public final void rule__VirtualModel__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1339:1: ( ( ( rule__VirtualModel__TypeAssignment_2_2 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1340:1: ( ( rule__VirtualModel__TypeAssignment_2_2 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1340:1: ( ( rule__VirtualModel__TypeAssignment_2_2 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1341:1: ( rule__VirtualModel__TypeAssignment_2_2 )
            {
             before(grammarAccess.getVirtualModelAccess().getTypeAssignment_2_2()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1342:1: ( rule__VirtualModel__TypeAssignment_2_2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1342:2: rule__VirtualModel__TypeAssignment_2_2
            {
            pushFollow(FOLLOW_rule__VirtualModel__TypeAssignment_2_2_in_rule__VirtualModel__Group_2__2__Impl2750);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1358:1: rule__ModelSlot__Group__0 : rule__ModelSlot__Group__0__Impl rule__ModelSlot__Group__1 ;
    public final void rule__ModelSlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1362:1: ( rule__ModelSlot__Group__0__Impl rule__ModelSlot__Group__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1363:2: rule__ModelSlot__Group__0__Impl rule__ModelSlot__Group__1
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__0__Impl_in_rule__ModelSlot__Group__02786);
            rule__ModelSlot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__1_in_rule__ModelSlot__Group__02789);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1370:1: rule__ModelSlot__Group__0__Impl : ( 'ModelSlot' ) ;
    public final void rule__ModelSlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1374:1: ( ( 'ModelSlot' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1375:1: ( 'ModelSlot' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1375:1: ( 'ModelSlot' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1376:1: 'ModelSlot'
            {
             before(grammarAccess.getModelSlotAccess().getModelSlotKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__ModelSlot__Group__0__Impl2817); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1389:1: rule__ModelSlot__Group__1 : rule__ModelSlot__Group__1__Impl rule__ModelSlot__Group__2 ;
    public final void rule__ModelSlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1393:1: ( rule__ModelSlot__Group__1__Impl rule__ModelSlot__Group__2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1394:2: rule__ModelSlot__Group__1__Impl rule__ModelSlot__Group__2
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__1__Impl_in_rule__ModelSlot__Group__12848);
            rule__ModelSlot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__2_in_rule__ModelSlot__Group__12851);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1401:1: rule__ModelSlot__Group__1__Impl : ( ( rule__ModelSlot__NameAssignment_1 ) ) ;
    public final void rule__ModelSlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1405:1: ( ( ( rule__ModelSlot__NameAssignment_1 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1406:1: ( ( rule__ModelSlot__NameAssignment_1 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1406:1: ( ( rule__ModelSlot__NameAssignment_1 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1407:1: ( rule__ModelSlot__NameAssignment_1 )
            {
             before(grammarAccess.getModelSlotAccess().getNameAssignment_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1408:1: ( rule__ModelSlot__NameAssignment_1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1408:2: rule__ModelSlot__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ModelSlot__NameAssignment_1_in_rule__ModelSlot__Group__1__Impl2878);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1418:1: rule__ModelSlot__Group__2 : rule__ModelSlot__Group__2__Impl rule__ModelSlot__Group__3 ;
    public final void rule__ModelSlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1422:1: ( rule__ModelSlot__Group__2__Impl rule__ModelSlot__Group__3 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1423:2: rule__ModelSlot__Group__2__Impl rule__ModelSlot__Group__3
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__2__Impl_in_rule__ModelSlot__Group__22908);
            rule__ModelSlot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__3_in_rule__ModelSlot__Group__22911);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1430:1: rule__ModelSlot__Group__2__Impl : ( ( ( 'type' ) ) ( ( 'type' )* ) ) ;
    public final void rule__ModelSlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1434:1: ( ( ( ( 'type' ) ) ( ( 'type' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1435:1: ( ( ( 'type' ) ) ( ( 'type' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1435:1: ( ( ( 'type' ) ) ( ( 'type' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1436:1: ( ( 'type' ) ) ( ( 'type' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1436:1: ( ( 'type' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1437:1: ( 'type' )
            {
             before(grammarAccess.getModelSlotAccess().getTypeKeyword_2()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1438:1: ( 'type' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1439:2: 'type'
            {
            match(input,31,FOLLOW_31_in_rule__ModelSlot__Group__2__Impl2942); 

            }

             after(grammarAccess.getModelSlotAccess().getTypeKeyword_2()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1443:1: ( ( 'type' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1444:1: ( 'type' )*
            {
             before(grammarAccess.getModelSlotAccess().getTypeKeyword_2()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1445:1: ( 'type' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1446:2: 'type'
            	    {
            	    match(input,31,FOLLOW_31_in_rule__ModelSlot__Group__2__Impl2958); 

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1458:1: rule__ModelSlot__Group__3 : rule__ModelSlot__Group__3__Impl rule__ModelSlot__Group__4 ;
    public final void rule__ModelSlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1462:1: ( rule__ModelSlot__Group__3__Impl rule__ModelSlot__Group__4 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1463:2: rule__ModelSlot__Group__3__Impl rule__ModelSlot__Group__4
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__3__Impl_in_rule__ModelSlot__Group__32993);
            rule__ModelSlot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__4_in_rule__ModelSlot__Group__32996);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1470:1: rule__ModelSlot__Group__3__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__ModelSlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1474:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1475:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1475:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1476:1: ( ( '=' ) ) ( ( '=' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1476:1: ( ( '=' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1477:1: ( '=' )
            {
             before(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_3()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1478:1: ( '=' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1479:2: '='
            {
            match(input,28,FOLLOW_28_in_rule__ModelSlot__Group__3__Impl3027); 

            }

             after(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_3()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1483:1: ( ( '=' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1484:1: ( '=' )*
            {
             before(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_3()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1485:1: ( '=' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1486:2: '='
            	    {
            	    match(input,28,FOLLOW_28_in_rule__ModelSlot__Group__3__Impl3043); 

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1498:1: rule__ModelSlot__Group__4 : rule__ModelSlot__Group__4__Impl rule__ModelSlot__Group__5 ;
    public final void rule__ModelSlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1502:1: ( rule__ModelSlot__Group__4__Impl rule__ModelSlot__Group__5 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1503:2: rule__ModelSlot__Group__4__Impl rule__ModelSlot__Group__5
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__4__Impl_in_rule__ModelSlot__Group__43078);
            rule__ModelSlot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__5_in_rule__ModelSlot__Group__43081);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1510:1: rule__ModelSlot__Group__4__Impl : ( ( rule__ModelSlot__TypeAssignment_4 ) ) ;
    public final void rule__ModelSlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1514:1: ( ( ( rule__ModelSlot__TypeAssignment_4 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1515:1: ( ( rule__ModelSlot__TypeAssignment_4 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1515:1: ( ( rule__ModelSlot__TypeAssignment_4 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1516:1: ( rule__ModelSlot__TypeAssignment_4 )
            {
             before(grammarAccess.getModelSlotAccess().getTypeAssignment_4()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1517:1: ( rule__ModelSlot__TypeAssignment_4 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1517:2: rule__ModelSlot__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__ModelSlot__TypeAssignment_4_in_rule__ModelSlot__Group__4__Impl3108);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1527:1: rule__ModelSlot__Group__5 : rule__ModelSlot__Group__5__Impl rule__ModelSlot__Group__6 ;
    public final void rule__ModelSlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1531:1: ( rule__ModelSlot__Group__5__Impl rule__ModelSlot__Group__6 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1532:2: rule__ModelSlot__Group__5__Impl rule__ModelSlot__Group__6
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__5__Impl_in_rule__ModelSlot__Group__53138);
            rule__ModelSlot__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__6_in_rule__ModelSlot__Group__53141);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1539:1: rule__ModelSlot__Group__5__Impl : ( ( ( 'conformTo' ) ) ( ( 'conformTo' )* ) ) ;
    public final void rule__ModelSlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1543:1: ( ( ( ( 'conformTo' ) ) ( ( 'conformTo' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1544:1: ( ( ( 'conformTo' ) ) ( ( 'conformTo' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1544:1: ( ( ( 'conformTo' ) ) ( ( 'conformTo' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1545:1: ( ( 'conformTo' ) ) ( ( 'conformTo' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1545:1: ( ( 'conformTo' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1546:1: ( 'conformTo' )
            {
             before(grammarAccess.getModelSlotAccess().getConformToKeyword_5()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1547:1: ( 'conformTo' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1548:2: 'conformTo'
            {
            match(input,33,FOLLOW_33_in_rule__ModelSlot__Group__5__Impl3172); 

            }

             after(grammarAccess.getModelSlotAccess().getConformToKeyword_5()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1552:1: ( ( 'conformTo' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1553:1: ( 'conformTo' )*
            {
             before(grammarAccess.getModelSlotAccess().getConformToKeyword_5()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1554:1: ( 'conformTo' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1555:2: 'conformTo'
            	    {
            	    match(input,33,FOLLOW_33_in_rule__ModelSlot__Group__5__Impl3188); 

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1567:1: rule__ModelSlot__Group__6 : rule__ModelSlot__Group__6__Impl rule__ModelSlot__Group__7 ;
    public final void rule__ModelSlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1571:1: ( rule__ModelSlot__Group__6__Impl rule__ModelSlot__Group__7 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1572:2: rule__ModelSlot__Group__6__Impl rule__ModelSlot__Group__7
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__6__Impl_in_rule__ModelSlot__Group__63223);
            rule__ModelSlot__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__7_in_rule__ModelSlot__Group__63226);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1579:1: rule__ModelSlot__Group__6__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__ModelSlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1583:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1584:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1584:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1585:1: ( ( '=' ) ) ( ( '=' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1585:1: ( ( '=' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1586:1: ( '=' )
            {
             before(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_6()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1587:1: ( '=' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1588:2: '='
            {
            match(input,28,FOLLOW_28_in_rule__ModelSlot__Group__6__Impl3257); 

            }

             after(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_6()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1592:1: ( ( '=' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1593:1: ( '=' )*
            {
             before(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_6()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1594:1: ( '=' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1595:2: '='
            	    {
            	    match(input,28,FOLLOW_28_in_rule__ModelSlot__Group__6__Impl3273); 

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1607:1: rule__ModelSlot__Group__7 : rule__ModelSlot__Group__7__Impl rule__ModelSlot__Group__8 ;
    public final void rule__ModelSlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1611:1: ( rule__ModelSlot__Group__7__Impl rule__ModelSlot__Group__8 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1612:2: rule__ModelSlot__Group__7__Impl rule__ModelSlot__Group__8
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__7__Impl_in_rule__ModelSlot__Group__73308);
            rule__ModelSlot__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__8_in_rule__ModelSlot__Group__73311);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1619:1: rule__ModelSlot__Group__7__Impl : ( ( rule__ModelSlot__UriAssignment_7 ) ) ;
    public final void rule__ModelSlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1623:1: ( ( ( rule__ModelSlot__UriAssignment_7 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1624:1: ( ( rule__ModelSlot__UriAssignment_7 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1624:1: ( ( rule__ModelSlot__UriAssignment_7 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1625:1: ( rule__ModelSlot__UriAssignment_7 )
            {
             before(grammarAccess.getModelSlotAccess().getUriAssignment_7()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1626:1: ( rule__ModelSlot__UriAssignment_7 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1626:2: rule__ModelSlot__UriAssignment_7
            {
            pushFollow(FOLLOW_rule__ModelSlot__UriAssignment_7_in_rule__ModelSlot__Group__7__Impl3338);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1636:1: rule__ModelSlot__Group__8 : rule__ModelSlot__Group__8__Impl rule__ModelSlot__Group__9 ;
    public final void rule__ModelSlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1640:1: ( rule__ModelSlot__Group__8__Impl rule__ModelSlot__Group__9 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1641:2: rule__ModelSlot__Group__8__Impl rule__ModelSlot__Group__9
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__8__Impl_in_rule__ModelSlot__Group__83368);
            rule__ModelSlot__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__9_in_rule__ModelSlot__Group__83371);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1648:1: rule__ModelSlot__Group__8__Impl : ( ( ( 'required' ) ) ( ( 'required' )* ) ) ;
    public final void rule__ModelSlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1652:1: ( ( ( ( 'required' ) ) ( ( 'required' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1653:1: ( ( ( 'required' ) ) ( ( 'required' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1653:1: ( ( ( 'required' ) ) ( ( 'required' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1654:1: ( ( 'required' ) ) ( ( 'required' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1654:1: ( ( 'required' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1655:1: ( 'required' )
            {
             before(grammarAccess.getModelSlotAccess().getRequiredKeyword_8()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1656:1: ( 'required' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1657:2: 'required'
            {
            match(input,34,FOLLOW_34_in_rule__ModelSlot__Group__8__Impl3402); 

            }

             after(grammarAccess.getModelSlotAccess().getRequiredKeyword_8()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1661:1: ( ( 'required' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1662:1: ( 'required' )*
            {
             before(grammarAccess.getModelSlotAccess().getRequiredKeyword_8()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1663:1: ( 'required' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1664:2: 'required'
            	    {
            	    match(input,34,FOLLOW_34_in_rule__ModelSlot__Group__8__Impl3418); 

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1676:1: rule__ModelSlot__Group__9 : rule__ModelSlot__Group__9__Impl rule__ModelSlot__Group__10 ;
    public final void rule__ModelSlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1680:1: ( rule__ModelSlot__Group__9__Impl rule__ModelSlot__Group__10 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1681:2: rule__ModelSlot__Group__9__Impl rule__ModelSlot__Group__10
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__9__Impl_in_rule__ModelSlot__Group__93453);
            rule__ModelSlot__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__10_in_rule__ModelSlot__Group__93456);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1688:1: rule__ModelSlot__Group__9__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__ModelSlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1692:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1693:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1693:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1694:1: ( ( '=' ) ) ( ( '=' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1694:1: ( ( '=' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1695:1: ( '=' )
            {
             before(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_9()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1696:1: ( '=' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1697:2: '='
            {
            match(input,28,FOLLOW_28_in_rule__ModelSlot__Group__9__Impl3487); 

            }

             after(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_9()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1701:1: ( ( '=' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1702:1: ( '=' )*
            {
             before(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_9()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1703:1: ( '=' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==28) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1704:2: '='
            	    {
            	    match(input,28,FOLLOW_28_in_rule__ModelSlot__Group__9__Impl3503); 

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1716:1: rule__ModelSlot__Group__10 : rule__ModelSlot__Group__10__Impl rule__ModelSlot__Group__11 ;
    public final void rule__ModelSlot__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1720:1: ( rule__ModelSlot__Group__10__Impl rule__ModelSlot__Group__11 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1721:2: rule__ModelSlot__Group__10__Impl rule__ModelSlot__Group__11
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__10__Impl_in_rule__ModelSlot__Group__103538);
            rule__ModelSlot__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__11_in_rule__ModelSlot__Group__103541);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1728:1: rule__ModelSlot__Group__10__Impl : ( ( rule__ModelSlot__RequiredAssignment_10 ) ) ;
    public final void rule__ModelSlot__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1732:1: ( ( ( rule__ModelSlot__RequiredAssignment_10 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1733:1: ( ( rule__ModelSlot__RequiredAssignment_10 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1733:1: ( ( rule__ModelSlot__RequiredAssignment_10 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1734:1: ( rule__ModelSlot__RequiredAssignment_10 )
            {
             before(grammarAccess.getModelSlotAccess().getRequiredAssignment_10()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1735:1: ( rule__ModelSlot__RequiredAssignment_10 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1735:2: rule__ModelSlot__RequiredAssignment_10
            {
            pushFollow(FOLLOW_rule__ModelSlot__RequiredAssignment_10_in_rule__ModelSlot__Group__10__Impl3568);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1745:1: rule__ModelSlot__Group__11 : rule__ModelSlot__Group__11__Impl rule__ModelSlot__Group__12 ;
    public final void rule__ModelSlot__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1749:1: ( rule__ModelSlot__Group__11__Impl rule__ModelSlot__Group__12 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1750:2: rule__ModelSlot__Group__11__Impl rule__ModelSlot__Group__12
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__11__Impl_in_rule__ModelSlot__Group__113598);
            rule__ModelSlot__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__12_in_rule__ModelSlot__Group__113601);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1757:1: rule__ModelSlot__Group__11__Impl : ( ( ( 'readOnly' ) ) ( ( 'readOnly' )* ) ) ;
    public final void rule__ModelSlot__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1761:1: ( ( ( ( 'readOnly' ) ) ( ( 'readOnly' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1762:1: ( ( ( 'readOnly' ) ) ( ( 'readOnly' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1762:1: ( ( ( 'readOnly' ) ) ( ( 'readOnly' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1763:1: ( ( 'readOnly' ) ) ( ( 'readOnly' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1763:1: ( ( 'readOnly' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1764:1: ( 'readOnly' )
            {
             before(grammarAccess.getModelSlotAccess().getReadOnlyKeyword_11()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1765:1: ( 'readOnly' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1766:2: 'readOnly'
            {
            match(input,35,FOLLOW_35_in_rule__ModelSlot__Group__11__Impl3632); 

            }

             after(grammarAccess.getModelSlotAccess().getReadOnlyKeyword_11()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1770:1: ( ( 'readOnly' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1771:1: ( 'readOnly' )*
            {
             before(grammarAccess.getModelSlotAccess().getReadOnlyKeyword_11()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1772:1: ( 'readOnly' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==35) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1773:2: 'readOnly'
            	    {
            	    match(input,35,FOLLOW_35_in_rule__ModelSlot__Group__11__Impl3648); 

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1785:1: rule__ModelSlot__Group__12 : rule__ModelSlot__Group__12__Impl rule__ModelSlot__Group__13 ;
    public final void rule__ModelSlot__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1789:1: ( rule__ModelSlot__Group__12__Impl rule__ModelSlot__Group__13 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1790:2: rule__ModelSlot__Group__12__Impl rule__ModelSlot__Group__13
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__12__Impl_in_rule__ModelSlot__Group__123683);
            rule__ModelSlot__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__13_in_rule__ModelSlot__Group__123686);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1797:1: rule__ModelSlot__Group__12__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__ModelSlot__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1801:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1802:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1802:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1803:1: ( ( '=' ) ) ( ( '=' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1803:1: ( ( '=' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1804:1: ( '=' )
            {
             before(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_12()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1805:1: ( '=' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1806:2: '='
            {
            match(input,28,FOLLOW_28_in_rule__ModelSlot__Group__12__Impl3717); 

            }

             after(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_12()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1810:1: ( ( '=' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1811:1: ( '=' )*
            {
             before(grammarAccess.getModelSlotAccess().getEqualsSignKeyword_12()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1812:1: ( '=' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==28) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1813:2: '='
            	    {
            	    match(input,28,FOLLOW_28_in_rule__ModelSlot__Group__12__Impl3733); 

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1825:1: rule__ModelSlot__Group__13 : rule__ModelSlot__Group__13__Impl rule__ModelSlot__Group__14 ;
    public final void rule__ModelSlot__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1829:1: ( rule__ModelSlot__Group__13__Impl rule__ModelSlot__Group__14 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1830:2: rule__ModelSlot__Group__13__Impl rule__ModelSlot__Group__14
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__13__Impl_in_rule__ModelSlot__Group__133768);
            rule__ModelSlot__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelSlot__Group__14_in_rule__ModelSlot__Group__133771);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1837:1: rule__ModelSlot__Group__13__Impl : ( ( rule__ModelSlot__ReadOnlyAssignment_13 ) ) ;
    public final void rule__ModelSlot__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1841:1: ( ( ( rule__ModelSlot__ReadOnlyAssignment_13 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1842:1: ( ( rule__ModelSlot__ReadOnlyAssignment_13 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1842:1: ( ( rule__ModelSlot__ReadOnlyAssignment_13 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1843:1: ( rule__ModelSlot__ReadOnlyAssignment_13 )
            {
             before(grammarAccess.getModelSlotAccess().getReadOnlyAssignment_13()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1844:1: ( rule__ModelSlot__ReadOnlyAssignment_13 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1844:2: rule__ModelSlot__ReadOnlyAssignment_13
            {
            pushFollow(FOLLOW_rule__ModelSlot__ReadOnlyAssignment_13_in_rule__ModelSlot__Group__13__Impl3798);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1854:1: rule__ModelSlot__Group__14 : rule__ModelSlot__Group__14__Impl ;
    public final void rule__ModelSlot__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1858:1: ( rule__ModelSlot__Group__14__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1859:2: rule__ModelSlot__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__ModelSlot__Group__14__Impl_in_rule__ModelSlot__Group__143828);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1865:1: rule__ModelSlot__Group__14__Impl : ( ';' ) ;
    public final void rule__ModelSlot__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1869:1: ( ( ';' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1870:1: ( ';' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1870:1: ( ';' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1871:1: ';'
            {
             before(grammarAccess.getModelSlotAccess().getSemicolonKeyword_14()); 
            match(input,36,FOLLOW_36_in_rule__ModelSlot__Group__14__Impl3856); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1914:1: rule__EditionPattern__Group__0 : rule__EditionPattern__Group__0__Impl rule__EditionPattern__Group__1 ;
    public final void rule__EditionPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1918:1: ( rule__EditionPattern__Group__0__Impl rule__EditionPattern__Group__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1919:2: rule__EditionPattern__Group__0__Impl rule__EditionPattern__Group__1
            {
            pushFollow(FOLLOW_rule__EditionPattern__Group__0__Impl_in_rule__EditionPattern__Group__03917);
            rule__EditionPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionPattern__Group__1_in_rule__EditionPattern__Group__03920);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1926:1: rule__EditionPattern__Group__0__Impl : ( 'EditionPattern' ) ;
    public final void rule__EditionPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1930:1: ( ( 'EditionPattern' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1931:1: ( 'EditionPattern' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1931:1: ( 'EditionPattern' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1932:1: 'EditionPattern'
            {
             before(grammarAccess.getEditionPatternAccess().getEditionPatternKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__EditionPattern__Group__0__Impl3948); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1945:1: rule__EditionPattern__Group__1 : rule__EditionPattern__Group__1__Impl rule__EditionPattern__Group__2 ;
    public final void rule__EditionPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1949:1: ( rule__EditionPattern__Group__1__Impl rule__EditionPattern__Group__2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1950:2: rule__EditionPattern__Group__1__Impl rule__EditionPattern__Group__2
            {
            pushFollow(FOLLOW_rule__EditionPattern__Group__1__Impl_in_rule__EditionPattern__Group__13979);
            rule__EditionPattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionPattern__Group__2_in_rule__EditionPattern__Group__13982);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1957:1: rule__EditionPattern__Group__1__Impl : ( ( rule__EditionPattern__NameAssignment_1 ) ) ;
    public final void rule__EditionPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1961:1: ( ( ( rule__EditionPattern__NameAssignment_1 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1962:1: ( ( rule__EditionPattern__NameAssignment_1 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1962:1: ( ( rule__EditionPattern__NameAssignment_1 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1963:1: ( rule__EditionPattern__NameAssignment_1 )
            {
             before(grammarAccess.getEditionPatternAccess().getNameAssignment_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1964:1: ( rule__EditionPattern__NameAssignment_1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1964:2: rule__EditionPattern__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EditionPattern__NameAssignment_1_in_rule__EditionPattern__Group__1__Impl4009);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1974:1: rule__EditionPattern__Group__2 : rule__EditionPattern__Group__2__Impl rule__EditionPattern__Group__3 ;
    public final void rule__EditionPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1978:1: ( rule__EditionPattern__Group__2__Impl rule__EditionPattern__Group__3 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1979:2: rule__EditionPattern__Group__2__Impl rule__EditionPattern__Group__3
            {
            pushFollow(FOLLOW_rule__EditionPattern__Group__2__Impl_in_rule__EditionPattern__Group__24039);
            rule__EditionPattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionPattern__Group__3_in_rule__EditionPattern__Group__24042);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1986:1: rule__EditionPattern__Group__2__Impl : ( ( rule__EditionPattern__Group_2__0 )? ) ;
    public final void rule__EditionPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1990:1: ( ( ( rule__EditionPattern__Group_2__0 )? ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1991:1: ( ( rule__EditionPattern__Group_2__0 )? )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1991:1: ( ( rule__EditionPattern__Group_2__0 )? )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1992:1: ( rule__EditionPattern__Group_2__0 )?
            {
             before(grammarAccess.getEditionPatternAccess().getGroup_2()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1993:1: ( rule__EditionPattern__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:1993:2: rule__EditionPattern__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EditionPattern__Group_2__0_in_rule__EditionPattern__Group__2__Impl4069);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2003:1: rule__EditionPattern__Group__3 : rule__EditionPattern__Group__3__Impl rule__EditionPattern__Group__4 ;
    public final void rule__EditionPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2007:1: ( rule__EditionPattern__Group__3__Impl rule__EditionPattern__Group__4 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2008:2: rule__EditionPattern__Group__3__Impl rule__EditionPattern__Group__4
            {
            pushFollow(FOLLOW_rule__EditionPattern__Group__3__Impl_in_rule__EditionPattern__Group__34100);
            rule__EditionPattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionPattern__Group__4_in_rule__EditionPattern__Group__34103);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2015:1: rule__EditionPattern__Group__3__Impl : ( '{' ) ;
    public final void rule__EditionPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2019:1: ( ( '{' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2020:1: ( '{' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2020:1: ( '{' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2021:1: '{'
            {
             before(grammarAccess.getEditionPatternAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__EditionPattern__Group__3__Impl4131); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2034:1: rule__EditionPattern__Group__4 : rule__EditionPattern__Group__4__Impl rule__EditionPattern__Group__5 ;
    public final void rule__EditionPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2038:1: ( rule__EditionPattern__Group__4__Impl rule__EditionPattern__Group__5 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2039:2: rule__EditionPattern__Group__4__Impl rule__EditionPattern__Group__5
            {
            pushFollow(FOLLOW_rule__EditionPattern__Group__4__Impl_in_rule__EditionPattern__Group__44162);
            rule__EditionPattern__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionPattern__Group__5_in_rule__EditionPattern__Group__44165);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2046:1: rule__EditionPattern__Group__4__Impl : ( ( rule__EditionPattern__PatternRolesAssignment_4 )* ) ;
    public final void rule__EditionPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2050:1: ( ( ( rule__EditionPattern__PatternRolesAssignment_4 )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2051:1: ( ( rule__EditionPattern__PatternRolesAssignment_4 )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2051:1: ( ( rule__EditionPattern__PatternRolesAssignment_4 )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2052:1: ( rule__EditionPattern__PatternRolesAssignment_4 )*
            {
             before(grammarAccess.getEditionPatternAccess().getPatternRolesAssignment_4()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2053:1: ( rule__EditionPattern__PatternRolesAssignment_4 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==39) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2053:2: rule__EditionPattern__PatternRolesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__EditionPattern__PatternRolesAssignment_4_in_rule__EditionPattern__Group__4__Impl4192);
            	    rule__EditionPattern__PatternRolesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2063:1: rule__EditionPattern__Group__5 : rule__EditionPattern__Group__5__Impl rule__EditionPattern__Group__6 ;
    public final void rule__EditionPattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2067:1: ( rule__EditionPattern__Group__5__Impl rule__EditionPattern__Group__6 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2068:2: rule__EditionPattern__Group__5__Impl rule__EditionPattern__Group__6
            {
            pushFollow(FOLLOW_rule__EditionPattern__Group__5__Impl_in_rule__EditionPattern__Group__54223);
            rule__EditionPattern__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionPattern__Group__6_in_rule__EditionPattern__Group__54226);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2075:1: rule__EditionPattern__Group__5__Impl : ( ( rule__EditionPattern__EditionSchemesAssignment_5 )* ) ;
    public final void rule__EditionPattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2079:1: ( ( ( rule__EditionPattern__EditionSchemesAssignment_5 )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2080:1: ( ( rule__EditionPattern__EditionSchemesAssignment_5 )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2080:1: ( ( rule__EditionPattern__EditionSchemesAssignment_5 )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2081:1: ( rule__EditionPattern__EditionSchemesAssignment_5 )*
            {
             before(grammarAccess.getEditionPatternAccess().getEditionSchemesAssignment_5()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2082:1: ( rule__EditionPattern__EditionSchemesAssignment_5 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=15 && LA26_0<=18)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2082:2: rule__EditionPattern__EditionSchemesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__EditionPattern__EditionSchemesAssignment_5_in_rule__EditionPattern__Group__5__Impl4253);
            	    rule__EditionPattern__EditionSchemesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2092:1: rule__EditionPattern__Group__6 : rule__EditionPattern__Group__6__Impl ;
    public final void rule__EditionPattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2096:1: ( rule__EditionPattern__Group__6__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2097:2: rule__EditionPattern__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__EditionPattern__Group__6__Impl_in_rule__EditionPattern__Group__64284);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2103:1: rule__EditionPattern__Group__6__Impl : ( '}' ) ;
    public final void rule__EditionPattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2107:1: ( ( '}' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2108:1: ( '}' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2108:1: ( '}' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2109:1: '}'
            {
             before(grammarAccess.getEditionPatternAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__EditionPattern__Group__6__Impl4312); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2136:1: rule__EditionPattern__Group_2__0 : rule__EditionPattern__Group_2__0__Impl rule__EditionPattern__Group_2__1 ;
    public final void rule__EditionPattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2140:1: ( rule__EditionPattern__Group_2__0__Impl rule__EditionPattern__Group_2__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2141:2: rule__EditionPattern__Group_2__0__Impl rule__EditionPattern__Group_2__1
            {
            pushFollow(FOLLOW_rule__EditionPattern__Group_2__0__Impl_in_rule__EditionPattern__Group_2__04357);
            rule__EditionPattern__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionPattern__Group_2__1_in_rule__EditionPattern__Group_2__04360);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2148:1: rule__EditionPattern__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__EditionPattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2152:1: ( ( 'extends' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2153:1: ( 'extends' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2153:1: ( 'extends' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2154:1: 'extends'
            {
             before(grammarAccess.getEditionPatternAccess().getExtendsKeyword_2_0()); 
            match(input,38,FOLLOW_38_in_rule__EditionPattern__Group_2__0__Impl4388); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2167:1: rule__EditionPattern__Group_2__1 : rule__EditionPattern__Group_2__1__Impl ;
    public final void rule__EditionPattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2171:1: ( rule__EditionPattern__Group_2__1__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2172:2: rule__EditionPattern__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EditionPattern__Group_2__1__Impl_in_rule__EditionPattern__Group_2__14419);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2178:1: rule__EditionPattern__Group_2__1__Impl : ( ( rule__EditionPattern__SuperEditionPatternAssignment_2_1 ) ) ;
    public final void rule__EditionPattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2182:1: ( ( ( rule__EditionPattern__SuperEditionPatternAssignment_2_1 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2183:1: ( ( rule__EditionPattern__SuperEditionPatternAssignment_2_1 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2183:1: ( ( rule__EditionPattern__SuperEditionPatternAssignment_2_1 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2184:1: ( rule__EditionPattern__SuperEditionPatternAssignment_2_1 )
            {
             before(grammarAccess.getEditionPatternAccess().getSuperEditionPatternAssignment_2_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2185:1: ( rule__EditionPattern__SuperEditionPatternAssignment_2_1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2185:2: rule__EditionPattern__SuperEditionPatternAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EditionPattern__SuperEditionPatternAssignment_2_1_in_rule__EditionPattern__Group_2__1__Impl4446);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2199:1: rule__PatternRole__Group__0 : rule__PatternRole__Group__0__Impl rule__PatternRole__Group__1 ;
    public final void rule__PatternRole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2203:1: ( rule__PatternRole__Group__0__Impl rule__PatternRole__Group__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2204:2: rule__PatternRole__Group__0__Impl rule__PatternRole__Group__1
            {
            pushFollow(FOLLOW_rule__PatternRole__Group__0__Impl_in_rule__PatternRole__Group__04480);
            rule__PatternRole__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatternRole__Group__1_in_rule__PatternRole__Group__04483);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2211:1: rule__PatternRole__Group__0__Impl : ( 'PatternRole' ) ;
    public final void rule__PatternRole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2215:1: ( ( 'PatternRole' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2216:1: ( 'PatternRole' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2216:1: ( 'PatternRole' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2217:1: 'PatternRole'
            {
             before(grammarAccess.getPatternRoleAccess().getPatternRoleKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__PatternRole__Group__0__Impl4511); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2230:1: rule__PatternRole__Group__1 : rule__PatternRole__Group__1__Impl rule__PatternRole__Group__2 ;
    public final void rule__PatternRole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2234:1: ( rule__PatternRole__Group__1__Impl rule__PatternRole__Group__2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2235:2: rule__PatternRole__Group__1__Impl rule__PatternRole__Group__2
            {
            pushFollow(FOLLOW_rule__PatternRole__Group__1__Impl_in_rule__PatternRole__Group__14542);
            rule__PatternRole__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatternRole__Group__2_in_rule__PatternRole__Group__14545);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2242:1: rule__PatternRole__Group__1__Impl : ( ( rule__PatternRole__NameAssignment_1 ) ) ;
    public final void rule__PatternRole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2246:1: ( ( ( rule__PatternRole__NameAssignment_1 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2247:1: ( ( rule__PatternRole__NameAssignment_1 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2247:1: ( ( rule__PatternRole__NameAssignment_1 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2248:1: ( rule__PatternRole__NameAssignment_1 )
            {
             before(grammarAccess.getPatternRoleAccess().getNameAssignment_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2249:1: ( rule__PatternRole__NameAssignment_1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2249:2: rule__PatternRole__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PatternRole__NameAssignment_1_in_rule__PatternRole__Group__1__Impl4572);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2259:1: rule__PatternRole__Group__2 : rule__PatternRole__Group__2__Impl rule__PatternRole__Group__3 ;
    public final void rule__PatternRole__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2263:1: ( rule__PatternRole__Group__2__Impl rule__PatternRole__Group__3 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2264:2: rule__PatternRole__Group__2__Impl rule__PatternRole__Group__3
            {
            pushFollow(FOLLOW_rule__PatternRole__Group__2__Impl_in_rule__PatternRole__Group__24602);
            rule__PatternRole__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatternRole__Group__3_in_rule__PatternRole__Group__24605);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2271:1: rule__PatternRole__Group__2__Impl : ( 'as' ) ;
    public final void rule__PatternRole__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2275:1: ( ( 'as' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2276:1: ( 'as' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2276:1: ( 'as' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2277:1: 'as'
            {
             before(grammarAccess.getPatternRoleAccess().getAsKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__PatternRole__Group__2__Impl4633); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2290:1: rule__PatternRole__Group__3 : rule__PatternRole__Group__3__Impl rule__PatternRole__Group__4 ;
    public final void rule__PatternRole__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2294:1: ( rule__PatternRole__Group__3__Impl rule__PatternRole__Group__4 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2295:2: rule__PatternRole__Group__3__Impl rule__PatternRole__Group__4
            {
            pushFollow(FOLLOW_rule__PatternRole__Group__3__Impl_in_rule__PatternRole__Group__34664);
            rule__PatternRole__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatternRole__Group__4_in_rule__PatternRole__Group__34667);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2302:1: rule__PatternRole__Group__3__Impl : ( ( rule__PatternRole__TypeAssignment_3 ) ) ;
    public final void rule__PatternRole__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2306:1: ( ( ( rule__PatternRole__TypeAssignment_3 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2307:1: ( ( rule__PatternRole__TypeAssignment_3 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2307:1: ( ( rule__PatternRole__TypeAssignment_3 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2308:1: ( rule__PatternRole__TypeAssignment_3 )
            {
             before(grammarAccess.getPatternRoleAccess().getTypeAssignment_3()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2309:1: ( rule__PatternRole__TypeAssignment_3 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2309:2: rule__PatternRole__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__PatternRole__TypeAssignment_3_in_rule__PatternRole__Group__3__Impl4694);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2319:1: rule__PatternRole__Group__4 : rule__PatternRole__Group__4__Impl rule__PatternRole__Group__5 ;
    public final void rule__PatternRole__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2323:1: ( rule__PatternRole__Group__4__Impl rule__PatternRole__Group__5 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2324:2: rule__PatternRole__Group__4__Impl rule__PatternRole__Group__5
            {
            pushFollow(FOLLOW_rule__PatternRole__Group__4__Impl_in_rule__PatternRole__Group__44724);
            rule__PatternRole__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatternRole__Group__5_in_rule__PatternRole__Group__44727);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2331:1: rule__PatternRole__Group__4__Impl : ( 'conformTo' ) ;
    public final void rule__PatternRole__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2335:1: ( ( 'conformTo' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2336:1: ( 'conformTo' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2336:1: ( 'conformTo' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2337:1: 'conformTo'
            {
             before(grammarAccess.getPatternRoleAccess().getConformToKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__PatternRole__Group__4__Impl4755); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2350:1: rule__PatternRole__Group__5 : rule__PatternRole__Group__5__Impl rule__PatternRole__Group__6 ;
    public final void rule__PatternRole__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2354:1: ( rule__PatternRole__Group__5__Impl rule__PatternRole__Group__6 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2355:2: rule__PatternRole__Group__5__Impl rule__PatternRole__Group__6
            {
            pushFollow(FOLLOW_rule__PatternRole__Group__5__Impl_in_rule__PatternRole__Group__54786);
            rule__PatternRole__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatternRole__Group__6_in_rule__PatternRole__Group__54789);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2362:1: rule__PatternRole__Group__5__Impl : ( ( rule__PatternRole__ModelElementAssignment_5 ) ) ;
    public final void rule__PatternRole__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2366:1: ( ( ( rule__PatternRole__ModelElementAssignment_5 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2367:1: ( ( rule__PatternRole__ModelElementAssignment_5 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2367:1: ( ( rule__PatternRole__ModelElementAssignment_5 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2368:1: ( rule__PatternRole__ModelElementAssignment_5 )
            {
             before(grammarAccess.getPatternRoleAccess().getModelElementAssignment_5()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2369:1: ( rule__PatternRole__ModelElementAssignment_5 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2369:2: rule__PatternRole__ModelElementAssignment_5
            {
            pushFollow(FOLLOW_rule__PatternRole__ModelElementAssignment_5_in_rule__PatternRole__Group__5__Impl4816);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2379:1: rule__PatternRole__Group__6 : rule__PatternRole__Group__6__Impl rule__PatternRole__Group__7 ;
    public final void rule__PatternRole__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2383:1: ( rule__PatternRole__Group__6__Impl rule__PatternRole__Group__7 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2384:2: rule__PatternRole__Group__6__Impl rule__PatternRole__Group__7
            {
            pushFollow(FOLLOW_rule__PatternRole__Group__6__Impl_in_rule__PatternRole__Group__64846);
            rule__PatternRole__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatternRole__Group__7_in_rule__PatternRole__Group__64849);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2391:1: rule__PatternRole__Group__6__Impl : ( 'from' ) ;
    public final void rule__PatternRole__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2395:1: ( ( 'from' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2396:1: ( 'from' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2396:1: ( 'from' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2397:1: 'from'
            {
             before(grammarAccess.getPatternRoleAccess().getFromKeyword_6()); 
            match(input,41,FOLLOW_41_in_rule__PatternRole__Group__6__Impl4877); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2410:1: rule__PatternRole__Group__7 : rule__PatternRole__Group__7__Impl rule__PatternRole__Group__8 ;
    public final void rule__PatternRole__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2414:1: ( rule__PatternRole__Group__7__Impl rule__PatternRole__Group__8 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2415:2: rule__PatternRole__Group__7__Impl rule__PatternRole__Group__8
            {
            pushFollow(FOLLOW_rule__PatternRole__Group__7__Impl_in_rule__PatternRole__Group__74908);
            rule__PatternRole__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatternRole__Group__8_in_rule__PatternRole__Group__74911);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2422:1: rule__PatternRole__Group__7__Impl : ( ( rule__PatternRole__ModelSlotAssignment_7 ) ) ;
    public final void rule__PatternRole__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2426:1: ( ( ( rule__PatternRole__ModelSlotAssignment_7 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2427:1: ( ( rule__PatternRole__ModelSlotAssignment_7 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2427:1: ( ( rule__PatternRole__ModelSlotAssignment_7 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2428:1: ( rule__PatternRole__ModelSlotAssignment_7 )
            {
             before(grammarAccess.getPatternRoleAccess().getModelSlotAssignment_7()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2429:1: ( rule__PatternRole__ModelSlotAssignment_7 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2429:2: rule__PatternRole__ModelSlotAssignment_7
            {
            pushFollow(FOLLOW_rule__PatternRole__ModelSlotAssignment_7_in_rule__PatternRole__Group__7__Impl4938);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2439:1: rule__PatternRole__Group__8 : rule__PatternRole__Group__8__Impl ;
    public final void rule__PatternRole__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2443:1: ( rule__PatternRole__Group__8__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2444:2: rule__PatternRole__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__PatternRole__Group__8__Impl_in_rule__PatternRole__Group__84968);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2450:1: rule__PatternRole__Group__8__Impl : ( ';' ) ;
    public final void rule__PatternRole__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2454:1: ( ( ';' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2455:1: ( ';' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2455:1: ( ';' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2456:1: ';'
            {
             before(grammarAccess.getPatternRoleAccess().getSemicolonKeyword_8()); 
            match(input,36,FOLLOW_36_in_rule__PatternRole__Group__8__Impl4996); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2487:1: rule__EditionScheme__Group__0 : rule__EditionScheme__Group__0__Impl rule__EditionScheme__Group__1 ;
    public final void rule__EditionScheme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2491:1: ( rule__EditionScheme__Group__0__Impl rule__EditionScheme__Group__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2492:2: rule__EditionScheme__Group__0__Impl rule__EditionScheme__Group__1
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group__0__Impl_in_rule__EditionScheme__Group__05045);
            rule__EditionScheme__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionScheme__Group__1_in_rule__EditionScheme__Group__05048);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2499:1: rule__EditionScheme__Group__0__Impl : ( ( rule__EditionScheme__EditionSchemeTypeAssignment_0 ) ) ;
    public final void rule__EditionScheme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2503:1: ( ( ( rule__EditionScheme__EditionSchemeTypeAssignment_0 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2504:1: ( ( rule__EditionScheme__EditionSchemeTypeAssignment_0 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2504:1: ( ( rule__EditionScheme__EditionSchemeTypeAssignment_0 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2505:1: ( rule__EditionScheme__EditionSchemeTypeAssignment_0 )
            {
             before(grammarAccess.getEditionSchemeAccess().getEditionSchemeTypeAssignment_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2506:1: ( rule__EditionScheme__EditionSchemeTypeAssignment_0 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2506:2: rule__EditionScheme__EditionSchemeTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__EditionScheme__EditionSchemeTypeAssignment_0_in_rule__EditionScheme__Group__0__Impl5075);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2516:1: rule__EditionScheme__Group__1 : rule__EditionScheme__Group__1__Impl rule__EditionScheme__Group__2 ;
    public final void rule__EditionScheme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2520:1: ( rule__EditionScheme__Group__1__Impl rule__EditionScheme__Group__2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2521:2: rule__EditionScheme__Group__1__Impl rule__EditionScheme__Group__2
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group__1__Impl_in_rule__EditionScheme__Group__15105);
            rule__EditionScheme__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionScheme__Group__2_in_rule__EditionScheme__Group__15108);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2528:1: rule__EditionScheme__Group__1__Impl : ( ( rule__EditionScheme__NameAssignment_1 ) ) ;
    public final void rule__EditionScheme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2532:1: ( ( ( rule__EditionScheme__NameAssignment_1 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2533:1: ( ( rule__EditionScheme__NameAssignment_1 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2533:1: ( ( rule__EditionScheme__NameAssignment_1 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2534:1: ( rule__EditionScheme__NameAssignment_1 )
            {
             before(grammarAccess.getEditionSchemeAccess().getNameAssignment_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2535:1: ( rule__EditionScheme__NameAssignment_1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2535:2: rule__EditionScheme__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EditionScheme__NameAssignment_1_in_rule__EditionScheme__Group__1__Impl5135);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2545:1: rule__EditionScheme__Group__2 : rule__EditionScheme__Group__2__Impl rule__EditionScheme__Group__3 ;
    public final void rule__EditionScheme__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2549:1: ( rule__EditionScheme__Group__2__Impl rule__EditionScheme__Group__3 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2550:2: rule__EditionScheme__Group__2__Impl rule__EditionScheme__Group__3
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group__2__Impl_in_rule__EditionScheme__Group__25165);
            rule__EditionScheme__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionScheme__Group__3_in_rule__EditionScheme__Group__25168);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2557:1: rule__EditionScheme__Group__2__Impl : ( '(' ) ;
    public final void rule__EditionScheme__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2561:1: ( ( '(' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2562:1: ( '(' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2562:1: ( '(' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2563:1: '('
            {
             before(grammarAccess.getEditionSchemeAccess().getLeftParenthesisKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__EditionScheme__Group__2__Impl5196); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2576:1: rule__EditionScheme__Group__3 : rule__EditionScheme__Group__3__Impl rule__EditionScheme__Group__4 ;
    public final void rule__EditionScheme__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2580:1: ( rule__EditionScheme__Group__3__Impl rule__EditionScheme__Group__4 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2581:2: rule__EditionScheme__Group__3__Impl rule__EditionScheme__Group__4
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group__3__Impl_in_rule__EditionScheme__Group__35227);
            rule__EditionScheme__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionScheme__Group__4_in_rule__EditionScheme__Group__35230);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2588:1: rule__EditionScheme__Group__3__Impl : ( ( rule__EditionScheme__Group_3__0 )? ) ;
    public final void rule__EditionScheme__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2592:1: ( ( ( rule__EditionScheme__Group_3__0 )? ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2593:1: ( ( rule__EditionScheme__Group_3__0 )? )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2593:1: ( ( rule__EditionScheme__Group_3__0 )? )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2594:1: ( rule__EditionScheme__Group_3__0 )?
            {
             before(grammarAccess.getEditionSchemeAccess().getGroup_3()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2595:1: ( rule__EditionScheme__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==14) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2595:2: rule__EditionScheme__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EditionScheme__Group_3__0_in_rule__EditionScheme__Group__3__Impl5257);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2605:1: rule__EditionScheme__Group__4 : rule__EditionScheme__Group__4__Impl rule__EditionScheme__Group__5 ;
    public final void rule__EditionScheme__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2609:1: ( rule__EditionScheme__Group__4__Impl rule__EditionScheme__Group__5 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2610:2: rule__EditionScheme__Group__4__Impl rule__EditionScheme__Group__5
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group__4__Impl_in_rule__EditionScheme__Group__45288);
            rule__EditionScheme__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionScheme__Group__5_in_rule__EditionScheme__Group__45291);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2617:1: rule__EditionScheme__Group__4__Impl : ( ')' ) ;
    public final void rule__EditionScheme__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2621:1: ( ( ')' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2622:1: ( ')' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2622:1: ( ')' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2623:1: ')'
            {
             before(grammarAccess.getEditionSchemeAccess().getRightParenthesisKeyword_4()); 
            match(input,43,FOLLOW_43_in_rule__EditionScheme__Group__4__Impl5319); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2636:1: rule__EditionScheme__Group__5 : rule__EditionScheme__Group__5__Impl rule__EditionScheme__Group__6 ;
    public final void rule__EditionScheme__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2640:1: ( rule__EditionScheme__Group__5__Impl rule__EditionScheme__Group__6 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2641:2: rule__EditionScheme__Group__5__Impl rule__EditionScheme__Group__6
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group__5__Impl_in_rule__EditionScheme__Group__55350);
            rule__EditionScheme__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionScheme__Group__6_in_rule__EditionScheme__Group__55353);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2648:1: rule__EditionScheme__Group__5__Impl : ( '{' ) ;
    public final void rule__EditionScheme__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2652:1: ( ( '{' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2653:1: ( '{' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2653:1: ( '{' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2654:1: '{'
            {
             before(grammarAccess.getEditionSchemeAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__EditionScheme__Group__5__Impl5381); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2667:1: rule__EditionScheme__Group__6 : rule__EditionScheme__Group__6__Impl rule__EditionScheme__Group__7 ;
    public final void rule__EditionScheme__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2671:1: ( rule__EditionScheme__Group__6__Impl rule__EditionScheme__Group__7 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2672:2: rule__EditionScheme__Group__6__Impl rule__EditionScheme__Group__7
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group__6__Impl_in_rule__EditionScheme__Group__65412);
            rule__EditionScheme__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionScheme__Group__7_in_rule__EditionScheme__Group__65415);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2679:1: rule__EditionScheme__Group__6__Impl : ( ( rule__EditionScheme__EditionActionAssignment_6 )* ) ;
    public final void rule__EditionScheme__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2683:1: ( ( ( rule__EditionScheme__EditionActionAssignment_6 )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2684:1: ( ( rule__EditionScheme__EditionActionAssignment_6 )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2684:1: ( ( rule__EditionScheme__EditionActionAssignment_6 )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2685:1: ( rule__EditionScheme__EditionActionAssignment_6 )*
            {
             before(grammarAccess.getEditionSchemeAccess().getEditionActionAssignment_6()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2686:1: ( rule__EditionScheme__EditionActionAssignment_6 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||(LA28_0>=48 && LA28_0<=49)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2686:2: rule__EditionScheme__EditionActionAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__EditionScheme__EditionActionAssignment_6_in_rule__EditionScheme__Group__6__Impl5442);
            	    rule__EditionScheme__EditionActionAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2696:1: rule__EditionScheme__Group__7 : rule__EditionScheme__Group__7__Impl ;
    public final void rule__EditionScheme__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2700:1: ( rule__EditionScheme__Group__7__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2701:2: rule__EditionScheme__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group__7__Impl_in_rule__EditionScheme__Group__75473);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2707:1: rule__EditionScheme__Group__7__Impl : ( '}' ) ;
    public final void rule__EditionScheme__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2711:1: ( ( '}' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2712:1: ( '}' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2712:1: ( '}' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2713:1: '}'
            {
             before(grammarAccess.getEditionSchemeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,30,FOLLOW_30_in_rule__EditionScheme__Group__7__Impl5501); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2742:1: rule__EditionScheme__Group_3__0 : rule__EditionScheme__Group_3__0__Impl rule__EditionScheme__Group_3__1 ;
    public final void rule__EditionScheme__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2746:1: ( rule__EditionScheme__Group_3__0__Impl rule__EditionScheme__Group_3__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2747:2: rule__EditionScheme__Group_3__0__Impl rule__EditionScheme__Group_3__1
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group_3__0__Impl_in_rule__EditionScheme__Group_3__05548);
            rule__EditionScheme__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionScheme__Group_3__1_in_rule__EditionScheme__Group_3__05551);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2754:1: rule__EditionScheme__Group_3__0__Impl : ( ( ( rule__EditionScheme__ParameterAssignment_3_0 ) ) ( ( rule__EditionScheme__ParameterAssignment_3_0 )* ) ) ;
    public final void rule__EditionScheme__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2758:1: ( ( ( ( rule__EditionScheme__ParameterAssignment_3_0 ) ) ( ( rule__EditionScheme__ParameterAssignment_3_0 )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2759:1: ( ( ( rule__EditionScheme__ParameterAssignment_3_0 ) ) ( ( rule__EditionScheme__ParameterAssignment_3_0 )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2759:1: ( ( ( rule__EditionScheme__ParameterAssignment_3_0 ) ) ( ( rule__EditionScheme__ParameterAssignment_3_0 )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2760:1: ( ( rule__EditionScheme__ParameterAssignment_3_0 ) ) ( ( rule__EditionScheme__ParameterAssignment_3_0 )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2760:1: ( ( rule__EditionScheme__ParameterAssignment_3_0 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2761:1: ( rule__EditionScheme__ParameterAssignment_3_0 )
            {
             before(grammarAccess.getEditionSchemeAccess().getParameterAssignment_3_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2762:1: ( rule__EditionScheme__ParameterAssignment_3_0 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2762:2: rule__EditionScheme__ParameterAssignment_3_0
            {
            pushFollow(FOLLOW_rule__EditionScheme__ParameterAssignment_3_0_in_rule__EditionScheme__Group_3__0__Impl5580);
            rule__EditionScheme__ParameterAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getEditionSchemeAccess().getParameterAssignment_3_0()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2765:1: ( ( rule__EditionScheme__ParameterAssignment_3_0 )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2766:1: ( rule__EditionScheme__ParameterAssignment_3_0 )*
            {
             before(grammarAccess.getEditionSchemeAccess().getParameterAssignment_3_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2767:1: ( rule__EditionScheme__ParameterAssignment_3_0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==14) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2767:2: rule__EditionScheme__ParameterAssignment_3_0
            	    {
            	    pushFollow(FOLLOW_rule__EditionScheme__ParameterAssignment_3_0_in_rule__EditionScheme__Group_3__0__Impl5592);
            	    rule__EditionScheme__ParameterAssignment_3_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2778:1: rule__EditionScheme__Group_3__1 : rule__EditionScheme__Group_3__1__Impl ;
    public final void rule__EditionScheme__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2782:1: ( rule__EditionScheme__Group_3__1__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2783:2: rule__EditionScheme__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group_3__1__Impl_in_rule__EditionScheme__Group_3__15625);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2789:1: rule__EditionScheme__Group_3__1__Impl : ( ( rule__EditionScheme__Group_3_1__0 )* ) ;
    public final void rule__EditionScheme__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2793:1: ( ( ( rule__EditionScheme__Group_3_1__0 )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2794:1: ( ( rule__EditionScheme__Group_3_1__0 )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2794:1: ( ( rule__EditionScheme__Group_3_1__0 )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2795:1: ( rule__EditionScheme__Group_3_1__0 )*
            {
             before(grammarAccess.getEditionSchemeAccess().getGroup_3_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2796:1: ( rule__EditionScheme__Group_3_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==44) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2796:2: rule__EditionScheme__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EditionScheme__Group_3_1__0_in_rule__EditionScheme__Group_3__1__Impl5652);
            	    rule__EditionScheme__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2810:1: rule__EditionScheme__Group_3_1__0 : rule__EditionScheme__Group_3_1__0__Impl rule__EditionScheme__Group_3_1__1 ;
    public final void rule__EditionScheme__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2814:1: ( rule__EditionScheme__Group_3_1__0__Impl rule__EditionScheme__Group_3_1__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2815:2: rule__EditionScheme__Group_3_1__0__Impl rule__EditionScheme__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group_3_1__0__Impl_in_rule__EditionScheme__Group_3_1__05687);
            rule__EditionScheme__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EditionScheme__Group_3_1__1_in_rule__EditionScheme__Group_3_1__05690);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2822:1: rule__EditionScheme__Group_3_1__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__EditionScheme__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2826:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2827:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2827:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2828:1: ( ( ',' ) ) ( ( ',' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2828:1: ( ( ',' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2829:1: ( ',' )
            {
             before(grammarAccess.getEditionSchemeAccess().getCommaKeyword_3_1_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2830:1: ( ',' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2831:2: ','
            {
            match(input,44,FOLLOW_44_in_rule__EditionScheme__Group_3_1__0__Impl5721); 

            }

             after(grammarAccess.getEditionSchemeAccess().getCommaKeyword_3_1_0()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2835:1: ( ( ',' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2836:1: ( ',' )*
            {
             before(grammarAccess.getEditionSchemeAccess().getCommaKeyword_3_1_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2837:1: ( ',' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==44) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2838:2: ','
            	    {
            	    match(input,44,FOLLOW_44_in_rule__EditionScheme__Group_3_1__0__Impl5737); 

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2850:1: rule__EditionScheme__Group_3_1__1 : rule__EditionScheme__Group_3_1__1__Impl ;
    public final void rule__EditionScheme__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2854:1: ( rule__EditionScheme__Group_3_1__1__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2855:2: rule__EditionScheme__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EditionScheme__Group_3_1__1__Impl_in_rule__EditionScheme__Group_3_1__15772);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2861:1: rule__EditionScheme__Group_3_1__1__Impl : ( ( rule__EditionScheme__ParameterAssignment_3_1_1 ) ) ;
    public final void rule__EditionScheme__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2865:1: ( ( ( rule__EditionScheme__ParameterAssignment_3_1_1 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2866:1: ( ( rule__EditionScheme__ParameterAssignment_3_1_1 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2866:1: ( ( rule__EditionScheme__ParameterAssignment_3_1_1 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2867:1: ( rule__EditionScheme__ParameterAssignment_3_1_1 )
            {
             before(grammarAccess.getEditionSchemeAccess().getParameterAssignment_3_1_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2868:1: ( rule__EditionScheme__ParameterAssignment_3_1_1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2868:2: rule__EditionScheme__ParameterAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__EditionScheme__ParameterAssignment_3_1_1_in_rule__EditionScheme__Group_3_1__1__Impl5799);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2882:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2886:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2887:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__05833);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__05836);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2894:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__WidgetAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2898:1: ( ( ( rule__Parameter__WidgetAssignment_0 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2899:1: ( ( rule__Parameter__WidgetAssignment_0 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2899:1: ( ( rule__Parameter__WidgetAssignment_0 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2900:1: ( rule__Parameter__WidgetAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getWidgetAssignment_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2901:1: ( rule__Parameter__WidgetAssignment_0 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2901:2: rule__Parameter__WidgetAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__WidgetAssignment_0_in_rule__Parameter__Group__0__Impl5863);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2911:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2915:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2916:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__15893);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__15896);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2923:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2927:1: ( ( ':' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2928:1: ( ':' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2928:1: ( ':' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2929:1: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,45,FOLLOW_45_in_rule__Parameter__Group__1__Impl5924); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2942:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2946:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2947:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__25955);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__25958);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2954:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__EditionPatternAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2958:1: ( ( ( rule__Parameter__EditionPatternAssignment_2 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2959:1: ( ( rule__Parameter__EditionPatternAssignment_2 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2959:1: ( ( rule__Parameter__EditionPatternAssignment_2 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2960:1: ( rule__Parameter__EditionPatternAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getEditionPatternAssignment_2()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2961:1: ( rule__Parameter__EditionPatternAssignment_2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2961:2: rule__Parameter__EditionPatternAssignment_2
            {
            pushFollow(FOLLOW_rule__Parameter__EditionPatternAssignment_2_in_rule__Parameter__Group__2__Impl5985);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2971:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2975:1: ( rule__Parameter__Group__3__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2976:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__36015);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2982:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__NameAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2986:1: ( ( ( rule__Parameter__NameAssignment_3 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2987:1: ( ( rule__Parameter__NameAssignment_3 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2987:1: ( ( rule__Parameter__NameAssignment_3 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2988:1: ( rule__Parameter__NameAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_3()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2989:1: ( rule__Parameter__NameAssignment_3 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:2989:2: rule__Parameter__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_3_in_rule__Parameter__Group__3__Impl6042);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3007:1: rule__DeclarePatternRole__Group__0 : rule__DeclarePatternRole__Group__0__Impl rule__DeclarePatternRole__Group__1 ;
    public final void rule__DeclarePatternRole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3011:1: ( rule__DeclarePatternRole__Group__0__Impl rule__DeclarePatternRole__Group__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3012:2: rule__DeclarePatternRole__Group__0__Impl rule__DeclarePatternRole__Group__1
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__Group__0__Impl_in_rule__DeclarePatternRole__Group__06080);
            rule__DeclarePatternRole__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclarePatternRole__Group__1_in_rule__DeclarePatternRole__Group__06083);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3019:1: rule__DeclarePatternRole__Group__0__Impl : ( ( ( rule__DeclarePatternRole__Group_0__0 ) ) ( ( rule__DeclarePatternRole__Group_0__0 )* ) ) ;
    public final void rule__DeclarePatternRole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3023:1: ( ( ( ( rule__DeclarePatternRole__Group_0__0 ) ) ( ( rule__DeclarePatternRole__Group_0__0 )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3024:1: ( ( ( rule__DeclarePatternRole__Group_0__0 ) ) ( ( rule__DeclarePatternRole__Group_0__0 )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3024:1: ( ( ( rule__DeclarePatternRole__Group_0__0 ) ) ( ( rule__DeclarePatternRole__Group_0__0 )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3025:1: ( ( rule__DeclarePatternRole__Group_0__0 ) ) ( ( rule__DeclarePatternRole__Group_0__0 )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3025:1: ( ( rule__DeclarePatternRole__Group_0__0 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3026:1: ( rule__DeclarePatternRole__Group_0__0 )
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getGroup_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3027:1: ( rule__DeclarePatternRole__Group_0__0 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3027:2: rule__DeclarePatternRole__Group_0__0
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__Group_0__0_in_rule__DeclarePatternRole__Group__0__Impl6112);
            rule__DeclarePatternRole__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarePatternRoleAccess().getGroup_0()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3030:1: ( ( rule__DeclarePatternRole__Group_0__0 )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3031:1: ( rule__DeclarePatternRole__Group_0__0 )*
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getGroup_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3032:1: ( rule__DeclarePatternRole__Group_0__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3032:2: rule__DeclarePatternRole__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__DeclarePatternRole__Group_0__0_in_rule__DeclarePatternRole__Group__0__Impl6124);
            	    rule__DeclarePatternRole__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getDeclarePatternRoleAccess().getGroup_0()); 

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
    // $ANTLR end "rule__DeclarePatternRole__Group__0__Impl"


    // $ANTLR start "rule__DeclarePatternRole__Group__1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3043:1: rule__DeclarePatternRole__Group__1 : rule__DeclarePatternRole__Group__1__Impl ;
    public final void rule__DeclarePatternRole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3047:1: ( rule__DeclarePatternRole__Group__1__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3048:2: rule__DeclarePatternRole__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__Group__1__Impl_in_rule__DeclarePatternRole__Group__16157);
            rule__DeclarePatternRole__Group__1__Impl();

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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3054:1: rule__DeclarePatternRole__Group__1__Impl : ( ( rule__DeclarePatternRole__Alternatives_1 ) ) ;
    public final void rule__DeclarePatternRole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3058:1: ( ( ( rule__DeclarePatternRole__Alternatives_1 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3059:1: ( ( rule__DeclarePatternRole__Alternatives_1 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3059:1: ( ( rule__DeclarePatternRole__Alternatives_1 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3060:1: ( rule__DeclarePatternRole__Alternatives_1 )
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getAlternatives_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3061:1: ( rule__DeclarePatternRole__Alternatives_1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3061:2: rule__DeclarePatternRole__Alternatives_1
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__Alternatives_1_in_rule__DeclarePatternRole__Group__1__Impl6184);
            rule__DeclarePatternRole__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarePatternRoleAccess().getAlternatives_1()); 

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


    // $ANTLR start "rule__DeclarePatternRole__Group_0__0"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3075:1: rule__DeclarePatternRole__Group_0__0 : rule__DeclarePatternRole__Group_0__0__Impl rule__DeclarePatternRole__Group_0__1 ;
    public final void rule__DeclarePatternRole__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3079:1: ( rule__DeclarePatternRole__Group_0__0__Impl rule__DeclarePatternRole__Group_0__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3080:2: rule__DeclarePatternRole__Group_0__0__Impl rule__DeclarePatternRole__Group_0__1
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__Group_0__0__Impl_in_rule__DeclarePatternRole__Group_0__06218);
            rule__DeclarePatternRole__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclarePatternRole__Group_0__1_in_rule__DeclarePatternRole__Group_0__06221);
            rule__DeclarePatternRole__Group_0__1();

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
    // $ANTLR end "rule__DeclarePatternRole__Group_0__0"


    // $ANTLR start "rule__DeclarePatternRole__Group_0__0__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3087:1: rule__DeclarePatternRole__Group_0__0__Impl : ( ( ( rule__DeclarePatternRole__PatternRoleAssignment_0_0 ) ) ( ( rule__DeclarePatternRole__PatternRoleAssignment_0_0 )* ) ) ;
    public final void rule__DeclarePatternRole__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3091:1: ( ( ( ( rule__DeclarePatternRole__PatternRoleAssignment_0_0 ) ) ( ( rule__DeclarePatternRole__PatternRoleAssignment_0_0 )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3092:1: ( ( ( rule__DeclarePatternRole__PatternRoleAssignment_0_0 ) ) ( ( rule__DeclarePatternRole__PatternRoleAssignment_0_0 )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3092:1: ( ( ( rule__DeclarePatternRole__PatternRoleAssignment_0_0 ) ) ( ( rule__DeclarePatternRole__PatternRoleAssignment_0_0 )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3093:1: ( ( rule__DeclarePatternRole__PatternRoleAssignment_0_0 ) ) ( ( rule__DeclarePatternRole__PatternRoleAssignment_0_0 )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3093:1: ( ( rule__DeclarePatternRole__PatternRoleAssignment_0_0 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3094:1: ( rule__DeclarePatternRole__PatternRoleAssignment_0_0 )
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getPatternRoleAssignment_0_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3095:1: ( rule__DeclarePatternRole__PatternRoleAssignment_0_0 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3095:2: rule__DeclarePatternRole__PatternRoleAssignment_0_0
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__PatternRoleAssignment_0_0_in_rule__DeclarePatternRole__Group_0__0__Impl6250);
            rule__DeclarePatternRole__PatternRoleAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarePatternRoleAccess().getPatternRoleAssignment_0_0()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3098:1: ( ( rule__DeclarePatternRole__PatternRoleAssignment_0_0 )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3099:1: ( rule__DeclarePatternRole__PatternRoleAssignment_0_0 )*
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getPatternRoleAssignment_0_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3100:1: ( rule__DeclarePatternRole__PatternRoleAssignment_0_0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3100:2: rule__DeclarePatternRole__PatternRoleAssignment_0_0
            	    {
            	    pushFollow(FOLLOW_rule__DeclarePatternRole__PatternRoleAssignment_0_0_in_rule__DeclarePatternRole__Group_0__0__Impl6262);
            	    rule__DeclarePatternRole__PatternRoleAssignment_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getDeclarePatternRoleAccess().getPatternRoleAssignment_0_0()); 

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
    // $ANTLR end "rule__DeclarePatternRole__Group_0__0__Impl"


    // $ANTLR start "rule__DeclarePatternRole__Group_0__1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3111:1: rule__DeclarePatternRole__Group_0__1 : rule__DeclarePatternRole__Group_0__1__Impl ;
    public final void rule__DeclarePatternRole__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3115:1: ( rule__DeclarePatternRole__Group_0__1__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3116:2: rule__DeclarePatternRole__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__Group_0__1__Impl_in_rule__DeclarePatternRole__Group_0__16295);
            rule__DeclarePatternRole__Group_0__1__Impl();

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
    // $ANTLR end "rule__DeclarePatternRole__Group_0__1"


    // $ANTLR start "rule__DeclarePatternRole__Group_0__1__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3122:1: rule__DeclarePatternRole__Group_0__1__Impl : ( '=' ) ;
    public final void rule__DeclarePatternRole__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3126:1: ( ( '=' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3127:1: ( '=' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3127:1: ( '=' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3128:1: '='
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getEqualsSignKeyword_0_1()); 
            match(input,28,FOLLOW_28_in_rule__DeclarePatternRole__Group_0__1__Impl6323); 
             after(grammarAccess.getDeclarePatternRoleAccess().getEqualsSignKeyword_0_1()); 

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
    // $ANTLR end "rule__DeclarePatternRole__Group_0__1__Impl"


    // $ANTLR start "rule__DeclarePatternRole__Group_1_0__0"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3145:1: rule__DeclarePatternRole__Group_1_0__0 : rule__DeclarePatternRole__Group_1_0__0__Impl rule__DeclarePatternRole__Group_1_0__1 ;
    public final void rule__DeclarePatternRole__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3149:1: ( rule__DeclarePatternRole__Group_1_0__0__Impl rule__DeclarePatternRole__Group_1_0__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3150:2: rule__DeclarePatternRole__Group_1_0__0__Impl rule__DeclarePatternRole__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__Group_1_0__0__Impl_in_rule__DeclarePatternRole__Group_1_0__06358);
            rule__DeclarePatternRole__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclarePatternRole__Group_1_0__1_in_rule__DeclarePatternRole__Group_1_0__06361);
            rule__DeclarePatternRole__Group_1_0__1();

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
    // $ANTLR end "rule__DeclarePatternRole__Group_1_0__0"


    // $ANTLR start "rule__DeclarePatternRole__Group_1_0__0__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3157:1: rule__DeclarePatternRole__Group_1_0__0__Impl : ( 'parameters' ) ;
    public final void rule__DeclarePatternRole__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3161:1: ( ( 'parameters' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3162:1: ( 'parameters' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3162:1: ( 'parameters' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3163:1: 'parameters'
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getParametersKeyword_1_0_0()); 
            match(input,46,FOLLOW_46_in_rule__DeclarePatternRole__Group_1_0__0__Impl6389); 
             after(grammarAccess.getDeclarePatternRoleAccess().getParametersKeyword_1_0_0()); 

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
    // $ANTLR end "rule__DeclarePatternRole__Group_1_0__0__Impl"


    // $ANTLR start "rule__DeclarePatternRole__Group_1_0__1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3176:1: rule__DeclarePatternRole__Group_1_0__1 : rule__DeclarePatternRole__Group_1_0__1__Impl rule__DeclarePatternRole__Group_1_0__2 ;
    public final void rule__DeclarePatternRole__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3180:1: ( rule__DeclarePatternRole__Group_1_0__1__Impl rule__DeclarePatternRole__Group_1_0__2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3181:2: rule__DeclarePatternRole__Group_1_0__1__Impl rule__DeclarePatternRole__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__Group_1_0__1__Impl_in_rule__DeclarePatternRole__Group_1_0__16420);
            rule__DeclarePatternRole__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclarePatternRole__Group_1_0__2_in_rule__DeclarePatternRole__Group_1_0__16423);
            rule__DeclarePatternRole__Group_1_0__2();

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
    // $ANTLR end "rule__DeclarePatternRole__Group_1_0__1"


    // $ANTLR start "rule__DeclarePatternRole__Group_1_0__1__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3188:1: rule__DeclarePatternRole__Group_1_0__1__Impl : ( '.' ) ;
    public final void rule__DeclarePatternRole__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3192:1: ( ( '.' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3193:1: ( '.' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3193:1: ( '.' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3194:1: '.'
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getFullStopKeyword_1_0_1()); 
            match(input,47,FOLLOW_47_in_rule__DeclarePatternRole__Group_1_0__1__Impl6451); 
             after(grammarAccess.getDeclarePatternRoleAccess().getFullStopKeyword_1_0_1()); 

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
    // $ANTLR end "rule__DeclarePatternRole__Group_1_0__1__Impl"


    // $ANTLR start "rule__DeclarePatternRole__Group_1_0__2"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3207:1: rule__DeclarePatternRole__Group_1_0__2 : rule__DeclarePatternRole__Group_1_0__2__Impl rule__DeclarePatternRole__Group_1_0__3 ;
    public final void rule__DeclarePatternRole__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3211:1: ( rule__DeclarePatternRole__Group_1_0__2__Impl rule__DeclarePatternRole__Group_1_0__3 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3212:2: rule__DeclarePatternRole__Group_1_0__2__Impl rule__DeclarePatternRole__Group_1_0__3
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__Group_1_0__2__Impl_in_rule__DeclarePatternRole__Group_1_0__26482);
            rule__DeclarePatternRole__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclarePatternRole__Group_1_0__3_in_rule__DeclarePatternRole__Group_1_0__26485);
            rule__DeclarePatternRole__Group_1_0__3();

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
    // $ANTLR end "rule__DeclarePatternRole__Group_1_0__2"


    // $ANTLR start "rule__DeclarePatternRole__Group_1_0__2__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3219:1: rule__DeclarePatternRole__Group_1_0__2__Impl : ( ( rule__DeclarePatternRole__ParameterAssignment_1_0_2 ) ) ;
    public final void rule__DeclarePatternRole__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3223:1: ( ( ( rule__DeclarePatternRole__ParameterAssignment_1_0_2 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3224:1: ( ( rule__DeclarePatternRole__ParameterAssignment_1_0_2 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3224:1: ( ( rule__DeclarePatternRole__ParameterAssignment_1_0_2 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3225:1: ( rule__DeclarePatternRole__ParameterAssignment_1_0_2 )
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getParameterAssignment_1_0_2()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3226:1: ( rule__DeclarePatternRole__ParameterAssignment_1_0_2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3226:2: rule__DeclarePatternRole__ParameterAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__ParameterAssignment_1_0_2_in_rule__DeclarePatternRole__Group_1_0__2__Impl6512);
            rule__DeclarePatternRole__ParameterAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getDeclarePatternRoleAccess().getParameterAssignment_1_0_2()); 

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
    // $ANTLR end "rule__DeclarePatternRole__Group_1_0__2__Impl"


    // $ANTLR start "rule__DeclarePatternRole__Group_1_0__3"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3236:1: rule__DeclarePatternRole__Group_1_0__3 : rule__DeclarePatternRole__Group_1_0__3__Impl ;
    public final void rule__DeclarePatternRole__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3240:1: ( rule__DeclarePatternRole__Group_1_0__3__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3241:2: rule__DeclarePatternRole__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__Group_1_0__3__Impl_in_rule__DeclarePatternRole__Group_1_0__36542);
            rule__DeclarePatternRole__Group_1_0__3__Impl();

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
    // $ANTLR end "rule__DeclarePatternRole__Group_1_0__3"


    // $ANTLR start "rule__DeclarePatternRole__Group_1_0__3__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3247:1: rule__DeclarePatternRole__Group_1_0__3__Impl : ( ';' ) ;
    public final void rule__DeclarePatternRole__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3251:1: ( ( ';' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3252:1: ( ';' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3252:1: ( ';' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3253:1: ';'
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getSemicolonKeyword_1_0_3()); 
            match(input,36,FOLLOW_36_in_rule__DeclarePatternRole__Group_1_0__3__Impl6570); 
             after(grammarAccess.getDeclarePatternRoleAccess().getSemicolonKeyword_1_0_3()); 

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
    // $ANTLR end "rule__DeclarePatternRole__Group_1_0__3__Impl"


    // $ANTLR start "rule__DeclarePatternRole__Group_1_1__0"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3274:1: rule__DeclarePatternRole__Group_1_1__0 : rule__DeclarePatternRole__Group_1_1__0__Impl rule__DeclarePatternRole__Group_1_1__1 ;
    public final void rule__DeclarePatternRole__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3278:1: ( rule__DeclarePatternRole__Group_1_1__0__Impl rule__DeclarePatternRole__Group_1_1__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3279:2: rule__DeclarePatternRole__Group_1_1__0__Impl rule__DeclarePatternRole__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__Group_1_1__0__Impl_in_rule__DeclarePatternRole__Group_1_1__06609);
            rule__DeclarePatternRole__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclarePatternRole__Group_1_1__1_in_rule__DeclarePatternRole__Group_1_1__06612);
            rule__DeclarePatternRole__Group_1_1__1();

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
    // $ANTLR end "rule__DeclarePatternRole__Group_1_1__0"


    // $ANTLR start "rule__DeclarePatternRole__Group_1_1__0__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3286:1: rule__DeclarePatternRole__Group_1_1__0__Impl : ( ( ( '(' ) ) ( ( '(' )* ) ) ;
    public final void rule__DeclarePatternRole__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3290:1: ( ( ( ( '(' ) ) ( ( '(' )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3291:1: ( ( ( '(' ) ) ( ( '(' )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3291:1: ( ( ( '(' ) ) ( ( '(' )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3292:1: ( ( '(' ) ) ( ( '(' )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3292:1: ( ( '(' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3293:1: ( '(' )
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getLeftParenthesisKeyword_1_1_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3294:1: ( '(' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3295:2: '('
            {
            match(input,42,FOLLOW_42_in_rule__DeclarePatternRole__Group_1_1__0__Impl6643); 

            }

             after(grammarAccess.getDeclarePatternRoleAccess().getLeftParenthesisKeyword_1_1_0()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3299:1: ( ( '(' )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3300:1: ( '(' )*
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getLeftParenthesisKeyword_1_1_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3301:1: ( '(' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==42) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3302:2: '('
            	    {
            	    match(input,42,FOLLOW_42_in_rule__DeclarePatternRole__Group_1_1__0__Impl6659); 

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getDeclarePatternRoleAccess().getLeftParenthesisKeyword_1_1_0()); 

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
    // $ANTLR end "rule__DeclarePatternRole__Group_1_1__0__Impl"


    // $ANTLR start "rule__DeclarePatternRole__Group_1_1__1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3314:1: rule__DeclarePatternRole__Group_1_1__1 : rule__DeclarePatternRole__Group_1_1__1__Impl rule__DeclarePatternRole__Group_1_1__2 ;
    public final void rule__DeclarePatternRole__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3318:1: ( rule__DeclarePatternRole__Group_1_1__1__Impl rule__DeclarePatternRole__Group_1_1__2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3319:2: rule__DeclarePatternRole__Group_1_1__1__Impl rule__DeclarePatternRole__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__Group_1_1__1__Impl_in_rule__DeclarePatternRole__Group_1_1__16694);
            rule__DeclarePatternRole__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclarePatternRole__Group_1_1__2_in_rule__DeclarePatternRole__Group_1_1__16697);
            rule__DeclarePatternRole__Group_1_1__2();

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
    // $ANTLR end "rule__DeclarePatternRole__Group_1_1__1"


    // $ANTLR start "rule__DeclarePatternRole__Group_1_1__1__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3326:1: rule__DeclarePatternRole__Group_1_1__1__Impl : ( ( ( rule__DeclarePatternRole__AddAssignment_1_1_1 ) ) ( ( rule__DeclarePatternRole__AddAssignment_1_1_1 )* ) ) ;
    public final void rule__DeclarePatternRole__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3330:1: ( ( ( ( rule__DeclarePatternRole__AddAssignment_1_1_1 ) ) ( ( rule__DeclarePatternRole__AddAssignment_1_1_1 )* ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3331:1: ( ( ( rule__DeclarePatternRole__AddAssignment_1_1_1 ) ) ( ( rule__DeclarePatternRole__AddAssignment_1_1_1 )* ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3331:1: ( ( ( rule__DeclarePatternRole__AddAssignment_1_1_1 ) ) ( ( rule__DeclarePatternRole__AddAssignment_1_1_1 )* ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3332:1: ( ( rule__DeclarePatternRole__AddAssignment_1_1_1 ) ) ( ( rule__DeclarePatternRole__AddAssignment_1_1_1 )* )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3332:1: ( ( rule__DeclarePatternRole__AddAssignment_1_1_1 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3333:1: ( rule__DeclarePatternRole__AddAssignment_1_1_1 )
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getAddAssignment_1_1_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3334:1: ( rule__DeclarePatternRole__AddAssignment_1_1_1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3334:2: rule__DeclarePatternRole__AddAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__AddAssignment_1_1_1_in_rule__DeclarePatternRole__Group_1_1__1__Impl6726);
            rule__DeclarePatternRole__AddAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarePatternRoleAccess().getAddAssignment_1_1_1()); 

            }

            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3337:1: ( ( rule__DeclarePatternRole__AddAssignment_1_1_1 )* )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3338:1: ( rule__DeclarePatternRole__AddAssignment_1_1_1 )*
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getAddAssignment_1_1_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3339:1: ( rule__DeclarePatternRole__AddAssignment_1_1_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==49) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3339:2: rule__DeclarePatternRole__AddAssignment_1_1_1
            	    {
            	    pushFollow(FOLLOW_rule__DeclarePatternRole__AddAssignment_1_1_1_in_rule__DeclarePatternRole__Group_1_1__1__Impl6738);
            	    rule__DeclarePatternRole__AddAssignment_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getDeclarePatternRoleAccess().getAddAssignment_1_1_1()); 

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
    // $ANTLR end "rule__DeclarePatternRole__Group_1_1__1__Impl"


    // $ANTLR start "rule__DeclarePatternRole__Group_1_1__2"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3350:1: rule__DeclarePatternRole__Group_1_1__2 : rule__DeclarePatternRole__Group_1_1__2__Impl ;
    public final void rule__DeclarePatternRole__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3354:1: ( rule__DeclarePatternRole__Group_1_1__2__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3355:2: rule__DeclarePatternRole__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__DeclarePatternRole__Group_1_1__2__Impl_in_rule__DeclarePatternRole__Group_1_1__26771);
            rule__DeclarePatternRole__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__DeclarePatternRole__Group_1_1__2"


    // $ANTLR start "rule__DeclarePatternRole__Group_1_1__2__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3361:1: rule__DeclarePatternRole__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__DeclarePatternRole__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3365:1: ( ( ')' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3366:1: ( ')' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3366:1: ( ')' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3367:1: ')'
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getRightParenthesisKeyword_1_1_2()); 
            match(input,43,FOLLOW_43_in_rule__DeclarePatternRole__Group_1_1__2__Impl6799); 
             after(grammarAccess.getDeclarePatternRoleAccess().getRightParenthesisKeyword_1_1_2()); 

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
    // $ANTLR end "rule__DeclarePatternRole__Group_1_1__2__Impl"


    // $ANTLR start "rule__DeleteAction__Group__0"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3386:1: rule__DeleteAction__Group__0 : rule__DeleteAction__Group__0__Impl rule__DeleteAction__Group__1 ;
    public final void rule__DeleteAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3390:1: ( rule__DeleteAction__Group__0__Impl rule__DeleteAction__Group__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3391:2: rule__DeleteAction__Group__0__Impl rule__DeleteAction__Group__1
            {
            pushFollow(FOLLOW_rule__DeleteAction__Group__0__Impl_in_rule__DeleteAction__Group__06836);
            rule__DeleteAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeleteAction__Group__1_in_rule__DeleteAction__Group__06839);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3398:1: rule__DeleteAction__Group__0__Impl : ( 'delete' ) ;
    public final void rule__DeleteAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3402:1: ( ( 'delete' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3403:1: ( 'delete' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3403:1: ( 'delete' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3404:1: 'delete'
            {
             before(grammarAccess.getDeleteActionAccess().getDeleteKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__DeleteAction__Group__0__Impl6867); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3417:1: rule__DeleteAction__Group__1 : rule__DeleteAction__Group__1__Impl rule__DeleteAction__Group__2 ;
    public final void rule__DeleteAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3421:1: ( rule__DeleteAction__Group__1__Impl rule__DeleteAction__Group__2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3422:2: rule__DeleteAction__Group__1__Impl rule__DeleteAction__Group__2
            {
            pushFollow(FOLLOW_rule__DeleteAction__Group__1__Impl_in_rule__DeleteAction__Group__16898);
            rule__DeleteAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeleteAction__Group__2_in_rule__DeleteAction__Group__16901);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3429:1: rule__DeleteAction__Group__1__Impl : ( ( rule__DeleteAction__PatternRoleAssignment_1 ) ) ;
    public final void rule__DeleteAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3433:1: ( ( ( rule__DeleteAction__PatternRoleAssignment_1 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3434:1: ( ( rule__DeleteAction__PatternRoleAssignment_1 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3434:1: ( ( rule__DeleteAction__PatternRoleAssignment_1 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3435:1: ( rule__DeleteAction__PatternRoleAssignment_1 )
            {
             before(grammarAccess.getDeleteActionAccess().getPatternRoleAssignment_1()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3436:1: ( rule__DeleteAction__PatternRoleAssignment_1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3436:2: rule__DeleteAction__PatternRoleAssignment_1
            {
            pushFollow(FOLLOW_rule__DeleteAction__PatternRoleAssignment_1_in_rule__DeleteAction__Group__1__Impl6928);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3446:1: rule__DeleteAction__Group__2 : rule__DeleteAction__Group__2__Impl ;
    public final void rule__DeleteAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3450:1: ( rule__DeleteAction__Group__2__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3451:2: rule__DeleteAction__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DeleteAction__Group__2__Impl_in_rule__DeleteAction__Group__26958);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3457:1: rule__DeleteAction__Group__2__Impl : ( ';' ) ;
    public final void rule__DeleteAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3461:1: ( ( ';' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3462:1: ( ';' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3462:1: ( ';' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3463:1: ';'
            {
             before(grammarAccess.getDeleteActionAccess().getSemicolonKeyword_2()); 
            match(input,36,FOLLOW_36_in_rule__DeleteAction__Group__2__Impl6986); 
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


    // $ANTLR start "rule__AddEMFObjectIndividual__Group__0"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3482:1: rule__AddEMFObjectIndividual__Group__0 : rule__AddEMFObjectIndividual__Group__0__Impl rule__AddEMFObjectIndividual__Group__1 ;
    public final void rule__AddEMFObjectIndividual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3486:1: ( rule__AddEMFObjectIndividual__Group__0__Impl rule__AddEMFObjectIndividual__Group__1 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3487:2: rule__AddEMFObjectIndividual__Group__0__Impl rule__AddEMFObjectIndividual__Group__1
            {
            pushFollow(FOLLOW_rule__AddEMFObjectIndividual__Group__0__Impl_in_rule__AddEMFObjectIndividual__Group__07023);
            rule__AddEMFObjectIndividual__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddEMFObjectIndividual__Group__1_in_rule__AddEMFObjectIndividual__Group__07026);
            rule__AddEMFObjectIndividual__Group__1();

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
    // $ANTLR end "rule__AddEMFObjectIndividual__Group__0"


    // $ANTLR start "rule__AddEMFObjectIndividual__Group__0__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3494:1: rule__AddEMFObjectIndividual__Group__0__Impl : ( 'AddEMFObjectIndividual' ) ;
    public final void rule__AddEMFObjectIndividual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3498:1: ( ( 'AddEMFObjectIndividual' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3499:1: ( 'AddEMFObjectIndividual' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3499:1: ( 'AddEMFObjectIndividual' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3500:1: 'AddEMFObjectIndividual'
            {
             before(grammarAccess.getAddEMFObjectIndividualAccess().getAddEMFObjectIndividualKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__AddEMFObjectIndividual__Group__0__Impl7054); 
             after(grammarAccess.getAddEMFObjectIndividualAccess().getAddEMFObjectIndividualKeyword_0()); 

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
    // $ANTLR end "rule__AddEMFObjectIndividual__Group__0__Impl"


    // $ANTLR start "rule__AddEMFObjectIndividual__Group__1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3513:1: rule__AddEMFObjectIndividual__Group__1 : rule__AddEMFObjectIndividual__Group__1__Impl rule__AddEMFObjectIndividual__Group__2 ;
    public final void rule__AddEMFObjectIndividual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3517:1: ( rule__AddEMFObjectIndividual__Group__1__Impl rule__AddEMFObjectIndividual__Group__2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3518:2: rule__AddEMFObjectIndividual__Group__1__Impl rule__AddEMFObjectIndividual__Group__2
            {
            pushFollow(FOLLOW_rule__AddEMFObjectIndividual__Group__1__Impl_in_rule__AddEMFObjectIndividual__Group__17085);
            rule__AddEMFObjectIndividual__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddEMFObjectIndividual__Group__2_in_rule__AddEMFObjectIndividual__Group__17088);
            rule__AddEMFObjectIndividual__Group__2();

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
    // $ANTLR end "rule__AddEMFObjectIndividual__Group__1"


    // $ANTLR start "rule__AddEMFObjectIndividual__Group__1__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3525:1: rule__AddEMFObjectIndividual__Group__1__Impl : ( 'conformTo' ) ;
    public final void rule__AddEMFObjectIndividual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3529:1: ( ( 'conformTo' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3530:1: ( 'conformTo' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3530:1: ( 'conformTo' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3531:1: 'conformTo'
            {
             before(grammarAccess.getAddEMFObjectIndividualAccess().getConformToKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__AddEMFObjectIndividual__Group__1__Impl7116); 
             after(grammarAccess.getAddEMFObjectIndividualAccess().getConformToKeyword_1()); 

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
    // $ANTLR end "rule__AddEMFObjectIndividual__Group__1__Impl"


    // $ANTLR start "rule__AddEMFObjectIndividual__Group__2"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3544:1: rule__AddEMFObjectIndividual__Group__2 : rule__AddEMFObjectIndividual__Group__2__Impl rule__AddEMFObjectIndividual__Group__3 ;
    public final void rule__AddEMFObjectIndividual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3548:1: ( rule__AddEMFObjectIndividual__Group__2__Impl rule__AddEMFObjectIndividual__Group__3 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3549:2: rule__AddEMFObjectIndividual__Group__2__Impl rule__AddEMFObjectIndividual__Group__3
            {
            pushFollow(FOLLOW_rule__AddEMFObjectIndividual__Group__2__Impl_in_rule__AddEMFObjectIndividual__Group__27147);
            rule__AddEMFObjectIndividual__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddEMFObjectIndividual__Group__3_in_rule__AddEMFObjectIndividual__Group__27150);
            rule__AddEMFObjectIndividual__Group__3();

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
    // $ANTLR end "rule__AddEMFObjectIndividual__Group__2"


    // $ANTLR start "rule__AddEMFObjectIndividual__Group__2__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3556:1: rule__AddEMFObjectIndividual__Group__2__Impl : ( ( rule__AddEMFObjectIndividual__EditionPatternAssignment_2 ) ) ;
    public final void rule__AddEMFObjectIndividual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3560:1: ( ( ( rule__AddEMFObjectIndividual__EditionPatternAssignment_2 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3561:1: ( ( rule__AddEMFObjectIndividual__EditionPatternAssignment_2 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3561:1: ( ( rule__AddEMFObjectIndividual__EditionPatternAssignment_2 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3562:1: ( rule__AddEMFObjectIndividual__EditionPatternAssignment_2 )
            {
             before(grammarAccess.getAddEMFObjectIndividualAccess().getEditionPatternAssignment_2()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3563:1: ( rule__AddEMFObjectIndividual__EditionPatternAssignment_2 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3563:2: rule__AddEMFObjectIndividual__EditionPatternAssignment_2
            {
            pushFollow(FOLLOW_rule__AddEMFObjectIndividual__EditionPatternAssignment_2_in_rule__AddEMFObjectIndividual__Group__2__Impl7177);
            rule__AddEMFObjectIndividual__EditionPatternAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAddEMFObjectIndividualAccess().getEditionPatternAssignment_2()); 

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
    // $ANTLR end "rule__AddEMFObjectIndividual__Group__2__Impl"


    // $ANTLR start "rule__AddEMFObjectIndividual__Group__3"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3573:1: rule__AddEMFObjectIndividual__Group__3 : rule__AddEMFObjectIndividual__Group__3__Impl rule__AddEMFObjectIndividual__Group__4 ;
    public final void rule__AddEMFObjectIndividual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3577:1: ( rule__AddEMFObjectIndividual__Group__3__Impl rule__AddEMFObjectIndividual__Group__4 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3578:2: rule__AddEMFObjectIndividual__Group__3__Impl rule__AddEMFObjectIndividual__Group__4
            {
            pushFollow(FOLLOW_rule__AddEMFObjectIndividual__Group__3__Impl_in_rule__AddEMFObjectIndividual__Group__37207);
            rule__AddEMFObjectIndividual__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddEMFObjectIndividual__Group__4_in_rule__AddEMFObjectIndividual__Group__37210);
            rule__AddEMFObjectIndividual__Group__4();

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
    // $ANTLR end "rule__AddEMFObjectIndividual__Group__3"


    // $ANTLR start "rule__AddEMFObjectIndividual__Group__3__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3585:1: rule__AddEMFObjectIndividual__Group__3__Impl : ( 'from' ) ;
    public final void rule__AddEMFObjectIndividual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3589:1: ( ( 'from' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3590:1: ( 'from' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3590:1: ( 'from' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3591:1: 'from'
            {
             before(grammarAccess.getAddEMFObjectIndividualAccess().getFromKeyword_3()); 
            match(input,41,FOLLOW_41_in_rule__AddEMFObjectIndividual__Group__3__Impl7238); 
             after(grammarAccess.getAddEMFObjectIndividualAccess().getFromKeyword_3()); 

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
    // $ANTLR end "rule__AddEMFObjectIndividual__Group__3__Impl"


    // $ANTLR start "rule__AddEMFObjectIndividual__Group__4"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3604:1: rule__AddEMFObjectIndividual__Group__4 : rule__AddEMFObjectIndividual__Group__4__Impl rule__AddEMFObjectIndividual__Group__5 ;
    public final void rule__AddEMFObjectIndividual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3608:1: ( rule__AddEMFObjectIndividual__Group__4__Impl rule__AddEMFObjectIndividual__Group__5 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3609:2: rule__AddEMFObjectIndividual__Group__4__Impl rule__AddEMFObjectIndividual__Group__5
            {
            pushFollow(FOLLOW_rule__AddEMFObjectIndividual__Group__4__Impl_in_rule__AddEMFObjectIndividual__Group__47269);
            rule__AddEMFObjectIndividual__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddEMFObjectIndividual__Group__5_in_rule__AddEMFObjectIndividual__Group__47272);
            rule__AddEMFObjectIndividual__Group__5();

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
    // $ANTLR end "rule__AddEMFObjectIndividual__Group__4"


    // $ANTLR start "rule__AddEMFObjectIndividual__Group__4__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3616:1: rule__AddEMFObjectIndividual__Group__4__Impl : ( ( rule__AddEMFObjectIndividual__ModelSlotAssignment_4 ) ) ;
    public final void rule__AddEMFObjectIndividual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3620:1: ( ( ( rule__AddEMFObjectIndividual__ModelSlotAssignment_4 ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3621:1: ( ( rule__AddEMFObjectIndividual__ModelSlotAssignment_4 ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3621:1: ( ( rule__AddEMFObjectIndividual__ModelSlotAssignment_4 ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3622:1: ( rule__AddEMFObjectIndividual__ModelSlotAssignment_4 )
            {
             before(grammarAccess.getAddEMFObjectIndividualAccess().getModelSlotAssignment_4()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3623:1: ( rule__AddEMFObjectIndividual__ModelSlotAssignment_4 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3623:2: rule__AddEMFObjectIndividual__ModelSlotAssignment_4
            {
            pushFollow(FOLLOW_rule__AddEMFObjectIndividual__ModelSlotAssignment_4_in_rule__AddEMFObjectIndividual__Group__4__Impl7299);
            rule__AddEMFObjectIndividual__ModelSlotAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAddEMFObjectIndividualAccess().getModelSlotAssignment_4()); 

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
    // $ANTLR end "rule__AddEMFObjectIndividual__Group__4__Impl"


    // $ANTLR start "rule__AddEMFObjectIndividual__Group__5"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3633:1: rule__AddEMFObjectIndividual__Group__5 : rule__AddEMFObjectIndividual__Group__5__Impl rule__AddEMFObjectIndividual__Group__6 ;
    public final void rule__AddEMFObjectIndividual__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3637:1: ( rule__AddEMFObjectIndividual__Group__5__Impl rule__AddEMFObjectIndividual__Group__6 )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3638:2: rule__AddEMFObjectIndividual__Group__5__Impl rule__AddEMFObjectIndividual__Group__6
            {
            pushFollow(FOLLOW_rule__AddEMFObjectIndividual__Group__5__Impl_in_rule__AddEMFObjectIndividual__Group__57329);
            rule__AddEMFObjectIndividual__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddEMFObjectIndividual__Group__6_in_rule__AddEMFObjectIndividual__Group__57332);
            rule__AddEMFObjectIndividual__Group__6();

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
    // $ANTLR end "rule__AddEMFObjectIndividual__Group__5"


    // $ANTLR start "rule__AddEMFObjectIndividual__Group__5__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3645:1: rule__AddEMFObjectIndividual__Group__5__Impl : ( '{' ) ;
    public final void rule__AddEMFObjectIndividual__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3649:1: ( ( '{' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3650:1: ( '{' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3650:1: ( '{' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3651:1: '{'
            {
             before(grammarAccess.getAddEMFObjectIndividualAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__AddEMFObjectIndividual__Group__5__Impl7360); 
             after(grammarAccess.getAddEMFObjectIndividualAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__AddEMFObjectIndividual__Group__5__Impl"


    // $ANTLR start "rule__AddEMFObjectIndividual__Group__6"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3664:1: rule__AddEMFObjectIndividual__Group__6 : rule__AddEMFObjectIndividual__Group__6__Impl ;
    public final void rule__AddEMFObjectIndividual__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3668:1: ( rule__AddEMFObjectIndividual__Group__6__Impl )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3669:2: rule__AddEMFObjectIndividual__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__AddEMFObjectIndividual__Group__6__Impl_in_rule__AddEMFObjectIndividual__Group__67391);
            rule__AddEMFObjectIndividual__Group__6__Impl();

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
    // $ANTLR end "rule__AddEMFObjectIndividual__Group__6"


    // $ANTLR start "rule__AddEMFObjectIndividual__Group__6__Impl"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3675:1: rule__AddEMFObjectIndividual__Group__6__Impl : ( '}' ) ;
    public final void rule__AddEMFObjectIndividual__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3679:1: ( ( '}' ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3680:1: ( '}' )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3680:1: ( '}' )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3681:1: '}'
            {
             before(grammarAccess.getAddEMFObjectIndividualAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__AddEMFObjectIndividual__Group__6__Impl7419); 
             after(grammarAccess.getAddEMFObjectIndividualAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__AddEMFObjectIndividual__Group__6__Impl"


    // $ANTLR start "rule__ViewDef__NameAssignment_1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3709:1: rule__ViewDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ViewDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3713:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3714:1: ( RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3714:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3715:1: RULE_ID
            {
             before(grammarAccess.getViewDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ViewDef__NameAssignment_17469); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3724:1: rule__ViewDef__UriAssignment_4 : ( RULE_URISTRING ) ;
    public final void rule__ViewDef__UriAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3728:1: ( ( RULE_URISTRING ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3729:1: ( RULE_URISTRING )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3729:1: ( RULE_URISTRING )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3730:1: RULE_URISTRING
            {
             before(grammarAccess.getViewDefAccess().getUriURISTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_URISTRING,FOLLOW_RULE_URISTRING_in_rule__ViewDef__UriAssignment_47500); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3739:1: rule__ViewDef__ElementsAssignment_6 : ( ruleVirtualModel ) ;
    public final void rule__ViewDef__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3743:1: ( ( ruleVirtualModel ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3744:1: ( ruleVirtualModel )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3744:1: ( ruleVirtualModel )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3745:1: ruleVirtualModel
            {
             before(grammarAccess.getViewDefAccess().getElementsVirtualModelParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleVirtualModel_in_rule__ViewDef__ElementsAssignment_67531);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3754:1: rule__VirtualModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VirtualModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3758:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3759:1: ( RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3759:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3760:1: RULE_ID
            {
             before(grammarAccess.getVirtualModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VirtualModel__NameAssignment_17562); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3769:1: rule__VirtualModel__TypeAssignment_2_2 : ( ruleVMTYPE ) ;
    public final void rule__VirtualModel__TypeAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3773:1: ( ( ruleVMTYPE ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3774:1: ( ruleVMTYPE )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3774:1: ( ruleVMTYPE )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3775:1: ruleVMTYPE
            {
             before(grammarAccess.getVirtualModelAccess().getTypeVMTYPEEnumRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleVMTYPE_in_rule__VirtualModel__TypeAssignment_2_27593);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3784:1: rule__VirtualModel__UriAssignment_5 : ( RULE_URISTRING ) ;
    public final void rule__VirtualModel__UriAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3788:1: ( ( RULE_URISTRING ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3789:1: ( RULE_URISTRING )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3789:1: ( RULE_URISTRING )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3790:1: RULE_URISTRING
            {
             before(grammarAccess.getVirtualModelAccess().getUriURISTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_URISTRING,FOLLOW_RULE_URISTRING_in_rule__VirtualModel__UriAssignment_57624); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3799:1: rule__VirtualModel__ModelSlotsAssignment_7 : ( ruleModelSlot ) ;
    public final void rule__VirtualModel__ModelSlotsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3803:1: ( ( ruleModelSlot ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3804:1: ( ruleModelSlot )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3804:1: ( ruleModelSlot )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3805:1: ruleModelSlot
            {
             before(grammarAccess.getVirtualModelAccess().getModelSlotsModelSlotParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleModelSlot_in_rule__VirtualModel__ModelSlotsAssignment_77655);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3814:1: rule__VirtualModel__EditionPatternsAssignment_8 : ( ruleEditionPattern ) ;
    public final void rule__VirtualModel__EditionPatternsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3818:1: ( ( ruleEditionPattern ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3819:1: ( ruleEditionPattern )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3819:1: ( ruleEditionPattern )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3820:1: ruleEditionPattern
            {
             before(grammarAccess.getVirtualModelAccess().getEditionPatternsEditionPatternParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleEditionPattern_in_rule__VirtualModel__EditionPatternsAssignment_87686);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3829:1: rule__ModelSlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ModelSlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3833:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3834:1: ( RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3834:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3835:1: RULE_ID
            {
             before(grammarAccess.getModelSlotAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModelSlot__NameAssignment_17717); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3844:1: rule__ModelSlot__TypeAssignment_4 : ( ruleMSTYPE ) ;
    public final void rule__ModelSlot__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3848:1: ( ( ruleMSTYPE ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3849:1: ( ruleMSTYPE )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3849:1: ( ruleMSTYPE )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3850:1: ruleMSTYPE
            {
             before(grammarAccess.getModelSlotAccess().getTypeMSTYPEEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMSTYPE_in_rule__ModelSlot__TypeAssignment_47748);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3859:1: rule__ModelSlot__UriAssignment_7 : ( RULE_URISTRING ) ;
    public final void rule__ModelSlot__UriAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3863:1: ( ( RULE_URISTRING ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3864:1: ( RULE_URISTRING )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3864:1: ( RULE_URISTRING )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3865:1: RULE_URISTRING
            {
             before(grammarAccess.getModelSlotAccess().getUriURISTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_URISTRING,FOLLOW_RULE_URISTRING_in_rule__ModelSlot__UriAssignment_77779); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3874:1: rule__ModelSlot__RequiredAssignment_10 : ( RULE_BOOL ) ;
    public final void rule__ModelSlot__RequiredAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3878:1: ( ( RULE_BOOL ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3879:1: ( RULE_BOOL )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3879:1: ( RULE_BOOL )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3880:1: RULE_BOOL
            {
             before(grammarAccess.getModelSlotAccess().getRequiredBOOLTerminalRuleCall_10_0()); 
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__ModelSlot__RequiredAssignment_107810); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3889:1: rule__ModelSlot__ReadOnlyAssignment_13 : ( RULE_BOOL ) ;
    public final void rule__ModelSlot__ReadOnlyAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3893:1: ( ( RULE_BOOL ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3894:1: ( RULE_BOOL )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3894:1: ( RULE_BOOL )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3895:1: RULE_BOOL
            {
             before(grammarAccess.getModelSlotAccess().getReadOnlyBOOLTerminalRuleCall_13_0()); 
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__ModelSlot__ReadOnlyAssignment_137841); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3904:1: rule__EditionPattern__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EditionPattern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3908:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3909:1: ( RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3909:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3910:1: RULE_ID
            {
             before(grammarAccess.getEditionPatternAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EditionPattern__NameAssignment_17872); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3919:1: rule__EditionPattern__SuperEditionPatternAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__EditionPattern__SuperEditionPatternAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3923:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3924:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3924:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3925:1: ( RULE_ID )
            {
             before(grammarAccess.getEditionPatternAccess().getSuperEditionPatternEditionPatternCrossReference_2_1_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3926:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3927:1: RULE_ID
            {
             before(grammarAccess.getEditionPatternAccess().getSuperEditionPatternEditionPatternIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EditionPattern__SuperEditionPatternAssignment_2_17907); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3938:1: rule__EditionPattern__PatternRolesAssignment_4 : ( rulePatternRole ) ;
    public final void rule__EditionPattern__PatternRolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3942:1: ( ( rulePatternRole ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3943:1: ( rulePatternRole )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3943:1: ( rulePatternRole )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3944:1: rulePatternRole
            {
             before(grammarAccess.getEditionPatternAccess().getPatternRolesPatternRoleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePatternRole_in_rule__EditionPattern__PatternRolesAssignment_47942);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3953:1: rule__EditionPattern__EditionSchemesAssignment_5 : ( ruleEditionScheme ) ;
    public final void rule__EditionPattern__EditionSchemesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3957:1: ( ( ruleEditionScheme ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3958:1: ( ruleEditionScheme )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3958:1: ( ruleEditionScheme )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3959:1: ruleEditionScheme
            {
             before(grammarAccess.getEditionPatternAccess().getEditionSchemesEditionSchemeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEditionScheme_in_rule__EditionPattern__EditionSchemesAssignment_57973);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3968:1: rule__PatternRole__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PatternRole__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3972:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3973:1: ( RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3973:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3974:1: RULE_ID
            {
             before(grammarAccess.getPatternRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PatternRole__NameAssignment_18004); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3983:1: rule__PatternRole__TypeAssignment_3 : ( rulePRTYPE ) ;
    public final void rule__PatternRole__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3987:1: ( ( rulePRTYPE ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3988:1: ( rulePRTYPE )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3988:1: ( rulePRTYPE )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3989:1: rulePRTYPE
            {
             before(grammarAccess.getPatternRoleAccess().getTypePRTYPEEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePRTYPE_in_rule__PatternRole__TypeAssignment_38035);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:3998:1: rule__PatternRole__ModelElementAssignment_5 : ( RULE_ID ) ;
    public final void rule__PatternRole__ModelElementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4002:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4003:1: ( RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4003:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4004:1: RULE_ID
            {
             before(grammarAccess.getPatternRoleAccess().getModelElementIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PatternRole__ModelElementAssignment_58066); 
             after(grammarAccess.getPatternRoleAccess().getModelElementIDTerminalRuleCall_5_0()); 

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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4013:1: rule__PatternRole__ModelSlotAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__PatternRole__ModelSlotAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4017:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4018:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4018:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4019:1: ( RULE_ID )
            {
             before(grammarAccess.getPatternRoleAccess().getModelSlotModelSlotCrossReference_7_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4020:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4021:1: RULE_ID
            {
             before(grammarAccess.getPatternRoleAccess().getModelSlotModelSlotIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PatternRole__ModelSlotAssignment_78101); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4032:1: rule__EditionScheme__EditionSchemeTypeAssignment_0 : ( ruleEditionSchemeType ) ;
    public final void rule__EditionScheme__EditionSchemeTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4036:1: ( ( ruleEditionSchemeType ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4037:1: ( ruleEditionSchemeType )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4037:1: ( ruleEditionSchemeType )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4038:1: ruleEditionSchemeType
            {
             before(grammarAccess.getEditionSchemeAccess().getEditionSchemeTypeEditionSchemeTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEditionSchemeType_in_rule__EditionScheme__EditionSchemeTypeAssignment_08136);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4047:1: rule__EditionScheme__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EditionScheme__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4051:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4052:1: ( RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4052:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4053:1: RULE_ID
            {
             before(grammarAccess.getEditionSchemeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EditionScheme__NameAssignment_18167); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4062:1: rule__EditionScheme__ParameterAssignment_3_0 : ( ruleParameter ) ;
    public final void rule__EditionScheme__ParameterAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4066:1: ( ( ruleParameter ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4067:1: ( ruleParameter )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4067:1: ( ruleParameter )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4068:1: ruleParameter
            {
             before(grammarAccess.getEditionSchemeAccess().getParameterParameterParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__EditionScheme__ParameterAssignment_3_08198);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4077:1: rule__EditionScheme__ParameterAssignment_3_1_1 : ( ruleParameter ) ;
    public final void rule__EditionScheme__ParameterAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4081:1: ( ( ruleParameter ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4082:1: ( ruleParameter )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4082:1: ( ruleParameter )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4083:1: ruleParameter
            {
             before(grammarAccess.getEditionSchemeAccess().getParameterParameterParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__EditionScheme__ParameterAssignment_3_1_18229);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4092:1: rule__EditionScheme__EditionActionAssignment_6 : ( ruleEditionAction ) ;
    public final void rule__EditionScheme__EditionActionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4096:1: ( ( ruleEditionAction ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4097:1: ( ruleEditionAction )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4097:1: ( ruleEditionAction )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4098:1: ruleEditionAction
            {
             before(grammarAccess.getEditionSchemeAccess().getEditionActionEditionActionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleEditionAction_in_rule__EditionScheme__EditionActionAssignment_68260);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4107:1: rule__Parameter__WidgetAssignment_0 : ( rulePRTYPE ) ;
    public final void rule__Parameter__WidgetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4111:1: ( ( rulePRTYPE ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4112:1: ( rulePRTYPE )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4112:1: ( rulePRTYPE )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4113:1: rulePRTYPE
            {
             before(grammarAccess.getParameterAccess().getWidgetPRTYPEEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePRTYPE_in_rule__Parameter__WidgetAssignment_08291);
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4122:1: rule__Parameter__EditionPatternAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__EditionPatternAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4126:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4127:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4127:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4128:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getEditionPatternEditionPatternCrossReference_2_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4129:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4130:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getEditionPatternEditionPatternIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__EditionPatternAssignment_28326); 
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
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4141:1: rule__Parameter__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4145:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4146:1: ( RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4146:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4147:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_38361); 
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


    // $ANTLR start "rule__DeclarePatternRole__PatternRoleAssignment_0_0"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4156:1: rule__DeclarePatternRole__PatternRoleAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__DeclarePatternRole__PatternRoleAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4160:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4161:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4161:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4162:1: ( RULE_ID )
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getPatternRolePatternRoleCrossReference_0_0_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4163:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4164:1: RULE_ID
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getPatternRolePatternRoleIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeclarePatternRole__PatternRoleAssignment_0_08396); 
             after(grammarAccess.getDeclarePatternRoleAccess().getPatternRolePatternRoleIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getDeclarePatternRoleAccess().getPatternRolePatternRoleCrossReference_0_0_0()); 

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
    // $ANTLR end "rule__DeclarePatternRole__PatternRoleAssignment_0_0"


    // $ANTLR start "rule__DeclarePatternRole__ParameterAssignment_1_0_2"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4175:1: rule__DeclarePatternRole__ParameterAssignment_1_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__DeclarePatternRole__ParameterAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4179:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4180:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4180:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4181:1: ( RULE_ID )
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getParameterParameterCrossReference_1_0_2_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4182:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4183:1: RULE_ID
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getParameterParameterIDTerminalRuleCall_1_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeclarePatternRole__ParameterAssignment_1_0_28435); 
             after(grammarAccess.getDeclarePatternRoleAccess().getParameterParameterIDTerminalRuleCall_1_0_2_0_1()); 

            }

             after(grammarAccess.getDeclarePatternRoleAccess().getParameterParameterCrossReference_1_0_2_0()); 

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
    // $ANTLR end "rule__DeclarePatternRole__ParameterAssignment_1_0_2"


    // $ANTLR start "rule__DeclarePatternRole__AddAssignment_1_1_1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4194:1: rule__DeclarePatternRole__AddAssignment_1_1_1 : ( ruleAddEMFObjectIndividual ) ;
    public final void rule__DeclarePatternRole__AddAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4198:1: ( ( ruleAddEMFObjectIndividual ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4199:1: ( ruleAddEMFObjectIndividual )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4199:1: ( ruleAddEMFObjectIndividual )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4200:1: ruleAddEMFObjectIndividual
            {
             before(grammarAccess.getDeclarePatternRoleAccess().getAddAddEMFObjectIndividualParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleAddEMFObjectIndividual_in_rule__DeclarePatternRole__AddAssignment_1_1_18470);
            ruleAddEMFObjectIndividual();

            state._fsp--;

             after(grammarAccess.getDeclarePatternRoleAccess().getAddAddEMFObjectIndividualParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__DeclarePatternRole__AddAssignment_1_1_1"


    // $ANTLR start "rule__DeleteAction__PatternRoleAssignment_1"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4209:1: rule__DeleteAction__PatternRoleAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DeleteAction__PatternRoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4213:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4214:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4214:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4215:1: ( RULE_ID )
            {
             before(grammarAccess.getDeleteActionAccess().getPatternRolePatternRoleCrossReference_1_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4216:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4217:1: RULE_ID
            {
             before(grammarAccess.getDeleteActionAccess().getPatternRolePatternRoleIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeleteAction__PatternRoleAssignment_18505); 
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


    // $ANTLR start "rule__AddEMFObjectIndividual__EditionPatternAssignment_2"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4228:1: rule__AddEMFObjectIndividual__EditionPatternAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AddEMFObjectIndividual__EditionPatternAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4232:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4233:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4233:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4234:1: ( RULE_ID )
            {
             before(grammarAccess.getAddEMFObjectIndividualAccess().getEditionPatternEditionPatternCrossReference_2_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4235:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4236:1: RULE_ID
            {
             before(grammarAccess.getAddEMFObjectIndividualAccess().getEditionPatternEditionPatternIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddEMFObjectIndividual__EditionPatternAssignment_28544); 
             after(grammarAccess.getAddEMFObjectIndividualAccess().getEditionPatternEditionPatternIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAddEMFObjectIndividualAccess().getEditionPatternEditionPatternCrossReference_2_0()); 

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
    // $ANTLR end "rule__AddEMFObjectIndividual__EditionPatternAssignment_2"


    // $ANTLR start "rule__AddEMFObjectIndividual__ModelSlotAssignment_4"
    // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4247:1: rule__AddEMFObjectIndividual__ModelSlotAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__AddEMFObjectIndividual__ModelSlotAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4251:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4252:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4252:1: ( ( RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4253:1: ( RULE_ID )
            {
             before(grammarAccess.getAddEMFObjectIndividualAccess().getModelSlotModelSlotCrossReference_4_0()); 
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4254:1: ( RULE_ID )
            // ../org.xtext.example.FlexoLanguage.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalFML.g:4255:1: RULE_ID
            {
             before(grammarAccess.getAddEMFObjectIndividualAccess().getModelSlotModelSlotIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddEMFObjectIndividual__ModelSlotAssignment_48583); 
             after(grammarAccess.getAddEMFObjectIndividualAccess().getModelSlotModelSlotIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAddEMFObjectIndividualAccess().getModelSlotModelSlotCrossReference_4_0()); 

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
    // $ANTLR end "rule__AddEMFObjectIndividual__ModelSlotAssignment_4"

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
    public static final BitSet FOLLOW_ruleAddEMFObjectIndividual_in_entryRuleAddEMFObjectIndividual720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddEMFObjectIndividual727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddEMFObjectIndividual__Group__0_in_ruleAddEMFObjectIndividual753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionSchemeType__Alternatives_in_ruleEditionSchemeType790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MSTYPE__Alternatives_in_ruleMSTYPE826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VMTYPE__Alternatives_in_ruleVMTYPE862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePRTYPE899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarePatternRole_in_rule__BuiltInAction__Alternatives936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteAction_in_rule__BuiltInAction__Alternatives953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddEMFObjectIndividual_in_rule__BuiltInAction__Alternatives970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group_1_0__0_in_rule__DeclarePatternRole__Alternatives_11002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group_1_1__0_in_rule__DeclarePatternRole__Alternatives_11020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EditionSchemeType__Alternatives1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EditionSchemeType__Alternatives1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EditionSchemeType__Alternatives1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EditionSchemeType__Alternatives1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MSTYPE__Alternatives1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MSTYPE__Alternatives1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MSTYPE__Alternatives1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MSTYPE__Alternatives1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MSTYPE__Alternatives1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__VMTYPE__Alternatives1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__VMTYPE__Alternatives1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__0__Impl_in_rule__ViewDef__Group__01327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__1_in_rule__ViewDef__Group__01330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ViewDef__Group__0__Impl1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__1__Impl_in_rule__ViewDef__Group__11389 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__2_in_rule__ViewDef__Group__11392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDef__NameAssignment_1_in_rule__ViewDef__Group__1__Impl1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__2__Impl_in_rule__ViewDef__Group__21449 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__3_in_rule__ViewDef__Group__21452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ViewDef__Group__2__Impl1483 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_rule__ViewDef__Group__2__Impl1499 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__3__Impl_in_rule__ViewDef__Group__31534 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__4_in_rule__ViewDef__Group__31537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ViewDef__Group__3__Impl1568 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_rule__ViewDef__Group__3__Impl1584 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__4__Impl_in_rule__ViewDef__Group__41619 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__5_in_rule__ViewDef__Group__41622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDef__UriAssignment_4_in_rule__ViewDef__Group__4__Impl1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__5__Impl_in_rule__ViewDef__Group__51679 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__6_in_rule__ViewDef__Group__51682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ViewDef__Group__5__Impl1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__6__Impl_in_rule__ViewDef__Group__61741 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__7_in_rule__ViewDef__Group__61744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDef__ElementsAssignment_6_in_rule__ViewDef__Group__6__Impl1771 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__ViewDef__Group__7__Impl_in_rule__ViewDef__Group__71802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ViewDef__Group__7__Impl1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__0__Impl_in_rule__VirtualModel__Group__01877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__1_in_rule__VirtualModel__Group__01880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__VirtualModel__Group__0__Impl1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__1__Impl_in_rule__VirtualModel__Group__11939 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__2_in_rule__VirtualModel__Group__11942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__NameAssignment_1_in_rule__VirtualModel__Group__1__Impl1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__2__Impl_in_rule__VirtualModel__Group__21999 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__3_in_rule__VirtualModel__Group__22002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group_2__0_in_rule__VirtualModel__Group__2__Impl2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__3__Impl_in_rule__VirtualModel__Group__32060 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__4_in_rule__VirtualModel__Group__32063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__VirtualModel__Group__3__Impl2094 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_rule__VirtualModel__Group__3__Impl2110 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__4__Impl_in_rule__VirtualModel__Group__42145 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__5_in_rule__VirtualModel__Group__42148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__VirtualModel__Group__4__Impl2179 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_rule__VirtualModel__Group__4__Impl2195 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__5__Impl_in_rule__VirtualModel__Group__52230 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__6_in_rule__VirtualModel__Group__52233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__UriAssignment_5_in_rule__VirtualModel__Group__5__Impl2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__6__Impl_in_rule__VirtualModel__Group__62290 = new BitSet(new long[]{0x0000002140000000L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__7_in_rule__VirtualModel__Group__62293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__VirtualModel__Group__6__Impl2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__7__Impl_in_rule__VirtualModel__Group__72352 = new BitSet(new long[]{0x0000002140000000L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__8_in_rule__VirtualModel__Group__72355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__ModelSlotsAssignment_7_in_rule__VirtualModel__Group__7__Impl2382 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__8__Impl_in_rule__VirtualModel__Group__82413 = new BitSet(new long[]{0x0000002140000000L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__9_in_rule__VirtualModel__Group__82416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__EditionPatternsAssignment_8_in_rule__VirtualModel__Group__8__Impl2443 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group__9__Impl_in_rule__VirtualModel__Group__92474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__VirtualModel__Group__9__Impl2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group_2__0__Impl_in_rule__VirtualModel__Group_2__02553 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group_2__1_in_rule__VirtualModel__Group_2__02556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__VirtualModel__Group_2__0__Impl2587 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_rule__VirtualModel__Group_2__0__Impl2603 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group_2__1__Impl_in_rule__VirtualModel__Group_2__12638 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group_2__2_in_rule__VirtualModel__Group_2__12641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__VirtualModel__Group_2__1__Impl2672 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_rule__VirtualModel__Group_2__1__Impl2688 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__Group_2__2__Impl_in_rule__VirtualModel__Group_2__22723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VirtualModel__TypeAssignment_2_2_in_rule__VirtualModel__Group_2__2__Impl2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__0__Impl_in_rule__ModelSlot__Group__02786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__1_in_rule__ModelSlot__Group__02789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ModelSlot__Group__0__Impl2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__1__Impl_in_rule__ModelSlot__Group__12848 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__2_in_rule__ModelSlot__Group__12851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__NameAssignment_1_in_rule__ModelSlot__Group__1__Impl2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__2__Impl_in_rule__ModelSlot__Group__22908 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__3_in_rule__ModelSlot__Group__22911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ModelSlot__Group__2__Impl2942 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_rule__ModelSlot__Group__2__Impl2958 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__3__Impl_in_rule__ModelSlot__Group__32993 = new BitSet(new long[]{0x0000000000F80000L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__4_in_rule__ModelSlot__Group__32996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ModelSlot__Group__3__Impl3027 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_rule__ModelSlot__Group__3__Impl3043 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__4__Impl_in_rule__ModelSlot__Group__43078 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__5_in_rule__ModelSlot__Group__43081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__TypeAssignment_4_in_rule__ModelSlot__Group__4__Impl3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__5__Impl_in_rule__ModelSlot__Group__53138 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__6_in_rule__ModelSlot__Group__53141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ModelSlot__Group__5__Impl3172 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_rule__ModelSlot__Group__5__Impl3188 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__6__Impl_in_rule__ModelSlot__Group__63223 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__7_in_rule__ModelSlot__Group__63226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ModelSlot__Group__6__Impl3257 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_rule__ModelSlot__Group__6__Impl3273 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__7__Impl_in_rule__ModelSlot__Group__73308 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__8_in_rule__ModelSlot__Group__73311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__UriAssignment_7_in_rule__ModelSlot__Group__7__Impl3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__8__Impl_in_rule__ModelSlot__Group__83368 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__9_in_rule__ModelSlot__Group__83371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ModelSlot__Group__8__Impl3402 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_rule__ModelSlot__Group__8__Impl3418 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__9__Impl_in_rule__ModelSlot__Group__93453 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__10_in_rule__ModelSlot__Group__93456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ModelSlot__Group__9__Impl3487 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_rule__ModelSlot__Group__9__Impl3503 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__10__Impl_in_rule__ModelSlot__Group__103538 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__11_in_rule__ModelSlot__Group__103541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__RequiredAssignment_10_in_rule__ModelSlot__Group__10__Impl3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__11__Impl_in_rule__ModelSlot__Group__113598 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__12_in_rule__ModelSlot__Group__113601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ModelSlot__Group__11__Impl3632 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_rule__ModelSlot__Group__11__Impl3648 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__12__Impl_in_rule__ModelSlot__Group__123683 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__13_in_rule__ModelSlot__Group__123686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ModelSlot__Group__12__Impl3717 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_rule__ModelSlot__Group__12__Impl3733 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__13__Impl_in_rule__ModelSlot__Group__133768 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__14_in_rule__ModelSlot__Group__133771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__ReadOnlyAssignment_13_in_rule__ModelSlot__Group__13__Impl3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSlot__Group__14__Impl_in_rule__ModelSlot__Group__143828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ModelSlot__Group__14__Impl3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__0__Impl_in_rule__EditionPattern__Group__03917 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__1_in_rule__EditionPattern__Group__03920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EditionPattern__Group__0__Impl3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__1__Impl_in_rule__EditionPattern__Group__13979 = new BitSet(new long[]{0x0000004020000000L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__2_in_rule__EditionPattern__Group__13982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__NameAssignment_1_in_rule__EditionPattern__Group__1__Impl4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__2__Impl_in_rule__EditionPattern__Group__24039 = new BitSet(new long[]{0x0000004020000000L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__3_in_rule__EditionPattern__Group__24042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group_2__0_in_rule__EditionPattern__Group__2__Impl4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__3__Impl_in_rule__EditionPattern__Group__34100 = new BitSet(new long[]{0x0000008040078000L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__4_in_rule__EditionPattern__Group__34103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EditionPattern__Group__3__Impl4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__4__Impl_in_rule__EditionPattern__Group__44162 = new BitSet(new long[]{0x0000008040078000L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__5_in_rule__EditionPattern__Group__44165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__PatternRolesAssignment_4_in_rule__EditionPattern__Group__4__Impl4192 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__5__Impl_in_rule__EditionPattern__Group__54223 = new BitSet(new long[]{0x0000008040078000L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__6_in_rule__EditionPattern__Group__54226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__EditionSchemesAssignment_5_in_rule__EditionPattern__Group__5__Impl4253 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group__6__Impl_in_rule__EditionPattern__Group__64284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EditionPattern__Group__6__Impl4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group_2__0__Impl_in_rule__EditionPattern__Group_2__04357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group_2__1_in_rule__EditionPattern__Group_2__04360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EditionPattern__Group_2__0__Impl4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__Group_2__1__Impl_in_rule__EditionPattern__Group_2__14419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionPattern__SuperEditionPatternAssignment_2_1_in_rule__EditionPattern__Group_2__1__Impl4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__0__Impl_in_rule__PatternRole__Group__04480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__1_in_rule__PatternRole__Group__04483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__PatternRole__Group__0__Impl4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__1__Impl_in_rule__PatternRole__Group__14542 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__2_in_rule__PatternRole__Group__14545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__NameAssignment_1_in_rule__PatternRole__Group__1__Impl4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__2__Impl_in_rule__PatternRole__Group__24602 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__3_in_rule__PatternRole__Group__24605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__PatternRole__Group__2__Impl4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__3__Impl_in_rule__PatternRole__Group__34664 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__4_in_rule__PatternRole__Group__34667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__TypeAssignment_3_in_rule__PatternRole__Group__3__Impl4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__4__Impl_in_rule__PatternRole__Group__44724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__5_in_rule__PatternRole__Group__44727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PatternRole__Group__4__Impl4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__5__Impl_in_rule__PatternRole__Group__54786 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__6_in_rule__PatternRole__Group__54789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__ModelElementAssignment_5_in_rule__PatternRole__Group__5__Impl4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__6__Impl_in_rule__PatternRole__Group__64846 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__7_in_rule__PatternRole__Group__64849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__PatternRole__Group__6__Impl4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__7__Impl_in_rule__PatternRole__Group__74908 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__8_in_rule__PatternRole__Group__74911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__ModelSlotAssignment_7_in_rule__PatternRole__Group__7__Impl4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternRole__Group__8__Impl_in_rule__PatternRole__Group__84968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__PatternRole__Group__8__Impl4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__0__Impl_in_rule__EditionScheme__Group__05045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__1_in_rule__EditionScheme__Group__05048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__EditionSchemeTypeAssignment_0_in_rule__EditionScheme__Group__0__Impl5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__1__Impl_in_rule__EditionScheme__Group__15105 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__2_in_rule__EditionScheme__Group__15108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__NameAssignment_1_in_rule__EditionScheme__Group__1__Impl5135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__2__Impl_in_rule__EditionScheme__Group__25165 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__3_in_rule__EditionScheme__Group__25168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EditionScheme__Group__2__Impl5196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__3__Impl_in_rule__EditionScheme__Group__35227 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__4_in_rule__EditionScheme__Group__35230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group_3__0_in_rule__EditionScheme__Group__3__Impl5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__4__Impl_in_rule__EditionScheme__Group__45288 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__5_in_rule__EditionScheme__Group__45291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__EditionScheme__Group__4__Impl5319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__5__Impl_in_rule__EditionScheme__Group__55350 = new BitSet(new long[]{0x0003000040000010L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__6_in_rule__EditionScheme__Group__55353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EditionScheme__Group__5__Impl5381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__6__Impl_in_rule__EditionScheme__Group__65412 = new BitSet(new long[]{0x0003000040000010L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__7_in_rule__EditionScheme__Group__65415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__EditionActionAssignment_6_in_rule__EditionScheme__Group__6__Impl5442 = new BitSet(new long[]{0x0003000000000012L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group__7__Impl_in_rule__EditionScheme__Group__75473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EditionScheme__Group__7__Impl5501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group_3__0__Impl_in_rule__EditionScheme__Group_3__05548 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group_3__1_in_rule__EditionScheme__Group_3__05551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__ParameterAssignment_3_0_in_rule__EditionScheme__Group_3__0__Impl5580 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__EditionScheme__ParameterAssignment_3_0_in_rule__EditionScheme__Group_3__0__Impl5592 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group_3__1__Impl_in_rule__EditionScheme__Group_3__15625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group_3_1__0_in_rule__EditionScheme__Group_3__1__Impl5652 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group_3_1__0__Impl_in_rule__EditionScheme__Group_3_1__05687 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group_3_1__1_in_rule__EditionScheme__Group_3_1__05690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__EditionScheme__Group_3_1__0__Impl5721 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_rule__EditionScheme__Group_3_1__0__Impl5737 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__Group_3_1__1__Impl_in_rule__EditionScheme__Group_3_1__15772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionScheme__ParameterAssignment_3_1_1_in_rule__EditionScheme__Group_3_1__1__Impl5799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__05833 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__05836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__WidgetAssignment_0_in_rule__Parameter__Group__0__Impl5863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__15893 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__15896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Parameter__Group__1__Impl5924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__25955 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__25958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__EditionPatternAssignment_2_in_rule__Parameter__Group__2__Impl5985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__36015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_3_in_rule__Parameter__Group__3__Impl6042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group__0__Impl_in_rule__DeclarePatternRole__Group__06080 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group__1_in_rule__DeclarePatternRole__Group__06083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group_0__0_in_rule__DeclarePatternRole__Group__0__Impl6112 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group_0__0_in_rule__DeclarePatternRole__Group__0__Impl6124 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group__1__Impl_in_rule__DeclarePatternRole__Group__16157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Alternatives_1_in_rule__DeclarePatternRole__Group__1__Impl6184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group_0__0__Impl_in_rule__DeclarePatternRole__Group_0__06218 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group_0__1_in_rule__DeclarePatternRole__Group_0__06221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__PatternRoleAssignment_0_0_in_rule__DeclarePatternRole__Group_0__0__Impl6250 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__PatternRoleAssignment_0_0_in_rule__DeclarePatternRole__Group_0__0__Impl6262 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group_0__1__Impl_in_rule__DeclarePatternRole__Group_0__16295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DeclarePatternRole__Group_0__1__Impl6323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group_1_0__0__Impl_in_rule__DeclarePatternRole__Group_1_0__06358 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group_1_0__1_in_rule__DeclarePatternRole__Group_1_0__06361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__DeclarePatternRole__Group_1_0__0__Impl6389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group_1_0__1__Impl_in_rule__DeclarePatternRole__Group_1_0__16420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group_1_0__2_in_rule__DeclarePatternRole__Group_1_0__16423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__DeclarePatternRole__Group_1_0__1__Impl6451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group_1_0__2__Impl_in_rule__DeclarePatternRole__Group_1_0__26482 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group_1_0__3_in_rule__DeclarePatternRole__Group_1_0__26485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__ParameterAssignment_1_0_2_in_rule__DeclarePatternRole__Group_1_0__2__Impl6512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group_1_0__3__Impl_in_rule__DeclarePatternRole__Group_1_0__36542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__DeclarePatternRole__Group_1_0__3__Impl6570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group_1_1__0__Impl_in_rule__DeclarePatternRole__Group_1_1__06609 = new BitSet(new long[]{0x0003000000000010L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group_1_1__1_in_rule__DeclarePatternRole__Group_1_1__06612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__DeclarePatternRole__Group_1_1__0__Impl6643 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_rule__DeclarePatternRole__Group_1_1__0__Impl6659 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group_1_1__1__Impl_in_rule__DeclarePatternRole__Group_1_1__16694 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group_1_1__2_in_rule__DeclarePatternRole__Group_1_1__16697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__AddAssignment_1_1_1_in_rule__DeclarePatternRole__Group_1_1__1__Impl6726 = new BitSet(new long[]{0x0003000000000012L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__AddAssignment_1_1_1_in_rule__DeclarePatternRole__Group_1_1__1__Impl6738 = new BitSet(new long[]{0x0003000000000012L});
    public static final BitSet FOLLOW_rule__DeclarePatternRole__Group_1_1__2__Impl_in_rule__DeclarePatternRole__Group_1_1__26771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__DeclarePatternRole__Group_1_1__2__Impl6799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteAction__Group__0__Impl_in_rule__DeleteAction__Group__06836 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DeleteAction__Group__1_in_rule__DeleteAction__Group__06839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__DeleteAction__Group__0__Impl6867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteAction__Group__1__Impl_in_rule__DeleteAction__Group__16898 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__DeleteAction__Group__2_in_rule__DeleteAction__Group__16901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteAction__PatternRoleAssignment_1_in_rule__DeleteAction__Group__1__Impl6928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteAction__Group__2__Impl_in_rule__DeleteAction__Group__26958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__DeleteAction__Group__2__Impl6986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddEMFObjectIndividual__Group__0__Impl_in_rule__AddEMFObjectIndividual__Group__07023 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__AddEMFObjectIndividual__Group__1_in_rule__AddEMFObjectIndividual__Group__07026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__AddEMFObjectIndividual__Group__0__Impl7054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddEMFObjectIndividual__Group__1__Impl_in_rule__AddEMFObjectIndividual__Group__17085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AddEMFObjectIndividual__Group__2_in_rule__AddEMFObjectIndividual__Group__17088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__AddEMFObjectIndividual__Group__1__Impl7116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddEMFObjectIndividual__Group__2__Impl_in_rule__AddEMFObjectIndividual__Group__27147 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__AddEMFObjectIndividual__Group__3_in_rule__AddEMFObjectIndividual__Group__27150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddEMFObjectIndividual__EditionPatternAssignment_2_in_rule__AddEMFObjectIndividual__Group__2__Impl7177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddEMFObjectIndividual__Group__3__Impl_in_rule__AddEMFObjectIndividual__Group__37207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AddEMFObjectIndividual__Group__4_in_rule__AddEMFObjectIndividual__Group__37210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__AddEMFObjectIndividual__Group__3__Impl7238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddEMFObjectIndividual__Group__4__Impl_in_rule__AddEMFObjectIndividual__Group__47269 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__AddEMFObjectIndividual__Group__5_in_rule__AddEMFObjectIndividual__Group__47272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddEMFObjectIndividual__ModelSlotAssignment_4_in_rule__AddEMFObjectIndividual__Group__4__Impl7299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddEMFObjectIndividual__Group__5__Impl_in_rule__AddEMFObjectIndividual__Group__57329 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__AddEMFObjectIndividual__Group__6_in_rule__AddEMFObjectIndividual__Group__57332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__AddEMFObjectIndividual__Group__5__Impl7360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddEMFObjectIndividual__Group__6__Impl_in_rule__AddEMFObjectIndividual__Group__67391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AddEMFObjectIndividual__Group__6__Impl7419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ViewDef__NameAssignment_17469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URISTRING_in_rule__ViewDef__UriAssignment_47500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVirtualModel_in_rule__ViewDef__ElementsAssignment_67531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VirtualModel__NameAssignment_17562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVMTYPE_in_rule__VirtualModel__TypeAssignment_2_27593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URISTRING_in_rule__VirtualModel__UriAssignment_57624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelSlot_in_rule__VirtualModel__ModelSlotsAssignment_77655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditionPattern_in_rule__VirtualModel__EditionPatternsAssignment_87686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModelSlot__NameAssignment_17717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMSTYPE_in_rule__ModelSlot__TypeAssignment_47748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URISTRING_in_rule__ModelSlot__UriAssignment_77779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__ModelSlot__RequiredAssignment_107810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__ModelSlot__ReadOnlyAssignment_137841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EditionPattern__NameAssignment_17872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EditionPattern__SuperEditionPatternAssignment_2_17907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternRole_in_rule__EditionPattern__PatternRolesAssignment_47942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditionScheme_in_rule__EditionPattern__EditionSchemesAssignment_57973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PatternRole__NameAssignment_18004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePRTYPE_in_rule__PatternRole__TypeAssignment_38035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PatternRole__ModelElementAssignment_58066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PatternRole__ModelSlotAssignment_78101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditionSchemeType_in_rule__EditionScheme__EditionSchemeTypeAssignment_08136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EditionScheme__NameAssignment_18167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__EditionScheme__ParameterAssignment_3_08198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__EditionScheme__ParameterAssignment_3_1_18229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditionAction_in_rule__EditionScheme__EditionActionAssignment_68260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePRTYPE_in_rule__Parameter__WidgetAssignment_08291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__EditionPatternAssignment_28326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_38361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeclarePatternRole__PatternRoleAssignment_0_08396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeclarePatternRole__ParameterAssignment_1_0_28435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddEMFObjectIndividual_in_rule__DeclarePatternRole__AddAssignment_1_1_18470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeleteAction__PatternRoleAssignment_18505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddEMFObjectIndividual__EditionPatternAssignment_28544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddEMFObjectIndividual__ModelSlotAssignment_48583 = new BitSet(new long[]{0x0000000000000002L});

}