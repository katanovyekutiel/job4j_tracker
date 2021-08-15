package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11 спичек.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches == 1 || matches == 2 || matches == 3) {
                turn = !turn;
                count = count - matches;
                System.out.println("На столе осталось " + count + " спичек");
            }else if (count < matches) {
                System.out.println(player + "введено неверное значение, обратите внимение на оставшиеся спички!");
            } else if (count > matches) {
                System.out.println(player + " введите число от 1 до 3 : На столе осталось " + count + " спичек");
            } else if (count == 0) {
                System.out.println("Поздравляем! " + player + " Вы выиграли!");
                turn = false;
            } else if (count < 0) {
                System.out.println(player + "Вы проиграли! будьте внимательны.");
                turn = false;
            } else {
                System.out.println("введено неверное значение");
            }
        }
    }
}
