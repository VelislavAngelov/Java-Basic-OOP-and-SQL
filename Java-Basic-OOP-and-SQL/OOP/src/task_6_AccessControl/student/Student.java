package task_6_AccessControl.student;

public class Student {
    private String lastName;
    private String firstName;
    private int age;
    private int schoolClass;

    public Student(String lastName, String firstName, int age, int schoolClass) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.schoolClass = schoolClass;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(int schoolClass) {
        this.schoolClass = schoolClass;
    }

    @Override
    public String toString() {
        String student = "Student: " + '\n' +
                "lastName: " + lastName + '\n' +
                "firstName: " + firstName + '\n' +
                "age: " + age + '\n' +
                "schoolClass: " + schoolClass + '\n';

        return student.toString();
    }
}
