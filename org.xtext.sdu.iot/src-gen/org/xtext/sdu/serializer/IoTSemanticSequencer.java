/*
 * generated by Xtext 2.16.0
 */
package org.xtext.sdu.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.sdu.ioT.Destination;
import org.xtext.sdu.ioT.DestinationType;
import org.xtext.sdu.ioT.DestinationTypes;
import org.xtext.sdu.ioT.Device;
import org.xtext.sdu.ioT.DeviceType;
import org.xtext.sdu.ioT.DeviceTypes;
import org.xtext.sdu.ioT.FetchData;
import org.xtext.sdu.ioT.FetchDataCondition;
import org.xtext.sdu.ioT.FetchDataExpression;
import org.xtext.sdu.ioT.IoTPackage;
import org.xtext.sdu.ioT.Ip;
import org.xtext.sdu.ioT.Method;
import org.xtext.sdu.ioT.Portnumber;
import org.xtext.sdu.ioT.Sensor;
import org.xtext.sdu.ioT.SensorGetMethod;
import org.xtext.sdu.ioT.SensorGroup;
import org.xtext.sdu.ioT.SensorType;
import org.xtext.sdu.ioT.SensorTypes;
import org.xtext.sdu.ioT.Server;
import org.xtext.sdu.ioT.ServerType;
import org.xtext.sdu.ioT.ServerTypes;
import org.xtext.sdu.ioT.Time;
import org.xtext.sdu.services.IoTGrammarAccess;

