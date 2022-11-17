package task_7_JavaBeansAndPojo.company;

import java.util.List;

public class Office {
    private String name;
    private int capacity;
    private int floor;
    private int officeNumber;
    private List<Employees> employees;


    public Office() {
    }

    public Office(String name, int capacity, int floor, int officeNumber, List<Employees> employees) {
        this.name = name;
        this.capacity = capacity;
        this.floor = floor;
        this.officeNumber = officeNumber;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {

        if (capacity > 0 && capacity <= 20) {
            this.capacity = capacity;
        }
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {

        if (floor >= 0 && floor <= 15) {
            this.floor = floor;
        }
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        if (officeNumber > 0 && officeNumber <= 25) {
            this.officeNumber = officeNumber;
        }
    }

    public List<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employees> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Office: " + '\n' +
                "name: " + name + '\n' +
                "capacity: " + capacity + '\n' +
                "floor: " + floor + '\n' +
                "officeNumber: " + officeNumber + '\n' +
                employees;
    }
}
