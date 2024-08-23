package Lec2_sem.HW;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class HotVendMachine implements vendMachine {
    List<HotDrink> hotDrinksList = new ArrayList<>();
    List<HotDrink> resultFind = new ArrayList<>();


    @Override
    public void initProduct() {
    }


    public void initProduct(List<HotDrink> list) {
        this.hotDrinksList = list;
    }


    @Override
    public String getProduct() {
        return null;
    }


    public String getProduct(String name) {
        resultFind.clear();
        for (HotDrink el : hotDrinksList) {
            if (el.getName().equals(name)) resultFind.add(el);
        }
        return resultFind.toString();
    }


    public String getProduct(BigDecimal price) {
        resultFind.clear();
        for (HotDrink el : hotDrinksList) {
            if (el.getPrice().compareTo(price) <= 0) resultFind.add(el);
        }
        return resultFind.toString();
    }


    public String getProduct(int temp) {
        resultFind.clear();
        for (HotDrink el : hotDrinksList) {
            if (el.getTemp() <= temp) resultFind.add(el);
        }
        return resultFind.toString();
    }
}