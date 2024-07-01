package com.headfirst.api.chapter3.starbuzzWithSizes.base;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;
    public abstract String getDescription();
}
