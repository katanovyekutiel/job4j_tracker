package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left > right;
        int rsl = condition ? left : right;
        return rsl;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, max(second, max(third, fourth)));
    }

    public static void main(String[] args) {
        System.out.println(Max.max(1, 2, 3, 4));
    }

}
