package Lec8_Sem.Home;

import java.util.List;

public class FlowService {

    public List<Flow> sortFlows(List<Flow> flows) {
        flows.sort(new FlowComporator());

        return flows;

    }

}
