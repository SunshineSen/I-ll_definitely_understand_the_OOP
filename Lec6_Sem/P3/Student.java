package Lec6_Sem.P3;

public class Student implements Comparable<Student>{

    private Long studeniId;
    private String firstName;
    private String lastName;
    private String middleName;
    
    public Long getStudeniId() {
        return studeniId;
    }
    public void setStudeniId(Long studeniId) {
        this.studeniId = studeniId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    @Override
    public int compareTo(Student o) {
        return this.studeniId.compareTo(o.studeniId );

    }

}
