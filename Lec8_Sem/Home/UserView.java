package Lec8_Sem.Home;

import java.util.List;

public interface UserView<T extends User>{

    void sendOnConsole(List<T> list);


}
