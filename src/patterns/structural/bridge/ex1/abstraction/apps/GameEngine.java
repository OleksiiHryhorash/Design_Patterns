package patterns.structural.bridge.ex1.abstraction.apps;

import patterns.structural.bridge.ex1.developers.Developer;
import patterns.structural.bridge.ex1.abstraction.AbstractApp;

public class GameEngine extends AbstractApp {
    public GameEngine(Developer developer) {
        super(developer);
    }

    @Override
    public void developApp() {
        System.out.println("Game engine developing...");
        developer.writeCode();
    }
}
