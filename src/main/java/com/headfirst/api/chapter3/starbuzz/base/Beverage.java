package com.headfirst.api.chapter3.starbuzz.base;

public abstract class Beverage {
    public String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
