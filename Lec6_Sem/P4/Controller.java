package Lec6_Sem.P4;

import java.util.List;

public class Controller {
    private final StGroupService stGroupService = new StGroupService();

    public void removeStByFIO(String firstName, String lastName, String middleName) {
        stGroupService.removeStByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList() {
        return stGroupService.getSortedStudentList();
    }

    public List<Student> getSortedStudentBYFIO() {
        return stGroupService.getSortedStudentBYFIO();
    }
}
