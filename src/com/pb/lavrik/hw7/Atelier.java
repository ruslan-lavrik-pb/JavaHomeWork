package com.pb.lavrik.hw7;

public class Atelier {


    public static void main(String[] args) {
        EvroSize evroSize = new EvroSize(Size.XXS);

        evroSize.getDescription(Size.XXS);
        System.out.println(evroSize);

        evroSize.getEuroSize(Size.XXS);
        Tshirt tshirt = new Tshirt();
        Tshirt tshirt1 = new Tshirt("10", "красный", "S");
        Tshirt tshirt2 = new Tshirt("11", "синий", "L");
        Tshirt tshirt3 = new Tshirt("12", "желтый", "XS");
        Tshirt tshirt4 = new Tshirt("13", "белый", "S");

        Clothes[] clothesM = new Clothes[]{tshirt1, tshirt2};
        Clothes[] clothesW = new Clothes[]{tshirt3, tshirt4};

        for ( Clothes clothes : clothesM) {
            tshirt.dressMan();
            System.out.println("Цена - " + clothes.Price+" Цвет - "+clothes.Colour+" Размер - "+ evroSize.getSize(clothes.Size));
        }


    }
}
