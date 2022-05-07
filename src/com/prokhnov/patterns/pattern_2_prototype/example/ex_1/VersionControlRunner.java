package com.prokhnov.patterns.pattern_2_prototype.example.ex_1;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "Project", "SourceCode sourceCode = new SourceCode()");
        System.out.println(master.hashCode());
        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        System.out.println(masterClone.hashCode());
        System.out.println(masterClone);
    }
}
