package com.pb.lavrik.hw8;

public class WrongPasswordException extends Exception{
    private boolean priznak;


    public WrongPasswordException(String messedg) {
        super(messedg);
    }

    public WrongPasswordException(boolean priznak) {
        this.priznak = priznak;
    }


    public boolean getAmount (){
        return priznak;
    }
}
