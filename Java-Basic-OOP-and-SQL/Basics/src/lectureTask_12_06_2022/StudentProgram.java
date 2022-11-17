package lectureTask_12_06_2022;

import java.util.Scanner;

public class StudentProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];
        int[] grades = new int[5];

        int option;

        for (int i = 0; i < names.length; i++) {

            System.out.print("Enter name:");
            names[i] = scanner.nextLine();
            System.out.print("Enter a grade:");
            grades[i] = Integer.parseInt(scanner.nextLine());
        }

        do {
            printMenu();

            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    System.out.printf("Average score of all students is: %.2f\n",
                            getAverageScore(grades));
                    break;
                case 2:
                    System.out.printf("The highest grade is: %d\n",
                            getHighestGrade(grades));
                    break;
                case 3:
                    System.out.printf("The count of highest grades is: %d\n",
                            getNumberWithHighestGrade(grades));
                    break;
                case 4:
                    System.out.printf("The failed students are: %s\n",
                            printNames(names, grades));
                    break;
                case 5:
                    System.out.println("Added bonus points to students: ");
                    bonusGrade(grades);
                    break;
                case 6:
                    String[] newNames = removeNames(names, grades);
                    int[] newGrades = removeGrades(names, grades);
                    names = newNames;
                    grades = newGrades;
                    break;
                case 7:
                    printStudents(names, grades);
                    break;
                case 8:
                    System.out.println("Exiting!");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        } while (option != 8);
    }

    private static void printMenu() {

        System.out.println("1. Average grades:");
        System.out.println("2. Highest grade:");
        System.out.println("3. Number with highest grades:");
        System.out.println("4. Failed students list:");
        System.out.println("5. Add bonus:");
        System.out.println("6. Remove grades:");
        System.out.println("7. Print student info:");
        System.out.println("8. Exit:");
        System.out.print("Please choose an option: ");
    }

    public static void printStudents(String[] names, int[] grades){
        for (int i = 0; i < names.length; i++) {
            System.out.printf("Name: %s ; Grade: %d;\n", names[i], grades[i]);
        }
    }

    public static int[] removeGrades(String[] names, int[] grades){

        int counter = 0;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 2) {
                counter++;
            }
        }
        int[] students = new int[grades.length - counter];

        for (int i = 0, j = 0; i < grades.length; i++) {
            if (grades[i] > 2){
                students[j++] = grades[i];
            }
        }
        return  students;
    }

    public static String[] removeNames(String[] names, int[] grades){

        int counter = 0;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 2) {
                counter++;
            }
        }
        String[] students = new String[grades.length - counter];

        for (int i = 0, j = 0; i < grades.length; i++) {
            if (grades[i] > 2){
                students[j++] = names[i];
            }
        }
        return  students;
    }

    public static void bonusGrade(int[] grades){

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 2 || grades[i] == 3) {
                grades[i] += 1;
            }
        }
    }
    public static double getAverageScore(int[] grades) {

        double sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return sum / grades.length;
    }

    public static int getHighestGrade(int[] grades) {

        int highest = 2;

        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }

        return highest;
    }

    public static int getNumberWithHighestGrade(int[] grades) {

        int highest = getHighestGrade(grades);
        int counter = 0;

        for (int i = 0; i < grades.length; i++) {

            if (grades[i] == highest) {
                counter++;
            }
        }
        return counter;
    }

    public static String printNames(String[] names, int[] grades) {

        StringBuilder failedStudents = new StringBuilder();

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 2) {
                failedStudents.append(names[i] + " ");
            }
        }
        return failedStudents.toString();
    }

}
