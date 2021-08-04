package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String diagnosis;

    public Doctor(int id, String surname, boolean education, int birthday, String diagnosis) {
        super(id, surname, education, birthday);
        this.diagnosis = diagnosis;
    }
}
