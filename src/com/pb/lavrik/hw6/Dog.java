package com.pb.lavrik.hw6;

import java.util.Objects;

public class Cat extends Animal {

    private String colorCat;

    public Cat(String name, String colorCat) {
        super(name);

    }

    public Cat() {

    }


    public void makeNoise() {
        System.out.println("Животное: " + getName() + " шумит и царапает коврик, необходимо покормить");
    }

    public void eat() {
        System.out.println("Животное: " + getName() + " сейчас кушает отбивную");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(colorCat, cat.colorCat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), colorCat);
    }

    public String getColorCat() {
        return colorCat;
    }

    public void setColorCat(String colorCat) {
        this.colorCat = colorCat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "Name='" + getName() + '\'' +
                '}';
    }


}
