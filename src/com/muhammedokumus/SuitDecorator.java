package com.muhammedokumus;


/**
 * Abstract decorator
 */
public abstract class SuitDecorator extends Suit{

    /**
     * @return Information about the suit
     */
    public abstract String getDescription(); //Left empty again for concrete decorators to implement
}
