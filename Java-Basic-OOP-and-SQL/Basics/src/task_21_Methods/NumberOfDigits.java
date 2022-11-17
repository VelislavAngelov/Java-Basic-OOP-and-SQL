package task_21_Methods;

import java.util.Scanner;

public class NumberOfDigits {
//Направете метод, който отпечатва броя на цифри в дадено число.
//Направете програма, която очаква от потребителя да въведе цяло число и след това извиква горният метод,
// за да отпечата броят на цифрите във веведеното число.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num =Integer.parseInt(scanner.nextLine());
        NumberOfDigits(num);


    }
    public  static void NumberOfDigits(int num){

        int count=0;
        String str = Integer.toString(num);
        for (int i = 0; i < str.length() ; i++) {

            count++;
        }
        System.out.println(count);
    }
}
