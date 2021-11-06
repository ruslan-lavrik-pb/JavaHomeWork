package com.pb.lavrik.hw6;



public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурка", "Пятнистая");
        Cat cat2 =new Cat("Мурка", "Пятнистая");
        Cat cat3=new Cat("Барсик", "Пепельный");
        System.out.println(cat1.getName() + " - " + cat1.getColorCat());
        cat1.makeNoise();
        cat1.eat();
        cat1.sleep();

        Horse horse1 = new Horse("Сивка бурка");
        horse1.sleep();


        System.out.println("Сравнение трех котов - "+ cat1.equals(cat2));
        System.out.println("Сравнение трех котов - "+ cat1.equals(cat3));
        System.out.println("hashCode Кота - " + cat1.getName()+" - "+cat1.hashCode());
        System.out.println("hashCode Кота - " + cat2.getName()+" - "+cat2.hashCode());
        System.out.println("hashCode Кота - " + cat3.getName()+" - "+cat3.hashCode());

        System.out.println(cat1);
    }
}
