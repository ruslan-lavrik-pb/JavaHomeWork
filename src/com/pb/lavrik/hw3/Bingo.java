package com.pb.lavrik.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int attempt = 0;

        double foundDobl = (Math.random() * 100);
        int found = 1 + (int) foundDobl;
        System.out.println(found + " - Это число я загадала, но это тайна. Давай играть");
        System.out.println();

        Scanner scan = new Scanner(System.in);
        int foundUser;
        System.out.println("Я загадала число от 1 до 100, отгодай его");
        System.out.println("Не хотите угадывать число введите любое число больше 100");
        System.out.println();
        System.out.printf("Введите числи - ");
        foundUser = scan.nextInt();


        for (; ; ) {
            if (foundUser > 100) {
                System.out.println("Вы решили не играть, число попыток угадать число " + attempt);
                break;
            }
            if (foundUser == found) {
                attempt = ++attempt;
                break;
            }
            if (found < foundUser) {
                attempt = ++attempt;
                System.out.printf("Не угадал, число " + foundUser + " больше загаданного числа, попробуй еще раз - ");
                foundUser = scan.nextInt();
            }
            if (found > foundUser) {
                attempt = ++attempt;
                System.out.printf("Не угадал, число " + foundUser + " меньше загаданного числа, попробуй еще раз - ");
                foundUser = scan.nextInt();
            }
        }


        System.out.println();
        if (foundUser <= 100) {
            System.out.println("Bingo, Вы отгадали число, правильно это - " + foundUser);
            System.out.println("Число отгадано за " + attempt + " раз");
        }
        System.out.println("Игра окончена");

    }
}

