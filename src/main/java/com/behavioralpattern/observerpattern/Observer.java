package com.behavioralpattern.observerpattern;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
