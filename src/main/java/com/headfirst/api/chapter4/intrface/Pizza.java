package com.headfirst.api.chapter4.intrface;

public interface Pizza {
    void bake ();
    void cut ();
    void box ();
    void setName(String name);
    String getName();
    String toString();
}
