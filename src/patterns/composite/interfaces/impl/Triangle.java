package patterns.composite.interfaces.impl;

import patterns.composite.interfaces.Shape;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing triangle...");
    }

}
