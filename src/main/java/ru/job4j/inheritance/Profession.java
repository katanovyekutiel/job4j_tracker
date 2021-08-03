package ru.job4j.inheritance;

public class Profession {
    private int id;
    private String surname;
    private boolean education;
    private int birthday;

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isEducation() {
        return education;
    }

    public void setEducation(boolean education) {
        this.education = education;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

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

    public static void main(String[] args) {
        Programmer yekutiel = new Programmer();
        System.out.println(yekutiel);
    }
}
