package Lec8_Sem.P2;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {

    private List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StGroupIterator(this);
    }

}
