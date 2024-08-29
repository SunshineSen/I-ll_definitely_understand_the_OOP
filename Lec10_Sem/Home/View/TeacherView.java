package Lec10_Sem.Home.View;

import java.util.List;

import Lec10_Sem.Home.Model.Teacher;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void printOnConsole(List<Teacher> List) {
        for (Teacher teacher : List) {
            System.out.println(teacher);
        }
    }
}