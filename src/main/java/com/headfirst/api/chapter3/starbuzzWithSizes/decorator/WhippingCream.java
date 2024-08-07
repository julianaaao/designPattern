package com.headfirst.api.chapter3.starbuzzWithSizes.decorator;

import com.headfirst.api.chapter3.starbuzzWithSizes.base.Beverage;
import com.headfirst.api.chapter3.starbuzzWithSizes.base.CondimentDecorator;

public class WhippingCream extends CondimentDecorator {
    public WhippingCream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whipping cream";
    }

    @Override
    public double cost() {
        double cost = beverage.cost() + .10;
        return beverage.costWithSize(cost);
    }
}
