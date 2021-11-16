package com.pb.lavrik.hw7;

public abstract class Clothes {
    protected String Price;
    protected String Colour;
    protected String Size;

    public Clothes(String price, String colour, String size) {
        Price = price;
        Colour = colour;
        Size = size;
    }

    public Clothes() {
    }
}

