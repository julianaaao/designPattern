package com.headfirst.api.chapter3.example;

import com.headfirst.api.chapter3.starbuzz.base.Beverage;
import com.headfirst.api.chapter3.starbuzz.base.CondimentDecorator;

public class MochaWhip extends CondimentDecorator {
       Beverage beverage;

       public MochaWhip(Beverage beverage) {
           this.beverage = beverage;
       }

       public String getDescription() {
           return beverage.getDescription() + ", Mocha, Whip";
       }

       public double cost() {
           return beverage.cost() + 0.20 + 0.10; 
       }
   }