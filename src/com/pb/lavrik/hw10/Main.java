package com.pb.lavrik.hw10;


public class Main {
    public static void main(String[] args) {

        int i = 3;

        SizeNumBox<NumBox> sizeNumBox1 = new SizeNumBox<>(i);
        sizeNumBox1.setVelichina(0, new NumBox(1));
        sizeNumBox1.setVelichina(1, new NumBox(2));
        sizeNumBox1.setVelichina(2, new NumBox(3));


        sizeNumBox1.add(3, new NumBox(3));
        System.out.println(sizeNumBox1.getVelichina(1));
        System.out.println("Длина массива - " + sizeNumBox1.lenfht());
        System.out.println("Сумма массива - "+sizeNumBox1.summ());
        System.out.println("Среднее значение массива - "+sizeNumBox1.average());



    }
}
