package patterns.composite.ex2;

import patterns.composite.ex2.interfaces.Box;
import patterns.composite.ex2.interfaces.impl.AvgBox;
import patterns.composite.ex2.interfaces.impl.LargeBox;
import patterns.composite.ex2.interfaces.impl.SmallBox;

public class App {
    public static void main(String[] args) {
        Stock stock = new Stock();

        Box smallBox1 = new SmallBox();
        Box smallBox2 = new SmallBox();

        Box avgBox1 = new AvgBox();

        Box largeBox1 = new LargeBox();
        Box largeBox2 = new LargeBox();

        stock.addBox(smallBox1);
        stock.addBox(smallBox2);
        stock.addBox(avgBox1);
        stock.addBox(largeBox1);
        stock.addBox(largeBox2);

        stock.getSummaryValue();

        stock.remove(smallBox1);
        stock.remove(largeBox2);

        System.out.println("\nAfter buy one small and one large box:");
        stock.getSummaryValue();
    }
}
