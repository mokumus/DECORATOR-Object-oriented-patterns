package com.muhammedokumus;

/**
 * Abstract base class for suit types that will decorated with big guns
 */
public abstract class Suit {
    String description = "Unknown suit.";

    /**
     * @return Information about the suit
     */
    public String getDescription(){
        return description;
    }

    /**
     * Calculates the cost of the suit
     * @return Cost of the suit in TL
     */
    public abstract double cost();

    /**
     * Calculates the weight of the suit
     * @return Weight of the suit in kilograms
     */
    public abstract double weight();
}
