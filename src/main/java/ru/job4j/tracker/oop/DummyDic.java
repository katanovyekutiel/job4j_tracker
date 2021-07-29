package ru.job4j.tracker.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String phrase = dic.engToRus("world");
        System.out.println(phrase);
    }
}
