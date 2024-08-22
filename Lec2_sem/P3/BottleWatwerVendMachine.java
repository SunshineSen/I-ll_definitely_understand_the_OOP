package Lec2_sem.P3;

import java.util.List;


public class BottleWatwerVendMachine implements vendMachine{

    private final List<Product> productList;

    private Integer money;

    public BottleWatwerVendMachine(List<Product> productList){
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for(Product product : productList) {
            if (product.getName().equals(name)) {
                money += product.getPrice();
                return product;
            }
        }
        return null;
    }
    
}
