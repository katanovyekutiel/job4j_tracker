package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private boolean programming;

    public Programmer(String project, boolean programming) {
        super(project);
        this.programming = programming;
    }
}
