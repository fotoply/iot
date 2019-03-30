/**
 * generated by Xtext 2.17.0
 */
package org.xtext.sdu.ioT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destination Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sdu.ioT.DestinationTypes#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see org.xtext.sdu.ioT.IoTPackage#getDestinationTypes()
 * @model
 * @generated
 */
public interface DestinationTypes extends EObject
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sdu.ioT.DestinationType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see org.xtext.sdu.ioT.IoTPackage#getDestinationTypes_Types()
   * @model containment="true"
   * @generated
   */
  EList<DestinationType> getTypes();

} // DestinationTypes