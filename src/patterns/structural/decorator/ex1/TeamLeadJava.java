package patterns.structural.decorator.ex1;

import patterns.structural.decorator.ex1.interfaces.impl.DecoratorDev;
import patterns.structural.decorator.ex1.interfaces.Developer;

public class TeamLeadJava extends DecoratorDev {
    public TeamLeadJava(Developer developer) {
        super(developer);
    }
    public String sendWeekReport(){
        return " Send week report to customer";
    }

    @Override
    public String doJob() {
        return super.doJob() + sendWeekReport();
    }
}
