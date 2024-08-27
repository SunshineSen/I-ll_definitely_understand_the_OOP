package Lec6_Sem.Home;

import java.util.List;

public class Controller {
    private final StGroupService stGroupService = new StGroupService();

    public void removeStByFIO(String firstName, String lastName, String middleName) {
        stGroupService.removeStByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList() {
        return stGroupService.getSortedStudentList();
    }

    public List<Student> getSortedStudentBYFIO() {
        return stGroupService.getSortedStudentBYFIO();
    }

    private FlowService flowService;

    public Controller(FlowService flowService) {
        this.flowService = flowService;
    }

    public List<Flow> sortFlows(List<Flow> flows) {

        return flowService.sortFlows(flows);
    }
    
}
