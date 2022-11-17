package task_17_FinalBasicsExercise;

import java.util.Scanner;

public class SumNotMult {
//Пресметнете х*y като използвате операцията събиране в цикъл, а не умножение.
//Потребителят трябва да въведе 2 int числа, а вие да отпечатате резултата от умножението.
//Първото въведено число е x, a второто - y.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int sum=0;

        for (int i = 0; i < firstNum; i++) {

            sum+=secondNum;
        }
        System.out.println(sum);

    }
}
