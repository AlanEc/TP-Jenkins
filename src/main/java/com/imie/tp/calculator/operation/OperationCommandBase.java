package com.imie.tp.calculator.operation;
/**
 *
 * @author Anne-SOphie
 *
 */
public abstract class OperationCommandBase implements OperationCommand {

  /**
   * value.
   */
  public float currentValue = 10;
   
  /**
   *
   * @param baseValue
   */
  public OperationCommandBase(final float baseValue) {
            this.currentValue = baseValue;
  }

}
