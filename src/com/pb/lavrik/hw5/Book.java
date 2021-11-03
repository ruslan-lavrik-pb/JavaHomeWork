package com.pb.lavrik.hw5;

public class Book {
    private String nazvaKnigi;
    private String avtorKnigi;
    private String godIzdanija;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Book(String nazvaKnigi, String avtorKnigi, String godIzdanija) {
        this(nazvaKnigi, avtorKnigi);
        this.godIzdanija = godIzdanija;

    }

    public Book(String nazvaKnigi, String avtorKnigi) {
        this.nazvaKnigi = nazvaKnigi;
        this.avtorKnigi = avtorKnigi;
    }


    public String getNazvaKnigi() {
        return nazvaKnigi;
    }

    public String getAvtorKnigi() {
        return avtorKnigi;
    }

    public String getGodIzdanija() {
        return godIzdanija;
    }


}
