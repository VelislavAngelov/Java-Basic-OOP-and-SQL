package task_14_Nested_Inner_local_And_Anonymous_Classes.task_EmployeeNested;

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

    public static class EmployeeNameComparator implements Comparator<EmployeeTest> {

        @Override
        public int compare(EmployeeTest o1, EmployeeTest o2) {
            return o1.name.compareTo(o2.name);
        }

    }

    public static class EmployeeSalaryComparator implements Comparator<EmployeeTest> {

        @Override
        public int compare(EmployeeTest o1, EmployeeTest o2) {
            return (int) o2.salary - (int) o1.salary;
        }
    }

//    private static class EmployeeByName implements Comparator<EmployeeTest>{
//
//         String name;
//         double salary;
//
//
//        @Override
//        public int compare(EmployeeTest o1, EmployeeTest o2) {
//            return name.compareTo(name);
//        }
//    }
//    private List<EmployeeByName> employee=new ArrayList<>();
//
//    public void addEmploye(String name,double salary){
//
//        EmployeeByName employeeByName=new EmployeeByName();
//        employeeByName.name=name;
//        employeeByName.salary=salary;
//        employee.add(employeeByName);
//    }
}
