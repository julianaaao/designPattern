package com.headfirst.api.chapter3.starbuzzWithSizes.decorator;

import com.headfirst.api.chapter3.starbuzzWithSizes.base.Beverage;
import com.headfirst.api.chapter3.starbuzzWithSizes.base.CondimentDecorator;

public class Soymilk extends CondimentDecorator {
    public Soymilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", soy milk";
    }

    @Override
    public double cost() {
        double cost = beverage.cost() + .15;
        return beverage.costWithSize(cost);
    }

}