@SuppressWarnings("all")
public class IoTSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private IoTGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == IoTPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case IoTPackage.DESTINATION:
				sequence_Destination(context, (Destination) semanticObject); 
				return; 
			case IoTPackage.DESTINATION_TYPE:
				sequence_DestinationType(context, (DestinationType) semanticObject); 
				return; 
			case IoTPackage.DESTINATION_TYPES:
				sequence_DestinationTypes(context, (DestinationTypes) semanticObject); 
				return; 
			case IoTPackage.DEVICE:
				sequence_Device(context, (Device) semanticObject); 
				return; 
			case IoTPackage.DEVICE_TYPE:
				sequence_DeviceType(context, (DeviceType) semanticObject); 
				return; 
			case IoTPackage.DEVICE_TYPES:
				sequence_DeviceTypes(context, (DeviceTypes) semanticObject); 
				return; 
			case IoTPackage.FETCH_DATA:
				sequence_FetchData(context, (FetchData) semanticObject); 
				return; 
			case IoTPackage.FETCH_DATA_CONDITION:
				sequence_FetchDataCondition(context, (FetchDataCondition) semanticObject); 
				return; 
			case IoTPackage.FETCH_DATA_EXPRESSION:
				sequence_FetchDataExpression(context, (FetchDataExpression) semanticObject); 
				return; 
			case IoTPackage.IP:
				sequence_Ip(context, (Ip) semanticObject); 
				return; 
			case IoTPackage.METHOD:
				sequence_Method(context, (Method) semanticObject); 
				return; 
			case IoTPackage.PORTNUMBER:
				sequence_Portnumber(context, (Portnumber) semanticObject); 
				return; 
			case IoTPackage.SENSOR:
				sequence_Sensor(context, (Sensor) semanticObject); 
				return; 
			case IoTPackage.SENSOR_GET_METHOD:
				sequence_SensorGetMethod(context, (SensorGetMethod) semanticObject); 
				return; 
			case IoTPackage.SENSOR_GROUP:
				sequence_SensorGroup(context, (SensorGroup) semanticObject); 
				return; 
			case IoTPackage.SENSOR_TYPE:
				sequence_SensorType(context, (SensorType) semanticObject); 
				return; 
			case IoTPackage.SENSOR_TYPES:
				sequence_SensorTypes(context, (SensorTypes) semanticObject); 
				return; 
			case IoTPackage.SERVER:
				sequence_Server(context, (Server) semanticObject); 
				return; 
			case IoTPackage.SERVER_TYPE:
				sequence_ServerType(context, (ServerType) semanticObject); 
				return; 
			case IoTPackage.SERVER_TYPES:
				sequence_ServerTypes(context, (ServerTypes) semanticObject); 
				return; 
			case IoTPackage.SYSTEM:
				sequence_System(context, (org.xtext.sdu.ioT.System) semanticObject); 
				return; 
			case IoTPackage.TIME:
				sequence_Time(context, (Time) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DestinationType returns DestinationType
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DestinationType(ISerializationContext context, DestinationType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IoTPackage.Literals.DESTINATION_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IoTPackage.Literals.DESTINATION_TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDestinationTypeAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DestinationTypes returns DestinationTypes
	 *
	 * Constraint:
	 *     (types+=DestinationType types+=DestinationType*)
	 */
	protected void sequence_DestinationTypes(ISerializationContext context, DestinationTypes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Destination returns Destination
	 *
	 * Constraint:
	 *     (name=ID type=[DestinationType|ID])
	 */
	protected void sequence_Destination(ISerializationContext context, Destination semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IoTPackage.Literals.DESTINATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IoTPackage.Literals.DESTINATION__NAME));
			if (transientValues.isValueTransient(semanticObject, IoTPackage.Literals.DESTINATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IoTPackage.Literals.DESTINATION__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDestinationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDestinationAccess().getTypeDestinationTypeIDTerminalRuleCall_3_0_1(), semanticObject.eGet(IoTPackage.Literals.DESTINATION__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DeviceType returns DeviceType
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DeviceType(ISerializationContext context, DeviceType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IoTPackage.Literals.DEVICE_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IoTPackage.Literals.DEVICE_TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeviceTypeAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DeviceTypes returns DeviceTypes
	 *
	 * Constraint:
	 *     (types+=DeviceType types+=DeviceType*)
	 */
	protected void sequence_DeviceTypes(ISerializationContext context, DeviceTypes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Device returns Device
	 *
	 * Constraint:
	 *     (name=ID type=[DeviceType|ID] (devices=[Device|ID] | devices=[SensorGroup|ID]))
	 */
	protected void sequence_Device(ISerializationContext context, Device semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FetchDataCondition returns FetchDataCondition
	 *
	 * Constraint:
	 *     condition=Condition
	 */
	protected void sequence_FetchDataCondition(ISerializationContext context, FetchDataCondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IoTPackage.Literals.FETCH_DATA_CONDITION__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IoTPackage.Literals.FETCH_DATA_CONDITION__CONDITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFetchDataConditionAccess().getConditionConditionParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FetchDataExpression returns FetchDataExpression
	 *
	 * Constraint:
	 *     (duration=Time timeUnit=TimeUnit)
	 */
	protected void sequence_FetchDataExpression(ISerializationContext context, FetchDataExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IoTPackage.Literals.FETCH_DATA_EXPRESSION__DURATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IoTPackage.Literals.FETCH_DATA_EXPRESSION__DURATION));
			if (transientValues.isValueTransient(semanticObject, IoTPackage.Literals.FETCH_DATA_EXPRESSION__TIME_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IoTPackage.Literals.FETCH_DATA_EXPRESSION__TIME_UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFetchDataExpressionAccess().getDurationTimeParserRuleCall_1_0(), semanticObject.getDuration());
		feeder.accept(grammarAccess.getFetchDataExpressionAccess().getTimeUnitTimeUnitParserRuleCall_2_0(), semanticObject.getTimeUnit());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FetchData returns FetchData
	 *
	 * Constraint:
	 *     (
	 *         (filter=[SensorType|ID] | filter=[SensorGroup|ID]) 
	 *         (destination=[Destination|ID] | destination=[Server|ID]) 
	 *         (conExp=FetchDataExpression | conExp=FetchDataCondition)?
	 *     )
	 */
	protected void sequence_FetchData(ISerializationContext context, FetchData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Ip returns Ip
	 *
	 * Constraint:
	 *     (ip+=INT ip+=INT ip+=INT ip+=INT)
	 */
	protected void sequence_Ip(ISerializationContext context, Ip semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Method returns Method
	 *
	 * Constraint:
	 *     (name=ID parameters+=ID parameters+=ID*)
	 */
	protected void sequence_Method(ISerializationContext context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Portnumber returns Portnumber
	 *
	 * Constraint:
	 *     number=INT
	 */
	protected void sequence_Portnumber(ISerializationContext context, Portnumber semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IoTPackage.Literals.PORTNUMBER__NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IoTPackage.Literals.PORTNUMBER__NUMBER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPortnumberAccess().getNumberINTTerminalRuleCall_1_0(), semanticObject.getNumber());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SensorGetMethod returns SensorGetMethod
	 *
	 * Constraint:
	 *     (method=Method type=[SensorType|ID])
	 */
	protected void sequence_SensorGetMethod(ISerializationContext context, SensorGetMethod semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IoTPackage.Literals.SENSOR_GET_METHOD__METHOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IoTPackage.Literals.SENSOR_GET_METHOD__METHOD));
			if (transientValues.isValueTransient(semanticObject, IoTPackage.Literals.SENSOR_GET_METHOD__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IoTPackage.Literals.SENSOR_GET_METHOD__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSensorGetMethodAccess().getMethodMethodParserRuleCall_1_0(), semanticObject.getMethod());
		feeder.accept(grammarAccess.getSensorGetMethodAccess().getTypeSensorTypeIDTerminalRuleCall_4_0_1(), semanticObject.eGet(IoTPackage.Literals.SENSOR_GET_METHOD__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SensorGroup returns SensorGroup
	 *
	 * Constraint:
	 *     (name=ID sensors+=[Sensor|ID] sensors+=[Sensor|ID]*)
	 */
	protected void sequence_SensorGroup(ISerializationContext context, SensorGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SensorType returns SensorType
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_SensorType(ISerializationContext context, SensorType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IoTPackage.Literals.SENSOR_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IoTPackage.Literals.SENSOR_TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSensorTypeAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SensorTypes returns SensorTypes
	 *
	 * Constraint:
	 *     (types+=SensorType types+=SensorType*)
	 */
	protected void sequence_SensorTypes(ISerializationContext context, SensorTypes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sensor returns Sensor
	 *
	 * Constraint:
	 *     (name=ID type=[SensorType|ID])
	 */
	protected void sequence_Sensor(ISerializationContext context, Sensor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IoTPackage.Literals.SENSOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IoTPackage.Literals.SENSOR__NAME));
			if (transientValues.isValueTransient(semanticObject, IoTPackage.Literals.SENSOR__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IoTPackage.Literals.SENSOR__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSensorAccess().getTypeSensorTypeIDTerminalRuleCall_4_0_1(), semanticObject.eGet(IoTPackage.Literals.SENSOR__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ServerType returns ServerType
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ServerType(ISerializationContext context, ServerType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IoTPackage.Literals.SERVER_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IoTPackage.Literals.SERVER_TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getServerTypeAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ServerTypes returns ServerTypes
	 *
	 * Constraint:
	 *     (types+=ServerType types+=ServerType*)
	 */
	protected void sequence_ServerTypes(ISerializationContext context, ServerTypes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Server returns Server
	 *
	 * Constraint:
	 *     (name=ID type=[ServerType|ID] ip=Ip port=Portnumber)
	 */
	protected void sequence_Server(ISerializationContext context, Server semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IoTPackage.Literals.SERVER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IoTPackage.Literals.SERVER__NAME));
			if (transientValues.isValueTransient(semanticObject, IoTPackage.Literals.SERVER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IoTPackage.Literals.SERVER__TYPE));
			if (transientValues.isValueTransient(semanticObject, IoTPackage.Literals.SERVER__IP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IoTPackage.Literals.SERVER__IP));
			if (transientValues.isValueTransient(semanticObject, IoTPackage.Literals.SERVER__PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IoTPackage.Literals.SERVER__PORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getServerAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getServerAccess().getTypeServerTypeIDTerminalRuleCall_4_0_1(), semanticObject.eGet(IoTPackage.Literals.SERVER__TYPE, false));
		feeder.accept(grammarAccess.getServerAccess().getIpIpParserRuleCall_7_0(), semanticObject.getIp());
		feeder.accept(grammarAccess.getServerAccess().getPortPortnumberParserRuleCall_9_0(), semanticObject.getPort());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     System returns System
	 *
	 * Constraint:
	 *     (
	 *         system+=SensorTypes | 
	 *         system+=Sensor | 
	 *         system+=SensorGroup | 
	 *         system+=SensorGetMethod | 
	 *         system+=DeviceTypes | 
	 *         system+=Device | 
	 *         system+=ServerTypes | 
	 *         system+=Server | 
	 *         system+=DestinationTypes | 
	 *         system+=Destination | 
	 *         system+=FetchData
	 *     )+
	 */
	protected void sequence_System(ISerializationContext context, org.xtext.sdu.ioT.System semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Time returns Time
	 *
	 * Constraint:
	 *     time=INT
	 */
	protected void sequence_Time(ISerializationContext context, Time semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IoTPackage.Literals.TIME__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IoTPackage.Literals.TIME__TIME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTimeAccess().getTimeINTTerminalRuleCall_0(), semanticObject.getTime());
		feeder.finish();
	}
	
	
}
