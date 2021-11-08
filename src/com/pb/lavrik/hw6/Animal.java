package com.pb.lavrik.hw6;

public class Animal {
    private String name;
    private String food;
    private String location;


    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public void sleep() {
        System.out.println("Животное: " + name + " спит");
    }

    public void eat() {
        System.out.println("Животное " + name + "сейчас кушает");
    }

    public void makeNoise() {
        System.out.println("Животное:" + name + "шумит");
    }


    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
