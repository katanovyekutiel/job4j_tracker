package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Katanov Yekutiel");
        student.setGroup("Job4j");
        student.setBegin(new Date());

        System.out.println("Student - " + student.getName()
                + System.lineSeparator() + "Group - "
                + student.getGroup() + System.lineSeparator()
                + "Start date of traning - "
                + student.getBegin());
    }
}
