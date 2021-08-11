package ru.job4j.validate;

public class DivByZero {
    public static int div(int first, int second) {
        return  first / second;
    }

    public static void main(String[] args) {
        int rsl = div(10, 5);
        System.out.println(rsl);
    }
}
