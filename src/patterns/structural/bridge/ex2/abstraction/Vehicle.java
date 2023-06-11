package patterns.structural.bridge.ex2.abstraction;

import patterns.structural.bridge.ex2.models.Model;

public abstract class Vehicle {
    protected Model model;

    protected Vehicle(Model model) {
        this.model = model;
    }

    public abstract void drive();
}
