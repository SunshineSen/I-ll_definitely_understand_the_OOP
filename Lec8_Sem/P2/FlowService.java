package Lec8_Sem.P2;

import java.util.List;

public class FlowService {

    public List<Flow> sortFlows(List<Flow> flows) {
        flows.sort(new FlowComporator());

        return flows;

    }

}
