package com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1.website;

import com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_1.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM projects website project...");
    }
}
