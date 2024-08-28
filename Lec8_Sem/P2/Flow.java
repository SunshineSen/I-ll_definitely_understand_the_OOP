package Lec8_Sem.P2;

import java.util.Iterator;
import java.util.List;

public class Flow implements Iterable<StudentGroup> {
    private String groups;
    private List<StudentGroup> StudentGroupList;


    public Flow(String groups, List<StudentGroup> StudentGroupList) {
        this.groups = groups;
        this.StudentGroupList = StudentGroupList;
    }

    public String getGroups() {
        return groups;
    }

    public List<StudentGroup> getStudentGroupList() {
        return StudentGroupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return StudentGroupList.iterator();
    }
}
   