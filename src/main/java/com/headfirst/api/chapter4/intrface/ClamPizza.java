package com.headfirst.api.chapter4.intrface;



public class ClamPizza implements Pizza{
    PizzaIngredientFactory ingredientFactory;
    String name;
    Dough dough;
    Cheese cheese;
    Clams clams;
    Pepperoni pepperoni;
    Sauce sauce;
    Veggies veggies[];

    public ClamPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void bake() {
        System.out.println("175도에서 25분 간 굽기");
    }

    @Override
    public void cut() {
        System.out.println("피자를 사선으로 자르기");
    }

    @Override
    public void box() {
        System.out.println("상자에 피자 담기");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("--- ").append(name).append("--- \n");

        if(dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if(sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if(veggies != null) {
            for(int i = 0; i < veggies.length; i++){
                result.append(veggies[i]);
                if(i < veggies.length-1){
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if(cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if(clams != null) {
            result.append(clams);
            result.append("\n");
        }
        if(pepperoni != null) {
            result.append(pepperoni);
            result.append("\n");
        }
        return result.toString();
    }
}
