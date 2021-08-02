package ru.job4j.inheritance;

public class Profession {
    private int id;
    private String surname;
    private boolean education;
    private int birthday;

    public Profession() {}

    public void printInfo() {
        System.out.println("Id is : " + id);
        System.out.println("Surname is : " + surname);
        System.out.println("Education is : " + education);
        System.out.println("Date of Birth : " + birthday);
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public boolean getEducation() {
        return education;
    }

    public int getBirthday() {
        return birthday;
    }

    public class Doctor extends Profession() {
        String diagnosis;
    }

    public class Surgeon extends Doctor() {
        this.id = id;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
        boolean operating;
    }

    public class Dentist extends Doctor() {
        this.id = id;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
        boolean treatsTeeth;
    }

    public class Engineer extends Profession() {
        String project;
    }

    public class Programmer extends Engineer() {
        this.id = id;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
        boolean programming;
    }

    public class Builder extends Engineer() {
        this.id = id;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
        boolean building;
    }

    public static void main(String[] args) {
        Programmer yekutiel = new Programmer();
        yekutiel.printInfo();
    }
}
