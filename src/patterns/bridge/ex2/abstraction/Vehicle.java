package patterns.bridge.ex2.abstraction;

import patterns.bridge.ex2.models.Model;

public abstract class Vehicle {
    protected Model model;

    protected Vehicle(Model model) {
        this.model = model;
    }

    public abstract void drive();
}
