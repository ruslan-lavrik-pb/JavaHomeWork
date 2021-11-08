package com.pb.lavrik.hw6;

import java.util.List;

public class Veterinarian {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурка", "Пятнистая");
        Cat cat2 = new Cat("Мурка", "Пятнистая");
        Cat cat3 = new Cat("Барсик", "Пепельный");
        cat1.setLocation("Дом");
        cat2.setLocation("Сарай");
        cat3.setLocation("Дом");

        Dog dog1 = new Dog("Барсик");
        Dog dog2 = new Dog("Шакрик");
        dog1.setLocation("Будка");
        dog2.setLocation("Дом");

        Horse horse = new Horse("Мустанг");
        horse.setLocation("Сарай");

        Animal[] lists = new Animal[]{cat1, cat2, cat3, dog1, dog2, horse};


        System.out.println(cat1.getName() + " - " + cat1.getColorCat());
        cat1.makeNoise();
        cat1.eat();
        cat1.sleep();

        Horse horse1 = new Horse("Сивка бурка");
        horse1.sleep();


        System.out.println("Сравнение трех котов - " + cat1.equals(cat2));
        System.out.println("Сравнение трех котов - " + cat1.equals(cat3));
        System.out.println("hashCode Кота - " + cat1.getName() + " - " + cat1.hashCode());
        System.out.println("hashCode Кота - " + cat2.getName() + " - " + cat2.hashCode());
        System.out.println("hashCode Кота - " + cat3.getName() + " - " + cat3.hashCode());

        System.out.println(cat1);

        for (Animal animal:lists) {
            treatAnimal(animal);
        }


    }


    static void treatAnimal(Animal animal) {
        System.out.println("на прием пришло животное " + animal.getName() + " из - " +animal.getLocation());
    }

}
