package ru.job4j.tracker.oop;

public class Error {

    private boolean active;

    private int status;

    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("active is : " + active);
        System.out.println("status is : " + status);
        System.out.println("message is : " + message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 770, "Hello World");
        error.printInfo();
        Error error1 = new Error(true, 777, "Goodbye World");
        error1.printInfo();
        Error error2 = new Error();
        error2.printInfo();
    }
}
