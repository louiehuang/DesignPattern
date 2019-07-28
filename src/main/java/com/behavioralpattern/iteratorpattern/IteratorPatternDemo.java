package com.behavioralpattern.iteratorpattern;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        Iterator it = namesRepository.getIterator();
        while (it.hasNext()) {
            String name = (String) it.next();
            System.out.println("Name : " + name);
        }
    }
}
