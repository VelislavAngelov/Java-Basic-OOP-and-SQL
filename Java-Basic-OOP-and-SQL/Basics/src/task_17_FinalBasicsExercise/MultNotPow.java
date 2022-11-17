package task_17_FinalBasicsExercise;

import java.util.Scanner;

public class MultNotPow {

//Сметнете x^y , като използвате умножение в цикъл, вместо съответната операция от Math класа.
//
//Потребителят трябва да въведе 2 int числа, а вие да отпечатате резултата от повдигането на степен.
//
//Първото въведено число е x, a второто - y.

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int sum=firstNum;

        for (int i = 1; i < secondNum; i++) {

            sum*=firstNum;
        }
        System.out.println(sum);
    }
}
