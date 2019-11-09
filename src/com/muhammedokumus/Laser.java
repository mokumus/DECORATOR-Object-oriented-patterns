package com.muhammedokumus;

/**
 * Suit decorator with laser
 */
public class Laser extends SuitDecorator {
    Suit suit;

    public Laser(Suit suit){
        this.suit = suit;
    }

    /**
     * @return Information about the suit
     */
    @Override
    public String getDescription() {
        return suit.getDescription() + "\n-Laser";
    }

    /**
     * Calculates the cost of the suit
     *
     * @return Cost of the suit in TL
     */
    @Override
    public double cost() {
        return 200.0 + suit.cost();
    }

    /**
     * Calculates the weight of the suit
     *
     * @return Weight of the suit in kilograms
     */
    @Override
    public double weight() {
        return 5.5 + suit.weight();
    }
}
