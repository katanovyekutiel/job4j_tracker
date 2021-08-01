package ru.job4j.oop;

public class Dog {

    public String sound() {
        String voice = "gav-gav";
        return voice;
    }

    public static void main(String[] args) {
        Dog polkan = new Dog();
        Dog sharik = new Dog();
        Dog zhychka = new Dog();
        String say = polkan.sound();
        System.out.println("Polkan say : " + say);
    }
}
