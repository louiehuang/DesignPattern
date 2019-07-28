package com.miscellaneouspattern.frontcontrollerpattern;

public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    public void dispatchRequest(String request) {
        //log each request
        trackRequest(request);

        //authenticate the user
        if (isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }

    private boolean isAuthenticUser() {
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Page requested: " + request);
    }
}
