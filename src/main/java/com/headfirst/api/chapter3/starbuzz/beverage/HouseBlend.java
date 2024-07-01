package com.headfirst.api.chapter3.starbuzz.beverage;

import com.headfirst.api.chapter3.starbuzz.base.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return .89;
    }
}
