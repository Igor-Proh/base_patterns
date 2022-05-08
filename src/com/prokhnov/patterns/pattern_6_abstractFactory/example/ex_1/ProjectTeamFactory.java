package com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
