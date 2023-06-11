package patterns.structural.adapter.ex2;

import patterns.structural.adapter.ex2.interfaces.impl.Audi;
import patterns.structural.adapter.ex2.interfaces.impl.TruckMAZ;

public class App {
    public static void main(String[] args) {
        CarWash carWash = new CarWash();

        carWash.wash(new Audi());
        // carWash.wash(new TrackMAZ()); not work, but i have class adapter or wrapper
        carWash.wash(new AdapterTruckToCar(new TruckMAZ()));
    }
}
