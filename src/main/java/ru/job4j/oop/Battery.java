package ru.job4j.oop;

public class Battery {
    private int value;

    public Battery(int size) {
        this.value = size;
    }

    public void exchange(Battery another) {
        another.value += this.value;
        this.value = 0;
    }

    public static void main(String[] args) {
        Battery one = new Battery(10);
        Battery two = new Battery(5);
        System.out.println("battery one : " + one.value
                + "    battery two : " + two.value);
        one.exchange(two);
        System.out.println("battery one : " + one.value
                + "    battery two : " + two.value);
    }

}
