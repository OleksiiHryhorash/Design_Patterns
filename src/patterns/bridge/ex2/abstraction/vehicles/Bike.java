package patterns.bridge.ex2.abstraction.vehicles;

import patterns.bridge.ex2.models.Model;
import patterns.bridge.ex2.abstraction.Vehicle;

public class Bike extends Vehicle {
    public Bike(Model model) {
        super(model);
    }

    @Override
    public void drive() {
        model.drive("Drive bike ");
    }
}
