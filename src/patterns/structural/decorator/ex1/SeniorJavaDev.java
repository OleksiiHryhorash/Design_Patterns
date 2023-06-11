package patterns.structural.decorator.ex1;

import patterns.structural.decorator.ex1.interfaces.impl.DecoratorDev;
import patterns.structural.decorator.ex1.interfaces.Developer;

public class SeniorJavaDev extends DecoratorDev {
    public SeniorJavaDev(Developer developer) {
        super(developer);
    }
    public String codeReview(){
        return " Make code review.";
    }

    @Override
    public String doJob() {
        return super.doJob() + codeReview();
    }
}
