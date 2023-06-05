package patterns.bridge.ex2.abstraction.vehicles;

import patterns.bridge.ex2.models.Model;
import patterns.bridge.ex2.abstraction.Vehicle;

public class Track extends Vehicle {
    public Track(Model model) {
        super(model);
    }

    @Override
    public void drive() {
        model.drive("Drive track ");
    }
}
