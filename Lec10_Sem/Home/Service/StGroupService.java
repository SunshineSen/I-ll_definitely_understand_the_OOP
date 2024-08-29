package Lec10_Sem.Home.Service;

import java.util.List;

import Lec10_Sem.Home.Model.Student;
import Lec10_Sem.Home.Model.StudentGroup;
import Lec10_Sem.Home.Model.Teacher;

public class StGroupService {

    private final StudentGroup studentGroup = new StudentGroup();
    private int maxGroupID = 0;
    public void createStudentGroup(Teacher teacher, List<Student> studentList){
        studentGroup.setGroupID(++maxGroupID);
        studentGroup.setTeacher(teacher);
        studentGroup.setStudentList(studentList);
    }
    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

}
