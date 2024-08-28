package Lec8_Sem.Home;

public interface UserController<T extends User>{


    void create(String firstName, String lastName, String middleName);

}
