package com.prokhnov.patterns.pattern_5_factory.example.ex_1;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
