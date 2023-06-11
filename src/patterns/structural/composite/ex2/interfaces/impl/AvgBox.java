package patterns.structural.composite.ex2.interfaces.impl;

import patterns.structural.composite.ex2.interfaces.Box;

public class AvgBox implements Box {
    private final double value = 32.86;
    @Override
    public double getValue() {
        return this.value;
    }
}
