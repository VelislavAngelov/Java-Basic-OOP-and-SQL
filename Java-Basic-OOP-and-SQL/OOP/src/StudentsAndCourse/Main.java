package StudentsAndCourse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Course course = new Course();

        Student student1 = new Student("Ivan Ivanov",5.50);
        Student student2 = new Student("Petar Ivanov",4.50);
        Student student3 = new Student("Ivana Angelova",2);
        Student student4 = new Student("Dimitar Iankiev",2);
        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);
        course.addStudent(student4);


        int option;


        do {
            System.out.println(course.getStudentArrayList());
            printMenu();

            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1 -> System.out.printf("Average score of all students is: %.2f\n",
                        course.getAverageGrade());

                case 2->
                    System.out.printf("The highest grade is: %f\n",
                            course.getHighestGrade());

                case 3->
                    System.out.printf("The count of highest grades is: %d\n",
                            course.getNumberWithHighestGrade());

                case 4 -> System.out.printf("The failed students are: %s\n",
                        course.printNames());

                case 5 -> {
                    System.out.println("Added bonus points to students: ");
                    course.bonusGrade();
                }
                case 6 -> System.out.printf("Removed student: %s\n",course.removeStudents());
                case 7-> course.removeGrades();
                case 8 -> System.out.println("Exiting!");
                default -> System.out.println("Invalid option! Please try again.");
            }
        } while (option != 8);
    }

    private static void printMenu() {

        System.out.println("1. Average grades:");
        System.out.println("2. Highest grade:");
        System.out.println("3. Number with highest grades:");
        System.out.println("4. Failed students list:");
        System.out.println("5. Add bonus:");
        System.out.println("6. Remove students: ");
        System.out.println("7. Remove grades: ");
        System.out.println("8. Exit:");
        System.out.print("Please choose an option: ");
    }
}


