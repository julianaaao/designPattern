package com.headfirst.api.chapter3.starbuzzWithSizes.beverage;

import com.headfirst.api.chapter3.starbuzzWithSizes.base.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        double baseCost = .99;
        return costWithSize(baseCost);
    }
}
