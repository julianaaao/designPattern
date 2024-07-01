package com.headfirst.api.chapter3.starbuzzWithSizes.beverage;

import com.headfirst.api.chapter3.starbuzzWithSizes.base.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        double baseCost = 1.05;
        return costWithSize(baseCost);
    }
}
