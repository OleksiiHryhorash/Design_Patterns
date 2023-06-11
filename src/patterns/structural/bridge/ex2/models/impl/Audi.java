package patterns.structural.bridge.ex2.models.impl;

import patterns.structural.bridge.ex2.models.Model;

public class Audi implements Model {
    @Override
    public void drive(String str) {
        System.out.println(str + "audi");
    }
}
