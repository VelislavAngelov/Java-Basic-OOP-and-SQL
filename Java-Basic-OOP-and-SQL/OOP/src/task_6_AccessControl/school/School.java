package task_6_AccessControl.school;

import java.util.ArrayList;

public class School {
    private  String name;
    private ArrayList<Student> students;
    private ArrayList<Integer> schoolClasses;

    public School() {
    }

    public School(String name, ArrayList<Student> students, ArrayList<Integer> schoolClasses) {
        this.name = name;
        this.students = students;
        this.schoolClasses = schoolClasses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Integer> getSchoolClasses() {
        return schoolClasses;
    }

    public void setSchoolClasses(ArrayList<Integer> schoolClasses) {
        this.schoolClasses = schoolClasses;
    }
}
