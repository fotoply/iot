package org.xtext.sdu.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.sdu.services.IoTGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIoTParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'_??'", "'when'", "'if'", "'ms'", "'s'", "'m'", "'h'", "'SensorTypes'", "','", "'Sensor'", "'of'", "'type'", "'SensorGroup'", "'include'", "'{'", "'}'", "'SensorGetMethod'", "'for'", "'('", "')'", "'DeviceTypes'", "'Device'", "'contains'", "'DeviceGroup'", "'ServerTypes'", "'Server'", "'listens'", "'ip'", "'on'", "'sends'", "'DestinationTypes'", "'Destination'", "'Fetch'", "'data'", "'from'", "'to'", "'group'", "'destination'", "'server'", "'every'"
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

    	public void setGrammarAccess(IoTGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSystem"
    // InternalIoT.g:53:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalIoT.g:54:1: ( ruleSystem EOF )
            // InternalIoT.g:55:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalIoT.g:62:1: ruleSystem : ( ( ( rule__System__SystemAssignment ) ) ( ( rule__System__SystemAssignment )* ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:66:2: ( ( ( ( rule__System__SystemAssignment ) ) ( ( rule__System__SystemAssignment )* ) ) )
            // InternalIoT.g:67:2: ( ( ( rule__System__SystemAssignment ) ) ( ( rule__System__SystemAssignment )* ) )
            {
            // InternalIoT.g:67:2: ( ( ( rule__System__SystemAssignment ) ) ( ( rule__System__SystemAssignment )* ) )
            // InternalIoT.g:68:3: ( ( rule__System__SystemAssignment ) ) ( ( rule__System__SystemAssignment )* )
            {
            // InternalIoT.g:68:3: ( ( rule__System__SystemAssignment ) )
            // InternalIoT.g:69:4: ( rule__System__SystemAssignment )
            {
             before(grammarAccess.getSystemAccess().getSystemAssignment()); 
            // InternalIoT.g:70:4: ( rule__System__SystemAssignment )
            // InternalIoT.g:70:5: rule__System__SystemAssignment
            {
            pushFollow(FOLLOW_3);
            rule__System__SystemAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getSystemAssignment()); 

            }

            // InternalIoT.g:73:3: ( ( rule__System__SystemAssignment )* )
            // InternalIoT.g:74:4: ( rule__System__SystemAssignment )*
            {
             before(grammarAccess.getSystemAccess().getSystemAssignment()); 
            // InternalIoT.g:75:4: ( rule__System__SystemAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19||LA1_0==21||LA1_0==24||LA1_0==28||(LA1_0>=32 && LA1_0<=33)||(LA1_0>=35 && LA1_0<=37)||(LA1_0>=42 && LA1_0<=44)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIoT.g:75:5: rule__System__SystemAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__System__SystemAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getSystemAssignment()); 

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleSensorType"
    // InternalIoT.g:85:1: entryRuleSensorType : ruleSensorType EOF ;
    public final void entryRuleSensorType() throws RecognitionException {
        try {
            // InternalIoT.g:86:1: ( ruleSensorType EOF )
            // InternalIoT.g:87:1: ruleSensorType EOF
            {
             before(grammarAccess.getSensorTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorType();

            state._fsp--;

             after(grammarAccess.getSensorTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensorType"


    // $ANTLR start "ruleSensorType"
    // InternalIoT.g:94:1: ruleSensorType : ( ( rule__SensorType__NameAssignment ) ) ;
    public final void ruleSensorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:98:2: ( ( ( rule__SensorType__NameAssignment ) ) )
            // InternalIoT.g:99:2: ( ( rule__SensorType__NameAssignment ) )
            {
            // InternalIoT.g:99:2: ( ( rule__SensorType__NameAssignment ) )
            // InternalIoT.g:100:3: ( rule__SensorType__NameAssignment )
            {
             before(grammarAccess.getSensorTypeAccess().getNameAssignment()); 
            // InternalIoT.g:101:3: ( rule__SensorType__NameAssignment )
            // InternalIoT.g:101:4: rule__SensorType__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SensorType__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSensorTypeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorType"


    // $ANTLR start "entryRuleSensorTypes"
    // InternalIoT.g:110:1: entryRuleSensorTypes : ruleSensorTypes EOF ;
    public final void entryRuleSensorTypes() throws RecognitionException {
        try {
            // InternalIoT.g:111:1: ( ruleSensorTypes EOF )
            // InternalIoT.g:112:1: ruleSensorTypes EOF
            {
             before(grammarAccess.getSensorTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorTypes();

            state._fsp--;

             after(grammarAccess.getSensorTypesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensorTypes"


    // $ANTLR start "ruleSensorTypes"
    // InternalIoT.g:119:1: ruleSensorTypes : ( ( rule__SensorTypes__Group__0 ) ) ;
    public final void ruleSensorTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:123:2: ( ( ( rule__SensorTypes__Group__0 ) ) )
            // InternalIoT.g:124:2: ( ( rule__SensorTypes__Group__0 ) )
            {
            // InternalIoT.g:124:2: ( ( rule__SensorTypes__Group__0 ) )
            // InternalIoT.g:125:3: ( rule__SensorTypes__Group__0 )
            {
             before(grammarAccess.getSensorTypesAccess().getGroup()); 
            // InternalIoT.g:126:3: ( rule__SensorTypes__Group__0 )
            // InternalIoT.g:126:4: rule__SensorTypes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorTypes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorTypesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorTypes"


    // $ANTLR start "entryRuleSensor"
    // InternalIoT.g:135:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalIoT.g:136:1: ( ruleSensor EOF )
            // InternalIoT.g:137:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalIoT.g:144:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:148:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalIoT.g:149:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalIoT.g:149:2: ( ( rule__Sensor__Group__0 ) )
            // InternalIoT.g:150:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalIoT.g:151:3: ( rule__Sensor__Group__0 )
            // InternalIoT.g:151:4: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleSensorGroup"
    // InternalIoT.g:160:1: entryRuleSensorGroup : ruleSensorGroup EOF ;
    public final void entryRuleSensorGroup() throws RecognitionException {
        try {
            // InternalIoT.g:161:1: ( ruleSensorGroup EOF )
            // InternalIoT.g:162:1: ruleSensorGroup EOF
            {
             before(grammarAccess.getSensorGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorGroup();

            state._fsp--;

             after(grammarAccess.getSensorGroupRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensorGroup"


    // $ANTLR start "ruleSensorGroup"
    // InternalIoT.g:169:1: ruleSensorGroup : ( ( rule__SensorGroup__Group__0 ) ) ;
    public final void ruleSensorGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:173:2: ( ( ( rule__SensorGroup__Group__0 ) ) )
            // InternalIoT.g:174:2: ( ( rule__SensorGroup__Group__0 ) )
            {
            // InternalIoT.g:174:2: ( ( rule__SensorGroup__Group__0 ) )
            // InternalIoT.g:175:3: ( rule__SensorGroup__Group__0 )
            {
             before(grammarAccess.getSensorGroupAccess().getGroup()); 
            // InternalIoT.g:176:3: ( rule__SensorGroup__Group__0 )
            // InternalIoT.g:176:4: rule__SensorGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorGroup"


    // $ANTLR start "entryRuleSensorGetMethod"
    // InternalIoT.g:185:1: entryRuleSensorGetMethod : ruleSensorGetMethod EOF ;
    public final void entryRuleSensorGetMethod() throws RecognitionException {
        try {
            // InternalIoT.g:186:1: ( ruleSensorGetMethod EOF )
            // InternalIoT.g:187:1: ruleSensorGetMethod EOF
            {
             before(grammarAccess.getSensorGetMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorGetMethod();

            state._fsp--;

             after(grammarAccess.getSensorGetMethodRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensorGetMethod"


    // $ANTLR start "ruleSensorGetMethod"
    // InternalIoT.g:194:1: ruleSensorGetMethod : ( ( rule__SensorGetMethod__Group__0 ) ) ;
    public final void ruleSensorGetMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:198:2: ( ( ( rule__SensorGetMethod__Group__0 ) ) )
            // InternalIoT.g:199:2: ( ( rule__SensorGetMethod__Group__0 ) )
            {
            // InternalIoT.g:199:2: ( ( rule__SensorGetMethod__Group__0 ) )
            // InternalIoT.g:200:3: ( rule__SensorGetMethod__Group__0 )
            {
             before(grammarAccess.getSensorGetMethodAccess().getGroup()); 
            // InternalIoT.g:201:3: ( rule__SensorGetMethod__Group__0 )
            // InternalIoT.g:201:4: rule__SensorGetMethod__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorGetMethod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorGetMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorGetMethod"


    // $ANTLR start "entryRuleMethod"
    // InternalIoT.g:210:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalIoT.g:211:1: ( ruleMethod EOF )
            // InternalIoT.g:212:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalIoT.g:219:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:223:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalIoT.g:224:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalIoT.g:224:2: ( ( rule__Method__Group__0 ) )
            // InternalIoT.g:225:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalIoT.g:226:3: ( rule__Method__Group__0 )
            // InternalIoT.g:226:4: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleDeviceType"
    // InternalIoT.g:235:1: entryRuleDeviceType : ruleDeviceType EOF ;
    public final void entryRuleDeviceType() throws RecognitionException {
        try {
            // InternalIoT.g:236:1: ( ruleDeviceType EOF )
            // InternalIoT.g:237:1: ruleDeviceType EOF
            {
             before(grammarAccess.getDeviceTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDeviceType();

            state._fsp--;

             after(grammarAccess.getDeviceTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeviceType"


    // $ANTLR start "ruleDeviceType"
    // InternalIoT.g:244:1: ruleDeviceType : ( ( rule__DeviceType__NameAssignment ) ) ;
    public final void ruleDeviceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:248:2: ( ( ( rule__DeviceType__NameAssignment ) ) )
            // InternalIoT.g:249:2: ( ( rule__DeviceType__NameAssignment ) )
            {
            // InternalIoT.g:249:2: ( ( rule__DeviceType__NameAssignment ) )
            // InternalIoT.g:250:3: ( rule__DeviceType__NameAssignment )
            {
             before(grammarAccess.getDeviceTypeAccess().getNameAssignment()); 
            // InternalIoT.g:251:3: ( rule__DeviceType__NameAssignment )
            // InternalIoT.g:251:4: rule__DeviceType__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DeviceType__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDeviceTypeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeviceType"


    // $ANTLR start "entryRuleDeviceTypes"
    // InternalIoT.g:260:1: entryRuleDeviceTypes : ruleDeviceTypes EOF ;
    public final void entryRuleDeviceTypes() throws RecognitionException {
        try {
            // InternalIoT.g:261:1: ( ruleDeviceTypes EOF )
            // InternalIoT.g:262:1: ruleDeviceTypes EOF
            {
             before(grammarAccess.getDeviceTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleDeviceTypes();

            state._fsp--;

             after(grammarAccess.getDeviceTypesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeviceTypes"


    // $ANTLR start "ruleDeviceTypes"
    // InternalIoT.g:269:1: ruleDeviceTypes : ( ( rule__DeviceTypes__Group__0 ) ) ;
    public final void ruleDeviceTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:273:2: ( ( ( rule__DeviceTypes__Group__0 ) ) )
            // InternalIoT.g:274:2: ( ( rule__DeviceTypes__Group__0 ) )
            {
            // InternalIoT.g:274:2: ( ( rule__DeviceTypes__Group__0 ) )
            // InternalIoT.g:275:3: ( rule__DeviceTypes__Group__0 )
            {
             before(grammarAccess.getDeviceTypesAccess().getGroup()); 
            // InternalIoT.g:276:3: ( rule__DeviceTypes__Group__0 )
            // InternalIoT.g:276:4: rule__DeviceTypes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeviceTypes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceTypesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeviceTypes"


    // $ANTLR start "entryRuleDevice"
    // InternalIoT.g:285:1: entryRuleDevice : ruleDevice EOF ;
    public final void entryRuleDevice() throws RecognitionException {
        try {
            // InternalIoT.g:286:1: ( ruleDevice EOF )
            // InternalIoT.g:287:1: ruleDevice EOF
            {
             before(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getDeviceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalIoT.g:294:1: ruleDevice : ( ( rule__Device__Group__0 ) ) ;
    public final void ruleDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:298:2: ( ( ( rule__Device__Group__0 ) ) )
            // InternalIoT.g:299:2: ( ( rule__Device__Group__0 ) )
            {
            // InternalIoT.g:299:2: ( ( rule__Device__Group__0 ) )
            // InternalIoT.g:300:3: ( rule__Device__Group__0 )
            {
             before(grammarAccess.getDeviceAccess().getGroup()); 
            // InternalIoT.g:301:3: ( rule__Device__Group__0 )
            // InternalIoT.g:301:4: rule__Device__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleDeviceGroup"
    // InternalIoT.g:310:1: entryRuleDeviceGroup : ruleDeviceGroup EOF ;
    public final void entryRuleDeviceGroup() throws RecognitionException {
        try {
            // InternalIoT.g:311:1: ( ruleDeviceGroup EOF )
            // InternalIoT.g:312:1: ruleDeviceGroup EOF
            {
             before(grammarAccess.getDeviceGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleDeviceGroup();

            state._fsp--;

             after(grammarAccess.getDeviceGroupRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeviceGroup"


    // $ANTLR start "ruleDeviceGroup"
    // InternalIoT.g:319:1: ruleDeviceGroup : ( ( rule__DeviceGroup__Group__0 ) ) ;
    public final void ruleDeviceGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:323:2: ( ( ( rule__DeviceGroup__Group__0 ) ) )
            // InternalIoT.g:324:2: ( ( rule__DeviceGroup__Group__0 ) )
            {
            // InternalIoT.g:324:2: ( ( rule__DeviceGroup__Group__0 ) )
            // InternalIoT.g:325:3: ( rule__DeviceGroup__Group__0 )
            {
             before(grammarAccess.getDeviceGroupAccess().getGroup()); 
            // InternalIoT.g:326:3: ( rule__DeviceGroup__Group__0 )
            // InternalIoT.g:326:4: rule__DeviceGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeviceGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeviceGroup"


    // $ANTLR start "entryRuleServerType"
    // InternalIoT.g:335:1: entryRuleServerType : ruleServerType EOF ;
    public final void entryRuleServerType() throws RecognitionException {
        try {
            // InternalIoT.g:336:1: ( ruleServerType EOF )
            // InternalIoT.g:337:1: ruleServerType EOF
            {
             before(grammarAccess.getServerTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleServerType();

            state._fsp--;

             after(grammarAccess.getServerTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleServerType"


    // $ANTLR start "ruleServerType"
    // InternalIoT.g:344:1: ruleServerType : ( ( rule__ServerType__NameAssignment ) ) ;
    public final void ruleServerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:348:2: ( ( ( rule__ServerType__NameAssignment ) ) )
            // InternalIoT.g:349:2: ( ( rule__ServerType__NameAssignment ) )
            {
            // InternalIoT.g:349:2: ( ( rule__ServerType__NameAssignment ) )
            // InternalIoT.g:350:3: ( rule__ServerType__NameAssignment )
            {
             before(grammarAccess.getServerTypeAccess().getNameAssignment()); 
            // InternalIoT.g:351:3: ( rule__ServerType__NameAssignment )
            // InternalIoT.g:351:4: rule__ServerType__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ServerType__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getServerTypeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServerType"


    // $ANTLR start "entryRuleServerTypes"
    // InternalIoT.g:360:1: entryRuleServerTypes : ruleServerTypes EOF ;
    public final void entryRuleServerTypes() throws RecognitionException {
        try {
            // InternalIoT.g:361:1: ( ruleServerTypes EOF )
            // InternalIoT.g:362:1: ruleServerTypes EOF
            {
             before(grammarAccess.getServerTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleServerTypes();

            state._fsp--;

             after(grammarAccess.getServerTypesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleServerTypes"


    // $ANTLR start "ruleServerTypes"
    // InternalIoT.g:369:1: ruleServerTypes : ( ( rule__ServerTypes__Group__0 ) ) ;
    public final void ruleServerTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:373:2: ( ( ( rule__ServerTypes__Group__0 ) ) )
            // InternalIoT.g:374:2: ( ( rule__ServerTypes__Group__0 ) )
            {
            // InternalIoT.g:374:2: ( ( rule__ServerTypes__Group__0 ) )
            // InternalIoT.g:375:3: ( rule__ServerTypes__Group__0 )
            {
             before(grammarAccess.getServerTypesAccess().getGroup()); 
            // InternalIoT.g:376:3: ( rule__ServerTypes__Group__0 )
            // InternalIoT.g:376:4: rule__ServerTypes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServerTypes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServerTypesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServerTypes"


    // $ANTLR start "entryRuleServerFromType"
    // InternalIoT.g:385:1: entryRuleServerFromType : ruleServerFromType EOF ;
    public final void entryRuleServerFromType() throws RecognitionException {
        try {
            // InternalIoT.g:386:1: ( ruleServerFromType EOF )
            // InternalIoT.g:387:1: ruleServerFromType EOF
            {
             before(grammarAccess.getServerFromTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleServerFromType();

            state._fsp--;

             after(grammarAccess.getServerFromTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleServerFromType"


    // $ANTLR start "ruleServerFromType"
    // InternalIoT.g:394:1: ruleServerFromType : ( ( rule__ServerFromType__Group__0 ) ) ;
    public final void ruleServerFromType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:398:2: ( ( ( rule__ServerFromType__Group__0 ) ) )
            // InternalIoT.g:399:2: ( ( rule__ServerFromType__Group__0 ) )
            {
            // InternalIoT.g:399:2: ( ( rule__ServerFromType__Group__0 ) )
            // InternalIoT.g:400:3: ( rule__ServerFromType__Group__0 )
            {
             before(grammarAccess.getServerFromTypeAccess().getGroup()); 
            // InternalIoT.g:401:3: ( rule__ServerFromType__Group__0 )
            // InternalIoT.g:401:4: rule__ServerFromType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServerFromType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServerFromTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServerFromType"


    // $ANTLR start "entryRuleServer"
    // InternalIoT.g:410:1: entryRuleServer : ruleServer EOF ;
    public final void entryRuleServer() throws RecognitionException {
        try {
            // InternalIoT.g:411:1: ( ruleServer EOF )
            // InternalIoT.g:412:1: ruleServer EOF
            {
             before(grammarAccess.getServerRule()); 
            pushFollow(FOLLOW_1);
            ruleServer();

            state._fsp--;

             after(grammarAccess.getServerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleServer"


    // $ANTLR start "ruleServer"
    // InternalIoT.g:419:1: ruleServer : ( ( rule__Server__Group__0 ) ) ;
    public final void ruleServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:423:2: ( ( ( rule__Server__Group__0 ) ) )
            // InternalIoT.g:424:2: ( ( rule__Server__Group__0 ) )
            {
            // InternalIoT.g:424:2: ( ( rule__Server__Group__0 ) )
            // InternalIoT.g:425:3: ( rule__Server__Group__0 )
            {
             before(grammarAccess.getServerAccess().getGroup()); 
            // InternalIoT.g:426:3: ( rule__Server__Group__0 )
            // InternalIoT.g:426:4: rule__Server__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Server__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServer"


    // $ANTLR start "entryRuleDestinationType"
    // InternalIoT.g:435:1: entryRuleDestinationType : ruleDestinationType EOF ;
    public final void entryRuleDestinationType() throws RecognitionException {
        try {
            // InternalIoT.g:436:1: ( ruleDestinationType EOF )
            // InternalIoT.g:437:1: ruleDestinationType EOF
            {
             before(grammarAccess.getDestinationTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDestinationType();

            state._fsp--;

             after(grammarAccess.getDestinationTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDestinationType"


    // $ANTLR start "ruleDestinationType"
    // InternalIoT.g:444:1: ruleDestinationType : ( ( rule__DestinationType__NameAssignment ) ) ;
    public final void ruleDestinationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:448:2: ( ( ( rule__DestinationType__NameAssignment ) ) )
            // InternalIoT.g:449:2: ( ( rule__DestinationType__NameAssignment ) )
            {
            // InternalIoT.g:449:2: ( ( rule__DestinationType__NameAssignment ) )
            // InternalIoT.g:450:3: ( rule__DestinationType__NameAssignment )
            {
             before(grammarAccess.getDestinationTypeAccess().getNameAssignment()); 
            // InternalIoT.g:451:3: ( rule__DestinationType__NameAssignment )
            // InternalIoT.g:451:4: rule__DestinationType__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DestinationType__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDestinationTypeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDestinationType"


    // $ANTLR start "entryRuleDestinationTypes"
    // InternalIoT.g:460:1: entryRuleDestinationTypes : ruleDestinationTypes EOF ;
    public final void entryRuleDestinationTypes() throws RecognitionException {
        try {
            // InternalIoT.g:461:1: ( ruleDestinationTypes EOF )
            // InternalIoT.g:462:1: ruleDestinationTypes EOF
            {
             before(grammarAccess.getDestinationTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleDestinationTypes();

            state._fsp--;

             after(grammarAccess.getDestinationTypesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDestinationTypes"


    // $ANTLR start "ruleDestinationTypes"
    // InternalIoT.g:469:1: ruleDestinationTypes : ( ( rule__DestinationTypes__Group__0 ) ) ;
    public final void ruleDestinationTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:473:2: ( ( ( rule__DestinationTypes__Group__0 ) ) )
            // InternalIoT.g:474:2: ( ( rule__DestinationTypes__Group__0 ) )
            {
            // InternalIoT.g:474:2: ( ( rule__DestinationTypes__Group__0 ) )
            // InternalIoT.g:475:3: ( rule__DestinationTypes__Group__0 )
            {
             before(grammarAccess.getDestinationTypesAccess().getGroup()); 
            // InternalIoT.g:476:3: ( rule__DestinationTypes__Group__0 )
            // InternalIoT.g:476:4: rule__DestinationTypes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DestinationTypes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDestinationTypesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDestinationTypes"


    // $ANTLR start "entryRuleDestination"
    // InternalIoT.g:485:1: entryRuleDestination : ruleDestination EOF ;
    public final void entryRuleDestination() throws RecognitionException {
        try {
            // InternalIoT.g:486:1: ( ruleDestination EOF )
            // InternalIoT.g:487:1: ruleDestination EOF
            {
             before(grammarAccess.getDestinationRule()); 
            pushFollow(FOLLOW_1);
            ruleDestination();

            state._fsp--;

             after(grammarAccess.getDestinationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDestination"


    // $ANTLR start "ruleDestination"
    // InternalIoT.g:494:1: ruleDestination : ( ( rule__Destination__Group__0 ) ) ;
    public final void ruleDestination() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:498:2: ( ( ( rule__Destination__Group__0 ) ) )
            // InternalIoT.g:499:2: ( ( rule__Destination__Group__0 ) )
            {
            // InternalIoT.g:499:2: ( ( rule__Destination__Group__0 ) )
            // InternalIoT.g:500:3: ( rule__Destination__Group__0 )
            {
             before(grammarAccess.getDestinationAccess().getGroup()); 
            // InternalIoT.g:501:3: ( rule__Destination__Group__0 )
            // InternalIoT.g:501:4: rule__Destination__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Destination__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDestinationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDestination"


    // $ANTLR start "entryRuleFetchData"
    // InternalIoT.g:510:1: entryRuleFetchData : ruleFetchData EOF ;
    public final void entryRuleFetchData() throws RecognitionException {
        try {
            // InternalIoT.g:511:1: ( ruleFetchData EOF )
            // InternalIoT.g:512:1: ruleFetchData EOF
            {
             before(grammarAccess.getFetchDataRule()); 
            pushFollow(FOLLOW_1);
            ruleFetchData();

            state._fsp--;

             after(grammarAccess.getFetchDataRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFetchData"


    // $ANTLR start "ruleFetchData"
    // InternalIoT.g:519:1: ruleFetchData : ( ( rule__FetchData__Group__0 ) ) ;
    public final void ruleFetchData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:523:2: ( ( ( rule__FetchData__Group__0 ) ) )
            // InternalIoT.g:524:2: ( ( rule__FetchData__Group__0 ) )
            {
            // InternalIoT.g:524:2: ( ( rule__FetchData__Group__0 ) )
            // InternalIoT.g:525:3: ( rule__FetchData__Group__0 )
            {
             before(grammarAccess.getFetchDataAccess().getGroup()); 
            // InternalIoT.g:526:3: ( rule__FetchData__Group__0 )
            // InternalIoT.g:526:4: rule__FetchData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFetchData"


    // $ANTLR start "entryRuleFetchDataExpression"
    // InternalIoT.g:535:1: entryRuleFetchDataExpression : ruleFetchDataExpression EOF ;
    public final void entryRuleFetchDataExpression() throws RecognitionException {
        try {
            // InternalIoT.g:536:1: ( ruleFetchDataExpression EOF )
            // InternalIoT.g:537:1: ruleFetchDataExpression EOF
            {
             before(grammarAccess.getFetchDataExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleFetchDataExpression();

            state._fsp--;

             after(grammarAccess.getFetchDataExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFetchDataExpression"


    // $ANTLR start "ruleFetchDataExpression"
    // InternalIoT.g:544:1: ruleFetchDataExpression : ( ( rule__FetchDataExpression__Group__0 ) ) ;
    public final void ruleFetchDataExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:548:2: ( ( ( rule__FetchDataExpression__Group__0 ) ) )
            // InternalIoT.g:549:2: ( ( rule__FetchDataExpression__Group__0 ) )
            {
            // InternalIoT.g:549:2: ( ( rule__FetchDataExpression__Group__0 ) )
            // InternalIoT.g:550:3: ( rule__FetchDataExpression__Group__0 )
            {
             before(grammarAccess.getFetchDataExpressionAccess().getGroup()); 
            // InternalIoT.g:551:3: ( rule__FetchDataExpression__Group__0 )
            // InternalIoT.g:551:4: rule__FetchDataExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFetchDataExpression"


    // $ANTLR start "entryRuleFetchDataCondition"
    // InternalIoT.g:560:1: entryRuleFetchDataCondition : ruleFetchDataCondition EOF ;
    public final void entryRuleFetchDataCondition() throws RecognitionException {
        try {
            // InternalIoT.g:561:1: ( ruleFetchDataCondition EOF )
            // InternalIoT.g:562:1: ruleFetchDataCondition EOF
            {
             before(grammarAccess.getFetchDataConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleFetchDataCondition();

            state._fsp--;

             after(grammarAccess.getFetchDataConditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFetchDataCondition"


    // $ANTLR start "ruleFetchDataCondition"
    // InternalIoT.g:569:1: ruleFetchDataCondition : ( ( rule__FetchDataCondition__Group__0 ) ) ;
    public final void ruleFetchDataCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:573:2: ( ( ( rule__FetchDataCondition__Group__0 ) ) )
            // InternalIoT.g:574:2: ( ( rule__FetchDataCondition__Group__0 ) )
            {
            // InternalIoT.g:574:2: ( ( rule__FetchDataCondition__Group__0 ) )
            // InternalIoT.g:575:3: ( rule__FetchDataCondition__Group__0 )
            {
             before(grammarAccess.getFetchDataConditionAccess().getGroup()); 
            // InternalIoT.g:576:3: ( rule__FetchDataCondition__Group__0 )
            // InternalIoT.g:576:4: rule__FetchDataCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFetchDataCondition"


    // $ANTLR start "entryRuleTimeUnit"
    // InternalIoT.g:585:1: entryRuleTimeUnit : ruleTimeUnit EOF ;
    public final void entryRuleTimeUnit() throws RecognitionException {
        try {
            // InternalIoT.g:586:1: ( ruleTimeUnit EOF )
            // InternalIoT.g:587:1: ruleTimeUnit EOF
            {
             before(grammarAccess.getTimeUnitRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getTimeUnitRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTimeUnit"


    // $ANTLR start "ruleTimeUnit"
    // InternalIoT.g:594:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:598:2: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // InternalIoT.g:599:2: ( ( rule__TimeUnit__Alternatives ) )
            {
            // InternalIoT.g:599:2: ( ( rule__TimeUnit__Alternatives ) )
            // InternalIoT.g:600:3: ( rule__TimeUnit__Alternatives )
            {
             before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            // InternalIoT.g:601:3: ( rule__TimeUnit__Alternatives )
            // InternalIoT.g:601:4: rule__TimeUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "entryRuleCondition"
    // InternalIoT.g:610:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalIoT.g:611:1: ( ruleCondition EOF )
            // InternalIoT.g:612:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalIoT.g:619:1: ruleCondition : ( '_??' ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:623:2: ( ( '_??' ) )
            // InternalIoT.g:624:2: ( '_??' )
            {
            // InternalIoT.g:624:2: ( '_??' )
            // InternalIoT.g:625:3: '_??'
            {
             before(grammarAccess.getConditionAccess().get_Keyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().get_Keyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRulePortnumber"
    // InternalIoT.g:635:1: entryRulePortnumber : rulePortnumber EOF ;
    public final void entryRulePortnumber() throws RecognitionException {
        try {
            // InternalIoT.g:636:1: ( rulePortnumber EOF )
            // InternalIoT.g:637:1: rulePortnumber EOF
            {
             before(grammarAccess.getPortnumberRule()); 
            pushFollow(FOLLOW_1);
            rulePortnumber();

            state._fsp--;

             after(grammarAccess.getPortnumberRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePortnumber"


    // $ANTLR start "rulePortnumber"
    // InternalIoT.g:644:1: rulePortnumber : ( ( rule__Portnumber__Group__0 ) ) ;
    public final void rulePortnumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:648:2: ( ( ( rule__Portnumber__Group__0 ) ) )
            // InternalIoT.g:649:2: ( ( rule__Portnumber__Group__0 ) )
            {
            // InternalIoT.g:649:2: ( ( rule__Portnumber__Group__0 ) )
            // InternalIoT.g:650:3: ( rule__Portnumber__Group__0 )
            {
             before(grammarAccess.getPortnumberAccess().getGroup()); 
            // InternalIoT.g:651:3: ( rule__Portnumber__Group__0 )
            // InternalIoT.g:651:4: rule__Portnumber__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Portnumber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortnumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePortnumber"


    // $ANTLR start "entryRuleTime"
    // InternalIoT.g:660:1: entryRuleTime : ruleTime EOF ;
    public final void entryRuleTime() throws RecognitionException {
        try {
            // InternalIoT.g:661:1: ( ruleTime EOF )
            // InternalIoT.g:662:1: ruleTime EOF
            {
             before(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getTimeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalIoT.g:669:1: ruleTime : ( ( rule__Time__TimeAssignment ) ) ;
    public final void ruleTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:673:2: ( ( ( rule__Time__TimeAssignment ) ) )
            // InternalIoT.g:674:2: ( ( rule__Time__TimeAssignment ) )
            {
            // InternalIoT.g:674:2: ( ( rule__Time__TimeAssignment ) )
            // InternalIoT.g:675:3: ( rule__Time__TimeAssignment )
            {
             before(grammarAccess.getTimeAccess().getTimeAssignment()); 
            // InternalIoT.g:676:3: ( rule__Time__TimeAssignment )
            // InternalIoT.g:676:4: rule__Time__TimeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Time__TimeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getTimeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTime"


    // $ANTLR start "rule__System__SystemAlternatives_0"
    // InternalIoT.g:684:1: rule__System__SystemAlternatives_0 : ( ( ruleSensorTypes ) | ( ruleSensor ) | ( ruleSensorGroup ) | ( ruleSensorGetMethod ) | ( ruleDeviceTypes ) | ( ruleDevice ) | ( ruleDeviceGroup ) | ( ruleServerTypes ) | ( ruleServerFromType ) | ( ruleServer ) | ( ruleDestinationTypes ) | ( ruleDestination ) | ( ruleFetchData ) );
    public final void rule__System__SystemAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:688:1: ( ( ruleSensorTypes ) | ( ruleSensor ) | ( ruleSensorGroup ) | ( ruleSensorGetMethod ) | ( ruleDeviceTypes ) | ( ruleDevice ) | ( ruleDeviceGroup ) | ( ruleServerTypes ) | ( ruleServerFromType ) | ( ruleServer ) | ( ruleDestinationTypes ) | ( ruleDestination ) | ( ruleFetchData ) )
            int alt2=13;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalIoT.g:689:2: ( ruleSensorTypes )
                    {
                    // InternalIoT.g:689:2: ( ruleSensorTypes )
                    // InternalIoT.g:690:3: ruleSensorTypes
                    {
                     before(grammarAccess.getSystemAccess().getSystemSensorTypesParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSensorTypes();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getSystemSensorTypesParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:695:2: ( ruleSensor )
                    {
                    // InternalIoT.g:695:2: ( ruleSensor )
                    // InternalIoT.g:696:3: ruleSensor
                    {
                     before(grammarAccess.getSystemAccess().getSystemSensorParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSensor();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getSystemSensorParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIoT.g:701:2: ( ruleSensorGroup )
                    {
                    // InternalIoT.g:701:2: ( ruleSensorGroup )
                    // InternalIoT.g:702:3: ruleSensorGroup
                    {
                     before(grammarAccess.getSystemAccess().getSystemSensorGroupParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSensorGroup();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getSystemSensorGroupParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIoT.g:707:2: ( ruleSensorGetMethod )
                    {
                    // InternalIoT.g:707:2: ( ruleSensorGetMethod )
                    // InternalIoT.g:708:3: ruleSensorGetMethod
                    {
                     before(grammarAccess.getSystemAccess().getSystemSensorGetMethodParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSensorGetMethod();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getSystemSensorGetMethodParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalIoT.g:713:2: ( ruleDeviceTypes )
                    {
                    // InternalIoT.g:713:2: ( ruleDeviceTypes )
                    // InternalIoT.g:714:3: ruleDeviceTypes
                    {
                     before(grammarAccess.getSystemAccess().getSystemDeviceTypesParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDeviceTypes();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getSystemDeviceTypesParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalIoT.g:719:2: ( ruleDevice )
                    {
                    // InternalIoT.g:719:2: ( ruleDevice )
                    // InternalIoT.g:720:3: ruleDevice
                    {
                     before(grammarAccess.getSystemAccess().getSystemDeviceParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDevice();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getSystemDeviceParserRuleCall_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalIoT.g:725:2: ( ruleDeviceGroup )
                    {
                    // InternalIoT.g:725:2: ( ruleDeviceGroup )
                    // InternalIoT.g:726:3: ruleDeviceGroup
                    {
                     before(grammarAccess.getSystemAccess().getSystemDeviceGroupParserRuleCall_0_6()); 
                    pushFollow(FOLLOW_2);
                    ruleDeviceGroup();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getSystemDeviceGroupParserRuleCall_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalIoT.g:731:2: ( ruleServerTypes )
                    {
                    // InternalIoT.g:731:2: ( ruleServerTypes )
                    // InternalIoT.g:732:3: ruleServerTypes
                    {
                     before(grammarAccess.getSystemAccess().getSystemServerTypesParserRuleCall_0_7()); 
                    pushFollow(FOLLOW_2);
                    ruleServerTypes();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getSystemServerTypesParserRuleCall_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalIoT.g:737:2: ( ruleServerFromType )
                    {
                    // InternalIoT.g:737:2: ( ruleServerFromType )
                    // InternalIoT.g:738:3: ruleServerFromType
                    {
                     before(grammarAccess.getSystemAccess().getSystemServerFromTypeParserRuleCall_0_8()); 
                    pushFollow(FOLLOW_2);
                    ruleServerFromType();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getSystemServerFromTypeParserRuleCall_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalIoT.g:743:2: ( ruleServer )
                    {
                    // InternalIoT.g:743:2: ( ruleServer )
                    // InternalIoT.g:744:3: ruleServer
                    {
                     before(grammarAccess.getSystemAccess().getSystemServerParserRuleCall_0_9()); 
                    pushFollow(FOLLOW_2);
                    ruleServer();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getSystemServerParserRuleCall_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalIoT.g:749:2: ( ruleDestinationTypes )
                    {
                    // InternalIoT.g:749:2: ( ruleDestinationTypes )
                    // InternalIoT.g:750:3: ruleDestinationTypes
                    {
                     before(grammarAccess.getSystemAccess().getSystemDestinationTypesParserRuleCall_0_10()); 
                    pushFollow(FOLLOW_2);
                    ruleDestinationTypes();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getSystemDestinationTypesParserRuleCall_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalIoT.g:755:2: ( ruleDestination )
                    {
                    // InternalIoT.g:755:2: ( ruleDestination )
                    // InternalIoT.g:756:3: ruleDestination
                    {
                     before(grammarAccess.getSystemAccess().getSystemDestinationParserRuleCall_0_11()); 
                    pushFollow(FOLLOW_2);
                    ruleDestination();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getSystemDestinationParserRuleCall_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalIoT.g:761:2: ( ruleFetchData )
                    {
                    // InternalIoT.g:761:2: ( ruleFetchData )
                    // InternalIoT.g:762:3: ruleFetchData
                    {
                     before(grammarAccess.getSystemAccess().getSystemFetchDataParserRuleCall_0_12()); 
                    pushFollow(FOLLOW_2);
                    ruleFetchData();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getSystemFetchDataParserRuleCall_0_12()); 

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
    // $ANTLR end "rule__System__SystemAlternatives_0"


    // $ANTLR start "rule__FetchData__Alternatives_3"
    // InternalIoT.g:771:1: rule__FetchData__Alternatives_3 : ( ( ( rule__FetchData__Group_3_0__0 ) ) | ( ( rule__FetchData__Group_3_1__0 ) ) );
    public final void rule__FetchData__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:775:1: ( ( ( rule__FetchData__Group_3_0__0 ) ) | ( ( rule__FetchData__Group_3_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            else if ( (LA3_0==48) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalIoT.g:776:2: ( ( rule__FetchData__Group_3_0__0 ) )
                    {
                    // InternalIoT.g:776:2: ( ( rule__FetchData__Group_3_0__0 ) )
                    // InternalIoT.g:777:3: ( rule__FetchData__Group_3_0__0 )
                    {
                     before(grammarAccess.getFetchDataAccess().getGroup_3_0()); 
                    // InternalIoT.g:778:3: ( rule__FetchData__Group_3_0__0 )
                    // InternalIoT.g:778:4: rule__FetchData__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FetchData__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFetchDataAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:782:2: ( ( rule__FetchData__Group_3_1__0 ) )
                    {
                    // InternalIoT.g:782:2: ( ( rule__FetchData__Group_3_1__0 ) )
                    // InternalIoT.g:783:3: ( rule__FetchData__Group_3_1__0 )
                    {
                     before(grammarAccess.getFetchDataAccess().getGroup_3_1()); 
                    // InternalIoT.g:784:3: ( rule__FetchData__Group_3_1__0 )
                    // InternalIoT.g:784:4: rule__FetchData__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FetchData__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFetchDataAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__FetchData__Alternatives_3"


    // $ANTLR start "rule__FetchData__Alternatives_5"
    // InternalIoT.g:792:1: rule__FetchData__Alternatives_5 : ( ( ( rule__FetchData__Group_5_0__0 ) ) | ( ( rule__FetchData__Group_5_1__0 ) ) );
    public final void rule__FetchData__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:796:1: ( ( ( rule__FetchData__Group_5_0__0 ) ) | ( ( rule__FetchData__Group_5_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==49) ) {
                alt4=1;
            }
            else if ( (LA4_0==50) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalIoT.g:797:2: ( ( rule__FetchData__Group_5_0__0 ) )
                    {
                    // InternalIoT.g:797:2: ( ( rule__FetchData__Group_5_0__0 ) )
                    // InternalIoT.g:798:3: ( rule__FetchData__Group_5_0__0 )
                    {
                     before(grammarAccess.getFetchDataAccess().getGroup_5_0()); 
                    // InternalIoT.g:799:3: ( rule__FetchData__Group_5_0__0 )
                    // InternalIoT.g:799:4: rule__FetchData__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FetchData__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFetchDataAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:803:2: ( ( rule__FetchData__Group_5_1__0 ) )
                    {
                    // InternalIoT.g:803:2: ( ( rule__FetchData__Group_5_1__0 ) )
                    // InternalIoT.g:804:3: ( rule__FetchData__Group_5_1__0 )
                    {
                     before(grammarAccess.getFetchDataAccess().getGroup_5_1()); 
                    // InternalIoT.g:805:3: ( rule__FetchData__Group_5_1__0 )
                    // InternalIoT.g:805:4: rule__FetchData__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FetchData__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFetchDataAccess().getGroup_5_1()); 

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
    // $ANTLR end "rule__FetchData__Alternatives_5"


    // $ANTLR start "rule__FetchData__Alternatives_6"
    // InternalIoT.g:813:1: rule__FetchData__Alternatives_6 : ( ( ( rule__FetchData__ConExpAssignment_6_0 ) ) | ( ( rule__FetchData__ConExpAssignment_6_1 ) ) );
    public final void rule__FetchData__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:817:1: ( ( ( rule__FetchData__ConExpAssignment_6_0 ) ) | ( ( rule__FetchData__ConExpAssignment_6_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==51) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=13 && LA5_0<=14)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalIoT.g:818:2: ( ( rule__FetchData__ConExpAssignment_6_0 ) )
                    {
                    // InternalIoT.g:818:2: ( ( rule__FetchData__ConExpAssignment_6_0 ) )
                    // InternalIoT.g:819:3: ( rule__FetchData__ConExpAssignment_6_0 )
                    {
                     before(grammarAccess.getFetchDataAccess().getConExpAssignment_6_0()); 
                    // InternalIoT.g:820:3: ( rule__FetchData__ConExpAssignment_6_0 )
                    // InternalIoT.g:820:4: rule__FetchData__ConExpAssignment_6_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FetchData__ConExpAssignment_6_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFetchDataAccess().getConExpAssignment_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:824:2: ( ( rule__FetchData__ConExpAssignment_6_1 ) )
                    {
                    // InternalIoT.g:824:2: ( ( rule__FetchData__ConExpAssignment_6_1 ) )
                    // InternalIoT.g:825:3: ( rule__FetchData__ConExpAssignment_6_1 )
                    {
                     before(grammarAccess.getFetchDataAccess().getConExpAssignment_6_1()); 
                    // InternalIoT.g:826:3: ( rule__FetchData__ConExpAssignment_6_1 )
                    // InternalIoT.g:826:4: rule__FetchData__ConExpAssignment_6_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FetchData__ConExpAssignment_6_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFetchDataAccess().getConExpAssignment_6_1()); 

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
    // $ANTLR end "rule__FetchData__Alternatives_6"


    // $ANTLR start "rule__FetchDataCondition__Alternatives_0"
    // InternalIoT.g:834:1: rule__FetchDataCondition__Alternatives_0 : ( ( 'when' ) | ( 'if' ) );
    public final void rule__FetchDataCondition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:838:1: ( ( 'when' ) | ( 'if' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalIoT.g:839:2: ( 'when' )
                    {
                    // InternalIoT.g:839:2: ( 'when' )
                    // InternalIoT.g:840:3: 'when'
                    {
                     before(grammarAccess.getFetchDataConditionAccess().getWhenKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getFetchDataConditionAccess().getWhenKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:845:2: ( 'if' )
                    {
                    // InternalIoT.g:845:2: ( 'if' )
                    // InternalIoT.g:846:3: 'if'
                    {
                     before(grammarAccess.getFetchDataConditionAccess().getIfKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getFetchDataConditionAccess().getIfKeyword_0_1()); 

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
    // $ANTLR end "rule__FetchDataCondition__Alternatives_0"


    // $ANTLR start "rule__TimeUnit__Alternatives"
    // InternalIoT.g:855:1: rule__TimeUnit__Alternatives : ( ( 'ms' ) | ( 's' ) | ( 'm' ) | ( 'h' ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:859:1: ( ( 'ms' ) | ( 's' ) | ( 'm' ) | ( 'h' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt7=1;
                }
                break;
            case 16:
                {
                alt7=2;
                }
                break;
            case 17:
                {
                alt7=3;
                }
                break;
            case 18:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalIoT.g:860:2: ( 'ms' )
                    {
                    // InternalIoT.g:860:2: ( 'ms' )
                    // InternalIoT.g:861:3: 'ms'
                    {
                     before(grammarAccess.getTimeUnitAccess().getMsKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTimeUnitAccess().getMsKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:866:2: ( 's' )
                    {
                    // InternalIoT.g:866:2: ( 's' )
                    // InternalIoT.g:867:3: 's'
                    {
                     before(grammarAccess.getTimeUnitAccess().getSKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getTimeUnitAccess().getSKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIoT.g:872:2: ( 'm' )
                    {
                    // InternalIoT.g:872:2: ( 'm' )
                    // InternalIoT.g:873:3: 'm'
                    {
                     before(grammarAccess.getTimeUnitAccess().getMKeyword_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getTimeUnitAccess().getMKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIoT.g:878:2: ( 'h' )
                    {
                    // InternalIoT.g:878:2: ( 'h' )
                    // InternalIoT.g:879:3: 'h'
                    {
                     before(grammarAccess.getTimeUnitAccess().getHKeyword_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getTimeUnitAccess().getHKeyword_3()); 

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
    // $ANTLR end "rule__TimeUnit__Alternatives"


    // $ANTLR start "rule__SensorTypes__Group__0"
    // InternalIoT.g:888:1: rule__SensorTypes__Group__0 : rule__SensorTypes__Group__0__Impl rule__SensorTypes__Group__1 ;
    public final void rule__SensorTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:892:1: ( rule__SensorTypes__Group__0__Impl rule__SensorTypes__Group__1 )
            // InternalIoT.g:893:2: rule__SensorTypes__Group__0__Impl rule__SensorTypes__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SensorTypes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorTypes__Group__1();

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
    // $ANTLR end "rule__SensorTypes__Group__0"


    // $ANTLR start "rule__SensorTypes__Group__0__Impl"
    // InternalIoT.g:900:1: rule__SensorTypes__Group__0__Impl : ( 'SensorTypes' ) ;
    public final void rule__SensorTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:904:1: ( ( 'SensorTypes' ) )
            // InternalIoT.g:905:1: ( 'SensorTypes' )
            {
            // InternalIoT.g:905:1: ( 'SensorTypes' )
            // InternalIoT.g:906:2: 'SensorTypes'
            {
             before(grammarAccess.getSensorTypesAccess().getSensorTypesKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSensorTypesAccess().getSensorTypesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTypes__Group__0__Impl"


    // $ANTLR start "rule__SensorTypes__Group__1"
    // InternalIoT.g:915:1: rule__SensorTypes__Group__1 : rule__SensorTypes__Group__1__Impl rule__SensorTypes__Group__2 ;
    public final void rule__SensorTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:919:1: ( rule__SensorTypes__Group__1__Impl rule__SensorTypes__Group__2 )
            // InternalIoT.g:920:2: rule__SensorTypes__Group__1__Impl rule__SensorTypes__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SensorTypes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorTypes__Group__2();

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
    // $ANTLR end "rule__SensorTypes__Group__1"


    // $ANTLR start "rule__SensorTypes__Group__1__Impl"
    // InternalIoT.g:927:1: rule__SensorTypes__Group__1__Impl : ( ( rule__SensorTypes__TypesAssignment_1 ) ) ;
    public final void rule__SensorTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:931:1: ( ( ( rule__SensorTypes__TypesAssignment_1 ) ) )
            // InternalIoT.g:932:1: ( ( rule__SensorTypes__TypesAssignment_1 ) )
            {
            // InternalIoT.g:932:1: ( ( rule__SensorTypes__TypesAssignment_1 ) )
            // InternalIoT.g:933:2: ( rule__SensorTypes__TypesAssignment_1 )
            {
             before(grammarAccess.getSensorTypesAccess().getTypesAssignment_1()); 
            // InternalIoT.g:934:2: ( rule__SensorTypes__TypesAssignment_1 )
            // InternalIoT.g:934:3: rule__SensorTypes__TypesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorTypes__TypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorTypesAccess().getTypesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTypes__Group__1__Impl"


    // $ANTLR start "rule__SensorTypes__Group__2"
    // InternalIoT.g:942:1: rule__SensorTypes__Group__2 : rule__SensorTypes__Group__2__Impl ;
    public final void rule__SensorTypes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:946:1: ( rule__SensorTypes__Group__2__Impl )
            // InternalIoT.g:947:2: rule__SensorTypes__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorTypes__Group__2__Impl();

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
    // $ANTLR end "rule__SensorTypes__Group__2"


    // $ANTLR start "rule__SensorTypes__Group__2__Impl"
    // InternalIoT.g:953:1: rule__SensorTypes__Group__2__Impl : ( ( rule__SensorTypes__Group_2__0 )* ) ;
    public final void rule__SensorTypes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:957:1: ( ( ( rule__SensorTypes__Group_2__0 )* ) )
            // InternalIoT.g:958:1: ( ( rule__SensorTypes__Group_2__0 )* )
            {
            // InternalIoT.g:958:1: ( ( rule__SensorTypes__Group_2__0 )* )
            // InternalIoT.g:959:2: ( rule__SensorTypes__Group_2__0 )*
            {
             before(grammarAccess.getSensorTypesAccess().getGroup_2()); 
            // InternalIoT.g:960:2: ( rule__SensorTypes__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalIoT.g:960:3: rule__SensorTypes__Group_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SensorTypes__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSensorTypesAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTypes__Group__2__Impl"


    // $ANTLR start "rule__SensorTypes__Group_2__0"
    // InternalIoT.g:969:1: rule__SensorTypes__Group_2__0 : rule__SensorTypes__Group_2__0__Impl rule__SensorTypes__Group_2__1 ;
    public final void rule__SensorTypes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:973:1: ( rule__SensorTypes__Group_2__0__Impl rule__SensorTypes__Group_2__1 )
            // InternalIoT.g:974:2: rule__SensorTypes__Group_2__0__Impl rule__SensorTypes__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__SensorTypes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorTypes__Group_2__1();

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
    // $ANTLR end "rule__SensorTypes__Group_2__0"


    // $ANTLR start "rule__SensorTypes__Group_2__0__Impl"
    // InternalIoT.g:981:1: rule__SensorTypes__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SensorTypes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:985:1: ( ( ',' ) )
            // InternalIoT.g:986:1: ( ',' )
            {
            // InternalIoT.g:986:1: ( ',' )
            // InternalIoT.g:987:2: ','
            {
             before(grammarAccess.getSensorTypesAccess().getCommaKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSensorTypesAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTypes__Group_2__0__Impl"


    // $ANTLR start "rule__SensorTypes__Group_2__1"
    // InternalIoT.g:996:1: rule__SensorTypes__Group_2__1 : rule__SensorTypes__Group_2__1__Impl ;
    public final void rule__SensorTypes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1000:1: ( rule__SensorTypes__Group_2__1__Impl )
            // InternalIoT.g:1001:2: rule__SensorTypes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorTypes__Group_2__1__Impl();

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
    // $ANTLR end "rule__SensorTypes__Group_2__1"


    // $ANTLR start "rule__SensorTypes__Group_2__1__Impl"
    // InternalIoT.g:1007:1: rule__SensorTypes__Group_2__1__Impl : ( ( rule__SensorTypes__TypesAssignment_2_1 ) ) ;
    public final void rule__SensorTypes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1011:1: ( ( ( rule__SensorTypes__TypesAssignment_2_1 ) ) )
            // InternalIoT.g:1012:1: ( ( rule__SensorTypes__TypesAssignment_2_1 ) )
            {
            // InternalIoT.g:1012:1: ( ( rule__SensorTypes__TypesAssignment_2_1 ) )
            // InternalIoT.g:1013:2: ( rule__SensorTypes__TypesAssignment_2_1 )
            {
             before(grammarAccess.getSensorTypesAccess().getTypesAssignment_2_1()); 
            // InternalIoT.g:1014:2: ( rule__SensorTypes__TypesAssignment_2_1 )
            // InternalIoT.g:1014:3: rule__SensorTypes__TypesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorTypes__TypesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorTypesAccess().getTypesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTypes__Group_2__1__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalIoT.g:1023:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1027:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalIoT.g:1028:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1();

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
    // $ANTLR end "rule__Sensor__Group__0"


    // $ANTLR start "rule__Sensor__Group__0__Impl"
    // InternalIoT.g:1035:1: rule__Sensor__Group__0__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1039:1: ( ( 'Sensor' ) )
            // InternalIoT.g:1040:1: ( 'Sensor' )
            {
            // InternalIoT.g:1040:1: ( 'Sensor' )
            // InternalIoT.g:1041:2: 'Sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSensorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0__Impl"


    // $ANTLR start "rule__Sensor__Group__1"
    // InternalIoT.g:1050:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1054:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalIoT.g:1055:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Sensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__2();

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
    // $ANTLR end "rule__Sensor__Group__1"


    // $ANTLR start "rule__Sensor__Group__1__Impl"
    // InternalIoT.g:1062:1: rule__Sensor__Group__1__Impl : ( ( rule__Sensor__NameAssignment_1 ) ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1066:1: ( ( ( rule__Sensor__NameAssignment_1 ) ) )
            // InternalIoT.g:1067:1: ( ( rule__Sensor__NameAssignment_1 ) )
            {
            // InternalIoT.g:1067:1: ( ( rule__Sensor__NameAssignment_1 ) )
            // InternalIoT.g:1068:2: ( rule__Sensor__NameAssignment_1 )
            {
             before(grammarAccess.getSensorAccess().getNameAssignment_1()); 
            // InternalIoT.g:1069:2: ( rule__Sensor__NameAssignment_1 )
            // InternalIoT.g:1069:3: rule__Sensor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__2"
    // InternalIoT.g:1077:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1081:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // InternalIoT.g:1082:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Sensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__3();

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
    // $ANTLR end "rule__Sensor__Group__2"


    // $ANTLR start "rule__Sensor__Group__2__Impl"
    // InternalIoT.g:1089:1: rule__Sensor__Group__2__Impl : ( 'of' ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1093:1: ( ( 'of' ) )
            // InternalIoT.g:1094:1: ( 'of' )
            {
            // InternalIoT.g:1094:1: ( 'of' )
            // InternalIoT.g:1095:2: 'of'
            {
             before(grammarAccess.getSensorAccess().getOfKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getOfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2__Impl"


    // $ANTLR start "rule__Sensor__Group__3"
    // InternalIoT.g:1104:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl rule__Sensor__Group__4 ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1108:1: ( rule__Sensor__Group__3__Impl rule__Sensor__Group__4 )
            // InternalIoT.g:1109:2: rule__Sensor__Group__3__Impl rule__Sensor__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Sensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__4();

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
    // $ANTLR end "rule__Sensor__Group__3"


    // $ANTLR start "rule__Sensor__Group__3__Impl"
    // InternalIoT.g:1116:1: rule__Sensor__Group__3__Impl : ( 'type' ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1120:1: ( ( 'type' ) )
            // InternalIoT.g:1121:1: ( 'type' )
            {
            // InternalIoT.g:1121:1: ( 'type' )
            // InternalIoT.g:1122:2: 'type'
            {
             before(grammarAccess.getSensorAccess().getTypeKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3__Impl"


    // $ANTLR start "rule__Sensor__Group__4"
    // InternalIoT.g:1131:1: rule__Sensor__Group__4 : rule__Sensor__Group__4__Impl ;
    public final void rule__Sensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1135:1: ( rule__Sensor__Group__4__Impl )
            // InternalIoT.g:1136:2: rule__Sensor__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__4__Impl();

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
    // $ANTLR end "rule__Sensor__Group__4"


    // $ANTLR start "rule__Sensor__Group__4__Impl"
    // InternalIoT.g:1142:1: rule__Sensor__Group__4__Impl : ( ( rule__Sensor__TypeAssignment_4 ) ) ;
    public final void rule__Sensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1146:1: ( ( ( rule__Sensor__TypeAssignment_4 ) ) )
            // InternalIoT.g:1147:1: ( ( rule__Sensor__TypeAssignment_4 ) )
            {
            // InternalIoT.g:1147:1: ( ( rule__Sensor__TypeAssignment_4 ) )
            // InternalIoT.g:1148:2: ( rule__Sensor__TypeAssignment_4 )
            {
             before(grammarAccess.getSensorAccess().getTypeAssignment_4()); 
            // InternalIoT.g:1149:2: ( rule__Sensor__TypeAssignment_4 )
            // InternalIoT.g:1149:3: rule__Sensor__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__4__Impl"


    // $ANTLR start "rule__SensorGroup__Group__0"
    // InternalIoT.g:1158:1: rule__SensorGroup__Group__0 : rule__SensorGroup__Group__0__Impl rule__SensorGroup__Group__1 ;
    public final void rule__SensorGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1162:1: ( rule__SensorGroup__Group__0__Impl rule__SensorGroup__Group__1 )
            // InternalIoT.g:1163:2: rule__SensorGroup__Group__0__Impl rule__SensorGroup__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SensorGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group__1();

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
    // $ANTLR end "rule__SensorGroup__Group__0"


    // $ANTLR start "rule__SensorGroup__Group__0__Impl"
    // InternalIoT.g:1170:1: rule__SensorGroup__Group__0__Impl : ( 'SensorGroup' ) ;
    public final void rule__SensorGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1174:1: ( ( 'SensorGroup' ) )
            // InternalIoT.g:1175:1: ( 'SensorGroup' )
            {
            // InternalIoT.g:1175:1: ( 'SensorGroup' )
            // InternalIoT.g:1176:2: 'SensorGroup'
            {
             before(grammarAccess.getSensorGroupAccess().getSensorGroupKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSensorGroupAccess().getSensorGroupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__Group__0__Impl"


    // $ANTLR start "rule__SensorGroup__Group__1"
    // InternalIoT.g:1185:1: rule__SensorGroup__Group__1 : rule__SensorGroup__Group__1__Impl rule__SensorGroup__Group__2 ;
    public final void rule__SensorGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1189:1: ( rule__SensorGroup__Group__1__Impl rule__SensorGroup__Group__2 )
            // InternalIoT.g:1190:2: rule__SensorGroup__Group__1__Impl rule__SensorGroup__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__SensorGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group__2();

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
    // $ANTLR end "rule__SensorGroup__Group__1"


    // $ANTLR start "rule__SensorGroup__Group__1__Impl"
    // InternalIoT.g:1197:1: rule__SensorGroup__Group__1__Impl : ( ( rule__SensorGroup__NameAssignment_1 ) ) ;
    public final void rule__SensorGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1201:1: ( ( ( rule__SensorGroup__NameAssignment_1 ) ) )
            // InternalIoT.g:1202:1: ( ( rule__SensorGroup__NameAssignment_1 ) )
            {
            // InternalIoT.g:1202:1: ( ( rule__SensorGroup__NameAssignment_1 ) )
            // InternalIoT.g:1203:2: ( rule__SensorGroup__NameAssignment_1 )
            {
             before(grammarAccess.getSensorGroupAccess().getNameAssignment_1()); 
            // InternalIoT.g:1204:2: ( rule__SensorGroup__NameAssignment_1 )
            // InternalIoT.g:1204:3: rule__SensorGroup__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorGroup__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorGroupAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__Group__1__Impl"


    // $ANTLR start "rule__SensorGroup__Group__2"
    // InternalIoT.g:1212:1: rule__SensorGroup__Group__2 : rule__SensorGroup__Group__2__Impl rule__SensorGroup__Group__3 ;
    public final void rule__SensorGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1216:1: ( rule__SensorGroup__Group__2__Impl rule__SensorGroup__Group__3 )
            // InternalIoT.g:1217:2: rule__SensorGroup__Group__2__Impl rule__SensorGroup__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__SensorGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group__3();

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
    // $ANTLR end "rule__SensorGroup__Group__2"


    // $ANTLR start "rule__SensorGroup__Group__2__Impl"
    // InternalIoT.g:1224:1: rule__SensorGroup__Group__2__Impl : ( 'include' ) ;
    public final void rule__SensorGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1228:1: ( ( 'include' ) )
            // InternalIoT.g:1229:1: ( 'include' )
            {
            // InternalIoT.g:1229:1: ( 'include' )
            // InternalIoT.g:1230:2: 'include'
            {
             before(grammarAccess.getSensorGroupAccess().getIncludeKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSensorGroupAccess().getIncludeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__Group__2__Impl"


    // $ANTLR start "rule__SensorGroup__Group__3"
    // InternalIoT.g:1239:1: rule__SensorGroup__Group__3 : rule__SensorGroup__Group__3__Impl rule__SensorGroup__Group__4 ;
    public final void rule__SensorGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1243:1: ( rule__SensorGroup__Group__3__Impl rule__SensorGroup__Group__4 )
            // InternalIoT.g:1244:2: rule__SensorGroup__Group__3__Impl rule__SensorGroup__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__SensorGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group__4();

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
    // $ANTLR end "rule__SensorGroup__Group__3"


    // $ANTLR start "rule__SensorGroup__Group__3__Impl"
    // InternalIoT.g:1251:1: rule__SensorGroup__Group__3__Impl : ( '{' ) ;
    public final void rule__SensorGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1255:1: ( ( '{' ) )
            // InternalIoT.g:1256:1: ( '{' )
            {
            // InternalIoT.g:1256:1: ( '{' )
            // InternalIoT.g:1257:2: '{'
            {
             before(grammarAccess.getSensorGroupAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSensorGroupAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__Group__3__Impl"


    // $ANTLR start "rule__SensorGroup__Group__4"
    // InternalIoT.g:1266:1: rule__SensorGroup__Group__4 : rule__SensorGroup__Group__4__Impl rule__SensorGroup__Group__5 ;
    public final void rule__SensorGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1270:1: ( rule__SensorGroup__Group__4__Impl rule__SensorGroup__Group__5 )
            // InternalIoT.g:1271:2: rule__SensorGroup__Group__4__Impl rule__SensorGroup__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__SensorGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group__5();

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
    // $ANTLR end "rule__SensorGroup__Group__4"


    // $ANTLR start "rule__SensorGroup__Group__4__Impl"
    // InternalIoT.g:1278:1: rule__SensorGroup__Group__4__Impl : ( ( rule__SensorGroup__SensorsAssignment_4 ) ) ;
    public final void rule__SensorGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1282:1: ( ( ( rule__SensorGroup__SensorsAssignment_4 ) ) )
            // InternalIoT.g:1283:1: ( ( rule__SensorGroup__SensorsAssignment_4 ) )
            {
            // InternalIoT.g:1283:1: ( ( rule__SensorGroup__SensorsAssignment_4 ) )
            // InternalIoT.g:1284:2: ( rule__SensorGroup__SensorsAssignment_4 )
            {
             before(grammarAccess.getSensorGroupAccess().getSensorsAssignment_4()); 
            // InternalIoT.g:1285:2: ( rule__SensorGroup__SensorsAssignment_4 )
            // InternalIoT.g:1285:3: rule__SensorGroup__SensorsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SensorGroup__SensorsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSensorGroupAccess().getSensorsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__Group__4__Impl"


    // $ANTLR start "rule__SensorGroup__Group__5"
    // InternalIoT.g:1293:1: rule__SensorGroup__Group__5 : rule__SensorGroup__Group__5__Impl rule__SensorGroup__Group__6 ;
    public final void rule__SensorGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1297:1: ( rule__SensorGroup__Group__5__Impl rule__SensorGroup__Group__6 )
            // InternalIoT.g:1298:2: rule__SensorGroup__Group__5__Impl rule__SensorGroup__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__SensorGroup__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group__6();

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
    // $ANTLR end "rule__SensorGroup__Group__5"


    // $ANTLR start "rule__SensorGroup__Group__5__Impl"
    // InternalIoT.g:1305:1: rule__SensorGroup__Group__5__Impl : ( ( rule__SensorGroup__Group_5__0 )* ) ;
    public final void rule__SensorGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1309:1: ( ( ( rule__SensorGroup__Group_5__0 )* ) )
            // InternalIoT.g:1310:1: ( ( rule__SensorGroup__Group_5__0 )* )
            {
            // InternalIoT.g:1310:1: ( ( rule__SensorGroup__Group_5__0 )* )
            // InternalIoT.g:1311:2: ( rule__SensorGroup__Group_5__0 )*
            {
             before(grammarAccess.getSensorGroupAccess().getGroup_5()); 
            // InternalIoT.g:1312:2: ( rule__SensorGroup__Group_5__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalIoT.g:1312:3: rule__SensorGroup__Group_5__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SensorGroup__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSensorGroupAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__Group__5__Impl"


    // $ANTLR start "rule__SensorGroup__Group__6"
    // InternalIoT.g:1320:1: rule__SensorGroup__Group__6 : rule__SensorGroup__Group__6__Impl ;
    public final void rule__SensorGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1324:1: ( rule__SensorGroup__Group__6__Impl )
            // InternalIoT.g:1325:2: rule__SensorGroup__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group__6__Impl();

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
    // $ANTLR end "rule__SensorGroup__Group__6"


    // $ANTLR start "rule__SensorGroup__Group__6__Impl"
    // InternalIoT.g:1331:1: rule__SensorGroup__Group__6__Impl : ( '}' ) ;
    public final void rule__SensorGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1335:1: ( ( '}' ) )
            // InternalIoT.g:1336:1: ( '}' )
            {
            // InternalIoT.g:1336:1: ( '}' )
            // InternalIoT.g:1337:2: '}'
            {
             before(grammarAccess.getSensorGroupAccess().getRightCurlyBracketKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSensorGroupAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__Group__6__Impl"


    // $ANTLR start "rule__SensorGroup__Group_5__0"
    // InternalIoT.g:1347:1: rule__SensorGroup__Group_5__0 : rule__SensorGroup__Group_5__0__Impl rule__SensorGroup__Group_5__1 ;
    public final void rule__SensorGroup__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1351:1: ( rule__SensorGroup__Group_5__0__Impl rule__SensorGroup__Group_5__1 )
            // InternalIoT.g:1352:2: rule__SensorGroup__Group_5__0__Impl rule__SensorGroup__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__SensorGroup__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group_5__1();

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
    // $ANTLR end "rule__SensorGroup__Group_5__0"


    // $ANTLR start "rule__SensorGroup__Group_5__0__Impl"
    // InternalIoT.g:1359:1: rule__SensorGroup__Group_5__0__Impl : ( ',' ) ;
    public final void rule__SensorGroup__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1363:1: ( ( ',' ) )
            // InternalIoT.g:1364:1: ( ',' )
            {
            // InternalIoT.g:1364:1: ( ',' )
            // InternalIoT.g:1365:2: ','
            {
             before(grammarAccess.getSensorGroupAccess().getCommaKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSensorGroupAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__Group_5__0__Impl"


    // $ANTLR start "rule__SensorGroup__Group_5__1"
    // InternalIoT.g:1374:1: rule__SensorGroup__Group_5__1 : rule__SensorGroup__Group_5__1__Impl ;
    public final void rule__SensorGroup__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1378:1: ( rule__SensorGroup__Group_5__1__Impl )
            // InternalIoT.g:1379:2: rule__SensorGroup__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group_5__1__Impl();

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
    // $ANTLR end "rule__SensorGroup__Group_5__1"


    // $ANTLR start "rule__SensorGroup__Group_5__1__Impl"
    // InternalIoT.g:1385:1: rule__SensorGroup__Group_5__1__Impl : ( ( rule__SensorGroup__SensorsAssignment_5_1 ) ) ;
    public final void rule__SensorGroup__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1389:1: ( ( ( rule__SensorGroup__SensorsAssignment_5_1 ) ) )
            // InternalIoT.g:1390:1: ( ( rule__SensorGroup__SensorsAssignment_5_1 ) )
            {
            // InternalIoT.g:1390:1: ( ( rule__SensorGroup__SensorsAssignment_5_1 ) )
            // InternalIoT.g:1391:2: ( rule__SensorGroup__SensorsAssignment_5_1 )
            {
             before(grammarAccess.getSensorGroupAccess().getSensorsAssignment_5_1()); 
            // InternalIoT.g:1392:2: ( rule__SensorGroup__SensorsAssignment_5_1 )
            // InternalIoT.g:1392:3: rule__SensorGroup__SensorsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorGroup__SensorsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorGroupAccess().getSensorsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__Group_5__1__Impl"


    // $ANTLR start "rule__SensorGetMethod__Group__0"
    // InternalIoT.g:1401:1: rule__SensorGetMethod__Group__0 : rule__SensorGetMethod__Group__0__Impl rule__SensorGetMethod__Group__1 ;
    public final void rule__SensorGetMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1405:1: ( rule__SensorGetMethod__Group__0__Impl rule__SensorGetMethod__Group__1 )
            // InternalIoT.g:1406:2: rule__SensorGetMethod__Group__0__Impl rule__SensorGetMethod__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SensorGetMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorGetMethod__Group__1();

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
    // $ANTLR end "rule__SensorGetMethod__Group__0"


    // $ANTLR start "rule__SensorGetMethod__Group__0__Impl"
    // InternalIoT.g:1413:1: rule__SensorGetMethod__Group__0__Impl : ( 'SensorGetMethod' ) ;
    public final void rule__SensorGetMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1417:1: ( ( 'SensorGetMethod' ) )
            // InternalIoT.g:1418:1: ( 'SensorGetMethod' )
            {
            // InternalIoT.g:1418:1: ( 'SensorGetMethod' )
            // InternalIoT.g:1419:2: 'SensorGetMethod'
            {
             before(grammarAccess.getSensorGetMethodAccess().getSensorGetMethodKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSensorGetMethodAccess().getSensorGetMethodKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGetMethod__Group__0__Impl"


    // $ANTLR start "rule__SensorGetMethod__Group__1"
    // InternalIoT.g:1428:1: rule__SensorGetMethod__Group__1 : rule__SensorGetMethod__Group__1__Impl rule__SensorGetMethod__Group__2 ;
    public final void rule__SensorGetMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1432:1: ( rule__SensorGetMethod__Group__1__Impl rule__SensorGetMethod__Group__2 )
            // InternalIoT.g:1433:2: rule__SensorGetMethod__Group__1__Impl rule__SensorGetMethod__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__SensorGetMethod__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorGetMethod__Group__2();

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
    // $ANTLR end "rule__SensorGetMethod__Group__1"


    // $ANTLR start "rule__SensorGetMethod__Group__1__Impl"
    // InternalIoT.g:1440:1: rule__SensorGetMethod__Group__1__Impl : ( ( rule__SensorGetMethod__MethodAssignment_1 ) ) ;
    public final void rule__SensorGetMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1444:1: ( ( ( rule__SensorGetMethod__MethodAssignment_1 ) ) )
            // InternalIoT.g:1445:1: ( ( rule__SensorGetMethod__MethodAssignment_1 ) )
            {
            // InternalIoT.g:1445:1: ( ( rule__SensorGetMethod__MethodAssignment_1 ) )
            // InternalIoT.g:1446:2: ( rule__SensorGetMethod__MethodAssignment_1 )
            {
             before(grammarAccess.getSensorGetMethodAccess().getMethodAssignment_1()); 
            // InternalIoT.g:1447:2: ( rule__SensorGetMethod__MethodAssignment_1 )
            // InternalIoT.g:1447:3: rule__SensorGetMethod__MethodAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorGetMethod__MethodAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorGetMethodAccess().getMethodAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGetMethod__Group__1__Impl"


    // $ANTLR start "rule__SensorGetMethod__Group__2"
    // InternalIoT.g:1455:1: rule__SensorGetMethod__Group__2 : rule__SensorGetMethod__Group__2__Impl rule__SensorGetMethod__Group__3 ;
    public final void rule__SensorGetMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1459:1: ( rule__SensorGetMethod__Group__2__Impl rule__SensorGetMethod__Group__3 )
            // InternalIoT.g:1460:2: rule__SensorGetMethod__Group__2__Impl rule__SensorGetMethod__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__SensorGetMethod__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorGetMethod__Group__3();

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
    // $ANTLR end "rule__SensorGetMethod__Group__2"


    // $ANTLR start "rule__SensorGetMethod__Group__2__Impl"
    // InternalIoT.g:1467:1: rule__SensorGetMethod__Group__2__Impl : ( 'for' ) ;
    public final void rule__SensorGetMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1471:1: ( ( 'for' ) )
            // InternalIoT.g:1472:1: ( 'for' )
            {
            // InternalIoT.g:1472:1: ( 'for' )
            // InternalIoT.g:1473:2: 'for'
            {
             before(grammarAccess.getSensorGetMethodAccess().getForKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSensorGetMethodAccess().getForKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGetMethod__Group__2__Impl"


    // $ANTLR start "rule__SensorGetMethod__Group__3"
    // InternalIoT.g:1482:1: rule__SensorGetMethod__Group__3 : rule__SensorGetMethod__Group__3__Impl rule__SensorGetMethod__Group__4 ;
    public final void rule__SensorGetMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1486:1: ( rule__SensorGetMethod__Group__3__Impl rule__SensorGetMethod__Group__4 )
            // InternalIoT.g:1487:2: rule__SensorGetMethod__Group__3__Impl rule__SensorGetMethod__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__SensorGetMethod__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorGetMethod__Group__4();

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
    // $ANTLR end "rule__SensorGetMethod__Group__3"


    // $ANTLR start "rule__SensorGetMethod__Group__3__Impl"
    // InternalIoT.g:1494:1: rule__SensorGetMethod__Group__3__Impl : ( 'type' ) ;
    public final void rule__SensorGetMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1498:1: ( ( 'type' ) )
            // InternalIoT.g:1499:1: ( 'type' )
            {
            // InternalIoT.g:1499:1: ( 'type' )
            // InternalIoT.g:1500:2: 'type'
            {
             before(grammarAccess.getSensorGetMethodAccess().getTypeKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSensorGetMethodAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGetMethod__Group__3__Impl"


    // $ANTLR start "rule__SensorGetMethod__Group__4"
    // InternalIoT.g:1509:1: rule__SensorGetMethod__Group__4 : rule__SensorGetMethod__Group__4__Impl ;
    public final void rule__SensorGetMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1513:1: ( rule__SensorGetMethod__Group__4__Impl )
            // InternalIoT.g:1514:2: rule__SensorGetMethod__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorGetMethod__Group__4__Impl();

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
    // $ANTLR end "rule__SensorGetMethod__Group__4"


    // $ANTLR start "rule__SensorGetMethod__Group__4__Impl"
    // InternalIoT.g:1520:1: rule__SensorGetMethod__Group__4__Impl : ( ( rule__SensorGetMethod__TypeAssignment_4 ) ) ;
    public final void rule__SensorGetMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1524:1: ( ( ( rule__SensorGetMethod__TypeAssignment_4 ) ) )
            // InternalIoT.g:1525:1: ( ( rule__SensorGetMethod__TypeAssignment_4 ) )
            {
            // InternalIoT.g:1525:1: ( ( rule__SensorGetMethod__TypeAssignment_4 ) )
            // InternalIoT.g:1526:2: ( rule__SensorGetMethod__TypeAssignment_4 )
            {
             before(grammarAccess.getSensorGetMethodAccess().getTypeAssignment_4()); 
            // InternalIoT.g:1527:2: ( rule__SensorGetMethod__TypeAssignment_4 )
            // InternalIoT.g:1527:3: rule__SensorGetMethod__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SensorGetMethod__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSensorGetMethodAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGetMethod__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalIoT.g:1536:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1540:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalIoT.g:1541:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

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
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalIoT.g:1548:1: rule__Method__Group__0__Impl : ( ( rule__Method__NameAssignment_0 ) ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1552:1: ( ( ( rule__Method__NameAssignment_0 ) ) )
            // InternalIoT.g:1553:1: ( ( rule__Method__NameAssignment_0 ) )
            {
            // InternalIoT.g:1553:1: ( ( rule__Method__NameAssignment_0 ) )
            // InternalIoT.g:1554:2: ( rule__Method__NameAssignment_0 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_0()); 
            // InternalIoT.g:1555:2: ( rule__Method__NameAssignment_0 )
            // InternalIoT.g:1555:3: rule__Method__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Method__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalIoT.g:1563:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1567:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalIoT.g:1568:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

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
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalIoT.g:1575:1: rule__Method__Group__1__Impl : ( '(' ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1579:1: ( ( '(' ) )
            // InternalIoT.g:1580:1: ( '(' )
            {
            // InternalIoT.g:1580:1: ( '(' )
            // InternalIoT.g:1581:2: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalIoT.g:1590:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1594:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalIoT.g:1595:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

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
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalIoT.g:1602:1: rule__Method__Group__2__Impl : ( ( rule__Method__ParametersAssignment_2 ) ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1606:1: ( ( ( rule__Method__ParametersAssignment_2 ) ) )
            // InternalIoT.g:1607:1: ( ( rule__Method__ParametersAssignment_2 ) )
            {
            // InternalIoT.g:1607:1: ( ( rule__Method__ParametersAssignment_2 ) )
            // InternalIoT.g:1608:2: ( rule__Method__ParametersAssignment_2 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_2()); 
            // InternalIoT.g:1609:2: ( rule__Method__ParametersAssignment_2 )
            // InternalIoT.g:1609:3: rule__Method__ParametersAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParametersAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParametersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalIoT.g:1617:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1621:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalIoT.g:1622:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__4();

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
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalIoT.g:1629:1: rule__Method__Group__3__Impl : ( ( rule__Method__Group_3__0 )* ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1633:1: ( ( ( rule__Method__Group_3__0 )* ) )
            // InternalIoT.g:1634:1: ( ( rule__Method__Group_3__0 )* )
            {
            // InternalIoT.g:1634:1: ( ( rule__Method__Group_3__0 )* )
            // InternalIoT.g:1635:2: ( rule__Method__Group_3__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_3()); 
            // InternalIoT.g:1636:2: ( rule__Method__Group_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalIoT.g:1636:3: rule__Method__Group_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Method__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // InternalIoT.g:1644:1: rule__Method__Group__4 : rule__Method__Group__4__Impl ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1648:1: ( rule__Method__Group__4__Impl )
            // InternalIoT.g:1649:2: rule__Method__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__4__Impl();

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
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // InternalIoT.g:1655:1: rule__Method__Group__4__Impl : ( ')' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1659:1: ( ( ')' ) )
            // InternalIoT.g:1660:1: ( ')' )
            {
            // InternalIoT.g:1660:1: ( ')' )
            // InternalIoT.g:1661:2: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group_3__0"
    // InternalIoT.g:1671:1: rule__Method__Group_3__0 : rule__Method__Group_3__0__Impl rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1675:1: ( rule__Method__Group_3__0__Impl rule__Method__Group_3__1 )
            // InternalIoT.g:1676:2: rule__Method__Group_3__0__Impl rule__Method__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Method__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_3__1();

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
    // $ANTLR end "rule__Method__Group_3__0"


    // $ANTLR start "rule__Method__Group_3__0__Impl"
    // InternalIoT.g:1683:1: rule__Method__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1687:1: ( ( ',' ) )
            // InternalIoT.g:1688:1: ( ',' )
            {
            // InternalIoT.g:1688:1: ( ',' )
            // InternalIoT.g:1689:2: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__0__Impl"


    // $ANTLR start "rule__Method__Group_3__1"
    // InternalIoT.g:1698:1: rule__Method__Group_3__1 : rule__Method__Group_3__1__Impl ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1702:1: ( rule__Method__Group_3__1__Impl )
            // InternalIoT.g:1703:2: rule__Method__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_3__1__Impl();

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
    // $ANTLR end "rule__Method__Group_3__1"


    // $ANTLR start "rule__Method__Group_3__1__Impl"
    // InternalIoT.g:1709:1: rule__Method__Group_3__1__Impl : ( ( rule__Method__ParametersAssignment_3_1 ) ) ;
    public final void rule__Method__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1713:1: ( ( ( rule__Method__ParametersAssignment_3_1 ) ) )
            // InternalIoT.g:1714:1: ( ( rule__Method__ParametersAssignment_3_1 ) )
            {
            // InternalIoT.g:1714:1: ( ( rule__Method__ParametersAssignment_3_1 ) )
            // InternalIoT.g:1715:2: ( rule__Method__ParametersAssignment_3_1 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_3_1()); 
            // InternalIoT.g:1716:2: ( rule__Method__ParametersAssignment_3_1 )
            // InternalIoT.g:1716:3: rule__Method__ParametersAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParametersAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParametersAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__1__Impl"


    // $ANTLR start "rule__DeviceTypes__Group__0"
    // InternalIoT.g:1725:1: rule__DeviceTypes__Group__0 : rule__DeviceTypes__Group__0__Impl rule__DeviceTypes__Group__1 ;
    public final void rule__DeviceTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1729:1: ( rule__DeviceTypes__Group__0__Impl rule__DeviceTypes__Group__1 )
            // InternalIoT.g:1730:2: rule__DeviceTypes__Group__0__Impl rule__DeviceTypes__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DeviceTypes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceTypes__Group__1();

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
    // $ANTLR end "rule__DeviceTypes__Group__0"


    // $ANTLR start "rule__DeviceTypes__Group__0__Impl"
    // InternalIoT.g:1737:1: rule__DeviceTypes__Group__0__Impl : ( 'DeviceTypes' ) ;
    public final void rule__DeviceTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1741:1: ( ( 'DeviceTypes' ) )
            // InternalIoT.g:1742:1: ( 'DeviceTypes' )
            {
            // InternalIoT.g:1742:1: ( 'DeviceTypes' )
            // InternalIoT.g:1743:2: 'DeviceTypes'
            {
             before(grammarAccess.getDeviceTypesAccess().getDeviceTypesKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDeviceTypesAccess().getDeviceTypesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceTypes__Group__0__Impl"


    // $ANTLR start "rule__DeviceTypes__Group__1"
    // InternalIoT.g:1752:1: rule__DeviceTypes__Group__1 : rule__DeviceTypes__Group__1__Impl rule__DeviceTypes__Group__2 ;
    public final void rule__DeviceTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1756:1: ( rule__DeviceTypes__Group__1__Impl rule__DeviceTypes__Group__2 )
            // InternalIoT.g:1757:2: rule__DeviceTypes__Group__1__Impl rule__DeviceTypes__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DeviceTypes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceTypes__Group__2();

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
    // $ANTLR end "rule__DeviceTypes__Group__1"


    // $ANTLR start "rule__DeviceTypes__Group__1__Impl"
    // InternalIoT.g:1764:1: rule__DeviceTypes__Group__1__Impl : ( ( rule__DeviceTypes__TypesAssignment_1 ) ) ;
    public final void rule__DeviceTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1768:1: ( ( ( rule__DeviceTypes__TypesAssignment_1 ) ) )
            // InternalIoT.g:1769:1: ( ( rule__DeviceTypes__TypesAssignment_1 ) )
            {
            // InternalIoT.g:1769:1: ( ( rule__DeviceTypes__TypesAssignment_1 ) )
            // InternalIoT.g:1770:2: ( rule__DeviceTypes__TypesAssignment_1 )
            {
             before(grammarAccess.getDeviceTypesAccess().getTypesAssignment_1()); 
            // InternalIoT.g:1771:2: ( rule__DeviceTypes__TypesAssignment_1 )
            // InternalIoT.g:1771:3: rule__DeviceTypes__TypesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DeviceTypes__TypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceTypesAccess().getTypesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceTypes__Group__1__Impl"


    // $ANTLR start "rule__DeviceTypes__Group__2"
    // InternalIoT.g:1779:1: rule__DeviceTypes__Group__2 : rule__DeviceTypes__Group__2__Impl ;
    public final void rule__DeviceTypes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1783:1: ( rule__DeviceTypes__Group__2__Impl )
            // InternalIoT.g:1784:2: rule__DeviceTypes__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceTypes__Group__2__Impl();

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
    // $ANTLR end "rule__DeviceTypes__Group__2"


    // $ANTLR start "rule__DeviceTypes__Group__2__Impl"
    // InternalIoT.g:1790:1: rule__DeviceTypes__Group__2__Impl : ( ( rule__DeviceTypes__Group_2__0 )* ) ;
    public final void rule__DeviceTypes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1794:1: ( ( ( rule__DeviceTypes__Group_2__0 )* ) )
            // InternalIoT.g:1795:1: ( ( rule__DeviceTypes__Group_2__0 )* )
            {
            // InternalIoT.g:1795:1: ( ( rule__DeviceTypes__Group_2__0 )* )
            // InternalIoT.g:1796:2: ( rule__DeviceTypes__Group_2__0 )*
            {
             before(grammarAccess.getDeviceTypesAccess().getGroup_2()); 
            // InternalIoT.g:1797:2: ( rule__DeviceTypes__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIoT.g:1797:3: rule__DeviceTypes__Group_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DeviceTypes__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getDeviceTypesAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceTypes__Group__2__Impl"


    // $ANTLR start "rule__DeviceTypes__Group_2__0"
    // InternalIoT.g:1806:1: rule__DeviceTypes__Group_2__0 : rule__DeviceTypes__Group_2__0__Impl rule__DeviceTypes__Group_2__1 ;
    public final void rule__DeviceTypes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1810:1: ( rule__DeviceTypes__Group_2__0__Impl rule__DeviceTypes__Group_2__1 )
            // InternalIoT.g:1811:2: rule__DeviceTypes__Group_2__0__Impl rule__DeviceTypes__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__DeviceTypes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceTypes__Group_2__1();

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
    // $ANTLR end "rule__DeviceTypes__Group_2__0"


    // $ANTLR start "rule__DeviceTypes__Group_2__0__Impl"
    // InternalIoT.g:1818:1: rule__DeviceTypes__Group_2__0__Impl : ( ',' ) ;
    public final void rule__DeviceTypes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1822:1: ( ( ',' ) )
            // InternalIoT.g:1823:1: ( ',' )
            {
            // InternalIoT.g:1823:1: ( ',' )
            // InternalIoT.g:1824:2: ','
            {
             before(grammarAccess.getDeviceTypesAccess().getCommaKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDeviceTypesAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceTypes__Group_2__0__Impl"


    // $ANTLR start "rule__DeviceTypes__Group_2__1"
    // InternalIoT.g:1833:1: rule__DeviceTypes__Group_2__1 : rule__DeviceTypes__Group_2__1__Impl ;
    public final void rule__DeviceTypes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1837:1: ( rule__DeviceTypes__Group_2__1__Impl )
            // InternalIoT.g:1838:2: rule__DeviceTypes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceTypes__Group_2__1__Impl();

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
    // $ANTLR end "rule__DeviceTypes__Group_2__1"


    // $ANTLR start "rule__DeviceTypes__Group_2__1__Impl"
    // InternalIoT.g:1844:1: rule__DeviceTypes__Group_2__1__Impl : ( ( rule__DeviceTypes__TypesAssignment_2_1 ) ) ;
    public final void rule__DeviceTypes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1848:1: ( ( ( rule__DeviceTypes__TypesAssignment_2_1 ) ) )
            // InternalIoT.g:1849:1: ( ( rule__DeviceTypes__TypesAssignment_2_1 ) )
            {
            // InternalIoT.g:1849:1: ( ( rule__DeviceTypes__TypesAssignment_2_1 ) )
            // InternalIoT.g:1850:2: ( rule__DeviceTypes__TypesAssignment_2_1 )
            {
             before(grammarAccess.getDeviceTypesAccess().getTypesAssignment_2_1()); 
            // InternalIoT.g:1851:2: ( rule__DeviceTypes__TypesAssignment_2_1 )
            // InternalIoT.g:1851:3: rule__DeviceTypes__TypesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DeviceTypes__TypesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceTypesAccess().getTypesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceTypes__Group_2__1__Impl"


    // $ANTLR start "rule__Device__Group__0"
    // InternalIoT.g:1860:1: rule__Device__Group__0 : rule__Device__Group__0__Impl rule__Device__Group__1 ;
    public final void rule__Device__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1864:1: ( rule__Device__Group__0__Impl rule__Device__Group__1 )
            // InternalIoT.g:1865:2: rule__Device__Group__0__Impl rule__Device__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Device__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__1();

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
    // $ANTLR end "rule__Device__Group__0"


    // $ANTLR start "rule__Device__Group__0__Impl"
    // InternalIoT.g:1872:1: rule__Device__Group__0__Impl : ( 'Device' ) ;
    public final void rule__Device__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1876:1: ( ( 'Device' ) )
            // InternalIoT.g:1877:1: ( 'Device' )
            {
            // InternalIoT.g:1877:1: ( 'Device' )
            // InternalIoT.g:1878:2: 'Device'
            {
             before(grammarAccess.getDeviceAccess().getDeviceKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getDeviceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__0__Impl"


    // $ANTLR start "rule__Device__Group__1"
    // InternalIoT.g:1887:1: rule__Device__Group__1 : rule__Device__Group__1__Impl rule__Device__Group__2 ;
    public final void rule__Device__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1891:1: ( rule__Device__Group__1__Impl rule__Device__Group__2 )
            // InternalIoT.g:1892:2: rule__Device__Group__1__Impl rule__Device__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Device__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__2();

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
    // $ANTLR end "rule__Device__Group__1"


    // $ANTLR start "rule__Device__Group__1__Impl"
    // InternalIoT.g:1899:1: rule__Device__Group__1__Impl : ( 'of' ) ;
    public final void rule__Device__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1903:1: ( ( 'of' ) )
            // InternalIoT.g:1904:1: ( 'of' )
            {
            // InternalIoT.g:1904:1: ( 'of' )
            // InternalIoT.g:1905:2: 'of'
            {
             before(grammarAccess.getDeviceAccess().getOfKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getOfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__1__Impl"


    // $ANTLR start "rule__Device__Group__2"
    // InternalIoT.g:1914:1: rule__Device__Group__2 : rule__Device__Group__2__Impl rule__Device__Group__3 ;
    public final void rule__Device__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1918:1: ( rule__Device__Group__2__Impl rule__Device__Group__3 )
            // InternalIoT.g:1919:2: rule__Device__Group__2__Impl rule__Device__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Device__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__3();

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
    // $ANTLR end "rule__Device__Group__2"


    // $ANTLR start "rule__Device__Group__2__Impl"
    // InternalIoT.g:1926:1: rule__Device__Group__2__Impl : ( ( rule__Device__TypeAssignment_2 ) ) ;
    public final void rule__Device__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1930:1: ( ( ( rule__Device__TypeAssignment_2 ) ) )
            // InternalIoT.g:1931:1: ( ( rule__Device__TypeAssignment_2 ) )
            {
            // InternalIoT.g:1931:1: ( ( rule__Device__TypeAssignment_2 ) )
            // InternalIoT.g:1932:2: ( rule__Device__TypeAssignment_2 )
            {
             before(grammarAccess.getDeviceAccess().getTypeAssignment_2()); 
            // InternalIoT.g:1933:2: ( rule__Device__TypeAssignment_2 )
            // InternalIoT.g:1933:3: rule__Device__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Device__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__2__Impl"


    // $ANTLR start "rule__Device__Group__3"
    // InternalIoT.g:1941:1: rule__Device__Group__3 : rule__Device__Group__3__Impl rule__Device__Group__4 ;
    public final void rule__Device__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1945:1: ( rule__Device__Group__3__Impl rule__Device__Group__4 )
            // InternalIoT.g:1946:2: rule__Device__Group__3__Impl rule__Device__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Device__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__4();

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
    // $ANTLR end "rule__Device__Group__3"


    // $ANTLR start "rule__Device__Group__3__Impl"
    // InternalIoT.g:1953:1: rule__Device__Group__3__Impl : ( 'contains' ) ;
    public final void rule__Device__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1957:1: ( ( 'contains' ) )
            // InternalIoT.g:1958:1: ( 'contains' )
            {
            // InternalIoT.g:1958:1: ( 'contains' )
            // InternalIoT.g:1959:2: 'contains'
            {
             before(grammarAccess.getDeviceAccess().getContainsKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getContainsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__3__Impl"


    // $ANTLR start "rule__Device__Group__4"
    // InternalIoT.g:1968:1: rule__Device__Group__4 : rule__Device__Group__4__Impl ;
    public final void rule__Device__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1972:1: ( rule__Device__Group__4__Impl )
            // InternalIoT.g:1973:2: rule__Device__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group__4__Impl();

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
    // $ANTLR end "rule__Device__Group__4"


    // $ANTLR start "rule__Device__Group__4__Impl"
    // InternalIoT.g:1979:1: rule__Device__Group__4__Impl : ( ( rule__Device__GroupAssignment_4 ) ) ;
    public final void rule__Device__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1983:1: ( ( ( rule__Device__GroupAssignment_4 ) ) )
            // InternalIoT.g:1984:1: ( ( rule__Device__GroupAssignment_4 ) )
            {
            // InternalIoT.g:1984:1: ( ( rule__Device__GroupAssignment_4 ) )
            // InternalIoT.g:1985:2: ( rule__Device__GroupAssignment_4 )
            {
             before(grammarAccess.getDeviceAccess().getGroupAssignment_4()); 
            // InternalIoT.g:1986:2: ( rule__Device__GroupAssignment_4 )
            // InternalIoT.g:1986:3: rule__Device__GroupAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Device__GroupAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getGroupAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__4__Impl"


    // $ANTLR start "rule__DeviceGroup__Group__0"
    // InternalIoT.g:1995:1: rule__DeviceGroup__Group__0 : rule__DeviceGroup__Group__0__Impl rule__DeviceGroup__Group__1 ;
    public final void rule__DeviceGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1999:1: ( rule__DeviceGroup__Group__0__Impl rule__DeviceGroup__Group__1 )
            // InternalIoT.g:2000:2: rule__DeviceGroup__Group__0__Impl rule__DeviceGroup__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DeviceGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceGroup__Group__1();

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
    // $ANTLR end "rule__DeviceGroup__Group__0"


    // $ANTLR start "rule__DeviceGroup__Group__0__Impl"
    // InternalIoT.g:2007:1: rule__DeviceGroup__Group__0__Impl : ( 'DeviceGroup' ) ;
    public final void rule__DeviceGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2011:1: ( ( 'DeviceGroup' ) )
            // InternalIoT.g:2012:1: ( 'DeviceGroup' )
            {
            // InternalIoT.g:2012:1: ( 'DeviceGroup' )
            // InternalIoT.g:2013:2: 'DeviceGroup'
            {
             before(grammarAccess.getDeviceGroupAccess().getDeviceGroupKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDeviceGroupAccess().getDeviceGroupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceGroup__Group__0__Impl"


    // $ANTLR start "rule__DeviceGroup__Group__1"
    // InternalIoT.g:2022:1: rule__DeviceGroup__Group__1 : rule__DeviceGroup__Group__1__Impl rule__DeviceGroup__Group__2 ;
    public final void rule__DeviceGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2026:1: ( rule__DeviceGroup__Group__1__Impl rule__DeviceGroup__Group__2 )
            // InternalIoT.g:2027:2: rule__DeviceGroup__Group__1__Impl rule__DeviceGroup__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__DeviceGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceGroup__Group__2();

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
    // $ANTLR end "rule__DeviceGroup__Group__1"


    // $ANTLR start "rule__DeviceGroup__Group__1__Impl"
    // InternalIoT.g:2034:1: rule__DeviceGroup__Group__1__Impl : ( ( rule__DeviceGroup__NameAssignment_1 ) ) ;
    public final void rule__DeviceGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2038:1: ( ( ( rule__DeviceGroup__NameAssignment_1 ) ) )
            // InternalIoT.g:2039:1: ( ( rule__DeviceGroup__NameAssignment_1 ) )
            {
            // InternalIoT.g:2039:1: ( ( rule__DeviceGroup__NameAssignment_1 ) )
            // InternalIoT.g:2040:2: ( rule__DeviceGroup__NameAssignment_1 )
            {
             before(grammarAccess.getDeviceGroupAccess().getNameAssignment_1()); 
            // InternalIoT.g:2041:2: ( rule__DeviceGroup__NameAssignment_1 )
            // InternalIoT.g:2041:3: rule__DeviceGroup__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DeviceGroup__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceGroupAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceGroup__Group__1__Impl"


    // $ANTLR start "rule__DeviceGroup__Group__2"
    // InternalIoT.g:2049:1: rule__DeviceGroup__Group__2 : rule__DeviceGroup__Group__2__Impl rule__DeviceGroup__Group__3 ;
    public final void rule__DeviceGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2053:1: ( rule__DeviceGroup__Group__2__Impl rule__DeviceGroup__Group__3 )
            // InternalIoT.g:2054:2: rule__DeviceGroup__Group__2__Impl rule__DeviceGroup__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__DeviceGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceGroup__Group__3();

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
    // $ANTLR end "rule__DeviceGroup__Group__2"


    // $ANTLR start "rule__DeviceGroup__Group__2__Impl"
    // InternalIoT.g:2061:1: rule__DeviceGroup__Group__2__Impl : ( 'include' ) ;
    public final void rule__DeviceGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2065:1: ( ( 'include' ) )
            // InternalIoT.g:2066:1: ( 'include' )
            {
            // InternalIoT.g:2066:1: ( 'include' )
            // InternalIoT.g:2067:2: 'include'
            {
             before(grammarAccess.getDeviceGroupAccess().getIncludeKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDeviceGroupAccess().getIncludeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceGroup__Group__2__Impl"


    // $ANTLR start "rule__DeviceGroup__Group__3"
    // InternalIoT.g:2076:1: rule__DeviceGroup__Group__3 : rule__DeviceGroup__Group__3__Impl rule__DeviceGroup__Group__4 ;
    public final void rule__DeviceGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2080:1: ( rule__DeviceGroup__Group__3__Impl rule__DeviceGroup__Group__4 )
            // InternalIoT.g:2081:2: rule__DeviceGroup__Group__3__Impl rule__DeviceGroup__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__DeviceGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceGroup__Group__4();

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
    // $ANTLR end "rule__DeviceGroup__Group__3"


    // $ANTLR start "rule__DeviceGroup__Group__3__Impl"
    // InternalIoT.g:2088:1: rule__DeviceGroup__Group__3__Impl : ( '{' ) ;
    public final void rule__DeviceGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2092:1: ( ( '{' ) )
            // InternalIoT.g:2093:1: ( '{' )
            {
            // InternalIoT.g:2093:1: ( '{' )
            // InternalIoT.g:2094:2: '{'
            {
             before(grammarAccess.getDeviceGroupAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDeviceGroupAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceGroup__Group__3__Impl"


    // $ANTLR start "rule__DeviceGroup__Group__4"
    // InternalIoT.g:2103:1: rule__DeviceGroup__Group__4 : rule__DeviceGroup__Group__4__Impl rule__DeviceGroup__Group__5 ;
    public final void rule__DeviceGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2107:1: ( rule__DeviceGroup__Group__4__Impl rule__DeviceGroup__Group__5 )
            // InternalIoT.g:2108:2: rule__DeviceGroup__Group__4__Impl rule__DeviceGroup__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__DeviceGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceGroup__Group__5();

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
    // $ANTLR end "rule__DeviceGroup__Group__4"


    // $ANTLR start "rule__DeviceGroup__Group__4__Impl"
    // InternalIoT.g:2115:1: rule__DeviceGroup__Group__4__Impl : ( ( rule__DeviceGroup__DevicesAssignment_4 ) ) ;
    public final void rule__DeviceGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2119:1: ( ( ( rule__DeviceGroup__DevicesAssignment_4 ) ) )
            // InternalIoT.g:2120:1: ( ( rule__DeviceGroup__DevicesAssignment_4 ) )
            {
            // InternalIoT.g:2120:1: ( ( rule__DeviceGroup__DevicesAssignment_4 ) )
            // InternalIoT.g:2121:2: ( rule__DeviceGroup__DevicesAssignment_4 )
            {
             before(grammarAccess.getDeviceGroupAccess().getDevicesAssignment_4()); 
            // InternalIoT.g:2122:2: ( rule__DeviceGroup__DevicesAssignment_4 )
            // InternalIoT.g:2122:3: rule__DeviceGroup__DevicesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DeviceGroup__DevicesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDeviceGroupAccess().getDevicesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceGroup__Group__4__Impl"


    // $ANTLR start "rule__DeviceGroup__Group__5"
    // InternalIoT.g:2130:1: rule__DeviceGroup__Group__5 : rule__DeviceGroup__Group__5__Impl rule__DeviceGroup__Group__6 ;
    public final void rule__DeviceGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2134:1: ( rule__DeviceGroup__Group__5__Impl rule__DeviceGroup__Group__6 )
            // InternalIoT.g:2135:2: rule__DeviceGroup__Group__5__Impl rule__DeviceGroup__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__DeviceGroup__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceGroup__Group__6();

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
    // $ANTLR end "rule__DeviceGroup__Group__5"


    // $ANTLR start "rule__DeviceGroup__Group__5__Impl"
    // InternalIoT.g:2142:1: rule__DeviceGroup__Group__5__Impl : ( ( rule__DeviceGroup__Group_5__0 )* ) ;
    public final void rule__DeviceGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2146:1: ( ( ( rule__DeviceGroup__Group_5__0 )* ) )
            // InternalIoT.g:2147:1: ( ( rule__DeviceGroup__Group_5__0 )* )
            {
            // InternalIoT.g:2147:1: ( ( rule__DeviceGroup__Group_5__0 )* )
            // InternalIoT.g:2148:2: ( rule__DeviceGroup__Group_5__0 )*
            {
             before(grammarAccess.getDeviceGroupAccess().getGroup_5()); 
            // InternalIoT.g:2149:2: ( rule__DeviceGroup__Group_5__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIoT.g:2149:3: rule__DeviceGroup__Group_5__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DeviceGroup__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDeviceGroupAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceGroup__Group__5__Impl"


    // $ANTLR start "rule__DeviceGroup__Group__6"
    // InternalIoT.g:2157:1: rule__DeviceGroup__Group__6 : rule__DeviceGroup__Group__6__Impl ;
    public final void rule__DeviceGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2161:1: ( rule__DeviceGroup__Group__6__Impl )
            // InternalIoT.g:2162:2: rule__DeviceGroup__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceGroup__Group__6__Impl();

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
    // $ANTLR end "rule__DeviceGroup__Group__6"


    // $ANTLR start "rule__DeviceGroup__Group__6__Impl"
    // InternalIoT.g:2168:1: rule__DeviceGroup__Group__6__Impl : ( '}' ) ;
    public final void rule__DeviceGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2172:1: ( ( '}' ) )
            // InternalIoT.g:2173:1: ( '}' )
            {
            // InternalIoT.g:2173:1: ( '}' )
            // InternalIoT.g:2174:2: '}'
            {
             before(grammarAccess.getDeviceGroupAccess().getRightCurlyBracketKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDeviceGroupAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceGroup__Group__6__Impl"


    // $ANTLR start "rule__DeviceGroup__Group_5__0"
    // InternalIoT.g:2184:1: rule__DeviceGroup__Group_5__0 : rule__DeviceGroup__Group_5__0__Impl rule__DeviceGroup__Group_5__1 ;
    public final void rule__DeviceGroup__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2188:1: ( rule__DeviceGroup__Group_5__0__Impl rule__DeviceGroup__Group_5__1 )
            // InternalIoT.g:2189:2: rule__DeviceGroup__Group_5__0__Impl rule__DeviceGroup__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__DeviceGroup__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceGroup__Group_5__1();

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
    // $ANTLR end "rule__DeviceGroup__Group_5__0"


    // $ANTLR start "rule__DeviceGroup__Group_5__0__Impl"
    // InternalIoT.g:2196:1: rule__DeviceGroup__Group_5__0__Impl : ( ',' ) ;
    public final void rule__DeviceGroup__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2200:1: ( ( ',' ) )
            // InternalIoT.g:2201:1: ( ',' )
            {
            // InternalIoT.g:2201:1: ( ',' )
            // InternalIoT.g:2202:2: ','
            {
             before(grammarAccess.getDeviceGroupAccess().getCommaKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDeviceGroupAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceGroup__Group_5__0__Impl"


    // $ANTLR start "rule__DeviceGroup__Group_5__1"
    // InternalIoT.g:2211:1: rule__DeviceGroup__Group_5__1 : rule__DeviceGroup__Group_5__1__Impl ;
    public final void rule__DeviceGroup__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2215:1: ( rule__DeviceGroup__Group_5__1__Impl )
            // InternalIoT.g:2216:2: rule__DeviceGroup__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceGroup__Group_5__1__Impl();

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
    // $ANTLR end "rule__DeviceGroup__Group_5__1"


    // $ANTLR start "rule__DeviceGroup__Group_5__1__Impl"
    // InternalIoT.g:2222:1: rule__DeviceGroup__Group_5__1__Impl : ( ( rule__DeviceGroup__DevicesAssignment_5_1 ) ) ;
    public final void rule__DeviceGroup__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2226:1: ( ( ( rule__DeviceGroup__DevicesAssignment_5_1 ) ) )
            // InternalIoT.g:2227:1: ( ( rule__DeviceGroup__DevicesAssignment_5_1 ) )
            {
            // InternalIoT.g:2227:1: ( ( rule__DeviceGroup__DevicesAssignment_5_1 ) )
            // InternalIoT.g:2228:2: ( rule__DeviceGroup__DevicesAssignment_5_1 )
            {
             before(grammarAccess.getDeviceGroupAccess().getDevicesAssignment_5_1()); 
            // InternalIoT.g:2229:2: ( rule__DeviceGroup__DevicesAssignment_5_1 )
            // InternalIoT.g:2229:3: rule__DeviceGroup__DevicesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__DeviceGroup__DevicesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceGroupAccess().getDevicesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceGroup__Group_5__1__Impl"


    // $ANTLR start "rule__ServerTypes__Group__0"
    // InternalIoT.g:2238:1: rule__ServerTypes__Group__0 : rule__ServerTypes__Group__0__Impl rule__ServerTypes__Group__1 ;
    public final void rule__ServerTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2242:1: ( rule__ServerTypes__Group__0__Impl rule__ServerTypes__Group__1 )
            // InternalIoT.g:2243:2: rule__ServerTypes__Group__0__Impl rule__ServerTypes__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ServerTypes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerTypes__Group__1();

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
    // $ANTLR end "rule__ServerTypes__Group__0"


    // $ANTLR start "rule__ServerTypes__Group__0__Impl"
    // InternalIoT.g:2250:1: rule__ServerTypes__Group__0__Impl : ( 'ServerTypes' ) ;
    public final void rule__ServerTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2254:1: ( ( 'ServerTypes' ) )
            // InternalIoT.g:2255:1: ( 'ServerTypes' )
            {
            // InternalIoT.g:2255:1: ( 'ServerTypes' )
            // InternalIoT.g:2256:2: 'ServerTypes'
            {
             before(grammarAccess.getServerTypesAccess().getServerTypesKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getServerTypesAccess().getServerTypesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerTypes__Group__0__Impl"


    // $ANTLR start "rule__ServerTypes__Group__1"
    // InternalIoT.g:2265:1: rule__ServerTypes__Group__1 : rule__ServerTypes__Group__1__Impl rule__ServerTypes__Group__2 ;
    public final void rule__ServerTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2269:1: ( rule__ServerTypes__Group__1__Impl rule__ServerTypes__Group__2 )
            // InternalIoT.g:2270:2: rule__ServerTypes__Group__1__Impl rule__ServerTypes__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ServerTypes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerTypes__Group__2();

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
    // $ANTLR end "rule__ServerTypes__Group__1"


    // $ANTLR start "rule__ServerTypes__Group__1__Impl"
    // InternalIoT.g:2277:1: rule__ServerTypes__Group__1__Impl : ( ( rule__ServerTypes__TypesAssignment_1 ) ) ;
    public final void rule__ServerTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2281:1: ( ( ( rule__ServerTypes__TypesAssignment_1 ) ) )
            // InternalIoT.g:2282:1: ( ( rule__ServerTypes__TypesAssignment_1 ) )
            {
            // InternalIoT.g:2282:1: ( ( rule__ServerTypes__TypesAssignment_1 ) )
            // InternalIoT.g:2283:2: ( rule__ServerTypes__TypesAssignment_1 )
            {
             before(grammarAccess.getServerTypesAccess().getTypesAssignment_1()); 
            // InternalIoT.g:2284:2: ( rule__ServerTypes__TypesAssignment_1 )
            // InternalIoT.g:2284:3: rule__ServerTypes__TypesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ServerTypes__TypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServerTypesAccess().getTypesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerTypes__Group__1__Impl"


    // $ANTLR start "rule__ServerTypes__Group__2"
    // InternalIoT.g:2292:1: rule__ServerTypes__Group__2 : rule__ServerTypes__Group__2__Impl ;
    public final void rule__ServerTypes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2296:1: ( rule__ServerTypes__Group__2__Impl )
            // InternalIoT.g:2297:2: rule__ServerTypes__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServerTypes__Group__2__Impl();

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
    // $ANTLR end "rule__ServerTypes__Group__2"


    // $ANTLR start "rule__ServerTypes__Group__2__Impl"
    // InternalIoT.g:2303:1: rule__ServerTypes__Group__2__Impl : ( ( rule__ServerTypes__Group_2__0 )* ) ;
    public final void rule__ServerTypes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2307:1: ( ( ( rule__ServerTypes__Group_2__0 )* ) )
            // InternalIoT.g:2308:1: ( ( rule__ServerTypes__Group_2__0 )* )
            {
            // InternalIoT.g:2308:1: ( ( rule__ServerTypes__Group_2__0 )* )
            // InternalIoT.g:2309:2: ( rule__ServerTypes__Group_2__0 )*
            {
             before(grammarAccess.getServerTypesAccess().getGroup_2()); 
            // InternalIoT.g:2310:2: ( rule__ServerTypes__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIoT.g:2310:3: rule__ServerTypes__Group_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ServerTypes__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getServerTypesAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerTypes__Group__2__Impl"


    // $ANTLR start "rule__ServerTypes__Group_2__0"
    // InternalIoT.g:2319:1: rule__ServerTypes__Group_2__0 : rule__ServerTypes__Group_2__0__Impl rule__ServerTypes__Group_2__1 ;
    public final void rule__ServerTypes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2323:1: ( rule__ServerTypes__Group_2__0__Impl rule__ServerTypes__Group_2__1 )
            // InternalIoT.g:2324:2: rule__ServerTypes__Group_2__0__Impl rule__ServerTypes__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__ServerTypes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerTypes__Group_2__1();

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
    // $ANTLR end "rule__ServerTypes__Group_2__0"


    // $ANTLR start "rule__ServerTypes__Group_2__0__Impl"
    // InternalIoT.g:2331:1: rule__ServerTypes__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ServerTypes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2335:1: ( ( ',' ) )
            // InternalIoT.g:2336:1: ( ',' )
            {
            // InternalIoT.g:2336:1: ( ',' )
            // InternalIoT.g:2337:2: ','
            {
             before(grammarAccess.getServerTypesAccess().getCommaKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getServerTypesAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerTypes__Group_2__0__Impl"


    // $ANTLR start "rule__ServerTypes__Group_2__1"
    // InternalIoT.g:2346:1: rule__ServerTypes__Group_2__1 : rule__ServerTypes__Group_2__1__Impl ;
    public final void rule__ServerTypes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2350:1: ( rule__ServerTypes__Group_2__1__Impl )
            // InternalIoT.g:2351:2: rule__ServerTypes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServerTypes__Group_2__1__Impl();

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
    // $ANTLR end "rule__ServerTypes__Group_2__1"


    // $ANTLR start "rule__ServerTypes__Group_2__1__Impl"
    // InternalIoT.g:2357:1: rule__ServerTypes__Group_2__1__Impl : ( ( rule__ServerTypes__TypesAssignment_2_1 ) ) ;
    public final void rule__ServerTypes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2361:1: ( ( ( rule__ServerTypes__TypesAssignment_2_1 ) ) )
            // InternalIoT.g:2362:1: ( ( rule__ServerTypes__TypesAssignment_2_1 ) )
            {
            // InternalIoT.g:2362:1: ( ( rule__ServerTypes__TypesAssignment_2_1 ) )
            // InternalIoT.g:2363:2: ( rule__ServerTypes__TypesAssignment_2_1 )
            {
             before(grammarAccess.getServerTypesAccess().getTypesAssignment_2_1()); 
            // InternalIoT.g:2364:2: ( rule__ServerTypes__TypesAssignment_2_1 )
            // InternalIoT.g:2364:3: rule__ServerTypes__TypesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ServerTypes__TypesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getServerTypesAccess().getTypesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerTypes__Group_2__1__Impl"


    // $ANTLR start "rule__ServerFromType__Group__0"
    // InternalIoT.g:2373:1: rule__ServerFromType__Group__0 : rule__ServerFromType__Group__0__Impl rule__ServerFromType__Group__1 ;
    public final void rule__ServerFromType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2377:1: ( rule__ServerFromType__Group__0__Impl rule__ServerFromType__Group__1 )
            // InternalIoT.g:2378:2: rule__ServerFromType__Group__0__Impl rule__ServerFromType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ServerFromType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerFromType__Group__1();

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
    // $ANTLR end "rule__ServerFromType__Group__0"


    // $ANTLR start "rule__ServerFromType__Group__0__Impl"
    // InternalIoT.g:2385:1: rule__ServerFromType__Group__0__Impl : ( 'Server' ) ;
    public final void rule__ServerFromType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2389:1: ( ( 'Server' ) )
            // InternalIoT.g:2390:1: ( 'Server' )
            {
            // InternalIoT.g:2390:1: ( 'Server' )
            // InternalIoT.g:2391:2: 'Server'
            {
             before(grammarAccess.getServerFromTypeAccess().getServerKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getServerFromTypeAccess().getServerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerFromType__Group__0__Impl"


    // $ANTLR start "rule__ServerFromType__Group__1"
    // InternalIoT.g:2400:1: rule__ServerFromType__Group__1 : rule__ServerFromType__Group__1__Impl rule__ServerFromType__Group__2 ;
    public final void rule__ServerFromType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2404:1: ( rule__ServerFromType__Group__1__Impl rule__ServerFromType__Group__2 )
            // InternalIoT.g:2405:2: rule__ServerFromType__Group__1__Impl rule__ServerFromType__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ServerFromType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerFromType__Group__2();

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
    // $ANTLR end "rule__ServerFromType__Group__1"


    // $ANTLR start "rule__ServerFromType__Group__1__Impl"
    // InternalIoT.g:2412:1: rule__ServerFromType__Group__1__Impl : ( ( rule__ServerFromType__NameAssignment_1 ) ) ;
    public final void rule__ServerFromType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2416:1: ( ( ( rule__ServerFromType__NameAssignment_1 ) ) )
            // InternalIoT.g:2417:1: ( ( rule__ServerFromType__NameAssignment_1 ) )
            {
            // InternalIoT.g:2417:1: ( ( rule__ServerFromType__NameAssignment_1 ) )
            // InternalIoT.g:2418:2: ( rule__ServerFromType__NameAssignment_1 )
            {
             before(grammarAccess.getServerFromTypeAccess().getNameAssignment_1()); 
            // InternalIoT.g:2419:2: ( rule__ServerFromType__NameAssignment_1 )
            // InternalIoT.g:2419:3: rule__ServerFromType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ServerFromType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServerFromTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerFromType__Group__1__Impl"


    // $ANTLR start "rule__ServerFromType__Group__2"
    // InternalIoT.g:2427:1: rule__ServerFromType__Group__2 : rule__ServerFromType__Group__2__Impl rule__ServerFromType__Group__3 ;
    public final void rule__ServerFromType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2431:1: ( rule__ServerFromType__Group__2__Impl rule__ServerFromType__Group__3 )
            // InternalIoT.g:2432:2: rule__ServerFromType__Group__2__Impl rule__ServerFromType__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ServerFromType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerFromType__Group__3();

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
    // $ANTLR end "rule__ServerFromType__Group__2"


    // $ANTLR start "rule__ServerFromType__Group__2__Impl"
    // InternalIoT.g:2439:1: rule__ServerFromType__Group__2__Impl : ( 'of' ) ;
    public final void rule__ServerFromType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2443:1: ( ( 'of' ) )
            // InternalIoT.g:2444:1: ( 'of' )
            {
            // InternalIoT.g:2444:1: ( 'of' )
            // InternalIoT.g:2445:2: 'of'
            {
             before(grammarAccess.getServerFromTypeAccess().getOfKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getServerFromTypeAccess().getOfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerFromType__Group__2__Impl"


    // $ANTLR start "rule__ServerFromType__Group__3"
    // InternalIoT.g:2454:1: rule__ServerFromType__Group__3 : rule__ServerFromType__Group__3__Impl ;
    public final void rule__ServerFromType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2458:1: ( rule__ServerFromType__Group__3__Impl )
            // InternalIoT.g:2459:2: rule__ServerFromType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServerFromType__Group__3__Impl();

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
    // $ANTLR end "rule__ServerFromType__Group__3"


    // $ANTLR start "rule__ServerFromType__Group__3__Impl"
    // InternalIoT.g:2465:1: rule__ServerFromType__Group__3__Impl : ( ( rule__ServerFromType__TypeAssignment_3 ) ) ;
    public final void rule__ServerFromType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2469:1: ( ( ( rule__ServerFromType__TypeAssignment_3 ) ) )
            // InternalIoT.g:2470:1: ( ( rule__ServerFromType__TypeAssignment_3 ) )
            {
            // InternalIoT.g:2470:1: ( ( rule__ServerFromType__TypeAssignment_3 ) )
            // InternalIoT.g:2471:2: ( rule__ServerFromType__TypeAssignment_3 )
            {
             before(grammarAccess.getServerFromTypeAccess().getTypeAssignment_3()); 
            // InternalIoT.g:2472:2: ( rule__ServerFromType__TypeAssignment_3 )
            // InternalIoT.g:2472:3: rule__ServerFromType__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ServerFromType__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getServerFromTypeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerFromType__Group__3__Impl"


    // $ANTLR start "rule__Server__Group__0"
    // InternalIoT.g:2481:1: rule__Server__Group__0 : rule__Server__Group__0__Impl rule__Server__Group__1 ;
    public final void rule__Server__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2485:1: ( rule__Server__Group__0__Impl rule__Server__Group__1 )
            // InternalIoT.g:2486:2: rule__Server__Group__0__Impl rule__Server__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Server__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Server__Group__1();

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
    // $ANTLR end "rule__Server__Group__0"


    // $ANTLR start "rule__Server__Group__0__Impl"
    // InternalIoT.g:2493:1: rule__Server__Group__0__Impl : ( 'Server' ) ;
    public final void rule__Server__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2497:1: ( ( 'Server' ) )
            // InternalIoT.g:2498:1: ( 'Server' )
            {
            // InternalIoT.g:2498:1: ( 'Server' )
            // InternalIoT.g:2499:2: 'Server'
            {
             before(grammarAccess.getServerAccess().getServerKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getServerAccess().getServerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__0__Impl"


    // $ANTLR start "rule__Server__Group__1"
    // InternalIoT.g:2508:1: rule__Server__Group__1 : rule__Server__Group__1__Impl rule__Server__Group__2 ;
    public final void rule__Server__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2512:1: ( rule__Server__Group__1__Impl rule__Server__Group__2 )
            // InternalIoT.g:2513:2: rule__Server__Group__1__Impl rule__Server__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Server__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Server__Group__2();

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
    // $ANTLR end "rule__Server__Group__1"


    // $ANTLR start "rule__Server__Group__1__Impl"
    // InternalIoT.g:2520:1: rule__Server__Group__1__Impl : ( ( rule__Server__NameAssignment_1 ) ) ;
    public final void rule__Server__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2524:1: ( ( ( rule__Server__NameAssignment_1 ) ) )
            // InternalIoT.g:2525:1: ( ( rule__Server__NameAssignment_1 ) )
            {
            // InternalIoT.g:2525:1: ( ( rule__Server__NameAssignment_1 ) )
            // InternalIoT.g:2526:2: ( rule__Server__NameAssignment_1 )
            {
             before(grammarAccess.getServerAccess().getNameAssignment_1()); 
            // InternalIoT.g:2527:2: ( rule__Server__NameAssignment_1 )
            // InternalIoT.g:2527:3: rule__Server__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Server__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__1__Impl"


    // $ANTLR start "rule__Server__Group__2"
    // InternalIoT.g:2535:1: rule__Server__Group__2 : rule__Server__Group__2__Impl rule__Server__Group__3 ;
    public final void rule__Server__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2539:1: ( rule__Server__Group__2__Impl rule__Server__Group__3 )
            // InternalIoT.g:2540:2: rule__Server__Group__2__Impl rule__Server__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Server__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Server__Group__3();

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
    // $ANTLR end "rule__Server__Group__2"


    // $ANTLR start "rule__Server__Group__2__Impl"
    // InternalIoT.g:2547:1: rule__Server__Group__2__Impl : ( 'listens' ) ;
    public final void rule__Server__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2551:1: ( ( 'listens' ) )
            // InternalIoT.g:2552:1: ( 'listens' )
            {
            // InternalIoT.g:2552:1: ( 'listens' )
            // InternalIoT.g:2553:2: 'listens'
            {
             before(grammarAccess.getServerAccess().getListensKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getServerAccess().getListensKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__2__Impl"


    // $ANTLR start "rule__Server__Group__3"
    // InternalIoT.g:2562:1: rule__Server__Group__3 : rule__Server__Group__3__Impl rule__Server__Group__4 ;
    public final void rule__Server__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2566:1: ( rule__Server__Group__3__Impl rule__Server__Group__4 )
            // InternalIoT.g:2567:2: rule__Server__Group__3__Impl rule__Server__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Server__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Server__Group__4();

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
    // $ANTLR end "rule__Server__Group__3"


    // $ANTLR start "rule__Server__Group__3__Impl"
    // InternalIoT.g:2574:1: rule__Server__Group__3__Impl : ( 'ip' ) ;
    public final void rule__Server__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2578:1: ( ( 'ip' ) )
            // InternalIoT.g:2579:1: ( 'ip' )
            {
            // InternalIoT.g:2579:1: ( 'ip' )
            // InternalIoT.g:2580:2: 'ip'
            {
             before(grammarAccess.getServerAccess().getIpKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getServerAccess().getIpKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__3__Impl"


    // $ANTLR start "rule__Server__Group__4"
    // InternalIoT.g:2589:1: rule__Server__Group__4 : rule__Server__Group__4__Impl rule__Server__Group__5 ;
    public final void rule__Server__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2593:1: ( rule__Server__Group__4__Impl rule__Server__Group__5 )
            // InternalIoT.g:2594:2: rule__Server__Group__4__Impl rule__Server__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Server__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Server__Group__5();

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
    // $ANTLR end "rule__Server__Group__4"


    // $ANTLR start "rule__Server__Group__4__Impl"
    // InternalIoT.g:2601:1: rule__Server__Group__4__Impl : ( 'on' ) ;
    public final void rule__Server__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2605:1: ( ( 'on' ) )
            // InternalIoT.g:2606:1: ( 'on' )
            {
            // InternalIoT.g:2606:1: ( 'on' )
            // InternalIoT.g:2607:2: 'on'
            {
             before(grammarAccess.getServerAccess().getOnKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getServerAccess().getOnKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__4__Impl"


    // $ANTLR start "rule__Server__Group__5"
    // InternalIoT.g:2616:1: rule__Server__Group__5 : rule__Server__Group__5__Impl rule__Server__Group__6 ;
    public final void rule__Server__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2620:1: ( rule__Server__Group__5__Impl rule__Server__Group__6 )
            // InternalIoT.g:2621:2: rule__Server__Group__5__Impl rule__Server__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Server__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Server__Group__6();

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
    // $ANTLR end "rule__Server__Group__5"


    // $ANTLR start "rule__Server__Group__5__Impl"
    // InternalIoT.g:2628:1: rule__Server__Group__5__Impl : ( ( rule__Server__LipAssignment_5 ) ) ;
    public final void rule__Server__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2632:1: ( ( ( rule__Server__LipAssignment_5 ) ) )
            // InternalIoT.g:2633:1: ( ( rule__Server__LipAssignment_5 ) )
            {
            // InternalIoT.g:2633:1: ( ( rule__Server__LipAssignment_5 ) )
            // InternalIoT.g:2634:2: ( rule__Server__LipAssignment_5 )
            {
             before(grammarAccess.getServerAccess().getLipAssignment_5()); 
            // InternalIoT.g:2635:2: ( rule__Server__LipAssignment_5 )
            // InternalIoT.g:2635:3: rule__Server__LipAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Server__LipAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getServerAccess().getLipAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__5__Impl"


    // $ANTLR start "rule__Server__Group__6"
    // InternalIoT.g:2643:1: rule__Server__Group__6 : rule__Server__Group__6__Impl rule__Server__Group__7 ;
    public final void rule__Server__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2647:1: ( rule__Server__Group__6__Impl rule__Server__Group__7 )
            // InternalIoT.g:2648:2: rule__Server__Group__6__Impl rule__Server__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Server__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Server__Group__7();

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
    // $ANTLR end "rule__Server__Group__6"


    // $ANTLR start "rule__Server__Group__6__Impl"
    // InternalIoT.g:2655:1: rule__Server__Group__6__Impl : ( 'sends' ) ;
    public final void rule__Server__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2659:1: ( ( 'sends' ) )
            // InternalIoT.g:2660:1: ( 'sends' )
            {
            // InternalIoT.g:2660:1: ( 'sends' )
            // InternalIoT.g:2661:2: 'sends'
            {
             before(grammarAccess.getServerAccess().getSendsKeyword_6()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getServerAccess().getSendsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__6__Impl"


    // $ANTLR start "rule__Server__Group__7"
    // InternalIoT.g:2670:1: rule__Server__Group__7 : rule__Server__Group__7__Impl rule__Server__Group__8 ;
    public final void rule__Server__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2674:1: ( rule__Server__Group__7__Impl rule__Server__Group__8 )
            // InternalIoT.g:2675:2: rule__Server__Group__7__Impl rule__Server__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__Server__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Server__Group__8();

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
    // $ANTLR end "rule__Server__Group__7"


    // $ANTLR start "rule__Server__Group__7__Impl"
    // InternalIoT.g:2682:1: rule__Server__Group__7__Impl : ( 'ip' ) ;
    public final void rule__Server__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2686:1: ( ( 'ip' ) )
            // InternalIoT.g:2687:1: ( 'ip' )
            {
            // InternalIoT.g:2687:1: ( 'ip' )
            // InternalIoT.g:2688:2: 'ip'
            {
             before(grammarAccess.getServerAccess().getIpKeyword_7()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getServerAccess().getIpKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__7__Impl"


    // $ANTLR start "rule__Server__Group__8"
    // InternalIoT.g:2697:1: rule__Server__Group__8 : rule__Server__Group__8__Impl rule__Server__Group__9 ;
    public final void rule__Server__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2701:1: ( rule__Server__Group__8__Impl rule__Server__Group__9 )
            // InternalIoT.g:2702:2: rule__Server__Group__8__Impl rule__Server__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__Server__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Server__Group__9();

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
    // $ANTLR end "rule__Server__Group__8"


    // $ANTLR start "rule__Server__Group__8__Impl"
    // InternalIoT.g:2709:1: rule__Server__Group__8__Impl : ( 'on' ) ;
    public final void rule__Server__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2713:1: ( ( 'on' ) )
            // InternalIoT.g:2714:1: ( 'on' )
            {
            // InternalIoT.g:2714:1: ( 'on' )
            // InternalIoT.g:2715:2: 'on'
            {
             before(grammarAccess.getServerAccess().getOnKeyword_8()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getServerAccess().getOnKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__8__Impl"


    // $ANTLR start "rule__Server__Group__9"
    // InternalIoT.g:2724:1: rule__Server__Group__9 : rule__Server__Group__9__Impl rule__Server__Group__10 ;
    public final void rule__Server__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2728:1: ( rule__Server__Group__9__Impl rule__Server__Group__10 )
            // InternalIoT.g:2729:2: rule__Server__Group__9__Impl rule__Server__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__Server__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Server__Group__10();

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
    // $ANTLR end "rule__Server__Group__9"


    // $ANTLR start "rule__Server__Group__9__Impl"
    // InternalIoT.g:2736:1: rule__Server__Group__9__Impl : ( ( rule__Server__SipAssignment_9 ) ) ;
    public final void rule__Server__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2740:1: ( ( ( rule__Server__SipAssignment_9 ) ) )
            // InternalIoT.g:2741:1: ( ( rule__Server__SipAssignment_9 ) )
            {
            // InternalIoT.g:2741:1: ( ( rule__Server__SipAssignment_9 ) )
            // InternalIoT.g:2742:2: ( rule__Server__SipAssignment_9 )
            {
             before(grammarAccess.getServerAccess().getSipAssignment_9()); 
            // InternalIoT.g:2743:2: ( rule__Server__SipAssignment_9 )
            // InternalIoT.g:2743:3: rule__Server__SipAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Server__SipAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getServerAccess().getSipAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__9__Impl"


    // $ANTLR start "rule__Server__Group__10"
    // InternalIoT.g:2751:1: rule__Server__Group__10 : rule__Server__Group__10__Impl rule__Server__Group__11 ;
    public final void rule__Server__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2755:1: ( rule__Server__Group__10__Impl rule__Server__Group__11 )
            // InternalIoT.g:2756:2: rule__Server__Group__10__Impl rule__Server__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__Server__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Server__Group__11();

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
    // $ANTLR end "rule__Server__Group__10"


    // $ANTLR start "rule__Server__Group__10__Impl"
    // InternalIoT.g:2763:1: rule__Server__Group__10__Impl : ( 'contains' ) ;
    public final void rule__Server__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2767:1: ( ( 'contains' ) )
            // InternalIoT.g:2768:1: ( 'contains' )
            {
            // InternalIoT.g:2768:1: ( 'contains' )
            // InternalIoT.g:2769:2: 'contains'
            {
             before(grammarAccess.getServerAccess().getContainsKeyword_10()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getServerAccess().getContainsKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__10__Impl"


    // $ANTLR start "rule__Server__Group__11"
    // InternalIoT.g:2778:1: rule__Server__Group__11 : rule__Server__Group__11__Impl ;
    public final void rule__Server__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2782:1: ( rule__Server__Group__11__Impl )
            // InternalIoT.g:2783:2: rule__Server__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Server__Group__11__Impl();

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
    // $ANTLR end "rule__Server__Group__11"


    // $ANTLR start "rule__Server__Group__11__Impl"
    // InternalIoT.g:2789:1: rule__Server__Group__11__Impl : ( ( rule__Server__GroupAssignment_11 ) ) ;
    public final void rule__Server__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2793:1: ( ( ( rule__Server__GroupAssignment_11 ) ) )
            // InternalIoT.g:2794:1: ( ( rule__Server__GroupAssignment_11 ) )
            {
            // InternalIoT.g:2794:1: ( ( rule__Server__GroupAssignment_11 ) )
            // InternalIoT.g:2795:2: ( rule__Server__GroupAssignment_11 )
            {
             before(grammarAccess.getServerAccess().getGroupAssignment_11()); 
            // InternalIoT.g:2796:2: ( rule__Server__GroupAssignment_11 )
            // InternalIoT.g:2796:3: rule__Server__GroupAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Server__GroupAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getServerAccess().getGroupAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__11__Impl"


    // $ANTLR start "rule__DestinationTypes__Group__0"
    // InternalIoT.g:2805:1: rule__DestinationTypes__Group__0 : rule__DestinationTypes__Group__0__Impl rule__DestinationTypes__Group__1 ;
    public final void rule__DestinationTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2809:1: ( rule__DestinationTypes__Group__0__Impl rule__DestinationTypes__Group__1 )
            // InternalIoT.g:2810:2: rule__DestinationTypes__Group__0__Impl rule__DestinationTypes__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DestinationTypes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DestinationTypes__Group__1();

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
    // $ANTLR end "rule__DestinationTypes__Group__0"


    // $ANTLR start "rule__DestinationTypes__Group__0__Impl"
    // InternalIoT.g:2817:1: rule__DestinationTypes__Group__0__Impl : ( 'DestinationTypes' ) ;
    public final void rule__DestinationTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2821:1: ( ( 'DestinationTypes' ) )
            // InternalIoT.g:2822:1: ( 'DestinationTypes' )
            {
            // InternalIoT.g:2822:1: ( 'DestinationTypes' )
            // InternalIoT.g:2823:2: 'DestinationTypes'
            {
             before(grammarAccess.getDestinationTypesAccess().getDestinationTypesKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDestinationTypesAccess().getDestinationTypesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestinationTypes__Group__0__Impl"


    // $ANTLR start "rule__DestinationTypes__Group__1"
    // InternalIoT.g:2832:1: rule__DestinationTypes__Group__1 : rule__DestinationTypes__Group__1__Impl rule__DestinationTypes__Group__2 ;
    public final void rule__DestinationTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2836:1: ( rule__DestinationTypes__Group__1__Impl rule__DestinationTypes__Group__2 )
            // InternalIoT.g:2837:2: rule__DestinationTypes__Group__1__Impl rule__DestinationTypes__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DestinationTypes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DestinationTypes__Group__2();

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
    // $ANTLR end "rule__DestinationTypes__Group__1"


    // $ANTLR start "rule__DestinationTypes__Group__1__Impl"
    // InternalIoT.g:2844:1: rule__DestinationTypes__Group__1__Impl : ( ( rule__DestinationTypes__TypesAssignment_1 ) ) ;
    public final void rule__DestinationTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2848:1: ( ( ( rule__DestinationTypes__TypesAssignment_1 ) ) )
            // InternalIoT.g:2849:1: ( ( rule__DestinationTypes__TypesAssignment_1 ) )
            {
            // InternalIoT.g:2849:1: ( ( rule__DestinationTypes__TypesAssignment_1 ) )
            // InternalIoT.g:2850:2: ( rule__DestinationTypes__TypesAssignment_1 )
            {
             before(grammarAccess.getDestinationTypesAccess().getTypesAssignment_1()); 
            // InternalIoT.g:2851:2: ( rule__DestinationTypes__TypesAssignment_1 )
            // InternalIoT.g:2851:3: rule__DestinationTypes__TypesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DestinationTypes__TypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDestinationTypesAccess().getTypesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestinationTypes__Group__1__Impl"


    // $ANTLR start "rule__DestinationTypes__Group__2"
    // InternalIoT.g:2859:1: rule__DestinationTypes__Group__2 : rule__DestinationTypes__Group__2__Impl ;
    public final void rule__DestinationTypes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2863:1: ( rule__DestinationTypes__Group__2__Impl )
            // InternalIoT.g:2864:2: rule__DestinationTypes__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DestinationTypes__Group__2__Impl();

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
    // $ANTLR end "rule__DestinationTypes__Group__2"


    // $ANTLR start "rule__DestinationTypes__Group__2__Impl"
    // InternalIoT.g:2870:1: rule__DestinationTypes__Group__2__Impl : ( ( rule__DestinationTypes__Group_2__0 )* ) ;
    public final void rule__DestinationTypes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2874:1: ( ( ( rule__DestinationTypes__Group_2__0 )* ) )
            // InternalIoT.g:2875:1: ( ( rule__DestinationTypes__Group_2__0 )* )
            {
            // InternalIoT.g:2875:1: ( ( rule__DestinationTypes__Group_2__0 )* )
            // InternalIoT.g:2876:2: ( rule__DestinationTypes__Group_2__0 )*
            {
             before(grammarAccess.getDestinationTypesAccess().getGroup_2()); 
            // InternalIoT.g:2877:2: ( rule__DestinationTypes__Group_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalIoT.g:2877:3: rule__DestinationTypes__Group_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DestinationTypes__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getDestinationTypesAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestinationTypes__Group__2__Impl"


    // $ANTLR start "rule__DestinationTypes__Group_2__0"
    // InternalIoT.g:2886:1: rule__DestinationTypes__Group_2__0 : rule__DestinationTypes__Group_2__0__Impl rule__DestinationTypes__Group_2__1 ;
    public final void rule__DestinationTypes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2890:1: ( rule__DestinationTypes__Group_2__0__Impl rule__DestinationTypes__Group_2__1 )
            // InternalIoT.g:2891:2: rule__DestinationTypes__Group_2__0__Impl rule__DestinationTypes__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__DestinationTypes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DestinationTypes__Group_2__1();

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
    // $ANTLR end "rule__DestinationTypes__Group_2__0"


    // $ANTLR start "rule__DestinationTypes__Group_2__0__Impl"
    // InternalIoT.g:2898:1: rule__DestinationTypes__Group_2__0__Impl : ( ',' ) ;
    public final void rule__DestinationTypes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2902:1: ( ( ',' ) )
            // InternalIoT.g:2903:1: ( ',' )
            {
            // InternalIoT.g:2903:1: ( ',' )
            // InternalIoT.g:2904:2: ','
            {
             before(grammarAccess.getDestinationTypesAccess().getCommaKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDestinationTypesAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestinationTypes__Group_2__0__Impl"


    // $ANTLR start "rule__DestinationTypes__Group_2__1"
    // InternalIoT.g:2913:1: rule__DestinationTypes__Group_2__1 : rule__DestinationTypes__Group_2__1__Impl ;
    public final void rule__DestinationTypes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2917:1: ( rule__DestinationTypes__Group_2__1__Impl )
            // InternalIoT.g:2918:2: rule__DestinationTypes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DestinationTypes__Group_2__1__Impl();

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
    // $ANTLR end "rule__DestinationTypes__Group_2__1"


    // $ANTLR start "rule__DestinationTypes__Group_2__1__Impl"
    // InternalIoT.g:2924:1: rule__DestinationTypes__Group_2__1__Impl : ( ( rule__DestinationTypes__TypesAssignment_2_1 ) ) ;
    public final void rule__DestinationTypes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2928:1: ( ( ( rule__DestinationTypes__TypesAssignment_2_1 ) ) )
            // InternalIoT.g:2929:1: ( ( rule__DestinationTypes__TypesAssignment_2_1 ) )
            {
            // InternalIoT.g:2929:1: ( ( rule__DestinationTypes__TypesAssignment_2_1 ) )
            // InternalIoT.g:2930:2: ( rule__DestinationTypes__TypesAssignment_2_1 )
            {
             before(grammarAccess.getDestinationTypesAccess().getTypesAssignment_2_1()); 
            // InternalIoT.g:2931:2: ( rule__DestinationTypes__TypesAssignment_2_1 )
            // InternalIoT.g:2931:3: rule__DestinationTypes__TypesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DestinationTypes__TypesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDestinationTypesAccess().getTypesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestinationTypes__Group_2__1__Impl"


    // $ANTLR start "rule__Destination__Group__0"
    // InternalIoT.g:2940:1: rule__Destination__Group__0 : rule__Destination__Group__0__Impl rule__Destination__Group__1 ;
    public final void rule__Destination__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2944:1: ( rule__Destination__Group__0__Impl rule__Destination__Group__1 )
            // InternalIoT.g:2945:2: rule__Destination__Group__0__Impl rule__Destination__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Destination__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destination__Group__1();

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
    // $ANTLR end "rule__Destination__Group__0"


    // $ANTLR start "rule__Destination__Group__0__Impl"
    // InternalIoT.g:2952:1: rule__Destination__Group__0__Impl : ( 'Destination' ) ;
    public final void rule__Destination__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2956:1: ( ( 'Destination' ) )
            // InternalIoT.g:2957:1: ( 'Destination' )
            {
            // InternalIoT.g:2957:1: ( 'Destination' )
            // InternalIoT.g:2958:2: 'Destination'
            {
             before(grammarAccess.getDestinationAccess().getDestinationKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getDestinationAccess().getDestinationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__0__Impl"


    // $ANTLR start "rule__Destination__Group__1"
    // InternalIoT.g:2967:1: rule__Destination__Group__1 : rule__Destination__Group__1__Impl rule__Destination__Group__2 ;
    public final void rule__Destination__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2971:1: ( rule__Destination__Group__1__Impl rule__Destination__Group__2 )
            // InternalIoT.g:2972:2: rule__Destination__Group__1__Impl rule__Destination__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Destination__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destination__Group__2();

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
    // $ANTLR end "rule__Destination__Group__1"


    // $ANTLR start "rule__Destination__Group__1__Impl"
    // InternalIoT.g:2979:1: rule__Destination__Group__1__Impl : ( ( rule__Destination__NameAssignment_1 ) ) ;
    public final void rule__Destination__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2983:1: ( ( ( rule__Destination__NameAssignment_1 ) ) )
            // InternalIoT.g:2984:1: ( ( rule__Destination__NameAssignment_1 ) )
            {
            // InternalIoT.g:2984:1: ( ( rule__Destination__NameAssignment_1 ) )
            // InternalIoT.g:2985:2: ( rule__Destination__NameAssignment_1 )
            {
             before(grammarAccess.getDestinationAccess().getNameAssignment_1()); 
            // InternalIoT.g:2986:2: ( rule__Destination__NameAssignment_1 )
            // InternalIoT.g:2986:3: rule__Destination__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Destination__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDestinationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__1__Impl"


    // $ANTLR start "rule__Destination__Group__2"
    // InternalIoT.g:2994:1: rule__Destination__Group__2 : rule__Destination__Group__2__Impl rule__Destination__Group__3 ;
    public final void rule__Destination__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2998:1: ( rule__Destination__Group__2__Impl rule__Destination__Group__3 )
            // InternalIoT.g:2999:2: rule__Destination__Group__2__Impl rule__Destination__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Destination__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destination__Group__3();

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
    // $ANTLR end "rule__Destination__Group__2"


    // $ANTLR start "rule__Destination__Group__2__Impl"
    // InternalIoT.g:3006:1: rule__Destination__Group__2__Impl : ( 'of' ) ;
    public final void rule__Destination__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3010:1: ( ( 'of' ) )
            // InternalIoT.g:3011:1: ( 'of' )
            {
            // InternalIoT.g:3011:1: ( 'of' )
            // InternalIoT.g:3012:2: 'of'
            {
             before(grammarAccess.getDestinationAccess().getOfKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDestinationAccess().getOfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__2__Impl"


    // $ANTLR start "rule__Destination__Group__3"
    // InternalIoT.g:3021:1: rule__Destination__Group__3 : rule__Destination__Group__3__Impl ;
    public final void rule__Destination__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3025:1: ( rule__Destination__Group__3__Impl )
            // InternalIoT.g:3026:2: rule__Destination__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Destination__Group__3__Impl();

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
    // $ANTLR end "rule__Destination__Group__3"


    // $ANTLR start "rule__Destination__Group__3__Impl"
    // InternalIoT.g:3032:1: rule__Destination__Group__3__Impl : ( ( rule__Destination__TypeAssignment_3 ) ) ;
    public final void rule__Destination__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3036:1: ( ( ( rule__Destination__TypeAssignment_3 ) ) )
            // InternalIoT.g:3037:1: ( ( rule__Destination__TypeAssignment_3 ) )
            {
            // InternalIoT.g:3037:1: ( ( rule__Destination__TypeAssignment_3 ) )
            // InternalIoT.g:3038:2: ( rule__Destination__TypeAssignment_3 )
            {
             before(grammarAccess.getDestinationAccess().getTypeAssignment_3()); 
            // InternalIoT.g:3039:2: ( rule__Destination__TypeAssignment_3 )
            // InternalIoT.g:3039:3: rule__Destination__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Destination__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDestinationAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__3__Impl"


    // $ANTLR start "rule__FetchData__Group__0"
    // InternalIoT.g:3048:1: rule__FetchData__Group__0 : rule__FetchData__Group__0__Impl rule__FetchData__Group__1 ;
    public final void rule__FetchData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3052:1: ( rule__FetchData__Group__0__Impl rule__FetchData__Group__1 )
            // InternalIoT.g:3053:2: rule__FetchData__Group__0__Impl rule__FetchData__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__FetchData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchData__Group__1();

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
    // $ANTLR end "rule__FetchData__Group__0"


    // $ANTLR start "rule__FetchData__Group__0__Impl"
    // InternalIoT.g:3060:1: rule__FetchData__Group__0__Impl : ( 'Fetch' ) ;
    public final void rule__FetchData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3064:1: ( ( 'Fetch' ) )
            // InternalIoT.g:3065:1: ( 'Fetch' )
            {
            // InternalIoT.g:3065:1: ( 'Fetch' )
            // InternalIoT.g:3066:2: 'Fetch'
            {
             before(grammarAccess.getFetchDataAccess().getFetchKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getFetchKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__0__Impl"


    // $ANTLR start "rule__FetchData__Group__1"
    // InternalIoT.g:3075:1: rule__FetchData__Group__1 : rule__FetchData__Group__1__Impl rule__FetchData__Group__2 ;
    public final void rule__FetchData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3079:1: ( rule__FetchData__Group__1__Impl rule__FetchData__Group__2 )
            // InternalIoT.g:3080:2: rule__FetchData__Group__1__Impl rule__FetchData__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__FetchData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchData__Group__2();

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
    // $ANTLR end "rule__FetchData__Group__1"


    // $ANTLR start "rule__FetchData__Group__1__Impl"
    // InternalIoT.g:3087:1: rule__FetchData__Group__1__Impl : ( 'data' ) ;
    public final void rule__FetchData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3091:1: ( ( 'data' ) )
            // InternalIoT.g:3092:1: ( 'data' )
            {
            // InternalIoT.g:3092:1: ( 'data' )
            // InternalIoT.g:3093:2: 'data'
            {
             before(grammarAccess.getFetchDataAccess().getDataKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getDataKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__1__Impl"


    // $ANTLR start "rule__FetchData__Group__2"
    // InternalIoT.g:3102:1: rule__FetchData__Group__2 : rule__FetchData__Group__2__Impl rule__FetchData__Group__3 ;
    public final void rule__FetchData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3106:1: ( rule__FetchData__Group__2__Impl rule__FetchData__Group__3 )
            // InternalIoT.g:3107:2: rule__FetchData__Group__2__Impl rule__FetchData__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__FetchData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchData__Group__3();

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
    // $ANTLR end "rule__FetchData__Group__2"


    // $ANTLR start "rule__FetchData__Group__2__Impl"
    // InternalIoT.g:3114:1: rule__FetchData__Group__2__Impl : ( 'from' ) ;
    public final void rule__FetchData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3118:1: ( ( 'from' ) )
            // InternalIoT.g:3119:1: ( 'from' )
            {
            // InternalIoT.g:3119:1: ( 'from' )
            // InternalIoT.g:3120:2: 'from'
            {
             before(grammarAccess.getFetchDataAccess().getFromKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__2__Impl"


    // $ANTLR start "rule__FetchData__Group__3"
    // InternalIoT.g:3129:1: rule__FetchData__Group__3 : rule__FetchData__Group__3__Impl rule__FetchData__Group__4 ;
    public final void rule__FetchData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3133:1: ( rule__FetchData__Group__3__Impl rule__FetchData__Group__4 )
            // InternalIoT.g:3134:2: rule__FetchData__Group__3__Impl rule__FetchData__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__FetchData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchData__Group__4();

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
    // $ANTLR end "rule__FetchData__Group__3"


    // $ANTLR start "rule__FetchData__Group__3__Impl"
    // InternalIoT.g:3141:1: rule__FetchData__Group__3__Impl : ( ( rule__FetchData__Alternatives_3 ) ) ;
    public final void rule__FetchData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3145:1: ( ( ( rule__FetchData__Alternatives_3 ) ) )
            // InternalIoT.g:3146:1: ( ( rule__FetchData__Alternatives_3 ) )
            {
            // InternalIoT.g:3146:1: ( ( rule__FetchData__Alternatives_3 ) )
            // InternalIoT.g:3147:2: ( rule__FetchData__Alternatives_3 )
            {
             before(grammarAccess.getFetchDataAccess().getAlternatives_3()); 
            // InternalIoT.g:3148:2: ( rule__FetchData__Alternatives_3 )
            // InternalIoT.g:3148:3: rule__FetchData__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__3__Impl"


    // $ANTLR start "rule__FetchData__Group__4"
    // InternalIoT.g:3156:1: rule__FetchData__Group__4 : rule__FetchData__Group__4__Impl rule__FetchData__Group__5 ;
    public final void rule__FetchData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3160:1: ( rule__FetchData__Group__4__Impl rule__FetchData__Group__5 )
            // InternalIoT.g:3161:2: rule__FetchData__Group__4__Impl rule__FetchData__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__FetchData__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchData__Group__5();

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
    // $ANTLR end "rule__FetchData__Group__4"


    // $ANTLR start "rule__FetchData__Group__4__Impl"
    // InternalIoT.g:3168:1: rule__FetchData__Group__4__Impl : ( 'to' ) ;
    public final void rule__FetchData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3172:1: ( ( 'to' ) )
            // InternalIoT.g:3173:1: ( 'to' )
            {
            // InternalIoT.g:3173:1: ( 'to' )
            // InternalIoT.g:3174:2: 'to'
            {
             before(grammarAccess.getFetchDataAccess().getToKeyword_4()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__4__Impl"


    // $ANTLR start "rule__FetchData__Group__5"
    // InternalIoT.g:3183:1: rule__FetchData__Group__5 : rule__FetchData__Group__5__Impl rule__FetchData__Group__6 ;
    public final void rule__FetchData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3187:1: ( rule__FetchData__Group__5__Impl rule__FetchData__Group__6 )
            // InternalIoT.g:3188:2: rule__FetchData__Group__5__Impl rule__FetchData__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__FetchData__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchData__Group__6();

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
    // $ANTLR end "rule__FetchData__Group__5"


    // $ANTLR start "rule__FetchData__Group__5__Impl"
    // InternalIoT.g:3195:1: rule__FetchData__Group__5__Impl : ( ( rule__FetchData__Alternatives_5 ) ) ;
    public final void rule__FetchData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3199:1: ( ( ( rule__FetchData__Alternatives_5 ) ) )
            // InternalIoT.g:3200:1: ( ( rule__FetchData__Alternatives_5 ) )
            {
            // InternalIoT.g:3200:1: ( ( rule__FetchData__Alternatives_5 ) )
            // InternalIoT.g:3201:2: ( rule__FetchData__Alternatives_5 )
            {
             before(grammarAccess.getFetchDataAccess().getAlternatives_5()); 
            // InternalIoT.g:3202:2: ( rule__FetchData__Alternatives_5 )
            // InternalIoT.g:3202:3: rule__FetchData__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__5__Impl"


    // $ANTLR start "rule__FetchData__Group__6"
    // InternalIoT.g:3210:1: rule__FetchData__Group__6 : rule__FetchData__Group__6__Impl ;
    public final void rule__FetchData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3214:1: ( rule__FetchData__Group__6__Impl )
            // InternalIoT.g:3215:2: rule__FetchData__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Group__6__Impl();

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
    // $ANTLR end "rule__FetchData__Group__6"


    // $ANTLR start "rule__FetchData__Group__6__Impl"
    // InternalIoT.g:3221:1: rule__FetchData__Group__6__Impl : ( ( rule__FetchData__Alternatives_6 )? ) ;
    public final void rule__FetchData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3225:1: ( ( ( rule__FetchData__Alternatives_6 )? ) )
            // InternalIoT.g:3226:1: ( ( rule__FetchData__Alternatives_6 )? )
            {
            // InternalIoT.g:3226:1: ( ( rule__FetchData__Alternatives_6 )? )
            // InternalIoT.g:3227:2: ( rule__FetchData__Alternatives_6 )?
            {
             before(grammarAccess.getFetchDataAccess().getAlternatives_6()); 
            // InternalIoT.g:3228:2: ( rule__FetchData__Alternatives_6 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=13 && LA15_0<=14)||LA15_0==51) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalIoT.g:3228:3: rule__FetchData__Alternatives_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__FetchData__Alternatives_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFetchDataAccess().getAlternatives_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__6__Impl"


    // $ANTLR start "rule__FetchData__Group_3_0__0"
    // InternalIoT.g:3237:1: rule__FetchData__Group_3_0__0 : rule__FetchData__Group_3_0__0__Impl rule__FetchData__Group_3_0__1 ;
    public final void rule__FetchData__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3241:1: ( rule__FetchData__Group_3_0__0__Impl rule__FetchData__Group_3_0__1 )
            // InternalIoT.g:3242:2: rule__FetchData__Group_3_0__0__Impl rule__FetchData__Group_3_0__1
            {
            pushFollow(FOLLOW_4);
            rule__FetchData__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchData__Group_3_0__1();

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
    // $ANTLR end "rule__FetchData__Group_3_0__0"


    // $ANTLR start "rule__FetchData__Group_3_0__0__Impl"
    // InternalIoT.g:3249:1: rule__FetchData__Group_3_0__0__Impl : ( 'type' ) ;
    public final void rule__FetchData__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3253:1: ( ( 'type' ) )
            // InternalIoT.g:3254:1: ( 'type' )
            {
            // InternalIoT.g:3254:1: ( 'type' )
            // InternalIoT.g:3255:2: 'type'
            {
             before(grammarAccess.getFetchDataAccess().getTypeKeyword_3_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getTypeKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_3_0__0__Impl"


    // $ANTLR start "rule__FetchData__Group_3_0__1"
    // InternalIoT.g:3264:1: rule__FetchData__Group_3_0__1 : rule__FetchData__Group_3_0__1__Impl ;
    public final void rule__FetchData__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3268:1: ( rule__FetchData__Group_3_0__1__Impl )
            // InternalIoT.g:3269:2: rule__FetchData__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Group_3_0__1__Impl();

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
    // $ANTLR end "rule__FetchData__Group_3_0__1"


    // $ANTLR start "rule__FetchData__Group_3_0__1__Impl"
    // InternalIoT.g:3275:1: rule__FetchData__Group_3_0__1__Impl : ( ( rule__FetchData__FilterAssignment_3_0_1 ) ) ;
    public final void rule__FetchData__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3279:1: ( ( ( rule__FetchData__FilterAssignment_3_0_1 ) ) )
            // InternalIoT.g:3280:1: ( ( rule__FetchData__FilterAssignment_3_0_1 ) )
            {
            // InternalIoT.g:3280:1: ( ( rule__FetchData__FilterAssignment_3_0_1 ) )
            // InternalIoT.g:3281:2: ( rule__FetchData__FilterAssignment_3_0_1 )
            {
             before(grammarAccess.getFetchDataAccess().getFilterAssignment_3_0_1()); 
            // InternalIoT.g:3282:2: ( rule__FetchData__FilterAssignment_3_0_1 )
            // InternalIoT.g:3282:3: rule__FetchData__FilterAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__FilterAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataAccess().getFilterAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_3_0__1__Impl"


    // $ANTLR start "rule__FetchData__Group_3_1__0"
    // InternalIoT.g:3291:1: rule__FetchData__Group_3_1__0 : rule__FetchData__Group_3_1__0__Impl rule__FetchData__Group_3_1__1 ;
    public final void rule__FetchData__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3295:1: ( rule__FetchData__Group_3_1__0__Impl rule__FetchData__Group_3_1__1 )
            // InternalIoT.g:3296:2: rule__FetchData__Group_3_1__0__Impl rule__FetchData__Group_3_1__1
            {
            pushFollow(FOLLOW_4);
            rule__FetchData__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchData__Group_3_1__1();

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
    // $ANTLR end "rule__FetchData__Group_3_1__0"


    // $ANTLR start "rule__FetchData__Group_3_1__0__Impl"
    // InternalIoT.g:3303:1: rule__FetchData__Group_3_1__0__Impl : ( 'group' ) ;
    public final void rule__FetchData__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3307:1: ( ( 'group' ) )
            // InternalIoT.g:3308:1: ( 'group' )
            {
            // InternalIoT.g:3308:1: ( 'group' )
            // InternalIoT.g:3309:2: 'group'
            {
             before(grammarAccess.getFetchDataAccess().getGroupKeyword_3_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getGroupKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_3_1__0__Impl"


    // $ANTLR start "rule__FetchData__Group_3_1__1"
    // InternalIoT.g:3318:1: rule__FetchData__Group_3_1__1 : rule__FetchData__Group_3_1__1__Impl ;
    public final void rule__FetchData__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3322:1: ( rule__FetchData__Group_3_1__1__Impl )
            // InternalIoT.g:3323:2: rule__FetchData__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__FetchData__Group_3_1__1"


    // $ANTLR start "rule__FetchData__Group_3_1__1__Impl"
    // InternalIoT.g:3329:1: rule__FetchData__Group_3_1__1__Impl : ( ( rule__FetchData__FilterAssignment_3_1_1 ) ) ;
    public final void rule__FetchData__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3333:1: ( ( ( rule__FetchData__FilterAssignment_3_1_1 ) ) )
            // InternalIoT.g:3334:1: ( ( rule__FetchData__FilterAssignment_3_1_1 ) )
            {
            // InternalIoT.g:3334:1: ( ( rule__FetchData__FilterAssignment_3_1_1 ) )
            // InternalIoT.g:3335:2: ( rule__FetchData__FilterAssignment_3_1_1 )
            {
             before(grammarAccess.getFetchDataAccess().getFilterAssignment_3_1_1()); 
            // InternalIoT.g:3336:2: ( rule__FetchData__FilterAssignment_3_1_1 )
            // InternalIoT.g:3336:3: rule__FetchData__FilterAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__FilterAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataAccess().getFilterAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_3_1__1__Impl"


    // $ANTLR start "rule__FetchData__Group_5_0__0"
    // InternalIoT.g:3345:1: rule__FetchData__Group_5_0__0 : rule__FetchData__Group_5_0__0__Impl rule__FetchData__Group_5_0__1 ;
    public final void rule__FetchData__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3349:1: ( rule__FetchData__Group_5_0__0__Impl rule__FetchData__Group_5_0__1 )
            // InternalIoT.g:3350:2: rule__FetchData__Group_5_0__0__Impl rule__FetchData__Group_5_0__1
            {
            pushFollow(FOLLOW_4);
            rule__FetchData__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchData__Group_5_0__1();

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
    // $ANTLR end "rule__FetchData__Group_5_0__0"


    // $ANTLR start "rule__FetchData__Group_5_0__0__Impl"
    // InternalIoT.g:3357:1: rule__FetchData__Group_5_0__0__Impl : ( 'destination' ) ;
    public final void rule__FetchData__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3361:1: ( ( 'destination' ) )
            // InternalIoT.g:3362:1: ( 'destination' )
            {
            // InternalIoT.g:3362:1: ( 'destination' )
            // InternalIoT.g:3363:2: 'destination'
            {
             before(grammarAccess.getFetchDataAccess().getDestinationKeyword_5_0_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getDestinationKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_5_0__0__Impl"


    // $ANTLR start "rule__FetchData__Group_5_0__1"
    // InternalIoT.g:3372:1: rule__FetchData__Group_5_0__1 : rule__FetchData__Group_5_0__1__Impl ;
    public final void rule__FetchData__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3376:1: ( rule__FetchData__Group_5_0__1__Impl )
            // InternalIoT.g:3377:2: rule__FetchData__Group_5_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Group_5_0__1__Impl();

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
    // $ANTLR end "rule__FetchData__Group_5_0__1"


    // $ANTLR start "rule__FetchData__Group_5_0__1__Impl"
    // InternalIoT.g:3383:1: rule__FetchData__Group_5_0__1__Impl : ( ( rule__FetchData__DestinationAssignment_5_0_1 ) ) ;
    public final void rule__FetchData__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3387:1: ( ( ( rule__FetchData__DestinationAssignment_5_0_1 ) ) )
            // InternalIoT.g:3388:1: ( ( rule__FetchData__DestinationAssignment_5_0_1 ) )
            {
            // InternalIoT.g:3388:1: ( ( rule__FetchData__DestinationAssignment_5_0_1 ) )
            // InternalIoT.g:3389:2: ( rule__FetchData__DestinationAssignment_5_0_1 )
            {
             before(grammarAccess.getFetchDataAccess().getDestinationAssignment_5_0_1()); 
            // InternalIoT.g:3390:2: ( rule__FetchData__DestinationAssignment_5_0_1 )
            // InternalIoT.g:3390:3: rule__FetchData__DestinationAssignment_5_0_1
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__DestinationAssignment_5_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataAccess().getDestinationAssignment_5_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_5_0__1__Impl"


    // $ANTLR start "rule__FetchData__Group_5_1__0"
    // InternalIoT.g:3399:1: rule__FetchData__Group_5_1__0 : rule__FetchData__Group_5_1__0__Impl rule__FetchData__Group_5_1__1 ;
    public final void rule__FetchData__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3403:1: ( rule__FetchData__Group_5_1__0__Impl rule__FetchData__Group_5_1__1 )
            // InternalIoT.g:3404:2: rule__FetchData__Group_5_1__0__Impl rule__FetchData__Group_5_1__1
            {
            pushFollow(FOLLOW_4);
            rule__FetchData__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchData__Group_5_1__1();

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
    // $ANTLR end "rule__FetchData__Group_5_1__0"


    // $ANTLR start "rule__FetchData__Group_5_1__0__Impl"
    // InternalIoT.g:3411:1: rule__FetchData__Group_5_1__0__Impl : ( 'server' ) ;
    public final void rule__FetchData__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3415:1: ( ( 'server' ) )
            // InternalIoT.g:3416:1: ( 'server' )
            {
            // InternalIoT.g:3416:1: ( 'server' )
            // InternalIoT.g:3417:2: 'server'
            {
             before(grammarAccess.getFetchDataAccess().getServerKeyword_5_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getServerKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_5_1__0__Impl"


    // $ANTLR start "rule__FetchData__Group_5_1__1"
    // InternalIoT.g:3426:1: rule__FetchData__Group_5_1__1 : rule__FetchData__Group_5_1__1__Impl ;
    public final void rule__FetchData__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3430:1: ( rule__FetchData__Group_5_1__1__Impl )
            // InternalIoT.g:3431:2: rule__FetchData__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Group_5_1__1__Impl();

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
    // $ANTLR end "rule__FetchData__Group_5_1__1"


    // $ANTLR start "rule__FetchData__Group_5_1__1__Impl"
    // InternalIoT.g:3437:1: rule__FetchData__Group_5_1__1__Impl : ( ( rule__FetchData__DestinationAssignment_5_1_1 ) ) ;
    public final void rule__FetchData__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3441:1: ( ( ( rule__FetchData__DestinationAssignment_5_1_1 ) ) )
            // InternalIoT.g:3442:1: ( ( rule__FetchData__DestinationAssignment_5_1_1 ) )
            {
            // InternalIoT.g:3442:1: ( ( rule__FetchData__DestinationAssignment_5_1_1 ) )
            // InternalIoT.g:3443:2: ( rule__FetchData__DestinationAssignment_5_1_1 )
            {
             before(grammarAccess.getFetchDataAccess().getDestinationAssignment_5_1_1()); 
            // InternalIoT.g:3444:2: ( rule__FetchData__DestinationAssignment_5_1_1 )
            // InternalIoT.g:3444:3: rule__FetchData__DestinationAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__DestinationAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataAccess().getDestinationAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_5_1__1__Impl"


    // $ANTLR start "rule__FetchDataExpression__Group__0"
    // InternalIoT.g:3453:1: rule__FetchDataExpression__Group__0 : rule__FetchDataExpression__Group__0__Impl rule__FetchDataExpression__Group__1 ;
    public final void rule__FetchDataExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3457:1: ( rule__FetchDataExpression__Group__0__Impl rule__FetchDataExpression__Group__1 )
            // InternalIoT.g:3458:2: rule__FetchDataExpression__Group__0__Impl rule__FetchDataExpression__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__FetchDataExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchDataExpression__Group__1();

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
    // $ANTLR end "rule__FetchDataExpression__Group__0"


    // $ANTLR start "rule__FetchDataExpression__Group__0__Impl"
    // InternalIoT.g:3465:1: rule__FetchDataExpression__Group__0__Impl : ( 'every' ) ;
    public final void rule__FetchDataExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3469:1: ( ( 'every' ) )
            // InternalIoT.g:3470:1: ( 'every' )
            {
            // InternalIoT.g:3470:1: ( 'every' )
            // InternalIoT.g:3471:2: 'every'
            {
             before(grammarAccess.getFetchDataExpressionAccess().getEveryKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getFetchDataExpressionAccess().getEveryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataExpression__Group__0__Impl"


    // $ANTLR start "rule__FetchDataExpression__Group__1"
    // InternalIoT.g:3480:1: rule__FetchDataExpression__Group__1 : rule__FetchDataExpression__Group__1__Impl rule__FetchDataExpression__Group__2 ;
    public final void rule__FetchDataExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3484:1: ( rule__FetchDataExpression__Group__1__Impl rule__FetchDataExpression__Group__2 )
            // InternalIoT.g:3485:2: rule__FetchDataExpression__Group__1__Impl rule__FetchDataExpression__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__FetchDataExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchDataExpression__Group__2();

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
    // $ANTLR end "rule__FetchDataExpression__Group__1"


    // $ANTLR start "rule__FetchDataExpression__Group__1__Impl"
    // InternalIoT.g:3492:1: rule__FetchDataExpression__Group__1__Impl : ( ( rule__FetchDataExpression__DurationAssignment_1 ) ) ;
    public final void rule__FetchDataExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3496:1: ( ( ( rule__FetchDataExpression__DurationAssignment_1 ) ) )
            // InternalIoT.g:3497:1: ( ( rule__FetchDataExpression__DurationAssignment_1 ) )
            {
            // InternalIoT.g:3497:1: ( ( rule__FetchDataExpression__DurationAssignment_1 ) )
            // InternalIoT.g:3498:2: ( rule__FetchDataExpression__DurationAssignment_1 )
            {
             before(grammarAccess.getFetchDataExpressionAccess().getDurationAssignment_1()); 
            // InternalIoT.g:3499:2: ( rule__FetchDataExpression__DurationAssignment_1 )
            // InternalIoT.g:3499:3: rule__FetchDataExpression__DurationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataExpression__DurationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataExpressionAccess().getDurationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataExpression__Group__1__Impl"


    // $ANTLR start "rule__FetchDataExpression__Group__2"
    // InternalIoT.g:3507:1: rule__FetchDataExpression__Group__2 : rule__FetchDataExpression__Group__2__Impl ;
    public final void rule__FetchDataExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3511:1: ( rule__FetchDataExpression__Group__2__Impl )
            // InternalIoT.g:3512:2: rule__FetchDataExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataExpression__Group__2__Impl();

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
    // $ANTLR end "rule__FetchDataExpression__Group__2"


    // $ANTLR start "rule__FetchDataExpression__Group__2__Impl"
    // InternalIoT.g:3518:1: rule__FetchDataExpression__Group__2__Impl : ( ( rule__FetchDataExpression__TimeUnitAssignment_2 ) ) ;
    public final void rule__FetchDataExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3522:1: ( ( ( rule__FetchDataExpression__TimeUnitAssignment_2 ) ) )
            // InternalIoT.g:3523:1: ( ( rule__FetchDataExpression__TimeUnitAssignment_2 ) )
            {
            // InternalIoT.g:3523:1: ( ( rule__FetchDataExpression__TimeUnitAssignment_2 ) )
            // InternalIoT.g:3524:2: ( rule__FetchDataExpression__TimeUnitAssignment_2 )
            {
             before(grammarAccess.getFetchDataExpressionAccess().getTimeUnitAssignment_2()); 
            // InternalIoT.g:3525:2: ( rule__FetchDataExpression__TimeUnitAssignment_2 )
            // InternalIoT.g:3525:3: rule__FetchDataExpression__TimeUnitAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataExpression__TimeUnitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataExpressionAccess().getTimeUnitAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataExpression__Group__2__Impl"


    // $ANTLR start "rule__FetchDataCondition__Group__0"
    // InternalIoT.g:3534:1: rule__FetchDataCondition__Group__0 : rule__FetchDataCondition__Group__0__Impl rule__FetchDataCondition__Group__1 ;
    public final void rule__FetchDataCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3538:1: ( rule__FetchDataCondition__Group__0__Impl rule__FetchDataCondition__Group__1 )
            // InternalIoT.g:3539:2: rule__FetchDataCondition__Group__0__Impl rule__FetchDataCondition__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__FetchDataCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchDataCondition__Group__1();

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
    // $ANTLR end "rule__FetchDataCondition__Group__0"


    // $ANTLR start "rule__FetchDataCondition__Group__0__Impl"
    // InternalIoT.g:3546:1: rule__FetchDataCondition__Group__0__Impl : ( ( rule__FetchDataCondition__Alternatives_0 ) ) ;
    public final void rule__FetchDataCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3550:1: ( ( ( rule__FetchDataCondition__Alternatives_0 ) ) )
            // InternalIoT.g:3551:1: ( ( rule__FetchDataCondition__Alternatives_0 ) )
            {
            // InternalIoT.g:3551:1: ( ( rule__FetchDataCondition__Alternatives_0 ) )
            // InternalIoT.g:3552:2: ( rule__FetchDataCondition__Alternatives_0 )
            {
             before(grammarAccess.getFetchDataConditionAccess().getAlternatives_0()); 
            // InternalIoT.g:3553:2: ( rule__FetchDataCondition__Alternatives_0 )
            // InternalIoT.g:3553:3: rule__FetchDataCondition__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataCondition__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataConditionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataCondition__Group__0__Impl"


    // $ANTLR start "rule__FetchDataCondition__Group__1"
    // InternalIoT.g:3561:1: rule__FetchDataCondition__Group__1 : rule__FetchDataCondition__Group__1__Impl ;
    public final void rule__FetchDataCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3565:1: ( rule__FetchDataCondition__Group__1__Impl )
            // InternalIoT.g:3566:2: rule__FetchDataCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataCondition__Group__1__Impl();

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
    // $ANTLR end "rule__FetchDataCondition__Group__1"


    // $ANTLR start "rule__FetchDataCondition__Group__1__Impl"
    // InternalIoT.g:3572:1: rule__FetchDataCondition__Group__1__Impl : ( ( rule__FetchDataCondition__ConditionAssignment_1 ) ) ;
    public final void rule__FetchDataCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3576:1: ( ( ( rule__FetchDataCondition__ConditionAssignment_1 ) ) )
            // InternalIoT.g:3577:1: ( ( rule__FetchDataCondition__ConditionAssignment_1 ) )
            {
            // InternalIoT.g:3577:1: ( ( rule__FetchDataCondition__ConditionAssignment_1 ) )
            // InternalIoT.g:3578:2: ( rule__FetchDataCondition__ConditionAssignment_1 )
            {
             before(grammarAccess.getFetchDataConditionAccess().getConditionAssignment_1()); 
            // InternalIoT.g:3579:2: ( rule__FetchDataCondition__ConditionAssignment_1 )
            // InternalIoT.g:3579:3: rule__FetchDataCondition__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataCondition__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataConditionAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataCondition__Group__1__Impl"


    // $ANTLR start "rule__Portnumber__Group__0"
    // InternalIoT.g:3588:1: rule__Portnumber__Group__0 : rule__Portnumber__Group__0__Impl rule__Portnumber__Group__1 ;
    public final void rule__Portnumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3592:1: ( rule__Portnumber__Group__0__Impl rule__Portnumber__Group__1 )
            // InternalIoT.g:3593:2: rule__Portnumber__Group__0__Impl rule__Portnumber__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Portnumber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Portnumber__Group__1();

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
    // $ANTLR end "rule__Portnumber__Group__0"


    // $ANTLR start "rule__Portnumber__Group__0__Impl"
    // InternalIoT.g:3600:1: rule__Portnumber__Group__0__Impl : ( () ) ;
    public final void rule__Portnumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3604:1: ( ( () ) )
            // InternalIoT.g:3605:1: ( () )
            {
            // InternalIoT.g:3605:1: ( () )
            // InternalIoT.g:3606:2: ()
            {
             before(grammarAccess.getPortnumberAccess().getPortnumberAction_0()); 
            // InternalIoT.g:3607:2: ()
            // InternalIoT.g:3607:3: 
            {
            }

             after(grammarAccess.getPortnumberAccess().getPortnumberAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Portnumber__Group__0__Impl"


    // $ANTLR start "rule__Portnumber__Group__1"
    // InternalIoT.g:3615:1: rule__Portnumber__Group__1 : rule__Portnumber__Group__1__Impl ;
    public final void rule__Portnumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3619:1: ( rule__Portnumber__Group__1__Impl )
            // InternalIoT.g:3620:2: rule__Portnumber__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Portnumber__Group__1__Impl();

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
    // $ANTLR end "rule__Portnumber__Group__1"


    // $ANTLR start "rule__Portnumber__Group__1__Impl"
    // InternalIoT.g:3626:1: rule__Portnumber__Group__1__Impl : ( ( rule__Portnumber__NumberAssignment_1 ) ) ;
    public final void rule__Portnumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3630:1: ( ( ( rule__Portnumber__NumberAssignment_1 ) ) )
            // InternalIoT.g:3631:1: ( ( rule__Portnumber__NumberAssignment_1 ) )
            {
            // InternalIoT.g:3631:1: ( ( rule__Portnumber__NumberAssignment_1 ) )
            // InternalIoT.g:3632:2: ( rule__Portnumber__NumberAssignment_1 )
            {
             before(grammarAccess.getPortnumberAccess().getNumberAssignment_1()); 
            // InternalIoT.g:3633:2: ( rule__Portnumber__NumberAssignment_1 )
            // InternalIoT.g:3633:3: rule__Portnumber__NumberAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Portnumber__NumberAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPortnumberAccess().getNumberAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Portnumber__Group__1__Impl"


    // $ANTLR start "rule__System__SystemAssignment"
    // InternalIoT.g:3642:1: rule__System__SystemAssignment : ( ( rule__System__SystemAlternatives_0 ) ) ;
    public final void rule__System__SystemAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3646:1: ( ( ( rule__System__SystemAlternatives_0 ) ) )
            // InternalIoT.g:3647:2: ( ( rule__System__SystemAlternatives_0 ) )
            {
            // InternalIoT.g:3647:2: ( ( rule__System__SystemAlternatives_0 ) )
            // InternalIoT.g:3648:3: ( rule__System__SystemAlternatives_0 )
            {
             before(grammarAccess.getSystemAccess().getSystemAlternatives_0()); 
            // InternalIoT.g:3649:3: ( rule__System__SystemAlternatives_0 )
            // InternalIoT.g:3649:4: rule__System__SystemAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__System__SystemAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getSystemAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__SystemAssignment"


    // $ANTLR start "rule__SensorType__NameAssignment"
    // InternalIoT.g:3657:1: rule__SensorType__NameAssignment : ( RULE_ID ) ;
    public final void rule__SensorType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3661:1: ( ( RULE_ID ) )
            // InternalIoT.g:3662:2: ( RULE_ID )
            {
            // InternalIoT.g:3662:2: ( RULE_ID )
            // InternalIoT.g:3663:3: RULE_ID
            {
             before(grammarAccess.getSensorTypeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorTypeAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorType__NameAssignment"


    // $ANTLR start "rule__SensorTypes__TypesAssignment_1"
    // InternalIoT.g:3672:1: rule__SensorTypes__TypesAssignment_1 : ( ruleSensorType ) ;
    public final void rule__SensorTypes__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3676:1: ( ( ruleSensorType ) )
            // InternalIoT.g:3677:2: ( ruleSensorType )
            {
            // InternalIoT.g:3677:2: ( ruleSensorType )
            // InternalIoT.g:3678:3: ruleSensorType
            {
             before(grammarAccess.getSensorTypesAccess().getTypesSensorTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorType();

            state._fsp--;

             after(grammarAccess.getSensorTypesAccess().getTypesSensorTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTypes__TypesAssignment_1"


    // $ANTLR start "rule__SensorTypes__TypesAssignment_2_1"
    // InternalIoT.g:3687:1: rule__SensorTypes__TypesAssignment_2_1 : ( ruleSensorType ) ;
    public final void rule__SensorTypes__TypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3691:1: ( ( ruleSensorType ) )
            // InternalIoT.g:3692:2: ( ruleSensorType )
            {
            // InternalIoT.g:3692:2: ( ruleSensorType )
            // InternalIoT.g:3693:3: ruleSensorType
            {
             before(grammarAccess.getSensorTypesAccess().getTypesSensorTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorType();

            state._fsp--;

             after(grammarAccess.getSensorTypesAccess().getTypesSensorTypeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTypes__TypesAssignment_2_1"


    // $ANTLR start "rule__Sensor__NameAssignment_1"
    // InternalIoT.g:3702:1: rule__Sensor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3706:1: ( ( RULE_ID ) )
            // InternalIoT.g:3707:2: ( RULE_ID )
            {
            // InternalIoT.g:3707:2: ( RULE_ID )
            // InternalIoT.g:3708:3: RULE_ID
            {
             before(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__NameAssignment_1"


    // $ANTLR start "rule__Sensor__TypeAssignment_4"
    // InternalIoT.g:3717:1: rule__Sensor__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Sensor__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3721:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:3722:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:3722:2: ( ( RULE_ID ) )
            // InternalIoT.g:3723:3: ( RULE_ID )
            {
             before(grammarAccess.getSensorAccess().getTypeSensorTypeCrossReference_4_0()); 
            // InternalIoT.g:3724:3: ( RULE_ID )
            // InternalIoT.g:3725:4: RULE_ID
            {
             before(grammarAccess.getSensorAccess().getTypeSensorTypeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getTypeSensorTypeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSensorAccess().getTypeSensorTypeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__TypeAssignment_4"


    // $ANTLR start "rule__SensorGroup__NameAssignment_1"
    // InternalIoT.g:3736:1: rule__SensorGroup__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SensorGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3740:1: ( ( RULE_ID ) )
            // InternalIoT.g:3741:2: ( RULE_ID )
            {
            // InternalIoT.g:3741:2: ( RULE_ID )
            // InternalIoT.g:3742:3: RULE_ID
            {
             before(grammarAccess.getSensorGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorGroupAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__NameAssignment_1"


    // $ANTLR start "rule__SensorGroup__SensorsAssignment_4"
    // InternalIoT.g:3751:1: rule__SensorGroup__SensorsAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__SensorGroup__SensorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3755:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:3756:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:3756:2: ( ( RULE_ID ) )
            // InternalIoT.g:3757:3: ( RULE_ID )
            {
             before(grammarAccess.getSensorGroupAccess().getSensorsSensorCrossReference_4_0()); 
            // InternalIoT.g:3758:3: ( RULE_ID )
            // InternalIoT.g:3759:4: RULE_ID
            {
             before(grammarAccess.getSensorGroupAccess().getSensorsSensorIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorGroupAccess().getSensorsSensorIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSensorGroupAccess().getSensorsSensorCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__SensorsAssignment_4"


    // $ANTLR start "rule__SensorGroup__SensorsAssignment_5_1"
    // InternalIoT.g:3770:1: rule__SensorGroup__SensorsAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__SensorGroup__SensorsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3774:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:3775:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:3775:2: ( ( RULE_ID ) )
            // InternalIoT.g:3776:3: ( RULE_ID )
            {
             before(grammarAccess.getSensorGroupAccess().getSensorsSensorCrossReference_5_1_0()); 
            // InternalIoT.g:3777:3: ( RULE_ID )
            // InternalIoT.g:3778:4: RULE_ID
            {
             before(grammarAccess.getSensorGroupAccess().getSensorsSensorIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorGroupAccess().getSensorsSensorIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getSensorGroupAccess().getSensorsSensorCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__SensorsAssignment_5_1"


    // $ANTLR start "rule__SensorGetMethod__MethodAssignment_1"
    // InternalIoT.g:3789:1: rule__SensorGetMethod__MethodAssignment_1 : ( ruleMethod ) ;
    public final void rule__SensorGetMethod__MethodAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3793:1: ( ( ruleMethod ) )
            // InternalIoT.g:3794:2: ( ruleMethod )
            {
            // InternalIoT.g:3794:2: ( ruleMethod )
            // InternalIoT.g:3795:3: ruleMethod
            {
             before(grammarAccess.getSensorGetMethodAccess().getMethodMethodParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getSensorGetMethodAccess().getMethodMethodParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGetMethod__MethodAssignment_1"


    // $ANTLR start "rule__SensorGetMethod__TypeAssignment_4"
    // InternalIoT.g:3804:1: rule__SensorGetMethod__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__SensorGetMethod__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3808:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:3809:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:3809:2: ( ( RULE_ID ) )
            // InternalIoT.g:3810:3: ( RULE_ID )
            {
             before(grammarAccess.getSensorGetMethodAccess().getTypeSensorTypeCrossReference_4_0()); 
            // InternalIoT.g:3811:3: ( RULE_ID )
            // InternalIoT.g:3812:4: RULE_ID
            {
             before(grammarAccess.getSensorGetMethodAccess().getTypeSensorTypeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorGetMethodAccess().getTypeSensorTypeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSensorGetMethodAccess().getTypeSensorTypeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGetMethod__TypeAssignment_4"


    // $ANTLR start "rule__Method__NameAssignment_0"
    // InternalIoT.g:3823:1: rule__Method__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3827:1: ( ( RULE_ID ) )
            // InternalIoT.g:3828:2: ( RULE_ID )
            {
            // InternalIoT.g:3828:2: ( RULE_ID )
            // InternalIoT.g:3829:3: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_0"


    // $ANTLR start "rule__Method__ParametersAssignment_2"
    // InternalIoT.g:3838:1: rule__Method__ParametersAssignment_2 : ( RULE_ID ) ;
    public final void rule__Method__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3842:1: ( ( RULE_ID ) )
            // InternalIoT.g:3843:2: ( RULE_ID )
            {
            // InternalIoT.g:3843:2: ( RULE_ID )
            // InternalIoT.g:3844:3: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getParametersIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getParametersIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParametersAssignment_2"


    // $ANTLR start "rule__Method__ParametersAssignment_3_1"
    // InternalIoT.g:3853:1: rule__Method__ParametersAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Method__ParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3857:1: ( ( RULE_ID ) )
            // InternalIoT.g:3858:2: ( RULE_ID )
            {
            // InternalIoT.g:3858:2: ( RULE_ID )
            // InternalIoT.g:3859:3: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getParametersIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getParametersIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParametersAssignment_3_1"


    // $ANTLR start "rule__DeviceType__NameAssignment"
    // InternalIoT.g:3868:1: rule__DeviceType__NameAssignment : ( RULE_ID ) ;
    public final void rule__DeviceType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3872:1: ( ( RULE_ID ) )
            // InternalIoT.g:3873:2: ( RULE_ID )
            {
            // InternalIoT.g:3873:2: ( RULE_ID )
            // InternalIoT.g:3874:3: RULE_ID
            {
             before(grammarAccess.getDeviceTypeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeviceTypeAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__NameAssignment"


    // $ANTLR start "rule__DeviceTypes__TypesAssignment_1"
    // InternalIoT.g:3883:1: rule__DeviceTypes__TypesAssignment_1 : ( ruleDeviceType ) ;
    public final void rule__DeviceTypes__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3887:1: ( ( ruleDeviceType ) )
            // InternalIoT.g:3888:2: ( ruleDeviceType )
            {
            // InternalIoT.g:3888:2: ( ruleDeviceType )
            // InternalIoT.g:3889:3: ruleDeviceType
            {
             before(grammarAccess.getDeviceTypesAccess().getTypesDeviceTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeviceType();

            state._fsp--;

             after(grammarAccess.getDeviceTypesAccess().getTypesDeviceTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceTypes__TypesAssignment_1"


    // $ANTLR start "rule__DeviceTypes__TypesAssignment_2_1"
    // InternalIoT.g:3898:1: rule__DeviceTypes__TypesAssignment_2_1 : ( ruleDeviceType ) ;
    public final void rule__DeviceTypes__TypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3902:1: ( ( ruleDeviceType ) )
            // InternalIoT.g:3903:2: ( ruleDeviceType )
            {
            // InternalIoT.g:3903:2: ( ruleDeviceType )
            // InternalIoT.g:3904:3: ruleDeviceType
            {
             before(grammarAccess.getDeviceTypesAccess().getTypesDeviceTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeviceType();

            state._fsp--;

             after(grammarAccess.getDeviceTypesAccess().getTypesDeviceTypeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceTypes__TypesAssignment_2_1"


    // $ANTLR start "rule__Device__TypeAssignment_2"
    // InternalIoT.g:3913:1: rule__Device__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Device__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3917:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:3918:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:3918:2: ( ( RULE_ID ) )
            // InternalIoT.g:3919:3: ( RULE_ID )
            {
             before(grammarAccess.getDeviceAccess().getTypeDeviceTypeCrossReference_2_0()); 
            // InternalIoT.g:3920:3: ( RULE_ID )
            // InternalIoT.g:3921:4: RULE_ID
            {
             before(grammarAccess.getDeviceAccess().getTypeDeviceTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getTypeDeviceTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDeviceAccess().getTypeDeviceTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__TypeAssignment_2"


    // $ANTLR start "rule__Device__GroupAssignment_4"
    // InternalIoT.g:3932:1: rule__Device__GroupAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Device__GroupAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3936:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:3937:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:3937:2: ( ( RULE_ID ) )
            // InternalIoT.g:3938:3: ( RULE_ID )
            {
             before(grammarAccess.getDeviceAccess().getGroupSensorGroupCrossReference_4_0()); 
            // InternalIoT.g:3939:3: ( RULE_ID )
            // InternalIoT.g:3940:4: RULE_ID
            {
             before(grammarAccess.getDeviceAccess().getGroupSensorGroupIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getGroupSensorGroupIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDeviceAccess().getGroupSensorGroupCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__GroupAssignment_4"


    // $ANTLR start "rule__DeviceGroup__NameAssignment_1"
    // InternalIoT.g:3951:1: rule__DeviceGroup__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DeviceGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3955:1: ( ( RULE_ID ) )
            // InternalIoT.g:3956:2: ( RULE_ID )
            {
            // InternalIoT.g:3956:2: ( RULE_ID )
            // InternalIoT.g:3957:3: RULE_ID
            {
             before(grammarAccess.getDeviceGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeviceGroupAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceGroup__NameAssignment_1"


    // $ANTLR start "rule__DeviceGroup__DevicesAssignment_4"
    // InternalIoT.g:3966:1: rule__DeviceGroup__DevicesAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__DeviceGroup__DevicesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3970:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:3971:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:3971:2: ( ( RULE_ID ) )
            // InternalIoT.g:3972:3: ( RULE_ID )
            {
             before(grammarAccess.getDeviceGroupAccess().getDevicesDeviceCrossReference_4_0()); 
            // InternalIoT.g:3973:3: ( RULE_ID )
            // InternalIoT.g:3974:4: RULE_ID
            {
             before(grammarAccess.getDeviceGroupAccess().getDevicesDeviceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeviceGroupAccess().getDevicesDeviceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDeviceGroupAccess().getDevicesDeviceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceGroup__DevicesAssignment_4"


    // $ANTLR start "rule__DeviceGroup__DevicesAssignment_5_1"
    // InternalIoT.g:3985:1: rule__DeviceGroup__DevicesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__DeviceGroup__DevicesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3989:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:3990:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:3990:2: ( ( RULE_ID ) )
            // InternalIoT.g:3991:3: ( RULE_ID )
            {
             before(grammarAccess.getDeviceGroupAccess().getDevicesDeviceCrossReference_5_1_0()); 
            // InternalIoT.g:3992:3: ( RULE_ID )
            // InternalIoT.g:3993:4: RULE_ID
            {
             before(grammarAccess.getDeviceGroupAccess().getDevicesDeviceIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeviceGroupAccess().getDevicesDeviceIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getDeviceGroupAccess().getDevicesDeviceCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceGroup__DevicesAssignment_5_1"


    // $ANTLR start "rule__ServerType__NameAssignment"
    // InternalIoT.g:4004:1: rule__ServerType__NameAssignment : ( RULE_ID ) ;
    public final void rule__ServerType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4008:1: ( ( RULE_ID ) )
            // InternalIoT.g:4009:2: ( RULE_ID )
            {
            // InternalIoT.g:4009:2: ( RULE_ID )
            // InternalIoT.g:4010:3: RULE_ID
            {
             before(grammarAccess.getServerTypeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServerTypeAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerType__NameAssignment"


    // $ANTLR start "rule__ServerTypes__TypesAssignment_1"
    // InternalIoT.g:4019:1: rule__ServerTypes__TypesAssignment_1 : ( ruleServerType ) ;
    public final void rule__ServerTypes__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4023:1: ( ( ruleServerType ) )
            // InternalIoT.g:4024:2: ( ruleServerType )
            {
            // InternalIoT.g:4024:2: ( ruleServerType )
            // InternalIoT.g:4025:3: ruleServerType
            {
             before(grammarAccess.getServerTypesAccess().getTypesServerTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleServerType();

            state._fsp--;

             after(grammarAccess.getServerTypesAccess().getTypesServerTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerTypes__TypesAssignment_1"


    // $ANTLR start "rule__ServerTypes__TypesAssignment_2_1"
    // InternalIoT.g:4034:1: rule__ServerTypes__TypesAssignment_2_1 : ( ruleServerType ) ;
    public final void rule__ServerTypes__TypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4038:1: ( ( ruleServerType ) )
            // InternalIoT.g:4039:2: ( ruleServerType )
            {
            // InternalIoT.g:4039:2: ( ruleServerType )
            // InternalIoT.g:4040:3: ruleServerType
            {
             before(grammarAccess.getServerTypesAccess().getTypesServerTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleServerType();

            state._fsp--;

             after(grammarAccess.getServerTypesAccess().getTypesServerTypeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerTypes__TypesAssignment_2_1"


    // $ANTLR start "rule__ServerFromType__NameAssignment_1"
    // InternalIoT.g:4049:1: rule__ServerFromType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServerFromType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4053:1: ( ( RULE_ID ) )
            // InternalIoT.g:4054:2: ( RULE_ID )
            {
            // InternalIoT.g:4054:2: ( RULE_ID )
            // InternalIoT.g:4055:3: RULE_ID
            {
             before(grammarAccess.getServerFromTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServerFromTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerFromType__NameAssignment_1"


    // $ANTLR start "rule__ServerFromType__TypeAssignment_3"
    // InternalIoT.g:4064:1: rule__ServerFromType__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ServerFromType__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4068:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:4069:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:4069:2: ( ( RULE_ID ) )
            // InternalIoT.g:4070:3: ( RULE_ID )
            {
             before(grammarAccess.getServerFromTypeAccess().getTypeServerTypeCrossReference_3_0()); 
            // InternalIoT.g:4071:3: ( RULE_ID )
            // InternalIoT.g:4072:4: RULE_ID
            {
             before(grammarAccess.getServerFromTypeAccess().getTypeServerTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServerFromTypeAccess().getTypeServerTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getServerFromTypeAccess().getTypeServerTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerFromType__TypeAssignment_3"


    // $ANTLR start "rule__Server__NameAssignment_1"
    // InternalIoT.g:4083:1: rule__Server__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Server__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4087:1: ( ( RULE_ID ) )
            // InternalIoT.g:4088:2: ( RULE_ID )
            {
            // InternalIoT.g:4088:2: ( RULE_ID )
            // InternalIoT.g:4089:3: RULE_ID
            {
             before(grammarAccess.getServerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__NameAssignment_1"


    // $ANTLR start "rule__Server__LipAssignment_5"
    // InternalIoT.g:4098:1: rule__Server__LipAssignment_5 : ( rulePortnumber ) ;
    public final void rule__Server__LipAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4102:1: ( ( rulePortnumber ) )
            // InternalIoT.g:4103:2: ( rulePortnumber )
            {
            // InternalIoT.g:4103:2: ( rulePortnumber )
            // InternalIoT.g:4104:3: rulePortnumber
            {
             before(grammarAccess.getServerAccess().getLipPortnumberParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePortnumber();

            state._fsp--;

             after(grammarAccess.getServerAccess().getLipPortnumberParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__LipAssignment_5"


    // $ANTLR start "rule__Server__SipAssignment_9"
    // InternalIoT.g:4113:1: rule__Server__SipAssignment_9 : ( rulePortnumber ) ;
    public final void rule__Server__SipAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4117:1: ( ( rulePortnumber ) )
            // InternalIoT.g:4118:2: ( rulePortnumber )
            {
            // InternalIoT.g:4118:2: ( rulePortnumber )
            // InternalIoT.g:4119:3: rulePortnumber
            {
             before(grammarAccess.getServerAccess().getSipPortnumberParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            rulePortnumber();

            state._fsp--;

             after(grammarAccess.getServerAccess().getSipPortnumberParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__SipAssignment_9"


    // $ANTLR start "rule__Server__GroupAssignment_11"
    // InternalIoT.g:4128:1: rule__Server__GroupAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__Server__GroupAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4132:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:4133:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:4133:2: ( ( RULE_ID ) )
            // InternalIoT.g:4134:3: ( RULE_ID )
            {
             before(grammarAccess.getServerAccess().getGroupDeviceGroupCrossReference_11_0()); 
            // InternalIoT.g:4135:3: ( RULE_ID )
            // InternalIoT.g:4136:4: RULE_ID
            {
             before(grammarAccess.getServerAccess().getGroupDeviceGroupIDTerminalRuleCall_11_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServerAccess().getGroupDeviceGroupIDTerminalRuleCall_11_0_1()); 

            }

             after(grammarAccess.getServerAccess().getGroupDeviceGroupCrossReference_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__GroupAssignment_11"


    // $ANTLR start "rule__DestinationType__NameAssignment"
    // InternalIoT.g:4147:1: rule__DestinationType__NameAssignment : ( RULE_ID ) ;
    public final void rule__DestinationType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4151:1: ( ( RULE_ID ) )
            // InternalIoT.g:4152:2: ( RULE_ID )
            {
            // InternalIoT.g:4152:2: ( RULE_ID )
            // InternalIoT.g:4153:3: RULE_ID
            {
             before(grammarAccess.getDestinationTypeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDestinationTypeAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestinationType__NameAssignment"


    // $ANTLR start "rule__DestinationTypes__TypesAssignment_1"
    // InternalIoT.g:4162:1: rule__DestinationTypes__TypesAssignment_1 : ( ruleDestinationType ) ;
    public final void rule__DestinationTypes__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4166:1: ( ( ruleDestinationType ) )
            // InternalIoT.g:4167:2: ( ruleDestinationType )
            {
            // InternalIoT.g:4167:2: ( ruleDestinationType )
            // InternalIoT.g:4168:3: ruleDestinationType
            {
             before(grammarAccess.getDestinationTypesAccess().getTypesDestinationTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDestinationType();

            state._fsp--;

             after(grammarAccess.getDestinationTypesAccess().getTypesDestinationTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestinationTypes__TypesAssignment_1"


    // $ANTLR start "rule__DestinationTypes__TypesAssignment_2_1"
    // InternalIoT.g:4177:1: rule__DestinationTypes__TypesAssignment_2_1 : ( ruleDestinationType ) ;
    public final void rule__DestinationTypes__TypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4181:1: ( ( ruleDestinationType ) )
            // InternalIoT.g:4182:2: ( ruleDestinationType )
            {
            // InternalIoT.g:4182:2: ( ruleDestinationType )
            // InternalIoT.g:4183:3: ruleDestinationType
            {
             before(grammarAccess.getDestinationTypesAccess().getTypesDestinationTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDestinationType();

            state._fsp--;

             after(grammarAccess.getDestinationTypesAccess().getTypesDestinationTypeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestinationTypes__TypesAssignment_2_1"


    // $ANTLR start "rule__Destination__NameAssignment_1"
    // InternalIoT.g:4192:1: rule__Destination__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Destination__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4196:1: ( ( RULE_ID ) )
            // InternalIoT.g:4197:2: ( RULE_ID )
            {
            // InternalIoT.g:4197:2: ( RULE_ID )
            // InternalIoT.g:4198:3: RULE_ID
            {
             before(grammarAccess.getDestinationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDestinationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__NameAssignment_1"


    // $ANTLR start "rule__Destination__TypeAssignment_3"
    // InternalIoT.g:4207:1: rule__Destination__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Destination__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4211:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:4212:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:4212:2: ( ( RULE_ID ) )
            // InternalIoT.g:4213:3: ( RULE_ID )
            {
             before(grammarAccess.getDestinationAccess().getTypeDestinationTypeCrossReference_3_0()); 
            // InternalIoT.g:4214:3: ( RULE_ID )
            // InternalIoT.g:4215:4: RULE_ID
            {
             before(grammarAccess.getDestinationAccess().getTypeDestinationTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDestinationAccess().getTypeDestinationTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDestinationAccess().getTypeDestinationTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__TypeAssignment_3"


    // $ANTLR start "rule__FetchData__FilterAssignment_3_0_1"
    // InternalIoT.g:4226:1: rule__FetchData__FilterAssignment_3_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__FetchData__FilterAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4230:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:4231:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:4231:2: ( ( RULE_ID ) )
            // InternalIoT.g:4232:3: ( RULE_ID )
            {
             before(grammarAccess.getFetchDataAccess().getFilterSensorTypeCrossReference_3_0_1_0()); 
            // InternalIoT.g:4233:3: ( RULE_ID )
            // InternalIoT.g:4234:4: RULE_ID
            {
             before(grammarAccess.getFetchDataAccess().getFilterSensorTypeIDTerminalRuleCall_3_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getFilterSensorTypeIDTerminalRuleCall_3_0_1_0_1()); 

            }

             after(grammarAccess.getFetchDataAccess().getFilterSensorTypeCrossReference_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__FilterAssignment_3_0_1"


    // $ANTLR start "rule__FetchData__FilterAssignment_3_1_1"
    // InternalIoT.g:4245:1: rule__FetchData__FilterAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__FetchData__FilterAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4249:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:4250:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:4250:2: ( ( RULE_ID ) )
            // InternalIoT.g:4251:3: ( RULE_ID )
            {
             before(grammarAccess.getFetchDataAccess().getFilterSensorGroupCrossReference_3_1_1_0()); 
            // InternalIoT.g:4252:3: ( RULE_ID )
            // InternalIoT.g:4253:4: RULE_ID
            {
             before(grammarAccess.getFetchDataAccess().getFilterSensorGroupIDTerminalRuleCall_3_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getFilterSensorGroupIDTerminalRuleCall_3_1_1_0_1()); 

            }

             after(grammarAccess.getFetchDataAccess().getFilterSensorGroupCrossReference_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__FilterAssignment_3_1_1"


    // $ANTLR start "rule__FetchData__DestinationAssignment_5_0_1"
    // InternalIoT.g:4264:1: rule__FetchData__DestinationAssignment_5_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__FetchData__DestinationAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4268:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:4269:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:4269:2: ( ( RULE_ID ) )
            // InternalIoT.g:4270:3: ( RULE_ID )
            {
             before(grammarAccess.getFetchDataAccess().getDestinationDestinationCrossReference_5_0_1_0()); 
            // InternalIoT.g:4271:3: ( RULE_ID )
            // InternalIoT.g:4272:4: RULE_ID
            {
             before(grammarAccess.getFetchDataAccess().getDestinationDestinationIDTerminalRuleCall_5_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getDestinationDestinationIDTerminalRuleCall_5_0_1_0_1()); 

            }

             after(grammarAccess.getFetchDataAccess().getDestinationDestinationCrossReference_5_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__DestinationAssignment_5_0_1"


    // $ANTLR start "rule__FetchData__DestinationAssignment_5_1_1"
    // InternalIoT.g:4283:1: rule__FetchData__DestinationAssignment_5_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__FetchData__DestinationAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4287:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:4288:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:4288:2: ( ( RULE_ID ) )
            // InternalIoT.g:4289:3: ( RULE_ID )
            {
             before(grammarAccess.getFetchDataAccess().getDestinationServerCrossReference_5_1_1_0()); 
            // InternalIoT.g:4290:3: ( RULE_ID )
            // InternalIoT.g:4291:4: RULE_ID
            {
             before(grammarAccess.getFetchDataAccess().getDestinationServerIDTerminalRuleCall_5_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getDestinationServerIDTerminalRuleCall_5_1_1_0_1()); 

            }

             after(grammarAccess.getFetchDataAccess().getDestinationServerCrossReference_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__DestinationAssignment_5_1_1"


    // $ANTLR start "rule__FetchData__ConExpAssignment_6_0"
    // InternalIoT.g:4302:1: rule__FetchData__ConExpAssignment_6_0 : ( ruleFetchDataExpression ) ;
    public final void rule__FetchData__ConExpAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4306:1: ( ( ruleFetchDataExpression ) )
            // InternalIoT.g:4307:2: ( ruleFetchDataExpression )
            {
            // InternalIoT.g:4307:2: ( ruleFetchDataExpression )
            // InternalIoT.g:4308:3: ruleFetchDataExpression
            {
             before(grammarAccess.getFetchDataAccess().getConExpFetchDataExpressionParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFetchDataExpression();

            state._fsp--;

             after(grammarAccess.getFetchDataAccess().getConExpFetchDataExpressionParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__ConExpAssignment_6_0"


    // $ANTLR start "rule__FetchData__ConExpAssignment_6_1"
    // InternalIoT.g:4317:1: rule__FetchData__ConExpAssignment_6_1 : ( ruleFetchDataCondition ) ;
    public final void rule__FetchData__ConExpAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4321:1: ( ( ruleFetchDataCondition ) )
            // InternalIoT.g:4322:2: ( ruleFetchDataCondition )
            {
            // InternalIoT.g:4322:2: ( ruleFetchDataCondition )
            // InternalIoT.g:4323:3: ruleFetchDataCondition
            {
             before(grammarAccess.getFetchDataAccess().getConExpFetchDataConditionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFetchDataCondition();

            state._fsp--;

             after(grammarAccess.getFetchDataAccess().getConExpFetchDataConditionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__ConExpAssignment_6_1"


    // $ANTLR start "rule__FetchDataExpression__DurationAssignment_1"
    // InternalIoT.g:4332:1: rule__FetchDataExpression__DurationAssignment_1 : ( ruleTime ) ;
    public final void rule__FetchDataExpression__DurationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4336:1: ( ( ruleTime ) )
            // InternalIoT.g:4337:2: ( ruleTime )
            {
            // InternalIoT.g:4337:2: ( ruleTime )
            // InternalIoT.g:4338:3: ruleTime
            {
             before(grammarAccess.getFetchDataExpressionAccess().getDurationTimeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getFetchDataExpressionAccess().getDurationTimeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataExpression__DurationAssignment_1"


    // $ANTLR start "rule__FetchDataExpression__TimeUnitAssignment_2"
    // InternalIoT.g:4347:1: rule__FetchDataExpression__TimeUnitAssignment_2 : ( ruleTimeUnit ) ;
    public final void rule__FetchDataExpression__TimeUnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4351:1: ( ( ruleTimeUnit ) )
            // InternalIoT.g:4352:2: ( ruleTimeUnit )
            {
            // InternalIoT.g:4352:2: ( ruleTimeUnit )
            // InternalIoT.g:4353:3: ruleTimeUnit
            {
             before(grammarAccess.getFetchDataExpressionAccess().getTimeUnitTimeUnitParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getFetchDataExpressionAccess().getTimeUnitTimeUnitParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataExpression__TimeUnitAssignment_2"


    // $ANTLR start "rule__FetchDataCondition__ConditionAssignment_1"
    // InternalIoT.g:4362:1: rule__FetchDataCondition__ConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__FetchDataCondition__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4366:1: ( ( ruleCondition ) )
            // InternalIoT.g:4367:2: ( ruleCondition )
            {
            // InternalIoT.g:4367:2: ( ruleCondition )
            // InternalIoT.g:4368:3: ruleCondition
            {
             before(grammarAccess.getFetchDataConditionAccess().getConditionConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getFetchDataConditionAccess().getConditionConditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataCondition__ConditionAssignment_1"


    // $ANTLR start "rule__Portnumber__NumberAssignment_1"
    // InternalIoT.g:4377:1: rule__Portnumber__NumberAssignment_1 : ( RULE_NUMBER ) ;
    public final void rule__Portnumber__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4381:1: ( ( RULE_NUMBER ) )
            // InternalIoT.g:4382:2: ( RULE_NUMBER )
            {
            // InternalIoT.g:4382:2: ( RULE_NUMBER )
            // InternalIoT.g:4383:3: RULE_NUMBER
            {
             before(grammarAccess.getPortnumberAccess().getNumberNUMBERTerminalRuleCall_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_2); 
             after(grammarAccess.getPortnumberAccess().getNumberNUMBERTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Portnumber__NumberAssignment_1"


    // $ANTLR start "rule__Time__TimeAssignment"
    // InternalIoT.g:4392:1: rule__Time__TimeAssignment : ( RULE_NUMBER ) ;
    public final void rule__Time__TimeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4396:1: ( ( RULE_NUMBER ) )
            // InternalIoT.g:4397:2: ( RULE_NUMBER )
            {
            // InternalIoT.g:4397:2: ( RULE_NUMBER )
            // InternalIoT.g:4398:3: RULE_NUMBER
            {
             before(grammarAccess.getTimeAccess().getTimeNUMBERTerminalRuleCall_0()); 
            match(input,RULE_NUMBER,FOLLOW_2); 
             after(grammarAccess.getTimeAccess().getTimeNUMBERTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__TimeAssignment"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\1\23\10\uffff\1\4\3\uffff\1\26\2\uffff";
    static final String dfa_3s = "\1\54\10\uffff\1\4\3\uffff\1\46\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\13\1\14\1\15\1\uffff\1\11\1\12";
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
            "\1\16\17\uffff\1\17",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "684:1: rule__System__SystemAlternatives_0 : ( ( ruleSensorTypes ) | ( ruleSensor ) | ( ruleSensorGroup ) | ( ruleSensorGetMethod ) | ( ruleDeviceTypes ) | ( ruleDevice ) | ( ruleDeviceGroup ) | ( ruleServerTypes ) | ( ruleServerFromType ) | ( ruleServer ) | ( ruleDestinationTypes ) | ( ruleDestination ) | ( ruleFetchData ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00001C3B11280002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0008000000006000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000001000L});

}