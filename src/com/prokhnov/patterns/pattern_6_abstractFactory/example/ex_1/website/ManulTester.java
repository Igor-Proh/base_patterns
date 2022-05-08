package com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1.website;

import com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1.Tester;

public class ManulTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual Tester tests website...");
    }
}
