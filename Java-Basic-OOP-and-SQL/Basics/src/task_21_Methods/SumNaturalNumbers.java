package task_21_Methods;

import java.util.Scanner;

public class SumNaturalNumbers {

//Целите, положителни числа 1,2,3 … се казват още натурални числа.
//Нека вашата програма очаква от потребителя да въведе едно число и после използвайки рекурсивна функция,
// да изчисли сбора на всички числа от 1 до въведеното число.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num =Integer.parseInt(scanner.nextLine());
        sumNaturalNumbers(num);
    }

    private static void sumNaturalNumbers(int num) {

        int sum = 0;
        for (int i = 1; i <= num ; i++) {

            sum+=i;
        }
        System.out.println(sum);
    }
}
