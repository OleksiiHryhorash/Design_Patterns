package patterns.bridge.ex1.abstraction;

import patterns.bridge.ex1.developers.Developer;

public abstract class AbstractApp {
    protected Developer developer;

    protected AbstractApp(Developer developer) {
        this.developer = developer;
    }

    public abstract void developApp();
}
