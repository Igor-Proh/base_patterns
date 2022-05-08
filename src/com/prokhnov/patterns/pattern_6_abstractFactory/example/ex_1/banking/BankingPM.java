package com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1.banking;

import com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
