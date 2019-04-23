package com.creationalpattern.singletonpattern;

public class DCLSingleton {

    private volatile static DCLSingleton singleton;

    private DCLSingleton() {

    }

    public static DCLSingleton getSingleton() {
        if (singleton == null) {
            synchronized (DCLSingleton.class) {
                if (singleton == null) {
                    singleton = new DCLSingleton();
                }
            }
        }
        return singleton;
    }
}