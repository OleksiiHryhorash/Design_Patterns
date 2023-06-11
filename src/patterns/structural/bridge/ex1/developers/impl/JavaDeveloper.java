package patterns.structural.bridge.ex1.developers.impl;

import patterns.structural.bridge.ex1.developers.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
