package patterns.composite.ex2;

import patterns.composite.ex2.interfaces.Box;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Box> boxes = new ArrayList<>();

    public void addBox(Box box){
        boxes.add(box);
    }

    public void remove(Box box){
        boxes.remove(box);
    }

    public void getSummaryValue(){
        double sumValue = 0.0;
        for (Box box: boxes) {
            sumValue += box.getValue();
        }
        System.out.println("Summary value boxes on stock: " + sumValue);
    }
}
