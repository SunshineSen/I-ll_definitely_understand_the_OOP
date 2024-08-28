package Lec8_Sem.Home;

import java.util.Comparator;

public class FlowComporator implements Comparator<Flow> {

    @Override
    public int compare(Flow o1, Flow o2) {
        int resultOfCompareGr1 = o1.getStudentGroupList().size();
        int resultOfCompareGr2 = o2.getStudentGroupList().size();

        return Integer.compare(resultOfCompareGr1, resultOfCompareGr2);
    }

}
