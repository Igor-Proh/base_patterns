package com.prokhnov.patterns.pattern_5_factory.example.ex_1;

public class PhpDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
