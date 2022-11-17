package task_18_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquals {

//Нека имаме следният масив:
//int[] myArray = { 1, 10, 15 };
//Напишете програма, която очаква потребителя да въведе 3 числа, които съхранявате в масив.
//Сверете дали елементите на въведения масив е същият, като myArray и ако е,
// отпечатайте “true”, в противен случай - “false”.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] myArray = {1, 10, 15};
        int[] inArray = new int[3];
        int numbers;


        for (int i = 0; i < 3; i++) {
            inArray[i] = numbers = Integer.parseInt(scanner.nextLine());
        }
        boolean equals = Arrays.equals(myArray, inArray);
        System.out.printf(String.valueOf(equals));


    }
}
