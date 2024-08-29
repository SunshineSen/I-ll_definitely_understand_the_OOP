package Lec10_Sem.Home.View;

import java.util.List;

import Lec10_Sem.Home.Model.User;

public interface UserView<Us extends User> {
    public void printOnConsole(List<Us> List);

}
