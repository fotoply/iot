/**
 * generated by Xtext 2.17.0
 */
package org.xtext.sdu.ioT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fetch Data Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sdu.ioT.FetchDataExpression#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.xtext.sdu.ioT.FetchDataExpression#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 *
 * @see org.xtext.sdu.ioT.IoTPackage#getFetchDataExpression()
 * @model
 * @generated
 */
public interface FetchDataExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' containment reference.
   * @see #setDuration(Time)
   * @see org.xtext.sdu.ioT.IoTPackage#getFetchDataExpression_Duration()
   * @model containment="true"
   * @generated
   */
  Time getDuration();

  /**
   * Sets the value of the '{@link org.xtext.sdu.ioT.FetchDataExpression#getDuration <em>Duration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' containment reference.
   * @see #getDuration()
   * @generated
   */
  void setDuration(Time value);

  /**
   * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time Unit</em>' attribute.
   * @see #setTimeUnit(String)
   * @see org.xtext.sdu.ioT.IoTPackage#getFetchDataExpression_TimeUnit()
   * @model
   * @generated
   */
  String getTimeUnit();

  /**
   * Sets the value of the '{@link org.xtext.sdu.ioT.FetchDataExpression#getTimeUnit <em>Time Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time Unit</em>' attribute.
   * @see #getTimeUnit()
   * @generated
   */
  void setTimeUnit(String value);

} // FetchDataExpression