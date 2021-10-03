package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private boolean treatsTeeth;

    public Dentist(int id, String surname,
                   boolean education, int birthday, String diagnosis, boolean treatsTeeth) {
        super(id, surname, education, birthday, diagnosis);
        this.treatsTeeth = treatsTeeth;
    }
}
