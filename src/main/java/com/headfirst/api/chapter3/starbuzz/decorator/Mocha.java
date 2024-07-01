package com.headfirst.api.chapter3.starbuzz.decorator;

import com.headfirst.api.chapter3.starbuzz.base.Beverage;
import com.headfirst.api.chapter3.starbuzz.base.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
