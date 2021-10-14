package com.pb.lavrik.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cchislo;
        System.out.printf("Для определения интервала введите целое число - ");
        cchislo = scan.nextInt();

        if (cchislo>=0 & cchislo<=14){
            System.out.println("Число расположено в интревале от 0 до 14");
        } else if (cchislo>=15 & cchislo<=35){
            System.out.println("Число расположено в интревале от 15 до 35");
        } else if (cchislo>=36 & cchislo<=50){
            System.out.println("Число расположено в интревале от 36 до 50");
        }else if (cchislo>=51 & cchislo<=100){
            System.out.println("Число расположено в интревале от 51 до 100");
        }else {
            System.out.println("Число не входит в определяемые диапазоны");
        }
    }
}
