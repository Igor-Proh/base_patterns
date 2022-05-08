package com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1.banking;

import com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA Tester tests banking code...");
    }
}
