package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String project;

    public Engineer(int id, String surname, boolean education, int birthday, String project) {
        super(id, surname, education, birthday);
        this.project = project;
    }

    public void printInfoProject() {
        System.out.println("Project is : " + project);
    }
}
