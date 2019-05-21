package com.miscellaneouspattern.interceptingfilterpattern;

public class AuthenticationFilter implements Filter {
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
