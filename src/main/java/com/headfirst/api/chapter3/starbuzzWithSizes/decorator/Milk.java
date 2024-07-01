package com.headfirst.api.chapter3.starbuzzWithSizes.decorator;


import com.headfirst.api.chapter3.starbuzzWithSizes.base.Beverage;
import com.headfirst.api.chapter3.starbuzzWithSizes.base.CondimentDecorator;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        double cost = beverage.cost() + .10;
        return beverage.costWithSize(cost);
    }

}
