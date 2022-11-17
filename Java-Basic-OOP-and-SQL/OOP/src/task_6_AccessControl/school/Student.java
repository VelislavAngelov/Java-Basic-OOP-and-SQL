package task_6_AccessControl.school;

public class Student {
    private static int numberStudent;
    private String lastName;
    private String firstName;
    private int age;
    private int schoolClass;

    public Student(String lastName, String firstName, int age, int schoolClass) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.schoolClass = schoolClass;
        numberStudent++;
    }

    public static int getNumberStudent() {
        return numberStudent;
    }

    public static void setNumberStudent(int numberStudent) {
        Student.numberStudent = numberStudent;
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
    public void increaseAge(){
        setAge(age+1);
    }

    public void increaseAge(int years){
        setAge(age+years);
    }

    public void goToNextClass(){
        if(this.schoolClass<12){

            setSchoolClass(this.schoolClass+1);
        }
        else {
            System.out.println("Йееейй! Завърших!");
        }
    }


    @Override
    public String toString() {
        String student = "Student: " +
                "lastName: " + lastName + '\n' +
                "firstName: " + firstName + '\n' +
                "age: " + age + '\n' +
                "schoolClass: " + schoolClass + '\n';

        return student.toString();
    }
}
