package Lec14_Sem.Home_itog;

public interface Calculable {

    Calculable sum(Complex arg);
    Calculable multi(Complex arg);
    Calculable div(Complex arg);
    Calculable minus(Complex arg);
    Complex getResult();
    
}