package task_14_Nested_Inner_local_And_Anonymous_Classes.task_EmployeeAnonymous;

import java.util.Comparator;

public class EmployeeTest {

    private String name;
    private double salary;

    public EmployeeTest() {
    }

    public EmployeeTest(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static Comparator<EmployeeTest> comparatorByName() {

        return new Comparator<>() {
            @Override
            public int compare(EmployeeTest o1, EmployeeTest o2) {
                return o1.name.compareTo(o2.name);
            }
        };

//        return (EmployeeTest o1, EmployeeTest o2)-> {
//
//                return o1.name.compareTo(o2.name);
//
//        };
    }

    public static Comparator<EmployeeTest> comparatorBySalary() {

        return new Comparator<>() {
            @Override
            public int compare(EmployeeTest o1, EmployeeTest o2) {
                return (int) o2.salary - (int) o1.salary;
            }
        };

    }
}
