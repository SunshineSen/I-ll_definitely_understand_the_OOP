package Lec2_sem.P4;

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

    public BottleWater getProduct(String name, int volume) {
        for(Product product : productList) {
            if (product instanceof BottleWater) {
                if (product.getName().equals( name) && ((BottleWater)product).getVolume() == volume) {
                    return (BottleWater) product;
                }
            }
        }
        return null;       
    }
    
}
