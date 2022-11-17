package task_14_Nested_Inner_local_And_Anonymous_Classes.task_EmployeeNested;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<EmployeeTest> testList = new ArrayList<>();


        testList.add(new EmployeeTest("Ivan", 1500));
        testList.add(new EmployeeTest("Dragan", 2500));
        testList.add(new EmployeeTest("Ivanka", 3500));
        testList.add(new EmployeeTest("Petar", 5500));
        testList.add(new EmployeeTest("Asen", 7500));

        testList.sort(new EmployeeTest.EmployeeNameComparator());

        System.out.println("Sort by name:");
        for (EmployeeTest name : testList) {

            System.out.println(name.getName() + " - " + name.getSalary());
        }

        System.out.println();
        testList.sort(new EmployeeTest.EmployeeSalaryComparator());
        System.out.println("Sort by salary:");
        for (EmployeeTest salary : testList) {

            System.out.println(salary.getName() + " - " + salary.getSalary());
        }

    }
}
