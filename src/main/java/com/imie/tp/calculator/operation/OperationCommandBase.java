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
    
  public OperationCommandBase(float baseValue)
  {
            this.currentValue = baseValue;
  }

}
