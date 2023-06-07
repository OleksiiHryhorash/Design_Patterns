package patterns.adapter.ex2.interfaces.realizations;

import patterns.adapter.ex2.interfaces.Car;

public class Audi implements Car {

    @Override
    public void washCar() {
        System.out.println("Audi is washing...");
    }
}
