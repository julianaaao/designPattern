package com.headfirst.api.chapter3.starbuzz.beverage;

import com.headfirst.api.chapter3.starbuzz.base.Beverage;

public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
