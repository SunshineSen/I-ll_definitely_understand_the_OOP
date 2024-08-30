package Lec14_Sem.DecoratorFactory.Calculator;

public interface Calculable {
    Calculable sum(int arg);
    Calculable multi(int arg);
    int getResult();
}