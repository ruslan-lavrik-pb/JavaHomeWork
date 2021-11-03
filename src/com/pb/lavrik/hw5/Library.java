/*
* в задании
*
* классы Book Reader создал и наполнил, но
* не получилось передать в метод ссылочный массив Librar для его последующего наполнения и расчетов
* */

package com.pb.lavrik.hw5;


public class Library {
    private static int indeks;


    public static void main(String[] args) {

        Book book1 = new Book("Приключение 1 часть", "Иванов", "1990");
        Book book2 = new Book("Приключение 2 часть", "Иванов", "1991");
        Book book3 = new Book("Роман", "Неизвестный автор", "2000");
        Book[] bookS = new Book[]{book1, book2, book3};
        Reader reader1 = new Reader("Иванов", "Номер 1", "Ученики", "01.01.2020", "0987654321");
        Reader reader2 = new Reader("Петров", "Номер 2", "Студент", "01.01.1998", "0123456789");
        Reader[] readers = new Reader[]{reader1, reader2};
        Librar[] librars = new Librar[];


        takeBook(librars, bookS[1].getName(), readers[0].getFioName());
        System.out.println("Добавлена книга"+bookS[1].getName()+ "с читателем"+readers[0].getFioName());

        System.out.println(takeBook(librars));

        for (Book book : bookS) {
            System.out.println(book.getName());
        }



    }

    private static int takeBook(Librar[] librars) {
        int i=0;
        String libra;
        for (librars:libra){
            i+=;
        }
        return i;
    }


    public class Librar {
        private String fioName;
        private String nazvaKniga;

        public Librar(String fioName, String nazvaKniga) {
            this.fioName = fioName;
            this.nazvaKniga = nazvaKniga;
        }
    }

    private static void takeBook(librars, String name, String fioName) {
        librars.add(new Librar(fioName, name);
                return librars;
    }
}
