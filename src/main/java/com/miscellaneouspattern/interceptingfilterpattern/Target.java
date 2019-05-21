package com.miscellaneouspattern.interceptingfilterpattern;

public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
