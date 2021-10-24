package com.pb.lavrik.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];

        Scanner scan = new Scanner(System.in);
        int summaArray = 0, positiveArray = 0, bubbleArray = 0, i = 0;
        boolean sortArray = false;

        
        for (i = 0; i < array.length; i++) {
            System.out.printf("Веедите значение № " + (i + 1) + " - ");
            array[i] = scan.nextInt();
        }


        System.out.printf("Вы задали массив чисел - [");
        for (i = 0; i < array.length - 1; i++) {
            System.out.printf(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");


        for (i = 0; i < array.length; i++) {
            summaArray = summaArray + array[i];
        }
        System.out.println("Сумма всех введенных Вами чисел - " + summaArray);


        for (i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveArray++;
            }
        }
        System.out.println("Количество положительных чисел введенных Вами - " + positiveArray + " шт.");

        
        while (!sortArray) {
            sortArray = true;
            for (i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    sortArray = false;

                    bubbleArray = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = bubbleArray;
                }
            }
        }

        System.out.printf("Заданные Вами числа отсортированы - [");
        for (i = 0; i < array.length - 1; i++) {
            System.out.printf(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }
}
