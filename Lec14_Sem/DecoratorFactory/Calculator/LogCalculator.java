package Lec14_Sem.DecoratorFactory.Calculator;

public class LogCalculator implements Calculable {

    private Calculable decorated;
    private Logable logger;

    

    public LogCalculator(Calculable decorated, Logable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public int getResult() {
        int result = decorated.getResult();
        logger.log("Получаем результат:" + result);
        return result;

    }

    @Override
    public Calculable multi(int arg) {
        int firstArg = decorated.getResult();
        logger.log("первое значение: " + firstArg + " Начало вывода метода multi с параметром: " + arg);
        Calculable result = decorated.multi(arg);
        logger.log("Вызов метода multi произршел успешно");

        return result;

    }

    @Override
    public Calculable sum(int arg) {
        int firstArg = decorated.getResult();
        logger.log("первое значение: " + firstArg + " Начало вывода метода sum с параметром: " + arg);
        Calculable result = decorated.sum(arg);
        logger.log("Вызов метода sum произршел успешно");

        return result;
    }

    

}
