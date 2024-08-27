package Lec6_Sem.P2;

import java.util.Iterator;

public class StGroupService {

    private StudentGroup studentGroup;

    public void removeStByFIO(String firstName, String lastName, String middleName) {

        Iterator<Student> iterator = studentGroup.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName) && student.getMiddleName().equals(middleName)) {
                iterator.remove();
                
            }

        }
    }

}
