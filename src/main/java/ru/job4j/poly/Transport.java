package ru.job4j.poly;

public interface Transport {
    void drive();

    void passenger(int passenger);

    int price(int refuel);
}