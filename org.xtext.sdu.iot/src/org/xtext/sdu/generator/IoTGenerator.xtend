/*
 * generated by Xtext 2.17.0
 */
package org.xtext.sdu.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.sdu.ioT.Sensor
import org.xtext.sdu.ioT.SensorGroup
import org.xtext.sdu.ioT.SensorType
import org.xtext.sdu.ioT.SensorTypes
import org.xtext.sdu.ioT.DeviceTypes
import org.xtext.sdu.ioT.DeviceType
import org.xtext.sdu.ioT.Device
import org.xtext.sdu.ioT.SensorGetMethod
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.HashMap
import org.xtext.sdu.ioT.Server

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class IoTGenerator extends AbstractGenerator {
	
	private HashMap<String, String> sensorMap = new HashMap<String, String>();

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		//Default libraries for sensors on a LoPy board
		sensorMap.put("gyroscope", "LIS2HH12");
		sensorMap.put("lightsensor", "LTR329ALS01");
		sensorMap.put("altimeter", "MPL3115A2");
		
		fsa.generateFile("system.py", generatePythonCode(resource))
		
		for(server : resource.allContents.filter(Server).toIterable)
		{
			fsa.generateFile(server.name + ".py", generateServerCode(server))
		}
	}
	
	private def String getSensorLibraryName(String sensorName) {
		if(sensorMap.get(sensorName) != null) {
			return sensorMap.get(sensorName);
		} else {
			return sensorName;
		}
	}
	
	protected def generateServerCode(Server server) '''
	#Autogenerated �new SimpleDateFormat("dd-MM-yyyy 'at' HH:mm:ss").format(Calendar.getInstance().getTime()).toString()� by EasyIoT
	import socket,sys
	from _thread import *
	
	def client_recieve(connection):
	    while True:
	        data = connection.recv(2048)
	        print(data)
	
	        if not data:
	            break
	    connection.close()
	host = '�FOR ipNumber : 0..<server.ip.ip.size��server.ip.ip.get(ipNumber)��IF ipNumber + 1 < server.ip.ip.size�.�ENDIF��ENDFOR�' 
	port = �server.port.number�
	s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
	
	if __name__ == '__main__':
	    try:
	        s.bind((host, port))
	    except socket.error as e:
	        print(str(e))
	
	    s.listen()
	    print('Easy IoT Server started. Waiting for connection')
	    while True:
	
	        connnection, addr = s.accept()
	        print('connected to: '+addr[0]+':'+str(addr[1]))
	
	        start_new_thread(client_recieve,(connnection,))
	'''
	
	protected def generatePythonCode(Resource resourceRoot) '''
	#Autogenerated �new SimpleDateFormat("dd-MM-yyyy 'at' HH:mm:ss").format(Calendar.getInstance().getTime()).toString()� by EasyIoT
	import pycom
	import time
	�emitSensortypes(resourceRoot)�
	�emitDevicetypes(resourceRoot)�
	
	�emitSensors(resourceRoot)��emitDevices(resourceRoot)�
	
	�emitSensorgroup(resourceRoot)�
	
	�emitSensorGetMethod(resourceRoot)�
	'''
	
	
	def emitSensorGetMethod(Resource resourceRoot) 
	'''
	�IF resourceRoot.allContents.filter(SensorGetMethod).size > 0�
	getMethods = dict()
	�ENDIF�
	�FOR sensorGetMethod : resourceRoot.allContents.filter(SensorGetMethod).toIterable�
	getMethods[�sensorGetMethod.type.name�_�sensorGetMethod.method.name�(�FOR parameter : sensorGetMethod.method.parameters SEPARATOR ','��parameter��ENDFOR�)] = getattr(�sensorGetMethod.type.name�,�sensorGetMethod.method.name�(�FOR parameter : sensorGetMethod.method.parameters SEPARATOR ','��parameter��ENDFOR�))
	�ENDFOR�
	'''
	
	protected def CharSequence emitSensorgroup(Resource resourceRoot)
		'''�FOR sensorGroup : resourceRoot.allContents.filter(SensorGroup).toIterable�
		�sensorGroup.name� = [�FOR sensor : sensorGroup.sensors SEPARATOR ','��sensor.name��ENDFOR�]
		�ENDFOR�'''
	
	
	protected def CharSequence emitSensors(Resource resourceRoot)
		'''�FOR sensor : resourceRoot.allContents.filter(Sensor).toIterable�
		�sensor.name� = �sensor.type.name�()
		�ENDFOR�'''
	
	
	protected def CharSequence emitSensortypes(Resource resourceRoot)
		'''�FOR sensorTypes : resourceRoot.allContents.filter(SensorTypes).toIterable�
			�FOR sensorType : sensorTypes.types�
			�sensorType.importSensorLibrary�
			�ENDFOR�
			�ENDFOR�'''
			
			
	protected def CharSequence emitDevicetypes(Resource resourceRoot)
		'''�FOR deviceTypes : resourceRoot.allContents.filter(DeviceTypes).toIterable�
			�FOR deviceType : deviceTypes.types�
			�deviceType.importDeviceLibrary�
			�ENDFOR�
			�ENDFOR�'''
			
	protected def CharSequence emitDevices(Resource resourceRoot)
		'''�FOR device : resourceRoot.allContents.filter(Device).toIterable�
		�device.name� = �device.type.name�()
		�ENDFOR�'''
	
	protected def importSensorLibrary(SensorType sensorType) '''	
		import �getSensorLibraryName(sensorType.name)� as �sensorType.name�
		'''
	
	protected def importDeviceLibrary(DeviceType deviceType) '''	
		import �deviceType.name� from �deviceType.name�
	'''
}
