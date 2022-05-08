package com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1.website;

import com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes PHP code...");
    }
}
