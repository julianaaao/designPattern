package com.headfirst.api.chapter3.starbuzz.base;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;

    public abstract String getDescription();

}
