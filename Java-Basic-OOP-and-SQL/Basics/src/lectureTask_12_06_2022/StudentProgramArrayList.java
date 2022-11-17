package lectureTask_12_06_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentProgramArrayList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> grades = new ArrayList<>();

        int option;

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter name:");
            names.add(scanner.nextLine());
            System.out.print("Enter a grade:");
            grades.add(Integer.parseInt(scanner.nextLine()));
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
                case 6:
                    System.out.println("Exiting!");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        } while (option != 6);
    }

    private static void printMenu() {

        System.out.println("1. Average grades:");
        System.out.println("2. Highest grade:");
        System.out.println("3. Number with highest grades:");
        System.out.println("4. Failed students list:");
        System.out.println("5. Add bonus:");
        System.out.println("6. Exit:");
        System.out.print("Please choose an option: ");
    }

    public static void bonusGrade(ArrayList<Integer> grades){

        int oldGrade;
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) == 2 || grades.get(i) == 3) {
                oldGrade = grades.get(i);
                grades.set(i, oldGrade + 1);
            }
        }
    }
    public static double getAverageScore(ArrayList<Integer> grades) {

        double sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }

    public static int getHighestGrade(ArrayList<Integer> grades) {

        int highest = 2;

        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }

        return highest;
    }

    public static int getNumberWithHighestGrade(ArrayList<Integer> grades) {

        int highest = getHighestGrade(grades);
        int counter = 0;

        for (int i = 0; i < grades.size(); i++) {

            if (grades.get(i) == highest) {
                counter++;
            }
        }
        return counter;
    }

    public static String printNames(ArrayList<String> names, ArrayList<Integer> grades) {

        StringBuilder failedStudents = new StringBuilder();

        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) == 2) {
                failedStudents.append(names.get(i) + " ");
            }
        }
        return failedStudents.toString();
    }
}
