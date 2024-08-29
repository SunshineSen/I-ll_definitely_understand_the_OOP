package Lec10_Sem.inSeminar.Controller;

import java.util.List;

import Lec10_Sem.inSeminar.Model.Student;
import Lec10_Sem.inSeminar.Model.Type;
import Lec10_Sem.inSeminar.Model.User;
import Lec10_Sem.inSeminar.Service.DataService;
import Lec10_Sem.inSeminar.View.StudentView;

public class Controller {

    private final DataService service = new DataService();

    private final StudentView view = new StudentView();

    public void createStudent(String firstName, String lastName, String middleName) {
        service.create(firstName, lastName, middleName, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> userList = service.getAllStudent();
        for(User user: userList) {
            Student student = (Student) user;
            view.printOnConsole(student);

        }
    }
}
