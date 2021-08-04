package ru.job4j.pojo;

public class Books {
    private String book;
    private int pages;

    public Books(String book, int pages) {
        this.book = book;
        this.pages = pages;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

}
