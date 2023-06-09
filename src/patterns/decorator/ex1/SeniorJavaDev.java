package patterns.decorator.ex1;

import patterns.decorator.ex1.interfaces.Developer;
import patterns.decorator.ex1.interfaces.impl.DecoratorDev;

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
