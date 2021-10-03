//package ru.job4j.tracker;
//
//public class SingleTracker {
//    private Tracker tracker = new Tracker();
//
//    private SingleTracker() {
//
//    }
//
//    public static SingleTracker getInstance() {
//        if (instance == null) {
//            instance = new SingleTracker();
//        }
//        return instance;
//    }
//
//    public Item add(Item item) {
//        return tracker.add(item);
//    }
//
//    public Item findById(int id) {
//        return null;
//    }
//
//    public Item findByName(String name) {
//        return tracker.findByName(name);
//    }
//
//    public Item findAll() {
//        return tracker.findAll();
//    }
//
//    public Item replace(int id, Item item) {
//        return tracker.replace(id, item);
//    }
//
//    public Item delete(int id) {
//        return tracker.delete(id);
//    }
//}