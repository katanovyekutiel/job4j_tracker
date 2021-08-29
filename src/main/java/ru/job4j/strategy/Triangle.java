package ru.job4j.strategy;

public class Triangle implements Shape {
    @Override
    public String draw() {
        String in = System.lineSeparator();
        return    "   ^    " + "\n"
                + " /   \\ " + "\n"
                + "/_____\\" + "\n";
    }

    public static void main(String[] args) {
        System.out.println(new Triangle().draw());
    }
}
