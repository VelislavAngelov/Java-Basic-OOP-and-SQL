package task_14_ConditionalExpressionsAndBranches;

import java.util.Scanner;

public class BigOne {

    //Напишете програма, която прочита 2 числа със запетая от конзолата и печата кое е по-голямото.
    //
    //Отпечатаният резултат трябва да съдържа само числото без никакви допълнителни пояснения.
    //
    //Например: “резултатът е 10” e невалидно.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstNum = scanner.nextDouble();
        double secondNum = scanner.nextDouble();

        double bigOne = 0;
        if(firstNum>secondNum){
            bigOne=firstNum;
        }
        else {
            bigOne = secondNum;
        }

        System.out.println(bigOne);
    }
}