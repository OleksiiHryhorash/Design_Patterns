package patterns.structural.composite.ex1;

import patterns.structural.composite.ex1.interfaces.impl.Triangle;
import patterns.structural.composite.ex1.interfaces.Shape;
import patterns.structural.composite.ex1.interfaces.impl.Circle;
import patterns.structural.composite.ex1.interfaces.impl.Square;

public class App {
    public static void main(String[] args) {
        Shape square1 = new Square();
        Shape square2 = new Square();
        Shape square3 = new Square();
        Shape triangle1 = new Triangle();

        Shape triangle2 = new Triangle();
        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        Shape circle3 = new Circle();

        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.addComponent(square1);
        composite1.addComponent(square2);
        composite1.addComponent(square3);
        composite1.addComponent(triangle1);

        composite2.addComponent(triangle2);
        composite2.addComponent(circle1);
        composite2.addComponent(circle2);
        composite2.addComponent(circle3);
        composite2.removeComponent(circle3);

        composite.addComponent(composite1);
        composite.addComponent(composite2);

        composite.draw();
    }

}
