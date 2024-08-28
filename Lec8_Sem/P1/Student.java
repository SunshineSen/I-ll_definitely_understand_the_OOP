package Lec8_Sem.P1;

public class Student extends User implements Comparable<Student>{

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
