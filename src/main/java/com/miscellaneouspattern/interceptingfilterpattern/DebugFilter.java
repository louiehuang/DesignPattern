package com.miscellaneouspattern.interceptingfilterpattern;

public class DebugFilter implements Filter {
    public void execute(String request){
        System.out.println("Request log: " + request);
    }
}
