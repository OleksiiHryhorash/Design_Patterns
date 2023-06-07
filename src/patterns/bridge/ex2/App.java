package patterns.bridge.ex2;

import patterns.bridge.ex2.abstraction.Vehicle;
import patterns.bridge.ex2.abstraction.vehicles.Bike;
import patterns.bridge.ex2.abstraction.vehicles.Car;
import patterns.bridge.ex2.abstraction.vehicles.Truck;
import patterns.bridge.ex2.models.impl.Audi;
import patterns.bridge.ex2.models.impl.Bmw;
import patterns.bridge.ex2.models.impl.Mercedes;

public class App {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Bike(new Bmw()),
                new Bike(new Mercedes()),
                new Bike(new Audi()),
                new Truck(new Mercedes()),
                new Truck(new Audi()),
                new Truck(new Bmw()),
                new Car(new Mercedes()),
                new Car(new Bmw()),
                new Car(new Audi())};

        for (Vehicle vehicle: vehicles){
            vehicle.drive();

        }
    }
}
