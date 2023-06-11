package patterns.structural.bridge.ex1.abstraction;

import patterns.structural.bridge.ex1.developers.Developer;

public abstract class AbstractApp {
    protected Developer developer;

    protected AbstractApp(Developer developer) {
        this.developer = developer;
    }

    public abstract void developApp();
}
