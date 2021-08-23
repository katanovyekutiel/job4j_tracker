package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passenger(int passenger) {
        System.out.println("Количество пассажиров: " + passenger);
    }

    @Override
    public int price(int refuel) {
        int liters = 50;
        return 60 * liters;
    }
}
