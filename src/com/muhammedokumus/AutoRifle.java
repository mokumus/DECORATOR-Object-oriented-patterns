package com.muhammedokumus;

/**
 * Suit decorator with auto rifle
 */
public class AutoRifle extends SuitDecorator {
    Suit suit;

    public AutoRifle(Suit suit){
        this.suit = suit;
    }

    /**
     * @return Information about the suit
     */
    @Override
    public String getDescription() {
        return suit.getDescription() + "\n-Auto Rifle";
    }

    /**
     * Calculates the cost of the suit
     *
     * @return Cost of the suit in TL
     */
    @Override
    public double cost() {
        return 30.0 + suit.cost();
    }

    /**
     * Calculates the weight of the suit
     *
     * @return Weight of the suit in kilograms
     */
    @Override
    public double weight() {
        return 1.5 + suit.weight();
    }
}
