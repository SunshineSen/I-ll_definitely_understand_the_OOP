package Lec2_sem.HW;

import java.math.BigDecimal;

public class HotDrink extends Drink {
    private int temp;

    public HotDrink(String name, BigDecimal price, Double volume, int temp) {
        super(name, price, volume);
        this.temp = temp;
    }


    public int getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return super.toString() + "температура напитка = " + temp;
    }
}