package Lec8_Sem.Home;

public class Teacher extends User{

    private Integer teacherId;

    public Teacher(Integer teacherId, String firstname, String lastName, String middleName) {
        super(firstname, lastName, middleName);
        this.teacherId=teacherId;
    }
    public Integer getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                "firstname='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", middleName='" + super.getMiddleName() + '\'' +
                '}';
    }
}