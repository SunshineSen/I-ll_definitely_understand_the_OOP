package Lec10_Sem.Home.Service;


import java.util.ArrayList;
import java.util.List;

import Lec10_Sem.Home.Model.Student;
import Lec10_Sem.Home.Model.Teacher;
import Lec10_Sem.Home.Model.Type;
import Lec10_Sem.Home.Model.User;

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

    public List<Teacher> getAllTeacher(){
        List<Teacher> teachers = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Teacher){
                teachers.add((Teacher) user);
            }
        }
        return teachers;
    }

    private int getFreeID(Type type) {
        Integer maxID = 0;
        Integer currentID = 0;
        boolean itsTeacher = type == Type.TEACHER;
        for (User user: userList) {
            if (itsTeacher && user instanceof Teacher) {
                currentID = ((Teacher) user).getTeacherId();
            }
            if (!itsTeacher && user instanceof Student) {
                currentID = ((Student) user).getStudentId();
            }
            if (maxID < currentID) {
                maxID = currentID;
            }
        }
        return maxID + 1;
    }
}

