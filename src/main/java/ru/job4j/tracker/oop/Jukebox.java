package ru.job4j.tracker.oop;

public class Jukebox {
    public int music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        }
        if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }

    }

    public static void main(String[] args) {
        System.out.println(music(1));
    }
}
