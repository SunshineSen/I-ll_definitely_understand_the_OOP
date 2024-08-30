package Lec12_Sem;

import java.util.Comparator;

public class UserComporator<T extends User> implements Comparator<T>{

    @Override
    public int compare(T o1, T o2) {

        String nameOne = o1.getFirstName() + o1.getLastName() + o1.getMiddleName();
        String nameTwo = o2.getFirstName() + o2.getLastName() + o2.getMiddleName();
        return nameOne.compareToIgnoreCase(nameTwo);

    }

 
}
/*Класс выполняет функцию сравнения по ФИО, таким образом выполняет только одну задачу (принцип Single responsibility) */
/*Класс содержит только те методы, которые необходимы для реализации его функций (принцип Interface segregation) */
/*Класс не зависит от других классов (принцип Dependly inversion) */