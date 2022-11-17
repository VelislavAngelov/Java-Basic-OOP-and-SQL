package task_19_Tasks_For_Independent_Preparation.task_1;

public class Measurables {


    public Measurables() {
    }

    double average(Measurable[] objects) {

        Employee employee;
        double salary = 0;

        for (Measurable object : objects) {

            employee = (Employee) object;
            salary += employee.getSalary();
        }
        return salary / objects.length;
    }

    String largest(Measurable[] objects) {
        Employee employee ;
        String name = null;
        int salaryMax = Integer.MIN_VALUE;

        for (Measurable object : objects) {

            employee = (Employee) object;
            int salary = employee.getSalary();
            if (salary > salaryMax) {
                name = employee.getFirstName() + " " + employee.getSecondName();
            }
        }

        return name;
    }
}
