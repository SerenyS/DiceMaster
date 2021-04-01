package edu.wctc.dice.impl;

import edu.wctc.dice.iface.DiceRoll;

public class SixMoreDice implements DiceRoll {
    @Override
    public int roll() {
        return (int) Math.floor(Math.random()*(10-4+1)+4);
    }
}
