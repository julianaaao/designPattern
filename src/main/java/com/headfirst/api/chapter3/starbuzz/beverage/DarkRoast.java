package com.headfirst.api.chapter3.starbuzz.beverage;

import com.headfirst.api.chapter3.starbuzz.base.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
