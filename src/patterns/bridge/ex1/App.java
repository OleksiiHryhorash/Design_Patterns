package patterns.bridge.ex1;

import patterns.bridge.ex1.abstraction.AbstractApp;
import patterns.bridge.ex1.abstraction.apps.BankSystem;
import patterns.bridge.ex1.abstraction.apps.GameEngine;
import patterns.bridge.ex1.abstraction.apps.TelegramBot;
import patterns.bridge.ex1.developers.impl.CppDeveloper;
import patterns.bridge.ex1.developers.impl.JavaDeveloper;
import patterns.bridge.ex1.developers.impl.PythonDeveloper;

public class App {
    public static void main(String[] args) {
        AbstractApp[] abstractApps = {new GameEngine(new CppDeveloper()),
                new BankSystem(new JavaDeveloper()),
                new TelegramBot(new PythonDeveloper())};

        for(AbstractApp app : abstractApps){
            app.developApp();
            System.out.println();
        }
    }

}
