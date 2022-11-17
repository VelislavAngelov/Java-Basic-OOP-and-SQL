package task_6_AccessControl.student3;

public class Student {
    private String lastName;
    private String firstName;
    private int age;
    private int schoolClass;
    private  double average;

    public Student(String lastName, String firstName, int age, int schoolClass,double average) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.schoolClass = schoolClass;
        this.average=average;
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

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        if(average>=2&&average<=6){
            this.average = average;
        }
    }
    public  void  isExcellent(){
        if(average>=5.50){

            System.out.printf("Name: %s %s this student is excellent: %.2f \n",getFirstName(),getLastName(),getAverage());
        }
    }
    public  void  isVeryBad(){
        if(average<2.50){

            System.out.printf("Name: %s %s this student is very bad: %.2f\n",getFirstName(),getLastName(),getAverage());
        }
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
            System.out.println("Finish school");
        }
    }


    @Override
    public String toString() {

        return "Student: " +
                "lastName: " + lastName + '\n' +
                "firstName: " + firstName + '\n' +
                "age: " + age + '\n' +
                "schoolClass: " + schoolClass + '\n'+
                "average: " + average;
    }
}
