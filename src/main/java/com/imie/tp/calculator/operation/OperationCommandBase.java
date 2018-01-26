package com.imie.tp.calculator.operation;
/**
 *
 * @author Anne-SOphie
 *
 */
public abstract class OperationCommandBase implements OperationCommand {

  public OperationCommandBase(float baseValue)
  {
            this.currentValue = baseValue;
  }

  public int currentValue = 10;
}
