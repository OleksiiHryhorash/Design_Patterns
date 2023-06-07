package patterns.adapter.ex2.interfaces.realizations;

import patterns.adapter.ex2.interfaces.Track;

public class TrackMAZ implements Track {
    @Override
    public void washTrack() {
        System.out.println("MAZ is washing...");
    }
}
