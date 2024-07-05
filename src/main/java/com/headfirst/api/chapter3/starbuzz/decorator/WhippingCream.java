package com.headfirst.api.chapter3.starbuzz.decorator;

import com.headfirst.api.chapter3.starbuzz.base.Beverage;
import com.headfirst.api.chapter3.starbuzz.base.CondimentDecorator;

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
        return beverage.cost() + .10;
    }
}
