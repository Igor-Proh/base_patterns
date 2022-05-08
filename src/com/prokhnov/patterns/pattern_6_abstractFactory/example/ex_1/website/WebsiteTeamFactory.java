package com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1.website;

import com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1.Developer;
import com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1.ProjectManager;
import com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1.ProjectTeamFactory;
import com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManulTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
