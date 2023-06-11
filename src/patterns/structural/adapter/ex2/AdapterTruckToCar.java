package patterns.structural.adapter.ex2;

import patterns.structural.adapter.ex2.interfaces.Car;
import patterns.structural.adapter.ex2.interfaces.Truck;

public class AdapterTruckToCar implements Car {

    private final Truck track;

    public AdapterTruckToCar(Truck track) {
        this.track = track;
    }

    @Override
    public void washCar() {
        track.washTrack();
    }
}
