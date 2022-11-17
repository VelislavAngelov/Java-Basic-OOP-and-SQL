package task_17_FinalBasicsExercise;

import java.util.Scanner;

public class FibonacciSeries {

//Направете програма, която отпечатва първите n числа от серията на Фибоначи.
//
//Серията на Фибоначи се състои от числа, където всяко едно число е сбор от предишните 2 числа.
// А първите 2 числа са 0 и 1. Пример: 0, 1, 1, 2, 3, 5, 8, 13, 21, …
//Броят на числата n, които трябва да се отпечатат се въвеждат от конзолата.
//
//Отпечатайте числата с един интервал между всяко едно число.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int num1 = 0, num2 = 1;

        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");

            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}
