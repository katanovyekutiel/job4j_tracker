package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passenger(int passenger) {
        System.out.println("Количество пассажиров: 25");
    }

    @Override
    public int price(int refuel) {

        return 0;
    }
}
