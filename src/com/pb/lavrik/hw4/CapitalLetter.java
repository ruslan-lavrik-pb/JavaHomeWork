package com.pb.lavrik.hw4;


import java.io.*;

public class CapitalLetter {
    public static void main(String[] args) throws IOException {
        String abc;

        //abc = "мама мыла раму";
        System.out.println("Введите фразу, на пример:\"мама мыла раму\"");

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        abc = bufferedReader.readLine();
        String abcLetter = myCaseLock(abc);
        myPrint(abcLetter);
    }




    public static String myCaseLock(String s) {
        String itog = "";
        String[] isbnParts = s.split(" ");

        for (int i = 0; i < isbnParts.length; i++) {
            System.out.println(isbnParts[i].charAt(0));
            itog = itog + isbnParts[i].replaceFirst(isbnParts[i].charAt(0) + "", Character.toUpperCase(isbnParts[i].charAt(0)) + "") + ' ';
        }

        return itog;
    }

    public static String myPrint(String p) {
        System.out.println(p);
        return p;
    }
}
