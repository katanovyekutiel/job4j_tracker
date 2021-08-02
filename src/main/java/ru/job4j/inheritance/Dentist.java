package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private boolean treatsTeeth;

    public Dentist(String diagnosis, boolean treatsTeeth) {
        super(diagnosis);
        this.treatsTeeth = treatsTeeth;
    }
}
