package Lec14_Sem.DecoratorFactory.Calculator;

public class ConsoleLogger implements Logable{

    @Override
    public void log(String message) {
        System.out.println("LOG" + message);
    
    }

  

}
