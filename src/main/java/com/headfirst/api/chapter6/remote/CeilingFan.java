package com.headfirst.api.chapter6.remote;

public class CeilingFan {
    String location = "";

    public CeilingFan(String location) {
        this.location = location;
    }

    void high(){
        System.out.println(location + " ceiling fan on High");
    }

    void off(){
        System.out.println(location + " ceiling fan OFF");
    }
}
