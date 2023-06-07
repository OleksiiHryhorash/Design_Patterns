package patterns.bridge.ex1.developers.impl;

import patterns.bridge.ex1.developers.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes C++ code...");
    }
}
