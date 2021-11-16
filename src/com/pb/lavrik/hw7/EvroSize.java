package com.pb.lavrik.hw7;

import java.util.Objects;

public class EvroSize {

    private Size size;

    public EvroSize(Size size) {
        this.size = size;
    }



    public void getDescription(Size size){
        EvroSize evroXXS = new EvroSize(Size.XXS);
        if (evroXXS.equals(size)){
            System.out.println("Детский размер"+size);
        }
    System.out.println("Взрослый размер "+size);
}

    public void getEuroSize(Size size){
switch (size){
    case XXS:
        System.out.println(size+" - Размер соответвует - 32");
    case XS:
        System.out.println(size+" - Размер соответвует - 34");
    case S:
        System.out.println(size+" - Размер соответвует - 36");
    case M:
        System.out.println(size+" - Размер соответвует - 38");
    case L:
        System.out.println(size+" - Размер соответвует - 40");
}
    }

    public Size getSize(String size) {
        return this.size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EvroSize evroSize = (EvroSize) o;
        return size == evroSize.size;
    }

    @Override
    public String toString() {
        return "EvroSize{" +
                "size=" + size +
                '}';
    }

}
