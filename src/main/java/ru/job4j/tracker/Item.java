package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public Item() {
    }

    public void printInfo() {
        System.out.println("Id is : " + id);
        System.out.println("Name is : " + name);
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Item one = new Item();
        one.printInfo();
        Item two = new Item("Yekutiel");
        two.printInfo();
        Item three = new Item(3, "Yekutiel");
        three.printInfo();
    }
}