package patterns.bridge.ex2.abstraction.vehicles;

import patterns.bridge.ex2.models.Model;
import patterns.bridge.ex2.abstraction.Vehicle;

public class Car extends Vehicle {
    public Car(Model model) {
        super(model);
    }

    @Override
    public void drive() {
        model.drive("Drive car ");
    }
}
