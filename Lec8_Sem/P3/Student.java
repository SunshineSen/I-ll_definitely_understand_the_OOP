package Lec8_Sem.P3;

public class Student extends User implements Comparable<Student>{

    public Student(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);

    }

    private Long studeniId;

    
    public Long getStudeniId() {
        return studeniId;
    }
    public void setStudeniId(Long studeniId) {
        this.studeniId = studeniId;
    }

    @Override
    public int compareTo(Student o) {
        return this.studeniId.compareTo(o.studeniId );

    }

}
