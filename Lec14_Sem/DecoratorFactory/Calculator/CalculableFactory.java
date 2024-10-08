package Lec14_Sem.DecoratorFactory.Calculator;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}