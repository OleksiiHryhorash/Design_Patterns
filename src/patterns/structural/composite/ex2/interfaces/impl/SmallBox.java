package patterns.structural.composite.ex2.interfaces.impl;

import patterns.structural.composite.ex2.interfaces.Box;

public class SmallBox implements Box {
    private final double value = 12.00;
    @Override
    public double getValue() {
        return this.value;
    }
}
