package Lec10_Sem.Home.Controller;

import java.util.ArrayList;
import java.util.List;

import Lec10_Sem.Home.Model.Student;
import Lec10_Sem.Home.Model.Teacher;
import Lec10_Sem.Home.Model.Type;

import Lec10_Sem.Home.Service.DataService;
import Lec10_Sem.Home.Service.StGroupService;
import Lec10_Sem.Home.View.StGroupView;
import Lec10_Sem.Home.View.StudentView;
import Lec10_Sem.Home.View.TeacherView;

public class Controller {

    private final DataService service = new DataService();
    private final StGroupService stGroupService = new StGroupService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    private final StGroupView stGroupView = new StGroupView();



    public void createStudent(String firstName, String lastName, String middleName) {
        service.create(firstName, lastName, middleName, Type.STUDENT);
    }

    public void createTicher(String firstName, String lastName, String middleName) {
        service.create(firstName, lastName, middleName, Type.TEACHER);
    }

    public void getAllStudent() {
        studentView.printOnConsole((Student) service.getAllStudent());
    }

    public void getAllTeacher () {
        teacherView.printOnConsole(service.getAllTeacher());
    }

    public void createStGroup(int teacherID, List<Integer> studentIDList) {

        Teacher teacher = (Teacher) service.getUserByID(Type.TEACHER, teacherID);
        List<Student> studentList = new ArrayList<>();

        for (int id:studentIDList) {
            studentList.add((Student) service.getUserByID(Type.STUDENT, id));
        }
        stGroupService.createStudentGroup(teacher, studentList);
    }
    public void printStudentGroup(){
        stGroupView.printOnConsole(stGroupService.getStudentGroup());
    }
}