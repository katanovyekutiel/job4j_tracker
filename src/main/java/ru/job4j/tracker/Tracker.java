package ru.job4j.tracker;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll(int id, String name) {
        String rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if ((item.getName().equals(item) && (item.getId().equals(item)) {
                rsl = (id, name);
            }
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        String rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName() == key) {
                rsl = key;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}