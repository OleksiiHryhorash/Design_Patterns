package patterns.decorator.ex1.interfaces.impl;

import patterns.decorator.ex1.interfaces.Developer;

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
