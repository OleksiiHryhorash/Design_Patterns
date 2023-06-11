package patterns.structural.decorator.ex1;

import patterns.structural.decorator.ex1.interfaces.Developer;

public class JavaDev implements Developer {
    @Override
    public String doJob() {
        return "Write Java code.";
    }
}
