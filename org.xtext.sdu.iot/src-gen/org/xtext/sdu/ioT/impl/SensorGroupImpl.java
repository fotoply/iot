/**
 * generated by Xtext 2.17.0
 */
package org.xtext.sdu.ioT.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.sdu.ioT.IoTPackage;
import org.xtext.sdu.ioT.Sensor;
import org.xtext.sdu.ioT.SensorGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sdu.ioT.impl.SensorGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.sdu.ioT.impl.SensorGroupImpl#getSensors <em>Sensors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorGroupImpl extends MinimalEObjectImpl.Container implements SensorGroup
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSensors() <em>Sensors</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSensors()
   * @generated
   * @ordered
   */
  protected EList<Sensor> sensors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SensorGroupImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return IoTPackage.Literals.SENSOR_GROUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IoTPackage.SENSOR_GROUP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Sensor> getSensors()
  {
    if (sensors == null)
    {
      sensors = new EObjectResolvingEList<Sensor>(Sensor.class, this, IoTPackage.SENSOR_GROUP__SENSORS);
    }
    return sensors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IoTPackage.SENSOR_GROUP__NAME:
        return getName();
      case IoTPackage.SENSOR_GROUP__SENSORS:
        return getSensors();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IoTPackage.SENSOR_GROUP__NAME:
        setName((String)newValue);
        return;
      case IoTPackage.SENSOR_GROUP__SENSORS:
        getSensors().clear();
        getSensors().addAll((Collection<? extends Sensor>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case IoTPackage.SENSOR_GROUP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IoTPackage.SENSOR_GROUP__SENSORS:
        getSensors().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case IoTPackage.SENSOR_GROUP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IoTPackage.SENSOR_GROUP__SENSORS:
        return sensors != null && !sensors.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SensorGroupImpl
