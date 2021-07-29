package ru.job4j.tracker.oop;

public class DummyDic {
    public String engToRus(String eng) {
        eng = "world";
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic endToRus = new DummyDic();
        System.out.println(endToRus);
    }
}
