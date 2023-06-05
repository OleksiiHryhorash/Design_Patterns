package patterns.bridge.ex1.abstraction.apps;

import patterns.bridge.ex1.developers.Developer;
import patterns.bridge.ex1.abstraction.AbstractApp;

public class TelegramBot extends AbstractApp {
    public TelegramBot(Developer developer) {
        super(developer);
    }

    @Override
    public void developApp() {
        System.out.println("Telegram bot developing...");
        developer.writeCode();
    }
}
