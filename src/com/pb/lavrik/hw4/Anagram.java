изложил как делал, не получается в последнем if область видемости признака sortArray
        разбираюсь, если не разберусь в воскреение переделаю логику проверки


package com.pb.lavrik.hw4;

import java.io.*;


public class Anagram {
    public static void main(String[] args) throws IOException {
        boolean sortArray = false;
        char bubbleArray;
        int i;


        String anagram1 = "Я в мире - сирота";
        String anagram2 = "Я в Риме - Ариост";

        /* это готово
        System.out.println("Введите фразу, для проверки");
       InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Введите первую фразу");
        anagram1 = bufferedReader.readLine();
        System.out.println("Введите вторую фразу");
        anagram2 = bufferedReader.readLine();
*/
        anagram1 = anagram1.toLowerCase();
        anagram2 = anagram2.toLowerCase();

        String itog = "";
        String[] isbnParts = anagram1.split(" ");

        for (i = 0; i < isbnParts.length; i++) {
            itog = itog + isbnParts[i].replace(isbnParts[i].charAt(0) + "", Character.toString(isbnParts[i].charAt(0)) + "");
        }
        anagram1 = itog;
        String[] isbnParts2 = anagram2.split(" ");

        itog = "";
        for (i = 0; i < isbnParts2.length; i++) {
            itog = itog + isbnParts2[i].replace(isbnParts[i].charAt(0) + "", Character.toString(isbnParts[i].charAt(0)) + "");
        }
        anagram2 = itog;
        char[] chars1 = anagram1.toCharArray();
        char[] chars2 = anagram2.toCharArray();


        while (!sortArray) {
            sortArray = true;
            for (i = 0; i < chars1.length - 1; i++) {
                if (chars1[i] > chars1[i + 1]) {
                    sortArray = false;

                    bubbleArray = chars1[i];
                    chars1[i] = chars1[i + 1];
                    chars1[i + 1] = bubbleArray;
                }
            }
        }

        sortArray = false;
        while (!sortArray) {
            sortArray = true;
            for (i = 0; i < chars2.length - 1; i++) {
                if (chars2[i] > chars2[i + 1]) {
                    sortArray = false;

                    bubbleArray = chars2[i];
                    chars2[i] = chars2[i + 1];
                    chars2[i + 1] = bubbleArray;
                }
            }
        }
        System.out.println();
        for (char c : chars1) {
            System.out.printf(String.valueOf(c));
        }
        System.out.println();
        for (char c : chars2) {
            System.out.printf(String.valueOf(c));
        }
        System.out.println();
        sortArray=false;
        if (chars1.length < chars2.length | chars1.length > chars2.length) {
            System.out.println("Это не анаграмма, количество символов не совпадает");
        } else {
            for (i = 0; i < chars1.length - 1; i++) {
                if (chars1[i] == chars2[i]) {
                    sortArray = true;
                } else {
                    System.out.println("Это не анограмма");
                }
            }
        }
        if (sortArray = true) {
            System.out.println("Поздравляю Вы ввели анаграмму");
        }
    }
}

