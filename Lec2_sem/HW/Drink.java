package Lec2_sem.HW;

import java.math.BigDecimal;

public class Drink extends Product {
    private Double volume;


    public Drink(String name, BigDecimal price, Double volume) {
        super(name, price);
        this.volume = volume;
    }


    public Double getVolume() {
        return volume;
    }


    @Override
    public String toString() {
        return super.toString() + "объем = " + volume + " ";
    }
}

