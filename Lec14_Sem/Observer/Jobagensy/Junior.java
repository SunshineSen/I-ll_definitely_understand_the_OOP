package Lec14_Sem.Observer.Jobagensy;

import java.util.Random;

public class Junior implements Observer{

    private String name;

    
    public Junior(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (new Random().nextBoolean()) {
            System.out.println("Jun принял оффер! Company, salary: " + nameCompany + salary + "Имя джуна: " + name);
        } else {
            System.out.println("Jun НЕ принял оффер! Company, salary: " + nameCompany + salary + "Имя джуна: " + name);            
        }

    }
    

}
