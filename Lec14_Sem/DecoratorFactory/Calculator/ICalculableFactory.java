package Lec14_Sem.DecoratorFactory.Calculator;

public interface ICalculableFactory {
    Calculable create(int primaryArg);
}