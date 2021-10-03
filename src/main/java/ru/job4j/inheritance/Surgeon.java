package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private boolean operating;

    public Surgeon(int id, String surname, boolean education,
                   int birthday, String diagnosis, boolean operating) {
        super(id, surname, education, birthday, diagnosis);
        this.operating = operating;
    }
}
