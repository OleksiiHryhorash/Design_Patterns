package patterns.structural.bridge.ex1.abstraction.apps;

import patterns.structural.bridge.ex1.abstraction.AbstractApp;
import patterns.structural.bridge.ex1.developers.Developer;

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
