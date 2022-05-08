package com.prokhnov.patterns.pattern_5_factory.example.ex_1;

public class JavaDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
