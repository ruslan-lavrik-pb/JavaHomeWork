package com.pb.lavrik.hw8;

public class WrongLoginException extends Exception{
    private boolean priznak;

    public WrongLoginException(boolean priznak) {
        this.priznak = priznak;
    }

    public WrongLoginException(String messedg) {
        super(messedg);
    }


}
