package ru.job4j.oop;

public class Reduce {
    private int[] array;

    public void to(int[] array1) {
        array = array1;
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array1);
        reduce.print();
    }
}