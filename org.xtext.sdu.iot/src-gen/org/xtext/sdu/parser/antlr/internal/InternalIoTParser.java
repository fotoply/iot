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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SensorTypes'", "','", "'Sensor'", "'of'", "'type'", "'SensorGroup'", "'include'", "'{'", "'}'", "'SensorGetMethod'", "'for'", "'('", "')'", "'DeviceTypes'", "'Device'", "'contains'", "'DeviceGroup'", "'ServerTypes'", "'Server'", "'listens'", "'ip'", "'on'", "'sends'", "'DestinationTypes'", "'Destination'", "'Fetch'", "'data'", "'from'", "'group'", "'to'", "'destination'", "'server'", "'every'", "'when'", "'if'", "'ms'", "'s'", "'m'", "'h'", "'_??'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_NUMBER=5;
    public static final int T__48=48;
    public static final int T__49=49;
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
    // InternalIoT.g:71:1: ruleSystem returns [EObject current=null] : ( ( (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleDeviceGroup | lv_system_0_8= ruleServerTypes | lv_system_0_9= ruleServerFromType | lv_system_0_10= ruleServer | lv_system_0_11= ruleDestinationTypes | lv_system_0_12= ruleDestination | lv_system_0_13= ruleFetchData ) ) )+ ;
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

        EObject lv_system_0_12 = null;

        EObject lv_system_0_13 = null;



        	enterRule();

        try {
            // InternalIoT.g:77:2: ( ( ( (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleDeviceGroup | lv_system_0_8= ruleServerTypes | lv_system_0_9= ruleServerFromType | lv_system_0_10= ruleServer | lv_system_0_11= ruleDestinationTypes | lv_system_0_12= ruleDestination | lv_system_0_13= ruleFetchData ) ) )+ )
            // InternalIoT.g:78:2: ( ( (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleDeviceGroup | lv_system_0_8= ruleServerTypes | lv_system_0_9= ruleServerFromType | lv_system_0_10= ruleServer | lv_system_0_11= ruleDestinationTypes | lv_system_0_12= ruleDestination | lv_system_0_13= ruleFetchData ) ) )+
            {
            // InternalIoT.g:78:2: ( ( (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleDeviceGroup | lv_system_0_8= ruleServerTypes | lv_system_0_9= ruleServerFromType | lv_system_0_10= ruleServer | lv_system_0_11= ruleDestinationTypes | lv_system_0_12= ruleDestination | lv_system_0_13= ruleFetchData ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12||LA2_0==14||LA2_0==17||LA2_0==21||(LA2_0>=25 && LA2_0<=26)||(LA2_0>=28 && LA2_0<=30)||(LA2_0>=35 && LA2_0<=37)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIoT.g:79:3: ( (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleDeviceGroup | lv_system_0_8= ruleServerTypes | lv_system_0_9= ruleServerFromType | lv_system_0_10= ruleServer | lv_system_0_11= ruleDestinationTypes | lv_system_0_12= ruleDestination | lv_system_0_13= ruleFetchData ) )
            	    {
            	    // InternalIoT.g:79:3: ( (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleDeviceGroup | lv_system_0_8= ruleServerTypes | lv_system_0_9= ruleServerFromType | lv_system_0_10= ruleServer | lv_system_0_11= ruleDestinationTypes | lv_system_0_12= ruleDestination | lv_system_0_13= ruleFetchData ) )
            	    // InternalIoT.g:80:4: (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleDeviceGroup | lv_system_0_8= ruleServerTypes | lv_system_0_9= ruleServerFromType | lv_system_0_10= ruleServer | lv_system_0_11= ruleDestinationTypes | lv_system_0_12= ruleDestination | lv_system_0_13= ruleFetchData )
            	    {
            	    // InternalIoT.g:80:4: (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleDeviceGroup | lv_system_0_8= ruleServerTypes | lv_system_0_9= ruleServerFromType | lv_system_0_10= ruleServer | lv_system_0_11= ruleDestinationTypes | lv_system_0_12= ruleDestination | lv_system_0_13= ruleFetchData )
            	    int alt1=13;
            	    alt1 = dfa1.predict(input);
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
            	            // InternalIoT.g:177:5: lv_system_0_7= ruleDeviceGroup
            	            {

            	            					newCompositeNode(grammarAccess.getSystemAccess().getSystemDeviceGroupParserRuleCall_0_6());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_7=ruleDeviceGroup();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getSystemRule());
            	            					}
            	            					add(
            	            						current,
            	            						"system",
            	            						lv_system_0_7,
            	            						"org.xtext.sdu.IoT.DeviceGroup");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 8 :
            	            // InternalIoT.g:193:5: lv_system_0_8= ruleServerTypes
            	            {

            	            					newCompositeNode(grammarAccess.getSystemAccess().getSystemServerTypesParserRuleCall_0_7());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_8=ruleServerTypes();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getSystemRule());
            	            					}
            	            					add(
            	            						current,
            	            						"system",
            	            						lv_system_0_8,
            	            						"org.xtext.sdu.IoT.ServerTypes");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 9 :
            	            // InternalIoT.g:209:5: lv_system_0_9= ruleServerFromType
            	            {

            	            					newCompositeNode(grammarAccess.getSystemAccess().getSystemServerFromTypeParserRuleCall_0_8());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_9=ruleServerFromType();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getSystemRule());
            	            					}
            	            					add(
            	            						current,
            	            						"system",
            	            						lv_system_0_9,
            	            						"org.xtext.sdu.IoT.ServerFromType");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 10 :
            	            // InternalIoT.g:225:5: lv_system_0_10= ruleServer
            	            {

            	            					newCompositeNode(grammarAccess.getSystemAccess().getSystemServerParserRuleCall_0_9());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_10=ruleServer();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getSystemRule());
            	            					}
            	            					add(
            	            						current,
            	            						"system",
            	            						lv_system_0_10,
            	            						"org.xtext.sdu.IoT.Server");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 11 :
            	            // InternalIoT.g:241:5: lv_system_0_11= ruleDestinationTypes
            	            {

            	            					newCompositeNode(grammarAccess.getSystemAccess().getSystemDestinationTypesParserRuleCall_0_10());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_11=ruleDestinationTypes();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getSystemRule());
            	            					}
            	            					add(
            	            						current,
            	            						"system",
            	            						lv_system_0_11,
            	            						"org.xtext.sdu.IoT.DestinationTypes");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 12 :
            	            // InternalIoT.g:257:5: lv_system_0_12= ruleDestination
            	            {

            	            					newCompositeNode(grammarAccess.getSystemAccess().getSystemDestinationParserRuleCall_0_11());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_12=ruleDestination();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getSystemRule());
            	            					}
            	            					add(
            	            						current,
            	            						"system",
            	            						lv_system_0_12,
            	            						"org.xtext.sdu.IoT.Destination");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 13 :
            	            // InternalIoT.g:273:5: lv_system_0_13= ruleFetchData
            	            {

            	            					newCompositeNode(grammarAccess.getSystemAccess().getSystemFetchDataParserRuleCall_0_12());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_13=ruleFetchData();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getSystemRule());
            	            					}
            	            					add(
            	            						current,
            	            						"system",
            	            						lv_system_0_13,
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
    // InternalIoT.g:294:1: entryRuleSensorType returns [EObject current=null] : iv_ruleSensorType= ruleSensorType EOF ;
    public final EObject entryRuleSensorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorType = null;


        try {
            // InternalIoT.g:294:51: (iv_ruleSensorType= ruleSensorType EOF )
            // InternalIoT.g:295:2: iv_ruleSensorType= ruleSensorType EOF
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
    // InternalIoT.g:301:1: ruleSensorType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSensorType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoT.g:307:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoT.g:308:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoT.g:308:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoT.g:309:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoT.g:309:3: (lv_name_0_0= RULE_ID )
            // InternalIoT.g:310:4: lv_name_0_0= RULE_ID
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
    // InternalIoT.g:329:1: entryRuleSensorTypes returns [EObject current=null] : iv_ruleSensorTypes= ruleSensorTypes EOF ;
    public final EObject entryRuleSensorTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorTypes = null;


        try {
            // InternalIoT.g:329:52: (iv_ruleSensorTypes= ruleSensorTypes EOF )
            // InternalIoT.g:330:2: iv_ruleSensorTypes= ruleSensorTypes EOF
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
    // InternalIoT.g:336:1: ruleSensorTypes returns [EObject current=null] : (otherlv_0= 'SensorTypes' ( (lv_types_1_0= ruleSensorType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSensorType ) ) )* ) ;
    public final EObject ruleSensorTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:342:2: ( (otherlv_0= 'SensorTypes' ( (lv_types_1_0= ruleSensorType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSensorType ) ) )* ) )
            // InternalIoT.g:343:2: (otherlv_0= 'SensorTypes' ( (lv_types_1_0= ruleSensorType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSensorType ) ) )* )
            {
            // InternalIoT.g:343:2: (otherlv_0= 'SensorTypes' ( (lv_types_1_0= ruleSensorType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSensorType ) ) )* )
            // InternalIoT.g:344:3: otherlv_0= 'SensorTypes' ( (lv_types_1_0= ruleSensorType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSensorType ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorTypesAccess().getSensorTypesKeyword_0());
            		
            // InternalIoT.g:348:3: ( (lv_types_1_0= ruleSensorType ) )
            // InternalIoT.g:349:4: (lv_types_1_0= ruleSensorType )
            {
            // InternalIoT.g:349:4: (lv_types_1_0= ruleSensorType )
            // InternalIoT.g:350:5: lv_types_1_0= ruleSensorType
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

            // InternalIoT.g:367:3: (otherlv_2= ',' ( (lv_types_3_0= ruleSensorType ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalIoT.g:368:4: otherlv_2= ',' ( (lv_types_3_0= ruleSensorType ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSensorTypesAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalIoT.g:372:4: ( (lv_types_3_0= ruleSensorType ) )
            	    // InternalIoT.g:373:5: (lv_types_3_0= ruleSensorType )
            	    {
            	    // InternalIoT.g:373:5: (lv_types_3_0= ruleSensorType )
            	    // InternalIoT.g:374:6: lv_types_3_0= ruleSensorType
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
    // InternalIoT.g:396:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalIoT.g:396:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalIoT.g:397:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalIoT.g:403:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalIoT.g:409:2: ( (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalIoT.g:410:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalIoT.g:410:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) )
            // InternalIoT.g:411:3: otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalIoT.g:415:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoT.g:416:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoT.g:416:4: (lv_name_1_0= RULE_ID )
            // InternalIoT.g:417:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getOfKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getTypeKeyword_3());
            		
            // InternalIoT.g:441:3: ( (otherlv_4= RULE_ID ) )
            // InternalIoT.g:442:4: (otherlv_4= RULE_ID )
            {
            // InternalIoT.g:442:4: (otherlv_4= RULE_ID )
            // InternalIoT.g:443:5: otherlv_4= RULE_ID
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
    // InternalIoT.g:458:1: entryRuleSensorGroup returns [EObject current=null] : iv_ruleSensorGroup= ruleSensorGroup EOF ;
    public final EObject entryRuleSensorGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorGroup = null;


        try {
            // InternalIoT.g:458:52: (iv_ruleSensorGroup= ruleSensorGroup EOF )
            // InternalIoT.g:459:2: iv_ruleSensorGroup= ruleSensorGroup EOF
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
    // InternalIoT.g:465:1: ruleSensorGroup returns [EObject current=null] : (otherlv_0= 'SensorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'include' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleSensorGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalIoT.g:471:2: ( (otherlv_0= 'SensorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'include' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) )
            // InternalIoT.g:472:2: (otherlv_0= 'SensorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'include' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            {
            // InternalIoT.g:472:2: (otherlv_0= 'SensorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'include' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            // InternalIoT.g:473:3: otherlv_0= 'SensorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'include' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorGroupAccess().getSensorGroupKeyword_0());
            		
            // InternalIoT.g:477:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoT.g:478:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoT.g:478:4: (lv_name_1_0= RULE_ID )
            // InternalIoT.g:479:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorGroupAccess().getIncludeKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorGroupAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalIoT.g:503:3: ( (otherlv_4= RULE_ID ) )
            // InternalIoT.g:504:4: (otherlv_4= RULE_ID )
            {
            // InternalIoT.g:504:4: (otherlv_4= RULE_ID )
            // InternalIoT.g:505:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorGroupRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_4, grammarAccess.getSensorGroupAccess().getSensorsSensorCrossReference_4_0());
            				

            }


            }

            // InternalIoT.g:516:3: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalIoT.g:517:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_5, grammarAccess.getSensorGroupAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalIoT.g:521:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalIoT.g:522:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalIoT.g:522:5: (otherlv_6= RULE_ID )
            	    // InternalIoT.g:523:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSensorGroupRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(otherlv_6, grammarAccess.getSensorGroupAccess().getSensorsSensorCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSensorGroupAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalIoT.g:543:1: entryRuleSensorGetMethod returns [EObject current=null] : iv_ruleSensorGetMethod= ruleSensorGetMethod EOF ;
    public final EObject entryRuleSensorGetMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorGetMethod = null;


        try {
            // InternalIoT.g:543:56: (iv_ruleSensorGetMethod= ruleSensorGetMethod EOF )
            // InternalIoT.g:544:2: iv_ruleSensorGetMethod= ruleSensorGetMethod EOF
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
    // InternalIoT.g:550:1: ruleSensorGetMethod returns [EObject current=null] : (otherlv_0= 'SensorGetMethod' ( (lv_method_1_0= ruleMethod ) ) otherlv_2= 'for' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleSensorGetMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_method_1_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:556:2: ( (otherlv_0= 'SensorGetMethod' ( (lv_method_1_0= ruleMethod ) ) otherlv_2= 'for' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalIoT.g:557:2: (otherlv_0= 'SensorGetMethod' ( (lv_method_1_0= ruleMethod ) ) otherlv_2= 'for' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalIoT.g:557:2: (otherlv_0= 'SensorGetMethod' ( (lv_method_1_0= ruleMethod ) ) otherlv_2= 'for' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) )
            // InternalIoT.g:558:3: otherlv_0= 'SensorGetMethod' ( (lv_method_1_0= ruleMethod ) ) otherlv_2= 'for' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorGetMethodAccess().getSensorGetMethodKeyword_0());
            		
            // InternalIoT.g:562:3: ( (lv_method_1_0= ruleMethod ) )
            // InternalIoT.g:563:4: (lv_method_1_0= ruleMethod )
            {
            // InternalIoT.g:563:4: (lv_method_1_0= ruleMethod )
            // InternalIoT.g:564:5: lv_method_1_0= ruleMethod
            {

            					newCompositeNode(grammarAccess.getSensorGetMethodAccess().getMethodMethodParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_2=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorGetMethodAccess().getForKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorGetMethodAccess().getTypeKeyword_3());
            		
            // InternalIoT.g:589:3: ( (otherlv_4= RULE_ID ) )
            // InternalIoT.g:590:4: (otherlv_4= RULE_ID )
            {
            // InternalIoT.g:590:4: (otherlv_4= RULE_ID )
            // InternalIoT.g:591:5: otherlv_4= RULE_ID
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
    // InternalIoT.g:606:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalIoT.g:606:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalIoT.g:607:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalIoT.g:613:1: ruleMethod returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* otherlv_5= ')' ) ;
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
            // InternalIoT.g:619:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* otherlv_5= ')' ) )
            // InternalIoT.g:620:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* otherlv_5= ')' )
            {
            // InternalIoT.g:620:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* otherlv_5= ')' )
            // InternalIoT.g:621:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* otherlv_5= ')'
            {
            // InternalIoT.g:621:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoT.g:622:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoT.g:622:4: (lv_name_0_0= RULE_ID )
            // InternalIoT.g:623:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1());
            		
            // InternalIoT.g:643:3: ( (lv_parameters_2_0= RULE_ID ) )
            // InternalIoT.g:644:4: (lv_parameters_2_0= RULE_ID )
            {
            // InternalIoT.g:644:4: (lv_parameters_2_0= RULE_ID )
            // InternalIoT.g:645:5: lv_parameters_2_0= RULE_ID
            {
            lv_parameters_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalIoT.g:661:3: (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalIoT.g:662:4: otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalIoT.g:666:4: ( (lv_parameters_4_0= RULE_ID ) )
            	    // InternalIoT.g:667:5: (lv_parameters_4_0= RULE_ID )
            	    {
            	    // InternalIoT.g:667:5: (lv_parameters_4_0= RULE_ID )
            	    // InternalIoT.g:668:6: lv_parameters_4_0= RULE_ID
            	    {
            	    lv_parameters_4_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

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
    // InternalIoT.g:693:1: entryRuleDeviceType returns [EObject current=null] : iv_ruleDeviceType= ruleDeviceType EOF ;
    public final EObject entryRuleDeviceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceType = null;


        try {
            // InternalIoT.g:693:51: (iv_ruleDeviceType= ruleDeviceType EOF )
            // InternalIoT.g:694:2: iv_ruleDeviceType= ruleDeviceType EOF
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
    // InternalIoT.g:700:1: ruleDeviceType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDeviceType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoT.g:706:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoT.g:707:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoT.g:707:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoT.g:708:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoT.g:708:3: (lv_name_0_0= RULE_ID )
            // InternalIoT.g:709:4: lv_name_0_0= RULE_ID
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
    // InternalIoT.g:728:1: entryRuleDeviceTypes returns [EObject current=null] : iv_ruleDeviceTypes= ruleDeviceTypes EOF ;
    public final EObject entryRuleDeviceTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceTypes = null;


        try {
            // InternalIoT.g:728:52: (iv_ruleDeviceTypes= ruleDeviceTypes EOF )
            // InternalIoT.g:729:2: iv_ruleDeviceTypes= ruleDeviceTypes EOF
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
    // InternalIoT.g:735:1: ruleDeviceTypes returns [EObject current=null] : (otherlv_0= 'DeviceTypes' ( (lv_types_1_0= ruleDeviceType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDeviceType ) ) )* ) ;
    public final EObject ruleDeviceTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:741:2: ( (otherlv_0= 'DeviceTypes' ( (lv_types_1_0= ruleDeviceType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDeviceType ) ) )* ) )
            // InternalIoT.g:742:2: (otherlv_0= 'DeviceTypes' ( (lv_types_1_0= ruleDeviceType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDeviceType ) ) )* )
            {
            // InternalIoT.g:742:2: (otherlv_0= 'DeviceTypes' ( (lv_types_1_0= ruleDeviceType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDeviceType ) ) )* )
            // InternalIoT.g:743:3: otherlv_0= 'DeviceTypes' ( (lv_types_1_0= ruleDeviceType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDeviceType ) ) )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDeviceTypesAccess().getDeviceTypesKeyword_0());
            		
            // InternalIoT.g:747:3: ( (lv_types_1_0= ruleDeviceType ) )
            // InternalIoT.g:748:4: (lv_types_1_0= ruleDeviceType )
            {
            // InternalIoT.g:748:4: (lv_types_1_0= ruleDeviceType )
            // InternalIoT.g:749:5: lv_types_1_0= ruleDeviceType
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

            // InternalIoT.g:766:3: (otherlv_2= ',' ( (lv_types_3_0= ruleDeviceType ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalIoT.g:767:4: otherlv_2= ',' ( (lv_types_3_0= ruleDeviceType ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDeviceTypesAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalIoT.g:771:4: ( (lv_types_3_0= ruleDeviceType ) )
            	    // InternalIoT.g:772:5: (lv_types_3_0= ruleDeviceType )
            	    {
            	    // InternalIoT.g:772:5: (lv_types_3_0= ruleDeviceType )
            	    // InternalIoT.g:773:6: lv_types_3_0= ruleDeviceType
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
    // InternalIoT.g:795:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalIoT.g:795:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalIoT.g:796:2: iv_ruleDevice= ruleDevice EOF
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
    // InternalIoT.g:802:1: ruleDevice returns [EObject current=null] : (otherlv_0= 'Device' otherlv_1= 'of' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'contains' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalIoT.g:808:2: ( (otherlv_0= 'Device' otherlv_1= 'of' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'contains' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalIoT.g:809:2: (otherlv_0= 'Device' otherlv_1= 'of' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'contains' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalIoT.g:809:2: (otherlv_0= 'Device' otherlv_1= 'of' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'contains' ( (otherlv_4= RULE_ID ) ) )
            // InternalIoT.g:810:3: otherlv_0= 'Device' otherlv_1= 'of' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'contains' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDeviceAccess().getDeviceKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDeviceAccess().getOfKeyword_1());
            		
            // InternalIoT.g:818:3: ( (otherlv_2= RULE_ID ) )
            // InternalIoT.g:819:4: (otherlv_2= RULE_ID )
            {
            // InternalIoT.g:819:4: (otherlv_2= RULE_ID )
            // InternalIoT.g:820:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_2, grammarAccess.getDeviceAccess().getTypeDeviceTypeCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getDeviceAccess().getContainsKeyword_3());
            		
            // InternalIoT.g:835:3: ( (otherlv_4= RULE_ID ) )
            // InternalIoT.g:836:4: (otherlv_4= RULE_ID )
            {
            // InternalIoT.g:836:4: (otherlv_4= RULE_ID )
            // InternalIoT.g:837:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getDeviceAccess().getGroupSensorGroupCrossReference_4_0());
            				

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
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleDeviceGroup"
    // InternalIoT.g:852:1: entryRuleDeviceGroup returns [EObject current=null] : iv_ruleDeviceGroup= ruleDeviceGroup EOF ;
    public final EObject entryRuleDeviceGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceGroup = null;


        try {
            // InternalIoT.g:852:52: (iv_ruleDeviceGroup= ruleDeviceGroup EOF )
            // InternalIoT.g:853:2: iv_ruleDeviceGroup= ruleDeviceGroup EOF
            {
             newCompositeNode(grammarAccess.getDeviceGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeviceGroup=ruleDeviceGroup();

            state._fsp--;

             current =iv_ruleDeviceGroup; 
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
    // $ANTLR end "entryRuleDeviceGroup"


    // $ANTLR start "ruleDeviceGroup"
    // InternalIoT.g:859:1: ruleDeviceGroup returns [EObject current=null] : (otherlv_0= 'DeviceGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'include' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleDeviceGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalIoT.g:865:2: ( (otherlv_0= 'DeviceGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'include' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) )
            // InternalIoT.g:866:2: (otherlv_0= 'DeviceGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'include' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            {
            // InternalIoT.g:866:2: (otherlv_0= 'DeviceGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'include' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            // InternalIoT.g:867:3: otherlv_0= 'DeviceGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'include' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDeviceGroupAccess().getDeviceGroupKeyword_0());
            		
            // InternalIoT.g:871:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoT.g:872:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoT.g:872:4: (lv_name_1_0= RULE_ID )
            // InternalIoT.g:873:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDeviceGroupAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getDeviceGroupAccess().getIncludeKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getDeviceGroupAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalIoT.g:897:3: ( (otherlv_4= RULE_ID ) )
            // InternalIoT.g:898:4: (otherlv_4= RULE_ID )
            {
            // InternalIoT.g:898:4: (otherlv_4= RULE_ID )
            // InternalIoT.g:899:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceGroupRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_4, grammarAccess.getDeviceGroupAccess().getDevicesDeviceCrossReference_4_0());
            				

            }


            }

            // InternalIoT.g:910:3: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalIoT.g:911:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_5, grammarAccess.getDeviceGroupAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalIoT.g:915:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalIoT.g:916:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalIoT.g:916:5: (otherlv_6= RULE_ID )
            	    // InternalIoT.g:917:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDeviceGroupRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(otherlv_6, grammarAccess.getDeviceGroupAccess().getDevicesDeviceCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDeviceGroupAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDeviceGroup"


    // $ANTLR start "entryRuleServerType"
    // InternalIoT.g:937:1: entryRuleServerType returns [EObject current=null] : iv_ruleServerType= ruleServerType EOF ;
    public final EObject entryRuleServerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServerType = null;


        try {
            // InternalIoT.g:937:51: (iv_ruleServerType= ruleServerType EOF )
            // InternalIoT.g:938:2: iv_ruleServerType= ruleServerType EOF
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
    // InternalIoT.g:944:1: ruleServerType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleServerType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoT.g:950:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoT.g:951:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoT.g:951:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoT.g:952:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoT.g:952:3: (lv_name_0_0= RULE_ID )
            // InternalIoT.g:953:4: lv_name_0_0= RULE_ID
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
    // InternalIoT.g:972:1: entryRuleServerTypes returns [EObject current=null] : iv_ruleServerTypes= ruleServerTypes EOF ;
    public final EObject entryRuleServerTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServerTypes = null;


        try {
            // InternalIoT.g:972:52: (iv_ruleServerTypes= ruleServerTypes EOF )
            // InternalIoT.g:973:2: iv_ruleServerTypes= ruleServerTypes EOF
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
    // InternalIoT.g:979:1: ruleServerTypes returns [EObject current=null] : (otherlv_0= 'ServerTypes' ( (lv_types_1_0= ruleServerType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleServerType ) ) )* ) ;
    public final EObject ruleServerTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:985:2: ( (otherlv_0= 'ServerTypes' ( (lv_types_1_0= ruleServerType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleServerType ) ) )* ) )
            // InternalIoT.g:986:2: (otherlv_0= 'ServerTypes' ( (lv_types_1_0= ruleServerType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleServerType ) ) )* )
            {
            // InternalIoT.g:986:2: (otherlv_0= 'ServerTypes' ( (lv_types_1_0= ruleServerType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleServerType ) ) )* )
            // InternalIoT.g:987:3: otherlv_0= 'ServerTypes' ( (lv_types_1_0= ruleServerType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleServerType ) ) )*
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServerTypesAccess().getServerTypesKeyword_0());
            		
            // InternalIoT.g:991:3: ( (lv_types_1_0= ruleServerType ) )
            // InternalIoT.g:992:4: (lv_types_1_0= ruleServerType )
            {
            // InternalIoT.g:992:4: (lv_types_1_0= ruleServerType )
            // InternalIoT.g:993:5: lv_types_1_0= ruleServerType
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

            // InternalIoT.g:1010:3: (otherlv_2= ',' ( (lv_types_3_0= ruleServerType ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==13) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalIoT.g:1011:4: otherlv_2= ',' ( (lv_types_3_0= ruleServerType ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getServerTypesAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalIoT.g:1015:4: ( (lv_types_3_0= ruleServerType ) )
            	    // InternalIoT.g:1016:5: (lv_types_3_0= ruleServerType )
            	    {
            	    // InternalIoT.g:1016:5: (lv_types_3_0= ruleServerType )
            	    // InternalIoT.g:1017:6: lv_types_3_0= ruleServerType
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


    // $ANTLR start "entryRuleServerFromType"
    // InternalIoT.g:1039:1: entryRuleServerFromType returns [EObject current=null] : iv_ruleServerFromType= ruleServerFromType EOF ;
    public final EObject entryRuleServerFromType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServerFromType = null;


        try {
            // InternalIoT.g:1039:55: (iv_ruleServerFromType= ruleServerFromType EOF )
            // InternalIoT.g:1040:2: iv_ruleServerFromType= ruleServerFromType EOF
            {
             newCompositeNode(grammarAccess.getServerFromTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServerFromType=ruleServerFromType();

            state._fsp--;

             current =iv_ruleServerFromType; 
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
    // $ANTLR end "entryRuleServerFromType"


    // $ANTLR start "ruleServerFromType"
    // InternalIoT.g:1046:1: ruleServerFromType returns [EObject current=null] : (otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleServerFromType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalIoT.g:1052:2: ( (otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalIoT.g:1053:2: (otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalIoT.g:1053:2: (otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) )
            // InternalIoT.g:1054:3: otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServerFromTypeAccess().getServerKeyword_0());
            		
            // InternalIoT.g:1058:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoT.g:1059:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoT.g:1059:4: (lv_name_1_0= RULE_ID )
            // InternalIoT.g:1060:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServerFromTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServerFromTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getServerFromTypeAccess().getOfKeyword_2());
            		
            // InternalIoT.g:1080:3: ( (otherlv_3= RULE_ID ) )
            // InternalIoT.g:1081:4: (otherlv_3= RULE_ID )
            {
            // InternalIoT.g:1081:4: (otherlv_3= RULE_ID )
            // InternalIoT.g:1082:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServerFromTypeRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getServerFromTypeAccess().getTypeServerTypeCrossReference_3_0());
            				

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
    // $ANTLR end "ruleServerFromType"


    // $ANTLR start "entryRuleServer"
    // InternalIoT.g:1097:1: entryRuleServer returns [EObject current=null] : iv_ruleServer= ruleServer EOF ;
    public final EObject entryRuleServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServer = null;


        try {
            // InternalIoT.g:1097:47: (iv_ruleServer= ruleServer EOF )
            // InternalIoT.g:1098:2: iv_ruleServer= ruleServer EOF
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
    // InternalIoT.g:1104:1: ruleServer returns [EObject current=null] : (otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'listens' otherlv_3= 'ip' otherlv_4= 'on' ( (lv_lip_5_0= rulePortnumber ) ) otherlv_6= 'sends' otherlv_7= 'ip' otherlv_8= 'on' ( (lv_sip_9_0= rulePortnumber ) ) otherlv_10= 'contains' ( (otherlv_11= RULE_ID ) ) ) ;
    public final EObject ruleServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_lip_5_0 = null;

        EObject lv_sip_9_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:1110:2: ( (otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'listens' otherlv_3= 'ip' otherlv_4= 'on' ( (lv_lip_5_0= rulePortnumber ) ) otherlv_6= 'sends' otherlv_7= 'ip' otherlv_8= 'on' ( (lv_sip_9_0= rulePortnumber ) ) otherlv_10= 'contains' ( (otherlv_11= RULE_ID ) ) ) )
            // InternalIoT.g:1111:2: (otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'listens' otherlv_3= 'ip' otherlv_4= 'on' ( (lv_lip_5_0= rulePortnumber ) ) otherlv_6= 'sends' otherlv_7= 'ip' otherlv_8= 'on' ( (lv_sip_9_0= rulePortnumber ) ) otherlv_10= 'contains' ( (otherlv_11= RULE_ID ) ) )
            {
            // InternalIoT.g:1111:2: (otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'listens' otherlv_3= 'ip' otherlv_4= 'on' ( (lv_lip_5_0= rulePortnumber ) ) otherlv_6= 'sends' otherlv_7= 'ip' otherlv_8= 'on' ( (lv_sip_9_0= rulePortnumber ) ) otherlv_10= 'contains' ( (otherlv_11= RULE_ID ) ) )
            // InternalIoT.g:1112:3: otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'listens' otherlv_3= 'ip' otherlv_4= 'on' ( (lv_lip_5_0= rulePortnumber ) ) otherlv_6= 'sends' otherlv_7= 'ip' otherlv_8= 'on' ( (lv_sip_9_0= rulePortnumber ) ) otherlv_10= 'contains' ( (otherlv_11= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServerAccess().getServerKeyword_0());
            		
            // InternalIoT.g:1116:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoT.g:1117:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoT.g:1117:4: (lv_name_1_0= RULE_ID )
            // InternalIoT.g:1118:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            otherlv_2=(Token)match(input,31,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getServerAccess().getListensKeyword_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getServerAccess().getIpKeyword_3());
            		
            otherlv_4=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getServerAccess().getOnKeyword_4());
            		
            // InternalIoT.g:1146:3: ( (lv_lip_5_0= rulePortnumber ) )
            // InternalIoT.g:1147:4: (lv_lip_5_0= rulePortnumber )
            {
            // InternalIoT.g:1147:4: (lv_lip_5_0= rulePortnumber )
            // InternalIoT.g:1148:5: lv_lip_5_0= rulePortnumber
            {

            					newCompositeNode(grammarAccess.getServerAccess().getLipPortnumberParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
            lv_lip_5_0=rulePortnumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServerRule());
            					}
            					set(
            						current,
            						"lip",
            						lv_lip_5_0,
            						"org.xtext.sdu.IoT.Portnumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,34,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getServerAccess().getSendsKeyword_6());
            		
            otherlv_7=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getServerAccess().getIpKeyword_7());
            		
            otherlv_8=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getServerAccess().getOnKeyword_8());
            		
            // InternalIoT.g:1177:3: ( (lv_sip_9_0= rulePortnumber ) )
            // InternalIoT.g:1178:4: (lv_sip_9_0= rulePortnumber )
            {
            // InternalIoT.g:1178:4: (lv_sip_9_0= rulePortnumber )
            // InternalIoT.g:1179:5: lv_sip_9_0= rulePortnumber
            {

            					newCompositeNode(grammarAccess.getServerAccess().getSipPortnumberParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_14);
            lv_sip_9_0=rulePortnumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServerRule());
            					}
            					set(
            						current,
            						"sip",
            						lv_sip_9_0,
            						"org.xtext.sdu.IoT.Portnumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getServerAccess().getContainsKeyword_10());
            		
            // InternalIoT.g:1200:3: ( (otherlv_11= RULE_ID ) )
            // InternalIoT.g:1201:4: (otherlv_11= RULE_ID )
            {
            // InternalIoT.g:1201:4: (otherlv_11= RULE_ID )
            // InternalIoT.g:1202:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServerRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_11, grammarAccess.getServerAccess().getGroupDeviceGroupCrossReference_11_0());
            				

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
    // InternalIoT.g:1217:1: entryRuleDestinationType returns [EObject current=null] : iv_ruleDestinationType= ruleDestinationType EOF ;
    public final EObject entryRuleDestinationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestinationType = null;


        try {
            // InternalIoT.g:1217:56: (iv_ruleDestinationType= ruleDestinationType EOF )
            // InternalIoT.g:1218:2: iv_ruleDestinationType= ruleDestinationType EOF
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
    // InternalIoT.g:1224:1: ruleDestinationType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDestinationType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoT.g:1230:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoT.g:1231:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoT.g:1231:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoT.g:1232:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoT.g:1232:3: (lv_name_0_0= RULE_ID )
            // InternalIoT.g:1233:4: lv_name_0_0= RULE_ID
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
    // InternalIoT.g:1252:1: entryRuleDestinationTypes returns [EObject current=null] : iv_ruleDestinationTypes= ruleDestinationTypes EOF ;
    public final EObject entryRuleDestinationTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestinationTypes = null;


        try {
            // InternalIoT.g:1252:57: (iv_ruleDestinationTypes= ruleDestinationTypes EOF )
            // InternalIoT.g:1253:2: iv_ruleDestinationTypes= ruleDestinationTypes EOF
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
    // InternalIoT.g:1259:1: ruleDestinationTypes returns [EObject current=null] : (otherlv_0= 'DestinationTypes' ( (lv_types_1_0= ruleDestinationType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDestinationType ) ) )* ) ;
    public final EObject ruleDestinationTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:1265:2: ( (otherlv_0= 'DestinationTypes' ( (lv_types_1_0= ruleDestinationType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDestinationType ) ) )* ) )
            // InternalIoT.g:1266:2: (otherlv_0= 'DestinationTypes' ( (lv_types_1_0= ruleDestinationType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDestinationType ) ) )* )
            {
            // InternalIoT.g:1266:2: (otherlv_0= 'DestinationTypes' ( (lv_types_1_0= ruleDestinationType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDestinationType ) ) )* )
            // InternalIoT.g:1267:3: otherlv_0= 'DestinationTypes' ( (lv_types_1_0= ruleDestinationType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDestinationType ) ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDestinationTypesAccess().getDestinationTypesKeyword_0());
            		
            // InternalIoT.g:1271:3: ( (lv_types_1_0= ruleDestinationType ) )
            // InternalIoT.g:1272:4: (lv_types_1_0= ruleDestinationType )
            {
            // InternalIoT.g:1272:4: (lv_types_1_0= ruleDestinationType )
            // InternalIoT.g:1273:5: lv_types_1_0= ruleDestinationType
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

            // InternalIoT.g:1290:3: (otherlv_2= ',' ( (lv_types_3_0= ruleDestinationType ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalIoT.g:1291:4: otherlv_2= ',' ( (lv_types_3_0= ruleDestinationType ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDestinationTypesAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalIoT.g:1295:4: ( (lv_types_3_0= ruleDestinationType ) )
            	    // InternalIoT.g:1296:5: (lv_types_3_0= ruleDestinationType )
            	    {
            	    // InternalIoT.g:1296:5: (lv_types_3_0= ruleDestinationType )
            	    // InternalIoT.g:1297:6: lv_types_3_0= ruleDestinationType
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
    // InternalIoT.g:1319:1: entryRuleDestination returns [EObject current=null] : iv_ruleDestination= ruleDestination EOF ;
    public final EObject entryRuleDestination() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestination = null;


        try {
            // InternalIoT.g:1319:52: (iv_ruleDestination= ruleDestination EOF )
            // InternalIoT.g:1320:2: iv_ruleDestination= ruleDestination EOF
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
    // InternalIoT.g:1326:1: ruleDestination returns [EObject current=null] : (otherlv_0= 'Destination' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDestination() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalIoT.g:1332:2: ( (otherlv_0= 'Destination' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalIoT.g:1333:2: (otherlv_0= 'Destination' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalIoT.g:1333:2: (otherlv_0= 'Destination' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) )
            // InternalIoT.g:1334:3: otherlv_0= 'Destination' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDestinationAccess().getDestinationKeyword_0());
            		
            // InternalIoT.g:1338:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoT.g:1339:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoT.g:1339:4: (lv_name_1_0= RULE_ID )
            // InternalIoT.g:1340:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDestinationAccess().getOfKeyword_2());
            		
            // InternalIoT.g:1360:3: ( (otherlv_3= RULE_ID ) )
            // InternalIoT.g:1361:4: (otherlv_3= RULE_ID )
            {
            // InternalIoT.g:1361:4: (otherlv_3= RULE_ID )
            // InternalIoT.g:1362:5: otherlv_3= RULE_ID
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
    // InternalIoT.g:1377:1: entryRuleFetchData returns [EObject current=null] : iv_ruleFetchData= ruleFetchData EOF ;
    public final EObject entryRuleFetchData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFetchData = null;


        try {
            // InternalIoT.g:1377:50: (iv_ruleFetchData= ruleFetchData EOF )
            // InternalIoT.g:1378:2: iv_ruleFetchData= ruleFetchData EOF
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
    // InternalIoT.g:1384:1: ruleFetchData returns [EObject current=null] : (otherlv_0= 'Fetch' otherlv_1= 'data' otherlv_2= 'from' ( (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'group' ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= 'to' ( (otherlv_8= 'destination' ( (otherlv_9= RULE_ID ) ) ) | (otherlv_10= 'server' ( (otherlv_11= RULE_ID ) ) ) ) ( ( (lv_conExp_12_0= ruleFetchDataExpression ) ) | ( (lv_conExp_13_0= ruleFetchDataCondition ) ) )? ) ;
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
            // InternalIoT.g:1390:2: ( (otherlv_0= 'Fetch' otherlv_1= 'data' otherlv_2= 'from' ( (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'group' ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= 'to' ( (otherlv_8= 'destination' ( (otherlv_9= RULE_ID ) ) ) | (otherlv_10= 'server' ( (otherlv_11= RULE_ID ) ) ) ) ( ( (lv_conExp_12_0= ruleFetchDataExpression ) ) | ( (lv_conExp_13_0= ruleFetchDataCondition ) ) )? ) )
            // InternalIoT.g:1391:2: (otherlv_0= 'Fetch' otherlv_1= 'data' otherlv_2= 'from' ( (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'group' ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= 'to' ( (otherlv_8= 'destination' ( (otherlv_9= RULE_ID ) ) ) | (otherlv_10= 'server' ( (otherlv_11= RULE_ID ) ) ) ) ( ( (lv_conExp_12_0= ruleFetchDataExpression ) ) | ( (lv_conExp_13_0= ruleFetchDataCondition ) ) )? )
            {
            // InternalIoT.g:1391:2: (otherlv_0= 'Fetch' otherlv_1= 'data' otherlv_2= 'from' ( (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'group' ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= 'to' ( (otherlv_8= 'destination' ( (otherlv_9= RULE_ID ) ) ) | (otherlv_10= 'server' ( (otherlv_11= RULE_ID ) ) ) ) ( ( (lv_conExp_12_0= ruleFetchDataExpression ) ) | ( (lv_conExp_13_0= ruleFetchDataCondition ) ) )? )
            // InternalIoT.g:1392:3: otherlv_0= 'Fetch' otherlv_1= 'data' otherlv_2= 'from' ( (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'group' ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= 'to' ( (otherlv_8= 'destination' ( (otherlv_9= RULE_ID ) ) ) | (otherlv_10= 'server' ( (otherlv_11= RULE_ID ) ) ) ) ( ( (lv_conExp_12_0= ruleFetchDataExpression ) ) | ( (lv_conExp_13_0= ruleFetchDataCondition ) ) )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getFetchDataAccess().getFetchKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getFetchDataAccess().getDataKeyword_1());
            		
            otherlv_2=(Token)match(input,39,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getFetchDataAccess().getFromKeyword_2());
            		
            // InternalIoT.g:1404:3: ( (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'group' ( (otherlv_6= RULE_ID ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            else if ( (LA10_0==40) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalIoT.g:1405:4: (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalIoT.g:1405:4: (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) )
                    // InternalIoT.g:1406:5: otherlv_3= 'type' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_4); 

                    					newLeafNode(otherlv_3, grammarAccess.getFetchDataAccess().getTypeKeyword_3_0_0());
                    				
                    // InternalIoT.g:1410:5: ( (otherlv_4= RULE_ID ) )
                    // InternalIoT.g:1411:6: (otherlv_4= RULE_ID )
                    {
                    // InternalIoT.g:1411:6: (otherlv_4= RULE_ID )
                    // InternalIoT.g:1412:7: otherlv_4= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFetchDataRule());
                    							}
                    						
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_23); 

                    							newLeafNode(otherlv_4, grammarAccess.getFetchDataAccess().getFilterSensorTypeCrossReference_3_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:1425:4: (otherlv_5= 'group' ( (otherlv_6= RULE_ID ) ) )
                    {
                    // InternalIoT.g:1425:4: (otherlv_5= 'group' ( (otherlv_6= RULE_ID ) ) )
                    // InternalIoT.g:1426:5: otherlv_5= 'group' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_4); 

                    					newLeafNode(otherlv_5, grammarAccess.getFetchDataAccess().getGroupKeyword_3_1_0());
                    				
                    // InternalIoT.g:1430:5: ( (otherlv_6= RULE_ID ) )
                    // InternalIoT.g:1431:6: (otherlv_6= RULE_ID )
                    {
                    // InternalIoT.g:1431:6: (otherlv_6= RULE_ID )
                    // InternalIoT.g:1432:7: otherlv_6= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFetchDataRule());
                    							}
                    						
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_23); 

                    							newLeafNode(otherlv_6, grammarAccess.getFetchDataAccess().getFilterSensorGroupCrossReference_3_1_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,41,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getFetchDataAccess().getToKeyword_4());
            		
            // InternalIoT.g:1449:3: ( (otherlv_8= 'destination' ( (otherlv_9= RULE_ID ) ) ) | (otherlv_10= 'server' ( (otherlv_11= RULE_ID ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==42) ) {
                alt11=1;
            }
            else if ( (LA11_0==43) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalIoT.g:1450:4: (otherlv_8= 'destination' ( (otherlv_9= RULE_ID ) ) )
                    {
                    // InternalIoT.g:1450:4: (otherlv_8= 'destination' ( (otherlv_9= RULE_ID ) ) )
                    // InternalIoT.g:1451:5: otherlv_8= 'destination' ( (otherlv_9= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,42,FOLLOW_4); 

                    					newLeafNode(otherlv_8, grammarAccess.getFetchDataAccess().getDestinationKeyword_5_0_0());
                    				
                    // InternalIoT.g:1455:5: ( (otherlv_9= RULE_ID ) )
                    // InternalIoT.g:1456:6: (otherlv_9= RULE_ID )
                    {
                    // InternalIoT.g:1456:6: (otherlv_9= RULE_ID )
                    // InternalIoT.g:1457:7: otherlv_9= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFetchDataRule());
                    							}
                    						
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_25); 

                    							newLeafNode(otherlv_9, grammarAccess.getFetchDataAccess().getDestinationDestinationCrossReference_5_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:1470:4: (otherlv_10= 'server' ( (otherlv_11= RULE_ID ) ) )
                    {
                    // InternalIoT.g:1470:4: (otherlv_10= 'server' ( (otherlv_11= RULE_ID ) ) )
                    // InternalIoT.g:1471:5: otherlv_10= 'server' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,43,FOLLOW_4); 

                    					newLeafNode(otherlv_10, grammarAccess.getFetchDataAccess().getServerKeyword_5_1_0());
                    				
                    // InternalIoT.g:1475:5: ( (otherlv_11= RULE_ID ) )
                    // InternalIoT.g:1476:6: (otherlv_11= RULE_ID )
                    {
                    // InternalIoT.g:1476:6: (otherlv_11= RULE_ID )
                    // InternalIoT.g:1477:7: otherlv_11= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFetchDataRule());
                    							}
                    						
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_25); 

                    							newLeafNode(otherlv_11, grammarAccess.getFetchDataAccess().getDestinationServerCrossReference_5_1_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalIoT.g:1490:3: ( ( (lv_conExp_12_0= ruleFetchDataExpression ) ) | ( (lv_conExp_13_0= ruleFetchDataCondition ) ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==44) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=45 && LA12_0<=46)) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // InternalIoT.g:1491:4: ( (lv_conExp_12_0= ruleFetchDataExpression ) )
                    {
                    // InternalIoT.g:1491:4: ( (lv_conExp_12_0= ruleFetchDataExpression ) )
                    // InternalIoT.g:1492:5: (lv_conExp_12_0= ruleFetchDataExpression )
                    {
                    // InternalIoT.g:1492:5: (lv_conExp_12_0= ruleFetchDataExpression )
                    // InternalIoT.g:1493:6: lv_conExp_12_0= ruleFetchDataExpression
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
                    // InternalIoT.g:1511:4: ( (lv_conExp_13_0= ruleFetchDataCondition ) )
                    {
                    // InternalIoT.g:1511:4: ( (lv_conExp_13_0= ruleFetchDataCondition ) )
                    // InternalIoT.g:1512:5: (lv_conExp_13_0= ruleFetchDataCondition )
                    {
                    // InternalIoT.g:1512:5: (lv_conExp_13_0= ruleFetchDataCondition )
                    // InternalIoT.g:1513:6: lv_conExp_13_0= ruleFetchDataCondition
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
    // InternalIoT.g:1535:1: entryRuleFetchDataExpression returns [EObject current=null] : iv_ruleFetchDataExpression= ruleFetchDataExpression EOF ;
    public final EObject entryRuleFetchDataExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFetchDataExpression = null;


        try {
            // InternalIoT.g:1535:60: (iv_ruleFetchDataExpression= ruleFetchDataExpression EOF )
            // InternalIoT.g:1536:2: iv_ruleFetchDataExpression= ruleFetchDataExpression EOF
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
    // InternalIoT.g:1542:1: ruleFetchDataExpression returns [EObject current=null] : (otherlv_0= 'every' ( (lv_duration_1_0= ruleTime ) ) ( (lv_timeUnit_2_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleFetchDataExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_duration_1_0 = null;

        AntlrDatatypeRuleToken lv_timeUnit_2_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:1548:2: ( (otherlv_0= 'every' ( (lv_duration_1_0= ruleTime ) ) ( (lv_timeUnit_2_0= ruleTimeUnit ) ) ) )
            // InternalIoT.g:1549:2: (otherlv_0= 'every' ( (lv_duration_1_0= ruleTime ) ) ( (lv_timeUnit_2_0= ruleTimeUnit ) ) )
            {
            // InternalIoT.g:1549:2: (otherlv_0= 'every' ( (lv_duration_1_0= ruleTime ) ) ( (lv_timeUnit_2_0= ruleTimeUnit ) ) )
            // InternalIoT.g:1550:3: otherlv_0= 'every' ( (lv_duration_1_0= ruleTime ) ) ( (lv_timeUnit_2_0= ruleTimeUnit ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getFetchDataExpressionAccess().getEveryKeyword_0());
            		
            // InternalIoT.g:1554:3: ( (lv_duration_1_0= ruleTime ) )
            // InternalIoT.g:1555:4: (lv_duration_1_0= ruleTime )
            {
            // InternalIoT.g:1555:4: (lv_duration_1_0= ruleTime )
            // InternalIoT.g:1556:5: lv_duration_1_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getFetchDataExpressionAccess().getDurationTimeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalIoT.g:1573:3: ( (lv_timeUnit_2_0= ruleTimeUnit ) )
            // InternalIoT.g:1574:4: (lv_timeUnit_2_0= ruleTimeUnit )
            {
            // InternalIoT.g:1574:4: (lv_timeUnit_2_0= ruleTimeUnit )
            // InternalIoT.g:1575:5: lv_timeUnit_2_0= ruleTimeUnit
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
    // InternalIoT.g:1596:1: entryRuleFetchDataCondition returns [EObject current=null] : iv_ruleFetchDataCondition= ruleFetchDataCondition EOF ;
    public final EObject entryRuleFetchDataCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFetchDataCondition = null;


        try {
            // InternalIoT.g:1596:59: (iv_ruleFetchDataCondition= ruleFetchDataCondition EOF )
            // InternalIoT.g:1597:2: iv_ruleFetchDataCondition= ruleFetchDataCondition EOF
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
    // InternalIoT.g:1603:1: ruleFetchDataCondition returns [EObject current=null] : ( (otherlv_0= 'when' | otherlv_1= 'if' ) ( (lv_condition_2_0= ruleCondition ) ) ) ;
    public final EObject ruleFetchDataCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:1609:2: ( ( (otherlv_0= 'when' | otherlv_1= 'if' ) ( (lv_condition_2_0= ruleCondition ) ) ) )
            // InternalIoT.g:1610:2: ( (otherlv_0= 'when' | otherlv_1= 'if' ) ( (lv_condition_2_0= ruleCondition ) ) )
            {
            // InternalIoT.g:1610:2: ( (otherlv_0= 'when' | otherlv_1= 'if' ) ( (lv_condition_2_0= ruleCondition ) ) )
            // InternalIoT.g:1611:3: (otherlv_0= 'when' | otherlv_1= 'if' ) ( (lv_condition_2_0= ruleCondition ) )
            {
            // InternalIoT.g:1611:3: (otherlv_0= 'when' | otherlv_1= 'if' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==45) ) {
                alt13=1;
            }
            else if ( (LA13_0==46) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalIoT.g:1612:4: otherlv_0= 'when'
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_27); 

                    				newLeafNode(otherlv_0, grammarAccess.getFetchDataConditionAccess().getWhenKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalIoT.g:1617:4: otherlv_1= 'if'
                    {
                    otherlv_1=(Token)match(input,46,FOLLOW_27); 

                    				newLeafNode(otherlv_1, grammarAccess.getFetchDataConditionAccess().getIfKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalIoT.g:1622:3: ( (lv_condition_2_0= ruleCondition ) )
            // InternalIoT.g:1623:4: (lv_condition_2_0= ruleCondition )
            {
            // InternalIoT.g:1623:4: (lv_condition_2_0= ruleCondition )
            // InternalIoT.g:1624:5: lv_condition_2_0= ruleCondition
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
    // InternalIoT.g:1645:1: entryRuleTimeUnit returns [String current=null] : iv_ruleTimeUnit= ruleTimeUnit EOF ;
    public final String entryRuleTimeUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimeUnit = null;


        try {
            // InternalIoT.g:1645:48: (iv_ruleTimeUnit= ruleTimeUnit EOF )
            // InternalIoT.g:1646:2: iv_ruleTimeUnit= ruleTimeUnit EOF
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
    // InternalIoT.g:1652:1: ruleTimeUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ms' | kw= 's' | kw= 'm' | kw= 'h' ) ;
    public final AntlrDatatypeRuleToken ruleTimeUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalIoT.g:1658:2: ( (kw= 'ms' | kw= 's' | kw= 'm' | kw= 'h' ) )
            // InternalIoT.g:1659:2: (kw= 'ms' | kw= 's' | kw= 'm' | kw= 'h' )
            {
            // InternalIoT.g:1659:2: (kw= 'ms' | kw= 's' | kw= 'm' | kw= 'h' )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt14=1;
                }
                break;
            case 48:
                {
                alt14=2;
                }
                break;
            case 49:
                {
                alt14=3;
                }
                break;
            case 50:
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
                    // InternalIoT.g:1660:3: kw= 'ms'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTimeUnitAccess().getMsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalIoT.g:1666:3: kw= 's'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTimeUnitAccess().getSKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalIoT.g:1672:3: kw= 'm'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTimeUnitAccess().getMKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalIoT.g:1678:3: kw= 'h'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

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
    // InternalIoT.g:1687:1: entryRuleCondition returns [String current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final String entryRuleCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCondition = null;


        try {
            // InternalIoT.g:1687:49: (iv_ruleCondition= ruleCondition EOF )
            // InternalIoT.g:1688:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalIoT.g:1694:1: ruleCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '_??' ;
    public final AntlrDatatypeRuleToken ruleCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalIoT.g:1700:2: (kw= '_??' )
            // InternalIoT.g:1701:2: kw= '_??'
            {
            kw=(Token)match(input,51,FOLLOW_2); 

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


    // $ANTLR start "entryRulePortnumber"
    // InternalIoT.g:1709:1: entryRulePortnumber returns [EObject current=null] : iv_rulePortnumber= rulePortnumber EOF ;
    public final EObject entryRulePortnumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortnumber = null;


        try {
            // InternalIoT.g:1709:51: (iv_rulePortnumber= rulePortnumber EOF )
            // InternalIoT.g:1710:2: iv_rulePortnumber= rulePortnumber EOF
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
    // InternalIoT.g:1716:1: rulePortnumber returns [EObject current=null] : ( () ( (lv_number_1_0= RULE_NUMBER ) ) ) ;
    public final EObject rulePortnumber() throws RecognitionException {
        EObject current = null;

        Token lv_number_1_0=null;


        	enterRule();

        try {
            // InternalIoT.g:1722:2: ( ( () ( (lv_number_1_0= RULE_NUMBER ) ) ) )
            // InternalIoT.g:1723:2: ( () ( (lv_number_1_0= RULE_NUMBER ) ) )
            {
            // InternalIoT.g:1723:2: ( () ( (lv_number_1_0= RULE_NUMBER ) ) )
            // InternalIoT.g:1724:3: () ( (lv_number_1_0= RULE_NUMBER ) )
            {
            // InternalIoT.g:1724:3: ()
            // InternalIoT.g:1725:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPortnumberAccess().getPortnumberAction_0(),
            					current);
            			

            }

            // InternalIoT.g:1731:3: ( (lv_number_1_0= RULE_NUMBER ) )
            // InternalIoT.g:1732:4: (lv_number_1_0= RULE_NUMBER )
            {
            // InternalIoT.g:1732:4: (lv_number_1_0= RULE_NUMBER )
            // InternalIoT.g:1733:5: lv_number_1_0= RULE_NUMBER
            {
            lv_number_1_0=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

            					newLeafNode(lv_number_1_0, grammarAccess.getPortnumberAccess().getNumberNUMBERTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortnumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_1_0,
            						"org.xtext.sdu.IoT.NUMBER");
            				

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
    // InternalIoT.g:1753:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalIoT.g:1753:45: (iv_ruleTime= ruleTime EOF )
            // InternalIoT.g:1754:2: iv_ruleTime= ruleTime EOF
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
    // InternalIoT.g:1760:1: ruleTime returns [EObject current=null] : ( (lv_time_0_0= RULE_NUMBER ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token lv_time_0_0=null;


        	enterRule();

        try {
            // InternalIoT.g:1766:2: ( ( (lv_time_0_0= RULE_NUMBER ) ) )
            // InternalIoT.g:1767:2: ( (lv_time_0_0= RULE_NUMBER ) )
            {
            // InternalIoT.g:1767:2: ( (lv_time_0_0= RULE_NUMBER ) )
            // InternalIoT.g:1768:3: (lv_time_0_0= RULE_NUMBER )
            {
            // InternalIoT.g:1768:3: (lv_time_0_0= RULE_NUMBER )
            // InternalIoT.g:1769:4: lv_time_0_0= RULE_NUMBER
            {
            lv_time_0_0=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

            				newLeafNode(lv_time_0_0, grammarAccess.getTimeAccess().getTimeNUMBERTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTimeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"time",
            					lv_time_0_0,
            					"org.xtext.sdu.IoT.NUMBER");
            			

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


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\1\14\10\uffff\1\4\3\uffff\1\17\2\uffff";
    static final String dfa_3s = "\1\45\10\uffff\1\4\3\uffff\1\37\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\13\1\14\1\15\1\uffff\1\12\1\11";
    static final String dfa_5s = "\20\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\2\2\uffff\1\3\3\uffff\1\4\3\uffff\1\5\1\6\1\uffff\1\7\1\10\1\11\4\uffff\1\12\1\13\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15",
            "",
            "",
            "",
            "\1\17\17\uffff\1\16",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "80:4: (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleDeviceGroup | lv_system_0_8= ruleServerTypes | lv_system_0_9= ruleServerFromType | lv_system_0_10= ruleServer | lv_system_0_11= ruleDestinationTypes | lv_system_0_12= ruleDestination | lv_system_0_13= ruleFetchData )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000003876225002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000700000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0008000000000000L});

}