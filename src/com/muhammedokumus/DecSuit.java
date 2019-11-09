package com.muhammedokumus;

/**
 * Dec type suit
 */
public class DecSuit extends Suit {

    public DecSuit(){
        description = "Dec suit";
    }

    /**
     * Calculates the cost of the suit
     *
     * @return Cost of the suit in TL
     */
    @Override
    public double cost() {
        return 500.0;
    }

    /**
     * Calculates the weight of the suit
     *
     * @return Weight of the suit in kilograms
     */
    @Override
    public double weight() {
        return 25.0;
    }
}
