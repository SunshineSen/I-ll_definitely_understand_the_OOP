package Lec14_Sem.Home_itog;

public class Main {
    public static void main(String[] args) {

        ICalculableFactory calculableFactory = new LogCalculableFactory(new FileLogger());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
        
    }
}