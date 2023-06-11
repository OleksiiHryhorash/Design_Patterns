package patterns.structural.adapter.ex2.interfaces.impl;

import patterns.structural.adapter.ex2.interfaces.Car;

public class Audi implements Car {

    @Override
    public void washCar() {
        System.out.println("Audi is washing...");
    }
}
