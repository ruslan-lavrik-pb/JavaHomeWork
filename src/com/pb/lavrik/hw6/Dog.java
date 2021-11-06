package com.pb.lavrik.hw6;

import java.util.Objects;

public class Dog extends Animal{
    private String Poroda;

    public String getPoroda() {
        return Poroda;
    }

    public void setPoroda(String poroda) {
        Poroda = poroda;
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(Poroda, dog.Poroda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),Poroda);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Poroda='" + Poroda + '\'' +
                '}';
    }
}
