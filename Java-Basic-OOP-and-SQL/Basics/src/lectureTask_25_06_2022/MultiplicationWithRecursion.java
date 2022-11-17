package lectureTask_25_06_2022;

import java.util.Scanner;

public class MultiplicationWithRecursion {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());


        System.out.println(getMultiplication(num1, num2));

    }

    static int getMultiplication(int num1, int num2) {


        if (num1 < num2) {

            return getMultiplication(num2, num1);

        } else if (num2 != 0) {

            return (num1 + (getMultiplication(num1, num2 - 1)));

        } else {
            return 0;
        }
    }

}
