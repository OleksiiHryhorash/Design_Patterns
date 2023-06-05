package patterns.bridge.ex2.models.real;

import patterns.bridge.ex2.models.Model;

public class Mercedes implements Model {
    @Override
    public void drive(String str) {
        System.out.println(str + "mercedes");
    }
}
