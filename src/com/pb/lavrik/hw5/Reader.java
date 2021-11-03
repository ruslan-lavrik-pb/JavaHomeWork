package com.pb.lavrik.hw5;

public class Reader {
    private String fioName;
    private String namberTiket;
    private String fakyltetName;
    private String dataHeppiBezd;
    private String telefonNamder;

    public Reader(String fioName, String namberTiket, String fakyltetName, String dataHeppiBezd, String telefonNamder) {
        this.fioName = fioName;

    }

    public String getFioName() {
        return fioName;
    }


    public void setFioName(String fioName) {
        this.fioName = fioName;
    }

    public String getNamberTiket() {
        return namberTiket;
    }

    public void setNamberTiket(String namberTiket) {
        this.namberTiket = namberTiket;
    }

    public String getFakyltetName() {
        return fakyltetName;
    }

    public void setFakyltetName(String fakyltetName) {
        this.fakyltetName = fakyltetName;
    }

    public String getDataHeppiBezd() {
        return dataHeppiBezd;
    }

    public void setDataHeppiBezd(String dataHeppiBezd) {
        this.dataHeppiBezd = dataHeppiBezd;
    }

    public String getTelefonNamder() {
        return telefonNamder;
    }

    public void setTelefonNamder(String telefonNamder) {
        this.telefonNamder = telefonNamder;
    }


}
