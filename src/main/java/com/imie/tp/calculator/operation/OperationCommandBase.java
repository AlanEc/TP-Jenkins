package com.imie.tp.calculator.operation;
/**
 *
 * @author Anne-SOphie
 *
 */
public abstract class OperationCommandBase implements OperationCommand {

  public float currentValue;
    
  public OperationCommandBase(float baseValue)
  {
            this.currentValue = baseValue;
  }

  /**
   *
   */
  public float currentValue = 10;
}
