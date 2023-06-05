package patterns.bridge.ex1.abstraction.apps;

import patterns.bridge.ex1.abstraction.AbstractApp;
import patterns.bridge.ex1.developers.Developer;

public class BankSystem extends AbstractApp {
    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developApp() {
        System.out.println("Bank system developing...");
        developer.writeCode();
    }
}
