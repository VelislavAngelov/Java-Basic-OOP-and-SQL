package task_19_Tasks_For_Independent_Preparation.task_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> testList = new ArrayList<>();


        testList.add(new Employee("Ivan", 1500));
        testList.add(new Employee("Dragan", 2500));
        testList.add(new Employee("Ivanka", 3500));
        testList.add(new Employee("Petar", 5500));
        testList.add(new Employee("Asen", 7500));



        testList.sort(new EmployeeNameComparator());

        System.out.println("Sort by name:");
        for (Employee name : testList) {

            System.out.println(name.getName() + " - " + name.getSalary());
        }

        System.out.println();
        testList.sort(new EmployeeNameComparator());
        System.out.println("Sort by salary:");
        for (Employee salary : testList) {

            System.out.println(salary.getName() + " - " + salary.getSalary());
        }
    }
}
