package com.behavioralpattern.visitorpattern;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
