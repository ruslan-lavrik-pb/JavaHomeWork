package com.pb.lavrik.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes{

//футболка

    public Tshirt(String price, String colour, String size) {
        super(price, colour, size);
    }
    public Tshirt() {
        super();
    }



    @Override
    public void dressMan() {
        System.out.printf("На мужчине надета футболка ");

    }

    @Override
    public void dressWomen() {
        System.out.printf("На женщине надета футболка ");

    }
}
