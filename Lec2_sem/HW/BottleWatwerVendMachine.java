package Lec2_sem.HW;

import java.util.ArrayList;
import java.util.List;


public class BottleWatwerVendMachine implements vendMachine {
    List<BottleWater> bottleOfWaterList = new ArrayList<>();


    @Override
    public void initProduct() {
    }


    public void initProduct(List<BottleWater> bottle) {
        this.bottleOfWaterList = bottle;
    }


    @Override
    public String getProduct() {
        return null;
    }

    public String getProduct(String name) {
        for (BottleWater el : bottleOfWaterList) {
            if (el.getName().equals(name)) return el.toString();
        }
        return "Не найдено";
    }
}