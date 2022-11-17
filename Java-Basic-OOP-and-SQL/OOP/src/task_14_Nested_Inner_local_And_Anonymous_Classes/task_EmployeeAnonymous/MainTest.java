package task_14_Nested_Inner_local_And_Anonymous_Classes.task_EmployeeAnonymous;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {

        List<EmployeeTest> testList = new ArrayList<>();

        testList.add(new EmployeeTest("Ivan", 1500));
        testList.add(new EmployeeTest("Dragan", 2500));
        testList.add(new EmployeeTest("Ivanka", 3500));
        testList.add(new EmployeeTest("Petar", 5500));
        testList.add(new EmployeeTest("Asen", 7500));

        System.out.println("List:");
        testList.forEach((e)-> {System.out.println(e.getName() + " - " + e.getSalary());});
        System.out.println();

        testList.sort(EmployeeTest.comparatorByName());

        System.out.println("Sort by name:");
        testList.forEach((e)-> {System.out.println(e.getName() + " - " + e.getSalary());});

        System.out.println();
        testList.sort(EmployeeTest.comparatorBySalary());
        System.out.println("Sort by salary:");

        testList.forEach((e)-> {System.out.println(e.getName() + " - " + e.getSalary());});
    }
}
