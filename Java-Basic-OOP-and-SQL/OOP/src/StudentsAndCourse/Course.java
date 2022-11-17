package StudentsAndCourse;

import java.util.ArrayList;

public class Course {
    private ArrayList<Student> studentArrayList = new ArrayList<>();

    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }

    public void setStudentArrayList(ArrayList<Student> studentArrayList) {
        this.studentArrayList = studentArrayList;
    }

    public void addStudent(Student student){
        this.studentArrayList.add(student);
    }
    public String removeStudents(){

        StringBuilder sb = new StringBuilder();
        for (int i = this.studentArrayList.size() - 1; i >= 0; i--) {
            if (studentArrayList.get(i).getGrade() == 2){

                sb.append(studentArrayList.get(i).getName()).append(" ");
                studentArrayList.remove(studentArrayList.get(i));
            }
        }
        return sb.toString();
    }

    public void removeGrades(){

        for (Student student:this.studentArrayList){
            if(student.getGrade()==2){
                student.setGrade(0);
            }
        }

    }
    public  void bonusGrade(){

        double oldGrade;
        for (Student grade : this.studentArrayList) {
            if (grade.getGrade() == 2 || grade.getGrade() == 3||grade.getGrade()==0) {

                if(grade.getGrade()==0){
                    grade.setGrade(3);
                }
                else {
                    grade.setGrade(grade.getGrade() + 1);
                }




            }
        }
    }
    public double getAverageGrade() {

        double sum = 0;

        for (Student student : studentArrayList) {
            sum += student.getGrade();
        }

        return sum / studentArrayList.size();
    }

    public double getHighestGrade() {
        double highest=2;
        for (Student grade : studentArrayList) {
            if (grade.getGrade() > highest) {
                highest = grade.getGrade();
            }
        }

        return highest;
    }

    public  int getNumberWithHighestGrade() {

        double highest = getHighestGrade();
        int counter = 0;

        for (Student student : studentArrayList) {

            if (student.getGrade() == highest) {
                counter++;
            }
        }
        return counter;
    }

    public String printNames() {

        StringBuilder failedStudents = new StringBuilder();

        for (Student student : studentArrayList) {
            if (student.getGrade() < 2.49) {
                failedStudents.append(student.getName()).append(" ");
            }
        }
        return failedStudents.toString();
    }


}
