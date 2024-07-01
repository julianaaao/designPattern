package com.headfirst.api.chapter3.starbuzz.beverage;

import com.headfirst.api.chapter3.starbuzz.base.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
