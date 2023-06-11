package patterns.structural.decorator.ex1.interfaces.impl;

import patterns.structural.decorator.ex1.interfaces.Developer;

public class DecoratorDev implements Developer {
    private Developer developer;

    public DecoratorDev(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String doJob() {
        return developer.doJob();
    }
}
