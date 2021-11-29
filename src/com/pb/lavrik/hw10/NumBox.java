package com.pb.lavrik.hw10;

public class NumBox <T extends Number> {

    private T velichina;

    public NumBox(T velichina) {
        this.velichina = velichina;
    }

    public T getVelichina() {
        return velichina;
    }

    public void setVelichina(T velichina) {
        this.velichina = velichina;
    }
}
