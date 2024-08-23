package Lec2_sem.HW;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BottleWatwerVendMachine vmBottle = new BottleWatwerVendMachine();
        List<BottleWater> bottleList = new ArrayList<>(Arrays.asList(
                new BottleWater(prod.Water.toString(), new BigDecimal(3), 0.5),
                new BottleWater(prod.Lemonade.toString(), new BigDecimal(3.5), 0.45),
                new BottleWater(prod.GasWater.toString(), new BigDecimal(3), 0.43),
                new BottleWater("Освежающий напиток", new BigDecimal(1.5), 0.5)));
        vmBottle.initProduct(bottleList);
        System.out.println(vmBottle.getProduct("Освежающий напиток"));


        HotVendMachine vmHotDrinks = new HotVendMachine();
        List<HotDrink> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrink("Coffee", new BigDecimal(3), 0.3, 90),
                new HotDrink("Tea", new BigDecimal(1), 0.4, 80),
                new HotDrink("BubbleTea", new BigDecimal(3), 0.6, 70)));
        vmHotDrinks.initProduct(hotDrinksList);
        System.out.println("Поиск по названию: " + vmHotDrinks.getProduct("Coffee"));
        System.out.println("Поиск по цене <=: " + vmHotDrinks.getProduct(new BigDecimal(2.5)));
        System.out.println("Поиск по температуре <=: " + vmHotDrinks.getProduct(70));
    }

    enum prod {
        Water,
        Lemonade,
        GasWater,
    }
}