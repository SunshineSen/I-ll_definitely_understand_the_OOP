package Lec6_Sem.P4;

import java.util.Comparator;

public class StComporator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
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
