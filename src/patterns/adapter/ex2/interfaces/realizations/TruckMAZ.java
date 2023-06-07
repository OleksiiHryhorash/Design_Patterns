package patterns.adapter.ex2.interfaces.realizations;

import patterns.adapter.ex2.interfaces.Truck;

public class TruckMAZ implements Truck {
    @Override
    public void washTrack() {
        System.out.println("MAZ is washing...");
    }
}
