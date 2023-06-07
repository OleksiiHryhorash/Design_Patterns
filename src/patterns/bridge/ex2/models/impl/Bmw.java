package patterns.bridge.ex2.models.impl;

import patterns.bridge.ex2.models.Model;

public class Bmw implements Model {
    @Override
    public void drive(String str) {
        System.out.println(str + "bmw");
    }
}
