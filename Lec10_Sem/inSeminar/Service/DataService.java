package Lec10_Sem.inSeminar.Service;


import java.util.ArrayList;
import java.util.List;

import Lec10_Sem.inSeminar.Model.Student;
import Lec10_Sem.inSeminar.Model.Teacher;
import Lec10_Sem.inSeminar.Model.Type;
import Lec10_Sem.inSeminar.Model.User;

public class DataService {

    private List<User> userList;

    public void create(String firstName, String lastName, String middleName, Type type) {
        int id = getFreeID(type);
        if(Type.STUDENT == type) {
            Student student = new Student(firstName, lastName, middleName, id);
            userList.add(student);
        }

        if(Type.TEACHER == type) {
            Teacher teacher = new Teacher(firstName, lastName, middleName, id);
            userList.add(teacher);
        }

    }

    public User getUserByID(Type type, int id){    
        boolean itsStudent = Type.STUDENT == type;
        User currentUser = null;

        for (User user : userList) {
            if (user instanceof Teacher && itsStudent && ((Teacher) user).getTeacherId() == id) {
                currentUser = user;
            }
            if (user instanceof Student && itsStudent && ((Student) user).getStudentId() == id) {
                currentUser = user;
            }
       }
       return currentUser;
    }

    public List<User> getAllUsers() {
        return userList;
    }

    public List<User> getAllStudent() {
        List<User> students = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student) {
                students.add(user);
            }
        }
        return students;
    }

    private int getFreeID(Type type) {
        boolean itsStudent = Type.STUDENT == type;
        int lastID = 1;
        for (User user : userList) {
            if (user instanceof Teacher && itsStudent) {
                lastID = ((Teacher) user).getTeacherId() + 1;
            }
            if (user instanceof Student && itsStudent) {
                lastID = ((Student) user).getStudentId() + 1;
            }
       }
       return lastID;
    }   
}
