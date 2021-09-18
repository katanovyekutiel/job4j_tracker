package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (String[i] == key) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            indexOf()
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
