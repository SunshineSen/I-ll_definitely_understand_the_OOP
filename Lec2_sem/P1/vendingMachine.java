package Lec2_sem.P1;

import java.util.ArrayList;
import java.util.List;


public class vendingMachine {
    

    List<Product> productList;
    Integer money;


    public Product geProduct(String name) {
        for(Product product : productList) {
            if (product.name.equals(name)) {
                money += product.price;
                return product;
            }


        }
        return null;
    }

    List<Product> initProduct() {
        List<Product> products = new ArrayList<>();
        products.add(new Product());
        products.add(new Product());
        products.add(new Product());
        return products;

    }
}
