package patterns.structural.bridge.ex2.abstraction.vehicles;

import patterns.structural.bridge.ex2.models.Model;
import patterns.structural.bridge.ex2.abstraction.Vehicle;

public class Truck extends Vehicle {
    public Truck(Model model) {
        super(model);
    }

    @Override
    public void drive() {
        model.drive("Drive track ");
    }
}
