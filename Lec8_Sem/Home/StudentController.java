package Lec8_Sem.Home;

import java.util.List;

public class StudentController implements UserController<Student>{

    private final StGroupService stGroupService = new StGroupService();

    private final FlowService flowService = new FlowService();

    private final StudentView studentView = new StudentView();

    public void removeStByFIO(String firstName, String lastName, String middleName) {
        stGroupService.removeStByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList() {
        List<Student> studentList = stGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentBYFIO() {
        List<Student> studentList = stGroupService.getSortedStudentBYFIO();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<Flow> sortFlows(List<Flow> flows) {

        return flowService.sortFlows(flows);
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {

        stGroupService.createStudent(firstName, lastName, middleName);
    }
    
}
