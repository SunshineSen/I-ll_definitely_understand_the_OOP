package Lec8_Sem.P3;

public interface UserController<T extends User>{


    void create(String firstName, String lastName, String middleName);

}
