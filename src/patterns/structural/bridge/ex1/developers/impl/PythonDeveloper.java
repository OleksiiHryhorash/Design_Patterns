package patterns.structural.bridge.ex1.developers.impl;

import patterns.structural.bridge.ex1.developers.Developer;

public class PythonDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Python developer writes python code...");
    }
}
