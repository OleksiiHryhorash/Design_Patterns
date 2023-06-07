package patterns.composite.interfaces.impl;

import patterns.composite.interfaces.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing circle...");
    }
}
