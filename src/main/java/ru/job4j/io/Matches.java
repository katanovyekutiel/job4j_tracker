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
            turn = !turn;
            count = count - matches;
            if (count < matches) {
                System.out.println(player + " введите число не привышающее: " + count);
                matches = Integer.parseInt(input.nextLine());
                turn = !turn;
            } else if (count > matches) {
                System.out.println(player + " введите число от 1 до 3 : осталось " + count + " спичек");
                matches = Integer.parseInt(input.nextLine());
                turn = !turn;
            } else if (count == 0) {
                System.out.println("Поздравляем! Вы выиграли!");
                turn = false;
            }
            System.out.println();
        }
    }
}
