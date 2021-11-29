package com.pb.lavrik.hw10;

public class SizeNumBox<T extends NumBox> {

    private T[] velichina;

    public SizeNumBox(int size) {
        velichina = (T[]) new NumBox[size];
    }

    public T getVelichina(int index) {
        return velichina[index];
    }

    public void setVelichina(int index, T velichina) {
        this.velichina[index] = velichina;
    }

    public void add(int index, T velichina) {

        try {
            this.velichina[index] = velichina;
        } catch (Exception e) {
            System.out.println("Вы вышли за предел массива - " + e);
        }
        ;
    }

    public int lenfht(T[]) {
        int index = 0;

        while (true) {
            try {
                velichina = this.velichina[index];
                index = index + 1;
            } catch (Exception e) {
                return index;

            }

        }
    }


    public double summ(T[]) {
        int index = 0;
        while (true) {
            try {
                velichina = this.velichina[index];
                index = index + 1;
            } catch (Exception e) {
                return velichina;
            }
        }
    }

    public double average(T[]) {
        int index = 0;
        while (true) {
            try {
                velichina = this.velichina[index];
                index = index + 1;
            } catch (Exception e) {
                return velichina/index;
            }
        }
    }

}
