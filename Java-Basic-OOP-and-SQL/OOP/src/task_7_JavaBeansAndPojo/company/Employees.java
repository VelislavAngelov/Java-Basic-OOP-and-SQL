package task_7_JavaBeansAndPojo.company;

import java.util.List;

public class Employees {

    private String firstName;
    private String lastName;
    private int age;
    private String position;
    private double salary;
    private int internship;
    private List<Cars> cars;


    public Employees() {
    }

    public Employees(String firstName, String lastName, int age, String position, double salary, int internship, List<Cars> cars) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
        setSalary(salary);
        this.internship = internship;
        this.cars = cars;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (isNullOrEmpty(firstName)) {
            this.firstName = firstName;
        }

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (isNullOrEmpty(lastName)) {
            this.lastName = lastName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age < 120) {

            this.age = age;
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (isNullOrEmpty(position)) {
            this.position = position;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if (salary < 740) {
            salary = 740;
        }
        if (position.equals("secretary")) {
            salary = 3000;
            if (age >= 18 && age < 25) {
                salary = 4000;
            }

        }
        if (position.equals("employee")) {
            salary = 2500;
            if (internship > 5) {
                salary = salary * 1.2;
            }
        }
        if (position.equals("Team leader")) {

            salary = 5000;
            if (internship > 5) {
                salary = salary * 1.2;
            }
        }
        if(position.equals("boss")){

            salary = 10000;
            if (internship > 5) {
                salary = salary * 1.3;
            }
        }
        this.salary = salary;
    }

    public int getInternship() {
        return internship;
    }

    public void setInternship(int internship) {
        if (internship >= 0) {
            this.internship = internship;
        }

    }

    public List<Cars> getCars() {
        return cars;
    }

    public void setCars(List<Cars> cars) {
        this.cars = cars;
    }

    public static boolean isNullOrEmpty(String string) {

        return string != null && !string.trim().isEmpty();
    }

    @Override
    public String toString() {
        return "Employees: " + "\n" +
                "firstName: " + firstName + '\n' +
                "lastName: " + lastName + '\n' +
                "age: " + age + '\n' +
                "position: "+ position + '\n' +
                "salary: " + salary+ '\n' +
                "internship: " + internship + '\n' +
                  cars;
    }
}
