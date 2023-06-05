package patterns.bridge.ex2;

import patterns.bridge.ex2.abstraction.Vehicle;
import patterns.bridge.ex2.abstraction.vehicles.Bike;
import patterns.bridge.ex2.abstraction.vehicles.Car;
import patterns.bridge.ex2.abstraction.vehicles.Track;
import patterns.bridge.ex2.models.real.Audi;
import patterns.bridge.ex2.models.real.Bmw;
import patterns.bridge.ex2.models.real.Mercedes;

public class App {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Bike(new Bmw()),
                new Bike(new Mercedes()),
                new Bike(new Audi()),
                new Track(new Mercedes()),
                new Track(new Audi()),
                new Track(new Bmw()),
                new Car(new Mercedes()),
                new Car(new Bmw()),
                new Car(new Audi())};

        for (Vehicle vehicle: vehicles){
            vehicle.drive();

        }
    }
}
