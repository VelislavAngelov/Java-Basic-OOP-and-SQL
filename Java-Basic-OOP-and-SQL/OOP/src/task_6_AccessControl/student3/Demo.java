package task_6_AccessControl.student3;


import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<Student> studentList=new ArrayList<>();
       Student student1=new Student("Ivanov","Ivan",19,11,2.40);
       Student student2=new Student("Angelov","Petar",20,2,5.55);
       Student student3=new Student("Petrov","Angel",21,3,5.88);
       studentList.add(student1);
       studentList.add(student2);
       studentList.add(student3);

       for (Student ignored :studentList){
           ignored.isExcellent();
       }
        for (Student ignored :studentList){
            ignored.isVeryBad();
        }
    }

}
