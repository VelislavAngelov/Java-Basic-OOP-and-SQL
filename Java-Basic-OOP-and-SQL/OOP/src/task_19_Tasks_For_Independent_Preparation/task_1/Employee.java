package task_19_Tasks_For_Independent_Preparation.task_1;

public class Employee implements Measurable {
    private final String firstName;
    private final String secondName;
    private final int salary;


    public Employee(String firstName, String secondName, int salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getSalary() {
        return salary;
    }

}
