package ru.job4j.tracker.oop;

public class Max {
        public static int max(int first, int second, int third, int forth) {
        int result = first;
        if (second >= first && second >= third) {
            result = second;
        }
        if (third >= first && third >= second) {
            result = third;
        }
        int tmp = max(first, second, third);
        if (forth >= tmp) {
            result = forth;
        }
        return result;
    }

}
