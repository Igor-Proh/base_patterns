package com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1.banking;

import com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
