package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private boolean programming;

    public Programmer(int id, String surname, boolean education, int birthday, String project, boolean programming) {
        super(id, surname, education, birthday, project);
        this.programming = programming;
    }

    public void printInfoProgramming() {
        System.out.println("Now is programming : " + programming);
    }
}
