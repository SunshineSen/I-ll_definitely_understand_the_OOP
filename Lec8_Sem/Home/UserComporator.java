package Lec8_Sem.Home;

import java.util.Comparator;

public class UserComporator<T extends User> implements Comparator<T>{

    @Override
    public int compare(T o1, T o2) {
        int resultOfCompare = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultOfCompare == 0) {
            resultOfCompare = o1.getLastName().compareTo(o2.getLastName());
            if (resultOfCompare == 0) {
                return o1.getMiddleName().compareTo(o2.getMiddleName());
            } else {
                return resultOfCompare;
            }

        } else {
            return resultOfCompare;
        }

    }

 
}
