package task_19_Tasks_For_Independent_Preparation.task_2;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return  o1.getName().compareTo(o2.getName());
    }
}
