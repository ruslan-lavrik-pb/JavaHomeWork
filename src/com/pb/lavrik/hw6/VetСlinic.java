package com.pb.lavrik.hw6;

import java.lang.reflect.Constructor;

public class VetСlinic {
    public static void main(String[] args) throws Exception {

         Class clazz1 = Class.forName("com.pb.lavrik.hw6.Animal");
        Constructor constr = clazz1.getConstructor(new Class[]{String.class});
        Object obj1 = constr.newInstance("Мурка");


        Class clazz2 = Class.forName("com.pb.lavrik.hw6.Animal");
        Constructor constr2 = clazz2.getConstructor(new Class[]{String.class});
        Object obj2 = constr.newInstance("Барсик");

        Class clazz3 = Class.forName("com.pb.lavrik.hw6.Animal");
        Constructor constr3 = clazz3.getConstructor(new Class[]{String.class});
        Object obj3 = constr.newInstance("Мустанг");

             Animal[] Animal = new Animal[] {(com.pb.lavrik.hw6.Animal) obj1, (com.pb.lavrik.hw6.Animal) obj2, (com.pb.lavrik.hw6.Animal) obj3};

        for (Animal animal:Animal) {
            treatAnimal(animal);
        }

    }
    static void treatAnimal(Animal animal) {
        System.out.println("на прием пришло животное " + animal.getName() + " из - " +animal.getLocation());
    }

}
