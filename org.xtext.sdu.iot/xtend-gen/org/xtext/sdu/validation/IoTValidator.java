/**
 * generated by Xtext 2.16.0
 */
package org.xtext.sdu.validation;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.sdu.ioT.IoTPackage;
import org.xtext.sdu.ioT.Portnumber;
import org.xtext.sdu.validation.AbstractIoTValidator;

/**
 * a
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class IoTValidator extends AbstractIoTValidator {
  /**
   * public static val INVALID_NAME = 'invalidName'
   * 
   * @Check
   * def checkGreetingStartsWithCapital(Greeting greeting) {
   * if (!Character.isUpperCase(greeting.name.charAt(0))) {
   * warning('Name should start with a capital',
   * IoTPackage.Literals.GREETING__NAME,
   * INVALID_NAME)
   * }
   * }
   */
  @Check
  public void portnumberWithinRange(final Portnumber portnumber) {
    boolean _isInt = this.isInt(portnumber.getNumber());
    if (_isInt) {
      if (((Integer.parseInt(portnumber.getNumber()) <= 1024) || (Integer.parseInt(portnumber.getNumber()) > (65535 + 1)))) {
        this.warning("Portnumbers should be within 1025-65535", IoTPackage.Literals.PORTNUMBER__NUMBER, "unsafe or invalid port number");
      }
    }
  }
  
  public boolean isInt(final String string) {
    try {
      Integer.parseInt(string);
      return true;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        return false;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}