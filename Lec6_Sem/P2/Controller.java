package Lec6_Sem.P2;

public class Controller {
    private final StGroupService stGroupService = new StGroupService();

    public void removeStByFIO(String firstName, String lastName, String middleName) {
        stGroupService.removeStByFIO(firstName, lastName, middleName);
    }
}
