package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private boolean operating;

    public Surgeon(String diagnosis, boolean operating) {
        super(diagnosis);
        this.operating = operating;
    }
}
