package Lec6_Sem.P3;

import java.util.List;

public class Controller {
    private final StGroupService stGroupService = new StGroupService();

    public void removeStByFIO(String firstName, String lastName, String middleName) {
        stGroupService.removeStByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList() {
        return stGroupService.getSortedStudentList();
    }
}
