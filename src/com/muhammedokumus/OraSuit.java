package com.muhammedokumus;

/**
 * Ora type suit
 */
public class OraSuit extends Suit {

    public OraSuit(){
        description = "Ora suit";
    }

    /**
     * Calculates the cost of the suit
     *
     * @return Cost of the suit in TL
     */
    @Override
    public double cost() {
        return 1500.0;
    }

    /**
     * Calculates the weight of the suit
     *
     * @return Weight of the suit in kilograms
     */
    @Override
    public double weight() {
        return 30.0;
    }
}
