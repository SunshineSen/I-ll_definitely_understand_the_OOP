package Lec8_Sem.P2;

import java.util.List;

public class StudentView implements UserView<Student>{

    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student student: list) {
            System.out.println(student.getStudeniId());
        }
    
        
    }
    

}
