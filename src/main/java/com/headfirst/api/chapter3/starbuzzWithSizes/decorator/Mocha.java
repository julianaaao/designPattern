package com.headfirst.api.chapter3.starbuzzWithSizes.decorator;

import com.headfirst.api.chapter3.starbuzzWithSizes.base.Beverage;
import com.headfirst.api.chapter3.starbuzzWithSizes.base.CondimentDecorator;

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
        double cost = beverage.cost() + .20;
        return beverage.costWithSize(cost);
    }

}
