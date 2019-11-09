package com.muhammedokumus;

/**
 * Suit decorator with flamethrower
 */
public class Flamethrower extends SuitDecorator {
    Suit suit;

    public Flamethrower(Suit suit){
        this.suit = suit;
    }

    /**
     * @return Information about the suit
     */
    @Override
    public String getDescription() {
        return suit.getDescription() + "\n-Flamethrower set";
    }

    /**
     * Calculates the cost of the suit
     *
     * @return Cost of the suit in TL
     */
    @Override
    public double cost() {
        return 50.0 + suit.cost();
    }

    /**
     * Calculates the weight of the suit
     *
     * @return Weight of the suit in kilograms
     */
    @Override
    public double weight() {
        return 2.0 + suit.weight();
    }
}
