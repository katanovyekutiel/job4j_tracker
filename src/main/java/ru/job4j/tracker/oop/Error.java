package ru.job4j.tracker.oop;

public class Error {

    private boolean active;

    private int status;

    private String message;

    public Error() {
        active = true;
        status = 770;
        message = "Hello World";
    }

    public void printInfo() {
        System.out.println("active is : " + active);
        System.out.println("status is : " + status);
        System.out.println("message is : " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
    }
}
