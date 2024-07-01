package com.headfirst.api.chapter3.starbuzzWithSizes.beverage;

import com.headfirst.api.chapter3.starbuzzWithSizes.base.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        double baseCost =.89;
        return costWithSize(baseCost);
    }
}
