package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Books cleanCode = new Books("Clean code", 57);
        Books bestResult = new Books("Best Result", 60);
        Books liveRebe = new Books("Live Of Rebe", 770);
        Books chabad = new Books("Chabad", 770);
        Books[] book = new Books[4];
        book[0] = cleanCode;
        book[1] = bestResult;
        book[2] = liveRebe;
        book[3] = chabad;
        for (int i = 0; i < book.length; i++) {
            Books bk = book[i];
            System.out.println(bk.getBook() + " - " + bk.getPages());
        }
        System.out.println("Replace book[0] and book[3].");
        Books[] tmp = new Books[1];
        tmp[0] = book[0];
        book[0] = book[3];
        book[3] = tmp[0];
        for (int i = 0; i < book.length; i++) {
            Books bk = book[i];
            System.out.println(bk.getBook() + " - " + bk.getPages());
        }
        System.out.println("Show only book - \"Clean code\".");
        for (int i = 0; i < book.length; i++) {
            Books bk = book[i];
            if (bk.getBook().equals("Clean code")) {
                System.out.println(bk.getBook() + " - " + bk.getPages());
            }
        }


    }
}
