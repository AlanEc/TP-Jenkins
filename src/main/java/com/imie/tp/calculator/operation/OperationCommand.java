package com.imie.tp.calculator.operation;
/**
 *
 * @author Anne-SOphie
 *
 */
public interface OperationCommand {

    /**
     *
     * @param value
     */
    void make(float value);

    /**
     *
     * @return
     */
    float getCurrentValue();
}
