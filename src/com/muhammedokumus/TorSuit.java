package com.muhammedokumus;

/**
 * Tor type suit
 */
public class TorSuit extends Suit {

    public TorSuit(){
        description = "Tor suit";
    }

    /**
     * Calculates the cost of the suit
     *
     * @return Cost of the suit in TL
     */
    @Override
    public double cost() {
        return 5000.0;
    }

    /**
     * Calculates the weight of the suit
     *
     * @return Weight of the suit in kilograms
     */
    @Override
    public double weight() {
        return 50.0;
    }
}
