package task_13_DataInputAndOutput;

import java.util.Scanner;

public class OddOrEven {

    //Напишете програма, която прочита число от конзолата и отпечатва дали то е четно или нечетно.
    //
    //Ако числото е четно, трябва да се изпише “even” (без кавичките), а ако е нечетно - трябва да се изпише “odd”.

    //Подсказка: използвайте ternary оператора (?:)

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        String result = (num % 2 == 0) ? "even" : "odd";

        System.out.println(result);

    }
}