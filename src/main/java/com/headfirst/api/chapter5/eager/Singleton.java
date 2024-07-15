package com.headfirst.api.chapter5.eager;

public class Singleton {
    private static final Singleton uniqueInstance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return uniqueInstance; //instance는 이미 있으니, 리턴만 하면 됨
    }
}
