package com.muhammedokumus;

/**
 * Suit decorator with rocket launcher
 */
public class RocketLauncher extends SuitDecorator {
    Suit suit;

    public RocketLauncher(Suit suit){
        this.suit = suit;
    }

    /**
     * @return Information about the suit
     */
    @Override
    public String getDescription() {
        return suit.getDescription() + "\n-Rocket Launcher";
    }

    /**
     * Calculates the cost of the suit
     *
     * @return Cost of the suit in TL
     */
    @Override
    public double cost() {
        return 150.0 + suit.cost();
    }

    /**
     * Calculates the weight of the suit
     *
     * @return Weight of the suit in kilograms
     */
    @Override
    public double weight() {
        return 7.5 + suit.weight();
    }
}
