package patterns.adapter.ex2;

import patterns.adapter.ex2.interfaces.Car;
import patterns.adapter.ex2.interfaces.Track;

public class AdapterTrackToCar implements Car {

    private final Track track;

    public AdapterTrackToCar(Track track) {
        this.track = track;
    }

    @Override
    public void washCar() {
        track.washTrack();
    }
}
