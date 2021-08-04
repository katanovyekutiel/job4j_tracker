package ru.job4j.inheritance;

public class Profession {
    private int id;
    private String surname;
    private boolean education;
    private int birthday;

    public Profession(int id, String surname, boolean education, int birthday) {
        this.id = id;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public void printInfo() {
        System.out.println("Id is : " + id);
        System.out.println("Surname is : " + surname);
        System.out.println("Education is : " + education);
        System.out.println("Date of Birth : " + birthday);
    }

    public static void main(String[] args) {
        Programmer yekutiel = new Programmer(1, "Kaatnov", true, 1983, "Job4j", true);
        yekutiel.printInfo();
        yekutiel.printInfoProject();
        yekutiel.printInfoProgramming();
    }
}
