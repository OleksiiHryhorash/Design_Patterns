package patterns.composite.ex1.interfaces.impl;

import patterns.composite.ex1.interfaces.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing circle...");
    }

}
