package com.headfirst.api.chapter3.starbuzzWithSizes.base;

public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI }
    Size size = Size.TALL;

    public String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public void setSize(Size size){
        this.size = size;
    }

    public Size getSize(){
        return this.size;
    }

    public abstract double cost();

    public double costWithSize(double baseCost) {
        if (getSize() == Size.TALL) {
            return baseCost + 0.10;
        } else if (getSize() == Size.GRANDE) {
            return baseCost + 0.20;
        } else if (getSize() == Size.VENTI) {
            return baseCost + 0.15;
        }
        return baseCost;
    }
}
