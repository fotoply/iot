/**
 * generated by Xtext 2.17.0
 */
package org.xtext.sdu.ioT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sdu.ioT.Device#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.sdu.ioT.Device#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see org.xtext.sdu.ioT.IoTPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(DeviceType)
   * @see org.xtext.sdu.ioT.IoTPackage#getDevice_Type()
   * @model
   * @generated
   */
  DeviceType getType();

  /**
   * Sets the value of the '{@link org.xtext.sdu.ioT.Device#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(DeviceType value);

  /**
   * Returns the value of the '<em><b>Group</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' reference.
   * @see #setGroup(SensorGroup)
   * @see org.xtext.sdu.ioT.IoTPackage#getDevice_Group()
   * @model
   * @generated
   */
  SensorGroup getGroup();

  /**
   * Sets the value of the '{@link org.xtext.sdu.ioT.Device#getGroup <em>Group</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group</em>' reference.
   * @see #getGroup()
   * @generated
   */
  void setGroup(SensorGroup value);

} // Device
