package task_6_AccessControl.student2;

public class StudentTest {

    public static void main(String[] args) {

        Student student1=new Student("Ivanov","Ivan",19,11);
        Student student2=new Student("Angelov","Petar",20,2);
        Student student3=new Student("Petrov","Angel",21,3);

        System.out.println(student1);
        student1.goToNextClass();
        System.out.println(student1);
        student1.goToNextClass();

        student2.increaseAge();
        System.out.println(student2);


        student3.increaseAge(2);
        System.out.println(student3);
       // System.out.println(student3);
    }
}
