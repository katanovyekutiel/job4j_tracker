package ru.job4j.inheritance;

public class Builder extends Engineer {
    private boolean building;

    public Builder(String project, boolean building) {
        super(project);
        this.building = building;
    }
}
