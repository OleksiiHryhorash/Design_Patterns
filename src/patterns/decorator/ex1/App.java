package patterns.decorator.ex1;

import patterns.decorator.ex1.interfaces.Developer;

public class App {
    public static void main(String[] args) {
        Developer javaDeveloper = new JavaDev();
        System.out.println(javaDeveloper.doJob());

        Developer seniorJavaDev = new SeniorJavaDev(new JavaDev());
        System.out.println(seniorJavaDev.doJob());

        Developer javaTeamLead = new TeamLeadJava(new SeniorJavaDev(new JavaDev()));
        System.out.println(javaTeamLead.doJob());
    }
}
