package com.pb.lavrik.hw11;


import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        List<String> phonebook = new ArrayList<>();
        String str;

        Path path = Paths.get("directory.txt");
        System.out.println("Чтение из файла \"" + path.toAbsolutePath() + "\" произведено! И данные из файла переносятся в коллекцию строк" );

        try (BufferedReader reader = Files.newBufferedReader(path)) {

            String line;
            while ((line = reader.readLine()) != null) {
                phonebook.add(line);
            }
        }
        System.out.println(phonebook);


        System.out.println();
        System.out.println("добавление элемента");

        String fioAdd = "Ivanov Ivan Dvadcat'SHestoj";
        String dataAdd = "01.01.2002";
        String nomerAdd = "N0026";
        String adresAdd = "tDnepr, Tret'ya ulica stroitelej, d. 16";
        str = fioAdd + "\t" + dataAdd + "\t" + nomerAdd + "\t" + adresAdd;
        phonebook.add(str);
        int i=phonebook.size();
        System.out.println("Элемент добавлен, порядковый номер - " + i + " значение - "+phonebook.get(i-1));

        System.out.println();
        System.out.println("Удаление элемента номер 2 - " + phonebook.get(1));
        phonebook.remove(1);
        System.out.println("На втором месте сейчас элемент - " + phonebook.get(1));

        System.out.println();


        System.out.println("Удаление всех элементов Ivanov Ivan" );

        Pattern pattern = Pattern.compile("Ivanov Ivan");


        for ( i=0; i<4; i++){
            str=phonebook.get(i);
        Matcher matcher = pattern.matcher(str);
//            str=matcher;
//        if
////            System.out.println(pattern.matcher(phonebook.get(i)));
//
//
//        }
//
//
//
//
//        str = phonebook.get(1);
//        String[] words = str.split("\t");
//        // Вывод на экран
//        for (String subStr : words) {
//            System.out.println(subStr);
        }


        Iterator<String> phonebookIterator = phonebook.iterator();//создаем итератор
        while(phonebookIterator.hasNext()) {//до тех пор, пока в списке есть элементы

            String nextPhone = phonebookIterator.next();//получаем следующий элемент
            if (nextPhone.equals("Ivanov Ivan")){
                phonebookIterator.remove();
            }


        }

        phonebookIterator = phonebook.iterator();//создаем итератор
        while(phonebookIterator.hasNext()) {//до тех пор, пока в списке есть элементы

            String nextPhone = phonebookIterator.next();//получаем следующий элемент
            System.out.println(nextPhone);


        }



    }


}


