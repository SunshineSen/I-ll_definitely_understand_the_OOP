package Lec8_Sem.P2;

import java.util.Iterator;
import java.util.List;

public class StGroupIterator implements Iterator<Student>{

    private int count;
    private final List<Student> studentList;


    public StGroupIterator(StudentGroup studentGroup) {
        this.count = 0;
        this.studentList = studentGroup.getStudentList();
    }

    @Override
    public boolean hasNext() {
        return count < studentList.size() - 1;
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        count++;
        return studentList.get(count);
    }

    @Override
    public void remove() {
        studentList.remove(count);
    }


}
