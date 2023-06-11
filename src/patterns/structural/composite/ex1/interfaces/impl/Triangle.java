package patterns.structural.composite.ex1.interfaces.impl;

import patterns.structural.composite.ex1.interfaces.Shape;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing triangle...");
    }

}
