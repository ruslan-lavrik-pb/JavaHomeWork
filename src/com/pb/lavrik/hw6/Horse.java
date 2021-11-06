package com.pb.lavrik.hw6;

import java.util.Objects;

public class Horse extends Animal{
    private String Mast;


    public Horse(String name) {
        super(name);
    }

    public void makeNoise (){
        System.out.println("Животное: " +getName()+ " шумит и бьет копыотм в пол. Хочет кушать");
    }

    public void eat (){
        System.out.println("Животное: " + getName() + " сейчас кушает овес");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(Mast, horse.Mast);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), Mast);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "Mast='" + Mast + '\'' +
                '}';
    }
}
