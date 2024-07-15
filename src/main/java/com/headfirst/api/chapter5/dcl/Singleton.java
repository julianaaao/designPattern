package com.headfirst.api.chapter5.dcl;

public class Singleton {
    private static volatile Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) { // 인스턴스가 있는지 확인, 없으면 동기화 블록으로
            synchronized (Singleton.class) {
                if (uniqueInstance == null) { // 두 번째 체크
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}