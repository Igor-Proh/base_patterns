package com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1.banking;

import com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1.Developer;
import com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1.ProjectManager;
import com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1.ProjectTeamFactory;
import com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
