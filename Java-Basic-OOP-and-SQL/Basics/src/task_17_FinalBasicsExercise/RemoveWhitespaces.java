package task_17_FinalBasicsExercise;

import java.util.Scanner;

public class RemoveWhitespaces {
//Направете програма, която очаква от потребителя да въведе изречение.
//
//След въвеждане на изречението, вашата програма трябва да премахне всички празни
// символи и табулация от изречението и да го отпечата на екрана.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String words = scanner.nextLine();
        words = words.replaceAll("\\s+","");
        System.out.println(words);

    }
}
