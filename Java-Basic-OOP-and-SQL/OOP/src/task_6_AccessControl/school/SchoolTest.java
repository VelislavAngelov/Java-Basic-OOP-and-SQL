package task_6_AccessControl.school;

import java.util.ArrayList;
import java.util.List;

public class SchoolTest {
    public static void main(String[] args) {

        School school =new School();
        ArrayList<Student> students= new ArrayList<>();
        ArrayList<Integer> studentClass=new ArrayList<>();



        Student student = new Student("Ivanov","Ivan",19,11);;
        Student student1 = new Student("Angelov","Petar",20,2);
        Student student2 = new Student("Petrov","Angel",21,3);
        studentClass.add(student.getSchoolClass());
        studentClass.add(student1.getSchoolClass());
        studentClass.add(student2.getSchoolClass());
        students.add(student);
        students.add(student1);
        students.add(student2);
        school.setStudents(students);
        school.setSchoolClasses(studentClass);


        System.out.println(Student.getNumberStudent());
        student.goToNextClass();
        System.out.println(student);
        student.goToNextClass();
        System.out.println(students);
        System.out.println(school.getSchoolClasses());
    }
}
