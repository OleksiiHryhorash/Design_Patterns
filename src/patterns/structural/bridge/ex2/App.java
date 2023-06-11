package patterns.structural.bridge.ex2;

import patterns.structural.bridge.ex2.abstraction.vehicles.Bike;
import patterns.structural.bridge.ex2.abstraction.vehicles.Car;
import patterns.structural.bridge.ex2.abstraction.vehicles.Truck;
import patterns.structural.bridge.ex2.models.impl.Audi;
import patterns.structural.bridge.ex2.models.impl.Bmw;
import patterns.structural.bridge.ex2.models.impl.Mercedes;
import patterns.structural.bridge.ex2.abstraction.Vehicle;

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
