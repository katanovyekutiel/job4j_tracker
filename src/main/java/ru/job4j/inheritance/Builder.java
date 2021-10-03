package ru.job4j.inheritance;

public class Builder extends Engineer {
    private boolean building;

    public Builder(int id, String surname,
                   boolean education, int birthday, String project,
                   boolean building) {
        super(id, surname, education, birthday, project);
        this.building = building;
    }
}
