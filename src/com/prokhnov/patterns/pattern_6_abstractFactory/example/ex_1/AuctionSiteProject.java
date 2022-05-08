package com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1;

import com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating Auction Site...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
