package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.FMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_URISTRING", "RULE_BOOL", "RULE_URI", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ViewDefinition'", "'uri'", "'='", "'{'", "'}'", "'VirtualModel'", "'type'", "'ModelSlot'", "'conformTo'", "'required'", "'readOnly'", "';'", "'EditionPattern'", "'extends'", "'PatternRole'", "'as'", "'from'", "'('", "','", "')'", "':'", "'parameters'", "'.'", "'delete'", "'AddEMFObjectIndividual'", "'CreationScheme'", "'DeletionScheme'", "'ActionScheme'", "'CloningScheme'", "'OWLModelSlot'", "'DiagramModelSlot'", "'EMFModelSlot'", "'VirtualModelModelSlot'", "'XSDModelSlot'", "'DiagramSpecification'", "'Individual'"
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
    public String getGrammarFileName() { return "../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g"; }



     	private FMLGrammarAccess grammarAccess;
     	
        public InternalFMLParser(TokenStream input, FMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ViewDef";	
       	}
       	
       	@Override
       	protected FMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleViewDef"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:68:1: entryRuleViewDef returns [EObject current=null] : iv_ruleViewDef= ruleViewDef EOF ;
    public final EObject entryRuleViewDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewDef = null;


        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:69:2: (iv_ruleViewDef= ruleViewDef EOF )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:70:2: iv_ruleViewDef= ruleViewDef EOF
            {
             newCompositeNode(grammarAccess.getViewDefRule()); 
            pushFollow(FOLLOW_ruleViewDef_in_entryRuleViewDef75);
            iv_ruleViewDef=ruleViewDef();

            state._fsp--;

             current =iv_ruleViewDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewDef85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewDef"


    // $ANTLR start "ruleViewDef"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:77:1: ruleViewDef returns [EObject current=null] : (otherlv_0= 'ViewDefinition' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uri' )+ (otherlv_3= '=' )+ ( (lv_uri_4_0= RULE_URISTRING ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleVirtualModel ) )* otherlv_7= '}' ) ;
    public final EObject ruleViewDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_uri_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_elements_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:80:28: ( (otherlv_0= 'ViewDefinition' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uri' )+ (otherlv_3= '=' )+ ( (lv_uri_4_0= RULE_URISTRING ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleVirtualModel ) )* otherlv_7= '}' ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:81:1: (otherlv_0= 'ViewDefinition' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uri' )+ (otherlv_3= '=' )+ ( (lv_uri_4_0= RULE_URISTRING ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleVirtualModel ) )* otherlv_7= '}' )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:81:1: (otherlv_0= 'ViewDefinition' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uri' )+ (otherlv_3= '=' )+ ( (lv_uri_4_0= RULE_URISTRING ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleVirtualModel ) )* otherlv_7= '}' )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:81:3: otherlv_0= 'ViewDefinition' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uri' )+ (otherlv_3= '=' )+ ( (lv_uri_4_0= RULE_URISTRING ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleVirtualModel ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleViewDef122); 

                	newLeafNode(otherlv_0, grammarAccess.getViewDefAccess().getViewDefinitionKeyword_0());
                
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:85:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:86:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:86:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:87:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleViewDef139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getViewDefAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getViewDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:103:2: (otherlv_2= 'uri' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:103:4: otherlv_2= 'uri'
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleViewDef157); 

            	        	newLeafNode(otherlv_2, grammarAccess.getViewDefAccess().getUriKeyword_2());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:107:3: (otherlv_3= '=' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:107:5: otherlv_3= '='
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleViewDef172); 

            	        	newLeafNode(otherlv_3, grammarAccess.getViewDefAccess().getEqualsSignKeyword_3());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:111:3: ( (lv_uri_4_0= RULE_URISTRING ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:112:1: (lv_uri_4_0= RULE_URISTRING )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:112:1: (lv_uri_4_0= RULE_URISTRING )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:113:3: lv_uri_4_0= RULE_URISTRING
            {
            lv_uri_4_0=(Token)match(input,RULE_URISTRING,FOLLOW_RULE_URISTRING_in_ruleViewDef191); 

            			newLeafNode(lv_uri_4_0, grammarAccess.getViewDefAccess().getUriURISTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getViewDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"uri",
                    		lv_uri_4_0, 
                    		"URISTRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleViewDef208); 

                	newLeafNode(otherlv_5, grammarAccess.getViewDefAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:133:1: ( (lv_elements_6_0= ruleVirtualModel ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:134:1: (lv_elements_6_0= ruleVirtualModel )
            	    {
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:134:1: (lv_elements_6_0= ruleVirtualModel )
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:135:3: lv_elements_6_0= ruleVirtualModel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getViewDefAccess().getElementsVirtualModelParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVirtualModel_in_ruleViewDef229);
            	    lv_elements_6_0=ruleVirtualModel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getViewDefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_6_0, 
            	            		"VirtualModel");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleViewDef242); 

                	newLeafNode(otherlv_7, grammarAccess.getViewDefAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewDef"


    // $ANTLR start "entryRuleVirtualModel"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:163:1: entryRuleVirtualModel returns [EObject current=null] : iv_ruleVirtualModel= ruleVirtualModel EOF ;
    public final EObject entryRuleVirtualModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVirtualModel = null;


        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:164:2: (iv_ruleVirtualModel= ruleVirtualModel EOF )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:165:2: iv_ruleVirtualModel= ruleVirtualModel EOF
            {
             newCompositeNode(grammarAccess.getVirtualModelRule()); 
            pushFollow(FOLLOW_ruleVirtualModel_in_entryRuleVirtualModel278);
            iv_ruleVirtualModel=ruleVirtualModel();

            state._fsp--;

             current =iv_ruleVirtualModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVirtualModel288); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVirtualModel"


    // $ANTLR start "ruleVirtualModel"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:172:1: ruleVirtualModel returns [EObject current=null] : (otherlv_0= 'VirtualModel' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'type' )+ (otherlv_3= '=' )+ ( (lv_type_4_0= ruleVMTYPE ) ) )? (otherlv_5= 'uri' )+ (otherlv_6= '=' )+ ( (lv_uri_7_0= RULE_URISTRING ) ) otherlv_8= '{' ( (lv_ModelSlots_9_0= ruleModelSlot ) )* ( (lv_EditionPatterns_10_0= ruleEditionPattern ) )* otherlv_11= '}' ) ;
    public final EObject ruleVirtualModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_uri_7_0=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Enumerator lv_type_4_0 = null;

        EObject lv_ModelSlots_9_0 = null;

        EObject lv_EditionPatterns_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:175:28: ( (otherlv_0= 'VirtualModel' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'type' )+ (otherlv_3= '=' )+ ( (lv_type_4_0= ruleVMTYPE ) ) )? (otherlv_5= 'uri' )+ (otherlv_6= '=' )+ ( (lv_uri_7_0= RULE_URISTRING ) ) otherlv_8= '{' ( (lv_ModelSlots_9_0= ruleModelSlot ) )* ( (lv_EditionPatterns_10_0= ruleEditionPattern ) )* otherlv_11= '}' ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:176:1: (otherlv_0= 'VirtualModel' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'type' )+ (otherlv_3= '=' )+ ( (lv_type_4_0= ruleVMTYPE ) ) )? (otherlv_5= 'uri' )+ (otherlv_6= '=' )+ ( (lv_uri_7_0= RULE_URISTRING ) ) otherlv_8= '{' ( (lv_ModelSlots_9_0= ruleModelSlot ) )* ( (lv_EditionPatterns_10_0= ruleEditionPattern ) )* otherlv_11= '}' )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:176:1: (otherlv_0= 'VirtualModel' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'type' )+ (otherlv_3= '=' )+ ( (lv_type_4_0= ruleVMTYPE ) ) )? (otherlv_5= 'uri' )+ (otherlv_6= '=' )+ ( (lv_uri_7_0= RULE_URISTRING ) ) otherlv_8= '{' ( (lv_ModelSlots_9_0= ruleModelSlot ) )* ( (lv_EditionPatterns_10_0= ruleEditionPattern ) )* otherlv_11= '}' )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:176:3: otherlv_0= 'VirtualModel' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'type' )+ (otherlv_3= '=' )+ ( (lv_type_4_0= ruleVMTYPE ) ) )? (otherlv_5= 'uri' )+ (otherlv_6= '=' )+ ( (lv_uri_7_0= RULE_URISTRING ) ) otherlv_8= '{' ( (lv_ModelSlots_9_0= ruleModelSlot ) )* ( (lv_EditionPatterns_10_0= ruleEditionPattern ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleVirtualModel325); 

                	newLeafNode(otherlv_0, grammarAccess.getVirtualModelAccess().getVirtualModelKeyword_0());
                
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:180:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:181:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:181:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:182:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVirtualModel342); 

            			newLeafNode(lv_name_1_0, grammarAccess.getVirtualModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVirtualModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:198:2: ( (otherlv_2= 'type' )+ (otherlv_3= '=' )+ ( (lv_type_4_0= ruleVMTYPE ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:198:3: (otherlv_2= 'type' )+ (otherlv_3= '=' )+ ( (lv_type_4_0= ruleVMTYPE ) )
                    {
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:198:3: (otherlv_2= 'type' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==20) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:198:5: otherlv_2= 'type'
                    	    {
                    	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleVirtualModel361); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getVirtualModelAccess().getTypeKeyword_2_0());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:202:3: (otherlv_3= '=' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:202:5: otherlv_3= '='
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleVirtualModel376); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getVirtualModelAccess().getEqualsSignKeyword_2_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:206:3: ( (lv_type_4_0= ruleVMTYPE ) )
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:207:1: (lv_type_4_0= ruleVMTYPE )
                    {
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:207:1: (lv_type_4_0= ruleVMTYPE )
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:208:3: lv_type_4_0= ruleVMTYPE
                    {
                     
                    	        newCompositeNode(grammarAccess.getVirtualModelAccess().getTypeVMTYPEEnumRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVMTYPE_in_ruleVirtualModel399);
                    lv_type_4_0=ruleVMTYPE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVirtualModelRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_4_0, 
                            		"VMTYPE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:224:4: (otherlv_5= 'uri' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:224:6: otherlv_5= 'uri'
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleVirtualModel414); 

            	        	newLeafNode(otherlv_5, grammarAccess.getVirtualModelAccess().getUriKeyword_3());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:228:3: (otherlv_6= '=' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:228:5: otherlv_6= '='
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleVirtualModel429); 

            	        	newLeafNode(otherlv_6, grammarAccess.getVirtualModelAccess().getEqualsSignKeyword_4());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:232:3: ( (lv_uri_7_0= RULE_URISTRING ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:233:1: (lv_uri_7_0= RULE_URISTRING )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:233:1: (lv_uri_7_0= RULE_URISTRING )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:234:3: lv_uri_7_0= RULE_URISTRING
            {
            lv_uri_7_0=(Token)match(input,RULE_URISTRING,FOLLOW_RULE_URISTRING_in_ruleVirtualModel448); 

            			newLeafNode(lv_uri_7_0, grammarAccess.getVirtualModelAccess().getUriURISTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVirtualModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"uri",
                    		lv_uri_7_0, 
                    		"URISTRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleVirtualModel465); 

                	newLeafNode(otherlv_8, grammarAccess.getVirtualModelAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:254:1: ( (lv_ModelSlots_9_0= ruleModelSlot ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:255:1: (lv_ModelSlots_9_0= ruleModelSlot )
            	    {
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:255:1: (lv_ModelSlots_9_0= ruleModelSlot )
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:256:3: lv_ModelSlots_9_0= ruleModelSlot
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVirtualModelAccess().getModelSlotsModelSlotParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModelSlot_in_ruleVirtualModel486);
            	    lv_ModelSlots_9_0=ruleModelSlot();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVirtualModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ModelSlots",
            	            		lv_ModelSlots_9_0, 
            	            		"ModelSlot");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:272:3: ( (lv_EditionPatterns_10_0= ruleEditionPattern ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:273:1: (lv_EditionPatterns_10_0= ruleEditionPattern )
            	    {
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:273:1: (lv_EditionPatterns_10_0= ruleEditionPattern )
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:274:3: lv_EditionPatterns_10_0= ruleEditionPattern
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVirtualModelAccess().getEditionPatternsEditionPatternParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEditionPattern_in_ruleVirtualModel508);
            	    lv_EditionPatterns_10_0=ruleEditionPattern();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVirtualModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"EditionPatterns",
            	            		lv_EditionPatterns_10_0, 
            	            		"EditionPattern");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleVirtualModel521); 

                	newLeafNode(otherlv_11, grammarAccess.getVirtualModelAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVirtualModel"


    // $ANTLR start "entryRuleModelSlot"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:302:1: entryRuleModelSlot returns [EObject current=null] : iv_ruleModelSlot= ruleModelSlot EOF ;
    public final EObject entryRuleModelSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelSlot = null;


        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:303:2: (iv_ruleModelSlot= ruleModelSlot EOF )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:304:2: iv_ruleModelSlot= ruleModelSlot EOF
            {
             newCompositeNode(grammarAccess.getModelSlotRule()); 
            pushFollow(FOLLOW_ruleModelSlot_in_entryRuleModelSlot557);
            iv_ruleModelSlot=ruleModelSlot();

            state._fsp--;

             current =iv_ruleModelSlot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelSlot567); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelSlot"


    // $ANTLR start "ruleModelSlot"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:311:1: ruleModelSlot returns [EObject current=null] : (otherlv_0= 'ModelSlot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' )+ (otherlv_3= '=' )+ ( (lv_type_4_0= ruleMSTYPE ) ) (otherlv_5= 'conformTo' )+ (otherlv_6= '=' )+ ( (lv_uri_7_0= RULE_URISTRING ) ) (otherlv_8= 'required' )+ (otherlv_9= '=' )+ ( (lv_required_10_0= RULE_BOOL ) ) (otherlv_11= 'readOnly' )+ (otherlv_12= '=' )+ ( (lv_readOnly_13_0= RULE_BOOL ) ) otherlv_14= ';' ) ;
    public final EObject ruleModelSlot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_uri_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_required_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_readOnly_13_0=null;
        Token otherlv_14=null;
        Enumerator lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:314:28: ( (otherlv_0= 'ModelSlot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' )+ (otherlv_3= '=' )+ ( (lv_type_4_0= ruleMSTYPE ) ) (otherlv_5= 'conformTo' )+ (otherlv_6= '=' )+ ( (lv_uri_7_0= RULE_URISTRING ) ) (otherlv_8= 'required' )+ (otherlv_9= '=' )+ ( (lv_required_10_0= RULE_BOOL ) ) (otherlv_11= 'readOnly' )+ (otherlv_12= '=' )+ ( (lv_readOnly_13_0= RULE_BOOL ) ) otherlv_14= ';' ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:315:1: (otherlv_0= 'ModelSlot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' )+ (otherlv_3= '=' )+ ( (lv_type_4_0= ruleMSTYPE ) ) (otherlv_5= 'conformTo' )+ (otherlv_6= '=' )+ ( (lv_uri_7_0= RULE_URISTRING ) ) (otherlv_8= 'required' )+ (otherlv_9= '=' )+ ( (lv_required_10_0= RULE_BOOL ) ) (otherlv_11= 'readOnly' )+ (otherlv_12= '=' )+ ( (lv_readOnly_13_0= RULE_BOOL ) ) otherlv_14= ';' )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:315:1: (otherlv_0= 'ModelSlot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' )+ (otherlv_3= '=' )+ ( (lv_type_4_0= ruleMSTYPE ) ) (otherlv_5= 'conformTo' )+ (otherlv_6= '=' )+ ( (lv_uri_7_0= RULE_URISTRING ) ) (otherlv_8= 'required' )+ (otherlv_9= '=' )+ ( (lv_required_10_0= RULE_BOOL ) ) (otherlv_11= 'readOnly' )+ (otherlv_12= '=' )+ ( (lv_readOnly_13_0= RULE_BOOL ) ) otherlv_14= ';' )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:315:3: otherlv_0= 'ModelSlot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' )+ (otherlv_3= '=' )+ ( (lv_type_4_0= ruleMSTYPE ) ) (otherlv_5= 'conformTo' )+ (otherlv_6= '=' )+ ( (lv_uri_7_0= RULE_URISTRING ) ) (otherlv_8= 'required' )+ (otherlv_9= '=' )+ ( (lv_required_10_0= RULE_BOOL ) ) (otherlv_11= 'readOnly' )+ (otherlv_12= '=' )+ ( (lv_readOnly_13_0= RULE_BOOL ) ) otherlv_14= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleModelSlot604); 

                	newLeafNode(otherlv_0, grammarAccess.getModelSlotAccess().getModelSlotKeyword_0());
                
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:319:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:320:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:320:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:321:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModelSlot621); 

            			newLeafNode(lv_name_1_0, grammarAccess.getModelSlotAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelSlotRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:337:2: (otherlv_2= 'type' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:337:4: otherlv_2= 'type'
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleModelSlot639); 

            	        	newLeafNode(otherlv_2, grammarAccess.getModelSlotAccess().getTypeKeyword_2());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:341:3: (otherlv_3= '=' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:341:5: otherlv_3= '='
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleModelSlot654); 

            	        	newLeafNode(otherlv_3, grammarAccess.getModelSlotAccess().getEqualsSignKeyword_3());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:345:3: ( (lv_type_4_0= ruleMSTYPE ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:346:1: (lv_type_4_0= ruleMSTYPE )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:346:1: (lv_type_4_0= ruleMSTYPE )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:347:3: lv_type_4_0= ruleMSTYPE
            {
             
            	        newCompositeNode(grammarAccess.getModelSlotAccess().getTypeMSTYPEEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleMSTYPE_in_ruleModelSlot677);
            lv_type_4_0=ruleMSTYPE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelSlotRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_4_0, 
                    		"MSTYPE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:363:2: (otherlv_5= 'conformTo' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:363:4: otherlv_5= 'conformTo'
            	    {
            	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleModelSlot690); 

            	        	newLeafNode(otherlv_5, grammarAccess.getModelSlotAccess().getConformToKeyword_5());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:367:3: (otherlv_6= '=' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:367:5: otherlv_6= '='
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleModelSlot705); 

            	        	newLeafNode(otherlv_6, grammarAccess.getModelSlotAccess().getEqualsSignKeyword_6());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:371:3: ( (lv_uri_7_0= RULE_URISTRING ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:372:1: (lv_uri_7_0= RULE_URISTRING )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:372:1: (lv_uri_7_0= RULE_URISTRING )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:373:3: lv_uri_7_0= RULE_URISTRING
            {
            lv_uri_7_0=(Token)match(input,RULE_URISTRING,FOLLOW_RULE_URISTRING_in_ruleModelSlot724); 

            			newLeafNode(lv_uri_7_0, grammarAccess.getModelSlotAccess().getUriURISTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelSlotRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"uri",
                    		lv_uri_7_0, 
                    		"URISTRING");
            	    

            }


            }

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:389:2: (otherlv_8= 'required' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:389:4: otherlv_8= 'required'
            	    {
            	    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleModelSlot742); 

            	        	newLeafNode(otherlv_8, grammarAccess.getModelSlotAccess().getRequiredKeyword_8());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:393:3: (otherlv_9= '=' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:393:5: otherlv_9= '='
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleModelSlot757); 

            	        	newLeafNode(otherlv_9, grammarAccess.getModelSlotAccess().getEqualsSignKeyword_9());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:397:3: ( (lv_required_10_0= RULE_BOOL ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:398:1: (lv_required_10_0= RULE_BOOL )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:398:1: (lv_required_10_0= RULE_BOOL )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:399:3: lv_required_10_0= RULE_BOOL
            {
            lv_required_10_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleModelSlot776); 

            			newLeafNode(lv_required_10_0, grammarAccess.getModelSlotAccess().getRequiredBOOLTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelSlotRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"required",
                    		lv_required_10_0, 
                    		"BOOL");
            	    

            }


            }

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:415:2: (otherlv_11= 'readOnly' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==24) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:415:4: otherlv_11= 'readOnly'
            	    {
            	    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleModelSlot794); 

            	        	newLeafNode(otherlv_11, grammarAccess.getModelSlotAccess().getReadOnlyKeyword_11());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:419:3: (otherlv_12= '=' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==16) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:419:5: otherlv_12= '='
            	    {
            	    otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleModelSlot809); 

            	        	newLeafNode(otherlv_12, grammarAccess.getModelSlotAccess().getEqualsSignKeyword_12());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:423:3: ( (lv_readOnly_13_0= RULE_BOOL ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:424:1: (lv_readOnly_13_0= RULE_BOOL )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:424:1: (lv_readOnly_13_0= RULE_BOOL )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:425:3: lv_readOnly_13_0= RULE_BOOL
            {
            lv_readOnly_13_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleModelSlot828); 

            			newLeafNode(lv_readOnly_13_0, grammarAccess.getModelSlotAccess().getReadOnlyBOOLTerminalRuleCall_13_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelSlotRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"readOnly",
                    		lv_readOnly_13_0, 
                    		"BOOL");
            	    

            }


            }

            otherlv_14=(Token)match(input,25,FOLLOW_25_in_ruleModelSlot845); 

                	newLeafNode(otherlv_14, grammarAccess.getModelSlotAccess().getSemicolonKeyword_14());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelSlot"


    // $ANTLR start "entryRuleEditionPattern"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:453:1: entryRuleEditionPattern returns [EObject current=null] : iv_ruleEditionPattern= ruleEditionPattern EOF ;
    public final EObject entryRuleEditionPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditionPattern = null;


        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:454:2: (iv_ruleEditionPattern= ruleEditionPattern EOF )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:455:2: iv_ruleEditionPattern= ruleEditionPattern EOF
            {
             newCompositeNode(grammarAccess.getEditionPatternRule()); 
            pushFollow(FOLLOW_ruleEditionPattern_in_entryRuleEditionPattern881);
            iv_ruleEditionPattern=ruleEditionPattern();

            state._fsp--;

             current =iv_ruleEditionPattern; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEditionPattern891); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEditionPattern"


    // $ANTLR start "ruleEditionPattern"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:462:1: ruleEditionPattern returns [EObject current=null] : (otherlv_0= 'EditionPattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_patternRoles_5_0= rulePatternRole ) )* ( (lv_editionSchemes_6_0= ruleEditionScheme ) )* otherlv_7= '}' ) ;
    public final EObject ruleEditionPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_patternRoles_5_0 = null;

        EObject lv_editionSchemes_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:465:28: ( (otherlv_0= 'EditionPattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_patternRoles_5_0= rulePatternRole ) )* ( (lv_editionSchemes_6_0= ruleEditionScheme ) )* otherlv_7= '}' ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:466:1: (otherlv_0= 'EditionPattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_patternRoles_5_0= rulePatternRole ) )* ( (lv_editionSchemes_6_0= ruleEditionScheme ) )* otherlv_7= '}' )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:466:1: (otherlv_0= 'EditionPattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_patternRoles_5_0= rulePatternRole ) )* ( (lv_editionSchemes_6_0= ruleEditionScheme ) )* otherlv_7= '}' )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:466:3: otherlv_0= 'EditionPattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_patternRoles_5_0= rulePatternRole ) )* ( (lv_editionSchemes_6_0= ruleEditionScheme ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleEditionPattern928); 

                	newLeafNode(otherlv_0, grammarAccess.getEditionPatternAccess().getEditionPatternKeyword_0());
                
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:470:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:471:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:471:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:472:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEditionPattern945); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEditionPatternAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEditionPatternRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:488:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:488:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleEditionPattern963); 

                        	newLeafNode(otherlv_2, grammarAccess.getEditionPatternAccess().getExtendsKeyword_2_0());
                        
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:492:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:493:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:493:1: (otherlv_3= RULE_ID )
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:494:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEditionPatternRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEditionPattern983); 

                    		newLeafNode(otherlv_3, grammarAccess.getEditionPatternAccess().getSuperEditionPatternEditionPatternCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleEditionPattern997); 

                	newLeafNode(otherlv_4, grammarAccess.getEditionPatternAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:509:1: ( (lv_patternRoles_5_0= rulePatternRole ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==28) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:510:1: (lv_patternRoles_5_0= rulePatternRole )
            	    {
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:510:1: (lv_patternRoles_5_0= rulePatternRole )
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:511:3: lv_patternRoles_5_0= rulePatternRole
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEditionPatternAccess().getPatternRolesPatternRoleParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePatternRole_in_ruleEditionPattern1018);
            	    lv_patternRoles_5_0=rulePatternRole();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEditionPatternRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"patternRoles",
            	            		lv_patternRoles_5_0, 
            	            		"PatternRole");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:527:3: ( (lv_editionSchemes_6_0= ruleEditionScheme ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=39 && LA21_0<=42)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:528:1: (lv_editionSchemes_6_0= ruleEditionScheme )
            	    {
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:528:1: (lv_editionSchemes_6_0= ruleEditionScheme )
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:529:3: lv_editionSchemes_6_0= ruleEditionScheme
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEditionPatternAccess().getEditionSchemesEditionSchemeParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEditionScheme_in_ruleEditionPattern1040);
            	    lv_editionSchemes_6_0=ruleEditionScheme();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEditionPatternRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"editionSchemes",
            	            		lv_editionSchemes_6_0, 
            	            		"EditionScheme");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleEditionPattern1053); 

                	newLeafNode(otherlv_7, grammarAccess.getEditionPatternAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEditionPattern"


    // $ANTLR start "entryRulePatternRole"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:557:1: entryRulePatternRole returns [EObject current=null] : iv_rulePatternRole= rulePatternRole EOF ;
    public final EObject entryRulePatternRole() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternRole = null;


        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:558:2: (iv_rulePatternRole= rulePatternRole EOF )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:559:2: iv_rulePatternRole= rulePatternRole EOF
            {
             newCompositeNode(grammarAccess.getPatternRoleRule()); 
            pushFollow(FOLLOW_rulePatternRole_in_entryRulePatternRole1089);
            iv_rulePatternRole=rulePatternRole();

            state._fsp--;

             current =iv_rulePatternRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatternRole1099); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternRole"


    // $ANTLR start "rulePatternRole"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:566:1: rulePatternRole returns [EObject current=null] : (otherlv_0= 'PatternRole' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= rulePRTYPE ) ) otherlv_4= 'conformTo' ( (lv_modelElement_5_0= RULE_ID ) ) otherlv_6= 'from' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' ) ;
    public final EObject rulePatternRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_modelElement_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Enumerator lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:569:28: ( (otherlv_0= 'PatternRole' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= rulePRTYPE ) ) otherlv_4= 'conformTo' ( (lv_modelElement_5_0= RULE_ID ) ) otherlv_6= 'from' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:570:1: (otherlv_0= 'PatternRole' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= rulePRTYPE ) ) otherlv_4= 'conformTo' ( (lv_modelElement_5_0= RULE_ID ) ) otherlv_6= 'from' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:570:1: (otherlv_0= 'PatternRole' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= rulePRTYPE ) ) otherlv_4= 'conformTo' ( (lv_modelElement_5_0= RULE_ID ) ) otherlv_6= 'from' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:570:3: otherlv_0= 'PatternRole' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= rulePRTYPE ) ) otherlv_4= 'conformTo' ( (lv_modelElement_5_0= RULE_ID ) ) otherlv_6= 'from' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_rulePatternRole1136); 

                	newLeafNode(otherlv_0, grammarAccess.getPatternRoleAccess().getPatternRoleKeyword_0());
                
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:574:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:575:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:575:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:576:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePatternRole1153); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPatternRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPatternRoleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_rulePatternRole1170); 

                	newLeafNode(otherlv_2, grammarAccess.getPatternRoleAccess().getAsKeyword_2());
                
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:596:1: ( (lv_type_3_0= rulePRTYPE ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:597:1: (lv_type_3_0= rulePRTYPE )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:597:1: (lv_type_3_0= rulePRTYPE )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:598:3: lv_type_3_0= rulePRTYPE
            {
             
            	        newCompositeNode(grammarAccess.getPatternRoleAccess().getTypePRTYPEEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulePRTYPE_in_rulePatternRole1191);
            lv_type_3_0=rulePRTYPE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPatternRoleRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"PRTYPE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_rulePatternRole1203); 

                	newLeafNode(otherlv_4, grammarAccess.getPatternRoleAccess().getConformToKeyword_4());
                
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:618:1: ( (lv_modelElement_5_0= RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:619:1: (lv_modelElement_5_0= RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:619:1: (lv_modelElement_5_0= RULE_ID )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:620:3: lv_modelElement_5_0= RULE_ID
            {
            lv_modelElement_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePatternRole1220); 

            			newLeafNode(lv_modelElement_5_0, grammarAccess.getPatternRoleAccess().getModelElementIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPatternRoleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"modelElement",
                    		lv_modelElement_5_0, 
                    		"ID");
            	    

            }


            }

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_rulePatternRole1237); 

                	newLeafNode(otherlv_6, grammarAccess.getPatternRoleAccess().getFromKeyword_6());
                
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:640:1: ( (otherlv_7= RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:641:1: (otherlv_7= RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:641:1: (otherlv_7= RULE_ID )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:642:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPatternRoleRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePatternRole1257); 

            		newLeafNode(otherlv_7, grammarAccess.getPatternRoleAccess().getModelSlotModelSlotCrossReference_7_0()); 
            	

            }


            }

            otherlv_8=(Token)match(input,25,FOLLOW_25_in_rulePatternRole1269); 

                	newLeafNode(otherlv_8, grammarAccess.getPatternRoleAccess().getSemicolonKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternRole"


    // $ANTLR start "entryRuleEditionScheme"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:665:1: entryRuleEditionScheme returns [EObject current=null] : iv_ruleEditionScheme= ruleEditionScheme EOF ;
    public final EObject entryRuleEditionScheme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditionScheme = null;


        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:666:2: (iv_ruleEditionScheme= ruleEditionScheme EOF )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:667:2: iv_ruleEditionScheme= ruleEditionScheme EOF
            {
             newCompositeNode(grammarAccess.getEditionSchemeRule()); 
            pushFollow(FOLLOW_ruleEditionScheme_in_entryRuleEditionScheme1305);
            iv_ruleEditionScheme=ruleEditionScheme();

            state._fsp--;

             current =iv_ruleEditionScheme; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEditionScheme1315); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEditionScheme"


    // $ANTLR start "ruleEditionScheme"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:674:1: ruleEditionScheme returns [EObject current=null] : ( ( (lv_editionSchemeType_0_0= ruleEditionSchemeType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameter_3_0= ruleParameter ) )+ ( (otherlv_4= ',' )+ ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_editionAction_8_0= ruleEditionAction ) )* otherlv_9= '}' ) ;
    public final EObject ruleEditionScheme() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_editionSchemeType_0_0 = null;

        EObject lv_parameter_3_0 = null;

        EObject lv_parameter_5_0 = null;

        EObject lv_editionAction_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:677:28: ( ( ( (lv_editionSchemeType_0_0= ruleEditionSchemeType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameter_3_0= ruleParameter ) )+ ( (otherlv_4= ',' )+ ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_editionAction_8_0= ruleEditionAction ) )* otherlv_9= '}' ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:678:1: ( ( (lv_editionSchemeType_0_0= ruleEditionSchemeType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameter_3_0= ruleParameter ) )+ ( (otherlv_4= ',' )+ ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_editionAction_8_0= ruleEditionAction ) )* otherlv_9= '}' )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:678:1: ( ( (lv_editionSchemeType_0_0= ruleEditionSchemeType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameter_3_0= ruleParameter ) )+ ( (otherlv_4= ',' )+ ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_editionAction_8_0= ruleEditionAction ) )* otherlv_9= '}' )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:678:2: ( (lv_editionSchemeType_0_0= ruleEditionSchemeType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameter_3_0= ruleParameter ) )+ ( (otherlv_4= ',' )+ ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_editionAction_8_0= ruleEditionAction ) )* otherlv_9= '}'
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:678:2: ( (lv_editionSchemeType_0_0= ruleEditionSchemeType ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:679:1: (lv_editionSchemeType_0_0= ruleEditionSchemeType )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:679:1: (lv_editionSchemeType_0_0= ruleEditionSchemeType )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:680:3: lv_editionSchemeType_0_0= ruleEditionSchemeType
            {
             
            	        newCompositeNode(grammarAccess.getEditionSchemeAccess().getEditionSchemeTypeEditionSchemeTypeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEditionSchemeType_in_ruleEditionScheme1361);
            lv_editionSchemeType_0_0=ruleEditionSchemeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEditionSchemeRule());
            	        }
                   		set(
                   			current, 
                   			"editionSchemeType",
                    		lv_editionSchemeType_0_0, 
                    		"EditionSchemeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:696:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:697:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:697:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:698:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEditionScheme1378); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEditionSchemeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEditionSchemeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleEditionScheme1395); 

                	newLeafNode(otherlv_2, grammarAccess.getEditionSchemeAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:718:1: ( ( (lv_parameter_3_0= ruleParameter ) )+ ( (otherlv_4= ',' )+ ( (lv_parameter_5_0= ruleParameter ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==49) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:718:2: ( (lv_parameter_3_0= ruleParameter ) )+ ( (otherlv_4= ',' )+ ( (lv_parameter_5_0= ruleParameter ) ) )*
                    {
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:718:2: ( (lv_parameter_3_0= ruleParameter ) )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==49) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:719:1: (lv_parameter_3_0= ruleParameter )
                    	    {
                    	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:719:1: (lv_parameter_3_0= ruleParameter )
                    	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:720:3: lv_parameter_3_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEditionSchemeAccess().getParameterParameterParserRuleCall_3_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleEditionScheme1417);
                    	    lv_parameter_3_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEditionSchemeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameter",
                    	            		lv_parameter_3_0, 
                    	            		"Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);

                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:736:3: ( (otherlv_4= ',' )+ ( (lv_parameter_5_0= ruleParameter ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==32) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:736:4: (otherlv_4= ',' )+ ( (lv_parameter_5_0= ruleParameter ) )
                    	    {
                    	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:736:4: (otherlv_4= ',' )+
                    	    int cnt23=0;
                    	    loop23:
                    	    do {
                    	        int alt23=2;
                    	        int LA23_0 = input.LA(1);

                    	        if ( (LA23_0==32) ) {
                    	            alt23=1;
                    	        }


                    	        switch (alt23) {
                    	    	case 1 :
                    	    	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:736:6: otherlv_4= ','
                    	    	    {
                    	    	    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleEditionScheme1432); 

                    	    	        	newLeafNode(otherlv_4, grammarAccess.getEditionSchemeAccess().getCommaKeyword_3_1_0());
                    	    	        

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt23 >= 1 ) break loop23;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(23, input);
                    	                throw eee;
                    	        }
                    	        cnt23++;
                    	    } while (true);

                    	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:740:3: ( (lv_parameter_5_0= ruleParameter ) )
                    	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:741:1: (lv_parameter_5_0= ruleParameter )
                    	    {
                    	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:741:1: (lv_parameter_5_0= ruleParameter )
                    	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:742:3: lv_parameter_5_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEditionSchemeAccess().getParameterParameterParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleEditionScheme1455);
                    	    lv_parameter_5_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEditionSchemeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameter",
                    	            		lv_parameter_5_0, 
                    	            		"Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleEditionScheme1471); 

                	newLeafNode(otherlv_6, grammarAccess.getEditionSchemeAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleEditionScheme1483); 

                	newLeafNode(otherlv_7, grammarAccess.getEditionSchemeAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:766:1: ( (lv_editionAction_8_0= ruleEditionAction ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||(LA26_0>=37 && LA26_0<=38)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:767:1: (lv_editionAction_8_0= ruleEditionAction )
            	    {
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:767:1: (lv_editionAction_8_0= ruleEditionAction )
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:768:3: lv_editionAction_8_0= ruleEditionAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEditionSchemeAccess().getEditionActionEditionActionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEditionAction_in_ruleEditionScheme1504);
            	    lv_editionAction_8_0=ruleEditionAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEditionSchemeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"editionAction",
            	            		lv_editionAction_8_0, 
            	            		"EditionAction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleEditionScheme1517); 

                	newLeafNode(otherlv_9, grammarAccess.getEditionSchemeAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEditionScheme"


    // $ANTLR start "entryRuleParameter"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:796:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:797:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:798:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1553);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1563); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:805:1: ruleParameter returns [EObject current=null] : ( ( (lv_widget_0_0= rulePRTYPE ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Enumerator lv_widget_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:808:28: ( ( ( (lv_widget_0_0= rulePRTYPE ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:809:1: ( ( (lv_widget_0_0= rulePRTYPE ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:809:1: ( ( (lv_widget_0_0= rulePRTYPE ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:809:2: ( (lv_widget_0_0= rulePRTYPE ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:809:2: ( (lv_widget_0_0= rulePRTYPE ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:810:1: (lv_widget_0_0= rulePRTYPE )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:810:1: (lv_widget_0_0= rulePRTYPE )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:811:3: lv_widget_0_0= rulePRTYPE
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getWidgetPRTYPEEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePRTYPE_in_ruleParameter1609);
            lv_widget_0_0=rulePRTYPE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"widget",
                    		lv_widget_0_0, 
                    		"PRTYPE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleParameter1621); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:831:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:832:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:832:1: (otherlv_2= RULE_ID )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:833:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1641); 

            		newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getEditionPatternEditionPatternCrossReference_2_0()); 
            	

            }


            }

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:844:2: ( (lv_name_3_0= RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:845:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:845:1: (lv_name_3_0= RULE_ID )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:846:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1658); 

            			newLeafNode(lv_name_3_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleEditionAction"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:870:1: entryRuleEditionAction returns [EObject current=null] : iv_ruleEditionAction= ruleEditionAction EOF ;
    public final EObject entryRuleEditionAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditionAction = null;


        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:871:2: (iv_ruleEditionAction= ruleEditionAction EOF )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:872:2: iv_ruleEditionAction= ruleEditionAction EOF
            {
             newCompositeNode(grammarAccess.getEditionActionRule()); 
            pushFollow(FOLLOW_ruleEditionAction_in_entryRuleEditionAction1699);
            iv_ruleEditionAction=ruleEditionAction();

            state._fsp--;

             current =iv_ruleEditionAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEditionAction1709); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEditionAction"


    // $ANTLR start "ruleEditionAction"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:879:1: ruleEditionAction returns [EObject current=null] : this_BuiltInAction_0= ruleBuiltInAction ;
    public final EObject ruleEditionAction() throws RecognitionException {
        EObject current = null;

        EObject this_BuiltInAction_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:882:28: (this_BuiltInAction_0= ruleBuiltInAction )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:884:5: this_BuiltInAction_0= ruleBuiltInAction
            {
             
                    newCompositeNode(grammarAccess.getEditionActionAccess().getBuiltInActionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleBuiltInAction_in_ruleEditionAction1755);
            this_BuiltInAction_0=ruleBuiltInAction();

            state._fsp--;

             
                    current = this_BuiltInAction_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEditionAction"


    // $ANTLR start "entryRuleBuiltInAction"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:900:1: entryRuleBuiltInAction returns [EObject current=null] : iv_ruleBuiltInAction= ruleBuiltInAction EOF ;
    public final EObject entryRuleBuiltInAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltInAction = null;


        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:901:2: (iv_ruleBuiltInAction= ruleBuiltInAction EOF )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:902:2: iv_ruleBuiltInAction= ruleBuiltInAction EOF
            {
             newCompositeNode(grammarAccess.getBuiltInActionRule()); 
            pushFollow(FOLLOW_ruleBuiltInAction_in_entryRuleBuiltInAction1789);
            iv_ruleBuiltInAction=ruleBuiltInAction();

            state._fsp--;

             current =iv_ruleBuiltInAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltInAction1799); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBuiltInAction"


    // $ANTLR start "ruleBuiltInAction"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:909:1: ruleBuiltInAction returns [EObject current=null] : (this_DeclarePatternRole_0= ruleDeclarePatternRole | this_DeleteAction_1= ruleDeleteAction | this_AddEMFObjectIndividual_2= ruleAddEMFObjectIndividual ) ;
    public final EObject ruleBuiltInAction() throws RecognitionException {
        EObject current = null;

        EObject this_DeclarePatternRole_0 = null;

        EObject this_DeleteAction_1 = null;

        EObject this_AddEMFObjectIndividual_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:912:28: ( (this_DeclarePatternRole_0= ruleDeclarePatternRole | this_DeleteAction_1= ruleDeleteAction | this_AddEMFObjectIndividual_2= ruleAddEMFObjectIndividual ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:913:1: (this_DeclarePatternRole_0= ruleDeclarePatternRole | this_DeleteAction_1= ruleDeleteAction | this_AddEMFObjectIndividual_2= ruleAddEMFObjectIndividual )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:913:1: (this_DeclarePatternRole_0= ruleDeclarePatternRole | this_DeleteAction_1= ruleDeleteAction | this_AddEMFObjectIndividual_2= ruleAddEMFObjectIndividual )
            int alt27=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt27=1;
                }
                break;
            case 37:
                {
                alt27=2;
                }
                break;
            case 38:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:914:5: this_DeclarePatternRole_0= ruleDeclarePatternRole
                    {
                     
                            newCompositeNode(grammarAccess.getBuiltInActionAccess().getDeclarePatternRoleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDeclarePatternRole_in_ruleBuiltInAction1846);
                    this_DeclarePatternRole_0=ruleDeclarePatternRole();

                    state._fsp--;

                     
                            current = this_DeclarePatternRole_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:924:5: this_DeleteAction_1= ruleDeleteAction
                    {
                     
                            newCompositeNode(grammarAccess.getBuiltInActionAccess().getDeleteActionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDeleteAction_in_ruleBuiltInAction1873);
                    this_DeleteAction_1=ruleDeleteAction();

                    state._fsp--;

                     
                            current = this_DeleteAction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:934:5: this_AddEMFObjectIndividual_2= ruleAddEMFObjectIndividual
                    {
                     
                            newCompositeNode(grammarAccess.getBuiltInActionAccess().getAddEMFObjectIndividualParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAddEMFObjectIndividual_in_ruleBuiltInAction1900);
                    this_AddEMFObjectIndividual_2=ruleAddEMFObjectIndividual();

                    state._fsp--;

                     
                            current = this_AddEMFObjectIndividual_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBuiltInAction"


    // $ANTLR start "entryRuleDeclarePatternRole"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:950:1: entryRuleDeclarePatternRole returns [EObject current=null] : iv_ruleDeclarePatternRole= ruleDeclarePatternRole EOF ;
    public final EObject entryRuleDeclarePatternRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarePatternRole = null;


        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:951:2: (iv_ruleDeclarePatternRole= ruleDeclarePatternRole EOF )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:952:2: iv_ruleDeclarePatternRole= ruleDeclarePatternRole EOF
            {
             newCompositeNode(grammarAccess.getDeclarePatternRoleRule()); 
            pushFollow(FOLLOW_ruleDeclarePatternRole_in_entryRuleDeclarePatternRole1935);
            iv_ruleDeclarePatternRole=ruleDeclarePatternRole();

            state._fsp--;

             current =iv_ruleDeclarePatternRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarePatternRole1945); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarePatternRole"


    // $ANTLR start "ruleDeclarePatternRole"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:959:1: ruleDeclarePatternRole returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) )+ otherlv_1= '=' )+ ( (otherlv_2= 'parameters' otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( (otherlv_6= '(' )+ ( (lv_add_7_0= ruleAddEMFObjectIndividual ) )+ otherlv_8= ')' ) ) ) ;
    public final EObject ruleDeclarePatternRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_add_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:962:28: ( ( ( ( (otherlv_0= RULE_ID ) )+ otherlv_1= '=' )+ ( (otherlv_2= 'parameters' otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( (otherlv_6= '(' )+ ( (lv_add_7_0= ruleAddEMFObjectIndividual ) )+ otherlv_8= ')' ) ) ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:963:1: ( ( ( (otherlv_0= RULE_ID ) )+ otherlv_1= '=' )+ ( (otherlv_2= 'parameters' otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( (otherlv_6= '(' )+ ( (lv_add_7_0= ruleAddEMFObjectIndividual ) )+ otherlv_8= ')' ) ) )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:963:1: ( ( ( (otherlv_0= RULE_ID ) )+ otherlv_1= '=' )+ ( (otherlv_2= 'parameters' otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( (otherlv_6= '(' )+ ( (lv_add_7_0= ruleAddEMFObjectIndividual ) )+ otherlv_8= ')' ) ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:963:2: ( ( (otherlv_0= RULE_ID ) )+ otherlv_1= '=' )+ ( (otherlv_2= 'parameters' otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( (otherlv_6= '(' )+ ( (lv_add_7_0= ruleAddEMFObjectIndividual ) )+ otherlv_8= ')' ) )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:963:2: ( ( (otherlv_0= RULE_ID ) )+ otherlv_1= '=' )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:963:3: ( (otherlv_0= RULE_ID ) )+ otherlv_1= '='
            	    {
            	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:963:3: ( (otherlv_0= RULE_ID ) )+
            	    int cnt28=0;
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==RULE_ID) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:964:1: (otherlv_0= RULE_ID )
            	    	    {
            	    	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:964:1: (otherlv_0= RULE_ID )
            	    	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:965:3: otherlv_0= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getDeclarePatternRoleRule());
            	    	    	        }
            	    	            
            	    	    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclarePatternRole1991); 

            	    	    		newLeafNode(otherlv_0, grammarAccess.getDeclarePatternRoleAccess().getPatternRolePatternRoleCrossReference_0_0_0()); 
            	    	    	

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt28 >= 1 ) break loop28;
            	                EarlyExitException eee =
            	                    new EarlyExitException(28, input);
            	                throw eee;
            	        }
            	        cnt28++;
            	    } while (true);

            	    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleDeclarePatternRole2004); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDeclarePatternRoleAccess().getEqualsSignKeyword_0_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:980:3: ( (otherlv_2= 'parameters' otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( (otherlv_6= '(' )+ ( (lv_add_7_0= ruleAddEMFObjectIndividual ) )+ otherlv_8= ')' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            else if ( (LA32_0==31) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:980:4: (otherlv_2= 'parameters' otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
                    {
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:980:4: (otherlv_2= 'parameters' otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:980:6: otherlv_2= 'parameters' otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleDeclarePatternRole2020); 

                        	newLeafNode(otherlv_2, grammarAccess.getDeclarePatternRoleAccess().getParametersKeyword_1_0_0());
                        
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleDeclarePatternRole2032); 

                        	newLeafNode(otherlv_3, grammarAccess.getDeclarePatternRoleAccess().getFullStopKeyword_1_0_1());
                        
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:988:1: ( (otherlv_4= RULE_ID ) )
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:989:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:989:1: (otherlv_4= RULE_ID )
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:990:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeclarePatternRoleRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclarePatternRole2052); 

                    		newLeafNode(otherlv_4, grammarAccess.getDeclarePatternRoleAccess().getParameterParameterCrossReference_1_0_2_0()); 
                    	

                    }


                    }

                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleDeclarePatternRole2064); 

                        	newLeafNode(otherlv_5, grammarAccess.getDeclarePatternRoleAccess().getSemicolonKeyword_1_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1006:6: ( (otherlv_6= '(' )+ ( (lv_add_7_0= ruleAddEMFObjectIndividual ) )+ otherlv_8= ')' )
                    {
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1006:6: ( (otherlv_6= '(' )+ ( (lv_add_7_0= ruleAddEMFObjectIndividual ) )+ otherlv_8= ')' )
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1006:7: (otherlv_6= '(' )+ ( (lv_add_7_0= ruleAddEMFObjectIndividual ) )+ otherlv_8= ')'
                    {
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1006:7: (otherlv_6= '(' )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==31) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1006:9: otherlv_6= '('
                    	    {
                    	    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleDeclarePatternRole2085); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getDeclarePatternRoleAccess().getLeftParenthesisKeyword_1_1_0());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);

                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1010:3: ( (lv_add_7_0= ruleAddEMFObjectIndividual ) )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==38) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1011:1: (lv_add_7_0= ruleAddEMFObjectIndividual )
                    	    {
                    	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1011:1: (lv_add_7_0= ruleAddEMFObjectIndividual )
                    	    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1012:3: lv_add_7_0= ruleAddEMFObjectIndividual
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDeclarePatternRoleAccess().getAddAddEMFObjectIndividualParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAddEMFObjectIndividual_in_ruleDeclarePatternRole2108);
                    	    lv_add_7_0=ruleAddEMFObjectIndividual();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDeclarePatternRoleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"add",
                    	            		lv_add_7_0, 
                    	            		"AddEMFObjectIndividual");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);

                    otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleDeclarePatternRole2121); 

                        	newLeafNode(otherlv_8, grammarAccess.getDeclarePatternRoleAccess().getRightParenthesisKeyword_1_1_2());
                        

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarePatternRole"


    // $ANTLR start "entryRuleDeleteAction"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1040:1: entryRuleDeleteAction returns [EObject current=null] : iv_ruleDeleteAction= ruleDeleteAction EOF ;
    public final EObject entryRuleDeleteAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteAction = null;


        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1041:2: (iv_ruleDeleteAction= ruleDeleteAction EOF )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1042:2: iv_ruleDeleteAction= ruleDeleteAction EOF
            {
             newCompositeNode(grammarAccess.getDeleteActionRule()); 
            pushFollow(FOLLOW_ruleDeleteAction_in_entryRuleDeleteAction2159);
            iv_ruleDeleteAction=ruleDeleteAction();

            state._fsp--;

             current =iv_ruleDeleteAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteAction2169); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeleteAction"


    // $ANTLR start "ruleDeleteAction"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1049:1: ruleDeleteAction returns [EObject current=null] : (otherlv_0= 'delete' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleDeleteAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1052:28: ( (otherlv_0= 'delete' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1053:1: (otherlv_0= 'delete' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1053:1: (otherlv_0= 'delete' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1053:3: otherlv_0= 'delete' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleDeleteAction2206); 

                	newLeafNode(otherlv_0, grammarAccess.getDeleteActionAccess().getDeleteKeyword_0());
                
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1057:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1058:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1058:1: (otherlv_1= RULE_ID )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1059:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDeleteActionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeleteAction2226); 

            		newLeafNode(otherlv_1, grammarAccess.getDeleteActionAccess().getPatternRolePatternRoleCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleDeleteAction2238); 

                	newLeafNode(otherlv_2, grammarAccess.getDeleteActionAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeleteAction"


    // $ANTLR start "entryRuleAddEMFObjectIndividual"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1082:1: entryRuleAddEMFObjectIndividual returns [EObject current=null] : iv_ruleAddEMFObjectIndividual= ruleAddEMFObjectIndividual EOF ;
    public final EObject entryRuleAddEMFObjectIndividual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddEMFObjectIndividual = null;


        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1083:2: (iv_ruleAddEMFObjectIndividual= ruleAddEMFObjectIndividual EOF )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1084:2: iv_ruleAddEMFObjectIndividual= ruleAddEMFObjectIndividual EOF
            {
             newCompositeNode(grammarAccess.getAddEMFObjectIndividualRule()); 
            pushFollow(FOLLOW_ruleAddEMFObjectIndividual_in_entryRuleAddEMFObjectIndividual2274);
            iv_ruleAddEMFObjectIndividual=ruleAddEMFObjectIndividual();

            state._fsp--;

             current =iv_ruleAddEMFObjectIndividual; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddEMFObjectIndividual2284); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddEMFObjectIndividual"


    // $ANTLR start "ruleAddEMFObjectIndividual"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1091:1: ruleAddEMFObjectIndividual returns [EObject current=null] : (otherlv_0= 'AddEMFObjectIndividual' otherlv_1= 'conformTo' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' otherlv_6= '}' ) ;
    public final EObject ruleAddEMFObjectIndividual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1094:28: ( (otherlv_0= 'AddEMFObjectIndividual' otherlv_1= 'conformTo' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' otherlv_6= '}' ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1095:1: (otherlv_0= 'AddEMFObjectIndividual' otherlv_1= 'conformTo' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' otherlv_6= '}' )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1095:1: (otherlv_0= 'AddEMFObjectIndividual' otherlv_1= 'conformTo' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' otherlv_6= '}' )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1095:3: otherlv_0= 'AddEMFObjectIndividual' otherlv_1= 'conformTo' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleAddEMFObjectIndividual2321); 

                	newLeafNode(otherlv_0, grammarAccess.getAddEMFObjectIndividualAccess().getAddEMFObjectIndividualKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleAddEMFObjectIndividual2333); 

                	newLeafNode(otherlv_1, grammarAccess.getAddEMFObjectIndividualAccess().getConformToKeyword_1());
                
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1103:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1104:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1104:1: (otherlv_2= RULE_ID )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1105:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAddEMFObjectIndividualRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddEMFObjectIndividual2353); 

            		newLeafNode(otherlv_2, grammarAccess.getAddEMFObjectIndividualAccess().getEditionPatternEditionPatternCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleAddEMFObjectIndividual2365); 

                	newLeafNode(otherlv_3, grammarAccess.getAddEMFObjectIndividualAccess().getFromKeyword_3());
                
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1120:1: ( (otherlv_4= RULE_ID ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1121:1: (otherlv_4= RULE_ID )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1121:1: (otherlv_4= RULE_ID )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1122:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAddEMFObjectIndividualRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddEMFObjectIndividual2385); 

            		newLeafNode(otherlv_4, grammarAccess.getAddEMFObjectIndividualAccess().getModelSlotModelSlotCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleAddEMFObjectIndividual2397); 

                	newLeafNode(otherlv_5, grammarAccess.getAddEMFObjectIndividualAccess().getLeftCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleAddEMFObjectIndividual2409); 

                	newLeafNode(otherlv_6, grammarAccess.getAddEMFObjectIndividualAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddEMFObjectIndividual"


    // $ANTLR start "ruleEditionSchemeType"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1149:1: ruleEditionSchemeType returns [Enumerator current=null] : ( (enumLiteral_0= 'CreationScheme' ) | (enumLiteral_1= 'DeletionScheme' ) | (enumLiteral_2= 'ActionScheme' ) | (enumLiteral_3= 'CloningScheme' ) ) ;
    public final Enumerator ruleEditionSchemeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1151:28: ( ( (enumLiteral_0= 'CreationScheme' ) | (enumLiteral_1= 'DeletionScheme' ) | (enumLiteral_2= 'ActionScheme' ) | (enumLiteral_3= 'CloningScheme' ) ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1152:1: ( (enumLiteral_0= 'CreationScheme' ) | (enumLiteral_1= 'DeletionScheme' ) | (enumLiteral_2= 'ActionScheme' ) | (enumLiteral_3= 'CloningScheme' ) )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1152:1: ( (enumLiteral_0= 'CreationScheme' ) | (enumLiteral_1= 'DeletionScheme' ) | (enumLiteral_2= 'ActionScheme' ) | (enumLiteral_3= 'CloningScheme' ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt33=1;
                }
                break;
            case 40:
                {
                alt33=2;
                }
                break;
            case 41:
                {
                alt33=3;
                }
                break;
            case 42:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1152:2: (enumLiteral_0= 'CreationScheme' )
                    {
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1152:2: (enumLiteral_0= 'CreationScheme' )
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1152:4: enumLiteral_0= 'CreationScheme'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_39_in_ruleEditionSchemeType2459); 

                            current = grammarAccess.getEditionSchemeTypeAccess().getCreationSchemeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEditionSchemeTypeAccess().getCreationSchemeEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1158:6: (enumLiteral_1= 'DeletionScheme' )
                    {
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1158:6: (enumLiteral_1= 'DeletionScheme' )
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1158:8: enumLiteral_1= 'DeletionScheme'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_40_in_ruleEditionSchemeType2476); 

                            current = grammarAccess.getEditionSchemeTypeAccess().getDeletionSchemeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getEditionSchemeTypeAccess().getDeletionSchemeEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1164:6: (enumLiteral_2= 'ActionScheme' )
                    {
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1164:6: (enumLiteral_2= 'ActionScheme' )
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1164:8: enumLiteral_2= 'ActionScheme'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_41_in_ruleEditionSchemeType2493); 

                            current = grammarAccess.getEditionSchemeTypeAccess().getActionSchemeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getEditionSchemeTypeAccess().getActionSchemeEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1170:6: (enumLiteral_3= 'CloningScheme' )
                    {
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1170:6: (enumLiteral_3= 'CloningScheme' )
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1170:8: enumLiteral_3= 'CloningScheme'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_42_in_ruleEditionSchemeType2510); 

                            current = grammarAccess.getEditionSchemeTypeAccess().getCloningSchemeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getEditionSchemeTypeAccess().getCloningSchemeEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEditionSchemeType"


    // $ANTLR start "ruleMSTYPE"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1180:1: ruleMSTYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'OWLModelSlot' ) | (enumLiteral_1= 'DiagramModelSlot' ) | (enumLiteral_2= 'EMFModelSlot' ) | (enumLiteral_3= 'VirtualModelModelSlot' ) | (enumLiteral_4= 'XSDModelSlot' ) ) ;
    public final Enumerator ruleMSTYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1182:28: ( ( (enumLiteral_0= 'OWLModelSlot' ) | (enumLiteral_1= 'DiagramModelSlot' ) | (enumLiteral_2= 'EMFModelSlot' ) | (enumLiteral_3= 'VirtualModelModelSlot' ) | (enumLiteral_4= 'XSDModelSlot' ) ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1183:1: ( (enumLiteral_0= 'OWLModelSlot' ) | (enumLiteral_1= 'DiagramModelSlot' ) | (enumLiteral_2= 'EMFModelSlot' ) | (enumLiteral_3= 'VirtualModelModelSlot' ) | (enumLiteral_4= 'XSDModelSlot' ) )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1183:1: ( (enumLiteral_0= 'OWLModelSlot' ) | (enumLiteral_1= 'DiagramModelSlot' ) | (enumLiteral_2= 'EMFModelSlot' ) | (enumLiteral_3= 'VirtualModelModelSlot' ) | (enumLiteral_4= 'XSDModelSlot' ) )
            int alt34=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt34=1;
                }
                break;
            case 44:
                {
                alt34=2;
                }
                break;
            case 45:
                {
                alt34=3;
                }
                break;
            case 46:
                {
                alt34=4;
                }
                break;
            case 47:
                {
                alt34=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1183:2: (enumLiteral_0= 'OWLModelSlot' )
                    {
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1183:2: (enumLiteral_0= 'OWLModelSlot' )
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1183:4: enumLiteral_0= 'OWLModelSlot'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleMSTYPE2555); 

                            current = grammarAccess.getMSTYPEAccess().getOwlEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMSTYPEAccess().getOwlEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1189:6: (enumLiteral_1= 'DiagramModelSlot' )
                    {
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1189:6: (enumLiteral_1= 'DiagramModelSlot' )
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1189:8: enumLiteral_1= 'DiagramModelSlot'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_44_in_ruleMSTYPE2572); 

                            current = grammarAccess.getMSTYPEAccess().getDiagEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMSTYPEAccess().getDiagEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1195:6: (enumLiteral_2= 'EMFModelSlot' )
                    {
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1195:6: (enumLiteral_2= 'EMFModelSlot' )
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1195:8: enumLiteral_2= 'EMFModelSlot'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_45_in_ruleMSTYPE2589); 

                            current = grammarAccess.getMSTYPEAccess().getEmfEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMSTYPEAccess().getEmfEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1201:6: (enumLiteral_3= 'VirtualModelModelSlot' )
                    {
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1201:6: (enumLiteral_3= 'VirtualModelModelSlot' )
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1201:8: enumLiteral_3= 'VirtualModelModelSlot'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_46_in_ruleMSTYPE2606); 

                            current = grammarAccess.getMSTYPEAccess().getVirtualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMSTYPEAccess().getVirtualEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1207:6: (enumLiteral_4= 'XSDModelSlot' )
                    {
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1207:6: (enumLiteral_4= 'XSDModelSlot' )
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1207:8: enumLiteral_4= 'XSDModelSlot'
                    {
                    enumLiteral_4=(Token)match(input,47,FOLLOW_47_in_ruleMSTYPE2623); 

                            current = grammarAccess.getMSTYPEAccess().getXsdEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getMSTYPEAccess().getXsdEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMSTYPE"


    // $ANTLR start "ruleVMTYPE"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1217:1: ruleVMTYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'DiagramSpecification' ) | (enumLiteral_1= 'VirtualModel' ) ) ;
    public final Enumerator ruleVMTYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1219:28: ( ( (enumLiteral_0= 'DiagramSpecification' ) | (enumLiteral_1= 'VirtualModel' ) ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1220:1: ( (enumLiteral_0= 'DiagramSpecification' ) | (enumLiteral_1= 'VirtualModel' ) )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1220:1: ( (enumLiteral_0= 'DiagramSpecification' ) | (enumLiteral_1= 'VirtualModel' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==48) ) {
                alt35=1;
            }
            else if ( (LA35_0==19) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1220:2: (enumLiteral_0= 'DiagramSpecification' )
                    {
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1220:2: (enumLiteral_0= 'DiagramSpecification' )
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1220:4: enumLiteral_0= 'DiagramSpecification'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_48_in_ruleVMTYPE2668); 

                            current = grammarAccess.getVMTYPEAccess().getDiagSpecEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVMTYPEAccess().getDiagSpecEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1226:6: (enumLiteral_1= 'VirtualModel' )
                    {
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1226:6: (enumLiteral_1= 'VirtualModel' )
                    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1226:8: enumLiteral_1= 'VirtualModel'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_19_in_ruleVMTYPE2685); 

                            current = grammarAccess.getVMTYPEAccess().getVMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVMTYPEAccess().getVMEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVMTYPE"


    // $ANTLR start "rulePRTYPE"
    // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1236:1: rulePRTYPE returns [Enumerator current=null] : (enumLiteral_0= 'Individual' ) ;
    public final Enumerator rulePRTYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1238:28: ( (enumLiteral_0= 'Individual' ) )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1239:1: (enumLiteral_0= 'Individual' )
            {
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1239:1: (enumLiteral_0= 'Individual' )
            // ../org.xtext.example.FlexoLanguage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalFML.g:1239:3: enumLiteral_0= 'Individual'
            {
            enumLiteral_0=(Token)match(input,49,FOLLOW_49_in_rulePRTYPE2729); 

                    current = grammarAccess.getPRTYPEAccess().getIndividualEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getPRTYPEAccess().getIndividualEnumLiteralDeclaration()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePRTYPE"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleViewDef_in_entryRuleViewDef75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewDef85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleViewDef122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleViewDef139 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleViewDef157 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleViewDef172 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_RULE_URISTRING_in_ruleViewDef191 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleViewDef208 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleVirtualModel_in_ruleViewDef229 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleViewDef242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVirtualModel_in_entryRuleVirtualModel278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVirtualModel288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleVirtualModel325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVirtualModel342 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_20_in_ruleVirtualModel361 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_16_in_ruleVirtualModel376 = new BitSet(new long[]{0x0001000000090000L});
    public static final BitSet FOLLOW_ruleVMTYPE_in_ruleVirtualModel399 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVirtualModel414 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleVirtualModel429 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_RULE_URISTRING_in_ruleVirtualModel448 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVirtualModel465 = new BitSet(new long[]{0x0000000004240000L});
    public static final BitSet FOLLOW_ruleModelSlot_in_ruleVirtualModel486 = new BitSet(new long[]{0x0000000004240000L});
    public static final BitSet FOLLOW_ruleEditionPattern_in_ruleVirtualModel508 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_18_in_ruleVirtualModel521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelSlot_in_entryRuleModelSlot557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelSlot567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleModelSlot604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModelSlot621 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleModelSlot639 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_16_in_ruleModelSlot654 = new BitSet(new long[]{0x0000F80000010000L});
    public static final BitSet FOLLOW_ruleMSTYPE_in_ruleModelSlot677 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleModelSlot690 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleModelSlot705 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_RULE_URISTRING_in_ruleModelSlot724 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleModelSlot742 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_16_in_ruleModelSlot757 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleModelSlot776 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleModelSlot794 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_16_in_ruleModelSlot809 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleModelSlot828 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleModelSlot845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditionPattern_in_entryRuleEditionPattern881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEditionPattern891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleEditionPattern928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEditionPattern945 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_27_in_ruleEditionPattern963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEditionPattern983 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEditionPattern997 = new BitSet(new long[]{0x0000078010040000L});
    public static final BitSet FOLLOW_rulePatternRole_in_ruleEditionPattern1018 = new BitSet(new long[]{0x0000078010040000L});
    public static final BitSet FOLLOW_ruleEditionScheme_in_ruleEditionPattern1040 = new BitSet(new long[]{0x0000078000040000L});
    public static final BitSet FOLLOW_18_in_ruleEditionPattern1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternRole_in_entryRulePatternRole1089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatternRole1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePatternRole1136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePatternRole1153 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulePatternRole1170 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rulePRTYPE_in_rulePatternRole1191 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePatternRole1203 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePatternRole1220 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePatternRole1237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePatternRole1257 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePatternRole1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditionScheme_in_entryRuleEditionScheme1305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEditionScheme1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditionSchemeType_in_ruleEditionScheme1361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEditionScheme1378 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEditionScheme1395 = new BitSet(new long[]{0x0002000200000000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleEditionScheme1417 = new BitSet(new long[]{0x0002000300000000L});
    public static final BitSet FOLLOW_32_in_ruleEditionScheme1432 = new BitSet(new long[]{0x0002000100000000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleEditionScheme1455 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_33_in_ruleEditionScheme1471 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEditionScheme1483 = new BitSet(new long[]{0x0000006000040010L});
    public static final BitSet FOLLOW_ruleEditionAction_in_ruleEditionScheme1504 = new BitSet(new long[]{0x0000006000040010L});
    public static final BitSet FOLLOW_18_in_ruleEditionScheme1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePRTYPE_in_ruleParameter1609 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleParameter1621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditionAction_in_entryRuleEditionAction1699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEditionAction1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInAction_in_ruleEditionAction1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInAction_in_entryRuleBuiltInAction1789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInAction1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarePatternRole_in_ruleBuiltInAction1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteAction_in_ruleBuiltInAction1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddEMFObjectIndividual_in_ruleBuiltInAction1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarePatternRole_in_entryRuleDeclarePatternRole1935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarePatternRole1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclarePatternRole1991 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleDeclarePatternRole2004 = new BitSet(new long[]{0x0000000880000010L});
    public static final BitSet FOLLOW_35_in_ruleDeclarePatternRole2020 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleDeclarePatternRole2032 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclarePatternRole2052 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDeclarePatternRole2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDeclarePatternRole2085 = new BitSet(new long[]{0x0000006080000010L});
    public static final BitSet FOLLOW_ruleAddEMFObjectIndividual_in_ruleDeclarePatternRole2108 = new BitSet(new long[]{0x0000006200000010L});
    public static final BitSet FOLLOW_33_in_ruleDeclarePatternRole2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteAction_in_entryRuleDeleteAction2159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteAction2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDeleteAction2206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeleteAction2226 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDeleteAction2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddEMFObjectIndividual_in_entryRuleAddEMFObjectIndividual2274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddEMFObjectIndividual2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleAddEMFObjectIndividual2321 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAddEMFObjectIndividual2333 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddEMFObjectIndividual2353 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAddEMFObjectIndividual2365 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddEMFObjectIndividual2385 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAddEMFObjectIndividual2397 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAddEMFObjectIndividual2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEditionSchemeType2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleEditionSchemeType2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleEditionSchemeType2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEditionSchemeType2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleMSTYPE2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleMSTYPE2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleMSTYPE2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleMSTYPE2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleMSTYPE2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleVMTYPE2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleVMTYPE2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rulePRTYPE2729 = new BitSet(new long[]{0x0000000000000002L});

}