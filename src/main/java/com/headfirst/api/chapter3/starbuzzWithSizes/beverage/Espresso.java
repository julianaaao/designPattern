package com.headfirst.api.chapter3.starbuzzWithSizes.beverage;

import com.headfirst.api.chapter3.starbuzzWithSizes.base.Beverage;

public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    public double cost() {
        double baseCost = 1.99;
        return costWithSize(baseCost);
    }
}
