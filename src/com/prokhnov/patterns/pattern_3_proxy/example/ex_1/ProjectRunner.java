package com.prokhnov.patterns.pattern_3_proxy.example.ex_1;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/igor-proh/realProject");
        project.run();
    }
}
