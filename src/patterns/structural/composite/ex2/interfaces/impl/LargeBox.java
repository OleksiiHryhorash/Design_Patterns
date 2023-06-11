package patterns.structural.composite.ex2.interfaces.impl;

import patterns.structural.composite.ex2.interfaces.Box;

public class LargeBox implements Box {
    private final double value = 56.20;
    @Override
    public double getValue() {
        return this.value;
    }
}
