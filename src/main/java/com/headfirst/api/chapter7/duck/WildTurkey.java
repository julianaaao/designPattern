package com.headfirst.api.chapter7.duck;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("짧은 거리를 나는 중");
    }
}
