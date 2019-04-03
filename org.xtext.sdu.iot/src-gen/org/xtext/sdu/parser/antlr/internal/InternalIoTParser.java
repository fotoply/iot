package org.xtext.sdu.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.sdu.services.IoTGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIoTParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SensorTypes'", "','", "'Sensor'", "'of'", "'type'", "'SensorGroup'", "'include'", "'SensorGetMethod'", "'for'", "'('", "')'", "'DeviceTypes'", "'Device'", "'contains'", "'device'", "'group'", "'ServerTypes'", "'Server'", "'listens'", "'on'", "'and'", "'DestinationTypes'", "'Destination'", "'Fetch'", "'data'", "'from'", "'to'", "'destination'", "'server'", "'every'", "'when'", "'if'", "'ms'", "'s'", "'m'", "'h'", "'_??'", "'.'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalIoTParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIoTParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIoTParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIoT.g"; }



     	private IoTGrammarAccess grammarAccess;

        public InternalIoTParser(TokenStream input, IoTGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "System";
       	}

       	@Override
       	protected IoTGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystem"
    // InternalIoT.g:64:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalIoT.g:64:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalIoT.g:65:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalIoT.g:71:1: ruleSystem returns [EObject current=null] : ( ( (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleServerTypes | lv_system_0_8= ruleServer | lv_system_0_9= ruleDestinationTypes | lv_system_0_10= ruleDestination | lv_system_0_11= ruleFetchData ) ) )+ ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        EObject lv_system_0_1 = null;

        EObject lv_system_0_2 = null;

        EObject lv_system_0_3 = null;

        EObject lv_system_0_4 = null;

        EObject lv_system_0_5 = null;

        EObject lv_system_0_6 = null;

        EObject lv_system_0_7 = null;

        EObject lv_system_0_8 = null;

        EObject lv_system_0_9 = null;

        EObject lv_system_0_10 = null;

        EObject lv_system_0_11 = null;



        	enterRule();

        try {
            // InternalIoT.g:77:2: ( ( ( (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleServerTypes | lv_system_0_8= ruleServer | lv_system_0_9= ruleDestinationTypes | lv_system_0_10= ruleDestination | lv_system_0_11= ruleFetchData ) ) )+ )
            // InternalIoT.g:78:2: ( ( (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleServerTypes | lv_system_0_8= ruleServer | lv_system_0_9= ruleDestinationTypes | lv_system_0_10= ruleDestination | lv_system_0_11= ruleFetchData ) ) )+
            {
            // InternalIoT.g:78:2: ( ( (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleServerTypes | lv_system_0_8= ruleServer | lv_system_0_9= ruleDestinationTypes | lv_system_0_10= ruleDestination | lv_system_0_11= ruleFetchData ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||LA2_0==13||LA2_0==16||LA2_0==18||(LA2_0>=22 && LA2_0<=23)||(LA2_0>=27 && LA2_0<=28)||(LA2_0>=32 && LA2_0<=34)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIoT.g:79:3: ( (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleServerTypes | lv_system_0_8= ruleServer | lv_system_0_9= ruleDestinationTypes | lv_system_0_10= ruleDestination | lv_system_0_11= ruleFetchData ) )
            	    {
            	    // InternalIoT.g:79:3: ( (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleServerTypes | lv_system_0_8= ruleServer | lv_system_0_9= ruleDestinationTypes | lv_system_0_10= ruleDestination | lv_system_0_11= ruleFetchData ) )
            	    // InternalIoT.g:80:4: (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleServerTypes | lv_system_0_8= ruleServer | lv_system_0_9= ruleDestinationTypes | lv_system_0_10= ruleDestination | lv_system_0_11= ruleFetchData )
            	    {
            	    // InternalIoT.g:80:4: (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleServerTypes | lv_system_0_8= ruleServer | lv_system_0_9= ruleDestinationTypes | lv_system_0_10= ruleDestination | lv_system_0_11= ruleFetchData )
            	    int alt1=11;
            	    switch ( input.LA(1) ) {
            	    case 11:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 13:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case 16:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt1=4;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt1=5;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt1=6;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt1=7;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt1=8;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt1=9;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt1=10;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt1=11;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // InternalIoT.g:81:5: lv_system_0_1= ruleSensorTypes
            	            {

            	            					newCompositeNode(grammarAccess.getSystemAccess().getSystemSensorTypesParserRuleCall_0_0());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_1=ruleSensorTypes();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getSystemRule());
            	            					}
            	            					add(
            	            						current,
            	            						"system",
            	            						lv_system_0_1,
            	            						"org.xtext.sdu.IoT.SensorTypes");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalIoT.g:97:5: lv_system_0_2= ruleSensor
            	            {

            	            					newCompositeNode(grammarAccess.getSystemAccess().getSystemSensorParserRuleCall_0_1());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_2=ruleSensor();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getSystemRule());
            	            					}
            	            					add(
            	            						current,
            	            						"system",
            	            						lv_system_0_2,
            	            						"org.xtext.sdu.IoT.Sensor");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalIoT.g:113:5: lv_system_0_3= ruleSensorGroup
            	            {

            	            					newCompositeNode(grammarAccess.getSystemAccess().getSystemSensorGroupParserRuleCall_0_2());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_3=ruleSensorGroup();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getSystemRule());
            	            					}
            	            					add(
            	            						current,
            	            						"system",
            	            						lv_system_0_3,
            	            						"org.xtext.sdu.IoT.SensorGroup");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 4 :
            	            // InternalIoT.g:129:5: lv_system_0_4= ruleSensorGetMethod
            	            {

            	            					newCompositeNode(grammarAccess.getSystemAccess().getSystemSensorGetMethodParserRuleCall_0_3());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_4=ruleSensorGetMethod();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getSystemRule());
            	            					}
            	            					add(
            	            						current,
            	            						"system",
            	            						lv_system_0_4,
            	            						"org.xtext.sdu.IoT.SensorGetMethod");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 5 :
            	            // InternalIoT.g:145:5: lv_system_0_5= ruleDeviceTypes
            	            {

            	            					newCompositeNode(grammarAccess.getSystemAccess().getSystemDeviceTypesParserRuleCall_0_4());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_5=ruleDeviceTypes();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getSystemRule());
            	            					}
            	            					add(
            	            						current,
            	            						"system",
            	            						lv_system_0_5,
            	            						"org.xtext.sdu.IoT.DeviceTypes");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 6 :
            	            // InternalIoT.g:161:5: lv_system_0_6= ruleDevice
            	            {

            	            					newCompositeNode(grammarAccess.getSystemAccess().getSystemDeviceParserRuleCall_0_5());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_6=ruleDevice();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getSystemRule());
            	            					}
            	            					add(
            	            						current,
            	            						"system",
            	            						lv_system_0_6,
            	            						"org.xtext.sdu.IoT.Device");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 7 :
            	            // InternalIoT.g:177:5: lv_system_0_7= ruleServerTypes
            	            {

            	            					newCompositeNode(grammarAccess.getSystemAccess().getSystemServerTypesParserRuleCall_0_6());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_7=ruleServerTypes();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getSystemRule());
            	            					}
            	            					add(
            	            						current,
            	            						"system",
            	            						lv_system_0_7,
            	            						"org.xtext.sdu.IoT.ServerTypes");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 8 :
            	            // InternalIoT.g:193:5: lv_system_0_8= ruleServer
            	            {

            	            					newCompositeNode(grammarAccess.getSystemAccess().getSystemServerParserRuleCall_0_7());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_8=ruleServer();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getSystemRule());
            	            					}
            	            					add(
            	            						current,
            	            						"system",
            	            						lv_system_0_8,
            	            						"org.xtext.sdu.IoT.Server");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 9 :
            	            // InternalIoT.g:209:5: lv_system_0_9= ruleDestinationTypes
            	            {

            	            					newCompositeNode(grammarAccess.getSystemAccess().getSystemDestinationTypesParserRuleCall_0_8());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_9=ruleDestinationTypes();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getSystemRule());
            	            					}
            	            					add(
            	            						current,
            	            						"system",
            	            						lv_system_0_9,
            	            						"org.xtext.sdu.IoT.DestinationTypes");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 10 :
            	            // InternalIoT.g:225:5: lv_system_0_10= ruleDestination
            	            {

            	            					newCompositeNode(grammarAccess.getSystemAccess().getSystemDestinationParserRuleCall_0_9());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_10=ruleDestination();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getSystemRule());
            	            					}
            	            					add(
            	            						current,
            	            						"system",
            	            						lv_system_0_10,
            	            						"org.xtext.sdu.IoT.Destination");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 11 :
            	            // InternalIoT.g:241:5: lv_system_0_11= ruleFetchData
            	            {

            	            					newCompositeNode(grammarAccess.getSystemAccess().getSystemFetchDataParserRuleCall_0_10());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_11=ruleFetchData();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getSystemRule());
            	            					}
            	            					add(
            	            						current,
            	            						"system",
            	            						lv_system_0_11,
            	            						"org.xtext.sdu.IoT.FetchData");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;

            	    }


            	    }


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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleSensorType"
    // InternalIoT.g:262:1: entryRuleSensorType returns [EObject current=null] : iv_ruleSensorType= ruleSensorType EOF ;
    public final EObject entryRuleSensorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorType = null;


        try {
            // InternalIoT.g:262:51: (iv_ruleSensorType= ruleSensorType EOF )
            // InternalIoT.g:263:2: iv_ruleSensorType= ruleSensorType EOF
            {
             newCompositeNode(grammarAccess.getSensorTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorType=ruleSensorType();

            state._fsp--;

             current =iv_ruleSensorType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensorType"


    // $ANTLR start "ruleSensorType"
    // InternalIoT.g:269:1: ruleSensorType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSensorType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoT.g:275:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoT.g:276:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoT.g:276:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoT.g:277:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoT.g:277:3: (lv_name_0_0= RULE_ID )
            // InternalIoT.g:278:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSensorTypeAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSensorTypeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleSensorType"


    // $ANTLR start "entryRuleSensorTypes"
    // InternalIoT.g:297:1: entryRuleSensorTypes returns [EObject current=null] : iv_ruleSensorTypes= ruleSensorTypes EOF ;
    public final EObject entryRuleSensorTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorTypes = null;


        try {
            // InternalIoT.g:297:52: (iv_ruleSensorTypes= ruleSensorTypes EOF )
            // InternalIoT.g:298:2: iv_ruleSensorTypes= ruleSensorTypes EOF
            {
             newCompositeNode(grammarAccess.getSensorTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorTypes=ruleSensorTypes();

            state._fsp--;

             current =iv_ruleSensorTypes; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensorTypes"


    // $ANTLR start "ruleSensorTypes"
    // InternalIoT.g:304:1: ruleSensorTypes returns [EObject current=null] : (otherlv_0= 'SensorTypes' ( (lv_types_1_0= ruleSensorType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSensorType ) ) )* ) ;
    public final EObject ruleSensorTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:310:2: ( (otherlv_0= 'SensorTypes' ( (lv_types_1_0= ruleSensorType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSensorType ) ) )* ) )
            // InternalIoT.g:311:2: (otherlv_0= 'SensorTypes' ( (lv_types_1_0= ruleSensorType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSensorType ) ) )* )
            {
            // InternalIoT.g:311:2: (otherlv_0= 'SensorTypes' ( (lv_types_1_0= ruleSensorType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSensorType ) ) )* )
            // InternalIoT.g:312:3: otherlv_0= 'SensorTypes' ( (lv_types_1_0= ruleSensorType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSensorType ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorTypesAccess().getSensorTypesKeyword_0());
            		
            // InternalIoT.g:316:3: ( (lv_types_1_0= ruleSensorType ) )
            // InternalIoT.g:317:4: (lv_types_1_0= ruleSensorType )
            {
            // InternalIoT.g:317:4: (lv_types_1_0= ruleSensorType )
            // InternalIoT.g:318:5: lv_types_1_0= ruleSensorType
            {

            					newCompositeNode(grammarAccess.getSensorTypesAccess().getTypesSensorTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_types_1_0=ruleSensorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorTypesRule());
            					}
            					add(
            						current,
            						"types",
            						lv_types_1_0,
            						"org.xtext.sdu.IoT.SensorType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIoT.g:335:3: (otherlv_2= ',' ( (lv_types_3_0= ruleSensorType ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalIoT.g:336:4: otherlv_2= ',' ( (lv_types_3_0= ruleSensorType ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSensorTypesAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalIoT.g:340:4: ( (lv_types_3_0= ruleSensorType ) )
            	    // InternalIoT.g:341:5: (lv_types_3_0= ruleSensorType )
            	    {
            	    // InternalIoT.g:341:5: (lv_types_3_0= ruleSensorType )
            	    // InternalIoT.g:342:6: lv_types_3_0= ruleSensorType
            	    {

            	    						newCompositeNode(grammarAccess.getSensorTypesAccess().getTypesSensorTypeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_types_3_0=ruleSensorType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSensorTypesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_3_0,
            	    							"org.xtext.sdu.IoT.SensorType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleSensorTypes"


    // $ANTLR start "entryRuleSensor"
    // InternalIoT.g:364:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalIoT.g:364:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalIoT.g:365:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalIoT.g:371:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalIoT.g:377:2: ( (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalIoT.g:378:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalIoT.g:378:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) )
            // InternalIoT.g:379:3: otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalIoT.g:383:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoT.g:384:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoT.g:384:4: (lv_name_1_0= RULE_ID )
            // InternalIoT.g:385:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getOfKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getTypeKeyword_3());
            		
            // InternalIoT.g:409:3: ( (otherlv_4= RULE_ID ) )
            // InternalIoT.g:410:4: (otherlv_4= RULE_ID )
            {
            // InternalIoT.g:410:4: (otherlv_4= RULE_ID )
            // InternalIoT.g:411:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getTypeSensorTypeCrossReference_4_0());
            				

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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleSensorGroup"
    // InternalIoT.g:426:1: entryRuleSensorGroup returns [EObject current=null] : iv_ruleSensorGroup= ruleSensorGroup EOF ;
    public final EObject entryRuleSensorGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorGroup = null;


        try {
            // InternalIoT.g:426:52: (iv_ruleSensorGroup= ruleSensorGroup EOF )
            // InternalIoT.g:427:2: iv_ruleSensorGroup= ruleSensorGroup EOF
            {
             newCompositeNode(grammarAccess.getSensorGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorGroup=ruleSensorGroup();

            state._fsp--;

             current =iv_ruleSensorGroup; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensorGroup"


    // $ANTLR start "ruleSensorGroup"
    // InternalIoT.g:433:1: ruleSensorGroup returns [EObject current=null] : (otherlv_0= 'SensorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'include' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) ;
    public final EObject ruleSensorGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalIoT.g:439:2: ( (otherlv_0= 'SensorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'include' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) )
            // InternalIoT.g:440:2: (otherlv_0= 'SensorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'include' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
            {
            // InternalIoT.g:440:2: (otherlv_0= 'SensorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'include' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
            // InternalIoT.g:441:3: otherlv_0= 'SensorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'include' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorGroupAccess().getSensorGroupKeyword_0());
            		
            // InternalIoT.g:445:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoT.g:446:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoT.g:446:4: (lv_name_1_0= RULE_ID )
            // InternalIoT.g:447:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSensorGroupAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorGroupAccess().getIncludeKeyword_2());
            		
            // InternalIoT.g:467:3: ( (otherlv_3= RULE_ID ) )
            // InternalIoT.g:468:4: (otherlv_3= RULE_ID )
            {
            // InternalIoT.g:468:4: (otherlv_3= RULE_ID )
            // InternalIoT.g:469:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorGroupRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_3, grammarAccess.getSensorGroupAccess().getSensorsSensorCrossReference_3_0());
            				

            }


            }

            // InternalIoT.g:480:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalIoT.g:481:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,12,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSensorGroupAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalIoT.g:485:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalIoT.g:486:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalIoT.g:486:5: (otherlv_5= RULE_ID )
            	    // InternalIoT.g:487:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSensorGroupRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    						newLeafNode(otherlv_5, grammarAccess.getSensorGroupAccess().getSensorsSensorCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleSensorGroup"


    // $ANTLR start "entryRuleSensorGetMethod"
    // InternalIoT.g:503:1: entryRuleSensorGetMethod returns [EObject current=null] : iv_ruleSensorGetMethod= ruleSensorGetMethod EOF ;
    public final EObject entryRuleSensorGetMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorGetMethod = null;


        try {
            // InternalIoT.g:503:56: (iv_ruleSensorGetMethod= ruleSensorGetMethod EOF )
            // InternalIoT.g:504:2: iv_ruleSensorGetMethod= ruleSensorGetMethod EOF
            {
             newCompositeNode(grammarAccess.getSensorGetMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorGetMethod=ruleSensorGetMethod();

            state._fsp--;

             current =iv_ruleSensorGetMethod; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensorGetMethod"


    // $ANTLR start "ruleSensorGetMethod"
    // InternalIoT.g:510:1: ruleSensorGetMethod returns [EObject current=null] : (otherlv_0= 'SensorGetMethod' ( (lv_method_1_0= ruleMethod ) ) otherlv_2= 'for' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleSensorGetMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_method_1_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:516:2: ( (otherlv_0= 'SensorGetMethod' ( (lv_method_1_0= ruleMethod ) ) otherlv_2= 'for' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalIoT.g:517:2: (otherlv_0= 'SensorGetMethod' ( (lv_method_1_0= ruleMethod ) ) otherlv_2= 'for' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalIoT.g:517:2: (otherlv_0= 'SensorGetMethod' ( (lv_method_1_0= ruleMethod ) ) otherlv_2= 'for' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) )
            // InternalIoT.g:518:3: otherlv_0= 'SensorGetMethod' ( (lv_method_1_0= ruleMethod ) ) otherlv_2= 'for' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorGetMethodAccess().getSensorGetMethodKeyword_0());
            		
            // InternalIoT.g:522:3: ( (lv_method_1_0= ruleMethod ) )
            // InternalIoT.g:523:4: (lv_method_1_0= ruleMethod )
            {
            // InternalIoT.g:523:4: (lv_method_1_0= ruleMethod )
            // InternalIoT.g:524:5: lv_method_1_0= ruleMethod
            {

            					newCompositeNode(grammarAccess.getSensorGetMethodAccess().getMethodMethodParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_method_1_0=ruleMethod();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorGetMethodRule());
            					}
            					set(
            						current,
            						"method",
            						lv_method_1_0,
            						"org.xtext.sdu.IoT.Method");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorGetMethodAccess().getForKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorGetMethodAccess().getTypeKeyword_3());
            		
            // InternalIoT.g:549:3: ( (otherlv_4= RULE_ID ) )
            // InternalIoT.g:550:4: (otherlv_4= RULE_ID )
            {
            // InternalIoT.g:550:4: (otherlv_4= RULE_ID )
            // InternalIoT.g:551:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorGetMethodRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getSensorGetMethodAccess().getTypeSensorTypeCrossReference_4_0());
            				

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
    // $ANTLR end "ruleSensorGetMethod"


    // $ANTLR start "entryRuleMethod"
    // InternalIoT.g:566:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalIoT.g:566:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalIoT.g:567:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalIoT.g:573:1: ruleMethod returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_parameters_2_0=null;
        Token otherlv_3=null;
        Token lv_parameters_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalIoT.g:579:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* otherlv_5= ')' ) )
            // InternalIoT.g:580:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* otherlv_5= ')' )
            {
            // InternalIoT.g:580:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* otherlv_5= ')' )
            // InternalIoT.g:581:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* otherlv_5= ')'
            {
            // InternalIoT.g:581:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoT.g:582:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoT.g:582:4: (lv_name_0_0= RULE_ID )
            // InternalIoT.g:583:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1());
            		
            // InternalIoT.g:603:3: ( (lv_parameters_2_0= RULE_ID ) )
            // InternalIoT.g:604:4: (lv_parameters_2_0= RULE_ID )
            {
            // InternalIoT.g:604:4: (lv_parameters_2_0= RULE_ID )
            // InternalIoT.g:605:5: lv_parameters_2_0= RULE_ID
            {
            lv_parameters_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_parameters_2_0, grammarAccess.getMethodAccess().getParametersIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodRule());
            					}
            					addWithLastConsumed(
            						current,
            						"parameters",
            						lv_parameters_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIoT.g:621:3: (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==12) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalIoT.g:622:4: otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalIoT.g:626:4: ( (lv_parameters_4_0= RULE_ID ) )
            	    // InternalIoT.g:627:5: (lv_parameters_4_0= RULE_ID )
            	    {
            	    // InternalIoT.g:627:5: (lv_parameters_4_0= RULE_ID )
            	    // InternalIoT.g:628:6: lv_parameters_4_0= RULE_ID
            	    {
            	    lv_parameters_4_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    						newLeafNode(lv_parameters_4_0, grammarAccess.getMethodAccess().getParametersIDTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMethodRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_4_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleDeviceType"
    // InternalIoT.g:653:1: entryRuleDeviceType returns [EObject current=null] : iv_ruleDeviceType= ruleDeviceType EOF ;
    public final EObject entryRuleDeviceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceType = null;


        try {
            // InternalIoT.g:653:51: (iv_ruleDeviceType= ruleDeviceType EOF )
            // InternalIoT.g:654:2: iv_ruleDeviceType= ruleDeviceType EOF
            {
             newCompositeNode(grammarAccess.getDeviceTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeviceType=ruleDeviceType();

            state._fsp--;

             current =iv_ruleDeviceType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeviceType"


    // $ANTLR start "ruleDeviceType"
    // InternalIoT.g:660:1: ruleDeviceType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDeviceType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoT.g:666:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoT.g:667:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoT.g:667:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoT.g:668:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoT.g:668:3: (lv_name_0_0= RULE_ID )
            // InternalIoT.g:669:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getDeviceTypeAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDeviceTypeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleDeviceType"


    // $ANTLR start "entryRuleDeviceTypes"
    // InternalIoT.g:688:1: entryRuleDeviceTypes returns [EObject current=null] : iv_ruleDeviceTypes= ruleDeviceTypes EOF ;
    public final EObject entryRuleDeviceTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceTypes = null;


        try {
            // InternalIoT.g:688:52: (iv_ruleDeviceTypes= ruleDeviceTypes EOF )
            // InternalIoT.g:689:2: iv_ruleDeviceTypes= ruleDeviceTypes EOF
            {
             newCompositeNode(grammarAccess.getDeviceTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeviceTypes=ruleDeviceTypes();

            state._fsp--;

             current =iv_ruleDeviceTypes; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeviceTypes"


    // $ANTLR start "ruleDeviceTypes"
    // InternalIoT.g:695:1: ruleDeviceTypes returns [EObject current=null] : (otherlv_0= 'DeviceTypes' ( (lv_types_1_0= ruleDeviceType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDeviceType ) ) )* ) ;
    public final EObject ruleDeviceTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:701:2: ( (otherlv_0= 'DeviceTypes' ( (lv_types_1_0= ruleDeviceType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDeviceType ) ) )* ) )
            // InternalIoT.g:702:2: (otherlv_0= 'DeviceTypes' ( (lv_types_1_0= ruleDeviceType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDeviceType ) ) )* )
            {
            // InternalIoT.g:702:2: (otherlv_0= 'DeviceTypes' ( (lv_types_1_0= ruleDeviceType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDeviceType ) ) )* )
            // InternalIoT.g:703:3: otherlv_0= 'DeviceTypes' ( (lv_types_1_0= ruleDeviceType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDeviceType ) ) )*
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDeviceTypesAccess().getDeviceTypesKeyword_0());
            		
            // InternalIoT.g:707:3: ( (lv_types_1_0= ruleDeviceType ) )
            // InternalIoT.g:708:4: (lv_types_1_0= ruleDeviceType )
            {
            // InternalIoT.g:708:4: (lv_types_1_0= ruleDeviceType )
            // InternalIoT.g:709:5: lv_types_1_0= ruleDeviceType
            {

            					newCompositeNode(grammarAccess.getDeviceTypesAccess().getTypesDeviceTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_types_1_0=ruleDeviceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeviceTypesRule());
            					}
            					add(
            						current,
            						"types",
            						lv_types_1_0,
            						"org.xtext.sdu.IoT.DeviceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIoT.g:726:3: (otherlv_2= ',' ( (lv_types_3_0= ruleDeviceType ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalIoT.g:727:4: otherlv_2= ',' ( (lv_types_3_0= ruleDeviceType ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDeviceTypesAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalIoT.g:731:4: ( (lv_types_3_0= ruleDeviceType ) )
            	    // InternalIoT.g:732:5: (lv_types_3_0= ruleDeviceType )
            	    {
            	    // InternalIoT.g:732:5: (lv_types_3_0= ruleDeviceType )
            	    // InternalIoT.g:733:6: lv_types_3_0= ruleDeviceType
            	    {

            	    						newCompositeNode(grammarAccess.getDeviceTypesAccess().getTypesDeviceTypeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_types_3_0=ruleDeviceType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeviceTypesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_3_0,
            	    							"org.xtext.sdu.IoT.DeviceType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "ruleDeviceTypes"


    // $ANTLR start "entryRuleDevice"
    // InternalIoT.g:755:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalIoT.g:755:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalIoT.g:756:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalIoT.g:762:1: ruleDevice returns [EObject current=null] : (otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'contains' ( (otherlv_6= 'device' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= 'group' ( (otherlv_9= RULE_ID ) ) ) ) ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalIoT.g:768:2: ( (otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'contains' ( (otherlv_6= 'device' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= 'group' ( (otherlv_9= RULE_ID ) ) ) ) ) )
            // InternalIoT.g:769:2: (otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'contains' ( (otherlv_6= 'device' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= 'group' ( (otherlv_9= RULE_ID ) ) ) ) )
            {
            // InternalIoT.g:769:2: (otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'contains' ( (otherlv_6= 'device' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= 'group' ( (otherlv_9= RULE_ID ) ) ) ) )
            // InternalIoT.g:770:3: otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'contains' ( (otherlv_6= 'device' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= 'group' ( (otherlv_9= RULE_ID ) ) ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDeviceAccess().getDeviceKeyword_0());
            		
            // InternalIoT.g:774:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoT.g:775:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoT.g:775:4: (lv_name_1_0= RULE_ID )
            // InternalIoT.g:776:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDeviceAccess().getOfKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getDeviceAccess().getTypeKeyword_3());
            		
            // InternalIoT.g:800:3: ( (otherlv_4= RULE_ID ) )
            // InternalIoT.g:801:4: (otherlv_4= RULE_ID )
            {
            // InternalIoT.g:801:4: (otherlv_4= RULE_ID )
            // InternalIoT.g:802:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_4, grammarAccess.getDeviceAccess().getTypeDeviceTypeCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getDeviceAccess().getContainsKeyword_5());
            		
            // InternalIoT.g:817:3: ( (otherlv_6= 'device' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= 'group' ( (otherlv_9= RULE_ID ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            else if ( (LA7_0==26) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalIoT.g:818:4: (otherlv_6= 'device' ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalIoT.g:818:4: (otherlv_6= 'device' ( (otherlv_7= RULE_ID ) ) )
                    // InternalIoT.g:819:5: otherlv_6= 'device' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_4); 

                    					newLeafNode(otherlv_6, grammarAccess.getDeviceAccess().getDeviceKeyword_6_0_0());
                    				
                    // InternalIoT.g:823:5: ( (otherlv_7= RULE_ID ) )
                    // InternalIoT.g:824:6: (otherlv_7= RULE_ID )
                    {
                    // InternalIoT.g:824:6: (otherlv_7= RULE_ID )
                    // InternalIoT.g:825:7: otherlv_7= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDeviceRule());
                    							}
                    						
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                    							newLeafNode(otherlv_7, grammarAccess.getDeviceAccess().getDevicesDeviceCrossReference_6_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:838:4: (otherlv_8= 'group' ( (otherlv_9= RULE_ID ) ) )
                    {
                    // InternalIoT.g:838:4: (otherlv_8= 'group' ( (otherlv_9= RULE_ID ) ) )
                    // InternalIoT.g:839:5: otherlv_8= 'group' ( (otherlv_9= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_4); 

                    					newLeafNode(otherlv_8, grammarAccess.getDeviceAccess().getGroupKeyword_6_1_0());
                    				
                    // InternalIoT.g:843:5: ( (otherlv_9= RULE_ID ) )
                    // InternalIoT.g:844:6: (otherlv_9= RULE_ID )
                    {
                    // InternalIoT.g:844:6: (otherlv_9= RULE_ID )
                    // InternalIoT.g:845:7: otherlv_9= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDeviceRule());
                    							}
                    						
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_2); 

                    							newLeafNode(otherlv_9, grammarAccess.getDeviceAccess().getDevicesSensorGroupCrossReference_6_1_1_0());
                    						

                    }


                    }


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
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleServerType"
    // InternalIoT.g:862:1: entryRuleServerType returns [EObject current=null] : iv_ruleServerType= ruleServerType EOF ;
    public final EObject entryRuleServerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServerType = null;


        try {
            // InternalIoT.g:862:51: (iv_ruleServerType= ruleServerType EOF )
            // InternalIoT.g:863:2: iv_ruleServerType= ruleServerType EOF
            {
             newCompositeNode(grammarAccess.getServerTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServerType=ruleServerType();

            state._fsp--;

             current =iv_ruleServerType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleServerType"


    // $ANTLR start "ruleServerType"
    // InternalIoT.g:869:1: ruleServerType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleServerType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoT.g:875:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoT.g:876:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoT.g:876:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoT.g:877:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoT.g:877:3: (lv_name_0_0= RULE_ID )
            // InternalIoT.g:878:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getServerTypeAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getServerTypeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleServerType"


    // $ANTLR start "entryRuleServerTypes"
    // InternalIoT.g:897:1: entryRuleServerTypes returns [EObject current=null] : iv_ruleServerTypes= ruleServerTypes EOF ;
    public final EObject entryRuleServerTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServerTypes = null;


        try {
            // InternalIoT.g:897:52: (iv_ruleServerTypes= ruleServerTypes EOF )
            // InternalIoT.g:898:2: iv_ruleServerTypes= ruleServerTypes EOF
            {
             newCompositeNode(grammarAccess.getServerTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServerTypes=ruleServerTypes();

            state._fsp--;

             current =iv_ruleServerTypes; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleServerTypes"


    // $ANTLR start "ruleServerTypes"
    // InternalIoT.g:904:1: ruleServerTypes returns [EObject current=null] : (otherlv_0= 'ServerTypes' ( (lv_types_1_0= ruleServerType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleServerType ) ) )* ) ;
    public final EObject ruleServerTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:910:2: ( (otherlv_0= 'ServerTypes' ( (lv_types_1_0= ruleServerType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleServerType ) ) )* ) )
            // InternalIoT.g:911:2: (otherlv_0= 'ServerTypes' ( (lv_types_1_0= ruleServerType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleServerType ) ) )* )
            {
            // InternalIoT.g:911:2: (otherlv_0= 'ServerTypes' ( (lv_types_1_0= ruleServerType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleServerType ) ) )* )
            // InternalIoT.g:912:3: otherlv_0= 'ServerTypes' ( (lv_types_1_0= ruleServerType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleServerType ) ) )*
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServerTypesAccess().getServerTypesKeyword_0());
            		
            // InternalIoT.g:916:3: ( (lv_types_1_0= ruleServerType ) )
            // InternalIoT.g:917:4: (lv_types_1_0= ruleServerType )
            {
            // InternalIoT.g:917:4: (lv_types_1_0= ruleServerType )
            // InternalIoT.g:918:5: lv_types_1_0= ruleServerType
            {

            					newCompositeNode(grammarAccess.getServerTypesAccess().getTypesServerTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_types_1_0=ruleServerType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServerTypesRule());
            					}
            					add(
            						current,
            						"types",
            						lv_types_1_0,
            						"org.xtext.sdu.IoT.ServerType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIoT.g:935:3: (otherlv_2= ',' ( (lv_types_3_0= ruleServerType ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==12) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalIoT.g:936:4: otherlv_2= ',' ( (lv_types_3_0= ruleServerType ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getServerTypesAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalIoT.g:940:4: ( (lv_types_3_0= ruleServerType ) )
            	    // InternalIoT.g:941:5: (lv_types_3_0= ruleServerType )
            	    {
            	    // InternalIoT.g:941:5: (lv_types_3_0= ruleServerType )
            	    // InternalIoT.g:942:6: lv_types_3_0= ruleServerType
            	    {

            	    						newCompositeNode(grammarAccess.getServerTypesAccess().getTypesServerTypeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_types_3_0=ruleServerType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getServerTypesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_3_0,
            	    							"org.xtext.sdu.IoT.ServerType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "ruleServerTypes"


    // $ANTLR start "entryRuleServer"
    // InternalIoT.g:964:1: entryRuleServer returns [EObject current=null] : iv_ruleServer= ruleServer EOF ;
    public final EObject entryRuleServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServer = null;


        try {
            // InternalIoT.g:964:47: (iv_ruleServer= ruleServer EOF )
            // InternalIoT.g:965:2: iv_ruleServer= ruleServer EOF
            {
             newCompositeNode(grammarAccess.getServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServer=ruleServer();

            state._fsp--;

             current =iv_ruleServer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleServer"


    // $ANTLR start "ruleServer"
    // InternalIoT.g:971:1: ruleServer returns [EObject current=null] : (otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'listens' otherlv_6= 'on' ( (lv_ip_7_0= ruleIp ) ) otherlv_8= 'and' ( (lv_port_9_0= rulePortnumber ) ) ) ;
    public final EObject ruleServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_ip_7_0 = null;

        EObject lv_port_9_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:977:2: ( (otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'listens' otherlv_6= 'on' ( (lv_ip_7_0= ruleIp ) ) otherlv_8= 'and' ( (lv_port_9_0= rulePortnumber ) ) ) )
            // InternalIoT.g:978:2: (otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'listens' otherlv_6= 'on' ( (lv_ip_7_0= ruleIp ) ) otherlv_8= 'and' ( (lv_port_9_0= rulePortnumber ) ) )
            {
            // InternalIoT.g:978:2: (otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'listens' otherlv_6= 'on' ( (lv_ip_7_0= ruleIp ) ) otherlv_8= 'and' ( (lv_port_9_0= rulePortnumber ) ) )
            // InternalIoT.g:979:3: otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'listens' otherlv_6= 'on' ( (lv_ip_7_0= ruleIp ) ) otherlv_8= 'and' ( (lv_port_9_0= rulePortnumber ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServerAccess().getServerKeyword_0());
            		
            // InternalIoT.g:983:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoT.g:984:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoT.g:984:4: (lv_name_1_0= RULE_ID )
            // InternalIoT.g:985:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getServerAccess().getOfKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getServerAccess().getTypeKeyword_3());
            		
            // InternalIoT.g:1009:3: ( (otherlv_4= RULE_ID ) )
            // InternalIoT.g:1010:4: (otherlv_4= RULE_ID )
            {
            // InternalIoT.g:1010:4: (otherlv_4= RULE_ID )
            // InternalIoT.g:1011:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServerRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_4, grammarAccess.getServerAccess().getTypeServerTypeCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getServerAccess().getListensKeyword_5());
            		
            otherlv_6=(Token)match(input,30,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getServerAccess().getOnKeyword_6());
            		
            // InternalIoT.g:1030:3: ( (lv_ip_7_0= ruleIp ) )
            // InternalIoT.g:1031:4: (lv_ip_7_0= ruleIp )
            {
            // InternalIoT.g:1031:4: (lv_ip_7_0= ruleIp )
            // InternalIoT.g:1032:5: lv_ip_7_0= ruleIp
            {

            					newCompositeNode(grammarAccess.getServerAccess().getIpIpParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_17);
            lv_ip_7_0=ruleIp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServerRule());
            					}
            					set(
            						current,
            						"ip",
            						lv_ip_7_0,
            						"org.xtext.sdu.IoT.Ip");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,31,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getServerAccess().getAndKeyword_8());
            		
            // InternalIoT.g:1053:3: ( (lv_port_9_0= rulePortnumber ) )
            // InternalIoT.g:1054:4: (lv_port_9_0= rulePortnumber )
            {
            // InternalIoT.g:1054:4: (lv_port_9_0= rulePortnumber )
            // InternalIoT.g:1055:5: lv_port_9_0= rulePortnumber
            {

            					newCompositeNode(grammarAccess.getServerAccess().getPortPortnumberParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_port_9_0=rulePortnumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServerRule());
            					}
            					set(
            						current,
            						"port",
            						lv_port_9_0,
            						"org.xtext.sdu.IoT.Portnumber");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleServer"


    // $ANTLR start "entryRuleDestinationType"
    // InternalIoT.g:1076:1: entryRuleDestinationType returns [EObject current=null] : iv_ruleDestinationType= ruleDestinationType EOF ;
    public final EObject entryRuleDestinationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestinationType = null;


        try {
            // InternalIoT.g:1076:56: (iv_ruleDestinationType= ruleDestinationType EOF )
            // InternalIoT.g:1077:2: iv_ruleDestinationType= ruleDestinationType EOF
            {
             newCompositeNode(grammarAccess.getDestinationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDestinationType=ruleDestinationType();

            state._fsp--;

             current =iv_ruleDestinationType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDestinationType"


    // $ANTLR start "ruleDestinationType"
    // InternalIoT.g:1083:1: ruleDestinationType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDestinationType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoT.g:1089:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoT.g:1090:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoT.g:1090:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoT.g:1091:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoT.g:1091:3: (lv_name_0_0= RULE_ID )
            // InternalIoT.g:1092:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getDestinationTypeAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDestinationTypeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleDestinationType"


    // $ANTLR start "entryRuleDestinationTypes"
    // InternalIoT.g:1111:1: entryRuleDestinationTypes returns [EObject current=null] : iv_ruleDestinationTypes= ruleDestinationTypes EOF ;
    public final EObject entryRuleDestinationTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestinationTypes = null;


        try {
            // InternalIoT.g:1111:57: (iv_ruleDestinationTypes= ruleDestinationTypes EOF )
            // InternalIoT.g:1112:2: iv_ruleDestinationTypes= ruleDestinationTypes EOF
            {
             newCompositeNode(grammarAccess.getDestinationTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDestinationTypes=ruleDestinationTypes();

            state._fsp--;

             current =iv_ruleDestinationTypes; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDestinationTypes"


    // $ANTLR start "ruleDestinationTypes"
    // InternalIoT.g:1118:1: ruleDestinationTypes returns [EObject current=null] : (otherlv_0= 'DestinationTypes' ( (lv_types_1_0= ruleDestinationType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDestinationType ) ) )* ) ;
    public final EObject ruleDestinationTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:1124:2: ( (otherlv_0= 'DestinationTypes' ( (lv_types_1_0= ruleDestinationType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDestinationType ) ) )* ) )
            // InternalIoT.g:1125:2: (otherlv_0= 'DestinationTypes' ( (lv_types_1_0= ruleDestinationType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDestinationType ) ) )* )
            {
            // InternalIoT.g:1125:2: (otherlv_0= 'DestinationTypes' ( (lv_types_1_0= ruleDestinationType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDestinationType ) ) )* )
            // InternalIoT.g:1126:3: otherlv_0= 'DestinationTypes' ( (lv_types_1_0= ruleDestinationType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDestinationType ) ) )*
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDestinationTypesAccess().getDestinationTypesKeyword_0());
            		
            // InternalIoT.g:1130:3: ( (lv_types_1_0= ruleDestinationType ) )
            // InternalIoT.g:1131:4: (lv_types_1_0= ruleDestinationType )
            {
            // InternalIoT.g:1131:4: (lv_types_1_0= ruleDestinationType )
            // InternalIoT.g:1132:5: lv_types_1_0= ruleDestinationType
            {

            					newCompositeNode(grammarAccess.getDestinationTypesAccess().getTypesDestinationTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_types_1_0=ruleDestinationType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDestinationTypesRule());
            					}
            					add(
            						current,
            						"types",
            						lv_types_1_0,
            						"org.xtext.sdu.IoT.DestinationType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIoT.g:1149:3: (otherlv_2= ',' ( (lv_types_3_0= ruleDestinationType ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==12) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalIoT.g:1150:4: otherlv_2= ',' ( (lv_types_3_0= ruleDestinationType ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDestinationTypesAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalIoT.g:1154:4: ( (lv_types_3_0= ruleDestinationType ) )
            	    // InternalIoT.g:1155:5: (lv_types_3_0= ruleDestinationType )
            	    {
            	    // InternalIoT.g:1155:5: (lv_types_3_0= ruleDestinationType )
            	    // InternalIoT.g:1156:6: lv_types_3_0= ruleDestinationType
            	    {

            	    						newCompositeNode(grammarAccess.getDestinationTypesAccess().getTypesDestinationTypeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_types_3_0=ruleDestinationType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDestinationTypesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_3_0,
            	    							"org.xtext.sdu.IoT.DestinationType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


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
    // $ANTLR end "ruleDestinationTypes"


    // $ANTLR start "entryRuleDestination"
    // InternalIoT.g:1178:1: entryRuleDestination returns [EObject current=null] : iv_ruleDestination= ruleDestination EOF ;
    public final EObject entryRuleDestination() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestination = null;


        try {
            // InternalIoT.g:1178:52: (iv_ruleDestination= ruleDestination EOF )
            // InternalIoT.g:1179:2: iv_ruleDestination= ruleDestination EOF
            {
             newCompositeNode(grammarAccess.getDestinationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDestination=ruleDestination();

            state._fsp--;

             current =iv_ruleDestination; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDestination"


    // $ANTLR start "ruleDestination"
    // InternalIoT.g:1185:1: ruleDestination returns [EObject current=null] : (otherlv_0= 'Destination' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDestination() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalIoT.g:1191:2: ( (otherlv_0= 'Destination' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalIoT.g:1192:2: (otherlv_0= 'Destination' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalIoT.g:1192:2: (otherlv_0= 'Destination' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) )
            // InternalIoT.g:1193:3: otherlv_0= 'Destination' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDestinationAccess().getDestinationKeyword_0());
            		
            // InternalIoT.g:1197:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoT.g:1198:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoT.g:1198:4: (lv_name_1_0= RULE_ID )
            // InternalIoT.g:1199:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDestinationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDestinationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDestinationAccess().getOfKeyword_2());
            		
            // InternalIoT.g:1219:3: ( (otherlv_3= RULE_ID ) )
            // InternalIoT.g:1220:4: (otherlv_3= RULE_ID )
            {
            // InternalIoT.g:1220:4: (otherlv_3= RULE_ID )
            // InternalIoT.g:1221:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDestinationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getDestinationAccess().getTypeDestinationTypeCrossReference_3_0());
            				

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
    // $ANTLR end "ruleDestination"


    // $ANTLR start "entryRuleFetchData"
    // InternalIoT.g:1236:1: entryRuleFetchData returns [EObject current=null] : iv_ruleFetchData= ruleFetchData EOF ;
    public final EObject entryRuleFetchData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFetchData = null;


        try {
            // InternalIoT.g:1236:50: (iv_ruleFetchData= ruleFetchData EOF )
            // InternalIoT.g:1237:2: iv_ruleFetchData= ruleFetchData EOF
            {
             newCompositeNode(grammarAccess.getFetchDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFetchData=ruleFetchData();

            state._fsp--;

             current =iv_ruleFetchData; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFetchData"


    // $ANTLR start "ruleFetchData"
    // InternalIoT.g:1243:1: ruleFetchData returns [EObject current=null] : (otherlv_0= 'Fetch' otherlv_1= 'data' otherlv_2= 'from' ( (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'group' ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= 'to' ( (otherlv_8= 'destination' ( (otherlv_9= RULE_ID ) ) ) | (otherlv_10= 'server' ( (otherlv_11= RULE_ID ) ) ) ) ( ( (lv_conExp_12_0= ruleFetchDataExpression ) ) | ( (lv_conExp_13_0= ruleFetchDataCondition ) ) )? ) ;
    public final EObject ruleFetchData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_conExp_12_0 = null;

        EObject lv_conExp_13_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:1249:2: ( (otherlv_0= 'Fetch' otherlv_1= 'data' otherlv_2= 'from' ( (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'group' ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= 'to' ( (otherlv_8= 'destination' ( (otherlv_9= RULE_ID ) ) ) | (otherlv_10= 'server' ( (otherlv_11= RULE_ID ) ) ) ) ( ( (lv_conExp_12_0= ruleFetchDataExpression ) ) | ( (lv_conExp_13_0= ruleFetchDataCondition ) ) )? ) )
            // InternalIoT.g:1250:2: (otherlv_0= 'Fetch' otherlv_1= 'data' otherlv_2= 'from' ( (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'group' ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= 'to' ( (otherlv_8= 'destination' ( (otherlv_9= RULE_ID ) ) ) | (otherlv_10= 'server' ( (otherlv_11= RULE_ID ) ) ) ) ( ( (lv_conExp_12_0= ruleFetchDataExpression ) ) | ( (lv_conExp_13_0= ruleFetchDataCondition ) ) )? )
            {
            // InternalIoT.g:1250:2: (otherlv_0= 'Fetch' otherlv_1= 'data' otherlv_2= 'from' ( (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'group' ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= 'to' ( (otherlv_8= 'destination' ( (otherlv_9= RULE_ID ) ) ) | (otherlv_10= 'server' ( (otherlv_11= RULE_ID ) ) ) ) ( ( (lv_conExp_12_0= ruleFetchDataExpression ) ) | ( (lv_conExp_13_0= ruleFetchDataCondition ) ) )? )
            // InternalIoT.g:1251:3: otherlv_0= 'Fetch' otherlv_1= 'data' otherlv_2= 'from' ( (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'group' ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= 'to' ( (otherlv_8= 'destination' ( (otherlv_9= RULE_ID ) ) ) | (otherlv_10= 'server' ( (otherlv_11= RULE_ID ) ) ) ) ( ( (lv_conExp_12_0= ruleFetchDataExpression ) ) | ( (lv_conExp_13_0= ruleFetchDataCondition ) ) )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getFetchDataAccess().getFetchKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getFetchDataAccess().getDataKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getFetchDataAccess().getFromKeyword_2());
            		
            // InternalIoT.g:1263:3: ( (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'group' ( (otherlv_6= RULE_ID ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalIoT.g:1264:4: (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalIoT.g:1264:4: (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) )
                    // InternalIoT.g:1265:5: otherlv_3= 'type' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_4); 

                    					newLeafNode(otherlv_3, grammarAccess.getFetchDataAccess().getTypeKeyword_3_0_0());
                    				
                    // InternalIoT.g:1269:5: ( (otherlv_4= RULE_ID ) )
                    // InternalIoT.g:1270:6: (otherlv_4= RULE_ID )
                    {
                    // InternalIoT.g:1270:6: (otherlv_4= RULE_ID )
                    // InternalIoT.g:1271:7: otherlv_4= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFetchDataRule());
                    							}
                    						
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_21); 

                    							newLeafNode(otherlv_4, grammarAccess.getFetchDataAccess().getFilterSensorTypeCrossReference_3_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:1284:4: (otherlv_5= 'group' ( (otherlv_6= RULE_ID ) ) )
                    {
                    // InternalIoT.g:1284:4: (otherlv_5= 'group' ( (otherlv_6= RULE_ID ) ) )
                    // InternalIoT.g:1285:5: otherlv_5= 'group' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_4); 

                    					newLeafNode(otherlv_5, grammarAccess.getFetchDataAccess().getGroupKeyword_3_1_0());
                    				
                    // InternalIoT.g:1289:5: ( (otherlv_6= RULE_ID ) )
                    // InternalIoT.g:1290:6: (otherlv_6= RULE_ID )
                    {
                    // InternalIoT.g:1290:6: (otherlv_6= RULE_ID )
                    // InternalIoT.g:1291:7: otherlv_6= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFetchDataRule());
                    							}
                    						
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_21); 

                    							newLeafNode(otherlv_6, grammarAccess.getFetchDataAccess().getFilterSensorGroupCrossReference_3_1_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,37,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getFetchDataAccess().getToKeyword_4());
            		
            // InternalIoT.g:1308:3: ( (otherlv_8= 'destination' ( (otherlv_9= RULE_ID ) ) ) | (otherlv_10= 'server' ( (otherlv_11= RULE_ID ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            else if ( (LA11_0==39) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalIoT.g:1309:4: (otherlv_8= 'destination' ( (otherlv_9= RULE_ID ) ) )
                    {
                    // InternalIoT.g:1309:4: (otherlv_8= 'destination' ( (otherlv_9= RULE_ID ) ) )
                    // InternalIoT.g:1310:5: otherlv_8= 'destination' ( (otherlv_9= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,38,FOLLOW_4); 

                    					newLeafNode(otherlv_8, grammarAccess.getFetchDataAccess().getDestinationKeyword_5_0_0());
                    				
                    // InternalIoT.g:1314:5: ( (otherlv_9= RULE_ID ) )
                    // InternalIoT.g:1315:6: (otherlv_9= RULE_ID )
                    {
                    // InternalIoT.g:1315:6: (otherlv_9= RULE_ID )
                    // InternalIoT.g:1316:7: otherlv_9= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFetchDataRule());
                    							}
                    						
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_23); 

                    							newLeafNode(otherlv_9, grammarAccess.getFetchDataAccess().getDestinationDestinationCrossReference_5_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:1329:4: (otherlv_10= 'server' ( (otherlv_11= RULE_ID ) ) )
                    {
                    // InternalIoT.g:1329:4: (otherlv_10= 'server' ( (otherlv_11= RULE_ID ) ) )
                    // InternalIoT.g:1330:5: otherlv_10= 'server' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,39,FOLLOW_4); 

                    					newLeafNode(otherlv_10, grammarAccess.getFetchDataAccess().getServerKeyword_5_1_0());
                    				
                    // InternalIoT.g:1334:5: ( (otherlv_11= RULE_ID ) )
                    // InternalIoT.g:1335:6: (otherlv_11= RULE_ID )
                    {
                    // InternalIoT.g:1335:6: (otherlv_11= RULE_ID )
                    // InternalIoT.g:1336:7: otherlv_11= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFetchDataRule());
                    							}
                    						
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_23); 

                    							newLeafNode(otherlv_11, grammarAccess.getFetchDataAccess().getDestinationServerCrossReference_5_1_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalIoT.g:1349:3: ( ( (lv_conExp_12_0= ruleFetchDataExpression ) ) | ( (lv_conExp_13_0= ruleFetchDataCondition ) ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=41 && LA12_0<=42)) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // InternalIoT.g:1350:4: ( (lv_conExp_12_0= ruleFetchDataExpression ) )
                    {
                    // InternalIoT.g:1350:4: ( (lv_conExp_12_0= ruleFetchDataExpression ) )
                    // InternalIoT.g:1351:5: (lv_conExp_12_0= ruleFetchDataExpression )
                    {
                    // InternalIoT.g:1351:5: (lv_conExp_12_0= ruleFetchDataExpression )
                    // InternalIoT.g:1352:6: lv_conExp_12_0= ruleFetchDataExpression
                    {

                    						newCompositeNode(grammarAccess.getFetchDataAccess().getConExpFetchDataExpressionParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_conExp_12_0=ruleFetchDataExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFetchDataRule());
                    						}
                    						set(
                    							current,
                    							"conExp",
                    							lv_conExp_12_0,
                    							"org.xtext.sdu.IoT.FetchDataExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:1370:4: ( (lv_conExp_13_0= ruleFetchDataCondition ) )
                    {
                    // InternalIoT.g:1370:4: ( (lv_conExp_13_0= ruleFetchDataCondition ) )
                    // InternalIoT.g:1371:5: (lv_conExp_13_0= ruleFetchDataCondition )
                    {
                    // InternalIoT.g:1371:5: (lv_conExp_13_0= ruleFetchDataCondition )
                    // InternalIoT.g:1372:6: lv_conExp_13_0= ruleFetchDataCondition
                    {

                    						newCompositeNode(grammarAccess.getFetchDataAccess().getConExpFetchDataConditionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_conExp_13_0=ruleFetchDataCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFetchDataRule());
                    						}
                    						set(
                    							current,
                    							"conExp",
                    							lv_conExp_13_0,
                    							"org.xtext.sdu.IoT.FetchDataCondition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleFetchData"


    // $ANTLR start "entryRuleFetchDataExpression"
    // InternalIoT.g:1394:1: entryRuleFetchDataExpression returns [EObject current=null] : iv_ruleFetchDataExpression= ruleFetchDataExpression EOF ;
    public final EObject entryRuleFetchDataExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFetchDataExpression = null;


        try {
            // InternalIoT.g:1394:60: (iv_ruleFetchDataExpression= ruleFetchDataExpression EOF )
            // InternalIoT.g:1395:2: iv_ruleFetchDataExpression= ruleFetchDataExpression EOF
            {
             newCompositeNode(grammarAccess.getFetchDataExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFetchDataExpression=ruleFetchDataExpression();

            state._fsp--;

             current =iv_ruleFetchDataExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFetchDataExpression"


    // $ANTLR start "ruleFetchDataExpression"
    // InternalIoT.g:1401:1: ruleFetchDataExpression returns [EObject current=null] : (otherlv_0= 'every' ( (lv_duration_1_0= ruleTime ) ) ( (lv_timeUnit_2_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleFetchDataExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_duration_1_0 = null;

        AntlrDatatypeRuleToken lv_timeUnit_2_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:1407:2: ( (otherlv_0= 'every' ( (lv_duration_1_0= ruleTime ) ) ( (lv_timeUnit_2_0= ruleTimeUnit ) ) ) )
            // InternalIoT.g:1408:2: (otherlv_0= 'every' ( (lv_duration_1_0= ruleTime ) ) ( (lv_timeUnit_2_0= ruleTimeUnit ) ) )
            {
            // InternalIoT.g:1408:2: (otherlv_0= 'every' ( (lv_duration_1_0= ruleTime ) ) ( (lv_timeUnit_2_0= ruleTimeUnit ) ) )
            // InternalIoT.g:1409:3: otherlv_0= 'every' ( (lv_duration_1_0= ruleTime ) ) ( (lv_timeUnit_2_0= ruleTimeUnit ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getFetchDataExpressionAccess().getEveryKeyword_0());
            		
            // InternalIoT.g:1413:3: ( (lv_duration_1_0= ruleTime ) )
            // InternalIoT.g:1414:4: (lv_duration_1_0= ruleTime )
            {
            // InternalIoT.g:1414:4: (lv_duration_1_0= ruleTime )
            // InternalIoT.g:1415:5: lv_duration_1_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getFetchDataExpressionAccess().getDurationTimeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_duration_1_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFetchDataExpressionRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_1_0,
            						"org.xtext.sdu.IoT.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIoT.g:1432:3: ( (lv_timeUnit_2_0= ruleTimeUnit ) )
            // InternalIoT.g:1433:4: (lv_timeUnit_2_0= ruleTimeUnit )
            {
            // InternalIoT.g:1433:4: (lv_timeUnit_2_0= ruleTimeUnit )
            // InternalIoT.g:1434:5: lv_timeUnit_2_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getFetchDataExpressionAccess().getTimeUnitTimeUnitParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_timeUnit_2_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFetchDataExpressionRule());
            					}
            					set(
            						current,
            						"timeUnit",
            						lv_timeUnit_2_0,
            						"org.xtext.sdu.IoT.TimeUnit");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleFetchDataExpression"


    // $ANTLR start "entryRuleFetchDataCondition"
    // InternalIoT.g:1455:1: entryRuleFetchDataCondition returns [EObject current=null] : iv_ruleFetchDataCondition= ruleFetchDataCondition EOF ;
    public final EObject entryRuleFetchDataCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFetchDataCondition = null;


        try {
            // InternalIoT.g:1455:59: (iv_ruleFetchDataCondition= ruleFetchDataCondition EOF )
            // InternalIoT.g:1456:2: iv_ruleFetchDataCondition= ruleFetchDataCondition EOF
            {
             newCompositeNode(grammarAccess.getFetchDataConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFetchDataCondition=ruleFetchDataCondition();

            state._fsp--;

             current =iv_ruleFetchDataCondition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFetchDataCondition"


    // $ANTLR start "ruleFetchDataCondition"
    // InternalIoT.g:1462:1: ruleFetchDataCondition returns [EObject current=null] : ( (otherlv_0= 'when' | otherlv_1= 'if' ) ( (lv_condition_2_0= ruleCondition ) ) ) ;
    public final EObject ruleFetchDataCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:1468:2: ( ( (otherlv_0= 'when' | otherlv_1= 'if' ) ( (lv_condition_2_0= ruleCondition ) ) ) )
            // InternalIoT.g:1469:2: ( (otherlv_0= 'when' | otherlv_1= 'if' ) ( (lv_condition_2_0= ruleCondition ) ) )
            {
            // InternalIoT.g:1469:2: ( (otherlv_0= 'when' | otherlv_1= 'if' ) ( (lv_condition_2_0= ruleCondition ) ) )
            // InternalIoT.g:1470:3: (otherlv_0= 'when' | otherlv_1= 'if' ) ( (lv_condition_2_0= ruleCondition ) )
            {
            // InternalIoT.g:1470:3: (otherlv_0= 'when' | otherlv_1= 'if' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            else if ( (LA13_0==42) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalIoT.g:1471:4: otherlv_0= 'when'
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_25); 

                    				newLeafNode(otherlv_0, grammarAccess.getFetchDataConditionAccess().getWhenKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalIoT.g:1476:4: otherlv_1= 'if'
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_25); 

                    				newLeafNode(otherlv_1, grammarAccess.getFetchDataConditionAccess().getIfKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalIoT.g:1481:3: ( (lv_condition_2_0= ruleCondition ) )
            // InternalIoT.g:1482:4: (lv_condition_2_0= ruleCondition )
            {
            // InternalIoT.g:1482:4: (lv_condition_2_0= ruleCondition )
            // InternalIoT.g:1483:5: lv_condition_2_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getFetchDataConditionAccess().getConditionConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_2_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFetchDataConditionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"org.xtext.sdu.IoT.Condition");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleFetchDataCondition"


    // $ANTLR start "entryRuleTimeUnit"
    // InternalIoT.g:1504:1: entryRuleTimeUnit returns [String current=null] : iv_ruleTimeUnit= ruleTimeUnit EOF ;
    public final String entryRuleTimeUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimeUnit = null;


        try {
            // InternalIoT.g:1504:48: (iv_ruleTimeUnit= ruleTimeUnit EOF )
            // InternalIoT.g:1505:2: iv_ruleTimeUnit= ruleTimeUnit EOF
            {
             newCompositeNode(grammarAccess.getTimeUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeUnit=ruleTimeUnit();

            state._fsp--;

             current =iv_ruleTimeUnit.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTimeUnit"


    // $ANTLR start "ruleTimeUnit"
    // InternalIoT.g:1511:1: ruleTimeUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ms' | kw= 's' | kw= 'm' | kw= 'h' ) ;
    public final AntlrDatatypeRuleToken ruleTimeUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalIoT.g:1517:2: ( (kw= 'ms' | kw= 's' | kw= 'm' | kw= 'h' ) )
            // InternalIoT.g:1518:2: (kw= 'ms' | kw= 's' | kw= 'm' | kw= 'h' )
            {
            // InternalIoT.g:1518:2: (kw= 'ms' | kw= 's' | kw= 'm' | kw= 'h' )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt14=1;
                }
                break;
            case 44:
                {
                alt14=2;
                }
                break;
            case 45:
                {
                alt14=3;
                }
                break;
            case 46:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalIoT.g:1519:3: kw= 'ms'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTimeUnitAccess().getMsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalIoT.g:1525:3: kw= 's'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTimeUnitAccess().getSKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalIoT.g:1531:3: kw= 'm'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTimeUnitAccess().getMKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalIoT.g:1537:3: kw= 'h'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTimeUnitAccess().getHKeyword_3());
                    		

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
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "entryRuleCondition"
    // InternalIoT.g:1546:1: entryRuleCondition returns [String current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final String entryRuleCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCondition = null;


        try {
            // InternalIoT.g:1546:49: (iv_ruleCondition= ruleCondition EOF )
            // InternalIoT.g:1547:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalIoT.g:1553:1: ruleCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '_??' ;
    public final AntlrDatatypeRuleToken ruleCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalIoT.g:1559:2: (kw= '_??' )
            // InternalIoT.g:1560:2: kw= '_??'
            {
            kw=(Token)match(input,47,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getConditionAccess().get_Keyword());
            	

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleIp"
    // InternalIoT.g:1568:1: entryRuleIp returns [EObject current=null] : iv_ruleIp= ruleIp EOF ;
    public final EObject entryRuleIp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIp = null;


        try {
            // InternalIoT.g:1568:43: (iv_ruleIp= ruleIp EOF )
            // InternalIoT.g:1569:2: iv_ruleIp= ruleIp EOF
            {
             newCompositeNode(grammarAccess.getIpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIp=ruleIp();

            state._fsp--;

             current =iv_ruleIp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIp"


    // $ANTLR start "ruleIp"
    // InternalIoT.g:1575:1: ruleIp returns [EObject current=null] : ( () ( (lv_ip_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_ip_3_0= RULE_INT ) ) otherlv_4= '.' ( (lv_ip_5_0= RULE_INT ) ) otherlv_6= '.' ( (lv_ip_7_0= RULE_INT ) ) ) ;
    public final EObject ruleIp() throws RecognitionException {
        EObject current = null;

        Token lv_ip_1_0=null;
        Token otherlv_2=null;
        Token lv_ip_3_0=null;
        Token otherlv_4=null;
        Token lv_ip_5_0=null;
        Token otherlv_6=null;
        Token lv_ip_7_0=null;


        	enterRule();

        try {
            // InternalIoT.g:1581:2: ( ( () ( (lv_ip_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_ip_3_0= RULE_INT ) ) otherlv_4= '.' ( (lv_ip_5_0= RULE_INT ) ) otherlv_6= '.' ( (lv_ip_7_0= RULE_INT ) ) ) )
            // InternalIoT.g:1582:2: ( () ( (lv_ip_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_ip_3_0= RULE_INT ) ) otherlv_4= '.' ( (lv_ip_5_0= RULE_INT ) ) otherlv_6= '.' ( (lv_ip_7_0= RULE_INT ) ) )
            {
            // InternalIoT.g:1582:2: ( () ( (lv_ip_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_ip_3_0= RULE_INT ) ) otherlv_4= '.' ( (lv_ip_5_0= RULE_INT ) ) otherlv_6= '.' ( (lv_ip_7_0= RULE_INT ) ) )
            // InternalIoT.g:1583:3: () ( (lv_ip_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_ip_3_0= RULE_INT ) ) otherlv_4= '.' ( (lv_ip_5_0= RULE_INT ) ) otherlv_6= '.' ( (lv_ip_7_0= RULE_INT ) )
            {
            // InternalIoT.g:1583:3: ()
            // InternalIoT.g:1584:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIpAccess().getIpAction_0(),
            					current);
            			

            }

            // InternalIoT.g:1590:3: ( (lv_ip_1_0= RULE_INT ) )
            // InternalIoT.g:1591:4: (lv_ip_1_0= RULE_INT )
            {
            // InternalIoT.g:1591:4: (lv_ip_1_0= RULE_INT )
            // InternalIoT.g:1592:5: lv_ip_1_0= RULE_INT
            {
            lv_ip_1_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            					newLeafNode(lv_ip_1_0, grammarAccess.getIpAccess().getIpINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIpRule());
            					}
            					addWithLastConsumed(
            						current,
            						"ip",
            						lv_ip_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getIpAccess().getFullStopKeyword_2());
            		
            // InternalIoT.g:1612:3: ( (lv_ip_3_0= RULE_INT ) )
            // InternalIoT.g:1613:4: (lv_ip_3_0= RULE_INT )
            {
            // InternalIoT.g:1613:4: (lv_ip_3_0= RULE_INT )
            // InternalIoT.g:1614:5: lv_ip_3_0= RULE_INT
            {
            lv_ip_3_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            					newLeafNode(lv_ip_3_0, grammarAccess.getIpAccess().getIpINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIpRule());
            					}
            					addWithLastConsumed(
            						current,
            						"ip",
            						lv_ip_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,48,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getIpAccess().getFullStopKeyword_4());
            		
            // InternalIoT.g:1634:3: ( (lv_ip_5_0= RULE_INT ) )
            // InternalIoT.g:1635:4: (lv_ip_5_0= RULE_INT )
            {
            // InternalIoT.g:1635:4: (lv_ip_5_0= RULE_INT )
            // InternalIoT.g:1636:5: lv_ip_5_0= RULE_INT
            {
            lv_ip_5_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            					newLeafNode(lv_ip_5_0, grammarAccess.getIpAccess().getIpINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIpRule());
            					}
            					addWithLastConsumed(
            						current,
            						"ip",
            						lv_ip_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,48,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getIpAccess().getFullStopKeyword_6());
            		
            // InternalIoT.g:1656:3: ( (lv_ip_7_0= RULE_INT ) )
            // InternalIoT.g:1657:4: (lv_ip_7_0= RULE_INT )
            {
            // InternalIoT.g:1657:4: (lv_ip_7_0= RULE_INT )
            // InternalIoT.g:1658:5: lv_ip_7_0= RULE_INT
            {
            lv_ip_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_ip_7_0, grammarAccess.getIpAccess().getIpINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIpRule());
            					}
            					addWithLastConsumed(
            						current,
            						"ip",
            						lv_ip_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleIp"


    // $ANTLR start "entryRulePortnumber"
    // InternalIoT.g:1678:1: entryRulePortnumber returns [EObject current=null] : iv_rulePortnumber= rulePortnumber EOF ;
    public final EObject entryRulePortnumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortnumber = null;


        try {
            // InternalIoT.g:1678:51: (iv_rulePortnumber= rulePortnumber EOF )
            // InternalIoT.g:1679:2: iv_rulePortnumber= rulePortnumber EOF
            {
             newCompositeNode(grammarAccess.getPortnumberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePortnumber=rulePortnumber();

            state._fsp--;

             current =iv_rulePortnumber; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePortnumber"


    // $ANTLR start "rulePortnumber"
    // InternalIoT.g:1685:1: rulePortnumber returns [EObject current=null] : ( () ( (lv_number_1_0= RULE_INT ) ) ) ;
    public final EObject rulePortnumber() throws RecognitionException {
        EObject current = null;

        Token lv_number_1_0=null;


        	enterRule();

        try {
            // InternalIoT.g:1691:2: ( ( () ( (lv_number_1_0= RULE_INT ) ) ) )
            // InternalIoT.g:1692:2: ( () ( (lv_number_1_0= RULE_INT ) ) )
            {
            // InternalIoT.g:1692:2: ( () ( (lv_number_1_0= RULE_INT ) ) )
            // InternalIoT.g:1693:3: () ( (lv_number_1_0= RULE_INT ) )
            {
            // InternalIoT.g:1693:3: ()
            // InternalIoT.g:1694:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPortnumberAccess().getPortnumberAction_0(),
            					current);
            			

            }

            // InternalIoT.g:1700:3: ( (lv_number_1_0= RULE_INT ) )
            // InternalIoT.g:1701:4: (lv_number_1_0= RULE_INT )
            {
            // InternalIoT.g:1701:4: (lv_number_1_0= RULE_INT )
            // InternalIoT.g:1702:5: lv_number_1_0= RULE_INT
            {
            lv_number_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_number_1_0, grammarAccess.getPortnumberAccess().getNumberINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortnumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "rulePortnumber"


    // $ANTLR start "entryRuleTime"
    // InternalIoT.g:1722:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalIoT.g:1722:45: (iv_ruleTime= ruleTime EOF )
            // InternalIoT.g:1723:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalIoT.g:1729:1: ruleTime returns [EObject current=null] : ( (lv_time_0_0= RULE_INT ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token lv_time_0_0=null;


        	enterRule();

        try {
            // InternalIoT.g:1735:2: ( ( (lv_time_0_0= RULE_INT ) ) )
            // InternalIoT.g:1736:2: ( (lv_time_0_0= RULE_INT ) )
            {
            // InternalIoT.g:1736:2: ( (lv_time_0_0= RULE_INT ) )
            // InternalIoT.g:1737:3: (lv_time_0_0= RULE_INT )
            {
            // InternalIoT.g:1737:3: (lv_time_0_0= RULE_INT )
            // InternalIoT.g:1738:4: lv_time_0_0= RULE_INT
            {
            lv_time_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_time_0_0, grammarAccess.getTimeAccess().getTimeINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTimeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"time",
            					lv_time_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleTime"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000718C52802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000780000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001000000000000L});

}