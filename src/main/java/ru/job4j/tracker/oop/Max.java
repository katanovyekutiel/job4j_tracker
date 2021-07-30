package ru.job4j.tracker.oop;

public class Max {
    public static int max(int first, int second, int third, int forth) {
        return max(first, max(second, max(third, forth)));
    }

    public static void main(String[] args) {
        int msg = Max.max(1, 2, 3, 4);
        System.out.println(msg);
    }
}
